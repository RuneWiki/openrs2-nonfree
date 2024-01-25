import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class167_Sub2 extends Class167 {

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "Lclient!bp;")
	private Class3_Sub8 aClass3_Sub8_1;

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
	private int anInt7372;

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "I")
	public int anInt7374;

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "I")
	public int anInt7376;

	@OriginalMember(owner = "client!vq", name = "H", descriptor = "I")
	public int anInt7378;

	@OriginalMember(owner = "client!vq", name = "J", descriptor = "I")
	public int anInt7380;

	@OriginalMember(owner = "client!vq", name = "L", descriptor = "F")
	private float aFloat102;

	@OriginalMember(owner = "client!vq", name = "N", descriptor = "F")
	private float aFloat103;

	@OriginalMember(owner = "client!vq", name = "P", descriptor = "[I")
	public int[] anIntArray492;

	@OriginalMember(owner = "client!vq", name = "R", descriptor = "I")
	public int anInt7384;

	@OriginalMember(owner = "client!vq", name = "S", descriptor = "I")
	public int anInt7385;

	@OriginalMember(owner = "client!vq", name = "V", descriptor = "Z")
	public boolean aBoolean499;

	@OriginalMember(owner = "client!vq", name = "X", descriptor = "I")
	public int anInt7389;

	@OriginalMember(owner = "client!vq", name = "db", descriptor = "[Lclient!vn;")
	private Class259[] aClass259Array1;

	@OriginalMember(owner = "client!vq", name = "eb", descriptor = "I")
	public int anInt7395;

	@OriginalMember(owner = "client!vq", name = "gb", descriptor = "Lclient!aa;")
	private Class2 aClass2_18;

	@OriginalMember(owner = "client!vq", name = "ib", descriptor = "I")
	public int anInt7397;

	@OriginalMember(owner = "client!vq", name = "kb", descriptor = "I")
	public int anInt7399;

	@OriginalMember(owner = "client!vq", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!vq", name = "mb", descriptor = "I")
	public int anInt7400;

	@OriginalMember(owner = "client!vq", name = "qb", descriptor = "Lclient!aa;")
	private Class2 aClass2_19;

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "Z")
	private boolean aBoolean495;

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "Z")
	private boolean aBoolean496;

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "Lclient!lp;")
	private Class140 aClass140_42;

	@OriginalMember(owner = "client!vq", name = "A", descriptor = "I")
	public int anInt7373;

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
	private int anInt7375;

	@OriginalMember(owner = "client!vq", name = "O", descriptor = "Z")
	public boolean aBoolean498;

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "I")
	public int anInt7382;

	@OriginalMember(owner = "client!vq", name = "K", descriptor = "I")
	public int anInt7381;

	@OriginalMember(owner = "client!vq", name = "I", descriptor = "I")
	public int anInt7379;

	@OriginalMember(owner = "client!vq", name = "U", descriptor = "I")
	public int anInt7387;

	@OriginalMember(owner = "client!vq", name = "T", descriptor = "I")
	public int anInt7386;

	@OriginalMember(owner = "client!vq", name = "Z", descriptor = "I")
	public int anInt7391;

	@OriginalMember(owner = "client!vq", name = "cb", descriptor = "I")
	private int anInt7394;

	@OriginalMember(owner = "client!vq", name = "G", descriptor = "I")
	public int anInt7377;

	@OriginalMember(owner = "client!vq", name = "Q", descriptor = "I")
	private int anInt7383;

	@OriginalMember(owner = "client!vq", name = "fb", descriptor = "I")
	public int anInt7396;

	@OriginalMember(owner = "client!vq", name = "Y", descriptor = "I")
	private int anInt7390;

	@OriginalMember(owner = "client!vq", name = "bb", descriptor = "I")
	public int anInt7393;

	@OriginalMember(owner = "client!vq", name = "W", descriptor = "I")
	public int anInt7388;

	@OriginalMember(owner = "client!vq", name = "jb", descriptor = "I")
	public int anInt7398;

	@OriginalMember(owner = "client!vq", name = "ab", descriptor = "I")
	public int anInt7392;

	@OriginalMember(owner = "client!vq", name = "E", descriptor = "Z")
	private boolean aBoolean497;

	@OriginalMember(owner = "client!vq", name = "pb", descriptor = "I")
	public int anInt7402;

	@OriginalMember(owner = "client!vq", name = "ob", descriptor = "I")
	public int anInt7401;

	@OriginalMember(owner = "client!vq", name = "D", descriptor = "Lclient!wi;")
	private final Class268 aClass268_60;

	@OriginalMember(owner = "client!vq", name = "rb", descriptor = "I")
	private int anInt7403;

	@OriginalMember(owner = "client!vq", name = "hb", descriptor = "Lclient!wi;")
	private final Class268 aClass268_61;

	@OriginalMember(owner = "client!vq", name = "nb", descriptor = "Lclient!ap;")
	public Class11_Sub1 aClass11_Sub1_3;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(ILclient!l;)V")
	private Class167_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg0, arg1);
		this.aBoolean495 = false;
		this.aBoolean496 = false;
		this.aClass140_42 = new Class140(4);
		this.anInt7373 = 0;
		this.anInt7375 = 0;
		this.aBoolean498 = false;
		this.anInt7382 = 0;
		this.anInt7381 = 0;
		this.anInt7379 = 45823;
		this.anInt7387 = 78642;
		this.anInt7386 = 512;
		this.anInt7391 = 0;
		this.anInt7394 = 0;
		this.anInt7377 = 75518;
		this.anInt7383 = 0;
		this.anInt7396 = 3500;
		this.anInt7390 = 3500;
		this.anInt7393 = 0;
		this.anInt7388 = 0;
		this.anInt7398 = this.anInt7390 - 255;
		this.anInt7392 = 50;
		this.aBoolean497 = false;
		this.anInt7402 = 512;
		this.anInt7401 = 0;
		this.aClass268_60 = new Class268(16);
		this.anInt7403 = -1;
		this.aClass268_61 = new Class268(20);
		this.aClass11_Sub1_3 = new Class11_Sub1();
		this.method6022(1);
		this.method6000(0);
		Static176.method2835(true, false);
		this.aBoolean495 = true;
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;)V")
	public Class167_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2) {
		this(arg0, arg2);
		this.method5959(arg1);
		this.method6023(arg1);
	}

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "()Z")
	@Override
	public boolean method6019() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "(I)I")
	public int method6029(@OriginalArg(0) int arg0) {
		return super.anInterface7_8.method4417(arg0).aShort40 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!rg;III)V")
	public void method6030(@OriginalArg(0) Class23_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt4416;
		@Pc(4) int local4 = arg3;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.S(arg1, arg2, local4, arg0.anInt4420, 1);
			return;
		}
		if (this.anInt7403 != local2) {
			@Pc(32) Class2 local32 = (Class2) this.aClass268_60.method6166((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method6040(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method6031(local2) ? 64 : 128;
				local32 = this.method6021(local38, local48, local48, local48);
				this.aClass268_60.method6164(local32, (long) local2);
			}
			this.anInt7403 = local2;
			this.aClass2_19 = local32;
		}
		this.aClass2_19.XA(arg1 - local4, arg2 - local4, local8, local8, 0, arg0.anInt4420, 1);
	}

	@OriginalMember(owner = "client!vq", name = "S", descriptor = "(IIIII)V")
	@Override
	protected void S(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt7373) {
			local8 = this.anInt7373;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt7382) {
			local21 = this.anInt7382;
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
				if (local91 < this.anInt7391) {
					local91 = this.anInt7391;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7401) {
					local102 = this.anInt7401;
				}
				local116 = local91 + local30 * this.anInt7376;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray492[local116++] = arg3;
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
				if (local91 < this.anInt7391) {
					local91 = this.anInt7391;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7401 - 1) {
					local102 = this.anInt7401 - 1;
				}
				local116 = local91 + local30 * this.anInt7376;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray492[local116++] = arg3;
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
				if (local102 < this.anInt7391) {
					local102 = this.anInt7391;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt7401) {
					local116 = this.anInt7401;
				}
				local118 = local102 + local30 * this.anInt7376;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray492[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray492[local118++] = local277 + local340;
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
				if (local102 < this.anInt7391) {
					local102 = this.anInt7391;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt7401 - 1) {
					local116 = this.anInt7401 - 1;
				}
				local118 = local102 + local30 * this.anInt7376;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray492[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray492[local118++] = local277 + local340;
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
				if (local91 < this.anInt7391) {
					local91 = this.anInt7391;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7401) {
					local102 = this.anInt7401;
				}
				local116 = local91 + local30 * this.anInt7376;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray492[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray492[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt7391) {
					local91 = this.anInt7391;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7401 - 1) {
					local102 = this.anInt7401 - 1;
				}
				local116 = local91 + local30 * this.anInt7376;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray492[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray492[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "()V")
	@Override
	public void method5994() {
		if (this.aCanvas7 == null || this.aClass3_Sub8_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas7.getGraphics();
			this.aClass3_Sub8_1.method2872(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!vq", name = "sa", descriptor = "()I")
	@Override
	public int sa() {
		return this.anInt7390;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ju;[Lclient!mn;Z)Lclient!ba;")
	@Override
	public Class18 method5995(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class154[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4358;
			local7[local11] = arg1[local11].anInt4359;
			if (arg1[local11].aByteArray74 != null) {
			}
		}
		return new Class18_Sub3(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "(IIII)V")
	@Override
	public void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt7376) {
			arg2 = this.anInt7376;
		}
		if (arg3 > this.lb) {
			arg3 = this.lb;
		}
		this.anInt7391 = arg0;
		this.anInt7401 = arg2;
		this.anInt7373 = arg1;
		this.anInt7382 = arg3;
		this.method6034();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6013(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas7 == null || this.aClass3_Sub8_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas7.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt7376 && local21.y <= this.lb && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass3_Sub8_1.method2875(local21.x, local21.height, local21.y, local21.width, local14);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5959(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class3_Sub8 local8 = (Class3_Sub8) this.aClass140_42.method3490((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static456.method6225(arg0);
			this.aClass140_42.method3494((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!vq", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.anInt7392;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!fq;)V")
	@Override
	public void method5976(@OriginalArg(0) Class77 arg0) {
		@Pc(3) Class23_Sub1 local3 = arg0.aClass222_1.aClass23_Sub1_9;
		for (@Pc(6) Class23_Sub1 local6 = local3.aClass23_Sub1_7; local6 != local3; local6 = local6.aClass23_Sub1_7) {
			@Pc(10) Class23_Sub1_Sub2 local10 = (Class23_Sub1_Sub2) local6;
			@Pc(15) int local15 = local10.anInt4414 >> 12;
			@Pc(20) int local20 = local10.anInt4417 >> 12;
			@Pc(25) int local25 = local10.anInt4421 >> 12;
			@Pc(49) int local49 = this.aClass11_Sub1_3.anInt187 + (this.aClass11_Sub1_3.anInt191 * local15 + this.aClass11_Sub1_3.anInt188 * local20 + this.aClass11_Sub1_3.anInt197 * local25 >> 15);
			if (local49 >= this.anInt7392 && local49 <= this.anInt7398) {
				@Pc(90) int local90 = this.anInt7380 + this.anInt7402 * (this.aClass11_Sub1_3.anInt190 + (this.aClass11_Sub1_3.anInt193 * local15 + this.aClass11_Sub1_3.anInt196 * local20 + this.aClass11_Sub1_3.anInt192 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt7378 + this.anInt7386 * (this.aClass11_Sub1_3.anInt186 + (this.aClass11_Sub1_3.anInt189 * local15 + this.aClass11_Sub1_3.anInt194 * local20 + this.aClass11_Sub1_3.anInt195 * local25 >> 15)) / local49;
				if (local90 >= this.anInt7391 && local90 <= this.anInt7401 && local122 >= this.anInt7373 && local122 <= this.anInt7382) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method6030(local10, local90, local122, (local10.anInt4413 * this.anInt7402 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
	@Override
	public void method6011(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "(I)Z")
	public boolean method6031(@OriginalArg(0) int arg0) {
		return this.aBoolean497 || super.anInterface7_8.method4417(arg0).aBoolean232;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!lo;Lclient!lo;FLclient!lo;)Lclient!lo;")
	@Override
	public Class139 method5973(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class139 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "()Z")
	@Override
	public boolean method5961() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ka;Lclient!fq;Lclient!n;Lclient!st;I)V")
	@Override
	public void method5999(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class23_Sub6 arg3) {
		((Class108_Sub1) arg0).method2810(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([Lclient!ka;Lclient!fq;Lclient!n;[Lclient!st;I)V")
	@Override
	public void method5950(@OriginalArg(0) Class108[] arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class23_Sub6[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class108_Sub1[] local3 = new Class108_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class108_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class108_Sub1 local26 = Static175.method2824(this, local3);
		local26.method2810(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!w;)V")
	@Override
	public void method5965(@OriginalArg(0) Class3_Sub26 arg0) {
	}

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "()V")
	@Override
	protected void method6014() {
		if (this.aBoolean495) {
			Static80.method1439(true, false);
			this.aBoolean495 = false;
		}
		this.aClass3_Sub8_1 = null;
		this.aCanvas7 = null;
		this.aClass140_42 = null;
		this.aBoolean496 = true;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5998(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIII)Lclient!lo;")
	@Override
	public Class139 method5980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "()Z")
	@Override
	public boolean method5969() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(Z)V")
	@Override
	public void method6020(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!nd;IIII)Lclient!ka;")
	@Override
	public Class108 method5984(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class108_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "(I)Z")
	public boolean method6032(@OriginalArg(0) int arg0) {
		return super.anInterface7_8.method4420(arg0);
	}

	@OriginalMember(owner = "client!vq", name = "TA", descriptor = "(IIIIII)Z")
	@Override
	public boolean TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass11_Sub1_3.anInt191 * arg0 + this.aClass11_Sub1_3.anInt188 * arg1 + this.aClass11_Sub1_3.anInt197 * arg2 >> 15) + this.aClass11_Sub1_3.anInt187;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass11_Sub1_3.anInt191 * arg3 + this.aClass11_Sub1_3.anInt188 * arg4 + this.aClass11_Sub1_3.anInt197 * arg5 >> 15) + this.aClass11_Sub1_3.anInt187;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt7392 && local52 < this.anInt7392 || !(local23 <= this.anInt7390 || local52 <= this.anInt7390)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt7402 * ((this.aClass11_Sub1_3.anInt193 * arg0 + this.aClass11_Sub1_3.anInt196 * arg1 + this.aClass11_Sub1_3.anInt192 * arg2 >> 15) + this.aClass11_Sub1_3.anInt190) / local23;
		@Pc(133) int local133 = this.anInt7402 * ((this.aClass11_Sub1_3.anInt193 * arg3 + this.aClass11_Sub1_3.anInt196 * arg4 + this.aClass11_Sub1_3.anInt192 * arg5 >> 15) + this.aClass11_Sub1_3.anInt190) / local52;
		if (local104 < this.anInt7399 && local133 < this.anInt7399 || local104 > this.anInt7385 && local133 > this.anInt7385) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt7386 * ((this.aClass11_Sub1_3.anInt189 * arg0 + this.aClass11_Sub1_3.anInt194 * arg1 + this.aClass11_Sub1_3.anInt195 * arg2 >> 15) + this.aClass11_Sub1_3.anInt186) / local23;
			@Pc(209) int local209 = this.anInt7386 * ((this.aClass11_Sub1_3.anInt189 * arg3 + this.aClass11_Sub1_3.anInt194 * arg4 + this.aClass11_Sub1_3.anInt195 * arg5 >> 15) + this.aClass11_Sub1_3.anInt186) / local52;
			return (local180 >= this.anInt7384 || local209 >= this.anInt7384) && (local180 <= this.anInt7400 || local209 <= this.anInt7400);
		}
	}

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "()Z")
	@Override
	public boolean method5977() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "()V")
	@Override
	public void method6008() {
	}

	@OriginalMember(owner = "client!vq", name = "Z", descriptor = "()I")
	@Override
	public int Z() {
		@Pc(2) int local2 = this.anInt7375;
		this.anInt7375 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!mn;Z)Lclient!aa;")
	@Override
	public Class2 method5993(@OriginalArg(0) Class154 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray287;
		@Pc(5) byte[] local5 = arg0.aByteArray73;
		@Pc(8) int local8 = arg0.anInt4358;
		@Pc(11) int local11 = arg0.anInt4359;
		@Pc(76) Class2_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray74 == null) {
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
			local76 = new Class2_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray74;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class2_Sub1_Sub2(this, local20, local8, local11);
				local76 = new Class2_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class2_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.l(arg0.anInt4356, arg0.anInt4354, arg0.anInt4357, arg0.anInt4355);
		return local76;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	@Override
	public void method5953(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "()I")
	@Override
	public int method5986() {
		return 0;
	}

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "()V")
	@Override
	public void method5991() {
		this.aClass268_61.method6160();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIF)Lclient!be;")
	@Override
	public Class3_Sub7 method6025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!vq", name = "BA", descriptor = "(IIIII)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt7391 || arg0 >= this.anInt7401) {
			return;
		}
		if (arg1 < this.anInt7373) {
			arg2 -= this.anInt7373 - arg1;
			arg1 = this.anInt7373;
		}
		if (arg1 + arg2 > this.anInt7382) {
			arg2 = this.anInt7382 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt7376;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray492[local40 + local54 * this.anInt7376] = arg3;
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
				local111 = local40 + local103 * this.anInt7376;
				local116 = this.anIntArray492[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray492[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt7376;
				local111 = this.anIntArray492[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray492[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([IIIII)Lclient!aa;")
	@Override
	public Class2 method6021(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class2_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class2_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class2_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class2_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II[[I[[IIII)Lclient!o;")
	@Override
	public Class55 method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class55_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V")
	@Override
	public void method6022(@OriginalArg(0) int arg0) {
		if (this.anInt7374 == arg0) {
			return;
		}
		this.anInt7374 = arg0;
		this.aClass259Array1 = new Class259[this.anInt7374];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7374; local14++) {
			this.aClass259Array1[local14] = new Class259(this);
		}
	}

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "()V")
	private void method6033() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7374; local1++) {
			this.aClass259Array1[local1].method5914();
		}
		this.H();
	}

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "()Lclient!n;")
	@Override
	public Class11 method5975() {
		return new Class11_Sub1();
	}

	@OriginalMember(owner = "client!vq", name = "A", descriptor = "()Z")
	@Override
	public boolean method6027() {
		return true;
	}

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "()V")
	private void method6034() {
		this.anInt7399 = this.anInt7391 - this.anInt7380;
		this.anInt7385 = this.anInt7401 - this.anInt7380;
		this.anInt7384 = this.anInt7373 - this.anInt7378;
		this.anInt7400 = this.anInt7382 - this.anInt7378;
		for (@Pc(29) int local29 = 0; local29 < this.anInt7374; local29++) {
			@Pc(36) Class166 local36 = this.aClass259Array1[local29].aClass166_2;
			local36.anInt4674 = this.anInt7380 - this.anInt7391;
			local36.anInt4673 = this.anInt7378 - this.anInt7373;
			local36.anInt4671 = this.anInt7401 - this.anInt7391;
			local36.anInt4675 = this.anInt7382 - this.anInt7373;
		}
		@Pc(78) int local78 = this.anInt7373 * this.anInt7376 + this.anInt7391;
		for (@Pc(81) int local81 = this.anInt7373; local81 < this.anInt7382; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt7374; local84++) {
				this.aClass259Array1[local84].aClass166_2.anIntArray314[local81 - this.anInt7373] = local78;
			}
			local78 += this.anInt7376;
		}
	}

	@OriginalMember(owner = "client!vq", name = "IA", descriptor = "(IIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7391 < arg0) {
			this.anInt7391 = arg0;
		}
		if (this.anInt7373 < arg1) {
			this.anInt7373 = arg1;
		}
		if (this.anInt7401 > arg2) {
			this.anInt7401 = arg2;
		}
		if (this.anInt7382 > arg3) {
			this.anInt7382 = arg3;
		}
		this.method6034();
	}

	@OriginalMember(owner = "client!vq", name = "K", descriptor = "(I)V")
	@Override
	public void K(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vq", name = "D", descriptor = "()V")
	private void method6035() {
		if (this.aFloat103 == 0.0F) {
			this.anInt7396 = this.anInt7390;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt7390;
		@Pc(12) float local12 = (float) this.anInt7392;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat102 / (this.aFloat103 + this.aFloat102);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat103;
		this.anInt7396 = (int) (((float) this.anInt7390 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "()Z")
	@Override
	public boolean method5990() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "M", descriptor = "(IIIIII)V")
	@Override
	public void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt7391) {
			arg2 -= this.anInt7391 - arg0;
			arg0 = this.anInt7391;
		}
		if (arg1 < this.anInt7373) {
			arg3 -= this.anInt7373 - arg1;
			arg1 = this.anInt7373;
		}
		if (arg0 + arg2 > this.anInt7401) {
			arg2 = this.anInt7401 - arg0;
		}
		if (arg1 + arg3 > this.anInt7382) {
			arg3 = this.anInt7382 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt7401 || arg1 > this.anInt7382) {
			return;
		}
		@Pc(67) int local67 = this.anInt7376 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt7376;
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
						local221 = this.anIntArray492[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray492[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray492[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray492[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray492[arg2] = arg4;
					arg2++;
					this.anIntArray492[arg2] = arg4;
					arg2++;
					this.anIntArray492[arg2] = arg4;
					arg2++;
					this.anIntArray492[arg2] = arg4;
					arg2++;
					this.anIntArray492[arg2] = arg4;
					arg2++;
					this.anIntArray492[arg2] = arg4;
					arg2++;
					this.anIntArray492[arg2] = arg4;
					arg2++;
					this.anIntArray492[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray492[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIZ)Lclient!aa;")
	@Override
	public Class2 method5974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt7376 + arg0;
		@Pc(16) int local16 = this.anInt7376 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray492[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class2_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class2_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIIII)V")
	public void method6036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface7_8.method4417(arg5).aBoolean231) {
			this.S(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt7403 != arg5) {
			@Pc(26) Class2 local26 = (Class2) this.aClass268_60.method6166((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method6040(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method6031(arg5) ? 64 : 128;
				local26 = this.method6021(local32, local43, local43, local43);
				this.aClass268_60.method6164(local26, (long) arg5);
			}
			this.anInt7403 = arg5;
			this.aClass2_19 = local26;
		}
		this.aClass2_19.XA(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "()Z")
	@Override
	public boolean method6024() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "ua", descriptor = "(IIIIII[BII)V")
	@Override
	public void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt7376;
		@Pc(35) int local35 = this.anInt7376 - arg2;
		if (arg1 + arg3 > this.anInt7382) {
			arg3 -= arg1 + arg3 - this.anInt7382;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt7373) {
			local59 = this.anInt7373 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt7376;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt7401) {
			local59 = arg0 + arg2 - this.anInt7401;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt7391) {
			local59 = this.anInt7391 - arg0;
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
						this.anIntArray492[local30++] = arg4;
					} else {
						this.anIntArray492[local30++] = arg5;
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
					local245 = this.anIntArray492[local30];
					this.anIntArray492[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray492[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray492[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!vq", name = "ha", descriptor = "(III)V")
	@Override
	public void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7393 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt7393 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt7393 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt7393 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt7393 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean499 = false;
		} else {
			this.aBoolean499 = true;
		}
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(IIIII)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt7373 || arg1 >= this.anInt7382) {
			return;
		}
		if (arg0 < this.anInt7391) {
			arg2 -= this.anInt7391 - arg0;
			arg0 = this.anInt7391;
		}
		if (arg0 + arg2 > this.anInt7401) {
			arg2 = this.anInt7401 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt7376;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray492[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray492[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray492[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray492[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray492[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vq", name = "E", descriptor = "()Z")
	public boolean method6037() {
		return this.aBoolean496;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!vn;")
	public Class259 method6038(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7374; local1++) {
			if (this.aClass259Array1[local1].aRunnable1 == arg0) {
				return this.aClass259Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6023(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas7 = null;
			this.aClass3_Sub8_1 = null;
			if (this.aClass2_18 == null) {
				this.anIntArray492 = null;
				this.anInt7376 = this.lb = 1;
				this.method6033();
			}
			return;
		}
		@Pc(10) Class3_Sub8 local10 = (Class3_Sub8) this.aClass140_42.method3490((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas7 = arg0;
		this.aClass3_Sub8_1 = local10;
		if (this.aClass2_18 != null) {
			return;
		}
		this.anIntArray492 = local10.anIntArray197;
		this.anInt7376 = local10.anInt3342;
		this.lb = local10.anInt3346;
		this.method6033();
		return;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.d(arg0, arg1, arg2, arg4, arg5);
		this.d(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.BA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.BA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method6012(@OriginalArg(0) Class11 arg0) {
		this.aClass11_Sub1_3 = (Class11_Sub1) arg0;
	}

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "(I)[I")
	public int[] method6039(@OriginalArg(0) int arg0) {
		@Pc(2) Class268 local2 = this.aClass268_61;
		@Pc(12) Class3_Sub43 local12;
		synchronized (this.aClass268_61) {
			local12 = (Class3_Sub43) this.aClass268_61.method6166((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_8.method4420(arg0)) {
					return null;
				}
				@Pc(32) Class105 local32 = super.anInterface7_8.method4417(arg0);
				@Pc(42) int local42 = local32.aBoolean232 || this.aBoolean497 ? 64 : 128;
				local12 = new Class3_Sub43(arg0, local42, super.anInterface7_8.method4416(arg0, true, local42, local42, 0.7F), local32.aBoolean227);
				this.aClass268_61.method6164(local12, (long) arg0);
			}
		}
		local12.aBoolean451 = true;
		return local12.method5534();
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
	@Override
	public void method5983(@OriginalArg(0) int arg0) {
		this.aClass259Array1[arg0].method5915(null);
	}

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "(I)[I")
	private int[] method6040(@OriginalArg(0) int arg0) {
		@Pc(2) Class268 local2 = this.aClass268_61;
		@Pc(12) Class3_Sub43 local12;
		synchronized (this.aClass268_61) {
			local12 = (Class3_Sub43) this.aClass268_61.method6166((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_8.method4420(arg0)) {
					return null;
				}
				@Pc(32) Class105 local32 = super.anInterface7_8.method4417(arg0);
				@Pc(42) int local42 = local32.aBoolean232 || this.aBoolean497 ? 64 : 128;
				local12 = new Class3_Sub43(arg0, local42, super.anInterface7_8.method4418(arg0, local42, local42, 0.7F), local32.aBoolean227);
				this.aClass268_61.method6164(local12, (long) arg0);
			}
		}
		local12.aBoolean451 = true;
		return local12.method5534();
	}

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "(IIII)V")
	@Override
	public void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7383 = this.anInt7393;
		this.anInt7381 = arg0;
		this.anInt7393 = arg1;
		this.anInt7388 = arg2;
		this.aBoolean498 = true;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5970(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class3_Sub8 local8 = (Class3_Sub8) this.aClass140_42.method3490((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method6288();
		local8 = Static456.method6225(arg0);
		this.aClass140_42.method3494((long) arg0.hashCode(), local8);
		if (this.aCanvas7 != arg0 || this.aClass2_18 != null) {
			return;
		}
		this.aClass3_Sub8_1 = local8;
		this.anIntArray492 = local8.anIntArray197;
		this.anInt7376 = local8.anInt3342;
		this.lb = local8.anInt3346;
		this.method6033();
	}

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "([I)V")
	@Override
	public void p(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7391;
		arg0[1] = this.anInt7373;
		arg0[2] = this.anInt7401;
		arg0[3] = this.anInt7382;
	}

	@OriginalMember(owner = "client!vq", name = "MA", descriptor = "(F)V")
	@Override
	public void MA(@OriginalArg(0) float arg0) {
		this.anInt7377 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class259 local3 = this.method6038(Thread.currentThread());
		@Pc(6) Class166 local6 = local3.aClass166_2;
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
		@Pc(93) int local93 = arg0 - local6.method3872();
		@Pc(98) int local98 = arg1 - local6.method3863();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt4670 = 0;
		local6.aBoolean334 = local102 < 0 || local102 > local6.anInt4671 || local106 < 0 || local106 > local6.anInt4671 || local112 < 0 || local112 > local6.anInt4671;
		local6.method3864(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean334 = local102 < 0 || local102 > local6.anInt4671 || local106 < 0 || local106 > local6.anInt4671 || local118 < 0 || local118 > local6.anInt4671;
		local6.method3864(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt7391) {
					arg1 += local104 * (this.anInt7391 - arg0);
					arg0 = this.anInt7391;
				}
				if (arg2 >= this.anInt7401) {
					arg2 = this.anInt7401 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt7373 && local150 < this.anInt7382) {
							this.anIntArray492[arg0 + local150 * this.anInt7376] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt7373 && local213 < this.anInt7382) {
							local228 = arg0 + local213 * this.anInt7376;
							local233 = this.anIntArray492[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray492[local228] = local204 + local233;
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
				if (arg1 < this.anInt7373) {
					arg0 += local104 * (this.anInt7373 - arg1);
					arg1 = this.anInt7373;
				}
				if (arg3 >= this.anInt7382) {
					arg3 = this.anInt7382 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt7391 && local150 < this.anInt7401) {
							this.anIntArray492[local150 + arg1 * this.anInt7376] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt7391 && local213 < this.anInt7401) {
							local228 = local213 + arg1 * this.anInt7376;
							local233 = this.anIntArray492[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray492[local213 + arg1 * this.anInt7376] = local204 + local516;
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

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!lo;)V")
	@Override
	public void method5982(@OriginalArg(0) Class139 arg0) {
	}

	@OriginalMember(owner = "client!vq", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		return 0;
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)V")
	@Override
	public void method6000(@OriginalArg(0) int arg0) {
		this.aClass259Array1[arg0].method5915(Thread.currentThread());
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([Lclient!ka;Lclient!n;[Lclient!st;I)V")
	@Override
	public void method6015(@OriginalArg(0) Class108[] arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class23_Sub6[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class108_Sub1[] local3 = new Class108_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class108_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class108_Sub1 local26 = Static175.method2824(this, local3);
		local26.method2810(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!vq", name = "I", descriptor = "()F")
	@Override
	public float I() {
		return this.aFloat102;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)I")
	@Override
	public int method6006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II[I[I)Lclient!i;")
	@Override
	public Class14 method5964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class14_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(IIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7380 = arg0;
		this.anInt7378 = arg1;
		this.anInt7402 = arg2;
		this.anInt7386 = arg3;
		this.method6034();
	}

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)Lclient!w;")
	@Override
	public Class3_Sub26 method6004(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "()Z")
	@Override
	public boolean method5988() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "()Lclient!n;")
	@Override
	public Class11 method5989() {
		@Pc(3) Class259 local3 = this.method6038(Thread.currentThread());
		return local3.aClass11_Sub1_2;
	}

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "(II)V")
	@Override
	public void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7392 = arg0;
		this.anInt7390 = arg1;
		this.anInt7398 = this.anInt7390 - 255;
		this.method6035();
	}

	@OriginalMember(owner = "client!vq", name = "PA", descriptor = "(FF)V")
	@Override
	public void PA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat102 = arg0;
		this.aFloat103 = arg1;
		this.method6035();
	}

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "(I)Z")
	public boolean method6041(@OriginalArg(0) int arg0) {
		return super.anInterface7_8.method4417(arg0).aBoolean235;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)I")
	@Override
	public int method5967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[Lclient!be;)V")
	@Override
	public void method5985(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7[] arg1) {
	}

	@OriginalMember(owner = "client!vq", name = "U", descriptor = "()I")
	@Override
	public int U() {
		@Pc(2) int local2 = this.anInt7394;
		this.anInt7394 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "()Z")
	@Override
	public boolean method5992() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V")
	@Override
	public void method6007(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt7372;
		for (@Pc(9) Object local9 = this.aClass268_61.method6171(); local9 != null; local9 = this.aClass268_61.method6161()) {
			@Pc(13) Class3_Sub43 local13 = (Class3_Sub43) local9;
			if (local13.aBoolean451) {
				local13.anInt6685 += local4;
				@Pc(27) int local27 = local13.anInt6685 / 20;
				if (local27 > 0) {
					@Pc(36) Class105 local36 = super.anInterface7_8.method4417(local13.anInt6684);
					local13.method5533(local36.aByte40 * local4 * 50 / 1000, local36.aByte38 * local4 * 50 / 1000);
					local13.anInt6685 -= local27 * 20;
				}
				local13.aBoolean451 = false;
			}
		}
		this.anInt7372 = arg0;
		this.aClass268_60.method6173(5);
	}

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "()V")
	@Override
	public void method6005() {
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIILclient!i;II)V")
	@Override
	public void method5954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class14_Sub2 local2 = (Class14_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray405;
		@Pc(8) int[] local8 = local2.anIntArray404;
		@Pc(17) int local17 = this.anInt7373 > arg7 ? this.anInt7373 : arg7;
		@Pc(32) int local32 = this.anInt7382 < arg7 + local5.length ? this.anInt7382 : arg7 + local5.length;
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
					if (local129 >= this.anInt7391 && local129 < this.anInt7401 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray492[local129 + arg1 * this.anInt7376] = arg4;
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
					if (local133 >= this.anInt7391 && local133 < this.anInt7401 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt7376;
						local248 = this.anIntArray492[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray492[local133 + arg1 * this.anInt7376] = local201 + local584;
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
		if (arg0 < this.anInt7391) {
			arg1 += local83 * (this.anInt7391 - arg0);
			arg0 = this.anInt7391;
		}
		if (arg2 >= this.anInt7401) {
			arg2 = this.anInt7401 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray492[arg0 + local129 * this.anInt7376] = arg4;
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
					local243 = arg0 + local133 * this.anInt7376;
					local248 = this.anIntArray492[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray492[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "()V")
	@Override
	public void method5987() {
	}

	@OriginalMember(owner = "client!vq", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7381 = arg0;
		this.anInt7393 = arg1;
		this.anInt7388 = arg2;
	}

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "()Z")
	@Override
	public boolean method5963() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6002() {
		@Pc(3) Class259 local3 = this.method6038(Thread.currentThread());
		@Pc(6) Class166 local6 = local3.aClass166_2;
		local6.aBoolean337 = false;
		local6.aBoolean337 = false;
		local6.anInt4670 = 0;
		local6.aBoolean334 = true;
		local6.method3862(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean337 = true;
	}

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "(I)V")
	@Override
	public void l(@OriginalArg(0) int arg0) {
		this.M(0, 0, this.anInt7376, this.lb, arg0, 0);
	}

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "()Z")
	@Override
	public boolean method6028() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "()Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "la", descriptor = "(IFFFFF)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt7379 = (int) (arg1 * 65535.0F);
		this.anInt7387 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt7397 = (int) (arg3 * 65535.0F / local26);
		this.anInt7395 = (int) (arg4 * 65535.0F / local26);
		this.anInt7389 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!vq", name = "GA", descriptor = "(ILclient!i;II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class14_Sub2 local2 = (Class14_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray405;
		@Pc(8) int[] local8 = local2.anIntArray404;
		@Pc(20) int local20;
		if (this.anInt7382 < arg3 + local5.length) {
			local20 = this.anInt7382 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt7373 > arg3) {
			local33 = this.anInt7373 - arg3;
			arg3 = this.anInt7373;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt7376;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt7391 > local58) {
				local62 -= this.anInt7391 - local58;
				local58 = this.anInt7391;
			}
			if (this.anInt7401 < local58 + local62) {
				local62 = this.anInt7401 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray492[local58++] = arg0;
			}
			local49 += this.anInt7376;
		}
	}

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "()F")
	@Override
	public float s() {
		return this.aFloat103;
	}

	@OriginalMember(owner = "client!vq", name = "N", descriptor = "(IIII)[I")
	@Override
	public int[] N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt7376 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray492[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "()Z")
	@Override
	public boolean method5949() {
		return true;
	}

	@OriginalMember(owner = "client!vq", name = "XA", descriptor = "(III[I)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass11_Sub1_3.anInt187 + (this.aClass11_Sub1_3.anInt191 * arg0 + this.aClass11_Sub1_3.anInt188 * arg1 + this.aClass11_Sub1_3.anInt197 * arg2 >> 15);
		if (local23 < this.anInt7392 || local23 > this.anInt7390) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt7402 * (this.aClass11_Sub1_3.anInt190 + (this.aClass11_Sub1_3.anInt193 * arg0 + this.aClass11_Sub1_3.anInt196 * arg1 + this.aClass11_Sub1_3.anInt192 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt7386 * (this.aClass11_Sub1_3.anInt186 + (this.aClass11_Sub1_3.anInt189 * arg0 + this.aClass11_Sub1_3.anInt194 * arg1 + this.aClass11_Sub1_3.anInt195 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt7399 && local73 <= this.anInt7385 && local102 >= this.anInt7384 && local102 <= this.anInt7400) {
			arg3[0] = local73 - this.anInt7399;
			arg3[1] = local102 - this.anInt7384;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5955(@OriginalArg(0) boolean arg0) {
		this.aBoolean497 = arg0;
		this.aClass268_61.method6160();
	}

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "()V")
	@Override
	public void r() {
		this.anInt7393 = this.anInt7383;
		this.aBoolean498 = false;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5968(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
			this.method6023(null);
		}
		@Pc(15) Class3_Sub8 local15 = (Class3_Sub8) this.aClass140_42.method3490((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6288();
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "()V")
	@Override
	public void method5957() {
	}

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "()Z")
	@Override
	public boolean method5978() {
		return true;
	}

	@OriginalMember(owner = "client!vq", name = "H", descriptor = "()V")
	@Override
	public void H() {
		this.anInt7391 = 0;
		this.anInt7373 = 0;
		this.anInt7401 = this.anInt7376;
		this.anInt7382 = this.lb;
		this.method6034();
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "()Z")
	@Override
	public boolean method5962() {
		return true;
	}
}
