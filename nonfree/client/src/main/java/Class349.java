import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class349 {

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "Lclient!oka;")
	public Class245_Sub3 aClass245_Sub3_3 = null;

	@OriginalMember(owner = "client!taa", name = "h", descriptor = "Lclient!oka;")
	public Class245_Sub3 aClass245_Sub3_1 = null;

	@OriginalMember(owner = "client!taa", name = "g", descriptor = "Lclient!oka;")
	public Class245_Sub3 aClass245_Sub3_2 = null;

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "[Lclient!nw;")
	public Class245_Sub2[] aClass245_Sub2Array3 = null;

	@OriginalMember(owner = "client!taa", name = "j", descriptor = "[Lclient!nw;")
	public Class245_Sub2[] aClass245_Sub2Array4 = null;

	@OriginalMember(owner = "client!taa", name = "f", descriptor = "Z")
	public final boolean aBoolean709;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class349(@OriginalArg(0) Class67_Sub2 arg0) {
		this.aBoolean709 = arg0.aBoolean320;
		Static379.method5702(arg0);
		if (this.aBoolean709) {
			@Pc(33) byte[] local33 = Static543.method7616(Static670.anObject23, false);
			this.aClass245_Sub3_2 = new Class245_Sub3(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static543.method7616(Static347.anObject13, false);
			this.aClass245_Sub3_3 = new Class245_Sub3(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class350 local65 = arg0.aClass350_1;
			if (local65.method8300()) {
				local33 = Static543.method7616(Static563.anObject21, false);
				this.aClass245_Sub3_1 = new Class245_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(95) Class245_Sub3 local95 = new Class245_Sub3(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method8301(this.aClass245_Sub3_1, local95, 2.0F)) {
					this.aClass245_Sub3_1.method8673();
				} else {
					this.aClass245_Sub3_1.method8676();
					this.aClass245_Sub3_1 = null;
				}
				local95.method8676();
				return;
			}
		} else {
			this.aClass245_Sub2Array3 = new Class245_Sub2[16];
			for (@Pc(131) int local131 = 0; local131 < 16; local131++) {
				@Pc(145) byte[] local145 = Static68.method841(Static670.anObject23, 31054, local131 * 2 * 16384, 32768);
				this.aClass245_Sub2Array3[local131] = new Class245_Sub2(arg0, 3553, 6410, 128, 128, true, local145, 6410, false);
			}
			this.aClass245_Sub2Array4 = new Class245_Sub2[16];
			for (@Pc(175) int local175 = 0; local175 < 16; local175++) {
				@Pc(187) byte[] local187 = Static68.method841(Static347.anObject13, 31054, local175 * 256 * 128, 32768);
				this.aClass245_Sub2Array4[local175] = new Class245_Sub2(arg0, 3553, 6410, 128, 128, true, local187, 6410, false);
			}
		}
	}
}
