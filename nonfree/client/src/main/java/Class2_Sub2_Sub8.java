import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
	public int anInt2782;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
	public int anInt2784;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
	public int anInt2785;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
	public int anInt2786;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
	public int anInt2787;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!au;")
	public final Class17 aClass17_2;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "Lclient!bp;")
	public final Class27 aClass27_1;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!au;Lclient!lr;)V")
	public Class2_Sub2_Sub8(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class38_Sub6 arg1) {
		this.aClass17_2 = arg0;
		this.aClass27_1 = this.aClass17_2.method270();
		this.method2138();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public void method2138() {
		this.anInt2785 = this.aClass17_2.anInt431;
		this.anInt2782 = this.aClass17_2.anInt430;
		this.anInt2784 = this.aClass17_2.anInt427;
		if (this.aClass17_2.aClass102_1 != null) {
			this.aClass17_2.aClass102_1.E(this.aClass27_1.anInt987, this.aClass27_1.anInt985, this.aClass27_1.anInt982, Static424.anIntArray496);
		}
		this.anInt2787 = Static424.anIntArray496[0];
		this.anInt2786 = Static424.anIntArray496[2];
	}
}
