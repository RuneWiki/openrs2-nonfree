import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class336 {

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[16384];

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[16384];

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!ah;")
	public Class10_Sub1 aClass10_Sub1_1 = null;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "[Lclient!rba;")
	public Class10_Sub2[] aClass10_Sub2Array4 = null;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "[Lclient!rba;")
	public Class10_Sub2[] aClass10_Sub2Array3 = null;

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "Lclient!ah;")
	public Class10_Sub1 aClass10_Sub1_3 = null;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!ah;")
	public Class10_Sub1 aClass10_Sub1_2 = null;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Z")
	public final boolean aBoolean645;

	static {
		@Pc(17) double local17 = 3.834951969714103E-4D;
		for (@Pc(19) int local19 = 0; local19 < 16384; local19++) {
			aFloatArray57[local19] = (float) Math.sin((double) local19 * local17);
			aFloatArray56[local19] = (float) Math.cos(local17 * (double) local19);
		}
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class336(@OriginalArg(0) Class95_Sub3 arg0) {
		this.aBoolean645 = arg0.aBoolean376;
		Static399.method5515(arg0);
		if (this.aBoolean645) {
			@Pc(118) byte[] local118 = Static553.method7314(Static488.anObject14, false);
			this.aClass10_Sub1_3 = new Class10_Sub1(arg0, 6410, 128, 128, 16, local118, 6410);
			@Pc(135) byte[] local135 = Static553.method7314(Static117.anObject2, false);
			this.aClass10_Sub1_1 = new Class10_Sub1(arg0, 6410, 128, 128, 16, local135, 6410);
			@Pc(150) Class204 local150 = arg0.aClass204_1;
			if (local150.method4645()) {
				local118 = Static553.method7314(Static120.anObject3, false);
				this.aClass10_Sub1_2 = new Class10_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(180) Class10_Sub1 local180 = new Class10_Sub1(arg0, 6409, 128, 128, 16, local118, 6409);
				if (local150.method4647(2.0F, this.aClass10_Sub1_2, local180)) {
					this.aClass10_Sub1_2.method6096();
				} else {
					this.aClass10_Sub1_2.method6094();
					this.aClass10_Sub1_2 = null;
				}
				local180.method6094();
			}
		} else {
			this.aClass10_Sub2Array3 = new Class10_Sub2[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static98.method397(local34 * 2 * 128 * 128, Static488.anObject14);
				this.aClass10_Sub2Array3[local34] = new Class10_Sub2(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass10_Sub2Array4 = new Class10_Sub2[16];
			for (@Pc(76) int local76 = 0; local76 < 16; local76++) {
				@Pc(90) byte[] local90 = Static98.method397(local76 * 2 * 128 * 128, Static117.anObject2);
				this.aClass10_Sub2Array4[local76] = new Class10_Sub2(arg0, 3553, 6410, 128, 128, true, local90, 6410, false);
			}
		}
	}
}
