import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
	public int anInt2615;

	@OriginalMember(owner = "client!uc", name = "kb", descriptor = "I")
	public int anInt2619;

	@OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
	public int anInt2621;

	@OriginalMember(owner = "client!uc", name = "rb", descriptor = "I")
	public int anInt2624;

	@OriginalMember(owner = "client!uc", name = "pb", descriptor = "I")
	private int anInt2622 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!rc;II)V")
	public void method1705(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(11) int local11 = arg0.method716();
			if (local11 == 0) {
				return;
			}
			this.method1711(local11, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	public void method1706() {
		this.method1709(this.anInt2622);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
	private void method1709(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(31) double local31 = local12;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local12;
		@Pc(42) double local42 = 0.0D;
		if (local21 < local12) {
			local31 = local21;
		}
		if (local31 > local38) {
			local31 = local38;
		}
		if (local12 < local21) {
			local40 = local21;
		}
		@Pc(62) double local62 = 0.0D;
		if (local40 < local38) {
			local40 = local38;
		}
		@Pc(74) double local74 = (local40 + local31) / 2.0D;
		this.anInt2624 = (int) (local74 * 256.0D);
		if (local31 != local40) {
			if (local74 < 0.5D) {
				local62 = (local40 - local31) / (local31 + local40);
			}
			if (local12 == local40) {
				local42 = (local21 - local38) / (-local31 + local40);
			} else if (local21 == local40) {
				local42 = (local38 - local12) / (-local31 + local40) + 2.0D;
			} else if (local38 == local40) {
				local42 = (local12 - local21) / (local40 - local31) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local62 = (local40 - local31) / (2.0D - local31 - local40);
			}
		}
		if (local74 > 0.5D) {
			this.anInt2619 = (int) (local62 * (1.0D - local74) * 512.0D);
		} else {
			this.anInt2619 = (int) (local74 * local62 * 512.0D);
		}
		local42 /= 6.0D;
		this.anInt2615 = (int) (local62 * 256.0D);
		if (this.anInt2619 < 1) {
			this.anInt2619 = 1;
		}
		if (this.anInt2624 < 0) {
			this.anInt2624 = 0;
		} else if (this.anInt2624 > 255) {
			this.anInt2624 = 255;
		}
		if (this.anInt2615 < 0) {
			this.anInt2615 = 0;
		} else if (this.anInt2615 > 255) {
			this.anInt2615 = 255;
		}
		this.anInt2621 = (int) (local42 * (double) this.anInt2619);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILclient!rc;)V")
	private void method1711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub5 arg2) {
		if (arg0 == 1) {
			this.anInt2622 = arg2.method688();
		}
	}
}
