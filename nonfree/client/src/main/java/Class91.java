import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class91 {

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public int anInt2090;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "J")
	public long aLong64;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	public int anInt2091;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
	public int anInt2093;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	public int anInt2094;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	public int anInt2095;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	private int anInt2098;

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
	public int anInt2099;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	public int anInt2101;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
	public int anInt2102;

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
	public int anInt2105;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
	public int anInt2088 = 0;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
	public int anInt2097 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!re;)V")
	public void method1735(@OriginalArg(1) Class1_Sub33 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5174();
			if (local7 == 0) {
				return;
			}
			this.method1737(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBLclient!re;)V")
	private void method1737(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 1) {
			this.anInt2098 = arg1.method5177();
		} else if (arg0 == 2) {
			arg1.method5174();
		} else if (arg0 == 3) {
			this.anInt2095 = arg1.method5150();
			this.anInt2094 = arg1.method5150();
			this.anInt2102 = arg1.method5150();
		} else if (arg0 == 4) {
			this.anInt2099 = arg1.method5174();
			this.anInt2101 = arg1.method5150();
		} else if (arg0 == 6) {
			this.anInt2091 = arg1.method5174();
		} else if (arg0 == 8) {
			this.anInt2088 = 1;
		} else if (arg0 == 9) {
			this.anInt2097 = 1;
		} else if (arg0 == 10) {
			this.aBoolean172 = true;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public void method1738() {
		this.anInt2105 = Class13.anIntArray21[this.anInt2098 << 3];
		this.anInt2090 = (int) Math.sqrt((double) (this.anInt2095 * this.anInt2095 + this.anInt2094 * this.anInt2094 + this.anInt2102 * this.anInt2102));
		if (this.anInt2101 == 0) {
			this.anInt2101 = 1;
		}
		if (this.anInt2099 == 0) {
			this.aLong64 = 2147483647L;
		} else if (this.anInt2099 == 1) {
			this.aLong64 = this.anInt2090 * 8 / this.anInt2101;
			this.aLong64 *= this.aLong64;
		} else if (this.anInt2099 == 2) {
			this.aLong64 = this.anInt2090 * 8 / this.anInt2101;
		}
		if (this.aBoolean172) {
			this.anInt2090 *= -1;
		}
	}
}
