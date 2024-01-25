import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class17_Sub3_Sub1 extends Class17_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!hs", name = "F", descriptor = "Lclient!lc;")
	public final Class120 aClass120_1;

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "Z")
	private final boolean aBoolean263;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!uo;Lclient!nd;IIIIIIIZIIII)V")
	public Class17_Sub3_Sub1(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static351.method5604(arg2, arg3));
		this.aClass120_1 = new Class120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean263 = arg1.anInt4294 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)I")
	@Override
	public int method4794() {
		return this.aClass120_1.anInt3632;
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
	@Override
	public void method4801() {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4795() {
		return this.aClass120_1.method3375();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
		@Pc(21) Class73 local21 = this.aClass120_1.method3366(131072, arg0, super.anInt5588, super.anInt5586, true, false);
		if (local21 != null) {
			this.aClass120_1.method3374(arg0, local21, super.anInt5588 >> 7, super.anInt5586 >> 7, false, super.anInt5588 >> 7, super.anInt5586 >> 7);
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)I")
	@Override
	public int method4797() {
		return this.aClass120_1.anInt3613;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!uo;II)Lclient!ge;")
	@Override
	public Class73 method4798(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1) {
		return this.aClass120_1.method3366(arg1, arg0, 0, 0, false, false);
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		@Pc(16) Class73 local16 = this.aClass120_1.method3366(1024, arg0, super.anInt5588, super.anInt5586, true, false);
		if (local16 == null) {
			return null;
		}
		@Pc(31) Class109 local31 = arg0.method2194();
		local31.method3873(super.anInt5586 + super.anInt5587, super.anInt5583, super.anInt5581 + super.anInt5588);
		@Pc(48) Class8_Sub5 local48 = null;
		if (this.aBoolean263) {
			local48 = Static239.method4367(1);
		}
		if (this.aClass120_1.aClass8_Sub6_4 == null) {
			local16.method3322(local31, local48 == null ? null : local48.aClass8_Sub3Array1[0], 0);
		} else {
			@Pc(64) Class191 local64 = this.aClass120_1.aClass8_Sub6_4.method3279();
			arg0.method2181(local16, local64, local31, local48 == null ? null : local48.aClass8_Sub3Array1[0]);
		}
		this.aClass120_1.method3374(arg0, local16, super.anInt5588 >> 7, super.anInt5586 >> 7, true, super.anInt5588 >> 7, super.anInt5586 >> 7);
		return local48;
	}

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "(I)I")
	@Override
	public int method4792() {
		return this.aClass120_1.method3365();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4796(@OriginalArg(0) Class32 arg0) {
		this.aClass120_1.method3367(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class73 local20 = this.aClass120_1.method3366(65536, arg0, super.anInt5588, super.anInt5586, false, false);
		if (local20 == null) {
			return false;
		} else {
			@Pc(27) Class109 local27 = arg0.method2194();
			local27.method3873(super.anInt5587 + super.anInt5586, super.anInt5583, super.anInt5581 + super.anInt5588);
			return local20.method3326(arg1, arg2, local27, false);
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4800(@OriginalArg(0) Class32 arg0) {
		this.aClass120_1.method3370(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)I")
	@Override
	public int method4799() {
		return this.aClass120_1.anInt3610;
	}
}
