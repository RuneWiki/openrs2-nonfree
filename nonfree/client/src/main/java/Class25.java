import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class25 {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[Lclient!hs;")
	private Class7_Sub1[] aClass7_Sub1Array4;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Lclient!lf;")
	private Class4_Sub11 aClass4_Sub11_4;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!as;")
	private final Class13 aClass13_1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!ef;")
	private final Class53 aClass53_1;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!bo;")
	private Class4_Sub4_Sub2_Sub1 aClass4_Sub4_Sub2_Sub1_2;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!as;Lclient!ef;)V")
	public Class25(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class53 arg1) {
		this.aClass13_1 = arg0;
		this.aClass53_1 = arg1;
		if (!this.aClass13_1.method288()) {
			this.aClass4_Sub4_Sub2_Sub1_2 = this.aClass13_1.method294(255, true, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!we;Lclient!we;B)Lclient!hs;")
	public Class7_Sub1 method715(@OriginalArg(0) int arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) Class214 arg2) {
		return this.method722(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
	public void method721() {
		if (this.aClass7_Sub1Array4 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass7_Sub1Array4.length; local11++) {
			if (this.aClass7_Sub1Array4[local11] != null) {
				this.aClass7_Sub1Array4[local11].method2592();
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass7_Sub1Array4.length; local44++) {
			if (this.aClass7_Sub1Array4[local44] != null) {
				this.aClass7_Sub1Array4[local44].method2588();
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!we;IIZLclient!we;)Lclient!hs;")
	private Class7_Sub1 method722(@OriginalArg(0) Class214 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class214 arg2) {
		if (this.aClass4_Sub11_4 == null) {
			throw new RuntimeException();
		}
		this.aClass4_Sub11_4.anInt3768 = arg1 * 8 + 5;
		if (this.aClass4_Sub11_4.aByteArray55.length <= this.aClass4_Sub11_4.anInt3768) {
			throw new RuntimeException();
		} else if (this.aClass7_Sub1Array4[arg1] == null) {
			@Pc(45) int local45 = this.aClass4_Sub11_4.method3418();
			@Pc(50) int local50 = this.aClass4_Sub11_4.method3418();
			@Pc(71) Class7_Sub1 local71 = new Class7_Sub1(arg1, arg0, arg2, this.aClass13_1, this.aClass53_1, local45, local50, true);
			this.aClass7_Sub1Array4[arg1] = local71;
			return local71;
		} else {
			return this.aClass7_Sub1Array4[arg1];
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Z")
	public boolean method723() {
		if (this.aClass4_Sub11_4 != null) {
			return true;
		}
		if (this.aClass4_Sub4_Sub2_Sub1_2 == null) {
			if (this.aClass13_1.method288()) {
				return false;
			}
			this.aClass4_Sub4_Sub2_Sub1_2 = this.aClass13_1.method294(255, true, 255, (byte) 0);
		}
		if (this.aClass4_Sub4_Sub2_Sub1_2.aBoolean197) {
			return false;
		} else {
			this.aClass4_Sub11_4 = new Class4_Sub11(this.aClass4_Sub4_Sub2_Sub1_2.method2408());
			this.aClass7_Sub1Array4 = new Class7_Sub1[(this.aClass4_Sub11_4.aByteArray55.length - 5) / 8];
			return true;
		}
	}
}
