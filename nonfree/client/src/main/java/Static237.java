import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!jba", name = "X", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_17 = new Class326(8);

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V")
	public static void method3846() {
		if (Static248.anInt4642 <= 0) {
			Static140.aString28 = "";
			return;
		}
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < Static35.aStringArray3.length; local25++) {
			if (Static35.aStringArray3[local25].indexOf("--> ") != -1) {
				@Pc(38) int local38 = ~Static248.anInt4642;
				local23++;
				if (local38 == ~local23) {
					Static140.aString28 = Static35.aStringArray3[local25].substring(Static35.aStringArray3[local25].indexOf(">") + 2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!io;Z)Lclient!nj;")
	public static Class78_Sub3 method3847(@OriginalArg(0) Class1_Sub20 arg0) {
		return new Class78_Sub3(arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4391(), arg0.method4396(), arg0.method4393());
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)Z")
	public static boolean method3849() {
		@Pc(10) Class1_Sub36 local10 = (Class1_Sub36) Static258.aClass361_52.method7854();
		if (local10 == null) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < local10.anInt6251; local24++) {
			if (local10.aClass23Array1[local24] != null && local10.aClass23Array1[local24].anInt875 == 0) {
				return false;
			}
			if (local10.aClass23Array2[local24] != null && local10.aClass23Array2[local24].anInt875 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(II)[B")
	public static byte[] method3851(@OriginalArg(0) int arg0) {
		@Pc(19) Class1_Sub3_Sub10 local19 = (Class1_Sub3_Sub10) Static71.aClass157_1.method3684((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(47) int local47 = 0; local47 < 255; local47++) {
				@Pc(53) int local53 = 255 - local47;
				@Pc(58) int local58 = Static521.method7113(local53, local30);
				@Pc(62) byte local62 = local24[local58];
				local24[local58] = local24[local53];
				local24[local53] = local24[511 - local47] = local62;
			}
			local19 = new Class1_Sub3_Sub10(local24);
			Static71.aClass157_1.method3687((long) arg0, local19);
		}
		return local19.aByteArray50;
	}
}
