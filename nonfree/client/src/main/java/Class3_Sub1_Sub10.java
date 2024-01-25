import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
	private int anInt1746 = 5;

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
	private int anInt1747 = 2;

	@OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
	private int anInt1752 = 2048;

	@OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
	private int anInt1751 = 5;

	@OriginalMember(owner = "client!ej", name = "Q", descriptor = "[B")
	private byte[] aByteArray30 = new byte[512];

	@OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
	private int anInt1755 = 1;

	@OriginalMember(owner = "client!ej", name = "U", descriptor = "[S")
	private short[] aShortArray39 = new short[512];

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
	private int anInt1748 = 0;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		this.aByteArray30 = Static82.method1362(this.anInt1748);
		this.method1417();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1746 = this.anInt1751 = arg0.method2739();
		} else if (arg1 == 1) {
			this.anInt1748 = arg0.method2739();
		} else if (arg1 == 2) {
			this.anInt1752 = arg0.method2767();
		} else if (arg1 == 3) {
			this.anInt1747 = arg0.method2739();
		} else if (arg1 == 4) {
			this.anInt1755 = arg0.method2739();
		} else if (arg1 == 5) {
			this.anInt1746 = arg0.method2739();
		} else if (arg1 == 6) {
			this.anInt1751 = arg0.method2739();
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(30) int local30 = this.anInt1751 * Static351.anIntArray371[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static238.anInt4221; local40++) {
				Static233.anInt4157 = Integer.MAX_VALUE;
				Static362.anInt6083 = Integer.MAX_VALUE;
				Static91.anInt2998 = Integer.MAX_VALUE;
				Static370.anInt6182 = Integer.MAX_VALUE;
				@Pc(60) int local60 = this.anInt1746 * Static187.anIntArray379[local40] + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(149) int local149;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(93) int local93 = this.aByteArray30[(local72 >= this.anInt1751 ? local72 - this.anInt1751 : local72) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local64 - 1; local97 <= local68; local97++) {
						@Pc(123) int local123 = (this.aByteArray30[local93 + (local97 >= this.anInt1746 ? local97 - this.anInt1746 : local97) & 0xFF] & 0xFF) * 2;
						@Pc(127) int local127 = local97 << 12;
						@Pc(131) int local131 = local123 + 1;
						@Pc(135) int local135 = local60 - local127 - this.aShortArray39[local123];
						@Pc(146) int local146 = local30 - (local72 << 12) - this.aShortArray39[local131];
						local149 = this.anInt1755;
						@Pc(182) int local182;
						if (local149 == 1) {
							local182 = local135 * local135 + local146 * local146 >> 12;
						} else if (local149 == 3) {
							local146 = local146 < 0 ? -local146 : local146;
							local135 = local135 < 0 ? -local135 : local135;
							local182 = local146 >= local135 ? local146 : local135;
						} else if (local149 == 4) {
							local135 = (int) (Math.sqrt((double) ((float) (local135 < 0 ? -local135 : local135) / 4096.0F)) * 4096.0D);
							local146 = (int) (Math.sqrt((double) ((float) (local146 >= 0 ? local146 : -local146) / 4096.0F)) * 4096.0D);
							local182 = local146 + local135;
							local182 = local182 * local182 >> 12;
						} else if (local149 == 5) {
							local135 *= local135;
							local146 *= local146;
							local182 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local146 + local135) / 1.6777216E7F))) * 4096.0D);
						} else if (local149 == 2) {
							local182 = (local135 < 0 ? -local135 : local135) + (local146 < 0 ? -local146 : local146);
						} else {
							local182 = (int) (Math.sqrt((double) ((float) (local135 * local135 + local146 * local146) / 1.6777216E7F)) * 4096.0D);
						}
						if (local182 < Static370.anInt6182) {
							Static233.anInt4157 = Static362.anInt6083;
							Static362.anInt6083 = Static91.anInt2998;
							Static91.anInt2998 = Static370.anInt6182;
							Static370.anInt6182 = local182;
						} else if (local182 < Static91.anInt2998) {
							Static233.anInt4157 = Static362.anInt6083;
							Static362.anInt6083 = Static91.anInt2998;
							Static91.anInt2998 = local182;
						} else if (Static362.anInt6083 > local182) {
							Static233.anInt4157 = Static362.anInt6083;
							Static362.anInt6083 = local182;
						} else if (Static233.anInt4157 > local182) {
							Static233.anInt4157 = local182;
						}
					}
				}
				local149 = this.anInt1747;
				if (local149 == 0) {
					local11[local40] = Static370.anInt6182;
				} else if (local149 == 1) {
					local11[local40] = Static91.anInt2998;
				} else if (local149 == 3) {
					local11[local40] = Static362.anInt6083;
				} else if (local149 == 4) {
					local11[local40] = Static233.anInt4157;
				} else if (local149 == 2) {
					local11[local40] = Static91.anInt2998 - Static370.anInt6182;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
	private void method1417() {
		@Pc(18) Random local18 = new Random((long) this.anInt1748);
		this.aShortArray39 = new short[512];
		if (this.anInt1752 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray39[local27] = (short) Static213.method3319(local18, this.anInt1752);
			}
		}
	}
}
