import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class6_Sub3_Sub32 extends Class6_Sub3 {

	@OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
	private int anInt8394 = 16;

	@OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
	private int anInt8398 = 0;

	@OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
	private int anInt8395 = 2000;

	@OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
	private int anInt8392 = 0;

	@OriginalMember(owner = "client!sm", name = "O", descriptor = "I")
	private int anInt8399 = 4096;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(26) int local26 = this.anInt8399 >> 1;
			@Pc(31) int[][] local31 = super.aClass137_41.method3413();
			@Pc(38) Random local38 = new Random((long) this.anInt8398);
			for (@Pc(40) int local40 = 0; local40 < this.anInt8395; local40++) {
				@Pc(63) int local63 = this.anInt8399 <= 0 ? this.anInt8392 : this.anInt8392 + Static309.method4643(local38, this.anInt8399) - local26;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static309.method4643(local38, Static35.anInt670);
				@Pc(79) int local79 = Static309.method4643(local38, Static170.anInt3133);
				@Pc(90) int local90 = (Static6.anIntArray5[local69] * this.anInt8394 >> 12) + local74;
				@Pc(101) int local101 = (Static412.anIntArray712[local69] * this.anInt8394 >> 12) + local79;
				@Pc(106) int local106 = local101 - local79;
				@Pc(110) int local110 = local90 - local74;
				if (local110 != 0 || local106 != 0) {
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(131) boolean local131 = local106 > local110;
					@Pc(135) int local135;
					@Pc(137) int local137;
					if (local131) {
						local135 = local74;
						local137 = local90;
						local74 = local79;
						local79 = local135;
						local90 = local101;
						local101 = local137;
					}
					if (local74 > local90) {
						local135 = local74;
						local74 = local90;
						local137 = local79;
						local79 = local101;
						local90 = local135;
						local101 = local137;
					}
					local135 = local79;
					local137 = local90 - local74;
					@Pc(171) int local171 = local101 - local79;
					@Pc(176) int local176 = -local137 / 2;
					@Pc(180) int local180 = 2048 / local137;
					@Pc(189) int local189 = 1024 - (Static309.method4643(local38, 4096) >> 2);
					if (local171 < 0) {
						local171 = -local171;
					}
					@Pc(201) int local201 = local101 <= local79 ? -1 : 1;
					for (@Pc(203) int local203 = local74; local203 < local90; local203++) {
						@Pc(217) int local217 = local189 + (local203 - local74) * local180 + 1024;
						@Pc(221) int local221 = local203 & Static147.anInt2781;
						@Pc(225) int local225 = Static132.anInt2511 & local135;
						if (local131) {
							local31[local225][local221] = local217;
						} else {
							local31[local221][local225] = local217;
						}
						local176 += local171;
						if (local176 > 0) {
							local176 += -local137;
							local135 -= -local201;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		Static583.method7925();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt8398 = arg1.method6019();
		} else if (arg0 == 1) {
			this.anInt8395 = arg1.method6044();
		} else if (arg0 == 2) {
			this.anInt8394 = arg1.method6019();
		} else if (arg0 == 3) {
			this.anInt8392 = arg1.method6044();
		} else if (arg0 == 4) {
			this.anInt8399 = arg1.method6044();
		}
	}
}
