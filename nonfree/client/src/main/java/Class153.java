import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class153 {

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "Lclient!la;")
	private final Class196 aClass196_45;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
	private final int anInt4456;

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "[[I")
	private final int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "[Z")
	private final boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class153(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_45 = arg2;
		this.aClass196_45.method5118(1);
		@Pc(22) Class3_Sub3 local22 = new Class3_Sub3(this.aClass196_45.method5102(0, 0));
		@Pc(26) int local26 = local22.method4225();
		if (local26 > 3) {
			this.anInt4456 = -1;
			this.aBooleanArray11 = new boolean[0];
			this.anIntArrayArray33 = new int[0][];
		} else {
			@Pc(35) int local35 = local22.method4225();
			@Pc(38) Class146[] local38 = Static140.method2608();
			@Pc(40) boolean local40 = true;
			@Pc(54) int local54;
			@Pc(60) int local60;
			if (local38.length == local35) {
				for (local54 = 0; local54 < local38.length; local54++) {
					local60 = local22.method4225();
					if (local38[local54].anInt4243 != local60) {
						local40 = false;
						break;
					}
				}
			} else {
				local40 = false;
			}
			if (local40) {
				local54 = local22.method4225();
				local60 = local22.method4225();
				if (local26 > 2) {
					this.anInt4456 = local22.method4209();
				} else {
					this.anInt4456 = -1;
				}
				this.anIntArrayArray33 = new int[local60 + 1][];
				this.aBooleanArray11 = new boolean[local60 + 1];
				@Pc(124) int local124;
				for (@Pc(118) int local118 = 0; local118 < local54; local118++) {
					local124 = local22.method4225();
					this.aBooleanArray11[local124] = local22.method4225() == 1;
					@Pc(142) int local142 = local22.method4221();
					@Pc(165) int local165;
					if (this.anInt4456 == -1) {
						this.anIntArrayArray33[local124] = new int[local142];
						for (local165 = 0; local165 < local142; local165++) {
							this.anIntArrayArray33[local124][local165] = local22.method4221();
						}
					} else {
						this.anIntArrayArray33[local124] = new int[local142 + 1];
						this.anIntArrayArray33[local124][0] = this.anInt4456;
						for (local165 = 0; local165 < local142; local165++) {
							this.anIntArrayArray33[local124][local165 + 1] = local22.method4221();
						}
					}
				}
				for (local124 = 0; local124 < local60 + 1; local124++) {
					if (this.anIntArrayArray33[local124] == null) {
						if (this.anInt4456 == -1) {
							this.anIntArrayArray33[local124] = new int[0];
						} else {
							this.anIntArrayArray33[local124] = new int[] { this.anInt4456 };
						}
					}
				}
			} else {
				this.anIntArrayArray33 = new int[0][];
				this.aBooleanArray11 = new boolean[0];
				this.anInt4456 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)Z")
	public boolean method3934() {
		return this.anInt4456 != -1;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)Lclient!dba;")
	public Class64 method3935(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass196_45.method5102(1, arg0);
		@Pc(14) Class64 local14 = new Class64();
		local14.method2003(new Class3_Sub3(local10));
		return local14;
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(II)[I")
	public int[] method3937(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray33.length <= arg0) {
			return this.anInt4456 == -1 ? new int[0] : new int[] { this.anInt4456 };
		} else if (this.aBooleanArray11[arg0] && this.anIntArrayArray33[arg0].length > 1) {
			@Pc(56) int local56 = this.anInt4456 == -1 ? 0 : 1;
			@Pc(60) Random local60 = new Random();
			@Pc(67) int[] local67 = new int[this.anIntArrayArray33[arg0].length];
			Static653.method6859(this.anIntArrayArray33[arg0], 0, local67, 0, local67.length);
			for (@Pc(84) int local84 = local56; local84 < local67.length; local84++) {
				@Pc(97) int local97 = Static522.method7729(local60, local67.length - local56) + local56;
				@Pc(101) int local101 = local67[local84];
				local67[local84] = local67[local97];
				local67[local97] = local101;
			}
			return local67;
		} else {
			return this.anIntArrayArray33[arg0];
		}
	}
}
