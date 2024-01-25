import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class6_Sub5_Sub33 extends Class6_Sub5 {

	@OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
	private int anInt7142 = 0;

	@OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
	private int anInt7146 = 2048;

	@OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
	private int anInt7145 = 2048;

	@OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
	private int anInt7143 = 12288;

	@OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
	private int anInt7144 = 0;

	@OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
	private int anInt7147 = 4096;

	@OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
	private int anInt7148 = 8192;

	static {
		new Class267("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI)Z")
	private boolean method5886(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg0 - arg1) * this.anInt7143 >> 12;
		@Pc(31) int local31 = Static227.anIntArray295[local12 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt7143;
		@Pc(45) int local45 = (local38 << 12) / this.anInt7148;
		@Pc(52) int local52 = this.anInt7147 * local45 >> 12;
		return local52 > arg0 + arg1 && -local52 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	@Override
	public void method6533() {
		Static344.method5292();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt7145 = arg1.method6485();
		} else if (arg0 == 1) {
			this.anInt7142 = arg1.method6485();
		} else if (arg0 == 2) {
			this.anInt7144 = arg1.method6485();
		} else if (arg0 == 3) {
			this.anInt7146 = arg1.method6485();
		} else if (arg0 == 4) {
			this.anInt7143 = arg1.method6485();
		} else if (arg0 == 5) {
			this.anInt7147 = arg1.method6485();
		} else if (arg0 == 6) {
			this.anInt7148 = arg1.method6485();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZ)Z")
	private boolean method5887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg1 + arg0) * this.anInt7143 >> 12;
		@Pc(29) int local29 = Static227.anIntArray295[local13 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt7143;
		@Pc(43) int local43 = (local36 << 12) / this.anInt7148;
		@Pc(50) int local50 = local43 * this.anInt7147 >> 12;
		return arg1 - arg0 < local50 && -local50 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(27) int local27 = Static247.anIntArray318[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static240.anInt4386; local29++) {
				@Pc(37) int local37 = Static80.anIntArray117[local29] - 2048;
				@Pc(42) int local42 = local37 + this.anInt7145;
				@Pc(51) int local51 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(60) int local60 = local51 <= 2048 ? local51 : local51 - 4096;
				@Pc(66) int local66 = local27 + this.anInt7142;
				@Pc(75) int local75 = local66 >= -2048 ? local66 : local66 + 4096;
				@Pc(86) int local86 = local75 > 2048 ? local75 - 4096 : local75;
				@Pc(91) int local91 = this.anInt7144 + local37;
				@Pc(100) int local100 = local91 >= -2048 ? local91 : local91 + 4096;
				@Pc(109) int local109 = local100 <= 2048 ? local100 : local100 - 4096;
				@Pc(114) int local114 = local27 + this.anInt7146;
				@Pc(123) int local123 = local114 < -2048 ? local114 + 4096 : local114;
				@Pc(132) int local132 = local123 <= 2048 ? local123 : local123 - 4096;
				local17[local29] = this.method5886(local86, local60) || this.method5887(local109, local132) ? 4096 : 0;
			}
		}
		return local17;
	}
}
