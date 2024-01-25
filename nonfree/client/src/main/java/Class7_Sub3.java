import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class7_Sub3 extends Class7 {

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Z")
	private boolean aBoolean693;

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "Lclient!mo;")
	private Class221 aClass221_40;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
	private int anInt10086;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "Lclient!pba;")
	private Class4_Sub14 aClass4_Sub14_1;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "Z")
	private boolean aBoolean694;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
	private int anInt10087;

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
	private int anInt10088;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "Lclient!jn;")
	private final Class167 aClass167_64;

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
	public int anInt10089;

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "[I")
	public int[] anIntArray572;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
	public int anInt10090;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "[I")
	public int[] anIntArray573;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
	public int anInt10091;

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
	public int anInt10092;

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
	public int anInt10093;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
	public int anInt10094;

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "Lclient!f;")
	private Class88 aClass88_32;

	@OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
	public int anInt10095;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "Lclient!jn;")
	private final Class167 aClass167_65;

	@OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
	public int anInt10096;

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
	public int anInt10097;

	@OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
	public int anInt10098;

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "Lclient!jw;")
	public Class81_Sub3 aClass81_Sub3_3;

	@OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
	public int anInt10099;

	@OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
	public int anInt10100;

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "I")
	private int anInt10101;

	@OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
	public int anInt10102;

	@OriginalMember(owner = "client!ve", name = "V", descriptor = "I")
	private int anInt10103;

	@OriginalMember(owner = "client!ve", name = "W", descriptor = "I")
	public int anInt10104;

	@OriginalMember(owner = "client!ve", name = "X", descriptor = "I")
	public int anInt10105;

	@OriginalMember(owner = "client!ve", name = "Y", descriptor = "I")
	public int anInt10106;

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
	private int anInt10107;

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
	public int anInt10108;

	@OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
	public int anInt10109;

	@OriginalMember(owner = "client!ve", name = "cb", descriptor = "[Lclient!qm;")
	private Class280[] aClass280Array1;

	@OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
	public int anInt10110;

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
	public int anInt10111;

	@OriginalMember(owner = "client!ve", name = "fb", descriptor = "I")
	public int anInt10112;

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
	public int anInt10113;

	@OriginalMember(owner = "client!ve", name = "hb", descriptor = "Z")
	private boolean aBoolean695;

	@OriginalMember(owner = "client!ve", name = "ib", descriptor = "Lclient!f;")
	private Class88 aClass88_33;

	@OriginalMember(owner = "client!ve", name = "jb", descriptor = "I")
	private int anInt10114;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public Class7_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1) {
		this(arg1);
		this.method7833(arg0);
		this.method7796(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!fa;)V")
	private Class7_Sub3(@OriginalArg(0) Interface7 arg0) {
		super(arg0);
		this.aBoolean693 = false;
		this.aBoolean694 = false;
		this.aClass221_40 = new Class221(4);
		this.anInt10092 = 75518;
		this.anInt10097 = 78642;
		this.anInt10096 = 50;
		this.anInt10090 = 0;
		this.anInt10095 = 0;
		this.anInt10087 = 0;
		this.anInt10100 = 45823;
		this.anInt10102 = 3500;
		this.anInt10094 = 512;
		this.anInt10108 = 0;
		this.anInt10105 = 512;
		this.anInt10103 = 0;
		this.aBoolean695 = false;
		this.anInt10113 = 0;
		this.aClass167_64 = new Class167(16);
		this.anInt10114 = -1;
		this.aClass167_65 = new Class167(256);
		this.aClass81_Sub3_3 = new Class81_Sub3();
		this.method7790(1);
		this.method7839(0);
		Static547.method7662(false, true);
		this.aBoolean693 = true;
		this.anInt10086 = (int) Static112.method2047();
	}

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "(I)I")
	public int method7856(@OriginalArg(0) int arg0) {
		return super.anInterface7_12.method4460(arg0).aShort21 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "(I)[I")
	private int[] method7857(@OriginalArg(0) int arg0) {
		@Pc(2) Class167 local2 = this.aClass167_65;
		@Pc(12) Class4_Sub28 local12;
		synchronized (this.aClass167_65) {
			local12 = (Class4_Sub28) this.aClass167_65.method3966((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_12.method4463(arg0)) {
					return null;
				}
				@Pc(32) Class69 local32 = super.anInterface7_12.method4460(arg0);
				@Pc(42) int local42 = local32.aBoolean179 || this.aBoolean695 ? 64 : 128;
				local12 = new Class4_Sub28(arg0, local42, super.anInterface7_12.method4464(local42, arg0, 0.7F, local42), local32.aBoolean175);
				this.aClass167_65.method3974((long) arg0, local12);
			}
		}
		local12.aBoolean370 = true;
		return local12.method4133();
	}

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "()V")
	@Override
	public void method7830() {
	}

	@OriginalMember(owner = "client!ve", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass280Array1.length; local1++) {
			this.aClass280Array1[local1].anInt8355 = this.aClass280Array1[local1].anInt8350;
			this.aClass280Array1[local1].aBoolean595 = false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)Lclient!e;")
	@Override
	public Class4_Sub8 method7818(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(IIIIII)Lclient!pa;")
	@Override
	public Class112 method7829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ve", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(2) int local2 = this.anInt10103;
		this.anInt10103 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class88 method7838(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class88_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class88_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class88_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class88_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt10090) {
			local8 = this.anInt10090;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt10113) {
			local21 = this.anInt10113;
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
				if (local91 < this.anInt10108) {
					local91 = this.anInt10108;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt10095) {
					local102 = this.anInt10095;
				}
				local116 = local91 + local30 * this.anInt10104;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray572[local116++] = arg3;
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
				if (local91 < this.anInt10108) {
					local91 = this.anInt10108;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt10095 - 1) {
					local102 = this.anInt10095 - 1;
				}
				local116 = local91 + local30 * this.anInt10104;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray572[local116++] = arg3;
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
			if (local102 < this.anInt10108) {
				local102 = this.anInt10108;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt10095) {
				local116 = this.anInt10095;
			}
			local118 = local102 + local30 * this.anInt10104;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray572[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray572[local118++] = local277 + local360;
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
			if (local102 < this.anInt10108) {
				local102 = this.anInt10108;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt10095 - 1) {
				local116 = this.anInt10095 - 1;
			}
			local118 = local102 + local30 * this.anInt10104;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray572[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray572[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "()Z")
	@Override
	public boolean method7850() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class280 local3 = this.method7865(Thread.currentThread());
		local3.anInt8351 = arg0;
		local3.anInt8355 = arg1;
		local3.anInt8356 = arg2;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	@Override
	public void method7790(@OriginalArg(0) int arg0) {
		this.anInt10089 = arg0;
		this.aClass280Array1 = new Class280[this.anInt10089];
		for (@Pc(9) int local9 = 0; local9 < this.anInt10089; local9++) {
			this.aClass280Array1[local9] = new Class280(this);
		}
	}

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "(I)Z")
	public boolean method7858(@OriginalArg(0) int arg0) {
		return super.anInterface7_12.method4460(arg0).aBoolean177;
	}

	@OriginalMember(owner = "client!ve", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass280Array1.length; local1++) {
			@Pc(7) Class280 local7 = this.aClass280Array1[local1];
			local7.anInt8355 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt8355 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt8355 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt8355 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt8355 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean596 = false;
			} else {
				local7.aBoolean596 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt10104) {
			arg2 = this.anInt10104;
		}
		if (arg3 > this.anInt10088) {
			arg3 = this.anInt10088;
		}
		this.anInt10108 = arg0;
		this.anInt10095 = arg2;
		this.anInt10090 = arg1;
		this.anInt10113 = arg3;
		this.method7866();
	}

	@OriginalMember(owner = "client!ve", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class280 local3 = this.method7865(Thread.currentThread());
		local3.aBoolean594 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class280 local3 = this.method7865(Thread.currentThread());
		@Pc(6) Class246 local6 = local3.aClass246_2;
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
		@Pc(105) int local105 = arg0 - local6.method5848();
		@Pc(110) int local110 = arg1 - local6.method5853();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt7439 = 0;
		this.ZA(false);
		local6.aBoolean546 = local114 < 0 || local114 > local6.anInt7444 || local118 < 0 || local118 > local6.anInt7444 || local124 < 0 || local124 > local6.anInt7444;
		local6.method5864(local134, local138, local144, local114, local118, local124, 100, 100, 100, arg4);
		local6.aBoolean546 = local114 < 0 || local114 > local6.anInt7444 || local124 < 0 || local124 > local6.anInt7444 || local130 < 0 || local130 > local6.anInt7444;
		local6.method5864(local134, local144, local150, local114, local124, local130, 100, 100, 100, arg4);
		this.ZA(true);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7833(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub14 local8 = (Class4_Sub14) this.aClass221_40.method5075((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static296.method4737(arg0);
			this.aClass221_40.method5073(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "()Z")
	@Override
	public boolean method7821() {
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)I")
	@Override
	public int method7793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIIIIIIIII)V")
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface7_12.method4460(arg6).aBoolean182) {
			this.method7868(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt10114 != arg6) {
			@Pc(26) Class88 local26 = (Class88) this.aClass167_64.method3966((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method7857(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method7863(arg6) ? 64 : 128;
				local26 = this.method7838(local32, local43, local43, local43);
				this.aClass167_64.method3974((long) arg6, local26);
			}
			this.anInt10114 = arg6;
			this.aClass88_33 = local26;
		}
		((Class88_Sub2) this.aClass88_33).method6693(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class67 method7787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class67_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass81_Sub3_3.aFloat123 * (float) arg0 + this.aClass81_Sub3_3.aFloat117 * (float) arg1 + this.aClass81_Sub3_3.aFloat113 * (float) arg2 + this.aClass81_Sub3_3.aFloat119;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass81_Sub3_3.aFloat123 * (float) arg3 + this.aClass81_Sub3_3.aFloat117 * (float) arg4 + this.aClass81_Sub3_3.aFloat113 * (float) arg5 + this.aClass81_Sub3_3.aFloat119;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt10096 && local55 < (float) this.anInt10096 || !(!(local24 > (float) this.anInt10102) || !(local55 > (float) this.anInt10102))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt10105 * (this.aClass81_Sub3_3.aFloat118 * (float) arg0 + this.aClass81_Sub3_3.aFloat114 * (float) arg1 + this.aClass81_Sub3_3.aFloat116 * (float) arg2 + this.aClass81_Sub3_3.aFloat120) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt10105 * (this.aClass81_Sub3_3.aFloat118 * (float) arg3 + this.aClass81_Sub3_3.aFloat114 * (float) arg4 + this.aClass81_Sub3_3.aFloat116 * (float) arg5 + this.aClass81_Sub3_3.aFloat120) / local55);
		if (local119 < this.anInt10098 && local151 < this.anInt10098 || local119 > this.anInt10091 && local151 > this.anInt10091) {
			return false;
		} else {
			@Pc(201) int local201 = (int) ((float) this.anInt10094 * (this.aClass81_Sub3_3.aFloat122 * (float) arg0 + this.aClass81_Sub3_3.aFloat121 * (float) arg1 + this.aClass81_Sub3_3.aFloat115 * (float) arg2 + this.aClass81_Sub3_3.aFloat112) / local24);
			@Pc(233) int local233 = (int) ((float) this.anInt10094 * (this.aClass81_Sub3_3.aFloat122 * (float) arg3 + this.aClass81_Sub3_3.aFloat121 * (float) arg4 + this.aClass81_Sub3_3.aFloat115 * (float) arg5 + this.aClass81_Sub3_3.aFloat112) / local55);
			return (local201 >= this.anInt10109 || local233 >= this.anInt10109) && (local201 <= this.anInt10110 || local233 <= this.anInt10110);
		}
	}

	@OriginalMember(owner = "client!ve", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.J(0, 0, this.anInt10104, this.anInt10088, arg0, 0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt10108) {
					arg1 += local104 * (this.anInt10108 - arg0);
					arg0 = this.anInt10108;
				}
				if (arg2 >= this.anInt10095) {
					arg2 = this.anInt10095 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt10090 && local150 < this.anInt10113) {
							this.anIntArray572[arg0 + local150 * this.anInt10104] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt10090 && local213 < this.anInt10113) {
							local228 = arg0 + local213 * this.anInt10104;
							local233 = this.anIntArray572[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray572[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt10090 && local150 < this.anInt10113) {
							local213 = arg0 + local150 * this.anInt10104;
							local228 = this.anIntArray572[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray572[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt10090) {
					arg0 += local104 * (this.anInt10090 - arg1);
					arg1 = this.anInt10090;
				}
				if (arg3 >= this.anInt10113) {
					arg3 = this.anInt10113 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt10108 && local150 < this.anInt10095) {
							this.anIntArray572[local150 + arg1 * this.anInt10104] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt10108 && local213 < this.anInt10095) {
							local228 = local213 + arg1 * this.anInt10104;
							local233 = this.anIntArray572[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray572[local213 + arg1 * this.anInt10104] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt10108 && local150 < this.anInt10095) {
							local213 = local150 + arg1 * this.anInt10104;
							local228 = this.anIntArray572[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray572[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!pa;)V")
	@Override
	public void method7784(@OriginalArg(0) Class112 arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "()V")
	private void method7860() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt10089; local1++) {
			this.aClass280Array1[local1].method6474();
		}
		this.JA();
	}

	@OriginalMember(owner = "client!ve", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10111 = arg0;
		this.anInt10099 = arg1;
		this.anInt10105 = arg2;
		this.anInt10094 = arg3;
		this.method7866();
	}

	@OriginalMember(owner = "client!ve", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(2) int local2 = this.anInt10087;
		this.anInt10087 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "()Z")
	@Override
	public boolean method7795() {
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7840(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub14 local8 = (Class4_Sub14) this.aClass221_40.method5075((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8193();
		local8 = Static296.method4737(arg0);
		this.aClass221_40.method5073(local8, (long) arg0.hashCode());
		if (this.aCanvas13 != arg0 || this.aClass88_32 != null) {
			return;
		}
		this.aClass4_Sub14_1 = local8;
		this.anIntArray572 = local8.anIntArray179;
		this.anInt10104 = local8.anInt3640;
		this.anInt10088 = local8.anInt3636;
		if (this.anInt10104 != this.anInt10107 || this.anInt10088 != this.anInt10101) {
			this.anInt10107 = this.anInt10104;
			this.anInt10101 = this.anInt10088;
			this.anIntArray573 = new int[this.anInt10107 * this.anInt10101];
		}
		this.method7860();
	}

	@OriginalMember(owner = "client!ve", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt10102;
	}

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "()Lclient!q;")
	@Override
	public Class81 method7812() {
		@Pc(3) Class280 local3 = this.method7865(Thread.currentThread());
		return local3.aClass81_Sub3_2;
	}

	@OriginalMember(owner = "client!ve", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt10104;
		@Pc(35) int local35 = this.anInt10104 - arg2;
		if (arg1 + arg3 > this.anInt10113) {
			arg3 -= arg1 + arg3 - this.anInt10113;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt10090) {
			local59 = this.anInt10090 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt10104;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt10095) {
			local59 = arg0 + arg2 - this.anInt10095;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt10108) {
			local59 = this.anInt10108 - arg0;
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
						this.anIntArray572[local30++] = arg4;
					} else {
						this.anIntArray572[local30++] = arg5;
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
					local245 = this.anIntArray572[local30];
					this.anIntArray572[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray572[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray572[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "()V")
	@Override
	protected void method7822() {
		if (this.aBoolean693) {
			Static506.method7293(true, false);
			this.aBoolean693 = false;
		}
		this.aClass4_Sub14_1 = null;
		this.aCanvas13 = null;
		this.aClass221_40 = null;
		this.aBoolean694 = true;
	}

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "()V")
	@Override
	public void method7811() {
		this.aClass167_65.method3961();
		this.aClass167_64.method3961();
	}

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "()I")
	@Override
	public int method7835() {
		return 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class88 method7788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt10104 + arg0;
		@Pc(16) int local16 = this.anInt10104 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray572[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class88_Sub2_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class88_Sub2_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7841() {
		@Pc(3) Class280 local3 = this.method7865(Thread.currentThread());
		@Pc(6) Class246 local6 = local3.aClass246_2;
		local6.aBoolean545 = false;
		@Pc(14) int local14 = 5 - this.anInt10098;
		@Pc(19) int local19 = 75 - this.anInt10098;
		@Pc(24) int local24 = 15 - this.anInt10098;
		@Pc(29) int local29 = 10 - this.anInt10109;
		@Pc(34) int local34 = 50 - this.anInt10109;
		@Pc(39) int local39 = 90 - this.anInt10109;
		local6.aBoolean546 = local14 < 0 || local14 > local6.anInt7444 || local19 < 0 || local19 > local6.anInt7444 || local24 < 0 || local24 > local6.anInt7444;
		local6.aBoolean542 = true;
		local6.anInt7439 = 0;
		local6.aBoolean543 = false;
		local6.method5858(local29, local34, local39, local14, local19, local24, 0, 0, 0, -65536, -65536, -65536);
		local6.aBoolean545 = true;
		local6.aBoolean542 = false;
	}

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "()V")
	@Override
	public void method7849() {
	}

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "()Z")
	@Override
	public boolean method7813() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "()Z")
	@Override
	public boolean method7820() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt10100 = (int) (arg1 * 65535.0F);
		this.anInt10097 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt10106 = (int) (arg3 * 65535.0F / local26);
		this.anInt10093 = (int) (arg4 * 65535.0F / local26);
		this.anInt10112 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!ve", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt10096;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIF)Lclient!am;")
	@Override
	public Class4_Sub3 method7819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "(I)[I")
	public int[] method7861(@OriginalArg(0) int arg0) {
		@Pc(2) Class167 local2 = this.aClass167_65;
		@Pc(12) Class4_Sub28 local12;
		synchronized (this.aClass167_65) {
			local12 = (Class4_Sub28) this.aClass167_65.method3966((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_12.method4463(arg0)) {
					return null;
				}
				@Pc(32) Class69 local32 = super.anInterface7_12.method4460(arg0);
				@Pc(42) int local42 = local32.aBoolean179 || this.aBoolean695 ? 64 : 128;
				local12 = new Class4_Sub28(arg0, local42, super.anInterface7_12.method4462(local42, true, arg0, 0.7F, local42), local32.aBoolean175);
				this.aClass167_65.method3974((long) arg0, local12);
			}
		}
		local12.aBoolean370 = true;
		return local12.method4133();
	}

	@OriginalMember(owner = "client!ve", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		this.anInt10092 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class88 method7855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class88_Sub2_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "()Z")
	public boolean method7862() {
		return this.aBoolean694;
	}

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)V")
	@Override
	public void method7853(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt10086;
		for (@Pc(9) Object local9 = this.aClass167_65.method3962(); local9 != null; local9 = this.aClass167_65.method3965()) {
			@Pc(13) Class4_Sub28 local13 = (Class4_Sub28) local9;
			if (local13.aBoolean370) {
				local13.anInt5307 += local4;
				@Pc(27) int local27 = local13.anInt5307 / 20;
				if (local27 > 0) {
					@Pc(36) Class69 local36 = super.anInterface7_12.method4460(local13.anInt5309);
					local13.method4135(local36.aByte41 * local4 * 50 / 1000, local36.aByte42 * local4 * 50 / 1000);
					local13.anInt5307 -= local27 * 20;
				}
				local13.aBoolean370 = false;
			}
		}
		this.anInt10086 = arg0;
		this.aClass167_64.method3964(5);
		this.aClass167_65.method3964(5);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!qg;)V")
	@Override
	public void method7777(@OriginalArg(0) Class276 arg0) {
		@Pc(3) Class280 local3 = this.method7865(Thread.currentThread());
		@Pc(7) Class21_Sub3 local7 = arg0.aClass39_1.aClass21_Sub3_1;
		for (@Pc(10) Class21_Sub3 local10 = local7.aClass21_Sub3_9; local10 != local7; local10 = local10.aClass21_Sub3_9) {
			@Pc(14) Class21_Sub3_Sub1 local14 = (Class21_Sub3_Sub1) local10;
			@Pc(19) int local19 = local14.anInt8632 >> 12;
			@Pc(24) int local24 = local14.anInt8629 >> 12;
			@Pc(29) int local29 = local14.anInt8627 >> 12;
			@Pc(54) float local54 = this.aClass81_Sub3_3.aFloat119 + this.aClass81_Sub3_3.aFloat123 * (float) local19 + this.aClass81_Sub3_3.aFloat117 * (float) local24 + this.aClass81_Sub3_3.aFloat113 * (float) local29;
			if (!(local54 < (float) this.anInt10096) && !(local54 > (float) local3.anInt8353)) {
				@Pc(102) int local102 = this.anInt10111 + (int) ((float) this.anInt10105 * (this.aClass81_Sub3_3.aFloat120 + this.aClass81_Sub3_3.aFloat118 * (float) local19 + this.aClass81_Sub3_3.aFloat114 * (float) local24 + this.aClass81_Sub3_3.aFloat116 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt10099 + (int) ((float) this.anInt10094 * (this.aClass81_Sub3_3.aFloat112 + this.aClass81_Sub3_3.aFloat122 * (float) local19 + this.aClass81_Sub3_3.aFloat121 * (float) local24 + this.aClass81_Sub3_3.aFloat115 * (float) local29) / local54);
				if (local102 >= this.anInt10108 && local102 <= this.anInt10095 && local137 >= this.anInt10090 && local137 <= this.anInt10113) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method7867(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt8623 * this.anInt10105 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class67_Sub2 local2 = (Class67_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray126;
		@Pc(8) int[] local8 = local2.anIntArray127;
		@Pc(20) int local20;
		if (this.anInt10113 < arg3 + local5.length) {
			local20 = this.anInt10113 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt10090 > arg3) {
			local33 = this.anInt10090 - arg3;
			arg3 = this.anInt10090;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt10104;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt10108 > local58) {
				local62 -= this.anInt10108 - local58;
				local58 = this.anInt10108;
			}
			if (this.anInt10095 < local58 + local62) {
				local62 = this.anInt10095 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray572[local58++] = arg0;
			}
			local49 += this.anInt10104;
		}
	}

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "()Z")
	@Override
	public boolean method7803() {
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "(I)Z")
	public boolean method7863(@OriginalArg(0) int arg0) {
		return this.aBoolean695 || super.anInterface7_12.method4460(arg0).aBoolean179;
	}

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "()Lclient!q;")
	@Override
	public Class81 method7842() {
		return new Class81_Sub3();
	}

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "()V")
	@Override
	public void method7827() throws Exception_Sub1 {
		if (this.aCanvas13 == null || this.aClass4_Sub14_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas13.getGraphics();
			this.aClass4_Sub14_1.method2878(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt10104 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray572[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7794(@OriginalArg(0) Class81 arg0) {
		this.aClass81_Sub3_3 = (Class81_Sub3) arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!qg;I)V")
	@Override
	public void method7832(@OriginalArg(0) Class276 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class280 local3 = this.method7865(Thread.currentThread());
		@Pc(7) Class21_Sub3 local7 = arg0.aClass39_1.aClass21_Sub3_1;
		for (@Pc(10) Class21_Sub3 local10 = local7.aClass21_Sub3_9; local10 != local7; local10 = local10.aClass21_Sub3_9) {
			@Pc(14) Class21_Sub3_Sub1 local14 = (Class21_Sub3_Sub1) local10;
			@Pc(19) int local19 = local14.anInt8632 >> 12;
			@Pc(24) int local24 = local14.anInt8629 >> 12;
			@Pc(29) int local29 = local14.anInt8627 >> 12;
			@Pc(54) float local54 = this.aClass81_Sub3_3.aFloat119 + this.aClass81_Sub3_3.aFloat123 * (float) local19 + this.aClass81_Sub3_3.aFloat117 * (float) local24 + this.aClass81_Sub3_3.aFloat113 * (float) local29;
			if (!(local54 < (float) this.anInt10096) && !(local54 > (float) local3.anInt8353)) {
				@Pc(103) int local103 = this.anInt10111 + (int) ((float) this.anInt10105 * (this.aClass81_Sub3_3.aFloat120 + this.aClass81_Sub3_3.aFloat118 * (float) local19 + this.aClass81_Sub3_3.aFloat114 * (float) local24 + this.aClass81_Sub3_3.aFloat116 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt10099 + (int) ((float) this.anInt10094 * (this.aClass81_Sub3_3.aFloat112 + this.aClass81_Sub3_3.aFloat122 * (float) local19 + this.aClass81_Sub3_3.aFloat121 * (float) local24 + this.aClass81_Sub3_3.aFloat115 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt10108 && local103 <= this.anInt10095 && local139 >= this.anInt10090 && local139 <= this.anInt10113) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method7867(local14, local103, local139, (int) local54, (local14.anInt8623 * this.anInt10105 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	@Override
	public void method7805(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "()Z")
	@Override
	public boolean method7831() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class115 method7804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class115_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ve", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass81_Sub3_3.aFloat119 + this.aClass81_Sub3_3.aFloat123 * (float) arg0 + this.aClass81_Sub3_3.aFloat117 * (float) arg1 + this.aClass81_Sub3_3.aFloat113 * (float) arg2;
		if (local24 < (float) this.anInt10096 || local24 > (float) this.anInt10102) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt10105 * (this.aClass81_Sub3_3.aFloat120 + this.aClass81_Sub3_3.aFloat118 * (float) arg0 + this.aClass81_Sub3_3.aFloat114 * (float) arg1 + this.aClass81_Sub3_3.aFloat116 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt10094 * (this.aClass81_Sub3_3.aFloat112 + this.aClass81_Sub3_3.aFloat122 * (float) arg0 + this.aClass81_Sub3_3.aFloat121 * (float) arg1 + this.aClass81_Sub3_3.aFloat115 * (float) arg2) / local24);
		arg3[0] = local81 - this.anInt10098;
		arg3[1] = local113 - this.anInt10109;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!ve", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt10108 = 0;
		this.anInt10090 = 0;
		this.anInt10095 = this.anInt10104;
		this.anInt10113 = this.anInt10088;
		this.method7866();
	}

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "(I)Z")
	public boolean method7864(@OriginalArg(0) int arg0) {
		return super.anInterface7_12.method4463(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!cr;IIII)Lclient!da;")
	@Override
	public Class65 method7828(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class65_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!qm;")
	public Class280 method7865(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt10089; local1++) {
			if (this.aClass280Array1[local1].aRunnable2 == arg0) {
				return this.aClass280Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "()Z")
	@Override
	public boolean method7834() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt10111, this.anInt10099, this.anInt10105, this.anInt10094 };
	}

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "()Z")
	@Override
	public boolean method7802() {
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "()Z")
	@Override
	public boolean method7807() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([I)V")
	@Override
	public void method7806(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt10104;
		arg0[1] = this.anInt10088;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7848(@OriginalArg(0) Class88 arg0) {
		if (arg0 instanceof Class88_Sub2_Sub3) {
			@Pc(5) Class88_Sub2_Sub3 local5 = (Class88_Sub2_Sub3) arg0;
			this.anInt10104 = local5.anInt8661;
			this.anInt10088 = local5.anInt8678;
			this.anIntArray572 = local5.anIntArray506;
			this.aClass88_32 = arg0;
		} else if (arg0 instanceof Class88_Sub2_Sub1) {
			@Pc(27) Class88_Sub2_Sub1 local27 = (Class88_Sub2_Sub1) arg0;
			this.anInt10104 = local27.anInt8661;
			this.anInt10088 = local27.anInt8678;
			this.anIntArray572 = local27.anIntArray210;
			this.aClass88_32 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method7860();
	}

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "()V")
	private void method7866() {
		this.anInt10098 = this.anInt10108 - this.anInt10111;
		this.anInt10091 = this.anInt10095 - this.anInt10111;
		this.anInt10109 = this.anInt10090 - this.anInt10099;
		this.anInt10110 = this.anInt10113 - this.anInt10099;
		for (@Pc(29) int local29 = 0; local29 < this.anInt10089; local29++) {
			@Pc(36) Class246 local36 = this.aClass280Array1[local29].aClass246_2;
			local36.anInt7440 = this.anInt10111 - this.anInt10108;
			local36.anInt7442 = this.anInt10099 - this.anInt10090;
			local36.anInt7444 = this.anInt10095 - this.anInt10108;
			local36.anInt7443 = this.anInt10113 - this.anInt10090;
		}
		@Pc(78) int local78 = this.anInt10090 * this.anInt10104 + this.anInt10108;
		for (@Pc(81) int local81 = this.anInt10090; local81 < this.anInt10113; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt10089; local84++) {
				this.aClass280Array1[local84].aClass246_2.anIntArray402[local81 - this.anInt10090] = local78;
			}
			local78 += this.anInt10104;
		}
	}

	@OriginalMember(owner = "client!ve", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass81_Sub3_3.aFloat119 + this.aClass81_Sub3_3.aFloat123 * (float) arg0 + this.aClass81_Sub3_3.aFloat117 * (float) arg1 + this.aClass81_Sub3_3.aFloat113 * (float) arg2;
		if (local24 < (float) this.anInt10096 || local24 > (float) this.anInt10102) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt10105 * (this.aClass81_Sub3_3.aFloat120 + this.aClass81_Sub3_3.aFloat118 * (float) arg0 + this.aClass81_Sub3_3.aFloat114 * (float) arg1 + this.aClass81_Sub3_3.aFloat116 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt10094 * (this.aClass81_Sub3_3.aFloat112 + this.aClass81_Sub3_3.aFloat122 * (float) arg0 + this.aClass81_Sub3_3.aFloat121 * (float) arg1 + this.aClass81_Sub3_3.aFloat115 * (float) arg2) / local24);
		if (local81 >= this.anInt10098 && local81 <= this.anInt10091 && local113 >= this.anInt10109 && local113 <= this.anInt10110) {
			arg3[0] = local81 - this.anInt10098;
			arg3[1] = local113 - this.anInt10109;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ve", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass280Array1.length; local1++) {
			this.aClass280Array1[local1].anInt8350 = this.aClass280Array1[local1].anInt8355;
			this.aClass280Array1[local1].anInt8351 = arg0;
			this.aClass280Array1[local1].anInt8355 = arg1;
			this.aClass280Array1[local1].anInt8356 = arg2;
			this.aClass280Array1[local1].aBoolean595 = true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt10108;
		arg0[1] = this.anInt10090;
		arg0[2] = this.anInt10095;
		arg0[3] = this.anInt10113;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7796(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas13 = null;
			this.aClass4_Sub14_1 = null;
			if (this.aClass88_32 == null) {
				this.anIntArray572 = null;
				this.anInt10104 = this.anInt10088 = 1;
				this.anInt10107 = this.anInt10101 = 1;
				this.method7860();
			}
			return;
		}
		@Pc(10) Class4_Sub14 local10 = (Class4_Sub14) this.aClass221_40.method5075((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas13 = arg0;
		this.aClass4_Sub14_1 = local10;
		if (this.aClass88_32 != null) {
			return;
		}
		this.anIntArray572 = local10.anIntArray179;
		this.anInt10104 = local10.anInt3640;
		this.anInt10088 = local10.anInt3636;
		if (this.anInt10104 != this.anInt10107 || this.anInt10088 != this.anInt10101) {
			this.anInt10107 = this.anInt10104;
			this.anInt10101 = this.anInt10088;
			this.anIntArray573 = new int[this.anInt10107 * this.anInt10101];
		}
		this.method7860();
		return;
	}

	@OriginalMember(owner = "client!ve", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class67 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class67_Sub2 local2 = (Class67_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray126;
		@Pc(8) int[] local8 = local2.anIntArray127;
		@Pc(17) int local17 = this.anInt10090 > arg7 ? this.anInt10090 : arg7;
		@Pc(32) int local32 = this.anInt10113 < arg7 + local5.length ? this.anInt10113 : arg7 + local5.length;
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
					if (local129 >= this.anInt10108 && local129 < this.anInt10095 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray572[local129 + arg1 * this.anInt10104] = arg4;
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
					if (local133 >= this.anInt10108 && local133 < this.anInt10095 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt10104;
						local248 = this.anIntArray572[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray572[local133 + arg1 * this.anInt10104] = local201 + local584;
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
		if (arg0 < this.anInt10108) {
			arg1 += local83 * (this.anInt10108 - arg0);
			arg0 = this.anInt10108;
		}
		if (arg2 >= this.anInt10095) {
			arg2 = this.anInt10095 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray572[arg0 + local129 * this.anInt10104] = arg4;
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
					local243 = arg0 + local133 * this.anInt10104;
					local248 = this.anIntArray572[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray572[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ll;[Lclient!fda;Z)Lclient!la;")
	@Override
	public Class45 method7837(@OriginalArg(0) Class198 arg0, @OriginalArg(1) Class103[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3039;
			local7[local11] = arg1[local11].anInt3041;
			if (arg1[local11].aByteArray22 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class45_Sub5(this, arg0, arg1, local3, local7);
		} else {
			return new Class45_Sub4(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7799(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas13 == null || this.aClass4_Sub14_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas13.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt10104 && local21.y <= this.anInt10088 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass4_Sub14_1.method2875(local21.height, local21.x, local21.width, local14, local21.y);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!pa;Lclient!pa;FLclient!pa;)Lclient!pa;")
	@Override
	public Class112 method7816(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class112 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt10108) {
			arg2 -= this.anInt10108 - arg0;
			arg0 = this.anInt10108;
		}
		if (arg1 < this.anInt10090) {
			arg3 -= this.anInt10090 - arg1;
			arg1 = this.anInt10090;
		}
		if (arg0 + arg2 > this.anInt10095) {
			arg2 = this.anInt10095 - arg0;
		}
		if (arg1 + arg3 > this.anInt10113) {
			arg3 = this.anInt10113 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt10095 || arg1 > this.anInt10113) {
			return;
		}
		@Pc(67) int local67 = this.anInt10104 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt10104;
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
						local217 = this.anIntArray572[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray572[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray572[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray572[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray572[arg2] = arg4;
					arg2++;
					this.anIntArray572[arg2] = arg4;
					arg2++;
					this.anIntArray572[arg2] = arg4;
					arg2++;
					this.anIntArray572[arg2] = arg4;
					arg2++;
					this.anIntArray572[arg2] = arg4;
					arg2++;
					this.anIntArray572[arg2] = arg4;
					arg2++;
					this.anIntArray572[arg2] = arg4;
					arg2++;
					this.anIntArray572[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray572[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)V")
	@Override
	public void method7839(@OriginalArg(0) int arg0) {
		this.aClass280Array1[arg0].method6476(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
	@Override
	public void method7810(@OriginalArg(0) int arg0) {
		this.aClass280Array1[arg0].method6476(null);
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "()Z")
	@Override
	public boolean method7782() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	@Override
	public void method7791(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!dg;IIII)V")
	private void method7867(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt8630;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method7868(arg1, arg2, arg3, arg4, arg0.anInt8631, 1);
			return;
		}
		if (this.anInt10114 != local2) {
			@Pc(33) Class88 local33 = (Class88) this.aClass167_64.method3966((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method7857(local2);
				if (local39 == null) {
					return;
				}
				@Pc(49) int local49 = this.method7863(local2) ? 64 : 128;
				local33 = this.method7838(local39, local49, local49, local49);
				this.aClass167_64.method3974((long) local2, local33);
			}
			this.anInt10114 = local2;
			this.aClass88_33 = local33;
		}
		local8++;
		((Class88_Sub2) this.aClass88_33).method6693(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt8631, 1);
	}

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "()Lclient!sr;")
	@Override
	public Class308 method7815() {
		return new Class308(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7801(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "()V")
	@Override
	public void method7780() {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()Z")
	@Override
	public boolean method7779() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7836(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			this.method7796(null);
		}
		@Pc(15) Class4_Sub14 local15 = (Class4_Sub14) this.aClass221_40.method5075((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8193();
		}
	}

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "()V")
	@Override
	public void method7854() {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method7851(@OriginalArg(0) Class4_Sub8 arg0) {
	}

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "()Z")
	@Override
	public boolean method7845() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "()V")
	@Override
	public void method7843() {
		if (this.aCanvas13 == null) {
			this.anInt10104 = 1;
			this.anInt10088 = 1;
			this.anIntArray572 = null;
		} else {
			this.anIntArray572 = this.aClass4_Sub14_1.anIntArray179;
			this.anInt10104 = this.aClass4_Sub14_1.anInt3640;
			this.anInt10088 = this.aClass4_Sub14_1.anInt3636;
		}
		this.aClass88_32 = null;
		this.method7860();
	}

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "()Z")
	@Override
	public boolean method7847() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt10090 || arg1 >= this.anInt10113) {
			return;
		}
		if (arg0 < this.anInt10108) {
			arg2 -= this.anInt10108 - arg0;
			arg0 = this.anInt10108;
		}
		if (arg0 + arg2 > this.anInt10095) {
			arg2 = this.anInt10095 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt10104;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray572[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray572[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray572[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray572[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray572[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ve", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt10108 < arg0) {
			this.anInt10108 = arg0;
		}
		if (this.anInt10090 < arg1) {
			this.anInt10090 = arg1;
		}
		if (this.anInt10095 > arg2) {
			this.anInt10095 = arg2;
		}
		if (this.anInt10113 > arg3) {
			this.anInt10113 = arg3;
		}
		this.method7866();
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "()Lclient!q;")
	@Override
	public Class81 method7781() {
		return this.aClass81_Sub3_3;
	}

	@OriginalMember(owner = "client!ve", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt10108 == 0 && this.anInt10095 == this.anInt10104 && this.anInt10090 == 0 && this.anInt10113 == this.anInt10088) {
			local19 = this.anIntArray573.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.anIntArray573[local27++] = Integer.MAX_VALUE;
				this.anIntArray573[local27++] = Integer.MAX_VALUE;
				this.anIntArray573[local27++] = Integer.MAX_VALUE;
				this.anIntArray573[local27++] = Integer.MAX_VALUE;
				this.anIntArray573[local27++] = Integer.MAX_VALUE;
				this.anIntArray573[local27++] = Integer.MAX_VALUE;
				this.anIntArray573[local27++] = Integer.MAX_VALUE;
				this.anIntArray573[local27++] = Integer.MAX_VALUE;
			}
			while (local27 < local19) {
				this.anIntArray573[local27++] = Integer.MAX_VALUE;
			}
			return;
		}
		local19 = this.anInt10095 - this.anInt10108;
		local25 = this.anInt10113 - this.anInt10090;
		local27 = this.anInt10104 - local19;
		@Pc(116) int local116 = this.anInt10108 + this.anInt10090 * this.anInt10104;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.anIntArray573[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray573[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray573[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray573[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray573[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray573[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray573[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray573[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.anIntArray573[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt10108 || arg0 >= this.anInt10095) {
			return;
		}
		if (arg1 < this.anInt10090) {
			arg2 -= this.anInt10090 - arg1;
			arg1 = this.anInt10090;
		}
		if (arg1 + arg2 > this.anInt10113) {
			arg2 = this.anInt10113 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt10104;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray572[local40 + local54 * this.anInt10104] = arg3;
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
				local111 = local40 + local103 * this.anInt10104;
				local116 = this.anIntArray572[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray572[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt10104;
				local111 = this.anIntArray572[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray572[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ve", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class280 local3 = this.method7865(Thread.currentThread());
		this.anInt10096 = arg0;
		this.anInt10102 = arg1;
		local3.anInt8353 = this.anInt10102 - 255;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
	@Override
	public int method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!fda;Z)Lclient!f;")
	@Override
	public Class88 method7808(@OriginalArg(0) Class103 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray142;
		@Pc(5) byte[] local5 = arg0.aByteArray23;
		@Pc(8) int local8 = arg0.anInt3039;
		@Pc(11) int local11 = arg0.anInt3041;
		@Pc(76) Class88_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray22 == null) {
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
			local76 = new Class88_Sub2_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray22;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class88_Sub2_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class88_Sub2_Sub1(this, local20, local8, local11);
			}
		}
		local76.Q(arg0.anInt3037, arg0.anInt3038, arg0.anInt3036, arg0.anInt3040);
		return local76;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
	@Override
	public void method7826(@OriginalArg(0) boolean arg0) {
		this.aBoolean695 = arg0;
		this.aClass167_65.method3961();
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(IIIIII)V")
	private void method7868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg2 << 8;
		@Pc(12) int local12 = arg1 - arg3;
		if (local12 < this.anInt10090) {
			local12 = this.anInt10090;
		}
		@Pc(25) int local25 = arg1 + arg3 + 1;
		if (local25 > this.anInt10113) {
			local25 = this.anInt10113;
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
				if (local95 < this.anInt10108) {
					local95 = this.anInt10108;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt10095) {
					local106 = this.anInt10095;
				}
				local120 = local95 + local34 * this.anInt10104;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray573[local120]) {
						this.anIntArray572[local120] = arg4;
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
				if (local95 < this.anInt10108) {
					local95 = this.anInt10108;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt10095 - 1) {
					local106 = this.anInt10095 - 1;
				}
				local120 = local95 + local34 * this.anInt10104;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray573[local120]) {
						this.anIntArray572[local120] = arg4;
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
				if (local106 < this.anInt10108) {
					local106 = this.anInt10108;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt10095) {
					local120 = this.anInt10095;
				}
				local122 = local106 + local34 * this.anInt10104;
				for (local350 = local106; local350 < local120; local350++) {
					if (local8 < this.anIntArray573[local122]) {
						local362 = this.anIntArray572[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray572[local122] = local293 + local362;
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
				if (local106 < this.anInt10108) {
					local106 = this.anInt10108;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt10095 - 1) {
					local120 = this.anInt10095 - 1;
				}
				local122 = local106 + local34 * this.anInt10104;
				for (local350 = local106; local350 <= local120; local350++) {
					if (local8 < this.anIntArray573[local122]) {
						local362 = this.anIntArray572[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray572[local122] = local293 + local362;
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
				if (local95 < this.anInt10108) {
					local95 = this.anInt10108;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt10095) {
					local106 = this.anInt10095;
				}
				local120 = local95 + local34 * this.anInt10104;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray573[local120]) {
						local350 = this.anIntArray572[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(637) int local637 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray572[local120] = local362 - local637 | local637 - (local637 >>> 8);
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
				if (local95 < this.anInt10108) {
					local95 = this.anInt10108;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt10095 - 1) {
					local106 = this.anInt10095 - 1;
				}
				local120 = local95 + local34 * this.anInt10104;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray573[local120]) {
						local350 = this.anIntArray572[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray572[local120] = local362 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I[Lclient!am;)V")
	@Override
	public void method7852(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3[] arg1) {
	}
}
