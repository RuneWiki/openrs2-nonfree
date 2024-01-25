import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class134_Sub3 extends Class134 {

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas16;

	@OriginalMember(owner = "client!tea", name = "p", descriptor = "Z")
	private boolean aBoolean662;

	@OriginalMember(owner = "client!tea", name = "q", descriptor = "Z")
	private boolean aBoolean663;

	@OriginalMember(owner = "client!tea", name = "r", descriptor = "I")
	private int anInt8519;

	@OriginalMember(owner = "client!tea", name = "s", descriptor = "Lclient!kea;")
	private Class187 aClass187_36;

	@OriginalMember(owner = "client!tea", name = "t", descriptor = "Lclient!sf;")
	private Class1_Sub26 aClass1_Sub26_1;

	@OriginalMember(owner = "client!tea", name = "u", descriptor = "I")
	public int anInt8520;

	@OriginalMember(owner = "client!tea", name = "v", descriptor = "I")
	public int anInt8521;

	@OriginalMember(owner = "client!tea", name = "w", descriptor = "I")
	public int anInt8522;

	@OriginalMember(owner = "client!tea", name = "x", descriptor = "I")
	public int anInt8523;

	@OriginalMember(owner = "client!tea", name = "y", descriptor = "I")
	public int anInt8524;

	@OriginalMember(owner = "client!tea", name = "z", descriptor = "[I")
	public int[] anIntArray645;

	@OriginalMember(owner = "client!tea", name = "A", descriptor = "I")
	private int anInt8525;

	@OriginalMember(owner = "client!tea", name = "B", descriptor = "I")
	public int anInt8526;

	@OriginalMember(owner = "client!tea", name = "C", descriptor = "I")
	public int anInt8527;

	@OriginalMember(owner = "client!tea", name = "D", descriptor = "I")
	public int anInt8528;

	@OriginalMember(owner = "client!tea", name = "E", descriptor = "Lclient!mf;")
	private final Class222 aClass222_54;

	@OriginalMember(owner = "client!tea", name = "F", descriptor = "I")
	public int anInt8529;

	@OriginalMember(owner = "client!tea", name = "G", descriptor = "I")
	public int anInt8530;

	@OriginalMember(owner = "client!tea", name = "H", descriptor = "I")
	public int anInt8531;

	@OriginalMember(owner = "client!tea", name = "I", descriptor = "I")
	public int anInt8532;

	@OriginalMember(owner = "client!tea", name = "J", descriptor = "I")
	private int anInt8533;

	@OriginalMember(owner = "client!tea", name = "L", descriptor = "I")
	public int anInt8534;

	@OriginalMember(owner = "client!tea", name = "M", descriptor = "[I")
	public int[] anIntArray646;

	@OriginalMember(owner = "client!tea", name = "N", descriptor = "I")
	private int anInt8535;

	@OriginalMember(owner = "client!tea", name = "O", descriptor = "[Lclient!gn;")
	private Class126[] aClass126Array1;

	@OriginalMember(owner = "client!tea", name = "P", descriptor = "I")
	public int anInt8536;

	@OriginalMember(owner = "client!tea", name = "Q", descriptor = "I")
	public int anInt8537;

	@OriginalMember(owner = "client!tea", name = "R", descriptor = "I")
	private int anInt8538;

	@OriginalMember(owner = "client!tea", name = "S", descriptor = "I")
	public int anInt8539;

	@OriginalMember(owner = "client!tea", name = "T", descriptor = "I")
	public int anInt8540;

	@OriginalMember(owner = "client!tea", name = "U", descriptor = "Lclient!g;")
	public Class113_Sub1 aClass113_Sub1_3;

	@OriginalMember(owner = "client!tea", name = "V", descriptor = "Lclient!f;")
	private Class22 aClass22_36;

	@OriginalMember(owner = "client!tea", name = "W", descriptor = "Lclient!mf;")
	private final Class222 aClass222_55;

	@OriginalMember(owner = "client!tea", name = "X", descriptor = "I")
	public int anInt8541;

	@OriginalMember(owner = "client!tea", name = "Y", descriptor = "I")
	private int anInt8542;

	@OriginalMember(owner = "client!tea", name = "Z", descriptor = "I")
	public int anInt8543;

	@OriginalMember(owner = "client!tea", name = "ab", descriptor = "I")
	public int anInt8544;

	@OriginalMember(owner = "client!tea", name = "bb", descriptor = "Z")
	private boolean aBoolean664;

	@OriginalMember(owner = "client!tea", name = "cb", descriptor = "I")
	public int anInt8545;

	@OriginalMember(owner = "client!tea", name = "db", descriptor = "I")
	public int anInt8546;

	@OriginalMember(owner = "client!tea", name = "eb", descriptor = "I")
	private int anInt8547;

	@OriginalMember(owner = "client!tea", name = "fb", descriptor = "Lclient!f;")
	private Class22 aClass22_37;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public Class134_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1) {
		this(arg1);
		this.method6946(arg0);
		this.method6937(arg0);
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!fa;)V")
	private Class134_Sub3(@OriginalArg(0) Interface7 arg0) {
		super(arg0);
		this.aBoolean662 = false;
		this.aBoolean663 = false;
		this.aClass187_36 = new Class187(4);
		this.anInt8528 = 45823;
		this.anInt8524 = 78642;
		this.anInt8525 = 0;
		this.anInt8531 = 512;
		this.anInt8522 = 0;
		this.anInt8521 = 0;
		this.anInt8533 = 0;
		this.anInt8540 = 75518;
		this.anInt8544 = 50;
		this.anInt8541 = 512;
		this.anInt8543 = 3500;
		this.aBoolean664 = false;
		this.anInt8529 = 0;
		this.anInt8537 = 0;
		this.aClass222_55 = new Class222(16);
		this.anInt8547 = -1;
		this.aClass222_54 = new Class222(256);
		this.aClass113_Sub1_3 = new Class113_Sub1();
		this.method6966(1);
		this.method6943(0);
		Static209.method3312(true, false);
		this.aBoolean662 = true;
		this.anInt8519 = (int) Static413.method5668();
	}

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "(I)[I")
	public int[] method6972(@OriginalArg(0) int arg0) {
		@Pc(2) Class222 local2 = this.aClass222_54;
		@Pc(12) Class1_Sub19 local12;
		synchronized (this.aClass222_54) {
			local12 = (Class1_Sub19) this.aClass222_54.method4430((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_10.method3871(arg0)) {
					return null;
				}
				@Pc(32) Class3 local32 = super.anInterface7_10.method3874(arg0);
				@Pc(42) int local42 = local32.aBoolean13 || this.aBoolean664 ? 64 : 128;
				local12 = new Class1_Sub19(arg0, local42, super.anInterface7_10.method3869(local42, arg0, 0.7F, local42, true), local32.aBoolean7);
				this.aClass222_54.method4434(local12, (long) arg0);
			}
		}
		local12.aBoolean198 = true;
		return local12.method2111();
	}

	@OriginalMember(owner = "client!tea", name = "A", descriptor = "()Z")
	@Override
	public boolean method6968() {
		return true;
	}

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "(I)V")
	@Override
	public void method6966(@OriginalArg(0) int arg0) {
		this.anInt8523 = arg0;
		this.aClass126Array1 = new Class126[this.anInt8523];
		for (@Pc(9) int local9 = 0; local9 < this.anInt8523; local9++) {
			this.aClass126Array1[local9] = new Class126(this);
		}
	}

	@OriginalMember(owner = "client!tea", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt8528 = (int) (arg1 * 65535.0F);
		this.anInt8524 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt8530 = (int) (arg3 * 65535.0F / local26);
		this.anInt8527 = (int) (arg4 * 65535.0F / local26);
		this.anInt8532 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!uq;[Lclient!fg;Z)Lclient!la;")
	@Override
	public Class64 method6899(@OriginalArg(0) Class334 arg0, @OriginalArg(1) Class102[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2624;
			local7[local11] = arg1[local11].anInt2626;
			if (arg1[local11].aByteArray31 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class64_Sub4(this, arg0, arg1, local3, local7);
		} else {
			return new Class64_Sub3(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!ag;IIII)V")
	private void method6973(@OriginalArg(0) Class8_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt5213;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method6974(arg1, arg2, arg3, arg4, arg0.anInt5209, 1);
			return;
		}
		if (this.anInt8547 != local2) {
			@Pc(33) Class22 local33 = (Class22) this.aClass222_55.method4430((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method6983(local2);
				if (local39 == null) {
					return;
				}
				@Pc(49) int local49 = this.method6975(local2) ? 64 : 128;
				local33 = this.method6970(local39, local49, local49, local49);
				this.aClass222_55.method4434(local33, (long) local2);
			}
			this.anInt8547 = local2;
			this.aClass22_37 = local33;
		}
		local8++;
		((Class22_Sub2) this.aClass22_37).method6317(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt5209, 1);
	}

	@OriginalMember(owner = "client!tea", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt8521 || arg1 >= this.anInt8529) {
			return;
		}
		if (arg0 < this.anInt8537) {
			arg2 -= this.anInt8537 - arg0;
			arg0 = this.anInt8537;
		}
		if (arg0 + arg2 > this.anInt8522) {
			arg2 = this.anInt8522 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8539;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray646[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray646[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray646[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray646[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray646[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tea", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt8539;
		@Pc(35) int local35 = this.anInt8539 - arg2;
		if (arg1 + arg3 > this.anInt8529) {
			arg3 -= arg1 + arg3 - this.anInt8529;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt8521) {
			local59 = this.anInt8521 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt8539;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt8522) {
			local59 = arg0 + arg2 - this.anInt8522;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt8537) {
			local59 = this.anInt8537 - arg0;
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
						this.anIntArray646[local30++] = arg4;
					} else {
						this.anIntArray646[local30++] = arg5;
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
					local245 = this.anIntArray646[local30];
					this.anIntArray646[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray646[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray646[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(Z)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
		this.aBoolean664 = arg0;
		this.aClass222_54.method4428();
	}

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6930(@OriginalArg(0) Class22 arg0) {
		if (arg0 instanceof Class22_Sub2_Sub3) {
			@Pc(5) Class22_Sub2_Sub3 local5 = (Class22_Sub2_Sub3) arg0;
			this.anInt8539 = local5.anInt7862;
			this.anInt8535 = local5.anInt7872;
			this.anIntArray646 = local5.anIntArray609;
			this.aClass22_36 = arg0;
		} else if (arg0 instanceof Class22_Sub2_Sub2) {
			@Pc(27) Class22_Sub2_Sub2 local27 = (Class22_Sub2_Sub2) arg0;
			this.anInt8539 = local27.anInt7862;
			this.anInt8535 = local27.anInt7872;
			this.anIntArray646 = local27.anIntArray200;
			this.aClass22_36 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method6981();
	}

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "()Z")
	@Override
	public boolean method6917() {
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass126Array1.length; local1++) {
			@Pc(7) Class126 local7 = this.aClass126Array1[local1];
			local7.anInt3024 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt3024 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt3024 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt3024 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt3024 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean232 = false;
			} else {
				local7.aBoolean232 = true;
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt8539) {
			arg2 = this.anInt8539;
		}
		if (arg3 > this.anInt8535) {
			arg3 = this.anInt8535;
		}
		this.anInt8537 = arg0;
		this.anInt8522 = arg2;
		this.anInt8521 = arg1;
		this.anInt8529 = arg3;
		this.method6977();
	}

	@OriginalMember(owner = "client!tea", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class126 local3 = this.method6980(Thread.currentThread());
		local3.aBoolean230 = arg0;
	}

	@OriginalMember(owner = "client!tea", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt8534, this.anInt8545, this.anInt8541, this.anInt8531 };
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!vi;)V")
	@Override
	public void method6940(@OriginalArg(0) Class343 arg0) {
		@Pc(3) Class126 local3 = this.method6980(Thread.currentThread());
		@Pc(7) Class8_Sub2 local7 = arg0.aClass355_1.aClass8_Sub2_9;
		for (@Pc(10) Class8_Sub2 local10 = local7.aClass8_Sub2_8; local10 != local7; local10 = local10.aClass8_Sub2_8) {
			@Pc(14) Class8_Sub2_Sub1 local14 = (Class8_Sub2_Sub1) local10;
			@Pc(19) int local19 = local14.anInt5208 >> 12;
			@Pc(24) int local24 = local14.anInt5211 >> 12;
			@Pc(29) int local29 = local14.anInt5210 >> 12;
			@Pc(54) float local54 = this.aClass113_Sub1_3.aFloat50 + this.aClass113_Sub1_3.aFloat38 * (float) local19 + this.aClass113_Sub1_3.aFloat48 * (float) local24 + this.aClass113_Sub1_3.aFloat43 * (float) local29;
			if (!(local54 < (float) this.anInt8544) && !(local54 > (float) local3.anInt3027)) {
				@Pc(102) int local102 = this.anInt8534 + (int) ((float) this.anInt8541 * (this.aClass113_Sub1_3.aFloat37 + this.aClass113_Sub1_3.aFloat40 * (float) local19 + this.aClass113_Sub1_3.aFloat41 * (float) local24 + this.aClass113_Sub1_3.aFloat42 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt8545 + (int) ((float) this.anInt8531 * (this.aClass113_Sub1_3.aFloat46 + this.aClass113_Sub1_3.aFloat49 * (float) local19 + this.aClass113_Sub1_3.aFloat39 * (float) local24 + this.aClass113_Sub1_3.aFloat45 * (float) local29) / local54);
				if (local102 >= this.anInt8537 && local102 <= this.anInt8522 && local137 >= this.anInt8521 && local137 <= this.anInt8529) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method6973(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt5212 * this.anInt8541 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "(IIIIII)V")
	private void method6974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg2 << 8;
		@Pc(12) int local12 = arg1 - arg3;
		if (local12 < this.anInt8521) {
			local12 = this.anInt8521;
		}
		@Pc(25) int local25 = arg1 + arg3 + 1;
		if (local25 > this.anInt8529) {
			local25 = this.anInt8529;
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
				if (local95 < this.anInt8537) {
					local95 = this.anInt8537;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt8522) {
					local106 = this.anInt8522;
				}
				local120 = local95 + local34 * this.anInt8539;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray645[local120]) {
						this.anIntArray646[local120] = arg4;
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
				if (local95 < this.anInt8537) {
					local95 = this.anInt8537;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt8522 - 1) {
					local106 = this.anInt8522 - 1;
				}
				local120 = local95 + local34 * this.anInt8539;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray645[local120]) {
						this.anIntArray646[local120] = arg4;
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
				if (local106 < this.anInt8537) {
					local106 = this.anInt8537;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt8522) {
					local120 = this.anInt8522;
				}
				local122 = local106 + local34 * this.anInt8539;
				for (local350 = local106; local350 < local120; local350++) {
					if (local8 < this.anIntArray645[local122]) {
						local362 = this.anIntArray646[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray646[local122] = local293 + local362;
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
				if (local106 < this.anInt8537) {
					local106 = this.anInt8537;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt8522 - 1) {
					local120 = this.anInt8522 - 1;
				}
				local122 = local106 + local34 * this.anInt8539;
				for (local350 = local106; local350 <= local120; local350++) {
					if (local8 < this.anIntArray645[local122]) {
						local362 = this.anIntArray646[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray646[local122] = local293 + local362;
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
				if (local95 < this.anInt8537) {
					local95 = this.anInt8537;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt8522) {
					local106 = this.anInt8522;
				}
				local120 = local95 + local34 * this.anInt8539;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray645[local120]) {
						local350 = this.anIntArray646[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(637) int local637 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray646[local120] = local362 - local637 | local637 - (local637 >>> 8);
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
				if (local95 < this.anInt8537) {
					local95 = this.anInt8537;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt8522 - 1) {
					local106 = this.anInt8522 - 1;
				}
				local120 = local95 + local34 * this.anInt8539;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray645[local120]) {
						local350 = this.anIntArray646[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray646[local120] = local362 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)I")
	@Override
	public int method6915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt8537) {
					arg1 += local104 * (this.anInt8537 - arg0);
					arg0 = this.anInt8537;
				}
				if (arg2 >= this.anInt8522) {
					arg2 = this.anInt8522 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8521 && local150 < this.anInt8529) {
							this.anIntArray646[arg0 + local150 * this.anInt8539] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt8521 && local213 < this.anInt8529) {
							local228 = arg0 + local213 * this.anInt8539;
							local233 = this.anIntArray646[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray646[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8521 && local150 < this.anInt8529) {
							local213 = arg0 + local150 * this.anInt8539;
							local228 = this.anIntArray646[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray646[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt8521) {
					arg0 += local104 * (this.anInt8521 - arg1);
					arg1 = this.anInt8521;
				}
				if (arg3 >= this.anInt8529) {
					arg3 = this.anInt8529 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8537 && local150 < this.anInt8522) {
							this.anIntArray646[local150 + arg1 * this.anInt8539] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt8537 && local213 < this.anInt8522) {
							local228 = local213 + arg1 * this.anInt8539;
							local233 = this.anIntArray646[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray646[local213 + arg1 * this.anInt8539] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8537 && local150 < this.anInt8522) {
							local213 = local150 + arg1 * this.anInt8539;
							local228 = this.anIntArray646[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray646[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!tea", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.J(0, 0, this.anInt8539, this.anInt8535, arg0, 0);
	}

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6946(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub26 local8 = (Class1_Sub26) this.aClass187_36.method3797((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static130.method2036(arg0);
			this.aClass187_36.method3795(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6914(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas16 == null || this.aClass1_Sub26_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas16.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt8539 && local21.y <= this.anInt8535 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub26_1.method7345(local21.x, local21.width, local14, local21.height, local21.y);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas16.repaint();
		}
	}

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "(I)V")
	@Override
	public void method6961(@OriginalArg(0) int arg0) {
		this.aClass126Array1[arg0].method2432(null);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "()Z")
	@Override
	public boolean method6897() {
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass113_Sub1_3.aFloat50 + this.aClass113_Sub1_3.aFloat38 * (float) arg0 + this.aClass113_Sub1_3.aFloat48 * (float) arg1 + this.aClass113_Sub1_3.aFloat43 * (float) arg2;
		if (local24 < (float) this.anInt8544 || local24 > (float) this.anInt8543) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt8541 * (this.aClass113_Sub1_3.aFloat37 + this.aClass113_Sub1_3.aFloat40 * (float) arg0 + this.aClass113_Sub1_3.aFloat41 * (float) arg1 + this.aClass113_Sub1_3.aFloat42 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt8531 * (this.aClass113_Sub1_3.aFloat46 + this.aClass113_Sub1_3.aFloat49 * (float) arg0 + this.aClass113_Sub1_3.aFloat39 * (float) arg1 + this.aClass113_Sub1_3.aFloat45 * (float) arg2) / local24);
		arg3[0] = local81 - this.anInt8520;
		arg3[1] = local113 - this.anInt8536;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "(I)Z")
	public boolean method6975(@OriginalArg(0) int arg0) {
		return this.aBoolean664 || super.anInterface7_10.method3874(arg0).aBoolean13;
	}

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt8537 || arg0 >= this.anInt8522) {
			return;
		}
		if (arg1 < this.anInt8521) {
			arg2 -= this.anInt8521 - arg1;
			arg1 = this.anInt8521;
		}
		if (arg1 + arg2 > this.anInt8529) {
			arg2 = this.anInt8529 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8539;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray646[local40 + local54 * this.anInt8539] = arg3;
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
				local111 = local40 + local103 * this.anInt8539;
				local116 = this.anIntArray646[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray646[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt8539;
				local111 = this.anIntArray646[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray646[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "()Z")
	@Override
	public boolean method6906() {
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "p", descriptor = "()V")
	@Override
	public void method6934() {
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "()Z")
	@Override
	public boolean method6912() {
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "n", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6924() {
		return new Class113_Sub1();
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6909(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub26 local8 = (Class1_Sub26) this.aClass187_36.method3797((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method7859();
		local8 = Static130.method2036(arg0);
		this.aClass187_36.method3795(local8, (long) arg0.hashCode());
		if (this.aCanvas16 != arg0 || this.aClass22_36 != null) {
			return;
		}
		this.aClass1_Sub26_1 = local8;
		this.anIntArray646 = local8.anIntArray683;
		this.anInt8539 = local8.anInt8991;
		this.anInt8535 = local8.anInt8988;
		if (this.anInt8539 != this.anInt8538 || this.anInt8535 != this.anInt8542) {
			this.anInt8538 = this.anInt8539;
			this.anInt8542 = this.anInt8535;
			this.anIntArray645 = new int[this.anInt8538 * this.anInt8542];
		}
		this.method6981();
	}

	@OriginalMember(owner = "client!tea", name = "y", descriptor = "()Lclient!is;")
	@Override
	public Class162 method6962() {
		return new Class162(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!tea", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8537;
		arg0[1] = this.anInt8521;
		arg0[2] = this.anInt8522;
		arg0[3] = this.anInt8529;
	}

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "(I)Z")
	public boolean method6976(@OriginalArg(0) int arg0) {
		return super.anInterface7_10.method3874(arg0).aBoolean8;
	}

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "(I)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tea", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!jba;Lclient!jba;FLclient!jba;)Lclient!jba;")
	@Override
	public Class83 method6895(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class83 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6901(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas16 == arg0) {
			this.method6937(null);
		}
		@Pc(15) Class1_Sub26 local15 = (Class1_Sub26) this.aClass187_36.method3797((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7859();
		}
	}

	@OriginalMember(owner = "client!tea", name = "w", descriptor = "()I")
	@Override
	public int method6955() {
		return 0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class204 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class204_Sub2 local2 = (Class204_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray469;
		@Pc(8) int[] local8 = local2.anIntArray470;
		@Pc(17) int local17 = this.anInt8521 > arg7 ? this.anInt8521 : arg7;
		@Pc(32) int local32 = this.anInt8529 < arg7 + local5.length ? this.anInt8529 : arg7 + local5.length;
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
					if (local129 >= this.anInt8537 && local129 < this.anInt8522 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray646[local129 + arg1 * this.anInt8539] = arg4;
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
					if (local133 >= this.anInt8537 && local133 < this.anInt8522 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt8539;
						local248 = this.anIntArray646[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray646[local133 + arg1 * this.anInt8539] = local201 + local584;
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
		if (arg0 < this.anInt8537) {
			arg1 += local83 * (this.anInt8537 - arg0);
			arg0 = this.anInt8537;
		}
		if (arg2 >= this.anInt8522) {
			arg2 = this.anInt8522 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray646[arg0 + local129 * this.anInt8539] = arg4;
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
					local243 = arg0 + local133 * this.anInt8539;
					local248 = this.anIntArray646[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray646[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!tea", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass113_Sub1_3.aFloat38 * (float) arg0 + this.aClass113_Sub1_3.aFloat48 * (float) arg1 + this.aClass113_Sub1_3.aFloat43 * (float) arg2 + this.aClass113_Sub1_3.aFloat50;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass113_Sub1_3.aFloat38 * (float) arg3 + this.aClass113_Sub1_3.aFloat48 * (float) arg4 + this.aClass113_Sub1_3.aFloat43 * (float) arg5 + this.aClass113_Sub1_3.aFloat50;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt8544 && local55 < (float) this.anInt8544 || !(!(local24 > (float) this.anInt8543) || !(local55 > (float) this.anInt8543))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt8541 * (this.aClass113_Sub1_3.aFloat40 * (float) arg0 + this.aClass113_Sub1_3.aFloat41 * (float) arg1 + this.aClass113_Sub1_3.aFloat42 * (float) arg2 + this.aClass113_Sub1_3.aFloat37) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt8541 * (this.aClass113_Sub1_3.aFloat40 * (float) arg3 + this.aClass113_Sub1_3.aFloat41 * (float) arg4 + this.aClass113_Sub1_3.aFloat42 * (float) arg5 + this.aClass113_Sub1_3.aFloat37) / local55);
		if (local119 < this.anInt8520 && local151 < this.anInt8520 || local119 > this.anInt8526 && local151 > this.anInt8526) {
			return false;
		} else {
			@Pc(201) int local201 = (int) ((float) this.anInt8531 * (this.aClass113_Sub1_3.aFloat49 * (float) arg0 + this.aClass113_Sub1_3.aFloat39 * (float) arg1 + this.aClass113_Sub1_3.aFloat45 * (float) arg2 + this.aClass113_Sub1_3.aFloat46) / local24);
			@Pc(233) int local233 = (int) ((float) this.anInt8531 * (this.aClass113_Sub1_3.aFloat49 * (float) arg3 + this.aClass113_Sub1_3.aFloat39 * (float) arg4 + this.aClass113_Sub1_3.aFloat45 * (float) arg5 + this.aClass113_Sub1_3.aFloat46) / local55);
			return (local201 >= this.anInt8536 || local233 >= this.anInt8536) && (local201 <= this.anInt8546 || local233 <= this.anInt8546);
		}
	}

	@OriginalMember(owner = "client!tea", name = "D", descriptor = "()V")
	private void method6977() {
		this.anInt8520 = this.anInt8537 - this.anInt8534;
		this.anInt8526 = this.anInt8522 - this.anInt8534;
		this.anInt8536 = this.anInt8521 - this.anInt8545;
		this.anInt8546 = this.anInt8529 - this.anInt8545;
		for (@Pc(29) int local29 = 0; local29 < this.anInt8523; local29++) {
			@Pc(36) Class251 local36 = this.aClass126Array1[local29].aClass251_2;
			local36.anInt6644 = this.anInt8534 - this.anInt8537;
			local36.anInt6641 = this.anInt8545 - this.anInt8521;
			local36.anInt6642 = this.anInt8522 - this.anInt8537;
			local36.anInt6645 = this.anInt8529 - this.anInt8521;
		}
		@Pc(78) int local78 = this.anInt8521 * this.anInt8539 + this.anInt8537;
		for (@Pc(81) int local81 = this.anInt8521; local81 < this.anInt8529; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt8523; local84++) {
				this.aClass126Array1[local84].aClass251_2.anIntArray517[local81 - this.anInt8521] = local78;
			}
			local78 += this.anInt8539;
		}
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(IIIIIIIIII)V")
	public void method6978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface7_10.method3874(arg6).aBoolean14) {
			this.method6974(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt8547 != arg6) {
			@Pc(26) Class22 local26 = (Class22) this.aClass222_55.method4430((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method6983(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method6975(arg6) ? 64 : 128;
				local26 = this.method6970(local32, local43, local43, local43);
				this.aClass222_55.method4434(local26, (long) arg6);
			}
			this.anInt8547 = arg6;
			this.aClass22_37 = local26;
		}
		((Class22_Sub2) this.aClass22_37).method6317(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!tea", name = "u", descriptor = "()Z")
	@Override
	public boolean method6954() {
		return true;
	}

	@OriginalMember(owner = "client!tea", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt8543;
	}

	@OriginalMember(owner = "client!tea", name = "E", descriptor = "()Z")
	public boolean method6979() {
		return this.aBoolean663;
	}

	@OriginalMember(owner = "client!tea", name = "s", descriptor = "()Z")
	@Override
	public boolean method6951() {
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!jba;)V")
	@Override
	public void method6913(@OriginalArg(0) Class83 arg0) {
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!lm;IIII)Lclient!da;")
	@Override
	public Class63 method6910(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class63_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!tea", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass126Array1.length; local1++) {
			this.aClass126Array1[local1].anInt3018 = this.aClass126Array1[local1].anInt3024;
			this.aClass126Array1[local1].anInt3026 = arg0;
			this.aClass126Array1[local1].anInt3024 = arg1;
			this.aClass126Array1[local1].anInt3025 = arg2;
			this.aClass126Array1[local1].aBoolean231 = true;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!gn;")
	public Class126 method6980(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8523; local1++) {
			if (this.aClass126Array1[local1].aRunnable1 == arg0) {
				return this.aClass126Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class22 method6970(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class22_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class22_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class22_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class22_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class47 method6902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class47_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!tea", name = "F", descriptor = "()V")
	private void method6981() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8523; local1++) {
			this.aClass126Array1[local1].method2429();
		}
		this.JA();
	}

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "()V")
	@Override
	public void method6907() {
		if (this.aCanvas16 == null) {
			this.anInt8539 = 1;
			this.anInt8535 = 1;
			this.anIntArray646 = null;
		} else {
			this.anIntArray646 = this.aClass1_Sub26_1.anIntArray683;
			this.anInt8539 = this.aClass1_Sub26_1.anInt8991;
			this.anInt8535 = this.aClass1_Sub26_1.anInt8988;
		}
		this.aClass22_36 = null;
		this.method6981();
	}

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "()V")
	@Override
	protected void method6923() {
		if (this.aBoolean662) {
			Static13.method128(true, false);
			this.aBoolean662 = false;
		}
		this.aClass1_Sub26_1 = null;
		this.aCanvas16 = null;
		this.aClass187_36 = null;
		this.aBoolean663 = true;
	}

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "(I)I")
	public int method6982(@OriginalArg(0) int arg0) {
		return super.anInterface7_10.method3874(arg0).aShort1 & 0xFFFF;
	}

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "()Z")
	@Override
	public boolean method6931() {
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8534 = arg0;
		this.anInt8545 = arg1;
		this.anInt8541 = arg2;
		this.anInt8531 = arg3;
		this.method6977();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V")
	@Override
	public void method6903(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6916(@OriginalArg(0) Class1_Sub5 arg0) {
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class22 method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt8539 + arg0;
		@Pc(16) int local16 = this.anInt8539 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray646[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class22_Sub2_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class22_Sub2_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "()Z")
	@Override
	public boolean method6908() {
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "([I)V")
	@Override
	public void method6922(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8539;
		arg0[1] = this.anInt8535;
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(I)V")
	@Override
	public void method6943(@OriginalArg(0) int arg0) {
		this.aClass126Array1[arg0].method2432(Thread.currentThread());
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class204 method6945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class204_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6932() {
		@Pc(3) Class126 local3 = this.method6980(Thread.currentThread());
		@Pc(6) Class251 local6 = local3.aClass251_2;
		local6.aBoolean528 = false;
		@Pc(14) int local14 = 5 - this.anInt8520;
		@Pc(19) int local19 = 75 - this.anInt8520;
		@Pc(24) int local24 = 15 - this.anInt8520;
		@Pc(29) int local29 = 10 - this.anInt8536;
		@Pc(34) int local34 = 50 - this.anInt8536;
		@Pc(39) int local39 = 90 - this.anInt8536;
		local6.aBoolean533 = local14 < 0 || local14 > local6.anInt6642 || local19 < 0 || local19 > local6.anInt6642 || local24 < 0 || local24 > local6.anInt6642;
		local6.aBoolean529 = true;
		local6.anInt6643 = 0;
		local6.aBoolean531 = false;
		local6.method5304(local29, local34, local39, local14, local19, local24, 0, 0, 0, -65536, -65536, -65536);
		local6.aBoolean528 = true;
		local6.aBoolean529 = false;
	}

	@OriginalMember(owner = "client!tea", name = "B", descriptor = "()V")
	@Override
	public void method6969() {
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIII)Lclient!jba;")
	@Override
	public Class83 method6911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return 0;
	}

	@OriginalMember(owner = "client!tea", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt8537) {
			arg2 -= this.anInt8537 - arg0;
			arg0 = this.anInt8537;
		}
		if (arg1 < this.anInt8521) {
			arg3 -= this.anInt8521 - arg1;
			arg1 = this.anInt8521;
		}
		if (arg0 + arg2 > this.anInt8522) {
			arg2 = this.anInt8522 - arg0;
		}
		if (arg1 + arg3 > this.anInt8529) {
			arg3 = this.anInt8529 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt8522 || arg1 > this.anInt8529) {
			return;
		}
		@Pc(67) int local67 = this.anInt8539 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt8539;
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
						local217 = this.anIntArray646[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray646[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray646[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray646[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray646[arg2] = arg4;
					arg2++;
					this.anIntArray646[arg2] = arg4;
					arg2++;
					this.anIntArray646[arg2] = arg4;
					arg2++;
					this.anIntArray646[arg2] = arg4;
					arg2++;
					this.anIntArray646[arg2] = arg4;
					arg2++;
					this.anIntArray646[arg2] = arg4;
					arg2++;
					this.anIntArray646[arg2] = arg4;
					arg2++;
					this.anIntArray646[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray646[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt8539 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray646[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!vi;I)V")
	@Override
	public void method6947(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class126 local3 = this.method6980(Thread.currentThread());
		@Pc(7) Class8_Sub2 local7 = arg0.aClass355_1.aClass8_Sub2_9;
		for (@Pc(10) Class8_Sub2 local10 = local7.aClass8_Sub2_8; local10 != local7; local10 = local10.aClass8_Sub2_8) {
			@Pc(14) Class8_Sub2_Sub1 local14 = (Class8_Sub2_Sub1) local10;
			@Pc(19) int local19 = local14.anInt5208 >> 12;
			@Pc(24) int local24 = local14.anInt5211 >> 12;
			@Pc(29) int local29 = local14.anInt5210 >> 12;
			@Pc(54) float local54 = this.aClass113_Sub1_3.aFloat50 + this.aClass113_Sub1_3.aFloat38 * (float) local19 + this.aClass113_Sub1_3.aFloat48 * (float) local24 + this.aClass113_Sub1_3.aFloat43 * (float) local29;
			if (!(local54 < (float) this.anInt8544) && !(local54 > (float) local3.anInt3027)) {
				@Pc(103) int local103 = this.anInt8534 + (int) ((float) this.anInt8541 * (this.aClass113_Sub1_3.aFloat37 + this.aClass113_Sub1_3.aFloat40 * (float) local19 + this.aClass113_Sub1_3.aFloat41 * (float) local24 + this.aClass113_Sub1_3.aFloat42 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt8545 + (int) ((float) this.anInt8531 * (this.aClass113_Sub1_3.aFloat46 + this.aClass113_Sub1_3.aFloat49 * (float) local19 + this.aClass113_Sub1_3.aFloat39 * (float) local24 + this.aClass113_Sub1_3.aFloat45 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt8537 && local103 <= this.anInt8522 && local139 >= this.anInt8521 && local139 <= this.anInt8529) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method6973(local14, local103, local139, (int) local54, (local14.anInt5212 * this.anInt8541 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class126 local3 = this.method6980(Thread.currentThread());
		@Pc(6) Class251 local6 = local3.aClass251_2;
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
		@Pc(105) int local105 = arg0 - local6.method5323();
		@Pc(110) int local110 = arg1 - local6.method5310();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt6643 = 0;
		local6.aBoolean533 = local114 < 0 || local114 > local6.anInt6642 || local118 < 0 || local118 > local6.anInt6642 || local124 < 0 || local124 > local6.anInt6642;
		local6.method5316(local134, local138, local144, local114, local118, local124, 100, 100, 100, arg4);
		local6.aBoolean533 = local114 < 0 || local114 > local6.anInt6642 || local124 < 0 || local124 > local6.anInt6642 || local130 < 0 || local130 > local6.anInt6642;
		local6.method5316(local134, local144, local150, local114, local124, local130, 100, 100, 100, arg4);
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "()V")
	@Override
	public void method6898() {
	}

	@OriginalMember(owner = "client!tea", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(2) int local2 = this.anInt8533;
		this.anInt8533 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!tea", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt8544;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!fg;Z)Lclient!f;")
	@Override
	public Class22 method6896(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray224;
		@Pc(5) byte[] local5 = arg0.aByteArray32;
		@Pc(8) int local8 = arg0.anInt2624;
		@Pc(11) int local11 = arg0.anInt2626;
		@Pc(76) Class22_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray31 == null) {
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
			local76 = new Class22_Sub2_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray31;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class22_Sub2_Sub3(this, local20, local8, local11);
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
		local76.Q(arg0.anInt2622, arg0.anInt2625, arg0.anInt2623, arg0.anInt2621);
		return local76;
	}

	@OriginalMember(owner = "client!tea", name = "q", descriptor = "()Z")
	@Override
	public boolean method6936() {
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		this.anInt8540 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!tea", name = "t", descriptor = "()Z")
	@Override
	public boolean method6952() {
		return true;
	}

	@OriginalMember(owner = "client!tea", name = "x", descriptor = "()Z")
	@Override
	public boolean method6956() {
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt8537 == 0 && this.anInt8522 == this.anInt8539 && this.anInt8521 == 0 && this.anInt8529 == this.anInt8535) {
			local19 = this.anIntArray645.length;
			local25 = local19 - local19 & 0x7;
			local27 = 0;
			while (local27 < local25) {
				this.anIntArray645[local27++] = Integer.MAX_VALUE;
				this.anIntArray645[local27++] = Integer.MAX_VALUE;
				this.anIntArray645[local27++] = Integer.MAX_VALUE;
				this.anIntArray645[local27++] = Integer.MAX_VALUE;
				this.anIntArray645[local27++] = Integer.MAX_VALUE;
				this.anIntArray645[local27++] = Integer.MAX_VALUE;
				this.anIntArray645[local27++] = Integer.MAX_VALUE;
				this.anIntArray645[local27++] = Integer.MAX_VALUE;
			}
			while (local27 < local19) {
				this.anIntArray645[local27++] = Integer.MAX_VALUE;
			}
			return;
		}
		local19 = this.anInt8522 - this.anInt8537;
		local25 = this.anInt8529 - this.anInt8521;
		local27 = this.anInt8539 - local19;
		@Pc(116) int local116 = this.anInt8537 + this.anInt8521 * this.anInt8539;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.anIntArray645[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray645[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray645[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray645[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray645[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray645[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray645[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray645[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.anIntArray645[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "(I)[I")
	private int[] method6983(@OriginalArg(0) int arg0) {
		@Pc(2) Class222 local2 = this.aClass222_54;
		@Pc(12) Class1_Sub19 local12;
		synchronized (this.aClass222_54) {
			local12 = (Class1_Sub19) this.aClass222_54.method4430((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_10.method3871(arg0)) {
					return null;
				}
				@Pc(32) Class3 local32 = super.anInterface7_10.method3874(arg0);
				@Pc(42) int local42 = local32.aBoolean13 || this.aBoolean664 ? 64 : 128;
				local12 = new Class1_Sub19(arg0, local42, super.anInterface7_10.method3872(local42, local42, arg0, 0.7F), local32.aBoolean7);
				this.aClass222_54.method4434(local12, (long) arg0);
			}
		}
		local12.aBoolean198 = true;
		return local12.method2111();
	}

	@OriginalMember(owner = "client!tea", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class126 local3 = this.method6980(Thread.currentThread());
		local3.anInt3026 = arg0;
		local3.anInt3024 = arg1;
		local3.anInt3025 = arg2;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIIIIF)Lclient!rc;")
	@Override
	public Class1_Sub18 method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt8521) {
			local8 = this.anInt8521;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt8529) {
			local21 = this.anInt8529;
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
				if (local91 < this.anInt8537) {
					local91 = this.anInt8537;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8522) {
					local102 = this.anInt8522;
				}
				local116 = local91 + local30 * this.anInt8539;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray646[local116++] = arg3;
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
				if (local91 < this.anInt8537) {
					local91 = this.anInt8537;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8522 - 1) {
					local102 = this.anInt8522 - 1;
				}
				local116 = local91 + local30 * this.anInt8539;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray646[local116++] = arg3;
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
			if (local102 < this.anInt8537) {
				local102 = this.anInt8537;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt8522) {
				local116 = this.anInt8522;
			}
			local118 = local102 + local30 * this.anInt8539;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray646[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray646[local118++] = local277 + local360;
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
			if (local102 < this.anInt8537) {
				local102 = this.anInt8537;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt8522 - 1) {
				local116 = this.anInt8522 - 1;
			}
			local118 = local102 + local30 * this.anInt8539;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray646[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray646[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6920() {
		return this.aClass113_Sub1_3;
	}

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "()Z")
	@Override
	public boolean method6905() {
		return false;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6941(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(II)I")
	@Override
	public int method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!tea", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class204_Sub2 local2 = (Class204_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray469;
		@Pc(8) int[] local8 = local2.anIntArray470;
		@Pc(20) int local20;
		if (this.anInt8529 < arg3 + local5.length) {
			local20 = this.anInt8529 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt8521 > arg3) {
			local33 = this.anInt8521 - arg3;
			arg3 = this.anInt8521;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt8539;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt8537 > local58) {
				local62 -= this.anInt8537 - local58;
				local58 = this.anInt8537;
			}
			if (this.anInt8522 < local58 + local62) {
				local62 = this.anInt8522 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray646[local58++] = arg0;
			}
			local49 += this.anInt8539;
		}
	}

	@OriginalMember(owner = "client!tea", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass113_Sub1_3.aFloat50 + this.aClass113_Sub1_3.aFloat38 * (float) arg0 + this.aClass113_Sub1_3.aFloat48 * (float) arg1 + this.aClass113_Sub1_3.aFloat43 * (float) arg2;
		if (local24 < (float) this.anInt8544 || local24 > (float) this.anInt8543) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt8541 * (this.aClass113_Sub1_3.aFloat37 + this.aClass113_Sub1_3.aFloat40 * (float) arg0 + this.aClass113_Sub1_3.aFloat41 * (float) arg1 + this.aClass113_Sub1_3.aFloat42 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt8531 * (this.aClass113_Sub1_3.aFloat46 + this.aClass113_Sub1_3.aFloat49 * (float) arg0 + this.aClass113_Sub1_3.aFloat39 * (float) arg1 + this.aClass113_Sub1_3.aFloat45 * (float) arg2) / local24);
		if (local81 >= this.anInt8520 && local81 <= this.anInt8526 && local113 >= this.anInt8536 && local113 <= this.anInt8546) {
			arg3[0] = local81 - this.anInt8520;
			arg3[1] = local113 - this.anInt8536;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "(I)Lclient!e;")
	@Override
	public Class1_Sub5 method6964(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tea", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt8537 = 0;
		this.anInt8521 = 0;
		this.anInt8522 = this.anInt8539;
		this.anInt8529 = this.anInt8535;
		this.method6977();
	}

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "()Z")
	@Override
	public boolean method6900() {
		return true;
	}

	@OriginalMember(owner = "client!tea", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass126Array1.length; local1++) {
			this.aClass126Array1[local1].anInt3024 = this.aClass126Array1[local1].anInt3018;
			this.aClass126Array1[local1].aBoolean231 = false;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6919(@OriginalArg(0) Class113 arg0) {
		this.aClass113_Sub1_3 = (Class113_Sub1) arg0;
	}

	@OriginalMember(owner = "client!tea", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class126 local3 = this.method6980(Thread.currentThread());
		this.anInt8544 = arg0;
		this.anInt8543 = arg1;
		local3.anInt3027 = this.anInt8543 - 255;
	}

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "(I)Z")
	public boolean method6984(@OriginalArg(0) int arg0) {
		return super.anInterface7_10.method3871(arg0);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class22 method6950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class22_Sub2_Sub2(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "()V")
	@Override
	public void method6904() {
		this.aClass222_54.method4428();
		this.aClass222_55.method4428();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I[Lclient!rc;)V")
	@Override
	public void method6953(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18[] arg1) {
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6937(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas16 = null;
			this.aClass1_Sub26_1 = null;
			if (this.aClass22_36 == null) {
				this.anIntArray646 = null;
				this.anInt8539 = this.anInt8535 = 1;
				this.anInt8538 = this.anInt8542 = 1;
				this.method6981();
			}
			return;
		}
		@Pc(10) Class1_Sub26 local10 = (Class1_Sub26) this.aClass187_36.method3797((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas16 = arg0;
		this.aClass1_Sub26_1 = local10;
		if (this.aClass22_36 != null) {
			return;
		}
		this.anIntArray646 = local10.anIntArray683;
		this.anInt8539 = local10.anInt8991;
		this.anInt8535 = local10.anInt8988;
		if (this.anInt8539 != this.anInt8538 || this.anInt8535 != this.anInt8542) {
			this.anInt8538 = this.anInt8539;
			this.anInt8542 = this.anInt8535;
			this.anIntArray645 = new int[this.anInt8538 * this.anInt8542];
		}
		this.method6981();
		return;
	}

	@OriginalMember(owner = "client!tea", name = "C", descriptor = "()V")
	@Override
	public void method6971() {
	}

	@OriginalMember(owner = "client!tea", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8537 < arg0) {
			this.anInt8537 = arg0;
		}
		if (this.anInt8521 < arg1) {
			this.anInt8521 = arg1;
		}
		if (this.anInt8522 > arg2) {
			this.anInt8522 = arg2;
		}
		if (this.anInt8529 > arg3) {
			this.anInt8529 = arg3;
		}
		this.method6977();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
	@Override
	public void method6925(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt8519;
		for (@Pc(9) Object local9 = this.aClass222_54.method4425(); local9 != null; local9 = this.aClass222_54.method4423()) {
			@Pc(13) Class1_Sub19 local13 = (Class1_Sub19) local9;
			if (local13.aBoolean198) {
				local13.anInt2665 += local4;
				@Pc(27) int local27 = local13.anInt2665 / 20;
				if (local27 > 0) {
					@Pc(36) Class3 local36 = super.anInterface7_10.method3874(local13.anInt2666);
					local13.method2110(local36.aByte6 * local4 * 50 / 1000, local36.aByte3 * local4 * 50 / 1000);
					local13.anInt2665 -= local27 * 20;
				}
				local13.aBoolean198 = false;
			}
		}
		this.anInt8519 = arg0;
		this.aClass222_55.method4433(5);
		this.aClass222_54.method4433(5);
	}

	@OriginalMember(owner = "client!tea", name = "z", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6963() {
		@Pc(3) Class126 local3 = this.method6980(Thread.currentThread());
		return local3.aClass113_Sub1_2;
	}

	@OriginalMember(owner = "client!tea", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(2) int local2 = this.anInt8525;
		this.anInt8525 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!tea", name = "r", descriptor = "()V")
	@Override
	public void method6944() throws Exception_Sub1 {
		if (this.aCanvas16 == null || this.aClass1_Sub26_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas16.getGraphics();
			this.aClass1_Sub26_1.method7344(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas16.repaint();
		}
	}
}
