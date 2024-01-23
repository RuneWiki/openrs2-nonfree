import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class2_Sub3_Sub12 extends Class2_Sub3 {

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
	public int anInt1616;

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
	public int anInt1619;

	@OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
	public int anInt1626;

	@OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
	public int anInt1628;

	@OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
	private int anInt1623 = -1;

	@OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
	private int anInt1629 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!nh;ZII)V")
	private void method1254(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1629 = arg0.method2091();
			this.method1255(this.anInt1629);
		} else if (arg2 == 2) {
			this.anInt1623 = arg0.method2095();
			if (this.anInt1623 == 65535) {
				this.anInt1623 = -1;
				return;
			}
		} else if (arg2 == 3) {
			arg0.method2095();
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
	private void method1255(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		@Pc(40) double local40 = local14;
		if (local23 > local14) {
			local40 = local23;
		}
		@Pc(56) double local56 = 0.0D;
		if (local30 < local32) {
			local32 = local30;
		}
		if (local40 < local30) {
			local40 = local30;
		}
		@Pc(74) double local74 = (local32 + local40) / 2.0D;
		this.anInt1616 = (int) (local74 * 256.0D);
		@Pc(82) double local82 = 0.0D;
		if (local40 != local32) {
			if (local74 < 0.5D) {
				local82 = (local40 - local32) / (local32 + local40);
			}
			if (local74 >= 0.5D) {
				local82 = (local40 - local32) / (2.0D - local40 - local32);
			}
			if (local14 == local40) {
				local56 = (local23 - local30) / (local40 - local32);
			} else if (local40 == local23) {
				local56 = (local30 - local14) / (-local32 + local40) + 2.0D;
			} else if (local40 == local30) {
				local56 = (local14 - local23) / (-local32 + local40) + 4.0D;
			}
		}
		this.anInt1628 = (int) (local82 * 256.0D);
		local56 /= 6.0D;
		if (local74 > 0.5D) {
			this.anInt1619 = (int) (local82 * (1.0D - local74) * 512.0D);
		} else {
			this.anInt1619 = (int) (local82 * local74 * 512.0D);
		}
		if (this.anInt1628 < 0) {
			this.anInt1628 = 0;
		} else if (this.anInt1628 > 255) {
			this.anInt1628 = 255;
		}
		if (this.anInt1619 < 1) {
			this.anInt1619 = 1;
		}
		this.anInt1626 = (int) ((double) this.anInt1619 * local56);
		if (this.anInt1616 < 0) {
			this.anInt1616 = 0;
		} else if (this.anInt1616 > 255) {
			this.anInt1616 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!nh;BI)V")
	public void method1256(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2122();
			if (local9 == 0) {
				return;
			}
			this.method1254(arg0, arg1, local9);
		}
	}
}
