import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eja")
public final class Class93 {

	@OriginalMember(owner = "client!eja", name = "b", descriptor = "Lclient!gga;")
	private final Class124 aClass124_36;

	@OriginalMember(owner = "client!eja", name = "g", descriptor = "[Z")
	private final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!eja", name = "h", descriptor = "I")
	private final int anInt2594;

	@OriginalMember(owner = "client!eja", name = "e", descriptor = "[[I")
	private final int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class93(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_36 = arg2;
		this.aClass124_36.method3629(1);
		@Pc(22) Class2_Sub8 local22 = new Class2_Sub8(this.aClass124_36.method3641(0, 0));
		@Pc(26) int local26 = local22.method5203();
		if (local26 > 3) {
			this.aBooleanArray16 = new boolean[0];
			this.anInt2594 = -1;
			this.anIntArrayArray10 = new int[0][];
		} else {
			@Pc(47) int local47 = local22.method5203();
			@Pc(50) Class148[] local50 = Static673.method9446();
			@Pc(52) boolean local52 = true;
			@Pc(58) int local58;
			@Pc(64) int local64;
			if (local50.length == local47) {
				for (local58 = 0; local58 < local50.length; local58++) {
					local64 = local22.method5203();
					if (local64 != local50[local58].anInt4611) {
						local52 = false;
						break;
					}
				}
			} else {
				local52 = false;
			}
			if (local52) {
				local58 = local22.method5203();
				local64 = local22.method5203();
				if (local26 > 2) {
					this.anInt2594 = local22.method5174();
				} else {
					this.anInt2594 = -1;
				}
				this.anIntArrayArray10 = new int[local64 + 1][];
				this.aBooleanArray16 = new boolean[local64 + 1];
				@Pc(146) int local146;
				for (@Pc(140) int local140 = 0; local140 < local58; local140++) {
					local146 = local22.method5203();
					this.aBooleanArray16[local146] = local22.method5203() == 1;
					@Pc(164) int local164 = local22.method5211();
					@Pc(187) int local187;
					if (this.anInt2594 == -1) {
						this.anIntArrayArray10[local146] = new int[local164];
						for (local187 = 0; local187 < local164; local187++) {
							this.anIntArrayArray10[local146][local187] = local22.method5211();
						}
					} else {
						this.anIntArrayArray10[local146] = new int[local164 + 1];
						this.anIntArrayArray10[local146][0] = this.anInt2594;
						for (local187 = 0; local187 < local164; local187++) {
							this.anIntArrayArray10[local146][local187 + 1] = local22.method5211();
						}
					}
				}
				for (local146 = 0; local146 < local64 + 1; local146++) {
					if (this.anIntArrayArray10[local146] == null) {
						if (this.anInt2594 == -1) {
							this.anIntArrayArray10[local146] = new int[0];
						} else {
							this.anIntArrayArray10[local146] = new int[] { this.anInt2594 };
						}
					}
				}
			} else {
				this.anIntArrayArray10 = new int[0][];
				this.aBooleanArray16 = new boolean[0];
				this.anInt2594 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(II)Lclient!sga;")
	public Class333 method2399(@OriginalArg(0) int arg0) {
		@Pc(15) byte[] local15 = this.aClass124_36.method3641(1, arg0);
		@Pc(19) Class333 local19 = new Class333();
		local19.method8318(new Class2_Sub8(local15));
		return local19;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(BI)[I")
	public int[] method2403(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray10.length) {
			return this.anInt2594 == -1 ? new int[0] : new int[] { this.anInt2594 };
		} else if (this.aBooleanArray16[arg0] && this.anIntArrayArray10[arg0].length > 1) {
			@Pc(60) int local60 = this.anInt2594 == -1 ? 0 : 1;
			@Pc(64) Random local64 = new Random();
			@Pc(71) int[] local71 = new int[this.anIntArrayArray10[arg0].length];
			Static679.method4128(this.anIntArrayArray10[arg0], 0, local71, 0, local71.length);
			for (@Pc(88) int local88 = local60; local88 < local71.length; local88++) {
				@Pc(100) int local100 = Static17.method7641(local71.length - local60, local64) + local60;
				@Pc(104) int local104 = local71[local88];
				local71[local88] = local71[local100];
				local71[local100] = local104;
			}
			return local71;
		} else {
			return this.anIntArrayArray10[arg0];
		}
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(B)Z")
	public boolean method2404() {
		return this.anInt2594 != -1;
	}
}
