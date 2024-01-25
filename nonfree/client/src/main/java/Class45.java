import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class45 {

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!fj;")
	public Class94_Sub3 aClass94_Sub3_1 = null;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[Lclient!fba;")
	public Class94_Sub2[] aClass94_Sub2Array1 = null;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!fj;")
	public Class94_Sub3 aClass94_Sub3_2 = null;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "[Lclient!fba;")
	public Class94_Sub2[] aClass94_Sub2Array2 = null;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!fj;")
	public Class94_Sub3 aClass94_Sub3_3 = null;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Z")
	public final boolean aBoolean58;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class45(@OriginalArg(0) Class82_Sub1 arg0) {
		this.aBoolean58 = arg0.aBoolean193;
		Static48.method8023(arg0);
		if (this.aBoolean58) {
			@Pc(33) byte[] local33 = Static184.method3030(Static292.anObject14, false);
			this.aClass94_Sub3_2 = new Class94_Sub3(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static184.method3030(Static337.anObject17, false);
			this.aClass94_Sub3_1 = new Class94_Sub3(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class79 local65 = arg0.aClass79_1;
			if (local65.method1821()) {
				local33 = Static184.method3030(Static574.anObject22, false);
				this.aClass94_Sub3_3 = new Class94_Sub3(arg0, 6408, 128, 128, 16);
				@Pc(95) Class94_Sub3 local95 = new Class94_Sub3(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method1822(this.aClass94_Sub3_3, local95, 2.0F)) {
					this.aClass94_Sub3_3.method4011();
				} else {
					this.aClass94_Sub3_3.method4008();
					this.aClass94_Sub3_3 = null;
				}
				local95.method4008();
				return;
			}
		} else {
			this.aClass94_Sub2Array2 = new Class94_Sub2[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static43.method758(Static292.anObject14, 2 * 128 * local127 * 128);
				this.aClass94_Sub2Array2[local127] = new Class94_Sub2(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass94_Sub2Array1 = new Class94_Sub2[16];
			for (@Pc(169) int local169 = 0; local169 < 16; local169++) {
				@Pc(183) byte[] local183 = Static43.method758(Static337.anObject17, local169 * 128 * 128 * 2);
				this.aClass94_Sub2Array1[local169] = new Class94_Sub2(arg0, 3553, 6410, 128, 128, true, local183, 6410, false);
			}
		}
	}
}
