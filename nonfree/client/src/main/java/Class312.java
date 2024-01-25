import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class312 {

	@OriginalMember(owner = "client!rha", name = "u", descriptor = "I")
	public int anInt9072;

	@OriginalMember(owner = "client!rha", name = "o", descriptor = "J")
	public long aLong242;

	@OriginalMember(owner = "client!rha", name = "l", descriptor = "I")
	public int anInt9073;

	@OriginalMember(owner = "client!rha", name = "e", descriptor = "I")
	public int anInt9074;

	@OriginalMember(owner = "client!rha", name = "h", descriptor = "I")
	public int anInt9077;

	@OriginalMember(owner = "client!rha", name = "n", descriptor = "I")
	public int anInt9078;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "I")
	private int anInt9079;

	@OriginalMember(owner = "client!rha", name = "s", descriptor = "I")
	public int anInt9082;

	@OriginalMember(owner = "client!rha", name = "t", descriptor = "I")
	public int anInt9085;

	@OriginalMember(owner = "client!rha", name = "d", descriptor = "I")
	public int anInt9088;

	@OriginalMember(owner = "client!rha", name = "p", descriptor = "I")
	public int anInt9089;

	@OriginalMember(owner = "client!rha", name = "m", descriptor = "I")
	public int anInt9075 = 0;

	@OriginalMember(owner = "client!rha", name = "x", descriptor = "I")
	public int anInt9090 = 0;

	@OriginalMember(owner = "client!rha", name = "r", descriptor = "Z")
	private boolean aBoolean631 = false;

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)V")
	public void method7835() {
		this.anInt9089 = Class141.anIntArray208[this.anInt9079 << 3];
		@Pc(17) long local17 = (long) this.anInt9078;
		@Pc(29) long local29 = (long) this.anInt9077;
		@Pc(33) long local33 = (long) this.anInt9073;
		this.anInt9088 = (int) Math.sqrt((double) (local33 * local33 + local29 * local29 + local17 * local17));
		if (this.anInt9085 == 0) {
			this.anInt9085 = 1;
		}
		if (this.anInt9082 == 0) {
			this.aLong242 = 2147483647L;
		} else if (this.anInt9082 == 1) {
			this.aLong242 = (long) (this.anInt9088 * 8 / this.anInt9085);
			this.aLong242 *= this.aLong242;
		} else if (this.anInt9082 == 2) {
			this.aLong242 = (long) (this.anInt9088 * 8 / this.anInt9085);
		}
		if (this.aBoolean631) {
			this.anInt9088 *= -1;
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!jc;B)V")
	public void method7836(@OriginalArg(0) Class14_Sub21 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7695(113);
			if (local7 == 0) {
				return;
			}
			this.method7840(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method7840(@OriginalArg(1) Class14_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9079 = arg0.method7717(-1978450544);
		} else if (arg1 == 2) {
			arg0.method7695(100);
		} else if (arg1 == 3) {
			this.anInt9078 = arg0.method7748();
			this.anInt9077 = arg0.method7748();
			this.anInt9073 = arg0.method7748();
		} else if (arg1 == 4) {
			this.anInt9082 = arg0.method7695(94);
			this.anInt9085 = arg0.method7748();
		} else if (arg1 == 6) {
			this.anInt9074 = arg0.method7695(100);
		} else if (arg1 == 8) {
			this.anInt9075 = 1;
		} else if (arg1 == 9) {
			this.anInt9090 = 1;
		} else if (arg1 == 10) {
			this.aBoolean631 = true;
			return;
		}
	}
}
