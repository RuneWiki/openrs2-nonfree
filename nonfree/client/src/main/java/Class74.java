import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class74 {

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public int anInt2477;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
	public int anInt2479;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
	public int anInt2483;

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
	public int anInt2484;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Z")
	public boolean aBoolean157 = true;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
	public int anInt2482 = -1;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	private int anInt2476 = 0;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
	public int anInt2481 = 128;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!lf;II)V")
	private void method2108(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2476 = arg0.method1352();
			this.method2109(this.anInt2476);
		} else if (arg2 == 2) {
			this.anInt2482 = arg0.method1386();
			if (this.anInt2482 == 65535) {
				this.anInt2482 = -1;
			}
		} else if (arg2 == 3) {
			this.anInt2481 = arg0.method1386();
		} else if (arg2 == 4) {
			this.aBoolean157 = false;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	private void method2109(@OriginalArg(1) int arg0) {
		@Pc(19) double local19 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local19;
		if (local28 < local19) {
			local37 = local28;
		}
		if (local37 > local35) {
			local37 = local35;
		}
		@Pc(52) double local52 = local19;
		@Pc(54) double local54 = 0.0D;
		if (local28 > local19) {
			local52 = local28;
		}
		if (local35 > local52) {
			local52 = local35;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local37 + local52) / 2.0D;
		if (local52 != local37) {
			if (local19 == local52) {
				local54 = (local28 - local35) / (-local37 + local52);
			} else if (local52 == local28) {
				local54 = (local35 - local19) / (local52 - local37) + 2.0D;
			} else if (local35 == local52) {
				local54 = (local19 - local28) / (local52 - local37) + 4.0D;
			}
			if (local74 < 0.5D) {
				local68 = (local52 - local37) / (local37 + local52);
			}
			if (local74 >= 0.5D) {
				local68 = (local52 - local37) / (2.0D - local37 - local52);
			}
		}
		if (local74 > 0.5D) {
			this.anInt2477 = (int) ((1.0D - local74) * local68 * 512.0D);
		} else {
			this.anInt2477 = (int) (local68 * 512.0D * local74);
		}
		this.anInt2483 = (int) (local68 * 256.0D);
		if (this.anInt2483 < 0) {
			this.anInt2483 = 0;
		} else if (this.anInt2483 > 255) {
			this.anInt2483 = 255;
		}
		if (this.anInt2477 < 1) {
			this.anInt2477 = 1;
		}
		this.anInt2484 = (int) (local74 * 256.0D);
		local54 /= 6.0D;
		this.anInt2479 = (int) (local54 * (double) this.anInt2477);
		if (this.anInt2484 < 0) {
			this.anInt2484 = 0;
		} else if (this.anInt2484 > 255) {
			this.anInt2484 = 255;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!lf;I)V")
	public void method2113(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method1378();
			if (local14 == 0) {
				return;
			}
			this.method2108(arg1, arg0, local14);
		}
	}
}
