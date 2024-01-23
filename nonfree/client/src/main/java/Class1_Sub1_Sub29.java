import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class1_Sub1_Sub29 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ph", name = "jb", descriptor = "[I")
	public static int[] anIntArray464 = new int[32];

	@OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
	private int anInt4545 = 8192;

	@OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
	private int anInt4546 = 4096;

	@OriginalMember(owner = "client!ph", name = "bb", descriptor = "I")
	private int anInt4551 = 12288;

	@OriginalMember(owner = "client!ph", name = "eb", descriptor = "I")
	private int anInt4554 = 0;

	@OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
	private int anInt4552 = 2048;

	@OriginalMember(owner = "client!ph", name = "Z", descriptor = "I")
	private int anInt4549 = 2048;

	@OriginalMember(owner = "client!ph", name = "db", descriptor = "I")
	private int anInt4553 = 0;

	static {
		@Pc(12) int local12 = 2;
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			anIntArray464[local14] = local12 - 1;
			local12 += local12;
		}
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(27) int local27 = Static98.anIntArray221[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static75.anInt1848; local29++) {
				@Pc(38) int local38 = Static157.anIntArray331[local29] - 2048;
				@Pc(43) int local43 = this.anInt4553 + local27;
				@Pc(52) int local52 = local43 < -2048 ? local43 + 4096 : local43;
				@Pc(57) int local57 = this.anInt4549 + local38;
				@Pc(66) int local66 = local57 < -2048 ? local57 + 4096 : local57;
				@Pc(75) int local75 = local66 > 2048 ? local66 - 4096 : local66;
				@Pc(86) int local86 = local52 <= 2048 ? local52 : local52 - 4096;
				@Pc(91) int local91 = this.anInt4552 + local27;
				@Pc(102) int local102 = local91 < -2048 ? local91 + 4096 : local91;
				@Pc(108) int local108 = local38 + this.anInt4554;
				@Pc(117) int local117 = local108 >= -2048 ? local108 : local108 + 4096;
				@Pc(128) int local128 = local117 > 2048 ? local117 - 4096 : local117;
				@Pc(137) int local137 = local102 <= 2048 ? local102 : local102 - 4096;
				local17[local29] = this.method3642(local75, local86) || this.method3641(local137, local128) ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(III)Z")
	private boolean method3641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt4551 * (arg1 + arg0) >> 12;
		@Pc(27) int local27 = Static74.anIntArray191[local13 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt4551;
		@Pc(41) int local41 = (local34 << 12) / this.anInt4545;
		@Pc(48) int local48 = local41 * this.anInt4546 >> 12;
		return arg0 - arg1 < local48 && -local48 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(III)Z")
	private boolean method3642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = this.anInt4551 * (arg1 - arg0) >> 12;
		@Pc(23) int local23 = Static74.anIntArray191[local9 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt4551;
		@Pc(37) int local37 = (local30 << 12) / this.anInt4545;
		@Pc(44) int local44 = this.anInt4546 * local37 >> 12;
		return arg0 + arg1 < local44 && arg1 + arg0 > -local44;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4549 = arg0.method2652();
		} else if (arg1 == 1) {
			this.anInt4553 = arg0.method2652();
		} else if (arg1 == 2) {
			this.anInt4554 = arg0.method2652();
		} else if (arg1 == 3) {
			this.anInt4552 = arg0.method2652();
		} else if (arg1 == 4) {
			this.anInt4551 = arg0.method2652();
		} else if (arg1 == 5) {
			this.anInt4546 = arg0.method2652();
		} else if (arg1 == 6) {
			this.anInt4545 = arg0.method2652();
		}
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		Static39.method882();
	}
}
