import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class1_Sub3_Sub6 extends Class1_Sub3 implements Interface12 {

	@OriginalMember(owner = "client!qm", name = "T", descriptor = "Lclient!uc;")
	public final Class233 aClass233_4;

	@OriginalMember(owner = "client!qm", name = "Q", descriptor = "Z")
	private final boolean aBoolean422;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!qa;Lclient!jt;IIIIIZIIIIIII)V")
	public Class1_Sub3_Sub6(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4007 == 1, Static165.method2890(arg13, arg12));
		this.aClass233_4 = new Class233(arg0, arg1, arg12, arg13, super.aByte77, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean422 = arg1.anInt4009 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		@Pc(24) Class31 local24 = this.aClass233_4.method5373(false, super.anInt6055, super.anInt6053, 2048, true, arg0);
		if (local24 == null) {
			return null;
		}
		@Pc(31) Class106 local31 = arg0.method2587();
		local31.R(super.anInt6053, super.anInt6045, super.anInt6055);
		@Pc(41) Class13_Sub7 local41 = null;
		if (this.aBoolean422) {
			local41 = Static120.method2160(1);
		}
		if (this.aClass233_4.aClass13_Sub8_7 == null) {
			local24.method5704(local31, local41 == null ? null : local41.aClass13_Sub1Array1[0], 0);
		} else {
			@Pc(57) Class116 local57 = this.aClass233_4.aClass13_Sub8_7.method5943();
			arg0.method2571(local24, local57, local31, local41 == null ? null : local41.aClass13_Sub1Array1[0]);
		}
		this.aClass233_4.method5372(super.aShort180, arg0, super.aShort178, local24, super.aShort181, true, super.aShort179);
		return local41;
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(16) Class31 local16 = this.aClass233_4.method5373(false, super.anInt6055, super.anInt6053, 131072, false, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class106 local23 = arg2.method2587();
			local23.R(super.anInt6053, super.anInt6045, super.anInt6055);
			return local16.method5702(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
		@Pc(18) Class31 local18 = this.aClass233_4.method5373(true, super.anInt6055, super.anInt6053, 262144, true, arg0);
		if (local18 != null) {
			this.aClass233_4.method5372(super.aShort180, arg0, super.aShort178, local18, super.aShort181, false, super.aShort179);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I")
	@Override
	public int method5847() {
		return this.aClass233_4.anInt6906;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
	@Override
	public int method5848() {
		return this.aClass233_4.anInt6926;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
	@Override
	public void method5838() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	@Override
	public void method5849() {
	}

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "(I)I")
	@Override
	public int method4828() {
		return this.aClass233_4.method5380();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5854(@OriginalArg(0) Class75 arg0) {
		this.aClass233_4.method5375(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)I")
	@Override
	public int method5851() {
		return this.aClass233_4.anInt6918;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5852() {
		return this.aClass233_4.method5383();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5853(@OriginalArg(0) Class75 arg0) {
		this.aClass233_4.method5371(arg0);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class31 method5850(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		return this.aClass233_4.method5373(false, 0, 0, arg0, false, arg1);
	}
}
