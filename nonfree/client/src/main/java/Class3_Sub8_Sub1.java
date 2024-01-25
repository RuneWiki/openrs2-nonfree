import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class3_Sub8_Sub1 extends Class3_Sub8 {

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
	private int anInt1122 = 16;

	@OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
	private int anInt1118 = 0;

	@OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
	private int anInt1125 = 0;

	@OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
	private int anInt1126 = 2000;

	@OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
	private int anInt1120 = 4096;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(25) int local25 = this.anInt1120 >> 1;
			@Pc(30) int[][] local30 = super.aClass87_41.method1798();
			@Pc(37) Random local37 = new Random((long) this.anInt1125);
			for (@Pc(39) int local39 = 0; local39 < this.anInt1126; local39++) {
				@Pc(63) int local63 = this.anInt1120 > 0 ? this.anInt1118 + Static93.method1603(this.anInt1120, local37) - local25 : this.anInt1118;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(78) int local78 = Static93.method1603(Static91.anInt1849, local37);
				@Pc(83) int local83 = Static93.method1603(Static589.anInt9553, local37);
				@Pc(94) int local94 = local78 + (this.anInt1122 * Static217.anIntArray548[local69] >> 12);
				@Pc(105) int local105 = (Static235.anIntArray250[local69] * this.anInt1122 >> 12) + local83;
				@Pc(110) int local110 = local105 - local83;
				@Pc(115) int local115 = local94 - local78;
				if (local115 != 0 || local110 != 0) {
					if (local115 < 0) {
						local115 = -local115;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(146) boolean local146 = local115 < local110;
					@Pc(150) int local150;
					@Pc(152) int local152;
					if (local146) {
						local150 = local78;
						local152 = local94;
						local78 = local83;
						local83 = local150;
						local94 = local105;
						local105 = local152;
					}
					if (local94 < local78) {
						local150 = local78;
						local78 = local94;
						local152 = local83;
						local94 = local150;
						local83 = local105;
						local105 = local152;
					}
					local150 = local83;
					local152 = local94 - local78;
					@Pc(190) int local190 = local105 - local83;
					@Pc(195) int local195 = -local152 / 2;
					@Pc(199) int local199 = 2048 / local152;
					@Pc(209) int local209 = 1024 - (Static93.method1603(4096, local37) >> 2);
					if (local190 < 0) {
						local190 = -local190;
					}
					@Pc(221) int local221 = local83 >= local105 ? -1 : 1;
					for (@Pc(223) int local223 = local78; local223 < local94; local223++) {
						@Pc(235) int local235 = (local223 - local78) * local199 + local209 + 1024;
						@Pc(239) int local239 = Static348.anInt5973 & local223;
						@Pc(243) int local243 = Static635.anInt10496 & local150;
						if (local146) {
							local30[local243][local239] = local235;
						} else {
							local30[local239][local243] = local235;
						}
						local195 += local190;
						if (local195 > 0) {
							local195 -= local152;
							local150 += local221;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt1125 = arg1.method7954();
		} else if (arg0 == 1) {
			this.anInt1126 = arg1.method7951();
		} else if (arg0 == 2) {
			this.anInt1122 = arg1.method7954();
		} else if (arg0 == 3) {
			this.anInt1118 = arg1.method7951();
		} else if (arg0 == 4) {
			this.anInt1120 = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		Static427.method5897();
	}
}
