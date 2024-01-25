import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class1_Sub5_Sub2 extends Class1_Sub5 implements Interface12 {

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "Lclient!uc;")
	public final Class233 aClass233_2;

	@OriginalMember(owner = "client!ok", name = "D", descriptor = "Z")
	private final boolean aBoolean388;

	static {
		new Class175("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!qa;Lclient!jt;IIIIIZIII)V")
	public Class1_Sub5_Sub2(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static392.method5294(arg9, arg8));
		this.aClass233_2 = new Class233(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt6405, super.anInt6404, arg7, arg10);
		this.aBoolean388 = arg1.anInt4009 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)I")
	@Override
	public int method5847() {
		return this.aClass233_2.anInt6906;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
	@Override
	public int method5848() {
		return this.aClass233_2.anInt6926;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)I")
	@Override
	public int method5851() {
		return this.aClass233_2.anInt6918;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5853(@OriginalArg(0) Class75 arg0) {
		this.aClass233_2.method5371(arg0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	@Override
	public void method5838() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5852() {
		return this.aClass233_2.method5383();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(16) Class31 local16 = this.aClass233_2.method5373(false, super.anInt6404, super.anInt6405, 131072, false, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class106 local23 = arg2.method2587();
			local23.R(super.anInt6405, super.anInt6406, super.anInt6404);
			return local16.method5702(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
		@Pc(23) Class31 local23 = this.aClass233_2.method5373(true, super.anInt6404, super.anInt6405, 262144, true, arg0);
		if (local23 != null) {
			@Pc(30) int local30 = super.anInt6405 >> 7;
			@Pc(35) int local35 = super.anInt6404 >> 7;
			this.aClass233_2.method5372(local30, arg0, local35, local23, local30, false, local35);
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
	@Override
	public void method5849() {
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class31 method5850(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		return this.aClass233_2.method5373(false, 0, 0, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method5854(@OriginalArg(0) Class75 arg0) {
		this.aClass233_2.method5375(arg0);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		@Pc(16) Class31 local16 = this.aClass233_2.method5373(false, super.anInt6404, super.anInt6405, 2048, true, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class106 local23 = arg0.method2587();
		local23.R(super.anInt6405, super.anInt6406, super.anInt6404);
		@Pc(33) Class13_Sub7 local33 = null;
		if (this.aBoolean388) {
			local33 = Static120.method2160(1);
		}
		if (this.aClass233_2.aClass13_Sub8_7 == null) {
			local16.method5704(local23, local33 == null ? null : local33.aClass13_Sub1Array1[0], 0);
		} else {
			@Pc(63) Class116 local63 = this.aClass233_2.aClass13_Sub8_7.method5943();
			arg0.method2571(local16, local63, local23, local33 == null ? null : local33.aClass13_Sub1Array1[0]);
		}
		@Pc(82) int local82 = super.anInt6405 >> 7;
		@Pc(87) int local87 = super.anInt6404 >> 7;
		this.aClass233_2.method5372(local82, arg0, local87, local16, local82, true, local87);
		return local33;
	}
}
