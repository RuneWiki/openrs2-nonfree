import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
	public int anInt514;

	@OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
	public int anInt515;

	@OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
	private int anInt512 = -1;

	@OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
	private int anInt513 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLclient!og;I)V")
	public void method393(@OriginalArg(1) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method218();
			if (local9 == 0) {
				return;
			}
			this.method396(local9, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIBLclient!og;)V")
	private void method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub3 arg2) {
		if (arg0 == 1) {
			this.anInt513 = arg2.method239();
			this.method399(this.anInt513);
		} else if (arg0 == 2) {
			this.anInt512 = arg2.method234();
			if (this.anInt512 == 65535) {
				this.anInt512 = -1;
			}
		} else if (arg0 == 3) {
			arg2.method234();
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(IB)V")
	private void method399(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local14 < local23) {
			local32 = local23;
		}
		if (local30 > local32) {
			local32 = local30;
		}
		if (local14 > local23) {
			local34 = local23;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		if (local34 > local30) {
			local34 = local30;
		}
		@Pc(68) double local68 = (local32 + local34) / 2.0D;
		if (local32 != local34) {
			if (local68 < 0.5D) {
				local56 = (local32 - local34) / (local32 + local34);
			}
			if (local68 >= 0.5D) {
				local56 = (local32 - local34) / (2.0D - local32 - local34);
			}
			if (local32 == local14) {
				local54 = (local23 - local30) / (-local34 + local32);
			} else if (local32 == local23) {
				local54 = (local30 - local14) / (-local34 + local32) + 2.0D;
			} else if (local30 == local32) {
				local54 = (local14 - local23) / (local32 - local34) + 4.0D;
			}
		}
		local54 /= 6.0D;
		if (local68 > 0.5D) {
			this.anInt510 = (int) ((1.0D - local68) * 512.0D * local56);
		} else {
			this.anInt510 = (int) (local56 * local68 * 512.0D);
		}
		this.anInt514 = (int) (local56 * 256.0D);
		if (this.anInt514 < 0) {
			this.anInt514 = 0;
		} else if (this.anInt514 > 255) {
			this.anInt514 = 255;
		}
		if (this.anInt510 < 1) {
			this.anInt510 = 1;
		}
		this.anInt515 = (int) (local68 * 256.0D);
		if (this.anInt515 < 0) {
			this.anInt515 = 0;
		} else if (this.anInt515 > 255) {
			this.anInt515 = 255;
		}
		this.anInt509 = (int) (local54 * (double) this.anInt510);
	}
}
