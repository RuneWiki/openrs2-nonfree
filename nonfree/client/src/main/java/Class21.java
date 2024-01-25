import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class21 {

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_12;

	@OriginalMember(owner = "client!baa", name = "h", descriptor = "[[I")
	private final int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
	private final int anInt826;

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "[Z")
	private final boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class21(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_12 = arg2;
		this.aClass251_12.method5768(1);
		@Pc(22) Class6_Sub21 local22 = new Class6_Sub21(this.aClass251_12.method5772(0, 0));
		@Pc(26) int local26 = local22.method6069();
		if (local26 > 3) {
			this.anIntArrayArray4 = new int[0][];
			this.anInt826 = -1;
			this.aBooleanArray3 = new boolean[0];
		} else {
			@Pc(47) int local47 = local22.method6069();
			@Pc(50) Class153[] local50 = Static555.method7521();
			@Pc(52) boolean local52 = true;
			@Pc(66) int local66;
			@Pc(72) int local72;
			if (local47 == local50.length) {
				for (local66 = 0; local66 < local50.length; local66++) {
					local72 = local22.method6069();
					if (local72 != local50[local66].anInt4625) {
						local52 = false;
						break;
					}
				}
			} else {
				local52 = false;
			}
			if (local52) {
				local66 = local22.method6069();
				local72 = local22.method6069();
				if (local26 <= 2) {
					this.anInt826 = -1;
				} else {
					this.anInt826 = local22.method6058();
				}
				this.anIntArrayArray4 = new int[local72 + 1][];
				this.aBooleanArray3 = new boolean[local72 + 1];
				@Pc(146) int local146;
				for (@Pc(140) int local140 = 0; local140 < local66; local140++) {
					local146 = local22.method6069();
					this.aBooleanArray3[local146] = local22.method6069() == 1;
					@Pc(164) int local164 = local22.method6003();
					@Pc(176) int local176;
					if (this.anInt826 == -1) {
						this.anIntArrayArray4[local146] = new int[local164];
						for (local176 = 0; local176 < local164; local176++) {
							this.anIntArrayArray4[local146][local176] = local22.method6003();
						}
					} else {
						this.anIntArrayArray4[local146] = new int[local164 + 1];
						this.anIntArrayArray4[local146][0] = this.anInt826;
						for (local176 = 0; local176 < local164; local176++) {
							this.anIntArrayArray4[local146][local176 + 1] = local22.method6003();
						}
					}
				}
				for (local146 = 0; local146 < local72 + 1; local146++) {
					if (this.anIntArrayArray4[local146] == null) {
						if (this.anInt826 == -1) {
							this.anIntArrayArray4[local146] = new int[0];
						} else {
							this.anIntArrayArray4[local146] = new int[] { this.anInt826 };
						}
					}
				}
			} else {
				this.aBooleanArray3 = new boolean[0];
				this.anInt826 = -1;
				this.anIntArrayArray4 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(II)[I")
	public int[] method852(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray4.length <= arg0) {
			return this.anInt826 == -1 ? new int[0] : new int[] { this.anInt826 };
		} else if (this.aBooleanArray3[arg0] && this.anIntArrayArray4[arg0].length > 1) {
			@Pc(67) int local67 = this.anInt826 == -1 ? 0 : 1;
			@Pc(71) Random local71 = new Random();
			@Pc(78) int[] local78 = new int[this.anIntArrayArray4[arg0].length];
			Static601.method2937(this.anIntArrayArray4[arg0], 0, local78, 0, local78.length);
			for (@Pc(90) int local90 = local67; local90 < local78.length; local90++) {
				@Pc(103) int local103 = Static411.method7689(local78.length - local67, local71) + local67;
				@Pc(107) int local107 = local78[local90];
				local78[local90] = local78[local103];
				local78[local103] = local107;
			}
			return local78;
		} else {
			return this.anIntArrayArray4[arg0];
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IB)Lclient!wu;")
	public Class363 method855(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass251_12.method5772(arg0, 1);
		@Pc(21) Class363 local21 = new Class363();
		local21.method7854(new Class6_Sub21(local10));
		return local21;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Z")
	public boolean method856() {
		return this.anInt826 != -1;
	}
}
