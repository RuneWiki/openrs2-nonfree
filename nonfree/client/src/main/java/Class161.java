import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class161 {

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "[Lclient!aw;")
	public Class3_Sub2[] aClass3_Sub2Array4 = null;

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "Lclient!gp;")
	public Class3_Sub3 aClass3_Sub3_1 = null;

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "Lclient!gp;")
	public Class3_Sub3 aClass3_Sub3_2 = null;

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "[Lclient!aw;")
	public Class3_Sub2[] aClass3_Sub2Array3 = null;

	@OriginalMember(owner = "client!jga", name = "i", descriptor = "Lclient!gp;")
	public Class3_Sub3 aClass3_Sub3_3 = null;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "Z")
	public final boolean aBoolean354;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class161(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aBoolean354 = arg0.aBoolean722;
		Static145.method2340(arg0);
		if (this.aBoolean354) {
			@Pc(33) byte[] local33 = Static589.method8324(false, Static297.anObject17);
			this.aClass3_Sub3_2 = new Class3_Sub3(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static589.method8324(false, Static304.anObject13);
			this.aClass3_Sub3_1 = new Class3_Sub3(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class66 local65 = arg0.aClass66_1;
			if (local65.method1759()) {
				local33 = Static589.method8324(false, Static265.anObject8);
				this.aClass3_Sub3_3 = new Class3_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(95) Class3_Sub3 local95 = new Class3_Sub3(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method1756(this.aClass3_Sub3_3, local95, 2.0F)) {
					this.aClass3_Sub3_3.method5777();
				} else {
					this.aClass3_Sub3_3.method5770();
					this.aClass3_Sub3_3 = null;
				}
				local95.method5770();
				return;
			}
		} else {
			this.aClass3_Sub2Array4 = new Class3_Sub2[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static175.method3219(local127 * 256 * 128, Static297.anObject17);
				this.aClass3_Sub2Array4[local127] = new Class3_Sub2(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass3_Sub2Array3 = new Class3_Sub2[16];
			for (@Pc(165) int local165 = 0; local165 < 16; local165++) {
				@Pc(179) byte[] local179 = Static175.method3219(local165 * 2 * 128 * 128, Static304.anObject13);
				this.aClass3_Sub2Array3[local165] = new Class3_Sub2(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
