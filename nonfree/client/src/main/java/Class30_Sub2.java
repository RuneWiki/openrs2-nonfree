import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "Lclient!an;")
	private Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
	private int anInt2284;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "Z")
	private boolean aBoolean156;

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "Lclient!hl;")
	private Class96 aClass96_11;

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
	public int anInt2285;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "Lclient!ff;")
	public Class72_Sub1 aClass72_Sub1_2;

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
	public int anInt2286;

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
	public int anInt2287;

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "Z")
	private boolean aBoolean157;

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
	public int anInt2288;

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "Z")
	public boolean aBoolean158;

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "F")
	private float aFloat42;

	@OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
	public int anInt2289;

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
	public int anInt2290;

	@OriginalMember(owner = "client!fg", name = "J", descriptor = "F")
	private float aFloat43;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "[Lclient!of;")
	private Class182[] aClass182Array1;

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
	public int anInt2291;

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
	public int anInt2292;

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
	public int anInt2293;

	@OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
	private int anInt2294;

	@OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
	public int anInt2295;

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
	public int anInt2296;

	@OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
	public int anInt2297;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
	public int anInt2298;

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "Lclient!aa;")
	private Class2 aClass2_9;

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
	public int anInt2299;

	@OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
	public int anInt2300;

	@OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
	private int anInt2301;

	@OriginalMember(owner = "client!fg", name = "Y", descriptor = "I")
	public int anInt2302;

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
	public int anInt2303;

	@OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
	public int anInt2304;

	@OriginalMember(owner = "client!fg", name = "bb", descriptor = "Lclient!ge;")
	private final Class83 aClass83_17;

	@OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
	public int anInt2305;

	@OriginalMember(owner = "client!fg", name = "db", descriptor = "Z")
	public boolean aBoolean159;

	@OriginalMember(owner = "client!fg", name = "eb", descriptor = "I")
	public int anInt2306;

	@OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
	public int anInt2307;

	@OriginalMember(owner = "client!fg", name = "gb", descriptor = "I")
	public int anInt2308;

	@OriginalMember(owner = "client!fg", name = "hb", descriptor = "[I")
	public int[] anIntArray199;

	@OriginalMember(owner = "client!fg", name = "ib", descriptor = "I")
	public int anInt2309;

	@OriginalMember(owner = "client!fg", name = "jb", descriptor = "I")
	public int anInt2310;

	@OriginalMember(owner = "client!fg", name = "kb", descriptor = "I")
	public int anInt2311;

	@OriginalMember(owner = "client!fg", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!fg", name = "mb", descriptor = "Lclient!ge;")
	private final Class83 aClass83_18;

	@OriginalMember(owner = "client!fg", name = "nb", descriptor = "I")
	public int anInt2312;

	@OriginalMember(owner = "client!fg", name = "ob", descriptor = "I")
	private int anInt2313;

	@OriginalMember(owner = "client!fg", name = "pb", descriptor = "I")
	private int anInt2314;

	@OriginalMember(owner = "client!fg", name = "qb", descriptor = "I")
	private int anInt2315;

	@OriginalMember(owner = "client!fg", name = "rb", descriptor = "Lclient!aa;")
	private Class2 aClass2_10;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;)V")
	public Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2) {
		this(arg0, arg2);
		this.method2047(arg1);
		this.method2073(arg1);
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(ILclient!l;)V")
	private Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg0, arg1);
		this.aBoolean156 = false;
		this.aBoolean155 = false;
		this.aClass96_11 = new Class96(4);
		this.anInt2293 = 0;
		this.anInt2288 = 0;
		this.anInt2295 = 78642;
		this.aBoolean157 = false;
		this.anInt2301 = 0;
		this.anInt2290 = 0;
		this.anInt2308 = 0;
		this.anInt2310 = 0;
		this.anInt2306 = 512;
		this.anInt2304 = 512;
		this.anInt2300 = 50;
		this.anInt2286 = 3500;
		this.anInt2305 = 0;
		this.anInt2314 = 0;
		this.aBoolean159 = false;
		this.lb = 3500;
		this.anInt2292 = 45823;
		this.anInt2313 = 0;
		this.anInt2296 = this.lb - 255;
		this.anInt2303 = 0;
		this.anInt2289 = 75518;
		this.aClass83_17 = new Class83(16);
		this.anInt2315 = -1;
		this.aClass83_18 = new Class83(20);
		this.aClass72_Sub1_2 = new Class72_Sub1();
		this.method2099(1);
		this.method2049(0);
		Static198.method3514(true, false);
		this.aBoolean155 = true;
	}

	@OriginalMember(owner = "client!fg", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		return 0;
	}

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "()V")
	@Override
	public void method2083() {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!gg;[Lclient!ho;Z)Lclient!ba;")
	@Override
	public Class18 method2054(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class98[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3171;
			local7[local11] = arg1[local11].anInt3175;
			if (arg1[local11].aByteArray34 != null) {
			}
		}
		return new Class18_Sub1(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "(I)Z")
	public boolean method2107(@OriginalArg(0) int arg0) {
		return this.aBoolean157 || super.anInterface4_5.method5685(arg0).aBoolean322;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ho;Z)Lclient!aa;")
	@Override
	public Class2 method2031(@OriginalArg(0) Class98 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray260;
		@Pc(5) byte[] local5 = arg0.aByteArray33;
		@Pc(8) int local8 = arg0.anInt3171;
		@Pc(11) int local11 = arg0.anInt3175;
		@Pc(76) Class2_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray34 == null) {
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
			local76 = new Class2_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray34;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class2_Sub1_Sub3(this, local20, local8, local11);
				local76 = new Class2_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class2_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.l(arg0.anInt3173, arg0.anInt3176, arg0.anInt3174, arg0.anInt3172);
		return local76;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!tr;III)V")
	public void method2108(@OriginalArg(0) Class71_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt3402;
		@Pc(4) int local4 = arg3;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.S(arg1, arg2, local4, arg0.anInt3399, 1);
			return;
		}
		if (this.anInt2315 != local2) {
			@Pc(32) Class2 local32 = (Class2) this.aClass83_17.method2338((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method2113(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method2107(local2) ? 64 : 128;
				local32 = this.method2055(local38, local48, local48, local48);
				this.aClass83_17.method2337(local32, (long) local2);
			}
			this.anInt2315 = local2;
			this.aClass2_10 = local32;
		}
		this.aClass2_10.XA(arg1 - local4, arg2 - local4, local8, local8, 0, arg0.anInt3399, 1);
	}

	@OriginalMember(owner = "client!fg", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2293 = arg0;
		this.anInt2290 = arg1;
		this.anInt2288 = arg2;
	}

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "()Z")
	@Override
	public boolean method2090() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[[I[[IIII)Lclient!o;")
	@Override
	public Class14 method2089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class14_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "()V")
	@Override
	public void method2088() {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method2064(@OriginalArg(0) Class72 arg0) {
		this.aClass72_Sub1_2 = (Class72_Sub1) arg0;
	}

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "(I)V")
	@Override
	public void l(@OriginalArg(0) int arg0) {
		this.M(0, 0, this.anInt2299, this.anInt2294, arg0, 0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2032(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub2 local8 = (Class4_Sub2) this.aClass96_11.method2797((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method6330();
		local8 = Static237.method3992(arg0);
		this.aClass96_11.method2805((long) arg0.hashCode(), local8);
		if (this.aCanvas4 != arg0 || this.aClass2_9 != null) {
			return;
		}
		this.aClass4_Sub2_1 = local8;
		this.anIntArray199 = local8.anIntArray458;
		this.anInt2299 = local8.anInt5670;
		this.anInt2294 = local8.anInt5666;
		this.method2111();
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2047(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub2 local8 = (Class4_Sub2) this.aClass96_11.method2797((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static237.method3992(arg0);
			this.aClass96_11.method2805((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)Lclient!kv;")
	@Override
	public Class41 method2057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(I)V")
	@Override
	public void method2062(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2284;
		for (@Pc(9) Object local9 = this.aClass83_18.method2342(); local9 != null; local9 = this.aClass83_18.method2335()) {
			@Pc(13) Class4_Sub40 local13 = (Class4_Sub40) local9;
			if (local13.aBoolean533) {
				local13.anInt7207 += local4;
				@Pc(27) int local27 = local13.anInt7207 / 20;
				if (local27 > 0) {
					@Pc(36) Class160 local36 = super.anInterface4_5.method5685(local13.anInt7209);
					local13.method5753(local36.aByte55 * local4 * 50 / 1000, local36.aByte50 * local4 * 50 / 1000);
					local13.anInt7207 -= local27 * 20;
				}
				local13.aBoolean533 = false;
			}
		}
		this.anInt2284 = arg0;
		this.aClass83_17.method2345(5);
	}

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "([I)V")
	@Override
	public void p(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2308;
		arg0[1] = this.anInt2303;
		arg0[2] = this.anInt2305;
		arg0[3] = this.anInt2310;
	}

	@OriginalMember(owner = "client!fg", name = "IA", descriptor = "(IIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2308 < arg0) {
			this.anInt2308 = arg0;
		}
		if (this.anInt2303 < arg1) {
			this.anInt2303 = arg1;
		}
		if (this.anInt2305 > arg2) {
			this.anInt2305 = arg2;
		}
		if (this.anInt2310 > arg3) {
			this.anInt2310 = arg3;
		}
		this.method2110();
	}

	@OriginalMember(owner = "client!fg", name = "GA", descriptor = "(ILclient!i;II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class74_Sub1 local2 = (Class74_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray205;
		@Pc(8) int[] local8 = local2.anIntArray204;
		@Pc(20) int local20;
		if (this.anInt2310 < arg3 + local5.length) {
			local20 = this.anInt2310 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt2303 > arg3) {
			local33 = this.anInt2303 - arg3;
			arg3 = this.anInt2303;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt2299;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt2308 > local58) {
				local62 -= this.anInt2308 - local58;
				local58 = this.anInt2308;
			}
			if (this.anInt2305 < local58 + local62) {
				local62 = this.anInt2305 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray199[local58++] = arg0;
			}
			local49 += this.anInt2299;
		}
	}

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "()Z")
	@Override
	public boolean method2071() {
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ka;Lclient!wg;Lclient!n;Lclient!wc;I)V")
	@Override
	public void method2041(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class71_Sub7 arg3) {
		((Class57_Sub1) arg0).method1754(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "()I")
	@Override
	public int Z() {
		@Pc(2) int local2 = this.anInt2314;
		this.anInt2314 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "(IIII)V")
	@Override
	public void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt2299) {
			arg2 = this.anInt2299;
		}
		if (arg3 > this.anInt2294) {
			arg3 = this.anInt2294;
		}
		this.anInt2308 = arg0;
		this.anInt2305 = arg2;
		this.anInt2303 = arg1;
		this.anInt2310 = arg3;
		this.method2110();
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "()V")
	@Override
	public void method2042() {
		if (this.aCanvas4 == null || this.aClass4_Sub2_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas4.getGraphics();
			this.aClass4_Sub2_1.method4707(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([Lclient!ka;Lclient!n;[Lclient!wc;I)V")
	@Override
	public void method2050(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class71_Sub7[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class57_Sub1[] local3 = new Class57_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class57_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class57_Sub1 local26 = Static81.method1737(this, local3);
		local26.method1754(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "()Z")
	@Override
	public boolean method2101() {
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "(I)[I")
	public int[] method2109(@OriginalArg(0) int arg0) {
		@Pc(2) Class83 local2 = this.aClass83_18;
		@Pc(12) Class4_Sub40 local12;
		synchronized (this.aClass83_18) {
			local12 = (Class4_Sub40) this.aClass83_18.method2338((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_5.method5684(arg0)) {
					return null;
				}
				@Pc(32) Class160 local32 = super.anInterface4_5.method5685(arg0);
				@Pc(42) int local42 = local32.aBoolean322 || this.aBoolean157 ? 64 : 128;
				local12 = new Class4_Sub40(arg0, local42, super.anInterface4_5.method5686(0.7F, true, local42, local42, arg0), local32.aBoolean326);
				this.aClass83_18.method2337(local12, (long) arg0);
			}
		}
		local12.aBoolean533 = true;
		return local12.method5754();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
	@Override
	public int method2065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "()Lclient!n;")
	@Override
	public Class72 method2092() {
		@Pc(3) Class182 local3 = this.method2116(Thread.currentThread());
		return local3.aClass72_Sub1_3;
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method2097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.d(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.d(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt2308) {
					arg1 += local104 * (this.anInt2308 - arg0);
					arg0 = this.anInt2308;
				}
				if (arg2 >= this.anInt2305) {
					arg2 = this.anInt2305 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt2303 && local150 < this.anInt2310) {
							this.anIntArray199[arg0 + local150 * this.anInt2299] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt2303 && local213 < this.anInt2310) {
							local228 = arg0 + local213 * this.anInt2299;
							local233 = this.anIntArray199[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray199[local228] = local204 + local233;
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
				if (arg1 < this.anInt2303) {
					arg0 += local104 * (this.anInt2303 - arg1);
					arg1 = this.anInt2303;
				}
				if (arg3 >= this.anInt2310) {
					arg3 = this.anInt2310 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt2308 && local150 < this.anInt2305) {
							this.anIntArray199[local150 + arg1 * this.anInt2299] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt2308 && local213 < this.anInt2305) {
							local228 = local213 + arg1 * this.anInt2299;
							local233 = this.anIntArray199[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray199[local213 + arg1 * this.anInt2299] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.BA(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.BA(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "()V")
	private void method2110() {
		this.anInt2291 = this.anInt2308 - this.anInt2297;
		this.anInt2287 = this.anInt2305 - this.anInt2297;
		this.anInt2285 = this.anInt2303 - this.anInt2309;
		this.anInt2312 = this.anInt2310 - this.anInt2309;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2302; local29++) {
			@Pc(36) Class44 local36 = this.aClass182Array1[local29].aClass44_2;
			local36.anInt1398 = this.anInt2297 - this.anInt2308;
			local36.anInt1396 = this.anInt2309 - this.anInt2303;
			local36.anInt1394 = this.anInt2305 - this.anInt2308;
			local36.anInt1397 = this.anInt2310 - this.anInt2303;
		}
		@Pc(78) int local78 = this.anInt2303 * this.anInt2299 + this.anInt2308;
		for (@Pc(81) int local81 = this.anInt2303; local81 < this.anInt2310; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt2302; local84++) {
				this.aClass182Array1[local84].aClass44_2.anIntArray91[local81 - this.anInt2303] = local78;
			}
			local78 += this.anInt2299;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([Lclient!ka;Lclient!wg;Lclient!n;[Lclient!wc;I)V")
	@Override
	public void method2078(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class71_Sub7[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class57_Sub1[] local3 = new Class57_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class57_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class57_Sub1 local26 = Static81.method1737(this, local3);
		local26.method1754(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "()V")
	private void method2111() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2302; local1++) {
			this.aClass182Array1[local1].method4423();
		}
		this.H();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "()Z")
	@Override
	public boolean method2033() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "PA", descriptor = "(FF)V")
	@Override
	public void PA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat43 = arg0;
		this.aFloat42 = arg1;
		this.method2115();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2084(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "(IIIII)V")
	@Override
	protected void S(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt2303) {
			local8 = this.anInt2303;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt2310) {
			local21 = this.anInt2310;
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
				if (local91 < this.anInt2308) {
					local91 = this.anInt2308;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2305) {
					local102 = this.anInt2305;
				}
				local116 = local91 + local30 * this.anInt2299;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray199[local116++] = arg3;
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
				if (local91 < this.anInt2308) {
					local91 = this.anInt2308;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2305 - 1) {
					local102 = this.anInt2305 - 1;
				}
				local116 = local91 + local30 * this.anInt2299;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray199[local116++] = arg3;
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
				if (local102 < this.anInt2308) {
					local102 = this.anInt2308;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt2305) {
					local116 = this.anInt2305;
				}
				local118 = local102 + local30 * this.anInt2299;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray199[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray199[local118++] = local277 + local340;
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
				if (local102 < this.anInt2308) {
					local102 = this.anInt2308;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt2305 - 1) {
					local116 = this.anInt2305 - 1;
				}
				local118 = local102 + local30 * this.anInt2299;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray199[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray199[local118++] = local277 + local340;
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
				if (local91 < this.anInt2308) {
					local91 = this.anInt2308;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2305) {
					local102 = this.anInt2305;
				}
				local116 = local91 + local30 * this.anInt2299;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray199[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray199[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt2308) {
					local91 = this.anInt2308;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2305 - 1) {
					local102 = this.anInt2305 - 1;
				}
				local116 = local91 + local30 * this.anInt2299;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray199[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray199[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "()V")
	@Override
	public void method2038() {
		this.aClass83_18.method2346();
	}

	@OriginalMember(owner = "client!fg", name = "sa", descriptor = "()I")
	@Override
	public int sa() {
		return this.lb;
	}

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "()V")
	@Override
	public void r() {
		this.anInt2290 = this.anInt2301;
		this.aBoolean159 = false;
	}

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "(I)Z")
	public boolean method2112(@OriginalArg(0) int arg0) {
		return super.anInterface4_5.method5685(arg0).aBoolean327;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.d(arg0, arg1, arg2, arg4, arg5);
		this.d(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.BA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.BA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!fg", name = "XA", descriptor = "(III[I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass72_Sub1_2.anInt2261 + (this.aClass72_Sub1_2.anInt2266 * arg0 + this.aClass72_Sub1_2.anInt2259 * arg1 + this.aClass72_Sub1_2.anInt2263 * arg2 >> 15);
		if (local23 < this.anInt2300 || local23 > this.lb) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt2304 * (this.aClass72_Sub1_2.anInt2270 + (this.aClass72_Sub1_2.anInt2269 * arg0 + this.aClass72_Sub1_2.anInt2260 * arg1 + this.aClass72_Sub1_2.anInt2265 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt2306 * (this.aClass72_Sub1_2.anInt2264 + (this.aClass72_Sub1_2.anInt2267 * arg0 + this.aClass72_Sub1_2.anInt2268 * arg1 + this.aClass72_Sub1_2.anInt2262 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt2291 && local73 <= this.anInt2287 && local102 >= this.anInt2285 && local102 <= this.anInt2312) {
			arg3[0] = local73 - this.anInt2291;
			arg3[1] = local102 - this.anInt2285;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!fg", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.anInt2300;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([IIIII)Lclient!aa;")
	@Override
	public Class2 method2055(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class2_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class2_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class2_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class2_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "()Z")
	@Override
	public boolean method2046() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "(II)V")
	@Override
	public void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2300 = arg0;
		this.lb = arg1;
		this.anInt2296 = this.lb - 255;
		this.method2115();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "()V")
	@Override
	protected void method2053() {
		if (this.aBoolean155) {
			Static148.method5176(true, false);
			this.aBoolean155 = false;
		}
		this.aClass4_Sub2_1 = null;
		this.aCanvas4 = null;
		this.aClass96_11 = null;
		this.aBoolean156 = true;
	}

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "()Z")
	@Override
	public boolean method2096() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIILclient!i;II)V")
	@Override
	public void method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class74 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class74_Sub1 local2 = (Class74_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray205;
		@Pc(8) int[] local8 = local2.anIntArray204;
		@Pc(17) int local17 = this.anInt2303 > arg7 ? this.anInt2303 : arg7;
		@Pc(32) int local32 = this.anInt2310 < arg7 + local5.length ? this.anInt2310 : arg7 + local5.length;
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
					if (local129 >= this.anInt2308 && local129 < this.anInt2305 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray199[local129 + arg1 * this.anInt2299] = arg4;
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
					if (local133 >= this.anInt2308 && local133 < this.anInt2305 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt2299;
						local248 = this.anIntArray199[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray199[local133 + arg1 * this.anInt2299] = local201 + local584;
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
		if (arg0 < this.anInt2308) {
			arg1 += local83 * (this.anInt2308 - arg0);
			arg0 = this.anInt2308;
		}
		if (arg2 >= this.anInt2305) {
			arg2 = this.anInt2305 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray199[arg0 + local129 * this.anInt2299] = arg4;
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
					local243 = arg0 + local133 * this.anInt2299;
					local248 = this.anIntArray199[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray199[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!fg", name = "ha", descriptor = "(III)V")
	@Override
	public void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2290 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt2290 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt2290 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt2290 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt2290 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean158 = false;
		} else {
			this.aBoolean158 = true;
		}
	}

	@OriginalMember(owner = "client!fg", name = "ua", descriptor = "(IIIIII[BII)V")
	@Override
	public void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt2299;
		@Pc(35) int local35 = this.anInt2299 - arg2;
		if (arg1 + arg3 > this.anInt2310) {
			arg3 -= arg1 + arg3 - this.anInt2310;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt2303) {
			local59 = this.anInt2303 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt2299;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt2305) {
			local59 = arg0 + arg2 - this.anInt2305;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt2308) {
			local59 = this.anInt2308 - arg0;
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
						this.anIntArray199[local30++] = arg4;
					} else {
						this.anIntArray199[local30++] = arg5;
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
					local245 = this.anIntArray199[local30];
					this.anIntArray199[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray199[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray199[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "()F")
	@Override
	public float I() {
		return this.aFloat43;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)I")
	@Override
	public int method2102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "(I)[I")
	private int[] method2113(@OriginalArg(0) int arg0) {
		@Pc(2) Class83 local2 = this.aClass83_18;
		@Pc(12) Class4_Sub40 local12;
		synchronized (this.aClass83_18) {
			local12 = (Class4_Sub40) this.aClass83_18.method2338((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_5.method5684(arg0)) {
					return null;
				}
				@Pc(32) Class160 local32 = super.anInterface4_5.method5685(arg0);
				@Pc(42) int local42 = local32.aBoolean322 || this.aBoolean157 ? 64 : 128;
				local12 = new Class4_Sub40(arg0, local42, super.anInterface4_5.method5683(local42, local42, arg0, 0.7F), local32.aBoolean326);
				this.aClass83_18.method2337(local12, (long) arg0);
			}
		}
		local12.aBoolean533 = true;
		return local12.method5754();
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIIIIIIII)V")
	public void method2114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface4_5.method5685(arg5).aBoolean319) {
			this.S(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt2315 != arg5) {
			@Pc(26) Class2 local26 = (Class2) this.aClass83_17.method2338((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method2113(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method2107(arg5) ? 64 : 128;
				local26 = this.method2055(local32, local43, local43, local43);
				this.aClass83_17.method2337(local26, (long) arg5);
			}
			this.anInt2315 = arg5;
			this.aClass2_10 = local26;
		}
		this.aClass2_10.XA(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "()V")
	private void method2115() {
		if (this.aFloat42 == 0.0F) {
			this.anInt2286 = this.lb;
			return;
		}
		@Pc(8) float local8 = (float) this.lb;
		@Pc(12) float local12 = (float) this.anInt2300;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat43 / (this.aFloat42 + this.aFloat43);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat42;
		this.anInt2286 = (int) (((float) this.lb - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "()Z")
	@Override
	public boolean method2048() {
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!kv;Lclient!kv;FLclient!kv;)Lclient!kv;")
	@Override
	public Class41 method2035(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class41 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!of;")
	public Class182 method2116(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2302; local1++) {
			if (this.aClass182Array1[local1].aRunnable1 == arg0) {
				return this.aClass182Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "()F")
	@Override
	public float s() {
		return this.aFloat42;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!w;)V")
	@Override
	public void method2060(@OriginalArg(0) Class4_Sub18 arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class182 local3 = this.method2116(Thread.currentThread());
		@Pc(6) Class44 local6 = local3.aClass44_2;
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
		@Pc(93) int local93 = arg0 - local6.method1274();
		@Pc(98) int local98 = arg1 - local6.method1279();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt1399 = 0;
		local6.aBoolean96 = local102 < 0 || local102 > local6.anInt1394 || local106 < 0 || local106 > local6.anInt1394 || local112 < 0 || local112 > local6.anInt1394;
		local6.method1281(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean96 = local102 < 0 || local102 > local6.anInt1394 || local106 < 0 || local106 > local6.anInt1394 || local118 < 0 || local118 > local6.anInt1394;
		local6.method1281(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "()I")
	@Override
	public int U() {
		@Pc(2) int local2 = this.anInt2313;
		this.anInt2313 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(IIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2297 = arg0;
		this.anInt2309 = arg1;
		this.anInt2304 = arg2;
		this.anInt2306 = arg3;
		this.method2110();
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(IIIII)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt2303 || arg1 >= this.anInt2310) {
			return;
		}
		if (arg0 < this.anInt2308) {
			arg2 -= this.anInt2308 - arg0;
			arg0 = this.anInt2308;
		}
		if (arg0 + arg2 > this.anInt2305) {
			arg2 = this.anInt2305 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2299;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray199[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray199[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray199[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray199[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray199[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fg", name = "MA", descriptor = "(F)V")
	@Override
	public void MA(@OriginalArg(0) float arg0) {
		this.anInt2289 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!wg;)V")
	@Override
	public void method2085(@OriginalArg(0) Class270 arg0) {
		@Pc(3) Class71_Sub1 local3 = arg0.aClass108_1.aClass71_Sub1_5;
		for (@Pc(6) Class71_Sub1 local6 = local3.aClass71_Sub1_9; local6 != local3; local6 = local6.aClass71_Sub1_9) {
			@Pc(10) Class71_Sub1_Sub2 local10 = (Class71_Sub1_Sub2) local6;
			@Pc(15) int local15 = local10.anInt3398 >> 12;
			@Pc(20) int local20 = local10.anInt3404 >> 12;
			@Pc(25) int local25 = local10.anInt3400 >> 12;
			@Pc(49) int local49 = this.aClass72_Sub1_2.anInt2261 + (this.aClass72_Sub1_2.anInt2266 * local15 + this.aClass72_Sub1_2.anInt2259 * local20 + this.aClass72_Sub1_2.anInt2263 * local25 >> 15);
			if (local49 >= this.anInt2300 && local49 <= this.anInt2296) {
				@Pc(90) int local90 = this.anInt2297 + this.anInt2304 * (this.aClass72_Sub1_2.anInt2270 + (this.aClass72_Sub1_2.anInt2269 * local15 + this.aClass72_Sub1_2.anInt2260 * local20 + this.aClass72_Sub1_2.anInt2265 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt2309 + this.anInt2306 * (this.aClass72_Sub1_2.anInt2264 + (this.aClass72_Sub1_2.anInt2267 * local15 + this.aClass72_Sub1_2.anInt2268 * local20 + this.aClass72_Sub1_2.anInt2262 * local25 >> 15)) / local49;
				if (local90 >= this.anInt2308 && local90 <= this.anInt2305 && local122 >= this.anInt2303 && local122 <= this.anInt2310) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method2108(local10, local90, local122, (local10.anInt3401 * this.anInt2304 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIF)Lclient!ni;")
	@Override
	public Class4_Sub17 method2087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!kv;)V")
	@Override
	public void method2067(@OriginalArg(0) Class41 arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "()I")
	@Override
	public int method2104() {
		return 0;
	}

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "(I)V")
	@Override
	public void K(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "BA", descriptor = "(IIIII)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt2308 || arg0 >= this.anInt2305) {
			return;
		}
		if (arg1 < this.anInt2303) {
			arg2 -= this.anInt2303 - arg1;
			arg1 = this.anInt2303;
		}
		if (arg1 + arg2 > this.anInt2310) {
			arg2 = this.anInt2310 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2299;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray199[local40 + local54 * this.anInt2299] = arg3;
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
				local111 = local40 + local103 * this.anInt2299;
				local116 = this.anIntArray199[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray199[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt2299;
				local111 = this.anIntArray199[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray199[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "()Z")
	@Override
	public boolean method2040() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "()Z")
	public boolean method2117() {
		return this.aBoolean156;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	@Override
	public void method2044(@OriginalArg(0) int arg0) {
		this.aClass182Array1[arg0].method4422(null);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ch;IIII)Lclient!ka;")
	@Override
	public Class57 method2036(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
	@Override
	public void method2056(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "()Z")
	@Override
	public boolean method2070() {
		return true;
	}

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "()Z")
	@Override
	public boolean method2045() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "(IIII)[I")
	@Override
	public int[] N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt2299 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray199[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "()Lclient!n;")
	@Override
	public Class72 method2103() {
		return new Class72_Sub1();
	}

	@OriginalMember(owner = "client!fg", name = "v", descriptor = "()Z")
	@Override
	public boolean method2094() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[Lclient!ni;)V")
	@Override
	public void method2081(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub17[] arg1) {
	}

	@OriginalMember(owner = "client!fg", name = "H", descriptor = "()V")
	@Override
	public void H() {
		this.anInt2308 = 0;
		this.anInt2303 = 0;
		this.anInt2305 = this.anInt2299;
		this.anInt2310 = this.anInt2294;
		this.method2110();
	}

	@OriginalMember(owner = "client!fg", name = "TA", descriptor = "(IIIIII)Z")
	@Override
	public boolean TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass72_Sub1_2.anInt2266 * arg0 + this.aClass72_Sub1_2.anInt2259 * arg1 + this.aClass72_Sub1_2.anInt2263 * arg2 >> 15) + this.aClass72_Sub1_2.anInt2261;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass72_Sub1_2.anInt2266 * arg3 + this.aClass72_Sub1_2.anInt2259 * arg4 + this.aClass72_Sub1_2.anInt2263 * arg5 >> 15) + this.aClass72_Sub1_2.anInt2261;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt2300 && local52 < this.anInt2300 || !(local23 <= this.lb || local52 <= this.lb)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt2304 * ((this.aClass72_Sub1_2.anInt2269 * arg0 + this.aClass72_Sub1_2.anInt2260 * arg1 + this.aClass72_Sub1_2.anInt2265 * arg2 >> 15) + this.aClass72_Sub1_2.anInt2270) / local23;
		@Pc(133) int local133 = this.anInt2304 * ((this.aClass72_Sub1_2.anInt2269 * arg3 + this.aClass72_Sub1_2.anInt2260 * arg4 + this.aClass72_Sub1_2.anInt2265 * arg5 >> 15) + this.aClass72_Sub1_2.anInt2270) / local52;
		if (local104 < this.anInt2291 && local133 < this.anInt2291 || local104 > this.anInt2287 && local133 > this.anInt2287) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt2306 * ((this.aClass72_Sub1_2.anInt2267 * arg0 + this.aClass72_Sub1_2.anInt2268 * arg1 + this.aClass72_Sub1_2.anInt2262 * arg2 >> 15) + this.aClass72_Sub1_2.anInt2264) / local23;
			@Pc(209) int local209 = this.anInt2306 * ((this.aClass72_Sub1_2.anInt2267 * arg3 + this.aClass72_Sub1_2.anInt2268 * arg4 + this.aClass72_Sub1_2.anInt2262 * arg5 >> 15) + this.aClass72_Sub1_2.anInt2264) / local52;
			return (local180 >= this.anInt2285 || local209 >= this.anInt2285) && (local180 <= this.anInt2312 || local209 <= this.anInt2312);
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
	@Override
	public void method2068(@OriginalArg(0) boolean arg0) {
		this.aBoolean157 = arg0;
		this.aClass83_18.method2346();
	}

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "()Z")
	@Override
	public boolean method2076() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "(IIII)V")
	@Override
	public void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2301 = this.anInt2290;
		this.anInt2293 = arg0;
		this.anInt2290 = arg1;
		this.anInt2288 = arg2;
		this.aBoolean159 = true;
	}

	@OriginalMember(owner = "client!fg", name = "M", descriptor = "(IIIIII)V")
	@Override
	public void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt2308) {
			arg2 -= this.anInt2308 - arg0;
			arg0 = this.anInt2308;
		}
		if (arg1 < this.anInt2303) {
			arg3 -= this.anInt2303 - arg1;
			arg1 = this.anInt2303;
		}
		if (arg0 + arg2 > this.anInt2305) {
			arg2 = this.anInt2305 - arg0;
		}
		if (arg1 + arg3 > this.anInt2310) {
			arg3 = this.anInt2310 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt2305 || arg1 > this.anInt2310) {
			return;
		}
		@Pc(67) int local67 = this.anInt2299 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt2299;
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
						local221 = this.anIntArray199[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray199[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray199[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray199[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray199[arg2] = arg4;
					arg2++;
					this.anIntArray199[arg2] = arg4;
					arg2++;
					this.anIntArray199[arg2] = arg4;
					arg2++;
					this.anIntArray199[arg2] = arg4;
					arg2++;
					this.anIntArray199[arg2] = arg4;
					arg2++;
					this.anIntArray199[arg2] = arg4;
					arg2++;
					this.anIntArray199[arg2] = arg4;
					arg2++;
					this.anIntArray199[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray199[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!fg", name = "la", descriptor = "(IFFFFF)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt2292 = (int) (arg1 * 65535.0F);
		this.anInt2295 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt2298 = (int) (arg3 * 65535.0F / local26);
		this.anInt2307 = (int) (arg4 * 65535.0F / local26);
		this.anInt2311 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2043(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas4 == arg0) {
			this.method2073(null);
		}
		@Pc(15) Class4_Sub2 local15 = (Class4_Sub2) this.aClass96_11.method2797((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6330();
		}
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
	@Override
	public void method2049(@OriginalArg(0) int arg0) {
		this.aClass182Array1[arg0].method4422(Thread.currentThread());
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)Lclient!w;")
	@Override
	public Class4_Sub18 method2051(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "()V")
	@Override
	public void method2039() {
	}

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "()V")
	@Override
	public void method2098() {
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2073(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas4 = null;
			this.aClass4_Sub2_1 = null;
			if (this.aClass2_9 == null) {
				this.anIntArray199 = null;
				this.anInt2299 = this.anInt2294 = 1;
				this.method2111();
			}
			return;
		}
		@Pc(10) Class4_Sub2 local10 = (Class4_Sub2) this.aClass96_11.method2797((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas4 = arg0;
		this.aClass4_Sub2_1 = local10;
		if (this.aClass2_9 != null) {
			return;
		}
		this.anIntArray199 = local10.anIntArray458;
		this.anInt2299 = local10.anInt5670;
		this.anInt2294 = local10.anInt5666;
		this.method2111();
		return;
	}

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "()Z")
	@Override
	public boolean method2052() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "(I)Z")
	public boolean method2118(@OriginalArg(0) int arg0) {
		return super.anInterface4_5.method5684(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2059() {
		@Pc(3) Class182 local3 = this.method2116(Thread.currentThread());
		@Pc(6) Class44 local6 = local3.aClass44_2;
		local6.aBoolean97 = false;
		local6.aBoolean97 = false;
		local6.anInt1399 = 0;
		local6.aBoolean96 = true;
		local6.method1282(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean97 = true;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[I[I)Lclient!i;")
	@Override
	public Class74 method2079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class74_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Z)V")
	@Override
	public void method2106(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2075(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas4 == null || this.aClass4_Sub2_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas4.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt2299 && local21.y <= this.anInt2294 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass4_Sub2_1.method4704(local21.height, local21.x, local21.y, local21.width, local14);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	@Override
	public void method2030(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "()Z")
	@Override
	public boolean method2034() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "()Z")
	@Override
	public boolean method2100() {
		return false;
	}

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "(I)I")
	public int method2119(@OriginalArg(0) int arg0) {
		return super.anInterface4_5.method5685(arg0).aShort51 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIZ)Lclient!aa;")
	@Override
	public Class2 method2058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt2299 + arg0;
		@Pc(16) int local16 = this.anInt2299 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray199[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class2_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class2_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)V")
	@Override
	public void method2099(@OriginalArg(0) int arg0) {
		if (this.anInt2302 == arg0) {
			return;
		}
		this.anInt2302 = arg0;
		this.aClass182Array1 = new Class182[this.anInt2302];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2302; local14++) {
			this.aClass182Array1[local14] = new Class182(this);
		}
	}
}
