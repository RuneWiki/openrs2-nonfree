import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!cba", name = "Y", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!cba", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!cba", name = "eb", descriptor = "Z")
	private boolean aBoolean92;

	@OriginalMember(owner = "client!cba", name = "J", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!cba", name = "E", descriptor = "Lclient!or;")
	public Class5_Sub18 aClass5_Sub18_1;

	@OriginalMember(owner = "client!cba", name = "nb", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!cba", name = "L", descriptor = "Z")
	private boolean aBoolean93;

	@OriginalMember(owner = "client!cba", name = "cb", descriptor = "Lclient!qha;")
	private Class291 aClass291_3;

	@OriginalMember(owner = "client!cba", name = "mb", descriptor = "I")
	public int anInt1028;

	@OriginalMember(owner = "client!cba", name = "bb", descriptor = "Lclient!wq;")
	private final Class391 aClass391_8;

	@OriginalMember(owner = "client!cba", name = "qb", descriptor = "I")
	private int anInt1029;

	@OriginalMember(owner = "client!cba", name = "z", descriptor = "I")
	public int anInt1030;

	@OriginalMember(owner = "client!cba", name = "hb", descriptor = "I")
	private int anInt1031;

	@OriginalMember(owner = "client!cba", name = "R", descriptor = "I")
	public int anInt1032;

	@OriginalMember(owner = "client!cba", name = "N", descriptor = "I")
	public int anInt1033;

	@OriginalMember(owner = "client!cba", name = "rb", descriptor = "Lclient!wq;")
	private final Class391 aClass391_9;

	@OriginalMember(owner = "client!cba", name = "C", descriptor = "Z")
	private boolean aBoolean94;

	@OriginalMember(owner = "client!cba", name = "ib", descriptor = "I")
	public int anInt1034;

	@OriginalMember(owner = "client!cba", name = "ab", descriptor = "Lclient!tp;")
	public Class203_Sub3 aClass203_Sub3_1;

	@OriginalMember(owner = "client!cba", name = "w", descriptor = "I")
	public int anInt1035;

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "I")
	private int anInt1036;

	@OriginalMember(owner = "client!cba", name = "S", descriptor = "I")
	public int anInt1037;

	@OriginalMember(owner = "client!cba", name = "O", descriptor = "I")
	public int anInt1038;

	@OriginalMember(owner = "client!cba", name = "pb", descriptor = "I")
	public int anInt1039;

	@OriginalMember(owner = "client!cba", name = "Q", descriptor = "I")
	public int anInt1040;

	@OriginalMember(owner = "client!cba", name = "D", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!cba", name = "U", descriptor = "I")
	public int anInt1042;

	@OriginalMember(owner = "client!cba", name = "fb", descriptor = "[F")
	public float[] aFloatArray9;

	@OriginalMember(owner = "client!cba", name = "db", descriptor = "I")
	public int anInt1043;

	@OriginalMember(owner = "client!cba", name = "V", descriptor = "I")
	public int anInt1044;

	@OriginalMember(owner = "client!cba", name = "H", descriptor = "I")
	public int anInt1045;

	@OriginalMember(owner = "client!cba", name = "jb", descriptor = "I")
	public int anInt1046;

	@OriginalMember(owner = "client!cba", name = "Z", descriptor = "I")
	private int anInt1047;

	@OriginalMember(owner = "client!cba", name = "A", descriptor = "I")
	private int anInt1048;

	@OriginalMember(owner = "client!cba", name = "K", descriptor = "I")
	public int anInt1049;

	@OriginalMember(owner = "client!cba", name = "B", descriptor = "I")
	public int anInt1050;

	@OriginalMember(owner = "client!cba", name = "sb", descriptor = "Lclient!cj;")
	private Class69 aClass69_1;

	@OriginalMember(owner = "client!cba", name = "X", descriptor = "I")
	public int anInt1051;

	@OriginalMember(owner = "client!cba", name = "y", descriptor = "[Lclient!mp;")
	private Class240[] aClass240Array1;

	@OriginalMember(owner = "client!cba", name = "gb", descriptor = "[F")
	public float[] aFloatArray10;

	@OriginalMember(owner = "client!cba", name = "G", descriptor = "I")
	public int anInt1052;

	@OriginalMember(owner = "client!cba", name = "ob", descriptor = "I")
	public int anInt1053;

	@OriginalMember(owner = "client!cba", name = "M", descriptor = "[I")
	public int[] anIntArray52;

	@OriginalMember(owner = "client!cba", name = "v", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!cba", name = "kb", descriptor = "I")
	public int anInt1055;

	@OriginalMember(owner = "client!cba", name = "I", descriptor = "I")
	public int anInt1056;

	@OriginalMember(owner = "client!cba", name = "W", descriptor = "I")
	public int anInt1057;

	@OriginalMember(owner = "client!cba", name = "T", descriptor = "Lclient!fs;")
	private Class134 aClass134_6;

	@OriginalMember(owner = "client!cba", name = "F", descriptor = "I")
	private int anInt1058;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class57_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method7727(arg0, arg2, arg3);
			this.method7669(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method7722();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class57_Sub1(@OriginalArg(0) Interface1 arg0) {
		super(arg0);
		this.aBoolean92 = false;
		this.aBoolean93 = false;
		this.aClass291_3 = new Class291(4);
		this.anInt1028 = 50;
		this.anInt1033 = 0;
		this.anInt1035 = 128;
		this.anInt1037 = 0;
		this.anInt1030 = 512;
		this.anInt1036 = 0;
		this.aBoolean94 = false;
		this.anInt1045 = 45823;
		this.anInt1029 = 0;
		this.anInt1044 = 0;
		this.anInt1049 = 78642;
		this.anInt1051 = 3500;
		this.anInt1050 = 512;
		this.anInt1052 = 0;
		this.anInt1038 = 75518;
		this.aClass391_8 = new Class391(16);
		this.anInt1058 = -1;
		try {
			this.aClass391_9 = new Class391(256);
			this.aClass203_Sub3_1 = new Class203_Sub3();
			this.method7690(1);
			this.method7671(0);
			Static303.method4654(true, true);
			this.aBoolean92 = true;
			this.anInt1027 = (int) Static515.method7499(75);
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method7722();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.method1080(Thread.currentThread());
		this.anInt1028 = arg0;
		this.anInt1051 = arg1;
		local3.anInt6452 = this.anInt1051 - 255;
	}

	@OriginalMember(owner = "client!cba", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1052;
		arg0[1] = this.anInt1033;
		arg0[2] = this.anInt1037;
		arg0[3] = this.anInt1044;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!cba", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt1051;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7669(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas2 = null;
			this.aClass5_Sub18_1 = null;
			if (this.aClass69_1 == null) {
				this.anIntArray52 = null;
				this.anInt1042 = this.anInt1031 = 1;
				this.anInt1048 = this.anInt1047 = 1;
				this.method1068();
			}
			return;
		}
		@Pc(10) Class5_Sub18 local10 = (Class5_Sub18) this.aClass291_3.method6993((long) arg0.hashCode(), 1);
		if (local10 == null) {
			return;
		}
		this.aCanvas2 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.lb = local18.width;
		this.anInt1026 = local18.height;
		this.aClass5_Sub18_1 = local10;
		if (this.aClass69_1 != null) {
			return;
		}
		this.anIntArray52 = local10.anIntArray346;
		this.anInt1042 = local10.anInt6328;
		this.anInt1031 = local10.anInt6326;
		if (this.anInt1042 != this.anInt1048 || this.anInt1031 != this.anInt1047) {
			this.anInt1054 = this.anInt1048 = this.anInt1042;
			this.anInt1041 = this.anInt1047 = this.anInt1031;
			this.aFloatArray9 = this.aFloatArray10 = new float[this.anInt1048 * this.anInt1047];
		}
		this.method1068();
		return;
	}

	@OriginalMember(owner = "client!cba", name = "n", descriptor = "(I)Z")
	public boolean method1066(@OriginalArg(0) int arg0) {
		return super.anInterface1_11.method2863(arg0).aBoolean478 || super.anInterface1_11.method2863(arg0).aBoolean480;
	}

	@OriginalMember(owner = "client!cba", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray97;
		@Pc(8) int[] local8 = local2.anIntArray95;
		@Pc(20) int local20;
		if (this.anInt1044 < arg3 + local5.length) {
			local20 = this.anInt1044 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1033 > arg3) {
			local33 = this.anInt1033 - arg3;
			arg3 = this.anInt1033;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(50) int local50 = arg3 * this.anInt1042;
		for (@Pc(52) int local52 = local33; local52 < local20; local52++) {
			@Pc(59) int local59 = arg2 + local5[local52];
			@Pc(63) int local63 = local8[local52];
			if (this.anInt1052 > local59) {
				local63 -= this.anInt1052 - local59;
				local59 = this.anInt1052;
			}
			if (this.anInt1037 < local59 + local63) {
				local63 = this.anInt1037 - local59;
			}
			local59 += local50;
			for (@Pc(95) int local95 = -local63; local95 < 0; local95++) {
				this.anIntArray52[local59++] = arg0;
			}
			local50 += this.anInt1042;
		}
	}

	@OriginalMember(owner = "client!cba", name = "A", descriptor = "()V")
	@Override
	public void method7663() {
		if (this.aCanvas2 == null) {
			this.anInt1042 = 1;
			this.anInt1031 = 1;
			this.anIntArray52 = null;
			this.anInt1048 = 1;
			this.anInt1047 = 1;
			this.aFloatArray10 = null;
		} else {
			this.anIntArray52 = this.aClass5_Sub18_1.anIntArray346;
			this.anInt1042 = this.aClass5_Sub18_1.anInt6328;
			this.anInt1031 = this.aClass5_Sub18_1.anInt6326;
			this.aFloatArray10 = this.aFloatArray9;
			this.anInt1048 = this.anInt1054;
			this.anInt1047 = this.anInt1041;
		}
		this.aClass69_1 = null;
		this.method1068();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIZ)Lclient!fs;")
	@Override
	public Class134 method7712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1042 + arg0;
		@Pc(16) int local16 = this.anInt1042 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray52[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class134_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class134_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(IIIIII)Lclient!ol;")
	@Override
	public Class29 method7667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
			@Pc(110) int local110;
			@Pc(143) int local143;
			@Pc(161) int local161;
			@Pc(229) int local229;
			@Pc(246) int local246;
			@Pc(251) int local251;
			@Pc(331) int local331;
			@Pc(220) int local220;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(100) int local100 = arg3 << 16;
				local110 = (int) Math.floor((double) local100 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt1052) {
					arg1 += local110 * (this.anInt1052 - arg0);
					arg0 = this.anInt1052;
				}
				if (arg2 >= this.anInt1037) {
					arg2 = this.anInt1037 - 1;
				}
				local143 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local143 == 255) {
					while (arg0 <= arg2) {
						local161 = arg1 >> 16;
						if (local161 >= this.anInt1033 && local161 < this.anInt1044) {
							this.anIntArray52[arg0 + local161 * this.anInt1042] = arg4;
						}
						arg1 += local110;
						arg0++;
					}
				} else if (arg5 == 1) {
					local220 = ((arg4 & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local143 >> 8 & 0xFF00) + (local143 << 24);
					local161 = 256 - local143;
					while (arg0 <= arg2) {
						local229 = arg1 >> 16;
						if (local229 >= this.anInt1033 && local229 < this.anInt1044) {
							local246 = arg0 + local229 * this.anInt1042;
							local251 = this.anIntArray52[local246];
							local251 = ((local251 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((local251 & 0xFF00) * local161 >> 8 & 0xFF00);
							this.anIntArray52[local246] = local220 + local251;
						}
						arg1 += local110;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local161 = arg1 >> 16;
						if (local161 >= this.anInt1033 && local161 < this.anInt1044) {
							local229 = arg0 + local161 * this.anInt1042;
							local246 = this.anIntArray52[local229];
							local251 = arg4 + local246;
							local331 = (arg4 & 0xFF00FF) + (local246 & 0xFF00FF);
							local246 = (local331 & 0x1000100) + (local251 - local331 & 0x10000);
							this.anIntArray52[local229] = local251 - local246 | local246 - (local246 >>> 8);
						}
						arg1 += local110;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(380) int local380 = arg2 << 16;
				local110 = (int) Math.floor((double) local380 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt1033) {
					arg0 += local110 * (this.anInt1033 - arg1);
					arg1 = this.anInt1033;
				}
				if (arg3 >= this.anInt1044) {
					arg3 = this.anInt1044 - 1;
				}
				local143 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local143 == 255) {
					while (arg1 <= arg3) {
						local161 = arg0 >> 16;
						if (local161 >= this.anInt1052 && local161 < this.anInt1037) {
							this.anIntArray52[local161 + arg1 * this.anInt1042] = arg4;
						}
						arg0 += local110;
						arg1++;
					}
				} else if (arg5 == 1) {
					local220 = ((arg4 & 0xFF00FF) * local143 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local143 >> 8 & 0xFF00) + (local143 << 24);
					local161 = 256 - local143;
					while (arg1 <= arg3) {
						local229 = arg0 >> 16;
						if (local229 >= this.anInt1052 && local229 < this.anInt1037) {
							local246 = local229 + arg1 * this.anInt1042;
							local251 = this.anIntArray52[local246];
							local251 = ((local251 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((local251 & 0xFF00) * local161 >> 8 & 0xFF00);
							this.anIntArray52[local229 + arg1 * this.anInt1042] = local220 + local251;
						}
						arg0 += local110;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local161 = arg0 >> 16;
						if (local161 >= this.anInt1052 && local161 < this.anInt1037) {
							local229 = local161 + arg1 * this.anInt1042;
							local246 = this.anIntArray52[local229];
							local251 = arg4 + local246;
							local331 = (arg4 & 0xFF00FF) + (local246 & 0xFF00FF);
							@Pc(626) int local626 = (local331 & 0x1000100) + (local251 - local331 & 0x10000);
							this.anIntArray52[local229] = local251 - local626 | local626 - (local626 >>> 8);
						}
						arg0 += local110;
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

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "()Z")
	@Override
	public boolean method7694() {
		return true;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(II)Lclient!rk;")
	@Override
	public Interface23 method7653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class58(arg0, arg1);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIF)Lclient!uf;")
	@Override
	public Class5_Sub43 method7680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "(I)V")
	@Override
	public void method7724() {
		Static657.anInt10592 = 10000;
		Static657.anInt10594 = 10000;
		if (this.anInt1056 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method7690(this.anInt1056);
		this.method7671(0);
	}

	@OriginalMember(owner = "client!cba", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt1057, this.anInt1043, this.anInt1050, this.anInt1030 };
	}

	@OriginalMember(owner = "client!cba", name = "B", descriptor = "()Z")
	public boolean method1067() {
		return this.aBoolean93;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I[Lclient!uf;)V")
	@Override
	public void method7716(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub43[] arg1) {
	}

	@OriginalMember(owner = "client!cba", name = "s", descriptor = "()Z")
	@Override
	public boolean method7674() {
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V")
	@Override
	public void method7650(@OriginalArg(0) int arg0) {
		this.anInt1035 = arg0;
		this.aClass391_9.method9276(0);
	}

	@OriginalMember(owner = "client!cba", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1052 < arg0) {
			this.anInt1052 = arg0;
		}
		if (this.anInt1033 < arg1) {
			this.anInt1033 = arg1;
		}
		if (this.anInt1037 > arg2) {
			this.anInt1037 = arg2;
		}
		if (this.anInt1044 > arg3) {
			this.anInt1044 = arg3;
		}
		this.method1079();
	}

	@OriginalMember(owner = "client!cba", name = "y", descriptor = "()Z")
	@Override
	public boolean method7711() {
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "()V")
	@Override
	public void method7717() {
		this.aClass391_9.method9276(0);
		this.aClass391_8.method9276(0);
	}

	@OriginalMember(owner = "client!cba", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = (arg7 << 16) / arg2;
		@Pc(26) int local26 = (arg6.length / arg7 << 16) / arg3;
		@Pc(33) int local33 = arg0 + arg1 * this.anInt1042;
		@Pc(38) int local38 = this.anInt1042 - arg2;
		if (arg1 + arg3 > this.anInt1044) {
			arg3 -= arg1 + arg3 - this.anInt1044;
		}
		@Pc(62) int local62;
		if (arg1 < this.anInt1033) {
			local62 = this.anInt1033 - arg1;
			arg3 -= local62;
			local33 += local62 * this.anInt1042;
			local11 += local26 * local62;
		}
		if (arg0 + arg2 > this.anInt1037) {
			local62 = arg0 + arg2 - this.anInt1037;
			arg2 -= local62;
			local38 += local62;
		}
		if (arg0 < this.anInt1052) {
			local62 = this.anInt1052 - arg0;
			arg2 -= local62;
			local33 += local62;
			local9 += local17 * local62;
			local38 += local62;
		}
		local62 = arg4 >>> 24;
		@Pc(135) int local135 = arg5 >>> 24;
		@Pc(154) int local154;
		@Pc(157) int local157;
		@Pc(164) int local164;
		@Pc(167) int local167;
		if (arg8 == 0 || arg8 == 1 && local62 == 255 && local135 == 255) {
			local154 = local9;
			for (local157 = -arg3; local157 < 0; local157++) {
				local164 = (local11 >> 16) * arg7;
				for (local167 = -arg2; local167 < 0; local167++) {
					if (arg6[(local9 >> 16) + local164] == 0) {
						this.anIntArray52[local33++] = arg4;
					} else {
						this.anIntArray52[local33++] = arg5;
					}
					local9 += local17;
				}
				local11 += local26;
				local9 = local154;
				local33 += local38;
			}
			return;
		}
		@Pc(233) int local233;
		@Pc(247) int local247;
		@Pc(251) int local251;
		@Pc(256) int local256;
		if (arg8 == 1) {
			local154 = local9;
			for (local157 = -arg3; local157 < 0; local157++) {
				local164 = (local11 >> 16) * arg7;
				for (local167 = -arg2; local167 < 0; local167++) {
					local233 = arg4;
					if (arg6[(local9 >> 16) + local164] != 0) {
						local233 = arg5;
					}
					local247 = local233 >>> 24;
					local251 = 255 - local247;
					local256 = this.anIntArray52[local33];
					this.anIntArray52[local33++] = ((local233 & 0xFF00FF) * local247 + (local256 & 0xFF00FF) * local251 & 0xFF00FF00) + ((local233 & 0xFF00) * local247 + (local256 & 0xFF00) * local251 & 0xFF0000) >> 8;
					local9 += local17;
				}
				local11 += local26;
				local9 = local154;
				local33 += local38;
			}
		} else if (arg8 == 2) {
			local154 = local9;
			for (local157 = -arg3; local157 < 0; local157++) {
				local164 = (local11 >> 16) * arg7;
				for (local167 = -arg2; local167 < 0; local167++) {
					local233 = arg4;
					if (arg6[(local9 >> 16) + local164] != 0) {
						local233 = arg5;
					}
					if (local233 == 0) {
						local33++;
					} else {
						local247 = this.anIntArray52[local33];
						local251 = local233 + local247;
						local256 = (local233 & 0xFF00FF) + (local247 & 0xFF00FF);
						@Pc(372) int local372 = (local256 & 0x1000100) + (local251 - local256 & 0x10000);
						this.anIntArray52[local33++] = local251 - local372 | local372 - (local372 >>> 8);
					}
					local9 += local17;
				}
				local11 += local26;
				local9 = local154;
				local33 += local38;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!iga;Z)Lclient!fs;")
	@Override
	public Class134 method7654(@OriginalArg(0) Class173 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray244;
		@Pc(5) byte[] local5 = arg0.aByteArray28;
		@Pc(8) int local8 = arg0.anInt4282;
		@Pc(11) int local11 = arg0.anInt4287;
		@Pc(80) Class134_Sub1 local80;
		@Pc(22) int[] local22;
		@Pc(27) byte[] local27;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (arg1 && arg0.aByteArray27 == null) {
			local22 = new int[local2.length];
			local27 = new byte[local8 * local11];
			for (local29 = 0; local29 < local11; local29++) {
				local34 = local29 * local8;
				for (local36 = 0; local36 < local8; local36++) {
					local27[local34 + local36] = local5[local34 + local36];
				}
			}
			for (local34 = 0; local34 < local2.length; local34++) {
				local22[local34] = local2[local34];
			}
			local80 = new Class134_Sub1_Sub1(this, local27, local22, local8, local11);
		} else {
			local22 = new int[local8 * local11];
			local27 = arg0.aByteArray27;
			if (local27 == null) {
				for (local29 = 0; local29 < local11; local29++) {
					local34 = local29 * local8;
					for (local36 = 0; local36 < local8; local36++) {
						@Pc(162) int local162 = local2[local5[local34 + local36] & 0xFF];
						local22[local34 + local36] = local162 == 0 ? 0 : local162 | 0xFF000000;
					}
				}
				local80 = new Class134_Sub1_Sub3(this, local22, local8, local11);
			} else {
				for (local29 = 0; local29 < local11; local29++) {
					local34 = local29 * local8;
					for (local36 = 0; local36 < local8; local36++) {
						local22[local34 + local36] = local2[local5[local34 + local36] & 0xFF] | local27[local34 + local36] << 24;
					}
				}
				local80 = new Class134_Sub1_Sub2(this, local22, local8, local11);
			}
		}
		local80.method9229(arg0.anInt4283, arg0.anInt4286, arg0.anInt4285, arg0.anInt4284);
		return local80;
	}

	@OriginalMember(owner = "client!cba", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1033) {
			local8 = this.anInt1033;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1044) {
			local21 = this.anInt1044;
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
		@Pc(98) int local98;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(125) int local125;
		if (arg4 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local98 = arg0 + 1 - local36;
				if (local98 < this.anInt1052) {
					local98 = this.anInt1052;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt1037) {
					local109 = this.anInt1037;
				}
				local123 = local98 + local30 * this.anInt1042;
				for (local125 = local98; local125 < local109; local125++) {
					this.anIntArray52[local123++] = arg3;
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
				local98 = arg0 - local36;
				if (local98 < this.anInt1052) {
					local98 = this.anInt1052;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt1037 - 1) {
					local109 = this.anInt1037 - 1;
				}
				local123 = local98 + local30 * this.anInt1042;
				for (local125 = local98; local125 <= local109; local125++) {
					this.anIntArray52[local123++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(287) int local287 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
		local98 = 256 - local57;
		@Pc(346) int local346;
		@Pc(352) int local352;
		while (local30 < arg1) {
			while (local48 <= local34 || local44 <= local34) {
				local44 += local36 + local36;
				local48 += local36++ + local36;
			}
			local109 = arg0 + 1 - local36;
			if (local109 < this.anInt1052) {
				local109 = this.anInt1052;
			}
			local123 = arg0 + local36;
			if (local123 > this.anInt1037) {
				local123 = this.anInt1037;
			}
			local125 = local109 + local30 * this.anInt1042;
			for (local346 = local109; local346 < local123; local346++) {
				local352 = this.anIntArray52[local125];
				@Pc(372) int local372 = ((local352 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local352 & 0xFF00) * local98 >> 8 & 0xFF00);
				this.anIntArray52[local125++] = local287 + local372;
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
			local109 = arg0 - local36;
			if (local109 < this.anInt1052) {
				local109 = this.anInt1052;
			}
			local123 = arg0 + local36;
			if (local123 > this.anInt1037 - 1) {
				local123 = this.anInt1037 - 1;
			}
			local125 = local109 + local30 * this.anInt1042;
			for (local346 = local109; local346 <= local123; local346++) {
				local352 = this.anIntArray52[local125];
				local352 = ((local352 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local352 & 0xFF00) * local98 >> 8 & 0xFF00);
				this.anIntArray52[local125++] = local287 + local352;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!cba", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1052) {
			arg2 -= this.anInt1052 - arg0;
			arg0 = this.anInt1052;
		}
		if (arg1 < this.anInt1033) {
			arg3 -= this.anInt1033 - arg1;
			arg1 = this.anInt1033;
		}
		if (arg0 + arg2 > this.anInt1037) {
			arg2 = this.anInt1037 - arg0;
		}
		if (arg1 + arg3 > this.anInt1044) {
			arg3 = this.anInt1044 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt1037 || arg1 > this.anInt1044) {
			return;
		}
		@Pc(74) int local74 = this.anInt1042 - arg2;
		@Pc(81) int local81 = arg0 + arg1 * this.anInt1042;
		@Pc(85) int local85 = arg4 >>> 24;
		@Pc(101) int local101;
		@Pc(105) int local105;
		@Pc(112) int local112;
		if (arg5 != 0 && (arg5 != 1 || local85 != 255)) {
			@Pc(231) int local231;
			if (arg5 == 1) {
				@Pc(215) int local215 = ((arg4 & 0xFF00FF) * local85 >> 8 & 0xFF00FF) + (((arg4 & 0xFF00FF00) >>> 8) * local85 & 0xFF00FF00);
				local101 = 256 - local85;
				for (local105 = 0; local105 < arg3; local105++) {
					for (local112 = -arg2; local112 < 0; local112++) {
						local231 = this.anIntArray52[local81];
						local231 = ((local231 & 0xFF00FF) * local101 >> 8 & 0xFF00FF) + (((local231 & 0xFF00FF00) >>> 8) * local101 & 0xFF00FF00);
						this.anIntArray52[local81++] = local215 + local231;
					}
					local81 += local74;
				}
			} else if (arg5 == 2) {
				for (local101 = 0; local101 < arg3; local101++) {
					for (local105 = -arg2; local105 < 0; local105++) {
						local112 = this.anIntArray52[local81];
						local231 = arg4 + local112;
						@Pc(299) int local299 = (arg4 & 0xFF00FF) + (local112 & 0xFF00FF);
						@Pc(309) int local309 = (local299 & 0x1000100) + (local231 - local299 & 0x10000);
						this.anIntArray52[local81++] = local231 - local309 | local309 - (local309 >>> 8);
					}
					local81 += local74;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local101 = arg2 >> 3;
		local105 = arg2 & 0x7;
		arg2 = local81 - 1;
		for (local112 = -arg3; local112 < 0; local112++) {
			if (local101 > 0) {
				arg0 = local101;
				do {
					arg2++;
					this.anIntArray52[arg2] = arg4;
					arg2++;
					this.anIntArray52[arg2] = arg4;
					arg2++;
					this.anIntArray52[arg2] = arg4;
					arg2++;
					this.anIntArray52[arg2] = arg4;
					arg2++;
					this.anIntArray52[arg2] = arg4;
					arg2++;
					this.anIntArray52[arg2] = arg4;
					arg2++;
					this.anIntArray52[arg2] = arg4;
					arg2++;
					this.anIntArray52[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local105 > 0) {
				arg0 = local105;
				do {
					arg2++;
					this.anIntArray52[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local74;
		}
	}

	@OriginalMember(owner = "client!cba", name = "n", descriptor = "()Z")
	@Override
	public boolean method7704() {
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "()V")
	private void method1068() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1056; local1++) {
			this.aClass240Array1[local1].method5513();
		}
		this.la();
	}

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "()Z")
	@Override
	public boolean method7642() {
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!cba", name = "v", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method7720() {
		return this.aClass203_Sub3_1;
	}

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "()V")
	@Override
	public void method7718() {
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7659(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!cba", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass203_Sub3_1.aFloat191 + this.aClass203_Sub3_1.aFloat195 * (float) arg0 + this.aClass203_Sub3_1.aFloat194 * (float) arg1 + this.aClass203_Sub3_1.aFloat188 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(74) int local74 = (int) ((float) this.anInt1050 * (this.aClass203_Sub3_1.aFloat197 + this.aClass203_Sub3_1.aFloat189 * (float) arg0 + this.aClass203_Sub3_1.aFloat196 * (float) arg1 + this.aClass203_Sub3_1.aFloat190 * (float) arg2) / local24);
		@Pc(106) int local106 = (int) ((float) this.anInt1030 * (this.aClass203_Sub3_1.aFloat192 + this.aClass203_Sub3_1.aFloat193 * (float) arg0 + this.aClass203_Sub3_1.aFloat199 * (float) arg1 + this.aClass203_Sub3_1.aFloat198 * (float) arg2) / local24);
		arg3[0] = local74 - this.anInt1034;
		arg3[1] = local106 - this.anInt1032;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7675(@OriginalArg(0) Class5_Sub10 arg0) {
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class240 local3 = this.method1080(Thread.currentThread());
		@Pc(6) Class110 local6 = local3.aClass110_1;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(22) int local22 = local10 >= 0 ? local10 : -local10;
		@Pc(30) int local30 = local14 >= 0 ? local14 : -local14;
		@Pc(32) int local32 = local22;
		if (local22 < local30) {
			local32 = local30;
		}
		if (local32 == 0) {
			return;
		}
		@Pc(47) int local47 = (local10 << 16) / local32;
		@Pc(53) int local53 = (local14 << 16) / local32;
		local10 += local47 >> 16;
		local14 += local53 >> 16;
		if (local53 <= local47) {
			local47 = -local47;
		} else {
			local53 = -local53;
		}
		@Pc(81) int local81 = arg5 * local53 >> 17;
		@Pc(89) int local89 = arg5 * local53 + 1 >> 17;
		@Pc(95) int local95 = arg5 * local47 >> 17;
		@Pc(103) int local103 = arg5 * local47 + 1 >> 17;
		@Pc(108) int local108 = arg0 - local6.method2029();
		@Pc(113) int local113 = arg1 - local6.method2033();
		@Pc(117) int local117 = local108 + local81;
		@Pc(121) int local121 = local108 - local89;
		@Pc(127) int local127 = local108 + local10 - local89;
		@Pc(133) int local133 = local108 + local10 + local81;
		@Pc(137) int local137 = local113 + local95;
		@Pc(141) int local141 = local113 - local103;
		@Pc(147) int local147 = local113 + local14 - local103;
		@Pc(153) int local153 = local113 + local14 + local95;
		local6.anInt2328 = 0;
		this.C(false);
		local6.aBoolean193 = local117 < 0 || local117 > local6.anInt2329 || local121 < 0 || local121 > local6.anInt2329 || local127 < 0 || local127 > local6.anInt2329;
		local6.method2031((float) local137, (float) local141, (float) local147, (float) local117, (float) local121, (float) local127, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean193 = local117 < 0 || local117 > local6.anInt2329 || local127 < 0 || local127 > local6.anInt2329 || local133 < 0 || local133 > local6.anInt2329;
		local6.method2031((float) local137, (float) local147, (float) local153, (float) local117, (float) local127, (float) local133, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!jw;)V")
	@Override
	public void method7728(@OriginalArg(0) Class193 arg0) {
		@Pc(3) Class240 local3 = this.method1080(Thread.currentThread());
		@Pc(7) Class8_Sub8 local7 = arg0.aClass154_1.aClass8_Sub8_1;
		for (@Pc(10) Class8_Sub8 local10 = local7.aClass8_Sub8_10; local10 != local7; local10 = local10.aClass8_Sub8_10) {
			@Pc(14) Class8_Sub8_Sub1 local14 = (Class8_Sub8_Sub1) local10;
			@Pc(19) int local19 = local14.anInt7345 >> 12;
			@Pc(24) int local24 = local14.anInt7350 >> 12;
			@Pc(29) int local29 = local14.anInt7349 >> 12;
			@Pc(54) float local54 = this.aClass203_Sub3_1.aFloat191 + this.aClass203_Sub3_1.aFloat195 * (float) local19 + this.aClass203_Sub3_1.aFloat194 * (float) local24 + this.aClass203_Sub3_1.aFloat188 * (float) local29;
			if (!(local54 < (float) this.anInt1028) && !(local54 > (float) local3.anInt6452)) {
				@Pc(105) int local105 = this.anInt1057 + (int) ((float) this.anInt1050 * (this.aClass203_Sub3_1.aFloat197 + this.aClass203_Sub3_1.aFloat189 * (float) local19 + this.aClass203_Sub3_1.aFloat196 * (float) local24 + this.aClass203_Sub3_1.aFloat190 * (float) local29) / local54);
				@Pc(140) int local140 = this.anInt1043 + (int) ((float) this.anInt1030 * (this.aClass203_Sub3_1.aFloat192 + this.aClass203_Sub3_1.aFloat193 * (float) local19 + this.aClass203_Sub3_1.aFloat199 * (float) local24 + this.aClass203_Sub3_1.aFloat198 * (float) local29) / local54);
				if (local105 >= this.anInt1052 && local105 <= this.anInt1037 && local140 >= this.anInt1033 && local140 <= this.anInt1044) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method1077(local14, local105, local140, (int) local54, (int) ((float) (local14.anInt7348 * this.anInt1050 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "q", descriptor = "()V")
	@Override
	public void method7729() {
	}

	@OriginalMember(owner = "client!cba", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass203_Sub3_1.aFloat191 + this.aClass203_Sub3_1.aFloat195 * (float) arg0 + this.aClass203_Sub3_1.aFloat194 * (float) arg1 + this.aClass203_Sub3_1.aFloat188 * (float) arg2;
		if (local24 < (float) this.anInt1028 || local24 > (float) this.anInt1051) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt1050 * (this.aClass203_Sub3_1.aFloat197 + this.aClass203_Sub3_1.aFloat189 * (float) arg0 + this.aClass203_Sub3_1.aFloat196 * (float) arg1 + this.aClass203_Sub3_1.aFloat190 * (float) arg2) / (float) arg3);
		@Pc(118) int local118 = (int) ((float) this.anInt1030 * (this.aClass203_Sub3_1.aFloat192 + this.aClass203_Sub3_1.aFloat193 * (float) arg0 + this.aClass203_Sub3_1.aFloat199 * (float) arg1 + this.aClass203_Sub3_1.aFloat198 * (float) arg2) / (float) arg3);
		if (local85 >= this.anInt1034 && local85 <= this.anInt1053 && local118 >= this.anInt1032 && local118 <= this.anInt1040) {
			arg4[0] = local85 - this.anInt1034;
			arg4[1] = local118 - this.anInt1032;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "([IIIIIZ)Lclient!fs;")
	@Override
	public Class134 method7705(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class134_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class134_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class134_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class134_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIZ)Lclient!fs;")
	@Override
	public Class134 method7688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class134_Sub1_Sub2(this, arg0, arg1) : new Class134_Sub1_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!cba", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt1042 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray52[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIIII)V")
	private void method1069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt1052 || arg0 >= this.anInt1037) {
			return;
		}
		@Pc(18) int local18 = arg0 + arg1 * this.anInt1042;
		@Pc(22) int local22 = arg3 >>> 24;
		@Pc(26) int local26 = arg4 + arg5;
		@Pc(30) int local30 = arg6 % local26;
		@Pc(44) int local44;
		if (local22 == 255 && true) {
			local44 = 0;
			while (local44 < arg2) {
				if (arg1 + local44 >= this.anInt1033 && arg1 + local44 < this.anInt1044 && local30 < arg4) {
					this.anIntArray52[local18 + local44 * this.anInt1042] = arg3;
				}
				local44++;
				local30++;
				local30 %= local26;
			}
			return;
		}
		@Pc(114) int local114 = ((arg3 & 0xFF00FF) * local22 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local22 >> 8 & 0xFF00) + (local22 << 24);
		local44 = 256 - local22;
		@Pc(120) int local120 = 0;
		while (local120 < arg2) {
			if (arg1 + local120 >= this.anInt1033 && arg1 + local120 < this.anInt1044 && local30 < arg4) {
				@Pc(147) int local147 = local18 + local120 * this.anInt1042;
				@Pc(152) int local152 = this.anIntArray52[local147];
				@Pc(172) int local172 = ((local152 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((local152 & 0xFF00) * local44 >> 8 & 0xFF00);
				this.anIntArray52[local147] = local114 + local172;
			}
			local120++;
			local30++;
			local30 %= local26;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!ol;Lclient!ol;FLclient!ol;)Lclient!ol;")
	@Override
	public Class29 method7652(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class29 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)V")
	@Override
	public void method7701(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cba", name = "t", descriptor = "()Z")
	@Override
	public boolean method7706() {
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(II)Lclient!nq;")
	@Override
	public Interface18 method7649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method7688(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!cba", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class240 local3 = this.method1080(Thread.currentThread());
		local3.aBoolean497 = arg0;
	}

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "()V")
	@Override
	public void method7651() {
	}

	@OriginalMember(owner = "client!cba", name = "w", descriptor = "()Z")
	@Override
	public boolean method7726() {
		return true;
	}

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt1028;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "()V")
	@Override
	protected void method7643() {
		if (this.aBoolean92) {
			Static147.method2073(false, true);
			this.aBoolean92 = false;
		}
		this.aClass5_Sub18_1 = null;
		this.aCanvas2 = null;
		this.lb = 0;
		this.anInt1026 = 0;
		this.aClass291_3 = null;
		this.aBoolean93 = true;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(IIIIIIII)V")
	private void method1070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt1033 || arg1 >= this.anInt1044) {
			return;
		}
		@Pc(18) int local18 = arg0 + arg1 * this.anInt1042;
		@Pc(22) int local22 = arg3 >>> 24;
		@Pc(26) int local26 = arg4 + arg5;
		@Pc(30) int local30 = arg6 % local26;
		@Pc(44) int local44;
		if (local22 == 255 && true) {
			local44 = 0;
			while (local44 < arg2) {
				if (arg0 + local44 >= this.anInt1052 && arg0 + local44 < this.anInt1037 && local30 < arg4) {
					this.anIntArray52[local18 + local44] = arg3;
				}
				local44++;
				local30++;
				local30 %= local26;
			}
			return;
		}
		@Pc(111) int local111 = ((arg3 & 0xFF00FF) * local22 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local22 >> 8 & 0xFF00) + (local22 << 24);
		local44 = 256 - local22;
		@Pc(117) int local117 = 0;
		while (local117 < arg2) {
			if (arg0 + local117 >= this.anInt1052 && arg0 + local117 < this.anInt1037 && local30 < arg4) {
				@Pc(144) int local144 = this.anIntArray52[local18 + local117];
				@Pc(164) int local164 = ((local144 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((local144 & 0xFF00) * local44 >> 8 & 0xFF00);
				this.anIntArray52[local18 + local117] = local111 + local164;
			}
			local117++;
			local30++;
			local30 %= local26;
		}
	}

	@OriginalMember(owner = "client!cba", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt1029;
		this.anInt1029 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(I)I")
	public int method1071(@OriginalArg(0) int arg0) {
		return super.anInterface1_11.method2863(arg0).anInt6313;
	}

	@OriginalMember(owner = "client!cba", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1052 || arg0 >= this.anInt1037) {
			return;
		}
		if (arg1 < this.anInt1033) {
			arg2 -= this.anInt1033 - arg1;
			arg1 = this.anInt1033;
		}
		if (arg1 + arg2 > this.anInt1044) {
			arg2 = this.anInt1044 - arg1;
		}
		@Pc(43) int local43 = arg0 + arg1 * this.anInt1042;
		@Pc(47) int local47 = arg3 >>> 24;
		@Pc(61) int local61;
		if (arg4 == 0 || arg4 == 1 && local47 == 255) {
			for (local61 = 0; local61 < arg2; local61++) {
				this.anIntArray52[local43 + local61 * this.anInt1042] = arg3;
			}
			return;
		}
		@Pc(111) int local111;
		@Pc(119) int local119;
		@Pc(124) int local124;
		if (arg4 == 1) {
			@Pc(105) int local105 = ((arg3 & 0xFF00FF) * local47 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local47 >> 8 & 0xFF00) + (local47 << 24);
			local61 = 256 - local47;
			for (local111 = 0; local111 < arg2; local111++) {
				local119 = local43 + local111 * this.anInt1042;
				local124 = this.anIntArray52[local119];
				local124 = ((local124 & 0xFF00FF) * local61 >> 8 & 0xFF00FF) + ((local124 & 0xFF00) * local61 >> 8 & 0xFF00);
				this.anIntArray52[local119] = local105 + local124;
			}
		} else if (arg4 == 2) {
			for (local61 = 0; local61 < arg2; local61++) {
				local111 = local43 + local61 * this.anInt1042;
				local119 = this.anIntArray52[local111];
				local124 = arg3 + local119;
				@Pc(187) int local187 = (arg3 & 0xFF00FF) + (local119 & 0xFF00FF);
				@Pc(197) int local197 = (local187 & 0x1000100) + (local124 - local187 & 0x10000);
				this.anIntArray52[local111] = local124 - local197 | local197 - (local197 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "(IIIIII)V")
	private void method1072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt1033) {
			local8 = this.anInt1033;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt1044) {
			local21 = this.anInt1044;
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
		@Pc(98) int local98;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(125) int local125;
		if (arg5 == 0 || arg5 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local98 = arg0 + 1 - local36;
				if (local98 < this.anInt1052) {
					local98 = this.anInt1052;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt1037) {
					local109 = this.anInt1037;
				}
				local123 = local98 + local30 * this.anInt1042;
				for (local125 = local98; local125 < local109; local125++) {
					if ((float) arg2 < this.aFloatArray10[local123]) {
						this.anIntArray52[local123] = arg4;
					}
					local123++;
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
				local98 = arg0 - local36;
				if (local98 < this.anInt1052) {
					local98 = this.anInt1052;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt1037 - 1) {
					local109 = this.anInt1037 - 1;
				}
				local123 = local98 + local30 * this.anInt1042;
				for (local125 = local98; local125 <= local109; local125++) {
					if ((float) arg2 < this.aFloatArray10[local123]) {
						this.anIntArray52[local123] = arg4;
					}
					local123++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(366) int local366;
		@Pc(380) int local380;
		if (arg5 == 1) {
			@Pc(307) int local307 = ((arg4 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local98 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local109 = arg0 + 1 - local36;
				if (local109 < this.anInt1052) {
					local109 = this.anInt1052;
				}
				local123 = arg0 + local36;
				if (local123 > this.anInt1037) {
					local123 = this.anInt1037;
				}
				local125 = local109 + local30 * this.anInt1042;
				for (local366 = local109; local366 < local123; local366++) {
					if ((float) arg2 < this.aFloatArray10[local125]) {
						local380 = this.anIntArray52[local125];
						local380 = ((local380 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local98 >> 8 & 0xFF00);
						this.anIntArray52[local125] = local307 + local380;
					}
					local125++;
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
				local109 = arg0 - local36;
				if (local109 < this.anInt1052) {
					local109 = this.anInt1052;
				}
				local123 = arg0 + local36;
				if (local123 > this.anInt1037 - 1) {
					local123 = this.anInt1037 - 1;
				}
				local125 = local109 + local30 * this.anInt1042;
				for (local366 = local109; local366 <= local123; local366++) {
					if ((float) arg2 < this.aFloatArray10[local125]) {
						local380 = this.anIntArray52[local125];
						local380 = ((local380 & 0xFF00FF) * local98 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local98 >> 8 & 0xFF00);
						this.anIntArray52[local125] = local307 + local380;
					}
					local125++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg5 == 2) {
			@Pc(655) int local655;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local98 = arg0 + 1 - local36;
				if (local98 < this.anInt1052) {
					local98 = this.anInt1052;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt1037) {
					local109 = this.anInt1037;
				}
				local123 = local98 + local30 * this.anInt1042;
				for (local125 = local98; local125 < local109; local125++) {
					if ((float) arg2 < this.aFloatArray10[local123]) {
						local366 = this.anIntArray52[local123];
						local380 = arg4 + local366;
						local655 = (arg4 & 0xFF00FF) + (local366 & 0xFF00FF);
						@Pc(665) int local665 = (local655 & 0x1000100) + (local380 - local655 & 0x10000);
						this.anIntArray52[local123] = local380 - local665 | local665 - (local665 >>> 8);
					}
					local123++;
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
				local98 = arg0 - local36;
				if (local98 < this.anInt1052) {
					local98 = this.anInt1052;
				}
				local109 = arg0 + local36;
				if (local109 > this.anInt1037 - 1) {
					local109 = this.anInt1037 - 1;
				}
				local123 = local98 + local30 * this.anInt1042;
				for (local125 = local98; local125 <= local109; local125++) {
					if ((float) arg2 < this.aFloatArray10[local123]) {
						local366 = this.anIntArray52[local123];
						local380 = arg4 + local366;
						local655 = (arg4 & 0xFF00FF) + (local366 & 0xFF00FF);
						local366 = (local655 & 0x1000100) + (local380 - local655 & 0x10000);
						this.anIntArray52[local123] = local380 - local366 | local366 - (local366 >>> 8);
					}
					local123++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cba", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1057 = arg0;
		this.anInt1043 = arg1;
		this.anInt1050 = arg2;
		this.anInt1030 = arg3;
		this.method1079();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class22 method7648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class22_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!cba", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1045 = (int) (arg1 * 65535.0F);
		this.anInt1049 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1055 = (int) (arg3 * 65535.0F / local26);
		this.anInt1046 = (int) (arg4 * 65535.0F / local26);
		this.anInt1039 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!cba", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt1042, this.anInt1031, arg0, 0);
	}

	@OriginalMember(owner = "client!cba", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt1042 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt1048 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(24) int[] local24 = this.anIntArray52;
		@Pc(27) float[] local27 = this.aFloatArray10;
		@Pc(34) int local34;
		if (local6 < 0) {
			local34 = local24.length + local6;
			Static682.method796(local24, -local6, local24, 0, local34);
		} else if (local6 > 0) {
			local34 = local24.length - local6;
			Static682.method796(local24, 0, local24, local6, local34);
		}
		if (local13 < 0) {
			local34 = local27.length + local13;
			Static682.method793(local27, -local13, local27, 0, local34);
		} else if (local13 > 0) {
			local34 = local27.length - local13;
			Static682.method793(local27, 0, local27, local13, local34);
		}
	}

	@OriginalMember(owner = "client!cba", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass203_Sub3_1.aFloat195 * (float) arg0 + this.aClass203_Sub3_1.aFloat194 * (float) arg1 + this.aClass203_Sub3_1.aFloat188 * (float) arg2 + this.aClass203_Sub3_1.aFloat191;
		@Pc(49) float local49 = this.aClass203_Sub3_1.aFloat195 * (float) arg3 + this.aClass203_Sub3_1.aFloat194 * (float) arg4 + this.aClass203_Sub3_1.aFloat188 * (float) arg5 + this.aClass203_Sub3_1.aFloat191;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt1028 && local49 < (float) this.anInt1028) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt1051 && local49 > (float) this.anInt1051) {
			local51 |= 0x20;
		}
		@Pc(121) int local121 = (int) ((float) this.anInt1050 * (this.aClass203_Sub3_1.aFloat189 * (float) arg0 + this.aClass203_Sub3_1.aFloat196 * (float) arg1 + this.aClass203_Sub3_1.aFloat190 * (float) arg2 + this.aClass203_Sub3_1.aFloat197) / (float) arg6);
		@Pc(154) int local154 = (int) ((float) this.anInt1050 * (this.aClass203_Sub3_1.aFloat189 * (float) arg3 + this.aClass203_Sub3_1.aFloat196 * (float) arg4 + this.aClass203_Sub3_1.aFloat190 * (float) arg5 + this.aClass203_Sub3_1.aFloat197) / (float) arg6);
		if (local121 < this.anInt1034 && local154 < this.anInt1034) {
			local51 |= 0x1;
		} else if (local121 > this.anInt1053 && local154 > this.anInt1053) {
			local51 |= 0x2;
		}
		@Pc(216) int local216 = (int) ((float) this.anInt1030 * (this.aClass203_Sub3_1.aFloat193 * (float) arg0 + this.aClass203_Sub3_1.aFloat199 * (float) arg1 + this.aClass203_Sub3_1.aFloat198 * (float) arg2 + this.aClass203_Sub3_1.aFloat192) / (float) arg6);
		@Pc(249) int local249 = (int) ((float) this.anInt1030 * (this.aClass203_Sub3_1.aFloat193 * (float) arg3 + this.aClass203_Sub3_1.aFloat199 * (float) arg4 + this.aClass203_Sub3_1.aFloat198 * (float) arg5 + this.aClass203_Sub3_1.aFloat192) / (float) arg6);
		if (local216 < this.anInt1032 && local249 < this.anInt1032) {
			local51 |= 0x4;
		} else if (local216 > this.anInt1040 && local249 > this.anInt1040) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "(I)[I")
	public int[] method1073(@OriginalArg(0) int arg0) {
		@Pc(2) Class391 local2 = this.aClass391_9;
		@Pc(12) Class5_Sub52 local12;
		synchronized (this.aClass391_9) {
			local12 = (Class5_Sub52) this.aClass391_9.method9275((long) arg0);
			if (local12 == null) {
				if (!super.anInterface1_11.method2860(arg0)) {
					return null;
				}
				@Pc(34) Class233 local34 = super.anInterface1_11.method2863(arg0);
				@Pc(48) int local48 = local34.aBoolean485 || this.aBoolean94 ? 64 : this.anInt1035;
				local12 = new Class5_Sub52(arg0, local48, super.anInterface1_11.method2861(true, arg0, local48, local48, 0.7F), local34.anInt6313 != 1);
				this.aClass391_9.method9273((long) arg0, local12, 1);
			}
		}
		local12.aBoolean760 = true;
		return local12.method8759();
	}

	@OriginalMember(owner = "client!cba", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cba", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass203_Sub3_1.aFloat191 + this.aClass203_Sub3_1.aFloat195 * (float) arg0 + this.aClass203_Sub3_1.aFloat194 * (float) arg1 + this.aClass203_Sub3_1.aFloat188 * (float) arg2;
		if (local24 < (float) this.anInt1028 || local24 > (float) this.anInt1051) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(84) int local84 = (int) ((float) this.anInt1050 * (this.aClass203_Sub3_1.aFloat197 + this.aClass203_Sub3_1.aFloat189 * (float) arg0 + this.aClass203_Sub3_1.aFloat196 * (float) arg1 + this.aClass203_Sub3_1.aFloat190 * (float) arg2) / local24);
		@Pc(116) int local116 = (int) ((float) this.anInt1030 * (this.aClass203_Sub3_1.aFloat192 + this.aClass203_Sub3_1.aFloat193 * (float) arg0 + this.aClass203_Sub3_1.aFloat199 * (float) arg1 + this.aClass203_Sub3_1.aFloat198 * (float) arg2) / local24);
		if (local84 >= this.anInt1034 && local84 <= this.anInt1053 && local116 >= this.anInt1032 && local116 <= this.anInt1040) {
			arg3[0] = local84 - this.anInt1034;
			arg3[1] = local116 - this.anInt1032;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7699(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub18 local8 = (Class5_Sub18) this.aClass291_3.method6993((long) arg0.hashCode(), 1);
		if (local8 == null) {
			return;
		}
		local8.method9327(1);
		local8 = Static636.method8885(arg0, arg1, arg2);
		this.aClass291_3.method6984((long) arg0.hashCode(), local8);
		if (this.aCanvas2 != arg0 || this.aClass69_1 != null) {
			return;
		}
		@Pc(39) Dimension local39 = arg0.getSize();
		this.lb = local39.width;
		this.anInt1026 = local39.height;
		this.aClass5_Sub18_1 = local8;
		this.anIntArray52 = local8.anIntArray346;
		this.anInt1042 = local8.anInt6328;
		this.anInt1031 = local8.anInt6326;
		if (this.anInt1042 != this.anInt1048 || this.anInt1031 != this.anInt1047) {
			this.anInt1054 = this.anInt1048 = this.anInt1042;
			this.anInt1041 = this.anInt1047 = this.anInt1031;
			this.aFloatArray9 = this.aFloatArray10 = new float[this.anInt1048 * this.anInt1047];
		}
		this.method1068();
	}

	@OriginalMember(owner = "client!cba", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt1052 = 0;
		this.anInt1033 = 0;
		this.anInt1037 = this.anInt1042;
		this.anInt1044 = this.anInt1031;
		this.method1079();
	}

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "(I)V")
	@Override
	public void method7671(@OriginalArg(0) int arg0) {
		this.aClass240Array1[arg0].method5514(Thread.currentThread());
	}

	@OriginalMember(owner = "client!cba", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass240Array1.length; local1++) {
			this.aClass240Array1[local1].anInt6456 = this.aClass240Array1[local1].anInt6455;
			this.aClass240Array1[local1].aBoolean499 = false;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray97;
		@Pc(8) int[] local8 = local2.anIntArray95;
		@Pc(18) int local18 = this.anInt1033 > arg7 ? this.anInt1033 : arg7;
		@Pc(34) int local34 = this.anInt1044 < arg7 + local5.length ? this.anInt1044 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(85) int local85;
		@Pc(118) int local118;
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(154) int local154;
		@Pc(242) int local242;
		@Pc(261) int local261;
		@Pc(266) int local266;
		@Pc(215) int local215;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(415) int local415 = arg2 << 16;
			local85 = (int) Math.floor((double) local415 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local18) {
				arg0 += local85 * (local18 - arg1);
				arg1 = local18;
			}
			if (arg3 >= local34) {
				arg3 = local34 - 1;
			}
			local118 = arg4 >>> 24;
			if (local118 == 255 && true) {
				while (arg1 <= arg3) {
					local136 = arg0 >> 16;
					local140 = arg1 - arg7;
					local154 = arg6 + local5[local140];
					if (local136 >= this.anInt1052 && local136 < this.anInt1037 && local136 >= local154 && local136 < local154 + local8[local140]) {
						this.anIntArray52[local136 + arg1 * this.anInt1042] = arg4;
					}
					arg0 += local85;
					arg1++;
				}
			} else {
				local215 = ((arg4 & 0xFF00FF) * local118 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local118 >> 8 & 0xFF00) + (local118 << 24);
				local136 = 256 - local118;
				while (arg1 <= arg3) {
					local140 = arg0 >> 16;
					local154 = arg1 - arg7;
					local242 = arg6 + local5[local154];
					if (local140 >= this.anInt1052 && local140 < this.anInt1037 && local140 >= local242 && local140 < local242 + local8[local154]) {
						local261 = local140 + arg1 * this.anInt1042;
						local266 = this.anIntArray52[local261];
						@Pc(629) int local629 = ((local266 & 0xFF00FF) * local136 >> 8 & 0xFF00FF) + ((local266 & 0xFF00) * local136 >> 8 & 0xFF00);
						this.anIntArray52[local140 + arg1 * this.anInt1042] = local215 + local629;
					}
					arg0 += local85;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(75) int local75 = arg3 << 16;
		local85 = (int) Math.floor((double) local75 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt1052) {
			arg1 += local85 * (this.anInt1052 - arg0);
			arg0 = this.anInt1052;
		}
		if (arg2 >= this.anInt1037) {
			arg2 = this.anInt1037 - 1;
		}
		local118 = arg4 >>> 24;
		if (local118 == 255 && true) {
			while (arg0 <= arg2) {
				local136 = arg1 >> 16;
				local140 = local136 - arg7;
				if (local136 >= local18 && local136 < local34) {
					local154 = arg6 + local5[local140];
					if (arg0 >= local154 && arg0 < local154 + local8[local140]) {
						this.anIntArray52[arg0 + local136 * this.anInt1042] = arg4;
					}
				}
				arg1 += local85;
				arg0++;
			}
			return;
		}
		local215 = ((arg4 & 0xFF00FF) * local118 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local118 >> 8 & 0xFF00) + (local118 << 24);
		local136 = 256 - local118;
		while (arg0 <= arg2) {
			local140 = arg1 >> 16;
			local154 = local140 - arg7;
			if (local140 >= local18 && local140 < local34) {
				local242 = arg6 + local5[local154];
				if (arg0 >= local242 && arg0 < local242 + local8[local154]) {
					local261 = arg0 + local140 * this.anInt1042;
					local266 = this.anIntArray52[local261];
					local266 = ((local266 & 0xFF00FF) * local136 >> 8 & 0xFF00FF) + ((local266 & 0xFF00) * local136 >> 8 & 0xFF00);
					this.anIntArray52[local261] = local215 + local266;
				}
			}
			arg1 += local85;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "()V")
	@Override
	public void method7645() {
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!qq;)V")
	@Override
	public void method7657(@OriginalArg(0) Class203 arg0) {
		this.aClass203_Sub3_1 = (Class203_Sub3) arg0;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7727(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub18 local8 = (Class5_Sub18) this.aClass291_3.method6993((long) arg0.hashCode(), 1);
		if (local8 == null) {
			local8 = Static636.method8885(arg0, arg1, arg2);
			this.aClass291_3.method6984((long) arg0.hashCode(), local8);
		} else if (local8.anInt6328 != arg1 || local8.anInt6326 != arg2) {
			this.method7699(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!ju;IIII)Lclient!ka;")
	@Override
	public Class164 method7700(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class164_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!cba", name = "p", descriptor = "(I)I")
	public int method1074(@OriginalArg(0) int arg0) {
		return super.anInterface1_11.method2863(arg0).aShort78 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method1075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface1_11.method2863(arg6).aBoolean482) {
			this.method1072(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt1058 != arg6) {
			@Pc(33) Class134 local33 = (Class134) this.aClass391_8.method9275((long) arg6);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method1076(arg6);
				if (local39 == null) {
					return;
				}
				@Pc(53) int local53 = this.method1081(arg6) ? 64 : this.anInt1035;
				local33 = this.method7679(local53, local39, local53, local53);
				this.aClass391_8.method9273((long) arg6, local33, 1);
			}
			this.anInt1058 = arg6;
			this.aClass134_6 = local33;
		}
		((Class134_Sub1) this.aClass134_6).method8579(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!nq;Lclient!rk;)Lclient!gea;")
	@Override
	public Interface6 method7668(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Interface23 arg1) {
		return new Class69(this, (Class134) arg0, (Class58) arg1);
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(II)I")
	@Override
	public int method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)V")
	@Override
	public void method7690(@OriginalArg(0) int arg0) {
		this.anInt1056 = arg0;
		this.aClass240Array1 = new Class240[this.anInt1056];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1056; local9++) {
			this.aClass240Array1[local9] = new Class240(this);
		}
	}

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "(I)V")
	@Override
	public void method7689(@OriginalArg(0) int arg0) {
		this.aClass240Array1[arg0].method5514((Runnable) null);
	}

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "(II)I")
	@Override
	public int method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!cba", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "()Z")
	@Override
	public boolean method7697() {
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "l", descriptor = "(I)[I")
	public int[] method1076(@OriginalArg(0) int arg0) {
		@Pc(2) Class391 local2 = this.aClass391_9;
		@Pc(14) Class5_Sub52 local14;
		synchronized (this.aClass391_9) {
			local14 = (Class5_Sub52) this.aClass391_9.method9275((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface1_11.method2860(arg0)) {
					return null;
				}
				@Pc(36) Class233 local36 = super.anInterface1_11.method2863(arg0);
				@Pc(50) int local50 = local36.aBoolean485 || this.aBoolean94 ? 64 : this.anInt1035;
				local14 = new Class5_Sub52(arg0, local50, super.anInterface1_11.method2862(local50, 0.7F, arg0, local50), local36.anInt6313 != 1);
				this.aClass391_9.method9273((long) arg0 | Long.MIN_VALUE, local14, 1);
			}
		}
		local14.aBoolean760 = true;
		return local14.method8759();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(31) int local31;
		@Pc(35) int local35;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method1070(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local31 = arg5 + arg6;
				local35 = arg7 % local31;
				local35 = local31 + arg5 - local35 - (-arg2 + 1) % local31;
				arg7 = local35 % local31;
				if (arg7 < 0) {
					arg7 += local31;
				}
				this.method1070(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
			}
		} else if (arg2 != 0) {
			local35 = arg7 << 8;
			@Pc(149) int local149 = arg5 << 8;
			@Pc(153) int local153 = arg6 << 8;
			local31 = local149 + local153;
			arg7 = local35 % local31;
			@Pc(178) int local178;
			@Pc(182) int local182;
			if (arg2 + arg3 < 0) {
				local178 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
				local182 = local178 % local31;
				local35 = local31 + local149 - arg7 - local182;
				arg7 = local35 % local31;
				if (arg7 < 0) {
					arg7 += local31;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(260) int local260;
			@Pc(278) int local278;
			@Pc(371) int local371;
			@Pc(405) int local405;
			@Pc(410) int local410;
			@Pc(243) int local243;
			@Pc(229) int local229;
			@Pc(362) int local362;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local229 = arg3 << 16;
				local178 = (int) Math.floor((double) local229 / (double) arg2 + 0.5D);
				local243 = arg2 + arg0;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (local182 == 255 && true) {
					while (arg0 <= local243) {
						local278 = arg1 >> 16;
						if (arg0 >= this.anInt1052 && arg0 < this.anInt1037 && local278 >= this.anInt1033 && local278 < this.anInt1044 && arg7 < local149) {
							this.anIntArray52[arg0 + local278 * this.anInt1042] = arg4;
						}
						arg1 += local178;
						arg0++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				} else {
					local362 = ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00) + (local182 << 24);
					local278 = 256 - local182;
					while (arg0 <= local243) {
						local371 = arg1 >> 16;
						if (arg0 >= this.anInt1052 && arg0 < this.anInt1037 && local371 >= this.anInt1033 && local371 < this.anInt1044 && arg7 < local149) {
							local405 = arg0 + local371 * this.anInt1042;
							local410 = this.anIntArray52[local405];
							local410 = ((local410 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local410 & 0xFF00) * local278 >> 8 & 0xFF00);
							this.anIntArray52[local405] = local362 + local410;
						}
						arg1 += local178;
						arg0++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local243 = arg2 << 16;
				local178 = (int) Math.floor((double) local243 / (double) arg3 + 0.5D);
				local229 = arg3 + arg1;
				local182 = arg4 >>> 24;
				local260 = (int) Math.sqrt((double) ((local178 >> 8) * (local178 >> 8) + 65536));
				if (local182 == 255 && true) {
					while (arg1 <= local229) {
						local278 = arg0 >> 16;
						if (arg1 >= this.anInt1033 && arg1 < this.anInt1044 && local278 >= this.anInt1052 && local278 < this.anInt1037 && arg7 < local149) {
							this.anIntArray52[local278 + arg1 * this.anInt1042] = arg4;
						}
						arg0 += local178;
						arg1++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				} else {
					local362 = ((arg4 & 0xFF00FF) * local182 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local182 >> 8 & 0xFF00) + (local182 << 24);
					local278 = 256 - local182;
					while (arg1 <= local229) {
						local371 = arg0 >> 16;
						if (arg1 >= this.anInt1033 && arg1 < this.anInt1044 && local371 >= this.anInt1052 && local371 < this.anInt1037 && arg7 < local149) {
							local405 = local371 + arg1 * this.anInt1042;
							local410 = this.anIntArray52[local405];
							@Pc(773) int local773 = ((local410 & 0xFF00FF) * local278 >> 8 & 0xFF00FF) + ((local410 & 0xFF00) * local278 >> 8 & 0xFF00);
							this.anIntArray52[local371 + arg1 * this.anInt1042] = local362 + local773;
						}
						arg0 += local178;
						arg1++;
						local35 = arg7 + local260;
						arg7 = local35 % local31;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method1069(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local31 = arg5 + arg6;
			local35 = arg7 % local31;
			local35 = local31 + arg5 - local35 - (-arg3 + 1) % local31;
			arg7 = local35 % local31;
			if (arg7 < 0) {
				arg7 += local31;
			}
			this.method1069(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!cba", name = "m", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method7672() {
		@Pc(3) Class240 local3 = this.method1080(Thread.currentThread());
		return local3.aClass203_Sub3_2;
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "()Z")
	@Override
	public boolean method7664() {
		return true;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!gea;)V")
	@Override
	public void method7730(@OriginalArg(0) Interface6 arg0) {
		@Pc(2) Class69 local2 = (Class69) arg0;
		this.anInt1042 = local2.anInt1204;
		this.anInt1031 = local2.anInt1200;
		this.anIntArray52 = local2.anIntArray56;
		this.aClass69_1 = local2;
		this.anInt1048 = local2.anInt1204;
		this.anInt1047 = local2.anInt1200;
		this.aFloatArray10 = local2.aFloatArray12;
		this.method1068();
	}

	@OriginalMember(owner = "client!cba", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt1038 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "([I)V")
	@Override
	public void method7692(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1042;
		arg0[1] = this.anInt1031;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!jw;I)V")
	@Override
	public void method7662(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.method1080(Thread.currentThread());
		@Pc(7) Class8_Sub8 local7 = arg0.aClass154_1.aClass8_Sub8_1;
		for (@Pc(10) Class8_Sub8 local10 = local7.aClass8_Sub8_10; local10 != local7; local10 = local10.aClass8_Sub8_10) {
			@Pc(14) Class8_Sub8_Sub1 local14 = (Class8_Sub8_Sub1) local10;
			@Pc(19) int local19 = local14.anInt7345 >> 12;
			@Pc(24) int local24 = local14.anInt7350 >> 12;
			@Pc(29) int local29 = local14.anInt7349 >> 12;
			@Pc(54) float local54 = this.aClass203_Sub3_1.aFloat191 + this.aClass203_Sub3_1.aFloat195 * (float) local19 + this.aClass203_Sub3_1.aFloat194 * (float) local24 + this.aClass203_Sub3_1.aFloat188 * (float) local29;
			if (!(local54 < (float) this.anInt1028) && !(local54 > (float) local3.anInt6452)) {
				@Pc(106) int local106 = this.anInt1057 + (int) ((float) this.anInt1050 * (this.aClass203_Sub3_1.aFloat197 + this.aClass203_Sub3_1.aFloat189 * (float) local19 + this.aClass203_Sub3_1.aFloat196 * (float) local24 + this.aClass203_Sub3_1.aFloat190 * (float) local29) / (float) arg1);
				@Pc(142) int local142 = this.anInt1043 + (int) ((float) this.anInt1030 * (this.aClass203_Sub3_1.aFloat192 + this.aClass203_Sub3_1.aFloat193 * (float) local19 + this.aClass203_Sub3_1.aFloat199 * (float) local24 + this.aClass203_Sub3_1.aFloat198 * (float) local29) / (float) arg1);
				if (local106 >= this.anInt1052 && local106 <= this.anInt1037 && local142 >= this.anInt1033 && local142 <= this.anInt1044) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method1077(local14, local106, local142, (int) local54, (local14.anInt7348 * this.anInt1050 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray97;
		@Pc(8) int[] local8 = local2.anIntArray95;
		@Pc(18) int local18 = this.anInt1033 > arg7 ? this.anInt1033 : arg7;
		@Pc(34) int local34 = this.anInt1044 < arg7 + local5.length ? this.anInt1044 : arg7 + local5.length;
		@Pc(38) int local38 = arg10 << 8;
		@Pc(42) int local42 = arg8 << 8;
		@Pc(46) int local46 = arg9 << 8;
		@Pc(50) int local50 = local42 + local46;
		arg10 = local38 % local50;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(79) int local79;
		@Pc(83) int local83;
		if (arg2 + arg3 < 0) {
			local79 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
			local83 = local79 % local50;
			local38 = local50 + local42 - arg10 - local83;
			arg10 = local38 % local50;
			if (arg10 < 0) {
				arg10 += local50;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(161) int local161;
		@Pc(179) int local179;
		@Pc(183) int local183;
		@Pc(214) int local214;
		@Pc(327) int local327;
		@Pc(346) int local346;
		@Pc(144) int local144;
		@Pc(130) int local130;
		@Pc(283) int local283;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local144 = arg2 << 16;
			local79 = (int) Math.floor((double) local144 / (double) arg3 + 0.5D);
			local83 = (int) Math.sqrt((double) ((local79 >> 8) * (local79 >> 8) + 65536));
			local130 = arg3 + arg1;
			local161 = arg4 >>> 24;
			if (local161 == 255 && true) {
				while (arg1 <= local130) {
					local179 = arg0 >> 16;
					local183 = arg1 - arg7;
					if (arg1 >= local18 && arg1 < local34 && local179 >= this.anInt1052 && local179 < this.anInt1037 && arg10 < local42 && local179 >= arg6 + local5[local183] && local179 < arg6 + local5[local183] + local8[local183]) {
						this.anIntArray52[local179 + arg1 * this.anInt1042] = arg4;
					}
					arg0 += local79;
					arg1++;
					local38 = arg10 + local83;
					arg10 = local38 % local50;
				}
			} else {
				local283 = ((arg4 & 0xFF00FF) * local161 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local161 >> 8 & 0xFF00) + (local161 << 24);
				local179 = 256 - local161;
				while (arg1 <= local130) {
					local183 = arg0 >> 16;
					local214 = arg1 - arg7;
					if (arg1 >= local18 && arg1 < local34 && local183 >= this.anInt1052 && local183 < this.anInt1037 && arg10 < local42 && local183 >= arg6 + local5[local214] && local183 < arg6 + local5[local214] + local8[local214]) {
						local327 = local183 + arg1 * this.anInt1042;
						local346 = this.anIntArray52[local327];
						@Pc(782) int local782 = ((local346 & 0xFF00FF) * local179 >> 8 & 0xFF00FF) + ((local346 & 0xFF00) * local179 >> 8 & 0xFF00);
						this.anIntArray52[local183 + arg1 * this.anInt1042] = local283 + local782;
					}
					arg0 += local79;
					arg1++;
					local38 = arg10 + local83;
					arg10 = local38 % local50;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local130 = arg3 << 16;
		local79 = (int) Math.floor((double) local130 / (double) arg2 + 0.5D);
		local144 = arg2 + arg0;
		local83 = arg4 >>> 24;
		local161 = (int) Math.sqrt((double) ((local79 >> 8) * (local79 >> 8) + 65536));
		if (local83 == 255 && true) {
			while (arg0 <= local144) {
				local179 = arg1 >> 16;
				local183 = local179 - arg7;
				if (arg0 >= this.anInt1052 && arg0 < this.anInt1037 && local179 >= local18 && local179 < local34 && arg10 < local42) {
					local214 = arg6 + local5[local183];
					if (arg0 >= local214 && arg0 < local214 + local8[local183]) {
						this.anIntArray52[arg0 + local179 * this.anInt1042] = arg4;
					}
				}
				arg1 += local79;
				arg0++;
				local38 = arg10 + local161;
				arg10 = local38 % local50;
			}
			return;
		}
		local283 = ((arg4 & 0xFF00FF) * local83 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local83 >> 8 & 0xFF00) + (local83 << 24);
		local179 = 256 - local83;
		while (arg0 <= local144) {
			local183 = arg1 >> 16;
			local214 = local183 - arg7;
			if (arg0 >= this.anInt1052 && arg0 < this.anInt1037 && local183 >= local18 && local183 < local34 && arg10 < local42) {
				local327 = arg6 + local5[local214];
				if (arg0 >= local327 && arg0 < local327 + local8[local214]) {
					local346 = arg0 + local183 * this.anInt1042;
					@Pc(351) int local351 = this.anIntArray52[local346];
					@Pc(371) int local371 = ((local351 & 0xFF00FF) * local179 >> 8 & 0xFF00FF) + ((local351 & 0xFF00) * local179 >> 8 & 0xFF00);
					this.anIntArray52[local346] = local283 + local371;
				}
			}
			arg1 += local79;
			arg0++;
			local38 = arg10 + local161;
			arg10 = local38 % local50;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!lq;[Lclient!iga;Z)Lclient!da;")
	@Override
	public Class80 method7708(@OriginalArg(0) Class224 arg0, @OriginalArg(1) Class173[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4282;
			local7[local11] = arg1[local11].anInt4287;
			if (arg1[local11].aByteArray27 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class80_Sub5(this, arg0, arg1, local3, local7);
		} else {
			return new Class80_Sub1(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!ol;)V")
	@Override
	public void method7702(@OriginalArg(0) Class29 arg0) {
	}

	@OriginalMember(owner = "client!cba", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1033 || arg1 >= this.anInt1044) {
			return;
		}
		if (arg0 < this.anInt1052) {
			arg2 -= this.anInt1052 - arg0;
			arg0 = this.anInt1052;
		}
		if (arg0 + arg2 > this.anInt1037) {
			arg2 = this.anInt1037 - arg0;
		}
		@Pc(43) int local43 = arg0 + arg1 * this.anInt1042;
		@Pc(47) int local47 = arg3 >>> 24;
		@Pc(61) int local61;
		if (arg4 == 0 || arg4 == 1 && local47 == 255) {
			for (local61 = 0; local61 < arg2; local61++) {
				this.anIntArray52[local43 + local61] = arg3;
			}
			return;
		}
		@Pc(108) int local108;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(102) int local102 = ((arg3 & 0xFF00FF) * local47 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local47 >> 8 & 0xFF00) + (local47 << 24);
			local61 = 256 - local47;
			for (local108 = 0; local108 < arg2; local108++) {
				local116 = this.anIntArray52[local43 + local108];
				local116 = ((local116 & 0xFF00FF) * local61 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local61 >> 8 & 0xFF00);
				this.anIntArray52[local43 + local108] = local102 + local116;
			}
		} else if (arg4 == 2) {
			for (local61 = 0; local61 < arg2; local61++) {
				local108 = this.anIntArray52[local43 + local61];
				local116 = arg3 + local108;
				@Pc(176) int local176 = (arg3 & 0xFF00FF) + (local108 & 0xFF00FF);
				@Pc(186) int local186 = (local176 & 0x1000100) + (local116 - local176 & 0x10000);
				this.anIntArray52[local43 + local61] = local116 - local186 | local186 - (local186 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7703(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			this.method7669((Canvas) null);
		}
		@Pc(17) Class5_Sub18 local17 = (Class5_Sub18) this.aClass291_3.method6993((long) arg0.hashCode(), 1);
		if (local17 != null) {
			local17.method9327(1);
		}
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(II)V")
	@Override
	public void method7673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas2 == null || this.aClass5_Sub18_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(19) Graphics local19 = this.aCanvas2.getGraphics();
			this.aClass5_Sub18_1.method5406(arg0, arg1, this.anInt1026, local19, this.lb, 0, 0);
		} catch (@Pc(34) Exception local34) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "(I)Lclient!za;")
	@Override
	public Class5_Sub10 method7646(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!nh;IIII)V")
	private void method1077(@OriginalArg(0) Class8_Sub8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt7342;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method1072(arg1, arg2, arg3, arg4, arg0.anInt7344, 1);
			return;
		}
		if (this.anInt1058 != local2) {
			@Pc(34) Class134 local34 = (Class134) this.aClass391_8.method9275((long) local2);
			if (local34 == null) {
				@Pc(40) int[] local40 = this.method1076(local2);
				if (local40 == null) {
					return;
				}
				@Pc(54) int local54 = this.method1081(local2) ? 64 : this.anInt1035;
				local34 = this.method7679(local54, local40, local54, local54);
				this.aClass391_8.method9273((long) local2, local34, 1);
			}
			this.anInt1058 = local2;
			this.aClass134_6 = local34;
		}
		local8++;
		((Class134_Sub1) this.aClass134_6).method8579(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt7344, 1);
	}

	@OriginalMember(owner = "client!cba", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1042) {
			arg2 = this.anInt1042;
		}
		if (arg3 > this.anInt1031) {
			arg3 = this.anInt1031;
		}
		this.anInt1052 = arg0;
		this.anInt1037 = arg2;
		this.anInt1033 = arg1;
		this.anInt1044 = arg3;
		this.method1079();
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	@Override
	public void method7660(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1027;
		for (@Pc(9) Object local9 = this.aClass391_9.method9277(); local9 != null; local9 = this.aClass391_9.method9287()) {
			@Pc(13) Class5_Sub52 local13 = (Class5_Sub52) local9;
			if (local13.aBoolean760) {
				local13.anInt10181 += local4;
				@Pc(27) int local27 = local13.anInt10181 / 20;
				if (local27 > 0) {
					@Pc(36) Class233 local36 = super.anInterface1_11.method2863(local13.anInt10182);
					local13.method8757(local36.aByte96 * local4 * 50 / 1000, local36.aByte93 * local4 * 50 / 1000);
					local13.anInt10181 -= local27 * 20;
				}
				local13.aBoolean760 = false;
			}
		}
		this.anInt1027 = arg0;
		this.aClass391_8.method9274(5);
		this.aClass391_9.method9274(5);
	}

	@OriginalMember(owner = "client!cba", name = "u", descriptor = "()Z")
	@Override
	public boolean method7707() {
		return true;
	}

	@OriginalMember(owner = "client!cba", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass240Array1.length; local1++) {
			this.aClass240Array1[local1].anInt6455 = this.aClass240Array1[local1].anInt6456;
			this.aClass240Array1[local1].anInt6450 = arg0;
			this.aClass240Array1[local1].anInt6456 = arg1;
			this.aClass240Array1[local1].anInt6449 = arg2;
			this.aClass240Array1[local1].aBoolean499 = true;
		}
	}

	@OriginalMember(owner = "client!cba", name = "m", descriptor = "(I)Z")
	public boolean method1078(@OriginalArg(0) int arg0) {
		return super.anInterface1_11.method2860(arg0);
	}

	@OriginalMember(owner = "client!cba", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt1036;
		this.anInt1036 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cba", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(33) int local33;
		if (this.anInt1052 == 0 && this.anInt1037 == this.anInt1042 && this.anInt1033 == 0 && this.anInt1044 == this.anInt1031) {
			local25 = this.aFloatArray10.length;
			local31 = local25 - (local25 & 0x7);
			local33 = 0;
			while (local33 < local31) {
				this.aFloatArray10[local33++] = 2.14748365E9F;
				this.aFloatArray10[local33++] = 2.14748365E9F;
				this.aFloatArray10[local33++] = 2.14748365E9F;
				this.aFloatArray10[local33++] = 2.14748365E9F;
				this.aFloatArray10[local33++] = 2.14748365E9F;
				this.aFloatArray10[local33++] = 2.14748365E9F;
				this.aFloatArray10[local33++] = 2.14748365E9F;
				this.aFloatArray10[local33++] = 2.14748365E9F;
			}
			while (local33 < local25) {
				this.aFloatArray10[local33++] = 2.14748365E9F;
			}
			return;
		}
		local25 = this.anInt1037 - this.anInt1052;
		local31 = this.anInt1044 - this.anInt1033;
		local33 = this.anInt1042 - local25;
		@Pc(124) int local124 = this.anInt1052 + this.anInt1033 * this.anInt1042;
		@Pc(128) int local128 = local25 >> 3;
		@Pc(132) int local132 = local25 & 0x7;
		local25 = local124 - 1;
		for (@Pc(139) int local139 = -local31; local139 < 0; local139++) {
			@Pc(144) int local144;
			if (local128 > 0) {
				local144 = local128;
				do {
					local25++;
					this.aFloatArray10[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray10[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray10[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray10[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray10[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray10[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray10[local25] = 2.14748365E9F;
					local25++;
					this.aFloatArray10[local25] = 2.14748365E9F;
					local144--;
				} while (local144 > 0);
			}
			if (local132 > 0) {
				local144 = local132;
				do {
					local25++;
					this.aFloatArray10[local25] = 2.14748365E9F;
					local144--;
				} while (local144 > 0);
			}
			local25 += local33;
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(Z)V")
	@Override
	public void method7678(@OriginalArg(0) boolean arg0) {
		this.aBoolean94 = arg0;
		this.aClass391_9.method9276(0);
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "()Z")
	@Override
	public boolean method7644() {
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt1048 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt1048 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray10;
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

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method7676() {
		return new Class203_Sub3();
	}

	@OriginalMember(owner = "client!cba", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass203_Sub3_1.aFloat195 * (float) arg0 + this.aClass203_Sub3_1.aFloat194 * (float) arg1 + this.aClass203_Sub3_1.aFloat188 * (float) arg2 + this.aClass203_Sub3_1.aFloat191;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass203_Sub3_1.aFloat195 * (float) arg3 + this.aClass203_Sub3_1.aFloat194 * (float) arg4 + this.aClass203_Sub3_1.aFloat188 * (float) arg5 + this.aClass203_Sub3_1.aFloat191;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt1028 && local57 < (float) this.anInt1028) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt1051 && local57 > (float) this.anInt1051) {
			local1 |= 0x20;
		}
		@Pc(132) int local132 = (int) ((float) this.anInt1050 * (this.aClass203_Sub3_1.aFloat189 * (float) arg0 + this.aClass203_Sub3_1.aFloat196 * (float) arg1 + this.aClass203_Sub3_1.aFloat190 * (float) arg2 + this.aClass203_Sub3_1.aFloat197) / local26);
		@Pc(164) int local164 = (int) ((float) this.anInt1050 * (this.aClass203_Sub3_1.aFloat189 * (float) arg3 + this.aClass203_Sub3_1.aFloat196 * (float) arg4 + this.aClass203_Sub3_1.aFloat190 * (float) arg5 + this.aClass203_Sub3_1.aFloat197) / local57);
		if (local132 < this.anInt1034 && local164 < this.anInt1034) {
			local1 |= 0x1;
		} else if (local132 > this.anInt1053 && local164 > this.anInt1053) {
			local1 |= 0x2;
		}
		@Pc(225) int local225 = (int) ((float) this.anInt1030 * (this.aClass203_Sub3_1.aFloat193 * (float) arg0 + this.aClass203_Sub3_1.aFloat199 * (float) arg1 + this.aClass203_Sub3_1.aFloat198 * (float) arg2 + this.aClass203_Sub3_1.aFloat192) / local26);
		@Pc(257) int local257 = (int) ((float) this.anInt1030 * (this.aClass203_Sub3_1.aFloat193 * (float) arg3 + this.aClass203_Sub3_1.aFloat199 * (float) arg4 + this.aClass203_Sub3_1.aFloat198 * (float) arg5 + this.aClass203_Sub3_1.aFloat192) / local57);
		if (local225 < this.anInt1032 && local257 < this.anInt1032) {
			local1 |= 0x4;
		} else if (local225 > this.anInt1040 && local257 > this.anInt1040) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!cba", name = "z", descriptor = "()I")
	@Override
	public int method7721() {
		return 0;
	}

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "()Z")
	@Override
	public boolean method7719() {
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "C", descriptor = "()V")
	private void method1079() {
		this.anInt1034 = this.anInt1052 - this.anInt1057;
		this.anInt1053 = this.anInt1037 - this.anInt1057;
		this.anInt1032 = this.anInt1033 - this.anInt1043;
		this.anInt1040 = this.anInt1044 - this.anInt1043;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1056; local29++) {
			@Pc(36) Class110 local36 = this.aClass240Array1[local29].aClass110_1;
			local36.anInt2327 = this.anInt1057 - this.anInt1052;
			local36.anInt2325 = this.anInt1043 - this.anInt1033;
			local36.anInt2329 = this.anInt1037 - this.anInt1052;
			local36.anInt2326 = this.anInt1044 - this.anInt1033;
		}
		@Pc(78) int local78 = this.anInt1033 * this.anInt1042 + this.anInt1052;
		for (@Pc(81) int local81 = this.anInt1033; local81 < this.anInt1044; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt1056; local84++) {
				this.aClass240Array1[local84].aClass110_1.anIntArray130[local81 - this.anInt1033] = local78;
			}
			local78 += this.anInt1042;
		}
	}

	@OriginalMember(owner = "client!cba", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class240 local3 = this.method1080(Thread.currentThread());
		local3.anInt6450 = arg0;
		local3.anInt6456 = arg1;
		local3.anInt6449 = arg2;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7696() {
		@Pc(3) Class240 local3 = this.method1080(Thread.currentThread());
		@Pc(6) Class110 local6 = local3.aClass110_1;
		local6.aBoolean192 = false;
		@Pc(14) int local14 = 5 - this.anInt1034;
		@Pc(19) int local19 = 75 - this.anInt1034;
		@Pc(24) int local24 = 15 - this.anInt1034;
		@Pc(29) int local29 = 10 - this.anInt1032;
		@Pc(34) int local34 = 50 - this.anInt1032;
		@Pc(39) int local39 = 90 - this.anInt1032;
		local6.aBoolean193 = local14 < 0 || local14 > local6.anInt2329 || local19 < 0 || local19 > local6.anInt2329 || local24 < 0 || local24 > local6.anInt2329;
		if (255 == 255 && true) {
			local6.anInt2328 = 0;
			local6.aBoolean195 = false;
			local6.method2028((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		} else {
			local6.anInt2328 = 0;
			local6.aBoolean195 = false;
			local6.method2028((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		}
		local6.aBoolean192 = true;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7666(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas2 == null || this.aClass5_Sub18_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(19) Graphics local19 = this.aCanvas2.getGraphics();
			for (@Pc(21) int local21 = 0; local21 < arg1; local21++) {
				@Pc(26) Rectangle local26 = arg0[local21];
				if (local26.x + arg2 <= this.anInt1042 && local26.y + arg3 <= this.anInt1031 && local26.x + arg2 + local26.width > 0 && local26.y + arg3 + local26.height > 0) {
					this.aClass5_Sub18_1.method5406(local26.x + arg2, local26.y + arg3, local26.height, local19, local26.width, local26.y, local26.x);
				}
			}
		} catch (@Pc(91) Exception local91) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!mp;")
	public Class240 method1080(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1056; local1++) {
			if (this.aClass240Array1[local1].aRunnable2 == arg0) {
				return this.aClass240Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cba", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass240Array1.length; local1++) {
			@Pc(7) Class240 local7 = this.aClass240Array1[local1];
			local7.anInt6456 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt6456 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt6456 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt6456 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt6456 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean498 = false;
			} else {
				local7.aBoolean498 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cba", name = "q", descriptor = "(I)Z")
	public boolean method1081(@OriginalArg(0) int arg0) {
		return this.aBoolean94 || super.anInterface1_11.method2863(arg0).aBoolean485;
	}

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "()Z")
	@Override
	public boolean method7665() {
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "()Lclient!mi;")
	@Override
	public Class236 method7656() {
		return new Class236(0, "Pure Java", 1, "CPU", 0L);
	}
}
