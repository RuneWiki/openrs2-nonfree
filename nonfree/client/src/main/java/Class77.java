import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class77 {

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "[I")
	public static final int[] anIntArray125 = new int[4096];

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "Lclient!taa;")
	public Class303 aClass303_2;

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
	public int anInt2565;

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!eca", name = "n", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
	private int anInt2571;

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
	private int anInt2563 = 0;

	@OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
	private int anInt2566 = 0;

	@OriginalMember(owner = "client!eca", name = "s", descriptor = "I")
	public int anInt2573 = -1;

	@OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
	private int anInt2570 = 128;

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "B")
	public byte aByte24 = 0;

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
	private int anInt2564 = -1;

	@OriginalMember(owner = "client!eca", name = "l", descriptor = "Z")
	public boolean aBoolean197 = false;

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
	private int anInt2569 = 128;

	@OriginalMember(owner = "client!eca", name = "r", descriptor = "I")
	private int anInt2572 = 0;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray125[local4] = Static274.method4784(local4);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLclient!fd;I)V")
	private void method2269(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2571 = arg0.method6535();
		} else if (arg1 == 2) {
			this.anInt2573 = arg0.method6535();
		} else if (arg1 == 4) {
			this.anInt2570 = arg0.method6535();
		} else if (arg1 == 5) {
			this.anInt2569 = arg0.method6535();
		} else if (arg1 == 6) {
			this.anInt2566 = arg0.method6535();
		} else if (arg1 == 7) {
			this.anInt2572 = arg0.method6538();
		} else if (arg1 == 8) {
			this.anInt2563 = arg0.method6538();
		} else if (arg1 == 9) {
			this.anInt2564 = 8224;
			this.aByte24 = 3;
		} else if (arg1 == 10) {
			this.aBoolean197 = true;
		} else if (arg1 == 11) {
			this.aByte24 = 1;
		} else if (arg1 == 12) {
			this.aByte24 = 4;
		} else if (arg1 == 13) {
			this.aByte24 = 5;
		} else if (arg1 == 14) {
			this.aByte24 = 2;
			this.anInt2564 = arg0.method6538() * 256;
		} else if (arg1 == 15) {
			this.aByte24 = 3;
			this.anInt2564 = arg0.method6535();
		} else if (arg1 == 16) {
			this.aByte24 = 3;
			this.anInt2564 = arg0.method6497();
		} else {
			@Pc(136) int local136;
			@Pc(146) int local146;
			if (arg1 == 40) {
				local136 = arg0.method6538();
				this.aShortArray35 = new short[local136];
				this.aShortArray36 = new short[local136];
				for (local146 = 0; local146 < local136; local146++) {
					this.aShortArray35[local146] = (short) arg0.method6535();
					this.aShortArray36[local146] = (short) arg0.method6535();
				}
			} else if (arg1 == 41) {
				local136 = arg0.method6538();
				this.aShortArray37 = new short[local136];
				this.aShortArray34 = new short[local136];
				for (local146 = 0; local146 < local136; local146++) {
					this.aShortArray34[local146] = (short) arg0.method6535();
					this.aShortArray37[local146] = (short) arg0.method6535();
				}
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIIIILclient!d;Lclient!ie;Lclient!d;ZIBILclient!oa;)Lclient!ba;")
	private Class21 method2270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4 arg6, @OriginalArg(7) Class157 arg7, @OriginalArg(8) Class4 arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(13) Class15 arg12) {
		@Pc(5) int local5 = arg3;
		@Pc(21) Class174 local21 = this.anInt2573 == -1 || arg2 == -1 ? null : arg7.method3734(this.anInt2573);
		@Pc(33) boolean local33 = arg9 & this.aByte24 != 0;
		if (local21 != null) {
			local5 = arg3 | local21.method4547(arg1, false, arg2);
		}
		if (local33) {
			local5 |= this.aByte24 == 3 ? 7 : 2;
		}
		if (this.anInt2569 != 128) {
			local5 |= 0x2;
		}
		if (this.anInt2570 != 128 || this.anInt2566 != 0) {
			local5 |= 0x5;
		}
		@Pc(82) Class211 local82 = this.aClass303_2.aClass211_59;
		@Pc(102) Class21 local102;
		synchronized (this.aClass303_2.aClass211_59) {
			local102 = (Class21) this.aClass303_2.aClass211_59.method5534((long) (this.anInt2565 |= arg12.anInt6343 << 29));
		}
		if (local102 == null || arg12.method5321(local102.h(), local5) != 0) {
			if (local102 != null) {
				local5 = arg12.method5315(local5, local102.h());
			}
			@Pc(129) int local129 = local5;
			if (this.aShortArray35 != null) {
				local129 = local5 | 0x4000;
			}
			if (this.aShortArray34 != null) {
				local129 |= 0x8000;
			}
			@Pc(152) Class96 local152 = Static374.method6085(this.anInt2571, this.aClass303_2.aClass254_123);
			if (local152 == null) {
				return null;
			}
			if (local152.anInt3175 < 13) {
				local152.method2775();
			}
			local102 = arg12.method5352(local152, local129, this.aClass303_2.anInt9146, this.anInt2572 + 64, this.anInt2563 + 850);
			@Pc(185) int local185;
			if (this.aShortArray35 != null) {
				for (local185 = 0; local185 < this.aShortArray35.length; local185++) {
					local102.UA(this.aShortArray35[local185], this.aShortArray36[local185]);
				}
			}
			if (this.aShortArray34 != null) {
				for (local185 = 0; local185 < this.aShortArray34.length; local185++) {
					local102.ka(this.aShortArray34[local185], this.aShortArray37[local185]);
				}
			}
			local102.ia(local5);
			@Pc(231) Class211 local231 = this.aClass303_2.aClass211_59;
			synchronized (this.aClass303_2.aClass211_59) {
				this.aClass303_2.aClass211_59.method5529((long) (this.anInt2565 |= arg12.anInt6343 << 29), local102);
			}
		}
		@Pc(275) Class21 local275 = local21 == null ? local102.method7131(arg11, local5, true) : local21.method4548(arg11, arg2, local5, 0, local102, arg5, arg1);
		if (this.anInt2570 != 128 || this.anInt2569 != 128) {
			local275.l(this.anInt2570, this.anInt2569, this.anInt2570);
		}
		if (this.anInt2566 != 0) {
			if (this.anInt2566 == 90) {
				local275.I(4096);
			}
			if (this.anInt2566 == 180) {
				local275.I(8192);
			}
			if (this.anInt2566 == 270) {
				local275.I(12288);
			}
		}
		if (local33) {
			local275.OA(this.aByte24, this.anInt2564, arg6, arg8, arg4, arg10, arg0);
		}
		local275.ia(arg3);
		return local275;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILclient!oa;IIILclient!ie;)Lclient!ba;")
	public Class21 method2271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class157 arg5) {
		return this.method2270(0, arg3, arg4, arg1, 0, arg0, null, arg5, null, false, 0, (byte) 5, arg2);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!ie;Lclient!oa;IBLclient!d;IZIIILclient!d;II)Lclient!ba;")
	public Class21 method2272(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class4 arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		return this.method2270(arg10, arg9, arg5, arg6, arg2, arg4, arg8, arg0, arg3, true, arg7, (byte) 2, arg1);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLclient!fd;)V")
	public void method2275(@OriginalArg(1) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6538();
			if (local3 == 0) {
				return;
			}
			this.method2269(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILclient!ie;IBILclient!oa;)Lclient!ba;")
	public Class21 method2276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		return this.method2270(0, arg3, arg1, arg0, 0, arg4, null, arg2, null, false, 0, (byte) 2, arg5);
	}
}
