import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
	private int anInt863 = 16;

	@OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
	private int anInt862 = 0;

	@OriginalMember(owner = "client!db", name = "qb", descriptor = "I")
	private int anInt867 = 4096;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
	private int anInt857 = 0;

	@OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
	private int anInt869 = 2000;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		Static67.method1167();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt857 = arg0.method3793();
		} else if (arg1 == 1) {
			this.anInt869 = arg0.method3805();
		} else if (arg1 == 2) {
			this.anInt863 = arg0.method3793();
		} else if (arg1 == 3) {
			this.anInt862 = arg0.method3805();
		} else if (arg1 == 4) {
			this.anInt867 = arg0.method3805();
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(25) int local25 = this.anInt867 >> 1;
			@Pc(30) int[][] local30 = super.aClass17_41.method472();
			@Pc(37) Random local37 = new Random((long) this.anInt857);
			for (@Pc(39) int local39 = 0; local39 < this.anInt869; local39++) {
				@Pc(63) int local63 = this.anInt867 > 0 ? this.anInt862 + Static108.method1839(local37, this.anInt867) - local25 : this.anInt862;
				@Pc(68) int local68 = Static108.method1839(local37, Static157.anInt3431);
				@Pc(73) int local73 = Static108.method1839(local37, Static187.anInt4033);
				@Pc(79) int local79 = local63 >> 4 & 0xFF;
				@Pc(90) int local90 = local68 + (Static49.anIntArray67[local79] * this.anInt863 >> 12);
				@Pc(101) int local101 = local73 + (Static167.anIntArray244[local79] * this.anInt863 >> 12);
				@Pc(105) int local105 = local101 - local73;
				@Pc(110) int local110 = local90 - local68;
				if (local110 != 0 || local105 != 0) {
					if (local110 < 0) {
						local110 = -local110;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(137) boolean local137 = local105 > local110;
					@Pc(141) int local141;
					@Pc(147) int local147;
					if (local137) {
						local141 = local68;
						local68 = local73;
						local73 = local141;
						local147 = local90;
						local90 = local101;
						local101 = local147;
					}
					if (local90 < local68) {
						local141 = local68;
						local68 = local90;
						local147 = local73;
						local73 = local101;
						local90 = local141;
						local101 = local147;
					}
					local147 = local90 - local68;
					local141 = local73;
					@Pc(177) int local177 = local101 - local73;
					@Pc(182) int local182 = -local147 / 2;
					if (local177 < 0) {
						local177 = -local177;
					}
					@Pc(191) int local191 = 2048 / local147;
					@Pc(202) int local202 = 1024 - (Static108.method1839(local37, 4096) >> 2);
					@Pc(209) int local209 = local101 <= local73 ? -1 : 1;
					for (@Pc(211) int local211 = local68; local211 < local90; local211++) {
						local182 += local177;
						@Pc(227) int local227 = local202 + (local211 - local68) * local191 + 1024;
						@Pc(231) int local231 = Static74.anInt1679 & local211;
						@Pc(235) int local235 = Static148.anInt3213 & local141;
						if (local137) {
							local30[local235][local231] = local227;
						} else {
							local30[local231][local235] = local227;
						}
						if (local182 > 0) {
							local141 -= -local209;
							local182 -= local147;
						}
					}
				}
			}
		}
		return local16;
	}
}
