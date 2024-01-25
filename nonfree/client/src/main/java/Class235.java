import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class235 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!gj;")
	private final Class143 aClass143_90;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	private final int anInt6412;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[[I")
	private final int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "[Z")
	private final boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class235(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_90 = arg2;
		this.aClass143_90.method3123(1);
		@Pc(22) Class3_Sub17 local22 = new Class3_Sub17(this.aClass143_90.method3125(0, 0));
		@Pc(26) int local26 = local22.method4888();
		if (local26 > 3) {
			this.anIntArrayArray68 = new int[0][];
			this.aBooleanArray19 = new boolean[0];
			this.anInt6412 = -1;
		} else {
			@Pc(35) int local35 = local22.method4888();
			@Pc(38) Class6[] local38 = Static510.method7232();
			@Pc(40) boolean local40 = true;
			@Pc(50) int local50;
			@Pc(56) int local56;
			if (local35 == local38.length) {
				for (local50 = 0; local50 < local38.length; local50++) {
					local56 = local22.method4888();
					if (local56 != local38[local50].anInt83) {
						local40 = false;
						break;
					}
				}
			} else {
				local40 = false;
			}
			if (local40) {
				local50 = local22.method4888();
				local56 = local22.method4888();
				if (local26 <= 2) {
					this.anInt6412 = -1;
				} else {
					this.anInt6412 = local22.method4869();
				}
				this.anIntArrayArray68 = new int[local56 + 1][];
				this.aBooleanArray19 = new boolean[local56 + 1];
				@Pc(120) int local120;
				for (@Pc(114) int local114 = 0; local114 < local50; local114++) {
					local120 = local22.method4888();
					this.aBooleanArray19[local120] = local22.method4888() == 1;
					@Pc(136) int local136 = local22.method4858();
					@Pc(159) int local159;
					if (this.anInt6412 == -1) {
						this.anIntArrayArray68[local120] = new int[local136];
						for (local159 = 0; local159 < local136; local159++) {
							this.anIntArrayArray68[local120][local159] = local22.method4858();
						}
					} else {
						this.anIntArrayArray68[local120] = new int[local136 + 1];
						this.anIntArrayArray68[local120][0] = this.anInt6412;
						for (local159 = 0; local159 < local136; local159++) {
							this.anIntArrayArray68[local120][local159 + 1] = local22.method4858();
						}
					}
				}
				for (local120 = 0; local120 < local56 + 1; local120++) {
					if (this.anIntArrayArray68[local120] == null) {
						if (this.anInt6412 == -1) {
							this.anIntArrayArray68[local120] = new int[0];
						} else {
							this.anIntArrayArray68[local120] = new int[] { this.anInt6412 };
						}
					}
				}
			} else {
				this.aBooleanArray19 = new boolean[0];
				this.anIntArrayArray68 = new int[0][];
				this.anInt6412 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Z")
	public boolean method5379() {
		return this.anInt6412 != -1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)Lclient!rm;")
	public Class311 method5382(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16 = this.aClass143_90.method3125(arg0, 1);
		@Pc(20) Class311 local20 = new Class311();
		local20.method7357(new Class3_Sub17(local16));
		return local20;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)[I")
	public int[] method5383(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray68.length) {
			return this.anInt6412 == -1 ? new int[0] : new int[] { this.anInt6412 };
		} else if (this.aBooleanArray19[arg0] && this.anIntArrayArray68[arg0].length > 1) {
			@Pc(57) int local57 = this.anInt6412 == -1 ? 0 : 1;
			@Pc(61) Random local61 = new Random();
			@Pc(68) int[] local68 = new int[this.anIntArrayArray68[arg0].length];
			Static689.method8054(this.anIntArrayArray68[arg0], 0, local68, 0, local68.length);
			for (@Pc(88) int local88 = local57; local88 < local68.length; local88++) {
				@Pc(101) int local101 = local57 + Static610.method8052(local68.length - local57, local61);
				@Pc(105) int local105 = local68[local88];
				local68[local88] = local68[local101];
				local68[local101] = local105;
			}
			return local68;
		} else {
			return this.anIntArrayArray68[arg0];
		}
	}
}
