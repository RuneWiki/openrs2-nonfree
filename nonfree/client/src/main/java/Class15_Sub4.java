import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class15_Sub4 extends Class15 {

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!lg;")
	private Class87_Sub2 aClass87_Sub2_2;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
	private int anInt1099 = 0;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "Z")
	public boolean aBoolean59 = false;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
	private int anInt1082 = 0;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	private int anInt1081 = -1;

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
	private int anInt1103 = -32768;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	public int anInt1088;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	public int anInt1085;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
	public int anInt1092;

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
	private int anInt1100;

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
	public int anInt1104;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
	public int anInt1087;

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "Lclient!ro;")
	private Class157 aClass157_2;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIII)V")
	public Class15_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1088 = arg1;
		this.anInt1085 = arg4;
		this.anInt1092 = arg2;
		this.anInt1100 = arg0;
		this.anInt1104 = arg5 + arg6;
		this.anInt1087 = arg3;
		@Pc(45) int local45 = Static55.method978(this.anInt1100).anInt3473;
		if (local45 == -1) {
			this.aBoolean59 = true;
		} else {
			this.aBoolean59 = false;
			this.aClass157_2 = Static80.method1561(local45);
		}
		if (arg6 == this.anInt1104) {
			Static31.method503(this.aClass157_2, this.anInt1099, this.anInt1087, false, this.anInt1092);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
	public void method1001(@OriginalArg(0) int arg0) {
		if (this.aBoolean59) {
			return;
		}
		this.anInt1082 += arg0;
		while (this.aClass157_2.anIntArray395[this.anInt1099] < this.anInt1082) {
			this.anInt1082 -= this.aClass157_2.anIntArray395[this.anInt1099];
			this.anInt1099++;
			if (this.aClass157_2.anIntArray396.length <= this.anInt1099) {
				this.aBoolean59 = true;
				break;
			}
		}
		if (!this.aBoolean59) {
			Static31.method503(this.aClass157_2, this.anInt1099, this.anInt1087, false, this.anInt1092);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()I")
	@Override
	public int method4676() {
		return this.anInt1103;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean60) {
			@Pc(10) Class15_Sub2 local10 = this.method1004();
			if (local10 == null) {
				return;
			}
			this.method1007(local10);
		}
		if (this.aClass87_Sub2_2 != null) {
			this.aClass87_Sub2_2.method2719(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lclient!bf;")
	private Class15_Sub2 method1004() {
		@Pc(13) Class114 local13 = Static55.method978(this.anInt1100);
		@Pc(23) Class15_Sub2 local23;
		if (this.aBoolean59) {
			local23 = local13.method2985(0, -1, -1);
		} else {
			local23 = local13.method2985(this.anInt1082, this.anInt1081, this.anInt1099);
		}
		return local23 == null ? null : local23;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIJILclient!lg;)V")
	@Override
	public void method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class87_Sub2 arg10) {
		@Pc(7) Class15_Sub2 local7 = this.method1004();
		if (local7 != null) {
			this.method1007(local7);
			local7.method4678(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass87_Sub2_2);
			this.anInt1103 = local7.method4676();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!bf;)V")
	private void method1007(@OriginalArg(1) Class15_Sub2 arg0) {
		if (Static156.aBoolean211) {
			@Pc(50) Class15_Sub2_Sub1 local50 = (Class15_Sub2_Sub1) arg0;
			if ((this.aClass87_Sub2_2 == null || this.aClass87_Sub2_2.aBoolean213) && (local50.aClass180Array1 != null || local50.aClass176Array1 != null)) {
				this.aClass87_Sub2_2 = new Class87_Sub2(Static313.anInt2966, 1, 1);
			}
			if (this.aClass87_Sub2_2 != null) {
				this.aClass87_Sub2_2.method2718(local50.aClass180Array1, local50.aClass176Array1, false, local50.anIntArray53, local50.anIntArray51, local50.anIntArray49);
			}
		} else {
			@Pc(4) Class15_Sub2_Sub2 local4 = (Class15_Sub2_Sub2) arg0;
			if ((this.aClass87_Sub2_2 == null || this.aClass87_Sub2_2.aBoolean213) && (local4.aClass180Array2 != null || local4.aClass176Array2 != null)) {
				this.aClass87_Sub2_2 = new Class87_Sub2(Static313.anInt2966, 1, 1);
			}
			if (this.aClass87_Sub2_2 != null) {
				this.aClass87_Sub2_2.method2718(local4.aClass180Array2, local4.aClass176Array2, false, local4.anIntArray70, local4.anIntArray69, local4.anIntArray71);
			}
		}
		this.aBoolean60 = true;
	}
}
