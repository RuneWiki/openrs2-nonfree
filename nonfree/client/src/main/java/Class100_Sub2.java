import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class100_Sub2 extends Class100 {

	@OriginalMember(owner = "client!nga", name = "o", descriptor = "Z")
	private boolean aBoolean505;

	@OriginalMember(owner = "client!nga", name = "p", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!nga", name = "q", descriptor = "I")
	private int anInt6417;

	@OriginalMember(owner = "client!nga", name = "r", descriptor = "Z")
	private boolean aBoolean506;

	@OriginalMember(owner = "client!nga", name = "s", descriptor = "Lclient!nc;")
	private Class2_Sub17 aClass2_Sub17_1;

	@OriginalMember(owner = "client!nga", name = "t", descriptor = "Lclient!il;")
	private Class162 aClass162_26;

	@OriginalMember(owner = "client!nga", name = "u", descriptor = "I")
	public int anInt6418;

	@OriginalMember(owner = "client!nga", name = "v", descriptor = "I")
	public int anInt6419;

	@OriginalMember(owner = "client!nga", name = "w", descriptor = "I")
	public int anInt6420;

	@OriginalMember(owner = "client!nga", name = "x", descriptor = "I")
	public int anInt6421;

	@OriginalMember(owner = "client!nga", name = "y", descriptor = "I")
	public int anInt6422;

	@OriginalMember(owner = "client!nga", name = "z", descriptor = "I")
	private int anInt6423;

	@OriginalMember(owner = "client!nga", name = "A", descriptor = "I")
	public int anInt6424;

	@OriginalMember(owner = "client!nga", name = "B", descriptor = "I")
	public int anInt6425;

	@OriginalMember(owner = "client!nga", name = "C", descriptor = "I")
	public int anInt6426;

	@OriginalMember(owner = "client!nga", name = "D", descriptor = "Lclient!tb;")
	private final Class313 aClass313_38;

	@OriginalMember(owner = "client!nga", name = "E", descriptor = "I")
	public int anInt6427;

	@OriginalMember(owner = "client!nga", name = "F", descriptor = "[Lclient!lfa;")
	private Class208[] aClass208Array1;

	@OriginalMember(owner = "client!nga", name = "G", descriptor = "I")
	public int anInt6428;

	@OriginalMember(owner = "client!nga", name = "H", descriptor = "[I")
	public int[] anIntArray443;

	@OriginalMember(owner = "client!nga", name = "I", descriptor = "Z")
	private boolean aBoolean507;

	@OriginalMember(owner = "client!nga", name = "J", descriptor = "Lclient!tb;")
	private final Class313 aClass313_39;

	@OriginalMember(owner = "client!nga", name = "K", descriptor = "I")
	private int anInt6429;

	@OriginalMember(owner = "client!nga", name = "L", descriptor = "I")
	public int anInt6430;

	@OriginalMember(owner = "client!nga", name = "M", descriptor = "I")
	public int anInt6431;

	@OriginalMember(owner = "client!nga", name = "N", descriptor = "I")
	private int anInt6432;

	@OriginalMember(owner = "client!nga", name = "O", descriptor = "I")
	public int anInt6433;

	@OriginalMember(owner = "client!nga", name = "P", descriptor = "I")
	public int anInt6434;

	@OriginalMember(owner = "client!nga", name = "Q", descriptor = "I")
	public int anInt6435;

	@OriginalMember(owner = "client!nga", name = "R", descriptor = "I")
	public int anInt6436;

	@OriginalMember(owner = "client!nga", name = "S", descriptor = "I")
	private int anInt6437;

	@OriginalMember(owner = "client!nga", name = "T", descriptor = "I")
	private int anInt6438;

	@OriginalMember(owner = "client!nga", name = "U", descriptor = "[I")
	public int[] anIntArray444;

	@OriginalMember(owner = "client!nga", name = "V", descriptor = "I")
	public int anInt6439;

	@OriginalMember(owner = "client!nga", name = "W", descriptor = "I")
	public int anInt6440;

	@OriginalMember(owner = "client!nga", name = "X", descriptor = "I")
	public int anInt6441;

	@OriginalMember(owner = "client!nga", name = "Y", descriptor = "I")
	public int anInt6442;

	@OriginalMember(owner = "client!nga", name = "Z", descriptor = "Lclient!f;")
	private Class39 aClass39_25;

	@OriginalMember(owner = "client!nga", name = "ab", descriptor = "I")
	public int anInt6443;

	@OriginalMember(owner = "client!nga", name = "bb", descriptor = "Lclient!rd;")
	public Class68_Sub3 aClass68_Sub3_2;

	@OriginalMember(owner = "client!nga", name = "cb", descriptor = "I")
	public int anInt6444;

	@OriginalMember(owner = "client!nga", name = "db", descriptor = "Lclient!f;")
	private Class39 aClass39_26;

	@OriginalMember(owner = "client!nga", name = "eb", descriptor = "I")
	private int anInt6445;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public Class100_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1) {
		this(arg1);
		this.method6251(arg0);
		this.method6201(arg0);
	}

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lclient!fa;)V")
	private Class100_Sub2(@OriginalArg(0) Interface5 arg0) {
		super(arg0);
		this.aBoolean505 = false;
		this.aBoolean506 = false;
		this.aClass162_26 = new Class162(4);
		this.aBoolean507 = false;
		this.anInt6418 = 0;
		this.anInt6430 = 512;
		this.anInt6436 = 45823;
		this.anInt6424 = 75518;
		this.anInt6435 = 78642;
		this.anInt6433 = 512;
		this.anInt6442 = 0;
		this.anInt6431 = 50;
		this.anInt6425 = 0;
		this.anInt6437 = 0;
		this.anInt6440 = 3500;
		this.anInt6438 = 0;
		this.anInt6444 = 0;
		this.aClass313_39 = new Class313(16);
		this.anInt6445 = -1;
		this.aClass313_38 = new Class313(256);
		this.aClass68_Sub3_2 = new Class68_Sub3();
		this.method6249(1);
		this.method6244(0);
		Static165.method2887(true, false);
		this.aBoolean506 = true;
		this.anInt6417 = (int) Static548.method7437();
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!sa;[Lclient!aga;Z)Lclient!la;")
	@Override
	public Class29 method6225(@OriginalArg(0) Class294 arg0, @OriginalArg(1) Class13[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt427;
			local7[local11] = arg1[local11].anInt428;
			if (arg1[local11].aByteArray4 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class29_Sub5(this, arg0, arg1, local3, local7);
		} else {
			return new Class29_Sub2(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "()I")
	@Override
	public int method6185() {
		return 0;
	}

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "(IIIIII)Lclient!jt;")
	@Override
	public Class37 method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!nga", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass68_Sub3_2.aFloat240 * (float) arg0 + this.aClass68_Sub3_2.aFloat247 * (float) arg1 + this.aClass68_Sub3_2.aFloat246 * (float) arg2 + this.aClass68_Sub3_2.aFloat245;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass68_Sub3_2.aFloat240 * (float) arg3 + this.aClass68_Sub3_2.aFloat247 * (float) arg4 + this.aClass68_Sub3_2.aFloat246 * (float) arg5 + this.aClass68_Sub3_2.aFloat245;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt6431 && local55 < (float) this.anInt6431 || !(!(local24 > (float) this.anInt6440) || !(local55 > (float) this.anInt6440))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt6430 * (this.aClass68_Sub3_2.aFloat244 * (float) arg0 + this.aClass68_Sub3_2.aFloat237 * (float) arg1 + this.aClass68_Sub3_2.aFloat241 * (float) arg2 + this.aClass68_Sub3_2.aFloat242) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt6430 * (this.aClass68_Sub3_2.aFloat244 * (float) arg3 + this.aClass68_Sub3_2.aFloat237 * (float) arg4 + this.aClass68_Sub3_2.aFloat241 * (float) arg5 + this.aClass68_Sub3_2.aFloat242) / local55);
		if (local119 < this.anInt6419 && local151 < this.anInt6419 || local119 > this.anInt6427 && local151 > this.anInt6427) {
			return false;
		} else {
			@Pc(201) int local201 = (int) ((float) this.anInt6433 * (this.aClass68_Sub3_2.aFloat235 * (float) arg0 + this.aClass68_Sub3_2.aFloat236 * (float) arg1 + this.aClass68_Sub3_2.aFloat243 * (float) arg2 + this.aClass68_Sub3_2.aFloat239) / local24);
			@Pc(233) int local233 = (int) ((float) this.anInt6433 * (this.aClass68_Sub3_2.aFloat235 * (float) arg3 + this.aClass68_Sub3_2.aFloat236 * (float) arg4 + this.aClass68_Sub3_2.aFloat243 * (float) arg5 + this.aClass68_Sub3_2.aFloat239) / local55);
			return (local201 >= this.anInt6443 || local233 >= this.anInt6443) && (local201 <= this.anInt6434 || local233 <= this.anInt6434);
		}
	}

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt6418) {
			local8 = this.anInt6418;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt6444) {
			local21 = this.anInt6444;
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
				if (local91 < this.anInt6442) {
					local91 = this.anInt6442;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6425) {
					local102 = this.anInt6425;
				}
				local116 = local91 + local30 * this.anInt6426;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray443[local116++] = arg3;
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
				if (local91 < this.anInt6442) {
					local91 = this.anInt6442;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6425 - 1) {
					local102 = this.anInt6425 - 1;
				}
				local116 = local91 + local30 * this.anInt6426;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray443[local116++] = arg3;
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
			if (local102 < this.anInt6442) {
				local102 = this.anInt6442;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt6425) {
				local116 = this.anInt6425;
			}
			local118 = local102 + local30 * this.anInt6426;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray443[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray443[local118++] = local277 + local360;
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
			if (local102 < this.anInt6442) {
				local102 = this.anInt6442;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt6425 - 1) {
				local116 = this.anInt6425 - 1;
			}
			local118 = local102 + local30 * this.anInt6426;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray443[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray443[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!jt;Lclient!jt;FLclient!jt;)Lclient!jt;")
	@Override
	public Class37 method6210(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class37 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!nga", name = "D", descriptor = "()V")
	private void method5390() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6439; local1++) {
			this.aClass208Array1[local1].method4562();
		}
		this.JA();
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(II)I")
	@Override
	public int method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(Z)V")
	@Override
	public void method6242(@OriginalArg(0) boolean arg0) {
		this.aBoolean507 = arg0;
		this.aClass313_38.method6977();
	}

	@OriginalMember(owner = "client!nga", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt6426) {
			arg2 = this.anInt6426;
		}
		if (arg3 > this.anInt6423) {
			arg3 = this.anInt6423;
		}
		this.anInt6442 = arg0;
		this.anInt6425 = arg2;
		this.anInt6418 = arg1;
		this.anInt6444 = arg3;
		this.method5400();
	}

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "(I)V")
	@Override
	public void method6244(@OriginalArg(0) int arg0) {
		this.aClass208Array1[arg0].method4566(Thread.currentThread());
	}

	@OriginalMember(owner = "client!nga", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt6442 = 0;
		this.anInt6418 = 0;
		this.anInt6425 = this.anInt6426;
		this.anInt6444 = this.anInt6423;
		this.method5400();
	}

	@OriginalMember(owner = "client!nga", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass68_Sub3_2.aFloat245 + this.aClass68_Sub3_2.aFloat240 * (float) arg0 + this.aClass68_Sub3_2.aFloat247 * (float) arg1 + this.aClass68_Sub3_2.aFloat246 * (float) arg2;
		if (local24 < (float) this.anInt6431 || local24 > (float) this.anInt6440) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt6430 * (this.aClass68_Sub3_2.aFloat242 + this.aClass68_Sub3_2.aFloat244 * (float) arg0 + this.aClass68_Sub3_2.aFloat237 * (float) arg1 + this.aClass68_Sub3_2.aFloat241 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt6433 * (this.aClass68_Sub3_2.aFloat239 + this.aClass68_Sub3_2.aFloat235 * (float) arg0 + this.aClass68_Sub3_2.aFloat236 * (float) arg1 + this.aClass68_Sub3_2.aFloat243 * (float) arg2) / local24);
		if (local81 >= this.anInt6419 && local81 <= this.anInt6427 && local113 >= this.anInt6443 && local113 <= this.anInt6434) {
			arg3[0] = local81 - this.anInt6419;
			arg3[1] = local113 - this.anInt6443;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!aga;Z)Lclient!f;")
	@Override
	public Class39 method6256(@OriginalArg(0) Class13 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray32;
		@Pc(5) byte[] local5 = arg0.aByteArray3;
		@Pc(8) int local8 = arg0.anInt427;
		@Pc(11) int local11 = arg0.anInt428;
		@Pc(76) Class39_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray4 == null) {
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
			local76 = new Class39_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray4;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class39_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class39_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.Q(arg0.anInt429, arg0.anInt430, arg0.anInt426, arg0.anInt431);
		return local76;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!ir;)V")
	@Override
	public void method6193(@OriginalArg(0) Class164 arg0) {
		@Pc(3) Class208 local3 = this.method5395(Thread.currentThread());
		@Pc(7) Class6_Sub3 local7 = arg0.aClass234_1.aClass6_Sub3_7;
		for (@Pc(10) Class6_Sub3 local10 = local7.aClass6_Sub3_10; local10 != local7; local10 = local10.aClass6_Sub3_10) {
			@Pc(14) Class6_Sub3_Sub1 local14 = (Class6_Sub3_Sub1) local10;
			@Pc(19) int local19 = local14.anInt2921 >> 12;
			@Pc(24) int local24 = local14.anInt2919 >> 12;
			@Pc(29) int local29 = local14.anInt2917 >> 12;
			@Pc(54) float local54 = this.aClass68_Sub3_2.aFloat245 + this.aClass68_Sub3_2.aFloat240 * (float) local19 + this.aClass68_Sub3_2.aFloat247 * (float) local24 + this.aClass68_Sub3_2.aFloat246 * (float) local29;
			if (!(local54 < (float) this.anInt6431) && !(local54 > (float) local3.anInt5436)) {
				@Pc(102) int local102 = this.anInt6441 + (int) ((float) this.anInt6430 * (this.aClass68_Sub3_2.aFloat242 + this.aClass68_Sub3_2.aFloat244 * (float) local19 + this.aClass68_Sub3_2.aFloat237 * (float) local24 + this.aClass68_Sub3_2.aFloat241 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt6422 + (int) ((float) this.anInt6433 * (this.aClass68_Sub3_2.aFloat239 + this.aClass68_Sub3_2.aFloat235 * (float) local19 + this.aClass68_Sub3_2.aFloat236 * (float) local24 + this.aClass68_Sub3_2.aFloat243 * (float) local29) / local54);
				if (local102 >= this.anInt6442 && local102 <= this.anInt6425 && local137 >= this.anInt6418 && local137 <= this.anInt6444) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method5397(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt2914 * this.anInt6430 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "u", descriptor = "()V")
	@Override
	public void method6238() throws Exception_Sub1 {
		if (this.aCanvas9 == null || this.aClass2_Sub17_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas9.getGraphics();
			this.aClass2_Sub17_1.method3777(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas9.repaint();
		}
	}

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "()Z")
	@Override
	public boolean method6192() {
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "([I)V")
	@Override
	public void method6211(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6426;
		arg0[1] = this.anInt6423;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6207(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub17 local8 = (Class2_Sub17) this.aClass162_26.method3519((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method7966();
		local8 = Static389.method5721(arg0);
		this.aClass162_26.method3522(local8, (long) arg0.hashCode());
		if (this.aCanvas9 != arg0 || this.aClass39_25 != null) {
			return;
		}
		this.aClass2_Sub17_1 = local8;
		this.anIntArray443 = local8.anIntArray302;
		this.anInt6426 = local8.anInt4543;
		this.anInt6423 = local8.anInt4544;
		if (this.anInt6426 != this.anInt6432 || this.anInt6423 != this.anInt6429) {
			this.anInt6432 = this.anInt6426;
			this.anInt6429 = this.anInt6423;
			this.anIntArray444 = new int[this.anInt6432 * this.anInt6429];
		}
		this.method5390();
	}

	@OriginalMember(owner = "client!nga", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6442 < arg0) {
			this.anInt6442 = arg0;
		}
		if (this.anInt6418 < arg1) {
			this.anInt6418 = arg1;
		}
		if (this.anInt6425 > arg2) {
			this.anInt6425 = arg2;
		}
		if (this.anInt6444 > arg3) {
			this.anInt6444 = arg3;
		}
		this.method5400();
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6201(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas9 = null;
			this.aClass2_Sub17_1 = null;
			if (this.aClass39_25 == null) {
				this.anIntArray443 = null;
				this.anInt6426 = this.anInt6423 = 1;
				this.anInt6432 = this.anInt6429 = 1;
				this.method5390();
			}
			return;
		}
		@Pc(10) Class2_Sub17 local10 = (Class2_Sub17) this.aClass162_26.method3519((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas9 = arg0;
		this.aClass2_Sub17_1 = local10;
		if (this.aClass39_25 != null) {
			return;
		}
		this.anIntArray443 = local10.anIntArray302;
		this.anInt6426 = local10.anInt4543;
		this.anInt6423 = local10.anInt4544;
		if (this.anInt6426 != this.anInt6432 || this.anInt6423 != this.anInt6429) {
			this.anInt6432 = this.anInt6426;
			this.anInt6429 = this.anInt6423;
			this.anIntArray444 = new int[this.anInt6432 * this.anInt6429];
		}
		this.method5390();
		return;
	}

	@OriginalMember(owner = "client!nga", name = "E", descriptor = "()Z")
	public boolean method5391() {
		return this.aBoolean505;
	}

	@OriginalMember(owner = "client!nga", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		this.anInt6424 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class20 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class20_Sub3 local2 = (Class20_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray452;
		@Pc(8) int[] local8 = local2.anIntArray453;
		@Pc(17) int local17 = this.anInt6418 > arg7 ? this.anInt6418 : arg7;
		@Pc(32) int local32 = this.anInt6444 < arg7 + local5.length ? this.anInt6444 : arg7 + local5.length;
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
					if (local129 >= this.anInt6442 && local129 < this.anInt6425 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray443[local129 + arg1 * this.anInt6426] = arg4;
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
					if (local133 >= this.anInt6442 && local133 < this.anInt6425 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt6426;
						local248 = this.anIntArray443[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray443[local133 + arg1 * this.anInt6426] = local201 + local584;
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
		if (arg0 < this.anInt6442) {
			arg1 += local83 * (this.anInt6442 - arg0);
			arg0 = this.anInt6442;
		}
		if (arg2 >= this.anInt6425) {
			arg2 = this.anInt6425 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray443[arg0 + local129 * this.anInt6426] = arg4;
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
					local243 = arg0 + local133 * this.anInt6426;
					local248 = this.anIntArray443[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray443[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!ir;I)V")
	@Override
	public void method6257(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class208 local3 = this.method5395(Thread.currentThread());
		@Pc(7) Class6_Sub3 local7 = arg0.aClass234_1.aClass6_Sub3_7;
		for (@Pc(10) Class6_Sub3 local10 = local7.aClass6_Sub3_10; local10 != local7; local10 = local10.aClass6_Sub3_10) {
			@Pc(14) Class6_Sub3_Sub1 local14 = (Class6_Sub3_Sub1) local10;
			@Pc(19) int local19 = local14.anInt2921 >> 12;
			@Pc(24) int local24 = local14.anInt2919 >> 12;
			@Pc(29) int local29 = local14.anInt2917 >> 12;
			@Pc(54) float local54 = this.aClass68_Sub3_2.aFloat245 + this.aClass68_Sub3_2.aFloat240 * (float) local19 + this.aClass68_Sub3_2.aFloat247 * (float) local24 + this.aClass68_Sub3_2.aFloat246 * (float) local29;
			if (!(local54 < (float) this.anInt6431) && !(local54 > (float) local3.anInt5436)) {
				@Pc(103) int local103 = this.anInt6441 + (int) ((float) this.anInt6430 * (this.aClass68_Sub3_2.aFloat242 + this.aClass68_Sub3_2.aFloat244 * (float) local19 + this.aClass68_Sub3_2.aFloat237 * (float) local24 + this.aClass68_Sub3_2.aFloat241 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt6422 + (int) ((float) this.anInt6433 * (this.aClass68_Sub3_2.aFloat239 + this.aClass68_Sub3_2.aFloat235 * (float) local19 + this.aClass68_Sub3_2.aFloat236 * (float) local24 + this.aClass68_Sub3_2.aFloat243 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt6442 && local103 <= this.anInt6425 && local139 >= this.anInt6418 && local139 <= this.anInt6444) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method5397(local14, local103, local139, (int) local54, (local14.anInt2914 * this.anInt6430 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class208 local3 = this.method5395(Thread.currentThread());
		this.anInt6431 = arg0;
		this.anInt6440 = arg1;
		local3.anInt5436 = this.anInt6440 - 255;
	}

	@OriginalMember(owner = "client!nga", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6442;
		arg0[1] = this.anInt6418;
		arg0[2] = this.anInt6425;
		arg0[3] = this.anInt6444;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class39 method6236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt6426 + arg0;
		@Pc(16) int local16 = this.anInt6426 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray443[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class39_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class39_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6220() {
		@Pc(3) Class208 local3 = this.method5395(Thread.currentThread());
		@Pc(6) Class172 local6 = local3.aClass172_1;
		local6.aBoolean369 = false;
		@Pc(14) int local14 = 5 - this.anInt6419;
		@Pc(19) int local19 = 75 - this.anInt6419;
		@Pc(24) int local24 = 15 - this.anInt6419;
		@Pc(29) int local29 = 10 - this.anInt6443;
		@Pc(34) int local34 = 50 - this.anInt6443;
		@Pc(39) int local39 = 90 - this.anInt6443;
		local6.aBoolean373 = local14 < 0 || local14 > local6.anInt4566 || local19 < 0 || local19 > local6.anInt4566 || local24 < 0 || local24 > local6.anInt4566;
		local6.aBoolean370 = true;
		local6.anInt4570 = 0;
		local6.aBoolean371 = false;
		local6.method3810(local29, local34, local39, local14, local19, local24, 0, 0, 0, -65536, -65536, -65536);
		local6.aBoolean369 = true;
		local6.aBoolean370 = false;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)V")
	@Override
	public void method6229(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nga", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class20_Sub3 local2 = (Class20_Sub3) arg1;
		@Pc(5) int[] local5 = local2.anIntArray452;
		@Pc(8) int[] local8 = local2.anIntArray453;
		@Pc(20) int local20;
		if (this.anInt6444 < arg3 + local5.length) {
			local20 = this.anInt6444 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt6418 > arg3) {
			local33 = this.anInt6418 - arg3;
			arg3 = this.anInt6418;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt6426;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt6442 > local58) {
				local62 -= this.anInt6442 - local58;
				local58 = this.anInt6442;
			}
			if (this.anInt6425 < local58 + local62) {
				local62 = this.anInt6425 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray443[local58++] = arg0;
			}
			local49 += this.anInt6426;
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "()V")
	@Override
	public void method6184() {
	}

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "(I)Z")
	public boolean method5392(@OriginalArg(0) int arg0) {
		return super.anInterface5_10.method917(arg0).aBoolean696;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I[Lclient!gga;)V")
	@Override
	public void method6188(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub14[] arg1) {
	}

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "()Z")
	@Override
	public boolean method6208() {
		return true;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!eg;IIII)Lclient!da;")
	@Override
	public Class66 method6191(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class66_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "()Z")
	@Override
	public boolean method6194() {
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "s", descriptor = "()V")
	@Override
	public void method6231() {
	}

	@OriginalMember(owner = "client!nga", name = "y", descriptor = "()Lclient!oa;")
	@Override
	public Class237 method6247() {
		return new Class237(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "(I)V")
	@Override
	public void method6249(@OriginalArg(0) int arg0) {
		this.anInt6439 = arg0;
		this.aClass208Array1 = new Class208[this.anInt6439];
		for (@Pc(9) int local9 = 0; local9 < this.anInt6439; local9++) {
			this.aClass208Array1[local9] = new Class208(this);
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!nga", name = "z", descriptor = "()Z")
	@Override
	public boolean method6248() {
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "x", descriptor = "()Z")
	@Override
	public boolean method6246() {
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "j", descriptor = "(I)I")
	public int method5393(@OriginalArg(0) int arg0) {
		return super.anInterface5_10.method917(arg0).aShort109 & 0xFFFF;
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "(IIIIIIIIII)V")
	public void method5394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface5_10.method917(arg6).aBoolean704) {
			this.method5401(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt6445 != arg6) {
			@Pc(26) Class39 local26 = (Class39) this.aClass313_39.method6989((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method5396(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method5399(arg6) ? 64 : 128;
				local26 = this.method6226(local32, local43, local43, local43);
				this.aClass313_39.method6980((long) arg6, local26);
			}
			this.anInt6445 = arg6;
			this.aClass39_26 = local26;
		}
		((Class39_Sub1) this.aClass39_26).method7861(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!nga", name = "w", descriptor = "()V")
	@Override
	public void method6245() {
		this.aClass313_38.method6977();
		this.aClass313_39.method6977();
	}

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "()Z")
	@Override
	public boolean method6196() {
		return true;
	}

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt6426 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray443[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!lfa;")
	public Class208 method5395(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6439; local1++) {
			if (this.aClass208Array1[local1].aRunnable1 == arg0) {
				return this.aClass208Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nga", name = "k", descriptor = "(I)[I")
	private int[] method5396(@OriginalArg(0) int arg0) {
		@Pc(2) Class313 local2 = this.aClass313_38;
		@Pc(12) Class2_Sub24 local12;
		synchronized (this.aClass313_38) {
			local12 = (Class2_Sub24) this.aClass313_38.method6989((long) arg0);
			if (local12 == null) {
				if (!super.anInterface5_10.method914(arg0)) {
					return null;
				}
				@Pc(32) Class343 local32 = super.anInterface5_10.method917(arg0);
				@Pc(42) int local42 = local32.aBoolean700 || this.aBoolean507 ? 64 : 128;
				local12 = new Class2_Sub24(arg0, local42, super.anInterface5_10.method915(0.7F, local42, local42, arg0), local32.aBoolean697);
				this.aClass313_38.method6980((long) arg0, local12);
			}
		}
		local12.aBoolean365 = true;
		return local12.method3767();
	}

	@OriginalMember(owner = "client!nga", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nga", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt6426;
		@Pc(35) int local35 = this.anInt6426 - arg2;
		if (arg1 + arg3 > this.anInt6444) {
			arg3 -= arg1 + arg3 - this.anInt6444;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt6418) {
			local59 = this.anInt6418 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt6426;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt6425) {
			local59 = arg0 + arg2 - this.anInt6425;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt6442) {
			local59 = this.anInt6442 - arg0;
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
						this.anIntArray443[local30++] = arg4;
					} else {
						this.anIntArray443[local30++] = arg5;
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
					local245 = this.anIntArray443[local30];
					this.anIntArray443[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray443[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray443[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6223(@OriginalArg(0) Class2_Sub13 arg0) {
	}

	@OriginalMember(owner = "client!nga", name = "B", descriptor = "()Z")
	@Override
	public boolean method6254() {
		return true;
	}

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6251(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub17 local8 = (Class2_Sub17) this.aClass162_26.method3519((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static389.method5721(arg0);
			this.aClass162_26.method3522(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!nga", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass68_Sub3_2.aFloat245 + this.aClass68_Sub3_2.aFloat240 * (float) arg0 + this.aClass68_Sub3_2.aFloat247 * (float) arg1 + this.aClass68_Sub3_2.aFloat246 * (float) arg2;
		if (local24 < (float) this.anInt6431 || local24 > (float) this.anInt6440) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt6430 * (this.aClass68_Sub3_2.aFloat242 + this.aClass68_Sub3_2.aFloat244 * (float) arg0 + this.aClass68_Sub3_2.aFloat237 * (float) arg1 + this.aClass68_Sub3_2.aFloat241 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt6433 * (this.aClass68_Sub3_2.aFloat239 + this.aClass68_Sub3_2.aFloat235 * (float) arg0 + this.aClass68_Sub3_2.aFloat236 * (float) arg1 + this.aClass68_Sub3_2.aFloat243 * (float) arg2) / local24);
		arg3[0] = local81 - this.anInt6419;
		arg3[1] = local113 - this.anInt6443;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!mm;IIII)V")
	private void method5397(@OriginalArg(0) Class6_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt2924;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method5401(arg1, arg2, arg3, arg4, arg0.anInt2915, 1);
			return;
		}
		if (this.anInt6445 != local2) {
			@Pc(33) Class39 local33 = (Class39) this.aClass313_39.method6989((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method5396(local2);
				if (local39 == null) {
					return;
				}
				@Pc(49) int local49 = this.method5399(local2) ? 64 : 128;
				local33 = this.method6226(local39, local49, local49, local49);
				this.aClass313_39.method6980((long) local2, local33);
			}
			this.anInt6445 = local2;
			this.aClass39_26 = local33;
		}
		local8++;
		((Class39_Sub1) this.aClass39_26).method7861(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt2915, 1);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6217(@OriginalArg(0) Class68 arg0) {
		this.aClass68_Sub3_2 = (Class68_Sub3) arg0;
	}

	@OriginalMember(owner = "client!nga", name = "p", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6222() {
		@Pc(3) Class208 local3 = this.method5395(Thread.currentThread());
		return local3.aClass68_Sub3_1;
	}

	@OriginalMember(owner = "client!nga", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class208 local3 = this.method5395(Thread.currentThread());
		local3.aBoolean430 = arg0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class39 method6226(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class39_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class39_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class39_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class39_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "(I)V")
	@Override
	public void method6239(@OriginalArg(0) int arg0) {
		this.aClass208Array1[arg0].method4566(null);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6237(@OriginalArg(0) Class39 arg0) {
		if (arg0 instanceof Class39_Sub1_Sub3) {
			@Pc(5) Class39_Sub1_Sub3 local5 = (Class39_Sub1_Sub3) arg0;
			this.anInt6426 = local5.anInt9436;
			this.anInt6423 = local5.anInt9440;
			this.anIntArray443 = local5.anIntArray680;
			this.aClass39_25 = arg0;
		} else if (arg0 instanceof Class39_Sub1_Sub1) {
			@Pc(27) Class39_Sub1_Sub1 local27 = (Class39_Sub1_Sub1) arg0;
			this.anInt6426 = local27.anInt9436;
			this.anInt6423 = local27.anInt9440;
			this.anIntArray443 = local27.anIntArray63;
			this.aClass39_25 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method5390();
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)I")
	@Override
	public int method6215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!nga", name = "k", descriptor = "()V")
	@Override
	public void method6203() {
	}

	@OriginalMember(owner = "client!nga", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class208 local3 = this.method5395(Thread.currentThread());
		local3.anInt5440 = arg0;
		local3.anInt5447 = arg1;
		local3.anInt5444 = arg2;
	}

	@OriginalMember(owner = "client!nga", name = "l", descriptor = "(I)[I")
	public int[] method5398(@OriginalArg(0) int arg0) {
		@Pc(2) Class313 local2 = this.aClass313_38;
		@Pc(12) Class2_Sub24 local12;
		synchronized (this.aClass313_38) {
			local12 = (Class2_Sub24) this.aClass313_38.method6989((long) arg0);
			if (local12 == null) {
				if (!super.anInterface5_10.method914(arg0)) {
					return null;
				}
				@Pc(32) Class343 local32 = super.anInterface5_10.method917(arg0);
				@Pc(42) int local42 = local32.aBoolean700 || this.aBoolean507 ? 64 : 128;
				local12 = new Class2_Sub24(arg0, local42, super.anInterface5_10.method916(arg0, 0.7F, true, local42, local42), local32.aBoolean697);
				this.aClass313_38.method6980((long) arg0, local12);
			}
		}
		local12.aBoolean365 = true;
		return local12.method3767();
	}

	@OriginalMember(owner = "client!nga", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt6442) {
			arg2 -= this.anInt6442 - arg0;
			arg0 = this.anInt6442;
		}
		if (arg1 < this.anInt6418) {
			arg3 -= this.anInt6418 - arg1;
			arg1 = this.anInt6418;
		}
		if (arg0 + arg2 > this.anInt6425) {
			arg2 = this.anInt6425 - arg0;
		}
		if (arg1 + arg3 > this.anInt6444) {
			arg3 = this.anInt6444 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt6425 || arg1 > this.anInt6444) {
			return;
		}
		@Pc(67) int local67 = this.anInt6426 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt6426;
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
						local217 = this.anIntArray443[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray443[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray443[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray443[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray443[arg2] = arg4;
					arg2++;
					this.anIntArray443[arg2] = arg4;
					arg2++;
					this.anIntArray443[arg2] = arg4;
					arg2++;
					this.anIntArray443[arg2] = arg4;
					arg2++;
					this.anIntArray443[arg2] = arg4;
					arg2++;
					this.anIntArray443[arg2] = arg4;
					arg2++;
					this.anIntArray443[arg2] = arg4;
					arg2++;
					this.anIntArray443[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray443[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!nga", name = "j", descriptor = "()V")
	@Override
	public void method6198() {
	}

	@OriginalMember(owner = "client!nga", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt6431;
	}

	@OriginalMember(owner = "client!nga", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(2) int local2 = this.anInt6437;
		this.anInt6437 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!nga", name = "t", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6235() {
		return this.aClass68_Sub3_2;
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "(I)Z")
	public boolean method5399(@OriginalArg(0) int arg0) {
		return this.aBoolean507 || super.anInterface5_10.method917(arg0).aBoolean700;
	}

	@OriginalMember(owner = "client!nga", name = "o", descriptor = "()Z")
	@Override
	public boolean method6219() {
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "F", descriptor = "()V")
	private void method5400() {
		this.anInt6419 = this.anInt6442 - this.anInt6441;
		this.anInt6427 = this.anInt6425 - this.anInt6441;
		this.anInt6443 = this.anInt6418 - this.anInt6422;
		this.anInt6434 = this.anInt6444 - this.anInt6422;
		for (@Pc(29) int local29 = 0; local29 < this.anInt6439; local29++) {
			@Pc(36) Class172 local36 = this.aClass208Array1[local29].aClass172_1;
			local36.anInt4568 = this.anInt6441 - this.anInt6442;
			local36.anInt4569 = this.anInt6422 - this.anInt6418;
			local36.anInt4566 = this.anInt6425 - this.anInt6442;
			local36.anInt4571 = this.anInt6444 - this.anInt6418;
		}
		@Pc(78) int local78 = this.anInt6418 * this.anInt6426 + this.anInt6442;
		for (@Pc(81) int local81 = this.anInt6418; local81 < this.anInt6444; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt6439; local84++) {
				this.aClass208Array1[local84].aClass172_1.anIntArray305[local81 - this.anInt6418] = local78;
			}
			local78 += this.anInt6426;
		}
	}

	@OriginalMember(owner = "client!nga", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.J(0, 0, this.anInt6426, this.anInt6423, arg0, 0);
	}

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return 0;
	}

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt6442 || arg0 >= this.anInt6425) {
			return;
		}
		if (arg1 < this.anInt6418) {
			arg2 -= this.anInt6418 - arg1;
			arg1 = this.anInt6418;
		}
		if (arg1 + arg2 > this.anInt6444) {
			arg2 = this.anInt6444 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt6426;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray443[local40 + local54 * this.anInt6426] = arg3;
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
				local111 = local40 + local103 * this.anInt6426;
				local116 = this.anIntArray443[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray443[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt6426;
				local111 = this.anIntArray443[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray443[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "(IIIIII)V")
	private void method5401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg2 << 8;
		@Pc(12) int local12 = arg1 - arg3;
		if (local12 < this.anInt6418) {
			local12 = this.anInt6418;
		}
		@Pc(25) int local25 = arg1 + arg3 + 1;
		if (local25 > this.anInt6444) {
			local25 = this.anInt6444;
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
				if (local95 < this.anInt6442) {
					local95 = this.anInt6442;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt6425) {
					local106 = this.anInt6425;
				}
				local120 = local95 + local34 * this.anInt6426;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray444[local120]) {
						this.anIntArray443[local120] = arg4;
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
				if (local95 < this.anInt6442) {
					local95 = this.anInt6442;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt6425 - 1) {
					local106 = this.anInt6425 - 1;
				}
				local120 = local95 + local34 * this.anInt6426;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray444[local120]) {
						this.anIntArray443[local120] = arg4;
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
				if (local106 < this.anInt6442) {
					local106 = this.anInt6442;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt6425) {
					local120 = this.anInt6425;
				}
				local122 = local106 + local34 * this.anInt6426;
				for (local350 = local106; local350 < local120; local350++) {
					if (local8 < this.anIntArray444[local122]) {
						local362 = this.anIntArray443[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray443[local122] = local293 + local362;
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
				if (local106 < this.anInt6442) {
					local106 = this.anInt6442;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt6425 - 1) {
					local120 = this.anInt6425 - 1;
				}
				local122 = local106 + local34 * this.anInt6426;
				for (local350 = local106; local350 <= local120; local350++) {
					if (local8 < this.anIntArray444[local122]) {
						local362 = this.anIntArray443[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray443[local122] = local293 + local362;
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
				if (local95 < this.anInt6442) {
					local95 = this.anInt6442;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt6425) {
					local106 = this.anInt6425;
				}
				local120 = local95 + local34 * this.anInt6426;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray444[local120]) {
						local350 = this.anIntArray443[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(637) int local637 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray443[local120] = local362 - local637 | local637 - (local637 >>> 8);
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
				if (local95 < this.anInt6442) {
					local95 = this.anInt6442;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt6425 - 1) {
					local106 = this.anInt6425 - 1;
				}
				local120 = local95 + local34 * this.anInt6426;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray444[local120]) {
						local350 = this.anIntArray443[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray443[local120] = local362 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class39 method6204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class39_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!nga", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt6440;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class67 method6195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class67_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!nga", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass208Array1.length; local1++) {
			@Pc(7) Class208 local7 = this.aClass208Array1[local1];
			local7.anInt5447 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt5447 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt5447 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt5447 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt5447 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean431 = false;
			} else {
				local7.aBoolean431 = true;
			}
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)V")
	@Override
	public void method6199(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "(I)Z")
	public boolean method5402(@OriginalArg(0) int arg0) {
		return super.anInterface5_10.method914(arg0);
	}

	@OriginalMember(owner = "client!nga", name = "A", descriptor = "()V")
	@Override
	protected void method6250() {
		if (this.aBoolean506) {
			Static304.method4555(true, false);
			this.aBoolean506 = false;
		}
		this.aClass2_Sub17_1 = null;
		this.aCanvas9 = null;
		this.aClass162_26 = null;
		this.aBoolean505 = true;
	}

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "()Z")
	@Override
	public boolean method6186() {
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "()Z")
	@Override
	public boolean method6197() {
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass208Array1.length; local1++) {
			this.aClass208Array1[local1].anInt5447 = this.aClass208Array1[local1].anInt5437;
			this.aClass208Array1[local1].aBoolean432 = false;
		}
	}

	@OriginalMember(owner = "client!nga", name = "l", descriptor = "()Z")
	@Override
	public boolean method6206() {
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt6436 = (int) (arg1 * 65535.0F);
		this.anInt6435 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt6421 = (int) (arg3 * 65535.0F / local26);
		this.anInt6420 = (int) (arg4 * 65535.0F / local26);
		this.anInt6428 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6202(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas9 == null || this.aClass2_Sub17_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas9.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt6426 && local21.y <= this.anInt6423 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass2_Sub17_1.method3778(local21.y, local21.x, local21.width, local14, local21.height);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas9.repaint();
		}
	}

	@OriginalMember(owner = "client!nga", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(2) int local2 = this.anInt6438;
		this.anInt6438 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!nga", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt6442 == 0 && this.anInt6425 == this.anInt6426 && this.anInt6418 == 0 && this.anInt6444 == this.anInt6423) {
			local19 = this.anIntArray444.length;
			local25 = local19 - local19 & 0x7;
			local27 = 0;
			while (local27 < local25) {
				this.anIntArray444[local27++] = Integer.MAX_VALUE;
				this.anIntArray444[local27++] = Integer.MAX_VALUE;
				this.anIntArray444[local27++] = Integer.MAX_VALUE;
				this.anIntArray444[local27++] = Integer.MAX_VALUE;
				this.anIntArray444[local27++] = Integer.MAX_VALUE;
				this.anIntArray444[local27++] = Integer.MAX_VALUE;
				this.anIntArray444[local27++] = Integer.MAX_VALUE;
				this.anIntArray444[local27++] = Integer.MAX_VALUE;
			}
			while (local27 < local19) {
				this.anIntArray444[local27++] = Integer.MAX_VALUE;
			}
			return;
		}
		local19 = this.anInt6425 - this.anInt6442;
		local25 = this.anInt6444 - this.anInt6418;
		local27 = this.anInt6426 - local19;
		@Pc(116) int local116 = this.anInt6442 + this.anInt6418 * this.anInt6426;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.anIntArray444[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray444[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray444[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray444[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray444[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray444[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray444[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray444[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.anIntArray444[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class208 local3 = this.method5395(Thread.currentThread());
		@Pc(6) Class172 local6 = local3.aClass172_1;
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
		@Pc(105) int local105 = arg0 - local6.method3805();
		@Pc(110) int local110 = arg1 - local6.method3816();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt4570 = 0;
		this.ZA(false);
		local6.aBoolean373 = local114 < 0 || local114 > local6.anInt4566 || local118 < 0 || local118 > local6.anInt4566 || local124 < 0 || local124 > local6.anInt4566;
		local6.method3814(local134, local138, local144, local114, local118, local124, 100, 100, 100, arg4);
		local6.aBoolean373 = local114 < 0 || local114 > local6.anInt4566 || local124 < 0 || local124 > local6.anInt4566 || local130 < 0 || local130 > local6.anInt4566;
		local6.method3814(local134, local144, local150, local114, local124, local130, 100, 100, 100, arg4);
		this.ZA(true);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!jt;)V")
	@Override
	public void method6252(@OriginalArg(0) Class37 arg0) {
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt6442) {
					arg1 += local104 * (this.anInt6442 - arg0);
					arg0 = this.anInt6442;
				}
				if (arg2 >= this.anInt6425) {
					arg2 = this.anInt6425 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt6418 && local150 < this.anInt6444) {
							this.anIntArray443[arg0 + local150 * this.anInt6426] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt6418 && local213 < this.anInt6444) {
							local228 = arg0 + local213 * this.anInt6426;
							local233 = this.anIntArray443[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray443[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt6418 && local150 < this.anInt6444) {
							local213 = arg0 + local150 * this.anInt6426;
							local228 = this.anIntArray443[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray443[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt6418) {
					arg0 += local104 * (this.anInt6418 - arg1);
					arg1 = this.anInt6418;
				}
				if (arg3 >= this.anInt6444) {
					arg3 = this.anInt6444 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt6442 && local150 < this.anInt6425) {
							this.anIntArray443[local150 + arg1 * this.anInt6426] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt6442 && local213 < this.anInt6425) {
							local228 = local213 + arg1 * this.anInt6426;
							local233 = this.anIntArray443[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray443[local213 + arg1 * this.anInt6426] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt6442 && local150 < this.anInt6425) {
							local213 = local150 + arg1 * this.anInt6426;
							local228 = this.anIntArray443[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray443[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!nga", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass208Array1.length; local1++) {
			this.aClass208Array1[local1].anInt5437 = this.aClass208Array1[local1].anInt5447;
			this.aClass208Array1[local1].anInt5440 = arg0;
			this.aClass208Array1[local1].anInt5447 = arg1;
			this.aClass208Array1[local1].anInt5444 = arg2;
			this.aClass208Array1[local1].aBoolean432 = true;
		}
	}

	@OriginalMember(owner = "client!nga", name = "q", descriptor = "()V")
	@Override
	public void method6228() {
		if (this.aCanvas9 == null) {
			this.anInt6426 = 1;
			this.anInt6423 = 1;
			this.anIntArray443 = null;
		} else {
			this.anIntArray443 = this.aClass2_Sub17_1.anIntArray302;
			this.anInt6426 = this.aClass2_Sub17_1.anInt4543;
			this.anInt6423 = this.aClass2_Sub17_1.anInt4544;
		}
		this.aClass39_25 = null;
		this.method5390();
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
	@Override
	public void method6205(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt6417;
		for (@Pc(9) Object local9 = this.aClass313_38.method6981(); local9 != null; local9 = this.aClass313_38.method6988()) {
			@Pc(13) Class2_Sub24 local13 = (Class2_Sub24) local9;
			if (local13.aBoolean365) {
				local13.anInt4533 += local4;
				@Pc(27) int local27 = local13.anInt4533 / 20;
				if (local27 > 0) {
					@Pc(36) Class343 local36 = super.anInterface5_10.method917(local13.anInt4534);
					local13.method3768(local36.aByte118 * local4 * 50 / 1000, local36.aByte114 * local4 * 50 / 1000);
					local13.anInt4533 -= local27 * 20;
				}
				local13.aBoolean365 = false;
			}
		}
		this.anInt6417 = arg0;
		this.aClass313_39.method6982(5);
		this.aClass313_38.method6982(5);
	}

	@OriginalMember(owner = "client!nga", name = "r", descriptor = "()Z")
	@Override
	public boolean method6230() {
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "C", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6258() {
		return new Class68_Sub3();
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6227(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas9 == arg0) {
			this.method6201(null);
		}
		@Pc(15) Class2_Sub17 local15 = (Class2_Sub17) this.aClass162_26.method3519((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7966();
		}
	}

	@OriginalMember(owner = "client!nga", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt6418 || arg1 >= this.anInt6444) {
			return;
		}
		if (arg0 < this.anInt6442) {
			arg2 -= this.anInt6442 - arg0;
			arg0 = this.anInt6442;
		}
		if (arg0 + arg2 > this.anInt6425) {
			arg2 = this.anInt6425 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt6426;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray443[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray443[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray443[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray443[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray443[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)Lclient!e;")
	@Override
	public Class2_Sub13 method6234(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "()Z")
	@Override
	public boolean method6187() {
		return true;
	}

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "()Z")
	@Override
	public boolean method6218() {
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class20 method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class20_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6260(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!nga", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt6441, this.anInt6422, this.anInt6430, this.anInt6433 };
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIF)Lclient!gga;")
	@Override
	public Class2_Sub14 method6209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!nga", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6441 = arg0;
		this.anInt6422 = arg1;
		this.anInt6430 = arg2;
		this.anInt6433 = arg3;
		this.method5400();
	}
}
