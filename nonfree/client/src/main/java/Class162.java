import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class162 {

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "[Lclient!hs;")
	private Class111_Sub1[] aClass111_Sub1Array1;

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "Lclient!ia;")
	private Class1_Sub3 aClass1_Sub3_5;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "Lclient!dk;")
	private final Class58 aClass58_2;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "Lclient!lq;")
	private final Class159 aClass159_3;

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "Lclient!wk;")
	private Class1_Sub1_Sub6_Sub2 aClass1_Sub1_Sub6_Sub2_2;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!lq;Lclient!dk;)V")
	public Class162(@OriginalArg(0) Class159 arg0, @OriginalArg(1) Class58 arg1) {
		this.aClass58_2 = arg1;
		this.aClass159_3 = arg0;
		if (!this.aClass159_3.method3617()) {
			this.aClass1_Sub1_Sub6_Sub2_2 = this.aClass159_3.method3610(255, true, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	public void method3637() {
		if (this.aClass111_Sub1Array1 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.aClass111_Sub1Array1.length; local17++) {
			if (this.aClass111_Sub1Array1[local17] != null) {
				this.aClass111_Sub1Array1[local17].method2683();
			}
		}
		for (@Pc(38) int local38 = 0; local38 < this.aClass111_Sub1Array1.length; local38++) {
			if (this.aClass111_Sub1Array1[local38] != null) {
				this.aClass111_Sub1Array1[local38].method2678();
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZLclient!pd;ILclient!pd;I)Lclient!hs;")
	private Class111_Sub1 method3638(@OriginalArg(1) Class195 arg0, @OriginalArg(3) Class195 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass1_Sub3_5 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub3_5.anInt1710 = arg2 * 8 + 5;
		if (this.aClass1_Sub3_5.aByteArray14.length <= this.aClass1_Sub3_5.anInt1710) {
			throw new RuntimeException();
		} else if (this.aClass111_Sub1Array1[arg2] == null) {
			@Pc(49) int local49 = this.aClass1_Sub3_5.method1188();
			@Pc(54) int local54 = this.aClass1_Sub3_5.method1188();
			@Pc(68) Class111_Sub1 local68 = new Class111_Sub1(arg2, arg1, arg0, this.aClass159_3, this.aClass58_2, local49, local54, true);
			this.aClass111_Sub1Array1[arg2] = local68;
			return local68;
		} else {
			return this.aClass111_Sub1Array1[arg2];
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)Z")
	public boolean method3639() {
		if (this.aClass1_Sub3_5 != null) {
			return true;
		}
		if (this.aClass1_Sub1_Sub6_Sub2_2 == null) {
			if (this.aClass159_3.method3617()) {
				return false;
			}
			this.aClass1_Sub1_Sub6_Sub2_2 = this.aClass159_3.method3610(255, true, 255, (byte) 0);
		}
		if (this.aClass1_Sub1_Sub6_Sub2_2.aBoolean512) {
			return false;
		} else {
			this.aClass1_Sub3_5 = new Class1_Sub3(this.aClass1_Sub1_Sub6_Sub2_2.method6095());
			this.aClass111_Sub1Array1 = new Class111_Sub1[(this.aClass1_Sub3_5.aByteArray14.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!pd;IZLclient!pd;)Lclient!hs;")
	public Class111_Sub1 method3640(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class195 arg2) {
		return this.method3638(arg0, arg2, arg1);
	}
}
