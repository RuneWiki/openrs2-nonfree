import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bda")
public final class Class28 {

	@OriginalMember(owner = "client!bda", name = "g", descriptor = "Lclient!mv;")
	private final Class229 aClass229_7;

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "[[I")
	private final int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "[Z")
	private final boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!bda", name = "k", descriptor = "I")
	private final int anInt660;

	@OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lclient!sea;ILclient!mv;)V")
	public Class28(@OriginalArg(0) Class308 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		this.aClass229_7 = arg2;
		this.aClass229_7.method4981(1);
		@Pc(22) Class2_Sub7 local22 = new Class2_Sub7(this.aClass229_7.method4980(0, 0));
		@Pc(26) int local26 = local22.method4464();
		if (local26 > 3) {
			this.anIntArrayArray5 = new int[0][];
			this.aBooleanArray1 = new boolean[0];
			this.anInt660 = -1;
		} else {
			@Pc(47) int local47 = local22.method4464();
			@Pc(50) Class225[] local50 = Static433.method5698();
			@Pc(52) boolean local52 = true;
			@Pc(58) int local58;
			@Pc(64) int local64;
			if (local50.length == local47) {
				for (local58 = 0; local58 < local50.length; local58++) {
					local64 = local22.method4464();
					if (local50[local58].anInt5523 != local64) {
						local52 = false;
						break;
					}
				}
			} else {
				local52 = false;
			}
			if (local52) {
				local58 = local22.method4464();
				local64 = local22.method4464();
				if (local26 > 2) {
					this.anInt660 = local22.method4478();
				} else {
					this.anInt660 = -1;
				}
				this.aBooleanArray1 = new boolean[local64 + 1];
				this.anIntArrayArray5 = new int[local64 + 1][];
				@Pc(144) int local144;
				for (@Pc(138) int local138 = 0; local138 < local58; local138++) {
					local144 = local22.method4464();
					this.aBooleanArray1[local144] = local22.method4464() == 1;
					@Pc(162) int local162 = local22.method4518();
					@Pc(175) int local175;
					if (this.anInt660 == -1) {
						this.anIntArrayArray5[local144] = new int[local162];
						for (local175 = 0; local175 < local162; local175++) {
							this.anIntArrayArray5[local144][local175] = local22.method4518();
						}
					} else {
						this.anIntArrayArray5[local144] = new int[local162 + 1];
						this.anIntArrayArray5[local144][0] = this.anInt660;
						for (local175 = 0; local175 < local162; local175++) {
							this.anIntArrayArray5[local144][local175 + 1] = local22.method4518();
						}
					}
				}
				for (local144 = 0; local144 < local64 + 1; local144++) {
					if (this.anIntArrayArray5[local144] == null) {
						if (this.anInt660 == -1) {
							this.anIntArrayArray5[local144] = new int[0];
						} else {
							this.anIntArrayArray5[local144] = new int[] { this.anInt660 };
						}
					}
				}
			} else {
				this.aBooleanArray1 = new boolean[0];
				this.anInt660 = -1;
				this.anIntArrayArray5 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)Lclient!gl;")
	public Class125 method553(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass229_7.method4980(1, arg0);
		@Pc(14) Class125 local14 = new Class125();
		local14.method2280(new Class2_Sub7(local10));
		return local14;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)Z")
	public boolean method555() {
		return this.anInt660 != -1;
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)[I")
	public int[] method558(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray5.length <= arg0) {
			return this.anInt660 == -1 ? new int[0] : new int[] { this.anInt660 };
		} else if (this.aBooleanArray1[arg0] && this.anIntArrayArray5[arg0].length > 1) {
			@Pc(53) int local53 = this.anInt660 == -1 ? 0 : 1;
			@Pc(57) Random local57 = new Random();
			@Pc(64) int[] local64 = new int[this.anIntArrayArray5[arg0].length];
			Static598.method4262(this.anIntArrayArray5[arg0], 0, local64, 0, local64.length);
			for (@Pc(81) int local81 = local53; local81 < local64.length; local81++) {
				@Pc(93) int local93 = Static328.method4754(local57, local64.length - local53) + local53;
				@Pc(97) int local97 = local64[local81];
				local64[local81] = local64[local93];
				local64[local93] = local97;
			}
			return local64;
		} else {
			return this.anIntArrayArray5[arg0];
		}
	}
}
