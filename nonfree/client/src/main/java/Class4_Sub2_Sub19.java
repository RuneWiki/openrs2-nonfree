import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class4_Sub2_Sub19 extends Class4_Sub2 {

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "[Lclient!kd;")
	public Class88[] aClass88Array1;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!lc;Lclient!lc;IZ)V")
	public Class4_Sub2_Sub19(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class10 local7 = new Class10();
		@Pc(12) int local12 = arg0.method2394(arg2);
		this.aClass88Array1 = new Class88[local12];
		@Pc(21) int[] local21 = arg0.method2384(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(35) byte[] local35 = arg0.method2396(local21[local23], arg2);
			@Pc(37) Class4_Sub3 local37 = null;
			@Pc(51) int local51 = local35[1] & 0xFF | (local35[0] & 0xFF) << 8;
			for (@Pc(56) Class4_Sub3 local56 = (Class4_Sub3) local7.method190(); local56 != null; local56 = (Class4_Sub3) local7.method191()) {
				if (local56.anInt157 == local51) {
					local37 = local56;
					break;
				}
			}
			if (local37 == null) {
				@Pc(90) byte[] local90 = arg1.method2397(local51, 0);
				local37 = new Class4_Sub3(local51, local90);
				local7.method184(local37);
			}
			this.aClass88Array1[local21[local23]] = new Class88(local35, local37);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Z")
	public boolean method3714(@OriginalArg(1) int arg0) {
		return this.aClass88Array1[arg0].aBoolean186;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)Z")
	public boolean method3716(@OriginalArg(0) int arg0) {
		return this.aClass88Array1[arg0].aBoolean185;
	}
}
