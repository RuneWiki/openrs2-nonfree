import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class189 {

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Lclient!gg;")
	private final Class112 aClass112_34 = new Class112(256);

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_25;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Lclient!d;")
	private final Interface5 anInterface5_10;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!eq;Lclient!d;)V")
	public Class189(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Interface5 arg1) {
		this.aClass33_Sub3_25 = arg0;
		this.anInterface5_10 = arg1;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
	public void method5158() {
		this.aClass112_34.method3637(5);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)Lclient!hga;")
	public Class121_Sub2 method5159(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass112_34.method3640((long) arg0);
		if (local12 != null) {
			return (Class121_Sub2) local12;
		} else if (this.anInterface5_10.method6867(arg0)) {
			@Pc(31) Class156 local31 = this.anInterface5_10.method6869(arg0);
			@Pc(40) int local40 = local31.aBoolean494 ? 64 : this.aClass33_Sub3_25.anInt3412;
			@Pc(98) Class121_Sub2 local98;
			if (local31.aBoolean498 && this.aClass33_Sub3_25.method6185()) {
				@Pc(110) float[] local110 = this.anInterface5_10.method6871(local40, arg0, 0.7F, local40);
				local98 = new Class121_Sub2(this.aClass33_Sub3_25, 3553, 34842, local40, local40, local31.aByte70 != 0, local110, 6408);
			} else {
				@Pc(66) int[] local66;
				if (local31.anInt5679 != 2 && Static237.method4550(local31.aByte69)) {
					local66 = this.anInterface5_10.method6868(true, 0.7F, local40, arg0, local40);
				} else {
					local66 = this.anInterface5_10.method6870(arg0, 0.7F, local40, local40);
				}
				local98 = new Class121_Sub2(this.aClass33_Sub3_25, 3553, 6408, local40, local40, local31.aByte70 != 0, local66, 0, 0, false);
			}
			local98.method5567(local31.aBoolean492, local31.aBoolean495);
			this.aClass112_34.method3636((long) arg0, local98);
			return local98;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	public void method5161() {
		this.aClass112_34.method3638();
	}
}
