import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class178 {

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "[Lclient!im;")
	public Class56_Sub4[] aClass56_Sub4Array3 = null;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!he;")
	public Class56_Sub3 aClass56_Sub3_1 = null;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!he;")
	public Class56_Sub3 aClass56_Sub3_2 = null;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "[Lclient!im;")
	public Class56_Sub4[] aClass56_Sub4Array4 = null;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "Z")
	public final boolean aBoolean357;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class178(@OriginalArg(0) Class129_Sub2 arg0) {
		this.aBoolean357 = arg0.aBoolean382;
		Static273.method4634();
		@Pc(24) byte[] local24;
		if (this.aBoolean357) {
			local24 = new byte[524288];
			Static273.aByteBuffer5.get(local24);
			Static273.aByteBuffer5.position(0);
			this.aClass56_Sub3_1 = new Class56_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
			Static273.aByteBuffer6.get(local24);
			Static273.aByteBuffer6.position(0);
			this.aClass56_Sub3_2 = new Class56_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass56_Sub4Array3 = new Class56_Sub4[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static273.aByteBuffer5.get(local24, 0, 32768);
				this.aClass56_Sub4Array3[local30] = new Class56_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static273.aByteBuffer5.position(0);
			this.aClass56_Sub4Array4 = new Class56_Sub4[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static273.aByteBuffer6.get(local24, 0, 32768);
				this.aClass56_Sub4Array4[local30] = new Class56_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static273.aByteBuffer6.position(0);
		}
	}
}
