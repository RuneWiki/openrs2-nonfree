import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class25 {

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Lclient!mj;")
	private Class126 aClass126_1;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Lclient!e;")
	public Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
	private int anInt396;

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "[Z")
	private boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
	private int anInt408;

	@OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
	private int anInt410;

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "Lclient!jm;")
	private Class111 aClass111_1;

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "Lclient!mc;")
	private Class11_Sub4_Sub4 aClass11_Sub4_Sub4_1;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
	private int anInt395 = -32768;

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
	private int anInt406 = -1;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
	private int anInt389 = -1;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
	public final int anInt412;

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "B")
	private final byte aByte4;

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
	public final int anInt413;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
	public final int anInt392;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "Z")
	private final boolean aBoolean27;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!uo;Lclient!gm;IIIIIIZI)V")
	public Class25(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte3 = (byte) arg5;
		this.anInt412 = arg2;
		this.anInt397 = arg7;
		this.aByte4 = (byte) arg4;
		this.anInt413 = arg3;
		this.anInt392 = arg1.anInt2012;
		this.anInt399 = arg6;
		this.aBoolean26 = arg8;
		this.aBoolean27 = arg0.method4935() && arg1.aBoolean135 && !this.aBoolean26;
		if (arg9 != -1) {
			this.aBoolean25 = true;
		}
		this.method315(arg9);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
	public void method309(@OriginalArg(1) int arg0) {
		this.aBoolean25 = true;
		this.method315(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)Z")
	public boolean method313() {
		return this.aBoolean27;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V")
	private void method315(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(17) Class84 local17 = Static108.method1650(this.anInt392);
			@Pc(19) Class84 local19 = local17;
			if (local17.anIntArray142 != null) {
				local17 = local17.method1635();
			}
			if (local17 == null) {
				return;
			}
			if (local17 == local19) {
				local19 = null;
			}
			if (local17.anIntArray141 != null) {
				if (this.aClass111_1 != null && local17.method1630(this.aClass111_1.anInt2721)) {
					return;
				}
				local7 = local17.method1633();
				if (local17.anInt2012 != this.anInt389) {
					local9 = local17.aBoolean129;
				}
			} else if (local17.anInt1991 == -1) {
				if (local19 != null && local19.anIntArray141 != null) {
					if (this.aClass111_1 != null && local19.method1630(this.aClass111_1.anInt2721)) {
						return;
					}
					local7 = local19.method1633();
					if (this.anInt389 != local19.anInt2012) {
						local9 = local19.aBoolean129;
					}
				} else if (local19 != null && local19.anInt1991 != -1 && local19.anInt2012 != this.anInt389) {
					local9 = local19.aBoolean129;
					local7 = local19.anInt1991;
				}
			} else if (local17.anInt2012 != this.anInt389) {
				local9 = local17.aBoolean129;
				local7 = local17.anInt1991;
			}
		}
		if (local7 == -1) {
			this.aClass111_1 = null;
			return;
		}
		this.aClass126_1 = null;
		if (this.aClass111_1 == null || this.aClass111_1.anInt2721 != local7) {
			this.aClass111_1 = Static306.method5143(local7);
		} else if (this.aClass111_1.anInt2720 == 0) {
			return;
		}
		if (this.aClass111_1.anIntArray191 == null) {
			this.aClass111_1 = null;
			return;
		}
		if (local9) {
			this.anInt408 = (int) (Math.random() * (double) this.aClass111_1.anIntArray191.length);
			this.anInt398 = (int) (Math.random() * (double) this.aClass111_1.anIntArray190[this.anInt408]) + 1;
		} else {
			this.anInt408 = 0;
			this.anInt398 = 1;
		}
		this.anInt396 = this.anInt408 + 1;
		if (this.anInt396 < 0 || this.anInt396 >= this.aClass111_1.anIntArray191.length) {
			this.anInt396 = -1;
		}
		this.anInt410 = Static293.anInt5807 - this.anInt398;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!uo;)V")
	public void method316(@OriginalArg(1) Class129 arg0) {
		if (this.aClass11_Sub4_Sub4_1 != null) {
			Static134.method2077(this.aClass11_Sub4_Sub4_1, this.aByte3, this.anInt399, this.anInt397, this.aBooleanArray2);
			this.aClass11_Sub4_Sub4_1 = null;
			this.aBooleanArray2 = null;
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)I")
	public int method320() {
		return this.anInt395;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZILclient!uo;ZZI)Lclient!mj;")
	public Class126 method321(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class129 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) Class84 local10 = Static108.method1650(this.anInt392);
		if (local10.anIntArray142 != null) {
			local10 = local10.method1635();
		}
		if (local10 == null) {
			this.method316(arg3);
			this.anInt406 = this.anInt408;
			this.anInt389 = -1;
			return null;
		}
		if (!this.aBoolean25 && local10.anInt2012 != this.anInt389) {
			this.aClass126_1 = null;
			this.method315(-1);
		}
		this.method324(arg5, arg0);
		@Pc(67) boolean local67 = arg1 & Static103.anInt1883 != 0 & this.aBoolean27;
		@Pc(114) boolean local114 = local67 & (this.anInt389 != local10.anInt2012 || (this.anInt408 != this.anInt406 || this.aClass111_1 != null && (this.aClass111_1.aBoolean185 || Static256.aBoolean339) && this.anInt408 != this.anInt396) && Static103.anInt1883 >= 2);
		if (arg4 && !local114) {
			this.anInt406 = this.anInt408;
			this.anInt389 = local10.anInt2012;
			return null;
		}
		if (local114) {
			Static134.method2077(this.aClass11_Sub4_Sub4_1, this.aByte3, this.anInt399, this.anInt397, this.aBooleanArray2);
		}
		@Pc(152) Class77 local152 = Static108.aClass77Array2[this.aByte3];
		@Pc(170) Class77 local170;
		if (this.aBoolean26) {
			local170 = Static129.aClass77Array3[0];
		} else {
			local170 = this.aByte3 >= 3 ? null : Static108.aClass77Array2[this.aByte3 + 1];
		}
		@Pc(178) Class126 local178 = null;
		if (this.aClass111_1 != null) {
			if (local114) {
				arg2 |= 0x20000;
			}
			local178 = local10.method1643(arg3, this.aClass111_1, this.anInt412 == 11 ? this.anInt413 + 4 : this.anInt413, this.anInt397, local170, this.anInt412 == 11 ? 10 : this.anInt412, this.anInt399, this.anInt398, arg2, local152.method4133(this.anInt399, this.anInt397), this.anInt408, local152, this.anInt396);
			if (local178 == null) {
				this.aBooleanArray2 = null;
				this.aClass11_Sub4_Sub4_1 = null;
				this.anInt395 = 0;
			} else {
				if (local114) {
					if (this.aBooleanArray2 == null) {
						this.aBooleanArray2 = new boolean[4];
					}
					this.aClass11_Sub4_Sub4_1 = local178.method3116(this.aClass11_Sub4_Sub4_1);
					Static328.method5390(this.aClass11_Sub4_Sub4_1, this.aByte3, arg0, arg5, this.aBooleanArray2);
				}
				this.anInt395 = local178.method3155();
			}
			this.aClass126_1 = null;
		} else if (this.aClass126_1 != null && arg2 == (this.aClass126_1.method3142() & arg2) && local10.anInt2012 == this.anInt389) {
			local178 = this.aClass126_1;
		} else {
			if (this.aClass126_1 != null) {
				arg2 |= this.aClass126_1.method3142();
			}
			@Pc(258) Class204 local258 = local10.method1641(arg3, this.anInt412 == 11 ? this.anInt413 + 4 : this.anInt413, this.anInt399, this.anInt412 == 11 ? 10 : this.anInt412, local152, local152.method4133(this.anInt399, this.anInt397), local170, this.anInt397, local114, arg2);
			if (local258 == null) {
				this.anInt395 = 0;
				this.aClass11_Sub4_Sub4_1 = null;
				this.aBooleanArray2 = null;
				this.aClass126_1 = null;
			} else {
				local178 = local258.aClass126_7;
				this.aClass126_1 = local258.aClass126_7;
				if (local114) {
					this.aClass11_Sub4_Sub4_1 = local258.aClass11_Sub4_Sub4_6;
					this.aBooleanArray2 = null;
					Static328.method5390(this.aClass11_Sub4_Sub4_1, this.aByte3, arg0, arg5, null);
				}
				this.anInt395 = local178.method3155();
			}
		}
		this.anInt397 = arg5;
		this.anInt406 = this.anInt408;
		this.anInt399 = arg0;
		this.anInt389 = local10.anInt2012;
		return local178;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLclient!uo;)V")
	public void method322(@OriginalArg(1) Class129 arg0) {
		this.method321(this.anInt399, true, 131072, arg0, true, this.anInt397);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIIILclient!uo;IILclient!mj;)V")
	public void method323(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class129 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class126 arg6) {
		@Pc(6) Class174[] local6 = arg6.method3151();
		@Pc(9) Class212[] local9 = arg6.method3141();
		if ((this.aClass10_Sub2_1 == null || this.aClass10_Sub2_1.aBoolean75) && (local6 != null || local9 != null)) {
			@Pc(34) Class84 local34 = Static108.method1650(this.anInt392);
			if (local34.anIntArray142 != null) {
				local34 = local34.method1635();
			}
			if (local34 != null) {
				this.aClass10_Sub2_1 = new Class10_Sub2(Static293.anInt5807);
			}
		}
		if (this.aClass10_Sub2_1 == null) {
			return;
		}
		if (arg0) {
			this.aClass10_Sub2_1.method990(arg3, (long) Static293.anInt5807, local6, local9);
		} else {
			this.aClass10_Sub2_1.method991((long) Static293.anInt5807);
		}
		this.aClass10_Sub2_1.method979(this.aByte4, arg1, arg4, arg5, arg2);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)V")
	private void method324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass111_1 == null) {
				if (this.aBoolean25) {
					return;
				}
				this.method315(-1);
				if (this.aClass111_1 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static293.anInt5807 - this.anInt410;
			if (local32 > 100 && this.aClass111_1.anInt2723 > 0) {
				@Pc(52) int local52 = this.aClass111_1.anIntArray191.length - this.aClass111_1.anInt2723;
				while (local52 > this.anInt408 && local32 > this.aClass111_1.anIntArray190[this.anInt408]) {
					local32 -= this.aClass111_1.anIntArray190[this.anInt408];
					this.anInt408++;
				}
				if (local52 <= this.anInt408) {
					@Pc(99) int local99 = 0;
					for (@Pc(101) int local101 = local52; local101 < this.aClass111_1.anIntArray191.length; local101++) {
						local99 += this.aClass111_1.anIntArray190[local101];
					}
					local32 %= local99;
				}
				this.anInt396 = this.anInt408 + 1;
				if (this.anInt396 >= this.aClass111_1.anIntArray191.length) {
					this.anInt396 -= this.aClass111_1.anInt2723;
					if (this.anInt396 < 0 || this.aClass111_1.anIntArray191.length <= this.anInt396) {
						this.anInt396 = -1;
					}
				}
			}
			while (local32 > this.aClass111_1.anIntArray190[this.anInt408]) {
				Static354.method5681(arg0, arg1, this.aClass111_1, false, this.anInt408);
				local32 -= this.aClass111_1.anIntArray190[this.anInt408];
				this.anInt408++;
				if (this.anInt408 >= this.aClass111_1.anIntArray191.length) {
					this.anInt408 -= this.aClass111_1.anInt2723;
					if (this.anInt408 < 0 || this.aClass111_1.anIntArray191.length <= this.anInt408) {
						this.aClass111_1 = null;
						continue label80;
					}
				}
				this.anInt396 = this.anInt408 + 1;
				if (this.anInt396 >= this.aClass111_1.anIntArray191.length) {
					this.anInt396 -= this.aClass111_1.anInt2723;
					if (this.anInt396 < 0 || this.anInt396 >= this.aClass111_1.anIntArray191.length) {
						this.anInt396 = -1;
					}
				}
			}
			this.anInt398 = local32;
			this.anInt410 = Static293.anInt5807 - local32;
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass10_Sub2_1 != null) {
			this.aClass10_Sub2_1.method989();
		}
	}
}
