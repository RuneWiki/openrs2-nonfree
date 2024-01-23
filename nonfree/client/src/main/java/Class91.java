import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class91 {

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Lclient!wm;")
	private Class2_Sub26 aClass2_Sub26_7;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "[Lclient!rg;")
	private Class63_Sub1[] aClass63_Sub1Array1;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!ig;")
	private Class78 aClass78_1;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!b;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!lb;")
	private Class2_Sub3_Sub14_Sub1 aClass2_Sub3_Sub14_Sub1_2;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!ig;Lclient!b;)V")
	public Class91(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class12 arg1) {
		this.aClass78_1 = arg0;
		this.aClass12_1 = arg1;
		if (!this.aClass78_1.method1957()) {
			this.aClass2_Sub3_Sub14_Sub1_2 = this.aClass78_1.method1952((byte) 0, true, 255, 255);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public void method2257() {
		if (this.aClass63_Sub1Array1 == null) {
			return;
		}
		@Pc(11) int local11;
		for (local11 = 0; local11 < this.aClass63_Sub1Array1.length; local11++) {
			if (this.aClass63_Sub1Array1[local11] != null) {
				this.aClass63_Sub1Array1[local11].method3811();
			}
		}
		for (local11 = 0; local11 < this.aClass63_Sub1Array1.length; local11++) {
			if (this.aClass63_Sub1Array1[local11] != null) {
				this.aClass63_Sub1Array1[local11].method3805();
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Z")
	public boolean method2260() {
		if (this.aClass2_Sub26_7 != null) {
			return true;
		}
		if (this.aClass2_Sub3_Sub14_Sub1_2 == null) {
			if (this.aClass78_1.method1957()) {
				return false;
			}
			this.aClass2_Sub3_Sub14_Sub1_2 = this.aClass78_1.method1952((byte) 0, true, 255, 255);
		}
		if (this.aClass2_Sub3_Sub14_Sub1_2.aBoolean320) {
			return false;
		} else {
			this.aClass2_Sub26_7 = new Class2_Sub26(this.aClass2_Sub3_Sub14_Sub1_2.method3053());
			this.aClass63_Sub1Array1 = new Class63_Sub1[(this.aClass2_Sub26_7.aByteArray72.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLclient!co;ILclient!co;)Lclient!rg;")
	public Class63_Sub1 method2262(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class35 arg2) {
		return this.method2264(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!co;Lclient!co;ZII)Lclient!rg;")
	private Class63_Sub1 method2264(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass2_Sub26_7 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub26_7.anInt5328 = arg2 * 8 + 5;
		if (this.aClass2_Sub26_7.anInt5328 >= this.aClass2_Sub26_7.aByteArray72.length) {
			throw new RuntimeException();
		} else if (this.aClass63_Sub1Array1[arg2] == null) {
			@Pc(56) int local56 = this.aClass2_Sub26_7.method4228();
			@Pc(61) int local61 = this.aClass2_Sub26_7.method4228();
			@Pc(75) Class63_Sub1 local75 = new Class63_Sub1(arg2, arg1, arg0, this.aClass78_1, this.aClass12_1, local56, local61, true);
			this.aClass63_Sub1Array1[arg2] = local75;
			return local75;
		} else {
			return this.aClass63_Sub1Array1[arg2];
		}
	}
}
