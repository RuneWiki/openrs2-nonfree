import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
	public int anInt2603;

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
	public int anInt2604;

	@OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
	public int anInt2607;

	@OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
	public int anInt2608;

	@OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
	public int anInt2612;

	@OriginalMember(owner = "client!rc", name = "jb", descriptor = "I")
	public int anInt2615;

	@OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
	public int anInt2610 = -1;

	@OriginalMember(owner = "client!rc", name = "nb", descriptor = "Z")
	public boolean aBoolean196 = true;

	@OriginalMember(owner = "client!rc", name = "qb", descriptor = "I")
	public int anInt2617 = 0;

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
	public int anInt2605 = -1;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
	private void method1595(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		if (local23 > local14) {
			local34 = local23;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		if (local34 < local30) {
			local34 = local30;
		}
		@Pc(73) double local73 = (local32 + local34) / 2.0D;
		this.anInt2604 = (int) (local73 * 256.0D);
		if (local32 != local34) {
			if (local34 == local14) {
				local54 = (local23 - local30) / (local34 - local32);
			} else if (local34 == local23) {
				local54 = (local30 - local14) / (local34 - local32) + 2.0D;
			} else if (local30 == local34) {
				local54 = (local14 - local23) / (-local32 + local34) + 4.0D;
			}
			if (local73 < 0.5D) {
				local56 = (local34 - local32) / (local32 + local34);
			}
			if (local73 >= 0.5D) {
				local56 = (local34 - local32) / (2.0D - local34 - local32);
			}
		}
		if (this.anInt2604 < 0) {
			this.anInt2604 = 0;
		} else if (this.anInt2604 > 255) {
			this.anInt2604 = 255;
		}
		this.anInt2603 = (int) (local56 * 256.0D);
		local54 /= 6.0D;
		this.anInt2608 = (int) (local54 * 256.0D);
		if (this.anInt2603 < 0) {
			this.anInt2603 = 0;
		} else if (this.anInt2603 > 255) {
			this.anInt2603 = 255;
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	public void method1597() {
		if (this.anInt2610 != -1) {
			this.method1595(this.anInt2610);
			this.anInt2607 = this.anInt2604;
			this.anInt2615 = this.anInt2608;
			this.anInt2612 = this.anInt2603;
		}
		this.method1595(this.anInt2617);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!wb;I)V")
	private void method1598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub17 arg2) {
		if (arg0 == 1) {
			this.anInt2617 = arg2.method1795();
		} else if (arg0 == 2) {
			this.anInt2605 = arg2.method1780();
		} else if (arg0 == 5) {
			this.aBoolean196 = false;
		} else if (arg0 == 7) {
			this.anInt2610 = arg2.method1795();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!wb;I)V")
	public void method1599(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub17 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method1780();
			if (local5 == 0) {
				return;
			}
			this.method1598(local5, arg0, arg1);
		}
	}
}
