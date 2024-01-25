import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class3_Sub3_Sub10 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
	public int anInt3256;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	public int anInt3258;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
	public int anInt3260;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
	public int anInt3261;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
	public int anInt3262;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "Lclient!ot;")
	public final Class178 aClass178_1;

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "Lclient!it;")
	public final Class115 aClass115_1;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!ot;Lclient!wp;)V")
	public Class3_Sub3_Sub10(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class13_Sub8 arg1) {
		this.aClass178_1 = arg0;
		this.aClass115_1 = this.aClass178_1.method4372();
		this.method2662();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public void method2662() {
		this.anInt3261 = this.aClass178_1.anInt5410;
		this.anInt3260 = this.aClass178_1.anInt5415;
		this.anInt3258 = this.aClass178_1.anInt5414;
		if (this.aClass178_1.aClass106_4 != null) {
			this.aClass178_1.aClass106_4.E(this.aClass115_1.anInt3686, this.aClass115_1.anInt3695, this.aClass115_1.anInt3679, Static164.anIntArray262);
		}
		this.anInt3262 = Static164.anIntArray262[0];
		this.anInt3256 = Static164.anIntArray262[2];
	}
}
