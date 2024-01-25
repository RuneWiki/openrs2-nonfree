import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "Lclient!hf;")
	public Class3_Sub23 aClass3_Sub23_1;

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "Z")
	private boolean aBoolean711;

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "I")
	private int anInt9611;

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
	private int anInt9612;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas13;

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "Z")
	private boolean aBoolean712;

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
	private int anInt9613;

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "Lclient!cja;")
	private Class62 aClass62_48;

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
	private int anInt9614;

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
	public int anInt9615;

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
	public int anInt9616;

	@OriginalMember(owner = "client!ut", name = "G", descriptor = "I")
	public int anInt9617;

	@OriginalMember(owner = "client!ut", name = "H", descriptor = "I")
	public int anInt9618;

	@OriginalMember(owner = "client!ut", name = "I", descriptor = "Lclient!pja;")
	private final Class279 aClass279_56;

	@OriginalMember(owner = "client!ut", name = "J", descriptor = "Lclient!bca;")
	public Class25_Sub2 aClass25_Sub2_3;

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
	private int anInt9619;

	@OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
	private int anInt9620;

	@OriginalMember(owner = "client!ut", name = "M", descriptor = "I")
	public int anInt9621;

	@OriginalMember(owner = "client!ut", name = "N", descriptor = "I")
	public int anInt9622;

	@OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
	public int anInt9623;

	@OriginalMember(owner = "client!ut", name = "P", descriptor = "[F")
	public float[] aFloatArray79;

	@OriginalMember(owner = "client!ut", name = "Q", descriptor = "Lclient!wr;")
	private Class394 aClass394_1;

	@OriginalMember(owner = "client!ut", name = "R", descriptor = "I")
	public int anInt9624;

	@OriginalMember(owner = "client!ut", name = "S", descriptor = "I")
	public int anInt9625;

	@OriginalMember(owner = "client!ut", name = "T", descriptor = "I")
	public int anInt9626;

	@OriginalMember(owner = "client!ut", name = "U", descriptor = "Z")
	private boolean aBoolean713;

	@OriginalMember(owner = "client!ut", name = "V", descriptor = "I")
	private int anInt9627;

	@OriginalMember(owner = "client!ut", name = "W", descriptor = "I")
	public int anInt9628;

	@OriginalMember(owner = "client!ut", name = "X", descriptor = "I")
	public int anInt9629;

	@OriginalMember(owner = "client!ut", name = "Y", descriptor = "I")
	public int anInt9630;

	@OriginalMember(owner = "client!ut", name = "Z", descriptor = "I")
	public int anInt9631;

	@OriginalMember(owner = "client!ut", name = "ab", descriptor = "[I")
	public int[] anIntArray628;

	@OriginalMember(owner = "client!ut", name = "bb", descriptor = "I")
	public int anInt9632;

	@OriginalMember(owner = "client!ut", name = "cb", descriptor = "I")
	public int anInt9633;

	@OriginalMember(owner = "client!ut", name = "db", descriptor = "I")
	public int anInt9634;

	@OriginalMember(owner = "client!ut", name = "eb", descriptor = "I")
	public int anInt9635;

	@OriginalMember(owner = "client!ut", name = "fb", descriptor = "I")
	private int anInt9636;

	@OriginalMember(owner = "client!ut", name = "gb", descriptor = "I")
	private int anInt9637;

	@OriginalMember(owner = "client!ut", name = "hb", descriptor = "I")
	public int anInt9638;

	@OriginalMember(owner = "client!ut", name = "ib", descriptor = "I")
	public int anInt9639;

	@OriginalMember(owner = "client!ut", name = "jb", descriptor = "Lclient!pja;")
	private final Class279 aClass279_57;

	@OriginalMember(owner = "client!ut", name = "kb", descriptor = "[F")
	public float[] aFloatArray80;

	@OriginalMember(owner = "client!ut", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!ut", name = "mb", descriptor = "I")
	public int anInt9640;

	@OriginalMember(owner = "client!ut", name = "nb", descriptor = "[Lclient!cc;")
	private Class52[] aClass52Array1;

	@OriginalMember(owner = "client!ut", name = "ob", descriptor = "I")
	public int anInt9641;

	@OriginalMember(owner = "client!ut", name = "pb", descriptor = "I")
	private int anInt9642;

	@OriginalMember(owner = "client!ut", name = "qb", descriptor = "Lclient!nf;")
	private Class102 aClass102_37;

	@OriginalMember(owner = "client!ut", name = "rb", descriptor = "I")
	private int anInt9643;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class16_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method8184(arg0, arg2, arg3);
			this.method8173(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method8199();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class16_Sub3(@OriginalArg(0) Interface5 arg0) {
		super(arg0);
		this.aBoolean711 = false;
		this.aBoolean712 = false;
		this.aClass62_48 = new Class62(4);
		this.anInt9622 = 3500;
		this.anInt9626 = 78642;
		this.aBoolean713 = false;
		this.anInt9624 = 512;
		this.anInt9623 = 0;
		this.anInt9633 = 50;
		this.anInt9625 = 45823;
		this.anInt9632 = 0;
		this.anInt9639 = 0;
		this.anInt9619 = 0;
		this.anInt9636 = 0;
		this.anInt9628 = 128;
		this.anInt9634 = 0;
		this.anInt9617 = 512;
		this.anInt9640 = 75518;
		this.aClass279_56 = new Class279(16);
		this.anInt9643 = -1;
		try {
			this.aClass279_57 = new Class279(256);
			this.aClass25_Sub2_3 = new Class25_Sub2();
			this.method8183(1);
			this.method8165(0);
			Static69.method1566(true, true);
			this.aBoolean712 = true;
			this.anInt9613 = (int) Static131.method2268();
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method8199();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ut", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass52Array1.length; local1++) {
			@Pc(7) Class52 local7 = this.aClass52Array1[local1];
			local7.anInt1583 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt1583 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt1583 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt1583 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt1583 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean141 = false;
			} else {
				local7.aBoolean141 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(Z)V")
	@Override
	public void method8139(@OriginalArg(0) boolean arg0) {
		this.aBoolean713 = arg0;
		this.aClass279_57.method6638();
	}

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "(I)V")
	@Override
	public void method8126() {
		Static484.anInt8200 = 10000;
		Static484.anInt8206 = 10000;
		if (this.anInt9629 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method8183(this.anInt9629);
		this.method8165(0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8134(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ut", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt9638 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray628[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "()Z")
	@Override
	public boolean method8200() {
		return false;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!mf;I)V")
	@Override
	public void method8115(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class52 local3 = this.method8210(Thread.currentThread());
		@Pc(7) Class23_Sub1 local7 = arg0.aClass125_1.aClass23_Sub1_5;
		for (@Pc(10) Class23_Sub1 local10 = local7.aClass23_Sub1_9; local10 != local7; local10 = local10.aClass23_Sub1_9) {
			@Pc(14) Class23_Sub1_Sub2 local14 = (Class23_Sub1_Sub2) local10;
			@Pc(19) int local19 = local14.anInt7855 >> 12;
			@Pc(24) int local24 = local14.anInt7853 >> 12;
			@Pc(29) int local29 = local14.anInt7850 >> 12;
			@Pc(54) float local54 = this.aClass25_Sub2_3.aFloat49 + this.aClass25_Sub2_3.aFloat54 * (float) local19 + this.aClass25_Sub2_3.aFloat50 * (float) local24 + this.aClass25_Sub2_3.aFloat59 * (float) local29;
			if (!(local54 < (float) this.anInt9633) && !(local54 > (float) local3.anInt1587)) {
				@Pc(103) int local103 = this.anInt9635 + (int) ((float) this.anInt9624 * (this.aClass25_Sub2_3.aFloat52 + this.aClass25_Sub2_3.aFloat60 * (float) local19 + this.aClass25_Sub2_3.aFloat57 * (float) local24 + this.aClass25_Sub2_3.aFloat53 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt9631 + (int) ((float) this.anInt9617 * (this.aClass25_Sub2_3.aFloat58 + this.aClass25_Sub2_3.aFloat56 * (float) local19 + this.aClass25_Sub2_3.aFloat55 * (float) local24 + this.aClass25_Sub2_3.aFloat51 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt9634 && local103 <= this.anInt9623 && local139 >= this.anInt9632 && local139 <= this.anInt9639) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method8214(local14, local103, local139, (int) local54, (local14.anInt7857 * this.anInt9624 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8116(@OriginalArg(0) Class3_Sub14 arg0) {
	}

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray141;
		@Pc(8) int[] local8 = local2.anIntArray142;
		@Pc(20) int local20;
		if (this.anInt9639 < arg3 + local5.length) {
			local20 = this.anInt9639 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt9632 > arg3) {
			local33 = this.anInt9632 - arg3;
			arg3 = this.anInt9632;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt9638;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt9634 > local58) {
				local62 -= this.anInt9634 - local58;
				local58 = this.anInt9634;
			}
			if (this.anInt9623 < local58 + local62) {
				local62 = this.anInt9623 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray628[local58++] = arg0;
			}
			local49 += this.anInt9638;
		}
	}

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "()Z")
	@Override
	public boolean method8197() {
		return true;
	}

	@OriginalMember(owner = "client!ut", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9635 = arg0;
		this.anInt9631 = arg1;
		this.anInt9624 = arg2;
		this.anInt9617 = arg3;
		this.method8207();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!mf;)V")
	@Override
	public void method8119(@OriginalArg(0) Class237 arg0) {
		@Pc(3) Class52 local3 = this.method8210(Thread.currentThread());
		@Pc(7) Class23_Sub1 local7 = arg0.aClass125_1.aClass23_Sub1_5;
		for (@Pc(10) Class23_Sub1 local10 = local7.aClass23_Sub1_9; local10 != local7; local10 = local10.aClass23_Sub1_9) {
			@Pc(14) Class23_Sub1_Sub2 local14 = (Class23_Sub1_Sub2) local10;
			@Pc(19) int local19 = local14.anInt7855 >> 12;
			@Pc(24) int local24 = local14.anInt7853 >> 12;
			@Pc(29) int local29 = local14.anInt7850 >> 12;
			@Pc(54) float local54 = this.aClass25_Sub2_3.aFloat49 + this.aClass25_Sub2_3.aFloat54 * (float) local19 + this.aClass25_Sub2_3.aFloat50 * (float) local24 + this.aClass25_Sub2_3.aFloat59 * (float) local29;
			if (!(local54 < (float) this.anInt9633) && !(local54 > (float) local3.anInt1587)) {
				@Pc(102) int local102 = this.anInt9635 + (int) ((float) this.anInt9624 * (this.aClass25_Sub2_3.aFloat52 + this.aClass25_Sub2_3.aFloat60 * (float) local19 + this.aClass25_Sub2_3.aFloat57 * (float) local24 + this.aClass25_Sub2_3.aFloat53 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt9631 + (int) ((float) this.anInt9617 * (this.aClass25_Sub2_3.aFloat58 + this.aClass25_Sub2_3.aFloat56 * (float) local19 + this.aClass25_Sub2_3.aFloat55 * (float) local24 + this.aClass25_Sub2_3.aFloat51 * (float) local29) / local54);
				if (local102 >= this.anInt9634 && local102 <= this.anInt9623 && local137 >= this.anInt9632 && local137 <= this.anInt9639) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method8214(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt7857 * this.anInt9624 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!en;Lclient!en;FLclient!en;)Lclient!en;")
	@Override
	public Class106 method8158(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class106 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt9638 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt9620 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray628;
		@Pc(24) float[] local24 = this.aFloatArray79;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static689.method8054(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static689.method8054(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static689.method8057(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static689.method8057(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!ut", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt9632) {
			local8 = this.anInt9632;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt9639) {
			local21 = this.anInt9639;
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
				if (local91 < this.anInt9634) {
					local91 = this.anInt9634;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9623) {
					local102 = this.anInt9623;
				}
				local116 = local91 + local30 * this.anInt9638;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray628[local116++] = arg3;
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
				if (local91 < this.anInt9634) {
					local91 = this.anInt9634;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9623 - 1) {
					local102 = this.anInt9623 - 1;
				}
				local116 = local91 + local30 * this.anInt9638;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray628[local116++] = arg3;
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
			if (local102 < this.anInt9634) {
				local102 = this.anInt9634;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt9623) {
				local116 = this.anInt9623;
			}
			local118 = local102 + local30 * this.anInt9638;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray628[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray628[local118++] = local277 + local360;
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
			if (local102 < this.anInt9634) {
				local102 = this.anInt9634;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt9623 - 1) {
				local116 = this.anInt9623 - 1;
			}
			local118 = local102 + local30 * this.anInt9638;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray628[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray628[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "()Z")
	@Override
	public boolean method8179() {
		return true;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8174(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas13 == null || this.aClass3_Sub23_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas13.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt9638 && local21.y + arg3 <= this.anInt9627 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass3_Sub23_1.method6869(local21.width, local14, local21.y + arg3, local21.x + arg2, local21.y, local21.x, local21.height);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method8202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface5_12.method5193(arg6).aBoolean693) {
			this.method8215(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt9643 != arg6) {
			@Pc(26) Class102 local26 = (Class102) this.aClass279_56.method6631((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method8212(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method8213(arg6) ? 64 : this.anInt9628;
				local26 = this.method8131(local44, local32, local44, local44);
				this.aClass279_56.method6635(local26, (long) arg6);
			}
			this.anInt9643 = arg6;
			this.aClass102_37 = local26;
		}
		((Class102_Sub1) this.aClass102_37).method6975(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!ut", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt9638;
		@Pc(35) int local35 = this.anInt9638 - arg2;
		if (arg1 + arg3 > this.anInt9639) {
			arg3 -= arg1 + arg3 - this.anInt9639;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt9632) {
			local59 = this.anInt9632 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt9638;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt9623) {
			local59 = arg0 + arg2 - this.anInt9623;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt9634) {
			local59 = this.anInt9634 - arg0;
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
						this.anIntArray628[local30++] = arg4;
					} else {
						this.anIntArray628[local30++] = arg5;
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
					local245 = this.anIntArray628[local30];
					this.anIntArray628[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray628[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray628[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class52 local3 = this.method8210(Thread.currentThread());
		@Pc(6) Class199 local6 = local3.aClass199_1;
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
		@Pc(105) int local105 = arg0 - local6.method4551();
		@Pc(110) int local110 = arg1 - local6.method4548();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt5362 = 0;
		this.C(false);
		local6.aBoolean416 = local114 < 0 || local114 > local6.anInt5365 || local118 < 0 || local118 > local6.anInt5365 || local124 < 0 || local124 > local6.anInt5365;
		local6.method4555((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean416 = local114 < 0 || local114 > local6.anInt5365 || local124 < 0 || local124 > local6.anInt5365 || local130 < 0 || local130 > local6.anInt5365;
		local6.method4555((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!ut", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass25_Sub2_3.aFloat54 * (float) arg0 + this.aClass25_Sub2_3.aFloat50 * (float) arg1 + this.aClass25_Sub2_3.aFloat59 * (float) arg2 + this.aClass25_Sub2_3.aFloat49;
		@Pc(49) float local49 = this.aClass25_Sub2_3.aFloat54 * (float) arg3 + this.aClass25_Sub2_3.aFloat50 * (float) arg4 + this.aClass25_Sub2_3.aFloat59 * (float) arg5 + this.aClass25_Sub2_3.aFloat49;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt9633 && local49 < (float) this.anInt9633) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt9622 && local49 > (float) this.anInt9622) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt9624 * (this.aClass25_Sub2_3.aFloat60 * (float) arg0 + this.aClass25_Sub2_3.aFloat57 * (float) arg1 + this.aClass25_Sub2_3.aFloat53 * (float) arg2 + this.aClass25_Sub2_3.aFloat52) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt9624 * (this.aClass25_Sub2_3.aFloat60 * (float) arg3 + this.aClass25_Sub2_3.aFloat57 * (float) arg4 + this.aClass25_Sub2_3.aFloat53 * (float) arg5 + this.aClass25_Sub2_3.aFloat52) / (float) arg6);
		if (local117 < this.anInt9641 && local150 < this.anInt9641) {
			local51 |= 0x1;
		} else if (local117 > this.anInt9616 && local150 > this.anInt9616) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt9617 * (this.aClass25_Sub2_3.aFloat56 * (float) arg0 + this.aClass25_Sub2_3.aFloat55 * (float) arg1 + this.aClass25_Sub2_3.aFloat51 * (float) arg2 + this.aClass25_Sub2_3.aFloat58) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt9617 * (this.aClass25_Sub2_3.aFloat56 * (float) arg3 + this.aClass25_Sub2_3.aFloat55 * (float) arg4 + this.aClass25_Sub2_3.aFloat51 * (float) arg5 + this.aClass25_Sub2_3.aFloat58) / (float) arg6);
		if (local208 < this.anInt9630 && local241 < this.anInt9630) {
			local51 |= 0x4;
		} else if (local208 > this.anInt9618 && local241 > this.anInt9618) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "(I)V")
	@Override
	public void method8183(@OriginalArg(0) int arg0) {
		this.anInt9629 = arg0;
		this.aClass52Array1 = new Class52[this.anInt9629];
		for (@Pc(9) int local9 = 0; local9 < this.anInt9629; local9++) {
			this.aClass52Array1[local9] = new Class52(this);
		}
	}

	@OriginalMember(owner = "client!ut", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass25_Sub2_3.aFloat49 + this.aClass25_Sub2_3.aFloat54 * (float) arg0 + this.aClass25_Sub2_3.aFloat50 * (float) arg1 + this.aClass25_Sub2_3.aFloat59 * (float) arg2;
		if (local24 < (float) this.anInt9633 || local24 > (float) this.anInt9622) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt9624 * (this.aClass25_Sub2_3.aFloat52 + this.aClass25_Sub2_3.aFloat60 * (float) arg0 + this.aClass25_Sub2_3.aFloat57 * (float) arg1 + this.aClass25_Sub2_3.aFloat53 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt9617 * (this.aClass25_Sub2_3.aFloat58 + this.aClass25_Sub2_3.aFloat56 * (float) arg0 + this.aClass25_Sub2_3.aFloat55 * (float) arg1 + this.aClass25_Sub2_3.aFloat51 * (float) arg2) / local24);
		if (local81 >= this.anInt9641 && local81 <= this.anInt9616 && local113 >= this.anInt9630 && local113 <= this.anInt9618) {
			arg3[0] = local81 - this.anInt9641;
			arg3[1] = local113 - this.anInt9630;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ut", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt9634 == 0 && this.anInt9623 == this.anInt9638 && this.anInt9632 == 0 && this.anInt9639 == this.anInt9627) {
			local19 = this.aFloatArray79.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray79[local27++] = 2.14748365E9F;
				this.aFloatArray79[local27++] = 2.14748365E9F;
				this.aFloatArray79[local27++] = 2.14748365E9F;
				this.aFloatArray79[local27++] = 2.14748365E9F;
				this.aFloatArray79[local27++] = 2.14748365E9F;
				this.aFloatArray79[local27++] = 2.14748365E9F;
				this.aFloatArray79[local27++] = 2.14748365E9F;
				this.aFloatArray79[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray79[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt9623 - this.anInt9634;
		local25 = this.anInt9639 - this.anInt9632;
		local27 = this.anInt9638 - local19;
		@Pc(116) int local116 = this.anInt9634 + this.anInt9632 * this.anInt9638;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray79[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray79[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray79[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray79[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray79[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray79[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray79[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray79[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray79[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ut", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt9619;
		this.anInt9619 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ut", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt9640 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIIII)V")
	private void method8203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt9632 || arg1 >= this.anInt9639) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt9638;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt9634 && arg0 + local37 < this.anInt9623 && local27 < arg4) {
					this.anIntArray628[local15 + local37] = arg3;
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
			if (arg0 + local103 >= this.anInt9634 && arg0 + local103 < this.anInt9623 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray628[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray628[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!ut", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt9638, this.anInt9627, arg0, 0);
	}

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "(II)I")
	@Override
	public int method8198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "()V")
	@Override
	public void method8167() {
	}

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "()V")
	@Override
	public void method8161() {
		this.aClass279_57.method6638();
		this.aClass279_56.method6638();
	}

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "(I)V")
	@Override
	public void method8165(@OriginalArg(0) int arg0) {
		this.aClass52Array1[arg0].method1550(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "()Lclient!sk;")
	@Override
	public Class25 method8159() {
		return this.aClass25_Sub2_3;
	}

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8171() {
		@Pc(3) Class52 local3 = this.method8210(Thread.currentThread());
		@Pc(6) Class199 local6 = local3.aClass199_1;
		local6.aBoolean417 = false;
		@Pc(14) int local14 = 5 - this.anInt9641;
		@Pc(19) int local19 = 75 - this.anInt9641;
		@Pc(24) int local24 = 15 - this.anInt9641;
		@Pc(29) int local29 = 10 - this.anInt9630;
		@Pc(34) int local34 = 50 - this.anInt9630;
		@Pc(39) int local39 = 90 - this.anInt9630;
		local6.aBoolean416 = local14 < 0 || local14 > local6.anInt5365 || local19 < 0 || local19 > local6.anInt5365 || local24 < 0 || local24 > local6.anInt5365;
		local6.anInt5362 = 0;
		local6.aBoolean415 = false;
		local6.method4556((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean417 = true;
	}

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "()Z")
	@Override
	public boolean method8187() {
		return false;
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "()I")
	@Override
	public int method8130() {
		return 0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIF)Lclient!bq;")
	@Override
	public Class3_Sub7 method8154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)I")
	public int method8204(@OriginalArg(0) int arg0) {
		return super.anInterface5_12.method5193(arg0).aShort117 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ut", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass25_Sub2_3.aFloat54 * (float) arg0 + this.aClass25_Sub2_3.aFloat50 * (float) arg1 + this.aClass25_Sub2_3.aFloat59 * (float) arg2 + this.aClass25_Sub2_3.aFloat49;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass25_Sub2_3.aFloat54 * (float) arg3 + this.aClass25_Sub2_3.aFloat50 * (float) arg4 + this.aClass25_Sub2_3.aFloat59 * (float) arg5 + this.aClass25_Sub2_3.aFloat49;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt9633 && local57 < (float) this.anInt9633) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt9622 && local57 > (float) this.anInt9622) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt9624 * (this.aClass25_Sub2_3.aFloat60 * (float) arg0 + this.aClass25_Sub2_3.aFloat57 * (float) arg1 + this.aClass25_Sub2_3.aFloat53 * (float) arg2 + this.aClass25_Sub2_3.aFloat52) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt9624 * (this.aClass25_Sub2_3.aFloat60 * (float) arg3 + this.aClass25_Sub2_3.aFloat57 * (float) arg4 + this.aClass25_Sub2_3.aFloat53 * (float) arg5 + this.aClass25_Sub2_3.aFloat52) / local57);
		if (local128 < this.anInt9641 && local160 < this.anInt9641) {
			local1 |= 0x1;
		} else if (local128 > this.anInt9616 && local160 > this.anInt9616) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt9617 * (this.aClass25_Sub2_3.aFloat56 * (float) arg0 + this.aClass25_Sub2_3.aFloat55 * (float) arg1 + this.aClass25_Sub2_3.aFloat51 * (float) arg2 + this.aClass25_Sub2_3.aFloat58) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt9617 * (this.aClass25_Sub2_3.aFloat56 * (float) arg3 + this.aClass25_Sub2_3.aFloat55 * (float) arg4 + this.aClass25_Sub2_3.aFloat51 * (float) arg5 + this.aClass25_Sub2_3.aFloat58) / local57);
		if (local217 < this.anInt9630 && local249 < this.anInt9630) {
			local1 |= 0x4;
		} else if (local217 > this.anInt9618 && local249 > this.anInt9618) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "()Lclient!aja;")
	@Override
	public Class18 method8193() {
		return new Class18(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!ut", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt9634 = 0;
		this.anInt9632 = 0;
		this.anInt9623 = this.anInt9638;
		this.anInt9639 = this.anInt9627;
		this.method8207();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8144(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			this.method8173((Canvas) null);
		}
		@Pc(15) Class3_Sub23 local15 = (Class3_Sub23) this.aClass62_48.method1682((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8770();
		}
	}

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "()V")
	@Override
	public void method8172() {
	}

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "()Lclient!sk;")
	@Override
	public Class25 method8178() {
		return new Class25_Sub2();
	}

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "()V")
	@Override
	public void method8189() {
	}

	@OriginalMember(owner = "client!ut", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt9636;
		this.anInt9636 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "(I)Z")
	public boolean method8205(@OriginalArg(0) int arg0) {
		return super.anInterface5_12.method5197(arg0);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class104 method8196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class104_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ut", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass25_Sub2_3.aFloat49 + this.aClass25_Sub2_3.aFloat54 * (float) arg0 + this.aClass25_Sub2_3.aFloat50 * (float) arg1 + this.aClass25_Sub2_3.aFloat59 * (float) arg2;
		if (local24 < (float) this.anInt9633 || local24 > (float) this.anInt9622) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt9624 * (this.aClass25_Sub2_3.aFloat52 + this.aClass25_Sub2_3.aFloat60 * (float) arg0 + this.aClass25_Sub2_3.aFloat57 * (float) arg1 + this.aClass25_Sub2_3.aFloat53 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt9617 * (this.aClass25_Sub2_3.aFloat58 + this.aClass25_Sub2_3.aFloat56 * (float) arg0 + this.aClass25_Sub2_3.aFloat55 * (float) arg1 + this.aClass25_Sub2_3.aFloat51 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt9641 && local82 <= this.anInt9616 && local115 >= this.anInt9630 && local115 <= this.anInt9618) {
			arg4[0] = local82 - this.anInt9641;
			arg4[1] = local115 - this.anInt9630;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt9633;
	}

	@OriginalMember(owner = "client!ut", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9634 < arg0) {
			this.anInt9634 = arg0;
		}
		if (this.anInt9632 < arg1) {
			this.anInt9632 = arg1;
		}
		if (this.anInt9623 > arg2) {
			this.anInt9623 = arg2;
		}
		if (this.anInt9639 > arg3) {
			this.anInt9639 = arg3;
		}
		this.method8207();
	}

	@OriginalMember(owner = "client!ut", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass52Array1.length; local1++) {
			this.aClass52Array1[local1].anInt1586 = this.aClass52Array1[local1].anInt1583;
			this.aClass52Array1[local1].anInt1585 = arg0;
			this.aClass52Array1[local1].anInt1583 = arg1;
			this.aClass52Array1[local1].anInt1588 = arg2;
			this.aClass52Array1[local1].aBoolean142 = true;
		}
	}

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "()Z")
	public boolean method8206() {
		return this.aBoolean711;
	}

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "()V")
	private void method8207() {
		this.anInt9641 = this.anInt9634 - this.anInt9635;
		this.anInt9616 = this.anInt9623 - this.anInt9635;
		this.anInt9630 = this.anInt9632 - this.anInt9631;
		this.anInt9618 = this.anInt9639 - this.anInt9631;
		for (@Pc(29) int local29 = 0; local29 < this.anInt9629; local29++) {
			@Pc(36) Class199 local36 = this.aClass52Array1[local29].aClass199_1;
			local36.anInt5366 = this.anInt9635 - this.anInt9634;
			local36.anInt5367 = this.anInt9631 - this.anInt9632;
			local36.anInt5365 = this.anInt9623 - this.anInt9634;
			local36.anInt5363 = this.anInt9639 - this.anInt9632;
		}
		@Pc(78) int local78 = this.anInt9632 * this.anInt9638 + this.anInt9634;
		for (@Pc(81) int local81 = this.anInt9632; local81 < this.anInt9639; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt9629; local84++) {
				this.aClass52Array1[local84].aClass199_1.anIntArray349[local81 - this.anInt9632] = local78;
			}
			local78 += this.anInt9638;
		}
	}

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "(I)V")
	@Override
	public void method8133(@OriginalArg(0) int arg0) {
		this.aClass52Array1[arg0].method1550((Runnable) null);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZ)Lclient!nf;")
	@Override
	public Class102 method8168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class102_Sub1_Sub1(this, arg0, arg1) : new Class102_Sub1_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!ut", name = "r", descriptor = "()Z")
	@Override
	public boolean method8181() {
		return false;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([IIIIIZ)Lclient!nf;")
	@Override
	public Class102 method8194(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class102_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class102_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class102_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class102_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ut", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt9625 = (int) (arg1 * 65535.0F);
		this.anInt9626 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt9615 = (int) (arg3 * 65535.0F / local26);
		this.lb = (int) (arg4 * 65535.0F / local26);
		this.anInt9621 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
	@Override
	public void method8121(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt9613;
		for (@Pc(9) Object local9 = this.aClass279_57.method6640(); local9 != null; local9 = this.aClass279_57.method6633()) {
			@Pc(13) Class3_Sub16 local13 = (Class3_Sub16) local9;
			if (local13.aBoolean212) {
				local13.anInt2692 += local4;
				@Pc(27) int local27 = local13.anInt2692 / 20;
				if (local27 > 0) {
					@Pc(36) Class342 local36 = super.anInterface5_12.method5193(local13.anInt2693);
					local13.method2467(local36.aByte130 * local4 * 50 / 1000, local36.aByte127 * local4 * 50 / 1000);
					local13.anInt2692 -= local27 * 20;
				}
				local13.aBoolean212 = false;
			}
		}
		this.anInt9613 = arg0;
		this.aClass279_56.method6630(5);
		this.aClass279_57.method6630(5);
	}

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "()Z")
	@Override
	public boolean method8192() {
		return false;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8118(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub23 local8 = (Class3_Sub23) this.aClass62_48.method1682((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8770();
		local8 = Static407.method5809(arg0, arg2, arg1);
		this.aClass62_48.method1686((long) arg0.hashCode(), local8);
		if (this.aCanvas13 != arg0 || this.aClass394_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt9611 = local37.width;
		this.anInt9612 = local37.height;
		this.aClass3_Sub23_1 = local8;
		this.anIntArray628 = local8.anIntArray504;
		this.anInt9638 = local8.anInt8162;
		this.anInt9627 = local8.anInt8164;
		if (this.anInt9638 != this.anInt9620 || this.anInt9627 != this.anInt9642) {
			this.anInt9614 = this.anInt9620 = this.anInt9638;
			this.anInt9637 = this.anInt9642 = this.anInt9627;
			this.aFloatArray80 = this.aFloatArray79 = new float[this.anInt9620 * this.anInt9642];
		}
		this.method8208();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I[Lclient!bq;)V")
	@Override
	public void method8162(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7[] arg1) {
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray141;
		@Pc(8) int[] local8 = local2.anIntArray142;
		@Pc(17) int local17 = this.anInt9632 > arg7 ? this.anInt9632 : arg7;
		@Pc(32) int local32 = this.anInt9639 < arg7 + local5.length ? this.anInt9639 : arg7 + local5.length;
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
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt9634 && local172 < this.anInt9623 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray628[local172 + arg1 * this.anInt9638] = arg4;
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
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt9634 && local176 < this.anInt9623 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt9638;
						local316 = this.anIntArray628[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray628[local176 + arg1 * this.anInt9638] = local263 + local707;
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
				if (arg0 >= this.anInt9634 && arg0 < this.anInt9623 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray628[arg0 + local172 * this.anInt9638] = arg4;
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
			if (arg0 >= this.anInt9634 && arg0 < this.anInt9623 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt9638;
					@Pc(321) int local321 = this.anIntArray628[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray628[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "()V")
	private void method8208() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9629; local1++) {
			this.aClass52Array1[local1].method1551();
		}
		this.la();
	}

	@OriginalMember(owner = "client!ut", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt9622;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(IIIIIIII)V")
	private void method8209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt9634 || arg0 >= this.anInt9623) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt9638;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt9632 && arg1 + local37 < this.anInt9639 && local27 < arg4) {
					this.anIntArray628[local15 + local37 * this.anInt9638] = arg3;
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
			if (arg1 + local106 >= this.anInt9632 && arg1 + local106 < this.anInt9639 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt9638;
				@Pc(134) int local134 = this.anIntArray628[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray628[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!ut", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt9635, this.anInt9631, this.anInt9624, this.anInt9617 };
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method8135(@OriginalArg(0) Class25 arg0) {
		this.aClass25_Sub2_3 = (Class25_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "()Z")
	@Override
	public boolean method8186() {
		return false;
	}

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "(IIIIII)Lclient!en;")
	@Override
	public Class106 method8177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "()V")
	@Override
	public void method8138() {
		if (this.aCanvas13 == null) {
			this.anInt9638 = 1;
			this.anInt9627 = 1;
			this.anIntArray628 = null;
			this.anInt9620 = 1;
			this.anInt9642 = 1;
			this.aFloatArray79 = null;
		} else {
			this.anIntArray628 = this.aClass3_Sub23_1.anIntArray504;
			this.anInt9638 = this.aClass3_Sub23_1.anInt8162;
			this.anInt9627 = this.aClass3_Sub23_1.anInt8164;
			this.aFloatArray79 = this.aFloatArray80;
			this.anInt9620 = this.anInt9614;
			this.anInt9642 = this.anInt9637;
		}
		this.aClass394_1 = null;
		this.method8208();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!gh;Lclient!oq;)Lclient!el;")
	@Override
	public Interface8 method8166(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Interface19 arg1) {
		return new Class394(this, (Class102) arg0, (Class66) arg1);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "()Z")
	@Override
	public boolean method8124() {
		return false;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([I)V")
	@Override
	public void method8190(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9638;
		arg0[1] = this.anInt9627;
	}

	@OriginalMember(owner = "client!ut", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt9634) {
			arg2 -= this.anInt9634 - arg0;
			arg0 = this.anInt9634;
		}
		if (arg1 < this.anInt9632) {
			arg3 -= this.anInt9632 - arg1;
			arg1 = this.anInt9632;
		}
		if (arg0 + arg2 > this.anInt9623) {
			arg2 = this.anInt9623 - arg0;
		}
		if (arg1 + arg3 > this.anInt9639) {
			arg3 = this.anInt9639 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt9623 || arg1 > this.anInt9639) {
			return;
		}
		@Pc(67) int local67 = this.anInt9638 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt9638;
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
						local217 = this.anIntArray628[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray628[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray628[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray628[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray628[arg2] = arg4;
					arg2++;
					this.anIntArray628[arg2] = arg4;
					arg2++;
					this.anIntArray628[arg2] = arg4;
					arg2++;
					this.anIntArray628[arg2] = arg4;
					arg2++;
					this.anIntArray628[arg2] = arg4;
					arg2++;
					this.anIntArray628[arg2] = arg4;
					arg2++;
					this.anIntArray628[arg2] = arg4;
					arg2++;
					this.anIntArray628[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray628[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9634;
		arg0[1] = this.anInt9632;
		arg0[2] = this.anInt9623;
		arg0[3] = this.anInt9639;
	}

	@OriginalMember(owner = "client!ut", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(IIIIZ)Lclient!nf;")
	@Override
	public Class102 method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt9638 + arg0;
		@Pc(16) int local16 = this.anInt9638 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray628[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class102_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class102_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!cc;")
	public Class52 method8210(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9629; local1++) {
			if (this.aClass52Array1[local1].aRunnable2 == arg0) {
				return this.aClass52Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "(I)[I")
	public int[] method8211(@OriginalArg(0) int arg0) {
		@Pc(2) Class279 local2 = this.aClass279_57;
		@Pc(12) Class3_Sub16 local12;
		synchronized (this.aClass279_57) {
			local12 = (Class3_Sub16) this.aClass279_57.method6631((long) arg0);
			if (local12 == null) {
				if (!super.anInterface5_12.method5197(arg0)) {
					return null;
				}
				@Pc(32) Class342 local32 = super.anInterface5_12.method5193(arg0);
				@Pc(43) int local43 = local32.aBoolean695 || this.aBoolean713 ? 64 : this.anInt9628;
				local12 = new Class3_Sub16(arg0, local43, super.anInterface5_12.method5192(0.7F, local43, true, arg0, local43), local32.anInt9280 != 1);
				this.aClass279_57.method6635(local12, (long) arg0);
			}
		}
		local12.aBoolean212 = true;
		return local12.method2465();
	}

	@OriginalMember(owner = "client!ut", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt9632 || arg1 >= this.anInt9639) {
			return;
		}
		if (arg0 < this.anInt9634) {
			arg2 -= this.anInt9634 - arg0;
			arg0 = this.anInt9634;
		}
		if (arg0 + arg2 > this.anInt9623) {
			arg2 = this.anInt9623 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt9638;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray628[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray628[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray628[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray628[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray628[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "(I)[I")
	public int[] method8212(@OriginalArg(0) int arg0) {
		@Pc(2) Class279 local2 = this.aClass279_57;
		@Pc(14) Class3_Sub16 local14;
		synchronized (this.aClass279_57) {
			local14 = (Class3_Sub16) this.aClass279_57.method6631((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface5_12.method5197(arg0)) {
					return null;
				}
				@Pc(34) Class342 local34 = super.anInterface5_12.method5193(arg0);
				@Pc(45) int local45 = local34.aBoolean695 || this.aBoolean713 ? 64 : this.anInt9628;
				local14 = new Class3_Sub16(arg0, local45, super.anInterface5_12.method5195(local45, arg0, 0.7F, local45), local34.anInt9280 != 1);
				this.aClass279_57.method6635(local14, (long) arg0 | Long.MIN_VALUE);
			}
		}
		local14.aBoolean212 = true;
		return local14.method2465();
	}

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "(I)Z")
	public boolean method8213(@OriginalArg(0) int arg0) {
		return this.aBoolean713 || super.anInterface5_12.method5193(arg0).aBoolean695;
	}

	@OriginalMember(owner = "client!ut", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass52Array1.length; local1++) {
			this.aClass52Array1[local1].anInt1583 = this.aClass52Array1[local1].anInt1586;
			this.aClass52Array1[local1].aBoolean142 = false;
		}
	}

	@OriginalMember(owner = "client!ut", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass25_Sub2_3.aFloat49 + this.aClass25_Sub2_3.aFloat54 * (float) arg0 + this.aClass25_Sub2_3.aFloat50 * (float) arg1 + this.aClass25_Sub2_3.aFloat59 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt9624 * (this.aClass25_Sub2_3.aFloat52 + this.aClass25_Sub2_3.aFloat60 * (float) arg0 + this.aClass25_Sub2_3.aFloat57 * (float) arg1 + this.aClass25_Sub2_3.aFloat53 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt9617 * (this.aClass25_Sub2_3.aFloat58 + this.aClass25_Sub2_3.aFloat56 * (float) arg0 + this.aClass25_Sub2_3.aFloat55 * (float) arg1 + this.aClass25_Sub2_3.aFloat51 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt9641;
		arg3[1] = local105 - this.anInt9630;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!dc;IIII)Lclient!ka;")
	@Override
	public Class28 method8137(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class28_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ut", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt9634 || arg0 >= this.anInt9623) {
			return;
		}
		if (arg1 < this.anInt9632) {
			arg2 -= this.anInt9632 - arg1;
			arg1 = this.anInt9632;
		}
		if (arg1 + arg2 > this.anInt9639) {
			arg2 = this.anInt9639 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt9638;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray628[local40 + local54 * this.anInt9638] = arg3;
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
				local111 = local40 + local103 * this.anInt9638;
				local116 = this.anIntArray628[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray628[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt9638;
				local111 = this.anIntArray628[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray628[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!en;)V")
	@Override
	public void method8201(@OriginalArg(0) Class106 arg0) {
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)I")
	@Override
	public int method8122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ut", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class52 local3 = this.method8210(Thread.currentThread());
		local3.anInt1585 = arg0;
		local3.anInt1583 = arg1;
		local3.anInt1588 = arg2;
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "()V")
	@Override
	public void method8127() {
	}

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class52 local3 = this.method8210(Thread.currentThread());
		local3.aBoolean143 = arg0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray141;
		@Pc(8) int[] local8 = local2.anIntArray142;
		@Pc(17) int local17 = this.anInt9632 > arg7 ? this.anInt9632 : arg7;
		@Pc(32) int local32 = this.anInt9639 < arg7 + local5.length ? this.anInt9639 : arg7 + local5.length;
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
					if (local129 >= this.anInt9634 && local129 < this.anInt9623 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray628[local129 + arg1 * this.anInt9638] = arg4;
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
					if (local133 >= this.anInt9634 && local133 < this.anInt9623 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt9638;
						local248 = this.anIntArray628[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray628[local133 + arg1 * this.anInt9638] = local201 + local584;
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
		if (arg0 < this.anInt9634) {
			arg1 += local83 * (this.anInt9634 - arg0);
			arg0 = this.anInt9634;
		}
		if (arg2 >= this.anInt9623) {
			arg2 = this.anInt9623 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray628[arg0 + local129 * this.anInt9638] = arg4;
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
					local243 = arg0 + local133 * this.anInt9638;
					local248 = this.anIntArray628[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray628[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt9620 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt9620 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray79;
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

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "()Z")
	@Override
	public boolean method8157() {
		return false;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!ln;IIII)V")
	private void method8214(@OriginalArg(0) Class23_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt7852;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method8215(arg1, arg2, arg3, arg4, arg0.anInt7856, 1);
			return;
		}
		if (this.anInt9643 != local2) {
			@Pc(33) Class102 local33 = (Class102) this.aClass279_56.method6631((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method8212(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method8213(local2) ? 64 : this.anInt9628;
				local33 = this.method8131(local50, local39, local50, local50);
				this.aClass279_56.method6635(local33, (long) local2);
			}
			this.anInt9643 = local2;
			this.aClass102_37 = local33;
		}
		local8++;
		((Class102_Sub1) this.aClass102_37).method6975(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt7856, 1);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "()Z")
	@Override
	public boolean method8120() {
		return false;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method8203(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method8203(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
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
						if (arg0 >= this.anInt9634 && arg0 < this.anInt9623 && local267 >= this.anInt9632 && local267 < this.anInt9639 && arg7 < local143) {
							this.anIntArray628[arg0 + local267 * this.anInt9638] = arg4;
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
						if (arg0 >= this.anInt9634 && arg0 < this.anInt9623 && local349 >= this.anInt9632 && local349 < this.anInt9639 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt9638;
							local380 = this.anIntArray628[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray628[local375] = local340 + local380;
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
						if (arg1 >= this.anInt9632 && arg1 < this.anInt9639 && local267 >= this.anInt9634 && local267 < this.anInt9623 && arg7 < local143) {
							this.anIntArray628[local267 + arg1 * this.anInt9638] = arg4;
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
						if (arg1 >= this.anInt9632 && arg1 < this.anInt9639 && local349 >= this.anInt9634 && local349 < this.anInt9623 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt9638;
							local380 = this.anIntArray628[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray628[local349 + arg1 * this.anInt9638] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method8209(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method8209(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt9634) {
					arg1 += local104 * (this.anInt9634 - arg0);
					arg0 = this.anInt9634;
				}
				if (arg2 >= this.anInt9623) {
					arg2 = this.anInt9623 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt9632 && local150 < this.anInt9639) {
							this.anIntArray628[arg0 + local150 * this.anInt9638] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt9632 && local213 < this.anInt9639) {
							local228 = arg0 + local213 * this.anInt9638;
							local233 = this.anIntArray628[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray628[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt9632 && local150 < this.anInt9639) {
							local213 = arg0 + local150 * this.anInt9638;
							local228 = this.anIntArray628[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray628[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt9632) {
					arg0 += local104 * (this.anInt9632 - arg1);
					arg1 = this.anInt9632;
				}
				if (arg3 >= this.anInt9639) {
					arg3 = this.anInt9639 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt9634 && local150 < this.anInt9623) {
							this.anIntArray628[local150 + arg1 * this.anInt9638] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt9634 && local213 < this.anInt9623) {
							local228 = local213 + arg1 * this.anInt9638;
							local233 = this.anIntArray628[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray628[local213 + arg1 * this.anInt9638] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt9634 && local150 < this.anInt9623) {
							local213 = local150 + arg1 * this.anInt9638;
							local228 = this.anIntArray628[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray628[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(II)Lclient!oq;")
	@Override
	public Interface19 method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class66(arg0, arg1);
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(II)Lclient!gh;")
	@Override
	public Interface10 method8176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method8168(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	@Override
	public void method8114(@OriginalArg(0) int arg0) {
		this.anInt9628 = arg0;
		this.aClass279_57.method6638();
	}

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "()Z")
	@Override
	public boolean method8149() {
		return false;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V")
	@Override
	public void method8125(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "()V")
	@Override
	protected void method8163() {
		if (this.aBoolean712) {
			Static22.method745(true, false);
			this.aBoolean712 = false;
		}
		this.aClass3_Sub23_1 = null;
		this.aCanvas13 = null;
		this.anInt9611 = 0;
		this.anInt9612 = 0;
		this.aClass62_48 = null;
		this.aBoolean711 = true;
	}

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "(IIIIII)V")
	private void method8215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt9632) {
			local8 = this.anInt9632;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt9639) {
			local21 = this.anInt9639;
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
				if (local91 < this.anInt9634) {
					local91 = this.anInt9634;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9623) {
					local102 = this.anInt9623;
				}
				local116 = local91 + local30 * this.anInt9638;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray79[local116]) {
						this.anIntArray628[local116] = arg4;
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
				if (local91 < this.anInt9634) {
					local91 = this.anInt9634;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9623 - 1) {
					local102 = this.anInt9623 - 1;
				}
				local116 = local91 + local30 * this.anInt9638;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray79[local116]) {
						this.anIntArray628[local116] = arg4;
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
				if (local102 < this.anInt9634) {
					local102 = this.anInt9634;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt9623) {
					local116 = this.anInt9623;
				}
				local118 = local102 + local30 * this.anInt9638;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray79[local118]) {
						local364 = this.anIntArray628[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray628[local118] = local293 + local364;
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
				if (local102 < this.anInt9634) {
					local102 = this.anInt9634;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt9623 - 1) {
					local116 = this.anInt9623 - 1;
				}
				local118 = local102 + local30 * this.anInt9638;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray79[local118]) {
						local364 = this.anIntArray628[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray628[local118] = local293 + local364;
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
				if (local91 < this.anInt9634) {
					local91 = this.anInt9634;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9623) {
					local102 = this.anInt9623;
				}
				local116 = local91 + local30 * this.anInt9638;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray79[local116]) {
						local350 = this.anIntArray628[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray628[local116] = local364 - local643 | local643 - (local643 >>> 8);
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
				if (local91 < this.anInt9634) {
					local91 = this.anInt9634;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9623 - 1) {
					local102 = this.anInt9623 - 1;
				}
				local116 = local91 + local30 * this.anInt9638;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray79[local116]) {
						local350 = this.anIntArray628[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray628[local116] = local364 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8184(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub23 local8 = (Class3_Sub23) this.aClass62_48.method1682((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static407.method5809(arg0, arg2, arg1);
			this.aClass62_48.method1686((long) arg0.hashCode(), local8);
		} else if (local8.anInt8162 != arg1 || local8.anInt8164 != arg2) {
			this.method8118(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "(I)Z")
	public boolean method8216(@OriginalArg(0) int arg0) {
		return super.anInterface5_12.method5193(arg0).aBoolean692 || super.anInterface5_12.method5193(arg0).aBoolean696;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8173(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas13 = null;
			this.aClass3_Sub23_1 = null;
			if (this.aClass394_1 == null) {
				this.anIntArray628 = null;
				this.anInt9638 = this.anInt9627 = 1;
				this.anInt9620 = this.anInt9642 = 1;
				this.method8208();
			}
			return;
		}
		@Pc(10) Class3_Sub23 local10 = (Class3_Sub23) this.aClass62_48.method1682((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas13 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt9611 = local18.width;
		this.anInt9612 = local18.height;
		this.aClass3_Sub23_1 = local10;
		if (this.aClass394_1 != null) {
			return;
		}
		this.anIntArray628 = local10.anIntArray504;
		this.anInt9638 = local10.anInt8162;
		this.anInt9627 = local10.anInt8164;
		if (this.anInt9638 != this.anInt9620 || this.anInt9627 != this.anInt9642) {
			this.anInt9614 = this.anInt9620 = this.anInt9638;
			this.anInt9637 = this.anInt9642 = this.anInt9627;
			this.aFloatArray80 = this.aFloatArray79 = new float[this.anInt9620 * this.anInt9642];
		}
		this.method8208();
		return;
	}

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "(I)I")
	public int method8217(@OriginalArg(0) int arg0) {
		return super.anInterface5_12.method5193(arg0).anInt9280;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!gs;Z)Lclient!nf;")
	@Override
	public Class102 method8132(@OriginalArg(0) Class150 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray258;
		@Pc(5) byte[] local5 = arg0.aByteArray34;
		@Pc(8) int local8 = arg0.anInt3831;
		@Pc(11) int local11 = arg0.anInt3828;
		@Pc(76) Class102_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray33 == null) {
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
			local76 = new Class102_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray33;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class102_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class102_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.method6959(arg0.anInt3830, arg0.anInt3826, arg0.anInt3827, arg0.anInt3829);
		return local76;
	}

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub14 method8188(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method8146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "()Z")
	@Override
	public boolean method8195() {
		return true;
	}

	@OriginalMember(owner = "client!ut", name = "v", descriptor = "()Z")
	@Override
	public boolean method8191() {
		return true;
	}

	@OriginalMember(owner = "client!ut", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt9638) {
			arg2 = this.anInt9638;
		}
		if (arg3 > this.anInt9627) {
			arg3 = this.anInt9627;
		}
		this.anInt9634 = arg0;
		this.anInt9623 = arg2;
		this.anInt9632 = arg1;
		this.anInt9639 = arg3;
		this.method8207();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!kc;[Lclient!gs;Z)Lclient!da;")
	@Override
	public Class69 method8117(@OriginalArg(0) Class202 arg0, @OriginalArg(1) Class150[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3831;
			local7[local11] = arg1[local11].anInt3828;
			if (arg1[local11].aByteArray33 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class69_Sub3(this, arg0, arg1, local3, local7);
		} else {
			return new Class69_Sub5(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(II)V")
	@Override
	public void method8175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas13 == null || this.aClass3_Sub23_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas13.getGraphics();
			this.aClass3_Sub23_1.method6869(this.anInt9611, local14, arg1, arg0, 0, 0, this.anInt9612);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class52 local3 = this.method8210(Thread.currentThread());
		this.anInt9633 = arg0;
		this.anInt9622 = arg1;
		local3.anInt1587 = this.anInt9622 - 255;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!el;)V")
	@Override
	public void method8152(@OriginalArg(0) Interface8 arg0) {
		@Pc(2) Class394 local2 = (Class394) arg0;
		this.anInt9638 = local2.anInt10311;
		this.anInt9627 = local2.anInt10312;
		this.anIntArray628 = local2.anIntArray668;
		this.aClass394_1 = local2;
		this.anInt9620 = local2.anInt10311;
		this.anInt9642 = local2.anInt10312;
		this.aFloatArray79 = local2.aFloatArray84;
		this.method8208();
	}

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "()Lclient!sk;")
	@Override
	public Class25 method8156() {
		@Pc(3) Class52 local3 = this.method8210(Thread.currentThread());
		return local3.aClass25_Sub2_1;
	}
}
