import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class8 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	public int anInt119;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "J")
	public long aLong6;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
	public int anInt121;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	public int anInt124;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
	public int anInt125;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	public int anInt123 = 0;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	public int anInt127 = 0;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!iv;)V")
	public void method89(@OriginalArg(1) Class4_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2490();
			if (local5 == 0) {
				return;
			}
			this.method93(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	public void method91() {
		this.anInt124 = Class50_Sub1.anIntArray224[this.anInt122 << 3];
		this.anInt119 = (int) Math.sqrt((double) (this.anInt128 * this.anInt128 + this.anInt125 * this.anInt125 + this.anInt132 * this.anInt132));
		if (this.anInt131 == 0) {
			this.anInt131 = 1;
		}
		if (this.anInt133 == 0) {
			this.aLong6 = 2147483647L;
		} else if (this.anInt133 == 1) {
			this.aLong6 = this.anInt119 * 8 / this.anInt131;
			this.aLong6 *= this.aLong6;
		} else if (this.anInt133 == 2) {
			this.aLong6 = this.anInt119 * 8 / this.anInt131;
		}
		if (this.aBoolean9) {
			this.anInt119 *= -1;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!iv;Z)V")
	private void method93(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt122 = arg1.method2536();
		} else if (arg0 == 2) {
			arg1.method2490();
		} else if (arg0 == 3) {
			this.anInt128 = arg1.method2529();
			this.anInt125 = arg1.method2529();
			this.anInt132 = arg1.method2529();
		} else if (arg0 == 4) {
			this.anInt133 = arg1.method2490();
			this.anInt131 = arg1.method2529();
		} else if (arg0 == 6) {
			this.anInt121 = arg1.method2490();
		} else if (arg0 == 8) {
			this.anInt127 = 1;
		} else if (arg0 == 9) {
			this.anInt123 = 1;
		} else if (arg0 == 10) {
			this.aBoolean9 = true;
		}
	}
}
