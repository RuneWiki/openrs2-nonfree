import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class4_Sub4_Sub9 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "I")
	public int anInt1799;

	@OriginalMember(owner = "client!ma", name = "O", descriptor = "I")
	public int anInt1801;

	@OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
	public int anInt1803;

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
	public int anInt1805;

	@OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
	private int anInt1806 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!re;Z)V")
	private void method1353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub13 arg2) {
		if (arg1 == 1) {
			this.anInt1806 = arg2.method1241();
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public void method1354() {
		this.method1356(this.anInt1806);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BILclient!re;)V")
	public void method1355(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method1223();
			if (local9 == 0) {
				return;
			}
			this.method1353(arg0, local9, arg1);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)V")
	private void method1356(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(31) double local31 = local23;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		if (local23 > local14) {
			local31 = local14;
		}
		@Pc(46) double local46 = 0.0D;
		if (local31 > local38) {
			local31 = local38;
		}
		@Pc(54) double local54 = local23;
		@Pc(56) double local56 = 0.0D;
		if (local23 < local14) {
			local54 = local14;
		}
		if (local38 > local54) {
			local54 = local38;
		}
		@Pc(74) double local74 = (local54 + local31) / 2.0D;
		this.anInt1803 = (int) (local74 * 256.0D);
		if (local31 != local54) {
			if (local54 == local23) {
				local46 = (local14 - local38) / (local54 - local31);
			} else if (local54 == local14) {
				local46 = (local38 - local23) / (local54 - local31) + 2.0D;
			} else if (local38 == local54) {
				local46 = (local23 - local14) / (local54 - local31) + 4.0D;
			}
			if (local74 < 0.5D) {
				local56 = (local54 - local31) / (local54 + local31);
			}
			if (local74 >= 0.5D) {
				local56 = (local54 - local31) / (2.0D - local54 - local31);
			}
		}
		this.anInt1799 = (int) (local56 * 256.0D);
		if (this.anInt1803 < 0) {
			this.anInt1803 = 0;
		} else if (this.anInt1803 > 255) {
			this.anInt1803 = 255;
		}
		local46 /= 6.0D;
		if (local74 > 0.5D) {
			this.anInt1805 = (int) (local56 * (1.0D - local74) * 512.0D);
		} else {
			this.anInt1805 = (int) (local74 * 512.0D * local56);
		}
		if (this.anInt1805 < 1) {
			this.anInt1805 = 1;
		}
		this.anInt1801 = (int) ((double) this.anInt1805 * local46);
		if (this.anInt1799 < 0) {
			this.anInt1799 = 0;
		} else if (this.anInt1799 > 255) {
			this.anInt1799 = 255;
		}
	}
}
