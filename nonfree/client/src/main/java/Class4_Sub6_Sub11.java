import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class4_Sub6_Sub11 extends Class4_Sub6 {

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
	private int anInt1438 = 1;

	@OriginalMember(owner = "client!fe", name = "T", descriptor = "[B")
	private byte[] aByteArray23 = new byte[512];

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
	private int anInt1440 = 5;

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
	private int anInt1434 = 5;

	@OriginalMember(owner = "client!fe", name = "Q", descriptor = "[S")
	private short[] aShortArray17 = new short[512];

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
	private int anInt1432 = 2048;

	@OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
	private int anInt1443 = 0;

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
	private int anInt1442 = 2;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
	private void method1149() {
		@Pc(12) Random local12 = new Random((long) this.anInt1443);
		this.aShortArray17 = new short[512];
		if (this.anInt1432 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray17[local24] = (short) Static241.method3695(this.anInt1432, local12);
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
	@Override
	public void method4370() {
		this.aByteArray23 = Static75.method1151(this.anInt1443);
		this.method1149();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1440 = this.anInt1434 = arg0.method1874();
		} else if (arg1 == 1) {
			this.anInt1443 = arg0.method1874();
		} else if (arg1 == 2) {
			this.anInt1432 = arg0.method1837();
		} else if (arg1 == 3) {
			this.anInt1442 = arg0.method1874();
		} else if (arg1 == 4) {
			this.anInt1438 = arg0.method1874();
		} else if (arg1 == 5) {
			this.anInt1440 = arg0.method1874();
		} else if (arg1 == 6) {
			this.anInt1434 = arg0.method1874();
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(33) int local33 = this.anInt1434 * Static273.anIntArray127[arg0] + 2048;
			@Pc(37) int local37 = local33 >> 12;
			@Pc(41) int local41 = local37 + 1;
			for (@Pc(43) int local43 = 0; local43 < Static2.anInt19; local43++) {
				Static187.anInt3756 = Integer.MAX_VALUE;
				Static247.anInt4697 = Integer.MAX_VALUE;
				Static296.anInt1766 = Integer.MAX_VALUE;
				Static99.anInt2104 = Integer.MAX_VALUE;
				@Pc(68) int local68 = Static192.anIntArray318[local43] * this.anInt1440 + 2048;
				@Pc(72) int local72 = local68 >> 12;
				@Pc(76) int local76 = local72 + 1;
				@Pc(170) int local170;
				for (@Pc(80) int local80 = local37 - 1; local80 <= local41; local80++) {
					@Pc(110) int local110 = this.aByteArray23[(this.anInt1434 <= local80 ? local80 - this.anInt1434 : local80) & 0xFF] & 0xFF;
					for (@Pc(114) int local114 = local72 - 1; local114 <= local76; local114++) {
						@Pc(140) int local140 = (this.aByteArray23[local110 + (this.anInt1440 > local114 ? local114 : local114 - this.anInt1440) & 0xFF] & 0xFF) * 2;
						@Pc(144) int local144 = -(local114 << 12);
						@Pc(148) int local148 = local140 + 1;
						@Pc(154) int local154 = local144 + local68 - this.aShortArray17[local140];
						@Pc(167) int local167 = local33 - (local80 << 12) - this.aShortArray17[local148];
						local170 = this.anInt1438;
						@Pc(208) int local208;
						if (local170 == 1) {
							local208 = local167 * local167 + local154 * local154 >> 12;
						} else if (local170 == 3) {
							local167 = local167 < 0 ? -local167 : local167;
							local154 = local154 < 0 ? -local154 : local154;
							local208 = local167 < local154 ? local154 : local167;
						} else if (local170 == 4) {
							local154 = (int) (Math.sqrt((double) ((float) (local154 < 0 ? -local154 : local154) / 4096.0F)) * 4096.0D);
							local167 = (int) (Math.sqrt((double) ((float) (local167 >= 0 ? local167 : -local167) / 4096.0F)) * 4096.0D);
							local208 = local167 + local154;
							local208 = local208 * local208 >> 12;
						} else if (local170 == 5) {
							local167 *= local167;
							local154 *= local154;
							local208 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local167 + local154) / 1.6777216E7F))) * 4096.0D);
						} else if (local170 == 2) {
							local208 = (local154 < 0 ? -local154 : local154) + (local167 < 0 ? -local167 : local167);
						} else {
							local208 = (int) (Math.sqrt((double) ((float) (local154 * local154 + local167 * local167) / 1.6777216E7F)) * 4096.0D);
						}
						if (local208 < Static99.anInt2104) {
							Static187.anInt3756 = Static247.anInt4697;
							Static247.anInt4697 = Static296.anInt1766;
							Static296.anInt1766 = Static99.anInt2104;
							Static99.anInt2104 = local208;
						} else if (Static296.anInt1766 > local208) {
							Static187.anInt3756 = Static247.anInt4697;
							Static247.anInt4697 = Static296.anInt1766;
							Static296.anInt1766 = local208;
						} else if (local208 < Static247.anInt4697) {
							Static187.anInt3756 = Static247.anInt4697;
							Static247.anInt4697 = local208;
						} else if (Static187.anInt3756 > local208) {
							Static187.anInt3756 = local208;
						}
					}
				}
				local170 = this.anInt1442;
				if (local170 == 0) {
					local14[local43] = Static99.anInt2104;
				} else if (local170 == 1) {
					local14[local43] = Static296.anInt1766;
				} else if (local170 == 3) {
					local14[local43] = Static247.anInt4697;
				} else if (local170 == 4) {
					local14[local43] = Static187.anInt3756;
				} else if (local170 == 2) {
					local14[local43] = Static296.anInt1766 - Static99.anInt2104;
				}
			}
		}
		return local14;
	}
}
