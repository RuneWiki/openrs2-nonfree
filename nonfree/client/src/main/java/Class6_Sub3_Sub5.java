import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class6_Sub3_Sub5 extends Class6_Sub3 {

	@OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
	public int anInt813;

	@OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
	public int anInt814;

	@OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!dd", name = "zb", descriptor = "I")
	public int anInt830;

	@OriginalMember(owner = "client!dd", name = "ub", descriptor = "I")
	private int anInt827 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZILclient!bf;)V")
	private void method580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub4 arg2) {
		if (arg0 == 1) {
			this.anInt827 = arg2.method1290();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLclient!bf;)V")
	public void method582(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub4 arg1) {
		while (true) {
			@Pc(14) int local14 = arg1.method1321();
			if (local14 == 0) {
				return;
			}
			this.method580(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V")
	public void method583() {
		this.method588(this.anInt827);
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)V")
	private void method588(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local23 > local14) {
			local34 = local23;
		}
		if (local30 > local34) {
			local34 = local30;
		}
		@Pc(59) double local59 = 0.0D;
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local34 + local32) / 2.0D;
		if (local32 != local34) {
			if (local73 < 0.5D) {
				local59 = (local34 - local32) / (local32 + local34);
			}
			if (local34 == local14) {
				local67 = (local23 - local30) / (local34 - local32);
			} else if (local23 == local34) {
				local67 = (local30 - local14) / (local34 - local32) + 2.0D;
			} else if (local34 == local30) {
				local67 = (local14 - local23) / (local34 - local32) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local59 = (local34 - local32) / ((2.0D - local34) - local32);
			}
		}
		if (local73 > 0.5D) {
			this.anInt813 = (int) (local59 * 512.0D * (1.0D - local73));
		} else {
			this.anInt813 = (int) (local59 * local73 * 512.0D);
		}
		local67 /= 6.0D;
		this.anInt830 = (int) (local59 * 256.0D);
		this.anInt815 = (int) (local73 * 256.0D);
		if (this.anInt830 < 0) {
			this.anInt830 = 0;
		} else if (this.anInt830 > 255) {
			this.anInt830 = 255;
		}
		if (this.anInt815 < 0) {
			this.anInt815 = 0;
		} else if (this.anInt815 > 255) {
			this.anInt815 = 255;
		}
		if (this.anInt813 < 1) {
			this.anInt813 = 1;
		}
		this.anInt814 = (int) (local67 * (double) this.anInt813);
	}
}
