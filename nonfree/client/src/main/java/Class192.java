import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class192 {

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "Lclient!nc;")
	public Class66_Sub3 aClass66_Sub3_3 = null;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "[Lclient!oa;")
	public Class66_Sub1[] aClass66_Sub1Array4 = null;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "[Lclient!oa;")
	public Class66_Sub1[] aClass66_Sub1Array3 = null;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "Lclient!nc;")
	public Class66_Sub3 aClass66_Sub3_2 = null;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Z")
	public final boolean aBoolean411;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class192(@OriginalArg(0) Class122_Sub2 arg0) {
		this.aBoolean411 = arg0.aBoolean364;
		Static304.method5092();
		@Pc(24) byte[] local24;
		if (this.aBoolean411) {
			local24 = new byte[524288];
			Static304.aByteBuffer7.get(local24);
			Static304.aByteBuffer7.position(0);
			this.aClass66_Sub3_2 = new Class66_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
			Static304.aByteBuffer6.get(local24);
			Static304.aByteBuffer6.position(0);
			this.aClass66_Sub3_3 = new Class66_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass66_Sub1Array3 = new Class66_Sub1[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static304.aByteBuffer7.get(local24, 0, 32768);
				this.aClass66_Sub1Array3[local30] = new Class66_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static304.aByteBuffer7.position(0);
			this.aClass66_Sub1Array4 = new Class66_Sub1[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static304.aByteBuffer6.get(local24, 0, 32768);
				this.aClass66_Sub1Array4[local30] = new Class66_Sub1(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static304.aByteBuffer6.position(0);
		}
	}
}
