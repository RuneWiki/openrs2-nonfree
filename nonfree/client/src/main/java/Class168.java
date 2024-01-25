import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class168 {

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "Lclient!sv;")
	private Class2_Sub13 aClass2_Sub13_6;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "[Lclient!kd;")
	private Class14_Sub1[] aClass14_Sub1Array2;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "Lclient!gd;")
	private final Class84 aClass84_3;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "Lclient!ep;")
	private final Class70 aClass70_3;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "Lclient!op;")
	private Class2_Sub5_Sub12_Sub2 aClass2_Sub5_Sub12_Sub2_2;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!gd;Lclient!ep;)V")
	public Class168(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class70 arg1) {
		this.aClass84_3 = arg0;
		this.aClass70_3 = arg1;
		if (!this.aClass84_3.method1911()) {
			this.aClass2_Sub5_Sub12_Sub2_2 = this.aClass84_3.method1910((byte) 0, 255, 255, true);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!ro;ZLclient!ro;)Lclient!kd;")
	private Class14_Sub1 method3632(@OriginalArg(1) int arg0, @OriginalArg(2) Class217 arg1, @OriginalArg(4) Class217 arg2) {
		if (this.aClass2_Sub13_6 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub13_6.anInt4347 = arg0 * 8 + 5;
		if (this.aClass2_Sub13_6.anInt4347 >= this.aClass2_Sub13_6.aByteArray52.length) {
			throw new RuntimeException();
		} else if (this.aClass14_Sub1Array2[arg0] == null) {
			@Pc(51) int local51 = this.aClass2_Sub13_6.method3574();
			@Pc(56) int local56 = this.aClass2_Sub13_6.method3574();
			@Pc(70) Class14_Sub1 local70 = new Class14_Sub1(arg0, arg1, arg2, this.aClass84_3, this.aClass70_3, local51, local56, true);
			this.aClass14_Sub1Array2[arg0] = local70;
			return local70;
		} else {
			return this.aClass14_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Z")
	public boolean method3633() {
		if (this.aClass2_Sub13_6 != null) {
			return true;
		}
		if (this.aClass2_Sub5_Sub12_Sub2_2 == null) {
			if (this.aClass84_3.method1911()) {
				return false;
			}
			this.aClass2_Sub5_Sub12_Sub2_2 = this.aClass84_3.method1910((byte) 0, 255, 255, true);
		}
		if (this.aClass2_Sub5_Sub12_Sub2_2.aBoolean335) {
			return false;
		} else {
			this.aClass2_Sub13_6 = new Class2_Sub13(this.aClass2_Sub5_Sub12_Sub2_2.method3887());
			this.aClass14_Sub1Array2 = new Class14_Sub1[(this.aClass2_Sub13_6.aByteArray52.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	public void method3634() {
		if (this.aClass14_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass14_Sub1Array2.length; local11++) {
			if (this.aClass14_Sub1Array2[local11] != null) {
				this.aClass14_Sub1Array2[local11].method2742();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass14_Sub1Array2.length; local32++) {
			if (this.aClass14_Sub1Array2[local32] != null) {
				this.aClass14_Sub1Array2[local32].method2738();
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLclient!ro;ILclient!ro;)Lclient!kd;")
	public Class14_Sub1 method3636(@OriginalArg(1) Class217 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class217 arg2) {
		return this.method3632(arg1, arg0, arg2);
	}
}
