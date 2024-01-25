import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "h", descriptor = "[I")
	public static int[] anIntArray1354;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "S")
	public static short aShort99 = 1;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "F")
	public static float aFloat80 = 1024.0F;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_63 = new Class160(8);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	public static void method5645() {
		Static166.method2932();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;Lclient!nl;IZ)Lclient!rj;")
	public static Class209 method5647(@OriginalArg(0) String arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1.method3769(arg0);
		if (local10 == -1) {
			return new Class209(0);
		}
		@Pc(25) int[] local25 = arg1.method3767(local10);
		@Pc(31) Class209 local31 = new Class209(local25.length);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		while (true) {
			while (local31.anInt5088 > local33) {
				@Pc(49) Class2_Sub16 local49 = new Class2_Sub16(arg1.method3745(local10, local25[local35++]));
				@Pc(53) int local53 = local49.method5346();
				@Pc(57) int local57 = local49.method5312();
				@Pc(61) int local61 = local49.method5350();
				if (!arg2 && local61 == 1) {
					local31.anInt5088--;
				} else {
					local31.anIntArray1006[local33] = local53;
					local31.anIntArray1007[local33] = local57;
					local33++;
				}
			}
			return local31;
		}
	}
}
