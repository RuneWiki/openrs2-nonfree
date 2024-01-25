import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class12_Sub3 extends Class12 {

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "Z")
	private boolean aBoolean563;

	@OriginalMember(owner = "client!rfa", name = "r", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!rfa", name = "s", descriptor = "Lclient!fc;")
	private Class1_Sub15 aClass1_Sub15_1;

	@OriginalMember(owner = "client!rfa", name = "t", descriptor = "I")
	private int anInt7793;

	@OriginalMember(owner = "client!rfa", name = "u", descriptor = "Z")
	private boolean aBoolean564;

	@OriginalMember(owner = "client!rfa", name = "v", descriptor = "Lclient!wh;")
	private Class356 aClass356_34;

	@OriginalMember(owner = "client!rfa", name = "w", descriptor = "I")
	public int anInt7794;

	@OriginalMember(owner = "client!rfa", name = "x", descriptor = "I")
	public int anInt7795;

	@OriginalMember(owner = "client!rfa", name = "y", descriptor = "I")
	public int anInt7796;

	@OriginalMember(owner = "client!rfa", name = "z", descriptor = "I")
	public int anInt7797;

	@OriginalMember(owner = "client!rfa", name = "A", descriptor = "[Lclient!mm;")
	private Class216[] aClass216Array1;

	@OriginalMember(owner = "client!rfa", name = "B", descriptor = "[I")
	public int[] anIntArray518;

	@OriginalMember(owner = "client!rfa", name = "C", descriptor = "Lclient!lu;")
	public Class209_Sub1 aClass209_Sub1_2;

	@OriginalMember(owner = "client!rfa", name = "D", descriptor = "I")
	public int anInt7798;

	@OriginalMember(owner = "client!rfa", name = "E", descriptor = "I")
	private int anInt7799;

	@OriginalMember(owner = "client!rfa", name = "F", descriptor = "I")
	public int anInt7800;

	@OriginalMember(owner = "client!rfa", name = "G", descriptor = "I")
	public int anInt7801;

	@OriginalMember(owner = "client!rfa", name = "H", descriptor = "I")
	public int anInt7802;

	@OriginalMember(owner = "client!rfa", name = "I", descriptor = "Lclient!f;")
	private Class10 aClass10_36;

	@OriginalMember(owner = "client!rfa", name = "J", descriptor = "[I")
	public int[] anIntArray519;

	@OriginalMember(owner = "client!rfa", name = "K", descriptor = "Lclient!uf;")
	private final Class326 aClass326_44;

	@OriginalMember(owner = "client!rfa", name = "L", descriptor = "I")
	public int anInt7803;

	@OriginalMember(owner = "client!rfa", name = "M", descriptor = "I")
	public int anInt7804;

	@OriginalMember(owner = "client!rfa", name = "N", descriptor = "I")
	private int anInt7805;

	@OriginalMember(owner = "client!rfa", name = "O", descriptor = "I")
	private int anInt7806;

	@OriginalMember(owner = "client!rfa", name = "P", descriptor = "Lclient!uf;")
	private final Class326 aClass326_45;

	@OriginalMember(owner = "client!rfa", name = "Q", descriptor = "I")
	public int anInt7807;

	@OriginalMember(owner = "client!rfa", name = "R", descriptor = "I")
	public int anInt7808;

	@OriginalMember(owner = "client!rfa", name = "S", descriptor = "I")
	private int anInt7809;

	@OriginalMember(owner = "client!rfa", name = "T", descriptor = "I")
	public int anInt7810;

	@OriginalMember(owner = "client!rfa", name = "U", descriptor = "I")
	public int anInt7811;

	@OriginalMember(owner = "client!rfa", name = "V", descriptor = "I")
	public int anInt7812;

	@OriginalMember(owner = "client!rfa", name = "W", descriptor = "Z")
	private boolean aBoolean565;

	@OriginalMember(owner = "client!rfa", name = "X", descriptor = "I")
	public int anInt7813;

	@OriginalMember(owner = "client!rfa", name = "Y", descriptor = "I")
	public int anInt7814;

	@OriginalMember(owner = "client!rfa", name = "Z", descriptor = "I")
	private int anInt7815;

	@OriginalMember(owner = "client!rfa", name = "ab", descriptor = "I")
	public int anInt7816;

	@OriginalMember(owner = "client!rfa", name = "bb", descriptor = "I")
	public int anInt7817;

	@OriginalMember(owner = "client!rfa", name = "cb", descriptor = "I")
	public int anInt7818;

	@OriginalMember(owner = "client!rfa", name = "db", descriptor = "I")
	public int anInt7819;

	@OriginalMember(owner = "client!rfa", name = "eb", descriptor = "I")
	public int anInt7820;

	@OriginalMember(owner = "client!rfa", name = "fb", descriptor = "I")
	private int anInt7821;

	@OriginalMember(owner = "client!rfa", name = "gb", descriptor = "Lclient!f;")
	private Class10 aClass10_37;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public Class12_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1) {
		this(arg1);
		this.method6437(arg0);
		this.method6405(arg0);
	}

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lclient!fa;)V")
	private Class12_Sub3(@OriginalArg(0) Interface5 arg0) {
		super(arg0);
		this.aBoolean563 = false;
		this.aBoolean564 = false;
		this.aClass356_34 = new Class356(4);
		this.anInt7801 = 45823;
		this.anInt7804 = 512;
		this.anInt7813 = 0;
		this.anInt7811 = 75518;
		this.aBoolean565 = false;
		this.anInt7806 = 0;
		this.anInt7799 = 0;
		this.anInt7798 = 0;
		this.anInt7820 = 0;
		this.anInt7812 = 0;
		this.anInt7819 = 50;
		this.anInt7797 = 512;
		this.anInt7816 = 3500;
		this.anInt7818 = 78642;
		this.aClass326_45 = new Class326(16);
		this.anInt7821 = -1;
		this.aClass326_44 = new Class326(256);
		this.aClass209_Sub1_2 = new Class209_Sub1();
		this.method6399(1);
		this.method6428(0);
		Static113.method1979(false, true);
		this.aBoolean563 = true;
		this.anInt7793 = (int) Static255.method4035();
	}

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "()V")
	@Override
	public void method6425() {
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "([I)V")
	@Override
	public void method6430(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7796;
		arg0[1] = this.anInt7815;
	}

	@OriginalMember(owner = "client!rfa", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class216 local3 = this.method6482(Thread.currentThread());
		local3.aBoolean425 = arg0;
	}

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "()Z")
	@Override
	public boolean method6411() {
		return false;
	}

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt7796 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray519[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class10 method6470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt7796 + arg0;
		@Pc(16) int local16 = this.anInt7796 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray519[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class10_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class10_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!rfa", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt7819;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
	@Override
	public void method6399(@OriginalArg(0) int arg0) {
		this.anInt7814 = arg0;
		this.aClass216Array1 = new Class216[this.anInt7814];
		for (@Pc(9) int local9 = 0; local9 < this.anInt7814; local9++) {
			this.aClass216Array1[local9] = new Class216(this);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6398(@OriginalArg(0) boolean arg0) {
		this.aBoolean565 = arg0;
		this.aClass326_44.method7230();
	}

	@OriginalMember(owner = "client!rfa", name = "i", descriptor = "()Z")
	@Override
	public boolean method6415() {
		return true;
	}

	@OriginalMember(owner = "client!rfa", name = "w", descriptor = "()Z")
	@Override
	public boolean method6459() {
		return false;
	}

	@OriginalMember(owner = "client!rfa", name = "s", descriptor = "()Z")
	@Override
	public boolean method6442() {
		return true;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6471(@OriginalArg(0) Class209 arg0) {
		this.aClass209_Sub1_2 = (Class209_Sub1) arg0;
	}

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "(I)V")
	@Override
	public void method6454(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6400(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas11 == null || this.aClass1_Sub15_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas11.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt7796 && local21.y <= this.anInt7815 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub15_1.method7870(local21.x, local14, local21.height, local21.y, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas11.repaint();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass216Array1.length; local1++) {
			this.aClass216Array1[local1].anInt5900 = this.aClass216Array1[local1].anInt5894;
			this.aClass216Array1[local1].aBoolean426 = false;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6405(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas11 = null;
			this.aClass1_Sub15_1 = null;
			if (this.aClass10_36 == null) {
				this.anIntArray519 = null;
				this.anInt7796 = this.anInt7815 = 1;
				this.anInt7809 = this.anInt7805 = 1;
				this.method6475();
			}
			return;
		}
		@Pc(10) Class1_Sub15 local10 = (Class1_Sub15) this.aClass356_34.method7796((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas11 = arg0;
		this.aClass1_Sub15_1 = local10;
		if (this.aClass10_36 != null) {
			return;
		}
		this.anIntArray519 = local10.anIntArray632;
		this.anInt7796 = local10.anInt9524;
		this.anInt7815 = local10.anInt9526;
		if (this.anInt7796 != this.anInt7809 || this.anInt7815 != this.anInt7805) {
			this.anInt7809 = this.anInt7796;
			this.anInt7805 = this.anInt7815;
			this.anIntArray518 = new int[this.anInt7809 * this.anInt7805];
		}
		this.method6475();
		return;
	}

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method6468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt7812) {
					arg1 += local104 * (this.anInt7812 - arg0);
					arg0 = this.anInt7812;
				}
				if (arg2 >= this.anInt7813) {
					arg2 = this.anInt7813 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt7798 && local150 < this.anInt7820) {
							this.anIntArray519[arg0 + local150 * this.anInt7796] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt7798 && local213 < this.anInt7820) {
							local228 = arg0 + local213 * this.anInt7796;
							local233 = this.anIntArray519[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray519[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt7798 && local150 < this.anInt7820) {
							local213 = arg0 + local150 * this.anInt7796;
							local228 = this.anIntArray519[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray519[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt7798) {
					arg0 += local104 * (this.anInt7798 - arg1);
					arg1 = this.anInt7798;
				}
				if (arg3 >= this.anInt7820) {
					arg3 = this.anInt7820 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt7812 && local150 < this.anInt7813) {
							this.anIntArray519[local150 + arg1 * this.anInt7796] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt7812 && local213 < this.anInt7813) {
							local228 = local213 + arg1 * this.anInt7796;
							local233 = this.anIntArray519[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray519[local213 + arg1 * this.anInt7796] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt7812 && local150 < this.anInt7813) {
							local213 = local150 + arg1 * this.anInt7796;
							local228 = this.anIntArray519[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray519[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!rfa", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt7798 || arg1 >= this.anInt7820) {
			return;
		}
		if (arg0 < this.anInt7812) {
			arg2 -= this.anInt7812 - arg0;
			arg0 = this.anInt7812;
		}
		if (arg0 + arg2 > this.anInt7813) {
			arg2 = this.anInt7813 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt7796;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray519[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray519[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray519[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray519[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray519[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "D", descriptor = "()V")
	private void method6475() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7814; local1++) {
			this.aClass216Array1[local1].method4974();
		}
		this.JA();
	}

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "(I)Z")
	public boolean method6476(@OriginalArg(0) int arg0) {
		return super.anInterface5_10.method4043(arg0).aBoolean119;
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)Lclient!e;")
	@Override
	public Class1_Sub11 method6403(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rfa", name = "i", descriptor = "(I)Z")
	public boolean method6477(@OriginalArg(0) int arg0) {
		return super.anInterface5_10.method4045(arg0);
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(IIIIIIIIII)V")
	public void method6478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface5_10.method4043(arg6).aBoolean118) {
			this.method6479(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt7821 != arg6) {
			@Pc(26) Class10 local26 = (Class10) this.aClass326_45.method7238((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method6485(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method6480(arg6) ? 64 : 128;
				local26 = this.method6429(local32, local43, local43, local43);
				this.aClass326_45.method7236(local26, (long) arg6);
			}
			this.anInt7821 = arg6;
			this.aClass10_37 = local26;
		}
		((Class10_Sub1) this.aClass10_37).method2343(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!rfa", name = "r", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6441() {
		@Pc(3) Class216 local3 = this.method6482(Thread.currentThread());
		return local3.aClass209_Sub1_1;
	}

	@OriginalMember(owner = "client!rfa", name = "u", descriptor = "()Z")
	@Override
	public boolean method6455() {
		return false;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)I")
	@Override
	public int method6445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(Z)V")
	@Override
	public void method6461(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "(IIIIII)V")
	private void method6479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg2 << 8;
		@Pc(12) int local12 = arg1 - arg3;
		if (local12 < this.anInt7798) {
			local12 = this.anInt7798;
		}
		@Pc(25) int local25 = arg1 + arg3 + 1;
		if (local25 > this.anInt7820) {
			local25 = this.anInt7820;
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
				if (local95 < this.anInt7812) {
					local95 = this.anInt7812;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt7813) {
					local106 = this.anInt7813;
				}
				local120 = local95 + local34 * this.anInt7796;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray518[local120]) {
						this.anIntArray519[local120] = arg4;
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
				if (local95 < this.anInt7812) {
					local95 = this.anInt7812;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt7813 - 1) {
					local106 = this.anInt7813 - 1;
				}
				local120 = local95 + local34 * this.anInt7796;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray518[local120]) {
						this.anIntArray519[local120] = arg4;
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
				if (local106 < this.anInt7812) {
					local106 = this.anInt7812;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt7813) {
					local120 = this.anInt7813;
				}
				local122 = local106 + local34 * this.anInt7796;
				for (local350 = local106; local350 < local120; local350++) {
					if (local8 < this.anIntArray518[local122]) {
						local362 = this.anIntArray519[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray519[local122] = local293 + local362;
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
				if (local106 < this.anInt7812) {
					local106 = this.anInt7812;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt7813 - 1) {
					local120 = this.anInt7813 - 1;
				}
				local122 = local106 + local34 * this.anInt7796;
				for (local350 = local106; local350 <= local120; local350++) {
					if (local8 < this.anIntArray518[local122]) {
						local362 = this.anIntArray519[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray519[local122] = local293 + local362;
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
				if (local95 < this.anInt7812) {
					local95 = this.anInt7812;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt7813) {
					local106 = this.anInt7813;
				}
				local120 = local95 + local34 * this.anInt7796;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray518[local120]) {
						local350 = this.anIntArray519[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(637) int local637 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray519[local120] = local362 - local637 | local637 - (local637 >>> 8);
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
				if (local95 < this.anInt7812) {
					local95 = this.anInt7812;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt7813 - 1) {
					local106 = this.anInt7813 - 1;
				}
				local120 = local95 + local34 * this.anInt7796;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray518[local120]) {
						local350 = this.anIntArray519[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray519[local120] = local362 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!rfa", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt7816;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class17 method6452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class17_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "()Z")
	@Override
	public boolean method6397() {
		return false;
	}

	@OriginalMember(owner = "client!rfa", name = "z", descriptor = "()V")
	@Override
	public void method6469() {
	}

	@OriginalMember(owner = "client!rfa", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt7796;
		@Pc(35) int local35 = this.anInt7796 - arg2;
		if (arg1 + arg3 > this.anInt7820) {
			arg3 -= arg1 + arg3 - this.anInt7820;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt7798) {
			local59 = this.anInt7798 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt7796;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt7813) {
			local59 = arg0 + arg2 - this.anInt7813;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt7812) {
			local59 = this.anInt7812 - arg0;
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
						this.anIntArray519[local30++] = arg4;
					} else {
						this.anIntArray519[local30++] = arg5;
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
					local245 = this.anIntArray519[local30];
					this.anIntArray519[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray519[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray519[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!rfa", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt7812 = 0;
		this.anInt7798 = 0;
		this.anInt7813 = this.anInt7796;
		this.anInt7820 = this.anInt7815;
		this.method6484();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!cca;IIII)Lclient!da;")
	@Override
	public Class61 method6407(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class61_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!rfa", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7807 = arg0;
		this.anInt7810 = arg1;
		this.anInt7804 = arg2;
		this.anInt7797 = arg3;
		this.method6484();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ec;)V")
	@Override
	public void method6460(@OriginalArg(0) Class82 arg0) {
		@Pc(3) Class216 local3 = this.method6482(Thread.currentThread());
		@Pc(7) Class20_Sub1 local7 = arg0.aClass127_1.aClass20_Sub1_7;
		for (@Pc(10) Class20_Sub1 local10 = local7.aClass20_Sub1_9; local10 != local7; local10 = local10.aClass20_Sub1_9) {
			@Pc(14) Class20_Sub1_Sub1 local14 = (Class20_Sub1_Sub1) local10;
			@Pc(19) int local19 = local14.anInt6325 >> 12;
			@Pc(24) int local24 = local14.anInt6324 >> 12;
			@Pc(29) int local29 = local14.anInt6329 >> 12;
			@Pc(54) float local54 = this.aClass209_Sub1_2.aFloat132 + this.aClass209_Sub1_2.aFloat134 * (float) local19 + this.aClass209_Sub1_2.aFloat128 * (float) local24 + this.aClass209_Sub1_2.aFloat131 * (float) local29;
			if (!(local54 < (float) this.anInt7819) && !(local54 > (float) local3.anInt5896)) {
				@Pc(102) int local102 = this.anInt7807 + (int) ((float) this.anInt7804 * (this.aClass209_Sub1_2.aFloat133 + this.aClass209_Sub1_2.aFloat130 * (float) local19 + this.aClass209_Sub1_2.aFloat124 * (float) local24 + this.aClass209_Sub1_2.aFloat127 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt7810 + (int) ((float) this.anInt7797 * (this.aClass209_Sub1_2.aFloat129 + this.aClass209_Sub1_2.aFloat126 * (float) local19 + this.aClass209_Sub1_2.aFloat125 * (float) local24 + this.aClass209_Sub1_2.aFloat135 * (float) local29) / local54);
				if (local102 >= this.anInt7812 && local102 <= this.anInt7813 && local137 >= this.anInt7798 && local137 <= this.anInt7820) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method6483(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt6323 * this.anInt7804 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[Lclient!qea;)V")
	@Override
	public void method6402(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1) {
	}

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "(I)Z")
	public boolean method6480(@OriginalArg(0) int arg0) {
		return this.aBoolean565 || super.anInterface5_10.method4043(arg0).aBoolean124;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!tq;Z)Lclient!f;")
	@Override
	public Class10 method6434(@OriginalArg(0) Class318 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray587;
		@Pc(5) byte[] local5 = arg0.aByteArray94;
		@Pc(8) int local8 = arg0.anInt8537;
		@Pc(11) int local11 = arg0.anInt8535;
		@Pc(76) Class10_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray93 == null) {
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
			local76 = new Class10_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray93;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class10_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class10_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.Q(arg0.anInt8533, arg0.anInt8534, arg0.anInt8536, arg0.anInt8538);
		return local76;
	}

	@OriginalMember(owner = "client!rfa", name = "p", descriptor = "()Z")
	@Override
	public boolean method6439() {
		return false;
	}

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt7798) {
			local8 = this.anInt7798;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt7820) {
			local21 = this.anInt7820;
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
				if (local91 < this.anInt7812) {
					local91 = this.anInt7812;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7813) {
					local102 = this.anInt7813;
				}
				local116 = local91 + local30 * this.anInt7796;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray519[local116++] = arg3;
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
				if (local91 < this.anInt7812) {
					local91 = this.anInt7812;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7813 - 1) {
					local102 = this.anInt7813 - 1;
				}
				local116 = local91 + local30 * this.anInt7796;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray519[local116++] = arg3;
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
			if (local102 < this.anInt7812) {
				local102 = this.anInt7812;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt7813) {
				local116 = this.anInt7813;
			}
			local118 = local102 + local30 * this.anInt7796;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray519[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray519[local118++] = local277 + local360;
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
			if (local102 < this.anInt7812) {
				local102 = this.anInt7812;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt7813 - 1) {
				local116 = this.anInt7813 - 1;
			}
			local118 = local102 + local30 * this.anInt7796;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray519[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray519[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt7796) {
			arg2 = this.anInt7796;
		}
		if (arg3 > this.anInt7815) {
			arg3 = this.anInt7815;
		}
		this.anInt7812 = arg0;
		this.anInt7813 = arg2;
		this.anInt7798 = arg1;
		this.anInt7820 = arg3;
		this.method6484();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6395(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub15 local8 = (Class1_Sub15) this.aClass356_34.method7796((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method7878();
		local8 = Static185.method3236(arg0);
		this.aClass356_34.method7800((long) arg0.hashCode(), local8);
		if (this.aCanvas11 != arg0 || this.aClass10_36 != null) {
			return;
		}
		this.aClass1_Sub15_1 = local8;
		this.anIntArray519 = local8.anIntArray632;
		this.anInt7796 = local8.anInt9524;
		this.anInt7815 = local8.anInt9526;
		if (this.anInt7796 != this.anInt7809 || this.anInt7815 != this.anInt7805) {
			this.anInt7809 = this.anInt7796;
			this.anInt7805 = this.anInt7815;
			this.anIntArray518 = new int[this.anInt7809 * this.anInt7805];
		}
		this.method6475();
	}

	@OriginalMember(owner = "client!rfa", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass209_Sub1_2.aFloat134 * (float) arg0 + this.aClass209_Sub1_2.aFloat128 * (float) arg1 + this.aClass209_Sub1_2.aFloat131 * (float) arg2 + this.aClass209_Sub1_2.aFloat132;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass209_Sub1_2.aFloat134 * (float) arg3 + this.aClass209_Sub1_2.aFloat128 * (float) arg4 + this.aClass209_Sub1_2.aFloat131 * (float) arg5 + this.aClass209_Sub1_2.aFloat132;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt7819 && local55 < (float) this.anInt7819 || !(!(local24 > (float) this.anInt7816) || !(local55 > (float) this.anInt7816))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt7804 * (this.aClass209_Sub1_2.aFloat130 * (float) arg0 + this.aClass209_Sub1_2.aFloat124 * (float) arg1 + this.aClass209_Sub1_2.aFloat127 * (float) arg2 + this.aClass209_Sub1_2.aFloat133) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt7804 * (this.aClass209_Sub1_2.aFloat130 * (float) arg3 + this.aClass209_Sub1_2.aFloat124 * (float) arg4 + this.aClass209_Sub1_2.aFloat127 * (float) arg5 + this.aClass209_Sub1_2.aFloat133) / local55);
		if (local119 < this.anInt7794 && local151 < this.anInt7794 || local119 > this.anInt7800 && local151 > this.anInt7800) {
			return false;
		} else {
			@Pc(201) int local201 = (int) ((float) this.anInt7797 * (this.aClass209_Sub1_2.aFloat126 * (float) arg0 + this.aClass209_Sub1_2.aFloat125 * (float) arg1 + this.aClass209_Sub1_2.aFloat135 * (float) arg2 + this.aClass209_Sub1_2.aFloat129) / local24);
			@Pc(233) int local233 = (int) ((float) this.anInt7797 * (this.aClass209_Sub1_2.aFloat126 * (float) arg3 + this.aClass209_Sub1_2.aFloat125 * (float) arg4 + this.aClass209_Sub1_2.aFloat135 * (float) arg5 + this.aClass209_Sub1_2.aFloat129) / local55);
			return (local201 >= this.anInt7802 || local233 >= this.anInt7802) && (local201 <= this.anInt7808 || local233 <= this.anInt7808);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6410() {
		return new Class209_Sub1();
	}

	@OriginalMember(owner = "client!rfa", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass216Array1.length; local1++) {
			@Pc(7) Class216 local7 = this.aClass216Array1[local1];
			local7.anInt5900 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt5900 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt5900 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt5900 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt5900 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean424 = false;
			} else {
				local7.aBoolean424 = true;
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "x", descriptor = "()V")
	@Override
	public void method6462() {
		if (this.aCanvas11 == null) {
			this.anInt7796 = 1;
			this.anInt7815 = 1;
			this.anIntArray519 = null;
		} else {
			this.anIntArray519 = this.aClass1_Sub15_1.anIntArray632;
			this.anInt7796 = this.aClass1_Sub15_1.anInt9524;
			this.anInt7815 = this.aClass1_Sub15_1.anInt9526;
		}
		this.aClass10_36 = null;
		this.method6475();
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ec;I)V")
	@Override
	public void method6404(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class216 local3 = this.method6482(Thread.currentThread());
		@Pc(7) Class20_Sub1 local7 = arg0.aClass127_1.aClass20_Sub1_7;
		for (@Pc(10) Class20_Sub1 local10 = local7.aClass20_Sub1_9; local10 != local7; local10 = local10.aClass20_Sub1_9) {
			@Pc(14) Class20_Sub1_Sub1 local14 = (Class20_Sub1_Sub1) local10;
			@Pc(19) int local19 = local14.anInt6325 >> 12;
			@Pc(24) int local24 = local14.anInt6324 >> 12;
			@Pc(29) int local29 = local14.anInt6329 >> 12;
			@Pc(54) float local54 = this.aClass209_Sub1_2.aFloat132 + this.aClass209_Sub1_2.aFloat134 * (float) local19 + this.aClass209_Sub1_2.aFloat128 * (float) local24 + this.aClass209_Sub1_2.aFloat131 * (float) local29;
			if (!(local54 < (float) this.anInt7819) && !(local54 > (float) local3.anInt5896)) {
				@Pc(103) int local103 = this.anInt7807 + (int) ((float) this.anInt7804 * (this.aClass209_Sub1_2.aFloat133 + this.aClass209_Sub1_2.aFloat130 * (float) local19 + this.aClass209_Sub1_2.aFloat124 * (float) local24 + this.aClass209_Sub1_2.aFloat127 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt7810 + (int) ((float) this.anInt7797 * (this.aClass209_Sub1_2.aFloat129 + this.aClass209_Sub1_2.aFloat126 * (float) local19 + this.aClass209_Sub1_2.aFloat125 * (float) local24 + this.aClass209_Sub1_2.aFloat135 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt7812 && local103 <= this.anInt7813 && local139 >= this.anInt7798 && local139 <= this.anInt7820) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method6483(local14, local103, local139, (int) local54, (local14.anInt6323 * this.anInt7804 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "(I)I")
	public int method6481(@OriginalArg(0) int arg0) {
		return super.anInterface5_10.method4043(arg0).aShort19 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "()Z")
	@Override
	public boolean method6413() {
		return true;
	}

	@OriginalMember(owner = "client!rfa", name = "t", descriptor = "()Z")
	@Override
	public boolean method6451() {
		return false;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V")
	@Override
	public void method6401(@OriginalArg(0) int arg0) {
		this.aClass216Array1[arg0].method4973(null);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class200 method6449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class200_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rfa", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class216 local3 = this.method6482(Thread.currentThread());
		this.anInt7819 = arg0;
		this.anInt7816 = arg1;
		local3.anInt5896 = this.anInt7816 - 255;
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(IIIIII)Lclient!it;")
	@Override
	public Class36 method6444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!rfa", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt7812) {
			arg2 -= this.anInt7812 - arg0;
			arg0 = this.anInt7812;
		}
		if (arg1 < this.anInt7798) {
			arg3 -= this.anInt7798 - arg1;
			arg1 = this.anInt7798;
		}
		if (arg0 + arg2 > this.anInt7813) {
			arg2 = this.anInt7813 - arg0;
		}
		if (arg1 + arg3 > this.anInt7820) {
			arg3 = this.anInt7820 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt7813 || arg1 > this.anInt7820) {
			return;
		}
		@Pc(67) int local67 = this.anInt7796 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt7796;
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
						local217 = this.anIntArray519[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray519[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray519[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray519[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray519[arg2] = arg4;
					arg2++;
					this.anIntArray519[arg2] = arg4;
					arg2++;
					this.anIntArray519[arg2] = arg4;
					arg2++;
					this.anIntArray519[arg2] = arg4;
					arg2++;
					this.anIntArray519[arg2] = arg4;
					arg2++;
					this.anIntArray519[arg2] = arg4;
					arg2++;
					this.anIntArray519[arg2] = arg4;
					arg2++;
					this.anIntArray519[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray519[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(II)I")
	@Override
	public int method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!mm;")
	public Class216 method6482(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7814; local1++) {
			if (this.aClass216Array1[local1].aRunnable1 == arg0) {
				return this.aClass216Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "()Z")
	@Override
	public boolean method6408() {
		return false;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!bh;IIII)V")
	private void method6483(@OriginalArg(0) Class20_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt6322;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method6479(arg1, arg2, arg3, arg4, arg0.anInt6327, 1);
			return;
		}
		if (this.anInt7821 != local2) {
			@Pc(33) Class10 local33 = (Class10) this.aClass326_45.method7238((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method6485(local2);
				if (local39 == null) {
					return;
				}
				@Pc(49) int local49 = this.method6480(local2) ? 64 : 128;
				local33 = this.method6429(local39, local49, local49, local49);
				this.aClass326_45.method7236(local33, (long) local2);
			}
			this.anInt7821 = local2;
			this.aClass10_37 = local33;
		}
		local8++;
		((Class10_Sub1) this.aClass10_37).method2343(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt6327, 1);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6433() {
		@Pc(3) Class216 local3 = this.method6482(Thread.currentThread());
		@Pc(6) Class128 local6 = local3.aClass128_1;
		local6.aBoolean254 = false;
		@Pc(14) int local14 = 5 - this.anInt7794;
		@Pc(19) int local19 = 75 - this.anInt7794;
		@Pc(24) int local24 = 15 - this.anInt7794;
		@Pc(29) int local29 = 10 - this.anInt7802;
		@Pc(34) int local34 = 50 - this.anInt7802;
		@Pc(39) int local39 = 90 - this.anInt7802;
		local6.aBoolean250 = local14 < 0 || local14 > local6.anInt3217 || local19 < 0 || local19 > local6.anInt3217 || local24 < 0 || local24 > local6.anInt3217;
		local6.aBoolean249 = true;
		local6.anInt3219 = 0;
		local6.aBoolean251 = false;
		local6.method2728(local29, local34, local39, local14, local19, local24, 0, 0, 0, -65536, -65536, -65536);
		local6.aBoolean254 = true;
		local6.aBoolean249 = false;
	}

	@OriginalMember(owner = "client!rfa", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass216Array1.length; local1++) {
			this.aClass216Array1[local1].anInt5894 = this.aClass216Array1[local1].anInt5900;
			this.aClass216Array1[local1].anInt5899 = arg0;
			this.aClass216Array1[local1].anInt5900 = arg1;
			this.aClass216Array1[local1].anInt5898 = arg2;
			this.aClass216Array1[local1].aBoolean426 = true;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.J(0, 0, this.anInt7796, this.anInt7815, arg0, 0);
	}

	@OriginalMember(owner = "client!rfa", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(2) int local2 = this.anInt7799;
		this.anInt7799 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!rfa", name = "E", descriptor = "()V")
	private void method6484() {
		this.anInt7794 = this.anInt7812 - this.anInt7807;
		this.anInt7800 = this.anInt7813 - this.anInt7807;
		this.anInt7802 = this.anInt7798 - this.anInt7810;
		this.anInt7808 = this.anInt7820 - this.anInt7810;
		for (@Pc(29) int local29 = 0; local29 < this.anInt7814; local29++) {
			@Pc(36) Class128 local36 = this.aClass216Array1[local29].aClass128_1;
			local36.anInt3215 = this.anInt7807 - this.anInt7812;
			local36.anInt3216 = this.anInt7810 - this.anInt7798;
			local36.anInt3217 = this.anInt7813 - this.anInt7812;
			local36.anInt3218 = this.anInt7820 - this.anInt7798;
		}
		@Pc(78) int local78 = this.anInt7798 * this.anInt7796 + this.anInt7812;
		for (@Pc(81) int local81 = this.anInt7798; local81 < this.anInt7820; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt7814; local84++) {
				this.aClass216Array1[local84].aClass128_1.anIntArray190[local81 - this.anInt7798] = local78;
			}
			local78 += this.anInt7796;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6396(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas11 == arg0) {
			this.method6405(null);
		}
		@Pc(15) Class1_Sub15 local15 = (Class1_Sub15) this.aClass356_34.method7796((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7878();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return 0;
	}

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "()Lclient!q;")
	@Override
	public Class209 method6417() {
		return this.aClass209_Sub1_2;
	}

	@OriginalMember(owner = "client!rfa", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class216 local3 = this.method6482(Thread.currentThread());
		local3.anInt5899 = arg0;
		local3.anInt5900 = arg1;
		local3.anInt5898 = arg2;
	}

	@OriginalMember(owner = "client!rfa", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass209_Sub1_2.aFloat132 + this.aClass209_Sub1_2.aFloat134 * (float) arg0 + this.aClass209_Sub1_2.aFloat128 * (float) arg1 + this.aClass209_Sub1_2.aFloat131 * (float) arg2;
		if (local24 < (float) this.anInt7819 || local24 > (float) this.anInt7816) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt7804 * (this.aClass209_Sub1_2.aFloat133 + this.aClass209_Sub1_2.aFloat130 * (float) arg0 + this.aClass209_Sub1_2.aFloat124 * (float) arg1 + this.aClass209_Sub1_2.aFloat127 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt7797 * (this.aClass209_Sub1_2.aFloat129 + this.aClass209_Sub1_2.aFloat126 * (float) arg0 + this.aClass209_Sub1_2.aFloat125 * (float) arg1 + this.aClass209_Sub1_2.aFloat135 * (float) arg2) / local24);
		if (local81 >= this.anInt7794 && local81 <= this.anInt7800 && local113 >= this.anInt7802 && local113 <= this.anInt7808) {
			arg3[0] = local81 - this.anInt7794;
			arg3[1] = local113 - this.anInt7802;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "l", descriptor = "(I)[I")
	private int[] method6485(@OriginalArg(0) int arg0) {
		@Pc(2) Class326 local2 = this.aClass326_44;
		@Pc(12) Class1_Sub9 local12;
		synchronized (this.aClass326_44) {
			local12 = (Class1_Sub9) this.aClass326_44.method7238((long) arg0);
			if (local12 == null) {
				if (!super.anInterface5_10.method4045(arg0)) {
					return null;
				}
				@Pc(32) Class45 local32 = super.anInterface5_10.method4043(arg0);
				@Pc(42) int local42 = local32.aBoolean124 || this.aBoolean565 ? 64 : 128;
				local12 = new Class1_Sub9(arg0, local42, super.anInterface5_10.method4047(local42, local42, 0.7F, arg0), local32.aBoolean117);
				this.aClass326_44.method7236(local12, (long) arg0);
			}
		}
		local12.aBoolean96 = true;
		return local12.method1165();
	}

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6437(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub15 local8 = (Class1_Sub15) this.aClass356_34.method7796((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static185.method3236(arg0);
			this.aClass356_34.method7800((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7812 < arg0) {
			this.anInt7812 = arg0;
		}
		if (this.anInt7798 < arg1) {
			this.anInt7798 = arg1;
		}
		if (this.anInt7813 > arg2) {
			this.anInt7813 = arg2;
		}
		if (this.anInt7820 > arg3) {
			this.anInt7820 = arg3;
		}
		this.method6484();
	}

	@OriginalMember(owner = "client!rfa", name = "B", descriptor = "()Z")
	@Override
	public boolean method6473() {
		return false;
	}

	@OriginalMember(owner = "client!rfa", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(2) int local2 = this.anInt7806;
		this.anInt7806 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "(I)V")
	@Override
	public void method6424(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt7793;
		for (@Pc(9) Object local9 = this.aClass326_44.method7242(); local9 != null; local9 = this.aClass326_44.method7239()) {
			@Pc(13) Class1_Sub9 local13 = (Class1_Sub9) local9;
			if (local13.aBoolean96) {
				local13.anInt1284 += local4;
				@Pc(27) int local27 = local13.anInt1284 / 20;
				if (local27 > 0) {
					@Pc(36) Class45 local36 = super.anInterface5_10.method4043(local13.anInt1283);
					local13.method1164(local36.aByte26 * local4 * 50 / 1000, local36.aByte24 * local4 * 50 / 1000);
					local13.anInt1284 -= local27 * 20;
				}
				local13.aBoolean96 = false;
			}
		}
		this.anInt7793 = arg0;
		this.aClass326_45.method7241(5);
		this.aClass326_44.method7241(5);
	}

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt7812 || arg0 >= this.anInt7813) {
			return;
		}
		if (arg1 < this.anInt7798) {
			arg2 -= this.anInt7798 - arg1;
			arg1 = this.anInt7798;
		}
		if (arg1 + arg2 > this.anInt7820) {
			arg2 = this.anInt7820 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt7796;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray519[local40 + local54 * this.anInt7796] = arg3;
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
				local111 = local40 + local103 * this.anInt7796;
				local116 = this.anIntArray519[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray519[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt7796;
				local111 = this.anIntArray519[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray519[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class200 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class200_Sub2 local2 = (Class200_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray464;
		@Pc(8) int[] local8 = local2.anIntArray465;
		@Pc(17) int local17 = this.anInt7798 > arg7 ? this.anInt7798 : arg7;
		@Pc(32) int local32 = this.anInt7820 < arg7 + local5.length ? this.anInt7820 : arg7 + local5.length;
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
					if (local129 >= this.anInt7812 && local129 < this.anInt7813 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray519[local129 + arg1 * this.anInt7796] = arg4;
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
					if (local133 >= this.anInt7812 && local133 < this.anInt7813 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt7796;
						local248 = this.anIntArray519[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray519[local133 + arg1 * this.anInt7796] = local201 + local584;
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
		if (arg0 < this.anInt7812) {
			arg1 += local83 * (this.anInt7812 - arg0);
			arg0 = this.anInt7812;
		}
		if (arg2 >= this.anInt7813) {
			arg2 = this.anInt7813 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray519[arg0 + local129 * this.anInt7796] = arg4;
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
					local243 = arg0 + local133 * this.anInt7796;
					local248 = this.anIntArray519[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray519[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6446(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!rfa", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		this.anInt7811 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!rfa", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt7807, this.anInt7810, this.anInt7804, this.anInt7797 };
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!aga;[Lclient!tq;Z)Lclient!la;")
	@Override
	public Class35 method6457(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class318[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt8537;
			local7[local11] = arg1[local11].anInt8535;
			if (arg1[local11].aByteArray93 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class35_Sub2(this, arg0, arg1, local3, local7);
		} else {
			return new Class35_Sub3(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!rfa", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass209_Sub1_2.aFloat132 + this.aClass209_Sub1_2.aFloat134 * (float) arg0 + this.aClass209_Sub1_2.aFloat128 * (float) arg1 + this.aClass209_Sub1_2.aFloat131 * (float) arg2;
		if (local24 < (float) this.anInt7819 || local24 > (float) this.anInt7816) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt7804 * (this.aClass209_Sub1_2.aFloat133 + this.aClass209_Sub1_2.aFloat130 * (float) arg0 + this.aClass209_Sub1_2.aFloat124 * (float) arg1 + this.aClass209_Sub1_2.aFloat127 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt7797 * (this.aClass209_Sub1_2.aFloat129 + this.aClass209_Sub1_2.aFloat126 * (float) arg0 + this.aClass209_Sub1_2.aFloat125 * (float) arg1 + this.aClass209_Sub1_2.aFloat135 * (float) arg2) / local24);
		arg3[0] = local81 - this.anInt7794;
		arg3[1] = local113 - this.anInt7802;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!rfa", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class200_Sub2 local2 = (Class200_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray464;
		@Pc(8) int[] local8 = local2.anIntArray465;
		@Pc(20) int local20;
		if (this.anInt7820 < arg3 + local5.length) {
			local20 = this.anInt7820 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt7798 > arg3) {
			local33 = this.anInt7798 - arg3;
			arg3 = this.anInt7798;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt7796;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt7812 > local58) {
				local62 -= this.anInt7812 - local58;
				local58 = this.anInt7812;
			}
			if (this.anInt7813 < local58 + local62) {
				local62 = this.anInt7813 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray519[local58++] = arg0;
			}
			local49 += this.anInt7796;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class10 method6420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class10_Sub1_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class216 local3 = this.method6482(Thread.currentThread());
		@Pc(6) Class128 local6 = local3.aClass128_1;
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
		@Pc(105) int local105 = arg0 - local6.method2723();
		@Pc(110) int local110 = arg1 - local6.method2732();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt3219 = 0;
		local6.aBoolean250 = local114 < 0 || local114 > local6.anInt3217 || local118 < 0 || local118 > local6.anInt3217 || local124 < 0 || local124 > local6.anInt3217;
		local6.method2735(local134, local138, local144, local114, local118, local124, 100, 100, 100, arg4);
		local6.aBoolean250 = local114 < 0 || local114 > local6.anInt3217 || local124 < 0 || local124 > local6.anInt3217 || local130 < 0 || local130 > local6.anInt3217;
		local6.method2735(local134, local144, local150, local114, local124, local130, 100, 100, 100, arg4);
	}

	@OriginalMember(owner = "client!rfa", name = "l", descriptor = "()Lclient!aa;")
	@Override
	public Class2 method6419() {
		return new Class2(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!rfa", name = "y", descriptor = "()Z")
	@Override
	public boolean method6463() {
		return false;
	}

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "(I)V")
	@Override
	public void method6428(@OriginalArg(0) int arg0) {
		this.aClass216Array1[arg0].method4973(Thread.currentThread());
	}

	@OriginalMember(owner = "client!rfa", name = "n", descriptor = "()Z")
	@Override
	public boolean method6431() {
		return false;
	}

	@OriginalMember(owner = "client!rfa", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt7801 = (int) (arg1 * 65535.0F);
		this.anInt7818 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt7817 = (int) (arg3 * 65535.0F / local26);
		this.anInt7795 = (int) (arg4 * 65535.0F / local26);
		this.anInt7803 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!rfa", name = "C", descriptor = "()Z")
	@Override
	public boolean method6474() {
		return true;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6422(@OriginalArg(0) Class1_Sub11 arg0) {
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!it;)V")
	@Override
	public void method6421(@OriginalArg(0) Class36 arg0) {
	}

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "()V")
	@Override
	public void method6416() throws Exception_Sub1 {
		if (this.aCanvas11 == null || this.aClass1_Sub15_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas11.getGraphics();
			this.aClass1_Sub15_1.method7866(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas11.repaint();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6412(@OriginalArg(0) Class10 arg0) {
		if (arg0 instanceof Class10_Sub1_Sub1) {
			@Pc(5) Class10_Sub1_Sub1 local5 = (Class10_Sub1_Sub1) arg0;
			this.anInt7796 = local5.anInt2757;
			this.anInt7815 = local5.anInt2754;
			this.anIntArray519 = local5.anIntArray8;
			this.aClass10_36 = arg0;
		} else if (arg0 instanceof Class10_Sub1_Sub3) {
			@Pc(27) Class10_Sub1_Sub3 local27 = (Class10_Sub1_Sub3) arg0;
			this.anInt7796 = local27.anInt2757;
			this.anInt7815 = local27.anInt2754;
			this.anIntArray519 = local27.anIntArray171;
			this.aClass10_36 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method6475();
	}

	@OriginalMember(owner = "client!rfa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt7812 == 0 && this.anInt7813 == this.anInt7796 && this.anInt7798 == 0 && this.anInt7820 == this.anInt7815) {
			local19 = this.anIntArray518.length;
			local25 = local19 - local19 & 0x7;
			local27 = 0;
			while (local27 < local25) {
				this.anIntArray518[local27++] = Integer.MAX_VALUE;
				this.anIntArray518[local27++] = Integer.MAX_VALUE;
				this.anIntArray518[local27++] = Integer.MAX_VALUE;
				this.anIntArray518[local27++] = Integer.MAX_VALUE;
				this.anIntArray518[local27++] = Integer.MAX_VALUE;
				this.anIntArray518[local27++] = Integer.MAX_VALUE;
				this.anIntArray518[local27++] = Integer.MAX_VALUE;
				this.anIntArray518[local27++] = Integer.MAX_VALUE;
			}
			while (local27 < local19) {
				this.anIntArray518[local27++] = Integer.MAX_VALUE;
			}
			return;
		}
		local19 = this.anInt7813 - this.anInt7812;
		local25 = this.anInt7820 - this.anInt7798;
		local27 = this.anInt7796 - local19;
		@Pc(116) int local116 = this.anInt7812 + this.anInt7798 * this.anInt7796;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.anIntArray518[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray518[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray518[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray518[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray518[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray518[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray518[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray518[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.anIntArray518[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class10 method6429(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class10_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class10_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class10_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class10_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!it;Lclient!it;FLclient!it;)Lclient!it;")
	@Override
	public Class36 method6464(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!rfa", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7812;
		arg0[1] = this.anInt7798;
		arg0[2] = this.anInt7813;
		arg0[3] = this.anInt7820;
	}

	@OriginalMember(owner = "client!rfa", name = "F", descriptor = "()Z")
	public boolean method6486() {
		return this.aBoolean564;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIF)Lclient!qea;")
	@Override
	public Class1_Sub5 method6426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!rfa", name = "q", descriptor = "()V")
	@Override
	public void method6440() {
	}

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "(I)[I")
	public int[] method6487(@OriginalArg(0) int arg0) {
		@Pc(2) Class326 local2 = this.aClass326_44;
		@Pc(12) Class1_Sub9 local12;
		synchronized (this.aClass326_44) {
			local12 = (Class1_Sub9) this.aClass326_44.method7238((long) arg0);
			if (local12 == null) {
				if (!super.anInterface5_10.method4045(arg0)) {
					return null;
				}
				@Pc(32) Class45 local32 = super.anInterface5_10.method4043(arg0);
				@Pc(42) int local42 = local32.aBoolean124 || this.aBoolean565 ? 64 : 128;
				local12 = new Class1_Sub9(arg0, local42, super.anInterface5_10.method4048(arg0, local42, true, 0.7F, local42), local32.aBoolean117);
				this.aClass326_44.method7236(local12, (long) arg0);
			}
		}
		local12.aBoolean96 = true;
		return local12.method1165();
	}

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "()V")
	@Override
	protected void method6414() {
		if (this.aBoolean563) {
			Static425.method5943(true, false);
			this.aBoolean563 = false;
		}
		this.aClass1_Sub15_1 = null;
		this.aCanvas11 = null;
		this.aClass356_34 = null;
		this.aBoolean564 = true;
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "()I")
	@Override
	public int method6406() {
		return 0;
	}

	@OriginalMember(owner = "client!rfa", name = "A", descriptor = "()V")
	@Override
	public void method6472() {
		this.aClass326_44.method7230();
		this.aClass326_45.method7230();
	}

	@OriginalMember(owner = "client!rfa", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method6435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!rfa", name = "o", descriptor = "()V")
	@Override
	public void method6436() {
	}
}
