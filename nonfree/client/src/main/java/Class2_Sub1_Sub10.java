import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
	private int anInt1596 = 16;

	@OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
	private int anInt1593 = 0;

	@OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
	private int anInt1594 = 2000;

	@OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
	private int anInt1590 = 0;

	@OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
	private int anInt1601 = 4096;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		Static216.method3645();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1593 = arg0.method4261();
		} else if (arg1 == 1) {
			this.anInt1594 = arg0.method4242();
		} else if (arg1 == 2) {
			this.anInt1596 = arg0.method4261();
		} else if (arg1 == 3) {
			this.anInt1590 = arg0.method4242();
		} else if (arg1 == 4) {
			this.anInt1601 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(27) int local27 = this.anInt1601 >> 1;
			@Pc(32) int[][] local32 = this.aClass136_41.method3409();
			@Pc(39) Random local39 = new Random((long) this.anInt1593);
			for (@Pc(41) int local41 = 0; local41 < this.anInt1594; local41++) {
				@Pc(68) int local68 = this.anInt1601 > 0 ? this.anInt1590 + Static21.method459(this.anInt1601, local39) - local27 : this.anInt1590;
				@Pc(73) int local73 = Static21.method459(Static114.anInt1359, local39);
				@Pc(79) int local79 = local68 >> 4 & 0xFF;
				@Pc(84) int local84 = Static21.method459(Static199.anInt4143, local39);
				@Pc(95) int local95 = local73 + (Static201.anIntArray347[local79] * this.anInt1596 >> 12);
				@Pc(106) int local106 = local84 + (Static198.anIntArray344[local79] * this.anInt1596 >> 12);
				@Pc(110) int local110 = local106 - local84;
				@Pc(115) int local115 = local95 - local73;
				if (local115 != 0 || local110 != 0) {
					if (local110 < 0) {
						local110 = -local110;
					}
					if (local115 < 0) {
						local115 = -local115;
					}
					@Pc(143) boolean local143 = local110 > local115;
					@Pc(148) int local148;
					@Pc(150) int local150;
					if (local143) {
						local148 = local73;
						local150 = local95;
						local73 = local84;
						local95 = local106;
						local106 = local150;
						local84 = local148;
					}
					if (local73 > local95) {
						local148 = local73;
						local150 = local84;
						local73 = local95;
						local84 = local106;
						local95 = local148;
						local106 = local150;
					}
					local148 = local84;
					local150 = local95 - local73;
					@Pc(185) int local185 = local106 - local84;
					if (local185 < 0) {
						local185 = -local185;
					}
					@Pc(198) int local198 = -local150 / 2;
					@Pc(202) int local202 = 2048 / local150;
					@Pc(212) int local212 = 1024 - (Static21.method459(4096, local39) >> 2);
					@Pc(219) int local219 = local106 > local84 ? 1 : -1;
					for (@Pc(221) int local221 = local73; local221 < local95; local221++) {
						local198 += local185;
						@Pc(240) int local240 = local212 + (local221 - local73) * local202 + 1024;
						@Pc(244) int local244 = local221 & Static129.anInt2676;
						@Pc(248) int local248 = local148 & Static39.anInt939;
						if (local143) {
							local32[local248][local244] = local240;
						} else {
							local32[local244][local248] = local240;
						}
						if (local198 > 0) {
							local148 += local219;
							local198 += -local150;
						}
					}
				}
			}
		}
		return local17;
	}
}
