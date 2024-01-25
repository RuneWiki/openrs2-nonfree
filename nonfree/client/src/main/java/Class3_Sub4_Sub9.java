import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class3_Sub4_Sub9 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ew", name = "Q", descriptor = "I")
	private int anInt2357;

	@OriginalMember(owner = "client!ew", name = "T", descriptor = "I")
	private int anInt2358;

	@OriginalMember(owner = "client!ew", name = "V", descriptor = "I")
	private int anInt2360;

	@OriginalMember(owner = "client!ew", name = "W", descriptor = "I")
	private int anInt2361;

	@OriginalMember(owner = "client!ew", name = "Z", descriptor = "I")
	private int anInt2364;

	@OriginalMember(owner = "client!ew", name = "ab", descriptor = "I")
	private int anInt2365;

	@OriginalMember(owner = "client!ew", name = "U", descriptor = "I")
	private int anInt2359 = 0;

	@OriginalMember(owner = "client!ew", name = "N", descriptor = "I")
	private int anInt2355 = 0;

	@OriginalMember(owner = "client!ew", name = "bb", descriptor = "I")
	private int anInt2366 = 0;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2366 = arg1.method6039();
		} else if (arg0 == 1) {
			this.anInt2359 = (arg1.method6011() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt2355 = (arg1.method6011() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BIII)V")
	private void method1823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg2 >= arg0 ? arg2 : arg0;
		@Pc(31) int local31 = arg2 > arg0 ? arg0 : arg2;
		@Pc(38) int local38 = arg1 <= local20 ? local20 : arg1;
		@Pc(45) int local45 = local31 > arg1 ? arg1 : local31;
		@Pc(50) int local50 = local38 - local45;
		this.anInt2360 = (local38 + local45) / 2;
		if (local50 > 0) {
			@Pc(71) int local71 = (local38 - arg0 << 12) / local50;
			@Pc(80) int local80 = (local38 - arg2 << 12) / local50;
			@Pc(89) int local89 = (local38 - arg1 << 12) / local50;
			if (arg0 == local38) {
				this.anInt2357 = arg2 == local45 ? local89 + 20480 : -local80 + 4096;
			} else if (local38 == arg2) {
				this.anInt2357 = local45 == arg1 ? local71 + 4096 : -local89 + 12288;
			} else {
				this.anInt2357 = arg0 == local45 ? local80 + 12288 : 20480 - local71;
			}
			this.anInt2357 /= 6;
		} else {
			this.anInt2357 = 0;
		}
		if (this.anInt2360 > 0 && this.anInt2360 < 4096) {
			this.anInt2358 = (local50 << 12) / (this.anInt2360 > 2048 ? 8192 - (this.anInt2360 * 2) : this.anInt2360 * 2);
		} else {
			this.anInt2358 = 0;
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(BIII)V")
	private void method1824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(36) int local36 = arg0 > 2048 ? arg0 + arg2 - (arg2 * arg0 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local36 <= 0) {
			this.anInt2361 = this.anInt2365 = this.anInt2364 = arg0;
			return;
		}
		@Pc(55) int local55 = arg1 * 6;
		@Pc(61) int local61 = arg0 + arg0 - local36;
		@Pc(70) int local70 = (local36 - local61 << 12) / local36;
		@Pc(74) int local74 = local55 >> 12;
		@Pc(81) int local81 = local55 - (local74 << 12);
		@Pc(89) int local89 = local36 * local70 >> 12;
		@Pc(95) int local95 = local81 * local89 >> 12;
		@Pc(99) int local99 = local61 + local95;
		@Pc(103) int local103 = local36 - local95;
		if (local74 == 0) {
			this.anInt2364 = local61;
			this.anInt2365 = local99;
			this.anInt2361 = local36;
		} else if (local74 == 1) {
			this.anInt2364 = local61;
			this.anInt2365 = local36;
			this.anInt2361 = local103;
		} else if (local74 == 2) {
			this.anInt2361 = local61;
			this.anInt2364 = local99;
			this.anInt2365 = local36;
		} else if (local74 == 3) {
			this.anInt2364 = local36;
			this.anInt2365 = local103;
			this.anInt2361 = local61;
		} else if (local74 == 4) {
			this.anInt2365 = local61;
			this.anInt2364 = local36;
			this.anInt2361 = local99;
		} else if (local74 == 5) {
			this.anInt2361 = local36;
			this.anInt2365 = local61;
			this.anInt2364 = local103;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(27) int[][] local27 = this.method5962(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static106.anInt2356; local53++) {
				this.method1823(local31[local53], local39[local53], local35[local53]);
				this.anInt2360 += this.anInt2355;
				this.anInt2357 += this.anInt2366;
				this.anInt2358 += this.anInt2359;
				while (this.anInt2357 < 0) {
					this.anInt2357 += 4096;
				}
				while (this.anInt2357 > 4096) {
					this.anInt2357 -= 4096;
				}
				if (this.anInt2358 < 0) {
					this.anInt2358 = 0;
				}
				if (this.anInt2358 > 4096) {
					this.anInt2358 = 4096;
				}
				if (this.anInt2360 < 0) {
					this.anInt2360 = 0;
				}
				if (this.anInt2360 > 4096) {
					this.anInt2360 = 4096;
				}
				this.method1824(this.anInt2360, this.anInt2357, this.anInt2358);
				local43[local53] = this.anInt2361;
				local47[local53] = this.anInt2365;
				local51[local53] = this.anInt2364;
			}
		}
		return local11;
	}
}
