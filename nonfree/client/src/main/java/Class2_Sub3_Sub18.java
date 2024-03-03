import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class2_Sub3_Sub18 extends Class2_Sub3 {

	@OriginalMember(owner = "client!jt", name = "X", descriptor = "[Lclient!dg;")
	public static final Class46[] aClass46Array1;

	@OriginalMember(owner = "client!jt", name = "V", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_127;

	@OriginalMember(owner = "client!jt", name = "db", descriptor = "I")
	public static int anInt3264;

	@OriginalMember(owner = "client!jt", name = "eb", descriptor = "Lclient!oj;")
	public static final Class170 aClass170_3;

	@OriginalMember(owner = "client!jt", name = "T", descriptor = "I")
	private int anInt3257 = 0;

	@OriginalMember(owner = "client!jt", name = "R", descriptor = "[S")
	private short[] aShortArray54 = new short[512];

	@OriginalMember(owner = "client!jt", name = "O", descriptor = "I")
	private int anInt3253 = 2048;

	@OriginalMember(owner = "client!jt", name = "W", descriptor = "[B")
	private byte[] aByteArray34 = new byte[512];

	@OriginalMember(owner = "client!jt", name = "Y", descriptor = "I")
	private int anInt3259 = 5;

	@OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
	private int anInt3252 = 1;

	@OriginalMember(owner = "client!jt", name = "ab", descriptor = "I")
	private int anInt3261 = 5;

	@OriginalMember(owner = "client!jt", name = "Z", descriptor = "I")
	private int anInt3260 = 2;

	static {
		new Class79("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
		aClass46Array1 = new Class46[4];
		aClass145_127 = new Class145(38, 4);
		anInt3264 = -1;
		aClass170_3 = new Class170(0);
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V", line = 584)
	public Class2_Sub3_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILclient!bt;I)V", line = 3)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt3259 = this.anInt3261 = arg1.method4816();
		} else if (arg0 == 1) {
			this.anInt3257 = arg1.method4816();
		} else if (arg0 == 2) {
			this.anInt3253 = arg1.method4830();
		} else if (arg0 == 3) {
			this.anInt3260 = arg1.method4816();
		} else if (arg0 == 4) {
			this.anInt3252 = arg1.method4816();
		} else if (arg0 == 5) {
			this.anInt3259 = arg1.method4816();
		} else if (arg0 == 6) {
			this.anInt3261 = arg1.method4816();
		}
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V", line = 315)
	private void method3260() {
		@Pc(12) Random local12 = new Random((long) this.anInt3257);
		this.aShortArray54 = new short[512];
		if (this.anInt3253 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray54[local24] = (short) Static356.method6362(this.anInt3253, local12);
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)[I", line = 349)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(30) int local30 = this.anInt3261 * Static16.anIntArray322[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static211.anInt4031; local40++) {
				Static38.anInt1051 = Integer.MAX_VALUE;
				Static342.anInt6866 = Integer.MAX_VALUE;
				Static352.anInt7066 = Integer.MAX_VALUE;
				Static61.anInt1582 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static311.anIntArray424[local40] * this.anInt3259 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(156) int local156;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(96) int local96 = this.aByteArray34[(this.anInt3261 > local71 ? local71 : local71 - this.anInt3261) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(129) int local129 = (this.aByteArray34[local96 + (this.anInt3259 <= local100 ? local100 - this.anInt3259 : local100) & 0xFF] & 0xFF) * 2;
						@Pc(134) int local134 = local129 + 1;
						@Pc(142) int local142 = local59 - this.aShortArray54[local129] - (local100 << 12);
						@Pc(153) int local153 = local30 - (local71 << 12) - this.aShortArray54[local134];
						local156 = this.anInt3252;
						@Pc(183) int local183;
						if (local156 == 1) {
							local183 = local142 * local142 + local153 * local153 >> 12;
						} else if (local156 == 3) {
							local153 = local153 < 0 ? -local153 : local153;
							local142 = local142 < 0 ? -local142 : local142;
							local183 = local142 > local153 ? local142 : local153;
						} else if (local156 == 4) {
							local142 = (int) (Math.sqrt((double) ((float) (local142 >= 0 ? local142 : -local142) / 4096.0F)) * 4096.0D);
							local153 = (int) (Math.sqrt((double) ((float) (local153 >= 0 ? local153 : -local153) / 4096.0F)) * 4096.0D);
							local183 = local153 + local142;
							local183 = local183 * local183 >> 12;
						} else if (local156 == 5) {
							local153 *= local153;
							local142 *= local142;
							local183 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local142 + local153) / 1.6777216E7F))) * 4096.0D);
						} else if (local156 == 2) {
							local183 = (local153 < 0 ? -local153 : local153) + (local142 < 0 ? -local142 : local142);
						} else {
							local183 = (int) (Math.sqrt((double) ((float) (local153 * local153 + local142 * local142) / 1.6777216E7F)) * 4096.0D);
						}
						if (local183 < Static61.anInt1582) {
							Static38.anInt1051 = Static342.anInt6866;
							Static342.anInt6866 = Static352.anInt7066;
							Static352.anInt7066 = Static61.anInt1582;
							Static61.anInt1582 = local183;
						} else if (Static352.anInt7066 > local183) {
							Static38.anInt1051 = Static342.anInt6866;
							Static342.anInt6866 = Static352.anInt7066;
							Static352.anInt7066 = local183;
						} else if (local183 < Static342.anInt6866) {
							Static38.anInt1051 = Static342.anInt6866;
							Static342.anInt6866 = local183;
						} else if (Static38.anInt1051 > local183) {
							Static38.anInt1051 = local183;
						}
					}
				}
				local156 = this.anInt3260;
				if (local156 == 0) {
					local11[local40] = Static61.anInt1582;
				} else if (local156 == 1) {
					local11[local40] = Static352.anInt7066;
				} else if (local156 == 3) {
					local11[local40] = Static342.anInt6866;
				} else if (local156 == 4) {
					local11[local40] = Static38.anInt1051;
				} else if (local156 == 2) {
					local11[local40] = Static352.anInt7066 - Static61.anInt1582;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V", line = 558)
	@Override
	public void method6481() {
		this.aByteArray34 = Static109.method2366(this.anInt3257);
		this.method3260();
	}
}
