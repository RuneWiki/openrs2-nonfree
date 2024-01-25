import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class239 {

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "[Lclient!hi;")
	public Class15_Sub2[] aClass15_Sub2Array4 = null;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Lclient!qc;")
	public Class15_Sub3 aClass15_Sub3_1 = null;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "[Lclient!hi;")
	public Class15_Sub2[] aClass15_Sub2Array3 = null;

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "Lclient!qc;")
	public Class15_Sub3 aClass15_Sub3_2 = null;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "Z")
	public final boolean aBoolean563;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!nm;)V")
	public Class239(@OriginalArg(0) Class164_Sub1 arg0) {
		this.aBoolean563 = arg0.aBoolean399;
		Static376.method5281();
		@Pc(24) byte[] local24;
		if (this.aBoolean563) {
			local24 = new byte[524288];
			Static376.aByteBuffer7.get(local24);
			Static376.aByteBuffer7.position(0);
			this.aClass15_Sub3_2 = new Class15_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
			Static376.aByteBuffer6.get(local24);
			Static376.aByteBuffer6.position(0);
			this.aClass15_Sub3_1 = new Class15_Sub3(arg0, 6410, 128, 128, 16, local24, 6410);
		} else {
			local24 = new byte[32768];
			this.aClass15_Sub2Array4 = new Class15_Sub2[16];
			@Pc(30) int local30;
			for (local30 = 0; local30 < 16; local30++) {
				Static376.aByteBuffer7.get(local24, 0, 32768);
				this.aClass15_Sub2Array4[local30] = new Class15_Sub2(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static376.aByteBuffer7.position(0);
			this.aClass15_Sub2Array3 = new Class15_Sub2[16];
			for (local30 = 0; local30 < 16; local30++) {
				Static376.aByteBuffer6.get(local24, 0, 32768);
				this.aClass15_Sub2Array3[local30] = new Class15_Sub2(arg0, 3553, 6410, 128, 128, true, local24, 6410, false);
			}
			Static376.aByteBuffer6.position(0);
		}
	}
}
