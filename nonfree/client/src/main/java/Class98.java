import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class98 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "[Lclient!ud;")
	public Class19_Sub4[] aClass19_Sub4Array1 = null;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Lclient!bc;")
	public Class19_Sub1 aClass19_Sub1_1 = null;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!bc;")
	public Class19_Sub1 aClass19_Sub1_2 = null;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "[Lclient!ud;")
	public Class19_Sub4[] aClass19_Sub4Array2 = null;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "Lclient!bc;")
	public Class19_Sub1 aClass19_Sub1_3 = null;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Z")
	public final boolean aBoolean187;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class98(@OriginalArg(0) Class66_Sub2 arg0) {
		this.aBoolean187 = arg0.aBoolean394;
		Static369.method3612(arg0);
		if (this.aBoolean187) {
			@Pc(33) byte[] local33 = Static134.method2371(false, Static283.anObject12);
			this.aClass19_Sub1_3 = new Class19_Sub1(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static134.method2371(false, Static219.anObject8);
			this.aClass19_Sub1_1 = new Class19_Sub1(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class258 local65 = arg0.aClass258_1;
			if (local65.method6303()) {
				local33 = Static134.method2371(false, Static121.anObject2);
				this.aClass19_Sub1_2 = new Class19_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(95) Class19_Sub1 local95 = new Class19_Sub1(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method6301(2.0F, this.aClass19_Sub1_2, local95)) {
					this.aClass19_Sub1_2.method4250();
				} else {
					this.aClass19_Sub1_2.method4252();
					this.aClass19_Sub1_2 = null;
				}
				local95.method4252();
				return;
			}
		} else {
			this.aClass19_Sub4Array1 = new Class19_Sub4[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(139) byte[] local139 = Static339.method4926(local127 * 16384 * 2, Static283.anObject12);
				this.aClass19_Sub4Array1[local127] = new Class19_Sub4(arg0, 3553, 6410, 128, 128, true, local139, 6410, false);
			}
			this.aClass19_Sub4Array2 = new Class19_Sub4[16];
			for (@Pc(165) int local165 = 0; local165 < 16; local165++) {
				@Pc(177) byte[] local177 = Static339.method4926(local165 * 128 * 256, Static219.anObject8);
				this.aClass19_Sub4Array2[local165] = new Class19_Sub4(arg0, 3553, 6410, 128, 128, true, local177, 6410, false);
			}
		}
	}
}
