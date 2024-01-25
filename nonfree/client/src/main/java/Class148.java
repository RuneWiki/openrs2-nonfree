import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class148 {

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
	public int anInt3750;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public int anInt3752;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
	public int anInt3753;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
	public int anInt3755;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
	private int anInt3747 = 0;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "Z")
	public boolean aBoolean276 = true;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	public int anInt3757 = -1;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Z")
	public boolean aBoolean277 = true;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
	public int anInt3759 = 512;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILclient!jc;)V")
	private void method3271(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt3747 = arg1.method7719();
			this.method3276(this.anInt3747);
		} else if (arg0 == 2) {
			this.anInt3757 = arg1.method7717(-1978450544);
			if (this.anInt3757 == 65535) {
				this.anInt3757 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt3759 = arg1.method7717(-1978450544) << 2;
		} else if (arg0 == 4) {
			this.aBoolean276 = false;
		} else if (arg0 == 5) {
			this.aBoolean277 = false;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!jc;)V")
	public void method3275(@OriginalArg(1) Class14_Sub21 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method7695(109);
			if (local7 == 0) {
				return;
			}
			this.method3271(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)V")
	private void method3276(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local28 < local30) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local21 > local12) {
			local44 = local21;
		}
		if (local44 < local28) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(65) double local65 = 0.0D;
		@Pc(71) double local71 = (local44 + local30) / 2.0D;
		if (local44 != local30) {
			if (local71 < 0.5D) {
				local65 = (local44 - local30) / (local30 + local44);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local44 == local21) {
				local58 = (local28 - local12) / (local44 - local30) + 2.0D;
			} else if (local28 == local44) {
				local58 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
			if (local71 >= 0.5D) {
				local65 = (local44 - local30) / ((2.0D - local44) - local30);
			}
		}
		local58 /= 6.0D;
		this.anInt3753 = (int) (local71 * 256.0D);
		this.anInt3755 = (int) (local65 * 256.0D);
		if (this.anInt3755 < 0) {
			this.anInt3755 = 0;
		} else if (this.anInt3755 > 255) {
			this.anInt3755 = 255;
		}
		if (local71 > 0.5D) {
			this.anInt3752 = (int) (local65 * (1.0D - local71) * 512.0D);
		} else {
			this.anInt3752 = (int) (local71 * 512.0D * local65);
		}
		if (this.anInt3753 < 0) {
			this.anInt3753 = 0;
		} else if (this.anInt3753 > 255) {
			this.anInt3753 = 255;
		}
		if (this.anInt3752 < 1) {
			this.anInt3752 = 1;
		}
		this.anInt3750 = (int) ((double) this.anInt3752 * local58);
	}
}
