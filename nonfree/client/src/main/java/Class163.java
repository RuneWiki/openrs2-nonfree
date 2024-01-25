import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class163 {

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	public int anInt4844;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "J")
	public long aLong168;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
	public int anInt4845;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	public int anInt4846;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
	private int anInt4849;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
	public int anInt4850;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public int anInt4851;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
	public int anInt4852;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
	public int anInt4857;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
	public int anInt4858;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
	public int anInt4859;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Z")
	private boolean aBoolean373 = false;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
	public int anInt4853 = 0;

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
	public int anInt4860 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public void method4374() {
		this.anInt4850 = Class5_Sub9_Sub12.anIntArray170[this.anInt4849 << 3];
		this.anInt4844 = (int) Math.sqrt((double) (this.anInt4857 * this.anInt4857 + this.anInt4852 * this.anInt4852 + this.anInt4859 * this.anInt4859));
		if (this.anInt4851 == 0) {
			this.anInt4851 = 1;
		}
		if (this.anInt4858 == 0) {
			this.aLong168 = 2147483647L;
		} else if (this.anInt4858 == 1) {
			this.aLong168 = this.anInt4844 * 8 / this.anInt4851;
			this.aLong168 *= this.aLong168;
		} else if (this.anInt4858 == 2) {
			this.aLong168 = this.anInt4844 * 8 / this.anInt4851;
		}
		if (this.aBoolean373) {
			this.anInt4844 *= -1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!bk;I)V")
	public void method4377(@OriginalArg(0) Class5_Sub1 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1832();
			if (local13 == 0) {
				return;
			}
			this.method4378(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!bk;I)V")
	private void method4378(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4849 = arg0.method1845();
		} else if (arg1 == 2) {
			arg0.method1832();
		} else if (arg1 == 3) {
			this.anInt4859 = arg0.method1826();
			this.anInt4852 = arg0.method1826();
			this.anInt4857 = arg0.method1826();
		} else if (arg1 == 4) {
			this.anInt4858 = arg0.method1832();
			this.anInt4851 = arg0.method1826();
		} else if (arg1 == 6) {
			this.anInt4845 = arg0.method1832();
		} else if (arg1 == 8) {
			this.anInt4853 = 1;
		} else if (arg1 == 9) {
			this.anInt4860 = 1;
		} else if (arg1 == 10) {
			this.aBoolean373 = true;
		}
	}
}
