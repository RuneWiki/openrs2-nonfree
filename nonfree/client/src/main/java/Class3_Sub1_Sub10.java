import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kf", name = "tb", descriptor = "[I")
	public static int[] anIntArray177 = new int[32];

	@OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
	public int anInt1918;

	@OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
	public int anInt1922;

	@OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
	public int anInt1923;

	@OriginalMember(owner = "client!kf", name = "gb", descriptor = "I")
	public int anInt1925;

	@OriginalMember(owner = "client!kf", name = "lb", descriptor = "I")
	public int anInt1930;

	@OriginalMember(owner = "client!kf", name = "ob", descriptor = "I")
	public int anInt1932;

	@OriginalMember(owner = "client!kf", name = "ab", descriptor = "I")
	public int anInt1919 = 0;

	@OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
	public int anInt1921 = -1;

	@OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
	public int anInt1917 = -1;

	@OriginalMember(owner = "client!kf", name = "pb", descriptor = "Z")
	public boolean aBoolean98 = true;

	static {
		@Pc(19) int local19 = 2;
		for (@Pc(21) int local21 = 0; local21 < 32; local21++) {
			anIntArray177[local21] = local19 - 1;
			local19 += local19;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!m;I)V")
	public void method1248(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method981();
			if (local13 == 0) {
				return;
			}
			this.method1251(arg0, local13, arg1);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILclient!m;I)V")
	private void method1251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub11 arg2) {
		if (arg1 == 1) {
			this.anInt1919 = arg2.method1013();
		} else if (arg1 == 2) {
			this.anInt1921 = arg2.method981();
		} else if (arg1 == 5) {
			this.aBoolean98 = false;
		} else if (arg1 == 7) {
			this.anInt1917 = arg2.method1013();
		}
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
	public void method1252() {
		if (this.anInt1917 != -1) {
			this.method1253(this.anInt1917);
			this.anInt1922 = this.anInt1923;
			this.anInt1918 = this.anInt1925;
			this.anInt1930 = this.anInt1932;
		}
		this.method1253(this.anInt1919);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(ZI)V")
	private void method1253(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local23;
		@Pc(27) double local27 = local23;
		if (local23 < local14) {
			local27 = local14;
		}
		@Pc(40) double local40 = (double) (arg0 & 0xFF) / 256.0D;
		if (local14 < local23) {
			local25 = local14;
		}
		if (local25 > local40) {
			local25 = local40;
		}
		if (local40 > local27) {
			local27 = local40;
		}
		@Pc(64) double local64 = (local25 + local27) / 2.0D;
		this.anInt1923 = (int) (local64 * 256.0D);
		if (this.anInt1923 < 0) {
			this.anInt1923 = 0;
		} else if (this.anInt1923 > 255) {
			this.anInt1923 = 255;
		}
		@Pc(90) double local90 = 0.0D;
		@Pc(92) double local92 = 0.0D;
		if (local25 != local27) {
			if (local27 == local23) {
				local90 = (local14 - local40) / (-local25 + local27);
			} else if (local27 == local14) {
				local90 = (local40 - local23) / (-local25 + local27) + 2.0D;
			} else if (local40 == local27) {
				local90 = (local23 - local14) / (local27 - local25) + 4.0D;
			}
			if (local64 < 0.5D) {
				local92 = (local27 - local25) / (local27 + local25);
			}
			if (local64 >= 0.5D) {
				local92 = (local27 - local25) / ((2.0D - local27) - local25);
			}
		}
		this.anInt1932 = (int) (local92 * 256.0D);
		if (this.anInt1932 < 0) {
			this.anInt1932 = 0;
		} else if (this.anInt1932 > 255) {
			this.anInt1932 = 255;
		}
		local90 /= 6.0D;
		this.anInt1925 = (int) (local90 * 256.0D);
	}
}
