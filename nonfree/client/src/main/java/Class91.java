import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class91 {

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "Lclient!saa;")
	public Class121_Sub4 aClass121_Sub4_1 = null;

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "[Lclient!hga;")
	public Class121_Sub2[] aClass121_Sub2Array1 = null;

	@OriginalMember(owner = "client!faa", name = "j", descriptor = "[Lclient!hga;")
	public Class121_Sub2[] aClass121_Sub2Array2 = null;

	@OriginalMember(owner = "client!faa", name = "k", descriptor = "Lclient!saa;")
	public Class121_Sub4 aClass121_Sub4_3 = null;

	@OriginalMember(owner = "client!faa", name = "i", descriptor = "Lclient!saa;")
	public Class121_Sub4 aClass121_Sub4_2 = null;

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "Z")
	public final boolean aBoolean294;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class91(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aBoolean294 = arg0.aBoolean278;
		Static70.method1784(arg0);
		if (this.aBoolean294) {
			@Pc(33) byte[] local33 = Static530.method7538(Static514.anObject17, false);
			this.aClass121_Sub4_3 = new Class121_Sub4(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static530.method7538(Static153.anObject8, false);
			this.aClass121_Sub4_1 = new Class121_Sub4(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class365 local65 = arg0.aClass365_1;
			if (local65.method8392()) {
				local33 = Static530.method7538(Static192.anObject9, false);
				this.aClass121_Sub4_2 = new Class121_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(95) Class121_Sub4 local95 = new Class121_Sub4(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method8391(local95, this.aClass121_Sub4_2, 2.0F)) {
					this.aClass121_Sub4_2.method7330();
				} else {
					this.aClass121_Sub4_2.method7322();
					this.aClass121_Sub4_2 = null;
				}
				local95.method7322();
				return;
			}
		} else {
			this.aClass121_Sub2Array1 = new Class121_Sub2[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static106.method2588(local127 * 128 * 256, Static514.anObject17);
				this.aClass121_Sub2Array1[local127] = new Class121_Sub2(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass121_Sub2Array2 = new Class121_Sub2[16];
			for (@Pc(167) int local167 = 0; local167 < 16; local167++) {
				@Pc(181) byte[] local181 = Static106.method2588(128 * 128 * local167 * 2, Static153.anObject8);
				this.aClass121_Sub2Array2[local167] = new Class121_Sub2(arg0, 3553, 6410, 128, 128, true, local181, 6410, false);
			}
		}
	}
}
