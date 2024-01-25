import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class115 {

	@OriginalMember(owner = "client!le", name = "n", descriptor = "[Lclient!f;")
	private Class56_Sub1[] aClass56_Sub1Array2;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!eb;")
	private Class1_Sub7 aClass1_Sub7_6;

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!ul;")
	private final Class205 aClass205_2;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!mr;")
	private final Class135 aClass135_3;

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!fc;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!ul;Lclient!mr;)V")
	public Class115(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class135 arg1) {
		this.aClass205_2 = arg0;
		this.aClass135_3 = arg1;
		if (!this.aClass205_2.method5340()) {
			this.aClass1_Sub1_Sub1_Sub2_1 = this.aClass205_2.method5350(255, true, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public void method3448() {
		if (this.aClass56_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass56_Sub1Array2.length; local11++) {
			if (this.aClass56_Sub1Array2[local11] != null) {
				this.aClass56_Sub1Array2[local11].method1649();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass56_Sub1Array2.length; local32++) {
			if (this.aClass56_Sub1Array2[local32] != null) {
				this.aClass56_Sub1Array2[local32].method1650();
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)Z")
	public boolean method3450() {
		if (this.aClass1_Sub7_6 != null) {
			return true;
		}
		if (this.aClass1_Sub1_Sub1_Sub2_1 == null) {
			if (this.aClass205_2.method5340()) {
				return false;
			}
			this.aClass1_Sub1_Sub1_Sub2_1 = this.aClass205_2.method5350(255, true, 255, (byte) 0);
		}
		if (this.aClass1_Sub1_Sub1_Sub2_1.aBoolean154) {
			return false;
		} else {
			this.aClass1_Sub7_6 = new Class1_Sub7(this.aClass1_Sub1_Sub1_Sub2_1.method1692());
			this.aClass56_Sub1Array2 = new Class56_Sub1[(this.aClass1_Sub7_6.aByteArray58.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!rb;BLclient!rb;ZI)Lclient!f;")
	private Class56_Sub1 method3451(@OriginalArg(0) Class173 arg0, @OriginalArg(2) Class173 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass1_Sub7_6 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub7_6.anInt3368 = arg2 * 8 + 5;
		if (this.aClass1_Sub7_6.aByteArray58.length <= this.aClass1_Sub7_6.anInt3368) {
			throw new RuntimeException();
		} else if (this.aClass56_Sub1Array2[arg2] == null) {
			@Pc(54) int local54 = this.aClass1_Sub7_6.method3125();
			@Pc(59) int local59 = this.aClass1_Sub7_6.method3125();
			@Pc(73) Class56_Sub1 local73 = new Class56_Sub1(arg2, arg1, arg0, this.aClass205_2, this.aClass135_3, local54, local59, true);
			this.aClass56_Sub1Array2[arg2] = local73;
			return local73;
		} else {
			return this.aClass56_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!rb;Lclient!rb;BI)Lclient!f;")
	public Class56_Sub1 method3453(@OriginalArg(0) Class173 arg0, @OriginalArg(1) Class173 arg1, @OriginalArg(3) int arg2) {
		return this.method3451(arg0, arg1, arg2);
	}
}
