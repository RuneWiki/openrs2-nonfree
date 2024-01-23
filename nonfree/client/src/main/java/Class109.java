import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class109 {

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "[Lclient!ka;")
	private Class21_Sub1[] aClass21_Sub1Array2;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!lf;")
	private Class1_Sub14 aClass1_Sub14_6;

	@OriginalMember(owner = "client!mh", name = "l", descriptor = "Lclient!db;")
	private Class31 aClass31_2;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Lclient!cd;")
	private Class22 aClass22_4;

	@OriginalMember(owner = "client!mh", name = "m", descriptor = "Lclient!qo;")
	private Class1_Sub2_Sub4_Sub2 aClass1_Sub2_Sub4_Sub2_2;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!cd;Lclient!db;)V")
	public Class109(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class31 arg1) {
		this.aClass31_2 = arg1;
		this.aClass22_4 = arg0;
		if (!this.aClass22_4.method527()) {
			this.aClass1_Sub2_Sub4_Sub2_2 = this.aClass22_4.method528(true, (byte) 0, 255, 255);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)Z")
	public boolean method2909() {
		if (this.aClass1_Sub14_6 != null) {
			return true;
		}
		if (this.aClass1_Sub2_Sub4_Sub2_2 == null) {
			if (this.aClass22_4.method527()) {
				return false;
			}
			this.aClass1_Sub2_Sub4_Sub2_2 = this.aClass22_4.method528(true, (byte) 0, 255, 255);
		}
		if (this.aClass1_Sub2_Sub4_Sub2_2.aBoolean296) {
			return false;
		} else {
			this.aClass1_Sub14_6 = new Class1_Sub14(this.aClass1_Sub2_Sub4_Sub2_2.method3668());
			this.aClass21_Sub1Array2 = new Class21_Sub1[(this.aClass1_Sub14_6.aByteArray17.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!pj;ZILclient!pj;)Lclient!ka;")
	private Class21_Sub1 method2910(@OriginalArg(1) Class138 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class138 arg2) {
		if (this.aClass1_Sub14_6 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub14_6.anInt1480 = arg1 * 8 + 5;
		if (this.aClass1_Sub14_6.aByteArray17.length <= this.aClass1_Sub14_6.anInt1480) {
			throw new RuntimeException();
		} else if (this.aClass21_Sub1Array2[arg1] == null) {
			@Pc(53) int local53 = this.aClass1_Sub14_6.method1392();
			@Pc(60) int local60 = this.aClass1_Sub14_6.method1392();
			@Pc(74) Class21_Sub1 local74 = new Class21_Sub1(arg1, arg2, arg0, this.aClass22_4, this.aClass31_2, local53, local60, true);
			this.aClass21_Sub1Array2[arg1] = local74;
			return local74;
		} else {
			return this.aClass21_Sub1Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	public void method2911() {
		if (this.aClass21_Sub1Array2 == null) {
			return;
		}
		@Pc(12) int local12;
		for (local12 = 0; local12 < this.aClass21_Sub1Array2.length; local12++) {
			if (this.aClass21_Sub1Array2[local12] != null) {
				this.aClass21_Sub1Array2[local12].method2420();
			}
		}
		for (local12 = 0; local12 < this.aClass21_Sub1Array2.length; local12++) {
			if (this.aClass21_Sub1Array2[local12] != null) {
				this.aClass21_Sub1Array2[local12].method2417();
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!pj;BILclient!pj;)Lclient!ka;")
	public Class21_Sub1 method2913(@OriginalArg(0) Class138 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class138 arg2) {
		return this.method2910(arg0, arg1, arg2);
	}
}
