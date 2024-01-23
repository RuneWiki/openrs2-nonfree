import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class8_Sub1_Sub22 extends Class8_Sub1 {

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "[Lclient!wi;")
	public Class179[] aClass179Array1;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!pk;Lclient!pk;IZ)V")
	public Class8_Sub1_Sub22(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) Class182 local7 = new Class182();
		@Pc(12) int local12 = arg0.method3189(arg2);
		this.aClass179Array1 = new Class179[local12];
		@Pc(21) int[] local21 = arg0.method3167(arg2);
		for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
			@Pc(35) byte[] local35 = arg0.method3194(arg2, local21[local23]);
			@Pc(37) Class8_Sub11 local37 = null;
			@Pc(51) int local51 = (local35[0] & 0xFF) << 8 | local35[1] & 0xFF;
			for (@Pc(56) Class8_Sub11 local56 = (Class8_Sub11) local7.method4319(); local56 != null; local56 = (Class8_Sub11) local7.method4329()) {
				if (local51 == local56.anInt1867) {
					local37 = local56;
					break;
				}
			}
			if (local37 == null) {
				@Pc(93) byte[] local93 = arg1.method3184(local51, 0);
				local37 = new Class8_Sub11(local51, local93);
				local7.method4328(local37);
			}
			this.aClass179Array1[local21[local23]] = new Class179(local35, local37);
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Z")
	public boolean method4281(@OriginalArg(1) int arg0) {
		return this.aClass179Array1[arg0].aBoolean479;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)Z")
	public boolean method4285(@OriginalArg(1) int arg0) {
		return this.aClass179Array1[arg0].aBoolean480;
	}
}
