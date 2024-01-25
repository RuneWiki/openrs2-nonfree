import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tia")
public final class Class337 {

	@OriginalMember(owner = "client!tia", name = "i", descriptor = "Lclient!cb;")
	private final Class50 aClass50_163;

	@OriginalMember(owner = "client!tia", name = "k", descriptor = "I")
	private final int anInt9342;

	@OriginalMember(owner = "client!tia", name = "n", descriptor = "[Z")
	private final boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!tia", name = "g", descriptor = "[[I")
	private final int[][] anIntArrayArray76;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class337(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_163 = arg2;
		this.aClass50_163.method913(1);
		@Pc(20) Class5_Sub15 local20 = new Class5_Sub15(this.aClass50_163.method916(0, 0));
		@Pc(24) int local24 = local20.method3642();
		if (local24 > 3) {
			this.anIntArrayArray76 = new int[0][];
			this.aBooleanArray23 = new boolean[0];
			this.anInt9342 = -1;
		} else {
			@Pc(31) int local31 = local20.method3642();
			@Pc(34) Class370[] local34 = Static32.method422();
			@Pc(36) boolean local36 = true;
			@Pc(42) int local42;
			@Pc(47) int local47;
			if (local31 == local34.length) {
				for (local42 = 0; local42 < local34.length; local42++) {
					local47 = local20.method3642();
					if (local34[local42].anInt10016 != local47) {
						local36 = false;
						break;
					}
				}
			} else {
				local36 = false;
			}
			if (local36) {
				local42 = local20.method3642();
				local47 = local20.method3642();
				if (local24 <= 2) {
					this.anInt9342 = -1;
				} else {
					this.anInt9342 = local20.method3638();
				}
				this.aBooleanArray23 = new boolean[local47 + 1];
				this.anIntArrayArray76 = new int[local47 + 1][];
				@Pc(111) int local111;
				for (@Pc(106) int local106 = 0; local106 < local42; local106++) {
					local111 = local20.method3642();
					this.aBooleanArray23[local111] = local20.method3642() == 1;
					@Pc(129) int local129 = local20.method3698();
					@Pc(142) int local142;
					if (this.anInt9342 == -1) {
						this.anIntArrayArray76[local111] = new int[local129];
						for (local142 = 0; local142 < local129; local142++) {
							this.anIntArrayArray76[local111][local142] = local20.method3698();
						}
					} else {
						this.anIntArrayArray76[local111] = new int[local129 + 1];
						this.anIntArrayArray76[local111][0] = this.anInt9342;
						for (local142 = 0; local142 < local129; local142++) {
							this.anIntArrayArray76[local111][local142 + 1] = local20.method3698();
						}
					}
				}
				for (local111 = 0; local111 < local47 + 1; local111++) {
					if (this.anIntArrayArray76[local111] == null) {
						if (this.anInt9342 == -1) {
							this.anIntArrayArray76[local111] = new int[0];
						} else {
							this.anIntArrayArray76[local111] = new int[] { this.anInt9342 };
						}
					}
				}
			} else {
				this.anInt9342 = -1;
				this.anIntArrayArray76 = new int[0][];
				this.aBooleanArray23 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)Z")
	public boolean method7814() {
		return this.anInt9342 != -1;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)Lclient!ub;")
	public Class349 method7815(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass50_163.method916(arg0, 1);
		@Pc(14) Class349 local14 = new Class349();
		local14.method8007(new Class5_Sub15(local10));
		return local14;
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(BI)[I")
	public int[] method7819(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray76.length <= arg0) {
			return this.anInt9342 == -1 ? new int[0] : new int[] { this.anInt9342 };
		} else if (this.aBooleanArray23[arg0] && this.anIntArrayArray76[arg0].length > 1) {
			@Pc(55) int local55 = this.anInt9342 == -1 ? 0 : 1;
			@Pc(59) Random local59 = new Random();
			@Pc(66) int[] local66 = new int[this.anIntArrayArray76[arg0].length];
			Static685.method8329(this.anIntArrayArray76[arg0], 0, local66, 0, local66.length);
			for (@Pc(78) int local78 = local55; local78 < local66.length; local78++) {
				@Pc(91) int local91 = Static653.method8578(local66.length - local55, local59) + local55;
				@Pc(95) int local95 = local66[local78];
				local66[local78] = local66[local91];
				local66[local91] = local95;
			}
			return local66;
		} else {
			return this.anIntArrayArray76[arg0];
		}
	}
}
