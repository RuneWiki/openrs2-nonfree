import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class2_Sub9_Sub19 extends Class2_Sub9 {

	@OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
	public int anInt5718;

	@OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
	public int anInt5719;

	@OriginalMember(owner = "client!rk", name = "T", descriptor = "I")
	public int anInt5720;

	@OriginalMember(owner = "client!rk", name = "Z", descriptor = "I")
	public int anInt5725;

	@OriginalMember(owner = "client!rk", name = "bb", descriptor = "I")
	public int anInt5727;

	@OriginalMember(owner = "client!rk", name = "Q", descriptor = "Lclient!mp;")
	public final Class136 aClass136_2;

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "Lclient!ug;")
	public final Class202 aClass202_1;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!mp;Lclient!mk;)V")
	public Class2_Sub9_Sub19(@OriginalArg(0) Class136 arg0, @OriginalArg(1) Class57_Sub6 arg1) {
		this.aClass136_2 = arg0;
		this.aClass202_1 = Static355.method5672(arg0.anInt4533);
		this.method4826();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
	public void method4826() {
		this.anInt5719 = this.aClass136_2.anInt4536;
		this.anInt5718 = this.aClass136_2.anInt4530;
		this.anInt5725 = this.aClass136_2.anInt4532;
		if (this.aClass136_2.aClass38_2 != null) {
			this.aClass136_2.aClass38_2.method4478(this.aClass202_1.anInt6352, this.aClass202_1.anInt6344, this.aClass202_1.anInt6346, Static302.anIntArray464);
		}
		this.anInt5727 = Static302.anIntArray464[2];
		this.anInt5720 = Static302.anIntArray464[0];
	}
}
