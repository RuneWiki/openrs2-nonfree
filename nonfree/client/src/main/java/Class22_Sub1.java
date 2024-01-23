import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "Lclient!ko;")
	private Class45_Sub2 aClass45_Sub2_1;

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
	private int anInt449 = -32768;

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
	private int anInt444 = 0;

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
	private int anInt453 = -1;

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "Z")
	public boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
	private int anInt455 = 0;

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
	public int anInt438;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "Lclient!tc;")
	private Class167 aClass167_1;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(IIIIIII)V")
	public Class22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt443 = arg1;
		this.anInt445 = arg3;
		this.anInt447 = arg2;
		this.anInt438 = arg6 + arg5;
		this.anInt442 = arg4;
		this.anInt448 = arg0;
		@Pc(45) int local45 = Static239.method3759(this.anInt448).anInt2712;
		if (local45 == -1) {
			this.aBoolean29 = true;
		} else {
			this.aBoolean29 = false;
			this.aClass167_1 = Static313.method4648(local45);
		}
		if (this.anInt438 == arg6) {
			Static212.method3338(this.anInt447, false, this.anInt444, this.aClass167_1, this.anInt445);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean30) {
			@Pc(11) Class22_Sub4 local11 = this.method450();
			if (local11 == null) {
				return;
			}
			this.method452(local11);
		}
		if (this.aClass45_Sub2_1 != null) {
			this.aClass45_Sub2_1.method2396(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
	public void method449(@OriginalArg(0) int arg0) {
		if (this.aBoolean29) {
			return;
		}
		this.anInt455 += arg0;
		while (this.anInt455 > this.aClass167_1.anIntArray463[this.anInt444]) {
			this.anInt455 -= this.aClass167_1.anIntArray463[this.anInt444];
			this.anInt444++;
			if (this.anInt444 >= this.aClass167_1.anIntArray461.length) {
				this.aBoolean29 = true;
				break;
			}
		}
		if (!this.aBoolean29) {
			Static212.method3338(this.anInt447, false, this.anInt444, this.aClass167_1, this.anInt445);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)Lclient!hc;")
	private Class22_Sub4 method450() {
		@Pc(8) Class97 local8 = Static239.method3759(this.anInt448);
		@Pc(21) Class22_Sub4 local21;
		if (this.aBoolean29) {
			local21 = local8.method2204(-1, 0, -1);
		} else {
			local21 = local8.method2204(this.anInt453, this.anInt455, this.anInt444);
		}
		return local21 == null ? null : local21;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "()I")
	@Override
	public int method4071() {
		return this.anInt449;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIJILclient!ko;)V")
	@Override
	public void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class45_Sub2 arg10) {
		@Pc(7) Class22_Sub4 local7 = this.method450();
		if (local7 != null) {
			this.method452(local7);
			local7.method4073(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass45_Sub2_1);
			this.anInt449 = local7.method4071();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!hc;)V")
	private void method452(@OriginalArg(1) Class22_Sub4 arg0) {
		if (Static291.aBoolean404) {
			@Pc(53) Class22_Sub4_Sub1 local53 = (Class22_Sub4_Sub1) arg0;
			if ((this.aClass45_Sub2_1 == null || this.aClass45_Sub2_1.aBoolean216) && (local53.aClass49Array1 != null || local53.aClass15Array1 != null)) {
				this.aClass45_Sub2_1 = new Class45_Sub2(Static37.anInt757, 1, 1);
			}
			if (this.aClass45_Sub2_1 != null) {
				this.aClass45_Sub2_1.method2405(local53.aClass49Array1, local53.aClass15Array1, false, local53.anIntArray174, local53.anIntArray175, local53.anIntArray170);
			}
		} else {
			@Pc(8) Class22_Sub4_Sub2 local8 = (Class22_Sub4_Sub2) arg0;
			if ((this.aClass45_Sub2_1 == null || this.aClass45_Sub2_1.aBoolean216) && (local8.aClass49Array2 != null || local8.aClass15Array2 != null)) {
				this.aClass45_Sub2_1 = new Class45_Sub2(Static37.anInt757, 1, 1);
			}
			if (this.aClass45_Sub2_1 != null) {
				this.aClass45_Sub2_1.method2405(local8.aClass49Array2, local8.aClass15Array2, false, local8.anIntArray385, local8.anIntArray382, local8.anIntArray379);
			}
		}
		this.aBoolean30 = true;
	}
}
