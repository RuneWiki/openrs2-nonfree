import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public abstract class Class25 {

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "[S")
	private final short[] aShortArray57 = new short[512];

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	private int anInt4215 = 4;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
	private int anInt4216 = 4;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
	private int anInt4212 = 0;

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
	protected int anInt4221 = 4;

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
	private int anInt4222 = 4;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIII)V")
	protected Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4215 = arg3;
		this.anInt4212 = arg0;
		this.anInt4216 = arg4;
		this.anInt4222 = arg2;
		this.anInt4221 = arg1;
		this.method3647();
		this.method3644();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)V")
	protected final void method3639() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local14[local52] = (local52 << 12) / 16;
		}
		this.method3642();
		for (@Pc(77) int local77 = 0; local77 < 16; local77++) {
			for (@Pc(81) int local81 = 0; local81 < 128; local81++) {
				for (@Pc(85) int local85 = 0; local85 < 128; local85++) {
					for (@Pc(89) int local89 = 0; local89 < this.anInt4221; local89++) {
						@Pc(98) int local98 = this.aShortArray58[local89] << 12;
						@Pc(106) int local106 = local98 * local8[local85] >> 12;
						@Pc(114) int local114 = local14[local77] * local98 >> 12;
						@Pc(122) int local122 = local98 * local11[local81] >> 12;
						@Pc(129) int local129 = this.anInt4215 * local98 >> 12;
						@Pc(136) int local136 = local98 * this.anInt4222 >> 12;
						@Pc(143) int local143 = this.anInt4216 * local98 >> 12;
						@Pc(148) int local148 = local106 * this.anInt4222;
						@Pc(153) int local153 = local122 * this.anInt4215;
						@Pc(158) int local158 = local114 * this.anInt4216;
						@Pc(162) int local162 = local148 >> 12;
						@Pc(166) int local166 = local162 + 1;
						@Pc(170) int local170 = local162 & 0xFF;
						@Pc(174) int local174 = local153 >> 12;
						@Pc(178) int local178 = local174 + 1;
						@Pc(182) int local182 = local158 >> 12;
						@Pc(186) int local186 = local174 & 0xFF;
						@Pc(190) int local190 = local182 + 1;
						@Pc(194) int local194 = local182 & 0xFF;
						@Pc(198) int local198 = local148 & 0xFFF;
						if (local178 < local129) {
							local178 &= 0xFF;
						} else {
							local178 = 0;
						}
						local114 = local158 & 0xFFF;
						if (local190 >= local143) {
							local190 = 0;
						} else {
							local190 &= 0xFF;
						}
						local122 = local153 & 0xFFF;
						if (local166 >= local136) {
							local166 = 0;
						} else {
							local166 &= 0xFF;
						}
						@Pc(247) int local247 = local198 - 4096;
						@Pc(251) int local251 = Class168_Sub2.anIntArray620[local198];
						@Pc(255) int local255 = local114 - 4096;
						@Pc(260) short local260 = this.aShortArray57[local194];
						@Pc(264) int local264 = Class168_Sub2.anIntArray620[local122];
						@Pc(269) short local269 = this.aShortArray57[local190];
						@Pc(273) int local273 = Class168_Sub2.anIntArray620[local114];
						@Pc(277) int local277 = local122 - 4096;
						@Pc(284) short local284 = this.aShortArray57[local269 + local186];
						@Pc(291) short local291 = this.aShortArray57[local186 + local260];
						@Pc(298) short local298 = this.aShortArray57[local269 + local178];
						@Pc(306) short local306 = this.aShortArray57[local178 + local260];
						@Pc(318) int local318 = Static180.method3197(local198, local114, local122, this.aShortArray57[local291 + local170]);
						@Pc(331) int local331 = Static180.method3197(local247, local114, local122, this.aShortArray57[local166 + local291]);
						@Pc(343) int local343 = local318 + ((local331 - local318) * local251 >> 12);
						@Pc(355) int local355 = Static180.method3197(local198, local114, local277, this.aShortArray57[local306 + local170]);
						@Pc(367) int local367 = Static180.method3197(local247, local114, local277, this.aShortArray57[local306 + local166]);
						@Pc(378) int local378 = ((local367 - local355) * local251 >> 12) + local355;
						@Pc(391) int local391 = Static180.method3197(local198, local255, local122, this.aShortArray57[local170 + local284]);
						@Pc(401) int local401 = local343 + ((local378 - local343) * local264 >> 12);
						@Pc(413) int local413 = Static180.method3197(local247, local255, local122, this.aShortArray57[local166 + local284]);
						@Pc(424) int local424 = ((local413 - local391) * local251 >> 12) + local391;
						@Pc(436) int local436 = Static180.method3197(local198, local255, local277, this.aShortArray57[local298 + local170]);
						@Pc(450) int local450 = Static180.method3197(local247, local255, local277, this.aShortArray57[local298 + local166]);
						@Pc(460) int local460 = ((local450 - local436) * local251 >> 12) + local436;
						@Pc(471) int local471 = local424 + (local264 * (local460 - local424) >> 12);
						this.method3646(local89, local401 + (local273 * (local471 - local401) >> 12));
					}
					this.method3640();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	protected abstract void method3640();

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	protected abstract void method3642();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	private void method3644() {
		@Pc(12) Random local12 = new Random((long) this.anInt4212);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray57[local14] = (short) local14;
		}
		for (@Pc(34) int local34 = 0; local34 < 255; local34++) {
			@Pc(41) int local41 = 255 - local34;
			@Pc(46) int local46 = Static304.method5274(local12, local41);
			@Pc(51) short local51 = this.aShortArray57[local46];
			this.aShortArray57[local46] = this.aShortArray57[local41];
			this.aShortArray57[local41] = this.aShortArray57[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBI)V")
	protected abstract void method3646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V")
	private void method3647() {
		this.aShortArray58 = new short[this.anInt4221];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4221; local16++) {
			this.aShortArray58[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}
}
