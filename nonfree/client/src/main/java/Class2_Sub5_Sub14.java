import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class2_Sub5_Sub14 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
	public int anInt5634;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
	public int anInt5635;

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
	public int anInt5636;

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
	public int anInt5641;

	@OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
	public int anInt5644;

	@OriginalMember(owner = "client!ks", name = "M", descriptor = "Lclient!uga;")
	public final Class337 aClass337_1;

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "Lclient!va;")
	public final Class351 aClass351_1;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!uga;Lclient!f;)V")
	public Class2_Sub5_Sub14(@OriginalArg(0) Class337 arg0, @OriginalArg(1) Class11_Sub4 arg1) {
		this.aClass337_1 = arg0;
		this.aClass351_1 = this.aClass337_1.method7847();
		this.method4711();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	public void method4711() {
		this.anInt5634 = this.aClass337_1.anInt9397;
		this.anInt5635 = this.aClass337_1.anInt9394;
		this.anInt5641 = this.aClass337_1.anInt9393;
		if (this.aClass337_1.aClass6_35 != null) {
			this.aClass337_1.aClass6_35.method6700(this.aClass351_1.anInt9700, this.aClass351_1.anInt9696, this.aClass351_1.anInt9695, Static259.anIntArray349);
		}
		this.anInt5644 = Static259.anIntArray349[2];
		this.anInt5636 = Static259.anIntArray349[0];
	}
}
