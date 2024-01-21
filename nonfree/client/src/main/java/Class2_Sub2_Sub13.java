import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ne", name = "hb", descriptor = "I")
	public int anInt1755;

	@OriginalMember(owner = "client!ne", name = "sb", descriptor = "I")
	public int anInt1763;

	@OriginalMember(owner = "client!ne", name = "vb", descriptor = "I")
	public int anInt1764;

	@OriginalMember(owner = "client!ne", name = "zb", descriptor = "I")
	public int anInt1768;

	@OriginalMember(owner = "client!ne", name = "Bb", descriptor = "I")
	public int anInt1770;

	@OriginalMember(owner = "client!ne", name = "Fb", descriptor = "I")
	public int anInt1774;

	@OriginalMember(owner = "client!ne", name = "lb", descriptor = "Z")
	public boolean aBoolean70 = true;

	@OriginalMember(owner = "client!ne", name = "kb", descriptor = "I")
	public int anInt1757 = -1;

	@OriginalMember(owner = "client!ne", name = "qb", descriptor = "I")
	public int anInt1762 = 0;

	@OriginalMember(owner = "client!ne", name = "wb", descriptor = "I")
	public int anInt1765 = -1;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIILclient!ic;)V")
	private void method1242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub10 arg2) {
		if (arg1 == 1) {
			this.anInt1762 = arg2.method1489();
		} else if (arg1 == 2) {
			this.anInt1757 = arg2.method1514();
		} else if (arg1 == 5) {
			this.aBoolean70 = false;
			return;
		} else if (arg1 == 7) {
			this.anInt1765 = arg2.method1489();
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!ic;I)V")
	public void method1245(@OriginalArg(1) Class2_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1514();
			if (local5 == 0) {
				return;
			}
			this.method1242(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
	public void method1246() {
		if (this.anInt1765 != -1) {
			this.method1249(this.anInt1765);
			this.anInt1764 = this.anInt1763;
			this.anInt1755 = this.anInt1770;
			this.anInt1774 = this.anInt1768;
		}
		this.method1249(this.anInt1762);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
	private void method1249(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local14 < local23) {
			local34 = local23;
		}
		if (local34 < local30) {
			local34 = local30;
		}
		@Pc(48) double local48 = 0.0D;
		@Pc(51) double local51 = (double) 0;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(69) double local69 = (local32 + local34) / 2.0D;
		this.anInt1768 = (int) (local69 * 256.0D);
		if (local34 != local32) {
			if (local69 < 0.5D) {
				local48 = (local34 - local32) / (local32 + local34);
			}
			if (local69 >= 0.5D) {
				local48 = (local34 - local32) / ((2.0D - local34) - local32);
			}
			if (local14 == local34) {
				local51 = (local23 - local30) / (local34 - local32);
			} else if (local34 == local23) {
				local51 = (local30 - local14) / (local34 - local32) + 2.0D;
			} else if (local30 == local34) {
				local51 = (local14 - local23) / (-local32 + local34) + 4.0D;
			}
		}
		local51 /= 6.0D;
		this.anInt1763 = (int) (local48 * 256.0D);
		this.anInt1770 = (int) (local51 * 256.0D);
		if (this.anInt1768 < 0) {
			this.anInt1768 = 0;
		} else if (this.anInt1768 > 255) {
			this.anInt1768 = 255;
		}
		if (this.anInt1763 < 0) {
			this.anInt1763 = 0;
		} else if (this.anInt1763 > 255) {
			this.anInt1763 = 255;
		}
	}
}
