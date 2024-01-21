import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
	public int anInt2156;

	@OriginalMember(owner = "client!n", name = "Z", descriptor = "I")
	public int anInt2157;

	@OriginalMember(owner = "client!n", name = "ib", descriptor = "I")
	public int anInt2164;

	@OriginalMember(owner = "client!n", name = "kb", descriptor = "I")
	public int anInt2165;

	@OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
	private int anInt2158 = 0;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(Z)V")
	public void method1340() {
		this.method1343(this.anInt2158);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILclient!pd;)V")
	private void method1342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub6 arg2) {
		if (arg1 == 1) {
			this.anInt2158 = arg2.method639();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	private void method1343(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local10;
		@Pc(32) double local32 = (double) (arg0 & 0xFF) / 256.0D;
		if (local10 > local23) {
			local25 = local23;
		}
		if (local25 > local32) {
			local25 = local32;
		}
		@Pc(51) double local51 = local10;
		@Pc(53) double local53 = 0.0D;
		if (local23 > local10) {
			local51 = local23;
		}
		if (local51 < local32) {
			local51 = local32;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local51 + local25) / 2.0D;
		if (local25 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local25) / (local51 + local25);
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local25) / (2.0D - local25 - local51);
			}
			if (local10 == local51) {
				local53 = (local23 - local32) / (local51 - local25);
			} else if (local51 == local23) {
				local53 = (local32 - local10) / (local51 - local25) + 2.0D;
			} else if (local51 == local32) {
				local53 = (local10 - local23) / (-local25 + local51) + 4.0D;
			}
		}
		this.anInt2165 = (int) (local73 * 256.0D);
		if (this.anInt2165 < 0) {
			this.anInt2165 = 0;
		} else if (this.anInt2165 > 255) {
			this.anInt2165 = 255;
		}
		this.anInt2156 = (int) (local67 * 256.0D);
		local53 /= 6.0D;
		if (this.anInt2156 < 0) {
			this.anInt2156 = 0;
		} else if (this.anInt2156 > 255) {
			this.anInt2156 = 255;
		}
		if (local73 > 0.5D) {
			this.anInt2164 = (int) ((1.0D - local73) * local67 * 512.0D);
		} else {
			this.anInt2164 = (int) (local73 * 512.0D * local67);
		}
		if (this.anInt2164 < 1) {
			this.anInt2164 = 1;
		}
		this.anInt2157 = (int) ((double) this.anInt2164 * local53);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!pd;)V")
	public void method1345(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub6 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method665();
			if (local9 == 0) {
				return;
			}
			this.method1342(arg0, local9, arg1);
		}
	}
}
