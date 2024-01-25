import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "[I")
	private int[] anIntArray494;

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "[I")
	private int[] anIntArray495;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private int anInt6587 = 2048;

	@OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
	private int anInt6595 = 0;

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
	private int anInt6591 = 10;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(24) int local24 = Static60.anIntArray122[arg0];
			@Pc(34) int local34;
			if (this.anInt6595 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt6591; local34++) {
					if (this.anIntArray495[local34] <= local24 && this.anIntArray495[local34 + 1] > local24) {
						if (this.anIntArray494[local34] > local24) {
							local32 = 4096;
						}
						break;
					}
				}
				Static374.method2829(local11, 0, Static85.anInt1910, local32);
			} else {
				for (@Pc(82) int local82 = 0; local82 < Static85.anInt1910; local82++) {
					local34 = 0;
					@Pc(88) short local88 = 0;
					@Pc(92) int local92 = Static273.anIntArray414[local82];
					@Pc(95) int local95 = this.anInt6595;
					if (local95 == 1) {
						local34 = local92;
					} else if (local95 == 2) {
						local34 = (local24 + local92 - 4096 >> 1) + 2048;
					} else if (local95 == 3) {
						local34 = (local92 - local24 >> 1) + 2048;
					}
					for (local95 = 0; local95 < this.anInt6591; local95++) {
						if (this.anIntArray495[local95] <= local34 && this.anIntArray495[local95 + 1] > local34) {
							if (this.anIntArray494[local95] > local34) {
								local88 = 4096;
							}
							break;
						}
					}
					local11[local82] = local88;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		this.method5814();
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
	private void method5814() {
		this.anIntArray494 = new int[this.anInt6591 + 1];
		@Pc(22) int local22 = 0;
		this.anIntArray495 = new int[this.anInt6591 + 1];
		@Pc(34) int local34 = 4096 / this.anInt6591;
		@Pc(41) int local41 = local34 * this.anInt6587 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt6591; local43++) {
			this.anIntArray495[local43] = local22;
			this.anIntArray494[local43] = local22 + local41;
			local22 += local34;
		}
		this.anIntArray495[this.anInt6591] = 4096;
		this.anIntArray494[this.anInt6591] = this.anIntArray494[0] + 4096;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6591 = arg1.method2132();
		} else if (arg0 == 1) {
			this.anInt6587 = arg1.method2161();
		} else if (arg0 == 2) {
			this.anInt6595 = arg1.method2132();
		}
	}
}
