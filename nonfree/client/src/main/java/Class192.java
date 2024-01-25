import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class192 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!ku;")
	private final Class139 aClass139_57 = new Class139(256);

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "Lclient!wp;")
	private final Interface10 anInterface10_5;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_34;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!mi;Lclient!wp;)V")
	public Class192(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) Interface10 arg1) {
		this.anInterface10_5 = arg1;
		this.aClass155_Sub1_34 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)Lclient!kh;")
	public Class30_Sub3 method4408(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.aClass139_57.method3076((long) arg0);
		if (local6 != null) {
			return (Class30_Sub3) local6;
		} else if (this.anInterface10_5.method191(arg0)) {
			@Pc(25) Class121 local25 = this.anInterface10_5.method192(arg0);
			@Pc(32) int local32 = local25.aBoolean224 ? 64 : 128;
			@Pc(72) Class30_Sub3 local72;
			if (local25.aBoolean220 && this.aClass155_Sub1_34.method4898()) {
				@Pc(83) float[] local83 = this.anInterface10_5.method195(arg0, local32, 0.7F, local32);
				local72 = new Class30_Sub3(this.aClass155_Sub1_34, 3553, 34842, local32, local32, local25.aByte38 != 0, local83, 6408);
			} else {
				@Pc(51) int[] local51 = this.anInterface10_5.method193(0.7F, local32, arg0, local32);
				local72 = new Class30_Sub3(this.aClass155_Sub1_34, 3553, 6408, local32, local32, local25.aByte38 != 0, local51, false);
			}
			local72.method4613(local25.aBoolean222, local25.aBoolean219);
			this.aClass139_57.method3070(local72, (long) arg0);
			return local72;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	public void method4409() {
		this.aClass139_57.method3075();
	}
}
