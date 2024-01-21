import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class4_Sub1_Sub15 extends Class4_Sub1 {

	@OriginalMember(owner = "client!p", name = "C", descriptor = "I")
	public int anInt3041;

	@OriginalMember(owner = "client!p", name = "G", descriptor = "I")
	public int anInt3043;

	@OriginalMember(owner = "client!p", name = "H", descriptor = "I")
	public int anInt3044;

	@OriginalMember(owner = "client!p", name = "K", descriptor = "I")
	public int anInt3045;

	@OriginalMember(owner = "client!p", name = "F", descriptor = "I")
	private int anInt3042 = 0;

	@OriginalMember(owner = "client!p", name = "N", descriptor = "I")
	private int anInt3047 = -1;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	private void method2255(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		@Pc(40) double local40 = 0.0D;
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(48) double local48 = local14;
		@Pc(50) double local50 = 0.0D;
		if (local23 > local14) {
			local48 = local23;
		}
		if (local30 > local48) {
			local48 = local30;
		}
		@Pc(68) double local68 = (local32 + local48) / 2.0D;
		this.anInt3041 = (int) (local68 * 256.0D);
		if (local32 != local48) {
			if (local48 == local14) {
				local40 = (local23 - local30) / (local48 - local32);
			} else if (local23 == local48) {
				local40 = (local30 - local14) / (-local32 + local48) + 2.0D;
			} else if (local30 == local48) {
				local40 = (local14 - local23) / (local48 - local32) + 4.0D;
			}
			if (local68 < 0.5D) {
				local50 = (local48 - local32) / (local32 + local48);
			}
			if (local68 >= 0.5D) {
				local50 = (local48 - local32) / (2.0D - local48 - local32);
			}
		}
		if (local68 > 0.5D) {
			this.anInt3044 = (int) (local50 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt3044 = (int) (local50 * local68 * 512.0D);
		}
		local40 /= 6.0D;
		if (this.anInt3044 < 1) {
			this.anInt3044 = 1;
		}
		this.anInt3043 = (int) ((double) this.anInt3044 * local40);
		if (this.anInt3041 < 0) {
			this.anInt3041 = 0;
		} else if (this.anInt3041 > 255) {
			this.anInt3041 = 255;
		}
		this.anInt3045 = (int) (local50 * 256.0D);
		if (this.anInt3045 < 0) {
			this.anInt3045 = 0;
		} else if (this.anInt3045 > 255) {
			this.anInt3045 = 255;
			return;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIILclient!h;)V")
	private void method2257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub11 arg2) {
		if (arg1 == 1) {
			this.anInt3042 = arg2.method1225();
			this.method2255(this.anInt3042);
		} else if (arg1 == 2) {
			this.anInt3047 = arg2.method1252();
			if (this.anInt3047 != 65535) {
				return;
			}
			this.anInt3047 = -1;
		} else if (arg1 == 3) {
			arg2.method1252();
			return;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!h;II)V")
	public void method2259(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(12) int local12 = arg0.method1253();
			if (local12 == 0) {
				return;
			}
			this.method2257(arg1, local12, arg0);
		}
	}
}
