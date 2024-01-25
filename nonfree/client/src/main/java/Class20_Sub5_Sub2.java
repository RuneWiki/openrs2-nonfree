import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class20_Sub5_Sub2 extends Class20_Sub5 implements Interface7 {

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "Lclient!so;")
	private Class271 aClass271_5;

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "Lclient!lo;")
	public final Class178 aClass178_2;

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "Z")
	private final boolean aBoolean519;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!qa;Lclient!cn;IIIIIZII)V")
	public Class20_Sub5_Sub2(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt1648, arg1.aBoolean141, arg1.aBoolean131);
		this.aClass178_2 = new Class178(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean519 = arg1.anInt1632 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		return this.aClass271_5;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
		@Pc(24) Class97 local24 = this.aClass178_2.method4877(true, true, 262144, super.anInt7851, arg0, super.anInt7848);
		if (local24 != null) {
			@Pc(31) int local31 = super.anInt7848 >> 7;
			@Pc(36) int local36 = super.anInt7851 >> 7;
			this.aClass178_2.method4883(local31, local24, arg0, local36, false, local36, local31);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class97 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		return this.aClass178_2.method4877(false, false, arg0, 0, arg1, 0);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
	@Override
	public void method8050() {
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(22) Class97 local22 = this.aClass178_2.method4877(false, false, 131072, super.anInt7851, arg0, super.anInt7848);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class128 local29 = arg0.method7165();
			local29.oa(super.anInt7848, super.anInt7850, super.anInt7851);
			return local22.method6785(arg1, arg2, local29, false);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)I")
	@Override
	public int method8046() {
		return this.aClass178_2.anInt5317;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method8043(@OriginalArg(1) Class4 arg0) {
		this.aClass178_2.method4886(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZLclient!oe;ILclient!qa;III)V")
	@Override
	public void method8034(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8038() {
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		@Pc(20) Class97 local20 = this.aClass178_2.method4877(false, true, 2048, super.anInt7851, arg0, super.anInt7848);
		if (local20 == null) {
			return null;
		}
		@Pc(27) Class128 local27 = arg0.method7165();
		local27.oa(super.anInt7848, super.anInt7850, super.anInt7851);
		@Pc(37) Class46_Sub6 local37 = null;
		if (this.aBoolean519) {
			local37 = Static490.method7528(1);
		}
		if (this.aClass178_2.aClass46_Sub7_3 == null) {
			local20.method6773(local27, local37 == null ? null : local37.aClass46_Sub1Array1[0], 0);
		} else {
			@Pc(67) Class158 local67 = this.aClass178_2.aClass46_Sub7_3.method7408();
			arg0.method7211(local20, local67, local27, local37 == null ? null : local37.aClass46_Sub1Array1[0]);
		}
		if (this.aClass271_5 == null) {
			this.aClass271_5 = Static161.method2903(super.anInt7850, super.anInt7848, local20, super.anInt7851);
		} else {
			Static120.method7556(super.anInt7850, this.aClass271_5, super.anInt7851, local20, super.anInt7848);
		}
		@Pc(113) int local113 = super.anInt7848 >> 7;
		@Pc(124) int local124 = super.anInt7851 >> 7;
		this.aClass178_2.method4883(local113, local20, arg0, local124, true, local124, local113);
		return local37;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
	@Override
	public int method8044() {
		return this.aClass178_2.anInt5297;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return this.aClass178_2.method4884();
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
	@Override
	public void method8036() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method8045(@OriginalArg(0) Class4 arg0) {
		this.aClass178_2.method4878(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)I")
	@Override
	public int method8047() {
		return this.aClass178_2.anInt5310;
	}
}
