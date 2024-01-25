import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class31 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public int anInt662;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "I")
	private int anInt663;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public int anInt664;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public int anInt665;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	public int anInt666;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "J")
	public long aLong17;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "I")
	public int anInt677;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "I")
	public int anInt678;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "I")
	public int anInt679;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "I")
	public int anInt667 = 0;

	@OriginalMember(owner = "client!c", name = "m", descriptor = "I")
	public int anInt673 = 0;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public void method542() {
		this.anInt665 = Class106.anIntArray242[this.anInt663 << 3];
		this.anInt664 = (int) Math.sqrt((double) (this.anInt678 * this.anInt678 + this.anInt679 * this.anInt679 + this.anInt680 * this.anInt680));
		if (this.anInt666 == 0) {
			this.anInt666 = 1;
		}
		if (this.anInt677 == 0) {
			this.aLong17 = 2147483647L;
		} else if (this.anInt677 == 1) {
			this.aLong17 = this.anInt664 * 8 / this.anInt666;
			this.aLong17 *= this.aLong17;
		} else if (this.anInt677 == 2) {
			this.aLong17 = this.anInt664 * 8 / this.anInt666;
		}
		if (this.aBoolean49) {
			this.anInt664 *= -1;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!vt;)V")
	public void method546(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5732();
			if (local17 == 0) {
				return;
			}
			this.method547(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!vt;II)V")
	private void method547(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt663 = arg0.method5753();
		} else if (arg1 == 2) {
			arg0.method5732();
		} else if (arg1 == 3) {
			this.anInt680 = arg0.method5776();
			this.anInt679 = arg0.method5776();
			this.anInt678 = arg0.method5776();
		} else if (arg1 == 4) {
			this.anInt677 = arg0.method5732();
			this.anInt666 = arg0.method5776();
		} else if (arg1 == 6) {
			this.anInt662 = arg0.method5732();
		} else if (arg1 == 8) {
			this.anInt667 = 1;
		} else if (arg1 == 9) {
			this.anInt673 = 1;
		} else if (arg1 == 10) {
			this.aBoolean49 = true;
		}
	}
}
