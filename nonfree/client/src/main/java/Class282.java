import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class282 {

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "[Lclient!me;")
	public Class88_Sub2[] aClass88_Sub2Array1 = null;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "Lclient!efa;")
	public Class88_Sub1 aClass88_Sub1_2 = null;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "Lclient!efa;")
	public Class88_Sub1 aClass88_Sub1_1 = null;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Lclient!efa;")
	public Class88_Sub1 aClass88_Sub1_3 = null;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "[Lclient!me;")
	public Class88_Sub2[] aClass88_Sub2Array2 = null;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Z")
	public final boolean aBoolean608;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class282(@OriginalArg(0) Class87_Sub2 arg0) {
		this.aBoolean608 = arg0.aBoolean541;
		Static253.method4170(arg0);
		if (this.aBoolean608) {
			@Pc(112) byte[] local112 = Static187.method3389(Static20.anObject1, false);
			this.aClass88_Sub1_3 = new Class88_Sub1(arg0, 6410, 128, 128, 16, local112, 6410);
			@Pc(129) byte[] local129 = Static187.method3389(Static529.anObject15, false);
			this.aClass88_Sub1_1 = new Class88_Sub1(arg0, 6410, 128, 128, 16, local129, 6410);
			@Pc(144) Class323 local144 = arg0.aClass323_1;
			if (local144.method7611()) {
				local112 = Static187.method3389(Static562.anObject17, false);
				this.aClass88_Sub1_2 = new Class88_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(174) Class88_Sub1 local174 = new Class88_Sub1(arg0, 6409, 128, 128, 16, local112, 6409);
				if (local144.method7609(this.aClass88_Sub1_2, local174, 2.0F)) {
					this.aClass88_Sub1_2.method6983();
				} else {
					this.aClass88_Sub1_2.method6984();
					this.aClass88_Sub1_2 = null;
				}
				local174.method6984();
			}
		} else {
			this.aClass88_Sub2Array1 = new Class88_Sub2[16];
			for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
				@Pc(45) byte[] local45 = Static331.method4924(local32 * 2 * 128 * 128, Static20.anObject1);
				this.aClass88_Sub2Array1[local32] = new Class88_Sub2(arg0, 3553, 6410, 128, 128, true, local45, 6410, false);
			}
			this.aClass88_Sub2Array2 = new Class88_Sub2[16];
			for (@Pc(73) int local73 = 0; local73 < 16; local73++) {
				@Pc(86) byte[] local86 = Static331.method4924(local73 * 128 * 128 * 2, Static529.anObject15);
				this.aClass88_Sub2Array2[local73] = new Class88_Sub2(arg0, 3553, 6410, 128, 128, true, local86, 6410, false);
			}
		}
	}
}
