import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public abstract class Class11 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[S")
	private short[] aShortArray157;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
	private int anInt9549 = 4;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "[S")
	private final short[] aShortArray156 = new short[512];

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	private int anInt9552 = 4;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	private int anInt9550 = 0;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
	protected int anInt9554 = 4;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	private int anInt9553 = 4;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IIIII)V")
	protected Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9549 = arg4;
		this.anInt9554 = arg1;
		this.anInt9550 = arg0;
		this.anInt9552 = arg2;
		this.anInt9553 = arg3;
		this.method7805();
		this.method7802();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	protected abstract void method7801();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	private void method7802() {
		@Pc(12) Random local12 = new Random((long) this.anInt9550);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray156[local14] = (short) local14;
		}
		for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
			@Pc(37) int local37 = 255 - local30;
			@Pc(42) int local42 = Static29.method431(local37, local12);
			@Pc(47) short local47 = this.aShortArray156[local42];
			this.aShortArray156[local42] = this.aShortArray156[local37];
			this.aShortArray156[local37] = this.aShortArray156[local37 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)V")
	protected abstract void method7804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V")
	private void method7805() {
		this.aShortArray157 = new short[this.anInt9554];
		for (@Pc(12) int local12 = 0; local12 < this.anInt9554; local12++) {
			this.aShortArray157[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
	protected final void method7806() {
		@Pc(14) int[] local14 = new int[128];
		@Pc(17) int[] local17 = new int[128];
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			local14[local19] = (local19 << 12) / 128;
		}
		@Pc(40) int[] local40 = new int[16];
		for (@Pc(42) int local42 = 0; local42 < 128; local42++) {
			local17[local42] = (local42 << 12) / 128;
		}
		for (@Pc(58) int local58 = 0; local58 < 16; local58++) {
			local40[local58] = (local58 << 12) / 16;
		}
		this.method7807();
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
				for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
					for (@Pc(89) int local89 = 0; local89 < this.anInt9554; local89++) {
						@Pc(98) int local98 = this.aShortArray157[local89] << 12;
						@Pc(106) int local106 = local40[local77] * local98 >> 12;
						@Pc(113) int local113 = this.anInt9553 * local98 >> 12;
						@Pc(121) int local121 = local98 * local14[local85] >> 12;
						@Pc(129) int local129 = local98 * local17[local81] >> 12;
						@Pc(136) int local136 = this.anInt9552 * local98 >> 12;
						@Pc(143) int local143 = local98 * this.anInt9549 >> 12;
						@Pc(148) int local148 = local106 * this.anInt9549;
						@Pc(153) int local153 = local129 * this.anInt9553;
						@Pc(158) int local158 = local121 * this.anInt9552;
						@Pc(162) int local162 = local158 >> 12;
						@Pc(166) int local166 = local162 + 1;
						@Pc(170) int local170 = local162 & 0xFF;
						@Pc(174) int local174 = local153 >> 12;
						@Pc(178) int local178 = local174 + 1;
						@Pc(182) int local182 = local148 >> 12;
						@Pc(186) int local186 = local174 & 0xFF;
						@Pc(190) int local190 = local182 + 1;
						@Pc(194) int local194 = local148 & 0xFFF;
						if (local190 < local143) {
							local190 &= 0xFF;
						} else {
							local190 = 0;
						}
						if (local113 <= local178) {
							local178 = 0;
						} else {
							local178 &= 0xFF;
						}
						local182 &= 0xFF;
						if (local136 <= local166) {
							local166 = 0;
						} else {
							local166 &= 0xFF;
						}
						local121 = local158 & 0xFFF;
						local129 = local153 & 0xFFF;
						@Pc(248) short local248 = this.aShortArray156[local190];
						@Pc(252) int local252 = Class6_Sub1_Sub11.anIntArray407[local129];
						@Pc(256) int local256 = local129 - 4096;
						@Pc(260) int local260 = local121 - 4096;
						@Pc(264) int local264 = Class6_Sub1_Sub11.anIntArray407[local121];
						@Pc(269) short local269 = this.aShortArray156[local182];
						@Pc(273) int local273 = local194 - 4096;
						@Pc(277) int local277 = Class6_Sub1_Sub11.anIntArray407[local194];
						@Pc(284) short local284 = this.aShortArray156[local248 + local178];
						@Pc(292) short local292 = this.aShortArray156[local178 + local269];
						@Pc(299) short local299 = this.aShortArray156[local269 + local186];
						@Pc(306) short local306 = this.aShortArray156[local248 + local186];
						@Pc(318) int local318 = Static38.method532(local129, local194, local121, this.aShortArray156[local299 + local170]);
						@Pc(331) int local331 = Static38.method532(local129, local194, local260, this.aShortArray156[local166 + local299]);
						@Pc(342) int local342 = (local264 * (local331 - local318) >> 12) + local318;
						@Pc(355) int local355 = Static38.method532(local256, local194, local121, this.aShortArray156[local170 + local292]);
						@Pc(367) int local367 = Static38.method532(local256, local194, local260, this.aShortArray156[local166 + local292]);
						@Pc(377) int local377 = (local264 * (local367 - local355) >> 12) + local355;
						@Pc(389) int local389 = Static38.method532(local129, local273, local121, this.aShortArray156[local306 + local170]);
						@Pc(400) int local400 = ((local377 - local342) * local252 >> 12) + local342;
						@Pc(412) int local412 = Static38.method532(local129, local273, local260, this.aShortArray156[local166 + local306]);
						@Pc(422) int local422 = (local264 * (local412 - local389) >> 12) + local389;
						@Pc(434) int local434 = Static38.method532(local256, local273, local121, this.aShortArray156[local284 + local170]);
						@Pc(447) int local447 = Static38.method532(local256, local273, local260, this.aShortArray156[local166 + local284]);
						@Pc(457) int local457 = ((local447 - local434) * local264 >> 12) + local434;
						@Pc(468) int local468 = (local252 * (local457 - local422) >> 12) + local422;
						this.method7804(local89, ((local468 - local400) * local277 >> 12) + local400);
					}
					this.method7801();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V")
	protected abstract void method7807();
}
