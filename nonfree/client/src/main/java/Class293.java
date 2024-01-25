import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class293 {

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
	public int anInt8405;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "[I")
	public int[] anIntArray655;

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "[I")
	public int[] anIntArray656;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
	public int anInt8406;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "[[I")
	public int[][] anIntArrayArray79;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "[I")
	public int[] anIntArray657;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "[Lclient!so;")
	public Class267[] aClass267Array1;

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
	public int anInt8408;

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "Lclient!so;")
	public Class267 aClass267_1;

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "[[B")
	public byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "[I")
	public int[] anIntArray658;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "[I")
	public int[] anIntArray659;

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "[I")
	public int[] anIntArray660;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
	public final int anInt8404;

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "[B")
	private byte[] aByteArray106;

	static {
		new Class114("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([BI[B)V")
	public Class293(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.anInt8404 = Static402.method7867(arg0, arg0.length);
		if (this.anInt8404 != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.aByteArray106 = Static528.method7532(arg0, arg0.length, 0);
			for (@Pc(36) int local36 = 0; local36 < 64; local36++) {
				if (this.aByteArray106[local36] != arg2[local36]) {
					throw new RuntimeException();
				}
			}
		}
		this.method7104(arg0);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[B)V")
	private void method7104(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub13 local10 = new Class1_Sub13(Static74.method1949(arg0));
		@Pc(14) int local14 = local10.method3043();
		if (local14 < 5 || local14 > 6) {
			throw new RuntimeException();
		}
		if (local14 < 6) {
			this.anInt8405 = 0;
		} else {
			this.anInt8405 = local10.method3037();
		}
		@Pc(42) int local42 = local10.method3043();
		@Pc(54) boolean local54 = (local42 & 0x1) != 0;
		this.anInt8406 = local10.method3056();
		@Pc(67) boolean local67 = (local42 & 0x2) != 0;
		@Pc(69) int local69 = 0;
		this.anIntArray657 = new int[this.anInt8406];
		@Pc(76) int local76 = -1;
		for (@Pc(78) int local78 = 0; local78 < this.anInt8406; local78++) {
			this.anIntArray657[local78] = local69 += local10.method3056();
			if (local76 < this.anIntArray657[local78]) {
				local76 = this.anIntArray657[local78];
			}
		}
		this.anInt8408 = local76 + 1;
		this.anIntArray656 = new int[this.anInt8408];
		this.anIntArray659 = new int[this.anInt8408];
		this.anIntArrayArray78 = new int[this.anInt8408][];
		if (local67) {
			this.aByteArrayArray31 = new byte[this.anInt8408][];
		}
		this.anIntArray658 = new int[this.anInt8408];
		this.anIntArray660 = new int[this.anInt8408];
		@Pc(152) int local152;
		@Pc(169) int local169;
		if (local54) {
			this.anIntArray655 = new int[this.anInt8408];
			for (local152 = 0; local152 < this.anInt8408; local152++) {
				this.anIntArray655[local152] = -1;
			}
			for (local169 = 0; local169 < this.anInt8406; local169++) {
				this.anIntArray655[this.anIntArray657[local169]] = local10.method3037();
			}
			this.aClass267_1 = new Class267(this.anIntArray655);
		}
		for (local152 = 0; local152 < this.anInt8406; local152++) {
			this.anIntArray659[this.anIntArray657[local152]] = local10.method3037();
		}
		if (local67) {
			for (local169 = 0; local169 < this.anInt8406; local169++) {
				@Pc(218) byte[] local218 = new byte[64];
				local10.method3071(local218, 64);
				this.aByteArrayArray31[this.anIntArray657[local169]] = local218;
			}
		}
		for (local169 = 0; local169 < this.anInt8406; local169++) {
			this.anIntArray658[this.anIntArray657[local169]] = local10.method3037();
		}
		for (@Pc(261) int local261 = 0; local261 < this.anInt8406; local261++) {
			this.anIntArray656[this.anIntArray657[local261]] = local10.method3056();
		}
		@Pc(285) int local285;
		@Pc(290) int local290;
		@Pc(294) int local294;
		@Pc(302) int local302;
		@Pc(318) int local318;
		for (@Pc(279) int local279 = 0; local279 < this.anInt8406; local279++) {
			local285 = this.anIntArray657[local279];
			local290 = this.anIntArray656[local285];
			local69 = 0;
			local294 = -1;
			this.anIntArrayArray78[local285] = new int[local290];
			for (local302 = 0; local302 < local290; local302++) {
				local318 = this.anIntArrayArray78[local285][local302] = local69 += local10.method3056();
				if (local318 > local294) {
					local294 = local318;
				}
			}
			this.anIntArray660[local285] = local294 + 1;
			if (local294 + 1 == local290) {
				this.anIntArrayArray78[local285] = null;
			}
		}
		if (!local54) {
			return;
		}
		this.anIntArrayArray79 = new int[local76 + 1][];
		this.aClass267Array1 = new Class267[local76 + 1];
		for (local285 = 0; local285 < this.anInt8406; local285++) {
			local290 = this.anIntArray657[local285];
			local294 = this.anIntArray656[local290];
			this.anIntArrayArray79[local290] = new int[this.anIntArray660[local290]];
			for (local302 = 0; local302 < this.anIntArray660[local290]; local302++) {
				this.anIntArrayArray79[local290][local302] = -1;
			}
			for (local318 = 0; local318 < local294; local318++) {
				@Pc(416) int local416;
				if (this.anIntArrayArray78[local290] == null) {
					local416 = local318;
				} else {
					local416 = this.anIntArrayArray78[local290][local318];
				}
				this.anIntArrayArray79[local290][local416] = local10.method3037();
			}
			this.aClass267Array1[local290] = new Class267(this.anIntArrayArray79[local290]);
		}
	}
}
