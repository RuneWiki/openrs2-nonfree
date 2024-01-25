import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class394 {

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!wq;")
	private final Class391 aClass391_71 = new Class391(256);

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "Lclient!d;")
	private final Interface1 anInterface1_12;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_42;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!ffa;Lclient!d;)V")
	public Class394(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) Interface1 arg1) {
		this.anInterface1_12 = arg1;
		this.aClass57_Sub2_42 = arg0;
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V")
	public void method9306() {
		this.aClass391_71.method9276(0);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	public void method9307() {
		this.aClass391_71.method9274(5);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)Lclient!bca;")
	public Class32_Sub1 method9308(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass391_71.method9275((long) arg0);
		if (local12 != null) {
			return (Class32_Sub1) local12;
		} else if (this.anInterface1_12.method2860(arg0)) {
			@Pc(33) Class233 local33 = this.anInterface1_12.method2863(arg0);
			@Pc(43) int local43 = local33.aBoolean485 ? 64 : this.aClass57_Sub2_42.anInt2745;
			@Pc(110) Class32_Sub1 local110;
			if (local33.aBoolean479 && this.aClass57_Sub2_42.method7711()) {
				@Pc(122) float[] local122 = this.anInterface1_12.method2865(local43, arg0, 0.7F, local43);
				local110 = new Class32_Sub1(this.aClass57_Sub2_42, 3553, 34842, local43, local43, local33.aByte95 != 0, local122, 6408);
			} else {
				@Pc(77) int[] local77;
				if (local33.anInt6313 != 2 && Static263.method3861(local33.aByte94)) {
					local77 = this.anInterface1_12.method2861(true, arg0, local43, local43, 0.7F);
				} else {
					local77 = this.anInterface1_12.method2862(local43, 0.7F, arg0, local43);
				}
				local110 = new Class32_Sub1(this.aClass57_Sub2_42, 3553, 6408, local43, local43, local33.aByte95 != 0, local77, 0, 0, false);
			}
			local110.method2721(local33.aBoolean478, local33.aBoolean480);
			this.aClass391_71.method9273((long) arg0, local110, 1);
			return local110;
		} else {
			return null;
		}
	}
}
