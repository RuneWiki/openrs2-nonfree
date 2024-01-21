import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ADGLALPC")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ADGLALPC", name = "rb", descriptor = "I")
	private int anInt109;

	@OriginalMember(owner = "client!ADGLALPC", name = "sb", descriptor = "Lclient!OMIIKHIV;")
	public Class31 aClass31_1;

	@OriginalMember(owner = "client!ADGLALPC", name = "a", descriptor = "(I)Lclient!LFTMDGKK;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method448() {
		try {
			if (this.aClass31_1 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub4 local8 = this.method26();
			if (local8 == null) {
				return null;
			}
			super.anInt325 = local8.anInt670;
			if (super.anInt296 != -1 && super.anInt297 != -1) {
				@Pc(35) Class4 local35 = Class4.aClass4Array1[super.anInt296];
				@Pc(38) Class1_Sub1_Sub1_Sub4 local38 = local35.method34();
				if (local38 != null) {
					@Pc(47) int local47 = local35.aClass21_1.anIntArray68[super.anInt297];
					@Pc(58) Class1_Sub1_Sub1_Sub4 local58 = new Class1_Sub1_Sub1_Sub4(Class6.method44(local47), true, local38, false, false);
					local58.method315(-super.anInt300, 0, 0);
					local58.method309();
					local58.method310(local47);
					local58.anIntArrayArray9 = null;
					local58.anIntArrayArray8 = null;
					if (local35.anInt118 != 128 || local35.anInt119 != 128) {
						local58.method318(local35.anInt119, local35.anInt118, local35.anInt118);
					}
					local58.method319(local35.anInt121 + 64, local35.anInt122 + 850, -30, -50, -30, true);
					@Pc(121) Class1_Sub1_Sub1_Sub4[] local121 = new Class1_Sub1_Sub1_Sub4[] { local8, local58 };
					local8 = new Class1_Sub1_Sub1_Sub4(true, local121, false, 2);
				}
			}
			if (this.aClass31_1.aByte23 == 1) {
				local8.aBoolean111 = true;
			}
			return local8;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("25282, " + 0 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADGLALPC", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method247() {
		try {
			return this.aClass31_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("51681, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADGLALPC", name = "c", descriptor = "(Z)Lclient!LFTMDGKK;")
	private Class1_Sub1_Sub1_Sub4 method26() {
		try {
			@Pc(19) int local19;
			if (super.anInt332 < 0 || super.anInt335 != 0) {
				local19 = -1;
				if (super.anInt339 >= 0) {
					local19 = Class21.aClass21Array1[super.anInt339].anIntArray68[super.anInt340];
				}
				return this.aClass31_1.method401(null, -1, local19);
			}
			local19 = Class21.aClass21Array1[super.anInt332].anIntArray68[super.anInt333];
			@Pc(21) int local21 = -1;
			if (super.anInt339 >= 0 && super.anInt339 != super.anInt327) {
				local21 = Class21.aClass21Array1[super.anInt339].anIntArray68[super.anInt340];
			}
			return this.aClass31_1.method401(Class21.aClass21Array1[super.anInt332].anIntArray71, local21, local19);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("15276, " + true + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
