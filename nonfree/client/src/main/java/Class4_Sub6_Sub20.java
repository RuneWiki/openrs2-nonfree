import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class4_Sub6_Sub20 extends Class4_Sub6 {

	@OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
	private int anInt4005 = 2048;

	@OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
	private int anInt4001 = 4096;

	@OriginalMember(owner = "client!kt", name = "H", descriptor = "I")
	private int anInt4004 = 0;

	@OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
	private int anInt4006 = 2048;

	@OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
	private int anInt4009 = 12288;

	@OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
	private int anInt4007 = 0;

	@OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
	private int anInt4010 = 8192;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			@Pc(29) int local29 = Static165.anIntArray209[arg0] - 2048;
			for (@Pc(31) int local31 = 0; local31 < Static80.anInt1616; local31++) {
				@Pc(39) int local39 = Static341.anIntArray504[local31] - 2048;
				@Pc(44) int local44 = local39 + this.anInt4005;
				@Pc(55) int local55 = local44 < -2048 ? local44 + 4096 : local44;
				@Pc(66) int local66 = local55 > 2048 ? local55 - 4096 : local55;
				@Pc(71) int local71 = this.anInt4004 + local29;
				@Pc(82) int local82 = local71 < -2048 ? local71 + 4096 : local71;
				@Pc(91) int local91 = local82 <= 2048 ? local82 : local82 - 4096;
				@Pc(97) int local97 = local39 + this.anInt4007;
				@Pc(106) int local106 = local97 < -2048 ? local97 + 4096 : local97;
				@Pc(117) int local117 = local106 <= 2048 ? local106 : local106 - 4096;
				@Pc(122) int local122 = local29 + this.anInt4006;
				@Pc(133) int local133 = local122 < -2048 ? local122 + 4096 : local122;
				@Pc(142) int local142 = local133 <= 2048 ? local133 : local133 - 4096;
				local11[local31] = this.method3259(local66, local91) || this.method3260(local142, local117) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4005 = arg1.method2536();
		} else if (arg0 == 1) {
			this.anInt4004 = arg1.method2536();
		} else if (arg0 == 2) {
			this.anInt4007 = arg1.method2536();
		} else if (arg0 == 3) {
			this.anInt4006 = arg1.method2536();
		} else if (arg0 == 4) {
			this.anInt4009 = arg1.method2536();
		} else if (arg0 == 5) {
			this.anInt4001 = arg1.method2536();
		} else if (arg0 == 6) {
			this.anInt4010 = arg1.method2536();
		}
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(III)Z")
	private boolean method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt4009 >> 12;
		@Pc(23) int local23 = Static345.anIntArray416[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt4009;
		@Pc(37) int local37 = (local30 << 12) / this.anInt4010;
		@Pc(44) int local44 = local37 * this.anInt4001 >> 12;
		return arg1 + arg0 < local44 && -local44 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIB)Z")
	private boolean method3260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt4009 * (arg1 + arg0) >> 12;
		@Pc(22) int local22 = Static345.anIntArray416[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt4009;
		@Pc(36) int local36 = (local29 << 12) / this.anInt4010;
		@Pc(43) int local43 = this.anInt4001 * local36 >> 12;
		return local43 > arg0 - arg1 && arg0 - arg1 > -local43;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
	@Override
	public void method5509() {
		Static101.method1784();
	}
}
