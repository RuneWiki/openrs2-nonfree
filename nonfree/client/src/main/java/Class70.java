import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class70 {

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Lclient!lb;")
	private final Class221 aClass221_23;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "[[I")
	private final int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "I")
	private final int anInt2271;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "[Z")
	private final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class70(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_23 = arg2;
		this.aClass221_23.method5065(1);
		@Pc(22) Class3_Sub28 local22 = new Class3_Sub28(this.aClass221_23.method5089(0, 0));
		@Pc(26) int local26 = local22.method5322(-7);
		if (local26 > 3) {
			this.anIntArrayArray13 = new int[0][];
			this.anInt2271 = -1;
			this.aBooleanArray7 = new boolean[0];
		} else {
			@Pc(46) int local46 = local22.method5322(-53);
			@Pc(49) Class409[] local49 = Static509.method7261();
			@Pc(51) boolean local51 = true;
			@Pc(61) int local61;
			@Pc(67) int local67;
			if (local46 == local49.length) {
				for (local61 = 0; local61 < local49.length; local61++) {
					local67 = local22.method5322(-78);
					if (local67 != local49[local61].anInt11285) {
						local51 = false;
						break;
					}
				}
			} else {
				local51 = false;
			}
			if (local51) {
				local61 = local22.method5322(-33);
				local67 = local22.method5322(-113);
				if (local26 <= 2) {
					this.anInt2271 = -1;
				} else {
					this.anInt2271 = local22.method5281();
				}
				this.aBooleanArray7 = new boolean[local67 + 1];
				this.anIntArrayArray13 = new int[local67 + 1][];
				@Pc(150) int local150;
				for (@Pc(144) int local144 = 0; local144 < local61; local144++) {
					local150 = local22.method5322(-33);
					this.aBooleanArray7[local150] = local22.method5322(-13) == 1;
					@Pc(169) int local169 = local22.method5272();
					@Pc(191) int local191;
					if (this.anInt2271 == -1) {
						this.anIntArrayArray13[local150] = new int[local169];
						for (local191 = 0; local191 < local169; local191++) {
							this.anIntArrayArray13[local150][local191] = local22.method5272();
						}
					} else {
						this.anIntArrayArray13[local150] = new int[local169 + 1];
						this.anIntArrayArray13[local150][0] = this.anInt2271;
						for (local191 = 0; local191 < local169; local191++) {
							this.anIntArrayArray13[local150][local191 + 1] = local22.method5272();
						}
					}
				}
				for (local150 = 0; local150 < local67 + 1; local150++) {
					if (this.anIntArrayArray13[local150] == null) {
						if (this.anInt2271 == -1) {
							this.anIntArrayArray13[local150] = new int[0];
						} else {
							this.anIntArrayArray13[local150] = new int[] { this.anInt2271 };
						}
					}
				}
			} else {
				this.anIntArrayArray13 = new int[0][];
				this.aBooleanArray7 = new boolean[0];
				this.anInt2271 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I")
	public int[] method2020(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray13.length) {
			return this.anInt2271 == -1 ? new int[0] : new int[] { this.anInt2271 };
		} else if (this.aBooleanArray7[arg0] && this.anIntArrayArray13[arg0].length > 1) {
			@Pc(70) int local70 = this.anInt2271 == -1 ? 0 : 1;
			@Pc(74) Random local74 = new Random();
			@Pc(81) int[] local81 = new int[this.anIntArrayArray13[arg0].length];
			Static735.method9182(this.anIntArrayArray13[arg0], 0, local81, 0, local81.length);
			for (@Pc(93) int local93 = local70; local93 < local81.length; local93++) {
				@Pc(106) int local106 = local70 + Static63.method794(local81.length - local70, local74);
				@Pc(110) int local110 = local81[local93];
				local81[local93] = local81[local106];
				local81[local106] = local110;
			}
			return local81;
		} else {
			return this.anIntArrayArray13[arg0];
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Z")
	public boolean method2022() {
		return this.anInt2271 != -1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)Lclient!dg;")
	public Class69 method2024(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18 = this.aClass221_23.method5089(arg0, 1);
		@Pc(22) Class69 local22 = new Class69();
		local22.method1962(new Class3_Sub28(local18));
		return local22;
	}
}
