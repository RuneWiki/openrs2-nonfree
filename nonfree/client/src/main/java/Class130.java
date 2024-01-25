import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class130 {

	@OriginalMember(owner = "client!go", name = "d", descriptor = "Lclient!ek;")
	public Class66_Sub2 aClass66_Sub2_2 = null;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "[Lclient!km;")
	public Class66_Sub1[] aClass66_Sub1Array3 = null;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "[Lclient!km;")
	public Class66_Sub1[] aClass66_Sub1Array2 = null;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "Lclient!ek;")
	public Class66_Sub2 aClass66_Sub2_1 = null;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "Lclient!ek;")
	public Class66_Sub2 aClass66_Sub2_3 = null;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "Z")
	public final boolean aBoolean273;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class130(@OriginalArg(0) Class137_Sub3 arg0) {
		this.aBoolean273 = arg0.aBoolean589;
		Static143.method2257(arg0);
		if (this.aBoolean273) {
			@Pc(33) byte[] local33 = Static9.method53(false, Static640.anObject6);
			this.aClass66_Sub2_1 = new Class66_Sub2(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static9.method53(false, Static234.anObject9);
			this.aClass66_Sub2_2 = new Class66_Sub2(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class268 local65 = arg0.aClass268_1;
			if (local65.method6472()) {
				local33 = Static9.method53(false, Static145.anObject5);
				this.aClass66_Sub2_3 = new Class66_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(95) Class66_Sub2 local95 = new Class66_Sub2(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method6471(2.0F, this.aClass66_Sub2_3, local95)) {
					this.aClass66_Sub2_3.method6854();
				} else {
					this.aClass66_Sub2_3.method6846();
					this.aClass66_Sub2_3 = null;
				}
				local95.method6846();
				return;
			}
		} else {
			this.aClass66_Sub1Array3 = new Class66_Sub1[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static660.method9132(2 * 128 * local127 * 128, Static640.anObject6);
				this.aClass66_Sub1Array3[local127] = new Class66_Sub1(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass66_Sub1Array2 = new Class66_Sub1[16];
			for (@Pc(169) int local169 = 0; local169 < 16; local169++) {
				@Pc(181) byte[] local181 = Static660.method9132(local169 * 2 * 16384, Static234.anObject9);
				this.aClass66_Sub1Array2[local169] = new Class66_Sub1(arg0, 3553, 6410, 128, 128, true, local181, 6410, false);
			}
		}
	}
}
