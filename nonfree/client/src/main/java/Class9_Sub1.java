import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public abstract class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
	private int anInt1804;

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas5;

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "Lclient!cs;")
	protected Class6_Sub13 aClass6_Sub13_3;

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "[Lclient!uea;")
	protected Class179[] aClass179Array3;

	@OriginalMember(owner = "client!uq", name = "x", descriptor = "I")
	public int anInt1805;

	@OriginalMember(owner = "client!uq", name = "y", descriptor = "I")
	public int anInt1806;

	@OriginalMember(owner = "client!uq", name = "A", descriptor = "I")
	public int anInt1808;

	@OriginalMember(owner = "client!uq", name = "F", descriptor = "I")
	public int anInt1812;

	@OriginalMember(owner = "client!uq", name = "J", descriptor = "I")
	protected int anInt1816;

	@OriginalMember(owner = "client!uq", name = "L", descriptor = "I")
	public int anInt1818;

	@OriginalMember(owner = "client!uq", name = "M", descriptor = "F")
	private float aFloat43;

	@OriginalMember(owner = "client!uq", name = "N", descriptor = "I")
	public int anInt1819;

	@OriginalMember(owner = "client!uq", name = "T", descriptor = "I")
	public int anInt1824;

	@OriginalMember(owner = "client!uq", name = "U", descriptor = "I")
	public int anInt1825;

	@OriginalMember(owner = "client!uq", name = "W", descriptor = "F")
	private float aFloat44;

	@OriginalMember(owner = "client!uq", name = "X", descriptor = "Lclient!xa;")
	protected Class66 aClass66_18;

	@OriginalMember(owner = "client!uq", name = "Y", descriptor = "Z")
	public boolean aBoolean185;

	@OriginalMember(owner = "client!uq", name = "Z", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!uq", name = "db", descriptor = "I")
	public int anInt1829;

	@OriginalMember(owner = "client!uq", name = "gb", descriptor = "I")
	public int anInt1831;

	@OriginalMember(owner = "client!uq", name = "hb", descriptor = "I")
	public int anInt1832;

	@OriginalMember(owner = "client!uq", name = "mb", descriptor = "Lclient!xa;")
	protected Class66 aClass66_19;

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "Z")
	private boolean aBoolean181;

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "Z")
	private boolean aBoolean182;

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "Lclient!tq;")
	protected Class305 aClass305_11;

	@OriginalMember(owner = "client!uq", name = "B", descriptor = "I")
	public int anInt1809;

	@OriginalMember(owner = "client!uq", name = "K", descriptor = "I")
	public int anInt1817;

	@OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
	public int anInt1814;

	@OriginalMember(owner = "client!uq", name = "P", descriptor = "I")
	public int anInt1821;

	@OriginalMember(owner = "client!uq", name = "E", descriptor = "I")
	public int anInt1811;

	@OriginalMember(owner = "client!uq", name = "V", descriptor = "Z")
	private boolean aBoolean184;

	@OriginalMember(owner = "client!uq", name = "Q", descriptor = "I")
	public int anInt1822;

	@OriginalMember(owner = "client!uq", name = "D", descriptor = "I")
	public int anInt1810;

	@OriginalMember(owner = "client!uq", name = "R", descriptor = "I")
	private int anInt1823;

	@OriginalMember(owner = "client!uq", name = "v", descriptor = "Z")
	public boolean aBoolean183;

	@OriginalMember(owner = "client!uq", name = "I", descriptor = "I")
	public int anInt1815;

	@OriginalMember(owner = "client!uq", name = "cb", descriptor = "I")
	private int anInt1828;

	@OriginalMember(owner = "client!uq", name = "ab", descriptor = "I")
	public int anInt1826;

	@OriginalMember(owner = "client!uq", name = "bb", descriptor = "I")
	public int anInt1827;

	@OriginalMember(owner = "client!uq", name = "O", descriptor = "I")
	private int anInt1820;

	@OriginalMember(owner = "client!uq", name = "fb", descriptor = "I")
	public int anInt1830;

	@OriginalMember(owner = "client!uq", name = "G", descriptor = "I")
	public int anInt1813;

	@OriginalMember(owner = "client!uq", name = "ib", descriptor = "I")
	public int anInt1833;

	@OriginalMember(owner = "client!uq", name = "kb", descriptor = "I")
	public int anInt1835;

	@OriginalMember(owner = "client!uq", name = "jb", descriptor = "I")
	private int anInt1834;

	@OriginalMember(owner = "client!uq", name = "z", descriptor = "I")
	public int anInt1807;

	@OriginalMember(owner = "client!uq", name = "eb", descriptor = "Lclient!pca;")
	protected final Class245 aClass245_22;

	@OriginalMember(owner = "client!uq", name = "lb", descriptor = "I")
	protected int lb;

	@OriginalMember(owner = "client!uq", name = "C", descriptor = "Lclient!pca;")
	private final Class245 aClass245_21;

	@OriginalMember(owner = "client!uq", name = "S", descriptor = "Lclient!aea;")
	public Class8_Sub1 aClass8_Sub1_3;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!e;)V")
	private Class9_Sub1(@OriginalArg(0) Interface2 arg0) {
		super(arg0);
		this.aBoolean181 = false;
		this.aBoolean182 = false;
		this.aClass305_11 = new Class305(4);
		this.anInt1809 = 3500;
		this.anInt1817 = 512;
		this.anInt1814 = 78642;
		this.anInt1821 = 0;
		this.anInt1811 = 50;
		this.aBoolean184 = false;
		this.anInt1822 = 0;
		this.anInt1810 = 0;
		this.anInt1823 = 0;
		this.aBoolean183 = false;
		this.anInt1815 = 0;
		this.anInt1828 = 0;
		this.anInt1826 = 0;
		this.anInt1827 = 512;
		this.anInt1820 = 0;
		this.anInt1830 = 0;
		this.anInt1813 = 0;
		this.anInt1833 = 45823;
		this.anInt1835 = 75518;
		this.anInt1834 = 3500;
		this.anInt1807 = this.anInt1834 - 255;
		this.aClass245_22 = new Class245(16);
		this.lb = -1;
		this.aClass245_21 = new Class245(256);
		this.aClass8_Sub1_3 = new Class8_Sub1();
		this.method5394(1);
		this.method5459(0);
		Static361.method5811(false, true);
		this.aBoolean181 = true;
	}

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class9_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1) {
		this(arg1);
		this.method5428(arg0);
		this.method5465(arg0);
	}

	@OriginalMember(owner = "client!uq", name = "z", descriptor = "()Z")
	@Override
	public final boolean method5453() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "x", descriptor = "()Z")
	@Override
	public final boolean method5449() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1823 = this.anInt1822;
		this.anInt1810 = arg0;
		this.anInt1822 = arg1;
		this.anInt1826 = arg2;
		this.aBoolean183 = true;
	}

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "()V")
	@Override
	public final void method5441() {
	}

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "()V")
	@Override
	public final void method5420() {
	}

	@OriginalMember(owner = "client!uq", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass8_Sub1_3.anInt167 * arg0 + this.aClass8_Sub1_3.anInt171 * arg1 + this.aClass8_Sub1_3.anInt166 * arg2 >> 14) + this.aClass8_Sub1_3.anInt162;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass8_Sub1_3.anInt167 * arg3 + this.aClass8_Sub1_3.anInt171 * arg4 + this.aClass8_Sub1_3.anInt166 * arg5 >> 14) + this.aClass8_Sub1_3.anInt162;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt1811 && local52 < this.anInt1811 || !(local23 <= this.anInt1834 || local52 <= this.anInt1834)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt1817 * ((this.aClass8_Sub1_3.anInt169 * arg0 + this.aClass8_Sub1_3.anInt163 * arg1 + this.aClass8_Sub1_3.anInt168 * arg2 >> 14) + this.aClass8_Sub1_3.anInt161) / local23;
		@Pc(133) int local133 = this.anInt1817 * ((this.aClass8_Sub1_3.anInt169 * arg3 + this.aClass8_Sub1_3.anInt163 * arg4 + this.aClass8_Sub1_3.anInt168 * arg5 >> 14) + this.aClass8_Sub1_3.anInt161) / local52;
		if (local104 < this.anInt1829 && local133 < this.anInt1829 || local104 > this.anInt1806 && local133 > this.anInt1806) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt1827 * ((this.aClass8_Sub1_3.anInt160 * arg0 + this.aClass8_Sub1_3.anInt164 * arg1 + this.aClass8_Sub1_3.anInt165 * arg2 >> 14) + this.aClass8_Sub1_3.anInt170) / local23;
			@Pc(209) int local209 = this.anInt1827 * ((this.aClass8_Sub1_3.anInt160 * arg3 + this.aClass8_Sub1_3.anInt164 * arg4 + this.aClass8_Sub1_3.anInt165 * arg5 >> 14) + this.aClass8_Sub1_3.anInt170) / local52;
			return (local180 >= this.anInt1808 || local209 >= this.anInt1808) && (local180 <= this.anInt1831 || local209 <= this.anInt1831);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!dga;)V")
	@Override
	public final void method5391(@OriginalArg(0) Class65 arg0) {
	}

	@OriginalMember(owner = "client!uq", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1811 = arg0;
		this.anInt1834 = arg1;
		this.anInt1807 = this.anInt1834 - 255;
		this.method1652();
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5465(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!mr;I)V")
	public abstract void method5408(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class5_Sub4[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uq", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1810 = arg0;
		this.anInt1822 = arg1;
		this.anInt1826 = arg2;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "()Z")
	@Override
	public final boolean method5395() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Z")
	public final boolean method1643(@OriginalArg(0) int arg0) {
		return this.aBoolean184 || super.anInterface2_11.method3585(arg0).aBoolean661;
	}

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "()I")
	@Override
	public final int method5427() {
		return 0;
	}

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "()Lclient!hl;")
	@Override
	public final Class138 method5435() {
		return new Class138(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[Lclient!od;)V")
	@Override
	public final void method5401(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub29[] arg1) {
	}

	@OriginalMember(owner = "client!uq", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt1832;
		@Pc(35) int local35 = this.anInt1832 - arg2;
		if (arg1 + arg3 > this.anInt1830) {
			arg3 -= arg1 + arg3 - this.anInt1830;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt1815) {
			local59 = this.anInt1815 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt1832;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt1821) {
			local59 = arg0 + arg2 - this.anInt1821;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt1813) {
			local59 = this.anInt1813 - arg0;
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
						this.anIntArray130[local30++] = arg4;
					} else {
						this.anIntArray130[local30++] = arg5;
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
					local245 = this.anIntArray130[local30];
					this.anIntArray130[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray130[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray130[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "(I)I")
	public final int method1644(@OriginalArg(0) int arg0) {
		return super.anInterface2_11.method3585(arg0).aShort125 & 0xFFFF;
	}

	@OriginalMember(owner = "client!uq", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt1811;
	}

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "()V")
	@Override
	public final void method5419() {
		this.aClass245_21.method6079();
		this.aClass245_22.method6079();
	}

	@OriginalMember(owner = "client!uq", name = "A", descriptor = "()Z")
	public abstract boolean method5458();

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I")
	@Override
	public final int method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)I")
	@Override
	public final int method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!uq", name = "u", descriptor = "()Lclient!q;")
	@Override
	public final Class8 method5446() {
		return new Class8_Sub1();
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5410(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas5 == arg0) {
			this.method5465(null);
		}
		@Pc(15) Class6_Sub13 local15 = (Class6_Sub13) this.aClass305_11.method7447((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8151();
		}
	}

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "()Z")
	@Override
	public final boolean method5439() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!qda;IIII)Lclient!ba;")
	public abstract Class23 method5404(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class19 method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class19_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "()V")
	@Override
	public final void method5411() throws Exception_Sub1 {
		if (this.aCanvas5 == null || this.aClass6_Sub13_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			this.aClass6_Sub13_3.method7246(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "()V")
	@Override
	protected final void method5418() {
		if (this.aBoolean181) {
			Static30.method995(false, true);
			this.aBoolean181 = false;
		}
		this.aClass6_Sub13_3 = null;
		this.aCanvas5 = null;
		this.aClass305_11 = null;
		this.aBoolean182 = true;
	}

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.anInt1822 = this.anInt1823;
		this.aBoolean183 = false;
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "()Z")
	@Override
	public final boolean method5414() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "C", descriptor = "()V")
	@Override
	public final void method5463() {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class62 method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!uq", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5396();

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class66 method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1832 + arg0;
		@Pc(16) int local16 = this.anInt1832 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray130[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class66_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class66_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method5429(@OriginalArg(0) Class8 arg0) {
		this.aClass8_Sub1_3 = (Class8_Sub1) arg0;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!aca;IIII)V")
	public abstract void method1645(@OriginalArg(0) Class5_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!tg;)V")
	@Override
	public final void method5433(@OriginalArg(0) Class299 arg0) {
		@Pc(3) Class5_Sub1 local3 = arg0.aClass272_1.aClass5_Sub1_9;
		for (@Pc(6) Class5_Sub1 local6 = local3.aClass5_Sub1_8; local6 != local3; local6 = local6.aClass5_Sub1_8) {
			@Pc(10) Class5_Sub1_Sub1 local10 = (Class5_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt6014 >> 12;
			@Pc(20) int local20 = local10.anInt6009 >> 12;
			@Pc(25) int local25 = local10.anInt6011 >> 12;
			@Pc(49) int local49 = this.aClass8_Sub1_3.anInt162 + (this.aClass8_Sub1_3.anInt167 * local15 + this.aClass8_Sub1_3.anInt171 * local20 + this.aClass8_Sub1_3.anInt166 * local25 >> 14);
			if (local49 >= this.anInt1811 && local49 <= this.anInt1807) {
				@Pc(90) int local90 = this.anInt1812 + this.anInt1817 * (this.aClass8_Sub1_3.anInt161 + (this.aClass8_Sub1_3.anInt169 * local15 + this.aClass8_Sub1_3.anInt163 * local20 + this.aClass8_Sub1_3.anInt168 * local25 >> 14)) / local49;
				@Pc(122) int local122 = this.anInt1824 + this.anInt1827 * (this.aClass8_Sub1_3.anInt170 + (this.aClass8_Sub1_3.anInt160 * local15 + this.aClass8_Sub1_3.anInt164 * local20 + this.aClass8_Sub1_3.anInt165 * local25 >> 14)) / local49;
				if (local90 >= this.anInt1813 && local90 <= this.anInt1821 && local122 >= this.anInt1815 && local122 <= this.anInt1830) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method1645(local10, local90, local122, local49, (local10.anInt6007 * this.anInt1817 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "SA", descriptor = "()I")
	@Override
	public final int SA() {
		@Pc(2) int local2 = this.anInt1820;
		this.anInt1820 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "()Z")
	@Override
	public final boolean method5422() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "(I)Z")
	public final boolean method1646(@OriginalArg(0) int arg0) {
		return super.anInterface2_11.method3583(arg0);
	}

	@OriginalMember(owner = "client!uq", name = "k", descriptor = "(I)[I")
	public final int[] method1647(@OriginalArg(0) int arg0) {
		@Pc(2) Class245 local2 = this.aClass245_21;
		@Pc(12) Class6_Sub21 local12;
		synchronized (this.aClass245_21) {
			local12 = (Class6_Sub21) this.aClass245_21.method6082((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_11.method3583(arg0)) {
					return null;
				}
				@Pc(32) Class296 local32 = super.anInterface2_11.method3585(arg0);
				@Pc(42) int local42 = local32.aBoolean661 || this.aBoolean184 ? 64 : 128;
				local12 = new Class6_Sub21(arg0, local42, super.anInterface2_11.method3582(0.7F, true, local42, arg0, local42), local32.aBoolean654);
				this.aClass245_21.method6075(local12, (long) arg0);
			}
		}
		local12.aBoolean312 = true;
		return local12.method3324();
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "()Z")
	@Override
	public final boolean method5398() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method5466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)Lclient!i;")
	@Override
	public final Class6_Sub25 method5421(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "()V")
	@Override
	public void method5430() {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method5448(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas5 == null || this.aClass6_Sub13_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt1832 && local21.y <= this.anInt1816 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass6_Sub13_3.method7245(local21.y, local14, local21.width, local21.x, local21.height);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!uq", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt1834;
	}

	@OriginalMember(owner = "client!uq", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		@Pc(2) int local2 = this.anInt1828;
		this.anInt1828 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	@Override
	public final void method5392(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([Lclient!ba;Lclient!tg;Lclient!q;[Lclient!mr;I)V")
	public abstract void method5445(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.e(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.e(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt1813) {
					arg1 += local104 * (this.anInt1813 - arg0);
					arg0 = this.anInt1813;
				}
				if (arg2 >= this.anInt1821) {
					arg2 = this.anInt1821 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1815 && local150 < this.anInt1830) {
							this.anIntArray130[arg0 + local150 * this.anInt1832] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt1815 && local213 < this.anInt1830) {
							local228 = arg0 + local213 * this.anInt1832;
							local233 = this.anIntArray130[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray130[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1815 && local150 < this.anInt1830) {
							local213 = arg0 + local150 * this.anInt1832;
							local228 = this.anIntArray130[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray130[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt1815) {
					arg0 += local104 * (this.anInt1815 - arg1);
					arg1 = this.anInt1815;
				}
				if (arg3 >= this.anInt1830) {
					arg3 = this.anInt1830 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1813 && local150 < this.anInt1821) {
							this.anIntArray130[local150 + arg1 * this.anInt1832] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt1813 && local213 < this.anInt1821) {
							local228 = local213 + arg1 * this.anInt1832;
							local233 = this.anIntArray130[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray130[local213 + arg1 * this.anInt1832] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1813 && local150 < this.anInt1821) {
							local213 = local150 + arg1 * this.anInt1832;
							local228 = this.anIntArray130[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray130[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.ya(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.ya(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIF)Lclient!od;")
	@Override
	public final Class6_Sub29 method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!uq", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1832) {
			arg2 = this.anInt1832;
		}
		if (arg3 > this.anInt1816) {
			arg3 = this.anInt1816;
		}
		this.anInt1813 = arg0;
		this.anInt1821 = arg2;
		this.anInt1815 = arg1;
		this.anInt1830 = arg3;
		this.method1654();
	}

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)V")
	@Override
	public final void method5438(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1804;
		for (@Pc(9) Object local9 = this.aClass245_21.method6077(); local9 != null; local9 = this.aClass245_21.method6080()) {
			@Pc(13) Class6_Sub21 local13 = (Class6_Sub21) local9;
			if (local13.aBoolean312) {
				local13.anInt3718 += local4;
				@Pc(27) int local27 = local13.anInt3718 / 20;
				if (local27 > 0) {
					@Pc(36) Class296 local36 = super.anInterface2_11.method3585(local13.anInt3716);
					local13.method3325(local36.aByte105 * local4 * 50 / 1000, local36.aByte107 * local4 * 50 / 1000);
					local13.anInt3718 -= local27 * 20;
				}
				local13.aBoolean312 = false;
			}
		}
		this.anInt1804 = arg0;
		this.aClass245_22.method6083(5);
		this.aClass245_21.method6083(5);
	}

	@OriginalMember(owner = "client!uq", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1833 = (int) (arg1 * 65535.0F);
		this.anInt1814 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1825 = (int) (arg3 * 65535.0F / local26);
		this.anInt1818 = (int) (arg4 * 65535.0F / local26);
		this.anInt1819 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method5456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class19 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class19_Sub1 local2 = (Class19_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray55;
		@Pc(8) int[] local8 = local2.anIntArray54;
		@Pc(17) int local17 = this.anInt1815 > arg7 ? this.anInt1815 : arg7;
		@Pc(32) int local32 = this.anInt1830 < arg7 + local5.length ? this.anInt1830 : arg7 + local5.length;
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
					if (local129 >= this.anInt1813 && local129 < this.anInt1821 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray130[local129 + arg1 * this.anInt1832] = arg4;
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
					if (local133 >= this.anInt1813 && local133 < this.anInt1821 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt1832;
						local248 = this.anIntArray130[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray130[local133 + arg1 * this.anInt1832] = local201 + local584;
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
		if (arg0 < this.anInt1813) {
			arg1 += local83 * (this.anInt1813 - arg0);
			arg0 = this.anInt1813;
		}
		if (arg2 >= this.anInt1821) {
			arg2 = this.anInt1821 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray130[arg0 + local129 * this.anInt1832] = arg4;
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
					local243 = arg0 + local133 * this.anInt1832;
					local248 = this.anIntArray130[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray130[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!uq", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1813;
		arg0[1] = this.anInt1815;
		arg0[2] = this.anInt1821;
		arg0[3] = this.anInt1830;
	}

	@OriginalMember(owner = "client!uq", name = "D", descriptor = "()Z")
	@Override
	public final boolean method5464() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method5451(@OriginalArg(0) Class6_Sub25 arg0) {
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(Z)V")
	@Override
	public final void method5413(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(Z)V")
	@Override
	public void method5455(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class66 method5423(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class66_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class66_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class66_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class66_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!uq", name = "B", descriptor = "()Z")
	@Override
	public final boolean method5462() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "D", descriptor = "(I)V")
	@Override
	public final void D(@OriginalArg(0) int arg0) {
		this.C(0, 0, this.anInt1832, this.anInt1816, arg0, 0);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5403(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(IIIIIIIIII)V")
	public abstract void method1648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "()V")
	@Override
	public final void method5406() {
	}

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "()V")
	protected final void method1649() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1805; local1++) {
			this.aClass179Array3[local1].method7259();
		}
		this.F();
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)V")
	public abstract void method5426(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method5443(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!uq", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class19_Sub1 local2 = (Class19_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray55;
		@Pc(8) int[] local8 = local2.anIntArray54;
		@Pc(20) int local20;
		if (this.anInt1830 < arg3 + local5.length) {
			local20 = this.anInt1830 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1815 > arg3) {
			local33 = this.anInt1815 - arg3;
			arg3 = this.anInt1815;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt1832;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt1813 > local58) {
				local62 -= this.anInt1813 - local58;
				local58 = this.anInt1813;
			}
			if (this.anInt1821 < local58 + local62) {
				local62 = this.anInt1821 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray130[local58++] = arg0;
			}
			local49 += this.anInt1832;
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5428(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class6_Sub13 local8 = (Class6_Sub13) this.aClass305_11.method7447((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static150.method6203(arg0);
			this.aClass305_11.method7448((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!ed;[Lclient!aaa;Z)Lclient!ta;")
	@Override
	public final Class73 method5393(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class1[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt27;
			local7[local11] = arg1[local11].anInt30;
			if (arg1[local11].aByteArray1 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class73_Sub4(this, arg0, arg1, local3, local7);
		} else {
			return new Class73_Sub3(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!uq", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat43 = arg0;
		this.aFloat44 = arg1;
		this.method1652();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!aaa;Z)Lclient!xa;")
	@Override
	public final Class66 method5412(@OriginalArg(0) Class1 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray6;
		@Pc(5) byte[] local5 = arg0.aByteArray2;
		@Pc(8) int local8 = arg0.anInt27;
		@Pc(11) int local11 = arg0.anInt30;
		@Pc(76) Class66_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray1 == null) {
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
			local76 = new Class66_Sub1_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray1;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class66_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class66_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.EA(arg0.anInt29, arg0.anInt31, arg0.anInt28, arg0.anInt26);
		return local76;
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1815 || arg1 >= this.anInt1830) {
			return;
		}
		if (arg0 < this.anInt1813) {
			arg2 -= this.anInt1813 - arg0;
			arg0 = this.anInt1813;
		}
		if (arg0 + arg2 > this.anInt1821) {
			arg2 = this.anInt1821 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1832;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray130[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray130[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray130[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray130[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray130[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "()Lclient!q;")
	@Override
	public final Class8 method5417() {
		@Pc(3) Class179 local3 = this.method1653(Thread.currentThread());
		return local3.aClass8_Sub1_9;
	}

	@OriginalMember(owner = "client!uq", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		this.anInt1835 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!ba;Lclient!tg;Lclient!q;Lclient!mr;I)V")
	@Override
	public final void method5457(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4 arg3, @OriginalArg(4) int arg4) {
		((Class23_Sub3) arg0).method7100(arg2, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(Z)V")
	@Override
	public final void method5432(@OriginalArg(0) boolean arg0) {
		this.aBoolean184 = arg0;
		this.aClass245_21.method6079();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!dga;Lclient!dga;FLclient!dga;)Lclient!dga;")
	@Override
	public final Class65 method5402(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class65 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(IIIIII)Lclient!dga;")
	@Override
	public final Class65 method5442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "(I)[I")
	protected final int[] method1650(@OriginalArg(0) int arg0) {
		@Pc(2) Class245 local2 = this.aClass245_21;
		@Pc(12) Class6_Sub21 local12;
		synchronized (this.aClass245_21) {
			local12 = (Class6_Sub21) this.aClass245_21.method6082((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_11.method3583(arg0)) {
					return null;
				}
				@Pc(32) Class296 local32 = super.anInterface2_11.method3585(arg0);
				@Pc(42) int local42 = local32.aBoolean661 || this.aBoolean184 ? 64 : 128;
				local12 = new Class6_Sub21(arg0, local42, super.anInterface2_11.method3581(arg0, 0.7F, local42, local42), local32.aBoolean654);
				this.aClass245_21.method6075(local12, (long) arg0);
			}
		}
		local12.aBoolean312 = true;
		return local12.method3324();
	}

	@OriginalMember(owner = "client!uq", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1822 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt1822 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt1822 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt1822 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt1822 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean185 = false;
		} else {
			this.aBoolean185 = true;
		}
	}

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "(I)V")
	@Override
	public void method5459(@OriginalArg(0) int arg0) {
		this.aClass179Array3[arg0].method7256(Thread.currentThread());
	}

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "()Z")
	@Override
	public final boolean method5447() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "E", descriptor = "()Z")
	public final boolean method1651() {
		return this.aBoolean182;
	}

	@OriginalMember(owner = "client!uq", name = "G", descriptor = "()V")
	private void method1652() {
		if (this.aFloat44 == 0.0F) {
			this.anInt1809 = this.anInt1834;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt1834;
		@Pc(12) float local12 = (float) this.anInt1811;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat43 / (this.aFloat44 + this.aFloat43);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat44;
		this.anInt1809 = (int) (((float) this.anInt1834 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!uq", name = "y", descriptor = "()Z")
	@Override
	public final boolean method5452() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!uea;")
	public abstract Class179 method1653(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!uq", name = "H", descriptor = "()V")
	protected abstract void method1654();

	@OriginalMember(owner = "client!uq", name = "KA", descriptor = "(IIII)[I")
	@Override
	public final int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt1832 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray130[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "()Z")
	@Override
	public final boolean method5437() {
		return true;
	}

	@OriginalMember(owner = "client!uq", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1813 || arg0 >= this.anInt1821) {
			return;
		}
		if (arg1 < this.anInt1815) {
			arg2 -= this.anInt1815 - arg1;
			arg1 = this.anInt1815;
		}
		if (arg1 + arg2 > this.anInt1830) {
			arg2 = this.anInt1830 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1832;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray130[local40 + local54 * this.anInt1832] = arg3;
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
				local111 = local40 + local103 * this.anInt1832;
				local116 = this.anIntArray130[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray130[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt1832;
				local111 = this.anIntArray130[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray130[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	public abstract void method5394(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "()Z")
	@Override
	public final boolean method5431() {
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "(I)Z")
	public final boolean method1655(@OriginalArg(0) int arg0) {
		return super.anInterface2_11.method3585(arg0).aBoolean652;
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method5436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!uq", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1813) {
			arg2 -= this.anInt1813 - arg0;
			arg0 = this.anInt1813;
		}
		if (arg1 < this.anInt1815) {
			arg3 -= this.anInt1815 - arg1;
			arg1 = this.anInt1815;
		}
		if (arg0 + arg2 > this.anInt1821) {
			arg2 = this.anInt1821 - arg0;
		}
		if (arg1 + arg3 > this.anInt1830) {
			arg3 = this.anInt1830 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt1821 || arg1 > this.anInt1830) {
			return;
		}
		@Pc(67) int local67 = this.anInt1832 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt1832;
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
						local217 = this.anIntArray130[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray130[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray130[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray130[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray130[arg2] = arg4;
					arg2++;
					this.anIntArray130[arg2] = arg4;
					arg2++;
					this.anIntArray130[arg2] = arg4;
					arg2++;
					this.anIntArray130[arg2] = arg4;
					arg2++;
					this.anIntArray130[arg2] = arg4;
					arg2++;
					this.anIntArray130[arg2] = arg4;
					arg2++;
					this.anIntArray130[arg2] = arg4;
					arg2++;
					this.anIntArray130[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray130[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1815) {
			local8 = this.anInt1815;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1830) {
			local21 = this.anInt1830;
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
				if (local91 < this.anInt1813) {
					local91 = this.anInt1813;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1821) {
					local102 = this.anInt1821;
				}
				local116 = local91 + local30 * this.anInt1832;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray130[local116++] = arg3;
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
				if (local91 < this.anInt1813) {
					local91 = this.anInt1813;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1821 - 1) {
					local102 = this.anInt1821 - 1;
				}
				local116 = local91 + local30 * this.anInt1832;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray130[local116++] = arg3;
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
				if (local102 < this.anInt1813) {
					local102 = this.anInt1813;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1821) {
					local116 = this.anInt1821;
				}
				local118 = local102 + local30 * this.anInt1832;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray130[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray130[local118++] = local277 + local340;
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
				if (local102 < this.anInt1813) {
					local102 = this.anInt1813;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1821 - 1) {
					local116 = this.anInt1821 - 1;
				}
				local118 = local102 + local30 * this.anInt1832;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray130[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray130[local118++] = local277 + local340;
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
				if (local91 < this.anInt1813) {
					local91 = this.anInt1813;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1821) {
					local102 = this.anInt1821;
				}
				local116 = local91 + local30 * this.anInt1832;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray130[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray130[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt1813) {
					local91 = this.anInt1813;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1821 - 1) {
					local102 = this.anInt1821 - 1;
				}
				local116 = local91 + local30 * this.anInt1832;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray130[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray130[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!uq", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass8_Sub1_3.anInt162 + (this.aClass8_Sub1_3.anInt167 * arg0 + this.aClass8_Sub1_3.anInt171 * arg1 + this.aClass8_Sub1_3.anInt166 * arg2 >> 14);
		if (local23 < this.anInt1811 || local23 > this.anInt1834) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt1817 * (this.aClass8_Sub1_3.anInt161 + (this.aClass8_Sub1_3.anInt169 * arg0 + this.aClass8_Sub1_3.anInt163 * arg1 + this.aClass8_Sub1_3.anInt168 * arg2 >> 14)) / local23;
		@Pc(102) int local102 = this.anInt1827 * (this.aClass8_Sub1_3.anInt170 + (this.aClass8_Sub1_3.anInt160 * arg0 + this.aClass8_Sub1_3.anInt164 * arg1 + this.aClass8_Sub1_3.anInt165 * arg2 >> 14)) / local23;
		if (local73 >= this.anInt1829 && local73 <= this.anInt1806 && local102 >= this.anInt1808 && local102 <= this.anInt1831) {
			arg3[0] = local73 - this.anInt1829;
			arg3[1] = local102 - this.anInt1808;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1812 = arg0;
		this.anInt1824 = arg1;
		this.anInt1817 = arg2;
		this.anInt1827 = arg3;
		this.method1654();
	}

	@OriginalMember(owner = "client!uq", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1813 < arg0) {
			this.anInt1813 = arg0;
		}
		if (this.anInt1815 < arg1) {
			this.anInt1815 = arg1;
		}
		if (this.anInt1821 > arg2) {
			this.anInt1821 = arg2;
		}
		if (this.anInt1830 > arg3) {
			this.anInt1830 = arg3;
		}
		this.method1654();
	}

	@OriginalMember(owner = "client!uq", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt1813 = 0;
		this.anInt1815 = 0;
		this.anInt1821 = this.anInt1832;
		this.anInt1830 = this.anInt1816;
		this.method1654();
	}

	@OriginalMember(owner = "client!uq", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return 0;
	}

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "()Z")
	@Override
	public final boolean method5407() {
		return false;
	}
}
