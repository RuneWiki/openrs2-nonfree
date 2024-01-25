import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class162_Sub2 extends Class162 {

	@OriginalMember(owner = "client!st", name = "p", descriptor = "Z")
	private boolean aBoolean669;

	@OriginalMember(owner = "client!st", name = "q", descriptor = "I")
	private int anInt7880;

	@OriginalMember(owner = "client!st", name = "r", descriptor = "Lclient!efa;")
	private Class90 aClass90_35;

	@OriginalMember(owner = "client!st", name = "s", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!st", name = "t", descriptor = "Z")
	private boolean aBoolean670;

	@OriginalMember(owner = "client!st", name = "u", descriptor = "Lclient!nca;")
	private Class2_Sub24 aClass2_Sub24_1;

	@OriginalMember(owner = "client!st", name = "v", descriptor = "Lclient!au;")
	private final Class21 aClass21_77;

	@OriginalMember(owner = "client!st", name = "w", descriptor = "I")
	public int anInt7881;

	@OriginalMember(owner = "client!st", name = "x", descriptor = "[I")
	public int[] anIntArray528;

	@OriginalMember(owner = "client!st", name = "y", descriptor = "I")
	public int anInt7882;

	@OriginalMember(owner = "client!st", name = "z", descriptor = "I")
	public int anInt7883;

	@OriginalMember(owner = "client!st", name = "A", descriptor = "I")
	public int anInt7884;

	@OriginalMember(owner = "client!st", name = "B", descriptor = "I")
	public int anInt7885;

	@OriginalMember(owner = "client!st", name = "C", descriptor = "Z")
	private boolean aBoolean671;

	@OriginalMember(owner = "client!st", name = "D", descriptor = "[I")
	public int[] anIntArray529;

	@OriginalMember(owner = "client!st", name = "E", descriptor = "I")
	public int anInt7886;

	@OriginalMember(owner = "client!st", name = "F", descriptor = "I")
	public int anInt7887;

	@OriginalMember(owner = "client!st", name = "G", descriptor = "I")
	public int anInt7888;

	@OriginalMember(owner = "client!st", name = "H", descriptor = "I")
	public int anInt7889;

	@OriginalMember(owner = "client!st", name = "I", descriptor = "I")
	public int anInt7890;

	@OriginalMember(owner = "client!st", name = "J", descriptor = "I")
	public int anInt7891;

	@OriginalMember(owner = "client!st", name = "K", descriptor = "I")
	private int anInt7892;

	@OriginalMember(owner = "client!st", name = "L", descriptor = "I")
	public int anInt7893;

	@OriginalMember(owner = "client!st", name = "M", descriptor = "I")
	public int anInt7894;

	@OriginalMember(owner = "client!st", name = "N", descriptor = "I")
	private int anInt7895;

	@OriginalMember(owner = "client!st", name = "O", descriptor = "I")
	private int anInt7896;

	@OriginalMember(owner = "client!st", name = "P", descriptor = "Lclient!au;")
	private final Class21 aClass21_78;

	@OriginalMember(owner = "client!st", name = "Q", descriptor = "Lclient!nd;")
	public Class25_Sub3 aClass25_Sub3_3;

	@OriginalMember(owner = "client!st", name = "R", descriptor = "I")
	public int anInt7897;

	@OriginalMember(owner = "client!st", name = "S", descriptor = "I")
	public int anInt7898;

	@OriginalMember(owner = "client!st", name = "T", descriptor = "I")
	private int anInt7899;

	@OriginalMember(owner = "client!st", name = "U", descriptor = "I")
	public int anInt7900;

	@OriginalMember(owner = "client!st", name = "V", descriptor = "I")
	public int anInt7901;

	@OriginalMember(owner = "client!st", name = "W", descriptor = "[Lclient!qb;")
	private Class276[] aClass276Array1;

	@OriginalMember(owner = "client!st", name = "X", descriptor = "I")
	public int anInt7902;

	@OriginalMember(owner = "client!st", name = "Y", descriptor = "I")
	public int anInt7903;

	@OriginalMember(owner = "client!st", name = "Z", descriptor = "Lclient!f;")
	private Class38 aClass38_38;

	@OriginalMember(owner = "client!st", name = "ab", descriptor = "I")
	public int anInt7904;

	@OriginalMember(owner = "client!st", name = "bb", descriptor = "I")
	public int anInt7905;

	@OriginalMember(owner = "client!st", name = "cb", descriptor = "I")
	public int anInt7906;

	@OriginalMember(owner = "client!st", name = "db", descriptor = "I")
	private int anInt7907;

	@OriginalMember(owner = "client!st", name = "eb", descriptor = "Lclient!f;")
	private Class38 aClass38_39;

	@OriginalMember(owner = "client!st", name = "fb", descriptor = "I")
	private int anInt7908;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public Class162_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1) {
		this(arg1);
		this.method6814(arg0);
		this.method6884(arg0);
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!fa;)V")
	private Class162_Sub2(@OriginalArg(0) Interface9 arg0) {
		super(arg0);
		this.aBoolean669 = false;
		this.aBoolean670 = false;
		this.aClass90_35 = new Class90(4);
		this.anInt7884 = 0;
		this.anInt7885 = 0;
		this.anInt7887 = 75518;
		this.aBoolean671 = false;
		this.anInt7894 = 0;
		this.anInt7899 = 0;
		this.anInt7901 = 512;
		this.anInt7900 = 512;
		this.anInt7893 = 3500;
		this.anInt7883 = 78642;
		this.anInt7890 = 50;
		this.anInt7898 = 0;
		this.anInt7906 = 45823;
		this.anInt7907 = 0;
		this.aClass21_77 = new Class21(16);
		this.anInt7908 = -1;
		this.aClass21_78 = new Class21(256);
		this.aClass25_Sub3_3 = new Class25_Sub3();
		this.method6823(1);
		this.method6850(0);
		Static50.method866(false, true);
		this.aBoolean670 = true;
		this.anInt7880 = (int) Static362.method5133();
	}

	@OriginalMember(owner = "client!st", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt7894) {
			local8 = this.anInt7894;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt7884) {
			local21 = this.anInt7884;
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
				if (local91 < this.anInt7898) {
					local91 = this.anInt7898;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7885) {
					local102 = this.anInt7885;
				}
				local116 = local91 + local30 * this.anInt7902;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray529[local116++] = arg3;
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
				if (local91 < this.anInt7898) {
					local91 = this.anInt7898;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7885 - 1) {
					local102 = this.anInt7885 - 1;
				}
				local116 = local91 + local30 * this.anInt7902;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray529[local116++] = arg3;
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
			if (local102 < this.anInt7898) {
				local102 = this.anInt7898;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt7885) {
				local116 = this.anInt7885;
			}
			local118 = local102 + local30 * this.anInt7902;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray529[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray529[local118++] = local277 + local360;
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
			if (local102 < this.anInt7898) {
				local102 = this.anInt7898;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt7885 - 1) {
				local116 = this.anInt7885 - 1;
			}
			local118 = local102 + local30 * this.anInt7902;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray529[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray529[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!st", name = "g", descriptor = "(I)I")
	public int method6424(@OriginalArg(0) int arg0) {
		return super.anInterface9_10.method1074(arg0).aShort88 & 0xFFFF;
	}

	@OriginalMember(owner = "client!st", name = "y", descriptor = "()Z")
	@Override
	public boolean method6866() {
		return false;
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V")
	@Override
	public void method6829(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt7880;
		for (@Pc(9) Object local9 = this.aClass21_78.method325(); local9 != null; local9 = this.aClass21_78.method316()) {
			@Pc(13) Class2_Sub25 local13 = (Class2_Sub25) local9;
			if (local13.aBoolean300) {
				local13.anInt3989 += local4;
				@Pc(27) int local27 = local13.anInt3989 / 20;
				if (local27 > 0) {
					@Pc(36) Class291 local36 = super.anInterface9_10.method1074(local13.anInt3990);
					local13.method3433(local36.aByte97 * local4 * 50 / 1000, local36.aByte100 * local4 * 50 / 1000);
					local13.anInt3989 -= local27 * 20;
				}
				local13.aBoolean300 = false;
			}
		}
		this.anInt7880 = arg0;
		this.aClass21_77.method323(5);
		this.aClass21_78.method323(5);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!fo;[Lclient!ut;Z)Lclient!la;")
	@Override
	public Class37 method6864(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class344[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt8947;
			local7[local11] = arg1[local11].anInt8946;
			if (arg1[local11].aByteArray95 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class37_Sub4(this, arg0, arg1, local3, local7);
		} else {
			return new Class37_Sub2(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!st", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(2) int local2 = this.anInt7899;
		this.anInt7899 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!st", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7898 < arg0) {
			this.anInt7898 = arg0;
		}
		if (this.anInt7894 < arg1) {
			this.anInt7894 = arg1;
		}
		if (this.anInt7885 > arg2) {
			this.anInt7885 = arg2;
		}
		if (this.anInt7884 > arg3) {
			this.anInt7884 = arg3;
		}
		this.method6431();
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(IIIIII)Lclient!rs;")
	@Override
	public Class17 method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!st", name = "x", descriptor = "()Z")
	@Override
	public boolean method6865() {
		return true;
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6854(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			this.method6884(null);
		}
		@Pc(15) Class2_Sub24 local15 = (Class2_Sub24) this.aClass90_35.method1685((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7657();
		}
	}

	@OriginalMember(owner = "client!st", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt7902) {
			arg2 = this.anInt7902;
		}
		if (arg3 > this.anInt7896) {
			arg3 = this.anInt7896;
		}
		this.anInt7898 = arg0;
		this.anInt7885 = arg2;
		this.anInt7894 = arg1;
		this.anInt7884 = arg3;
		this.method6431();
	}

	@OriginalMember(owner = "client!st", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.J(0, 0, this.anInt7902, this.anInt7896, arg0, 0);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!uo;)V")
	@Override
	public void method6860(@OriginalArg(0) Class339 arg0) {
		@Pc(3) Class276 local3 = this.method6436(Thread.currentThread());
		@Pc(7) Class12_Sub1 local7 = arg0.aClass77_1.aClass12_Sub1_5;
		for (@Pc(10) Class12_Sub1 local10 = local7.aClass12_Sub1_9; local10 != local7; local10 = local10.aClass12_Sub1_9) {
			@Pc(14) Class12_Sub1_Sub1 local14 = (Class12_Sub1_Sub1) local10;
			@Pc(19) int local19 = local14.anInt4849 >> 12;
			@Pc(24) int local24 = local14.anInt4843 >> 12;
			@Pc(29) int local29 = local14.anInt4848 >> 12;
			@Pc(54) float local54 = this.aClass25_Sub3_3.aFloat169 + this.aClass25_Sub3_3.aFloat165 * (float) local19 + this.aClass25_Sub3_3.aFloat167 * (float) local24 + this.aClass25_Sub3_3.aFloat174 * (float) local29;
			if (!(local54 < (float) this.anInt7890) && !(local54 > (float) local3.anInt6936)) {
				@Pc(102) int local102 = this.anInt7881 + (int) ((float) this.anInt7900 * (this.aClass25_Sub3_3.aFloat172 + this.aClass25_Sub3_3.aFloat166 * (float) local19 + this.aClass25_Sub3_3.aFloat171 * (float) local24 + this.aClass25_Sub3_3.aFloat168 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt7904 + (int) ((float) this.anInt7901 * (this.aClass25_Sub3_3.aFloat163 + this.aClass25_Sub3_3.aFloat164 * (float) local19 + this.aClass25_Sub3_3.aFloat173 * (float) local24 + this.aClass25_Sub3_3.aFloat170 * (float) local29) / local54);
				if (local102 >= this.anInt7898 && local102 <= this.anInt7885 && local137 >= this.anInt7894 && local137 <= this.anInt7884) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method6425(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt4846 * this.anInt7900 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass276Array1.length; local1++) {
			this.aClass276Array1[local1].anInt6932 = this.aClass276Array1[local1].anInt6933;
			this.aClass276Array1[local1].aBoolean564 = false;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class84_Sub1 local2 = (Class84_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray167;
		@Pc(8) int[] local8 = local2.anIntArray166;
		@Pc(17) int local17 = this.anInt7894 > arg7 ? this.anInt7894 : arg7;
		@Pc(32) int local32 = this.anInt7884 < arg7 + local5.length ? this.anInt7884 : arg7 + local5.length;
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
					if (local129 >= this.anInt7898 && local129 < this.anInt7885 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray529[local129 + arg1 * this.anInt7902] = arg4;
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
					if (local133 >= this.anInt7898 && local133 < this.anInt7885 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt7902;
						local248 = this.anIntArray529[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray529[local133 + arg1 * this.anInt7902] = local201 + local584;
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
		if (arg0 < this.anInt7898) {
			arg1 += local83 * (this.anInt7898 - arg0);
			arg0 = this.anInt7898;
		}
		if (arg2 >= this.anInt7885) {
			arg2 = this.anInt7885 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray529[arg0 + local129 * this.anInt7902] = arg4;
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
					local243 = arg0 + local133 * this.anInt7902;
					local248 = this.anIntArray529[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray529[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!st", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt7898 || arg0 >= this.anInt7885) {
			return;
		}
		if (arg1 < this.anInt7894) {
			arg2 -= this.anInt7894 - arg1;
			arg1 = this.anInt7894;
		}
		if (arg1 + arg2 > this.anInt7884) {
			arg2 = this.anInt7884 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt7902;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray529[local40 + local54 * this.anInt7902] = arg3;
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
				local111 = local40 + local103 * this.anInt7902;
				local116 = this.anIntArray529[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray529[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt7902;
				local111 = this.anIntArray529[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray529[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!st", name = "i", descriptor = "()V")
	@Override
	public void method6840() {
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIF)Lclient!tg;")
	@Override
	public Class2_Sub11 method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!an;IIII)V")
	private void method6425(@OriginalArg(0) Class12_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt4847;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method6430(arg1, arg2, arg3, arg4, arg0.anInt4841, 1);
			return;
		}
		if (this.anInt7908 != local2) {
			@Pc(33) Class38 local33 = (Class38) this.aClass21_77.method324((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method6429(local2);
				if (local39 == null) {
					return;
				}
				@Pc(49) int local49 = this.method6435(local2) ? 64 : 128;
				local33 = this.method6879(local39, local49, local49, local49);
				this.aClass21_77.method317(local33, (long) local2);
			}
			this.anInt7908 = local2;
			this.aClass38_39 = local33;
		}
		local8++;
		((Class38_Sub1) this.aClass38_39).method5929(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt4841, 1);
	}

	@OriginalMember(owner = "client!st", name = "h", descriptor = "(I)[I")
	public int[] method6426(@OriginalArg(0) int arg0) {
		@Pc(2) Class21 local2 = this.aClass21_78;
		@Pc(12) Class2_Sub25 local12;
		synchronized (this.aClass21_78) {
			local12 = (Class2_Sub25) this.aClass21_78.method324((long) arg0);
			if (local12 == null) {
				if (!super.anInterface9_10.method1073(arg0)) {
					return null;
				}
				@Pc(32) Class291 local32 = super.anInterface9_10.method1074(arg0);
				@Pc(42) int local42 = local32.aBoolean602 || this.aBoolean671 ? 64 : 128;
				local12 = new Class2_Sub25(arg0, local42, super.anInterface9_10.method1076(0.7F, local42, true, local42, arg0), local32.aBoolean595);
				this.aClass21_78.method317(local12, (long) arg0);
			}
		}
		local12.aBoolean300 = true;
		return local12.method3434();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6828() {
		@Pc(3) Class276 local3 = this.method6436(Thread.currentThread());
		@Pc(6) Class363 local6 = local3.aClass363_2;
		local6.aBoolean794 = false;
		@Pc(14) int local14 = 5 - this.anInt7891;
		@Pc(19) int local19 = 75 - this.anInt7891;
		@Pc(24) int local24 = 15 - this.anInt7891;
		@Pc(29) int local29 = 10 - this.anInt7882;
		@Pc(34) int local34 = 50 - this.anInt7882;
		@Pc(39) int local39 = 90 - this.anInt7882;
		local6.aBoolean792 = local14 < 0 || local14 > local6.anInt9523 || local19 < 0 || local19 > local6.anInt9523 || local24 < 0 || local24 > local6.anInt9523;
		local6.aBoolean791 = true;
		local6.anInt9524 = 0;
		local6.aBoolean796 = false;
		local6.method7609(local29, local34, local39, local14, local19, local24, 0, 0, 0, -65536, -65536, -65536);
		local6.aBoolean794 = true;
		local6.aBoolean791 = false;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)V")
	@Override
	public void method6813(@OriginalArg(0) boolean arg0) {
		this.aBoolean671 = arg0;
		this.aClass21_78.method313();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt7898) {
					arg1 += local104 * (this.anInt7898 - arg0);
					arg0 = this.anInt7898;
				}
				if (arg2 >= this.anInt7885) {
					arg2 = this.anInt7885 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt7894 && local150 < this.anInt7884) {
							this.anIntArray529[arg0 + local150 * this.anInt7902] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt7894 && local213 < this.anInt7884) {
							local228 = arg0 + local213 * this.anInt7902;
							local233 = this.anIntArray529[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray529[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt7894 && local150 < this.anInt7884) {
							local213 = arg0 + local150 * this.anInt7902;
							local228 = this.anIntArray529[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray529[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt7894) {
					arg0 += local104 * (this.anInt7894 - arg1);
					arg1 = this.anInt7894;
				}
				if (arg3 >= this.anInt7884) {
					arg3 = this.anInt7884 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt7898 && local150 < this.anInt7885) {
							this.anIntArray529[local150 + arg1 * this.anInt7902] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt7898 && local213 < this.anInt7885) {
							local228 = local213 + arg1 * this.anInt7902;
							local233 = this.anIntArray529[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray529[local213 + arg1 * this.anInt7902] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt7898 && local150 < this.anInt7885) {
							local213 = local150 + arg1 * this.anInt7902;
							local228 = this.anIntArray529[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray529[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class38 method6868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt7902 + arg0;
		@Pc(16) int local16 = this.anInt7902 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray529[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class38_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class38_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!st", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(II)I")
	@Override
	public int method6846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6816(@OriginalArg(0) Class25 arg0) {
		this.aClass25_Sub3_3 = (Class25_Sub3) arg0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!ak;IIII)Lclient!da;")
	@Override
	public Class33 method6839(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class33_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "()Z")
	@Override
	public boolean method6818() {
		return false;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class84 method6817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class84_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!st", name = "z", descriptor = "()Z")
	@Override
	public boolean method6872() {
		return false;
	}

	@OriginalMember(owner = "client!st", name = "l", descriptor = "()V")
	@Override
	public void method6843() {
		this.aClass21_78.method313();
		this.aClass21_77.method313();
	}

	@OriginalMember(owner = "client!st", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt7893;
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "()Z")
	@Override
	public boolean method6822() {
		return true;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
	@Override
	public void method6823(@OriginalArg(0) int arg0) {
		this.anInt7889 = arg0;
		this.aClass276Array1 = new Class276[this.anInt7889];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7889; local9++) {
			this.aClass276Array1[local9] = new Class276(this);
		}
	}

	@OriginalMember(owner = "client!st", name = "o", descriptor = "()Z")
	@Override
	public boolean method6848() {
		return false;
	}

	@OriginalMember(owner = "client!st", name = "i", descriptor = "(I)Z")
	public boolean method6427(@OriginalArg(0) int arg0) {
		return super.anInterface9_10.method1073(arg0);
	}

	@OriginalMember(owner = "client!st", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt7894 || arg1 >= this.anInt7884) {
			return;
		}
		if (arg0 < this.anInt7898) {
			arg2 -= this.anInt7898 - arg0;
			arg0 = this.anInt7898;
		}
		if (arg0 + arg2 > this.anInt7885) {
			arg2 = this.anInt7885 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt7902;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray529[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray529[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray529[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray529[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray529[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!st", name = "e", descriptor = "()V")
	@Override
	public void method6832() {
	}

	@OriginalMember(owner = "client!st", name = "j", descriptor = "(I)Z")
	public boolean method6428(@OriginalArg(0) int arg0) {
		return super.anInterface9_10.method1074(arg0).aBoolean601;
	}

	@OriginalMember(owner = "client!st", name = "g", descriptor = "()Z")
	@Override
	public boolean method6837() {
		return true;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class151 method6858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class151_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method6883(@OriginalArg(0) Class339 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class276 local3 = this.method6436(Thread.currentThread());
		@Pc(7) Class12_Sub1 local7 = arg0.aClass77_1.aClass12_Sub1_5;
		for (@Pc(10) Class12_Sub1 local10 = local7.aClass12_Sub1_9; local10 != local7; local10 = local10.aClass12_Sub1_9) {
			@Pc(14) Class12_Sub1_Sub1 local14 = (Class12_Sub1_Sub1) local10;
			@Pc(19) int local19 = local14.anInt4849 >> 12;
			@Pc(24) int local24 = local14.anInt4843 >> 12;
			@Pc(29) int local29 = local14.anInt4848 >> 12;
			@Pc(54) float local54 = this.aClass25_Sub3_3.aFloat169 + this.aClass25_Sub3_3.aFloat165 * (float) local19 + this.aClass25_Sub3_3.aFloat167 * (float) local24 + this.aClass25_Sub3_3.aFloat174 * (float) local29;
			if (!(local54 < (float) this.anInt7890) && !(local54 > (float) local3.anInt6936)) {
				@Pc(103) int local103 = this.anInt7881 + (int) ((float) this.anInt7900 * (this.aClass25_Sub3_3.aFloat172 + this.aClass25_Sub3_3.aFloat166 * (float) local19 + this.aClass25_Sub3_3.aFloat171 * (float) local24 + this.aClass25_Sub3_3.aFloat168 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt7904 + (int) ((float) this.anInt7901 * (this.aClass25_Sub3_3.aFloat163 + this.aClass25_Sub3_3.aFloat164 * (float) local19 + this.aClass25_Sub3_3.aFloat173 * (float) local24 + this.aClass25_Sub3_3.aFloat170 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt7898 && local103 <= this.anInt7885 && local139 >= this.anInt7894 && local139 <= this.anInt7884) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method6425(local14, local103, local139, (int) local54, (local14.anInt4846 * this.anInt7900 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([I)V")
	@Override
	public void method6811(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7902;
		arg0[1] = this.anInt7896;
	}

	@OriginalMember(owner = "client!st", name = "p", descriptor = "()I")
	@Override
	public int method6851() {
		return 0;
	}

	@OriginalMember(owner = "client!st", name = "C", descriptor = "()Lclient!q;")
	@Override
	public Class25 method6889() {
		return new Class25_Sub3();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6814(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub24 local8 = (Class2_Sub24) this.aClass90_35.method1685((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static339.method4920(arg0);
			this.aClass90_35.method1684(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!st", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass25_Sub3_3.aFloat165 * (float) arg0 + this.aClass25_Sub3_3.aFloat167 * (float) arg1 + this.aClass25_Sub3_3.aFloat174 * (float) arg2 + this.aClass25_Sub3_3.aFloat169;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass25_Sub3_3.aFloat165 * (float) arg3 + this.aClass25_Sub3_3.aFloat167 * (float) arg4 + this.aClass25_Sub3_3.aFloat174 * (float) arg5 + this.aClass25_Sub3_3.aFloat169;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt7890 && local55 < (float) this.anInt7890 || !(!(local24 > (float) this.anInt7893) || !(local55 > (float) this.anInt7893))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt7900 * (this.aClass25_Sub3_3.aFloat166 * (float) arg0 + this.aClass25_Sub3_3.aFloat171 * (float) arg1 + this.aClass25_Sub3_3.aFloat168 * (float) arg2 + this.aClass25_Sub3_3.aFloat172) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt7900 * (this.aClass25_Sub3_3.aFloat166 * (float) arg3 + this.aClass25_Sub3_3.aFloat171 * (float) arg4 + this.aClass25_Sub3_3.aFloat168 * (float) arg5 + this.aClass25_Sub3_3.aFloat172) / local55);
		if (local119 < this.anInt7891 && local151 < this.anInt7891 || local119 > this.anInt7886 && local151 > this.anInt7886) {
			return false;
		} else {
			@Pc(201) int local201 = (int) ((float) this.anInt7901 * (this.aClass25_Sub3_3.aFloat164 * (float) arg0 + this.aClass25_Sub3_3.aFloat173 * (float) arg1 + this.aClass25_Sub3_3.aFloat170 * (float) arg2 + this.aClass25_Sub3_3.aFloat163) / local24);
			@Pc(233) int local233 = (int) ((float) this.anInt7901 * (this.aClass25_Sub3_3.aFloat164 * (float) arg3 + this.aClass25_Sub3_3.aFloat173 * (float) arg4 + this.aClass25_Sub3_3.aFloat170 * (float) arg5 + this.aClass25_Sub3_3.aFloat163) / local55);
			return (local201 >= this.anInt7882 || local233 >= this.anInt7882) && (local201 <= this.anInt7888 || local233 <= this.anInt7888);
		}
	}

	@OriginalMember(owner = "client!st", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		this.anInt7887 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!st", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt7898 = 0;
		this.anInt7894 = 0;
		this.anInt7885 = this.anInt7902;
		this.anInt7884 = this.anInt7896;
		this.method6431();
	}

	@OriginalMember(owner = "client!st", name = "f", descriptor = "()Z")
	@Override
	public boolean method6835() {
		return false;
	}

	@OriginalMember(owner = "client!st", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class276 local3 = this.method6436(Thread.currentThread());
		local3.aBoolean565 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class84_Sub1 local2 = (Class84_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray167;
		@Pc(8) int[] local8 = local2.anIntArray166;
		@Pc(20) int local20;
		if (this.anInt7884 < arg3 + local5.length) {
			local20 = this.anInt7884 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt7894 > arg3) {
			local33 = this.anInt7894 - arg3;
			arg3 = this.anInt7894;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt7902;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt7898 > local58) {
				local62 -= this.anInt7898 - local58;
				local58 = this.anInt7898;
			}
			if (this.anInt7885 < local58 + local62) {
				local62 = this.anInt7885 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray529[local58++] = arg0;
			}
			local49 += this.anInt7902;
		}
	}

	@OriginalMember(owner = "client!st", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt7902;
		@Pc(35) int local35 = this.anInt7902 - arg2;
		if (arg1 + arg3 > this.anInt7884) {
			arg3 -= arg1 + arg3 - this.anInt7884;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt7894) {
			local59 = this.anInt7894 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt7902;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt7885) {
			local59 = arg0 + arg2 - this.anInt7885;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt7898) {
			local59 = this.anInt7898 - arg0;
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
						this.anIntArray529[local30++] = arg4;
					} else {
						this.anIntArray529[local30++] = arg5;
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
					local245 = this.anIntArray529[local30];
					this.anIntArray529[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray529[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray529[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!st", name = "q", descriptor = "()Z")
	@Override
	public boolean method6853() {
		return false;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!st", name = "k", descriptor = "(I)[I")
	private int[] method6429(@OriginalArg(0) int arg0) {
		@Pc(2) Class21 local2 = this.aClass21_78;
		@Pc(12) Class2_Sub25 local12;
		synchronized (this.aClass21_78) {
			local12 = (Class2_Sub25) this.aClass21_78.method324((long) arg0);
			if (local12 == null) {
				if (!super.anInterface9_10.method1073(arg0)) {
					return null;
				}
				@Pc(32) Class291 local32 = super.anInterface9_10.method1074(arg0);
				@Pc(42) int local42 = local32.aBoolean602 || this.aBoolean671 ? 64 : 128;
				local12 = new Class2_Sub25(arg0, local42, super.anInterface9_10.method1075(local42, local42, 0.7F, arg0), local32.aBoolean595);
				this.aClass21_78.method317(local12, (long) arg0);
			}
		}
		local12.aBoolean300 = true;
		return local12.method3434();
	}

	@OriginalMember(owner = "client!st", name = "f", descriptor = "(I)V")
	@Override
	public void method6870(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!st", name = "h", descriptor = "()Z")
	@Override
	public boolean method6838() {
		return false;
	}

	@OriginalMember(owner = "client!st", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt7890;
	}

	@OriginalMember(owner = "client!st", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7898;
		arg0[1] = this.anInt7894;
		arg0[2] = this.anInt7885;
		arg0[3] = this.anInt7884;
	}

	@OriginalMember(owner = "client!st", name = "d", descriptor = "(I)V")
	@Override
	public void method6830(@OriginalArg(0) int arg0) {
		this.aClass276Array1[arg0].method5679(null);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!ut;Z)Lclient!f;")
	@Override
	public Class38 method6845(@OriginalArg(0) Class344 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray585;
		@Pc(5) byte[] local5 = arg0.aByteArray94;
		@Pc(8) int local8 = arg0.anInt8947;
		@Pc(11) int local11 = arg0.anInt8946;
		@Pc(76) Class38_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray95 == null) {
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
			local76 = new Class38_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray95;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class38_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class38_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.Q(arg0.anInt8948, arg0.anInt8950, arg0.anInt8949, arg0.anInt8945);
		return local76;
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!st", name = "w", descriptor = "()Lclient!pg;")
	@Override
	public Class267 method6863() {
		return new Class267(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(II)I")
	@Override
	public int method6881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!st", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass276Array1.length; local1++) {
			@Pc(7) Class276 local7 = this.aClass276Array1[local1];
			local7.anInt6932 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt6932 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt6932 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt6932 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt6932 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean566 = false;
			} else {
				local7.aBoolean566 = true;
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "j", descriptor = "()Z")
	@Override
	public boolean method6841() {
		return true;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Lclient!e;")
	@Override
	public Class2_Sub12 method6820(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!st", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt7898 == 0 && this.anInt7885 == this.anInt7902 && this.anInt7894 == 0 && this.anInt7884 == this.anInt7896) {
			local19 = this.anIntArray528.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.anIntArray528[local27++] = Integer.MAX_VALUE;
				this.anIntArray528[local27++] = Integer.MAX_VALUE;
				this.anIntArray528[local27++] = Integer.MAX_VALUE;
				this.anIntArray528[local27++] = Integer.MAX_VALUE;
				this.anIntArray528[local27++] = Integer.MAX_VALUE;
				this.anIntArray528[local27++] = Integer.MAX_VALUE;
				this.anIntArray528[local27++] = Integer.MAX_VALUE;
				this.anIntArray528[local27++] = Integer.MAX_VALUE;
			}
			while (local27 < local19) {
				this.anIntArray528[local27++] = Integer.MAX_VALUE;
			}
			return;
		}
		local19 = this.anInt7885 - this.anInt7898;
		local25 = this.anInt7884 - this.anInt7894;
		local27 = this.anInt7902 - local19;
		@Pc(116) int local116 = this.anInt7898 + this.anInt7894 * this.anInt7902;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.anIntArray528[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray528[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray528[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray528[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray528[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray528[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray528[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray528[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.anIntArray528[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6836(@OriginalArg(0) Class2_Sub12 arg0) {
	}

	@OriginalMember(owner = "client!st", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt7881, this.anInt7904, this.anInt7900, this.anInt7901 };
	}

	@OriginalMember(owner = "client!st", name = "g", descriptor = "(IIIIII)V")
	private void method6430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg2 << 8;
		@Pc(12) int local12 = arg1 - arg3;
		if (local12 < this.anInt7894) {
			local12 = this.anInt7894;
		}
		@Pc(25) int local25 = arg1 + arg3 + 1;
		if (local25 > this.anInt7884) {
			local25 = this.anInt7884;
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
				if (local95 < this.anInt7898) {
					local95 = this.anInt7898;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt7885) {
					local106 = this.anInt7885;
				}
				local120 = local95 + local34 * this.anInt7902;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray528[local120]) {
						this.anIntArray529[local120] = arg4;
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
				if (local95 < this.anInt7898) {
					local95 = this.anInt7898;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt7885 - 1) {
					local106 = this.anInt7885 - 1;
				}
				local120 = local95 + local34 * this.anInt7902;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray528[local120]) {
						this.anIntArray529[local120] = arg4;
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
				if (local106 < this.anInt7898) {
					local106 = this.anInt7898;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt7885) {
					local120 = this.anInt7885;
				}
				local122 = local106 + local34 * this.anInt7902;
				for (local350 = local106; local350 < local120; local350++) {
					if (local8 < this.anIntArray528[local122]) {
						local362 = this.anIntArray529[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray529[local122] = local293 + local362;
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
				if (local106 < this.anInt7898) {
					local106 = this.anInt7898;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt7885 - 1) {
					local120 = this.anInt7885 - 1;
				}
				local122 = local106 + local34 * this.anInt7902;
				for (local350 = local106; local350 <= local120; local350++) {
					if (local8 < this.anIntArray528[local122]) {
						local362 = this.anIntArray529[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray529[local122] = local293 + local362;
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
				if (local95 < this.anInt7898) {
					local95 = this.anInt7898;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt7885) {
					local106 = this.anInt7885;
				}
				local120 = local95 + local34 * this.anInt7902;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray528[local120]) {
						local350 = this.anIntArray529[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(637) int local637 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray529[local120] = local362 - local637 | local637 - (local637 >>> 8);
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
				if (local95 < this.anInt7898) {
					local95 = this.anInt7898;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt7885 - 1) {
					local106 = this.anInt7885 - 1;
				}
				local120 = local95 + local34 * this.anInt7902;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray528[local120]) {
						local350 = this.anIntArray529[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray529[local120] = local362 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!rs;)V")
	@Override
	public void method6812(@OriginalArg(0) Class17 arg0) {
	}

	@OriginalMember(owner = "client!st", name = "m", descriptor = "()Lclient!q;")
	@Override
	public Class25 method6844() {
		return this.aClass25_Sub3_3;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6869(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas10 == null || this.aClass2_Sub24_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas10.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt7902 && local21.y <= this.anInt7896 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass2_Sub24_1.method5585(local21.x, local14, local21.height, local21.width, local21.y);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V")
	@Override
	public void method6887(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!st", name = "r", descriptor = "()Z")
	@Override
	public boolean method6856() {
		return false;
	}

	@OriginalMember(owner = "client!st", name = "D", descriptor = "()V")
	private void method6431() {
		this.anInt7891 = this.anInt7898 - this.anInt7881;
		this.anInt7886 = this.anInt7885 - this.anInt7881;
		this.anInt7882 = this.anInt7894 - this.anInt7904;
		this.anInt7888 = this.anInt7884 - this.anInt7904;
		for (@Pc(29) int local29 = 0; local29 < this.anInt7889; local29++) {
			@Pc(36) Class363 local36 = this.aClass276Array1[local29].aClass363_2;
			local36.anInt9522 = this.anInt7881 - this.anInt7898;
			local36.anInt9527 = this.anInt7904 - this.anInt7894;
			local36.anInt9523 = this.anInt7885 - this.anInt7898;
			local36.anInt9526 = this.anInt7884 - this.anInt7894;
		}
		@Pc(78) int local78 = this.anInt7894 * this.anInt7902 + this.anInt7898;
		for (@Pc(81) int local81 = this.anInt7894; local81 < this.anInt7884; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt7889; local84++) {
				this.aClass276Array1[local84].aClass363_2.anIntArray615[local81 - this.anInt7894] = local78;
			}
			local78 += this.anInt7902;
		}
	}

	@OriginalMember(owner = "client!st", name = "B", descriptor = "()Z")
	@Override
	public boolean method6880() {
		return false;
	}

	@OriginalMember(owner = "client!st", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6884(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas10 = null;
			this.aClass2_Sub24_1 = null;
			if (this.aClass38_38 == null) {
				this.anIntArray529 = null;
				this.anInt7902 = this.anInt7896 = 1;
				this.anInt7895 = this.anInt7892 = 1;
				this.method6434();
			}
			return;
		}
		@Pc(10) Class2_Sub24 local10 = (Class2_Sub24) this.aClass90_35.method1685((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas10 = arg0;
		this.aClass2_Sub24_1 = local10;
		if (this.aClass38_38 != null) {
			return;
		}
		this.anIntArray529 = local10.anIntArray433;
		this.anInt7902 = local10.anInt6743;
		this.anInt7896 = local10.anInt6744;
		if (this.anInt7902 != this.anInt7895 || this.anInt7896 != this.anInt7892) {
			this.anInt7895 = this.anInt7902;
			this.anInt7892 = this.anInt7896;
			this.anIntArray528 = new int[this.anInt7895 * this.anInt7892];
		}
		this.method6434();
		return;
	}

	@OriginalMember(owner = "client!st", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt7898) {
			arg2 -= this.anInt7898 - arg0;
			arg0 = this.anInt7898;
		}
		if (arg1 < this.anInt7894) {
			arg3 -= this.anInt7894 - arg1;
			arg1 = this.anInt7894;
		}
		if (arg0 + arg2 > this.anInt7885) {
			arg2 = this.anInt7885 - arg0;
		}
		if (arg1 + arg3 > this.anInt7884) {
			arg3 = this.anInt7884 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt7885 || arg1 > this.anInt7884) {
			return;
		}
		@Pc(67) int local67 = this.anInt7902 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt7902;
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
						local217 = this.anIntArray529[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray529[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray529[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray529[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray529[arg2] = arg4;
					arg2++;
					this.anIntArray529[arg2] = arg4;
					arg2++;
					this.anIntArray529[arg2] = arg4;
					arg2++;
					this.anIntArray529[arg2] = arg4;
					arg2++;
					this.anIntArray529[arg2] = arg4;
					arg2++;
					this.anIntArray529[arg2] = arg4;
					arg2++;
					this.anIntArray529[arg2] = arg4;
					arg2++;
					this.anIntArray529[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray529[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!st", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt7906 = (int) (arg1 * 65535.0F);
		this.anInt7883 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt7903 = (int) (arg3 * 65535.0F / local26);
		this.anInt7897 = (int) (arg4 * 65535.0F / local26);
		this.anInt7905 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6855(@OriginalArg(0) Class38 arg0) {
		if (arg0 instanceof Class38_Sub1_Sub1) {
			@Pc(5) Class38_Sub1_Sub1 local5 = (Class38_Sub1_Sub1) arg0;
			this.anInt7902 = local5.anInt7296;
			this.anInt7896 = local5.anInt7293;
			this.anIntArray529 = local5.anIntArray298;
			this.aClass38_38 = arg0;
		} else if (arg0 instanceof Class38_Sub1_Sub2) {
			@Pc(27) Class38_Sub1_Sub2 local27 = (Class38_Sub1_Sub2) arg0;
			this.anInt7902 = local27.anInt7296;
			this.anInt7896 = local27.anInt7293;
			this.anIntArray529 = local27.anIntArray397;
			this.aClass38_38 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method6434();
	}

	@OriginalMember(owner = "client!st", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt7902 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray529[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!st", name = "E", descriptor = "()Z")
	public boolean method6432() {
		return this.aBoolean669;
	}

	@OriginalMember(owner = "client!st", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7881 = arg0;
		this.anInt7904 = arg1;
		this.anInt7900 = arg2;
		this.anInt7901 = arg3;
		this.method6431();
	}

	@OriginalMember(owner = "client!st", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass276Array1.length; local1++) {
			this.aClass276Array1[local1].anInt6933 = this.aClass276Array1[local1].anInt6932;
			this.aClass276Array1[local1].anInt6938 = arg0;
			this.aClass276Array1[local1].anInt6932 = arg1;
			this.aClass276Array1[local1].anInt6926 = arg2;
			this.aClass276Array1[local1].aBoolean564 = true;
		}
	}

	@OriginalMember(owner = "client!st", name = "A", descriptor = "()V")
	@Override
	protected void method6875() {
		if (this.aBoolean670) {
			Static5.method82(true, false);
			this.aBoolean670 = false;
		}
		this.aClass2_Sub24_1 = null;
		this.aCanvas10 = null;
		this.aClass90_35 = null;
		this.aBoolean669 = true;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(IIIIIIIIII)V")
	public void method6433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface9_10.method1074(arg6).aBoolean603) {
			this.method6430(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt7908 != arg6) {
			@Pc(26) Class38 local26 = (Class38) this.aClass21_77.method324((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method6429(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method6435(arg6) ? 64 : 128;
				local26 = this.method6879(local32, local43, local43, local43);
				this.aClass21_77.method317(local26, (long) arg6);
			}
			this.anInt7908 = arg6;
			this.aClass38_39 = local26;
		}
		((Class38_Sub1) this.aClass38_39).method5929(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!st", name = "s", descriptor = "()V")
	@Override
	public void method6857() {
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!rs;Lclient!rs;FLclient!rs;)Lclient!rs;")
	@Override
	public Class17 method6882(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!st", name = "d", descriptor = "()Z")
	@Override
	public boolean method6824() {
		return false;
	}

	@OriginalMember(owner = "client!st", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(2) int local2 = this.anInt7907;
		this.anInt7907 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I[Lclient!tg;)V")
	@Override
	public void method6874(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11[] arg1) {
	}

	@OriginalMember(owner = "client!st", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class276 local3 = this.method6436(Thread.currentThread());
		this.anInt7890 = arg0;
		this.anInt7893 = arg1;
		local3.anInt6936 = this.anInt7893 - 255;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6831(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub24 local8 = (Class2_Sub24) this.aClass90_35.method1685((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method7657();
		local8 = Static339.method4920(arg0);
		this.aClass90_35.method1684(local8, (long) arg0.hashCode());
		if (this.aCanvas10 != arg0 || this.aClass38_38 != null) {
			return;
		}
		this.aClass2_Sub24_1 = local8;
		this.anIntArray529 = local8.anIntArray433;
		this.anInt7902 = local8.anInt6743;
		this.anInt7896 = local8.anInt6744;
		if (this.anInt7902 != this.anInt7895 || this.anInt7896 != this.anInt7892) {
			this.anInt7895 = this.anInt7902;
			this.anInt7892 = this.anInt7896;
			this.anIntArray528 = new int[this.anInt7895 * this.anInt7892];
		}
		this.method6434();
	}

	@OriginalMember(owner = "client!st", name = "u", descriptor = "()Lclient!q;")
	@Override
	public Class25 method6862() {
		@Pc(3) Class276 local3 = this.method6436(Thread.currentThread());
		return local3.aClass25_Sub3_2;
	}

	@OriginalMember(owner = "client!st", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass25_Sub3_3.aFloat169 + this.aClass25_Sub3_3.aFloat165 * (float) arg0 + this.aClass25_Sub3_3.aFloat167 * (float) arg1 + this.aClass25_Sub3_3.aFloat174 * (float) arg2;
		if (local24 < (float) this.anInt7890 || local24 > (float) this.anInt7893) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt7900 * (this.aClass25_Sub3_3.aFloat172 + this.aClass25_Sub3_3.aFloat166 * (float) arg0 + this.aClass25_Sub3_3.aFloat171 * (float) arg1 + this.aClass25_Sub3_3.aFloat168 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt7901 * (this.aClass25_Sub3_3.aFloat163 + this.aClass25_Sub3_3.aFloat164 * (float) arg0 + this.aClass25_Sub3_3.aFloat173 * (float) arg1 + this.aClass25_Sub3_3.aFloat170 * (float) arg2) / local24);
		arg3[0] = local81 - this.anInt7891;
		arg3[1] = local113 - this.anInt7882;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!st", name = "F", descriptor = "()V")
	private void method6434() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7889; local1++) {
			this.aClass276Array1[local1].method5680();
		}
		this.JA();
	}

	@OriginalMember(owner = "client!st", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class276 local3 = this.method6436(Thread.currentThread());
		local3.anInt6938 = arg0;
		local3.anInt6932 = arg1;
		local3.anInt6926 = arg2;
	}

	@OriginalMember(owner = "client!st", name = "n", descriptor = "()V")
	@Override
	public void method6847() {
		if (this.aCanvas10 == null) {
			this.anInt7902 = 1;
			this.anInt7896 = 1;
			this.anIntArray529 = null;
		} else {
			this.anIntArray529 = this.aClass2_Sub24_1.anIntArray433;
			this.anInt7902 = this.aClass2_Sub24_1.anInt6743;
			this.anInt7896 = this.aClass2_Sub24_1.anInt6744;
		}
		this.aClass38_38 = null;
		this.method6434();
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return 0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class38 method6879(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class38_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class38_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class38_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class38_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!st", name = "k", descriptor = "()V")
	@Override
	public void method6842() throws Exception_Sub1 {
		if (this.aCanvas10 == null || this.aClass2_Sub24_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas10.getGraphics();
			this.aClass2_Sub24_1.method5587(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!st", name = "t", descriptor = "()V")
	@Override
	public void method6861() {
	}

	@OriginalMember(owner = "client!st", name = "e", descriptor = "(I)V")
	@Override
	public void method6850(@OriginalArg(0) int arg0) {
		this.aClass276Array1[arg0].method5679(Thread.currentThread());
	}

	@OriginalMember(owner = "client!st", name = "l", descriptor = "(I)Z")
	public boolean method6435(@OriginalArg(0) int arg0) {
		return this.aBoolean671 || super.anInterface9_10.method1074(arg0).aBoolean602;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class38 method6825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class38_Sub1_Sub2(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!qb;")
	public Class276 method6436(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7889; local1++) {
			if (this.aClass276Array1[local1].aRunnable2 == arg0) {
				return this.aClass276Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class276 local3 = this.method6436(Thread.currentThread());
		@Pc(6) Class363 local6 = local3.aClass363_2;
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
		@Pc(105) int local105 = arg0 - local6.method7608();
		@Pc(110) int local110 = arg1 - local6.method7613();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt9524 = 0;
		this.ZA(false);
		local6.aBoolean792 = local114 < 0 || local114 > local6.anInt9523 || local118 < 0 || local118 > local6.anInt9523 || local124 < 0 || local124 > local6.anInt9523;
		local6.method7619(local134, local138, local144, local114, local118, local124, 100, 100, 100, arg4);
		local6.aBoolean792 = local114 < 0 || local114 > local6.anInt9523 || local124 < 0 || local124 > local6.anInt9523 || local130 < 0 || local130 > local6.anInt9523;
		local6.method7619(local134, local144, local150, local114, local124, local130, 100, 100, 100, arg4);
		this.ZA(true);
	}

	@OriginalMember(owner = "client!st", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass25_Sub3_3.aFloat169 + this.aClass25_Sub3_3.aFloat165 * (float) arg0 + this.aClass25_Sub3_3.aFloat167 * (float) arg1 + this.aClass25_Sub3_3.aFloat174 * (float) arg2;
		if (local24 < (float) this.anInt7890 || local24 > (float) this.anInt7893) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt7900 * (this.aClass25_Sub3_3.aFloat172 + this.aClass25_Sub3_3.aFloat166 * (float) arg0 + this.aClass25_Sub3_3.aFloat171 * (float) arg1 + this.aClass25_Sub3_3.aFloat168 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt7901 * (this.aClass25_Sub3_3.aFloat163 + this.aClass25_Sub3_3.aFloat164 * (float) arg0 + this.aClass25_Sub3_3.aFloat173 * (float) arg1 + this.aClass25_Sub3_3.aFloat170 * (float) arg2) / local24);
		if (local81 >= this.anInt7891 && local81 <= this.anInt7886 && local113 >= this.anInt7882 && local113 <= this.anInt7888) {
			arg3[0] = local81 - this.anInt7891;
			arg3[1] = local113 - this.anInt7882;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}
}
