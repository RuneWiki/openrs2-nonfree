import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class15_Sub6 extends Class15 {

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "Lclient!gl;")
	private Class20_Sub2 aClass20_Sub2_5;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
	private int anInt3834 = 0;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "I")
	private int anInt3840 = -1;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
	private int anInt3839 = -32768;

	@OriginalMember(owner = "client!mg", name = "E", descriptor = "Z")
	public boolean aBoolean258 = false;

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
	private int anInt3842 = 0;

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "Z")
	private boolean aBoolean257 = false;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	public int anInt3832;

	@OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
	public int anInt3848;

	@OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
	public int anInt3838;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
	private int anInt3843;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	public int anInt3833;

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
	public int anInt3844;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "Lclient!mi;")
	private Class112 aClass112_3;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class15_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3832 = arg6 + arg5;
		this.anInt3848 = arg4;
		this.anInt3838 = arg2;
		this.anInt3843 = arg0;
		this.anInt3833 = arg3;
		this.anInt3844 = arg1;
		@Pc(46) int local46 = Static156.method2852(this.anInt3843).anInt3389;
		if (local46 == -1) {
			this.aBoolean258 = true;
		} else {
			this.aBoolean258 = false;
			this.aClass112_3 = Static208.method3496(local46);
		}
		if (arg6 == this.anInt3832) {
			Static28.method558(false, this.aClass112_3, this.anInt3834, this.anInt3838, this.anInt3833);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean257) {
			@Pc(10) Class15_Sub5 local10 = this.method3154();
			if (local10 == null) {
				return;
			}
			this.method3158(local10);
		}
		if (this.aClass20_Sub2_5 != null) {
			this.aClass20_Sub2_5.method1691(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
	public void method3153(@OriginalArg(0) int arg0) {
		if (this.aBoolean258) {
			return;
		}
		this.anInt3842 += arg0;
		while (this.aClass112_3.anIntArray377[this.anInt3834] < this.anInt3842) {
			this.anInt3842 -= this.aClass112_3.anIntArray377[this.anInt3834];
			this.anInt3834++;
			if (this.anInt3834 >= this.aClass112_3.anIntArray378.length) {
				this.aBoolean258 = true;
				break;
			}
		}
		if (!this.aBoolean258) {
			Static28.method558(false, this.aClass112_3, this.anInt3834, this.anInt3838, this.anInt3833);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Lclient!hb;")
	private Class15_Sub5 method3154() {
		@Pc(4) Class96 local4 = Static156.method2852(this.anInt3843);
		@Pc(17) Class15_Sub5 local17;
		if (this.aBoolean258) {
			local17 = local4.method2801(-1, 0, -1);
		} else {
			local17 = local4.method2801(this.anInt3834, this.anInt3842, this.anInt3840);
		}
		return local17 == null ? null : local17;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()I")
	@Override
	public int method4274() {
		return this.anInt3839;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!hb;)V")
	private void method3158(@OriginalArg(1) Class15_Sub5 arg0) {
		if (Static116.aBoolean184) {
			@Pc(49) Class15_Sub5_Sub2 local49 = (Class15_Sub5_Sub2) arg0;
			if ((this.aClass20_Sub2_5 == null || this.aClass20_Sub2_5.aBoolean150) && (local49.aClass185Array2 != null || local49.aClass176Array2 != null)) {
				this.aClass20_Sub2_5 = new Class20_Sub2(Static268.anInt5236, 1, 1);
			}
			if (this.aClass20_Sub2_5 != null) {
				this.aClass20_Sub2_5.method1699(local49.aClass185Array2, local49.aClass176Array2, false, local49.anIntArray285, local49.anIntArray287, local49.anIntArray288);
			}
		} else {
			@Pc(4) Class15_Sub5_Sub1 local4 = (Class15_Sub5_Sub1) arg0;
			if ((this.aClass20_Sub2_5 == null || this.aClass20_Sub2_5.aBoolean150) && (local4.aClass185Array1 != null || local4.aClass176Array1 != null)) {
				this.aClass20_Sub2_5 = new Class20_Sub2(Static268.anInt5236, 1, 1);
			}
			if (this.aClass20_Sub2_5 != null) {
				this.aClass20_Sub2_5.method1699(local4.aClass185Array1, local4.aClass176Array1, false, local4.anIntArray251, local4.anIntArray244, local4.anIntArray249);
			}
		}
		this.aBoolean257 = true;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIIJILclient!gl;)V")
	@Override
	public void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub2 arg10) {
		@Pc(7) Class15_Sub5 local7 = this.method3154();
		if (local7 != null) {
			this.method3158(local7);
			local7.method4272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub2_5);
			this.anInt3839 = local7.method4274();
		}
	}
}
