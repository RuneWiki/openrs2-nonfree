import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class2_Sub7_Sub28 extends Class2_Sub7 {

	@OriginalMember(owner = "client!pba", name = "I", descriptor = "I")
	private int anInt6846 = 0;

	@OriginalMember(owner = "client!pba", name = "K", descriptor = "I")
	private int anInt6848 = 2000;

	@OriginalMember(owner = "client!pba", name = "N", descriptor = "I")
	private int anInt6851 = 0;

	@OriginalMember(owner = "client!pba", name = "L", descriptor = "I")
	private int anInt6849 = 4096;

	@OriginalMember(owner = "client!pba", name = "J", descriptor = "I")
	private int anInt6847 = 16;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		Static50.method896();
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(20) int local20 = this.anInt6849 >> 1;
			@Pc(25) int[][] local25 = super.aClass221_41.method5900();
			@Pc(32) Random local32 = new Random((long) this.anInt6851);
			for (@Pc(34) int local34 = 0; local34 < this.anInt6848; local34++) {
				@Pc(57) int local57 = this.anInt6849 > 0 ? this.anInt6846 + Static202.method3259(this.anInt6849, local32) - local20 : this.anInt6846;
				@Pc(63) int local63 = local57 >> 4 & 0xFF;
				@Pc(68) int local68 = Static202.method3259(Static352.anInt6485, local32);
				@Pc(73) int local73 = Static202.method3259(Static79.anInt1658, local32);
				@Pc(84) int local84 = local68 + (this.anInt6847 * Static314.anIntArray485[local63] >> 12);
				@Pc(96) int local96 = local73 + (Static336.anIntArray502[local63] * this.anInt6847 >> 12);
				@Pc(101) int local101 = local96 - local73;
				@Pc(106) int local106 = local84 - local68;
				if (local106 != 0 || local101 != 0) {
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local101 < 0) {
						local101 = -local101;
					}
					@Pc(139) boolean local139 = local106 < local101;
					@Pc(143) int local143;
					@Pc(145) int local145;
					if (local139) {
						local143 = local68;
						local145 = local84;
						local68 = local73;
						local73 = local143;
						local84 = local96;
						local96 = local145;
					}
					if (local84 < local68) {
						local143 = local68;
						local68 = local84;
						local145 = local73;
						local84 = local143;
						local73 = local96;
						local96 = local145;
					}
					local143 = local73;
					local145 = local84 - local68;
					@Pc(182) int local182 = local96 - local73;
					@Pc(187) int local187 = -local145 / 2;
					@Pc(191) int local191 = 2048 / local145;
					@Pc(201) int local201 = 1024 - (Static202.method3259(4096, local32) >> 2);
					@Pc(208) int local208 = local73 < local96 ? 1 : -1;
					if (local182 < 0) {
						local182 = -local182;
					}
					for (@Pc(218) int local218 = local68; local218 < local84; local218++) {
						@Pc(231) int local231 = local191 * (local218 - local68) + local201 + 1024;
						@Pc(235) int local235 = Static38.anInt733 & local218;
						@Pc(239) int local239 = Static126.anInt7690 & local143;
						local187 += local182;
						if (local139) {
							local25[local239][local235] = local231;
						} else {
							local25[local235][local239] = local231;
						}
						if (local187 > 0) {
							local143 += local208;
							local187 -= local145;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt6851 = arg1.method5170();
		} else if (arg0 == 1) {
			this.anInt6848 = arg1.method5229();
		} else if (arg0 == 2) {
			this.anInt6847 = arg1.method5170();
		} else if (arg0 == 3) {
			this.anInt6846 = arg1.method5229();
		} else if (arg0 == 4) {
			this.anInt6849 = arg1.method5229();
		}
	}
}
