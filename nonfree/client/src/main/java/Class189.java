import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class189 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!gj;")
	public Class85_Sub2 aClass85_Sub2_2 = null;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[Lclient!tp;")
	public Class85_Sub1[] aClass85_Sub1Array2 = null;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!gj;")
	public Class85_Sub2 aClass85_Sub2_3 = null;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Lclient!gj;")
	public Class85_Sub2 aClass85_Sub2_1 = null;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[Lclient!tp;")
	public Class85_Sub1[] aClass85_Sub1Array3 = null;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Z")
	public final boolean aBoolean483;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class189(@OriginalArg(0) Class20_Sub3 arg0) {
		this.aBoolean483 = arg0.aBoolean628;
		Static503.method7754(arg0);
		if (this.aBoolean483) {
			@Pc(33) byte[] local33 = Static172.method3628(false, Static112.anObject11);
			this.aClass85_Sub2_1 = new Class85_Sub2(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static172.method3628(false, Static78.anObject9);
			this.aClass85_Sub2_3 = new Class85_Sub2(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class279 local65 = arg0.aClass279_1;
			if (local65.method7175()) {
				local33 = Static172.method3628(false, Static410.anObject14);
				this.aClass85_Sub2_2 = new Class85_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(95) Class85_Sub2 local95 = new Class85_Sub2(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method7174(this.aClass85_Sub2_2, local95, 2.0F)) {
					this.aClass85_Sub2_2.method9095();
				} else {
					this.aClass85_Sub2_2.method9097();
					this.aClass85_Sub2_2 = null;
				}
				local95.method9097();
				return;
			}
		} else {
			this.aClass85_Sub1Array2 = new Class85_Sub1[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static434.method6895(Static112.anObject11, 2 * 128 * local127 * 128);
				this.aClass85_Sub1Array2[local127] = new Class85_Sub1(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass85_Sub1Array3 = new Class85_Sub1[16];
			for (@Pc(167) int local167 = 0; local167 < 16; local167++) {
				@Pc(179) byte[] local179 = Static434.method6895(Static78.anObject9, local167 * 2 * 16384);
				this.aClass85_Sub1Array3[local167] = new Class85_Sub1(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
