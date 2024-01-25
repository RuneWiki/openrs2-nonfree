import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class22_Sub2_Sub2 extends Class22_Sub2 {

	@OriginalMember(owner = "client!nr", name = "S", descriptor = "Lclient!ha;")
	private Class36_Sub3 aClass36_Sub3_3;

	@OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
	private int anInt4436 = 0;

	@OriginalMember(owner = "client!nr", name = "Y", descriptor = "Z")
	public boolean aBoolean337 = false;

	@OriginalMember(owner = "client!nr", name = "K", descriptor = "I")
	private final int anInt4438 = -1;

	@OriginalMember(owner = "client!nr", name = "cb", descriptor = "I")
	private int anInt4452 = -32768;

	@OriginalMember(owner = "client!nr", name = "db", descriptor = "I")
	private int anInt4453 = 0;

	@OriginalMember(owner = "client!nr", name = "T", descriptor = "I")
	public final int anInt4445;

	@OriginalMember(owner = "client!nr", name = "L", descriptor = "I")
	private final int anInt4439;

	@OriginalMember(owner = "client!nr", name = "O", descriptor = "Lclient!qi;")
	private Class170 aClass170_1;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class22_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt4445 = arg2 + arg1;
		this.anInt4439 = arg0;
		@Pc(41) int local41 = Static10.method162(this.anInt4439).anInt6076;
		if (local41 == -1) {
			this.aBoolean337 = true;
		} else {
			this.aBoolean337 = false;
			this.aClass170_1 = Static261.method4379(local41);
		}
		if (arg2 == this.anInt4445) {
			Static219.method3870(this.aClass170_1, super.anInt5967, false, this.anInt4453, super.anInt5973);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)V")
	public void method3927(@OriginalArg(0) int arg0) {
		if (this.aBoolean337) {
			return;
		}
		this.anInt4436 += arg0;
		while (this.anInt4436 > this.aClass170_1.anIntArray650[this.anInt4453]) {
			this.anInt4436 -= this.aClass170_1.anIntArray650[this.anInt4453];
			this.anInt4453++;
			if (this.anInt4453 >= this.aClass170_1.anIntArray652.length) {
				this.aBoolean337 = true;
				break;
			}
		}
		if (!this.aBoolean337) {
			Static219.method3870(this.aClass170_1, super.anInt5967, false, this.anInt4453, super.anInt5973);
		}
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)V")
	@Override
	public void method5338() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!pe;B)Lclient!sj;")
	private Class31 method3932(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1) {
		@Pc(8) Class197 local8 = Static10.method162(this.anInt4439);
		return this.aBoolean337 ? local8.method5136(-1, -1, arg1, 0, arg0) : local8.method5136(this.anInt4453, this.anInt4438, arg1, this.anInt4436, arg0);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLclient!sj;Lclient!pe;)V")
	private void method3933(@OriginalArg(1) Class31 arg0, @OriginalArg(2) Class89 arg1) {
		@Pc(14) Class57[] local14 = arg0.method1942();
		@Pc(17) Class6[] local17 = arg0.method1952();
		if ((this.aClass36_Sub3_3 == null || this.aClass36_Sub3_3.aBoolean178) && (local14 != null || local17 != null)) {
			this.aClass36_Sub3_3 = new Class36_Sub3(Static212.anInt4234);
		}
		if (this.aClass36_Sub3_3 != null) {
			this.aClass36_Sub3_3.method2169(arg1, (long) Static212.anInt4234, local14, local17);
			this.aClass36_Sub3_3.method2180(super.aByte69, super.aShort83, super.aShort82, super.aShort81, super.aShort84);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
		@Pc(9) Class31 local9 = this.method3932(0, arg0);
		if (local9 != null) {
			this.method3933(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZILclient!hh;Lclient!pe;III)V")
	@Override
	public void method5340(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass36_Sub3_3 != null) {
			this.aClass36_Sub3_3.method2173();
		}
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5343() {
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "(I)I")
	@Override
	public int method5057() {
		return this.anInt4452;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
	public void method3936() {
		if (this.aClass36_Sub3_3 != null) {
			this.aClass36_Sub3_3.method2173();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		@Pc(14) Class31 local14 = this.method3932(1024, arg0);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class70 local21 = arg0.method5427();
		local21.method3707(super.anInt5973, super.anInt5968, super.anInt5967);
		if (this.aClass36_Sub3_3 == null) {
			local14.method1928(local21, null, 0);
		} else {
			@Pc(43) Class24 local43 = this.aClass36_Sub3_3.method2176();
			arg0.method5390(local14, local43, local21, null);
		}
		this.anInt4452 = local14.method1920();
		this.method3933(local14, arg0);
		return null;
	}
}
