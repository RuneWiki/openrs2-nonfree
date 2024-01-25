import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class120 {

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "Lclient!wia;")
	private final Class386 aClass386_44;

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
	private final int anInt3434;

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "[Z")
	private final boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "[[I")
	private final int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class120(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_44 = arg2;
		this.aClass386_44.method9210(1);
		@Pc(22) Class14_Sub29 local22 = new Class14_Sub29(this.aClass386_44.method9196(0, 0));
		@Pc(26) int local26 = local22.method5866();
		if (local26 > 3) {
			this.anInt3434 = -1;
			this.aBooleanArray9 = new boolean[0];
			this.anIntArrayArray19 = new int[0][];
		} else {
			@Pc(45) int local45 = local22.method5866();
			@Pc(48) Class310[] local48 = Static323.method5090();
			@Pc(50) boolean local50 = true;
			@Pc(56) int local56;
			@Pc(62) int local62;
			if (local48.length == local45) {
				for (local56 = 0; local56 < local48.length; local56++) {
					local62 = local22.method5866();
					if (local62 != local48[local56].anInt9213) {
						local50 = false;
						break;
					}
				}
			} else {
				local50 = false;
			}
			if (local50) {
				local56 = local22.method5866();
				local62 = local22.method5866();
				if (local26 <= 2) {
					this.anInt3434 = -1;
				} else {
					this.anInt3434 = local22.method5890();
				}
				this.aBooleanArray9 = new boolean[local62 + 1];
				this.anIntArrayArray19 = new int[local62 + 1][];
				@Pc(142) int local142;
				for (@Pc(136) int local136 = 0; local136 < local56; local136++) {
					local142 = local22.method5866();
					this.aBooleanArray9[local142] = local22.method5866() == 1;
					@Pc(160) int local160 = local22.method5900();
					@Pc(172) int local172;
					if (this.anInt3434 == -1) {
						this.anIntArrayArray19[local142] = new int[local160];
						for (local172 = 0; local172 < local160; local172++) {
							this.anIntArrayArray19[local142][local172] = local22.method5900();
						}
					} else {
						this.anIntArrayArray19[local142] = new int[local160 + 1];
						this.anIntArrayArray19[local142][0] = this.anInt3434;
						for (local172 = 0; local172 < local160; local172++) {
							this.anIntArrayArray19[local142][local172 + 1] = local22.method5900();
						}
					}
				}
				for (local142 = 0; local142 < local62 + 1; local142++) {
					if (this.anIntArrayArray19[local142] == null) {
						if (this.anInt3434 == -1) {
							this.anIntArrayArray19[local142] = new int[0];
						} else {
							this.anIntArrayArray19[local142] = new int[] { this.anInt3434 };
						}
					}
				}
			} else {
				this.aBooleanArray9 = new boolean[0];
				this.anIntArrayArray19 = new int[0][];
				this.anInt3434 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IB)[I")
	public int[] method2841(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray19.length <= arg0) {
			return this.anInt3434 == -1 ? new int[0] : new int[] { this.anInt3434 };
		} else if (this.aBooleanArray9[arg0] && this.anIntArrayArray19[arg0].length > 1) {
			@Pc(55) int local55 = this.anInt3434 == -1 ? 0 : 1;
			@Pc(59) Random local59 = new Random();
			@Pc(66) int[] local66 = new int[this.anIntArrayArray19[arg0].length];
			Static681.method2482(this.anIntArrayArray19[arg0], 0, local66, 0, local66.length);
			for (@Pc(78) int local78 = local55; local78 < local66.length; local78++) {
				@Pc(99) int local99 = Static251.method3688(local59, local66.length - local55) + local55;
				@Pc(103) int local103 = local66[local78];
				local66[local78] = local66[local99];
				local66[local99] = local103;
			}
			return local66;
		} else {
			return this.anIntArrayArray19[arg0];
		}
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(IB)Lclient!kb;")
	public Class193 method2843(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18 = this.aClass386_44.method9196(arg0, 1);
		@Pc(22) Class193 local22 = new Class193();
		local22.method4361(new Class14_Sub29(local18));
		return local22;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)Z")
	public boolean method2846() {
		return this.anInt3434 != -1;
	}
}
