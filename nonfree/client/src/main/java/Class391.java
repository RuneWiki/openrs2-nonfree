import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class391 {

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "[Lclient!gha;")
	public Class80_Sub2[] aClass80_Sub2Array3 = null;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "[Lclient!gha;")
	public Class80_Sub2[] aClass80_Sub2Array4 = null;

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "Lclient!kq;")
	public Class80_Sub3 aClass80_Sub3_1 = null;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "Lclient!kq;")
	public Class80_Sub3 aClass80_Sub3_2 = null;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "Lclient!kq;")
	public Class80_Sub3 aClass80_Sub3_3 = null;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "Z")
	public final boolean aBoolean911;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class391(@OriginalArg(0) Class65_Sub1 arg0) {
		this.aBoolean911 = arg0.aBoolean112;
		Static668.method8899(arg0);
		if (this.aBoolean911) {
			@Pc(31) byte[] local31 = Static549.method7639(Static493.anObject17, false);
			this.aClass80_Sub3_1 = new Class80_Sub3(arg0, 6410, 128, 128, 16, local31, 6410);
			@Pc(48) byte[] local48 = Static549.method7639(Static322.anObject11, false);
			this.aClass80_Sub3_2 = new Class80_Sub3(arg0, 6410, 128, 128, 16, local48, 6410);
			@Pc(63) Class112 local63 = arg0.aClass112_1;
			if (local63.method2789()) {
				local31 = Static549.method7639(Static468.anObject16, false);
				this.aClass80_Sub3_3 = new Class80_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(93) Class80_Sub3 local93 = new Class80_Sub3(arg0, 6409, 128, 128, 16, local31, 6409);
				if (local63.method2787(this.aClass80_Sub3_3, 2.0F, local93)) {
					this.aClass80_Sub3_3.method7135();
				} else {
					this.aClass80_Sub3_3.method7136();
					this.aClass80_Sub3_3 = null;
				}
				local93.method7136();
				return;
			}
		} else {
			this.aClass80_Sub2Array3 = new Class80_Sub2[16];
			for (@Pc(124) int local124 = 0; local124 < 16; local124++) {
				@Pc(135) byte[] local135 = Static68.method933(Static493.anObject17, local124 * 2 * 16384);
				this.aClass80_Sub2Array3[local124] = new Class80_Sub2(arg0, 3553, 6410, 128, 128, true, local135, 6410, false);
			}
			this.aClass80_Sub2Array4 = new Class80_Sub2[16];
			for (@Pc(161) int local161 = 0; local161 < 16; local161++) {
				@Pc(174) byte[] local174 = Static68.method933(Static322.anObject11, local161 * 2 * 128 * 128);
				this.aClass80_Sub2Array4[local161] = new Class80_Sub2(arg0, 3553, 6410, 128, 128, true, local174, 6410, false);
			}
		}
	}
}
