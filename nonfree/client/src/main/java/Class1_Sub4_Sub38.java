import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class1_Sub4_Sub38 extends Class1_Sub4 {

	@OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
	private int anInt7203 = 0;

	@OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
	private int anInt7204 = 16;

	@OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
	private int anInt7205 = 0;

	@OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
	private int anInt7207 = 4096;

	@OriginalMember(owner = "client!wj", name = "H", descriptor = "I")
	private int anInt7208 = 2000;

	static {
		new Class7("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(20) int local20 = this.anInt7207 >> 1;
			@Pc(27) int[][] local27 = super.aClass15_41.method507();
			@Pc(34) Random local34 = new Random((long) this.anInt7203);
			for (@Pc(36) int local36 = 0; local36 < this.anInt7208; local36++) {
				@Pc(56) int local56 = this.anInt7207 > 0 ? this.anInt7205 + Static300.method5748(local34, this.anInt7207) - local20 : this.anInt7205;
				@Pc(62) int local62 = local56 >> 4 & 0xFF;
				@Pc(67) int local67 = Static300.method5748(local34, Static66.anInt1511);
				@Pc(72) int local72 = Static300.method5748(local34, Static61.anInt1456);
				@Pc(83) int local83 = local67 + (this.anInt7204 * Static268.anIntArray411[local62] >> 12);
				@Pc(95) int local95 = local72 + (this.anInt7204 * Static390.anIntArray570[local62] >> 12);
				@Pc(100) int local100 = local95 - local72;
				@Pc(105) int local105 = local83 - local67;
				if (local105 != 0 || local100 != 0) {
					if (local100 < 0) {
						local100 = -local100;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(132) boolean local132 = local100 > local105;
					@Pc(136) int local136;
					@Pc(138) int local138;
					if (local132) {
						local136 = local67;
						local138 = local83;
						local67 = local72;
						local72 = local136;
						local83 = local95;
						local95 = local138;
					}
					if (local67 > local83) {
						local136 = local67;
						local138 = local72;
						local67 = local83;
						local72 = local95;
						local83 = local136;
						local95 = local138;
					}
					local136 = local72;
					local138 = local83 - local67;
					@Pc(177) int local177 = local95 - local72;
					@Pc(182) int local182 = -local138 / 2;
					@Pc(186) int local186 = 2048 / local138;
					@Pc(196) int local196 = 1024 - (Static300.method5748(local34, 4096) >> 2);
					if (local177 < 0) {
						local177 = -local177;
					}
					@Pc(212) int local212 = local95 <= local72 ? -1 : 1;
					for (@Pc(214) int local214 = local67; local214 < local83; local214++) {
						@Pc(227) int local227 = local186 * (local214 - local67) + local196 + 1024;
						@Pc(231) int local231 = Static393.anInt6315 & local214;
						@Pc(235) int local235 = Static67.anInt1514 & local136;
						local182 += local177;
						if (local132) {
							local27[local235][local231] = local227;
						} else {
							local27[local231][local235] = local227;
						}
						if (local182 > 0) {
							local136 -= -local212;
							local182 += -local138;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		Static170.method2715();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt7203 = arg1.method5366();
		} else if (arg0 == 1) {
			this.anInt7208 = arg1.method5362();
		} else if (arg0 == 2) {
			this.anInt7204 = arg1.method5366();
		} else if (arg0 == 3) {
			this.anInt7205 = arg1.method5362();
		} else if (arg0 == 4) {
			this.anInt7207 = arg1.method5362();
		}
	}
}
