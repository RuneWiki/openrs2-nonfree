import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class145 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "Lclient!of;")
	private final Class188 aClass188_34 = new Class188(256);

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Lclient!l;")
	private final Interface7 anInterface7_3;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_20;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!na;Lclient!l;)V")
	public Class145(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_3 = arg1;
		this.aClass75_Sub2_20 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	public void method3029() {
		this.aClass188_34.method4169(5);
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	public void method3031() {
		this.aClass188_34.method4156();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)Lclient!sa;")
	public Class64_Sub4 method3033(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass188_34.method4158((long) arg0);
		if (local12 != null) {
			return (Class64_Sub4) local12;
		} else if (this.anInterface7_3.method1168(arg0)) {
			@Pc(31) Class257 local31 = this.anInterface7_3.method1170(arg0);
			@Pc(40) int local40 = local31.aBoolean493 ? 64 : this.aClass75_Sub2_20.anInt4857;
			@Pc(90) Class64_Sub4 local90;
			if (local31.aBoolean486 && this.aClass75_Sub2_20.method5972()) {
				@Pc(102) float[] local102 = this.anInterface7_3.method1169(local40, 0.7F, arg0, local40);
				local90 = new Class64_Sub4(this.aClass75_Sub2_20, 3553, 34842, local40, local40, local31.aByte91 != 0, local102, 6408);
			} else {
				@Pc(60) int[] local60;
				if (local31.aBoolean487) {
					local60 = this.anInterface7_3.method1172(0.7F, local40, arg0, local40);
				} else {
					local60 = this.anInterface7_3.method1171(false, 0.7F, arg0, local40, local40);
				}
				local90 = new Class64_Sub4(this.aClass75_Sub2_20, 3553, 6408, local40, local40, local31.aByte91 != 0, local60, false);
			}
			local90.method3530(local31.aBoolean490, local31.aBoolean484);
			this.aClass188_34.method4155((long) arg0, local90);
			return local90;
		} else {
			return null;
		}
	}
}
