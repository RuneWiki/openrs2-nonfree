import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class3_Sub1_Sub34 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "[I")
	private int[] anIntArray416;

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
	private int anInt3662;

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
	private int anInt3669;

	@OriginalMember(owner = "client!ue", name = "fb", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!ue", name = "gb", descriptor = "I")
	private int anInt3671;

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
	private int anInt3670;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "Z")
	private boolean aBoolean156;

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "I")
	private int anInt3659;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
	private void method2649() {
		@Pc(8) Random local8 = new Random((long) this.anInt3659);
		for (@Pc(10) int local10 = 0; local10 < 255; local10++) {
			this.anIntArray417[local10] = -1;
		}
		for (@Pc(28) int local28 = 0; local28 < 255; local28++) {
			@Pc(37) int local37;
			do {
				local37 = Static54.method1020(255, local8);
			} while (this.anIntArray417[local37] != -1);
			this.anIntArray417[local37 + 255] = this.anIntArray417[local37] = local28;
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
	private void method2650() {
		@Pc(23) int local23;
		if (this.anInt3671 > 0) {
			this.anIntArray415 = new int[this.anInt3662];
			this.anIntArray416 = new int[this.anInt3662];
			for (local23 = 0; local23 < this.anInt3662; local23++) {
				this.anIntArray415[local23] = (int) (Math.pow((double) (this.anInt3671 / 4096), (double) local23) * 4096.0D);
				this.anIntArray416[local23] = (int) (Math.pow(2.0D, (double) local23) * 4096.0D);
			}
		} else if (this.anIntArray415 != null && this.anIntArray415.length == this.anInt3662) {
			this.anIntArray416 = new int[this.anInt3662];
			for (local23 = 0; local23 < this.anInt3662; local23++) {
				this.anIntArray416[local23] = (int) (Math.pow(2.0D, (double) local23) * 4096.0D);
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2911(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_39.method2720(arg0);
		if (super.aClass82_39.aBoolean160) {
			@Pc(20) int local20 = this.anInt3670 << 12;
			@Pc(27) int local27 = this.anInt3669 * Static125.anIntArray336[arg0];
			@Pc(32) int local32 = this.anInt3669 << 12;
			for (@Pc(34) int local34 = 0; local34 < Static141.anInt3261; local34++) {
				@Pc(38) int local38 = 0;
				@Pc(45) int local45 = Static85.anIntArray47[local34] * this.anInt3670;
				for (@Pc(47) int local47 = 0; local47 < this.anInt3662; local47++) {
					@Pc(54) int local54 = this.anIntArray416[local47];
					@Pc(59) int local59 = this.anIntArray415[local47];
					@Pc(83) int local83 = this.method2653(local32 * local54 >> 12, local45 * local54 >> 12, local20 * local54 >> 12, local27 * local54 >> 12);
					local38 += local59 * local83 >> 12;
				}
				if (this.aBoolean156) {
					local38 = (local38 >> 1) + 2048;
				}
				local11[local34] = local38;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
	@Override
	public void method2916() {
		this.method2649();
		this.method2650();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIIII)I")
	private int method2653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xFFFFF000;
		@Pc(11) int local11 = arg1 - local7;
		@Pc(15) int local15 = local7 >> 12;
		@Pc(19) int local19 = local15 + 1;
		@Pc(23) int local23 = local15 & 0xFF;
		@Pc(27) int local27 = arg3 & 0xFFFFF000;
		@Pc(31) int local31 = arg3 - local27;
		@Pc(35) int local35 = local27 >> 12;
		@Pc(39) int local39 = local35 + 1;
		@Pc(51) int local51 = local35 & 0xFF;
		@Pc(55) int local55 = arg0 & 0xFFFFF000;
		if (local39 >= local55 >> 12) {
			local39 = 0;
		}
		@Pc(70) int local70 = arg2 & 0xFFFFF000;
		if (local70 >> 12 <= local19) {
			local19 = 0;
		}
		@Pc(93) int local93 = this.anIntArray417[local23 + this.anIntArray417[local51]] % 4;
		local39 &= 0xFF;
		local19 &= 0xFF;
		@Pc(113) int local113 = this.anIntArray417[this.anIntArray417[local51] + local19] % 4;
		@Pc(125) int local125 = this.anIntArray417[local19 + this.anIntArray417[local39]] % 4;
		@Pc(137) int local137 = this.anIntArray417[this.anIntArray417[local39] + local23] % 4;
		@Pc(145) int local145 = Static61.method1129(local31, local11, Static35.anIntArrayArray2[local93]);
		@Pc(155) int local155 = Static61.method1129(local31, local11 - 4096, Static35.anIntArrayArray2[local113]);
		@Pc(165) int local165 = Static61.method1129(local31 - 4096, local11, Static35.anIntArrayArray2[local137]);
		@Pc(177) int local177 = Static61.method1129(local31 - 4096, local11 + -4096, Static35.anIntArrayArray2[local125]);
		@Pc(181) int local181 = Static145.method2410(local11);
		@Pc(185) int local185 = Static145.method2410(local31);
		@Pc(191) int local191 = Static7.method101(local155, local145, local181);
		@Pc(197) int local197 = Static7.method101(local177, local165, local181);
		return Static7.method101(local197, local191, local185);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BILclient!rd;)V")
	@Override
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.aBoolean156 = arg1.method191() == 1;
		} else if (arg0 == 1) {
			this.anInt3662 = arg1.method191();
		} else if (arg0 == 2) {
			this.anInt3671 = arg1.method220();
			if (this.anInt3671 < 0) {
				this.anIntArray415 = new int[this.anInt3662];
				for (@Pc(73) int local73 = 0; local73 < this.anInt3662; local73++) {
					this.anIntArray415[local73] = arg1.method220();
				}
			}
		} else if (arg0 == 3) {
			this.anInt3670 = this.anInt3669 = arg1.method191();
		} else if (arg0 == 4) {
			this.anInt3659 = arg1.method191();
		} else if (arg0 == 5) {
			this.anInt3670 = arg1.method191();
		} else if (arg0 == 6) {
			this.anInt3669 = arg1.method191();
		}
	}
}
