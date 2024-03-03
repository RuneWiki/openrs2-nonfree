import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class2_Sub3_Sub14 extends Class2_Sub3 {

	@OriginalMember(owner = "client!hr", name = "Y", descriptor = "Lclient!bc;")
	public static final Class16 aClass16_3 = new Class16("", 10);

	@OriginalMember(owner = "client!hr", name = "P", descriptor = "I")
	private int anInt2567 = 4096;

	@OriginalMember(owner = "client!hr", name = "O", descriptor = "I")
	private int anInt2566 = 4096;

	@OriginalMember(owner = "client!hr", name = "T", descriptor = "[I")
	private final int[] anIntArray165 = new int[3];

	@OriginalMember(owner = "client!hr", name = "Z", descriptor = "I")
	private int anInt2574 = 4096;

	@OriginalMember(owner = "client!hr", name = "X", descriptor = "I")
	private int anInt2573 = 409;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V", line = 3)
	public Class2_Sub3_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!bt;I)V", line = 6)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt2573 = arg1.method4830();
		} else if (arg0 == 1) {
			this.anInt2567 = arg1.method4830();
		} else if (arg0 == 2) {
			this.anInt2574 = arg1.method4830();
		} else if (arg0 == 3) {
			this.anInt2566 = arg1.method4830();
		} else if (arg0 == 4) {
			@Pc(62) int local62 = arg1.method4834();
			this.anIntArray165[2] = local62 >> 12 & 0x0;
			this.anIntArray165[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray165[1] = local62 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IB)[[I", line = 193)
	@Override
	public int[][] method6480(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass243_41.method6278(arg0);
		if (super.aClass243_41.aBoolean478) {
			@Pc(27) int[][] local27 = this.method6484(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static211.anInt4031; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(66) int local66 = local59 - this.anIntArray165[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt2573) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(104) int local104 = local35[local53];
					local66 = local104 - this.anIntArray165[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (this.anInt2573 < local66) {
						local43[local53] = local59;
						local47[local53] = local104;
						local51[local53] = local39[local53];
					} else {
						@Pc(140) int local140 = local39[local53];
						local66 = local140 - this.anIntArray165[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt2573) {
							local43[local53] = local59;
							local47[local53] = local104;
							local51[local53] = local140;
						} else {
							local43[local53] = this.anInt2566 * local59 >> 12;
							local47[local53] = this.anInt2574 * local104 >> 12;
							local51[local53] = local140 * this.anInt2567 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}
}
