import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class220 {

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "[I")
	public static final int[] anIntArray527 = new int[99];

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "Lclient!ef;")
	private Class2_Sub12 aClass2_Sub12_8;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "[Lclient!nh;")
	private Class138_Sub1[] aClass138_Sub1Array2;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "Lclient!gh;")
	private final Class79 aClass79_3;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "Lclient!p;")
	private final Class152 aClass152_3;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "Lclient!mi;")
	private Class2_Sub9_Sub14_Sub1 aClass2_Sub9_Sub14_Sub1_2;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) ((double) local11 + Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D);
			local4 += local24;
			anIntArray527[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!gh;Lclient!p;)V")
	public Class220(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class152 arg1) {
		this.aClass79_3 = arg0;
		this.aClass152_3 = arg1;
		if (!this.aClass79_3.method2109()) {
			this.aClass2_Sub9_Sub14_Sub1_2 = this.aClass79_3.method2108(255, true, 255, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!uj;BILclient!uj;)Lclient!nh;")
	public Class138_Sub1 method5728(@OriginalArg(0) Class204 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class204 arg2) {
		return this.method5734(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)Z")
	public boolean method5733() {
		if (this.aClass2_Sub12_8 != null) {
			return true;
		}
		if (this.aClass2_Sub9_Sub14_Sub1_2 == null) {
			if (this.aClass79_3.method2109()) {
				return false;
			}
			this.aClass2_Sub9_Sub14_Sub1_2 = this.aClass79_3.method2108(255, true, 255, (byte) 0);
		}
		if (this.aClass2_Sub9_Sub14_Sub1_2.aBoolean557) {
			return false;
		} else {
			this.aClass2_Sub12_8 = new Class2_Sub12(this.aClass2_Sub9_Sub14_Sub1_2.method5297());
			this.aClass138_Sub1Array2 = new Class138_Sub1[(this.aClass2_Sub12_8.aByteArray30.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZILclient!uj;Lclient!uj;Z)Lclient!nh;")
	private Class138_Sub1 method5734(@OriginalArg(1) int arg0, @OriginalArg(2) Class204 arg1, @OriginalArg(3) Class204 arg2) {
		if (this.aClass2_Sub12_8 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub12_8.anInt3606 = arg0 * 8 + 5;
		if (this.aClass2_Sub12_8.anInt3606 >= this.aClass2_Sub12_8.aByteArray30.length) {
			throw new RuntimeException();
		} else if (this.aClass138_Sub1Array2[arg0] == null) {
			@Pc(50) int local50 = this.aClass2_Sub12_8.method3135();
			@Pc(55) int local55 = this.aClass2_Sub12_8.method3135();
			@Pc(69) Class138_Sub1 local69 = new Class138_Sub1(arg0, arg2, arg1, this.aClass79_3, this.aClass152_3, local50, local55, true);
			this.aClass138_Sub1Array2[arg0] = local69;
			return local69;
		} else {
			return this.aClass138_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	public void method5735() {
		if (this.aClass138_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass138_Sub1Array2.length; local11++) {
			if (this.aClass138_Sub1Array2[local11] != null) {
				this.aClass138_Sub1Array2[local11].method4080();
			}
		}
		for (@Pc(36) int local36 = 0; local36 < this.aClass138_Sub1Array2.length; local36++) {
			if (this.aClass138_Sub1Array2[local36] != null) {
				this.aClass138_Sub1Array2[local36].method4078();
			}
		}
	}
}
