import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "Lclient!dh;")
	private Class22_Sub3 aClass22_Sub3_2;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	private int anInt1728 = 0;

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
	private int anInt1738 = 0;

	@OriginalMember(owner = "client!fn", name = "D", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
	private int anInt1740 = -32768;

	@OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
	private int anInt1746 = -1;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	public int anInt1729;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
	public int anInt1731;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
	public int anInt1732;

	@OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
	public int anInt1739;

	@OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
	private int anInt1727;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
	public int anInt1725;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "Lclient!sb;")
	private Class152 aClass152_1;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(IIIIIII)V")
	public Class11_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1729 = arg5 + arg6;
		this.anInt1731 = arg1;
		this.anInt1732 = arg2;
		this.anInt1739 = arg4;
		this.anInt1727 = arg0;
		this.anInt1725 = arg3;
		@Pc(45) int local45 = Static226.method3632(this.anInt1727).anInt518;
		if (local45 == -1) {
			this.aBoolean175 = true;
		} else {
			this.aBoolean175 = false;
			this.aClass152_1 = Static107.method2016(local45);
		}
		if (arg6 == this.anInt1729) {
			Static291.method4385(this.aClass152_1, false, this.anInt1725, this.anInt1732, this.anInt1738);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean174) {
			@Pc(11) Class11_Sub1 local11 = this.method1634();
			if (local11 == null) {
				return;
			}
			this.method1632(local11);
		}
		if (this.aClass22_Sub3_2 != null) {
			this.aClass22_Sub3_2.method972(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
	public void method1630(@OriginalArg(1) int arg0) {
		if (this.aBoolean175) {
			return;
		}
		this.anInt1728 += arg0;
		while (this.aClass152_1.anIntArray512[this.anInt1738] < this.anInt1728) {
			this.anInt1728 -= this.aClass152_1.anIntArray512[this.anInt1738];
			this.anInt1738++;
			if (this.anInt1738 >= this.aClass152_1.anIntArray509.length) {
				this.aBoolean175 = true;
				break;
			}
		}
		if (!this.aBoolean175) {
			Static291.method4385(this.aClass152_1, false, this.anInt1725, this.anInt1732, this.anInt1738);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "()I")
	@Override
	public int method4297() {
		return this.anInt1740;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!sm;)V")
	private void method1632(@OriginalArg(1) Class11_Sub1 arg0) {
		if (Static71.aBoolean165) {
			@Pc(4) Class11_Sub1_Sub1 local4 = (Class11_Sub1_Sub1) arg0;
			if ((this.aClass22_Sub3_2 == null || this.aClass22_Sub3_2.aBoolean111) && (local4.aClass146Array1 != null || local4.aClass76Array1 != null)) {
				this.aClass22_Sub3_2 = new Class22_Sub3(Static167.anInt637, 1, 1);
			}
			if (this.aClass22_Sub3_2 != null) {
				this.aClass22_Sub3_2.method971(local4.aClass146Array1, local4.aClass76Array1, false, local4.anIntArray46, local4.anIntArray45, local4.anIntArray41);
			}
		} else {
			@Pc(52) Class11_Sub1_Sub2 local52 = (Class11_Sub1_Sub2) arg0;
			if ((this.aClass22_Sub3_2 == null || this.aClass22_Sub3_2.aBoolean111) && (local52.aClass146Array2 != null || local52.aClass76Array2 != null)) {
				this.aClass22_Sub3_2 = new Class22_Sub3(Static167.anInt637, 1, 1);
			}
			if (this.aClass22_Sub3_2 != null) {
				this.aClass22_Sub3_2.method971(local52.aClass146Array2, local52.aClass76Array2, false, local52.anIntArray312, local52.anIntArray311, local52.anIntArray319);
			}
		}
		this.aBoolean174 = true;
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)Lclient!sm;")
	private Class11_Sub1 method1634() {
		@Pc(14) Class15 local14 = Static226.method3632(this.anInt1727);
		@Pc(31) Class11_Sub1 local31;
		if (this.aBoolean175) {
			local31 = local14.method496(-1, 0, -1);
		} else {
			local31 = local14.method496(this.anInt1738, this.anInt1728, this.anInt1746);
		}
		return local31 == null ? null : local31;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIIIIIIJILclient!dh;)V")
	@Override
	public void method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class22_Sub3 arg10) {
		@Pc(7) Class11_Sub1 local7 = this.method1634();
		if (local7 != null) {
			this.method1632(local7);
			local7.method4299(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass22_Sub3_2);
			this.anInt1740 = local7.method4297();
		}
	}
}
