import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class4_Sub4_Sub33 extends Class4_Sub4 {

	@OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
	private int anInt7050 = 2000;

	@OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
	private int anInt7049 = 16;

	@OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
	private int anInt7053 = 0;

	@OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
	private int anInt7055 = 0;

	@OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
	private int anInt7052 = 4096;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		Static232.method3165();
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(25) int local25 = this.anInt7052 >> 1;
			@Pc(30) int[][] local30 = super.aClass103_41.method1978();
			@Pc(37) Random local37 = new Random((long) this.anInt7055);
			for (@Pc(39) int local39 = 0; local39 < this.anInt7050; local39++) {
				@Pc(62) int local62 = this.anInt7052 <= 0 ? this.anInt7053 : this.anInt7053 + Static425.method5717(local37, this.anInt7052) - local25;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static425.method5717(local37, Static419.anInt6404);
				@Pc(78) int local78 = Static425.method5717(local37, Static91.anInt1740);
				@Pc(90) int local90 = local73 + (this.anInt7049 * Static214.anIntArray275[local68] >> 12);
				@Pc(102) int local102 = local78 + (Static449.anIntArray563[local68] * this.anInt7049 >> 12);
				@Pc(107) int local107 = local102 - local78;
				@Pc(111) int local111 = local90 - local73;
				if (local111 != 0 || local107 != 0) {
					if (local111 < 0) {
						local111 = -local111;
					}
					if (local107 < 0) {
						local107 = -local107;
					}
					@Pc(132) boolean local132 = local107 > local111;
					@Pc(136) int local136;
					@Pc(140) int local140;
					if (local132) {
						local136 = local73;
						local73 = local78;
						local140 = local90;
						local90 = local102;
						local78 = local136;
						local102 = local140;
					}
					if (local73 > local90) {
						local136 = local73;
						local140 = local78;
						local73 = local90;
						local78 = local102;
						local90 = local136;
						local102 = local140;
					}
					local136 = local78;
					local140 = local90 - local73;
					@Pc(171) int local171 = local102 - local78;
					@Pc(176) int local176 = -local140 / 2;
					@Pc(180) int local180 = 2048 / local140;
					@Pc(190) int local190 = 1024 - (Static425.method5717(local37, 4096) >> 2);
					if (local171 < 0) {
						local171 = -local171;
					}
					@Pc(209) int local209 = local102 <= local78 ? -1 : 1;
					for (@Pc(211) int local211 = local73; local211 < local90; local211++) {
						@Pc(225) int local225 = local190 + local180 * (local211 - local73) + 1024;
						@Pc(229) int local229 = Static211.anInt3669 & local211;
						@Pc(233) int local233 = Static204.anInt3610 & local136;
						if (local132) {
							local30[local233][local229] = local225;
						} else {
							local30[local229][local233] = local225;
						}
						local176 += local171;
						if (local176 > 0) {
							local176 += -local140;
							local136 += local209;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt7055 = arg1.method5007();
		} else if (arg0 == 1) {
			this.anInt7050 = arg1.method5028();
		} else if (arg0 == 2) {
			this.anInt7049 = arg1.method5007();
		} else if (arg0 == 3) {
			this.anInt7053 = arg1.method5028();
		} else if (arg0 == 4) {
			this.anInt7052 = arg1.method5028();
		}
	}
}
