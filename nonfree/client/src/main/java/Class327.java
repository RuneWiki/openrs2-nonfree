import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class327 {

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!wu;")
	private final Class384 aClass384_120;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "[[I")
	private final int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "[Z")
	private final boolean[] aBooleanArray53;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
	private final int anInt9024;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class327(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_120 = arg2;
		this.aClass384_120.method8862(1);
		@Pc(22) Class5_Sub12 local22 = new Class5_Sub12(this.aClass384_120.method8885(0, 0));
		@Pc(26) int local26 = local22.method8645();
		if (local26 > 3) {
			this.anIntArrayArray54 = new int[0][];
			this.aBooleanArray53 = new boolean[0];
			this.anInt9024 = -1;
		} else {
			@Pc(45) int local45 = local22.method8645();
			@Pc(48) Class228[] local48 = Static156.method2370();
			@Pc(50) boolean local50 = true;
			@Pc(60) int local60;
			@Pc(66) int local66;
			if (local48.length == local45) {
				for (local60 = 0; local60 < local48.length; local60++) {
					local66 = local22.method8645();
					if (local48[local60].anInt6295 != local66) {
						local50 = false;
						break;
					}
				}
			} else {
				local50 = false;
			}
			if (local50) {
				local60 = local22.method8645();
				local66 = local22.method8645();
				if (local26 <= 2) {
					this.anInt9024 = -1;
				} else {
					this.anInt9024 = local22.method8595();
				}
				this.anIntArrayArray54 = new int[local66 + 1][];
				this.aBooleanArray53 = new boolean[local66 + 1];
				@Pc(134) int local134;
				for (@Pc(128) int local128 = 0; local128 < local60; local128++) {
					local134 = local22.method8645();
					this.aBooleanArray53[local134] = local22.method8645() == 1;
					@Pc(150) int local150 = local22.method8631();
					@Pc(172) int local172;
					if (this.anInt9024 == -1) {
						this.anIntArrayArray54[local134] = new int[local150];
						for (local172 = 0; local172 < local150; local172++) {
							this.anIntArrayArray54[local134][local172] = local22.method8631();
						}
					} else {
						this.anIntArrayArray54[local134] = new int[local150 + 1];
						this.anIntArrayArray54[local134][0] = this.anInt9024;
						for (local172 = 0; local172 < local150; local172++) {
							this.anIntArrayArray54[local134][local172 + 1] = local22.method8631();
						}
					}
				}
				for (local134 = 0; local134 < local66 + 1; local134++) {
					if (this.anIntArrayArray54[local134] == null) {
						if (this.anInt9024 == -1) {
							this.anIntArrayArray54[local134] = new int[0];
						} else {
							this.anIntArrayArray54[local134] = new int[] { this.anInt9024 };
						}
					}
				}
			} else {
				this.aBooleanArray53 = new boolean[0];
				this.anInt9024 = -1;
				this.anIntArrayArray54 = new int[0][];
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IB)[I")
	public int[] method7737(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray54.length <= arg0) {
			return this.anInt9024 == -1 ? new int[0] : new int[] { this.anInt9024 };
		} else if (this.aBooleanArray53[arg0] && this.anIntArrayArray54[arg0].length > 1) {
			@Pc(55) int local55 = this.anInt9024 == -1 ? 0 : 1;
			@Pc(59) Random local59 = new Random();
			@Pc(74) int[] local74 = new int[this.anIntArrayArray54[arg0].length];
			Static655.method4105(this.anIntArrayArray54[arg0], 0, local74, 0, local74.length);
			for (@Pc(86) int local86 = local55; local86 < local74.length; local86++) {
				@Pc(100) int local100 = Static57.method964(local74.length - local55, local59) + local55;
				@Pc(104) int local104 = local74[local86];
				local74[local86] = local74[local100];
				local74[local100] = local104;
			}
			return local74;
		} else {
			return this.anIntArrayArray54[arg0];
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Z")
	public boolean method7738() {
		return this.anInt9024 != -1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lclient!lo;")
	public Class213 method7739(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18 = this.aClass384_120.method8885(1, arg0);
		@Pc(22) Class213 local22 = new Class213();
		local22.method5148(new Class5_Sub12(local18));
		return local22;
	}
}
