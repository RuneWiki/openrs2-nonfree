import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 implements Interface12 {

	@OriginalMember(owner = "client!or", name = "E", descriptor = "Lclient!uc;")
	public final Class233 aClass233_3;

	@OriginalMember(owner = "client!or", name = "A", descriptor = "Z")
	private final boolean aBoolean394;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!qa;Lclient!jt;IIIIIZIIIIII)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static347.method4980(arg11, arg12));
		this.aClass233_3 = new Class233(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean394 = arg1.anInt4009 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5852() {
		return this.aClass233_3.method5383();
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)I")
	@Override
	public int method5848() {
		return this.aClass233_3.anInt6926;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5853(@OriginalArg(0) Class75 arg0) {
		this.aClass233_3.method5371(arg0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(16) Class31 local16 = this.aClass233_3.method5373(false, super.anInt5370, super.anInt5368, 131072, false, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class106 local23 = arg2.method2587();
			local23.R(super.anInt5372 + super.anInt5368, super.anInt5363, super.anInt5367 + super.anInt5370);
			return local16.method5702(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)I")
	@Override
	public int method5851() {
		return this.aClass233_3.anInt6918;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		@Pc(16) Class31 local16 = this.aClass233_3.method5373(false, super.anInt5370, super.anInt5368, 2048, true, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class106 local23 = arg0.method2587();
		local23.R(super.anInt5368 + super.anInt5372, super.anInt5363, super.anInt5367 + super.anInt5370);
		@Pc(40) Class13_Sub7 local40 = null;
		if (this.aBoolean394) {
			local40 = Static120.method2160(1);
		}
		if (this.aClass233_3.aClass13_Sub8_7 == null) {
			local16.method5704(local23, local40 == null ? null : local40.aClass13_Sub1Array1[0], 0);
		} else {
			@Pc(78) Class116 local78 = this.aClass233_3.aClass13_Sub8_7.method5943();
			arg0.method2571(local16, local78, local23, local40 == null ? null : local40.aClass13_Sub1Array1[0]);
		}
		@Pc(97) int local97 = super.anInt5368 >> 7;
		@Pc(102) int local102 = super.anInt5370 >> 7;
		this.aClass233_3.method5372(local97, arg0, local102, local16, local97, true, local102);
		return local40;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
		@Pc(21) Class31 local21 = this.aClass233_3.method5373(false, super.anInt5370, super.anInt5368, 262144, true, arg0);
		if (local21 != null) {
			@Pc(28) int local28 = super.anInt5368 >> 7;
			@Pc(33) int local33 = super.anInt5370 >> 7;
			this.aClass233_3.method5372(local28, arg0, local33, local21, local28, false, local33);
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(B)I")
	@Override
	public int method4302() {
		return this.aClass233_3.method5380();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class31 method5850(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		return this.aClass233_3.method5373(false, 0, 0, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	@Override
	public void method5849() {
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)I")
	@Override
	public int method5847() {
		return this.aClass233_3.anInt6906;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5854(@OriginalArg(0) Class75 arg0) {
		this.aClass233_3.method5375(arg0);
	}
}
