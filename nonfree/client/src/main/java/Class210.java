import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class210 {

	@OriginalMember(owner = "client!md", name = "l", descriptor = "Lclient!om;")
	private final Class246 aClass246_154;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "[[I")
	private final int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "I")
	private final int anInt5756;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "[Z")
	private final boolean[] aBooleanArray23;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class210(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_154 = arg2;
		this.aClass246_154.method5673(1);
		@Pc(22) Class3_Sub11 local22 = new Class3_Sub11(this.aClass246_154.method5653(0, 0));
		@Pc(26) int local26 = local22.method3118();
		if (local26 > 3) {
			this.anIntArrayArray47 = new int[0][];
			this.anInt5756 = -1;
			this.aBooleanArray23 = new boolean[0];
		} else {
			@Pc(45) int local45 = local22.method3118();
			@Pc(48) Class260[] local48 = Static391.method5753();
			@Pc(50) boolean local50 = true;
			@Pc(60) int local60;
			@Pc(66) int local66;
			if (local45 == local48.length) {
				for (local60 = 0; local60 < local48.length; local60++) {
					local66 = local22.method3118();
					if (local48[local60].anInt6879 != local66) {
						local50 = false;
						break;
					}
				}
			} else {
				local50 = false;
			}
			if (local50) {
				local60 = local22.method3118();
				local66 = local22.method3118();
				if (local26 <= 2) {
					this.anInt5756 = -1;
				} else {
					this.anInt5756 = local22.method3107();
				}
				this.aBooleanArray23 = new boolean[local66 + 1];
				this.anIntArrayArray47 = new int[local66 + 1][];
				@Pc(128) int local128;
				for (@Pc(122) int local122 = 0; local122 < local60; local122++) {
					local128 = local22.method3118();
					this.aBooleanArray23[local128] = local22.method3118() == 1;
					@Pc(146) int local146 = local22.method3109();
					@Pc(158) int local158;
					if (this.anInt5756 == -1) {
						this.anIntArrayArray47[local128] = new int[local146];
						for (local158 = 0; local158 < local146; local158++) {
							this.anIntArrayArray47[local128][local158] = local22.method3109();
						}
					} else {
						this.anIntArrayArray47[local128] = new int[local146 + 1];
						this.anIntArrayArray47[local128][0] = this.anInt5756;
						for (local158 = 0; local158 < local146; local158++) {
							this.anIntArrayArray47[local128][local158 + 1] = local22.method3109();
						}
					}
				}
				for (local128 = 0; local128 < local66 + 1; local128++) {
					if (this.anIntArrayArray47[local128] == null) {
						if (this.anInt5756 == -1) {
							this.anIntArrayArray47[local128] = new int[0];
						} else {
							this.anIntArrayArray47[local128] = new int[] { this.anInt5756 };
						}
					}
				}
			} else {
				this.anInt5756 = -1;
				this.anIntArrayArray47 = new int[0][];
				this.aBooleanArray23 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Z")
	public boolean method4963() {
		return this.anInt5756 != -1;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lclient!pda;")
	public Class254 method4964(@OriginalArg(1) int arg0) {
		@Pc(15) byte[] local15 = this.aClass246_154.method5653(1, arg0);
		@Pc(19) Class254 local19 = new Class254();
		local19.method5827(new Class3_Sub11(local15));
		return local19;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)[I")
	public int[] method4967(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray47.length <= arg0) {
			return this.anInt5756 == -1 ? new int[0] : new int[] { this.anInt5756 };
		} else if (this.aBooleanArray23[arg0] && this.anIntArrayArray47[arg0].length > 1) {
			@Pc(57) int local57 = this.anInt5756 == -1 ? 0 : 1;
			@Pc(61) Random local61 = new Random();
			@Pc(68) int[] local68 = new int[this.anIntArrayArray47[arg0].length];
			Static604.method5911(this.anIntArrayArray47[arg0], 0, local68, 0, local68.length);
			for (@Pc(86) int local86 = local57; local86 < local68.length; local86++) {
				@Pc(99) int local99 = local57 + Static231.method3920(local61, local68.length - local57);
				@Pc(103) int local103 = local68[local86];
				local68[local86] = local68[local99];
				local68[local99] = local103;
			}
			return local68;
		} else {
			return this.anIntArrayArray47[arg0];
		}
	}
}
