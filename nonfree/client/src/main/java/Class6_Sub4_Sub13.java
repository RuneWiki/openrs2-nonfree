import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class6_Sub4_Sub13 extends Class6_Sub4 {

	@OriginalMember(owner = "client!gw", name = "I", descriptor = "[B")
	private byte[] aByteArray48 = new byte[512];

	@OriginalMember(owner = "client!gw", name = "D", descriptor = "I")
	private int anInt3986 = 2048;

	@OriginalMember(owner = "client!gw", name = "M", descriptor = "I")
	private int anInt3993 = 5;

	@OriginalMember(owner = "client!gw", name = "L", descriptor = "I")
	private int anInt3992 = 5;

	@OriginalMember(owner = "client!gw", name = "J", descriptor = "I")
	private int anInt3991 = 0;

	@OriginalMember(owner = "client!gw", name = "O", descriptor = "I")
	private int anInt3994 = 1;

	@OriginalMember(owner = "client!gw", name = "R", descriptor = "I")
	private int anInt3996 = 2;

	@OriginalMember(owner = "client!gw", name = "P", descriptor = "[S")
	private short[] aShortArray58 = new short[512];

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(30) int local30 = this.anInt3992 * Static629.anIntArray635[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static6.anInt111; local40++) {
				Static395.anInt7399 = Integer.MAX_VALUE;
				Static211.anInt4156 = Integer.MAX_VALUE;
				Static179.anInt3672 = Integer.MAX_VALUE;
				Static103.anInt2051 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static284.anIntArray482[local40] * this.anInt3993 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(154) int local154;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(96) int local96 = this.aByteArray48[(this.anInt3992 <= local71 ? local71 - this.anInt3992 : local71) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(125) int local125 = (this.aByteArray48[(this.anInt3993 > local100 ? local100 : local100 - this.anInt3993) + local96 & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = -(local100 << 12);
						@Pc(133) int local133 = local125 + 1;
						@Pc(138) int local138 = local129 + local59 - this.aShortArray58[local125];
						@Pc(151) int local151 = local30 - (local71 << 12) - this.aShortArray58[local133];
						local154 = this.anInt3994;
						@Pc(185) int local185;
						if (local154 == 1) {
							local185 = local151 * local151 + local138 * local138 >> 12;
						} else if (local154 == 3) {
							local138 = local138 < 0 ? -local138 : local138;
							local151 = local151 >= 0 ? local151 : -local151;
							local185 = local138 <= local151 ? local151 : local138;
						} else if (local154 == 4) {
							local138 = (int) (Math.sqrt((double) ((float) (local138 >= 0 ? local138 : -local138) / 4096.0F)) * 4096.0D);
							local151 = (int) (Math.sqrt((double) ((float) (local151 < 0 ? -local151 : local151) / 4096.0F)) * 4096.0D);
							local185 = local151 + local138;
							local185 = local185 * local185 >> 12;
						} else if (local154 == 5) {
							local138 *= local138;
							local151 *= local151;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local138 + local151) / 1.6777216E7F))) * 4096.0D);
						} else if (local154 == 2) {
							local185 = (local151 < 0 ? -local151 : local151) + (local138 < 0 ? -local138 : local138);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local138 * local138 + local151 * local151) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static103.anInt2051 > local185) {
							Static395.anInt7399 = Static211.anInt4156;
							Static211.anInt4156 = Static179.anInt3672;
							Static179.anInt3672 = Static103.anInt2051;
							Static103.anInt2051 = local185;
						} else if (Static179.anInt3672 > local185) {
							Static395.anInt7399 = Static211.anInt4156;
							Static211.anInt4156 = Static179.anInt3672;
							Static179.anInt3672 = local185;
						} else if (Static211.anInt4156 > local185) {
							Static395.anInt7399 = Static211.anInt4156;
							Static211.anInt4156 = local185;
						} else if (local185 < Static395.anInt7399) {
							Static395.anInt7399 = local185;
						}
					}
				}
				local154 = this.anInt3996;
				if (local154 == 0) {
					local17[local40] = Static103.anInt2051;
				} else if (local154 == 1) {
					local17[local40] = Static179.anInt3672;
				} else if (local154 == 3) {
					local17[local40] = Static211.anInt4156;
				} else if (local154 == 4) {
					local17[local40] = Static395.anInt7399;
				} else if (local154 == 2) {
					local17[local40] = Static179.anInt3672 - Static103.anInt2051;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
	private void method3493() {
		@Pc(12) Random local12 = new Random((long) this.anInt3991);
		this.aShortArray58 = new short[512];
		if (this.anInt3986 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray58[local24] = (short) Static588.method8281(local12, this.anInt3986);
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		this.aByteArray48 = Static308.method5207(this.anInt3991);
		this.method3493();
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt3993 = this.anInt3992 = arg1.method8604();
		} else if (arg0 == 1) {
			this.anInt3991 = arg1.method8604();
		} else if (arg0 == 2) {
			this.anInt3986 = arg1.method8571();
		} else if (arg0 == 3) {
			this.anInt3996 = arg1.method8604();
		} else if (arg0 == 4) {
			this.anInt3994 = arg1.method8604();
		} else if (arg0 == 5) {
			this.anInt3993 = arg1.method8604();
		} else if (arg0 == 6) {
			this.anInt3992 = arg1.method8604();
		}
	}
}
