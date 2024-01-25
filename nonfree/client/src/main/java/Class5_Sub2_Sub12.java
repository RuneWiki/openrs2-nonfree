import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public class Class5_Sub2_Sub12 extends Class5_Sub2 {

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "[[J")
	public static final long[][] aLongArrayArray2 = new long[8][256];

	@OriginalMember(owner = "client!fp", name = "O", descriptor = "[J")
	public static final long[] aLongArray13 = new long[11];

	@OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
	protected int anInt5718;

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "[I")
	protected int[] anIntArray423;

	@OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
	protected int anInt5721;

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
	private int anInt5719 = -1;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(17) char local17 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local10 / 2);
			@Pc(30) long local30 = (long) ((local10 & 0x1) == 0 ? local17 >>> 8 : local17 & 0xFF);
			@Pc(34) long local34 = local30 << 1;
			if (local34 >= 256L) {
				local34 ^= 0x11DL;
			}
			@Pc(46) long local46 = local34 << 1;
			if (local46 >= 256L) {
				local46 ^= 0x11DL;
			}
			@Pc(58) long local58 = local46 ^ local30;
			@Pc(62) long local62 = local46 << 1;
			if (local62 >= 256L) {
				local62 ^= 0x11DL;
			}
			@Pc(74) long local74 = local30 ^ local62;
			aLongArrayArray2[0][local10] = Static29.method573(local74, Static29.method573(local34 << 8, Static29.method573(Static29.method573(Static29.method573(local30 << 32, Static29.method573(local46 << 40, Static29.method573(local30 << 48, local30 << 56))), local62 << 24), local58 << 16)));
			for (@Pc(110) int local110 = 1; local110 < 8; local110++) {
				aLongArrayArray2[local110][local10] = Static29.method573(aLongArrayArray2[local110 - 1][local10] >>> 8, aLongArrayArray2[local110 - 1][local10] << 56);
			}
		}
		aLongArray13[0] = 0L;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(158) int local158 = local151 * 8 - 8;
			aLongArray13[local151] = Static43.method744(Static43.method744(Static43.method744(Static43.method744(Static533.method379(4278190080L, aLongArrayArray2[4][local158 + 4]), Static43.method744(Static43.method744(Static43.method744(Static533.method379(aLongArrayArray2[0][local158], -72057594037927936L), Static533.method379(71776119061217280L, aLongArrayArray2[1][local158 + 1])), Static533.method379(aLongArrayArray2[2][local158 + 2], 280375465082880L)), Static533.method379(1095216660480L, aLongArrayArray2[3][local158 + 3]))), Static533.method379(16711680L, aLongArrayArray2[5][local158 + 5])), Static533.method379(aLongArrayArray2[6][local158 + 6], 65280L)), Static533.method379(aLongArrayArray2[7][local158 + 7], 255L));
		}
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)Z")
	protected final boolean method5098() {
		if (this.anIntArray423 != null) {
			return true;
		} else if (this.anInt5719 >= 0) {
			@Pc(33) Class176 local33 = Static109.anInt1720 < 0 ? Static654.method4049(Static469.aClass384_110, this.anInt5719) : Static654.method4046(Static469.aClass384_110, Static109.anInt1720, this.anInt5719);
			local33.method4057();
			this.anIntArray423 = local33.method4047();
			this.anInt5718 = local33.anInt4437;
			this.anInt5721 = local33.anInt4438;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819 && this.method5098()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(56) int local56 = (Static423.anInt7200 == this.anInt5721 ? arg0 : this.anInt5721 * arg0 / Static423.anInt7200) * this.anInt5718;
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (Static314.anInt6320 == this.anInt5718) {
				for (local62 = 0; local62 < Static314.anInt6320; local62++) {
					local71 = this.anIntArray423[local56++];
					local36[local62] = (local71 & 0xFF) << 4;
					local32[local62] = local71 >> 4 & 0xFF0;
					local28[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static314.anInt6320; local62++) {
					local71 = local62 * this.anInt5718 / Static314.anInt6320;
					@Pc(78) int local78 = this.anIntArray423[local71 + local56];
					local36[local62] = (local78 & 0xFF) << 4;
					local32[local62] = local78 >> 4 & 0xFF0;
					local28[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)I")
	@Override
	public final int method8830() {
		return this.anInt5719;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public final void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5719 = arg0.method8631();
		}
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(Z)V")
	@Override
	public final void method8829() {
		super.method8829();
		this.anIntArray423 = null;
	}
}
