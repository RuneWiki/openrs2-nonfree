import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
	private int anInt4595 = 0;

	@OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
	private int anInt4598 = 8192;

	@OriginalMember(owner = "client!jq", name = "I", descriptor = "I")
	private int anInt4601 = 2048;

	@OriginalMember(owner = "client!jq", name = "K", descriptor = "I")
	private int anInt4603 = 0;

	@OriginalMember(owner = "client!jq", name = "L", descriptor = "I")
	private int anInt4604 = 12288;

	@OriginalMember(owner = "client!jq", name = "O", descriptor = "I")
	private int anInt4607 = 4096;

	@OriginalMember(owner = "client!jq", name = "N", descriptor = "I")
	private int anInt4606 = 2048;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(26) int local26 = Static583.anIntArray614[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static501.anInt8748; local28++) {
				@Pc(36) int local36 = Static95.anIntArray77[local28] - 2048;
				@Pc(41) int local41 = this.anInt4601 + local36;
				@Pc(50) int local50 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(61) int local61 = local50 > 2048 ? local50 - 4096 : local50;
				@Pc(67) int local67 = local26 + this.anInt4603;
				@Pc(76) int local76 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(87) int local87 = local76 <= 2048 ? local76 : local76 - 4096;
				@Pc(92) int local92 = this.anInt4595 + local36;
				@Pc(101) int local101 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(110) int local110 = local101 > 2048 ? local101 - 4096 : local101;
				@Pc(115) int local115 = local26 + this.anInt4606;
				@Pc(126) int local126 = local115 < -2048 ? local115 + 4096 : local115;
				@Pc(137) int local137 = local126 <= 2048 ? local126 : local126 - 4096;
				local16[local28] = this.method3683(local61, local87) || this.method3685(local137, local110) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBI)Z")
	private boolean method3683(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt4604 * (arg1 - arg0) >> 12;
		@Pc(23) int local23 = Static133.anIntArray110[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local23 << 12) / this.anInt4604;
		@Pc(45) int local45 = (local38 << 12) / this.anInt4598;
		@Pc(52) int local52 = local45 * this.anInt4607 >> 12;
		return arg0 + arg1 < local52 && arg0 + arg1 > -local52;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4601 = arg1.method7945();
		} else if (arg0 == 1) {
			this.anInt4603 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anInt4595 = arg1.method7945();
		} else if (arg0 == 3) {
			this.anInt4606 = arg1.method7945();
		} else if (arg0 == 4) {
			this.anInt4604 = arg1.method7945();
		} else if (arg0 == 5) {
			this.anInt4607 = arg1.method7945();
		} else if (arg0 == 6) {
			this.anInt4598 = arg1.method7945();
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(III)Z")
	private boolean method3685(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt4604 >> 12;
		@Pc(27) int local27 = Static133.anIntArray110[local12 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt4604;
		@Pc(41) int local41 = (local34 << 12) / this.anInt4598;
		@Pc(48) int local48 = local41 * this.anInt4607 >> 12;
		return local48 > arg0 - arg1 && -local48 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
		Static263.method3803();
	}
}
