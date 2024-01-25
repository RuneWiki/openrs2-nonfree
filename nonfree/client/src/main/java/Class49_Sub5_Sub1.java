import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class49_Sub5_Sub1 extends Class49_Sub5 implements Interface18 {

	@OriginalMember(owner = "client!pw", name = "A", descriptor = "Lclient!ud;")
	private Class291 aClass291_5;

	@OriginalMember(owner = "client!pw", name = "I", descriptor = "Lclient!ej;")
	public final Class80 aClass80_2;

	@OriginalMember(owner = "client!pw", name = "E", descriptor = "Z")
	private final boolean aBoolean503;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!qa;Lclient!bu;IIIIIZII)V")
	public Class49_Sub5_Sub1(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt951, arg1.aBoolean60, arg1.aBoolean52);
		this.aClass80_2 = new Class80(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean503 = arg1.anInt992 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		@Pc(26) Class145 local26 = this.aClass80_2.method1894(super.anInt7464, true, false, super.anInt7467, 2048, arg0);
		if (local26 == null) {
			return null;
		}
		@Pc(33) Class118 local33 = arg0.method7256();
		local33.oa(super.anInt7467, super.anInt7470, super.anInt7464);
		@Pc(43) Class72_Sub7 local43 = null;
		if (this.aBoolean503) {
			local43 = Static186.method2914(1);
		}
		if (this.aClass80_2.aClass72_Sub4_4 == null) {
			local26.method6686(local33, local43 == null ? null : local43.aClass72_Sub2Array1[0], 0);
		} else {
			@Pc(73) Class175 local73 = this.aClass80_2.aClass72_Sub4_4.method4537();
			arg0.method7246(local26, local73, local33, local43 == null ? null : local43.aClass72_Sub2Array1[0]);
		}
		if (this.aClass291_5 == null) {
			this.aClass291_5 = Static158.method2472(local26, super.anInt7464, super.anInt7470, super.anInt7467);
		} else {
			Static391.method5898(this.aClass291_5, super.anInt7467, local26, super.anInt7470, super.anInt7464);
		}
		@Pc(119) int local119 = super.anInt7467 >> 9;
		@Pc(124) int local124 = super.anInt7464 >> 9;
		this.aClass80_2.method1901(local26, local124, true, local119, local124, local119, arg0);
		return local43;
	}

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "(I)V")
	@Override
	public void method7472() {
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		return this.aClass291_5;
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)I")
	@Override
	public int method7467() {
		return this.aClass80_2.anInt2245;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class122 arg0) {
		this.aClass80_2.method1898(arg0);
	}

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return false;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)I")
	@Override
	public int method7465() {
		return this.aClass80_2.anInt2233;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	@Override
	public Class145 method7468(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		return this.aClass80_2.method1894(0, false, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
		@Pc(16) Class145 local16 = this.aClass80_2.method1894(super.anInt7464, true, true, super.anInt7467, 262144, arg0);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt7467 >> 9;
			@Pc(28) int local28 = super.anInt7464 >> 9;
			this.aClass80_2.method1901(local16, local28, false, local23, local28, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7471() {
		return this.aClass80_2.method1899();
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(16) Class145 local16 = this.aClass80_2.method1894(super.anInt7464, false, false, super.anInt7467, 131072, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(35) Class118 local35 = arg2.method7256();
			local35.oa(super.anInt7467, super.anInt7470, super.anInt7464);
			return local16.method6683(arg0, arg1, local35, false);
		}
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)I")
	@Override
	public int method7469() {
		return this.aClass80_2.anInt2255;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7466(@OriginalArg(1) Class122 arg0) {
		this.aClass80_2.method1890(arg0);
	}
}
