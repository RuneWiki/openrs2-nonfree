import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class343 {

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[Lclient!db;")
	public Class34_Sub2[] aClass34_Sub2Array3 = null;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!jba;")
	public Class34_Sub3 aClass34_Sub3_3 = null;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!jba;")
	public Class34_Sub3 aClass34_Sub3_1 = null;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "Lclient!jba;")
	public Class34_Sub3 aClass34_Sub3_2 = null;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[Lclient!db;")
	public Class34_Sub2[] aClass34_Sub2Array4 = null;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
	public final boolean aBoolean698;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class343(@OriginalArg(0) Class43_Sub3 arg0) {
		this.aBoolean698 = arg0.aBoolean687;
		Static358.method7744(arg0);
		if (this.aBoolean698) {
			@Pc(116) byte[] local116 = Static403.method5862(false, Static119.anObject13);
			this.aClass34_Sub3_2 = new Class34_Sub3(arg0, 6410, 128, 128, 16, local116, 6410);
			@Pc(133) byte[] local133 = Static403.method5862(false, Static534.anObject56);
			this.aClass34_Sub3_1 = new Class34_Sub3(arg0, 6410, 128, 128, 16, local133, 6410);
			@Pc(148) Class367 local148 = arg0.aClass367_1;
			if (local148.method7808()) {
				local116 = Static403.method5862(false, Static552.anObject57);
				this.aClass34_Sub3_3 = new Class34_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(178) Class34_Sub3 local178 = new Class34_Sub3(arg0, 6409, 128, 128, 16, local116, 6409);
				if (local148.method7807(this.aClass34_Sub3_3, local178, 2.0F)) {
					this.aClass34_Sub3_3.method4975();
				} else {
					this.aClass34_Sub3_3.method4973();
					this.aClass34_Sub3_3 = null;
				}
				local178.method4973();
			}
		} else {
			this.aClass34_Sub2Array3 = new Class34_Sub2[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static1.method5(local34 * 128 * 128 * 2, Static119.anObject13);
				this.aClass34_Sub2Array3[local34] = new Class34_Sub2(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass34_Sub2Array4 = new Class34_Sub2[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(88) byte[] local88 = Static1.method5(local74 * 128 * 128 * 2, Static534.anObject56);
				this.aClass34_Sub2Array4[local74] = new Class34_Sub2(arg0, 3553, 6410, 128, 128, true, local88, 6410, false);
			}
		}
	}
}
