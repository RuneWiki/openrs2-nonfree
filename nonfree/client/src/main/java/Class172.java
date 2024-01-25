import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class172 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "I")
	public int anInt5053;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "J")
	public long aLong135;

	@OriginalMember(owner = "client!is", name = "j", descriptor = "I")
	public int anInt5058;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "I")
	private int anInt5060;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "I")
	public int anInt5063;

	@OriginalMember(owner = "client!is", name = "p", descriptor = "I")
	public int anInt5064;

	@OriginalMember(owner = "client!is", name = "q", descriptor = "I")
	public int anInt5065;

	@OriginalMember(owner = "client!is", name = "s", descriptor = "I")
	public int anInt5067;

	@OriginalMember(owner = "client!is", name = "t", descriptor = "I")
	public int anInt5068;

	@OriginalMember(owner = "client!is", name = "u", descriptor = "I")
	public int anInt5069;

	@OriginalMember(owner = "client!is", name = "v", descriptor = "I")
	public int anInt5070;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public int anInt5056 = 0;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "Z")
	private boolean aBoolean380 = false;

	@OriginalMember(owner = "client!is", name = "x", descriptor = "I")
	public int anInt5071 = 0;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public void method4568() {
		this.anInt5069 = Class12_Sub2.anIntArray203[this.anInt5060 << 3];
		@Pc(25) long local25 = (long) this.anInt5067;
		@Pc(29) long local29 = (long) this.anInt5068;
		@Pc(33) long local33 = (long) this.anInt5058;
		this.anInt5053 = (int) Math.sqrt((double) (local33 * local33 + local25 * local25 + local29 * local29));
		if (this.anInt5070 == 0) {
			this.anInt5070 = 1;
		}
		if (this.anInt5064 == 0) {
			this.aLong135 = 2147483647L;
		} else if (this.anInt5064 == 1) {
			this.aLong135 = (long) (this.anInt5053 * 8 / this.anInt5070);
			this.aLong135 *= this.aLong135;
		} else if (this.anInt5064 == 2) {
			this.aLong135 = (long) (this.anInt5053 * 8 / this.anInt5070);
		}
		if (this.aBoolean380) {
			this.anInt5053 *= -1;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZILclient!ol;)V")
	private void method4574(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt5060 = arg1.method5211();
		} else if (arg0 == 2) {
			arg1.method5203();
		} else if (arg0 == 3) {
			this.anInt5067 = arg1.method5172();
			this.anInt5068 = arg1.method5172();
			this.anInt5058 = arg1.method5172();
		} else if (arg0 == 4) {
			this.anInt5064 = arg1.method5203();
			this.anInt5070 = arg1.method5172();
		} else if (arg0 == 6) {
			this.anInt5065 = arg1.method5203();
		} else if (arg0 == 8) {
			this.anInt5071 = 1;
		} else if (arg0 == 9) {
			this.anInt5056 = 1;
		} else if (arg0 == 10) {
			this.aBoolean380 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!ol;)V")
	public void method4576(@OriginalArg(1) Class2_Sub8 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5203();
			if (local15 == 0) {
				return;
			}
			this.method4574(local15, arg0);
		}
	}
}
