import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class319 {

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "[Lclient!ea;")
	public Class20_Sub3[] aClass20_Sub3Array3 = null;

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "[Lclient!ea;")
	public Class20_Sub3[] aClass20_Sub3Array4 = null;

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "Lclient!au;")
	public Class20_Sub1 aClass20_Sub1_1 = null;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Lclient!au;")
	public Class20_Sub1 aClass20_Sub1_3 = null;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "Lclient!au;")
	public Class20_Sub1 aClass20_Sub1_2 = null;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "Z")
	public final boolean aBoolean653;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class319(@OriginalArg(0) Class9_Sub3 arg0) {
		this.aBoolean653 = arg0.aBoolean519;
		Static207.method7964(arg0);
		if (this.aBoolean653) {
			@Pc(112) byte[] local112 = Static390.method5877(Static389.anObject11, false);
			this.aClass20_Sub1_3 = new Class20_Sub1(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static390.method5877(Static489.anObject14, false);
			this.aClass20_Sub1_1 = new Class20_Sub1(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class211 local144 = arg0.aClass211_1;
			if (local144.method5457()) {
				local112 = Static390.method5877(Static546.anObject18, false);
				this.aClass20_Sub1_2 = new Class20_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(174) Class20_Sub1 local174 = new Class20_Sub1(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method5459(2.0F, local174, this.aClass20_Sub1_2)) {
					this.aClass20_Sub1_2.method6238();
				} else {
					this.aClass20_Sub1_2.method6239();
					this.aClass20_Sub1_2 = null;
				}
				local174.method6239();
			}
		} else {
			this.aClass20_Sub3Array4 = new Class20_Sub3[16];
			for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
				@Pc(45) byte[] local45 = Static14.method719(128 * 128 * local32 * 2, Static389.anObject11);
				this.aClass20_Sub3Array4[local32] = new Class20_Sub3(arg0, 3553, 6410, 128, 128, true, local45, 6410, false);
			}
			this.aClass20_Sub3Array3 = new Class20_Sub3[16];
			for (@Pc(73) int local73 = 0; local73 < 16; local73++) {
				@Pc(84) byte[] local84 = Static14.method719(local73 * 16384 * 2, Static489.anObject14);
				this.aClass20_Sub3Array3[local73] = new Class20_Sub3(arg0, 3553, 6410, 128, 128, true, local84, 6410, false);
			}
		}
	}
}
