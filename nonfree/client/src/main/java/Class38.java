import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class38 {

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!hj;")
	public Class92_Sub1 aClass92_Sub1_1 = null;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lclient!oe;")
	public Class92_Sub4[] aClass92_Sub4Array1 = null;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "[Lclient!oe;")
	public Class92_Sub4[] aClass92_Sub4Array2 = null;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!hj;")
	public Class92_Sub1 aClass92_Sub1_2 = null;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Z")
	public final boolean aBoolean80;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class38(@OriginalArg(0) Class89_Sub1 arg0) {
		this.aBoolean80 = arg0.aBoolean191;
		Static38.method837();
		@Pc(24) byte[] local24;
		if (this.aBoolean80) {
			local24 = new byte[524288];
			Static38.aByteBuffer4.get(local24);
			Static38.aByteBuffer4.position(0);
			this.aClass92_Sub1_1 = new Class92_Sub1(arg0, 6410, 128, 128, 16, local24, 6410);
			Static38.aByteBuffer3.get(local24);
			Static38.aByteBuffer3.position(0);
			this.aClass92_Sub1_2 = new Class92_Sub1(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass92_Sub4Array2 = new Class92_Sub4[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static38.aByteBuffer4.get(local24, 0, 32768);
				this.aClass92_Sub4Array2[local30] = new Class92_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static38.aByteBuffer4.position(0);
			this.aClass92_Sub4Array1 = new Class92_Sub4[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static38.aByteBuffer3.get(local24, 0, 32768);
				this.aClass92_Sub4Array1[local30] = new Class92_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static38.aByteBuffer3.position(0);
		}
	}
}
