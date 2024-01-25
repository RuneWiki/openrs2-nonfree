import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class3_Sub6_Sub26 extends Class3_Sub6 {

	@OriginalMember(owner = "client!rp", name = "fb", descriptor = "Ljava/lang/String;")
	public static final String aString220;

	@OriginalMember(owner = "client!rp", name = "Z", descriptor = "Ljava/lang/String;")
	public static final String aString219;

	@OriginalMember(owner = "client!rp", name = "S", descriptor = "I")
	private int anInt8125 = 12288;

	@OriginalMember(owner = "client!rp", name = "T", descriptor = "I")
	private int anInt8126 = 0;

	@OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
	private int anInt8122 = 2048;

	@OriginalMember(owner = "client!rp", name = "R", descriptor = "I")
	private int anInt8124 = 0;

	@OriginalMember(owner = "client!rp", name = "W", descriptor = "I")
	private int anInt8129 = 2048;

	@OriginalMember(owner = "client!rp", name = "db", descriptor = "I")
	private int anInt8133 = 8192;

	@OriginalMember(owner = "client!rp", name = "ab", descriptor = "I")
	private int anInt8131 = 4096;

	static {
		@Pc(11) String local11 = "Unknown";
		try {
			local11 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(17) Exception local17) {
		}
		local11.toLowerCase();
		local11 = "Unknown";
		try {
			local11 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(28) Exception local28) {
		}
		local11.toLowerCase();
		local11 = "Unknown";
		try {
			local11 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(39) Exception local39) {
		}
		aString220 = local11.toLowerCase();
		local11 = "Unknown";
		try {
			local11 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(50) Exception local50) {
		}
		aString219 = local11.toLowerCase();
		local11 = "Unknown";
		try {
			local11 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(61) Exception local61) {
		}
		local11.toLowerCase();
		local11 = "~/";
		try {
			local11 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(72) Exception local72) {
		}
		new File(local11);
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(III)Z")
	private boolean method6389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(24) int local24 = (arg1 + arg0) * this.anInt8125 >> 12;
		@Pc(34) int local34 = Static392.anIntArray389[local24 * 255 >> 12 & 0xFF];
		@Pc(41) int local41 = (local34 << 12) / this.anInt8125;
		@Pc(48) int local48 = (local41 << 12) / this.anInt8133;
		@Pc(55) int local55 = local48 * this.anInt8131 >> 12;
		return arg0 - arg1 < local55 && -local55 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(III)Z")
	private boolean method6390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = (arg1 - arg0) * this.anInt8125 >> 12;
		@Pc(28) int local28 = Static392.anIntArray389[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt8125;
		@Pc(42) int local42 = (local35 << 12) / this.anInt8133;
		@Pc(49) int local49 = this.anInt8131 * local42 >> 12;
		return local49 > arg0 + arg1 && -local49 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(26) int local26 = Static231.anIntArray217[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static481.anInt8358; local28++) {
				@Pc(36) int local36 = Static595.anIntArray600[local28] - 2048;
				@Pc(41) int local41 = local36 + this.anInt8122;
				@Pc(52) int local52 = local41 >= -2048 ? local41 : local41 + 4096;
				@Pc(61) int local61 = local52 <= 2048 ? local52 : local52 - 4096;
				@Pc(66) int local66 = this.anInt8124 + local26;
				@Pc(75) int local75 = local66 < -2048 ? local66 + 4096 : local66;
				@Pc(86) int local86 = local75 > 2048 ? local75 - 4096 : local75;
				@Pc(91) int local91 = this.anInt8126 + local36;
				@Pc(102) int local102 = local91 < -2048 ? local91 + 4096 : local91;
				@Pc(113) int local113 = local102 <= 2048 ? local102 : local102 - 4096;
				@Pc(118) int local118 = local26 + this.anInt8129;
				@Pc(127) int local127 = local118 >= -2048 ? local118 : local118 + 4096;
				@Pc(138) int local138 = local127 <= 2048 ? local127 : local127 - 4096;
				local16[local28] = this.method6390(local61, local86) || this.method6389(local138, local113) ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		Static578.method7854();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8122 = arg0.method6811();
		} else if (arg1 == 1) {
			this.anInt8124 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anInt8126 = arg0.method6811();
		} else if (arg1 == 3) {
			this.anInt8129 = arg0.method6811();
		} else if (arg1 == 4) {
			this.anInt8125 = arg0.method6811();
		} else if (arg1 == 5) {
			this.anInt8131 = arg0.method6811();
		} else if (arg1 == 6) {
			this.anInt8133 = arg0.method6811();
		}
	}
}
