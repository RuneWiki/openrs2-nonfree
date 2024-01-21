import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "[I")
	public static final int[] anIntArray107 = new int[32];

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "[Lclient!ti;")
	public final Class97[] aClass97Array1;

	static {
		@Pc(14) int local14 = 2;
		for (@Pc(16) int local16 = 0; local16 < 32; local16++) {
			anIntArray107[local16] = local14 - 1;
			local14 += local14;
		}
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!eh;Lclient!eh;IZ)V")
	public Class2_Sub2_Sub10(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class19 local7 = new Class19();
		@Pc(12) int local12 = arg0.method846(arg2);
		this.aClass97Array1 = new Class97[local12];
		@Pc(21) int[] local21 = arg0.method876(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(33) byte[] local33 = arg0.method852(local21[local23], arg2);
			@Pc(35) Class2_Sub8 local35 = null;
			@Pc(49) int local49 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
			for (@Pc(54) Class2_Sub8 local54 = (Class2_Sub8) local7.method691(); local54 != null; local54 = (Class2_Sub8) local7.method686()) {
				if (local54.anInt724 == local49) {
					local35 = local54;
					break;
				}
			}
			if (local35 == null) {
				@Pc(88) byte[] local88 = arg1.method851(0, local49);
				local35 = new Class2_Sub8(local49, local88);
				local7.method684(local35);
			}
			this.aClass97Array1[local21[local23]] = new Class97(local33, local35);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z")
	public boolean method1041(@OriginalArg(1) int arg0) {
		return this.aClass97Array1[arg0].aBoolean174;
	}
}
