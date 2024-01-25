import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!al", name = "J", descriptor = "Lclient!ah;")
	public final Class8 aClass8_1;

	@OriginalMember(owner = "client!al", name = "B", descriptor = "Z")
	private final boolean aBoolean32;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!za;Lclient!ii;IIIIIZIIIIII)V")
	public Class2_Sub2_Sub1(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static213.method2821(arg11, arg12));
		this.aClass8_1 = new Class8(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean32 = arg1.anInt3001 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		@Pc(16) Class57 local16 = this.aClass8_1.method155(super.anInt4386, arg0, true, false, 2048, super.anInt4377);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class29 local23 = arg0.method5866();
		local23.U(super.anInt4386 + super.anInt4391, super.anInt4393, super.anInt4377 + super.anInt4381);
		@Pc(40) Class88_Sub2 local40 = null;
		if (this.aBoolean32) {
			local40 = Static232.method3033(1);
		}
		if (this.aClass8_1.aClass88_Sub6_1 == null) {
			local16.method6060(local23, local40 == null ? null : local40.aClass88_Sub8Array1[0], 0);
		} else {
			@Pc(76) Class255 local76 = this.aClass8_1.aClass88_Sub6_1.method5045();
			arg0.method5869(local16, local76, local23, local40 == null ? null : local40.aClass88_Sub8Array1[0]);
		}
		@Pc(95) int local95 = super.anInt4386 >> 7;
		@Pc(100) int local100 = super.anInt4377 >> 7;
		this.aClass8_1.method156(local100, arg0, true, local16, local95, local95, local100);
		return local40;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	@Override
	public Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		return this.aClass8_1.method155(0, arg0, false, false, arg1, 0);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class57 local16 = this.aClass8_1.method155(super.anInt4386, arg0, false, false, 131072, super.anInt4377);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class29 local23 = arg0.method5866();
			local23.U(super.anInt4386 + super.anInt4391, super.anInt4393, super.anInt4377 + super.anInt4381);
			return local16.method6071(arg1, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return this.aClass8_1.method161();
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(B)I")
	@Override
	public int method3486() {
		return this.aClass8_1.method157();
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
	@Override
	public void method6041() {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method6036(@OriginalArg(1) Class200 arg0) {
		this.aClass8_1.method154(arg0);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)I")
	@Override
	public int method6037() {
		return this.aClass8_1.anInt215;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I")
	@Override
	public int method6034() {
		return this.aClass8_1.anInt196;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)I")
	@Override
	public int method6035() {
		return this.aClass8_1.anInt219;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
		@Pc(23) Class57 local23 = this.aClass8_1.method155(super.anInt4386, arg0, true, false, 262144, super.anInt4377);
		if (local23 != null) {
			@Pc(30) int local30 = super.anInt4386 >> 7;
			@Pc(35) int local35 = super.anInt4377 >> 7;
			this.aClass8_1.method156(local35, arg0, false, local23, local30, local30, local35);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method6040(@OriginalArg(0) Class200 arg0) {
		this.aClass8_1.method152(arg0);
	}
}
