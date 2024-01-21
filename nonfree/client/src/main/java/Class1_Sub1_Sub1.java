import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "fb", descriptor = "[I")
	public static int[] anIntArray8 = new int[99];

	@OriginalMember(owner = "client!a", name = "ab", descriptor = "[Lclient!fe;")
	public final Class26[] aClass26Array1;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray8[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!pb;Lclient!pb;IZ)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class50 local7 = new Class50();
		@Pc(12) int local12 = arg0.method1068(arg2);
		this.aClass26Array1 = new Class26[local12];
		@Pc(21) int[] local21 = arg0.method1049(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method1062(arg2, local21[local23]);
			@Pc(35) Class1_Sub5 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class1_Sub5 local54 = (Class1_Sub5) local7.method1151(); local54 != null; local54 = (Class1_Sub5) local7.method1141()) {
				if (local49 == local54.anInt1070) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(92) byte[] local92 = arg1.method1074(local49, 0);
				local35 = new Class1_Sub5(local49, local92);
				local7.method1142(local35);
			}
			this.aClass26Array1[local21[local23]] = new Class26(local33, local35);
		}
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(II)Z")
	public boolean method37(@OriginalArg(0) int arg0) {
		return this.aClass26Array1[arg0].aBoolean51;
	}
}
