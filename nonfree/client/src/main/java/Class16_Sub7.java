import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class16_Sub7 extends Class16 {

	@OriginalMember(owner = "client!os", name = "r", descriptor = "Z")
	private boolean aBoolean659 = false;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!bm;)V")
	public Class16_Sub7(@OriginalArg(0) Class33_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!bia;BI)V")
	@Override
	public void method8611(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass33_Sub1_23.method1987(arg0);
		super.aClass33_Sub1_23.method2105(arg1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8596(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub1_23.method1983(Static64.aClass363_7, Static25.aClass363_1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8601(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface24 local8 = super.aClass33_Sub1_23.method1982();
		if (local8 == null || !arg0) {
			super.aClass33_Sub1_23.method1991(Static133.aClass371_2, 0);
			return;
		}
		super.aClass33_Sub1_23.method2010(1);
		super.aClass33_Sub1_23.method1987(local8);
		super.aClass33_Sub1_23.method2087(Static149.aClass6_7);
		super.aClass33_Sub1_23.method2010(1);
		super.aClass33_Sub1_23.method1983(Static64.aClass363_7, Static95.aClass363_3);
		super.aClass33_Sub1_23.method1988(false, 2, true, Static25.aClass371_1);
		super.aClass33_Sub1_23.method1991(Static133.aClass371_2, 0);
		@Pc(57) Class47_Sub3 local57 = super.aClass33_Sub1_23.method2020();
		local57.method7896(super.aClass33_Sub1_23.method2016());
		super.aClass33_Sub1_23.method2088(Static310.aClass180_7);
		super.aClass33_Sub1_23.method2010(0);
		this.aBoolean659 = true;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8608() {
		return true;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V")
	@Override
	public void method8604() {
		if (this.aBoolean659) {
			super.aClass33_Sub1_23.method2010(1);
			super.aClass33_Sub1_23.method2087(Static513.aClass6_11);
			super.aClass33_Sub1_23.method1983(Static25.aClass363_1, Static25.aClass363_1);
			super.aClass33_Sub1_23.method2098(2, Static139.aClass371_3);
			super.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
			super.aClass33_Sub1_23.method2029();
			super.aClass33_Sub1_23.method1987(null);
			super.aClass33_Sub1_23.method2010(0);
			this.aBoolean659 = false;
		} else {
			super.aClass33_Sub1_23.method1991(Static419.aClass371_4, 0);
		}
		super.aClass33_Sub1_23.method1983(Static25.aClass363_1, Static25.aClass363_1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
