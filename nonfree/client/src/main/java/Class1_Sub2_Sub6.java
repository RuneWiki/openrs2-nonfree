import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
	public int anInt885;

	@OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
	public int anInt886;

	@OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
	public int anInt888;

	@OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
	public int anInt889;

	@OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
	private int anInt882 = 0;

	@OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
	private int anInt884 = -1;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!wa;II)V")
	public void method578(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method1738();
			if (local15 == 0) {
				return;
			}
			this.method581(local15, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)V")
	private void method580(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(19) double local19 = local12;
		@Pc(28) double local28 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = 0.0D;
		if (local28 < local12) {
			local19 = local28;
		}
		@Pc(38) double local38 = local12;
		if (local12 < local28) {
			local38 = local28;
		}
		@Pc(46) double local46 = 0.0D;
		@Pc(53) double local53 = (double) (arg0 & 0xFF) / 256.0D;
		if (local38 < local53) {
			local38 = local53;
		}
		if (local19 > local53) {
			local19 = local53;
		}
		@Pc(71) double local71 = (local19 + local38) / 2.0D;
		if (local38 != local19) {
			if (local12 == local38) {
				local30 = (local28 - local53) / (local38 - local19);
			} else if (local28 == local38) {
				local30 = (local53 - local12) / (local38 - local19) + 2.0D;
			} else if (local38 == local53) {
				local30 = (local12 - local28) / (local38 - local19) + 4.0D;
			}
			if (local71 < 0.5D) {
				local46 = (local38 - local19) / (local19 + local38);
			}
			if (local71 >= 0.5D) {
				local46 = (local38 - local19) / (2.0D - local38 - local19);
			}
		}
		this.anInt885 = (int) (local46 * 256.0D);
		if (this.anInt885 < 0) {
			this.anInt885 = 0;
		} else if (this.anInt885 > 255) {
			this.anInt885 = 255;
		}
		if (local71 > 0.5D) {
			this.anInt886 = (int) ((1.0D - local71) * local46 * 512.0D);
		} else {
			this.anInt886 = (int) (local46 * 512.0D * local71);
		}
		if (this.anInt886 < 1) {
			this.anInt886 = 1;
		}
		this.anInt888 = (int) (local71 * 256.0D);
		if (this.anInt888 < 0) {
			this.anInt888 = 0;
		} else if (this.anInt888 > 255) {
			this.anInt888 = 255;
		}
		local30 /= 6.0D;
		this.anInt889 = (int) (local30 * (double) this.anInt886);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILclient!wa;)V")
	private void method581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub14 arg2) {
		if (arg0 == 1) {
			this.anInt882 = arg2.method1713();
			this.method580(this.anInt882);
		} else if (arg0 == 2) {
			this.anInt884 = arg2.method1753();
			if (this.anInt884 == 65535) {
				this.anInt884 = -1;
				return;
			}
			return;
		} else if (arg0 == 3) {
			arg2.method1753();
			return;
		}
	}
}
