import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class293 {

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Lclient!ni;")
	private final Class223 aClass223_116;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	private final int anInt8642;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "[Z")
	private final boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "[[I")
	private final int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class293(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_116 = arg2;
		this.aClass223_116.method5970(1);
		@Pc(22) Class6_Sub8 local22 = new Class6_Sub8(this.aClass223_116.method5954(0, 0));
		@Pc(26) int local26 = local22.method8246();
		if (local26 > 3) {
			this.aBooleanArray21 = new boolean[0];
			this.anIntArrayArray45 = new int[0][];
			this.anInt8642 = -1;
		} else {
			@Pc(35) int local35 = local22.method8246();
			@Pc(38) Class129[] local38 = Static126.method2631();
			@Pc(40) boolean local40 = true;
			@Pc(54) int local54;
			@Pc(60) int local60;
			if (local38.length == local35) {
				for (local54 = 0; local54 < local38.length; local54++) {
					local60 = local22.method8246();
					if (local60 != local38[local54].anInt4505) {
						local40 = false;
						break;
					}
				}
			} else {
				local40 = false;
			}
			if (local40) {
				local54 = local22.method8246();
				local60 = local22.method8246();
				if (local26 <= 2) {
					this.anInt8642 = -1;
				} else {
					this.anInt8642 = local22.method8231();
				}
				this.aBooleanArray21 = new boolean[local60 + 1];
				this.anIntArrayArray45 = new int[local60 + 1][];
				@Pc(134) int local134;
				for (@Pc(128) int local128 = 0; local128 < local54; local128++) {
					local134 = local22.method8246();
					this.aBooleanArray21[local134] = local22.method8246() == 1;
					@Pc(152) int local152 = local22.method8220();
					@Pc(164) int local164;
					if (this.anInt8642 == -1) {
						this.anIntArrayArray45[local134] = new int[local152];
						for (local164 = 0; local164 < local152; local164++) {
							this.anIntArrayArray45[local134][local164] = local22.method8220();
						}
					} else {
						this.anIntArrayArray45[local134] = new int[local152 + 1];
						this.anIntArrayArray45[local134][0] = this.anInt8642;
						for (local164 = 0; local164 < local152; local164++) {
							this.anIntArrayArray45[local134][local164 + 1] = local22.method8220();
						}
					}
				}
				for (local134 = 0; local134 < local60 + 1; local134++) {
					if (this.anIntArrayArray45[local134] == null) {
						if (this.anInt8642 == -1) {
							this.anIntArrayArray45[local134] = new int[0];
						} else {
							this.anIntArrayArray45[local134] = new int[] { this.anInt8642 };
						}
					}
				}
			} else {
				this.anInt8642 = -1;
				this.aBooleanArray21 = new boolean[0];
				this.anIntArrayArray45 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[I")
	public int[] method7194(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray45.length) {
			return this.anInt8642 == -1 ? new int[0] : new int[] { this.anInt8642 };
		} else if (this.aBooleanArray21[arg0] && this.anIntArrayArray45[arg0].length > 1) {
			@Pc(65) int local65 = this.anInt8642 == -1 ? 0 : 1;
			@Pc(69) Random local69 = new Random();
			@Pc(76) int[] local76 = new int[this.anIntArrayArray45[arg0].length];
			Static653.method6534(this.anIntArrayArray45[arg0], 0, local76, 0, local76.length);
			for (@Pc(88) int local88 = local65; local88 < local76.length; local88++) {
				@Pc(102) int local102 = Static123.method2611(local76.length - local65, local69) + local65;
				@Pc(106) int local106 = local76[local88];
				local76[local88] = local76[local102];
				local76[local102] = local106;
			}
			return local76;
		} else {
			return this.anIntArrayArray45[arg0];
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lclient!ie;")
	public Class139 method7195(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18 = this.aClass223_116.method5954(arg0, 1);
		@Pc(22) Class139 local22 = new Class139();
		local22.method4287(new Class6_Sub8(local18));
		return local22;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)Z")
	public boolean method7196() {
		return this.anInt8642 != -1;
	}
}
