import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "[I")
	public static final int[] anIntArray116 = new int[120];

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
	private int anInt1133 = 0;

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
	private int anInt1139 = 4096;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
	private int anInt1137 = 2000;

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
	private int anInt1141 = 16;

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
	private int anInt1135 = 0;

	static {
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 120; local20++) {
			@Pc(25) int local25 = local20 + 1;
			@Pc(38) int local38 = (int) (Math.pow(2.0D, (double) local25 / 7.0D) * 300.0D + (double) local25);
			local18 += local38;
			anIntArray116[local20] = local18 / 4;
		}
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(28) int local28 = this.anInt1139 >> 1;
			@Pc(33) int[][] local33 = super.aClass225_41.method5086();
			@Pc(40) Random local40 = new Random((long) this.anInt1135);
			for (@Pc(42) int local42 = 0; local42 < this.anInt1137; local42++) {
				@Pc(63) int local63 = this.anInt1139 > 0 ? this.anInt1133 + Static70.method1340(local40, this.anInt1139) - local28 : this.anInt1133;
				@Pc(69) int local69 = local63 >> 4 & 0xFF;
				@Pc(74) int local74 = Static70.method1340(local40, Static18.anInt439);
				@Pc(79) int local79 = Static70.method1340(local40, Static217.anInt4363);
				@Pc(90) int local90 = local74 + (this.anInt1141 * Static311.anIntArray545[local69] >> 12);
				@Pc(101) int local101 = (Static435.anIntArray722[local69] * this.anInt1141 >> 12) + local79;
				@Pc(106) int local106 = local101 - local79;
				@Pc(111) int local111 = local90 - local74;
				if (local111 != 0 || local106 != 0) {
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local111 < 0) {
						local111 = -local111;
					}
					@Pc(135) boolean local135 = local111 < local106;
					@Pc(139) int local139;
					@Pc(141) int local141;
					if (local135) {
						local139 = local74;
						local141 = local90;
						local74 = local79;
						local90 = local101;
						local79 = local139;
						local101 = local141;
					}
					if (local74 > local90) {
						local139 = local74;
						local74 = local90;
						local141 = local79;
						local90 = local139;
						local79 = local101;
						local101 = local141;
					}
					local139 = local79;
					local141 = local90 - local74;
					@Pc(176) int local176 = local101 - local79;
					@Pc(181) int local181 = -local141 / 2;
					@Pc(185) int local185 = 2048 / local141;
					@Pc(194) int local194 = 1024 - (Static70.method1340(local40, 4096) >> 2);
					@Pc(201) int local201 = local79 < local101 ? 1 : -1;
					if (local176 < 0) {
						local176 = -local176;
					}
					for (@Pc(211) int local211 = local74; local211 < local90; local211++) {
						@Pc(224) int local224 = (local211 - local74) * local185 + local194 + 1024;
						@Pc(228) int local228 = Static283.anInt5397 & local211;
						@Pc(232) int local232 = local139 & Static443.anInt7904;
						if (local135) {
							local33[local232][local228] = local224;
						} else {
							local33[local228][local232] = local224;
						}
						local181 += local176;
						if (local181 > 0) {
							local139 += local201;
							local181 += -local141;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt1135 = arg1.method1171();
		} else if (arg0 == 1) {
			this.anInt1137 = arg1.method1177();
		} else if (arg0 == 2) {
			this.anInt1141 = arg1.method1171();
		} else if (arg0 == 3) {
			this.anInt1133 = arg1.method1177();
		} else if (arg0 == 4) {
			this.anInt1139 = arg1.method1177();
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		Static9.method2255();
	}
}
