import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ub", name = "cb", descriptor = "I")
	private int anInt3993 = 5;

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "[B")
	private byte[] aByteArray48 = new byte[512];

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "[S")
	private short[] aShortArray53 = new short[512];

	@OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
	private int anInt3994 = 2;

	@OriginalMember(owner = "client!ub", name = "hb", descriptor = "I")
	private int anInt3998 = 1;

	@OriginalMember(owner = "client!ub", name = "mb", descriptor = "I")
	private int anInt4002 = 0;

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
	private int anInt3989 = 5;

	@OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
	private int anInt3990 = 2048;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		this.aByteArray48 = Static3.method3257(this.anInt4002);
		this.method2998();
	}

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
	private void method2998() {
		@Pc(8) Random local8 = new Random((long) this.anInt4002);
		this.aShortArray53 = new short[512];
		if (this.anInt3990 > 0) {
			for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
				this.aShortArray53[local21] = (short) Static192.method3141(this.anInt3990, local8);
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3993 = this.anInt3989 = arg0.method3010();
		} else if (arg1 == 1) {
			this.anInt4002 = arg0.method3010();
		} else if (arg1 == 2) {
			this.anInt3990 = arg0.method3023();
		} else if (arg1 == 3) {
			this.anInt3994 = arg0.method3010();
		} else if (arg1 == 4) {
			this.anInt3998 = arg0.method3010();
		} else if (arg1 == 5) {
			this.anInt3993 = arg0.method3010();
		} else if (arg1 == 6) {
			this.anInt3989 = arg0.method3010();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(30) int local30 = Static193.anIntArray277[arg0] * this.anInt3989 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static107.anInt2321; local40++) {
				Static60.anInt1456 = Integer.MAX_VALUE;
				Static114.anInt2460 = Integer.MAX_VALUE;
				Static45.anInt1162 = Integer.MAX_VALUE;
				Static16.anInt1099 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt3993 * Static204.anIntArray179[local40] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(154) int local154;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(92) int local92 = this.aByteArray48[(this.anInt3989 <= local71 ? local71 - this.anInt3989 : local71) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local63 - 1; local96 <= local67; local96++) {
						@Pc(125) int local125 = (this.aByteArray48[(this.anInt3993 <= local96 ? local96 - this.anInt3993 : local96) + local92 & 0xFF] & 0xFF) * 2;
						@Pc(131) int local131 = local59 - (local96 << 12);
						@Pc(135) int local135 = local125 + 1;
						@Pc(139) int local139 = local131 - this.aShortArray53[local125];
						@Pc(151) int local151 = local30 - (local71 << 12) - this.aShortArray53[local135];
						local154 = this.anInt3998;
						@Pc(186) int local186;
						if (local154 == 1) {
							local186 = local139 * local139 + local151 * local151 >> 12;
						} else if (local154 == 3) {
							local139 = local139 < 0 ? -local139 : local139;
							local151 = local151 < 0 ? -local151 : local151;
							local186 = local139 <= local151 ? local151 : local139;
						} else if (local154 == 4) {
							local139 = (int) (Math.sqrt((double) ((float) (local139 >= 0 ? local139 : -local139) / 4096.0F)) * 4096.0D);
							local151 = (int) (Math.sqrt((double) ((float) (local151 >= 0 ? local151 : -local151) / 4096.0F)) * 4096.0D);
							local186 = local151 + local139;
							local186 = local186 * local186 >> 12;
						} else if (local154 == 5) {
							local151 *= local151;
							local139 *= local139;
							local186 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local139 + local151) / 1.6777216E7F))) * 4096.0D);
						} else if (local154 == 2) {
							local186 = (local151 >= 0 ? local151 : -local151) + (local139 >= 0 ? local139 : -local139);
						} else {
							local186 = (int) (Math.sqrt((double) ((float) (local151 * local151 + local139 * local139) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static16.anInt1099 > local186) {
							Static60.anInt1456 = Static114.anInt2460;
							Static114.anInt2460 = Static45.anInt1162;
							Static45.anInt1162 = Static16.anInt1099;
							Static16.anInt1099 = local186;
						} else if (Static45.anInt1162 > local186) {
							Static60.anInt1456 = Static114.anInt2460;
							Static114.anInt2460 = Static45.anInt1162;
							Static45.anInt1162 = local186;
						} else if (local186 < Static114.anInt2460) {
							Static60.anInt1456 = Static114.anInt2460;
							Static114.anInt2460 = local186;
						} else if (local186 < Static60.anInt1456) {
							Static60.anInt1456 = local186;
						}
					}
				}
				local154 = this.anInt3994;
				if (local154 == 0) {
					local16[local40] = Static16.anInt1099;
				} else if (local154 == 1) {
					local16[local40] = Static45.anInt1162;
				} else if (local154 == 3) {
					local16[local40] = Static114.anInt2460;
				} else if (local154 == 4) {
					local16[local40] = Static60.anInt1456;
				} else if (local154 == 2) {
					local16[local40] = Static45.anInt1162 - Static16.anInt1099;
				}
			}
		}
		return local16;
	}
}
