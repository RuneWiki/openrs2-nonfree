import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub5_Sub4 extends Class1_Sub5 {

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "[I")
	public static int[] anIntArray60 = new int[256];

	@OriginalMember(owner = "client!db", name = "ab", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!db", name = "gb", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!db", name = "V", descriptor = "I")
	private int anInt785;

	@OriginalMember(owner = "client!db", name = "W", descriptor = "Z")
	private boolean aBoolean26;

	@OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
	private int anInt790;

	@OriginalMember(owner = "client!db", name = "Z", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
	private int anInt789;

	@OriginalMember(owner = "client!db", name = "X", descriptor = "I")
	private int anInt786;

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
	private int anInt792;

	static {
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(20) int local20 = local17;
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				if ((local20 & 0x1) == 1) {
					local20 = local20 >>> 1 ^ 0xEDB88320;
				} else {
					local20 >>>= 0x1;
				}
			}
			anIntArray60[local17] = local20;
		}
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
	private void method638() {
		@Pc(35) int local35;
		if (this.anInt786 > 0) {
			this.anIntArray58 = new int[this.anInt785];
			this.anIntArray59 = new int[this.anInt785];
			for (local35 = 0; local35 < this.anInt785; local35++) {
				this.anIntArray58[local35] = (int) (Math.pow((double) (this.anInt786 / 4096), (double) local35) * 4096.0D);
				this.anIntArray59[local35] = (int) (Math.pow(2.0D, (double) local35) * 4096.0D);
			}
		} else if (this.anIntArray58 != null && this.anIntArray58.length == this.anInt785) {
			this.anIntArray59 = new int[this.anInt785];
			for (local35 = 0; local35 < this.anInt785; local35++) {
				this.anIntArray59[local35] = (int) (Math.pow(2.0D, (double) local35) * 4096.0D);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	@Override
	public void method3146() {
		this.method642();
		this.method638();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIBII)I")
	private int method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2 & 0xFFFFF000;
		@Pc(11) int local11 = arg2 - local7;
		@Pc(15) int local15 = arg3 & 0xFFFFF000;
		@Pc(19) int local19 = arg1 & 0xFFFFF000;
		@Pc(23) int local23 = local7 >> 12;
		@Pc(32) int local32 = arg3 - local15;
		@Pc(36) int local36 = local15 >> 12;
		@Pc(40) int local40 = local36 + 1;
		@Pc(44) int local44 = local23 + 1;
		@Pc(48) int local48 = local23 & 0xFF;
		if (local44 >= local19 >> 12) {
			local44 = 0;
		}
		local15 = local36 & 0xFF;
		local44 &= 0xFF;
		@Pc(71) int local71 = arg0 & 0xFFFFF000;
		if (local40 >= local71 >> 12) {
			local40 = 0;
		}
		@Pc(91) int local91 = this.anIntArray57[local48 + this.anIntArray57[local15]] % 4;
		local40 &= 0xFF;
		@Pc(107) int local107 = this.anIntArray57[local48 + this.anIntArray57[local40]] % 4;
		@Pc(120) int local120 = this.anIntArray57[local44 + this.anIntArray57[local15]] % 4;
		@Pc(133) int local133 = this.anIntArray57[local44 + this.anIntArray57[local40]] % 4;
		@Pc(141) int local141 = Static32.method2359(local11, Static187.anIntArrayArray40[local91], local32);
		@Pc(153) int local153 = Static32.method2359(local11 - 4096, Static187.anIntArrayArray40[local120], local32);
		@Pc(163) int local163 = Static32.method2359(local11, Static187.anIntArrayArray40[local107], local32 - 4096);
		@Pc(175) int local175 = Static32.method2359(local11 - 4096, Static187.anIntArrayArray40[local133], local32 - 4096);
		@Pc(181) int local181 = Static120.method2058(local11);
		@Pc(185) int local185 = Static120.method2058(local32);
		@Pc(191) int local191 = Static137.method2307(local141, local181, local153);
		@Pc(197) int local197 = Static137.method2307(local163, local181, local175);
		return Static137.method2307(local191, local185, local197);
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
	private void method642() {
		@Pc(12) Random local12 = new Random((long) this.anInt789);
		for (@Pc(18) int local18 = 0; local18 < 255; local18++) {
			this.anIntArray57[local18] = -1;
		}
		for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
			@Pc(40) int local40;
			do {
				local40 = Static103.method1706(255, local12);
			} while (this.anIntArray57[local40] != -1);
			this.anIntArray57[local40 + 255] = this.anIntArray57[local40] = local33;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean26 = arg0.method336() == 1;
		} else if (arg1 == 1) {
			this.anInt785 = arg0.method336();
		} else if (arg1 == 2) {
			this.anInt786 = arg0.method332();
			if (this.anInt786 < 0) {
				this.anIntArray58 = new int[this.anInt785];
				for (@Pc(65) int local65 = 0; local65 < this.anInt785; local65++) {
					this.anIntArray58[local65] = arg0.method332();
				}
			}
		} else if (arg1 == 3) {
			this.anInt790 = this.anInt792 = arg0.method336();
		} else if (arg1 == 4) {
			this.anInt789 = arg0.method336();
		} else if (arg1 == 5) {
			this.anInt790 = arg0.method336();
		} else if (arg1 == 6) {
			this.anInt792 = arg0.method336();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(25) int local25 = this.anInt790 << 12;
			@Pc(30) int local30 = this.anInt792 << 12;
			@Pc(37) int local37 = this.anInt792 * Static34.anIntArray75[arg0];
			for (@Pc(39) int local39 = 0; local39 < Static177.anInt4018; local39++) {
				@Pc(48) int local48 = Static116.anIntArray275[local39] * this.anInt790;
				@Pc(50) int local50 = 0;
				for (@Pc(52) int local52 = 0; local52 < this.anInt785; local52++) {
					@Pc(59) int local59 = this.anIntArray59[local52];
					@Pc(64) int local64 = this.anIntArray58[local52];
					@Pc(88) int local88 = this.method641(local30 * local59 >> 12, local25 * local59 >> 12, local48 * local59 >> 12, local59 * local37 >> 12);
					local50 += local64 * local88 >> 12;
				}
				if (this.aBoolean26) {
					local50 = (local50 >> 1) + 2048;
				}
				local16[local39] = local50;
			}
		}
		return local16;
	}
}
