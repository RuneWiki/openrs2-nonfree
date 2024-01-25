import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class215 {

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "Lclient!cl;")
	public Class20_Sub2 aClass20_Sub2_1 = null;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "Lclient!cl;")
	public Class20_Sub2 aClass20_Sub2_2 = null;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "Lclient!cl;")
	public Class20_Sub2 aClass20_Sub2_3 = null;

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "[Lclient!bd;")
	public Class20_Sub1[] aClass20_Sub1Array3 = null;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "[Lclient!bd;")
	public Class20_Sub1[] aClass20_Sub1Array4 = null;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "Z")
	public final boolean aBoolean431;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class215(@OriginalArg(0) Class163_Sub2 arg0) {
		this.aBoolean431 = arg0.aBoolean376;
		Static247.method3148(arg0);
		if (this.aBoolean431) {
			@Pc(112) byte[] local112 = Static34.method520(Static237.anObject8, false);
			this.aClass20_Sub2_3 = new Class20_Sub2(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static34.method520(Static192.anObject5, false);
			this.aClass20_Sub2_1 = new Class20_Sub2(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class264 local144 = arg0.aClass264_1;
			if (local144.method5602()) {
				local112 = Static34.method520(Static372.anObject9, false);
				this.aClass20_Sub2_2 = new Class20_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(174) Class20_Sub2 local174 = new Class20_Sub2(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method5604(local174, 2.0F, this.aClass20_Sub2_2)) {
					this.aClass20_Sub2_2.method3110();
				} else {
					this.aClass20_Sub2_2.method3108();
					this.aClass20_Sub2_2 = null;
				}
				local174.method3108();
			}
		} else {
			this.aClass20_Sub1Array4 = new Class20_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static235.method3045(Static237.anObject8, 2 * 128 * local34 * 128);
				this.aClass20_Sub1Array4[local34] = new Class20_Sub1(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass20_Sub1Array3 = new Class20_Sub1[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(86) byte[] local86 = Static235.method3045(Static192.anObject5, local74 * 2 * 16384);
				this.aClass20_Sub1Array3[local74] = new Class20_Sub1(arg0, 3553, 6410, 128, 128, true, local86, 6410, false);
			}
		}
	}
}
