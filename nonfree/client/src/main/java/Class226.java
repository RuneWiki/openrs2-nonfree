import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class226 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
	public int anInt6656;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
	private int anInt6659;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	public int anInt6660;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	public int anInt6661;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
	public int anInt6662;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "J")
	public long aLong182;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
	public int anInt6664;

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
	public int anInt6667;

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
	public int anInt6668;

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
	public int anInt6670;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
	public int anInt6671;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	public int anInt6663 = 0;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Z")
	private boolean aBoolean494 = false;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
	public int anInt6666 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!os;I)V")
	public void method5977(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4487();
			if (local5 == 0) {
				return;
			}
			this.method5978(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!os;I)V")
	private void method5978(@OriginalArg(1) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6659 = arg0.method4494();
		} else if (arg1 == 2) {
			arg0.method4487();
		} else if (arg1 == 3) {
			this.anInt6671 = arg0.method4481();
			this.anInt6660 = arg0.method4481();
			this.anInt6668 = arg0.method4481();
		} else if (arg1 == 4) {
			this.anInt6661 = arg0.method4487();
			this.anInt6664 = arg0.method4481();
		} else if (arg1 == 6) {
			this.anInt6662 = arg0.method4487();
		} else if (arg1 == 8) {
			this.anInt6666 = 1;
		} else if (arg1 == 9) {
			this.anInt6663 = 1;
		} else if (arg1 == 10) {
			this.aBoolean494 = true;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public void method5981() {
		this.anInt6667 = Class200_Sub1.anIntArray576[this.anInt6659 << 3];
		this.anInt6656 = (int) Math.sqrt((double) (this.anInt6668 * this.anInt6668 + this.anInt6671 * this.anInt6671 + this.anInt6660 * this.anInt6660));
		if (this.anInt6664 == 0) {
			this.anInt6664 = 1;
		}
		if (this.anInt6661 == 0) {
			this.aLong182 = 2147483647L;
		} else if (this.anInt6661 == 1) {
			this.aLong182 = this.anInt6656 * 8 / this.anInt6664;
			this.aLong182 *= this.aLong182;
		} else if (this.anInt6661 == 2) {
			this.aLong182 = this.anInt6656 * 8 / this.anInt6664;
		}
		if (this.aBoolean494) {
			this.anInt6656 *= -1;
		}
	}
}
