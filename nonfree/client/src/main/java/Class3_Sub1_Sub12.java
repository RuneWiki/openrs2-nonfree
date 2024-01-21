import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
	public int anInt1925;

	@OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
	public int anInt1926;

	@OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
	public int anInt1931;

	@OriginalMember(owner = "client!kf", name = "jb", descriptor = "I")
	public int anInt1934;

	@OriginalMember(owner = "client!kf", name = "kb", descriptor = "I")
	public int anInt1935;

	@OriginalMember(owner = "client!kf", name = "wb", descriptor = "I")
	public int anInt1945;

	@OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
	public int anInt1928 = 0;

	@OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
	public int anInt1930 = -1;

	@OriginalMember(owner = "client!kf", name = "ob", descriptor = "I")
	public int anInt1939 = -1;

	@OriginalMember(owner = "client!kf", name = "qb", descriptor = "Z")
	public boolean aBoolean64 = true;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "(I)V")
	public void method1243() {
		if (this.anInt1930 != -1) {
			this.method1250(this.anInt1930);
			this.anInt1925 = this.anInt1934;
			this.anInt1935 = this.anInt1945;
			this.anInt1926 = this.anInt1931;
		}
		this.method1250(this.anInt1928);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!la;II)V")
	public void method1247(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1936();
			if (local5 == 0) {
				return;
			}
			this.method1249(local5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILclient!la;)V")
	private void method1249(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub12 arg2) {
		if (arg0 == 1) {
			this.anInt1928 = arg2.method1923();
		} else if (arg0 == 2) {
			this.anInt1939 = arg2.method1936();
		} else if (arg0 == 5) {
			this.aBoolean64 = false;
		} else if (arg0 == 7) {
			this.anInt1930 = arg2.method1923();
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
	private void method1250(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local30 < local14) {
			local32 = local30;
		}
		@Pc(40) double local40 = local14;
		@Pc(42) double local42 = 0.0D;
		if (local32 > local21) {
			local32 = local21;
		}
		@Pc(54) double local54 = 0.0D;
		if (local14 < local30) {
			local40 = local30;
		}
		if (local40 < local21) {
			local40 = local21;
		}
		@Pc(72) double local72 = (local32 + local40) / 2.0D;
		if (local40 != local32) {
			if (local14 == local40) {
				local42 = (local30 - local21) / (local40 - local32);
			} else if (local30 == local40) {
				local42 = (local21 - local14) / (-local32 + local40) + 2.0D;
			} else if (local21 == local40) {
				local42 = (local14 - local30) / (local40 - local32) + 4.0D;
			}
			if (local72 < 0.5D) {
				local54 = (local40 - local32) / (local32 + local40);
			}
			if (local72 >= 0.5D) {
				local54 = (local40 - local32) / ((2.0D - local40) - local32);
			}
		}
		local42 /= 6.0D;
		this.anInt1945 = (int) (local42 * 256.0D);
		this.anInt1934 = (int) (local54 * 256.0D);
		if (this.anInt1934 < 0) {
			this.anInt1934 = 0;
		} else if (this.anInt1934 > 255) {
			this.anInt1934 = 255;
		}
		this.anInt1931 = (int) (local72 * 256.0D);
		if (this.anInt1931 < 0) {
			this.anInt1931 = 0;
		} else if (this.anInt1931 > 255) {
			this.anInt1931 = 255;
			return;
		}
	}
}
