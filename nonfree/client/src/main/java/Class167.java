import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class167 {

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!wq;")
	private final Class391 aClass391_22 = new Class391(256);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!d;")
	private final Interface1 anInterface1_5;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Lclient!kd;")
	private final Class57_Sub3 aClass57_Sub3_9;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!kd;Lclient!d;)V")
	public Class167(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) Interface1 arg1) {
		this.anInterface1_5 = arg1;
		this.aClass57_Sub3_9 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Lclient!wp;")
	public Interface26 method3451(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass391_22.method9275((long) arg0);
		if (local12 != null) {
			return (Interface26) local12;
		} else if (this.anInterface1_5.method2860(arg0)) {
			@Pc(33) Class233 local33 = this.anInterface1_5.method2863(arg0);
			@Pc(43) int local43 = local33.aBoolean485 ? 64 : this.aClass57_Sub3_9.anInt9167;
			@Pc(110) Interface26 local110;
			if (local33.aBoolean479 && this.aClass57_Sub3_9.method7711()) {
				@Pc(122) float[] local122 = this.anInterface1_5.method2865(local43, arg0, 0.7F, local43);
				local110 = this.aClass57_Sub3_9.method7855(local43, local122, local33.aByte95 != 0, Static412.aClass114_17, local43);
			} else {
				@Pc(81) int[] local81;
				if (local33.anInt6313 != 2 && Static263.method3861(local33.aByte94)) {
					local81 = this.anInterface1_5.method2861(true, arg0, local43, local43, 0.7F);
				} else {
					local81 = this.anInterface1_5.method2862(local43, 0.7F, arg0, local43);
				}
				local110 = this.aClass57_Sub3_9.method7787(local81, local43, local43, local33.aByte95 != 0);
			}
			local110.method4348(local33.aBoolean478, local33.aBoolean480);
			this.aClass391_22.method9273((long) arg0, local110, 1);
			return local110;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	public void method3452() {
		this.aClass391_22.method9274(5);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public void method3454() {
		this.aClass391_22.method9276(0);
	}
}
