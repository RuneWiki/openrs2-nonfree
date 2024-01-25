import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class50 {

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
	public int anInt1078;

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "J")
	public long aLong42;

	@OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
	public int anInt1082;

	@OriginalMember(owner = "client!cfa", name = "h", descriptor = "I")
	public int anInt1083;

	@OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
	public int anInt1085;

	@OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
	public int anInt1088;

	@OriginalMember(owner = "client!cfa", name = "o", descriptor = "I")
	public int anInt1090;

	@OriginalMember(owner = "client!cfa", name = "p", descriptor = "I")
	public int anInt1091;

	@OriginalMember(owner = "client!cfa", name = "r", descriptor = "I")
	public int anInt1092;

	@OriginalMember(owner = "client!cfa", name = "s", descriptor = "I")
	private int anInt1093;

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
	public int anInt1079 = 0;

	@OriginalMember(owner = "client!cfa", name = "f", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
	public int anInt1081 = 0;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V")
	public void method1016() {
		this.anInt1090 = Class1_Sub6_Sub2.anIntArray676[this.anInt1093 << 3];
		@Pc(17) long local17 = (long) this.anInt1085;
		@Pc(21) long local21 = (long) this.anInt1091;
		@Pc(25) long local25 = (long) this.anInt1088;
		this.anInt1080 = (int) Math.sqrt((double) (local25 * local25 + local17 * local17 + local21 * local21));
		if (this.anInt1082 == 0) {
			this.anInt1082 = 1;
		}
		if (this.anInt1092 == 0) {
			this.aLong42 = 2147483647L;
		} else if (this.anInt1092 == 1) {
			this.aLong42 = this.anInt1080 * 8 / this.anInt1082;
			this.aLong42 *= this.aLong42;
		} else if (this.anInt1092 == 2) {
			this.aLong42 = this.anInt1080 * 8 / this.anInt1082;
		}
		if (this.aBoolean84) {
			this.anInt1080 *= -1;
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!mo;I)V")
	public void method1017(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5750();
			if (local11 == 0) {
				return;
			}
			this.method1018(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!mo;BI)V")
	private void method1018(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1093 = arg0.method5771();
		} else if (arg1 == 2) {
			arg0.method5750();
		} else if (arg1 == 3) {
			this.anInt1085 = arg0.method5804();
			this.anInt1091 = arg0.method5804();
			this.anInt1088 = arg0.method5804();
		} else if (arg1 == 4) {
			this.anInt1092 = arg0.method5750();
			this.anInt1082 = arg0.method5804();
		} else if (arg1 == 6) {
			this.anInt1078 = arg0.method5750();
		} else if (arg1 == 8) {
			this.anInt1079 = 1;
		} else if (arg1 == 9) {
			this.anInt1081 = 1;
		} else if (arg1 == 10) {
			this.aBoolean84 = true;
		}
	}
}
