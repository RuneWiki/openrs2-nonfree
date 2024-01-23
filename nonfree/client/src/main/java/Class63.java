import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class63 {

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	private int anInt2409 = Static121.method2120(16);

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	private int anInt2411 = Static121.method2120(24);

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	private int anInt2413 = Static121.method2120(24);

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	private int anInt2410 = Static121.method2120(24) + 1;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	private int anInt2408 = Static121.method2120(6) + 1;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	private int anInt2412 = Static121.method2120(8);

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
	private int[] anIntArray141;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class63() {
		@Pc(33) int[] local33 = new int[this.anInt2408];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2408; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static121.method2120(3);
			@Pc(47) boolean local47 = Static121.method2124() != 0;
			if (local47) {
				local38 = Static121.method2120(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray141 = new int[this.anInt2408 * 8];
		for (local38 = 0; local38 < this.anInt2408 * 8; local38++) {
			this.anIntArray141[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static121.method2120(8);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([FIZ)V")
	public void method1840(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static121.aClass121Array1[this.anInt2412].anInt4598;
		@Pc(25) int local25 = this.anInt2413 - this.anInt2411;
		@Pc(30) int local30 = local25 / this.anInt2410;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static121.aClass121Array1[this.anInt2412].method3601();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt2408;
						}
						local47 /= this.anInt2408;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray141[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt2411 + local38 * this.anInt2410;
						@Pc(104) Class121 local104 = Static121.aClass121Array1[local90];
						@Pc(113) int local113;
						if (this.anInt2409 == 0) {
							local113 = this.anInt2410 / local104.anInt4598;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method3602();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt4598; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt2410) {
								@Pc(153) float[] local153 = local104.method3602();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt4598; local155++) {
									arg0[local100 + local113] += local153[local155];
									local113++;
								}
							}
						}
					}
					local38++;
					if (local38 >= local30) {
						break;
					}
				}
			}
		}
	}
}
