import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class47_Sub4_Sub2 extends Class47_Sub4 implements Interface17 {

	@OriginalMember(owner = "client!kaa", name = "L", descriptor = "Lclient!pl;")
	private Class231 aClass231_4;

	@OriginalMember(owner = "client!kaa", name = "K", descriptor = "Lclient!el;")
	public final Class79 aClass79_3;

	@OriginalMember(owner = "client!kaa", name = "G", descriptor = "Z")
	private final boolean aBoolean286;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!qa;Lclient!uh;IIIIIZIII)V")
	public Class47_Sub4_Sub2(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static545.method7975(arg8, arg9));
		this.aClass79_3 = new Class79(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt8073, super.anInt8077, arg7, arg10);
		this.aBoolean286 = arg1.anInt8338 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)I")
	@Override
	public int method7173() {
		return this.aClass79_3.anInt2557;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class9 arg0) {
		this.aClass79_3.method2416(arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7174(@OriginalArg(1) Class9 arg0) {
		this.aClass79_3.method2418(arg0);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.aClass79_3.method2410(false, 0, 0, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		@Pc(18) Class19 local18 = this.aClass79_3.method2410(false, super.anInt8077, super.anInt8073, arg0, 2048, true);
		if (local18 == null) {
			return null;
		}
		@Pc(31) Class22 local31 = arg0.method7642();
		local31.oa(super.anInt8073, super.anInt8075, super.anInt8077);
		@Pc(41) Class2_Sub6 local41 = null;
		if (this.aBoolean286) {
			local41 = Static275.method4678(1);
		}
		if (this.aClass79_3.aClass2_Sub3_3 == null) {
			local18.method7258(local31, local41 == null ? null : local41.aClass2_Sub7Array1[0], 0);
		} else {
			@Pc(71) Class249 local71 = this.aClass79_3.aClass2_Sub3_3.method2067();
			arg0.method7573(local18, local71, local31, local41 == null ? null : local41.aClass2_Sub7Array1[0]);
		}
		if (this.aClass231_4 == null) {
			this.aClass231_4 = Static246.method4148(local18, super.anInt8073, super.anInt8077, super.anInt8075);
		} else {
			Static281.method4776(this.aClass231_4, super.anInt8077, super.anInt8073, local18, super.anInt8075);
		}
		@Pc(117) int local117 = super.anInt8073 >> 7;
		@Pc(122) int local122 = super.anInt8077 >> 7;
		this.aClass79_3.method2411(local122, true, arg0, local122, local18, local117, local117);
		return local41;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I")
	@Override
	public int method7172() {
		return this.aClass79_3.anInt2570;
	}

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
		@Pc(19) Class19 local19 = this.aClass79_3.method2410(true, super.anInt8077, super.anInt8073, arg0, 262144, true);
		if (local19 != null) {
			@Pc(26) int local26 = super.anInt8073 >> 7;
			@Pc(31) int local31 = super.anInt8077 >> 7;
			this.aClass79_3.method2411(local31, false, arg0, local31, local19, local26, local26);
		}
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return false;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return this.aClass231_4;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		@Pc(22) Class19 local22 = this.aClass79_3.method2410(false, super.anInt8077, super.anInt8073, arg1, 131072, false);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class22 local29 = arg1.method7642();
			local29.oa(super.anInt8073, super.anInt8075, super.anInt8077);
			return local22.method7257(arg2, arg0, local29, false);
		}
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)I")
	@Override
	public int method7176() {
		return this.aClass79_3.anInt2579;
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7175() {
		return this.aClass79_3.method2413();
	}
}
