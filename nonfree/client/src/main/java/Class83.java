import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class83 {

	@OriginalMember(owner = "client!g", name = "d", descriptor = "[Lclient!ks;")
	private Class106_Sub1[] aClass106_Sub1Array1;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!lk;")
	private Class2_Sub13 aClass2_Sub13_8;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!fb;")
	private final Class70 aClass70_3;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "Lclient!bo;")
	private final Class23 aClass23_2;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "Lclient!eb;")
	private Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_2;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!bo;Lclient!fb;)V")
	public Class83(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class70 arg1) {
		this.aClass70_3 = arg1;
		this.aClass23_2 = arg0;
		if (!this.aClass23_2.method632()) {
			this.aClass2_Sub1_Sub3_Sub1_2 = this.aClass23_2.method639(255, true, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z")
	public boolean method2075() {
		if (this.aClass2_Sub13_8 != null) {
			return true;
		}
		if (this.aClass2_Sub1_Sub3_Sub1_2 == null) {
			if (this.aClass23_2.method632()) {
				return false;
			}
			this.aClass2_Sub1_Sub3_Sub1_2 = this.aClass23_2.method639(255, true, 255, (byte) 0);
		}
		if (this.aClass2_Sub1_Sub3_Sub1_2.aBoolean434) {
			return false;
		} else {
			this.aClass2_Sub13_8 = new Class2_Sub13(this.aClass2_Sub1_Sub3_Sub1_2.method4856());
			this.aClass106_Sub1Array1 = new Class106_Sub1[(this.aClass2_Sub13_8.aByteArray77.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!nk;IILclient!nk;)Lclient!ks;")
	public Class106_Sub1 method2077(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class161 arg2) {
		return this.method2079(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	public void method2078() {
		if (this.aClass106_Sub1Array1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass106_Sub1Array1.length; local11++) {
			if (this.aClass106_Sub1Array1[local11] != null) {
				this.aClass106_Sub1Array1[local11].method3069();
			}
		}
		for (@Pc(32) int local32 = 0; local32 < this.aClass106_Sub1Array1.length; local32++) {
			if (this.aClass106_Sub1Array1[local32] != null) {
				this.aClass106_Sub1Array1[local32].method3067();
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!nk;Lclient!nk;IIZ)Lclient!ks;")
	private Class106_Sub1 method2079(@OriginalArg(0) Class161 arg0, @OriginalArg(1) Class161 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass2_Sub13_8 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub13_8.anInt4788 = arg2 * 8 + 5;
		if (this.aClass2_Sub13_8.aByteArray77.length <= this.aClass2_Sub13_8.anInt4788) {
			throw new RuntimeException();
		} else if (this.aClass106_Sub1Array1[arg2] == null) {
			@Pc(49) int local49 = this.aClass2_Sub13_8.method4239();
			@Pc(59) int local59 = this.aClass2_Sub13_8.method4239();
			@Pc(73) Class106_Sub1 local73 = new Class106_Sub1(arg2, arg0, arg1, this.aClass23_2, this.aClass70_3, local49, local59, true);
			this.aClass106_Sub1Array1[arg2] = local73;
			return local73;
		} else {
			return this.aClass106_Sub1Array1[arg2];
		}
	}
}
