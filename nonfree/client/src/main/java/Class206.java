import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class206 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
	public int anInt5470;

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
	public int anInt5473;

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
	public int anInt5474;

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
	public int anInt5476;

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
	public int anInt5479;

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
	public int anInt5480;

	@OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
	public int anInt5481;

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
	public int anInt5483;

	@OriginalMember(owner = "client!kt", name = "q", descriptor = "J")
	public long aLong139;

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
	public int anInt5484;

	@OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
	private int anInt5485;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
	public int anInt5472 = 0;

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
	public int anInt5477 = 0;

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "Z")
	private boolean aBoolean403 = false;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!sl;)V")
	public void method4782(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2859();
			if (local9 == 0) {
				return;
			}
			this.method4786(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
	public void method4783() {
		this.anInt5484 = Class290.anIntArray547[this.anInt5485 << 3];
		@Pc(17) long local17 = (long) this.anInt5476;
		@Pc(21) long local21 = (long) this.anInt5470;
		@Pc(25) long local25 = (long) this.anInt5474;
		this.anInt5473 = (int) Math.sqrt((double) (local25 * local25 + local21 * local21 + local17 * local17));
		if (this.anInt5483 == 0) {
			this.anInt5483 = 1;
		}
		if (this.anInt5479 == 0) {
			this.aLong139 = 2147483647L;
		} else if (this.anInt5479 == 1) {
			this.aLong139 = (long) (this.anInt5473 * 8 / this.anInt5483);
			this.aLong139 *= this.aLong139;
		} else if (this.anInt5479 == 2) {
			this.aLong139 = (long) (this.anInt5473 * 8 / this.anInt5483);
		}
		if (this.aBoolean403) {
			this.anInt5473 *= -1;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILclient!sl;)V")
	private void method4786(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt5485 = arg1.method2825();
		} else if (arg0 == 2) {
			arg1.method2859();
		} else if (arg0 == 3) {
			this.anInt5476 = arg1.method2881();
			this.anInt5470 = arg1.method2881();
			this.anInt5474 = arg1.method2881();
		} else if (arg0 == 4) {
			this.anInt5479 = arg1.method2859();
			this.anInt5483 = arg1.method2881();
		} else if (arg0 == 6) {
			this.anInt5480 = arg1.method2859();
		} else if (arg0 == 8) {
			this.anInt5472 = 1;
		} else if (arg0 == 9) {
			this.anInt5477 = 1;
		} else if (arg0 == 10) {
			this.aBoolean403 = true;
		}
	}
}
