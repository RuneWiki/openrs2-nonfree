import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class267 {

	@OriginalMember(owner = "client!on", name = "e", descriptor = "Lclient!wm;")
	private final Class390 aClass390_84;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	private final int anInt7495;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "[Z")
	private final boolean[] aBooleanArray34;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "[[I")
	private final int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class267(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_84 = arg2;
		this.aClass390_84.method8913(1);
		@Pc(22) Class5_Sub41 local22 = new Class5_Sub41(this.aClass390_84.method8914(0, 0));
		@Pc(26) int local26 = local22.method7816();
		if (local26 > 3) {
			this.anIntArrayArray39 = new int[0][];
			this.aBooleanArray34 = new boolean[0];
			this.anInt7495 = -1;
		} else {
			@Pc(33) int local33 = local22.method7816();
			@Pc(36) Class139[] local36 = Static441.method6442();
			@Pc(38) boolean local38 = true;
			@Pc(52) int local52;
			@Pc(58) int local58;
			if (local33 == local36.length) {
				for (local52 = 0; local52 < local36.length; local52++) {
					local58 = local22.method7816();
					if (local36[local52].anInt3889 != local58) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local52 = local22.method7816();
				local58 = local22.method7816();
				if (local26 <= 2) {
					this.anInt7495 = -1;
				} else {
					this.anInt7495 = local22.method7849();
				}
				this.aBooleanArray34 = new boolean[local58 + 1];
				this.anIntArrayArray39 = new int[local58 + 1][];
				@Pc(120) int local120;
				for (@Pc(114) int local114 = 0; local114 < local52; local114++) {
					local120 = local22.method7816();
					this.aBooleanArray34[local120] = local22.method7816() == 1;
					@Pc(138) int local138 = local22.method7860();
					@Pc(151) int local151;
					if (this.anInt7495 == -1) {
						this.anIntArrayArray39[local120] = new int[local138];
						for (local151 = 0; local151 < local138; local151++) {
							this.anIntArrayArray39[local120][local151] = local22.method7860();
						}
					} else {
						this.anIntArrayArray39[local120] = new int[local138 + 1];
						this.anIntArrayArray39[local120][0] = this.anInt7495;
						for (local151 = 0; local151 < local138; local151++) {
							this.anIntArrayArray39[local120][local151 + 1] = local22.method7860();
						}
					}
				}
				for (local120 = 0; local120 < local58 + 1; local120++) {
					if (this.anIntArrayArray39[local120] == null) {
						if (this.anInt7495 == -1) {
							this.anIntArrayArray39[local120] = new int[0];
						} else {
							this.anIntArrayArray39[local120] = new int[] { this.anInt7495 };
						}
					}
				}
			} else {
				this.anInt7495 = -1;
				this.anIntArrayArray39 = new int[0][];
				this.aBooleanArray34 = new boolean[0];
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)Z")
	public boolean method6304() {
		return this.anInt7495 != -1;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(II)[I")
	public int[] method6305(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 >= this.anIntArrayArray39.length) {
			return this.anInt7495 == -1 ? new int[0] : new int[] { this.anInt7495 };
		} else if (this.aBooleanArray34[arg0] && this.anIntArrayArray39[arg0].length > 1) {
			@Pc(57) int local57 = this.anInt7495 == -1 ? 0 : 1;
			@Pc(66) Random local66 = new Random();
			@Pc(73) int[] local73 = new int[this.anIntArrayArray39[arg0].length];
			Static686.method4967(this.anIntArrayArray39[arg0], 0, local73, 0, local73.length);
			for (@Pc(85) int local85 = local57; local85 < local73.length; local85++) {
				@Pc(98) int local98 = Static508.method7270(local73.length - local57, local66) + local57;
				@Pc(102) int local102 = local73[local85];
				local73[local85] = local73[local98];
				local73[local98] = local102;
			}
			return local73;
		} else {
			return this.anIntArrayArray39[arg0];
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)Lclient!raa;")
	public Class298 method6307(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18 = this.aClass390_84.method8914(1, arg0);
		@Pc(22) Class298 local22 = new Class298();
		local22.method7115(new Class5_Sub41(local18));
		return local22;
	}
}
