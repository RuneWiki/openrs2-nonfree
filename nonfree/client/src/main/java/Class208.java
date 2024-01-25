import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class208 {

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "[Lclient!sl;")
	private Class222_Sub1[] aClass222_Sub1Array2;

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "Lclient!dh;")
	private Class1_Sub11 aClass1_Sub11_6;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "Lclient!kf;")
	private final Class134 aClass134_2;

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "Lclient!bd;")
	private final Class19 aClass19_2;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "Lclient!tf;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!bd;Lclient!kf;)V")
	public Class208(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class134 arg1) {
		this.aClass134_2 = arg1;
		this.aClass19_2 = arg0;
		if (!this.aClass19_2.method401()) {
			this.aClass1_Sub3_Sub2_Sub2_2 = this.aClass19_2.method409((byte) 0, true, 255, 255);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!oc;BZILclient!oc;)Lclient!sl;")
	private Class222_Sub1 method4294(@OriginalArg(0) Class178 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class178 arg2) {
		if (this.aClass1_Sub11_6 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub11_6.anInt5766 = arg1 * 8 + 5;
		if (this.aClass1_Sub11_6.anInt5766 >= this.aClass1_Sub11_6.aByteArray64.length) {
			throw new RuntimeException();
		} else if (this.aClass222_Sub1Array2[arg1] == null) {
			@Pc(47) int local47 = this.aClass1_Sub11_6.method4487();
			@Pc(52) int local52 = this.aClass1_Sub11_6.method4487();
			@Pc(66) Class222_Sub1 local66 = new Class222_Sub1(arg1, arg2, arg0, this.aClass19_2, this.aClass134_2, local47, local52, true);
			this.aClass222_Sub1Array2[arg1] = local66;
			return local66;
		} else {
			return this.aClass222_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	public void method4296() {
		if (this.aClass222_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass222_Sub1Array2.length; local11++) {
			if (this.aClass222_Sub1Array2[local11] != null) {
				this.aClass222_Sub1Array2[local11].method4787();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass222_Sub1Array2.length; local36++) {
			if (this.aClass222_Sub1Array2[local36] != null) {
				this.aClass222_Sub1Array2[local36].method4793();
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)Z")
	public boolean method4297() {
		if (this.aClass1_Sub11_6 != null) {
			return true;
		}
		if (this.aClass1_Sub3_Sub2_Sub2_2 == null) {
			if (this.aClass19_2.method401()) {
				return false;
			}
			this.aClass1_Sub3_Sub2_Sub2_2 = this.aClass19_2.method409((byte) 0, true, 255, 255);
		}
		if (this.aClass1_Sub3_Sub2_Sub2_2.aBoolean524) {
			return false;
		} else {
			this.aClass1_Sub11_6 = new Class1_Sub11(this.aClass1_Sub3_Sub2_Sub2_2.method4906());
			this.aClass222_Sub1Array2 = new Class222_Sub1[(this.aClass1_Sub11_6.aByteArray64.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILclient!oc;Lclient!oc;)Lclient!sl;")
	public Class222_Sub1 method4300(@OriginalArg(0) int arg0, @OriginalArg(2) Class178 arg1, @OriginalArg(3) Class178 arg2) {
		return this.method4294(arg1, arg0, arg2);
	}
}
