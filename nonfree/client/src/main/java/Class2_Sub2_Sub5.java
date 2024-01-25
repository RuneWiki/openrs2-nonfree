import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
	private int anInt639 = 4096;

	@OriginalMember(owner = "client!bs", name = "J", descriptor = "I")
	private int anInt638 = 2000;

	@OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
	private int anInt642 = 16;

	@OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
	private int anInt640 = 0;

	@OriginalMember(owner = "client!bs", name = "P", descriptor = "I")
	private int anInt644 = 0;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt644 = arg0.method6138();
		} else if (arg1 == 1) {
			this.anInt638 = arg0.method6148();
		} else if (arg1 == 2) {
			this.anInt642 = arg0.method6138();
		} else if (arg1 == 3) {
			this.anInt640 = arg0.method6148();
		} else if (arg1 == 4) {
			this.anInt639 = arg0.method6148();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			@Pc(26) int local26 = this.anInt639 >> 1;
			@Pc(31) int[][] local31 = super.aClass234_41.method5373();
			@Pc(38) Random local38 = new Random((long) this.anInt644);
			for (@Pc(40) int local40 = 0; local40 < this.anInt638; local40++) {
				@Pc(63) int local63 = this.anInt639 <= 0 ? this.anInt640 : this.anInt640 + Static408.method1356(local38, this.anInt639) - local26;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static408.method1356(local38, Static398.anInt6955);
				@Pc(79) int local79 = Static408.method1356(local38, Static271.anInt4925);
				@Pc(90) int local90 = (this.anInt642 * Static314.anIntArray477[local69] >> 12) + local74;
				@Pc(101) int local101 = local79 + (this.anInt642 * Static55.anIntArray70[local69] >> 12);
				@Pc(106) int local106 = local101 - local79;
				@Pc(111) int local111 = local90 - local74;
				if (local111 != 0 || local106 != 0) {
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local111 < 0) {
						local111 = -local111;
					}
					@Pc(138) boolean local138 = local111 < local106;
					@Pc(142) int local142;
					@Pc(146) int local146;
					if (local138) {
						local142 = local74;
						local74 = local79;
						local146 = local90;
						local90 = local101;
						local79 = local142;
						local101 = local146;
					}
					if (local74 > local90) {
						local142 = local74;
						local74 = local90;
						local146 = local79;
						local90 = local142;
						local79 = local101;
						local101 = local146;
					}
					local142 = local79;
					local146 = local90 - local74;
					@Pc(183) int local183 = local101 - local79;
					@Pc(188) int local188 = -local146 / 2;
					@Pc(192) int local192 = 2048 / local146;
					@Pc(202) int local202 = 1024 - (Static408.method1356(local38, 4096) >> 2);
					@Pc(209) int local209 = local79 < local101 ? 1 : -1;
					if (local183 < 0) {
						local183 = -local183;
					}
					for (@Pc(219) int local219 = local74; local219 < local90; local219++) {
						@Pc(233) int local233 = local202 + (local219 + -local74) * local192 + 1024;
						@Pc(237) int local237 = local219 & Static210.anInt3600;
						@Pc(241) int local241 = local142 & Static71.anInt1203;
						local188 += local183;
						if (local138) {
							local31[local241][local237] = local233;
						} else {
							local31[local237][local241] = local233;
						}
						if (local188 > 0) {
							local188 += -local146;
							local142 += local209;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
	@Override
	public void method6262() {
		Static193.method2769();
	}
}
