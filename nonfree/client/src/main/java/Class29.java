import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class29 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "[Lclient!jo;")
	public Class70_Sub4[] aClass70_Sub4Array2 = null;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "Lclient!gg;")
	public Class70_Sub3 aClass70_Sub3_1 = null;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "[Lclient!jo;")
	public Class70_Sub4[] aClass70_Sub4Array3 = null;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Lclient!gg;")
	public Class70_Sub3 aClass70_Sub3_2 = null;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "Z")
	public final boolean aBoolean28;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class29(@OriginalArg(0) Class92_Sub2 arg0) {
		this.aBoolean28 = arg0.aBoolean456;
		Static31.method503();
		@Pc(24) byte[] local24;
		if (this.aBoolean28) {
			local24 = new byte[524288];
			Static31.aByteBuffer2.get(local24);
			Static31.aByteBuffer2.position(0);
			this.aClass70_Sub3_1 = new Class70_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
			Static31.aByteBuffer1.get(local24);
			Static31.aByteBuffer1.position(0);
			this.aClass70_Sub3_2 = new Class70_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass70_Sub4Array2 = new Class70_Sub4[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static31.aByteBuffer2.get(local24, 0, 32768);
				this.aClass70_Sub4Array2[local30] = new Class70_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static31.aByteBuffer2.position(0);
			this.aClass70_Sub4Array3 = new Class70_Sub4[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static31.aByteBuffer1.get(local24, 0, 32768);
				this.aClass70_Sub4Array3[local30] = new Class70_Sub4(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static31.aByteBuffer1.position(0);
		}
	}
}
