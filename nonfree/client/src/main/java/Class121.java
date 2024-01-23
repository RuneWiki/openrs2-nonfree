import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class121 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	public int anInt3998;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public int anInt3999;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	public int anInt4000;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "J")
	public long aLong141;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public int anInt4001;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
	private int anInt4004;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
	public int anInt4009;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
	public int anInt4010;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
	public int anInt4014;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
	public int anInt4015;

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
	public int anInt4016;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	public int anInt4006 = 0;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Z")
	private boolean aBoolean275 = false;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
	public int anInt4012 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!oe;I)V")
	public void method3290(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method2146();
			if (local15 == 0) {
				return;
			}
			this.method3292(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLclient!oe;I)V")
	private void method3292(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4004 = arg0.method2130();
		} else if (arg1 == 2) {
			arg0.method2146();
		} else if (arg1 == 3) {
			this.anInt4009 = arg0.method2145();
			this.anInt4000 = arg0.method2145();
			this.anInt4014 = arg0.method2145();
		} else if (arg1 == 4) {
			this.anInt4015 = arg0.method2146();
			this.anInt4010 = arg0.method2145();
		} else if (arg1 == 6) {
			this.anInt4001 = arg0.method2146();
		} else if (arg1 == 8) {
			this.anInt4012 = 1;
		} else if (arg1 == 9) {
			this.anInt4006 = 1;
		} else if (arg1 == 10) {
			this.aBoolean275 = true;
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public void method3294() {
		this.anInt3998 = Class1.anIntArray3[this.anInt4004];
		this.anInt3999 = (int) Math.sqrt((double) (this.anInt4000 * this.anInt4000 + this.anInt4009 * this.anInt4009 + this.anInt4014 * this.anInt4014));
		if (this.anInt4010 == 0) {
			this.anInt4010 = 1;
		}
		if (this.anInt4015 == 0) {
			this.aLong141 = 2147483647L;
		} else if (this.anInt4015 == 1) {
			this.aLong141 = this.anInt3999 * 8 / this.anInt4010;
			this.aLong141 *= this.aLong141;
		} else if (this.anInt4015 == 2) {
			this.aLong141 = this.anInt3999 * 8 / this.anInt4010;
		}
		if (this.aBoolean275) {
			this.anInt3999 *= -1;
		}
	}
}
