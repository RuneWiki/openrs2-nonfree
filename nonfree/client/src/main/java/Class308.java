import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class308 {

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Lclient!cka;")
	public Class64_Sub1 aClass64_Sub1_1 = null;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "[Lclient!ng;")
	public Class64_Sub4[] aClass64_Sub4Array3 = null;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "Lclient!cka;")
	public Class64_Sub1 aClass64_Sub1_3 = null;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Lclient!cka;")
	public Class64_Sub1 aClass64_Sub1_2 = null;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "[Lclient!ng;")
	public Class64_Sub4[] aClass64_Sub4Array4 = null;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Z")
	public final boolean aBoolean703;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class308(@OriginalArg(0) Class145_Sub3 arg0) {
		this.aBoolean703 = arg0.aBoolean852;
		Static658.method7511(arg0);
		if (this.aBoolean703) {
			@Pc(119) byte[] local119 = Static524.method7384(false, Static496.anObject12);
			this.aClass64_Sub1_1 = new Class64_Sub1(arg0, 6410, 128, 128, 16, local119, 6410);
			@Pc(136) byte[] local136 = Static524.method7384(false, Static39.anObject1);
			this.aClass64_Sub1_3 = new Class64_Sub1(arg0, 6410, 128, 128, 16, local136, 6410);
			@Pc(151) Class121 local151 = arg0.aClass121_1;
			if (local151.method2620()) {
				local119 = Static524.method7384(false, Static626.anObject15);
				this.aClass64_Sub1_2 = new Class64_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(181) Class64_Sub1 local181 = new Class64_Sub1(arg0, 6409, 128, 128, 16, local119, 6409);
				if (local151.method2619(this.aClass64_Sub1_2, 2.0F, local181)) {
					this.aClass64_Sub1_2.method4538();
				} else {
					this.aClass64_Sub1_2.method4545();
					this.aClass64_Sub1_2 = null;
				}
				local181.method4545();
			}
		} else {
			this.aClass64_Sub4Array3 = new Class64_Sub4[16];
			for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
				@Pc(48) byte[] local48 = Static226.method3244(Static496.anObject12, 256 * 128 * local34);
				this.aClass64_Sub4Array3[local34] = new Class64_Sub4(arg0, 3553, 6410, 128, 128, true, local48, 6410, false);
			}
			this.aClass64_Sub4Array4 = new Class64_Sub4[16];
			for (@Pc(78) int local78 = 0; local78 < 16; local78++) {
				@Pc(92) byte[] local92 = Static226.method3244(Static39.anObject1, local78 * 128 * 128 * 2);
				this.aClass64_Sub4Array4[local78] = new Class64_Sub4(arg0, 3553, 6410, 128, 128, true, local92, 6410, false);
			}
		}
	}
}
