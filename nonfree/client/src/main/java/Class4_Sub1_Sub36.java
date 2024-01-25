import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class4_Sub1_Sub36 extends Class4_Sub1 {

	@OriginalMember(owner = "client!um", name = "C", descriptor = "I")
	private int anInt9553 = 2048;

	@OriginalMember(owner = "client!um", name = "G", descriptor = "I")
	private int anInt9556 = 1;

	@OriginalMember(owner = "client!um", name = "E", descriptor = "I")
	private int anInt9554 = 2;

	@OriginalMember(owner = "client!um", name = "D", descriptor = "[S")
	private short[] aShortArray129 = new short[512];

	@OriginalMember(owner = "client!um", name = "M", descriptor = "[B")
	private byte[] aByteArray104 = new byte[512];

	@OriginalMember(owner = "client!um", name = "J", descriptor = "I")
	private int anInt9558 = 0;

	@OriginalMember(owner = "client!um", name = "I", descriptor = "I")
	private int anInt9557 = 5;

	@OriginalMember(owner = "client!um", name = "P", descriptor = "I")
	private int anInt9561 = 5;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(32) int local32 = this.anInt9561 * Static442.anIntArray449[arg0] + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static376.anInt7260; local42++) {
				Static449.anInt8497 = Integer.MAX_VALUE;
				Static480.anInt10082 = Integer.MAX_VALUE;
				Static47.anInt647 = Integer.MAX_VALUE;
				Static535.anInt9524 = Integer.MAX_VALUE;
				@Pc(61) int local61 = Static292.anIntArray394[local42] * this.anInt9557 + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(154) int local154;
				for (@Pc(73) int local73 = local36 - 1; local73 <= local40; local73++) {
					@Pc(93) int local93 = this.aByteArray104[(this.anInt9561 <= local73 ? local73 - this.anInt9561 : local73) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local65 - 1; local97 <= local69; local97++) {
						@Pc(126) int local126 = (this.aByteArray104[local93 + (this.anInt9557 > local97 ? local97 : local97 - this.anInt9557) & 0xFF] & 0xFF) * 2;
						@Pc(132) int local132 = local61 - (local97 << 12);
						@Pc(136) int local136 = local126 + 1;
						@Pc(140) int local140 = local132 - this.aShortArray129[local126];
						@Pc(151) int local151 = local32 - this.aShortArray129[local136] - (local73 << 12);
						local154 = this.anInt9556;
						@Pc(185) int local185;
						if (local154 == 1) {
							local185 = local151 * local151 + local140 * local140 >> 12;
						} else if (local154 == 3) {
							local140 = local140 >= 0 ? local140 : -local140;
							local151 = local151 < 0 ? -local151 : local151;
							local185 = local151 < local140 ? local140 : local151;
						} else if (local154 == 4) {
							local140 = (int) (Math.sqrt((double) ((float) (local140 < 0 ? -local140 : local140) / 4096.0F)) * 4096.0D);
							local151 = (int) (Math.sqrt((double) ((float) (local151 >= 0 ? local151 : -local151) / 4096.0F)) * 4096.0D);
							local185 = local140 + local151;
							local185 = local185 * local185 >> 12;
						} else if (local154 == 5) {
							local140 *= local140;
							local151 *= local151;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local151 + local140) / 1.6777216E7F))) * 4096.0D);
						} else if (local154 == 2) {
							local185 = (local151 < 0 ? -local151 : local151) + (local140 < 0 ? -local140 : local140);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local151 * local151 + local140 * local140) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static535.anInt9524 > local185) {
							Static449.anInt8497 = Static480.anInt10082;
							Static480.anInt10082 = Static47.anInt647;
							Static47.anInt647 = Static535.anInt9524;
							Static535.anInt9524 = local185;
						} else if (Static47.anInt647 > local185) {
							Static449.anInt8497 = Static480.anInt10082;
							Static480.anInt10082 = Static47.anInt647;
							Static47.anInt647 = local185;
						} else if (local185 < Static480.anInt10082) {
							Static449.anInt8497 = Static480.anInt10082;
							Static480.anInt10082 = local185;
						} else if (local185 < Static449.anInt8497) {
							Static449.anInt8497 = local185;
						}
					}
				}
				local154 = this.anInt9554;
				if (local154 == 0) {
					local11[local42] = Static535.anInt9524;
				} else if (local154 == 1) {
					local11[local42] = Static47.anInt647;
				} else if (local154 == 3) {
					local11[local42] = Static480.anInt10082;
				} else if (local154 == 4) {
					local11[local42] = Static449.anInt8497;
				} else if (local154 == 2) {
					local11[local42] = Static47.anInt647 - Static535.anInt9524;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)V")
	private void method7797() {
		@Pc(20) Random local20 = new Random((long) this.anInt9558);
		this.aShortArray129 = new short[512];
		if (this.anInt9553 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray129[local32] = (short) Static406.method6391(local20, this.anInt9553);
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt9557 = this.anInt9561 = arg1.method4905();
		} else if (arg0 == 1) {
			this.anInt9558 = arg1.method4905();
		} else if (arg0 == 2) {
			this.anInt9553 = arg1.method4936();
		} else if (arg0 == 3) {
			this.anInt9554 = arg1.method4905();
		} else if (arg0 == 4) {
			this.anInt9556 = arg1.method4905();
		} else if (arg0 == 5) {
			this.anInt9557 = arg1.method4905();
		} else if (arg0 == 6) {
			this.anInt9561 = arg1.method4905();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		this.aByteArray104 = Static392.method6207(this.anInt9558);
		this.method7797();
	}
}
