import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class19 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public int anInt721;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	public int anInt722;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
	public int anInt723;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	private int anInt725;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
	public int anInt727;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public int anInt729;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
	public int anInt730;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "J")
	public long aLong49;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	public int anInt732;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	public int anInt733;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	public int anInt735;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
	public int anInt724 = 0;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	public int anInt734 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILclient!ge;)V")
	private void method747(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt725 = arg1.method3967();
		} else if (arg0 == 2) {
			arg1.method3922();
		} else if (arg0 == 3) {
			this.anInt735 = arg1.method3925();
			this.anInt729 = arg1.method3925();
			this.anInt723 = arg1.method3925();
		} else if (arg0 == 4) {
			this.anInt730 = arg1.method3922();
			this.anInt721 = arg1.method3925();
		} else if (arg0 == 6) {
			this.anInt733 = arg1.method3922();
		} else if (arg0 == 8) {
			this.anInt734 = 1;
		} else if (arg0 == 9) {
			this.anInt724 = 1;
		} else if (arg0 == 10) {
			this.aBoolean29 = true;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!ge;)V")
	public void method749(@OriginalArg(1) Class1_Sub6 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3922();
			if (local7 == 0) {
				return;
			}
			this.method747(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	public void method750() {
		this.anInt722 = Class310.anIntArray826[this.anInt725 << 3];
		this.anInt727 = (int) Math.sqrt((double) (this.anInt729 * this.anInt729 + this.anInt735 * this.anInt735 + this.anInt723 * this.anInt723));
		if (this.anInt721 == 0) {
			this.anInt721 = 1;
		}
		if (this.anInt730 == 0) {
			this.aLong49 = 2147483647L;
		} else if (this.anInt730 == 1) {
			this.aLong49 = this.anInt727 * 8 / this.anInt721;
			this.aLong49 *= this.aLong49;
		} else if (this.anInt730 == 2) {
			this.aLong49 = this.anInt727 * 8 / this.anInt721;
		}
		if (this.aBoolean29) {
			this.anInt727 *= -1;
		}
	}
}
