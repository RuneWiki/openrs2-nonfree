import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class100 {

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "Lclient!r;")
	private Class14_Sub2_Sub5 aClass14_Sub2_Sub5_3;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "Lclient!sea;")
	private Class328 aClass328_2;

	@OriginalMember(owner = "client!eo", name = "w", descriptor = "Lclient!ka;")
	private Class129 aClass129_4;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
	private int anInt2250;

	@OriginalMember(owner = "client!eo", name = "C", descriptor = "[Z")
	private boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "Lclient!ui;")
	public Class4_Sub8 aClass4_Sub8_1;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
	private int anInt2243 = -1;

	@OriginalMember(owner = "client!eo", name = "z", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
	private int anInt2258 = 0;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
	private int anInt2263 = 0;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "I")
	public final int anInt2254;

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "B")
	private final byte aByte30;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "Lclient!haa;")
	private final Class4_Sub3 aClass4_Sub3_5;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
	public final int anInt2246;

	@OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
	public final int anInt2256;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!eo", name = "y", descriptor = "Z")
	private final boolean aBoolean156;

	@OriginalMember(owner = "client!eo", name = "G", descriptor = "Lclient!jaa;")
	private final Class181 aClass181_1;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!ha;Lclient!gba;IIIILclient!haa;ZI)V")
	public Class100(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub3 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aBoolean154 = arg7;
		this.anInt2254 = arg3;
		this.aByte30 = (byte) arg5;
		this.aClass4_Sub3_5 = arg6;
		this.anInt2246 = arg1.anInt2969;
		this.aBoolean157 = arg8 != -1;
		this.anInt2256 = arg2;
		this.aByte31 = (byte) arg4;
		this.aBoolean156 = arg0.method6955() && arg1.aBoolean210 && !this.aBoolean154;
		this.aClass181_1 = new Class181_Sub2(arg6, false);
		this.method2145(1, false, arg8);
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)I")
	public int method2132(@OriginalArg(0) int arg0) {
		if (arg0 != -17644) {
			this.aBoolean155 = true;
		}
		return this.anInt2263;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIZLclient!ha;Lclient!rd;IILclient!ka;I)V")
	public void method2134(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class144 arg2, @OriginalArg(4) Class263 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class129 arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class352[] local6 = arg6.method5304();
		@Pc(9) Class172[] local9 = arg6.method5310();
		if ((this.aClass4_Sub8_1 == null || this.aClass4_Sub8_1.aBoolean705) && (local6 != null || local9 != null)) {
			@Pc(37) Class128 local37 = Static212.aClass249_4.method6119(this.anInt2246);
			if (local37.anIntArray179 != null) {
				local37 = local37.method2685(Static188.aClass238_1);
			}
			if (local37 != null) {
				this.aClass4_Sub8_1 = Static616.method8682(Static530.anInt9105, true);
			}
		}
		if (this.aClass4_Sub8_1 == null) {
			return;
		}
		arg6.method5294(arg3);
		if (arg1) {
			this.aClass4_Sub8_1.method8667(arg2, (long) Static530.anInt9105, local6, local9);
		} else {
			this.aClass4_Sub8_1.method8678((long) Static530.anInt9105);
		}
		this.aClass4_Sub8_1.method8670(this.aByte31, arg7, arg0, arg5, arg4);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I")
	public int method2136() {
		return this.anInt2258;
	}

	@OriginalMember(owner = "client!eo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub8_1 != null) {
			this.aClass4_Sub8_1.method8680();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!ha;)V")
	public void method2137(@OriginalArg(1) Class144 arg0) {
		this.method2139(262144, true, arg0, true);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V")
	public void method2138(@OriginalArg(1) int arg0) {
		this.aBoolean157 = true;
		this.method2145(1, false, arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZLclient!ha;ZB)Lclient!ka;")
	public Class129 method2139(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class144 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(11) Class128 local11 = Static212.aClass249_4.method6119(this.anInt2246);
		if (local11.anIntArray179 != null) {
			local11 = local11.method2685(Static188.aClass238_1);
		}
		if (local11 == null) {
			this.method2144(arg2);
			this.anInt2243 = -1;
			return null;
		}
		if (!this.aBoolean157 && this.anInt2243 != local11.anInt2969) {
			this.method2145(0, true, -1);
			this.aBoolean155 = false;
			this.aClass129_4 = null;
		}
		this.method2142(this.aClass4_Sub3_5);
		if (arg3) {
			arg3 &= !this.aBoolean155 & this.aBoolean156 & Static181.aClass14_Sub26_9.aClass43_Sub8_1.method2751() != 0;
		}
		if (arg1 && !arg3) {
			this.anInt2243 = local11.anInt2969;
			return null;
		}
		if (arg3) {
			Static474.method7103(this.aClass14_Sub2_Sub5_3, this.aByte30, this.aClass4_Sub3_5.anInt11184, this.aClass4_Sub3_5.anInt11178, this.aBooleanArray2);
			this.aBoolean155 = false;
		}
		@Pc(137) Class159 local137 = Static258.aClass159Array1[this.aByte30];
		@Pc(144) Class159 local144;
		if (this.aBoolean154) {
			local144 = Static445.aClass159Array3[0];
		} else {
			local144 = this.aByte30 < 3 ? Static258.aClass159Array1[this.aByte30 + 1] : null;
		}
		@Pc(166) Class129 local166 = null;
		if (this.aClass181_1.method8970()) {
			if (arg3) {
				arg0 |= 0x40000;
			}
			local166 = local11.method2669(local137, local137.method8209(this.aClass4_Sub3_5.anInt11184, this.aClass4_Sub3_5.anInt11178), this.aClass328_2, local144, arg2, this.aClass4_Sub3_5.anInt11178, this.anInt2256 == 11 ? 10 : this.anInt2256, arg0, this.anInt2256 == 11 ? this.anInt2254 + 4 : this.anInt2254, this.aClass181_1, this.aClass4_Sub3_5.anInt11184);
			if (local166 == null) {
				this.anInt2258 = 0;
				this.aBooleanArray2 = null;
				this.anInt2263 = 0;
				this.aClass14_Sub2_Sub5_3 = null;
			} else {
				if (arg3) {
					if (this.aBooleanArray2 == null) {
						this.aBooleanArray2 = new boolean[4];
					}
					this.aClass14_Sub2_Sub5_3 = local166.ba(this.aClass14_Sub2_Sub5_3);
					Static674.method9338(this.aClass14_Sub2_Sub5_3, this.aByte30, this.aClass4_Sub3_5.anInt11184, this.aClass4_Sub3_5.anInt11178, this.aBooleanArray2);
					this.aBoolean155 = true;
				}
				this.anInt2258 = local166.fa();
				this.anInt2263 = local166.ma();
			}
			this.aClass129_4 = null;
		} else if (this.aClass129_4 != null && (arg0 & this.aClass129_4.ua()) == arg0 && local11.anInt2969 == this.anInt2243) {
			local166 = this.aClass129_4;
		} else {
			if (this.aClass129_4 != null) {
				arg0 |= this.aClass129_4.ua();
			}
			@Pc(384) Class98 local384 = local11.method2671(local144, this.aClass4_Sub3_5.anInt11184, this.anInt2256 == 11 ? 10 : this.anInt2256, this.aClass328_2, arg0, arg2, local137, local137.method8209(this.aClass4_Sub3_5.anInt11184, this.aClass4_Sub3_5.anInt11178), arg3, this.anInt2256 == 11 ? this.anInt2254 + 4 : this.anInt2254, this.aClass4_Sub3_5.anInt11178);
			if (local384 == null) {
				this.anInt2258 = 0;
				this.aBooleanArray2 = null;
				this.aClass14_Sub2_Sub5_3 = null;
				this.anInt2263 = 0;
				this.aClass129_4 = null;
			} else {
				local166 = local384.aClass129_2;
				this.aClass129_4 = local384.aClass129_2;
				if (arg3) {
					this.aClass14_Sub2_Sub5_3 = local384.aClass14_Sub2_Sub5_2;
					this.aBooleanArray2 = null;
					Static674.method9338(this.aClass14_Sub2_Sub5_3, this.aByte30, this.aClass4_Sub3_5.anInt11184, this.aClass4_Sub3_5.anInt11178, (boolean[]) null);
					this.aBoolean155 = true;
				}
				this.anInt2258 = local166.fa();
				this.anInt2263 = local166.ma();
			}
		}
		this.anInt2243 = local11.anInt2969;
		return local166;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Z")
	public boolean method2140() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!haa;B)V")
	private void method2142(@OriginalArg(0) Class4_Sub3 arg0) {
		if (!this.aClass181_1.method8970()) {
			this.method2145(0, false, -1);
		} else if (this.aClass181_1.method8961(Static530.anInt9105 - this.anInt2250)) {
			if (Static181.aClass14_Sub26_9.aClass43_Sub8_1.method2751() == 2) {
				this.aBoolean155 = false;
			}
			if (this.aClass181_1.method8962()) {
				this.aClass181_1.method8964(-1, 0);
				this.aBoolean157 = false;
				this.method2145(0, false, -1);
			}
		}
		this.anInt2250 = Static530.anInt9105;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!sea;)V")
	public void method2143(@OriginalArg(1) Class328 arg0) {
		this.aClass129_4 = null;
		this.aClass328_2 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method2144(@OriginalArg(0) Class144 arg0) {
		if (this.aClass14_Sub2_Sub5_3 != null) {
			Static474.method7103(this.aClass14_Sub2_Sub5_3, this.aByte30, this.aClass4_Sub3_5.anInt11184, this.aClass4_Sub3_5.anInt11178, this.aBooleanArray2);
			this.aClass14_Sub2_Sub5_3 = null;
			this.aBooleanArray2 = null;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IBZI)V")
	private void method2145(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg2;
		@Pc(15) boolean local15 = false;
		if (arg2 == -1) {
			@Pc(24) Class128 local24 = Static212.aClass249_4.method6119(this.anInt2246);
			@Pc(26) Class128 local26 = local24;
			if (local24.anIntArray179 != null) {
				local24 = local24.method2685(Static188.aClass238_1);
			}
			if (local24 == null) {
				return;
			}
			if (local26 == local24) {
				local26 = null;
			}
			if (local24.method2682()) {
				if (arg1 && this.aClass181_1.method8970() && local24.method2672(this.aClass181_1.method8959())) {
					return;
				}
				if (local24.anInt2969 != this.anInt2243) {
					local15 = local24.aBoolean216;
				}
				local13 = local24.method2675();
				if (local24.method2684()) {
					arg0 = 0;
				} else {
					arg0 = 1;
				}
			} else if (local26 != null && local26.method2682()) {
				if (arg1 && this.aClass181_1.method8970() && local26.method2672(this.aClass181_1.method8959())) {
					return;
				}
				if (local24.anInt2969 != this.anInt2243) {
					local15 = local26.aBoolean216;
				}
				local13 = local26.method2675();
				if (local26.method2684()) {
					arg0 = 0;
				} else {
					arg0 = 1;
				}
			}
		}
		if (local13 == -1) {
			this.aClass181_1.method8943();
		} else {
			this.aClass181_1.method8955(arg0, local15, 0, local13);
			this.anInt2250 = Static530.anInt9105;
			this.aBoolean155 = false;
			this.aClass129_4 = null;
		}
	}
}
