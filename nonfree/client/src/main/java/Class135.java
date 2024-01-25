import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class135 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "[Lclient!lb;")
	public Class28_Sub3[] aClass28_Sub3Array3 = null;

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "Lclient!or;")
	public Class28_Sub4 aClass28_Sub4_1 = null;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Lclient!or;")
	public Class28_Sub4 aClass28_Sub4_2 = null;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "[Lclient!lb;")
	public Class28_Sub3[] aClass28_Sub3Array4 = null;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Z")
	public final boolean aBoolean278;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class135(@OriginalArg(0) Class81_Sub1 arg0) {
		this.aBoolean278 = arg0.aBoolean150;
		Static195.method3615();
		@Pc(24) byte[] local24;
		if (this.aBoolean278) {
			local24 = new byte[524288];
			Static195.aByteBuffer4.get(local24);
			Static195.aByteBuffer4.position(0);
			this.aClass28_Sub4_2 = new Class28_Sub4(arg0, 6410, 128, 128, 16, local24, 6410);
			Static195.aByteBuffer3.get(local24);
			Static195.aByteBuffer3.position(0);
			this.aClass28_Sub4_1 = new Class28_Sub4(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass28_Sub3Array3 = new Class28_Sub3[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static195.aByteBuffer4.get(local24, 0, 32768);
				this.aClass28_Sub3Array3[local30] = new Class28_Sub3(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static195.aByteBuffer4.position(0);
			this.aClass28_Sub3Array4 = new Class28_Sub3[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static195.aByteBuffer3.get(local24, 0, 32768);
				this.aClass28_Sub3Array4[local30] = new Class28_Sub3(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static195.aByteBuffer3.position(0);
		}
	}
}
