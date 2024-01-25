import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class212 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[16384];

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[16384];

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "[Lclient!wr;")
	public Class65_Sub3[] aClass65_Sub3Array2 = null;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Lclient!fb;")
	public Class65_Sub2 aClass65_Sub2_2 = null;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!fb;")
	public Class65_Sub2 aClass65_Sub2_3 = null;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!fb;")
	public Class65_Sub2 aClass65_Sub2_1 = null;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "[Lclient!wr;")
	public Class65_Sub3[] aClass65_Sub3Array3 = null;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Z")
	public final boolean aBoolean527;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray29[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray28[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class212(@OriginalArg(0) Class26_Sub1 arg0) {
		this.aBoolean527 = arg0.aBoolean83;
		Static217.method319(arg0);
		if (this.aBoolean527) {
			@Pc(114) byte[] local114 = Static257.method3911(false, Static397.anObject9);
			this.aClass65_Sub2_3 = new Class65_Sub2(arg0, 6410, 128, 128, 16, local114, 6410);
			@Pc(131) byte[] local131 = Static257.method3911(false, Static221.anObject5);
			this.aClass65_Sub2_2 = new Class65_Sub2(arg0, 6410, 128, 128, 16, local131, 6410);
			@Pc(146) Class10 local146 = arg0.aClass10_1;
			if (local146.method217()) {
				local114 = Static257.method3911(false, Static387.anObject8);
				this.aClass65_Sub2_1 = new Class65_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(176) Class65_Sub2 local176 = new Class65_Sub2(arg0, 6409, 128, 128, 16, local114, 6409);
				if (local146.method215(2.0F, this.aClass65_Sub2_1, local176)) {
					this.aClass65_Sub2_1.method4265();
				} else {
					this.aClass65_Sub2_1.method4258();
					this.aClass65_Sub2_1 = null;
				}
				local176.method4258();
			}
		} else {
			this.aClass65_Sub3Array2 = new Class65_Sub3[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static336.method4755(2 * 128 * local34 * 128, Static397.anObject9);
				this.aClass65_Sub3Array2[local34] = new Class65_Sub3(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass65_Sub3Array3 = new Class65_Sub3[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(86) byte[] local86 = Static336.method4755(local74 * 256 * 128, Static221.anObject5);
				this.aClass65_Sub3Array3[local74] = new Class65_Sub3(arg0, 3553, 6410, 128, 128, true, local86, 6410, false);
			}
		}
	}
}
