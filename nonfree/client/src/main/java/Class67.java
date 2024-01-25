import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class67 {

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!mj;")
	public Class79_Sub3 aClass79_Sub3_1 = null;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!mj;")
	public Class79_Sub3 aClass79_Sub3_2 = null;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!mj;")
	public Class79_Sub3 aClass79_Sub3_3 = null;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "[Lclient!ob;")
	public Class79_Sub2[] aClass79_Sub2Array3 = null;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "[Lclient!ob;")
	public Class79_Sub2[] aClass79_Sub2Array2 = null;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Z")
	public final boolean aBoolean145;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class67(@OriginalArg(0) Class42_Sub3 arg0) {
		this.aBoolean145 = arg0.aBoolean282;
		Static358.method5603(arg0);
		if (this.aBoolean145) {
			@Pc(33) byte[] local33 = Static202.method3816(Static152.anObject8, false);
			this.aClass79_Sub3_2 = new Class79_Sub3(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static202.method3816(Static459.anObject16, false);
			this.aClass79_Sub3_3 = new Class79_Sub3(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class237 local65 = arg0.aClass237_1;
			if (local65.method5726()) {
				local33 = Static202.method3816(Static173.anObject9, false);
				this.aClass79_Sub3_1 = new Class79_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(95) Class79_Sub3 local95 = new Class79_Sub3(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method5727(2.0F, this.aClass79_Sub3_1, local95)) {
					this.aClass79_Sub3_1.method5275();
				} else {
					this.aClass79_Sub3_1.method5271();
					this.aClass79_Sub3_1 = null;
				}
				local95.method5271();
				return;
			}
		} else {
			this.aClass79_Sub2Array3 = new Class79_Sub2[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static380.method6370(local127 * 256 * 128, Static152.anObject8);
				this.aClass79_Sub2Array3[local127] = new Class79_Sub2(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass79_Sub2Array2 = new Class79_Sub2[16];
			for (@Pc(167) int local167 = 0; local167 < 16; local167++) {
				@Pc(181) byte[] local181 = Static380.method6370(local167 * 2 * 128 * 128, Static459.anObject16);
				this.aClass79_Sub2Array2[local167] = new Class79_Sub2(arg0, 3553, 6410, 128, 128, true, local181, 6410, false);
			}
		}
	}
}
