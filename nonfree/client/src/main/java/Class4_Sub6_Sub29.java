import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class4_Sub6_Sub29 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
	private int anInt5265;

	@OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
	private int anInt5271;

	@OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
	private int anInt5272;

	@OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
	private int anInt5276;

	@OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
	private int anInt5277;

	@OriginalMember(owner = "client!ql", name = "db", descriptor = "I")
	private int anInt5281;

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
	private int anInt5274 = 0;

	@OriginalMember(owner = "client!ql", name = "eb", descriptor = "I")
	private int anInt5282 = 0;

	@OriginalMember(owner = "client!ql", name = "T", descriptor = "I")
	private int anInt5273 = 0;

	static {
		new Class159(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5282 = arg1.method3447();
		} else if (arg0 == 1) {
			this.anInt5274 = (arg1.method3426() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5273 = (arg1.method3426() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)V")
	private void method4549(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = arg2 <= arg1 ? arg1 : arg2;
		@Pc(32) int local32 = arg2 < arg1 ? arg2 : arg1;
		@Pc(43) int local43 = arg0 > local21 ? arg0 : local21;
		@Pc(54) int local54 = arg0 < local32 ? arg0 : local32;
		@Pc(58) int local58 = local43 - local54;
		this.anInt5272 = (local54 + local43) / 2;
		if (this.anInt5272 > 0 && this.anInt5272 < 4096) {
			this.anInt5276 = (local58 << 12) / (this.anInt5272 > 2048 ? 8192 - this.anInt5272 * 2 : this.anInt5272 * 2);
		} else {
			this.anInt5276 = 0;
		}
		if (local58 <= 0) {
			this.anInt5271 = 0;
			return;
		}
		@Pc(119) int local119 = (local43 - arg2 << 12) / local58;
		@Pc(128) int local128 = (local43 - arg1 << 12) / local58;
		@Pc(137) int local137 = (local43 - arg0 << 12) / local58;
		if (local43 == arg2) {
			this.anInt5271 = arg1 == local54 ? local137 + 20480 : -local128 + 4096;
		} else if (local43 == arg1) {
			this.anInt5271 = arg0 == local54 ? local119 + 4096 : 12288 - local137;
		} else {
			this.anInt5271 = arg2 == local54 ? local128 + 12288 : -local119 + 20480;
		}
		this.anInt5271 /= 6;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIII)V")
	private void method4553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(36) int local36 = arg0 > 2048 ? arg1 + arg0 - (arg0 * arg1 >> 12) : (4096 - -arg1) * arg0 >> 12;
		if (local36 <= 0) {
			this.anInt5265 = this.anInt5277 = this.anInt5281 = arg0;
			return;
		}
		@Pc(52) int local52 = arg2 * 6;
		@Pc(59) int local59 = arg0 + arg0 - local36;
		@Pc(68) int local68 = (local36 - local59 << 12) / local36;
		@Pc(72) int local72 = local52 >> 12;
		@Pc(79) int local79 = local52 - (local72 << 12);
		@Pc(87) int local87 = local36 * local68 >> 12;
		@Pc(93) int local93 = local79 * local87 >> 12;
		@Pc(97) int local97 = local93 + local59;
		@Pc(102) int local102 = local36 - local93;
		if (local72 == 0) {
			this.anInt5281 = local59;
			this.anInt5277 = local97;
			this.anInt5265 = local36;
		} else if (local72 == 1) {
			this.anInt5265 = local102;
			this.anInt5281 = local59;
			this.anInt5277 = local36;
		} else if (local72 == 2) {
			this.anInt5265 = local59;
			this.anInt5281 = local97;
			this.anInt5277 = local36;
		} else if (local72 == 3) {
			this.anInt5265 = local59;
			this.anInt5277 = local102;
			this.anInt5281 = local36;
		} else if (local72 == 4) {
			this.anInt5277 = local59;
			this.anInt5265 = local97;
			this.anInt5281 = local36;
		} else if (local72 == 5) {
			this.anInt5277 = local59;
			this.anInt5281 = local102;
			this.anInt5265 = local36;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(28) int[][] local28 = this.method5693(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[1];
			@Pc(52) int[] local52 = local16[2];
			for (@Pc(54) int local54 = 0; local54 < Static31.anInt797; local54++) {
				this.method4549(local40[local54], local36[local54], local32[local54]);
				this.anInt5271 += this.anInt5282;
				this.anInt5272 += this.anInt5273;
				this.anInt5276 += this.anInt5274;
				while (this.anInt5271 < 0) {
					this.anInt5271 += 4096;
				}
				while (this.anInt5271 > 4096) {
					this.anInt5271 -= 4096;
				}
				if (this.anInt5276 < 0) {
					this.anInt5276 = 0;
				}
				if (this.anInt5276 > 4096) {
					this.anInt5276 = 4096;
				}
				if (this.anInt5272 < 0) {
					this.anInt5272 = 0;
				}
				if (this.anInt5272 > 4096) {
					this.anInt5272 = 4096;
				}
				this.method4553(this.anInt5272, this.anInt5276, this.anInt5271);
				local44[local54] = this.anInt5265;
				local48[local54] = this.anInt5277;
				local52[local54] = this.anInt5281;
			}
		}
		return local16;
	}
}
