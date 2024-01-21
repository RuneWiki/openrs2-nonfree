import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!da", name = "P", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!da", name = "W", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
	public int anInt515;

	@OriginalMember(owner = "client!da", name = "db", descriptor = "I")
	public int anInt517;

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
	private int anInt519 = 0;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(B)V")
	public void method339() {
		this.method342(this.anInt519);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILclient!be;)V")
	public void method340(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		while (true) {
			@Pc(3) int local3 = arg1.method933();
			if (local3 == 0) {
				return;
			}
			this.method346(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
	private void method342(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(19) double local19 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(21) double local21 = local12;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local30 < local12) {
			local21 = local30;
		}
		if (local21 > local19) {
			local21 = local19;
		}
		@Pc(44) double local44 = local12;
		@Pc(46) double local46 = 0.0D;
		if (local30 > local12) {
			local44 = local30;
		}
		if (local44 < local19) {
			local44 = local19;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(71) double local71 = (local21 + local44) / 2.0D;
		if (local44 != local21) {
			if (local71 < 0.5D) {
				local46 = (local44 - local21) / (local21 + local44);
			}
			if (local12 == local44) {
				local65 = (local30 - local19) / (-local21 + local44);
			} else if (local30 == local44) {
				local65 = (local19 - local12) / (-local21 + local44) + 2.0D;
			} else if (local19 == local44) {
				local65 = (local12 - local30) / (local44 - local21) + 4.0D;
			}
			if (local71 >= 0.5D) {
				local46 = (local44 - local21) / (2.0D - local44 - local21);
			}
		}
		this.anInt517 = (int) (local71 * 256.0D);
		if (this.anInt517 < 0) {
			this.anInt517 = 0;
		} else if (this.anInt517 > 255) {
			this.anInt517 = 255;
		}
		if (local71 > 0.5D) {
			this.anInt507 = (int) (local46 * 512.0D * (1.0D - local71));
		} else {
			this.anInt507 = (int) (local46 * 512.0D * local71);
		}
		if (this.anInt507 < 1) {
			this.anInt507 = 1;
		}
		local65 /= 6.0D;
		this.anInt511 = (int) ((double) this.anInt507 * local65);
		this.anInt515 = (int) (local46 * 256.0D);
		if (this.anInt515 < 0) {
			this.anInt515 = 0;
		} else if (this.anInt515 > 255) {
			this.anInt515 = 255;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIILclient!be;)V")
	private void method346(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub4 arg2) {
		if (arg1 == 1) {
			this.anInt519 = arg2.method940();
		}
	}
}
