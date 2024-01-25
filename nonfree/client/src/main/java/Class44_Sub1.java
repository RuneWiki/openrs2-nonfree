import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
	private boolean aBoolean38;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
	private int anInt861;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Lclient!ih;")
	private Class4_Sub12 aClass4_Sub12_1;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Z")
	private boolean aBoolean39;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Lclient!waa;")
	private Class350 aClass350_5;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	public int anInt862;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
	private int anInt863;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
	public int anInt864;

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
	private int anInt865;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
	public int anInt866;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "Lclient!mq;")
	private final Class223 aClass223_8;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "[I")
	public int[] anIntArray32;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
	public int anInt867;

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
	public int anInt868;

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
	public int anInt869;

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
	public int anInt870;

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
	public int anInt871;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "Lclient!ae;")
	public Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "Lclient!mq;")
	private final Class223 aClass223_9;

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
	public int anInt872;

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "[I")
	public int[] anIntArray33;

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
	public int anInt873;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
	public int anInt874;

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
	public int anInt875;

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
	public int anInt877;

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
	public int anInt878;

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
	public int anInt879;

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "Lclient!f;")
	private Class78 aClass78_2;

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "Z")
	private boolean aBoolean40;

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
	public int anInt880;

	@OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
	public int anInt881;

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
	public int anInt882;

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
	public int anInt884;

	@OriginalMember(owner = "client!cb", name = "ab", descriptor = "[Lclient!qr;")
	private Class277[] aClass277Array1;

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
	public int anInt885;

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
	public int anInt886;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
	public int anInt888;

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!cb", name = "gb", descriptor = "Lclient!f;")
	private Class78 aClass78_3;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public Class44_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1) {
		this(arg1);
		this.method5012(arg0);
		this.method4966(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!fa;)V")
	private Class44_Sub1(@OriginalArg(0) Interface11 arg0) {
		super(arg0);
		this.aBoolean38 = false;
		this.aBoolean39 = false;
		this.aClass350_5 = new Class350(4);
		this.anInt863 = 0;
		this.anInt868 = 45823;
		this.anInt865 = 0;
		this.anInt873 = 0;
		this.anInt874 = 50;
		this.anInt877 = 3500;
		this.anInt866 = 0;
		this.anInt880 = 78642;
		this.anInt878 = 75518;
		this.aBoolean40 = false;
		this.anInt882 = 512;
		this.anInt881 = 512;
		this.anInt875 = 0;
		this.anInt885 = 0;
		this.aClass223_8 = new Class223(16);
		this.anInt889 = -1;
		this.aClass223_9 = new Class223(256);
		this.aClass8_Sub1_1 = new Class8_Sub1();
		this.method4991(1);
		this.method5038(0);
		Static512.method7483(true, false);
		this.aBoolean39 = true;
		this.anInt861 = (int) Static574.method8210();
	}

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "()Z")
	@Override
	public boolean method4989() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass8_Sub1_1.aFloat11 * (float) arg0 + this.aClass8_Sub1_1.aFloat5 * (float) arg1 + this.aClass8_Sub1_1.aFloat14 * (float) arg2 + this.aClass8_Sub1_1.aFloat7;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass8_Sub1_1.aFloat11 * (float) arg3 + this.aClass8_Sub1_1.aFloat5 * (float) arg4 + this.aClass8_Sub1_1.aFloat14 * (float) arg5 + this.aClass8_Sub1_1.aFloat7;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt874 && local55 < (float) this.anInt874 || !(!(local24 > (float) this.anInt877) || !(local55 > (float) this.anInt877))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt882 * (this.aClass8_Sub1_1.aFloat8 * (float) arg0 + this.aClass8_Sub1_1.aFloat4 * (float) arg1 + this.aClass8_Sub1_1.aFloat13 * (float) arg2 + this.aClass8_Sub1_1.aFloat6) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt882 * (this.aClass8_Sub1_1.aFloat8 * (float) arg3 + this.aClass8_Sub1_1.aFloat4 * (float) arg4 + this.aClass8_Sub1_1.aFloat13 * (float) arg5 + this.aClass8_Sub1_1.aFloat6) / local55);
		if (local119 < this.anInt872 && local151 < this.anInt872 || local119 > this.anInt869 && local151 > this.anInt869) {
			return false;
		} else {
			@Pc(201) int local201 = (int) ((float) this.anInt881 * (this.aClass8_Sub1_1.aFloat10 * (float) arg0 + this.aClass8_Sub1_1.aFloat12 * (float) arg1 + this.aClass8_Sub1_1.aFloat3 * (float) arg2 + this.aClass8_Sub1_1.aFloat9) / local24);
			@Pc(233) int local233 = (int) ((float) this.anInt881 * (this.aClass8_Sub1_1.aFloat10 * (float) arg3 + this.aClass8_Sub1_1.aFloat12 * (float) arg4 + this.aClass8_Sub1_1.aFloat3 * (float) arg5 + this.aClass8_Sub1_1.aFloat9) / local55);
			return (local201 >= this.anInt879 || local233 >= this.anInt879) && (local201 <= this.anInt871 || local233 <= this.anInt871);
		}
	}

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt886, this.anInt884, this.anInt882, this.anInt881 };
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "()V")
	@Override
	public void method4990() {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!qr;")
	public Class277 method912(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt888; local1++) {
			if (this.aClass277Array1[local1].aRunnable2 == arg0) {
				return this.aClass277Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass277Array1.length; local1++) {
			this.aClass277Array1[local1].anInt8162 = this.aClass277Array1[local1].anInt8164;
			this.aClass277Array1[local1].aBoolean566 = false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)Lclient!caa;")
	@Override
	public Class36 method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4998() {
		@Pc(3) Class277 local3 = this.method912(Thread.currentThread());
		@Pc(6) Class327 local6 = local3.aClass327_2;
		local6.aBoolean657 = false;
		@Pc(14) int local14 = 5 - this.anInt872;
		@Pc(19) int local19 = 75 - this.anInt872;
		@Pc(24) int local24 = 15 - this.anInt872;
		@Pc(29) int local29 = 10 - this.anInt879;
		@Pc(34) int local34 = 50 - this.anInt879;
		@Pc(39) int local39 = 90 - this.anInt879;
		local6.aBoolean663 = local14 < 0 || local14 > local6.anInt9431 || local19 < 0 || local19 > local6.anInt9431 || local24 < 0 || local24 > local6.anInt9431;
		local6.aBoolean662 = true;
		local6.anInt9428 = 0;
		local6.aBoolean659 = false;
		local6.method7680(local29, local34, local39, local14, local19, local24, 0, 0, 0, -65536, -65536, -65536);
		local6.aBoolean657 = true;
		local6.aBoolean662 = false;
	}

	@OriginalMember(owner = "client!cb", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass8_Sub1_1.aFloat7 + this.aClass8_Sub1_1.aFloat11 * (float) arg0 + this.aClass8_Sub1_1.aFloat5 * (float) arg1 + this.aClass8_Sub1_1.aFloat14 * (float) arg2;
		if (local24 < (float) this.anInt874 || local24 > (float) this.anInt877) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt882 * (this.aClass8_Sub1_1.aFloat6 + this.aClass8_Sub1_1.aFloat8 * (float) arg0 + this.aClass8_Sub1_1.aFloat4 * (float) arg1 + this.aClass8_Sub1_1.aFloat13 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt881 * (this.aClass8_Sub1_1.aFloat9 + this.aClass8_Sub1_1.aFloat10 * (float) arg0 + this.aClass8_Sub1_1.aFloat12 * (float) arg1 + this.aClass8_Sub1_1.aFloat3 * (float) arg2) / local24);
		arg3[0] = local81 - this.anInt872;
		arg3[1] = local113 - this.anInt879;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method4995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class6 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class6_Sub1 local2 = (Class6_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray7;
		@Pc(8) int[] local8 = local2.anIntArray8;
		@Pc(17) int local17 = this.anInt873 > arg7 ? this.anInt873 : arg7;
		@Pc(32) int local32 = this.anInt885 < arg7 + local5.length ? this.anInt885 : arg7 + local5.length;
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
					if (local129 >= this.anInt875 && local129 < this.anInt866 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray32[local129 + arg1 * this.anInt870] = arg4;
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
					if (local133 >= this.anInt875 && local133 < this.anInt866 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt870;
						local248 = this.anIntArray32[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray32[local133 + arg1 * this.anInt870] = local201 + local584;
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
		if (arg0 < this.anInt875) {
			arg1 += local83 * (this.anInt875 - arg0);
			arg0 = this.anInt875;
		}
		if (arg2 >= this.anInt866) {
			arg2 = this.anInt866 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray32[arg0 + local129 * this.anInt870] = arg4;
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
					local243 = arg0 + local133 * this.anInt870;
					local248 = this.anIntArray32[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray32[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "()Z")
	@Override
	public boolean method4975() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(I)Z")
	public boolean method913(@OriginalArg(0) int arg0) {
		return super.anInterface11_11.method7407(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5020() {
		return this.aClass8_Sub1_1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class83 method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class83_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)V")
	@Override
	public void method5042(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)Lclient!e;")
	@Override
	public Class4_Sub8 method5027(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4986(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas1 == null || this.aClass4_Sub12_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt870 && local21.y <= this.anInt876 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass4_Sub12_1.method6129(local21.height, local21.y, local21.x, local14, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5012(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub12 local8 = (Class4_Sub12) this.aClass350_5.method8207((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static394.method6250(arg0);
			this.aClass350_5.method8199((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!cb", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class6_Sub1 local2 = (Class6_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray7;
		@Pc(8) int[] local8 = local2.anIntArray8;
		@Pc(20) int local20;
		if (this.anInt885 < arg3 + local5.length) {
			local20 = this.anInt885 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt873 > arg3) {
			local33 = this.anInt873 - arg3;
			arg3 = this.anInt873;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt870;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt875 > local58) {
				local62 -= this.anInt875 - local58;
				local58 = this.anInt875;
			}
			if (this.anInt866 < local58 + local62) {
				local62 = this.anInt866 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray32[local58++] = arg0;
			}
			local49 += this.anInt870;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I")
	@Override
	public int method5010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!cb", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "()V")
	private void method914() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt888; local1++) {
			this.aClass277Array1[local1].method6782();
		}
		this.JA();
	}

	@OriginalMember(owner = "client!cb", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class277 local3 = this.method912(Thread.currentThread());
		this.anInt874 = arg0;
		this.anInt877 = arg1;
		local3.anInt8169 = this.anInt877 - 255;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method4988(@OriginalArg(0) Class4_Sub8 arg0) {
	}

	@OriginalMember(owner = "client!cb", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt874;
	}

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "()V")
	@Override
	public void method5013() throws Exception_Sub1 {
		if (this.aCanvas1 == null || this.aClass4_Sub12_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			this.aClass4_Sub12_1.method6130(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!so;)V")
	@Override
	public void method5017(@OriginalArg(0) Class305 arg0) {
		@Pc(3) Class277 local3 = this.method912(Thread.currentThread());
		@Pc(7) Class1_Sub1 local7 = arg0.aClass224_1.aClass1_Sub1_7;
		for (@Pc(10) Class1_Sub1 local10 = local7.aClass1_Sub1_10; local10 != local7; local10 = local10.aClass1_Sub1_10) {
			@Pc(14) Class1_Sub1_Sub1 local14 = (Class1_Sub1_Sub1) local10;
			@Pc(19) int local19 = local14.anInt72 >> 12;
			@Pc(24) int local24 = local14.anInt71 >> 12;
			@Pc(29) int local29 = local14.anInt73 >> 12;
			@Pc(54) float local54 = this.aClass8_Sub1_1.aFloat7 + this.aClass8_Sub1_1.aFloat11 * (float) local19 + this.aClass8_Sub1_1.aFloat5 * (float) local24 + this.aClass8_Sub1_1.aFloat14 * (float) local29;
			if (!(local54 < (float) this.anInt874) && !(local54 > (float) local3.anInt8169)) {
				@Pc(102) int local102 = this.anInt886 + (int) ((float) this.anInt882 * (this.aClass8_Sub1_1.aFloat6 + this.aClass8_Sub1_1.aFloat8 * (float) local19 + this.aClass8_Sub1_1.aFloat4 * (float) local24 + this.aClass8_Sub1_1.aFloat13 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt884 + (int) ((float) this.anInt881 * (this.aClass8_Sub1_1.aFloat9 + this.aClass8_Sub1_1.aFloat10 * (float) local19 + this.aClass8_Sub1_1.aFloat12 * (float) local24 + this.aClass8_Sub1_1.aFloat3 * (float) local29) / local54);
				if (local102 >= this.anInt875 && local102 <= this.anInt866 && local137 >= this.anInt873 && local137 <= this.anInt885) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method918(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt70 * this.anInt882 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "()Z")
	@Override
	public boolean method4976() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "(I)[I")
	public int[] method915(@OriginalArg(0) int arg0) {
		@Pc(2) Class223 local2 = this.aClass223_9;
		@Pc(12) Class4_Sub45 local12;
		synchronized (this.aClass223_9) {
			local12 = (Class4_Sub45) this.aClass223_9.method5388((long) arg0);
			if (local12 == null) {
				if (!super.anInterface11_11.method7407(arg0)) {
					return null;
				}
				@Pc(32) Class14 local32 = super.anInterface11_11.method7405(arg0);
				@Pc(42) int local42 = local32.aBoolean12 || this.aBoolean40 ? 64 : 128;
				local12 = new Class4_Sub45(arg0, local42, super.anInterface11_11.method7408(local42, true, local42, arg0, 0.7F), local32.aBoolean13);
				this.aClass223_9.method5394(local12, (long) arg0);
			}
		}
		local12.aBoolean638 = true;
		return local12.method7451();
	}

	@OriginalMember(owner = "client!cb", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass277Array1.length; local1++) {
			@Pc(7) Class277 local7 = this.aClass277Array1[local1];
			local7.anInt8162 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt8162 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt8162 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt8162 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt8162 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean568 = false;
			} else {
				local7.aBoolean568 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt873) {
			local8 = this.anInt873;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt885) {
			local21 = this.anInt885;
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
				if (local91 < this.anInt875) {
					local91 = this.anInt875;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt866) {
					local102 = this.anInt866;
				}
				local116 = local91 + local30 * this.anInt870;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray32[local116++] = arg3;
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
				if (local91 < this.anInt875) {
					local91 = this.anInt875;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt866 - 1) {
					local102 = this.anInt866 - 1;
				}
				local116 = local91 + local30 * this.anInt870;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray32[local116++] = arg3;
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
			if (local102 < this.anInt875) {
				local102 = this.anInt875;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt866) {
				local116 = this.anInt866;
			}
			local118 = local102 + local30 * this.anInt870;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray32[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray32[local118++] = local277 + local360;
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
			if (local102 < this.anInt875) {
				local102 = this.anInt875;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt866 - 1) {
				local116 = this.anInt866 - 1;
			}
			local118 = local102 + local30 * this.anInt870;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray32[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray32[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "()V")
	@Override
	public void method5003() {
	}

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "()V")
	private void method916() {
		this.anInt872 = this.anInt875 - this.anInt886;
		this.anInt869 = this.anInt866 - this.anInt886;
		this.anInt879 = this.anInt873 - this.anInt884;
		this.anInt871 = this.anInt885 - this.anInt884;
		for (@Pc(29) int local29 = 0; local29 < this.anInt888; local29++) {
			@Pc(36) Class327 local36 = this.aClass277Array1[local29].aClass327_2;
			local36.anInt9429 = this.anInt886 - this.anInt875;
			local36.anInt9427 = this.anInt884 - this.anInt873;
			local36.anInt9431 = this.anInt866 - this.anInt875;
			local36.anInt9432 = this.anInt885 - this.anInt873;
		}
		@Pc(78) int local78 = this.anInt873 * this.anInt870 + this.anInt875;
		for (@Pc(81) int local81 = this.anInt873; local81 < this.anInt885; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt888; local84++) {
				this.aClass277Array1[local84].aClass327_2.anIntArray508[local81 - this.anInt873] = local78;
			}
			local78 += this.anInt870;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class277 local3 = this.method912(Thread.currentThread());
		@Pc(6) Class327 local6 = local3.aClass327_2;
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
		@Pc(105) int local105 = arg0 - local6.method7696();
		@Pc(110) int local110 = arg1 - local6.method7691();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt9428 = 0;
		this.ZA(false);
		local6.aBoolean663 = local114 < 0 || local114 > local6.anInt9431 || local118 < 0 || local118 > local6.anInt9431 || local124 < 0 || local124 > local6.anInt9431;
		local6.method7686(local134, local138, local144, local114, local118, local124, 100, 100, 100, arg4);
		local6.aBoolean663 = local114 < 0 || local114 > local6.anInt9431 || local124 < 0 || local124 > local6.anInt9431 || local130 < 0 || local130 > local6.anInt9431;
		local6.method7686(local134, local144, local150, local114, local124, local130, 100, 100, 100, arg4);
		this.ZA(true);
	}

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "()V")
	@Override
	public void method5039() {
		if (this.aCanvas1 == null) {
			this.anInt870 = 1;
			this.anInt876 = 1;
			this.anIntArray32 = null;
		} else {
			this.anIntArray32 = this.aClass4_Sub12_1.anIntArray376;
			this.anInt870 = this.aClass4_Sub12_1.anInt7426;
			this.anInt876 = this.aClass4_Sub12_1.anInt7429;
		}
		this.aClass78_2 = null;
		this.method914();
	}

	@OriginalMember(owner = "client!cb", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class277 local3 = this.method912(Thread.currentThread());
		local3.anInt8168 = arg0;
		local3.anInt8162 = arg1;
		local3.anInt8167 = arg2;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIF)Lclient!ul;")
	@Override
	public Class4_Sub24 method4979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!so;I)V")
	@Override
	public void method5026(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class277 local3 = this.method912(Thread.currentThread());
		@Pc(7) Class1_Sub1 local7 = arg0.aClass224_1.aClass1_Sub1_7;
		for (@Pc(10) Class1_Sub1 local10 = local7.aClass1_Sub1_10; local10 != local7; local10 = local10.aClass1_Sub1_10) {
			@Pc(14) Class1_Sub1_Sub1 local14 = (Class1_Sub1_Sub1) local10;
			@Pc(19) int local19 = local14.anInt72 >> 12;
			@Pc(24) int local24 = local14.anInt71 >> 12;
			@Pc(29) int local29 = local14.anInt73 >> 12;
			@Pc(54) float local54 = this.aClass8_Sub1_1.aFloat7 + this.aClass8_Sub1_1.aFloat11 * (float) local19 + this.aClass8_Sub1_1.aFloat5 * (float) local24 + this.aClass8_Sub1_1.aFloat14 * (float) local29;
			if (!(local54 < (float) this.anInt874) && !(local54 > (float) local3.anInt8169)) {
				@Pc(103) int local103 = this.anInt886 + (int) ((float) this.anInt882 * (this.aClass8_Sub1_1.aFloat6 + this.aClass8_Sub1_1.aFloat8 * (float) local19 + this.aClass8_Sub1_1.aFloat4 * (float) local24 + this.aClass8_Sub1_1.aFloat13 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt884 + (int) ((float) this.anInt881 * (this.aClass8_Sub1_1.aFloat9 + this.aClass8_Sub1_1.aFloat10 * (float) local19 + this.aClass8_Sub1_1.aFloat12 * (float) local24 + this.aClass8_Sub1_1.aFloat3 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt875 && local103 <= this.anInt866 && local139 >= this.anInt873 && local139 <= this.anInt885) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method918(local14, local103, local139, (int) local54, (local14.anInt70 * this.anInt882 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(I)[I")
	private int[] method917(@OriginalArg(0) int arg0) {
		@Pc(2) Class223 local2 = this.aClass223_9;
		@Pc(12) Class4_Sub45 local12;
		synchronized (this.aClass223_9) {
			local12 = (Class4_Sub45) this.aClass223_9.method5388((long) arg0);
			if (local12 == null) {
				if (!super.anInterface11_11.method7407(arg0)) {
					return null;
				}
				@Pc(32) Class14 local32 = super.anInterface11_11.method7405(arg0);
				@Pc(42) int local42 = local32.aBoolean12 || this.aBoolean40 ? 64 : 128;
				local12 = new Class4_Sub45(arg0, local42, super.anInterface11_11.method7406(local42, arg0, local42, 0.7F), local32.aBoolean13);
				this.aClass223_9.method5394(local12, (long) arg0);
			}
		}
		local12.aBoolean638 = true;
		return local12.method7451();
	}

	@OriginalMember(owner = "client!cb", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt875;
		arg0[1] = this.anInt873;
		arg0[2] = this.anInt866;
		arg0[3] = this.anInt885;
	}

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "()V")
	@Override
	protected void method5029() {
		if (this.aBoolean39) {
			Static177.method7477(true, false);
			this.aBoolean39 = false;
		}
		this.aClass4_Sub12_1 = null;
		this.aCanvas1 = null;
		this.aClass350_5 = null;
		this.aBoolean38 = true;
	}

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5025() {
		return new Class8_Sub1();
	}

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt875) {
			arg2 -= this.anInt875 - arg0;
			arg0 = this.anInt875;
		}
		if (arg1 < this.anInt873) {
			arg3 -= this.anInt873 - arg1;
			arg1 = this.anInt873;
		}
		if (arg0 + arg2 > this.anInt866) {
			arg2 = this.anInt866 - arg0;
		}
		if (arg1 + arg3 > this.anInt885) {
			arg3 = this.anInt885 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt866 || arg1 > this.anInt885) {
			return;
		}
		@Pc(67) int local67 = this.anInt870 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt870;
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
						local217 = this.anIntArray32[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray32[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray32[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray32[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray32[arg2] = arg4;
					arg2++;
					this.anIntArray32[arg2] = arg4;
					arg2++;
					this.anIntArray32[arg2] = arg4;
					arg2++;
					this.anIntArray32[arg2] = arg4;
					arg2++;
					this.anIntArray32[arg2] = arg4;
					arg2++;
					this.anIntArray32[arg2] = arg4;
					arg2++;
					this.anIntArray32[arg2] = arg4;
					arg2++;
					this.anIntArray32[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray32[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	@Override
	public void method4980(@OriginalArg(0) int arg0) {
		this.aClass277Array1[arg0].method6784(null);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[Lclient!ul;)V")
	@Override
	public void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub24[] arg1) {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class6 method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class6_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "()Z")
	@Override
	public boolean method5019() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "()Lclient!ik;")
	@Override
	public Class155 method4985() {
		return new Class155(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!mca;IIII)V")
	private void method918(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt74;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method920(arg1, arg2, arg3, arg4, arg0.anInt69, 1);
			return;
		}
		if (this.anInt889 != local2) {
			@Pc(33) Class78 local33 = (Class78) this.aClass223_8.method5388((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method917(local2);
				if (local39 == null) {
					return;
				}
				@Pc(49) int local49 = this.method922(local2) ? 64 : 128;
				local33 = this.method4969(local39, local49, local49, local49);
				this.aClass223_8.method5394(local33, (long) local2);
			}
			this.anInt889 = local2;
			this.aClass78_3 = local33;
		}
		local8++;
		((Class78_Sub2) this.aClass78_3).method7010(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt69, 1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
	@Override
	public void method5036(@OriginalArg(0) boolean arg0) {
		this.aBoolean40 = arg0;
		this.aClass223_9.method5398();
	}

	@OriginalMember(owner = "client!cb", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		this.anInt878 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt875 || arg0 >= this.anInt866) {
			return;
		}
		if (arg1 < this.anInt873) {
			arg2 -= this.anInt873 - arg1;
			arg1 = this.anInt873;
		}
		if (arg1 + arg2 > this.anInt885) {
			arg2 = this.anInt885 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt870;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray32[local40 + local54 * this.anInt870] = arg3;
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
				local111 = local40 + local103 * this.anInt870;
				local116 = this.anIntArray32[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray32[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt870;
				local111 = this.anIntArray32[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray32[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class78 method5035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class78_Sub2_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(2) int local2 = this.anInt865;
		this.anInt865 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4994(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas1 == arg0) {
			this.method4966(null);
		}
		@Pc(15) Class4_Sub12 local15 = (Class4_Sub12) this.aClass350_5.method8207((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8379();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!kk;IIII)Lclient!da;")
	@Override
	public Class57 method5016(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!cb", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt875 = 0;
		this.anInt873 = 0;
		this.anInt866 = this.anInt870;
		this.anInt885 = this.anInt876;
		this.method916();
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	@Override
	public void method4991(@OriginalArg(0) int arg0) {
		this.anInt888 = arg0;
		this.aClass277Array1 = new Class277[this.anInt888];
		for (@Pc(9) int local9 = 0; local9 < this.anInt888; local9++) {
			this.aClass277Array1[local9] = new Class277(this);
		}
	}

	@OriginalMember(owner = "client!cb", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass8_Sub1_1.aFloat7 + this.aClass8_Sub1_1.aFloat11 * (float) arg0 + this.aClass8_Sub1_1.aFloat5 * (float) arg1 + this.aClass8_Sub1_1.aFloat14 * (float) arg2;
		if (local24 < (float) this.anInt874 || local24 > (float) this.anInt877) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt882 * (this.aClass8_Sub1_1.aFloat6 + this.aClass8_Sub1_1.aFloat8 * (float) arg0 + this.aClass8_Sub1_1.aFloat4 * (float) arg1 + this.aClass8_Sub1_1.aFloat13 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt881 * (this.aClass8_Sub1_1.aFloat9 + this.aClass8_Sub1_1.aFloat10 * (float) arg0 + this.aClass8_Sub1_1.aFloat12 * (float) arg1 + this.aClass8_Sub1_1.aFloat3 * (float) arg2) / local24);
		if (local81 >= this.anInt872 && local81 <= this.anInt869 && local113 >= this.anInt879 && local113 <= this.anInt871) {
			arg3[0] = local81 - this.anInt872;
			arg3[1] = local113 - this.anInt879;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt877;
	}

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt875 < arg0) {
			this.anInt875 = arg0;
		}
		if (this.anInt873 < arg1) {
			this.anInt873 = arg1;
		}
		if (this.anInt866 > arg2) {
			this.anInt866 = arg2;
		}
		if (this.anInt885 > arg3) {
			this.anInt885 = arg3;
		}
		this.method916();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4992(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "()V")
	@Override
	public void method5009() {
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4968(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub12 local8 = (Class4_Sub12) this.aClass350_5.method8207((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8379();
		local8 = Static394.method6250(arg0);
		this.aClass350_5.method8199((long) arg0.hashCode(), local8);
		if (this.aCanvas1 != arg0 || this.aClass78_2 != null) {
			return;
		}
		this.aClass4_Sub12_1 = local8;
		this.anIntArray32 = local8.anIntArray376;
		this.anInt870 = local8.anInt7426;
		this.anInt876 = local8.anInt7429;
		if (this.anInt870 != this.anInt883 || this.anInt876 != this.anInt887) {
			this.anInt883 = this.anInt870;
			this.anInt887 = this.anInt876;
			this.anIntArray33 = new int[this.anInt883 * this.anInt887];
		}
		this.method914();
	}

	@OriginalMember(owner = "client!cb", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt886 = arg0;
		this.anInt884 = arg1;
		this.anInt882 = arg2;
		this.anInt881 = arg3;
		this.method916();
	}

	@OriginalMember(owner = "client!cb", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt873 || arg1 >= this.anInt885) {
			return;
		}
		if (arg0 < this.anInt875) {
			arg2 -= this.anInt875 - arg0;
			arg0 = this.anInt875;
		}
		if (arg0 + arg2 > this.anInt866) {
			arg2 = this.anInt866 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt870;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray32[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray32[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray32[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray32[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray32[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "()Z")
	@Override
	public boolean method5028() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class277 local3 = this.method912(Thread.currentThread());
		local3.aBoolean567 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt870) {
			arg2 = this.anInt870;
		}
		if (arg3 > this.anInt876) {
			arg3 = this.anInt876;
		}
		this.anInt875 = arg0;
		this.anInt866 = arg2;
		this.anInt873 = arg1;
		this.anInt885 = arg3;
		this.method916();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4966(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas1 = null;
			this.aClass4_Sub12_1 = null;
			if (this.aClass78_2 == null) {
				this.anIntArray32 = null;
				this.anInt870 = this.anInt876 = 1;
				this.anInt883 = this.anInt887 = 1;
				this.method914();
			}
			return;
		}
		@Pc(10) Class4_Sub12 local10 = (Class4_Sub12) this.aClass350_5.method8207((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas1 = arg0;
		this.aClass4_Sub12_1 = local10;
		if (this.aClass78_2 != null) {
			return;
		}
		this.anIntArray32 = local10.anIntArray376;
		this.anInt870 = local10.anInt7426;
		this.anInt876 = local10.anInt7429;
		if (this.anInt870 != this.anInt883 || this.anInt876 != this.anInt887) {
			this.anInt883 = this.anInt870;
			this.anInt887 = this.anInt876;
			this.anIntArray33 = new int[this.anInt883 * this.anInt887];
		}
		this.method914();
		return;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	@Override
	public void method5031(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()Z")
	@Override
	public boolean method4965() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt875 == 0 && this.anInt866 == this.anInt870 && this.anInt873 == 0 && this.anInt885 == this.anInt876) {
			local19 = this.anIntArray33.length;
			local25 = local19 - local19 & 0x7;
			local27 = 0;
			while (local27 < local25) {
				this.anIntArray33[local27++] = Integer.MAX_VALUE;
				this.anIntArray33[local27++] = Integer.MAX_VALUE;
				this.anIntArray33[local27++] = Integer.MAX_VALUE;
				this.anIntArray33[local27++] = Integer.MAX_VALUE;
				this.anIntArray33[local27++] = Integer.MAX_VALUE;
				this.anIntArray33[local27++] = Integer.MAX_VALUE;
				this.anIntArray33[local27++] = Integer.MAX_VALUE;
				this.anIntArray33[local27++] = Integer.MAX_VALUE;
			}
			while (local27 < local19) {
				this.anIntArray33[local27++] = Integer.MAX_VALUE;
			}
			return;
		}
		local19 = this.anInt866 - this.anInt875;
		local25 = this.anInt885 - this.anInt873;
		local27 = this.anInt870 - local19;
		@Pc(116) int local116 = this.anInt875 + this.anInt873 * this.anInt870;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.anIntArray33[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray33[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray33[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray33[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray33[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray33[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray33[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray33[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.anIntArray33[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "()Z")
	@Override
	public boolean method5004() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "()V")
	@Override
	public void method4984() {
		this.aClass223_9.method5398();
		this.aClass223_8.method5398();
	}

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(2) int local2 = this.anInt863;
		this.anInt863 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIIIIIIII)V")
	public void method919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface11_11.method7405(arg6).aBoolean11) {
			this.method920(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt889 != arg6) {
			@Pc(26) Class78 local26 = (Class78) this.aClass223_8.method5388((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method917(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method922(arg6) ? 64 : 128;
				local26 = this.method4969(local32, local43, local43, local43);
				this.aClass223_8.method5394(local26, (long) arg6);
			}
			this.anInt889 = arg6;
			this.aClass78_3 = local26;
		}
		((Class78_Sub2) this.aClass78_3).method7010(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "()Z")
	@Override
	public boolean method4993() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "()Lclient!q;")
	@Override
	public Class8 method5007() {
		@Pc(3) Class277 local3 = this.method912(Thread.currentThread());
		return local3.aClass8_Sub1_3;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(IIIIII)V")
	private void method920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg2 << 8;
		@Pc(12) int local12 = arg1 - arg3;
		if (local12 < this.anInt873) {
			local12 = this.anInt873;
		}
		@Pc(25) int local25 = arg1 + arg3 + 1;
		if (local25 > this.anInt885) {
			local25 = this.anInt885;
		}
		@Pc(34) int local34 = local12;
		@Pc(38) int local38 = arg3 * arg3;
		@Pc(40) int local40 = 0;
		@Pc(44) int local44 = arg1 - local12;
		@Pc(48) int local48 = local44 * local44;
		@Pc(52) int local52 = local48 - local44;
		if (arg1 > local25) {
			arg1 = local25;
		}
		@Pc(61) int local61 = arg4 >>> 24;
		@Pc(95) int local95;
		@Pc(106) int local106;
		@Pc(120) int local120;
		@Pc(122) int local122;
		if (arg5 == 0 || arg5 == 1 && local61 == 255) {
			while (local34 < arg1) {
				while (local52 <= local38 || local48 <= local38) {
					local48 += local40 + local40;
					local52 += local40++ + local40;
				}
				local95 = arg0 + 1 - local40;
				if (local95 < this.anInt875) {
					local95 = this.anInt875;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt866) {
					local106 = this.anInt866;
				}
				local120 = local95 + local34 * this.anInt870;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray33[local120]) {
						this.anIntArray32[local120] = arg4;
					}
					local120++;
				}
				local34++;
				local48 -= local44-- + local44;
				local52 -= local44 + local44;
			}
			local40 = arg3;
			local44 = local34 - arg1;
			local52 = local44 * local44 + local38;
			local48 = local52 - arg3;
			local52 -= local44;
			while (local34 < local25) {
				while (local52 > local38 && local48 > local38) {
					local52 -= local40-- + local40;
					local48 -= local40 + local40;
				}
				local95 = arg0 - local40;
				if (local95 < this.anInt875) {
					local95 = this.anInt875;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt866 - 1) {
					local106 = this.anInt866 - 1;
				}
				local120 = local95 + local34 * this.anInt870;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray33[local120]) {
						this.anIntArray32[local120] = arg4;
					}
					local120++;
				}
				local34++;
				local52 += local44 + local44;
				local48 += local44++ + local44;
			}
			return;
		}
		@Pc(350) int local350;
		@Pc(362) int local362;
		if (arg5 == 1) {
			@Pc(293) int local293 = ((arg4 & 0xFF00FF) * local61 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local61 >> 8 & 0xFF00) + (local61 << 24);
			local95 = 256 - local61;
			while (local34 < arg1) {
				while (local52 <= local38 || local48 <= local38) {
					local48 += local40 + local40;
					local52 += local40++ + local40;
				}
				local106 = arg0 + 1 - local40;
				if (local106 < this.anInt875) {
					local106 = this.anInt875;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt866) {
					local120 = this.anInt866;
				}
				local122 = local106 + local34 * this.anInt870;
				for (local350 = local106; local350 < local120; local350++) {
					if (local8 < this.anIntArray33[local122]) {
						local362 = this.anIntArray32[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray32[local122] = local293 + local362;
					}
					local122++;
				}
				local34++;
				local48 -= local44-- + local44;
				local52 -= local44 + local44;
			}
			local40 = arg3;
			local44 = -local44;
			local52 = local44 * local44 + local38;
			local48 = local52 - arg3;
			local52 -= local44;
			while (local34 < local25) {
				while (local52 > local38 && local48 > local38) {
					local52 -= local40-- + local40;
					local48 -= local40 + local40;
				}
				local106 = arg0 - local40;
				if (local106 < this.anInt875) {
					local106 = this.anInt875;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt866 - 1) {
					local120 = this.anInt866 - 1;
				}
				local122 = local106 + local34 * this.anInt870;
				for (local350 = local106; local350 <= local120; local350++) {
					if (local8 < this.anIntArray33[local122]) {
						local362 = this.anIntArray32[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray32[local122] = local293 + local362;
					}
					local122++;
				}
				local34++;
				local52 += local44 + local44;
				local48 += local44++ + local44;
			}
		} else if (arg5 == 2) {
			@Pc(627) int local627;
			while (local34 < arg1) {
				while (local52 <= local38 || local48 <= local38) {
					local48 += local40 + local40;
					local52 += local40++ + local40;
				}
				local95 = arg0 + 1 - local40;
				if (local95 < this.anInt875) {
					local95 = this.anInt875;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt866) {
					local106 = this.anInt866;
				}
				local120 = local95 + local34 * this.anInt870;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray33[local120]) {
						local350 = this.anIntArray32[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(637) int local637 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray32[local120] = local362 - local637 | local637 - (local637 >>> 8);
					}
					local120++;
				}
				local34++;
				local48 -= local44-- + local44;
				local52 -= local44 + local44;
			}
			local40 = arg3;
			local44 = -local44;
			local52 = local44 * local44 + local38;
			local48 = local52 - arg3;
			local52 -= local44;
			while (local34 < local25) {
				while (local52 > local38 && local48 > local38) {
					local52 -= local40-- + local40;
					local48 -= local40 + local40;
				}
				local95 = arg0 - local40;
				if (local95 < this.anInt875) {
					local95 = this.anInt875;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt866 - 1) {
					local106 = this.anInt866 - 1;
				}
				local120 = local95 + local34 * this.anInt870;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray33[local120]) {
						local350 = this.anIntArray32[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray32[local120] = local362 - local350 | local350 - (local350 >>> 8);
					}
					local120++;
				}
				local34++;
				local52 += local44 + local44;
				local48 += local44++ + local44;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V")
	@Override
	public void method5038(@OriginalArg(0) int arg0) {
		this.aClass277Array1[arg0].method6784(Thread.currentThread());
	}

	@OriginalMember(owner = "client!cb", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt868 = (int) (arg1 * 65535.0F);
		this.anInt880 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt864 = (int) (arg3 * 65535.0F / local26);
		this.anInt862 = (int) (arg4 * 65535.0F / local26);
		this.anInt867 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!pga;Z)Lclient!f;")
	@Override
	public Class78 method5018(@OriginalArg(0) Class261 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray389;
		@Pc(5) byte[] local5 = arg0.aByteArray90;
		@Pc(8) int local8 = arg0.anInt7655;
		@Pc(11) int local11 = arg0.anInt7660;
		@Pc(76) Class78_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray89 == null) {
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
			local76 = new Class78_Sub2_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray89;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class78_Sub2_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class78_Sub2_Sub3(this, local20, local8, local11);
			}
		}
		local76.Q(arg0.anInt7657, arg0.anInt7656, arg0.anInt7658, arg0.anInt7659);
		return local76;
	}

	@OriginalMember(owner = "client!cb", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.J(0, 0, this.anInt870, this.anInt876, arg0, 0);
	}

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt870 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray32[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class78 method4964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt870 + arg0;
		@Pc(16) int local16 = this.anInt870 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray32[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class78_Sub2_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class78_Sub2_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class78 method4969(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class78_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class78_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class78_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class78_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "()Z")
	@Override
	public boolean method5008() {
		return true;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "()Z")
	@Override
	public boolean method4977() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!gda;[Lclient!pga;Z)Lclient!la;")
	@Override
	public Class58 method4983(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class261[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7655;
			local7[local11] = arg1[local11].anInt7660;
			if (arg1[local11].aByteArray89 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class58_Sub1(this, arg0, arg1, local3, local7);
		} else {
			return new Class58_Sub3(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "(I)Z")
	public boolean method921(@OriginalArg(0) int arg0) {
		return super.anInterface11_11.method7405(arg0).aBoolean10;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)I")
	@Override
	public int method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method5024(@OriginalArg(0) Class78 arg0) {
		if (arg0 instanceof Class78_Sub2_Sub2) {
			@Pc(5) Class78_Sub2_Sub2 local5 = (Class78_Sub2_Sub2) arg0;
			this.anInt870 = local5.anInt8563;
			this.anInt876 = local5.anInt8560;
			this.anIntArray32 = local5.anIntArray176;
			this.aClass78_2 = arg0;
		} else if (arg0 instanceof Class78_Sub2_Sub3) {
			@Pc(27) Class78_Sub2_Sub3 local27 = (Class78_Sub2_Sub3) arg0;
			this.anInt870 = local27.anInt8563;
			this.anInt876 = local27.anInt8560;
			this.anIntArray32 = local27.anIntArray469;
			this.aClass78_2 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method914();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return 0;
	}

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "()Z")
	@Override
	public boolean method5037() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "()Z")
	@Override
	public boolean method5022() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "()V")
	@Override
	public void method5032() {
	}

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "()Z")
	@Override
	public boolean method5034() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()I")
	@Override
	public int method4972() {
		return 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	@Override
	public void method4973(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt861;
		for (@Pc(9) Object local9 = this.aClass223_9.method5390(); local9 != null; local9 = this.aClass223_9.method5401()) {
			@Pc(13) Class4_Sub45 local13 = (Class4_Sub45) local9;
			if (local13.aBoolean638) {
				local13.anInt9117 += local4;
				@Pc(27) int local27 = local13.anInt9117 / 20;
				if (local27 > 0) {
					@Pc(36) Class14 local36 = super.anInterface11_11.method7405(local13.anInt9116);
					local13.method7453(local36.aByte4 * local4 * 50 / 1000, local36.aByte6 * local4 * 50 / 1000);
					local13.anInt9117 -= local27 * 20;
				}
				local13.aBoolean638 = false;
			}
		}
		this.anInt861 = arg0;
		this.aClass223_8.method5399(5);
		this.aClass223_9.method5399(5);
	}

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "(I)Z")
	public boolean method922(@OriginalArg(0) int arg0) {
		return this.aBoolean40 || super.anInterface11_11.method7405(arg0).aBoolean12;
	}

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "()Z")
	public boolean method923() {
		return this.aBoolean38;
	}

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "(I)I")
	public int method924(@OriginalArg(0) int arg0) {
		return super.anInterface11_11.method7405(arg0).aShort12 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cb", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt870;
		@Pc(35) int local35 = this.anInt870 - arg2;
		if (arg1 + arg3 > this.anInt885) {
			arg3 -= arg1 + arg3 - this.anInt885;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt873) {
			local59 = this.anInt873 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt870;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt866) {
			local59 = arg0 + arg2 - this.anInt866;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt875) {
			local59 = this.anInt875 - arg0;
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
						this.anIntArray32[local30++] = arg4;
					} else {
						this.anIntArray32[local30++] = arg5;
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
					local245 = this.anIntArray32[local30];
					this.anIntArray32[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray32[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray32[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([I)V")
	@Override
	public void method5011(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt870;
		arg0[1] = this.anInt876;
	}

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "()Z")
	@Override
	public boolean method5041() {
		return false;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!caa;)V")
	@Override
	public void method4982(@OriginalArg(0) Class36 arg0) {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!caa;Lclient!caa;FLclient!caa;)Lclient!caa;")
	@Override
	public Class36 method5005(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.XA(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.XA(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt875) {
					arg1 += local104 * (this.anInt875 - arg0);
					arg0 = this.anInt875;
				}
				if (arg2 >= this.anInt866) {
					arg2 = this.anInt866 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt873 && local150 < this.anInt885) {
							this.anIntArray32[arg0 + local150 * this.anInt870] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt873 && local213 < this.anInt885) {
							local228 = arg0 + local213 * this.anInt870;
							local233 = this.anIntArray32[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray32[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt873 && local150 < this.anInt885) {
							local213 = arg0 + local150 * this.anInt870;
							local228 = this.anIntArray32[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray32[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt873) {
					arg0 += local104 * (this.anInt873 - arg1);
					arg1 = this.anInt873;
				}
				if (arg3 >= this.anInt885) {
					arg3 = this.anInt885 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt875 && local150 < this.anInt866) {
							this.anIntArray32[local150 + arg1 * this.anInt870] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt875 && local213 < this.anInt866) {
							local228 = local213 + arg1 * this.anInt870;
							local233 = this.anIntArray32[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray32[local213 + arg1 * this.anInt870] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt875 && local150 < this.anInt866) {
							local213 = local150 + arg1 * this.anInt870;
							local228 = this.anIntArray32[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray32[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.m(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.m(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!cb", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass277Array1.length; local1++) {
			this.aClass277Array1[local1].anInt8164 = this.aClass277Array1[local1].anInt8162;
			this.aClass277Array1[local1].anInt8168 = arg0;
			this.aClass277Array1[local1].anInt8162 = arg1;
			this.aClass277Array1[local1].anInt8167 = arg2;
			this.aClass277Array1[local1].aBoolean566 = true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method4999(@OriginalArg(0) Class8 arg0) {
		this.aClass8_Sub1_1 = (Class8_Sub1) arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}
}
