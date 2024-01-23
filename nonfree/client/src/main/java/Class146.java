import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class146 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "I")
	public int anInt4703;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	public int anInt4704;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	private int anInt4706;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	public int anInt4708;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public int anInt4709;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	public int anInt4710;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "J")
	public long aLong162;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	public int anInt4718;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "I")
	public int anInt4719;

	@OriginalMember(owner = "client!re", name = "u", descriptor = "I")
	public int anInt4720;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	public int anInt4721;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Z")
	private boolean aBoolean294 = false;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	public int anInt4717 = 0;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "I")
	public int anInt4722 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!pi;I)V")
	private void method3668(@OriginalArg(1) Class4_Sub24 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4706 = arg0.method3085();
		} else if (arg1 == 2) {
			arg0.method3110();
		} else if (arg1 == 3) {
			this.anInt4708 = arg0.method3084();
			this.anInt4719 = arg0.method3084();
			this.anInt4720 = arg0.method3084();
		} else if (arg1 == 4) {
			this.anInt4721 = arg0.method3110();
			this.anInt4709 = arg0.method3084();
		} else if (arg1 == 6) {
			this.anInt4703 = arg0.method3110();
		} else if (arg1 == 8) {
			this.anInt4722 = 1;
		} else if (arg1 == 9) {
			this.anInt4717 = 1;
		} else if (arg1 == 10) {
			this.aBoolean294 = true;
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
	public void method3673() {
		this.anInt4710 = Class174.anIntArray443[this.anInt4706];
		this.anInt4718 = (int) Math.sqrt((double) (this.anInt4719 * this.anInt4719 + this.anInt4708 * this.anInt4708 + this.anInt4720 * this.anInt4720));
		if (this.anInt4709 == 0) {
			this.anInt4709 = 1;
		}
		if (this.anInt4721 == 0) {
			this.aLong162 = 2147483647L;
		} else if (this.anInt4721 == 1) {
			this.aLong162 = this.anInt4718 * 8 / this.anInt4709;
			this.aLong162 *= this.aLong162;
		} else if (this.anInt4721 == 2) {
			this.aLong162 = this.anInt4718 * 8 / this.anInt4709;
		}
		if (this.aBoolean294) {
			this.anInt4718 *= -1;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!pi;Z)V")
	public void method3674(@OriginalArg(0) Class4_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3110();
			if (local5 == 0) {
				return;
			}
			this.method3668(arg0, local5);
		}
	}
}
