import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class312 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public int anInt8514;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	public int anInt8518;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private int anInt8519;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public int anInt8520;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public int anInt8522;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	public int anInt8523;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
	public int anInt8524;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	public int anInt8526;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
	public int anInt8529;

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
	public int anInt8530;

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "J")
	public long aLong230;

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public int anInt8517 = 0;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public int anInt8516 = 0;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Z")
	private boolean aBoolean647 = false;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBLclient!vj;)V")
	private void method7172(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt8519 = arg1.method8546();
		} else if (arg0 == 2) {
			arg1.method8547();
		} else if (arg0 == 3) {
			this.anInt8514 = arg1.method8542();
			this.anInt8530 = arg1.method8542();
			this.anInt8518 = arg1.method8542();
		} else if (arg0 == 4) {
			this.anInt8529 = arg1.method8547();
			this.anInt8523 = arg1.method8542();
		} else if (arg0 == 6) {
			this.anInt8526 = arg1.method8547();
		} else if (arg0 == 8) {
			this.anInt8517 = 1;
		} else if (arg0 == 9) {
			this.anInt8516 = 1;
		} else if (arg0 == 10) {
			this.aBoolean647 = true;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!vj;I)V")
	public void method7173(@OriginalArg(0) Class2_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8547();
			if (local5 == 0) {
				return;
			}
			this.method7172(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public void method7176() {
		this.anInt8520 = Canvas_Sub1.anIntArray498[this.anInt8519 << 3];
		@Pc(17) long local17 = (long) this.anInt8514;
		@Pc(21) long local21 = (long) this.anInt8530;
		@Pc(25) long local25 = (long) this.anInt8518;
		this.anInt8522 = (int) Math.sqrt((double) (local25 * local25 + local17 * local17 + local21 * local21));
		if (this.anInt8523 == 0) {
			this.anInt8523 = 1;
		}
		if (this.anInt8529 == 0) {
			this.aLong230 = 2147483647L;
		} else if (this.anInt8529 == 1) {
			this.aLong230 = this.anInt8522 * 8 / this.anInt8523;
			this.aLong230 *= this.aLong230;
		} else if (this.anInt8529 == 2) {
			this.aLong230 = this.anInt8522 * 8 / this.anInt8523;
		}
		if (this.aBoolean647) {
			this.anInt8522 *= -1;
		}
	}
}
