import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class241 {

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "Lclient!nca;")
	private final Class254 aClass254_112;

	@OriginalMember(owner = "client!mga", name = "j", descriptor = "[Z")
	private final boolean[] aBooleanArray30;

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
	private final int anInt6508;

	@OriginalMember(owner = "client!mga", name = "g", descriptor = "[[I")
	private final int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!hda;ILclient!nca;)V")
	public Class241(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		this.aClass254_112 = arg2;
		this.aClass254_112.method6101(1);
		@Pc(22) Class2_Sub20 local22 = new Class2_Sub20(this.aClass254_112.method6087(0, 0));
		@Pc(26) int local26 = local22.method8581(-17416);
		if (local26 > 3) {
			this.anIntArrayArray46 = new int[0][];
			this.aBooleanArray30 = new boolean[0];
			this.anInt6508 = -1;
		} else {
			@Pc(33) int local33 = local22.method8581(-17416);
			@Pc(36) Class152[] local36 = Static330.method4576();
			@Pc(38) boolean local38 = true;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local33 == local36.length) {
				for (local52 = 0; local52 < local36.length; local52++) {
					local58 = local22.method8581(-17416);
					if (local58 != local36[local52].anInt3713) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local52 = local22.method8581(-17416);
				local58 = local22.method8581(-17416);
				if (local26 <= 2) {
					this.anInt6508 = -1;
				} else {
					this.anInt6508 = local22.method8598();
				}
				this.anIntArrayArray46 = new int[local58 + 1][];
				this.aBooleanArray30 = new boolean[local58 + 1];
				@Pc(143) int local143;
				for (@Pc(137) int local137 = 0; local137 < local52; local137++) {
					local143 = local22.method8581(-17416);
					this.aBooleanArray30[local143] = local22.method8581(-17416) == 1;
					@Pc(162) int local162 = local22.method8575();
					@Pc(175) int local175;
					if (this.anInt6508 == -1) {
						this.anIntArrayArray46[local143] = new int[local162];
						for (local175 = 0; local175 < local162; local175++) {
							this.anIntArrayArray46[local143][local175] = local22.method8575();
						}
					} else {
						this.anIntArrayArray46[local143] = new int[local162 + 1];
						this.anIntArrayArray46[local143][0] = this.anInt6508;
						for (local175 = 0; local175 < local162; local175++) {
							this.anIntArrayArray46[local143][local175 + 1] = local22.method8575();
						}
					}
				}
				for (local143 = 0; local143 < local58 + 1; local143++) {
					if (this.anIntArrayArray46[local143] == null) {
						if (this.anInt6508 == -1) {
							this.anIntArrayArray46[local143] = new int[0];
						} else {
							this.anIntArrayArray46[local143] = new int[] { this.anInt6508 };
						}
					}
				}
			} else {
				this.aBooleanArray30 = new boolean[0];
				this.anInt6508 = -1;
				this.anIntArrayArray46 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Z)Z")
	public boolean method5845() {
		return this.anInt6508 != -1;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)Lclient!bh;")
	public Class38 method5846(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = this.aClass254_112.method6087(arg0, 1);
		@Pc(14) Class38 local14 = new Class38();
		local14.method628(new Class2_Sub20(local10));
		return local14;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IB)[I")
	public int[] method5848(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray46.length) {
			return this.anInt6508 == -1 ? new int[0] : new int[] { this.anInt6508 };
		} else if (this.aBooleanArray30[arg0] && this.anIntArrayArray46[arg0].length > 1) {
			@Pc(65) int local65 = this.anInt6508 == -1 ? 0 : 1;
			@Pc(76) Random local76 = new Random();
			@Pc(83) int[] local83 = new int[this.anIntArrayArray46[arg0].length];
			Static728.method273(this.anIntArrayArray46[arg0], 0, local83, 0, local83.length);
			for (@Pc(95) int local95 = local65; local95 < local83.length; local95++) {
				@Pc(108) int local108 = local65 + Static289.method4068(local83.length - local65, local76);
				@Pc(112) int local112 = local83[local95];
				local83[local95] = local83[local108];
				local83[local108] = local112;
			}
			return local83;
		} else {
			return this.anIntArrayArray46[arg0];
		}
	}
}
