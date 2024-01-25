import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public abstract class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
	protected int anInt1755;

	@OriginalMember(owner = "client!gs", name = "w", descriptor = "I")
	protected int anInt1776;

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "I")
	protected int anInt1777;

	@OriginalMember(owner = "client!gs", name = "z", descriptor = "I")
	protected int anInt1779;

	@OriginalMember(owner = "client!gs", name = "G", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "Lclient!d;")
	protected final Class48_Sub1 aClass48_Sub1_4;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
	protected final int anInt1759;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
	protected final int anInt1766;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Lclient!d;II)V")
	protected Class27_Sub1(@OriginalArg(0) Class48_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass48_Sub1_4 = arg0;
		this.anInt1759 = arg1;
		this.anInt1766 = arg2;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIII)V")
	public abstract void method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass48_Sub1_4.method1112()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray133 == null) {
			this.anIntArray133 = new int[4];
		}
		this.aClass48_Sub1_4.method2495(this.anIntArray133);
		this.aClass48_Sub1_4.method2452(this.aClass48_Sub1_4.anInt1340, this.aClass48_Sub1_4.anInt1334, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5317();
		@Pc(40) int local40 = this.method5328();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5319(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass48_Sub1_4.method2496(this.anIntArray133[0], this.anIntArray133[1], this.anIntArray133[2], this.anIntArray133[3]);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "()I")
	@Override
	public final int method5317() {
		return this.anInt1779 + this.anInt1759 + this.anInt1755;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILclient!hg;II)V")
	public abstract void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)V")
	protected abstract void method1411(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method5325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1779 = arg0;
		this.anInt1776 = arg1;
		this.anInt1755 = arg2;
		this.anInt1777 = arg3;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "()I")
	@Override
	public final int method5320() {
		return this.anInt1759;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(FFFFFFLclient!hg;II)V")
	@Override
	protected final void method5326(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class8 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass48_Sub1_4.method1112()) {
			throw new IllegalStateException();
		}
		this.method1413(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class8_Sub1 local18 = (Class8_Sub1) arg6;
		this.method1412(local18.anIntArray18, local18.anIntArray19, Static122.anInt1772 - arg7, -arg8 - (Static122.anInt1774 - Static122.anInt1775));
	}

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "()I")
	@Override
	public final int method5328() {
		return this.anInt1776 + this.anInt1766 + this.anInt1777;
	}

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "()I")
	@Override
	public final int method5327() {
		return this.anInt1766;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([I[III)V")
	protected abstract void method1412(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(IIIIIII)V")
	public abstract void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5322(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass48_Sub1_4.method1112()) {
			throw new IllegalStateException();
		}
		this.method1413(arg0, arg1, arg2, arg3, arg4, arg5);
		Static122.anInt1782 = arg7;
		if (arg6 != 0) {
			Static122.anInt1756 = arg7 >>> 24;
			Static122.anInt1771 = 256 - Static122.anInt1756;
			if (arg6 == 1) {
				Static122.anInt1760 = arg7 >> 16 & 0xFF;
				Static122.anInt1763 = arg7 >> 8 & 0xFF;
				Static122.anInt1758 = arg7 & 0xFF;
			} else {
				Static122.anInt1773 = arg7 >>> 24;
				Static122.anInt1768 = 256 - Static122.anInt1773;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static122.anInt1768 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static122.anInt1768 & 0xFF0000;
				Static122.anInt1764 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method1411(0);
		} else if (arg6 == 1) {
			this.method1411(1);
		} else if (arg6 == 2) {
			this.method1411(2);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(FFFFFF)V")
	private void method1413(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt1779 + this.anInt1759 + this.anInt1755;
		@Pc(17) int local17 = this.anInt1776 + this.anInt1766 + this.anInt1777;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt1759 || local17 != this.anInt1766) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt1776;
			local65 = local53 * (float) this.anInt1776;
			local71 = local32 * (float) this.anInt1779;
			local77 = local39 * (float) this.anInt1779;
			@Pc(84) float local84 = -local32 * (float) this.anInt1755;
			@Pc(91) float local91 = -local39 * (float) this.anInt1755;
			@Pc(98) float local98 = -local46 * (float) this.anInt1777;
			@Pc(105) float local105 = -local53 * (float) this.anInt1777;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass48_Sub1_4.anInt1340) {
			local46 = this.aClass48_Sub1_4.anInt1340;
		}
		if (local53 > (float) this.aClass48_Sub1_4.anInt1327) {
			local53 = this.aClass48_Sub1_4.anInt1327;
		}
		if (local59 < (float) this.aClass48_Sub1_4.anInt1334) {
			local59 = this.aClass48_Sub1_4.anInt1334;
		}
		if (local65 > (float) this.aClass48_Sub1_4.anInt1326) {
			local65 = this.aClass48_Sub1_4.anInt1326;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static122.anInt1785 = this.aClass48_Sub1_4.anInt1342;
		Static122.anInt1770 = (int) ((float) ((int) local59 * Static122.anInt1785) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static122.anInt1781 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt1759 / local71);
		Static122.anInt1780 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt1766 / local77);
		Static122.anInt1778 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt1759 / local77);
		Static122.anInt1757 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt1766 / local71);
		Static122.anInt1769 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static122.anInt1784 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static122.anInt1767 = (this.anInt1759 >> 1 << 12) + (Static122.anInt1784 * Static122.anInt1778 >> 4);
		Static122.anInt1765 = (this.anInt1766 >> 1 << 12) + (Static122.anInt1784 * Static122.anInt1757 >> 4);
		Static122.anInt1783 = Static122.anInt1769 * Static122.anInt1781 >> 4;
		Static122.anInt1761 = Static122.anInt1769 * Static122.anInt1780 >> 4;
		Static122.anInt1772 = (int) local46;
		Static122.anInt1762 = (int) local53;
		Static122.anInt1775 = (int) local59;
		Static122.anInt1774 = (int) local65;
	}
}
