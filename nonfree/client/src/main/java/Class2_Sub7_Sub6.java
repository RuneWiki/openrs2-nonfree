import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class2_Sub7_Sub6 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	public int anInt2742;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
	public int anInt2743;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
	public int anInt2745;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
	public int anInt2746;

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
	public int anInt2747;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "Lclient!gp;")
	public final Class88 aClass88_2;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!c;")
	public final Class31 aClass31_1;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!gp;Lclient!bt;)V")
	public Class2_Sub7_Sub6(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class7_Sub3 arg1) {
		this.aClass88_2 = arg0;
		this.aClass31_1 = Static329.method5294(arg0.anInt2638);
		this.method2208();
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public void method2208() {
		this.anInt2743 = this.aClass88_2.anInt2642;
		this.anInt2746 = this.aClass88_2.anInt2643;
		this.anInt2742 = this.aClass88_2.anInt2640;
		if (this.aClass88_2.aClass21_5 != null) {
			this.aClass88_2.aClass21_5.method3710(this.aClass31_1.anInt680, this.aClass31_1.anInt679, this.aClass31_1.anInt678, Static290.anIntArray460);
		}
		this.anInt2747 = Static290.anIntArray460[0];
		this.anInt2745 = Static290.anIntArray460[2];
	}
}
