import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class6_Sub2_Sub11 extends Class6_Sub2 {

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
	public int anInt2592;

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
	public int anInt2594;

	@OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
	public int anInt2596;

	@OriginalMember(owner = "client!sd", name = "lb", descriptor = "I")
	public int anInt2601;

	@OriginalMember(owner = "client!sd", name = "pb", descriptor = "I")
	public int anInt2604;

	@OriginalMember(owner = "client!sd", name = "rb", descriptor = "I")
	public int anInt2606;

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
	public int anInt2595 = -1;

	@OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
	public int anInt2593 = 0;

	@OriginalMember(owner = "client!sd", name = "kb", descriptor = "Z")
	public boolean aBoolean122 = true;

	@OriginalMember(owner = "client!sd", name = "ob", descriptor = "I")
	public int anInt2603 = -1;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!b;I)V")
	private void method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub1 arg2) {
		if (arg1 == 1) {
			this.anInt2593 = arg2.method1483();
		} else if (arg1 == 2) {
			this.anInt2603 = arg2.method1495();
		} else if (arg1 == 5) {
			this.aBoolean122 = false;
		} else if (arg1 == 7) {
			this.anInt2595 = arg2.method1483();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)V")
	private void method1769(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local19;
		@Pc(27) double local27 = local19;
		if (local19 < local10) {
			local27 = local10;
		}
		@Pc(40) double local40 = (double) (arg0 & 0xFF) / 256.0D;
		if (local27 < local40) {
			local27 = local40;
		}
		@Pc(48) double local48 = 0.0D;
		@Pc(50) double local50 = 0.0D;
		if (local10 < local19) {
			local25 = local10;
		}
		if (local25 > local40) {
			local25 = local40;
		}
		@Pc(76) double local76 = (local27 + local25) / 2.0D;
		if (local27 != local25) {
			if (local76 < 0.5D) {
				local48 = (local27 - local25) / (local25 + local27);
			}
			if (local19 == local27) {
				local50 = (local10 - local40) / (local27 - local25);
			} else if (local10 == local27) {
				local50 = (local40 - local19) / (-local25 + local27) + 2.0D;
			} else if (local27 == local40) {
				local50 = (local19 - local10) / (local27 - local25) + 4.0D;
			}
			if (local76 >= 0.5D) {
				local48 = (local27 - local25) / (2.0D - local27 - local25);
			}
		}
		this.anInt2596 = (int) (local48 * 256.0D);
		local50 /= 6.0D;
		this.anInt2594 = (int) (local76 * 256.0D);
		if (this.anInt2594 < 0) {
			this.anInt2594 = 0;
		} else if (this.anInt2594 > 255) {
			this.anInt2594 = 255;
		}
		if (this.anInt2596 < 0) {
			this.anInt2596 = 0;
		} else if (this.anInt2596 > 255) {
			this.anInt2596 = 255;
		}
		this.anInt2606 = (int) (local50 * 256.0D);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
	public void method1771() {
		if (this.anInt2595 != -1) {
			this.method1769(this.anInt2595);
			this.anInt2592 = this.anInt2596;
			this.anInt2601 = this.anInt2606;
			this.anInt2604 = this.anInt2594;
		}
		this.method1769(this.anInt2593);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!b;B)V")
	public void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method1495();
			if (local9 == 0) {
				return;
			}
			this.method1768(arg0, local9, arg1);
		}
	}
}
