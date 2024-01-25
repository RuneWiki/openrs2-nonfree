import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class11_Sub2_Sub10 extends Class11_Sub2 {

	@OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
	private int anInt1955;

	@OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
	private int anInt1956;

	@OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
	private int anInt1957;

	@OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
	private int anInt1961;

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
	private int anInt1962;

	@OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
	private int anInt1967;

	@OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
	private int anInt1959 = 0;

	@OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
	private int anInt1963 = 0;

	@OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
	private int anInt1960 = 0;

	static {
		new Class117("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1960 = arg0.method5220();
		} else if (arg1 == 1) {
			this.anInt1963 = (arg0.method5175() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1959 = (arg0.method5175() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)V")
	private void method1611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = arg0 >= arg2 ? arg0 : arg2;
		@Pc(28) int local28 = arg0 <= arg2 ? arg0 : arg2;
		@Pc(39) int local39 = arg1 > local21 ? arg1 : local21;
		@Pc(46) int local46 = local28 > arg1 ? arg1 : local28;
		this.anInt1955 = (local39 + local46) / 2;
		@Pc(58) int local58 = local39 - local46;
		if (local58 > 0) {
			@Pc(72) int local72 = (local39 - arg2 << 12) / local58;
			@Pc(80) int local80 = (local39 - arg0 << 12) / local58;
			@Pc(88) int local88 = (local39 - arg1 << 12) / local58;
			if (local39 == arg2) {
				this.anInt1956 = local46 == arg0 ? local88 + 20480 : -local80 + 4096;
			} else if (arg0 == local39) {
				this.anInt1956 = local46 == arg1 ? local72 + 4096 : -local88 + 12288;
			} else {
				this.anInt1956 = local46 == arg2 ? local80 + 12288 : -local72 + 20480;
			}
			this.anInt1956 /= 6;
		} else {
			this.anInt1956 = 0;
		}
		if (this.anInt1955 > 0 && this.anInt1955 < 4096) {
			this.anInt1957 = (local58 << 12) / (this.anInt1955 > 2048 ? 8192 - (this.anInt1955 * 2) : this.anInt1955 * 2);
		} else {
			this.anInt1957 = 0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(28) int[][] local28 = this.method5715(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static339.anInt6549; local54++) {
				this.method1611(local36[local54], local40[local54], local32[local54]);
				this.anInt1956 += this.anInt1960;
				this.anInt1955 += this.anInt1959;
				this.anInt1957 += this.anInt1963;
				while (this.anInt1956 < 0) {
					this.anInt1956 += 4096;
				}
				while (this.anInt1956 > 4096) {
					this.anInt1956 -= 4096;
				}
				if (this.anInt1957 < 0) {
					this.anInt1957 = 0;
				}
				if (this.anInt1955 < 0) {
					this.anInt1955 = 0;
				}
				if (this.anInt1957 > 4096) {
					this.anInt1957 = 4096;
				}
				if (this.anInt1955 > 4096) {
					this.anInt1955 = 4096;
				}
				this.method1614(this.anInt1957, this.anInt1956, this.anInt1955);
				local44[local54] = this.anInt1967;
				local48[local54] = this.anInt1962;
				local52[local54] = this.anInt1961;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIII)V")
	private void method1614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(27) int local27 = arg2 > 2048 ? arg0 + arg2 - (arg0 * arg2 >> 12) : (arg0 + 4096) * arg2 >> 12;
		if (local27 <= 0) {
			this.anInt1967 = this.anInt1962 = this.anInt1961 = arg2;
			return;
		}
		@Pc(48) int local48 = arg1 * 6;
		@Pc(54) int local54 = arg2 + arg2 - local27;
		@Pc(63) int local63 = (local27 - local54 << 12) / local27;
		@Pc(67) int local67 = local48 >> 12;
		@Pc(74) int local74 = local48 - (local67 << 12);
		@Pc(82) int local82 = local63 * local27 >> 12;
		@Pc(88) int local88 = local82 * local74 >> 12;
		@Pc(93) int local93 = local54 + local88;
		@Pc(97) int local97 = local27 - local88;
		if (local67 == 0) {
			this.anInt1962 = local93;
			this.anInt1961 = local54;
			this.anInt1967 = local27;
		} else if (local67 == 1) {
			this.anInt1961 = local54;
			this.anInt1962 = local27;
			this.anInt1967 = local97;
		} else if (local67 == 2) {
			this.anInt1967 = local54;
			this.anInt1961 = local93;
			this.anInt1962 = local27;
		} else if (local67 == 3) {
			this.anInt1962 = local97;
			this.anInt1961 = local27;
			this.anInt1967 = local54;
		} else if (local67 == 4) {
			this.anInt1962 = local54;
			this.anInt1967 = local93;
			this.anInt1961 = local27;
		} else if (local67 == 5) {
			this.anInt1962 = local54;
			this.anInt1961 = local97;
			this.anInt1967 = local27;
		}
	}
}
