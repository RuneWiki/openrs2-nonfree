import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public final class Class2_Sub11_Sub8 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ht", name = "S", descriptor = "I")
	private int anInt3987;

	@OriginalMember(owner = "client!ht", name = "E", descriptor = "I")
	private int anInt3990;

	@OriginalMember(owner = "client!ht", name = "N", descriptor = "I")
	private int anInt3991;

	@OriginalMember(owner = "client!ht", name = "F", descriptor = "I")
	private int anInt3993;

	@OriginalMember(owner = "client!ht", name = "M", descriptor = "I")
	private int anInt3994;

	@OriginalMember(owner = "client!ht", name = "J", descriptor = "I")
	private int anInt3997;

	@OriginalMember(owner = "client!ht", name = "R", descriptor = "I")
	private int anInt3992 = 0;

	@OriginalMember(owner = "client!ht", name = "G", descriptor = "I")
	private int anInt3988 = 0;

	@OriginalMember(owner = "client!ht", name = "O", descriptor = "I")
	private int anInt3998 = 0;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(IIII)V")
	private void method3596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) int local34 = arg1 <= 2048 ? (arg2 + 4096) * arg1 >> 12 : arg2 + arg1 - (arg2 * arg1 >> 12);
		if (local34 <= 0) {
			this.anInt3987 = this.anInt3991 = this.anInt3997 = arg1;
			return;
		}
		@Pc(51) int local51 = arg0 * 6;
		@Pc(59) int local59 = arg1 + arg1 - local34;
		@Pc(68) int local68 = (local34 - local59 << 12) / local34;
		@Pc(72) int local72 = local51 >> 12;
		@Pc(79) int local79 = local51 - (local72 << 12);
		@Pc(87) int local87 = local34 * local68 >> 12;
		@Pc(93) int local93 = local79 * local87 >> 12;
		@Pc(97) int local97 = local93 + local59;
		@Pc(102) int local102 = local34 - local93;
		if (local72 == 0) {
			this.anInt3987 = local34;
			this.anInt3997 = local59;
			this.anInt3991 = local97;
		} else if (local72 == 1) {
			this.anInt3997 = local59;
			this.anInt3987 = local102;
			this.anInt3991 = local34;
		} else if (local72 == 2) {
			this.anInt3987 = local59;
			this.anInt3997 = local97;
			this.anInt3991 = local34;
		} else if (local72 == 3) {
			this.anInt3987 = local59;
			this.anInt3991 = local102;
			this.anInt3997 = local34;
		} else if (local72 == 4) {
			this.anInt3997 = local34;
			this.anInt3987 = local97;
			this.anInt3991 = local59;
		} else if (local72 == 5) {
			this.anInt3987 = local34;
			this.anInt3991 = local59;
			this.anInt3997 = local102;
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt3998 = arg1.method8598();
		} else if (arg0 == 1) {
			this.anInt3992 = (arg1.method8536() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3988 = (arg1.method8536() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(IIII)V")
	private void method3597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg2 >= arg0 ? arg2 : arg0;
		@Pc(33) int local33 = arg2 <= arg0 ? arg2 : arg0;
		@Pc(41) int local41 = arg1 <= local13 ? local13 : arg1;
		@Pc(49) int local49 = local33 > arg1 ? arg1 : local33;
		@Pc(54) int local54 = local41 - local49;
		this.anInt3994 = (local41 + local49) / 2;
		if (local54 > 0) {
			@Pc(75) int local75 = (local41 - arg0 << 12) / local54;
			@Pc(84) int local84 = (local41 - arg2 << 12) / local54;
			@Pc(92) int local92 = (local41 - arg1 << 12) / local54;
			if (local41 == arg0) {
				this.anInt3993 = local49 == arg2 ? local92 + 20480 : 4096 - local84;
			} else if (local41 == arg2) {
				this.anInt3993 = local49 == arg1 ? local75 + 4096 : -local92 + 12288;
			} else {
				this.anInt3993 = local49 == arg0 ? local84 + 12288 : -local75 + 20480;
			}
			this.anInt3993 /= 6;
		} else {
			this.anInt3993 = 0;
		}
		if (this.anInt3994 > 0 && this.anInt3994 < 4096) {
			this.anInt3990 = (local54 << 12) / (this.anInt3994 <= 2048 ? this.anInt3994 * 2 : 8192 - (this.anInt3994 * 2));
		} else {
			this.anInt3990 = 0;
		}
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(29) int[][] local29 = this.method9538(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static301.anInt10214; local55++) {
				this.method3597(local33[local55], local41[local55], local37[local55]);
				this.anInt3990 += this.anInt3992;
				this.anInt3994 += this.anInt3988;
				for (this.anInt3993 += this.anInt3998; this.anInt3993 < 0; this.anInt3993 += 4096) {
				}
				if (this.anInt3990 < 0) {
					this.anInt3990 = 0;
				}
				while (this.anInt3993 > 4096) {
					this.anInt3993 -= 4096;
				}
				if (this.anInt3994 < 0) {
					this.anInt3994 = 0;
				}
				if (this.anInt3990 > 4096) {
					this.anInt3990 = 4096;
				}
				if (this.anInt3994 > 4096) {
					this.anInt3994 = 4096;
				}
				this.method3596(this.anInt3993, this.anInt3994, this.anInt3990);
				local45[local55] = this.anInt3987;
				local49[local55] = this.anInt3991;
				local53[local55] = this.anInt3997;
			}
		}
		return local19;
	}
}
