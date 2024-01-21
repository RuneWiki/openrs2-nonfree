import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class2_Sub1_Sub4_Sub6_Sub2 extends Class2_Sub1_Sub4_Sub6 {

	@OriginalMember(owner = "client!m", name = "ad", descriptor = "Lclient!lb;")
	public Class2_Sub1_Sub8 aClass2_Sub1_Sub8_1;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(Z)Z")
	@Override
	public boolean method1270() {
		return this.aClass2_Sub1_Sub8_1 != null;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(Z)Lclient!hb;")
	@Override
	protected Class2_Sub1_Sub4_Sub5 method1264() {
		if (this.aClass2_Sub1_Sub8_1 == null) {
			return null;
		}
		@Pc(23) Class2_Sub1_Sub10 local23 = super.anInt2014 != -1 && super.anInt1986 == 0 ? Static54.method1158(super.anInt2014) : null;
		@Pc(41) Class2_Sub1_Sub10 local41 = super.anInt1988 == -1 || super.anInt1988 == super.anInt2007 && local23 != null ? null : Static54.method1158(super.anInt1988);
		@Pc(52) Class2_Sub1_Sub4_Sub5 local52 = this.aClass2_Sub1_Sub8_1.method1191(super.anInt1987, local41, local23, super.anInt2005);
		if (local52 == null) {
			return null;
		}
		local52.method920();
		super.anInt2028 = local52.anInt1974;
		if (super.anInt1995 != -1 && super.anInt1983 != -1) {
			@Pc(80) Class2_Sub1_Sub4_Sub5 local80 = Static75.method1409(super.anInt1995).method1600(super.anInt1983);
			if (local80 != null) {
				local80.method922(0, -super.anInt2033, 0);
				@Pc(100) Class2_Sub1_Sub4_Sub5[] local100 = new Class2_Sub1_Sub4_Sub5[] { local52, local80 };
				local52 = new Class2_Sub1_Sub4_Sub5(local100, 2, true);
			}
		}
		if (this.aClass2_Sub1_Sub8_1.anInt1863 == 1) {
			local52.aBoolean74 = true;
		}
		return local52;
	}
}
