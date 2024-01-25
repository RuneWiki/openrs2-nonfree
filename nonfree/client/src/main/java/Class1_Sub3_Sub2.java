import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
	public int anInt735;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
	public int anInt736;

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
	public int anInt741;

	@OriginalMember(owner = "client!ch", name = "F", descriptor = "Lclient!sd;")
	public final Class230 aClass230_1;

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "Lclient!ki;")
	public final Class140 aClass140_1;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!sd;Lclient!lm;)V")
	public Class1_Sub3_Sub2(@OriginalArg(0) Class230 arg0, @OriginalArg(1) Class111_Sub4 arg1) {
		this.aClass230_1 = arg0;
		this.aClass140_1 = this.aClass230_1.method4832();
		this.method683();
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
	public void method683() {
		this.anInt734 = this.aClass230_1.anInt5994;
		this.anInt741 = this.aClass230_1.anInt5996;
		this.anInt738 = this.aClass230_1.anInt6005;
		if (this.aClass230_1.aClass34_6 != null) {
			this.aClass230_1.aClass34_6.K(this.aClass140_1.anInt3949, this.aClass140_1.anInt3953, this.aClass140_1.anInt3955, Static178.anIntArray239);
		}
		this.anInt736 = Static178.anIntArray239[2];
		this.anInt735 = Static178.anIntArray239[0];
	}
}
