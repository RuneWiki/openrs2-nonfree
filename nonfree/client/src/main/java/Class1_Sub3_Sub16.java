import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!qba", name = "u", descriptor = "I")
	public int anInt7174;

	@OriginalMember(owner = "client!qba", name = "y", descriptor = "I")
	public int anInt7177;

	@OriginalMember(owner = "client!qba", name = "z", descriptor = "I")
	public int anInt7178;

	@OriginalMember(owner = "client!qba", name = "A", descriptor = "I")
	public int anInt7179;

	@OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
	public int anInt7181;

	@OriginalMember(owner = "client!qba", name = "w", descriptor = "Lclient!fk;")
	public final Class101 aClass101_2;

	@OriginalMember(owner = "client!qba", name = "E", descriptor = "Lclient!vi;")
	public final Class343 aClass343_1;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lclient!fk;Lclient!ii;)V")
	public Class1_Sub3_Sub16(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class20_Sub5 arg1) {
		this.aClass101_2 = arg0;
		this.aClass343_1 = this.aClass101_2.method2365();
		this.method5919();
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)V")
	public void method5919() {
		this.anInt7181 = this.aClass101_2.anInt2801;
		this.anInt7177 = this.aClass101_2.anInt2805;
		this.anInt7174 = this.aClass101_2.anInt2802;
		if (this.aClass101_2.aClass209_2 != null) {
			this.aClass101_2.aClass209_2.wa(this.aClass343_1.anInt9095, this.aClass343_1.anInt9082, this.aClass343_1.anInt9088, Static126.anIntArray445);
		}
		this.anInt7179 = Static126.anIntArray445[0];
		this.anInt7178 = Static126.anIntArray445[2];
	}
}
