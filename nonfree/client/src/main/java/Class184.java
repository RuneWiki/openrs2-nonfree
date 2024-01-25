import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class184 {

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "Lclient!mm;")
	public Class73_Sub3 aClass73_Sub3_3 = null;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "Lclient!mm;")
	public Class73_Sub3 aClass73_Sub3_2 = null;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "Lclient!mm;")
	public Class73_Sub3 aClass73_Sub3_1 = null;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "[Lclient!ku;")
	public Class73_Sub1[] aClass73_Sub1Array2 = null;

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "[Lclient!ku;")
	public Class73_Sub1[] aClass73_Sub1Array3 = null;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
	public final boolean aBoolean371;

	static {
		new Class306("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class184(@OriginalArg(0) Class122_Sub3 arg0) {
		this.aBoolean371 = arg0.aBoolean577;
		Static109.method3483(arg0);
		if (this.aBoolean371) {
			@Pc(114) byte[] local114 = Static236.method4130(Static158.anObject7, false);
			this.aClass73_Sub3_3 = new Class73_Sub3(arg0, 6410, 128, 128, 16, local114, 6410);
			@Pc(131) byte[] local131 = Static236.method4130(Static529.anObject18, false);
			this.aClass73_Sub3_2 = new Class73_Sub3(arg0, 6410, 128, 128, 16, local131, 6410);
			@Pc(146) Class315 local146 = arg0.aClass315_1;
			if (local146.method7499()) {
				local114 = Static236.method4130(Static468.anObject16, false);
				this.aClass73_Sub3_1 = new Class73_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(176) Class73_Sub3 local176 = new Class73_Sub3(arg0, 6409, 128, 128, 16, local114, 6409);
				if (local146.method7500(local176, this.aClass73_Sub3_1, 2.0F)) {
					this.aClass73_Sub3_1.method6353();
				} else {
					this.aClass73_Sub3_1.method6354();
					this.aClass73_Sub3_1 = null;
				}
				local176.method6354();
			}
		} else {
			this.aClass73_Sub1Array3 = new Class73_Sub1[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static51.method979(Static158.anObject7, 2 * 128 * local34 * 128);
				this.aClass73_Sub1Array3[local34] = new Class73_Sub1(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass73_Sub1Array2 = new Class73_Sub1[16];
			for (@Pc(76) int local76 = 0; local76 < 16; local76++) {
				@Pc(88) byte[] local88 = Static51.method979(Static529.anObject18, local76 * 128 * 256);
				this.aClass73_Sub1Array2[local76] = new Class73_Sub1(arg0, 3553, 6410, 128, 128, true, local88, 6410, false);
			}
		}
	}
}
