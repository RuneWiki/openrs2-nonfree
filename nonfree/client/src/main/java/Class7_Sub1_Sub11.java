import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class7_Sub1_Sub11 extends Class7_Sub1 {

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt2818;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public int anInt2820;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
	public int anInt2822;

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
	public int anInt2824;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "Lclient!ae;")
	public final Class6 aClass6_2;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Lclient!aa;")
	public final Class2 aClass2_1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!ae;Lclient!ha;)V")
	public Class7_Sub1_Sub11(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class36_Sub3 arg1) {
		this.aClass6_2 = arg0;
		this.aClass2_1 = Static87.method4767(arg0.anInt81);
		this.method2629();
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
	public void method2629() {
		this.anInt2820 = this.aClass6_2.anInt84;
		this.anInt2822 = this.aClass6_2.anInt90;
		this.anInt2824 = this.aClass6_2.anInt86;
		if (this.aClass6_2.aClass70_1 != null) {
			this.aClass6_2.aClass70_1.method3710(this.aClass2_1.anInt1, this.aClass2_1.anInt19, this.aClass2_1.anInt8, Static310.anIntArray752);
		}
		this.anInt2818 = Static310.anIntArray752[2];
		this.anInt2817 = Static310.anIntArray752[0];
	}
}
