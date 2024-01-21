import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
	public int anInt45;

	@OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
	public int anInt47;

	@OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
	public int anInt52;

	@OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
	public int anInt53;

	@OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
	public int anInt54;

	@OriginalMember(owner = "client!ab", name = "R", descriptor = "Z")
	public boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
	public int anInt46 = 0;

	@OriginalMember(owner = "client!ab", name = "fb", descriptor = "I")
	public int anInt58 = -1;

	@OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
	public int anInt51 = -1;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V")
	private void method41(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		@Pc(42) double local42 = local14;
		@Pc(44) double local44 = 0.0D;
		if (local23 < local14) {
			local42 = local23;
		}
		@Pc(52) double local52 = 0.0D;
		if (local23 > local14) {
			local40 = local23;
		}
		if (local42 > local38) {
			local42 = local38;
		}
		if (local38 > local40) {
			local40 = local38;
		}
		@Pc(76) double local76 = (local42 + local40) / 2.0D;
		if (local42 != local40) {
			if (local76 < 0.5D) {
				local52 = (local40 - local42) / (local40 + local42);
			}
			if (local76 >= 0.5D) {
				local52 = (local40 - local42) / (2.0D - local42 - local40);
			}
			if (local40 == local14) {
				local44 = (local23 - local38) / (-local42 + local40);
			} else if (local23 == local40) {
				local44 = (local38 - local14) / (local40 - local42) + 2.0D;
			} else if (local38 == local40) {
				local44 = (local14 - local23) / (-local42 + local40) + 4.0D;
			}
		}
		local44 /= 6.0D;
		this.anInt45 = (int) (local52 * 256.0D);
		this.anInt50 = (int) (local76 * 256.0D);
		if (this.anInt45 < 0) {
			this.anInt45 = 0;
		} else if (this.anInt45 > 255) {
			this.anInt45 = 255;
		}
		if (this.anInt50 < 0) {
			this.anInt50 = 0;
		} else if (this.anInt50 > 255) {
			this.anInt50 = 255;
		}
		this.anInt54 = (int) (local44 * 256.0D);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!ff;I)V")
	public void method43(@OriginalArg(1) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method1354();
			if (local14 == 0) {
				return;
			}
			this.method46(arg0, arg1, local14);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public void method45() {
		if (this.anInt58 != -1) {
			this.method41(this.anInt58);
			this.anInt53 = this.anInt50;
			this.anInt47 = this.anInt45;
			this.anInt52 = this.anInt54;
		}
		this.method41(this.anInt46);
		Static130.method2170(this.anInt45, this.anInt50, this.anInt54);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!ff;III)V")
	private void method46(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt46 = arg0.method1376();
		} else if (arg2 == 2) {
			this.anInt51 = arg0.method1354();
		} else if (arg2 == 3) {
			this.anInt51 = arg0.method1359();
			if (this.anInt51 == 65535) {
				this.anInt51 = -1;
			}
		} else if (arg2 == 5) {
			this.aBoolean6 = false;
		} else if (arg2 == 7) {
			this.anInt58 = arg0.method1376();
		} else if (arg2 != 8 && arg2 == 9) {
			arg0.method1359();
		}
	}
}
