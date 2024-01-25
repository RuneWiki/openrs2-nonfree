import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class17_Sub4_Sub1 extends Class17_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!j", name = "J", descriptor = "Lclient!lc;")
	public final Class120 aClass120_2;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "Z")
	private final boolean aBoolean286;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!uo;Lclient!nd;IIIIIIIZI)V")
	public Class17_Sub4_Sub1(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static274.method4808(arg3, arg2));
		this.aClass120_2 = new Class120(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt4674, super.anInt4675, arg9, arg10);
		this.aBoolean286 = arg1.anInt4294 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4795() {
		return this.aClass120_2.method3375();
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4778() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		@Pc(16) Class73 local16 = this.aClass120_2.method3366(1024, arg0, super.anInt4675, super.anInt4674, true, false);
		if (local16 == null) {
			return null;
		}
		@Pc(31) Class109 local31 = arg0.method2194();
		local31.method3873(super.anInt4674, super.anInt4679, super.anInt4675);
		@Pc(41) Class8_Sub5 local41 = null;
		if (this.aBoolean286) {
			local41 = Static239.method4367(1);
		}
		if (this.aClass120_2.aClass8_Sub6_4 == null) {
			local16.method3322(local31, local41 == null ? null : local41.aClass8_Sub3Array1[0], 0);
		} else {
			@Pc(57) Class191 local57 = this.aClass120_2.aClass8_Sub6_4.method3279();
			arg0.method2181(local16, local57, local31, local41 == null ? null : local41.aClass8_Sub3Array1[0]);
		}
		this.aClass120_2.method3374(arg0, local16, super.anInt4675 >> 7, super.anInt4674 >> 7, true, super.anInt4675 >> 7, super.anInt4674 >> 7);
		return local41;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4796(@OriginalArg(0) Class32 arg0) {
		this.aClass120_2.method3367(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)I")
	@Override
	public int method4794() {
		return this.aClass120_2.anInt3632;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Lclient!uo;B)V")
	@Override
	public void method4800(@OriginalArg(0) Class32 arg0) {
		this.aClass120_2.method3370(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class73 local20 = this.aClass120_2.method3366(65536, arg0, super.anInt4675, super.anInt4674, false, false);
		if (local20 == null) {
			return false;
		} else {
			@Pc(32) Class109 local32 = arg0.method2194();
			local32.method3873(super.anInt4674, super.anInt4679, super.anInt4675);
			return local20.method3326(arg1, arg2, local32, false);
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(B)I")
	@Override
	public int method4797() {
		return this.aClass120_2.anInt3613;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)I")
	@Override
	public int method4799() {
		return this.aClass120_2.anInt3610;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
		@Pc(21) Class73 local21 = this.aClass120_2.method3366(131072, arg0, super.anInt4675, super.anInt4674, true, true);
		if (local21 != null) {
			this.aClass120_2.method3374(arg0, local21, super.anInt4675 >> 7, super.anInt4674 >> 7, false, super.anInt4675 >> 7, super.anInt4674 >> 7);
		}
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	@Override
	public void method4801() {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
	@Override
	public void method4789() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!uo;II)Lclient!ge;")
	@Override
	public Class73 method4798(@OriginalArg(0) Class32 arg0, @OriginalArg(2) int arg1) {
		return this.aClass120_2.method3366(arg1, arg0, 0, 0, false, false);
	}
}
