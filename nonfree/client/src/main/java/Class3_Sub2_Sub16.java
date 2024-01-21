import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class3_Sub2_Sub16 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "I")
	public int anInt3531;

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
	public int anInt3534;

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
	public int anInt3537;

	@OriginalMember(owner = "client!rf", name = "cb", descriptor = "I")
	public int anInt3542;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
	private int anInt3533 = -1;

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
	private int anInt3535 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!hd;BI)V")
	public void method2707(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method1545();
			if (local15 == 0) {
				return;
			}
			this.method2709(local15, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!hd;I)V")
	private void method2709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub8 arg2) {
		if (arg0 == 1) {
			this.anInt3535 = arg2.method1554();
			this.method2710(this.anInt3535);
		} else if (arg0 == 2) {
			this.anInt3533 = arg2.method1510();
			if (this.anInt3533 == 65535) {
				this.anInt3533 = -1;
			}
		} else if (arg0 == 3) {
			arg2.method1510();
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IZ)V")
	private void method2710(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		@Pc(32) double local32 = 0.0D;
		@Pc(34) double local34 = local12;
		if (local21 < local12) {
			local34 = local21;
		}
		@Pc(42) double local42 = 0.0D;
		if (local21 > local12) {
			local30 = local21;
		}
		if (local28 < local34) {
			local34 = local28;
		}
		if (local30 < local28) {
			local30 = local28;
		}
		@Pc(70) double local70 = (local34 + local30) / 2.0D;
		if (local30 != local34) {
			if (local12 == local30) {
				local42 = (local21 - local28) / (local30 - local34);
			} else if (local30 == local21) {
				local42 = (local28 - local12) / (-local34 + local30) + 2.0D;
			} else if (local30 == local28) {
				local42 = (local12 - local21) / (local30 - local34) + 4.0D;
			}
			if (local70 < 0.5D) {
				local32 = (local30 - local34) / (local30 + local34);
			}
			if (local70 >= 0.5D) {
				local32 = (local30 - local34) / (2.0D - local30 - local34);
			}
		}
		if (local70 > 0.5D) {
			this.anInt3534 = (int) ((1.0D - local70) * 512.0D * local32);
		} else {
			this.anInt3534 = (int) (local70 * 512.0D * local32);
		}
		this.anInt3537 = (int) (local32 * 256.0D);
		this.anInt3542 = (int) (local70 * 256.0D);
		local42 /= 6.0D;
		if (this.anInt3542 < 0) {
			this.anInt3542 = 0;
		} else if (this.anInt3542 > 255) {
			this.anInt3542 = 255;
		}
		if (this.anInt3534 < 1) {
			this.anInt3534 = 1;
		}
		if (this.anInt3537 < 0) {
			this.anInt3537 = 0;
		} else if (this.anInt3537 > 255) {
			this.anInt3537 = 255;
		}
		this.anInt3531 = (int) (local42 * (double) this.anInt3534);
	}
}
