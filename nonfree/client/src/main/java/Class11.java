import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class11 {

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "Lclient!la;")
	private final Class207 aClass207_5;

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "[[I")
	private final int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
	private final int anInt235;

	@OriginalMember(owner = "client!aga", name = "f", descriptor = "[Z")
	private final boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class11(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_5 = arg2;
		this.aClass207_5.method4672(1);
		@Pc(22) Class5_Sub22 local22 = new Class5_Sub22(this.aClass207_5.method4681(0, 0));
		@Pc(26) int local26 = local22.method5966();
		if (local26 > 3) {
			this.anIntArrayArray2 = new int[0][];
			this.anInt235 = -1;
			this.aBooleanArray1 = new boolean[0];
		} else {
			@Pc(47) int local47 = local22.method5966();
			@Pc(50) Class365[] local50 = Static16.method231();
			@Pc(52) boolean local52 = true;
			@Pc(58) int local58;
			@Pc(64) int local64;
			if (local47 == local50.length) {
				for (local58 = 0; local58 < local50.length; local58++) {
					local64 = local22.method5966();
					if (local64 != local50[local58].anInt10078) {
						local52 = false;
						break;
					}
				}
			} else {
				local52 = false;
			}
			if (local52) {
				local58 = local22.method5966();
				local64 = local22.method5966();
				if (local26 <= 2) {
					this.anInt235 = -1;
				} else {
					this.anInt235 = local22.method5956();
				}
				this.anIntArrayArray2 = new int[local64 + 1][];
				this.aBooleanArray1 = new boolean[local64 + 1];
				@Pc(142) int local142;
				for (@Pc(136) int local136 = 0; local136 < local58; local136++) {
					local142 = local22.method5966();
					this.aBooleanArray1[local142] = local22.method5966() == 1;
					@Pc(160) int local160 = local22.method5968();
					@Pc(182) int local182;
					if (this.anInt235 == -1) {
						this.anIntArrayArray2[local142] = new int[local160];
						for (local182 = 0; local182 < local160; local182++) {
							this.anIntArrayArray2[local142][local182] = local22.method5968();
						}
					} else {
						this.anIntArrayArray2[local142] = new int[local160 + 1];
						this.anIntArrayArray2[local142][0] = this.anInt235;
						for (local182 = 0; local182 < local160; local182++) {
							this.anIntArrayArray2[local142][local182 + 1] = local22.method5968();
						}
					}
				}
				for (local142 = 0; local142 < local64 + 1; local142++) {
					if (this.anIntArrayArray2[local142] == null) {
						if (this.anInt235 == -1) {
							this.anIntArrayArray2[local142] = new int[0];
						} else {
							this.anIntArrayArray2[local142] = new int[] { this.anInt235 };
						}
					}
				}
			} else {
				this.aBooleanArray1 = new boolean[0];
				this.anInt235 = -1;
				this.anIntArrayArray2 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IB)Lclient!qa;")
	public Class282 method217(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass207_5.method4681(1, arg0);
		@Pc(14) Class282 local14 = new Class282();
		local14.method6694(new Class5_Sub22(local10));
		return local14;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)[I")
	public int[] method219(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray2.length) {
			return this.anInt235 == -1 ? new int[0] : new int[] { this.anInt235 };
		} else if (this.aBooleanArray1[arg0] && this.anIntArrayArray2[arg0].length > 1) {
			@Pc(55) int local55 = this.anInt235 == -1 ? 0 : 1;
			@Pc(59) Random local59 = new Random();
			@Pc(66) int[] local66 = new int[this.anIntArrayArray2[arg0].length];
			Static652.method4549(this.anIntArrayArray2[arg0], 0, local66, 0, local66.length);
			for (@Pc(78) int local78 = local55; local78 < local66.length; local78++) {
				@Pc(92) int local92 = Static130.method1947(local66.length - local55, local59) + local55;
				@Pc(96) int local96 = local66[local78];
				local66[local78] = local66[local92];
				local66[local92] = local96;
			}
			return local66;
		} else {
			return this.anIntArrayArray2[arg0];
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)Z")
	public boolean method221() {
		return this.anInt235 != -1;
	}
}
