import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class12 {

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "[Lclient!wo;")
	public Class167_Sub3[] aClass167_Sub3Array1 = null;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "Lclient!tq;")
	public Class167_Sub4 aClass167_Sub4_2 = null;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "Lclient!tq;")
	public Class167_Sub4 aClass167_Sub4_1 = null;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!tq;")
	public Class167_Sub4 aClass167_Sub4_3 = null;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "[Lclient!wo;")
	public Class167_Sub3[] aClass167_Sub3Array2 = null;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Z")
	public final boolean aBoolean10;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class12(@OriginalArg(0) Class133_Sub3 arg0) {
		this.aBoolean10 = arg0.aBoolean613;
		Static504.method7543(arg0);
		if (this.aBoolean10) {
			@Pc(112) byte[] local112 = Static549.method8014(Static406.anObject18, false);
			this.aClass167_Sub4_1 = new Class167_Sub4(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static549.method8014(Static376.anObject14, false);
			this.aClass167_Sub4_3 = new Class167_Sub4(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class313 local144 = arg0.aClass313_1;
			if (local144.method7541()) {
				local112 = Static549.method8014(Static273.anObject12, false);
				this.aClass167_Sub4_2 = new Class167_Sub4(arg0, 6408, 128, 128, 16);
				@Pc(174) Class167_Sub4 local174 = new Class167_Sub4(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method7539(2.0F, this.aClass167_Sub4_2, local174)) {
					this.aClass167_Sub4_2.method8003();
				} else {
					this.aClass167_Sub4_2.method8011();
					this.aClass167_Sub4_2 = null;
				}
				local174.method8011();
			}
		} else {
			this.aClass167_Sub3Array2 = new Class167_Sub3[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(46) byte[] local46 = Static514.method7639(local34 * 2 * 16384, Static406.anObject18);
				this.aClass167_Sub3Array2[local34] = new Class167_Sub3(arg0, 3553, 6410, 128, 128, true, local46, 6410, false);
			}
			this.aClass167_Sub3Array1 = new Class167_Sub3[16];
			for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
				@Pc(86) byte[] local86 = Static514.method7639(local74 * 256 * 128, Static376.anObject14);
				this.aClass167_Sub3Array1[local74] = new Class167_Sub3(arg0, 3553, 6410, 128, 128, true, local86, 6410, false);
			}
		}
	}
}
