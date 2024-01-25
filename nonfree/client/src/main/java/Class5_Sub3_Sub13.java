import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public final class Class5_Sub3_Sub13 extends Class5_Sub3 {

	@OriginalMember(owner = "client!pia", name = "s", descriptor = "I")
	public int anInt7689;

	@OriginalMember(owner = "client!pia", name = "t", descriptor = "I")
	public int anInt7690;

	@OriginalMember(owner = "client!pia", name = "w", descriptor = "I")
	public int anInt7693;

	@OriginalMember(owner = "client!pia", name = "C", descriptor = "I")
	public int anInt7696;

	@OriginalMember(owner = "client!pia", name = "D", descriptor = "I")
	public int anInt7697;

	@OriginalMember(owner = "client!pia", name = "z", descriptor = "Lclient!ld;")
	public final Class209 aClass209_2;

	@OriginalMember(owner = "client!pia", name = "A", descriptor = "Lclient!ai;")
	public final Class15 aClass15_1;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lclient!ld;Lclient!nia;)V")
	public Class5_Sub3_Sub13(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class28_Sub5 arg1) {
		this.aClass209_2 = arg0;
		this.aClass15_1 = this.aClass209_2.method5131();
		this.method6497();
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V")
	public void method6497() {
		this.anInt7696 = this.aClass209_2.anInt6182;
		this.anInt7697 = this.aClass209_2.anInt6176;
		this.anInt7689 = this.aClass209_2.anInt6174;
		if (this.aClass209_2.aClass254_4 != null) {
			this.aClass209_2.aClass254_4.method7359(this.aClass15_1.anInt241, this.aClass15_1.anInt243, this.aClass15_1.anInt248, Static272.anIntArray286);
		}
		this.anInt7693 = Static272.anIntArray286[2];
		this.anInt7690 = Static272.anIntArray286[0];
	}
}
