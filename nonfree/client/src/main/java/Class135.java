import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class135 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "F")
	public float aFloat43 = 1.0F;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "F")
	public float aFloat42 = 1.0F;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "F")
	public float aFloat46 = 0.25F;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
	public int anInt4073;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	public int anInt4074;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	public int anInt4069;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	public int anInt4076;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	public int anInt4080;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	public int anInt4068;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!of;")
	public Class1_Sub1_Sub16 aClass1_Sub1_Sub16_6;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class135() {
		this.anInt4073 = Static96.anInt1801;
		this.aFloat44 = 1.2F;
		this.anInt4074 = -60;
		this.anInt4069 = -50;
		this.anInt4076 = Static96.anInt1802;
		this.aFloat47 = 0.69921875F;
		this.anInt4080 = -50;
		this.anInt4068 = 0;
		this.aFloat45 = 1.1523438F;
		if (Static171.anIntArray286 != null) {
			this.aClass1_Sub1_Sub16_6 = Static196.method3199(Static171.anIntArray286[0], Static171.anIntArray286[1], Static171.anIntArray286[2], Static171.anIntArray286[3], Static171.anIntArray286[4], Static171.anIntArray286[5]);
		}
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class135(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(16) int local16 = arg0.method2595();
		if ((local16 & 0x1) == 0) {
			this.anInt4076 = Static96.anInt1802;
		} else {
			this.anInt4076 = arg0.method2647();
		}
		if ((local16 & 0x2) == 0) {
			this.aFloat45 = 1.1523438F;
		} else {
			this.aFloat45 = (float) arg0.method2593() / 256.0F;
		}
		if ((local16 & 0x4) == 0) {
			this.aFloat47 = 0.69921875F;
		} else {
			this.aFloat47 = (float) arg0.method2593() / 256.0F;
		}
		if ((local16 & 0x8) == 0) {
			this.aFloat44 = 1.2F;
		} else {
			this.aFloat44 = (float) arg0.method2593() / 256.0F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt4074 = -60;
			this.anInt4080 = -50;
			this.anInt4069 = -50;
		} else {
			this.anInt4080 = arg0.method2623();
			this.anInt4074 = arg0.method2623();
			this.anInt4069 = arg0.method2623();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt4073 = Static96.anInt1801;
		} else {
			this.anInt4073 = arg0.method2647();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt4068 = 0;
		} else {
			this.anInt4068 = arg0.method2593();
		}
		if ((local16 & 0x80) != 0) {
			this.aClass1_Sub1_Sub16_6 = Static196.method3199(arg0.method2593(), arg0.method2593(), arg0.method2593(), arg0.method2593(), arg0.method2593(), arg0.method2593());
		} else if (Static171.anIntArray286 != null) {
			this.aClass1_Sub1_Sub16_6 = Static196.method3199(Static171.anIntArray286[0], Static171.anIntArray286[1], Static171.anIntArray286[2], Static171.anIntArray286[3], Static171.anIntArray286[4], Static171.anIntArray286[5]);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!sb;I)V")
	public void method3281(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aFloat42 = (float) (arg0.method2595() * 8) / 255.0F;
		this.aFloat46 = (float) (arg0.method2595() * 8) / 255.0F;
		this.aFloat43 = (float) (arg0.method2595() * 8) / 255.0F;
	}
}
