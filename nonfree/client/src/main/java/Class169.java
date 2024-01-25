import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class169 {

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "Lclient!sea;")
	private final Class308 aClass308_95;

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
	private final int anInt4405;

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "[Z")
	private final boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "[[I")
	private final int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!ci;ILclient!sea;)V")
	public Class169(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_95 = arg2;
		this.aClass308_95.method6568(1);
		@Pc(22) Class1_Sub3 local22 = new Class1_Sub3(this.aClass308_95.method6569(0, 0));
		@Pc(26) int local26 = local22.method7974();
		if (local26 > 3) {
			this.anInt4405 = -1;
			this.aBooleanArray17 = new boolean[0];
			this.anIntArrayArray21 = new int[0][];
		} else {
			@Pc(45) int local45 = local22.method7974();
			@Pc(48) Class252[] local48 = Static42.method750();
			@Pc(50) boolean local50 = true;
			@Pc(56) int local56;
			@Pc(62) int local62;
			if (local45 == local48.length) {
				for (local56 = 0; local56 < local48.length; local56++) {
					local62 = local22.method7974();
					if (local48[local56].anInt6726 != local62) {
						local50 = false;
						break;
					}
				}
			} else {
				local50 = false;
			}
			if (local50) {
				local56 = local22.method7974();
				local62 = local22.method7974();
				if (local26 <= 2) {
					this.anInt4405 = -1;
				} else {
					this.anInt4405 = local22.method7975();
				}
				this.aBooleanArray17 = new boolean[local62 + 1];
				this.anIntArrayArray21 = new int[local62 + 1][];
				@Pc(142) int local142;
				for (@Pc(136) int local136 = 0; local136 < local56; local136++) {
					local142 = local22.method7974();
					this.aBooleanArray17[local142] = local22.method7974() == 1;
					@Pc(160) int local160 = local22.method7945();
					@Pc(182) int local182;
					if (this.anInt4405 == -1) {
						this.anIntArrayArray21[local142] = new int[local160];
						for (local182 = 0; local182 < local160; local182++) {
							this.anIntArrayArray21[local142][local182] = local22.method7945();
						}
					} else {
						this.anIntArrayArray21[local142] = new int[local160 + 1];
						this.anIntArrayArray21[local142][0] = this.anInt4405;
						for (local182 = 0; local182 < local160; local182++) {
							this.anIntArrayArray21[local142][local182 + 1] = local22.method7945();
						}
					}
				}
				for (local142 = 0; local142 < local62 + 1; local142++) {
					if (this.anIntArrayArray21[local142] == null) {
						if (this.anInt4405 == -1) {
							this.anIntArrayArray21[local142] = new int[0];
						} else {
							this.anIntArrayArray21[local142] = new int[] { this.anInt4405 };
						}
					}
				}
			} else {
				this.aBooleanArray17 = new boolean[0];
				this.anIntArrayArray21 = new int[0][];
				this.anInt4405 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)[I")
	public int[] method3539(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray21.length) {
			return this.anInt4405 == -1 ? new int[0] : new int[] { this.anInt4405 };
		} else if (this.aBooleanArray17[arg0] && this.anIntArrayArray21[arg0].length > 1) {
			@Pc(61) int local61 = this.anInt4405 == -1 ? 0 : 1;
			@Pc(65) Random local65 = new Random();
			@Pc(72) int[] local72 = new int[this.anIntArrayArray21[arg0].length];
			Static598.method775(this.anIntArrayArray21[arg0], 0, local72, 0, local72.length);
			for (@Pc(84) int local84 = local61; local84 < local72.length; local84++) {
				@Pc(97) int local97 = local61 + Static46.method765(local72.length - local61, local65);
				@Pc(101) int local101 = local72[local84];
				local72[local84] = local72[local97];
				local72[local97] = local101;
			}
			return local72;
		} else {
			return this.anIntArrayArray21[arg0];
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)Z")
	public boolean method3540() {
		return this.anInt4405 != -1;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)Lclient!pw;")
	public Class278 method3541(@OriginalArg(1) int arg0) {
		@Pc(12) byte[] local12 = this.aClass308_95.method6569(1, arg0);
		@Pc(16) Class278 local16 = new Class278();
		local16.method5878(new Class1_Sub3(local12));
		return local16;
	}
}
