import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class101 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "Lclient!ug;")
	private Class1_Sub28 aClass1_Sub28_3;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "[Lclient!ft;")
	private Class85_Sub1[] aClass85_Sub1Array2;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "Lclient!qj;")
	private final Class200 aClass200_3;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "Lclient!sn;")
	private final Class224 aClass224_3;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "Lclient!ul;")
	private Class1_Sub5_Sub9_Sub2 aClass1_Sub5_Sub9_Sub2_1;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!sn;Lclient!qj;)V")
	public Class101(@OriginalArg(0) Class224 arg0, @OriginalArg(1) Class200 arg1) {
		this.aClass200_3 = arg1;
		this.aClass224_3 = arg0;
		if (!this.aClass224_3.method4931()) {
			this.aClass1_Sub5_Sub9_Sub2_1 = this.aClass224_3.method4923(255, 255, (byte) 0, true);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)Z")
	public boolean method2250() {
		if (this.aClass1_Sub28_3 != null) {
			return true;
		}
		if (this.aClass1_Sub5_Sub9_Sub2_1 == null) {
			if (this.aClass224_3.method4931()) {
				return false;
			}
			this.aClass1_Sub5_Sub9_Sub2_1 = this.aClass224_3.method4923(255, 255, (byte) 0, true);
		}
		if (this.aClass1_Sub5_Sub9_Sub2_1.aBoolean740) {
			return false;
		} else {
			this.aClass1_Sub28_3 = new Class1_Sub28(this.aClass1_Sub5_Sub9_Sub2_1.method5312());
			this.aClass85_Sub1Array2 = new Class85_Sub1[(this.aClass1_Sub28_3.aByteArray86.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!vs;Lclient!vs;IZ)Lclient!ft;")
	private Class85_Sub1 method2251(@OriginalArg(1) Class257 arg0, @OriginalArg(2) Class257 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass1_Sub28_3 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub28_3.anInt6812 = arg2 * 8 + 5;
		if (this.aClass1_Sub28_3.anInt6812 >= this.aClass1_Sub28_3.aByteArray86.length) {
			throw new RuntimeException();
		} else if (this.aClass85_Sub1Array2[arg2] == null) {
			@Pc(54) int local54 = this.aClass1_Sub28_3.method5355();
			@Pc(59) int local59 = this.aClass1_Sub28_3.method5355();
			@Pc(73) Class85_Sub1 local73 = new Class85_Sub1(arg2, arg1, arg0, this.aClass224_3, this.aClass200_3, local54, local59, true);
			this.aClass85_Sub1Array2[arg2] = local73;
			return local73;
		} else {
			return this.aClass85_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public void method2252() {
		if (this.aClass85_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass85_Sub1Array2.length; local11++) {
			if (this.aClass85_Sub1Array2[local11] != null) {
				this.aClass85_Sub1Array2[local11].method1904();
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.aClass85_Sub1Array2.length; local44++) {
			if (this.aClass85_Sub1Array2[local44] != null) {
				this.aClass85_Sub1Array2[local44].method1906();
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!vs;ILclient!vs;)Lclient!ft;")
	public Class85_Sub1 method2255(@OriginalArg(0) int arg0, @OriginalArg(1) Class257 arg1, @OriginalArg(3) Class257 arg2) {
		return this.method2251(arg1, arg2, arg0);
	}
}
