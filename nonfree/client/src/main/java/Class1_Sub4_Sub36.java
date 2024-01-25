import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class1_Sub4_Sub36 extends Class1_Sub4 {

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
	private int anInt6745 = 16;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
	private int anInt6752 = 4096;

	@OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
	private int anInt6751 = 0;

	@OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
	private int anInt6754 = 2000;

	@OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
	private int anInt6746 = 0;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(25) int local25 = this.anInt6752 >> 1;
			@Pc(30) int[][] local30 = super.aClass2_41.method13();
			@Pc(37) Random local37 = new Random((long) this.anInt6751);
			for (@Pc(39) int local39 = 0; local39 < this.anInt6754; local39++) {
				@Pc(62) int local62 = this.anInt6752 > 0 ? this.anInt6746 + Static301.method4119(local37, this.anInt6752) - local25 : this.anInt6746;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static301.method4119(local37, Static395.anInt6592);
				@Pc(78) int local78 = Static301.method4119(local37, Static186.anInt3223);
				@Pc(89) int local89 = (Static98.anIntArray123[local68] * this.anInt6745 >> 12) + local73;
				@Pc(100) int local100 = (Static289.anIntArray328[local68] * this.anInt6745 >> 12) + local78;
				@Pc(105) int local105 = local100 - local78;
				@Pc(110) int local110 = local89 - local73;
				if (local110 != 0 || local105 != 0) {
					if (local110 < 0) {
						local110 = -local110;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(134) boolean local134 = local110 < local105;
					@Pc(138) int local138;
					@Pc(140) int local140;
					if (local134) {
						local138 = local73;
						local140 = local89;
						local73 = local78;
						local78 = local138;
						local89 = local100;
						local100 = local140;
					}
					if (local89 < local73) {
						local138 = local73;
						local73 = local89;
						local140 = local78;
						local89 = local138;
						local78 = local100;
						local100 = local140;
					}
					local138 = local78;
					local140 = local89 - local73;
					@Pc(178) int local178 = local100 - local78;
					@Pc(183) int local183 = -local140 / 2;
					@Pc(187) int local187 = 2048 / local140;
					@Pc(197) int local197 = 1024 - (Static301.method4119(local37, 4096) >> 2);
					@Pc(204) int local204 = local100 > local78 ? 1 : -1;
					if (local178 < 0) {
						local178 = -local178;
					}
					for (@Pc(214) int local214 = local73; local214 < local89; local214++) {
						@Pc(227) int local227 = local187 * (local214 - local73) + local197 + 1024;
						@Pc(231) int local231 = Static247.anInt4469 & local214;
						@Pc(235) int local235 = Static452.anInt7487 & local138;
						if (local134) {
							local30[local235][local231] = local227;
						} else {
							local30[local231][local235] = local227;
						}
						local183 += local178;
						if (local183 > 0) {
							local138 += local204;
							local183 += -local140;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		Static431.method5702();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6751 = arg0.method5337();
		} else if (arg1 == 1) {
			this.anInt6754 = arg0.method5335();
		} else if (arg1 == 2) {
			this.anInt6745 = arg0.method5337();
		} else if (arg1 == 3) {
			this.anInt6746 = arg0.method5335();
		} else if (arg1 == 4) {
			this.anInt6752 = arg0.method5335();
		}
	}
}
