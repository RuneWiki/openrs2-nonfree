import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class47_Sub5_Sub3 extends Class47_Sub5 implements Interface17 {

	@OriginalMember(owner = "client!uw", name = "S", descriptor = "Lclient!pl;")
	private Class231 aClass231_8;

	@OriginalMember(owner = "client!uw", name = "P", descriptor = "Lclient!el;")
	public final Class79 aClass79_4;

	@OriginalMember(owner = "client!uw", name = "L", descriptor = "Z")
	private final boolean aBoolean583;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!qa;Lclient!uh;IIIIIZIIIIII)V")
	public Class47_Sub5_Sub3(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static339.method5499(arg11, arg12));
		this.aClass79_4 = new Class79(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean583 = arg1.anInt8338 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return this.aClass231_8;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class19 local16 = this.aClass79_4.method2410(false, super.anInt8496, super.anInt8486, arg1, 131072, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class22 local23 = arg1.method7642();
			local23.oa(super.anInt8486 + super.anInt8488, super.anInt8489, super.anInt8496 + super.anInt8487);
			return local16.method7257(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		return this.aClass79_4.method2410(false, 0, 0, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)I")
	@Override
	public int method7173() {
		return this.aClass79_4.anInt2557;
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7177(@OriginalArg(1) Class9 arg0) {
		this.aClass79_4.method2416(arg0);
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(B)I")
	@Override
	public int method7176() {
		return this.aClass79_4.anInt2579;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method7174(@OriginalArg(1) Class9 arg0) {
		this.aClass79_4.method2418(arg0);
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		@Pc(18) Class19 local18 = this.aClass79_4.method2410(false, super.anInt8496, super.anInt8486, arg0, 2048, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class22 local25 = arg0.method7642();
		local25.oa(super.anInt8486 + super.anInt8488, super.anInt8489, super.anInt8496 + super.anInt8487);
		@Pc(41) Class2_Sub6 local41 = null;
		if (this.aBoolean583) {
			local41 = Static275.method4678(1);
		}
		if (this.aClass79_4.aClass2_Sub3_3 == null) {
			local18.method7258(local25, local41 == null ? null : local41.aClass2_Sub7Array1[0], 0);
		} else {
			@Pc(61) Class249 local61 = this.aClass79_4.aClass2_Sub3_3.method2067();
			arg0.method7573(local18, local61, local25, local41 == null ? null : local41.aClass2_Sub7Array1[0]);
		}
		if (this.aClass231_8 == null) {
			this.aClass231_8 = Static246.method4148(local18, super.anInt8486, super.anInt8496, super.anInt8489);
		} else {
			Static281.method4776(this.aClass231_8, super.anInt8496, super.anInt8486, local18, super.anInt8489);
		}
		@Pc(121) int local121 = super.anInt8486 >> 7;
		@Pc(126) int local126 = super.anInt8496 >> 7;
		this.aClass79_4.method2411(local126, true, arg0, local126, local18, local121, local121);
		return local41;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7175() {
		return this.aClass79_4.method2413();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
		@Pc(19) Class19 local19 = this.aClass79_4.method2410(false, super.anInt8496, super.anInt8486, arg0, 262144, true);
		if (local19 != null) {
			@Pc(26) int local26 = super.anInt8486 >> 7;
			@Pc(31) int local31 = super.anInt8496 >> 7;
			this.aClass79_4.method2411(local31, false, arg0, local31, local19, local26, local26);
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I")
	@Override
	public int method7172() {
		return this.aClass79_4.anInt2570;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)I")
	@Override
	public int method7171() {
		return this.aClass79_4.method2408();
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V")
	@Override
	public void method7179() {
	}
}
