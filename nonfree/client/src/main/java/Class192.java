import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class192 {

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "Lclient!ga;")
	private final Class111 aClass111_64;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	private final int anInt5097;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "[Z")
	private final boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "[[I")
	private final int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class192(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_64 = arg2;
		this.aClass111_64.method2442(1);
		@Pc(22) Class1_Sub20 local22 = new Class1_Sub20(this.aClass111_64.method2441(0, 0));
		@Pc(26) int local26 = local22.method4393();
		if (local26 > 3) {
			this.anIntArrayArray36 = new int[0][];
			this.aBooleanArray13 = new boolean[0];
			this.anInt5097 = -1;
		} else {
			@Pc(35) int local35 = local22.method4393();
			@Pc(38) Class307[] local38 = Static73.method1592();
			@Pc(40) boolean local40 = true;
			@Pc(46) int local46;
			@Pc(52) int local52;
			if (local38.length == local35) {
				for (local46 = 0; local46 < local38.length; local46++) {
					local52 = local22.method4393();
					if (local52 != local38[local46].anInt8423) {
						local40 = false;
						break;
					}
				}
			} else {
				local40 = false;
			}
			if (local40) {
				local46 = local22.method4393();
				local52 = local22.method4393();
				if (local26 > 2) {
					this.anInt5097 = local22.method4391();
				} else {
					this.anInt5097 = -1;
				}
				this.aBooleanArray13 = new boolean[local52 + 1];
				this.anIntArrayArray36 = new int[local52 + 1][];
				@Pc(122) int local122;
				for (@Pc(116) int local116 = 0; local116 < local46; local116++) {
					local122 = local22.method4393();
					this.aBooleanArray13[local122] = local22.method4393() == 1;
					@Pc(140) int local140 = local22.method4426();
					@Pc(162) int local162;
					if (this.anInt5097 == -1) {
						this.anIntArrayArray36[local122] = new int[local140];
						for (local162 = 0; local162 < local140; local162++) {
							this.anIntArrayArray36[local122][local162] = local22.method4426();
						}
					} else {
						this.anIntArrayArray36[local122] = new int[local140 + 1];
						this.anIntArrayArray36[local122][0] = this.anInt5097;
						for (local162 = 0; local162 < local140; local162++) {
							this.anIntArrayArray36[local122][local162 + 1] = local22.method4426();
						}
					}
				}
				for (local122 = 0; local122 < local52 + 1; local122++) {
					if (this.anIntArrayArray36[local122] == null) {
						if (this.anInt5097 == -1) {
							this.anIntArrayArray36[local122] = new int[0];
						} else {
							this.anIntArrayArray36[local122] = new int[] { this.anInt5097 };
						}
					}
				}
			} else {
				this.anIntArrayArray36 = new int[0][];
				this.anInt5097 = -1;
				this.aBooleanArray13 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)[I")
	public int[] method4284(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray36.length <= arg0) {
			return this.anInt5097 == -1 ? new int[0] : new int[] { this.anInt5097 };
		} else if (this.aBooleanArray13[arg0] && this.anIntArrayArray36[arg0].length > 1) {
			@Pc(58) int local58 = this.anInt5097 == -1 ? 0 : 1;
			@Pc(70) Random local70 = new Random();
			@Pc(77) int[] local77 = new int[this.anIntArrayArray36[arg0].length];
			Static600.method3769(this.anIntArrayArray36[arg0], 0, local77, 0, local77.length);
			for (@Pc(89) int local89 = local58; local89 < local77.length; local89++) {
				@Pc(102) int local102 = Static521.method7113(local77.length - local58, local70) + local58;
				@Pc(106) int local106 = local77[local89];
				local77[local89] = local77[local102];
				local77[local102] = local106;
			}
			return local77;
		} else {
			return this.anIntArrayArray36[arg0];
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)Lclient!raa;")
	public Class275 method4286(@OriginalArg(1) int arg0) {
		@Pc(15) byte[] local15 = this.aClass111_64.method2441(arg0, 1);
		@Pc(19) Class275 local19 = new Class275();
		local19.method6366(new Class1_Sub20(local15));
		return local19;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Z")
	public boolean method4287() {
		return this.anInt5097 != -1;
	}
}
