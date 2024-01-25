import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gn", name = "Q", descriptor = "I")
	public static int anInt3895;

	@OriginalMember(owner = "client!gn", name = "M", descriptor = "[[F")
	public static final float[][] aFloatArrayArray2 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!gn", name = "N", descriptor = "Lclient!jo;")
	public static final Class161 aClass161_3 = new Class161("", 12);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3156(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + Static411.method5771(arg0.charAt(local12)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)V")
	public static void method3157() {
		@Pc(7) Class272 local7 = null;
		try {
			local7 = Static268.method4092("2");
			@Pc(21) Class3_Sub26 local21 = new Class3_Sub26(Static64.anInt1789 * 6 + 3);
			local21.method6809(1);
			local21.method6769(Static64.anInt1789);
			for (@Pc(31) int local31 = 0; local31 < Static161.anIntArray147.length; local31++) {
				if (Static592.aBooleanArray21[local31]) {
					local21.method6769(local31);
					local21.method6826(Static161.anIntArray147[local31]);
				}
			}
			local7.method6170(local21.aByteArray213, 0, local21.anInt8703);
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (local7 != null) {
				local7.method6172();
			}
		} catch (@Pc(73) Exception local73) {
		}
		Static141.aLong67 = Static96.method2000();
		Static50.aBoolean109 = false;
	}
}
