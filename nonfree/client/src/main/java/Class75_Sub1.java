import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Z")
	private boolean aBoolean192;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Lclient!rm;")
	private Class3_Sub16 aClass3_Sub16_1;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
	private int anInt2455;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "Lclient!jr;")
	private Class127 aClass127_12;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "Z")
	private boolean aBoolean193;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
	public int anInt2456;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
	public int anInt2457;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
	public int anInt2458;

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
	public int anInt2459;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
	public int anInt2460;

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
	public int anInt2461;

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
	public int anInt2462;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
	public int anInt2463;

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
	public int anInt2464;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
	private int anInt2465;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
	public int anInt2466;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
	public int anInt2467;

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "Z")
	public boolean aBoolean194;

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "Z")
	public boolean aBoolean195;

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
	private int anInt2468;

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
	private int anInt2469;

	@OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
	private int anInt2470;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	public int anInt2471;

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "Lclient!se;")
	public Class106_Sub1 aClass106_Sub1_2;

	@OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
	public int anInt2472;

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
	public int anInt2473;

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
	public int anInt2474;

	@OriginalMember(owner = "client!fe", name = "T", descriptor = "Lclient!f;")
	private Class22 aClass22_5;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
	public int anInt2475;

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
	public int anInt2476;

	@OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
	public int anInt2477;

	@OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
	public int anInt2478;

	@OriginalMember(owner = "client!fe", name = "Y", descriptor = "Lclient!ad;")
	private final Class5 aClass5_21;

	@OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
	public int anInt2479;

	@OriginalMember(owner = "client!fe", name = "ab", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
	public int anInt2480;

	@OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
	public int anInt2481;

	@OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
	public int anInt2482;

	@OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
	public int anInt2483;

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "[Lclient!db;")
	private Class45[] aClass45Array1;

	@OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
	public int anInt2484;

	@OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
	public int anInt2485;

	@OriginalMember(owner = "client!fe", name = "ib", descriptor = "Z")
	private boolean aBoolean196;

	@OriginalMember(owner = "client!fe", name = "jb", descriptor = "F")
	private float aFloat23;

	@OriginalMember(owner = "client!fe", name = "kb", descriptor = "Lclient!ad;")
	private final Class5 aClass5_22;

	@OriginalMember(owner = "client!fe", name = "lb", descriptor = "F")
	private float lb;

	@OriginalMember(owner = "client!fe", name = "mb", descriptor = "I")
	private int anInt2486;

	@OriginalMember(owner = "client!fe", name = "nb", descriptor = "I")
	private int anInt2487;

	@OriginalMember(owner = "client!fe", name = "ob", descriptor = "Lclient!f;")
	private Class22 aClass22_6;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;)V")
	public Class75_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2) {
		this(arg0, arg2);
		this.method2621(arg1);
		this.method2638(arg1);
	}

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILclient!m;)V")
	private Class75_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg0, arg1);
		this.aBoolean192 = false;
		this.aBoolean193 = false;
		this.aClass127_12 = new Class127(4);
		this.anInt2458 = 0;
		this.anInt2472 = 50;
		this.anInt2463 = 3500;
		this.anInt2467 = 0;
		this.anInt2459 = 512;
		this.anInt2456 = 78642;
		this.anInt2469 = 3500;
		this.anInt2481 = 0;
		this.anInt2468 = 0;
		this.anInt2476 = 512;
		this.anInt2461 = 0;
		this.anInt2465 = 0;
		this.anInt2478 = 45823;
		this.anInt2471 = 75518;
		this.anInt2479 = 0;
		this.anInt2464 = this.anInt2469 - 255;
		this.anInt2483 = 0;
		this.anInt2475 = 0;
		this.aBoolean194 = false;
		this.aBoolean196 = false;
		this.anInt2486 = 0;
		this.aClass5_22 = new Class5(16);
		this.anInt2487 = -1;
		this.aClass5_21 = new Class5(20);
		this.aClass106_Sub1_2 = new Class106_Sub1();
		this.method2634(1);
		this.method2606(0);
		Static58.method1177(false);
		this.aBoolean192 = true;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface7_6.method2131(arg5).aBoolean143) {
			this.O(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt2487 != arg5) {
			@Pc(26) Class22 local26 = (Class22) this.aClass5_22.method104((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method2038(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method2042(arg5) ? 64 : 128;
				local26 = this.method2640(local32, local43, local43, local43);
				this.aClass5_22.method114((long) arg5, local26);
			}
			this.anInt2487 = arg5;
			this.aClass22_6 = local26;
		}
		this.aClass22_6.M(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class64 method2631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class64_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "()Z")
	@Override
	public boolean method2626() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method2576(@OriginalArg(0) Class3_Sub27 arg0) {
	}

	@OriginalMember(owner = "client!fe", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		this.anInt2471 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.NA(0, 0, this.anInt2482, this.anInt2470, arg0, 0);
	}

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "(I)[I")
	public int[] method2035(@OriginalArg(0) int arg0) {
		@Pc(2) Class5 local2 = this.aClass5_21;
		@Pc(12) Class3_Sub14 local12;
		synchronized (this.aClass5_21) {
			local12 = (Class3_Sub14) this.aClass5_21.method104((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_6.method2132(arg0)) {
					return null;
				}
				@Pc(32) Class62 local32 = super.anInterface7_6.method2131(arg0);
				@Pc(42) int local42 = local32.aBoolean142 || this.aBoolean196 ? 64 : 128;
				local12 = new Class3_Sub14(arg0, local42, super.anInterface7_6.method2129(0.7F, local42, local42, true, arg0), local32.aBoolean144);
				this.aClass5_21.method114((long) arg0, local12);
			}
		}
		local12.aBoolean160 = true;
		return local12.method1550();
	}

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "()V")
	@Override
	protected void method2620() {
		if (this.aBoolean192) {
			Static153.method2715(false);
			this.aBoolean192 = false;
		}
		this.aClass3_Sub16_1 = null;
		this.aCanvas2 = null;
		this.aClass127_12 = null;
		this.aBoolean193 = true;
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "()Lclient!ia;")
	@Override
	public Class106 method2587() {
		@Pc(3) Class45 local3 = this.method2045(Thread.currentThread());
		return local3.aClass106_Sub1_1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	@Override
	public void method2567(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2455;
		for (@Pc(9) Object local9 = this.aClass5_21.method117(); local9 != null; local9 = this.aClass5_21.method108()) {
			@Pc(13) Class3_Sub14 local13 = (Class3_Sub14) local9;
			if (local13.aBoolean160) {
				local13.anInt1918 += local4;
				@Pc(27) int local27 = local13.anInt1918 / 20;
				if (local27 > 0) {
					@Pc(36) Class62 local36 = super.anInterface7_6.method2131(local13.anInt1917);
					local13.method1552(local36.aByte22 * local4 * 50 / 1000, local36.aByte26 * local4 * 50 / 1000);
					local13.anInt1918 -= local27 * 20;
				}
				local13.aBoolean160 = false;
			}
		}
		this.anInt2455 = arg0;
		this.aClass5_22.method106(5);
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V")
	@Override
	public void method2606(@OriginalArg(0) int arg0) {
		this.aClass45Array1[arg0].method1285(Thread.currentThread());
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIF)Lclient!ve;")
	@Override
	public Class3_Sub23 method2604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2461 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt2461 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt2461 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt2461 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt2461 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean195 = false;
		} else {
			this.aBoolean195 = true;
		}
	}

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt2479) {
			local8 = this.anInt2479;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt2475) {
			local21 = this.anInt2475;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg3 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (arg4 == 0 || arg4 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt2483) {
					local91 = this.anInt2483;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2467) {
					local102 = this.anInt2467;
				}
				local116 = local91 + local30 * this.anInt2482;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray208[local116++] = arg3;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt2483) {
					local91 = this.anInt2483;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2467 - 1) {
					local102 = this.anInt2467 - 1;
				}
				local116 = local91 + local30 * this.anInt2482;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray208[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(334) int local334;
		@Pc(340) int local340;
		if (arg4 == 1) {
			@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local91 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local102 = arg0 + 1 - local36;
				if (local102 < this.anInt2483) {
					local102 = this.anInt2483;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt2467) {
					local116 = this.anInt2467;
				}
				local118 = local102 + local30 * this.anInt2482;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray208[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray208[local118++] = local277 + local340;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local102 = arg0 - local36;
				if (local102 < this.anInt2483) {
					local102 = this.anInt2483;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt2467 - 1) {
					local116 = this.anInt2467 - 1;
				}
				local118 = local102 + local30 * this.anInt2482;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray208[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray208[local118++] = local277 + local340;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg4 == 2) {
			@Pc(593) int local593;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt2483) {
					local91 = this.anInt2483;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2467) {
					local102 = this.anInt2467;
				}
				local116 = local91 + local30 * this.anInt2482;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray208[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray208[local116++] = local340 - local603 | local603 - (local603 >>> 8);
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt2483) {
					local91 = this.anInt2483;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2467 - 1) {
					local102 = this.anInt2467 - 1;
				}
				local116 = local91 + local30 * this.anInt2482;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray208[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray208[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class45 local3 = this.method2045(Thread.currentThread());
		@Pc(6) Class113 local6 = local3.aClass113_1;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(21) int local21 = local10 >= 0 ? local10 : -local10;
		@Pc(28) int local28 = local14 >= 0 ? local14 : -local14;
		@Pc(30) int local30 = local21;
		if (local21 < local28) {
			local30 = local28;
		}
		if (local30 == 0) {
			return;
		}
		@Pc(44) int local44 = (local10 << 16) / local30;
		@Pc(50) int local50 = (local14 << 16) / local30;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(66) int local66 = arg5 * local50 >> 17;
		@Pc(74) int local74 = arg5 * local50 + 1 >> 17;
		@Pc(80) int local80 = arg5 * local44 >> 17;
		@Pc(88) int local88 = arg5 * local44 + 1 >> 17;
		@Pc(93) int local93 = arg0 - local6.method3023();
		@Pc(98) int local98 = arg1 - local6.method3012();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt3632 = 0;
		local6.aBoolean281 = local102 < 0 || local102 > local6.anInt3633 || local106 < 0 || local106 > local6.anInt3633 || local112 < 0 || local112 > local6.anInt3633;
		local6.method3015(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean281 = local102 < 0 || local102 > local6.anInt3633 || local106 < 0 || local106 > local6.anInt3633 || local118 < 0 || local118 > local6.anInt3633;
		local6.method3015(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!fe", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass106_Sub1_2.anInt6461 * arg0 + this.aClass106_Sub1_2.anInt6458 * arg1 + this.aClass106_Sub1_2.anInt6463 * arg2 >> 15) + this.aClass106_Sub1_2.anInt6455;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass106_Sub1_2.anInt6461 * arg3 + this.aClass106_Sub1_2.anInt6458 * arg4 + this.aClass106_Sub1_2.anInt6463 * arg5 >> 15) + this.aClass106_Sub1_2.anInt6455;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt2472 && local52 < this.anInt2472 || !(local23 <= this.anInt2469 || local52 <= this.anInt2469)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt2476 * ((this.aClass106_Sub1_2.anInt6453 * arg0 + this.aClass106_Sub1_2.anInt6462 * arg1 + this.aClass106_Sub1_2.anInt6456 * arg2 >> 15) + this.aClass106_Sub1_2.anInt6459) / local23;
		@Pc(133) int local133 = this.anInt2476 * ((this.aClass106_Sub1_2.anInt6453 * arg3 + this.aClass106_Sub1_2.anInt6462 * arg4 + this.aClass106_Sub1_2.anInt6456 * arg5 >> 15) + this.aClass106_Sub1_2.anInt6459) / local52;
		if (local104 < this.anInt2484 && local133 < this.anInt2484 || local104 > this.anInt2462 && local133 > this.anInt2462) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt2459 * ((this.aClass106_Sub1_2.anInt6457 * arg0 + this.aClass106_Sub1_2.anInt6454 * arg1 + this.aClass106_Sub1_2.anInt6460 * arg2 >> 15) + this.aClass106_Sub1_2.anInt6452) / local23;
			@Pc(209) int local209 = this.anInt2459 * ((this.aClass106_Sub1_2.anInt6457 * arg3 + this.aClass106_Sub1_2.anInt6454 * arg4 + this.aClass106_Sub1_2.anInt6460 * arg5 >> 15) + this.aClass106_Sub1_2.anInt6452) / local52;
			return (local180 >= this.anInt2473 || local209 >= this.anInt2473) && (local180 <= this.anInt2485 || local209 <= this.anInt2485);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()Z")
	@Override
	public boolean method2578() {
		return true;
	}

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "()Z")
	public boolean method2036() {
		return this.aBoolean193;
	}

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "()Z")
	@Override
	public boolean method2641() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "()Z")
	@Override
	public boolean method2613() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt2482) {
			arg2 = this.anInt2482;
		}
		if (arg3 > this.anInt2470) {
			arg3 = this.anInt2470;
		}
		this.anInt2483 = arg0;
		this.anInt2467 = arg2;
		this.anInt2479 = arg1;
		this.anInt2475 = arg3;
		this.method2039();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	@Override
	public void method2572(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2621(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class3_Sub16 local8 = (Class3_Sub16) this.aClass127_12.method3246((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static303.method4479(arg0);
			this.aClass127_12.method3257((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt2472;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method2603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class32 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class32_Sub1 local2 = (Class32_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray72;
		@Pc(8) int[] local8 = local2.anIntArray73;
		@Pc(17) int local17 = this.anInt2479 > arg7 ? this.anInt2479 : arg7;
		@Pc(32) int local32 = this.anInt2475 < arg7 + local5.length ? this.anInt2475 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(83) int local83;
		@Pc(116) int local116;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(145) int local145;
		@Pc(226) int local226;
		@Pc(243) int local243;
		@Pc(248) int local248;
		@Pc(201) int local201;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(390) int local390 = arg2 << 16;
			local83 = (int) Math.floor((double) local390 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local17) {
				arg0 += local83 * (local17 - arg1);
				arg1 = local17;
			}
			if (arg3 >= local32) {
				arg3 = local32 - 1;
			}
			local116 = arg4 >>> 24;
			if (local116 == 255) {
				while (arg1 <= arg3) {
					local129 = arg0 >> 16;
					local133 = arg1 - arg7;
					local145 = arg6 + local5[local133];
					if (local129 >= this.anInt2483 && local129 < this.anInt2467 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray208[local129 + arg1 * this.anInt2482] = arg4;
					}
					arg0 += local83;
					arg1++;
				}
			} else {
				local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
				local129 = 256 - local116;
				while (arg1 <= arg3) {
					local133 = arg0 >> 16;
					local145 = arg1 - arg7;
					local226 = arg6 + local5[local145];
					if (local133 >= this.anInt2483 && local133 < this.anInt2467 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt2482;
						local248 = this.anIntArray208[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray208[local133 + arg1 * this.anInt2482] = local201 + local584;
					}
					arg0 += local83;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(73) int local73 = arg3 << 16;
		local83 = (int) Math.floor((double) local73 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt2483) {
			arg1 += local83 * (this.anInt2483 - arg0);
			arg0 = this.anInt2483;
		}
		if (arg2 >= this.anInt2467) {
			arg2 = this.anInt2467 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray208[arg0 + local129 * this.anInt2482] = arg4;
					}
				}
				arg1 += local83;
				arg0++;
			}
			return;
		}
		local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
		local129 = 256 - local116;
		while (arg0 <= arg2) {
			local133 = arg1 >> 16;
			local145 = local133 - arg7;
			if (local133 >= local17 && local133 < local32) {
				local226 = arg6 + local5[local145];
				if (arg0 >= local226 && arg0 < local226 + local8[local145]) {
					local243 = arg0 + local133 * this.anInt2482;
					local248 = this.anIntArray208[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray208[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "()V")
	@Override
	public void method2633() {
	}

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(2) int local2 = this.anInt2468;
		this.anInt2468 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "()Z")
	@Override
	public boolean method2615() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "(I)Z")
	public boolean method2037(@OriginalArg(0) int arg0) {
		return super.anInterface7_6.method2132(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)I")
	@Override
	public int method2610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[Lclient!ve;)V")
	@Override
	public void method2628(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub23[] arg1) {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2591(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class3_Sub16 local8 = (Class3_Sub16) this.aClass127_12.method3246((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method5987();
		local8 = Static303.method4479(arg0);
		this.aClass127_12.method3257((long) arg0.hashCode(), local8);
		if (this.aCanvas2 != arg0 || this.aClass22_5 != null) {
			return;
		}
		this.aClass3_Sub16_1 = local8;
		this.anIntArray208 = local8.anIntArray562;
		this.anInt2482 = local8.anInt7443;
		this.anInt2470 = local8.anInt7442;
		this.method2041();
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V")
	@Override
	public void method2630(@OriginalArg(0) int arg0) {
		this.aClass45Array1[arg0].method1285(null);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!vh;)V")
	@Override
	public void method2599(@OriginalArg(0) Class7 arg0) {
	}

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "()Z")
	@Override
	public boolean method2623() {
		return true;
	}

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat23;
	}

	@OriginalMember(owner = "client!fe", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class22 method2627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt2482 + arg0;
		@Pc(16) int local16 = this.anInt2482 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray208[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class22_Sub2_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class22_Sub2_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fe", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2481 = arg0;
		this.anInt2461 = arg1;
		this.anInt2458 = arg2;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class32 method2622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class32_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "()V")
	@Override
	public void method2594() {
		if (this.aCanvas2 == null || this.aClass3_Sub16_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas2.getGraphics();
			this.aClass3_Sub16_1.method5825(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "()V")
	@Override
	public void method2583() {
	}

	@OriginalMember(owner = "client!fe", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2480 = arg0;
		this.anInt2460 = arg1;
		this.anInt2476 = arg2;
		this.anInt2459 = arg3;
		this.method2039();
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
	@Override
	public void method2586(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)I")
	@Override
	public int method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "()Z")
	@Override
	public boolean method2624() {
		return true;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!c;Lclient!iv;Lclient!ia;Lclient!aq;I)V")
	@Override
	public void method2571(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class13_Sub1 arg3) {
		((Class31_Sub2) arg0).method5720(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt2479 || arg1 >= this.anInt2475) {
			return;
		}
		if (arg0 < this.anInt2483) {
			arg2 -= this.anInt2483 - arg0;
			arg0 = this.anInt2483;
		}
		if (arg0 + arg2 > this.anInt2467) {
			arg2 = this.anInt2467 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2482;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray208[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray208[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray208[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray208[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray208[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fe", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt2483) {
			arg2 -= this.anInt2483 - arg0;
			arg0 = this.anInt2483;
		}
		if (arg1 < this.anInt2479) {
			arg3 -= this.anInt2479 - arg1;
			arg1 = this.anInt2479;
		}
		if (arg0 + arg2 > this.anInt2467) {
			arg2 = this.anInt2467 - arg0;
		}
		if (arg1 + arg3 > this.anInt2475) {
			arg3 = this.anInt2475 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt2467 || arg1 > this.anInt2475) {
			return;
		}
		@Pc(67) int local67 = this.anInt2482 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt2482;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(221) int local221;
			if (arg5 == 1) {
				@Pc(205) int local205 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local78 >> 8 & 0xFF00) + (local78 << 24);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local221 = this.anIntArray208[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray208[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray208[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray208[local74++] = local221 - local298 | local298 - (local298 >>> 8);
					}
					local74 += local67;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local90 = arg2 >> 3;
		local94 = arg2 & 0x7;
		arg2 = local74 - 1;
		for (local101 = -arg3; local101 < 0; local101++) {
			if (local90 > 0) {
				arg0 = local90;
				do {
					arg2++;
					this.anIntArray208[arg2] = arg4;
					arg2++;
					this.anIntArray208[arg2] = arg4;
					arg2++;
					this.anIntArray208[arg2] = arg4;
					arg2++;
					this.anIntArray208[arg2] = arg4;
					arg2++;
					this.anIntArray208[arg2] = arg4;
					arg2++;
					this.anIntArray208[arg2] = arg4;
					arg2++;
					this.anIntArray208[arg2] = arg4;
					arg2++;
					this.anIntArray208[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray208[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ov;[Lclient!ne;Z)Lclient!oa;")
	@Override
	public Class65 method2601(@OriginalArg(0) Class179 arg0, @OriginalArg(1) Class166[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4973;
			local7[local11] = arg1[local11].anInt4969;
			if (arg1[local11].aByteArray56 != null) {
			}
		}
		return new Class65_Sub1(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "()Z")
	@Override
	public boolean method2585() {
		return true;
	}

	@OriginalMember(owner = "client!fe", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.lb;
	}

	@OriginalMember(owner = "client!fe", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2472 = arg0;
		this.anInt2469 = arg1;
		this.anInt2464 = this.anInt2469 - 255;
		this.method2046();
	}

	@OriginalMember(owner = "client!fe", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt2482 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray208[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "()Z")
	@Override
	public boolean method2617() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "()I")
	@Override
	public int method2584() {
		return 0;
	}

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "(I)[I")
	private int[] method2038(@OriginalArg(0) int arg0) {
		@Pc(2) Class5 local2 = this.aClass5_21;
		@Pc(12) Class3_Sub14 local12;
		synchronized (this.aClass5_21) {
			local12 = (Class3_Sub14) this.aClass5_21.method104((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_6.method2132(arg0)) {
					return null;
				}
				@Pc(32) Class62 local32 = super.anInterface7_6.method2131(arg0);
				@Pc(42) int local42 = local32.aBoolean142 || this.aBoolean196 ? 64 : 128;
				local12 = new Class3_Sub14(arg0, local42, super.anInterface7_6.method2128(local42, 0.7F, arg0, local42), local32.aBoolean144);
				this.aClass5_21.method114((long) arg0, local12);
			}
		}
		local12.aBoolean160 = true;
		return local12.method1550();
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.U(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.U(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(104) int local104;
			@Pc(137) int local137;
			@Pc(150) int local150;
			@Pc(213) int local213;
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt2483) {
					arg1 += local104 * (this.anInt2483 - arg0);
					arg0 = this.anInt2483;
				}
				if (arg2 >= this.anInt2467) {
					arg2 = this.anInt2467 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt2479 && local150 < this.anInt2475) {
							this.anIntArray208[arg0 + local150 * this.anInt2482] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt2479 && local213 < this.anInt2475) {
							local228 = arg0 + local213 * this.anInt2482;
							local233 = this.anIntArray208[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray208[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(357) int local357 = arg2 << 16;
				local104 = (int) Math.floor((double) local357 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt2479) {
					arg0 += local104 * (this.anInt2479 - arg1);
					arg1 = this.anInt2479;
				}
				if (arg3 >= this.anInt2475) {
					arg3 = this.anInt2475 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt2483 && local150 < this.anInt2467) {
							this.anIntArray208[local150 + arg1 * this.anInt2482] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt2483 && local213 < this.anInt2467) {
							local228 = local213 + arg1 * this.anInt2482;
							local233 = this.anIntArray208[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray208[local213 + arg1 * this.anInt2482] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.da(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.da(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2483;
		arg0[1] = this.anInt2479;
		arg0[2] = this.anInt2467;
		arg0[3] = this.anInt2475;
	}

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "()V")
	private void method2039() {
		this.anInt2484 = this.anInt2483 - this.anInt2480;
		this.anInt2462 = this.anInt2467 - this.anInt2480;
		this.anInt2473 = this.anInt2479 - this.anInt2460;
		this.anInt2485 = this.anInt2475 - this.anInt2460;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2474; local29++) {
			@Pc(36) Class113 local36 = this.aClass45Array1[local29].aClass113_1;
			local36.anInt3629 = this.anInt2480 - this.anInt2483;
			local36.anInt3630 = this.anInt2460 - this.anInt2479;
			local36.anInt3633 = this.anInt2467 - this.anInt2483;
			local36.anInt3631 = this.anInt2475 - this.anInt2479;
		}
		@Pc(78) int local78 = this.anInt2479 * this.anInt2482 + this.anInt2483;
		for (@Pc(81) int local81 = this.anInt2479; local81 < this.anInt2475; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt2474; local84++) {
				this.aClass45Array1[local84].aClass113_1.anIntArray280[local81 - this.anInt2479] = local78;
			}
			local78 += this.anInt2482;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2566(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas2 == null || this.aClass3_Sub16_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas2.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt2482 && local21.y <= this.anInt2470 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass3_Sub16_1.method5830(local14, local21.x, local21.height, local21.y, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "(I)Z")
	public boolean method2040(@OriginalArg(0) int arg0) {
		return super.anInterface7_6.method2131(arg0).aBoolean148;
	}

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "()V")
	private void method2041() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2474; local1++) {
			this.aClass45Array1[local1].method1288();
		}
		this.va();
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2607(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			this.method2638(null);
		}
		@Pc(15) Class3_Sub16 local15 = (Class3_Sub16) this.aClass127_12.method3246((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5987();
		}
	}

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class106 arg0) {
		this.aClass106_Sub1_2 = (Class106_Sub1) arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	@Override
	public void method2570() {
	}

	@OriginalMember(owner = "client!fe", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(2) int local2 = this.anInt2486;
		this.anInt2486 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fe", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2483 < arg0) {
			this.anInt2483 = arg0;
		}
		if (this.anInt2479 < arg1) {
			this.anInt2479 = arg1;
		}
		if (this.anInt2467 > arg2) {
			this.anInt2467 = arg2;
		}
		if (this.anInt2475 > arg3) {
			this.anInt2475 = arg3;
		}
		this.method2039();
	}

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "()Z")
	@Override
	public boolean method2593() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2580() {
		@Pc(3) Class45 local3 = this.method2045(Thread.currentThread());
		@Pc(6) Class113 local6 = local3.aClass113_1;
		local6.aBoolean280 = false;
		local6.aBoolean280 = false;
		local6.anInt3632 = 0;
		local6.aBoolean281 = true;
		local6.method3024(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean280 = true;
	}

	@OriginalMember(owner = "client!fe", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.anInt2469;
	}

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "(I)Z")
	public boolean method2042(@OriginalArg(0) int arg0) {
		return this.aBoolean196 || super.anInterface7_6.method2131(arg0).aBoolean142;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!o;III)V")
	public void method2043(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt6867;
		@Pc(6) int local6 = arg3 >> 1;
		if (local2 == -1) {
			this.O(arg1, arg2, local6, arg0.anInt6870, 1);
			return;
		}
		if (this.anInt2487 != local2) {
			@Pc(30) Class22 local30 = (Class22) this.aClass5_22.method104((long) local2);
			if (local30 == null) {
				@Pc(36) int[] local36 = this.method2038(local2);
				if (local36 == null) {
					return;
				}
				@Pc(46) int local46 = this.method2042(local2) ? 64 : 128;
				local30 = this.method2640(local36, local46, local46, local46);
				this.aClass5_22.method114((long) local2, local30);
			}
			this.anInt2487 = local2;
			this.aClass22_6 = local30;
		}
		if (this.aClass22_6.ja() == 64) {
			arg3 <<= 0x1;
			local6 <<= 0x1;
		}
		this.aClass22_6.M(arg1 - local6, arg2 - local6, arg3, arg3, 0, arg0.anInt6870, 1);
	}

	@OriginalMember(owner = "client!fe", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt2483 = 0;
		this.anInt2479 = 0;
		this.anInt2467 = this.anInt2482;
		this.anInt2475 = this.anInt2470;
		this.method2039();
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(Z)V")
	@Override
	public void method2592(@OriginalArg(0) boolean arg0) {
		this.aBoolean196 = arg0;
		this.aClass5_21.method116();
	}

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "()Z")
	@Override
	public boolean method2635() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return 0;
	}

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "()V")
	@Override
	public void method2619() {
		this.aClass5_21.method116();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ne;Z)Lclient!f;")
	@Override
	public Class22 method2590(@OriginalArg(0) Class166 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray385;
		@Pc(5) byte[] local5 = arg0.aByteArray57;
		@Pc(8) int local8 = arg0.anInt4973;
		@Pc(11) int local11 = arg0.anInt4969;
		@Pc(76) Class22_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray56 == null) {
			local20 = new int[local2.length];
			local25 = new byte[local8 * local11];
			for (local27 = 0; local27 < local11; local27++) {
				local32 = local27 * local8;
				for (local34 = 0; local34 < local8; local34++) {
					local25[local32 + local34] = local5[local32 + local34];
				}
			}
			for (local32 = 0; local32 < local2.length; local32++) {
				local20[local32] = local2[local32];
			}
			local76 = new Class22_Sub2_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray56;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class22_Sub2_Sub2(this, local20, local8, local11);
				local76 = new Class22_Sub2_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class22_Sub2_Sub2(this, local20, local8, local11);
			}
		}
		local76.ka(arg0.anInt4971, arg0.anInt4970, arg0.anInt4974, arg0.anInt4972);
		return local76;
	}

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.anInt2461 = this.anInt2465;
		this.aBoolean194 = false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!uu;IIII)Lclient!c;")
	@Override
	public Class31 method2616(@OriginalArg(0) Class242 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class31_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2595(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!fe", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt2482;
		@Pc(35) int local35 = this.anInt2482 - arg2;
		if (arg1 + arg3 > this.anInt2475) {
			arg3 -= arg1 + arg3 - this.anInt2475;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt2479) {
			local59 = this.anInt2479 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt2482;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt2467) {
			local59 = arg0 + arg2 - this.anInt2467;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt2483) {
			local59 = this.anInt2483 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 += local14 * local59;
			local35 += local59;
		}
		local59 = arg4 >>> 24;
		@Pc(132) int local132 = arg5 >>> 24;
		@Pc(145) int local145;
		@Pc(148) int local148;
		@Pc(155) int local155;
		@Pc(158) int local158;
		if (arg8 == 0 || arg8 == 1 && local59 == 255 && local132 == 255) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					if (arg6[(local6 >> 16) + local155] == 0) {
						this.anIntArray208[local30++] = arg4;
					} else {
						this.anIntArray208[local30++] = arg5;
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(236) int local236;
		@Pc(240) int local240;
		@Pc(245) int local245;
		if (arg8 == 1) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					local236 = local222 >>> 24;
					local240 = 255 - local236;
					local245 = this.anIntArray208[local30];
					this.anIntArray208[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else if (arg8 == 2) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					if (local222 == 0) {
						local30++;
					} else {
						local236 = this.anIntArray208[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray208[local30++] = local240 - local360 | local360 - (local360 >>> 8);
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	@Override
	public void method2569(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "()Lclient!ia;")
	@Override
	public Class106 method2636() {
		return new Class106_Sub1();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)Lclient!vh;")
	@Override
	public Class7 method2597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class22 method2640(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class22_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class22_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class22_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class22_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.lb = arg0;
		this.aFloat23 = arg1;
		this.method2046();
	}

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "()Z")
	@Override
	public boolean method2609() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass106_Sub1_2.anInt6455 + (this.aClass106_Sub1_2.anInt6461 * arg0 + this.aClass106_Sub1_2.anInt6458 * arg1 + this.aClass106_Sub1_2.anInt6463 * arg2 >> 15);
		if (local23 < this.anInt2472 || local23 > this.anInt2469) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt2476 * (this.aClass106_Sub1_2.anInt6459 + (this.aClass106_Sub1_2.anInt6453 * arg0 + this.aClass106_Sub1_2.anInt6462 * arg1 + this.aClass106_Sub1_2.anInt6456 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt2459 * (this.aClass106_Sub1_2.anInt6452 + (this.aClass106_Sub1_2.anInt6457 * arg0 + this.aClass106_Sub1_2.anInt6454 * arg1 + this.aClass106_Sub1_2.anInt6460 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt2484 && local73 <= this.anInt2462 && local102 >= this.anInt2473 && local102 <= this.anInt2485) {
			arg3[0] = local73 - this.anInt2484;
			arg3[1] = local102 - this.anInt2473;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!iv;)V")
	@Override
	public void method2581(@OriginalArg(0) Class116 arg0) {
		@Pc(3) Class13_Sub3 local3 = arg0.aClass236_1.aClass13_Sub3_7;
		for (@Pc(6) Class13_Sub3 local6 = local3.aClass13_Sub3_5; local6 != local3; local6 = local6.aClass13_Sub3_5) {
			@Pc(10) Class13_Sub3_Sub1 local10 = (Class13_Sub3_Sub1) local6;
			@Pc(15) int local15 = local10.anInt6869 >> 12;
			@Pc(20) int local20 = local10.anInt6863 >> 12;
			@Pc(25) int local25 = local10.anInt6868 >> 12;
			@Pc(49) int local49 = this.aClass106_Sub1_2.anInt6455 + (this.aClass106_Sub1_2.anInt6461 * local15 + this.aClass106_Sub1_2.anInt6458 * local20 + this.aClass106_Sub1_2.anInt6463 * local25 >> 15);
			if (local49 >= this.anInt2472 && local49 <= this.anInt2464) {
				@Pc(90) int local90 = this.anInt2480 + this.anInt2476 * (this.aClass106_Sub1_2.anInt6459 + (this.aClass106_Sub1_2.anInt6453 * local15 + this.aClass106_Sub1_2.anInt6462 * local20 + this.aClass106_Sub1_2.anInt6456 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt2460 + this.anInt2459 * (this.aClass106_Sub1_2.anInt6452 + (this.aClass106_Sub1_2.anInt6457 * local15 + this.aClass106_Sub1_2.anInt6454 * local20 + this.aClass106_Sub1_2.anInt6460 * local25 >> 15)) / local49;
				if (local90 >= this.anInt2483 && local90 <= this.anInt2467 && local122 >= this.anInt2479 && local122 <= this.anInt2475) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method2043(local10, local90, local122, (local10.anInt6864 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lclient!c;Lclient!iv;Lclient!ia;[Lclient!aq;I)V")
	@Override
	public void method2602(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class13_Sub1[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class31_Sub2[] local3 = new Class31_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class31_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class31_Sub2 local26 = Static432.method5738(this, local3);
		local26.method5720(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!fe", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2465 = this.anInt2461;
		this.anInt2481 = arg0;
		this.anInt2461 = arg1;
		this.anInt2458 = arg2;
		this.aBoolean194 = true;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!aq;I)V")
	@Override
	public void method2605(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) Class13_Sub1[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class31_Sub2[] local3 = new Class31_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class31_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class31_Sub2 local26 = Static432.method5738(this, local3);
		local26.method5720(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!fe", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt2478 = (int) (arg1 * 65535.0F);
		this.anInt2456 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt2477 = (int) (arg3 * 65535.0F / local26);
		this.anInt2457 = (int) (arg4 * 65535.0F / local26);
		this.anInt2466 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "()Z")
	@Override
	public boolean method2612() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()V")
	@Override
	public void method2579() {
	}

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "(I)V")
	@Override
	public void method2634(@OriginalArg(0) int arg0) {
		if (this.anInt2474 == arg0) {
			return;
		}
		this.anInt2474 = arg0;
		this.aClass45Array1 = new Class45[this.anInt2474];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2474; local14++) {
			this.aClass45Array1[local14] = new Class45(this);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!vh;Lclient!vh;FLclient!vh;)Lclient!vh;")
	@Override
	public Class7 method2598(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class7 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "(I)I")
	public int method2044(@OriginalArg(0) int arg0) {
		return super.anInterface7_6.method2131(arg0).aShort52 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "()Z")
	@Override
	public boolean method2642() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method2637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "()Z")
	@Override
	public boolean method2589() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)Lclient!l;")
	@Override
	public Class3_Sub27 method2588() {
		return null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!db;")
	public Class45 method2045(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2474; local1++) {
			if (this.aClass45Array1[local1].aRunnable1 == arg0) {
				return this.aClass45Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fe", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt2483 || arg0 >= this.anInt2467) {
			return;
		}
		if (arg1 < this.anInt2479) {
			arg2 -= this.anInt2479 - arg1;
			arg1 = this.anInt2479;
		}
		if (arg1 + arg2 > this.anInt2475) {
			arg2 = this.anInt2475 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2482;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray208[local40 + local54 * this.anInt2482] = arg3;
			}
			return;
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local103 = 0; local103 < arg2; local103++) {
				local111 = local40 + local103 * this.anInt2482;
				local116 = this.anIntArray208[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray208[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt2482;
				local111 = this.anIntArray208[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray208[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "()V")
	private void method2046() {
		if (this.aFloat23 == 0.0F) {
			this.anInt2463 = this.anInt2469;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt2469;
		@Pc(12) float local12 = (float) this.anInt2472;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.lb / (this.aFloat23 + this.lb);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat23;
		this.anInt2463 = (int) (((float) this.anInt2469 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2638(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas2 = null;
			this.aClass3_Sub16_1 = null;
			if (this.aClass22_5 == null) {
				this.anIntArray208 = null;
				this.anInt2482 = this.anInt2470 = 1;
				this.method2041();
			}
			return;
		}
		@Pc(10) Class3_Sub16 local10 = (Class3_Sub16) this.aClass127_12.method3246((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas2 = arg0;
		this.aClass3_Sub16_1 = local10;
		if (this.aClass22_5 != null) {
			return;
		}
		this.anIntArray208 = local10.anIntArray562;
		this.anInt2482 = local10.anInt7443;
		this.anInt2470 = local10.anInt7442;
		this.method2041();
		return;
	}

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class32_Sub1 local2 = (Class32_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray72;
		@Pc(8) int[] local8 = local2.anIntArray73;
		@Pc(20) int local20;
		if (this.anInt2475 < arg3 + local5.length) {
			local20 = this.anInt2475 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt2479 > arg3) {
			local33 = this.anInt2479 - arg3;
			arg3 = this.anInt2479;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt2482;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt2483 > local58) {
				local62 -= this.anInt2483 - local58;
				local58 = this.anInt2483;
			}
			if (this.anInt2467 < local58 + local62) {
				local62 = this.anInt2467 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray208[local58++] = arg0;
			}
			local49 += this.anInt2482;
		}
	}
}
