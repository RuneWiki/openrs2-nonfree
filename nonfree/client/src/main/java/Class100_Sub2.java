import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class100_Sub2 extends Class100 {

	@OriginalMember(owner = "client!iw", name = "w", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!iw", name = "x", descriptor = "Lclient!kf;")
	public Class6_Sub27 aClass6_Sub27_1;

	@OriginalMember(owner = "client!iw", name = "y", descriptor = "I")
	private int anInt4990;

	@OriginalMember(owner = "client!iw", name = "z", descriptor = "I")
	private int anInt4991;

	@OriginalMember(owner = "client!iw", name = "A", descriptor = "Lclient!he;")
	private Class128 aClass128_14;

	@OriginalMember(owner = "client!iw", name = "B", descriptor = "I")
	private int anInt4992;

	@OriginalMember(owner = "client!iw", name = "C", descriptor = "Z")
	private boolean aBoolean349;

	@OriginalMember(owner = "client!iw", name = "D", descriptor = "Z")
	private boolean aBoolean350;

	@OriginalMember(owner = "client!iw", name = "E", descriptor = "I")
	public int anInt4993;

	@OriginalMember(owner = "client!iw", name = "F", descriptor = "I")
	private int anInt4994;

	@OriginalMember(owner = "client!iw", name = "G", descriptor = "[F")
	public float[] aFloatArray45;

	@OriginalMember(owner = "client!iw", name = "H", descriptor = "Lclient!jt;")
	private final Class166 aClass166_26;

	@OriginalMember(owner = "client!iw", name = "I", descriptor = "I")
	public int anInt4995;

	@OriginalMember(owner = "client!iw", name = "J", descriptor = "I")
	public int anInt4996;

	@OriginalMember(owner = "client!iw", name = "K", descriptor = "I")
	public int anInt4997;

	@OriginalMember(owner = "client!iw", name = "L", descriptor = "I")
	public int anInt4998;

	@OriginalMember(owner = "client!iw", name = "M", descriptor = "Lclient!iv;")
	public Class154_Sub1 aClass154_Sub1_1;

	@OriginalMember(owner = "client!iw", name = "N", descriptor = "[I")
	public int[] anIntArray288;

	@OriginalMember(owner = "client!iw", name = "O", descriptor = "I")
	public int anInt4999;

	@OriginalMember(owner = "client!iw", name = "P", descriptor = "I")
	public int anInt5000;

	@OriginalMember(owner = "client!iw", name = "Q", descriptor = "I")
	public int anInt5001;

	@OriginalMember(owner = "client!iw", name = "R", descriptor = "I")
	public int anInt5002;

	@OriginalMember(owner = "client!iw", name = "S", descriptor = "Lclient!jt;")
	private final Class166 aClass166_27;

	@OriginalMember(owner = "client!iw", name = "T", descriptor = "Lclient!ji;")
	private Class162 aClass162_1;

	@OriginalMember(owner = "client!iw", name = "U", descriptor = "I")
	public int anInt5003;

	@OriginalMember(owner = "client!iw", name = "V", descriptor = "I")
	private int anInt5004;

	@OriginalMember(owner = "client!iw", name = "W", descriptor = "I")
	public int anInt5005;

	@OriginalMember(owner = "client!iw", name = "X", descriptor = "I")
	public int anInt5006;

	@OriginalMember(owner = "client!iw", name = "Y", descriptor = "I")
	public int anInt5007;

	@OriginalMember(owner = "client!iw", name = "Z", descriptor = "I")
	public int anInt5008;

	@OriginalMember(owner = "client!iw", name = "ab", descriptor = "I")
	private int anInt5009;

	@OriginalMember(owner = "client!iw", name = "bb", descriptor = "I")
	private int anInt5010;

	@OriginalMember(owner = "client!iw", name = "cb", descriptor = "[Lclient!md;")
	private Class202[] aClass202Array1;

	@OriginalMember(owner = "client!iw", name = "db", descriptor = "I")
	public int anInt5011;

	@OriginalMember(owner = "client!iw", name = "eb", descriptor = "I")
	private int anInt5012;

	@OriginalMember(owner = "client!iw", name = "fb", descriptor = "I")
	public int anInt5013;

	@OriginalMember(owner = "client!iw", name = "gb", descriptor = "I")
	public int anInt5014;

	@OriginalMember(owner = "client!iw", name = "hb", descriptor = "I")
	public int anInt5015;

	@OriginalMember(owner = "client!iw", name = "ib", descriptor = "I")
	public int anInt5016;

	@OriginalMember(owner = "client!iw", name = "jb", descriptor = "I")
	public int anInt5017;

	@OriginalMember(owner = "client!iw", name = "kb", descriptor = "[F")
	public float[] aFloatArray46;

	@OriginalMember(owner = "client!iw", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!iw", name = "mb", descriptor = "I")
	public int anInt5018;

	@OriginalMember(owner = "client!iw", name = "nb", descriptor = "I")
	public int anInt5019;

	@OriginalMember(owner = "client!iw", name = "ob", descriptor = "I")
	private int anInt5020;

	@OriginalMember(owner = "client!iw", name = "pb", descriptor = "I")
	private int anInt5021;

	@OriginalMember(owner = "client!iw", name = "qb", descriptor = "Z")
	private boolean aBoolean351;

	@OriginalMember(owner = "client!iw", name = "rb", descriptor = "Lclient!pga;")
	private Class32 aClass32_10;

	@OriginalMember(owner = "client!iw", name = "sb", descriptor = "I")
	private int anInt5022;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class100_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method8797(arg0, arg2, arg3);
			this.method8788(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method8789();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class100_Sub2(@OriginalArg(0) Interface4 arg0) {
		super(arg0);
		this.aBoolean349 = false;
		this.aBoolean350 = false;
		this.aClass128_14 = new Class128(4);
		this.anInt5001 = 45823;
		this.anInt5003 = 0;
		this.anInt5006 = 0;
		this.anInt4999 = 512;
		this.anInt4995 = 0;
		this.anInt5010 = 0;
		this.anInt5009 = 0;
		this.anInt5005 = 0;
		this.anInt5007 = 50;
		this.anInt5002 = 75518;
		this.anInt5017 = 128;
		this.anInt5016 = 78642;
		this.lb = 3500;
		this.anInt5018 = 512;
		this.aBoolean351 = false;
		this.aClass166_27 = new Class166(16);
		this.anInt5022 = -1;
		try {
			this.aClass166_26 = new Class166(256);
			this.aClass154_Sub1_1 = new Class154_Sub1();
			this.method8817(1);
			this.method8805(0);
			Static125.method9040(true, true);
			this.aBoolean350 = true;
			this.anInt4990 = (int) Static32.method595();
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method8789();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!bi;Lclient!dk;)Lclient!pk;")
	@Override
	public Interface20 method8839(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface5 arg1) {
		return new Class162(this, (Class32) arg0, (Class266) arg1);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8788(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas5 = null;
			this.aClass6_Sub27_1 = null;
			if (this.aClass162_1 == null) {
				this.anIntArray288 = null;
				this.anInt4996 = this.anInt5020 = 1;
				this.anInt4994 = this.anInt5004 = 1;
				this.method4434();
			}
			return;
		}
		@Pc(10) Class6_Sub27 local10 = (Class6_Sub27) this.aClass128_14.method3560((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas5 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt4992 = local18.width;
		this.anInt4991 = local18.height;
		this.aClass6_Sub27_1 = local10;
		if (this.aClass162_1 != null) {
			return;
		}
		this.anIntArray288 = local10.anIntArray481;
		this.anInt4996 = local10.anInt7917;
		this.anInt5020 = local10.anInt7918;
		if (this.anInt4996 != this.anInt4994 || this.anInt5020 != this.anInt5004) {
			this.anInt5021 = this.anInt4994 = this.anInt4996;
			this.anInt5012 = this.anInt5004 = this.anInt5020;
			this.aFloatArray46 = this.aFloatArray45 = new float[this.anInt4994 * this.anInt5004];
		}
		this.method4434();
		return;
	}

	@OriginalMember(owner = "client!iw", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass202Array1.length; local1++) {
			this.aClass202Array1[local1].anInt6397 = this.aClass202Array1[local1].anInt6404;
			this.aClass202Array1[local1].anInt6400 = arg0;
			this.aClass202Array1[local1].anInt6404 = arg1;
			this.aClass202Array1[local1].anInt6399 = arg2;
			this.aClass202Array1[local1].aBoolean418 = true;
		}
	}

	@OriginalMember(owner = "client!iw", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5008 = arg0;
		this.anInt5014 = arg1;
		this.anInt4999 = arg2;
		this.anInt5018 = arg3;
		this.method4432();
	}

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)[I")
	public int[] method4420(@OriginalArg(0) int arg0) {
		@Pc(2) Class166 local2 = this.aClass166_26;
		@Pc(12) Class6_Sub50 local12;
		synchronized (this.aClass166_26) {
			local12 = (Class6_Sub50) this.aClass166_26.method4805((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_12.method892(arg0)) {
					return null;
				}
				@Pc(32) Class325 local32 = super.anInterface4_12.method895(arg0);
				@Pc(43) int local43 = local32.aBoolean633 || this.aBoolean351 ? 64 : this.anInt5017;
				local12 = new Class6_Sub50(arg0, local43, super.anInterface4_12.method894(0.7F, true, arg0, local43, local43), local32.anInt9371 != 1);
				this.aClass166_26.method4803(local12, (long) arg0);
			}
		}
		local12.aBoolean665 = true;
		return local12.method8178();
	}

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "()Z")
	@Override
	public boolean method8836() {
		return false;
	}

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method8845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!iw", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt5010;
		this.anInt5010 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!iw", name = "j", descriptor = "()Z")
	@Override
	public boolean method8799() {
		return true;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8855(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas5 == null || this.aClass6_Sub27_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt4996 && local21.y + arg3 <= this.anInt5020 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass6_Sub27_1.method6786(local21.width, local21.height, local21.y, local21.y + arg3, local14, local21.x, local21.x + arg2);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!kga;IIII)V")
	private void method4421(@OriginalArg(0) Class20_Sub6_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt8663;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method4426(arg1, arg2, arg3, arg4, arg0.anInt8660, 1);
			return;
		}
		if (this.anInt5022 != local2) {
			@Pc(33) Class32 local33 = (Class32) this.aClass166_27.method4805((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method4423(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method4433(local2) ? 64 : this.anInt5017;
				local33 = this.method8847(local50, local50, local39, local50);
				this.aClass166_27.method4803(local33, (long) local2);
			}
			this.anInt5022 = local2;
			this.aClass32_10 = local33;
		}
		local8++;
		((Class32_Sub2) this.aClass32_10).method4260(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt8660, 1);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIZ)Lclient!pga;")
	@Override
	public Class32 method8804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt4996 + arg0;
		@Pc(16) int local16 = this.anInt4996 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray288[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class32_Sub2_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class32_Sub2_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!iw", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4995;
		arg0[1] = this.anInt5005;
		arg0[2] = this.anInt5003;
		arg0[3] = this.anInt5006;
	}

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt5007;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!om;)V")
	@Override
	public void method8783(@OriginalArg(0) Class57 arg0) {
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!fg;Z)Lclient!pga;")
	@Override
	public Class32 method8773(@OriginalArg(0) Class98 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray184;
		@Pc(5) byte[] local5 = arg0.aByteArray45;
		@Pc(8) int local8 = arg0.anInt2796;
		@Pc(11) int local11 = arg0.anInt2799;
		@Pc(76) Class32_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray44 == null) {
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
			local76 = new Class32_Sub2_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray44;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class32_Sub2_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class32_Sub2_Sub3(this, local20, local8, local11);
			}
		}
		local76.method5073(arg0.anInt2797, arg0.anInt2798, arg0.anInt2794, arg0.anInt2795);
		return local76;
	}

	@OriginalMember(owner = "client!iw", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5001 = (int) (arg1 * 65535.0F);
		this.anInt5016 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5011 = (int) (arg3 * 65535.0F / local26);
		this.anInt4998 = (int) (arg4 * 65535.0F / local26);
		this.anInt5000 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!iw", name = "v", descriptor = "()V")
	@Override
	public void method8849() {
		this.aClass166_26.method4811();
		this.aClass166_27.method4811();
	}

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "(I)V")
	@Override
	public void method8818(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt4990;
		for (@Pc(9) Object local9 = this.aClass166_26.method4799(); local9 != null; local9 = this.aClass166_26.method4797()) {
			@Pc(13) Class6_Sub50 local13 = (Class6_Sub50) local9;
			if (local13.aBoolean665) {
				local13.anInt9652 += local4;
				@Pc(27) int local27 = local13.anInt9652 / 20;
				if (local27 > 0) {
					@Pc(36) Class325 local36 = super.anInterface4_12.method895(local13.anInt9651);
					local13.method8177(local36.aByte116 * local4 * 50 / 1000, local36.aByte111 * local4 * 50 / 1000);
					local13.anInt9652 -= local27 * 20;
				}
				local13.aBoolean665 = false;
			}
		}
		this.anInt4990 = arg0;
		this.aClass166_27.method4809(5);
		this.aClass166_26.method4809(5);
	}

	@OriginalMember(owner = "client!iw", name = "j", descriptor = "(I)Z")
	public boolean method4422(@OriginalArg(0) int arg0) {
		return super.anInterface4_12.method892(arg0);
	}

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method8785() {
		@Pc(3) Class202 local3 = this.method4430(Thread.currentThread());
		return local3.aClass154_Sub1_2;
	}

	@OriginalMember(owner = "client!iw", name = "z", descriptor = "()V")
	@Override
	public void method8854() {
		if (this.aCanvas5 == null) {
			this.anInt4996 = 1;
			this.anInt5020 = 1;
			this.anIntArray288 = null;
			this.anInt4994 = 1;
			this.anInt5004 = 1;
			this.aFloatArray45 = null;
		} else {
			this.anIntArray288 = this.aClass6_Sub27_1.anIntArray481;
			this.anInt4996 = this.aClass6_Sub27_1.anInt7917;
			this.anInt5020 = this.aClass6_Sub27_1.anInt7918;
			this.aFloatArray45 = this.aFloatArray46;
			this.anInt4994 = this.anInt5021;
			this.anInt5004 = this.anInt5012;
		}
		this.aClass162_1 = null;
		this.method4434();
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
	@Override
	public void method8805(@OriginalArg(0) int arg0) {
		this.aClass202Array1[arg0].method5515(Thread.currentThread());
	}

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "()Z")
	@Override
	public boolean method8811() {
		return false;
	}

	@OriginalMember(owner = "client!iw", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt5008, this.anInt5014, this.anInt4999, this.anInt5018 };
	}

	@OriginalMember(owner = "client!iw", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt5002 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!iw", name = "s", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method8838() {
		return new Class154_Sub1();
	}

	@OriginalMember(owner = "client!iw", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class202 local3 = this.method4430(Thread.currentThread());
		local3.aBoolean420 = arg0;
	}

	@OriginalMember(owner = "client!iw", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass154_Sub1_1.aFloat89 + this.aClass154_Sub1_1.aFloat82 * (float) arg0 + this.aClass154_Sub1_1.aFloat83 * (float) arg1 + this.aClass154_Sub1_1.aFloat87 * (float) arg2;
		if (local24 < (float) this.anInt5007 || local24 > (float) this.lb) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt4999 * (this.aClass154_Sub1_1.aFloat86 + this.aClass154_Sub1_1.aFloat85 * (float) arg0 + this.aClass154_Sub1_1.aFloat84 * (float) arg1 + this.aClass154_Sub1_1.aFloat92 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt5018 * (this.aClass154_Sub1_1.aFloat91 + this.aClass154_Sub1_1.aFloat93 * (float) arg0 + this.aClass154_Sub1_1.aFloat88 * (float) arg1 + this.aClass154_Sub1_1.aFloat90 * (float) arg2) / local24);
		if (local81 >= this.anInt4997 && local81 <= this.anInt5019 && local113 >= this.anInt5015 && local113 <= this.anInt4993) {
			arg3[0] = local81 - this.anInt4997;
			arg3[1] = local113 - this.anInt5015;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "()V")
	@Override
	public void method8776() {
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I[Lclient!raa;)V")
	@Override
	public void method8828(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1[] arg1) {
	}

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "()Z")
	@Override
	public boolean method8798() {
		return false;
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "()I")
	@Override
	public int method8780() {
		return 0;
	}

	@OriginalMember(owner = "client!iw", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!iw", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class202 local3 = this.method4430(Thread.currentThread());
		@Pc(6) Class151 local6 = local3.aClass151_1;
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
		@Pc(105) int local105 = arg0 - local6.method4175();
		@Pc(110) int local110 = arg1 - local6.method4172();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt4809 = 0;
		this.C(false);
		local6.aBoolean338 = local114 < 0 || local114 > local6.anInt4810 || local118 < 0 || local118 > local6.anInt4810 || local124 < 0 || local124 > local6.anInt4810;
		local6.method4173((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean338 = local114 < 0 || local114 > local6.anInt4810 || local124 < 0 || local124 > local6.anInt4810 || local130 < 0 || local130 > local6.anInt4810;
		local6.method4173((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "(II)I")
	@Override
	public int method8820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!iw", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5005 || arg1 >= this.anInt5006) {
			return;
		}
		if (arg0 < this.anInt4995) {
			arg2 -= this.anInt4995 - arg0;
			arg0 = this.anInt4995;
		}
		if (arg0 + arg2 > this.anInt5003) {
			arg2 = this.anInt5003 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt4996;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray288[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray288[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray288[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray288[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray288[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)Lclient!dk;")
	@Override
	public Interface5 method8796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class266(arg0, arg1);
	}

	@OriginalMember(owner = "client!iw", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt4995) {
			arg2 -= this.anInt4995 - arg0;
			arg0 = this.anInt4995;
		}
		if (arg1 < this.anInt5005) {
			arg3 -= this.anInt5005 - arg1;
			arg1 = this.anInt5005;
		}
		if (arg0 + arg2 > this.anInt5003) {
			arg2 = this.anInt5003 - arg0;
		}
		if (arg1 + arg3 > this.anInt5006) {
			arg3 = this.anInt5006 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5003 || arg1 > this.anInt5006) {
			return;
		}
		@Pc(67) int local67 = this.anInt4996 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt4996;
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
						local217 = this.anIntArray288[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray288[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray288[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray288[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray288[arg2] = arg4;
					arg2++;
					this.anIntArray288[arg2] = arg4;
					arg2++;
					this.anIntArray288[arg2] = arg4;
					arg2++;
					this.anIntArray288[arg2] = arg4;
					arg2++;
					this.anIntArray288[arg2] = arg4;
					arg2++;
					this.anIntArray288[arg2] = arg4;
					arg2++;
					this.anIntArray288[arg2] = arg4;
					arg2++;
					this.anIntArray288[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray288[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "(I)[I")
	public int[] method4423(@OriginalArg(0) int arg0) {
		@Pc(2) Class166 local2 = this.aClass166_26;
		@Pc(14) Class6_Sub50 local14;
		synchronized (this.aClass166_26) {
			local14 = (Class6_Sub50) this.aClass166_26.method4805((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface4_12.method892(arg0)) {
					return null;
				}
				@Pc(34) Class325 local34 = super.anInterface4_12.method895(arg0);
				@Pc(45) int local45 = local34.aBoolean633 || this.aBoolean351 ? 64 : this.anInt5017;
				local14 = new Class6_Sub50(arg0, local45, super.anInterface4_12.method897(arg0, 0.7F, local45, local45), local34.anInt9371 != 1);
				this.aClass166_26.method4803(local14, (long) arg0 | Long.MIN_VALUE);
			}
		}
		local14.aBoolean665 = true;
		return local14.method8178();
	}

	@OriginalMember(owner = "client!iw", name = "y", descriptor = "()Z")
	@Override
	public boolean method8853() {
		return false;
	}

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass154_Sub1_1.aFloat82 * (float) arg0 + this.aClass154_Sub1_1.aFloat83 * (float) arg1 + this.aClass154_Sub1_1.aFloat87 * (float) arg2 + this.aClass154_Sub1_1.aFloat89;
		@Pc(49) float local49 = this.aClass154_Sub1_1.aFloat82 * (float) arg3 + this.aClass154_Sub1_1.aFloat83 * (float) arg4 + this.aClass154_Sub1_1.aFloat87 * (float) arg5 + this.aClass154_Sub1_1.aFloat89;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt5007 && local49 < (float) this.anInt5007) {
			local51 |= 0x10;
		} else if (local24 > (float) this.lb && local49 > (float) this.lb) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt4999 * (this.aClass154_Sub1_1.aFloat85 * (float) arg0 + this.aClass154_Sub1_1.aFloat84 * (float) arg1 + this.aClass154_Sub1_1.aFloat92 * (float) arg2 + this.aClass154_Sub1_1.aFloat86) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt4999 * (this.aClass154_Sub1_1.aFloat85 * (float) arg3 + this.aClass154_Sub1_1.aFloat84 * (float) arg4 + this.aClass154_Sub1_1.aFloat92 * (float) arg5 + this.aClass154_Sub1_1.aFloat86) / (float) arg6);
		if (local117 < this.anInt4997 && local150 < this.anInt4997) {
			local51 |= 0x1;
		} else if (local117 > this.anInt5019 && local150 > this.anInt5019) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt5018 * (this.aClass154_Sub1_1.aFloat93 * (float) arg0 + this.aClass154_Sub1_1.aFloat88 * (float) arg1 + this.aClass154_Sub1_1.aFloat90 * (float) arg2 + this.aClass154_Sub1_1.aFloat91) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt5018 * (this.aClass154_Sub1_1.aFloat93 * (float) arg3 + this.aClass154_Sub1_1.aFloat88 * (float) arg4 + this.aClass154_Sub1_1.aFloat90 * (float) arg5 + this.aClass154_Sub1_1.aFloat91) / (float) arg6);
		if (local208 < this.anInt5015 && local241 < this.anInt5015) {
			local51 |= 0x4;
		} else if (local208 > this.anInt4993 && local241 > this.anInt4993) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method4424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface4_12.method895(arg6).aBoolean636) {
			this.method4426(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt5022 != arg6) {
			@Pc(26) Class32 local26 = (Class32) this.aClass166_27.method4805((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method4423(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method4433(arg6) ? 64 : this.anInt5017;
				local26 = this.method8847(local44, local44, local32, local44);
				this.aClass166_27.method4803(local26, (long) arg6);
			}
			this.anInt5022 = arg6;
			this.aClass32_10 = local26;
		}
		((Class32_Sub2) this.aClass32_10).method4260(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!iw", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt4996, this.anInt5020, arg0, 0);
	}

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "()Z")
	public boolean method4425() {
		return this.aBoolean349;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8792() {
		@Pc(3) Class202 local3 = this.method4430(Thread.currentThread());
		@Pc(6) Class151 local6 = local3.aClass151_1;
		local6.aBoolean337 = false;
		@Pc(14) int local14 = 5 - this.anInt4997;
		@Pc(19) int local19 = 75 - this.anInt4997;
		@Pc(24) int local24 = 15 - this.anInt4997;
		@Pc(29) int local29 = 10 - this.anInt5015;
		@Pc(34) int local34 = 50 - this.anInt5015;
		@Pc(39) int local39 = 90 - this.anInt5015;
		local6.aBoolean338 = local14 < 0 || local14 > local6.anInt4810 || local19 < 0 || local19 > local6.anInt4810 || local24 < 0 || local24 > local6.anInt4810;
		local6.anInt4809 = 0;
		local6.aBoolean339 = false;
		local6.method4176((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean337 = true;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8769(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub27 local8 = (Class6_Sub27) this.aClass128_14.method3560((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method9043();
		local8 = Static181.method3308(arg2, arg0, arg1);
		this.aClass128_14.method3551((long) arg0.hashCode(), local8);
		if (this.aCanvas5 != arg0 || this.aClass162_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt4992 = local37.width;
		this.anInt4991 = local37.height;
		this.aClass6_Sub27_1 = local8;
		this.anIntArray288 = local8.anIntArray481;
		this.anInt4996 = local8.anInt7917;
		this.anInt5020 = local8.anInt7918;
		if (this.anInt4996 != this.anInt4994 || this.anInt5020 != this.anInt5004) {
			this.anInt5021 = this.anInt4994 = this.anInt4996;
			this.anInt5012 = this.anInt5004 = this.anInt5020;
			this.aFloatArray46 = this.aFloatArray45 = new float[this.anInt4994 * this.anInt5004];
		}
		this.method4434();
	}

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "(IIIIII)V")
	private void method4426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt5005) {
			local8 = this.anInt5005;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt5006) {
			local21 = this.anInt5006;
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
				if (local91 < this.anInt4995) {
					local91 = this.anInt4995;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5003) {
					local102 = this.anInt5003;
				}
				local116 = local91 + local30 * this.anInt4996;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray45[local116]) {
						this.anIntArray288[local116] = arg4;
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
				if (local91 < this.anInt4995) {
					local91 = this.anInt4995;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5003 - 1) {
					local102 = this.anInt5003 - 1;
				}
				local116 = local91 + local30 * this.anInt4996;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray45[local116]) {
						this.anIntArray288[local116] = arg4;
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
				if (local102 < this.anInt4995) {
					local102 = this.anInt4995;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5003) {
					local116 = this.anInt5003;
				}
				local118 = local102 + local30 * this.anInt4996;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray45[local118]) {
						local364 = this.anIntArray288[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray288[local118] = local293 + local364;
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
				if (local102 < this.anInt4995) {
					local102 = this.anInt4995;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5003 - 1) {
					local116 = this.anInt5003 - 1;
				}
				local118 = local102 + local30 * this.anInt4996;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray45[local118]) {
						local364 = this.anIntArray288[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray288[local118] = local293 + local364;
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
				if (local91 < this.anInt4995) {
					local91 = this.anInt4995;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5003) {
					local102 = this.anInt5003;
				}
				local116 = local91 + local30 * this.anInt4996;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray45[local116]) {
						local350 = this.anIntArray288[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray288[local116] = local364 - local643 | local643 - (local643 >>> 8);
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
				if (local91 < this.anInt4995) {
					local91 = this.anInt4995;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5003 - 1) {
					local102 = this.anInt5003 - 1;
				}
				local116 = local91 + local30 * this.anInt4996;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray45[local116]) {
						local350 = this.anIntArray288[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray288[local116] = local364 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "()Z")
	@Override
	public boolean method8809() {
		return false;
	}

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "(II)I")
	@Override
	public int method8821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(II)V")
	@Override
	public void method8800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas5 == null || this.aClass6_Sub27_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			this.aClass6_Sub27_1.method6786(this.anInt4992, this.anInt4991, 0, arg1, local14, 0, arg0);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt4994 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt4994 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray45;
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

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(Z)V")
	@Override
	public void method8802(@OriginalArg(0) boolean arg0) {
		this.aBoolean351 = arg0;
		this.aClass166_26.method4811();
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!of;)V")
	@Override
	public void method8844(@OriginalArg(0) Class236 arg0) {
		@Pc(3) Class202 local3 = this.method4430(Thread.currentThread());
		@Pc(7) Class20_Sub6 local7 = arg0.aClass157_1.aClass20_Sub6_1;
		for (@Pc(10) Class20_Sub6 local10 = local7.aClass20_Sub6_9; local10 != local7; local10 = local10.aClass20_Sub6_9) {
			@Pc(14) Class20_Sub6_Sub1 local14 = (Class20_Sub6_Sub1) local10;
			@Pc(19) int local19 = local14.anInt8658 >> 12;
			@Pc(24) int local24 = local14.anInt8662 >> 12;
			@Pc(29) int local29 = local14.anInt8661 >> 12;
			@Pc(54) float local54 = this.aClass154_Sub1_1.aFloat89 + this.aClass154_Sub1_1.aFloat82 * (float) local19 + this.aClass154_Sub1_1.aFloat83 * (float) local24 + this.aClass154_Sub1_1.aFloat87 * (float) local29;
			if (!(local54 < (float) this.anInt5007) && !(local54 > (float) local3.anInt6401)) {
				@Pc(102) int local102 = this.anInt5008 + (int) ((float) this.anInt4999 * (this.aClass154_Sub1_1.aFloat86 + this.aClass154_Sub1_1.aFloat85 * (float) local19 + this.aClass154_Sub1_1.aFloat84 * (float) local24 + this.aClass154_Sub1_1.aFloat92 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt5014 + (int) ((float) this.anInt5018 * (this.aClass154_Sub1_1.aFloat91 + this.aClass154_Sub1_1.aFloat93 * (float) local19 + this.aClass154_Sub1_1.aFloat88 * (float) local24 + this.aClass154_Sub1_1.aFloat90 * (float) local29) / local54);
				if (local102 >= this.anInt4995 && local102 <= this.anInt5003 && local137 >= this.anInt5005 && local137 <= this.anInt5006) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method4421(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt8657 * this.anInt4999 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5005) {
			local8 = this.anInt5005;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5006) {
			local21 = this.anInt5006;
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
				if (local91 < this.anInt4995) {
					local91 = this.anInt4995;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5003) {
					local102 = this.anInt5003;
				}
				local116 = local91 + local30 * this.anInt4996;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray288[local116++] = arg3;
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
				if (local91 < this.anInt4995) {
					local91 = this.anInt4995;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5003 - 1) {
					local102 = this.anInt5003 - 1;
				}
				local116 = local91 + local30 * this.anInt4996;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray288[local116++] = arg3;
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
			if (local102 < this.anInt4995) {
				local102 = this.anInt4995;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5003) {
				local116 = this.anInt5003;
			}
			local118 = local102 + local30 * this.anInt4996;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray288[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray288[local118++] = local277 + local360;
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
			if (local102 < this.anInt4995) {
				local102 = this.anInt4995;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5003 - 1) {
				local116 = this.anInt5003 - 1;
			}
			local118 = local102 + local30 * this.anInt4996;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray288[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray288[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!iw", name = "l", descriptor = "(I)I")
	public int method4427(@OriginalArg(0) int arg0) {
		return super.anInterface4_12.method895(arg0).aShort111 & 0xFFFF;
	}

	@OriginalMember(owner = "client!iw", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt4995 || arg0 >= this.anInt5003) {
			return;
		}
		if (arg1 < this.anInt5005) {
			arg2 -= this.anInt5005 - arg1;
			arg1 = this.anInt5005;
		}
		if (arg1 + arg2 > this.anInt5006) {
			arg2 = this.anInt5006 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt4996;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray288[local40 + local54 * this.anInt4996] = arg3;
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
				local111 = local40 + local103 * this.anInt4996;
				local116 = this.anIntArray288[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray288[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt4996;
				local111 = this.anIntArray288[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray288[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method4431(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method4431(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
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
						if (arg0 >= this.anInt4995 && arg0 < this.anInt5003 && local267 >= this.anInt5005 && local267 < this.anInt5006 && arg7 < local143) {
							this.anIntArray288[arg0 + local267 * this.anInt4996] = arg4;
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
						if (arg0 >= this.anInt4995 && arg0 < this.anInt5003 && local349 >= this.anInt5005 && local349 < this.anInt5006 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt4996;
							local380 = this.anIntArray288[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray288[local375] = local340 + local380;
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
						if (arg1 >= this.anInt5005 && arg1 < this.anInt5006 && local267 >= this.anInt4995 && local267 < this.anInt5003 && arg7 < local143) {
							this.anIntArray288[local267 + arg1 * this.anInt4996] = arg4;
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
						if (arg1 >= this.anInt5005 && arg1 < this.anInt5006 && local349 >= this.anInt4995 && local349 < this.anInt5003 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt4996;
							local380 = this.anIntArray288[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray288[local349 + arg1 * this.anInt4996] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method4428(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method4428(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!iw", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class202 local3 = this.method4430(Thread.currentThread());
		local3.anInt6400 = arg0;
		local3.anInt6404 = arg1;
		local3.anInt6399 = arg2;
	}

	@OriginalMember(owner = "client!iw", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4995 < arg0) {
			this.anInt4995 = arg0;
		}
		if (this.anInt5005 < arg1) {
			this.anInt5005 = arg1;
		}
		if (this.anInt5003 > arg2) {
			this.anInt5003 = arg2;
		}
		if (this.anInt5006 > arg3) {
			this.anInt5006 = arg3;
		}
		this.method4432();
	}

	@OriginalMember(owner = "client!iw", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt4996 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt4994 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray288;
		@Pc(24) float[] local24 = this.aFloatArray45;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static655.method5830(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static655.method5830(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static655.method5832(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static655.method5832(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!iw", name = "A", descriptor = "()Z")
	@Override
	public boolean method8856() {
		return false;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIIII)V")
	private void method4428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt4995 || arg0 >= this.anInt5003) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt4996;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt5005 && arg1 + local37 < this.anInt5006 && local27 < arg4) {
					this.anIntArray288[local15 + local37 * this.anInt4996] = arg3;
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
			if (arg1 + local106 >= this.anInt5005 && arg1 + local106 < this.anInt5006 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt4996;
				@Pc(134) int local134 = this.anIntArray288[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray288[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!iw", name = "q", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method8830() {
		return this.aClass154_Sub1_1;
	}

	@OriginalMember(owner = "client!iw", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt4996) {
			arg2 = this.anInt4996;
		}
		if (arg3 > this.anInt5020) {
			arg3 = this.anInt5020;
		}
		this.anInt4995 = arg0;
		this.anInt5003 = arg2;
		this.anInt5005 = arg1;
		this.anInt5006 = arg3;
		this.method4432();
	}

	@OriginalMember(owner = "client!iw", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt4996;
		@Pc(35) int local35 = this.anInt4996 - arg2;
		if (arg1 + arg3 > this.anInt5006) {
			arg3 -= arg1 + arg3 - this.anInt5006;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5005) {
			local59 = this.anInt5005 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt4996;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5003) {
			local59 = arg0 + arg2 - this.anInt5003;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt4995) {
			local59 = this.anInt4995 - arg0;
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
						this.anIntArray288[local30++] = arg4;
					} else {
						this.anIntArray288[local30++] = arg5;
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
					local245 = this.anIntArray288[local30];
					this.anIntArray288[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray288[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray288[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method8850(@OriginalArg(0) Class154 arg0) {
		this.aClass154_Sub1_1 = (Class154_Sub1) arg0;
	}

	@OriginalMember(owner = "client!iw", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.lb;
	}

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "()Z")
	@Override
	public boolean method8784() {
		return false;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)V")
	@Override
	public void method8775(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!iw", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt4995 == 0 && this.anInt5003 == this.anInt4996 && this.anInt5005 == 0 && this.anInt5006 == this.anInt5020) {
			local19 = this.aFloatArray45.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray45[local27++] = 2.14748365E9F;
				this.aFloatArray45[local27++] = 2.14748365E9F;
				this.aFloatArray45[local27++] = 2.14748365E9F;
				this.aFloatArray45[local27++] = 2.14748365E9F;
				this.aFloatArray45[local27++] = 2.14748365E9F;
				this.aFloatArray45[local27++] = 2.14748365E9F;
				this.aFloatArray45[local27++] = 2.14748365E9F;
				this.aFloatArray45[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray45[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt5003 - this.anInt4995;
		local25 = this.anInt5006 - this.anInt5005;
		local27 = this.anInt4996 - local19;
		@Pc(116) int local116 = this.anInt4995 + this.anInt5005 * this.anInt4996;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray45[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray45[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray45[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray45[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray45[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray45[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray45[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray45[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray45[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!iw", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass202Array1.length; local1++) {
			@Pc(7) Class202 local7 = this.aClass202Array1[local1];
			local7.anInt6404 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt6404 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt6404 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt6404 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt6404 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean419 = false;
			} else {
				local7.aBoolean419 = true;
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8797(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub27 local8 = (Class6_Sub27) this.aClass128_14.method3560((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static181.method3308(arg2, arg0, arg1);
			this.aClass128_14.method3551((long) arg0.hashCode(), local8);
		} else if (local8.anInt7917 != arg1 || local8.anInt7918 != arg2) {
			this.method8769(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!iw", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt4996 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray288[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray218;
		@Pc(8) int[] local8 = local2.anIntArray219;
		@Pc(17) int local17 = this.anInt5005 > arg7 ? this.anInt5005 : arg7;
		@Pc(32) int local32 = this.anInt5006 < arg7 + local5.length ? this.anInt5006 : arg7 + local5.length;
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
					if (local129 >= this.anInt4995 && local129 < this.anInt5003 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray288[local129 + arg1 * this.anInt4996] = arg4;
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
					if (local133 >= this.anInt4995 && local133 < this.anInt5003 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt4996;
						local248 = this.anIntArray288[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray288[local133 + arg1 * this.anInt4996] = local201 + local584;
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
		if (arg0 < this.anInt4995) {
			arg1 += local83 * (this.anInt4995 - arg0);
			arg0 = this.anInt4995;
		}
		if (arg2 >= this.anInt5003) {
			arg2 = this.anInt5003 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray288[arg0 + local129 * this.anInt4996] = arg4;
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
					local243 = arg0 + local133 * this.anInt4996;
					local248 = this.anIntArray288[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray288[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!iw", name = "u", descriptor = "()Z")
	@Override
	public boolean method8848() {
		return true;
	}

	@OriginalMember(owner = "client!iw", name = "p", descriptor = "()V")
	@Override
	protected void method8826() {
		if (this.aBoolean350) {
			Static252.method4536(true, false);
			this.aBoolean350 = false;
		}
		this.aClass6_Sub27_1 = null;
		this.aCanvas5 = null;
		this.anInt4992 = 0;
		this.anInt4991 = 0;
		this.aClass128_14 = null;
		this.aBoolean349 = true;
	}

	@OriginalMember(owner = "client!iw", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray218;
		@Pc(8) int[] local8 = local2.anIntArray219;
		@Pc(20) int local20;
		if (this.anInt5006 < arg3 + local5.length) {
			local20 = this.anInt5006 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5005 > arg3) {
			local33 = this.anInt5005 - arg3;
			arg3 = this.anInt5005;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt4996;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt4995 > local58) {
				local62 -= this.anInt4995 - local58;
				local58 = this.anInt4995;
			}
			if (this.anInt5003 < local58 + local62) {
				local62 = this.anInt5003 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray288[local58++] = arg0;
			}
			local49 += this.anInt4996;
		}
	}

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "(I)Z")
	public boolean method4429(@OriginalArg(0) int arg0) {
		return super.anInterface4_12.method895(arg0).aBoolean637 || super.anInterface4_12.method895(arg0).aBoolean639;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIZ)Lclient!pga;")
	@Override
	public Class32 method8823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class32_Sub2_Sub3(this, arg0, arg1) : new Class32_Sub2_Sub2(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!iw", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass154_Sub1_1.aFloat89 + this.aClass154_Sub1_1.aFloat82 * (float) arg0 + this.aClass154_Sub1_1.aFloat83 * (float) arg1 + this.aClass154_Sub1_1.aFloat87 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt4999 * (this.aClass154_Sub1_1.aFloat86 + this.aClass154_Sub1_1.aFloat85 * (float) arg0 + this.aClass154_Sub1_1.aFloat84 * (float) arg1 + this.aClass154_Sub1_1.aFloat92 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt5018 * (this.aClass154_Sub1_1.aFloat91 + this.aClass154_Sub1_1.aFloat93 * (float) arg0 + this.aClass154_Sub1_1.aFloat88 * (float) arg1 + this.aClass154_Sub1_1.aFloat90 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt4997;
		arg3[1] = local105 - this.anInt5015;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!iw", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass202Array1.length; local1++) {
			this.aClass202Array1[local1].anInt6404 = this.aClass202Array1[local1].anInt6397;
			this.aClass202Array1[local1].aBoolean418 = false;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "([IIIIIZ)Lclient!pga;")
	@Override
	public Class32 method8777(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class32_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class32_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class32_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class32_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!om;Lclient!om;FLclient!om;)Lclient!om;")
	@Override
	public Class57 method8827(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!md;")
	public Class202 method4430(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5013; local1++) {
			if (this.aClass202Array1[local1].aRunnable2 == arg0) {
				return this.aClass202Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "(I)V")
	@Override
	public void method8824(@OriginalArg(0) int arg0) {
		this.anInt5017 = arg0;
		this.aClass166_26.method4811();
	}

	@OriginalMember(owner = "client!iw", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass154_Sub1_1.aFloat82 * (float) arg0 + this.aClass154_Sub1_1.aFloat83 * (float) arg1 + this.aClass154_Sub1_1.aFloat87 * (float) arg2 + this.aClass154_Sub1_1.aFloat89;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass154_Sub1_1.aFloat82 * (float) arg3 + this.aClass154_Sub1_1.aFloat83 * (float) arg4 + this.aClass154_Sub1_1.aFloat87 * (float) arg5 + this.aClass154_Sub1_1.aFloat89;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt5007 && local57 < (float) this.anInt5007) {
			local1 |= 0x10;
		} else if (local26 > (float) this.lb && local57 > (float) this.lb) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt4999 * (this.aClass154_Sub1_1.aFloat85 * (float) arg0 + this.aClass154_Sub1_1.aFloat84 * (float) arg1 + this.aClass154_Sub1_1.aFloat92 * (float) arg2 + this.aClass154_Sub1_1.aFloat86) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt4999 * (this.aClass154_Sub1_1.aFloat85 * (float) arg3 + this.aClass154_Sub1_1.aFloat84 * (float) arg4 + this.aClass154_Sub1_1.aFloat92 * (float) arg5 + this.aClass154_Sub1_1.aFloat86) / local57);
		if (local128 < this.anInt4997 && local160 < this.anInt4997) {
			local1 |= 0x1;
		} else if (local128 > this.anInt5019 && local160 > this.anInt5019) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt5018 * (this.aClass154_Sub1_1.aFloat93 * (float) arg0 + this.aClass154_Sub1_1.aFloat88 * (float) arg1 + this.aClass154_Sub1_1.aFloat90 * (float) arg2 + this.aClass154_Sub1_1.aFloat91) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt5018 * (this.aClass154_Sub1_1.aFloat93 * (float) arg3 + this.aClass154_Sub1_1.aFloat88 * (float) arg4 + this.aClass154_Sub1_1.aFloat90 * (float) arg5 + this.aClass154_Sub1_1.aFloat91) / local57);
		if (local217 < this.anInt5015 && local249 < this.anInt5015) {
			local1 |= 0x4;
		} else if (local217 > this.anInt4993 && local249 > this.anInt4993) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!iw", name = "w", descriptor = "()V")
	@Override
	public void method8851() {
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "()Lclient!kaa;")
	@Override
	public Class168 method8779() {
		return new Class168(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIF)Lclient!raa;")
	@Override
	public Class6_Sub1 method8786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!iw", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass154_Sub1_1.aFloat89 + this.aClass154_Sub1_1.aFloat82 * (float) arg0 + this.aClass154_Sub1_1.aFloat83 * (float) arg1 + this.aClass154_Sub1_1.aFloat87 * (float) arg2;
		if (local24 < (float) this.anInt5007 || local24 > (float) this.lb) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt4999 * (this.aClass154_Sub1_1.aFloat86 + this.aClass154_Sub1_1.aFloat85 * (float) arg0 + this.aClass154_Sub1_1.aFloat84 * (float) arg1 + this.aClass154_Sub1_1.aFloat92 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt5018 * (this.aClass154_Sub1_1.aFloat91 + this.aClass154_Sub1_1.aFloat93 * (float) arg0 + this.aClass154_Sub1_1.aFloat88 * (float) arg1 + this.aClass154_Sub1_1.aFloat90 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt4997 && local82 <= this.anInt5019 && local115 >= this.anInt5015 && local115 <= this.anInt4993) {
			arg4[0] = local82 - this.anInt4997;
			arg4[1] = local115 - this.anInt5015;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!iw", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt4995 = 0;
		this.anInt5005 = 0;
		this.anInt5003 = this.anInt4996;
		this.anInt5006 = this.anInt5020;
		this.method4432();
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(IIIIIIII)V")
	private void method4431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt5005 || arg1 >= this.anInt5006) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt4996;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt4995 && arg0 + local37 < this.anInt5003 && local27 < arg4) {
					this.anIntArray288[local15 + local37] = arg3;
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
			if (arg0 + local103 >= this.anInt4995 && arg0 + local103 < this.anInt5003 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray288[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray288[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!hia;[Lclient!fg;Z)Lclient!da;")
	@Override
	public Class50 method8808(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class98[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2796;
			local7[local11] = arg1[local11].anInt2799;
			if (arg1[local11].aByteArray44 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class50_Sub5(this, arg0, arg1, local3, local7);
		} else {
			return new Class50_Sub4(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V")
	@Override
	public void method8803() {
		Static445.anInt8000 = 10000;
		Static445.anInt8005 = 10000;
		if (this.anInt5013 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method8817(this.anInt5013);
		this.method8805(0);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "([I)V")
	@Override
	public void method8812(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4996;
		arg0[1] = this.anInt5020;
	}

	@OriginalMember(owner = "client!iw", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt5009;
		this.anInt5009 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "()V")
	@Override
	public void method8806() {
	}

	@OriginalMember(owner = "client!iw", name = "x", descriptor = "()V")
	@Override
	public void method8852() {
	}

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "(I)V")
	@Override
	public void method8817(@OriginalArg(0) int arg0) {
		this.anInt5013 = arg0;
		this.aClass202Array1 = new Class202[this.anInt5013];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5013; local9++) {
			this.aClass202Array1[local9] = new Class202(this);
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8787(@OriginalArg(0) Class6_Sub8 arg0) {
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!dh;IIII)Lclient!ka;")
	@Override
	public Class24 method8770(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class24_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class199 method8810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class199_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class202 local3 = this.method4430(Thread.currentThread());
		this.anInt5007 = arg0;
		this.lb = arg1;
		local3.anInt6401 = this.lb - 255;
	}

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "(IIIIII)Lclient!om;")
	@Override
	public Class57 method8829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(II)Lclient!bi;")
	@Override
	public Interface2 method8807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method8823(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!iw", name = "B", descriptor = "()V")
	private void method4432() {
		this.anInt4997 = this.anInt4995 - this.anInt5008;
		this.anInt5019 = this.anInt5003 - this.anInt5008;
		this.anInt5015 = this.anInt5005 - this.anInt5014;
		this.anInt4993 = this.anInt5006 - this.anInt5014;
		for (@Pc(29) int local29 = 0; local29 < this.anInt5013; local29++) {
			@Pc(36) Class151 local36 = this.aClass202Array1[local29].aClass151_1;
			local36.anInt4806 = this.anInt5008 - this.anInt4995;
			local36.anInt4807 = this.anInt5014 - this.anInt5005;
			local36.anInt4810 = this.anInt5003 - this.anInt4995;
			local36.anInt4811 = this.anInt5006 - this.anInt5005;
		}
		@Pc(78) int local78 = this.anInt5005 * this.anInt4996 + this.anInt4995;
		for (@Pc(81) int local81 = this.anInt5005; local81 < this.anInt5006; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt5013; local84++) {
				this.aClass202Array1[local84].aClass151_1.anIntArray271[local81 - this.anInt5005] = local78;
			}
			local78 += this.anInt4996;
		}
	}

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "(I)Z")
	public boolean method4433(@OriginalArg(0) int arg0) {
		return this.aBoolean351 || super.anInterface4_12.method895(arg0).aBoolean633;
	}

	@OriginalMember(owner = "client!iw", name = "C", descriptor = "()V")
	private void method4434() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5013; local1++) {
			this.aClass202Array1[local1].method5516();
		}
		this.la();
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!pk;)V")
	@Override
	public void method8794(@OriginalArg(0) Interface20 arg0) {
		@Pc(2) Class162 local2 = (Class162) arg0;
		this.anInt4996 = local2.anInt5204;
		this.anInt5020 = local2.anInt5207;
		this.anIntArray288 = local2.anIntArray301;
		this.aClass162_1 = local2;
		this.anInt4994 = local2.anInt5204;
		this.anInt5004 = local2.anInt5207;
		this.aFloatArray45 = local2.aFloatArray47;
		this.method4434();
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt4995) {
					arg1 += local104 * (this.anInt4995 - arg0);
					arg0 = this.anInt4995;
				}
				if (arg2 >= this.anInt5003) {
					arg2 = this.anInt5003 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5005 && local150 < this.anInt5006) {
							this.anIntArray288[arg0 + local150 * this.anInt4996] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5005 && local213 < this.anInt5006) {
							local228 = arg0 + local213 * this.anInt4996;
							local233 = this.anIntArray288[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray288[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5005 && local150 < this.anInt5006) {
							local213 = arg0 + local150 * this.anInt4996;
							local228 = this.anIntArray288[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray288[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt5005) {
					arg0 += local104 * (this.anInt5005 - arg1);
					arg1 = this.anInt5005;
				}
				if (arg3 >= this.anInt5006) {
					arg3 = this.anInt5006 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt4995 && local150 < this.anInt5003) {
							this.anIntArray288[local150 + arg1 * this.anInt4996] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt4995 && local213 < this.anInt5003) {
							local228 = local213 + arg1 * this.anInt4996;
							local233 = this.anIntArray288[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray288[local213 + arg1 * this.anInt4996] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt4995 && local150 < this.anInt5003) {
							local213 = local150 + arg1 * this.anInt4996;
							local228 = this.anIntArray288[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray288[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public Class6_Sub8 method8841(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!iw", name = "t", descriptor = "()Z")
	@Override
	public boolean method8840() {
		return false;
	}

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "()Z")
	@Override
	public boolean method8795() {
		return false;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray218;
		@Pc(8) int[] local8 = local2.anIntArray219;
		@Pc(17) int local17 = this.anInt5005 > arg7 ? this.anInt5005 : arg7;
		@Pc(32) int local32 = this.anInt5006 < arg7 + local5.length ? this.anInt5006 : arg7 + local5.length;
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
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt4995 && local172 < this.anInt5003 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray288[local172 + arg1 * this.anInt4996] = arg4;
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
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt4995 && local176 < this.anInt5003 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt4996;
						local316 = this.anIntArray288[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray288[local176 + arg1 * this.anInt4996] = local263 + local707;
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
				if (arg0 >= this.anInt4995 && arg0 < this.anInt5003 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray288[arg0 + local172 * this.anInt4996] = arg4;
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
			if (arg0 >= this.anInt4995 && arg0 < this.anInt5003 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt4996;
					@Pc(321) int local321 = this.anIntArray288[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray288[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "()Z")
	@Override
	public boolean method8816() {
		return true;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!of;I)V")
	@Override
	public void method8831(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class202 local3 = this.method4430(Thread.currentThread());
		@Pc(7) Class20_Sub6 local7 = arg0.aClass157_1.aClass20_Sub6_1;
		for (@Pc(10) Class20_Sub6 local10 = local7.aClass20_Sub6_9; local10 != local7; local10 = local10.aClass20_Sub6_9) {
			@Pc(14) Class20_Sub6_Sub1 local14 = (Class20_Sub6_Sub1) local10;
			@Pc(19) int local19 = local14.anInt8658 >> 12;
			@Pc(24) int local24 = local14.anInt8662 >> 12;
			@Pc(29) int local29 = local14.anInt8661 >> 12;
			@Pc(54) float local54 = this.aClass154_Sub1_1.aFloat89 + this.aClass154_Sub1_1.aFloat82 * (float) local19 + this.aClass154_Sub1_1.aFloat83 * (float) local24 + this.aClass154_Sub1_1.aFloat87 * (float) local29;
			if (!(local54 < (float) this.anInt5007) && !(local54 > (float) local3.anInt6401)) {
				@Pc(103) int local103 = this.anInt5008 + (int) ((float) this.anInt4999 * (this.aClass154_Sub1_1.aFloat86 + this.aClass154_Sub1_1.aFloat85 * (float) local19 + this.aClass154_Sub1_1.aFloat84 * (float) local24 + this.aClass154_Sub1_1.aFloat92 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt5014 + (int) ((float) this.anInt5018 * (this.aClass154_Sub1_1.aFloat91 + this.aClass154_Sub1_1.aFloat93 * (float) local19 + this.aClass154_Sub1_1.aFloat88 * (float) local24 + this.aClass154_Sub1_1.aFloat90 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt4995 && local103 <= this.anInt5003 && local139 >= this.anInt5005 && local139 <= this.anInt5006) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method4421(local14, local103, local139, (int) local54, (local14.anInt8657 * this.anInt4999 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "o", descriptor = "(I)I")
	public int method4435(@OriginalArg(0) int arg0) {
		return super.anInterface4_12.method895(arg0).anInt9371;
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8834(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas5 == arg0) {
			this.method8788((Canvas) null);
		}
		@Pc(15) Class6_Sub27 local15 = (Class6_Sub27) this.aClass128_14.method3560((long) arg0.hashCode());
		if (local15 != null) {
			local15.method9043();
		}
	}

	@OriginalMember(owner = "client!iw", name = "o", descriptor = "()Z")
	@Override
	public boolean method8825() {
		return true;
	}

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "(I)V")
	@Override
	public void method8813(@OriginalArg(0) int arg0) {
		this.aClass202Array1[arg0].method5515((Runnable) null);
	}
}
