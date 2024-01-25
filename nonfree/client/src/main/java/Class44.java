import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class44 {

	@OriginalMember(owner = "client!br", name = "f", descriptor = "Lclient!aj;")
	private final Class15 aClass15_16;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "I")
	private final int anInt1090;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "[Z")
	private final boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!br", name = "i", descriptor = "[[I")
	private final int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class44(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_16 = arg2;
		this.aClass15_16.method512(1);
		@Pc(22) Class3_Sub25 local22 = new Class3_Sub25(this.aClass15_16.method517(0, 0));
		@Pc(26) int local26 = local22.method8632();
		if (local26 > 3) {
			this.anInt1090 = -1;
			this.anIntArrayArray8 = new int[0][];
			this.aBooleanArray4 = new boolean[0];
		} else {
			@Pc(35) int local35 = local22.method8632();
			@Pc(38) Class146[] local38 = Static204.method3650();
			@Pc(40) boolean local40 = true;
			@Pc(50) int local50;
			@Pc(56) int local56;
			if (local38.length == local35) {
				for (local50 = 0; local50 < local38.length; local50++) {
					local56 = local22.method8632();
					if (local56 != local38[local50].anInt4343) {
						local40 = false;
						break;
					}
				}
			} else {
				local40 = false;
			}
			if (local40) {
				local50 = local22.method8632();
				local56 = local22.method8632();
				if (local26 <= 2) {
					this.anInt1090 = -1;
				} else {
					this.anInt1090 = local22.method8589();
				}
				this.aBooleanArray4 = new boolean[local56 + 1];
				this.anIntArrayArray8 = new int[local56 + 1][];
				@Pc(136) int local136;
				for (@Pc(130) int local130 = 0; local130 < local50; local130++) {
					local136 = local22.method8632();
					this.aBooleanArray4[local136] = local22.method8632() == 1;
					@Pc(154) int local154 = local22.method8593();
					@Pc(176) int local176;
					if (this.anInt1090 == -1) {
						this.anIntArrayArray8[local136] = new int[local154];
						for (local176 = 0; local176 < local154; local176++) {
							this.anIntArrayArray8[local136][local176] = local22.method8593();
						}
					} else {
						this.anIntArrayArray8[local136] = new int[local154 + 1];
						this.anIntArrayArray8[local136][0] = this.anInt1090;
						for (local176 = 0; local176 < local154; local176++) {
							this.anIntArrayArray8[local136][local176 + 1] = local22.method8593();
						}
					}
				}
				for (local136 = 0; local136 < local56 + 1; local136++) {
					if (this.anIntArrayArray8[local136] == null) {
						if (this.anInt1090 == -1) {
							this.anIntArrayArray8[local136] = new int[0];
						} else {
							this.anIntArrayArray8[local136] = new int[] { this.anInt1090 };
						}
					}
				}
			} else {
				this.anInt1090 = -1;
				this.aBooleanArray4 = new boolean[0];
				this.anIntArrayArray8 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z")
	public boolean method1161() {
		return this.anInt1090 != -1;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)Lclient!jn;")
	public Class172 method1162(@OriginalArg(1) int arg0) {
		@Pc(10) byte[] local10 = this.aClass15_16.method517(arg0, 1);
		@Pc(21) Class172 local21 = new Class172();
		local21.method4525(new Class3_Sub25(local10));
		return local21;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)[I")
	public int[] method1163(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray8.length <= arg0) {
			return this.anInt1090 == -1 ? new int[0] : new int[] { this.anInt1090 };
		} else if (this.aBooleanArray4[arg0] && this.anIntArrayArray8[arg0].length > 1) {
			@Pc(55) int local55 = this.anInt1090 == -1 ? 0 : 1;
			@Pc(65) Random local65 = new Random();
			@Pc(72) int[] local72 = new int[this.anIntArrayArray8[arg0].length];
			Static684.method5326(this.anIntArrayArray8[arg0], 0, local72, 0, local72.length);
			for (@Pc(84) int local84 = local55; local84 < local72.length; local84++) {
				@Pc(97) int local97 = local55 + Static371.method5392(local65, local72.length - local55);
				@Pc(101) int local101 = local72[local84];
				local72[local84] = local72[local97];
				local72[local97] = local101;
			}
			return local72;
		} else {
			return this.anIntArrayArray8[arg0];
		}
	}
}
