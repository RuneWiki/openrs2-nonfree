import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
	public int anInt2075;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	public int anInt2076;

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
	public int anInt2078;

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
	public int anInt2080;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
	private int anInt2079 = -1;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
	private int anInt2084 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!fa;II)V")
	public void method1541(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method1234();
			if (local14 == 0) {
				return;
			}
			this.method1543(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILclient!fa;)V")
	private void method1543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub9 arg2) {
		if (arg0 == 1) {
			this.anInt2084 = arg2.method1230();
			this.method1545(this.anInt2084);
		} else if (arg0 == 2) {
			this.anInt2079 = arg2.method1280();
			if (this.anInt2079 == 65535) {
				this.anInt2079 = -1;
			}
		} else if (arg0 == 3) {
			arg2.method1280();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
	private void method1545(@OriginalArg(0) int arg0) {
		@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local28;
		@Pc(37) double local37 = (double) (arg0 & 0xFF) / 256.0D;
		if (local19 < local28) {
			local30 = local19;
		}
		if (local30 > local37) {
			local30 = local37;
		}
		@Pc(51) double local51 = 0.0D;
		@Pc(53) double local53 = local28;
		if (local28 < local19) {
			local53 = local19;
		}
		if (local37 > local53) {
			local53 = local37;
		}
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local53 + local30) / 2.0D;
		if (local30 != local53) {
			if (local28 == local53) {
				local51 = (local19 - local37) / (-local30 + local53);
			} else if (local53 == local19) {
				local51 = (local37 - local28) / (-local30 + local53) + 2.0D;
			} else if (local53 == local37) {
				local51 = (local28 - local19) / (local53 - local30) + 4.0D;
			}
			if (local73 < 0.5D) {
				local67 = (local53 - local30) / (local30 + local53);
			}
			if (local73 >= 0.5D) {
				local67 = (local53 - local30) / (2.0D - local53 - local30);
			}
		}
		local51 /= 6.0D;
		this.anInt2076 = (int) (local73 * 256.0D);
		if (local73 > 0.5D) {
			this.anInt2080 = (int) (local67 * (1.0D - local73) * 512.0D);
		} else {
			this.anInt2080 = (int) (local73 * local67 * 512.0D);
		}
		if (this.anInt2076 < 0) {
			this.anInt2076 = 0;
		} else if (this.anInt2076 > 255) {
			this.anInt2076 = 255;
		}
		if (this.anInt2080 < 1) {
			this.anInt2080 = 1;
		}
		this.anInt2078 = (int) (local67 * 256.0D);
		if (this.anInt2078 < 0) {
			this.anInt2078 = 0;
		} else if (this.anInt2078 > 255) {
			this.anInt2078 = 255;
		}
		this.anInt2075 = (int) (local51 * (double) this.anInt2080);
	}
}
