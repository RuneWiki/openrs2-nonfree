import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class37 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
	public int anInt1074;

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
	public int anInt1075;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
	public int anInt1076;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
	public int anInt1077;

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
	private int anInt1079;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "J")
	public long aLong27;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
	public int anInt1087;

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
	public int anInt1088;

	@OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
	public int anInt1090;

	@OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
	public int anInt1091;

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
	public int anInt1084 = 0;

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
	public int anInt1082 = 0;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILclient!tn;)V")
	private void method1152(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt1079 = arg1.method8414();
		} else if (arg0 == 2) {
			arg1.method8401();
		} else if (arg0 == 3) {
			this.anInt1087 = arg1.method8402();
			this.anInt1088 = arg1.method8402();
			this.anInt1090 = arg1.method8402();
		} else if (arg0 == 4) {
			this.anInt1077 = arg1.method8401();
			this.anInt1074 = arg1.method8402();
		} else if (arg0 == 6) {
			this.anInt1080 = arg1.method8401();
		} else if (arg0 == 8) {
			this.anInt1084 = 1;
		} else if (arg0 == 9) {
			this.anInt1082 = 1;
		} else if (arg0 == 10) {
			this.aBoolean90 = true;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!tn;I)V")
	public void method1153(@OriginalArg(0) Class3_Sub15 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method8401();
			if (local7 == 0) {
				return;
			}
			this.method1152(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(B)V")
	public void method1155() {
		this.anInt1075 = Class3_Sub1_Sub2.anIntArray85[this.anInt1079 << 3];
		@Pc(17) long local17 = (long) this.anInt1087;
		@Pc(28) long local28 = (long) this.anInt1088;
		@Pc(32) long local32 = (long) this.anInt1090;
		this.anInt1091 = (int) Math.sqrt((double) (local17 * local17 + local28 * local28 + local32 * local32));
		if (this.anInt1074 == 0) {
			this.anInt1074 = 1;
		}
		if (this.anInt1077 == 0) {
			this.aLong27 = 2147483647L;
		} else if (this.anInt1077 == 1) {
			this.aLong27 = this.anInt1091 * 8 / this.anInt1074;
			this.aLong27 *= this.aLong27;
		} else if (this.anInt1077 == 2) {
			this.aLong27 = this.anInt1091 * 8 / this.anInt1074;
		}
		if (this.aBoolean90) {
			this.anInt1091 *= -1;
		}
	}
}
