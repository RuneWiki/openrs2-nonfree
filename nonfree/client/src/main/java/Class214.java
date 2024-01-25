import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class214 {

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "Lclient!in;")
	private final Class157 aClass157_185;

	@OriginalMember(owner = "client!mt", name = "j", descriptor = "[[I")
	private final int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "[Z")
	private final boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
	private final int anInt7105;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class214(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_185 = arg2;
		this.aClass157_185.method4561(1);
		@Pc(22) Class2_Sub11 local22 = new Class2_Sub11(this.aClass157_185.method4564(0, 0));
		@Pc(26) int local26 = local22.method8383();
		if (local26 > 3) {
			this.anIntArrayArray36 = new int[0][];
			this.aBooleanArray16 = new boolean[0];
			this.anInt7105 = -1;
		} else {
			@Pc(47) int local47 = local22.method8383();
			@Pc(50) Class6[] local50 = Static212.method4178();
			@Pc(52) boolean local52 = true;
			@Pc(62) int local62;
			@Pc(68) int local68;
			if (local47 == local50.length) {
				for (local62 = 0; local62 < local50.length; local62++) {
					local68 = local22.method8383();
					if (local68 != local50[local62].anInt84) {
						local52 = false;
						break;
					}
				}
			} else {
				local52 = false;
			}
			if (local52) {
				local62 = local22.method8383();
				local68 = local22.method8383();
				if (local26 > 2) {
					this.anInt7105 = local22.method8368();
				} else {
					this.anInt7105 = -1;
				}
				this.anIntArrayArray36 = new int[local68 + 1][];
				this.aBooleanArray16 = new boolean[local68 + 1];
				@Pc(146) int local146;
				for (@Pc(140) int local140 = 0; local140 < local62; local140++) {
					local146 = local22.method8383();
					this.aBooleanArray16[local146] = local22.method8383() == 1;
					@Pc(162) int local162 = local22.method8326();
					@Pc(175) int local175;
					if (this.anInt7105 == -1) {
						this.anIntArrayArray36[local146] = new int[local162];
						for (local175 = 0; local175 < local162; local175++) {
							this.anIntArrayArray36[local146][local175] = local22.method8326();
						}
					} else {
						this.anIntArrayArray36[local146] = new int[local162 + 1];
						this.anIntArrayArray36[local146][0] = this.anInt7105;
						for (local175 = 0; local175 < local162; local175++) {
							this.anIntArrayArray36[local146][local175 + 1] = local22.method8326();
						}
					}
				}
				for (local146 = 0; local146 < local68 + 1; local146++) {
					if (this.anIntArrayArray36[local146] == null) {
						if (this.anInt7105 == -1) {
							this.anIntArrayArray36[local146] = new int[0];
						} else {
							this.anIntArrayArray36[local146] = new int[] { this.anInt7105 };
						}
					}
				}
			} else {
				this.aBooleanArray16 = new boolean[0];
				this.anIntArrayArray36 = new int[0][];
				this.anInt7105 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IB)Lclient!vp;")
	public Class361 method6058(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass157_185.method4564(1, arg0);
		@Pc(19) Class361 local19 = new Class361();
		local19.method8923(new Class2_Sub11(local10));
		return local19;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)Z")
	public boolean method6059() {
		return this.anInt7105 != -1;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)[I")
	public int[] method6061(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray36.length) {
			return this.anInt7105 == -1 ? new int[0] : new int[] { this.anInt7105 };
		} else if (this.aBooleanArray16[arg0] && this.anIntArrayArray36[arg0].length > 1) {
			@Pc(60) int local60 = this.anInt7105 == -1 ? 0 : 1;
			@Pc(64) Random local64 = new Random();
			@Pc(71) int[] local71 = new int[this.anIntArrayArray36[arg0].length];
			Static653.method7724(this.anIntArrayArray36[arg0], 0, local71, 0, local71.length);
			for (@Pc(83) int local83 = local60; local83 < local71.length; local83++) {
				@Pc(95) int local95 = local60 + Static42.method1597(local71.length - local60, local64);
				@Pc(99) int local99 = local71[local83];
				local71[local83] = local71[local95];
				local71[local95] = local99;
			}
			return local71;
		} else {
			return this.anIntArrayArray36[arg0];
		}
	}
}
