import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "[I")
	public static final int[] anIntArray132 = new int[99];

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
	public int anInt1669;

	@OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
	public int anInt1670;

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
	public int anInt1672;

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
	public int anInt1677;

	@OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
	private int anInt1674 = -1;

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
	private int anInt1678 = 0;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 99; local10++) {
			@Pc(15) int local15 = local10 + 1;
			@Pc(28) int local28 = (int) (Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D + (double) local15);
			local8 += local28;
			anIntArray132[local10] = local8 / 4;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILclient!ka;)V")
	private void method1137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub14 arg2) {
		if (arg0 == 1) {
			this.anInt1678 = arg2.method3049();
			this.method1142(this.anInt1678);
		} else if (arg0 == 2) {
			this.anInt1674 = arg2.method3023();
			if (this.anInt1674 == 65535) {
				this.anInt1674 = -1;
			}
		} else if (arg0 == 3) {
			arg2.method3023();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!ka;I)V")
	public void method1139(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3010();
			if (local5 == 0) {
				return;
			}
			this.method1137(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	private void method1142(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(37) double local37 = local10;
		@Pc(39) double local39 = local10;
		if (local10 < local30) {
			local39 = local30;
		}
		if (local30 < local10) {
			local37 = local30;
		}
		if (local37 > local21) {
			local37 = local21;
		}
		@Pc(59) double local59 = 0.0D;
		@Pc(61) double local61 = 0.0D;
		if (local39 < local21) {
			local39 = local21;
		}
		@Pc(73) double local73 = (local39 + local37) / 2.0D;
		this.anInt1677 = (int) (local73 * 256.0D);
		if (this.anInt1677 < 0) {
			this.anInt1677 = 0;
		} else if (this.anInt1677 > 255) {
			this.anInt1677 = 255;
		}
		if (local39 != local37) {
			if (local39 == local10) {
				local59 = (local30 - local21) / (local39 - local37);
			} else if (local39 == local30) {
				local59 = (local21 - local10) / (-local37 + local39) + 2.0D;
			} else if (local39 == local21) {
				local59 = (local10 - local30) / (local39 - local37) + 4.0D;
			}
			if (local73 < 0.5D) {
				local61 = (local39 - local37) / (local39 + local37);
			}
			if (local73 >= 0.5D) {
				local61 = (local39 - local37) / ((2.0D - local39) - local37);
			}
		}
		this.anInt1669 = (int) (local61 * 256.0D);
		if (this.anInt1669 < 0) {
			this.anInt1669 = 0;
		} else if (this.anInt1669 > 255) {
			this.anInt1669 = 255;
		}
		if (local73 > 0.5D) {
			this.anInt1672 = (int) (local61 * (1.0D - local73) * 512.0D);
		} else {
			this.anInt1672 = (int) (local73 * local61 * 512.0D);
		}
		local59 /= 6.0D;
		if (this.anInt1672 < 1) {
			this.anInt1672 = 1;
		}
		this.anInt1670 = (int) (local59 * (double) this.anInt1672);
	}
}
