import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class49_Sub2_Sub6 extends Class49_Sub2 implements Interface18 {

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "Lclient!ud;")
	private Class291 aClass291_6;

	@OriginalMember(owner = "client!qq", name = "M", descriptor = "Lclient!ej;")
	public final Class80 aClass80_3;

	@OriginalMember(owner = "client!qq", name = "T", descriptor = "Z")
	private final boolean aBoolean516;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!qa;Lclient!bu;IIIIIZIIIIIII)V")
	public Class49_Sub2_Sub6(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt991 == 1, Static120.method2022(arg13, arg12));
		this.aClass80_3 = new Class80(arg0, arg1, arg12, arg13, super.aByte98, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean516 = arg1.anInt992 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return false;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
	@Override
	public int method7467() {
		return this.aClass80_3.anInt2245;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7471() {
		return this.aClass80_3.method1899();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class122 arg0) {
		this.aClass80_3.method1898(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	@Override
	public Class145 method7468(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		return this.aClass80_3.method1894(0, false, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)I")
	@Override
	public int method7469() {
		return this.aClass80_3.anInt2255;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		@Pc(18) Class145 local18 = this.aClass80_3.method1894(super.anInt7141, true, false, super.anInt7137, 2048, arg0);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class118 local25 = arg0.method7256();
		local25.oa(super.anInt7137, super.anInt7140, super.anInt7141);
		@Pc(35) Class72_Sub7 local35 = null;
		if (this.aBoolean516) {
			local35 = Static186.method2914(1);
		}
		if (this.aClass80_3.aClass72_Sub4_4 == null) {
			local18.method6686(local25, local35 == null ? null : local35.aClass72_Sub2Array1[0], 0);
		} else {
			@Pc(65) Class175 local65 = this.aClass80_3.aClass72_Sub4_4.method4537();
			arg0.method7246(local18, local65, local25, local35 == null ? null : local35.aClass72_Sub2Array1[0]);
		}
		if (this.aClass291_6 == null) {
			this.aClass291_6 = Static158.method2472(local18, super.anInt7141, super.anInt7140, super.anInt7137);
		} else {
			Static391.method5898(this.aClass291_6, super.anInt7137, local18, super.anInt7140, super.anInt7141);
		}
		this.aClass80_3.method1901(local18, super.aShort118, true, super.aShort115, super.aShort116, super.aShort117, arg0);
		return local35;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I")
	@Override
	public int method7465() {
		return this.aClass80_3.anInt2233;
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)I")
	@Override
	public int method5994() {
		return this.aClass80_3.method1891();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7466(@OriginalArg(1) Class122 arg0) {
		this.aClass80_3.method1890(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
		@Pc(20) Class145 local20 = this.aClass80_3.method1894(super.anInt7141, true, true, super.anInt7137, 262144, arg0);
		if (local20 != null) {
			this.aClass80_3.method1901(local20, super.aShort118, false, super.aShort115, super.aShort116, super.aShort117, arg0);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(23) Class145 local23 = this.aClass80_3.method1894(super.anInt7141, false, false, super.anInt7137, 131072, arg2);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class118 local30 = arg2.method7256();
			local30.oa(super.anInt7137, super.anInt7140, super.anInt7141);
			return local23.method6683(arg0, arg1, local30, false);
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		return this.aClass291_6;
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
	@Override
	public void method7472() {
	}
}
