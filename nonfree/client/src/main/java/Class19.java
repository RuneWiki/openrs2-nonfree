import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class19 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "Lclient!cfa;")
	public Class50_Sub1 aClass50_Sub1_1 = null;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "[Lclient!wi;")
	public Class50_Sub4[] aClass50_Sub4Array1 = null;

	@OriginalMember(owner = "client!an", name = "f", descriptor = "Lclient!cfa;")
	public Class50_Sub1 aClass50_Sub1_2 = null;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Lclient!cfa;")
	public Class50_Sub1 aClass50_Sub1_3 = null;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "[Lclient!wi;")
	public Class50_Sub4[] aClass50_Sub4Array2 = null;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "Z")
	public final boolean aBoolean25;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class19(@OriginalArg(0) Class101_Sub2 arg0) {
		this.aBoolean25 = arg0.aBoolean454;
		Static652.method9568(arg0);
		if (this.aBoolean25) {
			@Pc(33) byte[] local33 = Static221.method4081(Static546.anObject21, false);
			this.aClass50_Sub1_2 = new Class50_Sub1(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static221.method4081(Static346.anObject15, false);
			this.aClass50_Sub1_3 = new Class50_Sub1(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class168 local65 = arg0.aClass168_1;
			if (local65.method4511()) {
				local33 = Static221.method4081(Static468.anObject20, false);
				this.aClass50_Sub1_1 = new Class50_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(95) Class50_Sub1 local95 = new Class50_Sub1(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method4510(this.aClass50_Sub1_1, 2.0F, local95)) {
					this.aClass50_Sub1_1.method9142();
				} else {
					this.aClass50_Sub1_1.method9140();
					this.aClass50_Sub1_1 = null;
				}
				local95.method9140();
				return;
			}
		} else {
			this.aClass50_Sub4Array2 = new Class50_Sub4[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static197.method3784(local127 * 128 * 128 * 2, Static546.anObject21);
				this.aClass50_Sub4Array2[local127] = new Class50_Sub4(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass50_Sub4Array1 = new Class50_Sub4[16];
			for (@Pc(167) int local167 = 0; local167 < 16; local167++) {
				@Pc(179) byte[] local179 = Static197.method3784(local167 * 16384 * 2, Static346.anObject15);
				this.aClass50_Sub4Array1[local167] = new Class50_Sub4(arg0, 3553, 6410, 128, 128, true, local179, 6410, false);
			}
		}
	}
}
