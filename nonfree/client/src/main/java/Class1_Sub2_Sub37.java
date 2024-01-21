import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class1_Sub2_Sub37 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wg", name = "db", descriptor = "[I")
	private int[] anIntArray607;

	@OriginalMember(owner = "client!wg", name = "kb", descriptor = "[I")
	private int[] anIntArray609;

	@OriginalMember(owner = "client!wg", name = "fb", descriptor = "[I")
	private int[] anIntArray608;

	@OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
	private int anInt4341;

	@OriginalMember(owner = "client!wg", name = "lb", descriptor = "Z")
	private boolean aBoolean216;

	@OriginalMember(owner = "client!wg", name = "sb", descriptor = "I")
	private int anInt4348;

	@OriginalMember(owner = "client!wg", name = "jb", descriptor = "I")
	private int anInt4343;

	@OriginalMember(owner = "client!wg", name = "vb", descriptor = "I")
	private int anInt4350;

	@OriginalMember(owner = "client!wg", name = "rb", descriptor = "I")
	private int anInt4347;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V")
	private void method3133() {
		@Pc(23) int local23;
		if (this.anInt4341 > 0) {
			this.anIntArray609 = new int[this.anInt4343];
			this.anIntArray607 = new int[this.anInt4343];
			for (local23 = 0; local23 < this.anInt4343; local23++) {
				this.anIntArray607[local23] = (int) (Math.pow((double) (this.anInt4341 / 4096), (double) local23) * 4096.0D);
				this.anIntArray609[local23] = (int) (Math.pow(2.0D, (double) local23) * 4096.0D);
			}
		} else if (this.anIntArray607 != null && this.anIntArray607.length == this.anInt4343) {
			this.anIntArray609 = new int[this.anInt4343];
			for (local23 = 0; local23 < this.anInt4343; local23++) {
				this.anIntArray609[local23] = (int) (Math.pow(2.0D, (double) local23) * 4096.0D);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean216 = arg0.method861() == 1;
		} else if (arg1 == 1) {
			this.anInt4343 = arg0.method861();
		} else if (arg1 == 2) {
			this.anInt4341 = arg0.method875();
			if (this.anInt4341 < 0) {
				this.anIntArray607 = new int[this.anInt4343];
				for (@Pc(75) int local75 = 0; local75 < this.anInt4343; local75++) {
					this.anIntArray607[local75] = arg0.method875();
				}
			}
		} else if (arg1 == 3) {
			this.anInt4350 = this.anInt4347 = arg0.method861();
		} else if (arg1 == 4) {
			this.anInt4348 = arg0.method861();
		} else if (arg1 == 5) {
			this.anInt4350 = arg0.method861();
		} else if (arg1 == 6) {
			this.anInt4347 = arg0.method861();
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		this.method3137();
		this.method3133();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIIII)I")
	private int method3136(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xFFFFF000;
		@Pc(11) int local11 = arg1 - local7;
		@Pc(15) int local15 = local7 >> 12;
		@Pc(19) int local19 = arg0 & 0xFFFFF000;
		@Pc(23) int local23 = local15 + 1;
		@Pc(27) int local27 = arg2 & 0xFFFFF000;
		@Pc(31) int local31 = local15 & 0xFF;
		@Pc(35) int local35 = arg2 - local27;
		@Pc(39) int local39 = arg3 & 0xFFFFF000;
		if (local39 >> 12 <= local23) {
			local23 = 0;
		}
		local23 &= 0xFF;
		local27 >>= 0xC;
		@Pc(58) int local58 = local27 + 1;
		local27 &= 0xFF;
		if (local19 >> 12 <= local58) {
			local58 = 0;
		}
		local58 &= 0xFF;
		@Pc(86) int local86 = this.anIntArray608[local58 + this.anIntArray608[local23]] % 4;
		@Pc(98) int local98 = this.anIntArray608[this.anIntArray608[local23] + local27] % 4;
		@Pc(110) int local110 = this.anIntArray608[this.anIntArray608[local31] + local58] % 4;
		@Pc(123) int local123 = this.anIntArray608[local27 + this.anIntArray608[local31]] % 4;
		@Pc(131) int local131 = Static130.method2307(Static132.anIntArrayArray38[local123], local35, local11);
		@Pc(149) int local149 = Static130.method2307(Static132.anIntArrayArray38[local110], local35 - 4096, local11);
		@Pc(159) int local159 = Static130.method2307(Static132.anIntArrayArray38[local98], local35, local11 - 4096);
		@Pc(171) int local171 = Static130.method2307(Static132.anIntArrayArray38[local86], local35 - 4096, local11 + -4096);
		@Pc(175) int local175 = Static155.method2630(local35);
		@Pc(179) int local179 = Static155.method2630(local11);
		@Pc(185) int local185 = Static16.method281(local131, local175, local149);
		@Pc(191) int local191 = Static16.method281(local159, local175, local171);
		return Static16.method281(local185, local179, local191);
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
	private void method3137() {
		@Pc(12) Random local12 = new Random((long) this.anInt4348);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.anIntArray608[local14] = -1;
		}
		for (@Pc(27) int local27 = 0; local27 < 255; local27++) {
			@Pc(34) int local34;
			do {
				local34 = Static137.method2402(local12, 255);
			} while (this.anIntArray608[local34] != -1);
			this.anIntArray608[local34 + 255] = this.anIntArray608[local34] = local27;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(28) int local28 = Static37.anIntArray125[arg0] * this.anInt4347;
			@Pc(33) int local33 = this.anInt4350 << 12;
			@Pc(38) int local38 = this.anInt4347 << 12;
			for (@Pc(40) int local40 = 0; local40 < Static110.anInt2825; local40++) {
				@Pc(44) int local44 = 0;
				@Pc(51) int local51 = this.anInt4350 * Static86.anIntArray294[local40];
				for (@Pc(53) int local53 = 0; local53 < this.anInt4343; local53++) {
					@Pc(60) int local60 = this.anIntArray609[local53];
					@Pc(65) int local65 = this.anIntArray607[local53];
					@Pc(89) int local89 = this.method3136(local60 * local33 >> 12, local28 * local60 >> 12, local60 * local51 >> 12, local38 * local60 >> 12);
					local44 += local89 * local65 >> 12;
				}
				if (this.aBoolean216) {
					local44 = (local44 >> 1) + 2048;
				}
				local17[local40] = local44;
			}
		}
		return local17;
	}
}
