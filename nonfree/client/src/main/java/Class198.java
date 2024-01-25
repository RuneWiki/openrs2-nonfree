import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class198 {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "Lclient!cu;")
	private Class3_Sub7 aClass3_Sub7_3;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "[Lclient!bk;")
	private Class25_Sub1[] aClass25_Sub1Array1;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "Lclient!d;")
	private final Class46 aClass46_3;

	@OriginalMember(owner = "client!pt", name = "h", descriptor = "Lclient!vf;")
	private final Class257 aClass257_3;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "Lclient!rp;")
	private Class3_Sub4_Sub1_Sub2 aClass3_Sub4_Sub1_Sub2_1;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!vf;Lclient!d;)V")
	public Class198(@OriginalArg(0) Class257 arg0, @OriginalArg(1) Class46 arg1) {
		this.aClass46_3 = arg1;
		this.aClass257_3 = arg0;
		if (!this.aClass257_3.method5397()) {
			this.aClass3_Sub4_Sub1_Sub2_1 = this.aClass257_3.method5398(255, (byte) 0, true, 255);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BILclient!sk;Lclient!sk;)Lclient!bk;")
	public Class25_Sub1 method4349(@OriginalArg(1) int arg0, @OriginalArg(2) Class228 arg1, @OriginalArg(3) Class228 arg2) {
		return this.method4352(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)Z")
	public boolean method4350() {
		if (this.aClass3_Sub7_3 != null) {
			return true;
		}
		if (this.aClass3_Sub4_Sub1_Sub2_1 == null) {
			if (this.aClass257_3.method5397()) {
				return false;
			}
			this.aClass3_Sub4_Sub1_Sub2_1 = this.aClass257_3.method5398(255, (byte) 0, true, 255);
		}
		if (this.aClass3_Sub4_Sub1_Sub2_1.aBoolean527) {
			return false;
		} else {
			this.aClass3_Sub7_3 = new Class3_Sub7(this.aClass3_Sub4_Sub1_Sub2_1.method4715());
			this.aClass25_Sub1Array1 = new Class25_Sub1[(this.aClass3_Sub7_3.aByteArray46.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
	public void method4351() {
		if (this.aClass25_Sub1Array1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.aClass25_Sub1Array1.length; local15++) {
			if (this.aClass25_Sub1Array1[local15] != null) {
				this.aClass25_Sub1Array1[local15].method668();
			}
		}
		for (@Pc(40) int local40 = 0; local40 < this.aClass25_Sub1Array1.length; local40++) {
			if (this.aClass25_Sub1Array1[local40] != null) {
				this.aClass25_Sub1Array1[local40].method670();
			}
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZBLclient!sk;Lclient!sk;)Lclient!bk;")
	private Class25_Sub1 method4352(@OriginalArg(0) int arg0, @OriginalArg(3) Class228 arg1, @OriginalArg(4) Class228 arg2) {
		if (this.aClass3_Sub7_3 == null) {
			throw new RuntimeException();
		}
		this.aClass3_Sub7_3.anInt3235 = arg0 * 8 + 5;
		if (this.aClass3_Sub7_3.anInt3235 >= this.aClass3_Sub7_3.aByteArray46.length) {
			throw new RuntimeException();
		} else if (this.aClass25_Sub1Array1[arg0] == null) {
			@Pc(49) int local49 = this.aClass3_Sub7_3.method2589();
			@Pc(59) int local59 = this.aClass3_Sub7_3.method2589();
			@Pc(73) Class25_Sub1 local73 = new Class25_Sub1(arg0, arg2, arg1, this.aClass257_3, this.aClass46_3, local49, local59, true);
			this.aClass25_Sub1Array1[arg0] = local73;
			return local73;
		} else {
			return this.aClass25_Sub1Array1[arg0];
		}
	}
}
