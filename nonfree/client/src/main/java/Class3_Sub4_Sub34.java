import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class3_Sub4_Sub34 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
	private int anInt7129 = 2048;

	@OriginalMember(owner = "client!ur", name = "S", descriptor = "I")
	private int anInt7135 = 0;

	@OriginalMember(owner = "client!ur", name = "R", descriptor = "I")
	private int anInt7134 = 12288;

	@OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
	private int anInt7131 = 2048;

	@OriginalMember(owner = "client!ur", name = "T", descriptor = "I")
	private int anInt7136 = 0;

	@OriginalMember(owner = "client!ur", name = "W", descriptor = "I")
	private int anInt7139 = 4096;

	@OriginalMember(owner = "client!ur", name = "X", descriptor = "I")
	private int anInt7140 = 8192;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)V")
	@Override
	public void method5963() {
		Static251.method3833();
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(27) int local27 = Static285.anIntArray401[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static106.anInt2356; local29++) {
				@Pc(37) int local37 = Static382.anIntArray476[local29] - 2048;
				@Pc(42) int local42 = this.anInt7131 + local37;
				@Pc(53) int local53 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(62) int local62 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(67) int local67 = local27 + this.anInt7135;
				@Pc(78) int local78 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(89) int local89 = local78 <= 2048 ? local78 : local78 - 4096;
				@Pc(95) int local95 = local37 + this.anInt7136;
				@Pc(106) int local106 = local95 >= -2048 ? local95 : local95 + 4096;
				@Pc(115) int local115 = local106 <= 2048 ? local106 : local106 - 4096;
				@Pc(121) int local121 = local27 + this.anInt7129;
				@Pc(130) int local130 = local121 >= -2048 ? local121 : local121 + 4096;
				@Pc(139) int local139 = local130 <= 2048 ? local130 : local130 - 4096;
				local17[local29] = this.method5543(local89, local62) || this.method5542(local139, local115) ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt7131 = arg1.method6004();
		} else if (arg0 == 1) {
			this.anInt7135 = arg1.method6004();
		} else if (arg0 == 2) {
			this.anInt7136 = arg1.method6004();
		} else if (arg0 == 3) {
			this.anInt7129 = arg1.method6004();
		} else if (arg0 == 4) {
			this.anInt7134 = arg1.method6004();
		} else if (arg0 == 5) {
			this.anInt7139 = arg1.method6004();
		} else if (arg0 == 6) {
			this.anInt7140 = arg1.method6004();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIB)Z")
	private boolean method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt7134 * (arg1 + arg0) >> 12;
		@Pc(28) int local28 = Static21.anIntArray46[local12 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt7134;
		@Pc(42) int local42 = (local35 << 12) / this.anInt7140;
		@Pc(49) int local49 = local42 * this.anInt7139 >> 12;
		return arg0 - arg1 < local49 && -local49 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BII)Z")
	private boolean method5543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt7134 >> 12;
		@Pc(23) int local23 = Static21.anIntArray46[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt7134;
		@Pc(37) int local37 = (local30 << 12) / this.anInt7140;
		@Pc(44) int local44 = local37 * this.anInt7139 >> 12;
		return local44 > arg1 + arg0 && -local44 < arg0 + arg1;
	}
}
