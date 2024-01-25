import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_142 = new Class81(0, 10);

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_34 = new Class201(7, 0, 1, 1);

	@OriginalMember(owner = "client!it", name = "f", descriptor = "[Lclient!kba;")
	public static final Class20_Sub2_Sub4_Sub1_Sub1[] aClass20_Sub2_Sub4_Sub1_Sub1Array6 = new Class20_Sub2_Sub4_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
	public static void method5037() {
		@Pc(15) Class283 local15 = null;
		try {
			@Pc(21) Class23 local21 = Static246.aClass114_10.method2514("3", false);
			while (local21.anInt875 == 0) {
				Static423.method5918(1L);
			}
			if (local21.anInt875 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local15 = (Class283) local21.anObject1;
			@Pc(50) byte[] local50 = new byte[(int) local15.method6491()];
			if (local50.length == 0) {
				Static365.aString67 = "";
				Static375.aString68 = "";
			} else {
				@Pc(74) int local74;
				for (@Pc(61) int local61 = 0; local61 < local50.length; local61 += local74) {
					local74 = local15.method6490(local50.length - local61, local61, local50);
					if (local74 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(96) Class1_Sub20 local96 = new Class1_Sub20(local50);
				@Pc(100) int local100 = local96.method4393();
				if (local100 > 120) {
					throw new RuntimeException("Bad length");
				}
				local96.anInt5238 = local100 + 1;
				if (!local96.method4404()) {
					throw new RuntimeException("Invalid CRC");
				}
				local96.anInt5238 = 1;
				@Pc(129) int local129 = local96.method4393();
				if (local129 > 3) {
					throw new RuntimeException("Invalid version " + local129);
				}
				Static375.aString68 = local96.method4370();
				Static365.aString67 = local96.method4370();
				if (local129 < 1) {
					Static509.anInt8472 = Static208.anInt8805;
				} else {
					Static509.anInt8472 = local96.method4426();
				}
				if (local129 >= 2) {
					Static83.aLong88 = local96.method4416();
				} else {
					Static83.aLong88 = Static368.aLong283;
				}
				if (local129 < 3) {
					Static446.aString81 = Static292.aString59;
				} else if (local96.method4393() == 1) {
					Static446.aString81 = local96.method4370();
				} else {
					Static446.aString81 = null;
				}
			}
		} catch (@Pc(201) Exception local201) {
			Static375.aString68 = "";
			Static365.aString67 = "";
		}
		try {
			if (local15 != null) {
				local15.method6494();
			}
		} catch (@Pc(212) Exception local212) {
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V")
	public static void method5039(@OriginalArg(1) int arg0) {
		Static178.anInt3205 = arg0;
		Static172.aClass326_14.method7230();
	}
}
