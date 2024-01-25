import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class171 {

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "[Lclient!sg;")
	public Class40_Sub3[] aClass40_Sub3Array3 = null;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "Lclient!ga;")
	public Class40_Sub2 aClass40_Sub2_1 = null;

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "[Lclient!sg;")
	public Class40_Sub3[] aClass40_Sub3Array2 = null;

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "Lclient!ga;")
	public Class40_Sub2 aClass40_Sub2_2 = null;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "Lclient!ga;")
	public Class40_Sub2 aClass40_Sub2_3 = null;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "Z")
	public final boolean aBoolean281;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class171(@OriginalArg(0) Class28_Sub1 arg0) {
		this.aBoolean281 = arg0.aBoolean63;
		Static352.method4975(arg0);
		if (this.aBoolean281) {
			@Pc(116) byte[] local116 = Static270.method4108(false, Static256.anObject7);
			this.aClass40_Sub2_3 = new Class40_Sub2(arg0, 6410, 128, 128, 16, local116, 6410);
			@Pc(133) byte[] local133 = Static270.method4108(false, Static217.anObject5);
			this.aClass40_Sub2_1 = new Class40_Sub2(arg0, 6410, 128, 128, 16, local133, 6410);
			@Pc(148) Class27 local148 = arg0.aClass27_1;
			if (local148.method410()) {
				local116 = Static270.method4108(false, Static307.anObject4);
				this.aClass40_Sub2_2 = new Class40_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(178) Class40_Sub2 local178 = new Class40_Sub2(arg0, 6409, 128, 128, 16, local116, 6409);
				if (local148.method407(this.aClass40_Sub2_2, local178, 2.0F)) {
					this.aClass40_Sub2_2.method5145();
				} else {
					this.aClass40_Sub2_2.method5154();
					this.aClass40_Sub2_2 = null;
				}
				local178.method5154();
			}
		} else {
			this.aClass40_Sub3Array2 = new Class40_Sub3[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static247.method3805(local34 * 2 * 128 * 128, Static256.anObject7);
				this.aClass40_Sub3Array2[local34] = new Class40_Sub3(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass40_Sub3Array3 = new Class40_Sub3[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(88) byte[] local88 = Static247.method3805(local74 * 128 * 128 * 2, Static217.anObject5);
				this.aClass40_Sub3Array3[local74] = new Class40_Sub3(arg0, 3553, 6410, 128, 128, true, local88, 6410, false);
			}
		}
	}
}
