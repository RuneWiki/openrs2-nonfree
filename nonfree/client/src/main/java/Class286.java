import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class286 {

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
	public int anInt8547;

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
	public int anInt8548;

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
	public int anInt8550;

	@OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
	public int anInt8551;

	@OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
	public int anInt8553;

	@OriginalMember(owner = "client!rba", name = "k", descriptor = "I")
	public int anInt8554;

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "I")
	private int anInt8555;

	@OriginalMember(owner = "client!rba", name = "m", descriptor = "J")
	public long aLong233;

	@OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
	public int anInt8557;

	@OriginalMember(owner = "client!rba", name = "v", descriptor = "I")
	public int anInt8561;

	@OriginalMember(owner = "client!rba", name = "w", descriptor = "I")
	public int anInt8562;

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "Z")
	private boolean aBoolean603 = false;

	@OriginalMember(owner = "client!rba", name = "s", descriptor = "I")
	public int anInt8559 = 0;

	@OriginalMember(owner = "client!rba", name = "r", descriptor = "I")
	public int anInt8558 = 0;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILclient!ek;Z)V")
	private void method6616(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt8555 = arg1.method7054();
		} else if (arg0 == 2) {
			arg1.method7004();
		} else if (arg0 == 3) {
			this.anInt8554 = arg1.method6990();
			this.anInt8550 = arg1.method6990();
			this.anInt8557 = arg1.method6990();
		} else if (arg0 == 4) {
			this.anInt8547 = arg1.method7004();
			this.anInt8551 = arg1.method6990();
		} else if (arg0 == 6) {
			this.anInt8561 = arg1.method7004();
		} else if (arg0 == 8) {
			this.anInt8559 = 1;
		} else if (arg0 == 9) {
			this.anInt8558 = 1;
		} else if (arg0 == 10) {
			this.aBoolean603 = true;
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!ek;I)V")
	public void method6620(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7004();
			if (local5 == 0) {
				return;
			}
			this.method6616(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)V")
	public void method6621() {
		this.anInt8562 = Class262.anIntArray421[this.anInt8555 << 3];
		@Pc(17) long local17 = (long) this.anInt8554;
		@Pc(21) long local21 = (long) this.anInt8550;
		@Pc(25) long local25 = (long) this.anInt8557;
		this.anInt8548 = (int) Math.sqrt((double) (local25 * local25 + local21 * local21 + local17 * local17));
		if (this.anInt8551 == 0) {
			this.anInt8551 = 1;
		}
		if (this.anInt8547 == 0) {
			this.aLong233 = 2147483647L;
		} else if (this.anInt8547 == 1) {
			this.aLong233 = this.anInt8548 * 8 / this.anInt8551;
			this.aLong233 *= this.aLong233;
		} else if (this.anInt8547 == 2) {
			this.aLong233 = this.anInt8548 * 8 / this.anInt8551;
		}
		if (this.aBoolean603) {
			this.anInt8548 *= -1;
		}
	}
}
