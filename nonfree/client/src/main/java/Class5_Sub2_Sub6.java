import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class5_Sub2_Sub6 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
	private int anInt610 = 0;

	@OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
	private int anInt615 = 0;

	@OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
	private int anInt614 = 16;

	@OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
	private int anInt609 = 4096;

	@OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
	private int anInt617 = 2000;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
	@Override
	public void method5811() {
		Static10.method307();
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(20) int local20 = this.anInt609 >> 1;
			@Pc(25) int[][] local25 = super.aClass52_41.method1261();
			@Pc(32) Random local32 = new Random((long) this.anInt610);
			for (@Pc(34) int local34 = 0; local34 < this.anInt617; local34++) {
				@Pc(57) int local57 = this.anInt609 <= 0 ? this.anInt615 : this.anInt615 + Static210.method4979(this.anInt609, local32) - local20;
				@Pc(63) int local63 = local57 >> 4 & 0xFF;
				@Pc(68) int local68 = Static210.method4979(Static15.anInt493, local32);
				@Pc(73) int local73 = Static210.method4979(Static88.anInt1584, local32);
				@Pc(84) int local84 = local68 + (Static73.anIntArray94[local63] * this.anInt614 >> 12);
				@Pc(96) int local96 = local73 + (Static228.anIntArray320[local63] * this.anInt614 >> 12);
				@Pc(101) int local101 = local96 - local73;
				@Pc(106) int local106 = local84 - local68;
				if (local106 != 0 || local101 != 0) {
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local101 < 0) {
						local101 = -local101;
					}
					@Pc(130) boolean local130 = local106 < local101;
					@Pc(134) int local134;
					@Pc(136) int local136;
					if (local130) {
						local134 = local68;
						local136 = local84;
						local68 = local73;
						local73 = local134;
						local84 = local96;
						local96 = local136;
					}
					if (local84 < local68) {
						local134 = local68;
						local68 = local84;
						local136 = local73;
						local84 = local134;
						local73 = local96;
						local96 = local136;
					}
					local134 = local73;
					local136 = local84 - local68;
					@Pc(174) int local174 = local96 - local73;
					@Pc(179) int local179 = -local136 / 2;
					@Pc(183) int local183 = 2048 / local136;
					@Pc(193) int local193 = 1024 - (Static210.method4979(4096, local32) >> 2);
					@Pc(204) int local204 = local73 < local96 ? 1 : -1;
					if (local174 < 0) {
						local174 = -local174;
					}
					for (@Pc(211) int local211 = local68; local211 < local84; local211++) {
						@Pc(223) int local223 = local183 * (local211 - local68) + local193 + 1024;
						@Pc(227) int local227 = local211 & Static317.anInt6151;
						@Pc(231) int local231 = Static19.anInt547 & local134;
						if (local130) {
							local25[local231][local227] = local223;
						} else {
							local25[local227][local231] = local223;
						}
						local179 += local174;
						if (local179 > 0) {
							local179 += -local136;
							local134 -= -local204;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt610 = arg0.method1832();
		} else if (arg1 == 1) {
			this.anInt617 = arg0.method1845();
		} else if (arg1 == 2) {
			this.anInt614 = arg0.method1832();
		} else if (arg1 == 3) {
			this.anInt615 = arg0.method1845();
		} else if (arg1 == 4) {
			this.anInt609 = arg0.method1845();
		}
	}
}
