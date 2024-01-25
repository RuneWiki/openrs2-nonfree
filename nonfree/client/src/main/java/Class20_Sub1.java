import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "I")
	private int anInt354;

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
	private int anInt355;

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "Lclient!eq;")
	private Class99 aClass99_8;

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "Lclient!pi;")
	public Class2_Sub31 aClass2_Sub31_1;

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "Z")
	private boolean aBoolean20;

	@OriginalMember(owner = "client!ao", name = "D", descriptor = "Z")
	private boolean aBoolean21;

	@OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
	private int anInt356;

	@OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
	public int anInt357;

	@OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
	public int anInt358;

	@OriginalMember(owner = "client!ao", name = "H", descriptor = "Lclient!it;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
	public int anInt359;

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
	public int anInt360;

	@OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
	public int anInt361;

	@OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
	public int anInt362;

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "[Lclient!pga;")
	private Class261[] aClass261Array1;

	@OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
	public int anInt364;

	@OriginalMember(owner = "client!ao", name = "P", descriptor = "[I")
	public int[] anIntArray22;

	@OriginalMember(owner = "client!ao", name = "R", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "I")
	public int anInt366;

	@OriginalMember(owner = "client!ao", name = "T", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!ao", name = "U", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!ao", name = "V", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!ao", name = "W", descriptor = "Z")
	private boolean aBoolean22;

	@OriginalMember(owner = "client!ao", name = "X", descriptor = "I")
	public int anInt370;

	@OriginalMember(owner = "client!ao", name = "Y", descriptor = "I")
	public int anInt371;

	@OriginalMember(owner = "client!ao", name = "Z", descriptor = "Lclient!gq;")
	public Class30_Sub1 aClass30_Sub1_1;

	@OriginalMember(owner = "client!ao", name = "ab", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!ao", name = "bb", descriptor = "I")
	public int anInt373;

	@OriginalMember(owner = "client!ao", name = "cb", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!ao", name = "db", descriptor = "I")
	public int anInt375;

	@OriginalMember(owner = "client!ao", name = "eb", descriptor = "I")
	public int anInt376;

	@OriginalMember(owner = "client!ao", name = "fb", descriptor = "Lclient!jr;")
	private final Class169 aClass169_2;

	@OriginalMember(owner = "client!ao", name = "gb", descriptor = "Lclient!jr;")
	private final Class169 aClass169_3;

	@OriginalMember(owner = "client!ao", name = "hb", descriptor = "I")
	public int anInt377;

	@OriginalMember(owner = "client!ao", name = "ib", descriptor = "I")
	public int anInt378;

	@OriginalMember(owner = "client!ao", name = "jb", descriptor = "[F")
	public float[] aFloatArray1;

	@OriginalMember(owner = "client!ao", name = "kb", descriptor = "I")
	public int anInt379;

	@OriginalMember(owner = "client!ao", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!ao", name = "mb", descriptor = "I")
	private int anInt380;

	@OriginalMember(owner = "client!ao", name = "nb", descriptor = "I")
	public int anInt381;

	@OriginalMember(owner = "client!ao", name = "ob", descriptor = "I")
	public int anInt382;

	@OriginalMember(owner = "client!ao", name = "pb", descriptor = "I")
	public int anInt383;

	@OriginalMember(owner = "client!ao", name = "qb", descriptor = "I")
	public int anInt384;

	@OriginalMember(owner = "client!ao", name = "rb", descriptor = "I")
	public int anInt385;

	@OriginalMember(owner = "client!ao", name = "sb", descriptor = "[F")
	public float[] aFloatArray2;

	@OriginalMember(owner = "client!ao", name = "tb", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!ao", name = "ub", descriptor = "Lclient!mi;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class20_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method7246(arg0, arg2, arg3);
			this.method7280(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method7238();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class20_Sub1(@OriginalArg(0) Interface4 arg0) {
		super(arg0);
		this.aBoolean20 = false;
		this.aBoolean21 = false;
		this.aClass99_8 = new Class99(4);
		this.anInt358 = 45823;
		this.aBoolean22 = false;
		this.anInt368 = 0;
		this.anInt378 = 128;
		this.anInt359 = 0;
		this.anInt364 = 50;
		this.anInt379 = 0;
		this.anInt375 = 0;
		this.anInt376 = 512;
		this.anInt377 = 75518;
		this.anInt371 = 512;
		this.anInt380 = 0;
		this.anInt373 = 3500;
		this.anInt382 = 0;
		this.anInt361 = 78642;
		this.aClass169_3 = new Class169(16);
		this.anInt386 = -1;
		try {
			this.aClass169_2 = new Class169(256);
			this.aClass30_Sub1_1 = new Class30_Sub1();
			this.method7234(1);
			this.method7262(0);
			Static100.method2647(true, true);
			this.aBoolean21 = true;
			this.anInt355 = (int) Static277.method5091();
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method7238();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "()Z")
	@Override
	public boolean method7298() {
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt360, this.anInt367, arg0, 0);
	}

	@OriginalMember(owner = "client!ao", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt360 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray22[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!ao", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass261Array1.length; local1++) {
			this.aClass261Array1[local1].anInt7995 = this.aClass261Array1[local1].anInt8002;
			this.aClass261Array1[local1].aBoolean571 = false;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray453;
		@Pc(8) int[] local8 = local2.anIntArray454;
		@Pc(17) int local17 = this.anInt359 > arg7 ? this.anInt359 : arg7;
		@Pc(32) int local32 = this.anInt379 < arg7 + local5.length ? this.anInt379 : arg7 + local5.length;
		@Pc(36) int local36 = arg10 << 8;
		@Pc(40) int local40 = arg8 << 8;
		@Pc(44) int local44 = arg9 << 8;
		@Pc(48) int local48 = local40 + local44;
		arg10 = local36 % local48;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(77) int local77;
		@Pc(81) int local81;
		if (arg2 + arg3 < 0) {
			local77 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
			local81 = local77 % local48;
			local36 = local48 + local40 - arg10 - local81;
			arg10 = local36 % local48;
			if (arg10 < 0) {
				arg10 += local48;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(159) int local159;
		@Pc(172) int local172;
		@Pc(176) int local176;
		@Pc(199) int local199;
		@Pc(299) int local299;
		@Pc(316) int local316;
		@Pc(142) int local142;
		@Pc(128) int local128;
		@Pc(263) int local263;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local142 = arg2 << 16;
			local77 = (int) Math.floor((double) local142 / (double) arg3 + 0.5D);
			local81 = (int) Math.sqrt((double) ((local77 >> 8) * (local77 >> 8) + 65536));
			local128 = arg3 + arg1;
			local159 = arg4 >>> 24;
			if (local159 == 255) {
				while (arg1 <= local128) {
					local172 = arg0 >> 16;
					local176 = arg1 - arg7;
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt375 && local172 < this.anInt382 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray22[local172 + arg1 * this.anInt360] = arg4;
					}
					arg0 += local77;
					arg1++;
					local36 = arg10 + local81;
					arg10 = local36 % local48;
				}
			} else {
				local263 = ((arg4 & 0xFF00FF) * local159 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local159 >> 8 & 0xFF00) + (local159 << 24);
				local172 = 256 - local159;
				while (arg1 <= local128) {
					local176 = arg0 >> 16;
					local199 = arg1 - arg7;
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt375 && local176 < this.anInt382 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt360;
						local316 = this.anIntArray22[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray22[local176 + arg1 * this.anInt360] = local263 + local707;
					}
					arg0 += local77;
					arg1++;
					local36 = arg10 + local81;
					arg10 = local36 % local48;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local128 = arg3 << 16;
		local77 = (int) Math.floor((double) local128 / (double) arg2 + 0.5D);
		local142 = arg2 + arg0;
		local81 = arg4 >>> 24;
		local159 = (int) Math.sqrt((double) ((local77 >> 8) * (local77 >> 8) + 65536));
		if (local81 == 255) {
			while (arg0 <= local142) {
				local172 = arg1 >> 16;
				local176 = local172 - arg7;
				if (arg0 >= this.anInt375 && arg0 < this.anInt382 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray22[arg0 + local172 * this.anInt360] = arg4;
					}
				}
				arg1 += local77;
				arg0++;
				local36 = arg10 + local159;
				arg10 = local36 % local48;
			}
			return;
		}
		local263 = ((arg4 & 0xFF00FF) * local81 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local81 >> 8 & 0xFF00) + (local81 << 24);
		local172 = 256 - local81;
		while (arg0 <= local142) {
			local176 = arg1 >> 16;
			local199 = local176 - arg7;
			if (arg0 >= this.anInt375 && arg0 < this.anInt382 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt360;
					@Pc(321) int local321 = this.anIntArray22[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray22[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!mda;I)V")
	@Override
	public void method7288(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class261 local3 = this.method578(Thread.currentThread());
		@Pc(7) Class3_Sub2 local7 = arg0.aClass194_1.aClass3_Sub2_7;
		for (@Pc(10) Class3_Sub2 local10 = local7.aClass3_Sub2_10; local10 != local7; local10 = local10.aClass3_Sub2_10) {
			@Pc(14) Class3_Sub2_Sub2 local14 = (Class3_Sub2_Sub2) local10;
			@Pc(19) int local19 = local14.anInt8145 >> 12;
			@Pc(24) int local24 = local14.anInt8148 >> 12;
			@Pc(29) int local29 = local14.anInt8143 >> 12;
			@Pc(54) float local54 = this.aClass30_Sub1_1.aFloat115 + this.aClass30_Sub1_1.aFloat107 * (float) local19 + this.aClass30_Sub1_1.aFloat114 * (float) local24 + this.aClass30_Sub1_1.aFloat108 * (float) local29;
			if (!(local54 < (float) this.anInt364) && !(local54 > (float) local3.anInt8004)) {
				@Pc(103) int local103 = this.anInt385 + (int) ((float) this.anInt371 * (this.aClass30_Sub1_1.aFloat117 + this.aClass30_Sub1_1.aFloat111 * (float) local19 + this.aClass30_Sub1_1.aFloat112 * (float) local24 + this.aClass30_Sub1_1.aFloat110 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.lb + (int) ((float) this.anInt376 * (this.aClass30_Sub1_1.aFloat116 + this.aClass30_Sub1_1.aFloat106 * (float) local19 + this.aClass30_Sub1_1.aFloat113 * (float) local24 + this.aClass30_Sub1_1.aFloat109 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt375 && local103 <= this.anInt382 && local139 >= this.anInt359 && local139 <= this.anInt379) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method566(local14, local103, local139, (int) local54, (local14.anInt8147 * this.anInt371 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I[Lclient!ab;)V")
	@Override
	public void method7245(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1[] arg1) {
	}

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "()Z")
	@Override
	public boolean method7296() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "()V")
	@Override
	public void method7313() {
	}

	@OriginalMember(owner = "client!ao", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt375 || arg0 >= this.anInt382) {
			return;
		}
		if (arg1 < this.anInt359) {
			arg2 -= this.anInt359 - arg1;
			arg1 = this.anInt359;
		}
		if (arg1 + arg2 > this.anInt379) {
			arg2 = this.anInt379 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt360;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray22[local40 + local54 * this.anInt360] = arg3;
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
				local111 = local40 + local103 * this.anInt360;
				local116 = this.anIntArray22[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray22[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt360;
				local111 = this.anIntArray22[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray22[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)V")
	@Override
	public void method7250(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt377 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!ao", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass261Array1.length; local1++) {
			this.aClass261Array1[local1].anInt8002 = this.aClass261Array1[local1].anInt7995;
			this.aClass261Array1[local1].anInt8005 = arg0;
			this.aClass261Array1[local1].anInt7995 = arg1;
			this.aClass261Array1[local1].anInt7998 = arg2;
			this.aClass261Array1[local1].aBoolean571 = true;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7254(@OriginalArg(0) Class2_Sub2 arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!jc;IIII)V")
	private void method566(@OriginalArg(0) Class3_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt8146;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method577(arg1, arg2, arg3, arg4, arg0.anInt8144, 1);
			return;
		}
		if (this.anInt386 != local2) {
			@Pc(33) Class46 local33 = (Class46) this.aClass169_3.method5002((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method573(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method581(local2) ? 64 : this.anInt378;
				local33 = this.method7265(local50, local39, local50, local50);
				this.aClass169_3.method5001(local33, (long) local2);
			}
			this.anInt386 = local2;
			this.aClass46_1 = local33;
		}
		local8++;
		((Class46_Sub1) this.aClass46_1).method5685(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt8144, 1);
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "()V")
	private void method567() {
		this.anInt384 = this.anInt375 - this.anInt385;
		this.anInt383 = this.anInt382 - this.anInt385;
		this.anInt370 = this.anInt359 - this.lb;
		this.anInt381 = this.anInt379 - this.lb;
		for (@Pc(29) int local29 = 0; local29 < this.anInt366; local29++) {
			@Pc(36) Class213 local36 = this.aClass261Array1[local29].aClass213_2;
			local36.anInt7040 = this.anInt385 - this.anInt375;
			local36.anInt7041 = this.lb - this.anInt359;
			local36.anInt7045 = this.anInt382 - this.anInt375;
			local36.anInt7042 = this.anInt379 - this.anInt359;
		}
		@Pc(78) int local78 = this.anInt359 * this.anInt360 + this.anInt375;
		for (@Pc(81) int local81 = this.anInt359; local81 < this.anInt379; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt366; local84++) {
				this.aClass261Array1[local84].aClass213_2.anIntArray445[local81 - this.anInt359] = local78;
			}
			local78 += this.anInt360;
		}
	}

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt364;
	}

	@OriginalMember(owner = "client!ao", name = "y", descriptor = "()Lclient!bca;")
	@Override
	public Class30 method7308() {
		@Pc(3) Class261 local3 = this.method578(Thread.currentThread());
		return local3.aClass30_Sub1_3;
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)Z")
	public boolean method568(@OriginalArg(0) int arg0) {
		return super.anInterface4_12.method8048(arg0).aBoolean341 || super.anInterface4_12.method8048(arg0).aBoolean340;
	}

	@OriginalMember(owner = "client!ao", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt360;
		@Pc(35) int local35 = this.anInt360 - arg2;
		if (arg1 + arg3 > this.anInt379) {
			arg3 -= arg1 + arg3 - this.anInt379;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt359) {
			local59 = this.anInt359 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt360;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt382) {
			local59 = arg0 + arg2 - this.anInt382;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt375) {
			local59 = this.anInt375 - arg0;
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
						this.anIntArray22[local30++] = arg4;
					} else {
						this.anIntArray22[local30++] = arg5;
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
					local245 = this.anIntArray22[local30];
					this.anIntArray22[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray22[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray22[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "()Z")
	@Override
	public boolean method7258() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(IIIIII)Lclient!wh;")
	@Override
	public Class78 method7300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt360) {
			arg2 = this.anInt360;
		}
		if (arg3 > this.anInt367) {
			arg3 = this.anInt367;
		}
		this.anInt375 = arg0;
		this.anInt382 = arg2;
		this.anInt359 = arg1;
		this.anInt379 = arg3;
		this.method567();
	}

	@OriginalMember(owner = "client!ao", name = "v", descriptor = "()V")
	@Override
	public void method7301() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!bca;)V")
	@Override
	public void method7241(@OriginalArg(0) Class30 arg0) {
		this.aClass30_Sub1_1 = (Class30_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg1;
		@Pc(5) int[] local5 = local2.anIntArray453;
		@Pc(8) int[] local8 = local2.anIntArray454;
		@Pc(20) int local20;
		if (this.anInt379 < arg3 + local5.length) {
			local20 = this.anInt379 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt359 > arg3) {
			local33 = this.anInt359 - arg3;
			arg3 = this.anInt359;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt360;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt375 > local58) {
				local62 -= this.anInt375 - local58;
				local58 = this.anInt375;
			}
			if (this.anInt382 < local58 + local62) {
				local62 = this.anInt382 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray22[local58++] = arg0;
			}
			local49 += this.anInt360;
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(II)I")
	@Override
	public int method7270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class261 local3 = this.method578(Thread.currentThread());
		this.anInt364 = arg0;
		this.anInt373 = arg1;
		local3.anInt8004 = this.anInt373 - 255;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIII)V")
	private void method569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt359 || arg1 >= this.anInt379) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt360;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt375 && arg0 + local37 < this.anInt382 && local27 < arg4) {
					this.anIntArray22[local15 + local37] = arg3;
				}
				local37++;
				local27++;
				local27 %= local23;
			}
			return;
		}
		@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local19 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local19 >> 8 & 0xFF00) + (local19 << 24);
		local37 = 256 - local19;
		@Pc(103) int local103 = 0;
		while (local103 < arg2) {
			if (arg0 + local103 >= this.anInt375 && arg0 + local103 < this.anInt382 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray22[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray22[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!ao", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt385, this.lb, this.anInt371, this.anInt376 };
	}

	@OriginalMember(owner = "client!ao", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt375 == 0 && this.anInt382 == this.anInt360 && this.anInt359 == 0 && this.anInt379 == this.anInt367) {
			local19 = this.aFloatArray2.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray2[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt382 - this.anInt375;
		local25 = this.anInt379 - this.anInt359;
		local27 = this.anInt360 - local19;
		@Pc(116) int local116 = this.anInt375 + this.anInt359 * this.anInt360;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "()Z")
	@Override
	public boolean method7242() {
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt359 || arg1 >= this.anInt379) {
			return;
		}
		if (arg0 < this.anInt375) {
			arg2 -= this.anInt375 - arg0;
			arg0 = this.anInt375;
		}
		if (arg0 + arg2 > this.anInt382) {
			arg2 = this.anInt382 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt360;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray22[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray22[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray22[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray22[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray22[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ao", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass30_Sub1_1.aFloat115 + this.aClass30_Sub1_1.aFloat107 * (float) arg0 + this.aClass30_Sub1_1.aFloat114 * (float) arg1 + this.aClass30_Sub1_1.aFloat108 * (float) arg2;
		if (local24 < (float) this.anInt364 || local24 > (float) this.anInt373) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt371 * (this.aClass30_Sub1_1.aFloat117 + this.aClass30_Sub1_1.aFloat111 * (float) arg0 + this.aClass30_Sub1_1.aFloat112 * (float) arg1 + this.aClass30_Sub1_1.aFloat110 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt376 * (this.aClass30_Sub1_1.aFloat116 + this.aClass30_Sub1_1.aFloat106 * (float) arg0 + this.aClass30_Sub1_1.aFloat113 * (float) arg1 + this.aClass30_Sub1_1.aFloat109 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt384 && local82 <= this.anInt383 && local115 >= this.anInt370 && local115 <= this.anInt381) {
			arg4[0] = local82 - this.anInt384;
			arg4[1] = local115 - this.anInt370;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "()Z")
	public boolean method570() {
		return this.aBoolean20;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!mda;)V")
	@Override
	public void method7287(@OriginalArg(0) Class203 arg0) {
		@Pc(3) Class261 local3 = this.method578(Thread.currentThread());
		@Pc(7) Class3_Sub2 local7 = arg0.aClass194_1.aClass3_Sub2_7;
		for (@Pc(10) Class3_Sub2 local10 = local7.aClass3_Sub2_10; local10 != local7; local10 = local10.aClass3_Sub2_10) {
			@Pc(14) Class3_Sub2_Sub2 local14 = (Class3_Sub2_Sub2) local10;
			@Pc(19) int local19 = local14.anInt8145 >> 12;
			@Pc(24) int local24 = local14.anInt8148 >> 12;
			@Pc(29) int local29 = local14.anInt8143 >> 12;
			@Pc(54) float local54 = this.aClass30_Sub1_1.aFloat115 + this.aClass30_Sub1_1.aFloat107 * (float) local19 + this.aClass30_Sub1_1.aFloat114 * (float) local24 + this.aClass30_Sub1_1.aFloat108 * (float) local29;
			if (!(local54 < (float) this.anInt364) && !(local54 > (float) local3.anInt8004)) {
				@Pc(102) int local102 = this.anInt385 + (int) ((float) this.anInt371 * (this.aClass30_Sub1_1.aFloat117 + this.aClass30_Sub1_1.aFloat111 * (float) local19 + this.aClass30_Sub1_1.aFloat112 * (float) local24 + this.aClass30_Sub1_1.aFloat110 * (float) local29) / local54);
				@Pc(137) int local137 = this.lb + (int) ((float) this.anInt376 * (this.aClass30_Sub1_1.aFloat116 + this.aClass30_Sub1_1.aFloat106 * (float) local19 + this.aClass30_Sub1_1.aFloat113 * (float) local24 + this.aClass30_Sub1_1.aFloat109 * (float) local29) / local54);
				if (local102 >= this.anInt375 && local102 <= this.anInt382 && local137 >= this.anInt359 && local137 <= this.anInt379) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method566(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt8147 * this.anInt371 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7303(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIIZ)Lclient!mi;")
	@Override
	public Class46 method7286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt360 + arg0;
		@Pc(16) int local16 = this.anInt360 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray22[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class46_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class46_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "()V")
	private void method571() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt366; local1++) {
			this.aClass261Array1[local1].method6829();
		}
		this.la();
	}

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "()Z")
	@Override
	public boolean method7285() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "()Z")
	@Override
	public boolean method7273() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt385 = arg0;
		this.lb = arg1;
		this.anInt371 = arg2;
		this.anInt376 = arg3;
		this.method567();
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7304(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas1 == arg0) {
			this.method7280(null);
		}
		@Pc(15) Class2_Sub31 local15 = (Class2_Sub31) this.aClass99_8.method3056((long) arg0.hashCode());
		if (local15 != null) {
			local15.method9253();
		}
	}

	@OriginalMember(owner = "client!ao", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass261Array1.length; local1++) {
			@Pc(7) Class261 local7 = this.aClass261Array1[local1];
			local7.anInt7995 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt7995 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt7995 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt7995 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt7995 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean572 = false;
			} else {
				local7.aBoolean572 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()Z")
	@Override
	public boolean method7230() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7246(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub31 local8 = (Class2_Sub31) this.aClass99_8.method3056((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static356.method5900(arg2, arg0, arg1);
			this.aClass99_8.method3059((long) arg0.hashCode(), local8);
		} else if (local8.anInt5956 != arg1 || local8.anInt5959 != arg2) {
			this.method7272(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt374 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt374 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray2;
		@Pc(16) int local16 = 0;
		while (local16 < arg3) {
			@Pc(19) int local19 = 0;
			while (local19 < arg2) {
				@Pc(24) float local24 = local14[local11];
				if (local24 != 2.14748365E9F) {
					local14[local11] = (float) ((double) local24 + arg4);
				}
				local19++;
				local11++;
			}
			local16++;
			local11 += local4;
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()V")
	@Override
	public void method7236() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	@Override
	public void method7234(@OriginalArg(0) int arg0) {
		this.anInt366 = arg0;
		this.aClass261Array1 = new Class261[this.anInt366];
		for (@Pc(9) int local9 = 0; local9 < this.anInt366; local9++) {
			this.aClass261Array1[local9] = new Class261(this);
		}
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method7312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
			@Pc(309) int local309;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt375) {
					arg1 += local104 * (this.anInt375 - arg0);
					arg0 = this.anInt375;
				}
				if (arg2 >= this.anInt382) {
					arg2 = this.anInt382 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt359 && local150 < this.anInt379) {
							this.anIntArray22[arg0 + local150 * this.anInt360] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt359 && local213 < this.anInt379) {
							local228 = arg0 + local213 * this.anInt360;
							local233 = this.anIntArray22[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray22[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt359 && local150 < this.anInt379) {
							local213 = arg0 + local150 * this.anInt360;
							local228 = this.anIntArray22[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray22[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt359) {
					arg0 += local104 * (this.anInt359 - arg1);
					arg1 = this.anInt359;
				}
				if (arg3 >= this.anInt379) {
					arg3 = this.anInt379 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt375 && local150 < this.anInt382) {
							this.anIntArray22[local150 + arg1 * this.anInt360] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt375 && local213 < this.anInt382) {
							local228 = local213 + arg1 * this.anInt360;
							local233 = this.anIntArray22[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray22[local213 + arg1 * this.anInt360] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt375 && local150 < this.anInt382) {
							local213 = local150 + arg1 * this.anInt360;
							local228 = this.anIntArray22[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray22[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.P(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.P(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7279() {
		@Pc(3) Class261 local3 = this.method578(Thread.currentThread());
		@Pc(6) Class213 local6 = local3.aClass213_2;
		local6.aBoolean510 = false;
		@Pc(14) int local14 = 5 - this.anInt384;
		@Pc(19) int local19 = 75 - this.anInt384;
		@Pc(24) int local24 = 15 - this.anInt384;
		@Pc(29) int local29 = 10 - this.anInt370;
		@Pc(34) int local34 = 50 - this.anInt370;
		@Pc(39) int local39 = 90 - this.anInt370;
		local6.aBoolean511 = local14 < 0 || local14 > local6.anInt7045 || local19 < 0 || local19 > local6.anInt7045 || local24 < 0 || local24 > local6.anInt7045;
		local6.anInt7043 = 0;
		local6.aBoolean509 = false;
		local6.method6024((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean510 = true;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!oea;[Lclient!rh;Z)Lclient!da;")
	@Override
	public Class68 method7289(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class296[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt9028;
			local7[local11] = arg1[local11].anInt9024;
			if (arg1[local11].aByteArray116 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class68_Sub4(this, arg0, arg1, local3, local7);
		} else {
			return new Class68_Sub1(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!he;Lclient!vm;)Lclient!is;")
	@Override
	public Interface14 method7237(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Interface25 arg1) {
		return new Class160(this, (Class46) arg0, (Class304) arg1);
	}

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class261 local3 = this.method578(Thread.currentThread());
		local3.aBoolean573 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray453;
		@Pc(8) int[] local8 = local2.anIntArray454;
		@Pc(17) int local17 = this.anInt359 > arg7 ? this.anInt359 : arg7;
		@Pc(32) int local32 = this.anInt379 < arg7 + local5.length ? this.anInt379 : arg7 + local5.length;
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
					if (local129 >= this.anInt375 && local129 < this.anInt382 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray22[local129 + arg1 * this.anInt360] = arg4;
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
					if (local133 >= this.anInt375 && local133 < this.anInt382 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt360;
						local248 = this.anIntArray22[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray22[local133 + arg1 * this.anInt360] = local201 + local584;
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
		if (arg0 < this.anInt375) {
			arg1 += local83 * (this.anInt375 - arg0);
			arg0 = this.anInt375;
		}
		if (arg2 >= this.anInt382) {
			arg2 = this.anInt382 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray22[arg0 + local129 * this.anInt360] = arg4;
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
					local243 = arg0 + local133 * this.anInt360;
					local248 = this.anIntArray22[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray22[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!ao", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt373;
	}

	@OriginalMember(owner = "client!ao", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt375 < arg0) {
			this.anInt375 = arg0;
		}
		if (this.anInt359 < arg1) {
			this.anInt359 = arg1;
		}
		if (this.anInt382 > arg2) {
			this.anInt382 = arg2;
		}
		if (this.anInt379 > arg3) {
			this.anInt379 = arg3;
		}
		this.method567();
	}

	@OriginalMember(owner = "client!ao", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt375) {
			arg2 -= this.anInt375 - arg0;
			arg0 = this.anInt375;
		}
		if (arg1 < this.anInt359) {
			arg3 -= this.anInt359 - arg1;
			arg1 = this.anInt359;
		}
		if (arg0 + arg2 > this.anInt382) {
			arg2 = this.anInt382 - arg0;
		}
		if (arg1 + arg3 > this.anInt379) {
			arg3 = this.anInt379 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt382 || arg1 > this.anInt379) {
			return;
		}
		@Pc(67) int local67 = this.anInt360 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt360;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(217) int local217;
			if (arg5 == 1) {
				@Pc(201) int local201 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + (((arg4 & 0xFF00FF00) >>> 8) * local78 & 0xFF00FF00);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local217 = this.anIntArray22[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray22[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray22[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray22[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray22[arg2] = arg4;
					arg2++;
					this.anIntArray22[arg2] = arg4;
					arg2++;
					this.anIntArray22[arg2] = arg4;
					arg2++;
					this.anIntArray22[arg2] = arg4;
					arg2++;
					this.anIntArray22[arg2] = arg4;
					arg2++;
					this.anIntArray22[arg2] = arg4;
					arg2++;
					this.anIntArray22[arg2] = arg4;
					arg2++;
					this.anIntArray22[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray22[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "(I)[I")
	public int[] method572(@OriginalArg(0) int arg0) {
		@Pc(2) Class169 local2 = this.aClass169_2;
		@Pc(12) Class2_Sub35 local12;
		synchronized (this.aClass169_2) {
			local12 = (Class2_Sub35) this.aClass169_2.method5002((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_12.method8049(arg0)) {
					return null;
				}
				@Pc(32) Class127 local32 = super.anInterface4_12.method8048(arg0);
				@Pc(43) int local43 = local32.aBoolean335 || this.aBoolean22 ? 64 : this.anInt378;
				local12 = new Class2_Sub35(arg0, local43, super.anInterface4_12.method8050(true, arg0, 0.7F, local43, local43), local32.anInt4659 != 1);
				this.aClass169_2.method5001(local12, (long) arg0);
			}
		}
		local12.aBoolean507 = true;
		return local12.method5934();
	}

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "()V")
	@Override
	protected void method7255() {
		if (this.aBoolean21) {
			Static585.method8659(false, true);
			this.aBoolean21 = false;
		}
		this.aClass2_Sub31_1 = null;
		this.aCanvas1 = null;
		this.anInt354 = 0;
		this.anInt356 = 0;
		this.aClass99_8 = null;
		this.aBoolean20 = true;
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "()Lclient!bca;")
	@Override
	public Class30 method7243() {
		return this.aClass30_Sub1_1;
	}

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "(I)[I")
	public int[] method573(@OriginalArg(0) int arg0) {
		@Pc(2) Class169 local2 = this.aClass169_2;
		@Pc(14) Class2_Sub35 local14;
		synchronized (this.aClass169_2) {
			local14 = (Class2_Sub35) this.aClass169_2.method5002((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface4_12.method8049(arg0)) {
					return null;
				}
				@Pc(34) Class127 local34 = super.anInterface4_12.method8048(arg0);
				@Pc(45) int local45 = local34.aBoolean335 || this.aBoolean22 ? 64 : this.anInt378;
				local14 = new Class2_Sub35(arg0, local45, super.anInterface4_12.method8051(local45, 0.7F, arg0, local45), local34.anInt4659 != 1);
				this.aClass169_2.method5001(local14, (long) arg0 | Long.MIN_VALUE);
			}
		}
		local14.aBoolean507 = true;
		return local14.method5934();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class65 method7251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class65_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ao", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass30_Sub1_1.aFloat115 + this.aClass30_Sub1_1.aFloat107 * (float) arg0 + this.aClass30_Sub1_1.aFloat114 * (float) arg1 + this.aClass30_Sub1_1.aFloat108 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt371 * (this.aClass30_Sub1_1.aFloat117 + this.aClass30_Sub1_1.aFloat111 * (float) arg0 + this.aClass30_Sub1_1.aFloat112 * (float) arg1 + this.aClass30_Sub1_1.aFloat110 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt376 * (this.aClass30_Sub1_1.aFloat116 + this.aClass30_Sub1_1.aFloat106 * (float) arg0 + this.aClass30_Sub1_1.aFloat113 * (float) arg1 + this.aClass30_Sub1_1.aFloat109 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt384;
		arg3[1] = local105 - this.anInt370;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "()Lclient!bca;")
	@Override
	public Class30 method7257() {
		return new Class30_Sub1();
	}

	@OriginalMember(owner = "client!ao", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt375 = 0;
		this.anInt359 = 0;
		this.anInt382 = this.anInt360;
		this.anInt379 = this.anInt367;
		this.method567();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!bh;IIII)Lclient!ka;")
	@Override
	public Class166 method7228(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class166_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)Lclient!vm;")
	@Override
	public Interface25 method7227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class304(arg0, arg1);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([I)V")
	@Override
	public void method7235(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt360;
		arg0[1] = this.anInt367;
	}

	@OriginalMember(owner = "client!ao", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt360 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt374 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray22;
		@Pc(24) float[] local24 = this.aFloatArray2;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static653.method7724(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static653.method7724(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static653.method7720(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static653.method7720(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!is;)V")
	@Override
	public void method7290(@OriginalArg(0) Interface14 arg0) {
		@Pc(2) Class160 local2 = (Class160) arg0;
		this.anInt360 = local2.anInt5354;
		this.anInt367 = local2.anInt5352;
		this.anIntArray22 = local2.anIntArray284;
		this.aClass160_1 = local2;
		this.anInt374 = local2.anInt5354;
		this.anInt369 = local2.anInt5352;
		this.aFloatArray2 = local2.aFloatArray49;
		this.method571();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface4_12.method8048(arg6).aBoolean338) {
			this.method577(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt386 != arg6) {
			@Pc(26) Class46 local26 = (Class46) this.aClass169_3.method5002((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method573(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method581(arg6) ? 64 : this.anInt378;
				local26 = this.method7265(local44, local32, local44, local44);
				this.aClass169_3.method5001(local26, (long) arg6);
			}
			this.anInt386 = arg6;
			this.aClass46_1 = local26;
		}
		((Class46_Sub1) this.aClass46_1).method5685(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!wh;)V")
	@Override
	public void method7256(@OriginalArg(0) Class78 arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class261 local3 = this.method578(Thread.currentThread());
		local3.anInt8005 = arg0;
		local3.anInt7995 = arg1;
		local3.anInt7998 = arg2;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IIIIIIII)V")
	private void method575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt375 || arg0 >= this.anInt382) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt360;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt359 && arg1 + local37 < this.anInt379 && local27 < arg4) {
					this.anIntArray22[local15 + local37 * this.anInt360] = arg3;
				}
				local37++;
				local27++;
				local27 %= local23;
			}
			return;
		}
		@Pc(100) int local100 = ((arg3 & 0xFF00FF) * local19 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local19 >> 8 & 0xFF00) + (local19 << 24);
		local37 = 256 - local19;
		@Pc(106) int local106 = 0;
		while (local106 < arg2) {
			if (arg1 + local106 >= this.anInt359 && arg1 + local106 < this.anInt379 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt360;
				@Pc(134) int local134 = this.anIntArray22[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray22[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7280(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas1 = null;
			this.aClass2_Sub31_1 = null;
			if (this.aClass160_1 == null) {
				this.anIntArray22 = null;
				this.anInt360 = this.anInt367 = 1;
				this.anInt374 = this.anInt369 = 1;
				this.method571();
			}
			return;
		}
		@Pc(10) Class2_Sub31 local10 = (Class2_Sub31) this.aClass99_8.method3056((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas1 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt354 = local18.width;
		this.anInt356 = local18.height;
		this.aClass2_Sub31_1 = local10;
		if (this.aClass160_1 != null) {
			return;
		}
		this.anIntArray22 = local10.anIntArray340;
		this.anInt360 = local10.anInt5956;
		this.anInt367 = local10.anInt5959;
		if (this.anInt360 != this.anInt374 || this.anInt367 != this.anInt369) {
			this.anInt363 = this.anInt374 = this.anInt360;
			this.anInt372 = this.anInt369 = this.anInt367;
			this.aFloatArray1 = this.aFloatArray2 = new float[this.anInt374 * this.anInt369];
		}
		this.method571();
		return;
	}

	@OriginalMember(owner = "client!ao", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass30_Sub1_1.aFloat107 * (float) arg0 + this.aClass30_Sub1_1.aFloat114 * (float) arg1 + this.aClass30_Sub1_1.aFloat108 * (float) arg2 + this.aClass30_Sub1_1.aFloat115;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass30_Sub1_1.aFloat107 * (float) arg3 + this.aClass30_Sub1_1.aFloat114 * (float) arg4 + this.aClass30_Sub1_1.aFloat108 * (float) arg5 + this.aClass30_Sub1_1.aFloat115;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt364 && local57 < (float) this.anInt364) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt373 && local57 > (float) this.anInt373) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt371 * (this.aClass30_Sub1_1.aFloat111 * (float) arg0 + this.aClass30_Sub1_1.aFloat112 * (float) arg1 + this.aClass30_Sub1_1.aFloat110 * (float) arg2 + this.aClass30_Sub1_1.aFloat117) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt371 * (this.aClass30_Sub1_1.aFloat111 * (float) arg3 + this.aClass30_Sub1_1.aFloat112 * (float) arg4 + this.aClass30_Sub1_1.aFloat110 * (float) arg5 + this.aClass30_Sub1_1.aFloat117) / local57);
		if (local128 < this.anInt384 && local160 < this.anInt384) {
			local1 |= 0x1;
		} else if (local128 > this.anInt383 && local160 > this.anInt383) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt376 * (this.aClass30_Sub1_1.aFloat106 * (float) arg0 + this.aClass30_Sub1_1.aFloat113 * (float) arg1 + this.aClass30_Sub1_1.aFloat109 * (float) arg2 + this.aClass30_Sub1_1.aFloat116) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt376 * (this.aClass30_Sub1_1.aFloat106 * (float) arg3 + this.aClass30_Sub1_1.aFloat113 * (float) arg4 + this.aClass30_Sub1_1.aFloat109 * (float) arg5 + this.aClass30_Sub1_1.aFloat116) / local57);
		if (local217 < this.anInt370 && local249 < this.anInt370) {
			local1 |= 0x4;
		} else if (local217 > this.anInt381 && local249 > this.anInt381) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V")
	@Override
	public void method7281(@OriginalArg(0) int arg0) {
		this.aClass261Array1[arg0].method6828(null);
	}

	@OriginalMember(owner = "client!ao", name = "p", descriptor = "()V")
	@Override
	public void method7275() {
		if (this.aCanvas1 == null) {
			this.anInt360 = 1;
			this.anInt367 = 1;
			this.anIntArray22 = null;
			this.anInt374 = 1;
			this.anInt369 = 1;
			this.aFloatArray2 = null;
		} else {
			this.anIntArray22 = this.aClass2_Sub31_1.anIntArray340;
			this.anInt360 = this.aClass2_Sub31_1.anInt5956;
			this.anInt367 = this.aClass2_Sub31_1.anInt5959;
			this.aFloatArray2 = this.aFloatArray1;
			this.anInt374 = this.anInt363;
			this.anInt369 = this.anInt372;
		}
		this.aClass160_1 = null;
		this.method571();
	}

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "(I)I")
	public int method576(@OriginalArg(0) int arg0) {
		return super.anInterface4_12.method8048(arg0).aShort52 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "()Z")
	@Override
	public boolean method7302() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "()Z")
	@Override
	public boolean method7274() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([IIIIIZ)Lclient!mi;")
	@Override
	public Class46 method7314(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class46_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class46_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class46_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class46_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!rh;Z)Lclient!mi;")
	@Override
	public Class46 method7294(@OriginalArg(0) Class296 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray582;
		@Pc(5) byte[] local5 = arg0.aByteArray117;
		@Pc(8) int local8 = arg0.anInt9028;
		@Pc(11) int local11 = arg0.anInt9024;
		@Pc(76) Class46_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray116 == null) {
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
			local76 = new Class46_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray116;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class46_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class46_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.method6224(arg0.anInt9029, arg0.anInt9026, arg0.anInt9025, arg0.anInt9027);
		return local76;
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(IIIIII)V")
	private void method577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt359) {
			local8 = this.anInt359;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt379) {
			local21 = this.anInt379;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg3 * arg3;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg4 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (arg5 == 0 || arg5 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt375) {
					local91 = this.anInt375;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt382) {
					local102 = this.anInt382;
				}
				local116 = local91 + local30 * this.anInt360;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						this.anIntArray22[local116] = arg4;
					}
					local116++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt375) {
					local91 = this.anInt375;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt382 - 1) {
					local102 = this.anInt382 - 1;
				}
				local116 = local91 + local30 * this.anInt360;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						this.anIntArray22[local116] = arg4;
					}
					local116++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(350) int local350;
		@Pc(364) int local364;
		if (arg5 == 1) {
			@Pc(293) int local293 = ((arg4 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local91 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local102 = arg0 + 1 - local36;
				if (local102 < this.anInt375) {
					local102 = this.anInt375;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt382) {
					local116 = this.anInt382;
				}
				local118 = local102 + local30 * this.anInt360;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray2[local118]) {
						local364 = this.anIntArray22[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray22[local118] = local293 + local364;
					}
					local118++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local102 = arg0 - local36;
				if (local102 < this.anInt375) {
					local102 = this.anInt375;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt382 - 1) {
					local116 = this.anInt382 - 1;
				}
				local118 = local102 + local30 * this.anInt360;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray2[local118]) {
						local364 = this.anIntArray22[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray22[local118] = local293 + local364;
					}
					local118++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg5 == 2) {
			@Pc(633) int local633;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt375) {
					local91 = this.anInt375;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt382) {
					local102 = this.anInt382;
				}
				local116 = local91 + local30 * this.anInt360;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						local350 = this.anIntArray22[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray22[local116] = local364 - local643 | local643 - (local643 >>> 8);
					}
					local116++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt375) {
					local91 = this.anInt375;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt382 - 1) {
					local102 = this.anInt382 - 1;
				}
				local116 = local91 + local30 * this.anInt360;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						local350 = this.anIntArray22[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray22[local116] = local364 - local350 | local350 - (local350 >>> 8);
					}
					local116++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class261 local3 = this.method578(Thread.currentThread());
		@Pc(6) Class213 local6 = local3.aClass213_2;
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
		local10 += local44 >> 16;
		local14 += local50 >> 16;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(78) int local78 = arg5 * local50 >> 17;
		@Pc(86) int local86 = arg5 * local50 + 1 >> 17;
		@Pc(92) int local92 = arg5 * local44 >> 17;
		@Pc(100) int local100 = arg5 * local44 + 1 >> 17;
		@Pc(105) int local105 = arg0 - local6.method6025();
		@Pc(110) int local110 = arg1 - local6.method6014();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt7043 = 0;
		this.C(false);
		local6.aBoolean511 = local114 < 0 || local114 > local6.anInt7045 || local118 < 0 || local118 > local6.anInt7045 || local124 < 0 || local124 > local6.anInt7045;
		local6.method6015((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean511 = local114 < 0 || local114 > local6.anInt7045 || local124 < 0 || local124 > local6.anInt7045 || local130 < 0 || local130 > local6.anInt7045;
		local6.method6015((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZ)Lclient!mi;")
	@Override
	public Class46 method7232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class46_Sub1_Sub3(this, arg0, arg1) : new Class46_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V")
	@Override
	public void method7233(@OriginalArg(0) boolean arg0) {
		this.aBoolean22 = arg0;
		this.aClass169_2.method5009();
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
	@Override
	public void method7253() {
		Static262.anInt5590 = 10000;
		Static262.anInt5588 = 10000;
		if (this.anInt366 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method7234(this.anInt366);
		this.method7262(0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIF)Lclient!ab;")
	@Override
	public Class2_Sub1 method7293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "()Z")
	@Override
	public boolean method7269() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!wh;Lclient!wh;FLclient!wh;)Lclient!wh;")
	@Override
	public Class78 method7309(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class78 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt359) {
			local8 = this.anInt359;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt379) {
			local21 = this.anInt379;
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
		if (local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt375) {
					local91 = this.anInt375;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt382) {
					local102 = this.anInt382;
				}
				local116 = local91 + local30 * this.anInt360;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray22[local116++] = arg3;
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
				if (local91 < this.anInt375) {
					local91 = this.anInt375;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt382 - 1) {
					local102 = this.anInt382 - 1;
				}
				local116 = local91 + local30 * this.anInt360;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray22[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
		local91 = 256 - local57;
		@Pc(334) int local334;
		@Pc(340) int local340;
		while (local30 < arg1) {
			while (local48 <= local34 || local44 <= local34) {
				local44 += local36 + local36;
				local48 += local36++ + local36;
			}
			local102 = arg0 + 1 - local36;
			if (local102 < this.anInt375) {
				local102 = this.anInt375;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt382) {
				local116 = this.anInt382;
			}
			local118 = local102 + local30 * this.anInt360;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray22[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray22[local118++] = local277 + local360;
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
			if (local102 < this.anInt375) {
				local102 = this.anInt375;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt382 - 1) {
				local116 = this.anInt382 - 1;
			}
			local118 = local102 + local30 * this.anInt360;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray22[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray22[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!pga;")
	public Class261 method578(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt366; local1++) {
			if (this.aClass261Array1[local1].aRunnable2 == arg0) {
				return this.aClass261Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V")
	@Override
	public void method7229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas1 == null || this.aClass2_Sub31_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			this.aClass2_Sub31_1.method5142(0, arg0, this.anInt356, local14, 0, this.anInt354, arg1);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ao", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt358 = (int) (arg1 * 65535.0F);
		this.anInt361 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt365 = (int) (arg3 * 65535.0F / local26);
		this.anInt357 = (int) (arg4 * 65535.0F / local26);
		this.anInt362 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "(I)V")
	@Override
	public void method7299(@OriginalArg(0) int arg0) {
		this.anInt378 = arg0;
		this.aClass169_2.method5009();
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7272(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub31 local8 = (Class2_Sub31) this.aClass99_8.method3056((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method9253();
		local8 = Static356.method5900(arg2, arg0, arg1);
		this.aClass99_8.method3059((long) arg0.hashCode(), local8);
		if (this.aCanvas1 != arg0 || this.aClass160_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt354 = local37.width;
		this.anInt356 = local37.height;
		this.aClass2_Sub31_1 = local8;
		this.anIntArray22 = local8.anIntArray340;
		this.anInt360 = local8.anInt5956;
		this.anInt367 = local8.anInt5959;
		if (this.anInt360 != this.anInt374 || this.anInt367 != this.anInt369) {
			this.anInt363 = this.anInt374 = this.anInt360;
			this.anInt372 = this.anInt369 = this.anInt367;
			this.aFloatArray1 = this.aFloatArray2 = new float[this.anInt374 * this.anInt369];
		}
		this.method571();
	}

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass30_Sub1_1.aFloat107 * (float) arg0 + this.aClass30_Sub1_1.aFloat114 * (float) arg1 + this.aClass30_Sub1_1.aFloat108 * (float) arg2 + this.aClass30_Sub1_1.aFloat115;
		@Pc(49) float local49 = this.aClass30_Sub1_1.aFloat107 * (float) arg3 + this.aClass30_Sub1_1.aFloat114 * (float) arg4 + this.aClass30_Sub1_1.aFloat108 * (float) arg5 + this.aClass30_Sub1_1.aFloat115;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt364 && local49 < (float) this.anInt364) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt373 && local49 > (float) this.anInt373) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt371 * (this.aClass30_Sub1_1.aFloat111 * (float) arg0 + this.aClass30_Sub1_1.aFloat112 * (float) arg1 + this.aClass30_Sub1_1.aFloat110 * (float) arg2 + this.aClass30_Sub1_1.aFloat117) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt371 * (this.aClass30_Sub1_1.aFloat111 * (float) arg3 + this.aClass30_Sub1_1.aFloat112 * (float) arg4 + this.aClass30_Sub1_1.aFloat110 * (float) arg5 + this.aClass30_Sub1_1.aFloat117) / (float) arg6);
		if (local117 < this.anInt384 && local150 < this.anInt384) {
			local51 |= 0x1;
		} else if (local117 > this.anInt383 && local150 > this.anInt383) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt376 * (this.aClass30_Sub1_1.aFloat106 * (float) arg0 + this.aClass30_Sub1_1.aFloat113 * (float) arg1 + this.aClass30_Sub1_1.aFloat109 * (float) arg2 + this.aClass30_Sub1_1.aFloat116) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt376 * (this.aClass30_Sub1_1.aFloat106 * (float) arg3 + this.aClass30_Sub1_1.aFloat113 * (float) arg4 + this.aClass30_Sub1_1.aFloat109 * (float) arg5 + this.aClass30_Sub1_1.aFloat116) / (float) arg6);
		if (local208 < this.anInt370 && local241 < this.anInt370) {
			local51 |= 0x4;
		} else if (local208 > this.anInt381 && local241 > this.anInt381) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "(I)Z")
	public boolean method579(@OriginalArg(0) int arg0) {
		return super.anInterface4_12.method8049(arg0);
	}

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "()Z")
	@Override
	public boolean method7311() {
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt375;
		arg0[1] = this.anInt359;
		arg0[2] = this.anInt382;
		arg0[3] = this.anInt379;
	}

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub2 method7305(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(II)Lclient!he;")
	@Override
	public Interface12 method7268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method7232(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method569(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method569(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
			}
		} else if (arg2 != 0) {
			local32 = arg7 << 8;
			@Pc(143) int local143 = arg5 << 8;
			@Pc(147) int local147 = arg6 << 8;
			local28 = local143 + local147;
			arg7 = local32 % local28;
			@Pc(172) int local172;
			@Pc(176) int local176;
			if (arg2 + arg3 < 0) {
				local172 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
				local176 = local172 % local28;
				local32 = local28 + local143 - arg7 - local176;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(254) int local254;
			@Pc(267) int local267;
			@Pc(349) int local349;
			@Pc(375) int local375;
			@Pc(380) int local380;
			@Pc(237) int local237;
			@Pc(223) int local223;
			@Pc(340) int local340;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local223 = arg3 << 16;
				local172 = (int) Math.floor((double) local223 / (double) arg2 + 0.5D);
				local237 = arg2 + arg0;
				local176 = arg4 >>> 24;
				local254 = (int) Math.sqrt((double) ((local172 >> 8) * (local172 >> 8) + 65536));
				if (local176 == 255) {
					while (arg0 <= local237) {
						local267 = arg1 >> 16;
						if (arg0 >= this.anInt375 && arg0 < this.anInt382 && local267 >= this.anInt359 && local267 < this.anInt379 && arg7 < local143) {
							this.anIntArray22[arg0 + local267 * this.anInt360] = arg4;
						}
						arg1 += local172;
						arg0++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				} else {
					local340 = ((arg4 & 0xFF00FF) * local176 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local176 >> 8 & 0xFF00) + (local176 << 24);
					local267 = 256 - local176;
					while (arg0 <= local237) {
						local349 = arg1 >> 16;
						if (arg0 >= this.anInt375 && arg0 < this.anInt382 && local349 >= this.anInt359 && local349 < this.anInt379 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt360;
							local380 = this.anIntArray22[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray22[local375] = local340 + local380;
						}
						arg1 += local172;
						arg0++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local237 = arg2 << 16;
				local172 = (int) Math.floor((double) local237 / (double) arg3 + 0.5D);
				local223 = arg3 + arg1;
				local176 = arg4 >>> 24;
				local254 = (int) Math.sqrt((double) ((local172 >> 8) * (local172 >> 8) + 65536));
				if (local176 == 255) {
					while (arg1 <= local223) {
						local267 = arg0 >> 16;
						if (arg1 >= this.anInt359 && arg1 < this.anInt379 && local267 >= this.anInt375 && local267 < this.anInt382 && arg7 < local143) {
							this.anIntArray22[local267 + arg1 * this.anInt360] = arg4;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				} else {
					local340 = ((arg4 & 0xFF00FF) * local176 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local176 >> 8 & 0xFF00) + (local176 << 24);
					local267 = 256 - local176;
					while (arg1 <= local223) {
						local349 = arg0 >> 16;
						if (arg1 >= this.anInt359 && arg1 < this.anInt379 && local349 >= this.anInt375 && local349 < this.anInt382 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt360;
							local380 = this.anIntArray22[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray22[local349 + arg1 * this.anInt360] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method575(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method575(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!ao", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "()Lclient!fia;")
	@Override
	public Class108 method7240() {
		return new Class108(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
	@Override
	public void method7262(@OriginalArg(0) int arg0) {
		this.aClass261Array1[arg0].method6828(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7310(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas1 == null || this.aClass2_Sub31_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt360 && local21.y + arg3 <= this.anInt367 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass2_Sub31_1.method5142(local21.y, local21.x + arg2, local21.height, local14, local21.x, local21.width, local21.y + arg3);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ao", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt380;
		this.anInt380 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "(I)I")
	public int method580(@OriginalArg(0) int arg0) {
		return super.anInterface4_12.method8048(arg0).anInt4659;
	}

	@OriginalMember(owner = "client!ao", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt368;
		this.anInt368 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "()I")
	@Override
	public int method7307() {
		return 0;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	@Override
	public void method7249(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt355;
		for (@Pc(9) Object local9 = this.aClass169_2.method5007(); local9 != null; local9 = this.aClass169_2.method4998()) {
			@Pc(13) Class2_Sub35 local13 = (Class2_Sub35) local9;
			if (local13.aBoolean507) {
				local13.anInt6940 += local4;
				@Pc(27) int local27 = local13.anInt6940 / 20;
				if (local27 > 0) {
					@Pc(36) Class127 local36 = super.anInterface4_12.method8048(local13.anInt6942);
					local13.method5932(local36.aByte73 * local4 * 50 / 1000, local36.aByte77 * local4 * 50 / 1000);
					local13.anInt6940 -= local27 * 20;
				}
				local13.aBoolean507 = false;
			}
		}
		this.anInt355 = arg0;
		this.aClass169_3.method4997(5);
		this.aClass169_2.method4997(5);
	}

	@OriginalMember(owner = "client!ao", name = "t", descriptor = "()Z")
	@Override
	public boolean method7297() {
		return true;
	}

	@OriginalMember(owner = "client!ao", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass30_Sub1_1.aFloat115 + this.aClass30_Sub1_1.aFloat107 * (float) arg0 + this.aClass30_Sub1_1.aFloat114 * (float) arg1 + this.aClass30_Sub1_1.aFloat108 * (float) arg2;
		if (local24 < (float) this.anInt364 || local24 > (float) this.anInt373) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt371 * (this.aClass30_Sub1_1.aFloat117 + this.aClass30_Sub1_1.aFloat111 * (float) arg0 + this.aClass30_Sub1_1.aFloat112 * (float) arg1 + this.aClass30_Sub1_1.aFloat110 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt376 * (this.aClass30_Sub1_1.aFloat116 + this.aClass30_Sub1_1.aFloat106 * (float) arg0 + this.aClass30_Sub1_1.aFloat113 * (float) arg1 + this.aClass30_Sub1_1.aFloat109 * (float) arg2) / local24);
		if (local81 >= this.anInt384 && local81 <= this.anInt383 && local113 >= this.anInt370 && local113 <= this.anInt381) {
			arg3[0] = local81 - this.anInt384;
			arg3[1] = local113 - this.anInt370;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "()V")
	@Override
	public void method7276() {
	}

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "()Z")
	@Override
	public boolean method7247() {
		return false;
	}

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "()V")
	@Override
	public void method7266() {
		this.aClass169_2.method5009();
		this.aClass169_3.method5009();
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(II)I")
	@Override
	public int method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "(I)Z")
	public boolean method581(@OriginalArg(0) int arg0) {
		return this.aBoolean22 || super.anInterface4_12.method8048(arg0).aBoolean335;
	}
}
