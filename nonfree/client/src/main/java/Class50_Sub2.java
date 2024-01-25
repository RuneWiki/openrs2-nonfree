import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class50_Sub2 extends Class50 {

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
	private int anInt6465;

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "Lclient!wl;")
	private Class10_Sub3 aClass10_Sub3_1;

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "I")
	public int anInt6468;

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
	public int anInt6472;

	@OriginalMember(owner = "client!sr", name = "G", descriptor = "I")
	public int anInt6477;

	@OriginalMember(owner = "client!sr", name = "H", descriptor = "I")
	public int anInt6478;

	@OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
	public int anInt6479;

	@OriginalMember(owner = "client!sr", name = "L", descriptor = "I")
	public int anInt6482;

	@OriginalMember(owner = "client!sr", name = "M", descriptor = "I")
	public int anInt6483;

	@OriginalMember(owner = "client!sr", name = "N", descriptor = "I")
	public int anInt6484;

	@OriginalMember(owner = "client!sr", name = "Q", descriptor = "[Lclient!im;")
	private Class118[] aClass118Array1;

	@OriginalMember(owner = "client!sr", name = "S", descriptor = "Lclient!o;")
	private Class80 aClass80_20;

	@OriginalMember(owner = "client!sr", name = "U", descriptor = "I")
	private int anInt6488;

	@OriginalMember(owner = "client!sr", name = "W", descriptor = "F")
	private float aFloat108;

	@OriginalMember(owner = "client!sr", name = "Y", descriptor = "Z")
	public boolean aBoolean432;

	@OriginalMember(owner = "client!sr", name = "cb", descriptor = "F")
	private float aFloat109;

	@OriginalMember(owner = "client!sr", name = "db", descriptor = "I")
	public int anInt6492;

	@OriginalMember(owner = "client!sr", name = "gb", descriptor = "I")
	public int anInt6495;

	@OriginalMember(owner = "client!sr", name = "hb", descriptor = "[I")
	public int[] anIntArray628;

	@OriginalMember(owner = "client!sr", name = "ib", descriptor = "I")
	public int anInt6496;

	@OriginalMember(owner = "client!sr", name = "kb", descriptor = "Lclient!o;")
	private Class80 aClass80_21;

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "Z")
	private boolean aBoolean428;

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "Z")
	private boolean aBoolean429;

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "Lclient!mn;")
	private Class167 aClass167_28;

	@OriginalMember(owner = "client!sr", name = "B", descriptor = "I")
	public int anInt6474;

	@OriginalMember(owner = "client!sr", name = "E", descriptor = "I")
	public int anInt6476;

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
	private int anInt6469;

	@OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
	public int anInt6480;

	@OriginalMember(owner = "client!sr", name = "C", descriptor = "Z")
	public boolean aBoolean430;

	@OriginalMember(owner = "client!sr", name = "D", descriptor = "I")
	public int anInt6475;

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
	public int anInt6467;

	@OriginalMember(owner = "client!sr", name = "T", descriptor = "I")
	public int anInt6487;

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
	public int anInt6471;

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "I")
	public int anInt6466;

	@OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
	private int anInt6473;

	@OriginalMember(owner = "client!sr", name = "K", descriptor = "I")
	public int anInt6481;

	@OriginalMember(owner = "client!sr", name = "ab", descriptor = "I")
	private int anInt6491;

	@OriginalMember(owner = "client!sr", name = "Z", descriptor = "I")
	public int anInt6490;

	@OriginalMember(owner = "client!sr", name = "R", descriptor = "I")
	public int anInt6486;

	@OriginalMember(owner = "client!sr", name = "O", descriptor = "I")
	public int anInt6485;

	@OriginalMember(owner = "client!sr", name = "V", descriptor = "Z")
	private boolean aBoolean431;

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "I")
	public int anInt6470;

	@OriginalMember(owner = "client!sr", name = "X", descriptor = "I")
	public int anInt6489;

	@OriginalMember(owner = "client!sr", name = "fb", descriptor = "I")
	private int anInt6494;

	@OriginalMember(owner = "client!sr", name = "eb", descriptor = "I")
	public int anInt6493;

	@OriginalMember(owner = "client!sr", name = "P", descriptor = "Lclient!wm;")
	private final Class267 aClass267_69;

	@OriginalMember(owner = "client!sr", name = "jb", descriptor = "I")
	private int anInt6497;

	@OriginalMember(owner = "client!sr", name = "F", descriptor = "Lclient!wm;")
	private final Class267 aClass267_68;

	@OriginalMember(owner = "client!sr", name = "bb", descriptor = "Lclient!vr;")
	public Class34_Sub2 aClass34_Sub2_3;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(ILclient!l;)V")
	private Class50_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg0, arg1);
		this.aBoolean428 = false;
		this.aBoolean429 = false;
		this.aClass167_28 = new Class167(4);
		this.anInt6474 = 0;
		this.anInt6476 = 75518;
		this.anInt6469 = 3500;
		this.anInt6480 = 50;
		this.aBoolean430 = false;
		this.anInt6475 = 0;
		this.anInt6467 = 78642;
		this.anInt6487 = 512;
		this.anInt6471 = 0;
		this.anInt6466 = 0;
		this.anInt6473 = 0;
		this.anInt6481 = 512;
		this.anInt6491 = 0;
		this.anInt6490 = 3500;
		this.anInt6486 = 0;
		this.anInt6485 = 0;
		this.aBoolean431 = false;
		this.anInt6470 = this.anInt6469 - 255;
		this.anInt6489 = 0;
		this.anInt6494 = 0;
		this.anInt6493 = 45823;
		this.aClass267_69 = new Class267(16);
		this.anInt6497 = -1;
		this.aClass267_68 = new Class267(20);
		this.aClass34_Sub2_3 = new Class34_Sub2();
		this.method5817(1);
		this.method5832(0);
		Static154.method2633(false, true);
		this.aBoolean429 = true;
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;)V")
	public Class50_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2) {
		this(arg0, arg2);
		this.method5880(arg1);
		this.method5827(arg1);
	}

	@OriginalMember(owner = "client!sr", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(2) int local2 = this.anInt6491;
		this.anInt6491 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "(I)I")
	public int method5086(@OriginalArg(0) int arg0) {
		return super.anInterface7_8.method4447(arg0).aShort108 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sr", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat108;
	}

	@OriginalMember(owner = "client!sr", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6477 = arg0;
		this.anInt6496 = arg1;
		this.anInt6481 = arg2;
		this.anInt6487 = arg3;
		this.method5088();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5812() {
		@Pc(3) Class118 local3 = this.method5089(Thread.currentThread());
		@Pc(6) Class170 local6 = local3.aClass170_2;
		local6.aBoolean312 = false;
		local6.aBoolean312 = false;
		local6.anInt4616 = 0;
		local6.aBoolean310 = true;
		local6.method3736(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean312 = true;
	}

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6494 = this.anInt6486;
		this.anInt6489 = arg0;
		this.anInt6486 = arg1;
		this.anInt6485 = arg2;
		this.aBoolean430 = true;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!qg;Lclient!qg;FLclient!qg;)Lclient!qg;")
	@Override
	public Class30 method5847(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class30 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(IIII)V")
	@Override
	public void method5849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "()Z")
	@Override
	public boolean method5830() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!fj;[Lclient!ef;Z)Lclient!la;")
	@Override
	public Class57 method5846(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class66[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1861;
			local7[local11] = arg1[local11].anInt1862;
			if (arg1[local11].aByteArray16 != null) {
			}
		}
		return new Class57_Sub4(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "()Z")
	public boolean method5087() {
		return this.aBoolean428;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)I")
	@Override
	public int method5856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "()Z")
	@Override
	public boolean method5810() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6480 = arg0;
		this.anInt6469 = arg1;
		this.anInt6470 = this.anInt6469 - 255;
		this.method5093();
	}

	@OriginalMember(owner = "client!sr", name = "C", descriptor = "()V")
	private void method5088() {
		this.anInt6479 = this.anInt6466 - this.anInt6477;
		this.anInt6495 = this.anInt6475 - this.anInt6477;
		this.anInt6492 = this.anInt6471 - this.anInt6496;
		this.anInt6472 = this.anInt6474 - this.anInt6496;
		for (@Pc(29) int local29 = 0; local29 < this.anInt6468; local29++) {
			@Pc(36) Class170 local36 = this.aClass118Array1[local29].aClass170_2;
			local36.anInt4620 = this.anInt6477 - this.anInt6466;
			local36.anInt4615 = this.anInt6496 - this.anInt6471;
			local36.anInt4619 = this.anInt6475 - this.anInt6466;
			local36.anInt4617 = this.anInt6474 - this.anInt6471;
		}
		@Pc(78) int local78 = this.anInt6471 * this.anInt6478 + this.anInt6466;
		for (@Pc(81) int local81 = this.anInt6471; local81 < this.anInt6474; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt6468; local84++) {
				this.aClass118Array1[local84].aClass170_2.anIntArray459[local81 - this.anInt6471] = local78;
			}
			local78 += this.anInt6478;
		}
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
	@Override
	public void method5826(@OriginalArg(0) int arg0) {
		this.aClass118Array1[arg0].method2943(null);
	}

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "()Z")
	@Override
	public boolean method5860() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.P(0, 0, this.anInt6478, this.anInt6488, arg0, 0);
	}

	@OriginalMember(owner = "client!sr", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6486 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt6486 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt6486 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt6486 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt6486 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean432 = false;
		} else {
			this.aBoolean432 = true;
		}
	}

	@OriginalMember(owner = "client!sr", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		this.anInt6476 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!e;Lclient!ip;Lclient!c;Lclient!pr;I)V")
	@Override
	public void method5845(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class40_Sub8 arg3) {
		((Class63_Sub1) arg0).method2149(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class80 method5838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt6478 + arg0;
		@Pc(16) int local16 = this.anInt6478 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray628[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class80_Sub2_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class80_Sub2_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "()V")
	@Override
	public void method5844() {
		this.aClass267_68.method6011();
	}

	@OriginalMember(owner = "client!sr", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)V")
	@Override
	public void method5842(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt6471 || arg1 >= this.anInt6474) {
			return;
		}
		if (arg0 < this.anInt6466) {
			arg2 -= this.anInt6466 - arg0;
			arg0 = this.anInt6466;
		}
		if (arg0 + arg2 > this.anInt6475) {
			arg2 = this.anInt6475 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt6478;
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

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "()Z")
	@Override
	public boolean method5824() {
		return true;
	}

	@OriginalMember(owner = "client!sr", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat109 = arg0;
		this.aFloat108 = arg1;
		this.method5093();
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5827(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas6 = null;
			this.aClass10_Sub3_1 = null;
			if (this.aClass80_20 == null) {
				this.anIntArray628 = null;
				this.anInt6478 = this.anInt6488 = 1;
				this.method5094();
			}
			return;
		}
		@Pc(10) Class10_Sub3 local10 = (Class10_Sub3) this.aClass167_28.method3709((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas6 = arg0;
		this.aClass10_Sub3_1 = local10;
		if (this.aClass80_20 != null) {
			return;
		}
		this.anIntArray628 = local10.anIntArray476;
		this.anInt6478 = local10.anInt4833;
		this.anInt6488 = local10.anInt4831;
		this.method5094();
		return;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!im;")
	public Class118 method5089(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6468; local1++) {
			if (this.aClass118Array1[local1].aRunnable1 == arg0) {
				return this.aClass118Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "()I")
	@Override
	public int method5854() {
		return 0;
	}

	@OriginalMember(owner = "client!sr", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt6478;
		@Pc(35) int local35 = this.anInt6478 - arg2;
		if (arg1 + arg3 > this.anInt6474) {
			arg3 -= arg1 + arg3 - this.anInt6474;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt6471) {
			local59 = this.anInt6471 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt6478;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt6475) {
			local59 = arg0 + arg2 - this.anInt6475;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt6466) {
			local59 = this.anInt6466 - arg0;
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

	@OriginalMember(owner = "client!sr", name = "A", descriptor = "()Z")
	@Override
	public boolean method5881() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V")
	@Override
	public void method5832(@OriginalArg(0) int arg0) {
		this.aClass118Array1[arg0].method2943(Thread.currentThread());
	}

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "()Z")
	@Override
	public boolean method5867() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!qg;)V")
	@Override
	public void method5835(@OriginalArg(0) Class30 arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt6466) {
			arg2 -= this.anInt6466 - arg0;
			arg0 = this.anInt6466;
		}
		if (arg1 < this.anInt6471) {
			arg3 -= this.anInt6471 - arg1;
			arg1 = this.anInt6471;
		}
		if (arg0 + arg2 > this.anInt6475) {
			arg2 = this.anInt6475 - arg0;
		}
		if (arg1 + arg3 > this.anInt6474) {
			arg3 = this.anInt6474 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt6475 || arg1 > this.anInt6474) {
			return;
		}
		@Pc(67) int local67 = this.anInt6478 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt6478;
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
						local221 = this.anIntArray628[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray628[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray628[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray628[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5871(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			this.method5827(null);
		}
		@Pc(15) Class10_Sub3 local15 = (Class10_Sub3) this.aClass167_28.method3709((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6033();
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIIII)V")
	public void method5090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface7_8.method4447(arg5).aBoolean476) {
			this.ZA(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt6497 != arg5) {
			@Pc(26) Class80 local26 = (Class80) this.aClass267_69.method6014((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method5092(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method5098(arg5) ? 64 : 128;
				local26 = this.method5823(local32, local43, local43, local43);
				this.aClass267_69.method6008(local26, (long) arg5);
			}
			this.anInt6497 = arg5;
			this.aClass80_21 = local26;
		}
		this.aClass80_21.ya(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!pn;IIII)Lclient!e;")
	@Override
	public Class63 method5864(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class63_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!sr", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat109;
	}

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "()Z")
	@Override
	public boolean method5859() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt6478 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray628[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!sr", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6466;
		arg0[1] = this.anInt6471;
		arg0[2] = this.anInt6475;
		arg0[3] = this.anInt6474;
	}

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "()V")
	@Override
	protected void method5841() {
		if (this.aBoolean429) {
			Static228.method3402(true, false);
			this.aBoolean429 = false;
		}
		this.aClass10_Sub3_1 = null;
		this.aCanvas6 = null;
		this.aClass167_28 = null;
		this.aBoolean428 = true;
	}

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5829() {
		return new Class34_Sub2();
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "()V")
	@Override
	public void method5821() {
		if (this.aCanvas6 == null || this.aClass10_Sub3_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas6.getGraphics();
			this.aClass10_Sub3_1.method3891(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)Lclient!n;")
	@Override
	public Class10_Sub29 method5852(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sr", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class49_Sub1 local2 = (Class49_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray102;
		@Pc(8) int[] local8 = local2.anIntArray103;
		@Pc(20) int local20;
		if (this.anInt6474 < arg3 + local5.length) {
			local20 = this.anInt6474 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt6471 > arg3) {
			local33 = this.anInt6471 - arg3;
			arg3 = this.anInt6471;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt6478;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt6466 > local58) {
				local62 -= this.anInt6466 - local58;
				local58 = this.anInt6466;
			}
			if (this.anInt6475 < local58 + local62) {
				local62 = this.anInt6475 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray628[local58++] = arg0;
			}
			local49 += this.anInt6478;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5825(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class10_Sub3 local8 = (Class10_Sub3) this.aClass167_28.method3709((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method6033();
		local8 = Static197.method3130(arg0);
		this.aClass167_28.method3705(local8, (long) arg0.hashCode());
		if (this.aCanvas6 != arg0 || this.aClass80_20 != null) {
			return;
		}
		this.aClass10_Sub3_1 = local8;
		this.anIntArray628 = local8.anIntArray476;
		this.anInt6478 = local8.anInt4833;
		this.anInt6488 = local8.anInt4831;
		this.method5094();
	}

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass34_Sub2_3.anInt7327 + (this.aClass34_Sub2_3.anInt7325 * arg0 + this.aClass34_Sub2_3.anInt7321 * arg1 + this.aClass34_Sub2_3.anInt7326 * arg2 >> 15);
		if (local23 < this.anInt6480 || local23 > this.anInt6469) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt6481 * (this.aClass34_Sub2_3.anInt7324 + (this.aClass34_Sub2_3.anInt7323 * arg0 + this.aClass34_Sub2_3.anInt7319 * arg1 + this.aClass34_Sub2_3.anInt7320 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt6487 * (this.aClass34_Sub2_3.anInt7328 + (this.aClass34_Sub2_3.anInt7329 * arg0 + this.aClass34_Sub2_3.anInt7318 * arg1 + this.aClass34_Sub2_3.anInt7322 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt6479 && local73 <= this.anInt6495 && local102 >= this.anInt6492 && local102 <= this.anInt6472) {
			arg3[0] = local73 - this.anInt6479;
			arg3[1] = local102 - this.anInt6492;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "()V")
	@Override
	public void method5862() {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([Lclient!e;Lclient!ip;Lclient!c;[Lclient!pr;I)V")
	@Override
	public void method5873(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class40_Sub8[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class63_Sub1[] local3 = new Class63_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class63_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class63_Sub1 local26 = Static123.method2145(this, local3);
		local26.method2149(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class49 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class49_Sub1 local2 = (Class49_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray102;
		@Pc(8) int[] local8 = local2.anIntArray103;
		@Pc(17) int local17 = this.anInt6471 > arg7 ? this.anInt6471 : arg7;
		@Pc(32) int local32 = this.anInt6474 < arg7 + local5.length ? this.anInt6474 : arg7 + local5.length;
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
					if (local129 >= this.anInt6466 && local129 < this.anInt6475 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray628[local129 + arg1 * this.anInt6478] = arg4;
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
					if (local133 >= this.anInt6466 && local133 < this.anInt6475 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt6478;
						local248 = this.anIntArray628[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray628[local133 + arg1 * this.anInt6478] = local201 + local584;
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
		if (arg0 < this.anInt6466) {
			arg1 += local83 * (this.anInt6466 - arg0);
			arg0 = this.anInt6466;
		}
		if (arg2 >= this.anInt6475) {
			arg2 = this.anInt6475 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray628[arg0 + local129 * this.anInt6478] = arg4;
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
					local243 = arg0 + local133 * this.anInt6478;
					local248 = this.anIntArray628[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray628[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "(I)Z")
	public boolean method5091(@OriginalArg(0) int arg0) {
		return super.anInterface7_8.method4450(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(Z)V")
	@Override
	public void method5868(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class49 method5863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class49_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "(I)[I")
	private int[] method5092(@OriginalArg(0) int arg0) {
		@Pc(2) Class267 local2 = this.aClass267_68;
		@Pc(12) Class10_Sub22 local12;
		synchronized (this.aClass267_68) {
			local12 = (Class10_Sub22) this.aClass267_68.method6014((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_8.method4450(arg0)) {
					return null;
				}
				@Pc(32) Class259 local32 = super.anInterface7_8.method4447(arg0);
				@Pc(42) int local42 = local32.aBoolean474 || this.aBoolean431 ? 64 : 128;
				local12 = new Class10_Sub22(arg0, local42, super.anInterface7_8.method4451(local42, arg0, 0.7F, local42), local32.aBoolean473);
				this.aClass267_68.method6008(local12, (long) arg0);
			}
		}
		local12.aBoolean262 = true;
		return local12.method3116();
	}

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "()V")
	@Override
	public void method5877() {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)I")
	@Override
	public int method5822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class118 local3 = this.method5089(Thread.currentThread());
		@Pc(6) Class170 local6 = local3.aClass170_2;
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
		@Pc(93) int local93 = arg0 - local6.method3724();
		@Pc(98) int local98 = arg1 - local6.method3729();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt4616 = 0;
		local6.aBoolean310 = local102 < 0 || local102 > local6.anInt4619 || local106 < 0 || local106 > local6.anInt4619 || local112 < 0 || local112 > local6.anInt4619;
		local6.method3735(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean310 = local102 < 0 || local102 > local6.anInt4619 || local106 < 0 || local106 > local6.anInt4619 || local118 < 0 || local118 > local6.anInt4619;
		local6.method3735(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!sr", name = "D", descriptor = "()V")
	private void method5093() {
		if (this.aFloat108 == 0.0F) {
			this.anInt6490 = this.anInt6469;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt6469;
		@Pc(12) float local12 = (float) this.anInt6480;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat109 / (this.aFloat108 + this.aFloat109);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat108;
		this.anInt6490 = (int) (((float) this.anInt6469 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ef;Z)Lclient!o;")
	@Override
	public Class80 method5861(@OriginalArg(0) Class66 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray150;
		@Pc(5) byte[] local5 = arg0.aByteArray15;
		@Pc(8) int local8 = arg0.anInt1861;
		@Pc(11) int local11 = arg0.anInt1862;
		@Pc(76) Class80_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray16 == null) {
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
			local76 = new Class80_Sub2_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray16;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class80_Sub2_Sub3(this, local20, local8, local11);
				local76 = new Class80_Sub2_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class80_Sub2_Sub3(this, local20, local8, local11);
			}
		}
		local76.ha(arg0.anInt1865, arg0.anInt1864, arg0.anInt1863, arg0.anInt1866);
		return local76;
	}

	@OriginalMember(owner = "client!sr", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return 0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIF)Lclient!bk;")
	@Override
	public Class10_Sub4 method5872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "()V")
	@Override
	public void method5848() {
	}

	@OriginalMember(owner = "client!sr", name = "E", descriptor = "()V")
	private void method5094() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6468; local1++) {
			this.aClass118Array1[local1].method2940();
		}
		this.va();
	}

	@OriginalMember(owner = "client!sr", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt6480;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5865(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas6 == null || this.aClass10_Sub3_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas6.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt6478 && local21.y <= this.anInt6488 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass10_Sub3_1.method3893(local14, local21.width, local21.height, local21.x, local21.y);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!sr", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class34 arg0) {
		this.aClass34_Sub2_3 = (Class34_Sub2) arg0;
	}

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt6469;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(Z)V")
	@Override
	public void method5866(@OriginalArg(0) boolean arg0) {
		this.aBoolean431 = arg0;
		this.aClass267_68.method6011();
	}

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt6486 = this.anInt6494;
		this.aBoolean430 = false;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class80 method5823(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class80_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class80_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class80_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class80_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "(I)[I")
	public int[] method5095(@OriginalArg(0) int arg0) {
		@Pc(2) Class267 local2 = this.aClass267_68;
		@Pc(12) Class10_Sub22 local12;
		synchronized (this.aClass267_68) {
			local12 = (Class10_Sub22) this.aClass267_68.method6014((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_8.method4450(arg0)) {
					return null;
				}
				@Pc(32) Class259 local32 = super.anInterface7_8.method4447(arg0);
				@Pc(42) int local42 = local32.aBoolean474 || this.aBoolean431 ? 64 : 128;
				local12 = new Class10_Sub22(arg0, local42, super.anInterface7_8.method4448(true, local42, 0.7F, arg0, local42), local32.aBoolean473);
				this.aClass267_68.method6008(local12, (long) arg0);
			}
		}
		local12.aBoolean262 = true;
		return local12.method3116();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5814(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
	@Override
	public void method5837(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
	@Override
	public void method5818(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt6465;
		for (@Pc(9) Object local9 = this.aClass267_68.method6016(); local9 != null; local9 = this.aClass267_68.method6015()) {
			@Pc(13) Class10_Sub22 local13 = (Class10_Sub22) local9;
			if (local13.aBoolean262) {
				local13.anInt3922 += local4;
				@Pc(27) int local27 = local13.anInt3922 / 20;
				if (local27 > 0) {
					@Pc(36) Class259 local36 = super.anInterface7_8.method4447(local13.anInt3921);
					local13.method3114(local36.aByte101 * local4 * 50 / 1000, local36.aByte104 * local4 * 50 / 1000);
					local13.anInt3922 -= local27 * 20;
				}
				local13.aBoolean262 = false;
			}
		}
		this.anInt6465 = arg0;
		this.aClass267_69.method6007(5);
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method5874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.ma(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.ma(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt6466) {
					arg1 += local104 * (this.anInt6466 - arg0);
					arg0 = this.anInt6466;
				}
				if (arg2 >= this.anInt6475) {
					arg2 = this.anInt6475 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt6471 && local150 < this.anInt6474) {
							this.anIntArray628[arg0 + local150 * this.anInt6478] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt6471 && local213 < this.anInt6474) {
							local228 = arg0 + local213 * this.anInt6478;
							local233 = this.anIntArray628[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray628[local228] = local204 + local233;
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
				if (arg1 < this.anInt6471) {
					arg0 += local104 * (this.anInt6471 - arg1);
					arg1 = this.anInt6471;
				}
				if (arg3 >= this.anInt6474) {
					arg3 = this.anInt6474 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt6466 && local150 < this.anInt6475) {
							this.anIntArray628[local150 + arg1 * this.anInt6478] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt6466 && local213 < this.anInt6475) {
							local228 = local213 + arg1 * this.anInt6478;
							local233 = this.anIntArray628[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray628[local213 + arg1 * this.anInt6478] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.IA(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.IA(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5879(@OriginalArg(0) Class10_Sub29 arg0) {
	}

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "(I)Z")
	public boolean method5096(@OriginalArg(0) int arg0) {
		return super.anInterface7_8.method4447(arg0).aBoolean475;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!ip;)V")
	@Override
	public void method5855(@OriginalArg(0) Class121 arg0) {
		@Pc(3) Class40_Sub2 local3 = arg0.aClass197_1.aClass40_Sub2_9;
		for (@Pc(6) Class40_Sub2 local6 = local3.aClass40_Sub2_7; local6 != local3; local6 = local6.aClass40_Sub2_7) {
			@Pc(10) Class40_Sub2_Sub1 local10 = (Class40_Sub2_Sub1) local6;
			@Pc(15) int local15 = local10.anInt1779 >> 12;
			@Pc(20) int local20 = local10.anInt1780 >> 12;
			@Pc(25) int local25 = local10.anInt1778 >> 12;
			@Pc(49) int local49 = this.aClass34_Sub2_3.anInt7327 + (this.aClass34_Sub2_3.anInt7325 * local15 + this.aClass34_Sub2_3.anInt7321 * local20 + this.aClass34_Sub2_3.anInt7326 * local25 >> 15);
			if (local49 >= this.anInt6480 && local49 <= this.anInt6470) {
				@Pc(90) int local90 = this.anInt6477 + this.anInt6481 * (this.aClass34_Sub2_3.anInt7324 + (this.aClass34_Sub2_3.anInt7323 * local15 + this.aClass34_Sub2_3.anInt7319 * local20 + this.aClass34_Sub2_3.anInt7320 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt6496 + this.anInt6487 * (this.aClass34_Sub2_3.anInt7328 + (this.aClass34_Sub2_3.anInt7329 * local15 + this.aClass34_Sub2_3.anInt7318 * local20 + this.aClass34_Sub2_3.anInt7322 * local25 >> 15)) / local49;
				if (local90 >= this.anInt6466 && local90 <= this.anInt6475 && local122 >= this.anInt6471 && local122 <= this.anInt6474) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method5097(local10, local90, local122, (local10.anInt1782 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "()Z")
	@Override
	public boolean method5808() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(2) int local2 = this.anInt6473;
		this.anInt6473 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!sr", name = "B", descriptor = "()Z")
	@Override
	public boolean method5882() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "()Z")
	@Override
	public boolean method5843() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt6478) {
			arg2 = this.anInt6478;
		}
		if (arg3 > this.anInt6488) {
			arg3 = this.anInt6488;
		}
		this.anInt6466 = arg0;
		this.anInt6475 = arg2;
		this.anInt6471 = arg1;
		this.anInt6474 = arg3;
		this.method5088();
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "()Z")
	@Override
	public boolean method5813() {
		return true;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!il;III)V")
	public void method5097(@OriginalArg(0) Class40_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt1783;
		@Pc(6) int local6 = arg3 >> 1;
		if (local2 == -1) {
			this.ZA(arg1, arg2, local6, arg0.anInt1781, 1);
			return;
		}
		if (this.anInt6497 != local2) {
			@Pc(30) Class80 local30 = (Class80) this.aClass267_69.method6014((long) local2);
			if (local30 == null) {
				@Pc(36) int[] local36 = this.method5092(local2);
				if (local36 == null) {
					return;
				}
				@Pc(46) int local46 = this.method5098(local2) ? 64 : 128;
				local30 = this.method5823(local36, local46, local46, local46);
				this.aClass267_69.method6008(local30, (long) local2);
			}
			this.anInt6497 = local2;
			this.aClass80_21 = local30;
		}
		if (this.aClass80_21.RA() == 64) {
			arg3 <<= 0x1;
			local6 <<= 0x1;
		}
		this.aClass80_21.ya(arg1 - local6, arg2 - local6, arg3, arg3, 0, arg0.anInt1781, 1);
	}

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "()V")
	@Override
	public void method5828() {
	}

	@OriginalMember(owner = "client!sr", name = "q", descriptor = "()Z")
	@Override
	public boolean method5850() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5819() {
		@Pc(3) Class118 local3 = this.method5089(Thread.currentThread());
		return local3.aClass34_Sub2_2;
	}

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "()Z")
	@Override
	public boolean method5875() {
		return true;
	}

	@OriginalMember(owner = "client!sr", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt6466 || arg0 >= this.anInt6475) {
			return;
		}
		if (arg1 < this.anInt6471) {
			arg2 -= this.anInt6471 - arg1;
			arg1 = this.anInt6471;
		}
		if (arg1 + arg2 > this.anInt6474) {
			arg2 = this.anInt6474 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt6478;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray628[local40 + local54 * this.anInt6478] = arg3;
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
				local111 = local40 + local103 * this.anInt6478;
				local116 = this.anIntArray628[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray628[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt6478;
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

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!pr;I)V")
	@Override
	public void method5858(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class40_Sub8[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class63_Sub1[] local3 = new Class63_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class63_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class63_Sub1 local26 = Static123.method2145(this, local3);
		local26.method2149(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6489 = arg0;
		this.anInt6486 = arg1;
		this.anInt6485 = arg2;
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5880(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class10_Sub3 local8 = (Class10_Sub3) this.aClass167_28.method3709((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static197.method3130(arg0);
			this.aClass167_28.method3705(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!sr", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt6466 = 0;
		this.anInt6471 = 0;
		this.anInt6475 = this.anInt6478;
		this.anInt6474 = this.anInt6488;
		this.method5088();
	}

	@OriginalMember(owner = "client!sr", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt6471) {
			local8 = this.anInt6471;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt6474) {
			local21 = this.anInt6474;
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
				if (local91 < this.anInt6466) {
					local91 = this.anInt6466;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6475) {
					local102 = this.anInt6475;
				}
				local116 = local91 + local30 * this.anInt6478;
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
				if (local91 < this.anInt6466) {
					local91 = this.anInt6466;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6475 - 1) {
					local102 = this.anInt6475 - 1;
				}
				local116 = local91 + local30 * this.anInt6478;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray628[local116++] = arg3;
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
				if (local102 < this.anInt6466) {
					local102 = this.anInt6466;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt6475) {
					local116 = this.anInt6475;
				}
				local118 = local102 + local30 * this.anInt6478;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray628[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray628[local118++] = local277 + local340;
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
				if (local102 < this.anInt6466) {
					local102 = this.anInt6466;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt6475 - 1) {
					local116 = this.anInt6475 - 1;
				}
				local118 = local102 + local30 * this.anInt6478;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray628[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray628[local118++] = local277 + local340;
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
				if (local91 < this.anInt6466) {
					local91 = this.anInt6466;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6475) {
					local102 = this.anInt6475;
				}
				local116 = local91 + local30 * this.anInt6478;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray628[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray628[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt6466) {
					local91 = this.anInt6466;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6475 - 1) {
					local102 = this.anInt6475 - 1;
				}
				local116 = local91 + local30 * this.anInt6478;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray628[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray628[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "()Z")
	@Override
	public boolean method5876() {
		return true;
	}

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "()Z")
	@Override
	public boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!sr", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6466 < arg0) {
			this.anInt6466 = arg0;
		}
		if (this.anInt6471 < arg1) {
			this.anInt6471 = arg1;
		}
		if (this.anInt6475 > arg2) {
			this.anInt6475 = arg2;
		}
		if (this.anInt6474 > arg3) {
			this.anInt6474 = arg3;
		}
		this.method5088();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[Lclient!bk;)V")
	@Override
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub4[] arg1) {
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(IIIIII)Lclient!qg;")
	@Override
	public Class30 method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!sr", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt6493 = (int) (arg1 * 65535.0F);
		this.anInt6467 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt6482 = (int) (arg3 * 65535.0F / local26);
		this.anInt6484 = (int) (arg4 * 65535.0F / local26);
		this.anInt6483 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!sr", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass34_Sub2_3.anInt7325 * arg0 + this.aClass34_Sub2_3.anInt7321 * arg1 + this.aClass34_Sub2_3.anInt7326 * arg2 >> 15) + this.aClass34_Sub2_3.anInt7327;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass34_Sub2_3.anInt7325 * arg3 + this.aClass34_Sub2_3.anInt7321 * arg4 + this.aClass34_Sub2_3.anInt7326 * arg5 >> 15) + this.aClass34_Sub2_3.anInt7327;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt6480 && local52 < this.anInt6480 || !(local23 <= this.anInt6469 || local52 <= this.anInt6469)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt6481 * ((this.aClass34_Sub2_3.anInt7323 * arg0 + this.aClass34_Sub2_3.anInt7319 * arg1 + this.aClass34_Sub2_3.anInt7320 * arg2 >> 15) + this.aClass34_Sub2_3.anInt7324) / local23;
		@Pc(133) int local133 = this.anInt6481 * ((this.aClass34_Sub2_3.anInt7323 * arg3 + this.aClass34_Sub2_3.anInt7319 * arg4 + this.aClass34_Sub2_3.anInt7320 * arg5 >> 15) + this.aClass34_Sub2_3.anInt7324) / local52;
		if (local104 < this.anInt6479 && local133 < this.anInt6479 || local104 > this.anInt6495 && local133 > this.anInt6495) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt6487 * ((this.aClass34_Sub2_3.anInt7329 * arg0 + this.aClass34_Sub2_3.anInt7318 * arg1 + this.aClass34_Sub2_3.anInt7322 * arg2 >> 15) + this.aClass34_Sub2_3.anInt7328) / local23;
			@Pc(209) int local209 = this.anInt6487 * ((this.aClass34_Sub2_3.anInt7329 * arg3 + this.aClass34_Sub2_3.anInt7318 * arg4 + this.aClass34_Sub2_3.anInt7322 * arg5 >> 15) + this.aClass34_Sub2_3.anInt7328) / local52;
			return (local180 >= this.anInt6492 || local209 >= this.anInt6492) && (local180 <= this.anInt6472 || local209 <= this.anInt6472);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class154 method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class154_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "(I)Z")
	public boolean method5098(@OriginalArg(0) int arg0) {
		return this.aBoolean431 || super.anInterface7_8.method4447(arg0).aBoolean474;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	@Override
	public void method5817(@OriginalArg(0) int arg0) {
		if (this.anInt6468 == arg0) {
			return;
		}
		this.anInt6468 = arg0;
		this.aClass118Array1 = new Class118[this.anInt6468];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6468; local14++) {
			this.aClass118Array1[local14] = new Class118(this);
		}
	}
}
