import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class112 {

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Lclient!uu;")
	private final Class343 aClass343_79;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	private final int anInt3231;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "[Z")
	private final boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "[[I")
	private final int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class112(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_79 = arg2;
		this.aClass343_79.method8157(1);
		@Pc(22) Class3_Sub9 local22 = new Class3_Sub9(this.aClass343_79.method8132(0, 0));
		@Pc(26) int local26 = local22.method5633();
		if (local26 > 3) {
			this.aBooleanArray10 = new boolean[0];
			this.anInt3231 = -1;
			this.anIntArrayArray17 = new int[0][];
		} else {
			@Pc(35) int local35 = local22.method5633();
			@Pc(38) Class384[] local38 = Static30.method436();
			@Pc(40) boolean local40 = true;
			@Pc(54) int local54;
			@Pc(60) int local60;
			if (local38.length == local35) {
				for (local54 = 0; local54 < local38.length; local54++) {
					local60 = local22.method5633();
					if (local60 != local38[local54].anInt10297) {
						local40 = false;
						break;
					}
				}
			} else {
				local40 = false;
			}
			if (local40) {
				local54 = local22.method5633();
				local60 = local22.method5633();
				if (local26 > 2) {
					this.anInt3231 = local22.method5624();
				} else {
					this.anInt3231 = -1;
				}
				this.aBooleanArray10 = new boolean[local60 + 1];
				this.anIntArrayArray17 = new int[local60 + 1][];
				@Pc(120) int local120;
				for (@Pc(114) int local114 = 0; local114 < local54; local114++) {
					local120 = local22.method5633();
					this.aBooleanArray10[local120] = local22.method5633() == 1;
					@Pc(138) int local138 = local22.method5610();
					@Pc(160) int local160;
					if (this.anInt3231 == -1) {
						this.anIntArrayArray17[local120] = new int[local138];
						for (local160 = 0; local160 < local138; local160++) {
							this.anIntArrayArray17[local120][local160] = local22.method5610();
						}
					} else {
						this.anIntArrayArray17[local120] = new int[local138 + 1];
						this.anIntArrayArray17[local120][0] = this.anInt3231;
						for (local160 = 0; local160 < local138; local160++) {
							this.anIntArrayArray17[local120][local160 + 1] = local22.method5610();
						}
					}
				}
				for (local120 = 0; local120 < local60 + 1; local120++) {
					if (this.anIntArrayArray17[local120] == null) {
						if (this.anInt3231 == -1) {
							this.anIntArrayArray17[local120] = new int[0];
						} else {
							this.anIntArrayArray17[local120] = new int[] { this.anInt3231 };
						}
					}
				}
			} else {
				this.anIntArrayArray17 = new int[0][];
				this.anInt3231 = -1;
				this.aBooleanArray10 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)Z")
	public boolean method2785() {
		return this.anInt3231 != -1;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BI)[I")
	public int[] method2786(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray17.length) {
			return this.anInt3231 == -1 ? new int[0] : new int[] { this.anInt3231 };
		} else if (this.aBooleanArray10[arg0] && this.anIntArrayArray17[arg0].length > 1) {
			@Pc(54) int local54 = this.anInt3231 == -1 ? 0 : 1;
			@Pc(58) Random local58 = new Random();
			@Pc(65) int[] local65 = new int[this.anIntArrayArray17[arg0].length];
			Static651.method750(this.anIntArrayArray17[arg0], 0, local65, 0, local65.length);
			for (@Pc(83) int local83 = local54; local83 < local65.length; local83++) {
				@Pc(97) int local97 = Static512.method7419(local65.length - local54, local58) + local54;
				@Pc(101) int local101 = local65[local83];
				local65[local83] = local65[local97];
				local65[local97] = local101;
			}
			return local65;
		} else {
			return this.anIntArrayArray17[arg0];
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)Lclient!laa;")
	public Class199 method2787(@OriginalArg(0) int arg0) {
		@Pc(15) byte[] local15 = this.aClass343_79.method8132(1, arg0);
		@Pc(19) Class199 local19 = new Class199();
		local19.method5231(new Class3_Sub9(local15));
		return local19;
	}
}
