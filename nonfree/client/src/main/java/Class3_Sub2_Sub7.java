import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
	public int anInt1507;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
	public int anInt1509;

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
	public int anInt1514;

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
	public int anInt1518;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
	private int anInt1510 = -1;

	@OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
	private int anInt1522 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
	private void method1047(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = 0.0D;
		@Pc(36) double local36 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		@Pc(44) double local44 = 0.0D;
		if (local14 < local23) {
			local36 = local23;
		}
		if (local30 > local36) {
			local36 = local30;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(68) double local68 = (local36 + local32) / 2.0D;
		this.anInt1514 = (int) (local68 * 256.0D);
		if (local32 != local36) {
			if (local14 == local36) {
				local44 = (local23 - local30) / (local36 - local32);
			} else if (local36 == local23) {
				local44 = (local30 - local14) / (-local32 + local36) + 2.0D;
			} else if (local36 == local30) {
				local44 = (local14 - local23) / (-local32 + local36) + 4.0D;
			}
			if (local68 < 0.5D) {
				local34 = (local36 - local32) / (local32 + local36);
			}
			if (local68 >= 0.5D) {
				local34 = (local36 - local32) / (2.0D - local36 - local32);
			}
		}
		if (this.anInt1514 < 0) {
			this.anInt1514 = 0;
		} else if (this.anInt1514 > 255) {
			this.anInt1514 = 255;
		}
		this.anInt1518 = (int) (local34 * 256.0D);
		if (this.anInt1518 < 0) {
			this.anInt1518 = 0;
		} else if (this.anInt1518 > 255) {
			this.anInt1518 = 255;
		}
		local44 /= 6.0D;
		if (local68 > 0.5D) {
			this.anInt1507 = (int) ((1.0D - local68) * local34 * 512.0D);
		} else {
			this.anInt1507 = (int) (local68 * local34 * 512.0D);
		}
		if (this.anInt1507 < 1) {
			this.anInt1507 = 1;
		}
		this.anInt1509 = (int) ((double) this.anInt1507 * local44);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBILclient!rd;)V")
	private void method1048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub4 arg2) {
		if (arg0 == 1) {
			this.anInt1522 = arg2.method197();
			this.method1047(this.anInt1522);
		} else if (arg0 == 2) {
			this.anInt1510 = arg2.method208();
			if (this.anInt1510 != 65535) {
				return;
			}
			this.anInt1510 = -1;
		} else if (arg0 == 3) {
			arg2.method208();
			return;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!rd;IB)V")
	public void method1050(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method191();
			if (local13 == 0) {
				return;
			}
			this.method1048(local13, arg1, arg0);
		}
	}
}
