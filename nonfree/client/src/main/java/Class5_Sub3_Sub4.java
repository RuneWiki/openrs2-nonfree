import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class5_Sub3_Sub4 extends Class5_Sub3 {

	@OriginalMember(owner = "client!oh", name = "ab", descriptor = "Lclient!jl;")
	private Class15_Sub5 aClass15_Sub5_5;

	@OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
	private int anInt4422 = -32768;

	@OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
	private int anInt4429 = 0;

	@OriginalMember(owner = "client!oh", name = "I", descriptor = "Z")
	public boolean aBoolean374 = false;

	@OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
	private int anInt4418 = 0;

	@OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
	private final int anInt4437 = -1;

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "I")
	public final int anInt4415;

	@OriginalMember(owner = "client!oh", name = "O", descriptor = "I")
	private final int anInt4421;

	@OriginalMember(owner = "client!oh", name = "H", descriptor = "Lclient!lo;")
	private Class121 aClass121_3;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class5_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt4415 = arg2 + arg1;
		this.anInt4421 = arg0;
		@Pc(41) int local41 = Static183.method3571(this.anInt4421).anInt3913;
		if (local41 == -1) {
			this.aBoolean374 = true;
		} else {
			this.aBoolean374 = false;
			this.aClass121_3 = Static133.method2520(local41);
		}
		if (arg2 == this.anInt4415) {
			Static131.method2490(false, this.aClass121_3, this.anInt4418, super.anInt5047, super.anInt5050);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
		@Pc(9) Class78 local9 = this.method4081(0, arg0);
		if (local9 != null) {
			this.method4083(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(II)V")
	public void method4079(@OriginalArg(1) int arg0) {
		if (this.aBoolean374) {
			return;
		}
		this.anInt4429 += arg0;
		while (this.anInt4429 > this.aClass121_3.anIntArray444[this.anInt4418]) {
			this.anInt4429 -= this.aClass121_3.anIntArray444[this.anInt4418];
			this.anInt4418++;
			if (this.anInt4418 >= this.aClass121_3.anIntArray446.length) {
				this.aBoolean374 = true;
				break;
			}
		}
		if (!this.aBoolean374) {
			Static131.method2490(false, this.aClass121_3, this.anInt4418, super.anInt5047, super.anInt5050);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLclient!aa;)Lclient!hc;")
	private Class78 method4081(@OriginalArg(0) int arg0, @OriginalArg(2) Class2 arg1) {
		@Pc(8) Class125 local8 = Static183.method3571(this.anInt4421);
		return this.aBoolean374 ? local8.method3646(-1, 0, -1, arg1, arg0) : local8.method3646(this.anInt4418, this.anInt4429, this.anInt4437, arg1, arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!hc;Lclient!aa;)V")
	private void method4083(@OriginalArg(1) Class78 arg0, @OriginalArg(2) Class2 arg1) {
		@Pc(6) Class154[] local6 = arg0.method4383();
		@Pc(9) Class85[] local9 = arg0.method4376();
		if ((this.aClass15_Sub5_5 == null || this.aClass15_Sub5_5.aBoolean259) && (local6 != null || local9 != null)) {
			this.aClass15_Sub5_5 = new Class15_Sub5(Static215.anInt4246);
		}
		if (this.aClass15_Sub5_5 != null) {
			this.aClass15_Sub5_5.method2859(arg1, (long) Static215.anInt4246, local6, local9);
			this.aClass15_Sub5_5.method2861(super.aByte53, super.aShort75, super.aShort78, super.aShort77, super.aShort76);
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(Z)I")
	@Override
	public int method4586() {
		return this.anInt4422;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	public void method4085() {
		if (this.aClass15_Sub5_5 != null) {
			this.aClass15_Sub5_5.method2858();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		@Pc(9) Class78 local9 = this.method4081(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class21 local16 = arg0.method3284();
		local16.method2814(super.anInt5050, super.anInt5046, super.anInt5047);
		if (this.aClass15_Sub5_5 == null) {
			local9.method4379(local16, null, 0);
		} else {
			@Pc(31) Class162 local31 = this.aClass15_Sub5_5.method2868();
			arg0.method3236(local9, local31, local16, null);
		}
		this.anInt4422 = local9.method4388();
		this.method4083(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass15_Sub5_5 != null) {
			this.aClass15_Sub5_5.method2858();
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
	@Override
	public void method5678() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	@Override
	public void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5681() {
		return false;
	}
}
