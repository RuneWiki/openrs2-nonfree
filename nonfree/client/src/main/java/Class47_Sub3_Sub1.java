import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class47_Sub3_Sub1 extends Class47_Sub3 implements Interface17 {

	@OriginalMember(owner = "client!he", name = "t", descriptor = "Lclient!pl;")
	private Class231 aClass231_2;

	@OriginalMember(owner = "client!he", name = "I", descriptor = "Lclient!el;")
	public final Class79 aClass79_2;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "Z")
	private final boolean aBoolean240;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!qa;Lclient!uh;IIIIIZII)V")
	public Class47_Sub3_Sub1(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt8321, arg1.aBoolean579, arg1.aBoolean567);
		this.aClass79_2 = new Class79(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean240 = arg1.anInt8338 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7175() {
		return this.aClass79_2.method2413();
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return false;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class9 arg0) {
		this.aClass79_2.method2416(arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7174(@OriginalArg(1) Class9 arg0) {
		this.aClass79_2.method2418(arg0);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return this.aClass231_2;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
		@Pc(16) Class19 local16 = this.aClass79_2.method2410(true, super.anInt7957, super.anInt7956, arg0, 262144, true);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt7956 >> 7;
			@Pc(28) int local28 = super.anInt7957 >> 7;
			this.aClass79_2.method2411(local28, false, arg0, local28, local16, local23, local23);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.aClass79_2.method2410(false, 0, 0, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
	@Override
	public int method7172() {
		return this.aClass79_2.anInt2570;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		@Pc(18) Class19 local18 = this.aClass79_2.method2410(false, super.anInt7957, super.anInt7956, arg0, 2048, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class22 local25 = arg0.method7642();
		local25.oa(super.anInt7956, super.anInt7955, super.anInt7957);
		@Pc(35) Class2_Sub6 local35 = null;
		if (this.aBoolean240) {
			local35 = Static275.method4678(1);
		}
		if (this.aClass79_2.aClass2_Sub3_3 == null) {
			local18.method7258(local25, local35 == null ? null : local35.aClass2_Sub7Array1[0], 0);
		} else {
			@Pc(65) Class249 local65 = this.aClass79_2.aClass2_Sub3_3.method2067();
			arg0.method7573(local18, local65, local25, local35 == null ? null : local35.aClass2_Sub7Array1[0]);
		}
		if (this.aClass231_2 == null) {
			this.aClass231_2 = Static246.method4148(local18, super.anInt7956, super.anInt7957, super.anInt7955);
		} else {
			Static281.method4776(this.aClass231_2, super.anInt7957, super.anInt7956, local18, super.anInt7955);
		}
		@Pc(111) int local111 = super.anInt7956 >> 7;
		@Pc(116) int local116 = super.anInt7957 >> 7;
		this.aClass79_2.method2411(local116, true, arg0, local116, local18, local111, local111);
		return local35;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)I")
	@Override
	public int method7173() {
		return this.aClass79_2.anInt2557;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)I")
	@Override
	public int method7176() {
		return this.aClass79_2.anInt2579;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class19 local16 = this.aClass79_2.method2410(false, super.anInt7957, super.anInt7956, arg1, 131072, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class22 local29 = arg1.method7642();
			local29.oa(super.anInt7956, super.anInt7955, super.anInt7957);
			return local16.method7257(arg2, arg0, local29, false);
		}
	}
}
