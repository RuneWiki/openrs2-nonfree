import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public final class Class3_Sub3_Sub9 extends Class3_Sub3 {

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
	public int anInt2421;

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
	public int anInt2424;

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "I")
	public int anInt2425;

	@OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
	public int anInt2426;

	@OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
	public int anInt2428;

	@OriginalMember(owner = "client!dt", name = "t", descriptor = "Lclient!aq;")
	public final Class15 aClass15_2;

	@OriginalMember(owner = "client!dt", name = "A", descriptor = "Lclient!gaa;")
	public final Class110 aClass110_1;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!aq;Lclient!gp;)V")
	public Class3_Sub3_Sub9(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class9_Sub6 arg1) {
		this.aClass15_2 = arg0;
		this.aClass110_1 = this.aClass15_2.method442();
		this.method2176();
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)V")
	public void method2176() {
		this.anInt2428 = this.aClass15_2.anInt538;
		this.anInt2425 = this.aClass15_2.anInt549;
		this.anInt2426 = this.aClass15_2.anInt541;
		if (this.aClass15_2.aClass109_1 != null) {
			this.aClass15_2.aClass109_1.wa(this.aClass110_1.anInt3232, this.aClass110_1.anInt3237, this.aClass110_1.anInt3228, Static20.anIntArray48);
		}
		this.anInt2424 = Static20.anIntArray48[2];
		this.anInt2421 = Static20.anIntArray48[0];
	}
}
