import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class288 {

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "Lclient!be;")
	public Class29_Sub1 aClass29_Sub1_1 = null;

	@OriginalMember(owner = "client!pia", name = "k", descriptor = "[Lclient!kia;")
	public Class29_Sub3[] aClass29_Sub3Array3 = null;

	@OriginalMember(owner = "client!pia", name = "h", descriptor = "Lclient!be;")
	public Class29_Sub1 aClass29_Sub1_2 = null;

	@OriginalMember(owner = "client!pia", name = "j", descriptor = "[Lclient!kia;")
	public Class29_Sub3[] aClass29_Sub3Array4 = null;

	@OriginalMember(owner = "client!pia", name = "i", descriptor = "Lclient!be;")
	public Class29_Sub1 aClass29_Sub1_3 = null;

	@OriginalMember(owner = "client!pia", name = "l", descriptor = "Z")
	public final boolean aBoolean504;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class288(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aBoolean504 = arg0.aBoolean742;
		Static108.method1618(arg0);
		if (this.aBoolean504) {
			@Pc(121) byte[] local121 = Static553.method7508(Static589.anObject18, false);
			this.aClass29_Sub1_3 = new Class29_Sub1(arg0, 6410, 128, 128, 16, local121, 6410);
			@Pc(138) byte[] local138 = Static553.method7508(Static258.anObject11, false);
			this.aClass29_Sub1_2 = new Class29_Sub1(arg0, 6410, 128, 128, 16, local138, 6410);
			@Pc(153) Class271 local153 = arg0.aClass271_1;
			if (local153.method6195()) {
				local121 = Static553.method7508(Static11.anObject1, false);
				this.aClass29_Sub1_1 = new Class29_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(183) Class29_Sub1 local183 = new Class29_Sub1(arg0, 6409, 128, 128, 16, local121, 6409);
				if (local153.method6194(2.0F, local183, this.aClass29_Sub1_1)) {
					this.aClass29_Sub1_1.method8168();
				} else {
					this.aClass29_Sub1_1.method8167();
					this.aClass29_Sub1_1 = null;
				}
				local183.method8167();
			}
		} else {
			this.aClass29_Sub3Array3 = new Class29_Sub3[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(50) byte[] local50 = Static260.method4253(2 * 128 * 128 * local34, Static589.anObject18);
				this.aClass29_Sub3Array3[local34] = new Class29_Sub3(arg0, 3553, 6410, 128, 128, true, local50, 6410, false);
			}
			this.aClass29_Sub3Array4 = new Class29_Sub3[16];
			for (@Pc(82) int local82 = 0; local82 < 16; local82++) {
				@Pc(94) byte[] local94 = Static260.method4253(local82 * 2 * 16384, Static258.anObject11);
				this.aClass29_Sub3Array4[local82] = new Class29_Sub3(arg0, 3553, 6410, 128, 128, true, local94, 6410, false);
			}
		}
	}
}
