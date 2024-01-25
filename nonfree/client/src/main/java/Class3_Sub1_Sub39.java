import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class3_Sub1_Sub39 extends Class3_Sub1 {

	@OriginalMember(owner = "client!wr", name = "N", descriptor = "[I")
	private int[] anIntArray678;

	@OriginalMember(owner = "client!wr", name = "T", descriptor = "[I")
	private int[] anIntArray679;

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
	private int anInt10379 = 10;

	@OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
	private int anInt10381 = 0;

	@OriginalMember(owner = "client!wr", name = "U", descriptor = "I")
	private int anInt10388 = 2048;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(19) int local19 = Static324.anIntArray440[arg0];
			@Pc(26) int local26;
			if (this.anInt10381 == 0) {
				@Pc(24) short local24 = 0;
				for (local26 = 0; local26 < this.anInt10379; local26++) {
					if (this.anIntArray679[local26] <= local19 && this.anIntArray679[local26 + 1] > local19) {
						if (local19 < this.anIntArray678[local26]) {
							local24 = 4096;
						}
						break;
					}
				}
				Static602.method4663(local11, 0, Static131.anInt2935, local24);
			} else {
				for (@Pc(70) int local70 = 0; local70 < Static131.anInt2935; local70++) {
					local26 = 0;
					@Pc(76) short local76 = 0;
					@Pc(80) int local80 = Static361.anIntArray460[local70];
					@Pc(83) int local83 = this.anInt10381;
					if (local83 == 1) {
						local26 = local80;
					} else if (local83 == 2) {
						local26 = (local19 + local80 - 4096 >> 1) + 2048;
					} else if (local83 == 3) {
						local26 = (local80 - local19 >> 1) + 2048;
					}
					for (local83 = 0; local83 < this.anInt10379; local83++) {
						if (this.anIntArray679[local83] <= local26 && this.anIntArray679[local83 + 1] > local26) {
							if (local26 < this.anIntArray678[local83]) {
								local76 = 4096;
							}
							break;
						}
					}
					local11[local70] = local76;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt10379 = arg1.method6538();
		} else if (arg0 == 1) {
			this.anInt10388 = arg1.method6535();
		} else if (arg0 == 2) {
			this.anInt10381 = arg1.method6538();
		}
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
	private void method8376() {
		this.anIntArray679 = new int[this.anInt10379 + 1];
		this.anIntArray678 = new int[this.anInt10379 + 1];
		@Pc(29) int local29 = 0;
		@Pc(34) int local34 = 4096 / this.anInt10379;
		@Pc(41) int local41 = local34 * this.anInt10388 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt10379; local43++) {
			this.anIntArray679[local43] = local29;
			this.anIntArray678[local43] = local41 + local29;
			local29 += local34;
		}
		this.anIntArray679[this.anInt10379] = 4096;
		this.anIntArray678[this.anInt10379] = this.anIntArray678[0] + 4096;
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		this.method8376();
	}
}
