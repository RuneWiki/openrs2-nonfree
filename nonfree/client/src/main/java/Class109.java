import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class109 {

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "Lclient!uq;")
	private final Class362 aClass362_33;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
	private final int anInt2702;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "[[I")
	private final int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class109(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_33 = arg2;
		this.aClass362_33.method8355(1);
		@Pc(22) Class3_Sub4 local22 = new Class3_Sub4(this.aClass362_33.method8368(0, 0));
		@Pc(26) int local26 = local22.method7954();
		if (local26 > 3) {
			this.anInt2702 = -1;
			this.aBooleanArray9 = new boolean[0];
			this.anIntArrayArray13 = new int[0][];
		} else {
			@Pc(47) int local47 = local22.method7954();
			@Pc(50) Class108[] local50 = Static365.method5252();
			@Pc(52) boolean local52 = true;
			@Pc(58) int local58;
			@Pc(64) int local64;
			if (local50.length == local47) {
				for (local58 = 0; local58 < local50.length; local58++) {
					local64 = local22.method7954();
					if (local50[local58].anInt2697 != local64) {
						local52 = false;
						break;
					}
				}
			} else {
				local52 = false;
			}
			if (local52) {
				local58 = local22.method7954();
				local64 = local22.method7954();
				if (local26 <= 2) {
					this.anInt2702 = -1;
				} else {
					this.anInt2702 = local22.method7918();
				}
				this.aBooleanArray9 = new boolean[local64 + 1];
				this.anIntArrayArray13 = new int[local64 + 1][];
				@Pc(142) int local142;
				for (@Pc(136) int local136 = 0; local136 < local58; local136++) {
					local142 = local22.method7954();
					this.aBooleanArray9[local142] = local22.method7954() == 1;
					@Pc(160) int local160 = local22.method7951();
					@Pc(182) int local182;
					if (this.anInt2702 == -1) {
						this.anIntArrayArray13[local142] = new int[local160];
						for (local182 = 0; local182 < local160; local182++) {
							this.anIntArrayArray13[local142][local182] = local22.method7951();
						}
					} else {
						this.anIntArrayArray13[local142] = new int[local160 + 1];
						this.anIntArrayArray13[local142][0] = this.anInt2702;
						for (local182 = 0; local182 < local160; local182++) {
							this.anIntArrayArray13[local142][local182 + 1] = local22.method7951();
						}
					}
				}
				for (local142 = 0; local142 < local64 + 1; local142++) {
					if (this.anIntArrayArray13[local142] == null) {
						if (this.anInt2702 == -1) {
							this.anIntArrayArray13[local142] = new int[0];
						} else {
							this.anIntArrayArray13[local142] = new int[] { this.anInt2702 };
						}
					}
				}
			} else {
				this.anIntArrayArray13 = new int[0][];
				this.aBooleanArray9 = new boolean[0];
				this.anInt2702 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BI)Lclient!ww;")
	public Class394 method2355(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = this.aClass362_33.method8368(1, arg0);
		@Pc(14) Class394 local14 = new Class394();
		local14.method9030(new Class3_Sub4(local10));
		return local14;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Z")
	public boolean method2358() {
		return this.anInt2702 != -1;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)[I")
	public int[] method2359(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray13.length <= arg0) {
			return this.anInt2702 == -1 ? new int[0] : new int[] { this.anInt2702 };
		} else if (this.aBooleanArray9[arg0] && this.anIntArrayArray13[arg0].length > 1) {
			@Pc(68) int local68 = this.anInt2702 == -1 ? 0 : 1;
			@Pc(72) Random local72 = new Random();
			@Pc(79) int[] local79 = new int[this.anIntArrayArray13[arg0].length];
			Static681.method4031(this.anIntArrayArray13[arg0], 0, local79, 0, local79.length);
			for (@Pc(91) int local91 = local68; local91 < local79.length; local91++) {
				@Pc(105) int local105 = Static93.method1603(local79.length - local68, local72) + local68;
				@Pc(109) int local109 = local79[local91];
				local79[local91] = local79[local105];
				local79[local105] = local109;
			}
			return local79;
		} else {
			return this.anIntArrayArray13[arg0];
		}
	}
}
