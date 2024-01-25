import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class1_Sub3_Sub29 extends Class1_Sub3 {

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
	private int anInt7482 = 0;

	@OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
	private int anInt7483 = 2000;

	@OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
	private int anInt7485 = 4096;

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
	private int anInt7487 = 16;

	@OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
	private int anInt7489 = 0;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(26) int local26 = this.anInt7485 >> 1;
			@Pc(31) int[][] local31 = super.aClass227_41.method5675();
			@Pc(38) Random local38 = new Random((long) this.anInt7489);
			for (@Pc(40) int local40 = 0; local40 < this.anInt7483; local40++) {
				@Pc(63) int local63 = this.anInt7485 <= 0 ? this.anInt7482 : this.anInt7482 + Static499.method7152(this.anInt7485, local38) - local26;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static499.method7152(Static236.anInt4609, local38);
				@Pc(79) int local79 = Static499.method7152(Static95.anInt2365, local38);
				@Pc(90) int local90 = local74 + (this.anInt7487 * Static82.anIntArray177[local69] >> 12);
				@Pc(101) int local101 = local79 + (this.anInt7487 * Static510.anIntArray737[local69] >> 12);
				@Pc(106) int local106 = local101 - local79;
				@Pc(111) int local111 = local90 - local74;
				if (local111 != 0 || local106 != 0) {
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local111 < 0) {
						local111 = -local111;
					}
					@Pc(132) boolean local132 = local111 < local106;
					@Pc(136) int local136;
					@Pc(140) int local140;
					if (local132) {
						local136 = local74;
						local74 = local79;
						local140 = local90;
						local79 = local136;
						local90 = local101;
						local101 = local140;
					}
					if (local90 < local74) {
						local136 = local74;
						local140 = local79;
						local74 = local90;
						local90 = local136;
						local79 = local101;
						local101 = local140;
					}
					local136 = local79;
					local140 = local90 - local74;
					@Pc(177) int local177 = local101 - local79;
					@Pc(182) int local182 = -local140 / 2;
					@Pc(186) int local186 = 2048 / local140;
					@Pc(195) int local195 = 1024 - (Static499.method7152(4096, local38) >> 2);
					if (local177 < 0) {
						local177 = -local177;
					}
					@Pc(214) int local214 = local101 <= local79 ? -1 : 1;
					for (@Pc(216) int local216 = local74; local216 < local90; local216++) {
						@Pc(228) int local228 = local186 * (local216 - local74) + local195 + 1024;
						@Pc(232) int local232 = local216 & Static36.anInt1319;
						@Pc(236) int local236 = Static226.anInt4534 & local136;
						if (local132) {
							local31[local236][local232] = local228;
						} else {
							local31[local232][local236] = local228;
						}
						local182 += local177;
						if (local182 > 0) {
							local136 += local214;
							local182 += -local140;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		Static401.method6051();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7489 = arg0.method3043();
		} else if (arg1 == 1) {
			this.anInt7483 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anInt7487 = arg0.method3043();
		} else if (arg1 == 3) {
			this.anInt7482 = arg0.method3056();
		} else if (arg1 == 4) {
			this.anInt7485 = arg0.method3056();
		}
	}
}
