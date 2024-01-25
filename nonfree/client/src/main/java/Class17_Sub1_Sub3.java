import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class17_Sub1_Sub3 extends Class17_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!pr", name = "K", descriptor = "Lclient!lc;")
	public final Class120 aClass120_4;

	@OriginalMember(owner = "client!pr", name = "N", descriptor = "Z")
	private final boolean aBoolean484;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!uo;Lclient!nd;IIIIIIIZIIIII)V")
	public Class17_Sub1_Sub3(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt4283 == 1, Static203.method3840(arg2, arg3));
		this.aClass120_4 = new Class120(arg0, arg1, arg2, arg3, super.aByte51, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean484 = arg1.anInt4294 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)I")
	@Override
	public int method4799() {
		return this.aClass120_4.anInt3610;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4800(@OriginalArg(0) Class32 arg0) {
		this.aClass120_4.method3370(arg0);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4795() {
		return this.aClass120_4.method3375();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4796(@OriginalArg(0) Class32 arg0) {
		this.aClass120_4.method3367(arg0);
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(B)I")
	@Override
	public int method4490() {
		return this.aClass120_4.method3365();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)I")
	@Override
	public int method4794() {
		return this.aClass120_4.anInt3632;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	@Override
	public void method4801() {
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!uo;II)Lclient!ge;")
	@Override
	public Class73 method4798(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1) {
		return this.aClass120_4.method3366(arg1, arg0, 0, 0, false, false);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) Class73 local23 = this.aClass120_4.method3366(65536, arg0, super.anInt5108, super.anInt5109, false, false);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class109 local30 = arg0.method2194();
			local30.method3873(super.anInt5109, super.anInt5112, super.anInt5108);
			return local23.method3326(arg1, arg2, local30, false);
		}
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		@Pc(16) Class73 local16 = this.aClass120_4.method3366(1024, arg0, super.anInt5108, super.anInt5109, true, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class109 local23 = arg0.method2194();
		local23.method3873(super.anInt5109, super.anInt5112, super.anInt5108);
		@Pc(41) Class8_Sub5 local41 = null;
		if (this.aBoolean484) {
			local41 = Static239.method4367(1);
		}
		if (this.aClass120_4.aClass8_Sub6_4 == null) {
			local16.method3322(local23, local41 == null ? null : local41.aClass8_Sub3Array1[0], 0);
		} else {
			@Pc(57) Class191 local57 = this.aClass120_4.aClass8_Sub6_4.method3279();
			arg0.method2181(local16, local57, local23, local41 == null ? null : local41.aClass8_Sub3Array1[0]);
		}
		this.aClass120_4.method3374(arg0, local16, super.aShort77, super.aShort74, true, super.aShort76, super.aShort75);
		return local41;
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4778() {
		return false;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
		@Pc(21) Class73 local21 = this.aClass120_4.method3366(131072, arg0, super.anInt5108, super.anInt5109, true, true);
		if (local21 != null) {
			this.aClass120_4.method3374(arg0, local21, super.aShort77, super.aShort74, false, super.aShort76, super.aShort75);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)I")
	@Override
	public int method4797() {
		return this.aClass120_4.anInt3613;
	}

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "(I)V")
	@Override
	public void method4789() {
		throw new IllegalStateException();
	}
}
