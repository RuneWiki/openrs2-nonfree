import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dma")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dma", name = "D", descriptor = "[I")
	private int[] anIntArray142;

	@OriginalMember(owner = "client!dma", name = "A", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!dma", name = "J", descriptor = "I")
	private int anInt2457 = 2048;

	@OriginalMember(owner = "client!dma", name = "z", descriptor = "I")
	private int anInt2454 = 10;

	@OriginalMember(owner = "client!dma", name = "E", descriptor = "I")
	private int anInt2456 = 0;

	@OriginalMember(owner = "client!dma", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dma", name = "c", descriptor = "(I)V")
	private void method2255() {
		this.anIntArray143 = new int[this.anInt2454 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray142 = new int[this.anInt2454 + 1];
		@Pc(26) int local26 = 4096 / this.anInt2454;
		@Pc(33) int local33 = this.anInt2457 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2454; local35++) {
			this.anIntArray142[local35] = local14;
			this.anIntArray143[local35] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray142[this.anInt2454] = 4096;
		this.anIntArray143[this.anInt2454] = this.anIntArray143[0] + 4096;
		if (-23666 != -23666) {
			Static120.anInt2460 = 42;
		}
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		this.method2255();
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2454 = arg1.method2048(255);
		} else if (arg0 == 1) {
			this.anInt2457 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			this.anInt2456 = arg1.method2048(255);
		}
	}

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(25) int local25 = Static121.anIntArray145[arg0];
			@Pc(35) int local35;
			if (this.anInt2456 == 0) {
				@Pc(33) short local33 = 0;
				for (local35 = 0; local35 < this.anInt2454; local35++) {
					if (local25 >= this.anIntArray142[local35] && this.anIntArray142[local35 + 1] > local25) {
						if (local25 < this.anIntArray143[local35]) {
							local33 = 4096;
						}
						break;
					}
				}
				Static732.method6314(local17, 0, Static379.anInt5859, local33);
			} else {
				for (@Pc(101) int local101 = 0; local101 < Static379.anInt5859; local101++) {
					local35 = 0;
					@Pc(107) short local107 = 0;
					@Pc(111) int local111 = Static497.anIntArray579[local101];
					@Pc(114) int local114 = this.anInt2456;
					if (local114 == 1) {
						local35 = local111;
					} else if (local114 == 2) {
						local35 = (local25 + local111 - 4096 >> 1) + 2048;
					} else if (local114 == 3) {
						local35 = (local111 - local25 >> 1) + 2048;
					}
					for (local114 = 0; local114 < this.anInt2454; local114++) {
						if (local35 >= this.anIntArray142[local114] && local35 < this.anIntArray142[local114 + 1]) {
							if (this.anIntArray143[local114] > local35) {
								local107 = 4096;
							}
							break;
						}
					}
					local17[local101] = local107;
				}
			}
		}
		return local17;
	}
}
