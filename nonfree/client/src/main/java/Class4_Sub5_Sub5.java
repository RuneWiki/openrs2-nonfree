import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class4_Sub5_Sub5 extends Class4_Sub5 implements Interface5 {

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "Lclient!mj;")
	public final Class133 aClass133_4;

	@OriginalMember(owner = "client!wa", name = "I", descriptor = "Z")
	private final boolean aBoolean576;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lclient!ea;Lclient!p;IIIIIIIZIIIII)V")
	public Class4_Sub5_Sub5(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt4761 == 1, Static11.method189(arg3, arg2));
		this.aClass133_4 = new Class133(arg0, arg1, arg2, arg3, super.aByte75, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean576 = arg1.anInt4756 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5909() {
		return this.aClass133_4.method3490();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!ea;)V")
	@Override
	public void method5912(@OriginalArg(1) Class55 arg0) {
		this.aClass133_4.method3484(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLclient!ea;)V")
	@Override
	public void method5911(@OriginalArg(1) Class55 arg0) {
		this.aClass133_4.method3494(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ea;BI)Lclient!ts;")
	@Override
	public Class112 method5906(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		return this.aClass133_4.method3491(0, arg0, false, 0, arg1, false);
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.aClass133_4.method3485();
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		@Pc(16) Class112 local16 = this.aClass133_4.method3491(super.anInt6631, arg0, false, super.anInt6632, 1024, true);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class66 local23 = arg0.method5195();
		local23.method5822(super.anInt6631, super.anInt6633, super.anInt6632);
		@Pc(37) Class32_Sub4 local37 = null;
		if (this.aBoolean576) {
			local37 = Static232.method4183(1);
		}
		if (this.aClass133_4.aClass32_Sub7_4 == null) {
			local16.method4338(local23, local37 == null ? null : local37.aClass32_Sub8Array1[0], 0);
		} else {
			@Pc(67) Class146 local67 = this.aClass133_4.aClass32_Sub7_4.method4955();
			arg0.method5241(local16, local67, local23, local37 == null ? null : local37.aClass32_Sub8Array1[0]);
		}
		this.aClass133_4.method3493(arg0, true, super.aShort90, super.aShort93, super.aShort92, super.aShort91, local16);
		return local37;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)I")
	@Override
	public int method5910() {
		return this.aClass133_4.anInt3933;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	@Override
	public void method5896() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
		@Pc(20) Class112 local20 = this.aClass133_4.method3491(super.anInt6631, arg0, true, super.anInt6632, 131072, true);
		if (local20 != null) {
			this.aClass133_4.method3493(arg0, false, super.aShort90, super.aShort93, super.aShort92, super.aShort91, local20);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	@Override
	public void method5907() {
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)I")
	@Override
	public int method5913() {
		return this.aClass133_4.anInt3926;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class112 local16 = this.aClass133_4.method3491(super.anInt6631, arg1, false, super.anInt6632, 65536, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class66 local23 = arg1.method5195();
			local23.method5822(super.anInt6631, super.anInt6633, super.anInt6632);
			return local16.method4340(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5895() {
		return false;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)I")
	@Override
	public int method5908() {
		return this.aClass133_4.anInt3925;
	}
}
