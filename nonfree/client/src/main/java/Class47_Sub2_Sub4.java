import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class47_Sub2_Sub4 extends Class47_Sub2 implements Interface17 {

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "Lclient!pl;")
	private Class231 aClass231_1;

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "Lclient!el;")
	public final Class79 aClass79_1;

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "Z")
	private final boolean aBoolean216;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!qa;Lclient!uh;IIIIIZIIIIIII)V")
	public Class47_Sub2_Sub4(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8325 == 1, Static429.method6340(arg12, arg13));
		this.aClass79_1 = new Class79(arg0, arg1, arg12, arg13, super.aByte94, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean216 = arg1.anInt8338 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class19 local21 = this.aClass79_1.method2410(false, super.anInt8191, super.anInt8189, arg1, 131072, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class22 local28 = arg1.method7642();
			local28.oa(super.anInt8189, super.anInt8192, super.anInt8191);
			return local21.method7257(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7174(@OriginalArg(1) Class9 arg0) {
		this.aClass79_1.method2418(arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)I")
	@Override
	public int method7176() {
		return this.aClass79_1.anInt2579;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7175() {
		return this.aClass79_1.method2413();
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class9 arg0) {
		this.aClass79_1.method2416(arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
		@Pc(19) Class19 local19 = this.aClass79_1.method2410(true, super.anInt8191, super.anInt8189, arg0, 262144, true);
		if (local19 != null) {
			this.aClass79_1.method2411(super.aShort117, false, arg0, super.aShort114, local19, super.aShort116, super.aShort115);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)I")
	@Override
	public int method7172() {
		return this.aClass79_1.anInt2570;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		@Pc(18) Class19 local18 = this.aClass79_1.method2410(false, super.anInt8191, super.anInt8189, arg0, 2048, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class22 local25 = arg0.method7642();
		local25.oa(super.anInt8189, super.anInt8192, super.anInt8191);
		@Pc(35) Class2_Sub6 local35 = null;
		if (this.aBoolean216) {
			local35 = Static275.method4678(1);
		}
		if (this.aClass79_1.aClass2_Sub3_3 == null) {
			local18.method7258(local25, local35 == null ? null : local35.aClass2_Sub7Array1[0], 0);
		} else {
			@Pc(57) Class249 local57 = this.aClass79_1.aClass2_Sub3_3.method2067();
			arg0.method7573(local18, local57, local25, local35 == null ? null : local35.aClass2_Sub7Array1[0]);
		}
		if (this.aClass231_1 == null) {
			this.aClass231_1 = Static246.method4148(local18, super.anInt8189, super.anInt8191, super.anInt8192);
		} else {
			Static281.method4776(this.aClass231_1, super.anInt8191, super.anInt8189, local18, super.anInt8192);
		}
		this.aClass79_1.method2411(super.aShort117, true, arg0, super.aShort114, local18, super.aShort116, super.aShort115);
		return local35;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.aClass79_1.method2410(false, 0, 0, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)I")
	@Override
	public int method6953() {
		return this.aClass79_1.method2408();
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return this.aClass231_1;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)I")
	@Override
	public int method7173() {
		return this.aClass79_1.anInt2557;
	}
}
