import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class3_Sub8_Sub19 extends Class3_Sub8 {

	@OriginalMember(owner = "client!oda", name = "J", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!oda", name = "T", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!oda", name = "E", descriptor = "I")
	public int anInt6931 = 1638;

	@OriginalMember(owner = "client!oda", name = "F", descriptor = "I")
	public int anInt6932 = 4;

	@OriginalMember(owner = "client!oda", name = "N", descriptor = "Z")
	public boolean aBoolean487 = true;

	@OriginalMember(owner = "client!oda", name = "M", descriptor = "I")
	public int anInt6938 = 0;

	@OriginalMember(owner = "client!oda", name = "P", descriptor = "I")
	public int anInt6939 = 4;

	@OriginalMember(owner = "client!oda", name = "S", descriptor = "I")
	public int anInt6941 = 4;

	@OriginalMember(owner = "client!oda", name = "U", descriptor = "[B")
	private byte[] aByteArray62 = new byte[512];

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIZIIII)I")
	private int method5876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 >> 12;
		@Pc(13) int local13 = local9 + 1;
		@Pc(17) int local17 = local9 & 0xFF;
		@Pc(21) int local21 = arg3 & 0xFFF;
		if (local13 >= arg5) {
			local13 = 0;
		}
		@Pc(30) int local30 = local21 - 4096;
		local13 &= 0xFF;
		@Pc(38) int local38 = arg2 - 4096;
		@Pc(47) int local47 = Class268.anIntArray386[local21];
		@Pc(56) int local56 = this.aByteArray62[arg0 + local17] & 0x3;
		@Pc(73) int local73;
		if (local56 > 1) {
			local73 = local56 == 2 ? local21 - arg2 : -arg2 + -local21;
		} else {
			local73 = local56 == 0 ? arg2 + local21 : -local21 + arg2;
		}
		local56 = this.aByteArray62[local13 + arg0] & 0x3;
		@Pc(111) int local111;
		if (local56 <= 1) {
			local111 = local56 == 0 ? local30 + arg2 : arg2 - local30;
		} else {
			local111 = local56 == 2 ? local30 - arg2 : -arg2 + -local30;
		}
		local56 = this.aByteArray62[arg1 + local17] & 0x3;
		@Pc(147) int local147 = ((local111 - local73) * local47 >> 12) + local73;
		if (local56 > 1) {
			local73 = local56 == 2 ? local21 - local38 : -local38 + -local21;
		} else {
			local73 = local56 == 0 ? local38 + local21 : -local21 + local38;
		}
		local56 = this.aByteArray62[local13 + arg1] & 0x3;
		if (local56 <= 1) {
			local111 = local56 == 0 ? local30 + local38 : -local30 + local38;
		} else {
			local111 = local56 == 2 ? local30 - local38 : -local38 + -local30;
		}
		@Pc(231) int local231 = local73 + (local47 * (local111 - local73) >> 12);
		return local147 + ((local231 - local147) * arg4 >> 12);
	}

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "(I)V")
	private void method5877() {
		@Pc(34) int local34;
		if (this.anInt6931 > 0) {
			this.aShortArray84 = new short[this.anInt6932];
			this.aShortArray83 = new short[this.anInt6932];
			for (local34 = 0; local34 < this.anInt6932; local34++) {
				this.aShortArray83[local34] = (short) (int) (Math.pow((double) ((float) this.anInt6931 / 4096.0F), (double) local34) * 4096.0D);
				this.aShortArray84[local34] = (short) (int) Math.pow(2.0D, (double) local34);
			}
		} else if (this.aShortArray83 != null && this.aShortArray83.length == this.anInt6932) {
			this.aShortArray84 = new short[this.anInt6932];
			for (local34 = 0; local34 < this.anInt6932; local34++) {
				this.aShortArray84[local34] = (short) (int) Math.pow(2.0D, (double) local34);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		this.aByteArray62 = Static130.method8186(this.anInt6938);
		this.method5877();
		for (@Pc(27) int local27 = this.anInt6932 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray83[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt6932--;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.aBoolean487 = arg1.method7954() == 1;
		} else if (arg0 == 1) {
			this.anInt6932 = arg1.method7954();
		} else if (arg0 == 2) {
			this.anInt6931 = arg1.method7918();
			if (this.anInt6931 < 0) {
				this.aShortArray83 = new short[this.anInt6932];
				for (@Pc(74) int local74 = 0; local74 < this.anInt6932; local74++) {
					this.aShortArray83[local74] = (short) arg1.method7918();
				}
				return;
			}
		} else if (arg0 == 3) {
			this.anInt6941 = this.anInt6939 = arg1.method7954();
			return;
		} else if (arg0 == 4) {
			this.anInt6938 = arg1.method7954();
			return;
		} else if (arg0 == 5) {
			this.anInt6941 = arg1.method7954();
			return;
		} else if (arg0 == 6) {
			this.anInt6939 = arg1.method7954();
			return;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(II[I)V")
	public void method5879(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static510.anIntArray172[arg0] * this.anInt6939;
		@Pc(110) int local110;
		@Pc(124) int local124;
		@Pc(40) int local40;
		@Pc(27) short local27;
		@Pc(101) int local101;
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(47) int local47;
		@Pc(99) int local99;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(86) int local86;
		@Pc(95) int local95;
		if (this.anInt6932 == 1) {
			local27 = this.aShortArray83[0];
			local40 = this.aShortArray84[0] << 12;
			local47 = this.anInt6939 * local40 >> 12;
			local53 = local12 * local40 >> 12;
			local60 = this.anInt6941 * local40 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			@Pc(383) int local383 = local53 & 0xFFF;
			if (local47 <= local68) {
				local68 = 0;
			}
			local86 = this.aByteArray62[local64 & 0xFF] & 0xFF;
			local99 = Class268.anIntArray386[local383];
			local95 = this.aByteArray62[local68 & 0xFF] & 0xFF;
			if (this.aBoolean487) {
				for (local101 = 0; local101 < Static91.anInt1849; local101++) {
					local110 = this.anInt6941 * Static13.anIntArray11[local101];
					local124 = this.method5876(local86, local95, local383, local40 * local110 >> 12, local99, local60);
					@Pc(486) int local486 = local124 * local27 >> 12;
					arg1[local101] = (local486 >> 1) + 2048;
				}
			} else {
				for (local101 = 0; local101 < Static91.anInt1849; local101++) {
					local110 = this.anInt6941 * Static13.anIntArray11[local101];
					local124 = this.method5876(local86, local95, local383, local110 * local40 >> 12, local99, local60);
					arg1[local101] = local124 * local27 >> 12;
				}
			}
			return;
		}
		local27 = this.aShortArray83[0];
		if (local27 > 8 || local27 < -8) {
			local40 = this.aShortArray84[0] << 12;
			local47 = this.anInt6939 * local40 >> 12;
			local53 = local40 * local12 >> 12;
			local60 = local40 * this.anInt6941 >> 12;
			local64 = local53 >> 12;
			local68 = local64 + 1;
			if (local68 >= local47) {
				local68 = 0;
			}
			local53 &= 0xFFF;
			local86 = this.aByteArray62[local64 & 0xFF] & 0xFF;
			local95 = this.aByteArray62[local68 & 0xFF] & 0xFF;
			local99 = Class268.anIntArray386[local53];
			for (local101 = 0; local101 < Static91.anInt1849; local101++) {
				local110 = this.anInt6941 * Static13.anIntArray11[local101];
				local124 = this.method5876(local86, local95, local53, local40 * local110 >> 12, local99, local60);
				arg1[local101] = local124 * local27 >> 12;
			}
		}
		for (@Pc(142) int local142 = 1; local142 < this.anInt6932; local142++) {
			local27 = this.aShortArray83[local142];
			if (local27 > 8 || local27 < -8) {
				local40 = this.aShortArray84[local142] << 12;
				local47 = this.anInt6939 * local40 >> 12;
				local53 = local40 * local12 >> 12;
				local60 = this.anInt6941 * local40 >> 12;
				local64 = local53 >> 12;
				local68 = local64 + 1;
				local53 &= 0xFFF;
				if (local47 <= local68) {
					local68 = 0;
				}
				local95 = this.aByteArray62[local68 & 0xFF] & 0xFF;
				local99 = Class268.anIntArray386[local53];
				local86 = this.aByteArray62[local64 & 0xFF] & 0xFF;
				if (this.aBoolean487 && local142 == this.anInt6932 - 1) {
					for (local101 = 0; local101 < Static91.anInt1849; local101++) {
						local110 = this.anInt6941 * Static13.anIntArray11[local101];
						local124 = this.method5876(local86, local95, local53, local110 * local40 >> 12, local99, local60);
						local124 = arg1[local101] + (local27 * local124 >> 12);
						arg1[local101] = (local124 >> 1) + 2048;
					}
				} else {
					for (local101 = 0; local101 < Static91.anInt1849; local101++) {
						local110 = Static13.anIntArray11[local101] * this.anInt6941;
						local124 = this.method5876(local86, local95, local53, local110 * local40 >> 12, local99, local60);
						arg1[local101] += local27 * local124 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			this.method5879(arg0, local17);
		}
		return local17;
	}
}
