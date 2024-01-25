import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class10 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "Lclient!df;")
	public Class66 aClass66_1;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
	private int anInt337;

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
	private int anInt326 = 0;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
	private int anInt331 = 0;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
	private int anInt323 = -1;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	private int anInt325 = 0;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
	public int anInt334 = -1;

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	private int anInt329 = 128;

	@OriginalMember(owner = "client!ai", name = "w", descriptor = "B")
	public byte aByte18 = 0;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Z")
	public boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
	private int anInt328 = 128;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIBILclient!d;Lclient!sa;IILclient!d;Lclient!oa;Z)Lclient!ba;")
	private Class20 method249(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class59 arg6, @OriginalArg(8) Class298 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class59 arg10, @OriginalArg(12) Class14 arg11, @OriginalArg(13) boolean arg12) {
		@Pc(12) int local12 = arg0;
		@Pc(29) Class57 local29 = this.anInt334 == -1 || arg1 == -1 ? null : arg7.method6521(this.anInt334);
		@Pc(38) boolean local38 = arg12 & this.aByte18 != 0;
		if (local29 != null) {
			local12 = arg0 | local29.method1448(arg9, false, arg1);
		}
		if (local38) {
			local12 |= this.aByte18 == 3 ? 7 : 2;
		}
		if (this.anInt328 != 128) {
			local12 |= 0x2;
		}
		if (this.anInt329 != 128 || this.anInt326 != 0) {
			local12 |= 0x5;
		}
		@Pc(88) Class136 local88 = this.aClass66_1.aClass136_21;
		@Pc(108) Class20 local108;
		synchronized (this.aClass66_1.aClass136_21) {
			local108 = (Class20) this.aClass66_1.aClass136_21.method3473((long) (this.anInt322 |= arg11.anInt8396 << 29));
		}
		if (local108 == null || arg11.method6884(local108.h(), local12) != 0) {
			if (local108 != null) {
				local12 = arg11.method6879(local12, local108.h());
			}
			@Pc(135) int local135 = local12;
			if (this.aShortArray3 != null) {
				local135 = local12 | 0x4000;
			}
			if (this.aShortArray1 != null) {
				local135 |= 0x8000;
			}
			@Pc(158) Class220 local158 = Static489.method6690(this.anInt337, this.aClass66_1.aClass251_21);
			if (local158 == null) {
				return null;
			}
			if (local158.anInt6196 < 13) {
				local158.method5294();
			}
			local108 = arg11.method6833(local158, local135, this.aClass66_1.anInt1718, this.anInt325 + 64, this.anInt331 + 850);
			@Pc(191) int local191;
			if (this.aShortArray3 != null) {
				for (local191 = 0; local191 < this.aShortArray3.length; local191++) {
					local108.UA(this.aShortArray3[local191], this.aShortArray2[local191]);
				}
			}
			if (this.aShortArray1 != null) {
				for (local191 = 0; local191 < this.aShortArray1.length; local191++) {
					local108.ka(this.aShortArray1[local191], this.aShortArray4[local191]);
				}
			}
			local108.ia(local12);
			@Pc(247) Class136 local247 = this.aClass66_1.aClass136_21;
			synchronized (this.aClass66_1.aClass136_21) {
				this.aClass66_1.aClass136_21.method3482((long) (this.anInt322 |= arg11.anInt8396 << 29), local108);
			}
		}
		@Pc(291) Class20 local291 = local29 == null ? local108.method7264(arg4, local12, true) : local29.method1451(arg9, arg1, 0, arg8, local12, local108, arg4);
		if (this.anInt329 != 128 || this.anInt328 != 128) {
			local291.l(this.anInt329, this.anInt328, this.anInt329);
		}
		if (this.anInt326 != 0) {
			if (this.anInt326 == 90) {
				local291.I(4096);
			}
			if (this.anInt326 == 180) {
				local291.I(8192);
			}
			if (this.anInt326 == 270) {
				local291.I(12288);
			}
		}
		if (local38) {
			local291.OA(this.aByte18, this.anInt323, arg10, arg6, arg2, arg5, arg3);
		}
		local291.ia(arg0);
		return local291;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIBILclient!d;IILclient!sa;Lclient!d;IIZLclient!oa;)Lclient!ba;")
	public Class20 method250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class59 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class298 arg6, @OriginalArg(8) Class59 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(12) Class14 arg10) {
		return this.method249(arg5, arg1, arg2, arg4, (byte) 2, arg8, arg3, arg6, arg0, arg9, arg7, arg10, true);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZLclient!ji;)V")
	private void method251(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt337 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anInt334 = arg1.method6003();
		} else if (arg0 == 4) {
			this.anInt329 = arg1.method6003();
		} else if (arg0 == 5) {
			this.anInt328 = arg1.method6003();
		} else if (arg0 == 6) {
			this.anInt326 = arg1.method6003();
		} else if (arg0 == 7) {
			this.anInt325 = arg1.method6069();
		} else if (arg0 == 8) {
			this.anInt331 = arg1.method6069();
		} else if (arg0 == 9) {
			this.aByte18 = 3;
			this.anInt323 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean21 = true;
		} else if (arg0 == 11) {
			this.aByte18 = 1;
		} else if (arg0 == 12) {
			this.aByte18 = 4;
		} else if (arg0 == 13) {
			this.aByte18 = 5;
		} else if (arg0 == 14) {
			this.aByte18 = 2;
			this.anInt323 = arg1.method6069() * 256;
		} else if (arg0 == 15) {
			this.aByte18 = 3;
			this.anInt323 = arg1.method6003();
		} else if (arg0 == 16) {
			this.aByte18 = 3;
			this.anInt323 = arg1.method6036();
		} else {
			@Pc(125) int local125;
			@Pc(135) int local135;
			if (arg0 == 40) {
				local125 = arg1.method6069();
				this.aShortArray3 = new short[local125];
				this.aShortArray2 = new short[local125];
				for (local135 = 0; local135 < local125; local135++) {
					this.aShortArray3[local135] = (short) arg1.method6003();
					this.aShortArray2[local135] = (short) arg1.method6003();
				}
			} else if (arg0 == 41) {
				local125 = arg1.method6069();
				this.aShortArray4 = new short[local125];
				this.aShortArray1 = new short[local125];
				for (local135 = 0; local135 < local125; local135++) {
					this.aShortArray1[local135] = (short) arg1.method6003();
					this.aShortArray4[local135] = (short) arg1.method6003();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIILclient!sa;Lclient!oa;I)Lclient!ba;")
	public Class20 method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class298 arg4, @OriginalArg(5) Class14 arg5) {
		return this.method249(arg0, arg1, 0, 0, (byte) 5, 0, null, arg4, arg3, arg2, null, arg5, false);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!ji;B)V")
	public void method255(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6069();
			if (local5 == 0) {
				return;
			}
			this.method251(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILclient!sa;IILclient!oa;B)Lclient!ba;")
	public Class20 method256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class298 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class14 arg5) {
		return this.method249(arg0, arg4, 0, 0, (byte) 2, 0, null, arg2, arg1, arg3, null, arg5, false);
	}
}
