import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class129 {

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "Lclient!eq;")
	private final Class97 aClass97_51;

	@OriginalMember(owner = "client!gha", name = "m", descriptor = "I")
	private final int anInt4010;

	@OriginalMember(owner = "client!gha", name = "j", descriptor = "[[I")
	private final int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "[Z")
	private final boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class129(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_51 = arg2;
		this.aClass97_51.method2569(1);
		@Pc(20) Class2_Sub34 local20 = new Class2_Sub34(this.aClass97_51.method2545(0, 0));
		@Pc(24) int local24 = local20.method6904();
		if (local24 > 3) {
			this.anInt4010 = -1;
			this.anIntArrayArray30 = new int[0][];
			this.aBooleanArray26 = new boolean[0];
		} else {
			@Pc(33) int local33 = local20.method6904();
			@Pc(36) Class184[] local36 = Static591.method8160();
			@Pc(38) boolean local38 = true;
			@Pc(48) int local48;
			@Pc(53) int local53;
			if (local33 == local36.length) {
				for (local48 = 0; local48 < local36.length; local48++) {
					local53 = local20.method6904();
					if (local36[local48].anInt5327 != local53) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local48 = local20.method6904();
				local53 = local20.method6904();
				if (local24 > 2) {
					this.anInt4010 = local20.method6856();
				} else {
					this.anInt4010 = -1;
				}
				this.anIntArrayArray30 = new int[local53 + 1][];
				this.aBooleanArray26 = new boolean[local53 + 1];
				@Pc(117) int local117;
				for (@Pc(112) int local112 = 0; local112 < local48; local112++) {
					local117 = local20.method6904();
					this.aBooleanArray26[local117] = local20.method6904() == 1;
					@Pc(133) int local133 = local20.method6884();
					@Pc(155) int local155;
					if (this.anInt4010 == -1) {
						this.anIntArrayArray30[local117] = new int[local133];
						for (local155 = 0; local155 < local133; local155++) {
							this.anIntArrayArray30[local117][local155] = local20.method6884();
						}
					} else {
						this.anIntArrayArray30[local117] = new int[local133 + 1];
						this.anIntArrayArray30[local117][0] = this.anInt4010;
						for (local155 = 0; local155 < local133; local155++) {
							this.anIntArrayArray30[local117][local155 + 1] = local20.method6884();
						}
					}
				}
				for (local117 = 0; local117 < local53 + 1; local117++) {
					if (this.anIntArrayArray30[local117] == null) {
						if (this.anInt4010 == -1) {
							this.anIntArrayArray30[local117] = new int[0];
						} else {
							this.anIntArrayArray30[local117] = new int[] { this.anInt4010 };
						}
					}
				}
			} else {
				this.aBooleanArray26 = new boolean[0];
				this.anInt4010 = -1;
				this.anIntArrayArray30 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)Z")
	public boolean method3295() {
		return this.anInt4010 != -1;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(II)Lclient!ufa;")
	public Class335 method3296(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18 = this.aClass97_51.method2545(arg0, 1);
		@Pc(22) Class335 local22 = new Class335();
		local22.method7834(new Class2_Sub34(local18));
		return local22;
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IB)[I")
	public int[] method3297(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray30.length <= arg0) {
			return this.anInt4010 == -1 ? new int[0] : new int[] { this.anInt4010 };
		} else if (this.aBooleanArray26[arg0] && this.anIntArrayArray30[arg0].length > 1) {
			@Pc(52) int local52 = this.anInt4010 == -1 ? 0 : 1;
			@Pc(56) Random local56 = new Random();
			@Pc(63) int[] local63 = new int[this.anIntArrayArray30[arg0].length];
			Static649.method4862(this.anIntArrayArray30[arg0], 0, local63, 0, local63.length);
			for (@Pc(82) int local82 = local52; local82 < local63.length; local82++) {
				@Pc(94) int local94 = Static610.method8343(local56, local63.length - local52) + local52;
				@Pc(98) int local98 = local63[local82];
				local63[local82] = local63[local94];
				local63[local94] = local98;
			}
			return local63;
		} else {
			return this.anIntArrayArray30[arg0];
		}
	}
}
