import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class223 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "[S")
	private short[] aShortArray122;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public int anInt6634;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "[S")
	private short[] aShortArray123;

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
	private int anInt6643;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "[S")
	private short[] aShortArray124;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "Lclient!dt;")
	public Class63 aClass63_2;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "B")
	public byte aByte91 = 0;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
	private int anInt6639 = 128;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
	public int anInt6642 = -1;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
	private int anInt6635 = -1;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Z")
	public boolean aBoolean420 = false;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
	private int anInt6640 = 0;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	private int anInt6641 = 0;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	private int anInt6632 = 0;

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
	private int anInt6648 = 128;

	static {
		new Class158(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method5068(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1171();
			if (local3 == 0) {
				return;
			}
			this.method5076(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!tl;Lclient!za;III)Lclient!e;")
	public Class17 method5069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		return this.method5073(arg0, null, arg4, 0, arg1, false, arg2, (byte) 2, 0, null, arg5, 0, arg3);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!za;IIILclient!tl;I)Lclient!e;")
	public Class17 method5072(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class239 arg4, @OriginalArg(6) int arg5) {
		return this.method5073(arg5, null, arg2, 0, arg3, false, arg4, (byte) 5, 0, null, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!ya;IIIZILclient!tl;BILclient!ya;IILclient!za;)Lclient!e;")
	private Class17 method5073(@OriginalArg(0) int arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) Class239 arg6, @OriginalArg(8) byte arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class96 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class106 arg12) {
		@Pc(5) int local5 = arg0;
		@Pc(21) Class235 local21 = this.anInt6642 == -1 || arg4 == -1 ? null : arg6.method5420(this.anInt6642);
		@Pc(30) boolean local30 = arg5 & this.aByte91 != 0;
		if (local21 != null) {
			local5 = arg0 | local21.method5209(false, arg10, arg4);
		}
		if (local30) {
			local5 |= this.aByte91 == 3 ? 7 : 2;
		}
		if (this.anInt6639 != 128) {
			local5 |= 0x2;
		}
		if (this.anInt6648 != 128 || this.anInt6632 != 0) {
			local5 |= 0x5;
		}
		@Pc(78) Class91 local78 = this.aClass63_2.aClass91_27;
		@Pc(98) Class17 local98;
		synchronized (this.aClass63_2.aClass91_27) {
			local98 = (Class17) this.aClass63_2.aClass91_27.method1988((long) (this.anInt6634 |= arg12.anInt7745 << 29));
		}
		if (local98 == null || arg12.method5913(local98.RA(), local5) != 0) {
			if (local98 != null) {
				local5 = arg12.method5954(local5, local98.RA());
			}
			@Pc(122) int local122 = local5;
			if (this.aShortArray124 != null) {
				local122 = local5 | 0x4000;
			}
			if (this.aShortArray122 != null) {
				local122 |= 0x8000;
			}
			@Pc(147) Class147 local147 = Static354.method5036(this.aClass63_2.aClass211_26, this.anInt6643);
			if (local147 == null) {
				return null;
			}
			if (local147.anInt4358 < 13) {
				local147.method3372();
			}
			local98 = arg12.method5922(local147, local122, this.aClass63_2.anInt2044, this.anInt6641 + 64, this.anInt6640 + 850);
			@Pc(182) int local182;
			if (this.aShortArray124 != null) {
				for (local182 = 0; local182 < this.aShortArray124.length; local182++) {
					local98.q(this.aShortArray124[local182], this.aShortArray125[local182]);
				}
			}
			if (this.aShortArray122 != null) {
				for (local182 = 0; local182 < this.aShortArray122.length; local182++) {
					local98.u(this.aShortArray122[local182], this.aShortArray123[local182]);
				}
			}
			local98.D(local5);
			@Pc(236) Class91 local236 = this.aClass63_2.aClass91_27;
			synchronized (this.aClass63_2.aClass91_27) {
				this.aClass63_2.aClass91_27.method1990(local98, (long) (this.anInt6634 |= arg12.anInt7745 << 29));
			}
		}
		@Pc(285) Class17 local285 = local21 == null ? local98.method6202(arg7, local5, true) : local21.method5214(local98, arg10, arg4, 0, arg2, arg7, local5);
		if (this.anInt6648 != 128 || this.anInt6639 != 128) {
			local285.n(this.anInt6648, this.anInt6639, this.anInt6648);
		}
		if (this.anInt6632 != 0) {
			if (this.anInt6632 == 90) {
				local285.ma(4096);
			}
			if (this.anInt6632 == 180) {
				local285.ma(8192);
			}
			if (this.anInt6632 == 270) {
				local285.ma(12288);
			}
		}
		if (local30) {
			local285.da(this.aByte91, this.anInt6635, arg9, arg1, arg8, arg3, arg11);
		}
		local285.D(arg0);
		return local285;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!ia;I)V")
	private void method5076(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6643 = arg0.method1177();
		} else if (arg1 == 2) {
			this.anInt6642 = arg0.method1177();
		} else if (arg1 == 4) {
			this.anInt6648 = arg0.method1177();
		} else if (arg1 == 5) {
			this.anInt6639 = arg0.method1177();
		} else if (arg1 == 6) {
			this.anInt6632 = arg0.method1177();
		} else if (arg1 == 7) {
			this.anInt6641 = arg0.method1171();
		} else if (arg1 == 8) {
			this.anInt6640 = arg0.method1171();
		} else if (arg1 == 9) {
			this.aByte91 = 3;
			this.anInt6635 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean420 = true;
		} else if (arg1 == 11) {
			this.aByte91 = 1;
		} else if (arg1 == 12) {
			this.aByte91 = 4;
		} else if (arg1 == 13) {
			this.aByte91 = 5;
		} else if (arg1 == 14) {
			this.aByte91 = 2;
			this.anInt6635 = arg0.method1171() * 256;
		} else if (arg1 == 15) {
			this.aByte91 = 3;
			this.anInt6635 = arg0.method1177();
		} else if (arg1 == 16) {
			this.aByte91 = 3;
			this.anInt6635 = arg0.method1188();
		} else {
			@Pc(117) int local117;
			@Pc(127) int local127;
			if (arg1 == 40) {
				local117 = arg0.method1171();
				this.aShortArray124 = new short[local117];
				this.aShortArray125 = new short[local117];
				for (local127 = 0; local127 < local117; local127++) {
					this.aShortArray124[local127] = (short) arg0.method1177();
					this.aShortArray125[local127] = (short) arg0.method1177();
				}
			} else if (arg1 == 41) {
				local117 = arg0.method1171();
				this.aShortArray122 = new short[local117];
				this.aShortArray123 = new short[local117];
				for (local127 = 0; local127 < local117; local127++) {
					this.aShortArray122[local127] = (short) arg0.method1177();
					this.aShortArray123[local127] = (short) arg0.method1177();
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ya;ZIIILclient!ya;IIILclient!za;IILclient!tl;)Lclient!e;")
	public Class17 method5077(@OriginalArg(0) Class96 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class96 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class106 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class239 arg10) {
		return this.method5073(arg2, arg0, arg4, arg6, arg5, true, arg10, (byte) 2, arg9, arg3, arg1, arg8, arg7);
	}
}
