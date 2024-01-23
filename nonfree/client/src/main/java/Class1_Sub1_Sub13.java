import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
	private int anInt2488 = 4096;

	@OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
	private int anInt2491 = 3216;

	@OriginalMember(owner = "client!ig", name = "eb", descriptor = "I")
	private int anInt2496 = 3216;

	@OriginalMember(owner = "client!ig", name = "ib", descriptor = "[I")
	private int[] anIntArray242 = new int[3];

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2488 = arg0.method2652();
		} else if (arg1 == 1) {
			this.anInt2496 = arg0.method2652();
		} else if (arg1 == 2) {
			this.anInt2491 = arg0.method2652();
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		this.method1865();
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)V")
	private void method1865() {
		@Pc(7) double local7 = Math.cos((double) ((float) this.anInt2491 / 4096.0F));
		this.anIntArray242[0] = (int) (local7 * Math.sin((double) ((float) this.anInt2496 / 4096.0F)) * 4096.0D);
		this.anIntArray242[1] = (int) (Math.cos((double) ((float) this.anInt2496 / 4096.0F)) * local7 * 4096.0D);
		this.anIntArray242[2] = (int) (Math.sin((double) ((float) this.anInt2491 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray242[1] * this.anIntArray242[1] >> 12;
		@Pc(85) int local85 = this.anIntArray242[0] * this.anIntArray242[0] >> 12;
		@Pc(97) int local97 = this.anIntArray242[2] * this.anIntArray242[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local73 + local85 + local97 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray242[0] = (this.anIntArray242[0] << 12) / local110;
			this.anIntArray242[1] = (this.anIntArray242[1] << 12) / local110;
			this.anIntArray242[2] = (this.anIntArray242[2] << 12) / local110;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(28) int local28 = this.anInt2488 * Static229.anInt5035 >> 12;
			@Pc(38) int[] local38 = this.method4746(0, arg0 - 1 & Static178.anInt4007);
			@Pc(44) int[] local44 = this.method4746(0, arg0);
			@Pc(54) int[] local54 = this.method4746(0, arg0 + 1 & Static178.anInt4007);
			for (@Pc(56) int local56 = 0; local56 < Static75.anInt1848; local56++) {
				@Pc(75) int local75 = local28 * (local54[local56] - local38[local56]) >> 12;
				@Pc(79) int local79 = local75 >> 4;
				@Pc(100) int local100 = local28 * (local44[local56 - 1 & Static145.anInt3482] - local44[local56 + 1 & Static145.anInt3482]) >> 12;
				@Pc(104) int local104 = local100 >> 4;
				if (local79 < 0) {
					local79 = -local79;
				}
				if (local79 > 255) {
					local79 = 255;
				}
				if (local104 < 0) {
					local104 = -local104;
				}
				if (local104 > 255) {
					local104 = 255;
				}
				@Pc(141) int local141 = Class133.aByteArray67[((local79 + 1) * local79 >> 1) + local104] & 0xFF;
				@Pc(147) int local147 = local141 * local75 >> 8;
				@Pc(156) int local156 = this.anIntArray242[1] * local147 >> 12;
				@Pc(162) int local162 = local141 * local100 >> 8;
				@Pc(171) int local171 = local162 * this.anIntArray242[0] >> 12;
				@Pc(177) int local177 = local141 * 4096 >> 8;
				@Pc(186) int local186 = local177 * this.anIntArray242[2] >> 12;
				local17[local56] = local186 + local156 + local171;
			}
		}
		return local17;
	}
}
