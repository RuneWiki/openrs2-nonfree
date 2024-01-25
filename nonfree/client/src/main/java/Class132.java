import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class132 {

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "Lclient!lga;")
	private final Class223 aClass223_37;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "[[I")
	private final int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
	private final int anInt3778;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!fs;ILclient!lga;)V")
	public Class132(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_37 = arg2;
		this.aClass223_37.method5264(1);
		@Pc(22) Class6_Sub15 local22 = new Class6_Sub15(this.aClass223_37.method5267(0, 0));
		@Pc(26) int local26 = local22.method3030();
		if (local26 > 3) {
			this.anIntArrayArray19 = new int[0][];
			this.anInt3778 = -1;
			this.aBooleanArray10 = new boolean[0];
		} else {
			@Pc(48) int local48 = local22.method3030();
			@Pc(51) Class369[] local51 = Static368.method5568();
			@Pc(53) boolean local53 = true;
			@Pc(67) int local67;
			@Pc(73) int local73;
			if (local51.length == local48) {
				for (local67 = 0; local67 < local51.length; local67++) {
					local73 = local22.method3030();
					if (local51[local67].anInt9894 != local73) {
						local53 = false;
						break;
					}
				}
			} else {
				local53 = false;
			}
			if (local53) {
				local67 = local22.method3030();
				local73 = local22.method3030();
				if (local26 > 2) {
					this.anInt3778 = local22.method2989();
				} else {
					this.anInt3778 = -1;
				}
				this.aBooleanArray10 = new boolean[local73 + 1];
				this.anIntArrayArray19 = new int[local73 + 1][];
				@Pc(156) int local156;
				for (@Pc(150) int local150 = 0; local150 < local67; local150++) {
					local156 = local22.method3030();
					this.aBooleanArray10[local156] = local22.method3030() == 1;
					@Pc(173) int local173 = local22.method3018();
					@Pc(195) int local195;
					if (this.anInt3778 == -1) {
						this.anIntArrayArray19[local156] = new int[local173];
						for (local195 = 0; local195 < local173; local195++) {
							this.anIntArrayArray19[local156][local195] = local22.method3018();
						}
					} else {
						this.anIntArrayArray19[local156] = new int[local173 + 1];
						this.anIntArrayArray19[local156][0] = this.anInt3778;
						for (local195 = 0; local195 < local173; local195++) {
							this.anIntArrayArray19[local156][local195 + 1] = local22.method3018();
						}
					}
				}
				for (local156 = 0; local156 < local73 + 1; local156++) {
					if (this.anIntArrayArray19[local156] == null) {
						if (this.anInt3778 == -1) {
							this.anIntArrayArray19[local156] = new int[0];
						} else {
							this.anIntArrayArray19[local156] = new int[] { this.anInt3778 };
						}
					}
				}
			} else {
				this.anIntArrayArray19 = new int[0][];
				this.aBooleanArray10 = new boolean[0];
				this.anInt3778 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)[I")
	public int[] method3523(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray19.length <= arg0) {
			return this.anInt3778 == -1 ? new int[0] : new int[] { this.anInt3778 };
		} else if (this.aBooleanArray10[arg0] && this.anIntArrayArray19[arg0].length > 1) {
			@Pc(61) int local61 = this.anInt3778 == -1 ? 0 : 1;
			@Pc(72) Random local72 = new Random();
			@Pc(79) int[] local79 = new int[this.anIntArrayArray19[arg0].length];
			Static695.method5649(this.anIntArrayArray19[arg0], 0, local79, 0, local79.length);
			for (@Pc(91) int local91 = local61; local91 < local79.length; local91++) {
				@Pc(103) int local103 = local61 + Static196.method3692(local72, local79.length - local61);
				@Pc(107) int local107 = local79[local91];
				local79[local91] = local79[local103];
				local79[local103] = local107;
			}
			return local79;
		} else {
			return this.anIntArrayArray19[arg0];
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Z")
	public boolean method3525() {
		return this.anInt3778 != -1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)Lclient!dq;")
	public Class83 method3529(@OriginalArg(0) int arg0) {
		@Pc(20) byte[] local20 = this.aClass223_37.method5267(arg0, 1);
		@Pc(24) Class83 local24 = new Class83();
		local24.method2081(new Class6_Sub15(local20));
		return local24;
	}
}
