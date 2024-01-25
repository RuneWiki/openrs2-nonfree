import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public final class Class2_Sub6_Sub12 extends Class2_Sub6 {

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
	public int anInt5740;

	@OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
	public int anInt5741;

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
	public int anInt5742;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "I")
	public int anInt5745;

	@OriginalMember(owner = "client!jo", name = "G", descriptor = "I")
	public int anInt5746;

	@OriginalMember(owner = "client!jo", name = "w", descriptor = "Lclient!eca;")
	public final Class87 aClass87_2;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "Lclient!po;")
	public final Class267 aClass267_1;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!eca;Lclient!uj;)V")
	public Class2_Sub6_Sub12(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Class3_Sub9 arg1) {
		this.aClass87_2 = arg0;
		this.aClass267_1 = this.aClass87_2.method2909();
		this.method4964();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public void method4964() {
		this.anInt5741 = this.aClass87_2.anInt3134;
		this.anInt5745 = this.aClass87_2.anInt3135;
		this.anInt5746 = this.aClass87_2.anInt3133;
		if (this.aClass87_2.aClass30_4 != null) {
			this.aClass87_2.aClass30_4.method4660(this.aClass267_1.anInt8079, this.aClass267_1.anInt8078, this.aClass267_1.anInt8082, Static186.anIntArray221);
		}
		this.anInt5740 = Static186.anIntArray221[0];
		this.anInt5742 = Static186.anIntArray221[2];
	}
}
