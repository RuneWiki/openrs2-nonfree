import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
	private int anInt2590 = 8192;

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
	private int anInt2591 = 0;

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
	private int anInt2592 = 12288;

	@OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
	private int anInt2596 = 2048;

	@OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
	private int anInt2599 = 2048;

	@OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
	private int anInt2600 = 4096;

	@OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
	private int anInt2601 = 0;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt2596 = arg1.method5177();
		} else if (arg0 == 1) {
			this.anInt2591 = arg1.method5177();
		} else if (arg0 == 2) {
			this.anInt2601 = arg1.method5177();
		} else if (arg0 == 3) {
			this.anInt2599 = arg1.method5177();
		} else if (arg0 == 4) {
			this.anInt2592 = arg1.method5177();
		} else if (arg0 == 5) {
			this.anInt2600 = arg1.method5177();
		} else if (arg0 == 6) {
			this.anInt2590 = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(26) int local26 = Static394.anIntArray751[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static158.anInt2658; local28++) {
				@Pc(36) int local36 = Static87.anIntArray211[local28] - 2048;
				@Pc(42) int local42 = local36 + this.anInt2596;
				@Pc(53) int local53 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(62) int local62 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(67) int local67 = this.anInt2591 + local26;
				@Pc(76) int local76 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(87) int local87 = local76 > 2048 ? local76 - 4096 : local76;
				@Pc(93) int local93 = local36 + this.anInt2601;
				@Pc(104) int local104 = local93 < -2048 ? local93 + 4096 : local93;
				@Pc(115) int local115 = local104 > 2048 ? local104 - 4096 : local104;
				@Pc(121) int local121 = local26 + this.anInt2599;
				@Pc(132) int local132 = local121 >= -2048 ? local121 : local121 + 4096;
				@Pc(141) int local141 = local132 <= 2048 ? local132 : local132 - 4096;
				local16[local28] = this.method2081(local62, local87) || this.method2083(local115, local141) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(BII)Z")
	private boolean method2081(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt2592 * (arg1 - arg0) >> 12;
		@Pc(28) int local28 = Static392.anIntArray748[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt2592;
		@Pc(42) int local42 = (local35 << 12) / this.anInt2590;
		@Pc(49) int local49 = this.anInt2600 * local42 >> 12;
		return arg1 + arg0 < local49 && -local49 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(ZII)Z")
	private boolean method2083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt2592 * (arg1 + arg0) >> 12;
		@Pc(23) int local23 = Static392.anIntArray748[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local23 << 12) / this.anInt2592;
		@Pc(42) int local42 = (local35 << 12) / this.anInt2590;
		@Pc(49) int local49 = this.anInt2600 * local42 >> 12;
		return local49 > arg1 - arg0 && arg1 - arg0 > -local49;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		Static73.method1169();
	}
}
