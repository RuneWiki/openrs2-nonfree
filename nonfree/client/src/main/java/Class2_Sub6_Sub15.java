import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class2_Sub6_Sub15 extends Class2_Sub6 {

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
	private int anInt3035 = 4096;

	@OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
	private int anInt3040 = 0;

	@OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
	private int anInt3039 = 2000;

	@OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
	private int anInt3041 = 0;

	@OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
	private int anInt3045 = 16;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3040 = arg0.method4240();
		} else if (arg1 == 1) {
			this.anInt3039 = arg0.method4245();
		} else if (arg1 == 2) {
			this.anInt3045 = arg0.method4240();
		} else if (arg1 == 3) {
			this.anInt3041 = arg0.method4245();
		} else if (arg1 == 4) {
			this.anInt3035 = arg0.method4245();
		}
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		Static155.method2588();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(26) int local26 = this.anInt3035 >> 1;
			@Pc(31) int[][] local31 = super.aClass166_41.method3990();
			@Pc(38) Random local38 = new Random((long) this.anInt3040);
			for (@Pc(40) int local40 = 0; local40 < this.anInt3039; local40++) {
				@Pc(63) int local63 = this.anInt3035 <= 0 ? this.anInt3041 : this.anInt3041 + Static367.method5542(this.anInt3035, local38) - local26;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static367.method5542(Static151.anInt2711, local38);
				@Pc(79) int local79 = Static367.method5542(Static372.anInt6520, local38);
				@Pc(90) int local90 = (this.anInt3045 * Static60.anIntArray160[local69] >> 12) + local74;
				@Pc(101) int local101 = (Static353.anIntArray753[local69] * this.anInt3045 >> 12) + local79;
				@Pc(105) int local105 = local101 - local79;
				@Pc(109) int local109 = local90 - local74;
				if (local109 != 0 || local105 != 0) {
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(139) boolean local139 = local105 > local109;
					@Pc(143) int local143;
					@Pc(145) int local145;
					if (local139) {
						local143 = local74;
						local145 = local90;
						local74 = local79;
						local90 = local101;
						local79 = local143;
						local101 = local145;
					}
					if (local74 > local90) {
						local143 = local74;
						local145 = local79;
						local74 = local90;
						local79 = local101;
						local90 = local143;
						local101 = local145;
					}
					local143 = local79;
					local145 = local90 - local74;
					@Pc(180) int local180 = local101 - local79;
					@Pc(185) int local185 = -local145 / 2;
					@Pc(189) int local189 = 2048 / local145;
					@Pc(199) int local199 = 1024 - (Static367.method5542(4096, local38) >> 2);
					@Pc(206) int local206 = local79 >= local101 ? -1 : 1;
					if (local180 < 0) {
						local180 = -local180;
					}
					for (@Pc(213) int local213 = local74; local213 < local90; local213++) {
						@Pc(227) int local227 = local199 + local189 * (local213 - local74) + 1024;
						@Pc(231) int local231 = local213 & Static274.anInt1078;
						@Pc(235) int local235 = local143 & Static71.anInt1349;
						if (local139) {
							local31[local235][local231] = local227;
						} else {
							local31[local231][local235] = local227;
						}
						local185 += local180;
						if (local185 > 0) {
							local143 += local206;
							local185 += -local145;
						}
					}
				}
			}
		}
		return local17;
	}
}
