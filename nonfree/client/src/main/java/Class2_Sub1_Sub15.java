import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
	public int anInt2467;

	@OriginalMember(owner = "client!sb", name = "vb", descriptor = "I")
	public int anInt2480;

	@OriginalMember(owner = "client!sb", name = "xb", descriptor = "I")
	public int anInt2482;

	@OriginalMember(owner = "client!sb", name = "yb", descriptor = "I")
	public int anInt2483;

	@OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
	private int anInt2477 = 0;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
	private void method1755(@OriginalArg(1) int arg0) {
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local19;
		@Pc(39) double local39 = local19;
		if (local19 > local28) {
			local37 = local28;
		}
		if (local35 < local37) {
			local37 = local35;
		}
		if (local19 < local28) {
			local39 = local28;
		}
		@Pc(59) double local59 = 0.0D;
		if (local35 > local39) {
			local39 = local35;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local37 + local39) / 2.0D;
		this.anInt2482 = (int) (local73 * 256.0D);
		if (this.anInt2482 < 0) {
			this.anInt2482 = 0;
		} else if (this.anInt2482 > 255) {
			this.anInt2482 = 255;
		}
		if (local39 != local37) {
			if (local19 == local39) {
				local59 = (local28 - local35) / (local39 - local37);
			} else if (local28 == local39) {
				local59 = (local35 - local19) / (-local37 + local39) + 2.0D;
			} else if (local39 == local35) {
				local59 = (local19 - local28) / (-local37 + local39) + 4.0D;
			}
			if (local73 < 0.5D) {
				local67 = (local39 - local37) / (local37 + local39);
			}
			if (local73 >= 0.5D) {
				local67 = (local39 - local37) / (2.0D - local39 - local37);
			}
		}
		this.anInt2467 = (int) (local67 * 256.0D);
		if (this.anInt2467 < 0) {
			this.anInt2467 = 0;
		} else if (this.anInt2467 > 255) {
			this.anInt2467 = 255;
		}
		if (local73 > 0.5D) {
			this.anInt2483 = (int) (local67 * 512.0D * (1.0D - local73));
		} else {
			this.anInt2483 = (int) (local67 * 512.0D * local73);
		}
		if (this.anInt2483 < 1) {
			this.anInt2483 = 1;
		}
		local59 /= 6.0D;
		this.anInt2480 = (int) (local59 * (double) this.anInt2483);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!wd;IBI)V")
	private void method1760(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt2477 = arg0.method1408();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!wd;BI)V")
	public void method1761(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1399();
			if (local5 == 0) {
				return;
			}
			this.method1760(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
	public void method1764() {
		this.method1755(this.anInt2477);
	}
}
