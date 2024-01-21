import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fi", name = "T", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!fi", name = "ab", descriptor = "[I")
	private int[] anIntArray184;

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
	private int anInt1749;

	@OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
	private int anInt1752;

	@OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
	private int anInt1755;

	@OriginalMember(owner = "client!fi", name = "X", descriptor = "Z")
	private boolean aBoolean137;

	@OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
	private int anInt1758;

	@OriginalMember(owner = "client!fi", name = "Z", descriptor = "[I")
	private int[] anIntArray183;

	@OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
	private int anInt1757;

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
	private void method1317() {
		@Pc(22) int local22;
		if (this.anInt1749 > 0) {
			this.anIntArray182 = new int[this.anInt1758];
			this.anIntArray184 = new int[this.anInt1758];
			for (local22 = 0; local22 < this.anInt1758; local22++) {
				this.anIntArray184[local22] = (int) (Math.pow((double) (this.anInt1749 / 4096), (double) local22) * 4096.0D);
				this.anIntArray182[local22] = (int) (Math.pow(2.0D, (double) local22) * 4096.0D);
			}
		} else if (this.anIntArray184 != null && this.anInt1758 == this.anIntArray184.length) {
			this.anIntArray182 = new int[this.anInt1758];
			for (local22 = 0; local22 < this.anInt1758; local22++) {
				this.anIntArray182[local22] = (int) (Math.pow(2.0D, (double) local22) * 4096.0D);
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		this.method1318();
		this.method1317();
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
	private void method1318() {
		@Pc(8) Random local8 = new Random((long) this.anInt1755);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.anIntArray183[local14] = -1;
		}
		for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
			@Pc(44) int local44;
			do {
				local44 = Static164.method2805(255, local8);
			} while (this.anIntArray183[local44] != -1);
			this.anIntArray183[local44 + 255] = this.anIntArray183[local44] = local35;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)I")
	private int method1319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = arg0 & 0xFFFFF000;
		@Pc(11) int local11 = arg0 - local7;
		@Pc(15) int local15 = arg3 & 0xFFFFF000;
		@Pc(19) int local19 = arg2 & 0xFFFFF000;
		@Pc(23) int local23 = arg3 - local15;
		@Pc(27) int local27 = local15 >> 12;
		@Pc(31) int local31 = local27 + 1;
		@Pc(35) int local35 = local7 >> 12;
		@Pc(39) int local39 = arg1 & 0xFFFFF000;
		@Pc(43) int local43 = local35 + 1;
		@Pc(47) int local47 = local27 & 0xFF;
		@Pc(51) int local51 = local35 & 0xFF;
		@Pc(63) int local63 = this.anIntArray183[this.anIntArray183[local47] + local51] % 4;
		if (local31 >= local39 >> 12) {
			local31 = 0;
		}
		local31 &= 0xFF;
		@Pc(86) int local86 = this.anIntArray183[this.anIntArray183[local31] + local51] % 4;
		if (local43 >= local19 >> 12) {
			local43 = 0;
		}
		local43 &= 0xFF;
		@Pc(109) int local109 = this.anIntArray183[local43 + this.anIntArray183[local47]] % 4;
		@Pc(121) int local121 = this.anIntArray183[local43 + this.anIntArray183[local31]] % 4;
		@Pc(129) int local129 = Static180.method2975(local11, Static135.anIntArrayArray29[local63], local23);
		@Pc(139) int local139 = Static180.method2975(local11 - 4096, Static135.anIntArrayArray29[local109], local23);
		@Pc(149) int local149 = Static180.method2975(local11, Static135.anIntArrayArray29[local86], local23 - 4096);
		@Pc(161) int local161 = Static180.method2975(local11 - 4096, Static135.anIntArrayArray29[local121], local23 - 4096);
		@Pc(165) int local165 = Static44.method1174(local11);
		@Pc(171) int local171 = Static44.method1174(local23);
		@Pc(177) int local177 = Static97.method3057(local129, local139, local165);
		@Pc(185) int local185 = Static97.method3057(local149, local161, local165);
		return Static97.method3057(local177, local185, local171);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.aBoolean137 = arg1.method1607() == 1;
		} else if (arg0 == 1) {
			this.anInt1758 = arg1.method1607();
		} else if (arg0 == 2) {
			this.anInt1749 = arg1.method1627();
			if (this.anInt1749 < 0) {
				this.anIntArray184 = new int[this.anInt1758];
				for (@Pc(72) int local72 = 0; local72 < this.anInt1758; local72++) {
					this.anIntArray184[local72] = arg1.method1627();
				}
			}
		} else if (arg0 == 3) {
			this.anInt1757 = this.anInt1752 = arg1.method1607();
		} else if (arg0 == 4) {
			this.anInt1755 = arg1.method1607();
		} else if (arg0 == 5) {
			this.anInt1757 = arg1.method1607();
		} else if (arg0 == 6) {
			this.anInt1752 = arg1.method1607();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(25) int local25 = this.anInt1757 << 12;
			@Pc(30) int local30 = this.anInt1752 << 12;
			@Pc(37) int local37 = Static18.anIntArray101[arg0] * this.anInt1752;
			for (@Pc(39) int local39 = 0; local39 < Static65.anInt1933; local39++) {
				@Pc(48) int local48 = Static106.anIntArray284[local39] * this.anInt1757;
				@Pc(50) int local50 = 0;
				for (@Pc(52) int local52 = 0; local52 < this.anInt1758; local52++) {
					@Pc(59) int local59 = this.anIntArray182[local52];
					@Pc(64) int local64 = this.anIntArray184[local52];
					@Pc(88) int local88 = this.method1319(local59 * local48 >> 12, local30 * local59 >> 12, local25 * local59 >> 12, local37 * local59 >> 12);
					local50 += local88 * local64 >> 12;
				}
				if (this.aBoolean137) {
					local50 = (local50 >> 1) + 2048;
				}
				local16[local39] = local50;
			}
		}
		return local16;
	}
}
