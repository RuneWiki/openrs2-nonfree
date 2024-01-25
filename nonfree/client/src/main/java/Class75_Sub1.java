import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!f", name = "s", descriptor = "I")
	private int anInt1738;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Lclient!kb;")
	private Class2_Sub10 aClass2_Sub10_1;

	@OriginalMember(owner = "client!f", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "I")
	public int anInt1739;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "[Lclient!fu;")
	private Class88[] aClass88Array1;

	@OriginalMember(owner = "client!f", name = "H", descriptor = "I")
	public int anInt1749;

	@OriginalMember(owner = "client!f", name = "I", descriptor = "F")
	private float aFloat15;

	@OriginalMember(owner = "client!f", name = "L", descriptor = "Z")
	public boolean aBoolean105;

	@OriginalMember(owner = "client!f", name = "M", descriptor = "I")
	public int anInt1751;

	@OriginalMember(owner = "client!f", name = "P", descriptor = "I")
	private int anInt1753;

	@OriginalMember(owner = "client!f", name = "Q", descriptor = "Lclient!o;")
	private Class41 aClass41_5;

	@OriginalMember(owner = "client!f", name = "S", descriptor = "I")
	public int anInt1754;

	@OriginalMember(owner = "client!f", name = "V", descriptor = "I")
	public int anInt1757;

	@OriginalMember(owner = "client!f", name = "Z", descriptor = "[I")
	public int[] anIntArray123;

	@OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
	public int anInt1761;

	@OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
	public int anInt1763;

	@OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
	public int anInt1765;

	@OriginalMember(owner = "client!f", name = "fb", descriptor = "F")
	private float aFloat16;

	@OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
	public int anInt1766;

	@OriginalMember(owner = "client!f", name = "hb", descriptor = "I")
	public int anInt1767;

	@OriginalMember(owner = "client!f", name = "jb", descriptor = "I")
	public int anInt1769;

	@OriginalMember(owner = "client!f", name = "lb", descriptor = "Lclient!o;")
	private Class41 lb;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Z")
	private boolean aBoolean101;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Z")
	private boolean aBoolean102;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!ru;")
	private Class220 aClass220_7;

	@OriginalMember(owner = "client!f", name = "C", descriptor = "I")
	public int anInt1745;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "I")
	public int anInt1740;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "I")
	public int anInt1744;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "I")
	public int anInt1742;

	@OriginalMember(owner = "client!f", name = "K", descriptor = "I")
	public int anInt1750;

	@OriginalMember(owner = "client!f", name = "J", descriptor = "Z")
	private boolean aBoolean104;

	@OriginalMember(owner = "client!f", name = "A", descriptor = "I")
	public int anInt1743;

	@OriginalMember(owner = "client!f", name = "y", descriptor = "Z")
	public boolean aBoolean103;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "I")
	public int anInt1746;

	@OriginalMember(owner = "client!f", name = "E", descriptor = "I")
	public int anInt1747;

	@OriginalMember(owner = "client!f", name = "X", descriptor = "I")
	private int anInt1759;

	@OriginalMember(owner = "client!f", name = "T", descriptor = "I")
	public int anInt1755;

	@OriginalMember(owner = "client!f", name = "G", descriptor = "I")
	public int anInt1748;

	@OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
	private int anInt1760;

	@OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
	public int anInt1762;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "I")
	public int anInt1741;

	@OriginalMember(owner = "client!f", name = "ib", descriptor = "I")
	public int anInt1768;

	@OriginalMember(owner = "client!f", name = "W", descriptor = "I")
	private int anInt1758;

	@OriginalMember(owner = "client!f", name = "U", descriptor = "I")
	public int anInt1756;

	@OriginalMember(owner = "client!f", name = "O", descriptor = "I")
	public int anInt1752;

	@OriginalMember(owner = "client!f", name = "db", descriptor = "I")
	private int anInt1764;

	@OriginalMember(owner = "client!f", name = "N", descriptor = "Lclient!of;")
	private final Class188 aClass188_21;

	@OriginalMember(owner = "client!f", name = "mb", descriptor = "I")
	private int anInt1770;

	@OriginalMember(owner = "client!f", name = "R", descriptor = "Lclient!of;")
	private final Class188 aClass188_22;

	@OriginalMember(owner = "client!f", name = "kb", descriptor = "Lclient!af;")
	public Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILclient!l;)V")
	private Class75_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg0, arg1);
		this.aBoolean101 = false;
		this.aBoolean102 = false;
		this.aClass220_7 = new Class220(4);
		this.anInt1745 = 512;
		this.anInt1740 = 0;
		this.anInt1744 = 0;
		this.anInt1742 = 0;
		this.anInt1750 = 50;
		this.aBoolean104 = false;
		this.anInt1743 = 78642;
		this.aBoolean103 = false;
		this.anInt1746 = 512;
		this.anInt1747 = 0;
		this.anInt1759 = 0;
		this.anInt1755 = 75518;
		this.anInt1748 = 45823;
		this.anInt1760 = 0;
		this.anInt1762 = 0;
		this.anInt1741 = 0;
		this.anInt1768 = 3500;
		this.anInt1758 = 3500;
		this.anInt1756 = this.anInt1758 - 255;
		this.anInt1752 = 0;
		this.anInt1764 = 0;
		this.aClass188_21 = new Class188(16);
		this.anInt1770 = -1;
		this.aClass188_22 = new Class188(20);
		this.aClass6_Sub1_1 = new Class6_Sub1();
		this.method5984(1);
		this.method5954(0);
		Static202.method2831(false, true);
		this.aBoolean101 = true;
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;)V")
	public Class75_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2) {
		this(arg0, arg2);
		this.method6020(arg1);
		this.method5964(arg1);
	}

	@OriginalMember(owner = "client!f", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt1742 = 0;
		this.anInt1747 = 0;
		this.anInt1762 = this.anInt1769;
		this.anInt1744 = this.anInt1753;
		this.method1736();
	}

	@OriginalMember(owner = "client!f", name = "p", descriptor = "()Z")
	public boolean method1724() {
		return this.aBoolean102;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5964(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas3 = null;
			this.aClass2_Sub10_1 = null;
			if (this.aClass41_5 == null) {
				this.anIntArray123 = null;
				this.anInt1769 = this.anInt1753 = 1;
				this.method1726();
			}
			return;
		}
		@Pc(10) Class2_Sub10 local10 = (Class2_Sub10) this.aClass220_7.method5099((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas3 = arg0;
		this.aClass2_Sub10_1 = local10;
		if (this.aClass41_5 != null) {
			return;
		}
		this.anIntArray123 = local10.anIntArray512;
		this.anInt1769 = local10.anInt6118;
		this.anInt1753 = local10.anInt6119;
		this.method1726();
		return;
	}

	@OriginalMember(owner = "client!f", name = "m", descriptor = "()Lclient!c;")
	@Override
	public Class6 method5990() {
		@Pc(3) Class88 local3 = this.method1730(Thread.currentThread());
		return local3.aClass6_Sub1_2;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class41 method6006(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class41_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class41_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class41_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class41_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!f", name = "B", descriptor = "()Z")
	@Override
	public boolean method6021() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface7_8.method1170(arg5).aBoolean485) {
			this.ZA(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt1770 != arg5) {
			@Pc(26) Class41 local26 = (Class41) this.aClass188_21.method4158((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method1732(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method1735(arg5) ? 64 : 128;
				local26 = this.method6006(local32, local43, local43, local43);
				this.aClass188_21.method4155((long) arg5, local26);
			}
			this.anInt1770 = arg5;
			this.lb = local26;
		}
		this.lb.ya(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!f", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1747) {
			local8 = this.anInt1747;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1744) {
			local21 = this.anInt1744;
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
				if (local91 < this.anInt1742) {
					local91 = this.anInt1742;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1762) {
					local102 = this.anInt1762;
				}
				local116 = local91 + local30 * this.anInt1769;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray123[local116++] = arg3;
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
				if (local91 < this.anInt1742) {
					local91 = this.anInt1742;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1762 - 1) {
					local102 = this.anInt1762 - 1;
				}
				local116 = local91 + local30 * this.anInt1769;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray123[local116++] = arg3;
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
				if (local102 < this.anInt1742) {
					local102 = this.anInt1742;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1762) {
					local116 = this.anInt1762;
				}
				local118 = local102 + local30 * this.anInt1769;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray123[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray123[local118++] = local277 + local340;
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
				if (local102 < this.anInt1742) {
					local102 = this.anInt1742;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1762 - 1) {
					local116 = this.anInt1762 - 1;
				}
				local118 = local102 + local30 * this.anInt1769;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray123[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray123[local118++] = local277 + local340;
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
				if (local91 < this.anInt1742) {
					local91 = this.anInt1742;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1762) {
					local102 = this.anInt1762;
				}
				local116 = local91 + local30 * this.anInt1769;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray123[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray123[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt1742) {
					local91 = this.anInt1742;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1762 - 1) {
					local102 = this.anInt1762 - 1;
				}
				local116 = local91 + local30 * this.anInt1769;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray123[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray123[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class22 method6010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class22_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!f", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1742;
		arg0[1] = this.anInt1747;
		arg0[2] = this.anInt1762;
		arg0[3] = this.anInt1744;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()Z")
	@Override
	public boolean method5947() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "h", descriptor = "()Z")
	@Override
	public boolean method5972() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(Z)V")
	@Override
	public void method5971(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "()Z")
	@Override
	public boolean method5969() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[Lclient!as;)V")
	@Override
	public void method6018(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4[] arg1) {
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5956(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas3 == null || this.aClass2_Sub10_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt1769 && local21.y <= this.anInt1753 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass2_Sub10_1.method4870(local21.x, local21.height, local21.width, local14, local21.y);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	@Override
	public void method5968(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!f", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt1741 = this.anInt1759;
		this.aBoolean103 = false;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!aq;[Lclient!ok;Z)Lclient!la;")
	@Override
	public Class14 method5977(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class190[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt5312;
			local7[local11] = arg1[local11].anInt5313;
			if (arg1[local11].aByteArray57 != null) {
			}
		}
		return new Class14_Sub2(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!f", name = "D", descriptor = "()V")
	private void method1726() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1765; local1++) {
			this.aClass88Array1[local1].method1967();
		}
		this.va();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!wu;III)V")
	public void method1727(@OriginalArg(0) Class28_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt4537;
		@Pc(4) int local4 = arg3;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.ZA(arg1, arg2, local4, arg0.anInt4532, 1);
			return;
		}
		if (this.anInt1770 != local2) {
			@Pc(32) Class41 local32 = (Class41) this.aClass188_21.method4158((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method1732(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method1735(local2) ? 64 : 128;
				local32 = this.method6006(local38, local48, local48, local48);
				this.aClass188_21.method4155((long) local2, local32);
			}
			this.anInt1770 = local2;
			this.lb = local32;
		}
		this.lb.ya(arg1 - local4, arg2 - local4, local8, local8, 0, arg0.anInt4532, 1);
	}

	@OriginalMember(owner = "client!f", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1748 = (int) (arg1 * 65535.0F);
		this.anInt1743 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1761 = (int) (arg3 * 65535.0F / local26);
		this.anInt1763 = (int) (arg4 * 65535.0F / local26);
		this.anInt1739 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
	@Override
	public void method5966(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!f", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt1769 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray123[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mt;)V")
	@Override
	public void method5958(@OriginalArg(0) Class141 arg0) {
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6012(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub10 local8 = (Class2_Sub10) this.aClass220_7.method5099((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method6260();
		local8 = Static423.method5789(arg0);
		this.aClass220_7.method5104(local8, (long) arg0.hashCode());
		if (this.aCanvas3 != arg0 || this.aClass41_5 != null) {
			return;
		}
		this.aClass2_Sub10_1 = local8;
		this.anIntArray123 = local8.anIntArray512;
		this.anInt1769 = local8.anInt6118;
		this.anInt1753 = local8.anInt6119;
		this.method1726();
	}

	@OriginalMember(owner = "client!f", name = "y", descriptor = "()Lclient!c;")
	@Override
	public Class6 method6014() {
		return new Class6_Sub1();
	}

	@OriginalMember(owner = "client!f", name = "l", descriptor = "()V")
	@Override
	public void method5983() {
		if (this.aCanvas3 == null || this.aClass2_Sub10_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			this.aClass2_Sub10_1.method4869(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!f", name = "j", descriptor = "()Z")
	@Override
	public boolean method5978() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1750 = arg0;
		this.anInt1758 = arg1;
		this.anInt1756 = this.anInt1758 - 255;
		this.method1731();
	}

	@OriginalMember(owner = "client!f", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return 0;
	}

	@OriginalMember(owner = "client!f", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt1758;
	}

	@OriginalMember(owner = "client!f", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1742) {
			arg2 -= this.anInt1742 - arg0;
			arg0 = this.anInt1742;
		}
		if (arg1 < this.anInt1747) {
			arg3 -= this.anInt1747 - arg1;
			arg1 = this.anInt1747;
		}
		if (arg0 + arg2 > this.anInt1762) {
			arg2 = this.anInt1762 - arg0;
		}
		if (arg1 + arg3 > this.anInt1744) {
			arg3 = this.anInt1744 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt1762 || arg1 > this.anInt1744) {
			return;
		}
		@Pc(67) int local67 = this.anInt1769 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt1769;
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
						local221 = this.anIntArray123[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray123[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray123[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray123[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray123[arg2] = arg4;
					arg2++;
					this.anIntArray123[arg2] = arg4;
					arg2++;
					this.anIntArray123[arg2] = arg4;
					arg2++;
					this.anIntArray123[arg2] = arg4;
					arg2++;
					this.anIntArray123[arg2] = arg4;
					arg2++;
					this.anIntArray123[arg2] = arg4;
					arg2++;
					this.anIntArray123[arg2] = arg4;
					arg2++;
					this.anIntArray123[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray123[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!f", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1742 || arg0 >= this.anInt1762) {
			return;
		}
		if (arg1 < this.anInt1747) {
			arg2 -= this.anInt1747 - arg1;
			arg1 = this.anInt1747;
		}
		if (arg1 + arg2 > this.anInt1744) {
			arg2 = this.anInt1744 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1769;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray123[local40 + local54 * this.anInt1769] = arg3;
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
				local111 = local40 + local103 * this.anInt1769;
				local116 = this.anIntArray123[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray123[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt1769;
				local111 = this.anIntArray123[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray123[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt1742) {
					arg1 += local104 * (this.anInt1742 - arg0);
					arg0 = this.anInt1742;
				}
				if (arg2 >= this.anInt1762) {
					arg2 = this.anInt1762 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1747 && local150 < this.anInt1744) {
							this.anIntArray123[arg0 + local150 * this.anInt1769] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt1747 && local213 < this.anInt1744) {
							local228 = arg0 + local213 * this.anInt1769;
							local233 = this.anIntArray123[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray123[local228] = local204 + local233;
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
				if (arg1 < this.anInt1747) {
					arg0 += local104 * (this.anInt1747 - arg1);
					arg1 = this.anInt1747;
				}
				if (arg3 >= this.anInt1744) {
					arg3 = this.anInt1744 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1742 && local150 < this.anInt1762) {
							this.anIntArray123[local150 + arg1 * this.anInt1769] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt1742 && local213 < this.anInt1762) {
							local228 = local213 + arg1 * this.anInt1769;
							local233 = this.anIntArray123[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray123[local213 + arg1 * this.anInt1769] = local204 + local516;
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

	@OriginalMember(owner = "client!f", name = "k", descriptor = "(I)I")
	public int method1728(@OriginalArg(0) int arg0) {
		return super.anInterface7_8.method1170(arg0).aShort101 & 0xFFFF;
	}

	@OriginalMember(owner = "client!f", name = "q", descriptor = "()V")
	@Override
	public void method5992() {
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	@Override
	public void method5954(@OriginalArg(0) int arg0) {
		this.aClass88Array1[arg0].method1969(Thread.currentThread());
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "()Z")
	@Override
	public boolean method5961() {
		return true;
	}

	@OriginalMember(owner = "client!f", name = "w", descriptor = "()Z")
	@Override
	public boolean method6002() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat15;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5950() {
		@Pc(3) Class88 local3 = this.method1730(Thread.currentThread());
		@Pc(6) Class250 local6 = local3.aClass250_1;
		local6.aBoolean476 = false;
		local6.aBoolean476 = false;
		local6.anInt7161 = 0;
		local6.aBoolean479 = true;
		local6.method5732(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean476 = true;
	}

	@OriginalMember(owner = "client!f", name = "l", descriptor = "(I)[I")
	public int[] method1729(@OriginalArg(0) int arg0) {
		@Pc(2) Class188 local2 = this.aClass188_22;
		@Pc(12) Class2_Sub37 local12;
		synchronized (this.aClass188_22) {
			local12 = (Class2_Sub37) this.aClass188_22.method4158((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_8.method1168(arg0)) {
					return null;
				}
				@Pc(32) Class257 local32 = super.anInterface7_8.method1170(arg0);
				@Pc(42) int local42 = local32.aBoolean493 || this.aBoolean104 ? 64 : 128;
				local12 = new Class2_Sub37(arg0, local42, super.anInterface7_8.method1171(true, 0.7F, arg0, local42, local42), local32.aBoolean491);
				this.aClass188_22.method4155((long) arg0, local12);
			}
		}
		local12.aBoolean424 = true;
		return local12.method4848();
	}

	@OriginalMember(owner = "client!f", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt1769;
		@Pc(35) int local35 = this.anInt1769 - arg2;
		if (arg1 + arg3 > this.anInt1744) {
			arg3 -= arg1 + arg3 - this.anInt1744;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt1747) {
			local59 = this.anInt1747 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt1769;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt1762) {
			local59 = arg0 + arg2 - this.anInt1762;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt1742) {
			local59 = this.anInt1742 - arg0;
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
						this.anIntArray123[local30++] = arg4;
					} else {
						this.anIntArray123[local30++] = arg5;
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
					local245 = this.anIntArray123[local30];
					this.anIntArray123[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray123[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray123[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!fu;")
	public Class88 method1730(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1765; local1++) {
			if (this.aClass88Array1[local1].aRunnable1 == arg0) {
				return this.aClass88Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!f", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass6_Sub1_1.anInt96 * arg0 + this.aClass6_Sub1_1.anInt99 * arg1 + this.aClass6_Sub1_1.anInt103 * arg2 >> 15) + this.aClass6_Sub1_1.anInt100;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass6_Sub1_1.anInt96 * arg3 + this.aClass6_Sub1_1.anInt99 * arg4 + this.aClass6_Sub1_1.anInt103 * arg5 >> 15) + this.aClass6_Sub1_1.anInt100;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt1750 && local52 < this.anInt1750 || !(local23 <= this.anInt1758 || local52 <= this.anInt1758)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt1745 * ((this.aClass6_Sub1_1.anInt95 * arg0 + this.aClass6_Sub1_1.anInt102 * arg1 + this.aClass6_Sub1_1.anInt93 * arg2 >> 15) + this.aClass6_Sub1_1.anInt94) / local23;
		@Pc(133) int local133 = this.anInt1745 * ((this.aClass6_Sub1_1.anInt95 * arg3 + this.aClass6_Sub1_1.anInt102 * arg4 + this.aClass6_Sub1_1.anInt93 * arg5 >> 15) + this.aClass6_Sub1_1.anInt94) / local52;
		if (local104 < this.anInt1757 && local133 < this.anInt1757 || local104 > this.anInt1751 && local133 > this.anInt1751) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt1746 * ((this.aClass6_Sub1_1.anInt97 * arg0 + this.aClass6_Sub1_1.anInt101 * arg1 + this.aClass6_Sub1_1.anInt98 * arg2 >> 15) + this.aClass6_Sub1_1.anInt104) / local23;
			@Pc(209) int local209 = this.anInt1746 * ((this.aClass6_Sub1_1.anInt97 * arg3 + this.aClass6_Sub1_1.anInt101 * arg4 + this.aClass6_Sub1_1.anInt98 * arg5 >> 15) + this.aClass6_Sub1_1.anInt104) / local52;
			return (local180 >= this.anInt1767 || local209 >= this.anInt1767) && (local180 <= this.anInt1749 || local209 <= this.anInt1749);
		}
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	@Override
	public void method5984(@OriginalArg(0) int arg0) {
		if (this.anInt1765 == arg0) {
			return;
		}
		this.anInt1765 = arg0;
		this.aClass88Array1 = new Class88[this.anInt1765];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1765; local14++) {
			this.aClass88Array1[local14] = new Class88(this);
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()Z")
	@Override
	public boolean method5951() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(2) int local2 = this.anInt1760;
		this.anInt1760 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!f", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1766 = arg0;
		this.anInt1754 = arg1;
		this.anInt1745 = arg2;
		this.anInt1746 = arg3;
		this.method1736();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ok;Z)Lclient!o;")
	@Override
	public Class41 method5986(@OriginalArg(0) Class190 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray453;
		@Pc(5) byte[] local5 = arg0.aByteArray58;
		@Pc(8) int local8 = arg0.anInt5312;
		@Pc(11) int local11 = arg0.anInt5313;
		@Pc(76) Class41_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray57 == null) {
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
			local76 = new Class41_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray57;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class41_Sub1_Sub1(this, local20, local8, local11);
				local76 = new Class41_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class41_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.ha(arg0.anInt5311, arg0.anInt5315, arg0.anInt5310, arg0.anInt5314);
		return local76;
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()Z")
	@Override
	public boolean method5952() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class88 local3 = this.method1730(Thread.currentThread());
		@Pc(6) Class250 local6 = local3.aClass250_1;
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
		@Pc(93) int local93 = arg0 - local6.method5741();
		@Pc(98) int local98 = arg1 - local6.method5737();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt7161 = 0;
		local6.aBoolean479 = local102 < 0 || local102 > local6.anInt7163 || local106 < 0 || local106 > local6.anInt7163 || local112 < 0 || local112 > local6.anInt7163;
		local6.method5735(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean479 = local102 < 0 || local102 > local6.anInt7163 || local106 < 0 || local106 > local6.anInt7163 || local118 < 0 || local118 > local6.anInt7163;
		local6.method5735(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6020(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub10 local8 = (Class2_Sub10) this.aClass220_7.method5099((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static423.method5789(arg0);
			this.aClass220_7.method5104(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!f", name = "x", descriptor = "()Z")
	@Override
	public boolean method6003() {
		return true;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Lclient!n;")
	@Override
	public Class2_Sub7 method5955(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!mt;Lclient!mt;FLclient!mt;)Lclient!mt;")
	@Override
	public Class141 method6005(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class141 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	@Override
	public void method5953(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1738;
		for (@Pc(9) Object local9 = this.aClass188_22.method4157(); local9 != null; local9 = this.aClass188_22.method4168()) {
			@Pc(13) Class2_Sub37 local13 = (Class2_Sub37) local9;
			if (local13.aBoolean424) {
				local13.anInt6093 += local4;
				@Pc(27) int local27 = local13.anInt6093 / 20;
				if (local27 > 0) {
					@Pc(36) Class257 local36 = super.anInterface7_8.method1170(local13.anInt6094);
					local13.method4849(local36.aByte92 * local4 * 50 / 1000, local36.aByte95 * local4 * 50 / 1000);
					local13.anInt6093 -= local27 * 20;
				}
				local13.aBoolean424 = false;
			}
		}
		this.anInt1738 = arg0;
		this.aClass188_21.method4169(5);
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	@Override
	public void method5974(@OriginalArg(0) int arg0) {
		this.aClass88Array1[arg0].method1969(null);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!kk;I)V")
	@Override
	public void method6004(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class28_Sub4[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class63_Sub1[] local3 = new Class63_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class63_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class63_Sub1 local26 = Static209.method2954(this, local3);
		local26.method2947(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!f", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1742 < arg0) {
			this.anInt1742 = arg0;
		}
		if (this.anInt1747 < arg1) {
			this.anInt1747 = arg1;
		}
		if (this.anInt1762 > arg2) {
			this.anInt1762 = arg2;
		}
		if (this.anInt1744 > arg3) {
			this.anInt1744 = arg3;
		}
		this.method1736();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!e;Lclient!dm;Lclient!c;Lclient!kk;I)V")
	@Override
	public void method5960(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class28_Sub4 arg3) {
		((Class63_Sub1) arg0).method2947(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
	@Override
	public void method5949(@OriginalArg(0) boolean arg0) {
		this.aBoolean104 = arg0;
		this.aClass188_22.method4156();
	}

	@OriginalMember(owner = "client!f", name = "k", descriptor = "()V")
	@Override
	public void method5980() {
		this.aClass188_22.method4156();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
	@Override
	public int method5987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method6013(@OriginalArg(0) Class2_Sub7 arg0) {
	}

	@OriginalMember(owner = "client!f", name = "u", descriptor = "()Z")
	@Override
	public boolean method5999() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1741 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt1741 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt1741 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt1741 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt1741 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean105 = false;
		} else {
			this.aBoolean105 = true;
		}
	}

	@OriginalMember(owner = "client!f", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt1750;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)I")
	@Override
	public int method6023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(IIIIII)Lclient!mt;")
	@Override
	public Class141 method6009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!f", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		this.anInt1755 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([Lclient!e;Lclient!dm;Lclient!c;[Lclient!kk;I)V")
	@Override
	public void method5965(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class28_Sub4[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class63_Sub1[] local3 = new Class63_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class63_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class63_Sub1 local26 = Static209.method2954(this, local3);
		local26.method2947(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!f", name = "E", descriptor = "()V")
	private void method1731() {
		if (this.aFloat16 == 0.0F) {
			this.anInt1768 = this.anInt1758;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt1758;
		@Pc(12) float local12 = (float) this.anInt1750;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat15 / (this.aFloat16 + this.aFloat15);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat16;
		this.anInt1768 = (int) (((float) this.anInt1758 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!f", name = "A", descriptor = "()Z")
	@Override
	public boolean method6017() {
		return true;
	}

	@OriginalMember(owner = "client!f", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass6_Sub1_1.anInt100 + (this.aClass6_Sub1_1.anInt96 * arg0 + this.aClass6_Sub1_1.anInt99 * arg1 + this.aClass6_Sub1_1.anInt103 * arg2 >> 15);
		if (local23 < this.anInt1750 || local23 > this.anInt1758) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt1745 * (this.aClass6_Sub1_1.anInt94 + (this.aClass6_Sub1_1.anInt95 * arg0 + this.aClass6_Sub1_1.anInt102 * arg1 + this.aClass6_Sub1_1.anInt93 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt1746 * (this.aClass6_Sub1_1.anInt104 + (this.aClass6_Sub1_1.anInt97 * arg0 + this.aClass6_Sub1_1.anInt101 * arg1 + this.aClass6_Sub1_1.anInt98 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt1757 && local73 <= this.anInt1751 && local102 >= this.anInt1767 && local102 <= this.anInt1749) {
			arg3[0] = local73 - this.anInt1757;
			arg3[1] = local102 - this.anInt1767;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method5957(@OriginalArg(0) Class56 arg0) {
		@Pc(3) Class28_Sub2 local3 = arg0.aClass96_1.aClass28_Sub2_3;
		for (@Pc(6) Class28_Sub2 local6 = local3.aClass28_Sub2_9; local6 != local3; local6 = local6.aClass28_Sub2_9) {
			@Pc(10) Class28_Sub2_Sub1 local10 = (Class28_Sub2_Sub1) local6;
			@Pc(15) int local15 = local10.anInt4530 >> 12;
			@Pc(20) int local20 = local10.anInt4535 >> 12;
			@Pc(25) int local25 = local10.anInt4538 >> 12;
			@Pc(49) int local49 = this.aClass6_Sub1_1.anInt100 + (this.aClass6_Sub1_1.anInt96 * local15 + this.aClass6_Sub1_1.anInt99 * local20 + this.aClass6_Sub1_1.anInt103 * local25 >> 15);
			if (local49 >= this.anInt1750 && local49 <= this.anInt1756) {
				@Pc(90) int local90 = this.anInt1766 + this.anInt1745 * (this.aClass6_Sub1_1.anInt94 + (this.aClass6_Sub1_1.anInt95 * local15 + this.aClass6_Sub1_1.anInt102 * local20 + this.aClass6_Sub1_1.anInt93 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt1754 + this.anInt1746 * (this.aClass6_Sub1_1.anInt104 + (this.aClass6_Sub1_1.anInt97 * local15 + this.aClass6_Sub1_1.anInt101 * local20 + this.aClass6_Sub1_1.anInt98 * local25 >> 15)) / local49;
				if (local90 >= this.anInt1742 && local90 <= this.anInt1762 && local122 >= this.anInt1747 && local122 <= this.anInt1744) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method1727(local10, local90, local122, (local10.anInt4540 * this.anInt1745 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1769) {
			arg2 = this.anInt1769;
		}
		if (arg3 > this.anInt1753) {
			arg3 = this.anInt1753;
		}
		this.anInt1742 = arg0;
		this.anInt1762 = arg2;
		this.anInt1747 = arg1;
		this.anInt1744 = arg3;
		this.method1736();
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5988(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
			this.method5964(null);
		}
		@Pc(15) Class2_Sub10 local15 = (Class2_Sub10) this.aClass220_7.method5099((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6260();
		}
	}

	@OriginalMember(owner = "client!f", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat15 = arg0;
		this.aFloat16 = arg1;
		this.method1731();
	}

	@OriginalMember(owner = "client!f", name = "v", descriptor = "()V")
	@Override
	protected void method6000() {
		if (this.aBoolean101) {
			Static177.method2584(false, true);
			this.aBoolean101 = false;
		}
		this.aClass2_Sub10_1 = null;
		this.aCanvas3 = null;
		this.aClass220_7 = null;
		this.aBoolean102 = true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class41 method5973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1769 + arg0;
		@Pc(16) int local16 = this.anInt1769 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray123[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class41_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class41_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!f", name = "z", descriptor = "()Z")
	@Override
	public boolean method6015() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "o", descriptor = "()Z")
	@Override
	public boolean method5991() {
		return true;
	}

	@OriginalMember(owner = "client!f", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class6 arg0) {
		this.aClass6_Sub1_1 = (Class6_Sub1) arg0;
	}

	@OriginalMember(owner = "client!f", name = "t", descriptor = "()V")
	@Override
	public void method5998() {
	}

	@OriginalMember(owner = "client!f", name = "f", descriptor = "()V")
	@Override
	public void method5963() {
	}

	@OriginalMember(owner = "client!f", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.P(0, 0, this.anInt1769, this.anInt1753, arg0, 0);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()Z")
	@Override
	public boolean method5948() {
		return false;
	}

	@OriginalMember(owner = "client!f", name = "i", descriptor = "()V")
	@Override
	public void method5975() {
	}

	@OriginalMember(owner = "client!f", name = "m", descriptor = "(I)[I")
	private int[] method1732(@OriginalArg(0) int arg0) {
		@Pc(2) Class188 local2 = this.aClass188_22;
		@Pc(12) Class2_Sub37 local12;
		synchronized (this.aClass188_22) {
			local12 = (Class2_Sub37) this.aClass188_22.method4158((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_8.method1168(arg0)) {
					return null;
				}
				@Pc(32) Class257 local32 = super.anInterface7_8.method1170(arg0);
				@Pc(42) int local42 = local32.aBoolean493 || this.aBoolean104 ? 64 : 128;
				local12 = new Class2_Sub37(arg0, local42, super.anInterface7_8.method1172(0.7F, local42, arg0, local42), local32.aBoolean491);
				this.aClass188_22.method4155((long) arg0, local12);
			}
		}
		local12.aBoolean424 = true;
		return local12.method4848();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1752 = arg0;
		this.anInt1741 = arg1;
		this.anInt1740 = arg2;
	}

	@OriginalMember(owner = "client!f", name = "n", descriptor = "(I)Z")
	public boolean method1733(@OriginalArg(0) int arg0) {
		return super.anInterface7_8.method1168(arg0);
	}

	@OriginalMember(owner = "client!f", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class102_Sub2 local2 = (Class102_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray499;
		@Pc(8) int[] local8 = local2.anIntArray498;
		@Pc(20) int local20;
		if (this.anInt1744 < arg3 + local5.length) {
			local20 = this.anInt1744 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1747 > arg3) {
			local33 = this.anInt1747 - arg3;
			arg3 = this.anInt1747;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt1769;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt1742 > local58) {
				local62 -= this.anInt1742 - local58;
				local58 = this.anInt1742;
			}
			if (this.anInt1762 < local58 + local62) {
				local62 = this.anInt1762 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray123[local58++] = arg0;
			}
			local49 += this.anInt1769;
		}
	}

	@OriginalMember(owner = "client!f", name = "s", descriptor = "()I")
	@Override
	public int method5994() {
		return 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5970(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!f", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1759 = this.anInt1741;
		this.anInt1752 = arg0;
		this.anInt1741 = arg1;
		this.anInt1740 = arg2;
		this.aBoolean103 = true;
	}

	@OriginalMember(owner = "client!f", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(2) int local2 = this.anInt1764;
		this.anInt1764 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!f", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat16;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class102 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class102_Sub2 local2 = (Class102_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray499;
		@Pc(8) int[] local8 = local2.anIntArray498;
		@Pc(17) int local17 = this.anInt1747 > arg7 ? this.anInt1747 : arg7;
		@Pc(32) int local32 = this.anInt1744 < arg7 + local5.length ? this.anInt1744 : arg7 + local5.length;
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
					if (local129 >= this.anInt1742 && local129 < this.anInt1762 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray123[local129 + arg1 * this.anInt1769] = arg4;
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
					if (local133 >= this.anInt1742 && local133 < this.anInt1762 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt1769;
						local248 = this.anIntArray123[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray123[local133 + arg1 * this.anInt1769] = local201 + local584;
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
		if (arg0 < this.anInt1742) {
			arg1 += local83 * (this.anInt1742 - arg0);
			arg0 = this.anInt1742;
		}
		if (arg2 >= this.anInt1762) {
			arg2 = this.anInt1762 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray123[arg0 + local129 * this.anInt1769] = arg4;
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
					local243 = arg0 + local133 * this.anInt1769;
					local248 = this.anIntArray123[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray123[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!f", name = "o", descriptor = "(I)Z")
	public boolean method1734(@OriginalArg(0) int arg0) {
		return super.anInterface7_8.method1170(arg0).aBoolean492;
	}

	@OriginalMember(owner = "client!f", name = "p", descriptor = "(I)Z")
	public boolean method1735(@OriginalArg(0) int arg0) {
		return this.aBoolean104 || super.anInterface7_8.method1170(arg0).aBoolean493;
	}

	@OriginalMember(owner = "client!f", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1747 || arg1 >= this.anInt1744) {
			return;
		}
		if (arg0 < this.anInt1742) {
			arg2 -= this.anInt1742 - arg0;
			arg0 = this.anInt1742;
		}
		if (arg0 + arg2 > this.anInt1762) {
			arg2 = this.anInt1762 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1769;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray123[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray123[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray123[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray123[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray123[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIF)Lclient!as;")
	@Override
	public Class2_Sub4 method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class102 method5982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class102_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!f", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!f", name = "F", descriptor = "()V")
	private void method1736() {
		this.anInt1757 = this.anInt1742 - this.anInt1766;
		this.anInt1751 = this.anInt1762 - this.anInt1766;
		this.anInt1767 = this.anInt1747 - this.anInt1754;
		this.anInt1749 = this.anInt1744 - this.anInt1754;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1765; local29++) {
			@Pc(36) Class250 local36 = this.aClass88Array1[local29].aClass250_1;
			local36.anInt7164 = this.anInt1766 - this.anInt1742;
			local36.anInt7165 = this.anInt1754 - this.anInt1747;
			local36.anInt7163 = this.anInt1762 - this.anInt1742;
			local36.anInt7166 = this.anInt1744 - this.anInt1747;
		}
		@Pc(78) int local78 = this.anInt1747 * this.anInt1769 + this.anInt1742;
		for (@Pc(81) int local81 = this.anInt1747; local81 < this.anInt1744; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt1765; local84++) {
				this.aClass88Array1[local84].aClass250_1.anIntArray580[local81 - this.anInt1747] = local78;
			}
			local78 += this.anInt1769;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!fc;IIII)Lclient!e;")
	@Override
	public Class63 method6016(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class63_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}
}
