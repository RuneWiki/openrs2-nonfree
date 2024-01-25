import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class101 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!dv;")
	public Class65_Sub2 aClass65_Sub2_1 = null;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "[Lclient!fq;")
	public Class65_Sub1[] aClass65_Sub1Array2 = null;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "Lclient!dv;")
	public Class65_Sub2 aClass65_Sub2_3 = null;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "Lclient!dv;")
	public Class65_Sub2 aClass65_Sub2_2 = null;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "[Lclient!fq;")
	public Class65_Sub1[] aClass65_Sub1Array1 = null;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Z")
	public final boolean aBoolean204;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class101(@OriginalArg(0) Class95_Sub1 arg0) {
		this.aBoolean204 = arg0.aBoolean182;
		Static175.method2592(arg0);
		if (this.aBoolean204) {
			@Pc(33) byte[] local33 = Static452.method6139(false, Static195.anObject7);
			this.aClass65_Sub2_2 = new Class65_Sub2(arg0, 6410, 128, 128, 16, local33, 6410);
			@Pc(50) byte[] local50 = Static452.method6139(false, Static319.anObject9);
			this.aClass65_Sub2_3 = new Class65_Sub2(arg0, 6410, 128, 128, 16, local50, 6410);
			@Pc(65) Class193 local65 = arg0.aClass193_1;
			if (local65.method4090()) {
				local33 = Static452.method6139(false, Static334.anObject10);
				this.aClass65_Sub2_1 = new Class65_Sub2(arg0, 6408, 128, 128, 16);
				@Pc(95) Class65_Sub2 local95 = new Class65_Sub2(arg0, 6409, 128, 128, 16, local33, 6409);
				if (local65.method4091(local95, this.aClass65_Sub2_1, 2.0F)) {
					this.aClass65_Sub2_1.method6825();
				} else {
					this.aClass65_Sub2_1.method6828();
					this.aClass65_Sub2_1 = null;
				}
				local95.method6828();
				return;
			}
		} else {
			this.aClass65_Sub1Array1 = new Class65_Sub1[16];
			for (@Pc(127) int local127 = 0; local127 < 16; local127++) {
				@Pc(141) byte[] local141 = Static313.method4243(Static195.anObject7, 128 * 128 * local127 * 2);
				this.aClass65_Sub1Array1[local127] = new Class65_Sub1(arg0, 3553, 6410, 128, 128, true, local141, 6410, false);
			}
			this.aClass65_Sub1Array2 = new Class65_Sub1[16];
			for (@Pc(169) int local169 = 0; local169 < 16; local169++) {
				@Pc(181) byte[] local181 = Static313.method4243(Static319.anObject9, local169 * 256 * 128);
				this.aClass65_Sub1Array2[local169] = new Class65_Sub1(arg0, 3553, 6410, 128, 128, true, local181, 6410, false);
			}
		}
	}
}
