import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class209 {

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public int anInt6611;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public int anInt6612;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public int anInt6613;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	public int anInt6614;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "I")
	public int anInt6618;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	public int anInt6619;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "J")
	public long aLong229;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	private int anInt6623;

	@OriginalMember(owner = "client!w", name = "s", descriptor = "I")
	public int anInt6625;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	public int anInt6627;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	public int anInt6628;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Z")
	private boolean aBoolean573 = false;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	public int anInt6624 = 0;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	public int anInt6626 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BILclient!rg;)V")
	private void method5888(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt6623 = arg1.method5106();
		} else if (arg0 == 2) {
			arg1.method5115();
		} else if (arg0 == 3) {
			this.anInt6627 = arg1.method5067();
			this.anInt6613 = arg1.method5067();
			this.anInt6628 = arg1.method5067();
		} else if (arg0 == 4) {
			this.anInt6619 = arg1.method5115();
			this.anInt6618 = arg1.method5067();
		} else if (arg0 == 6) {
			this.anInt6614 = arg1.method5115();
		} else if (arg0 == 8) {
			this.anInt6624 = 1;
		} else if (arg0 == 9) {
			this.anInt6626 = 1;
		} else if (arg0 == 10) {
			this.aBoolean573 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method5889(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5115();
			if (local3 == 0) {
				return;
			}
			this.method5888(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public void method5891() {
		this.anInt6612 = Class187.anIntArray570[this.anInt6623 << 3];
		this.anInt6625 = (int) Math.sqrt((double) (this.anInt6628 * this.anInt6628 + this.anInt6613 * this.anInt6613 + this.anInt6627 * this.anInt6627));
		if (this.anInt6618 == 0) {
			this.anInt6618 = 1;
		}
		if (this.anInt6619 == 0) {
			this.aLong229 = 2147483647L;
		} else if (this.anInt6619 == 1) {
			this.aLong229 = this.anInt6625 * 8 / this.anInt6618;
			this.aLong229 *= this.aLong229;
		} else if (this.anInt6619 == 2) {
			this.aLong229 = this.anInt6625 * 8 / this.anInt6618;
		}
		if (this.aBoolean573) {
			this.anInt6625 *= -1;
		}
	}
}
