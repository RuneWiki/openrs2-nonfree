import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TOFRUGLM")
public final class Class2_Sub1_Sub3_Sub1_Sub2 extends Class2_Sub1_Sub3_Sub1 {

	@OriginalMember(owner = "client!TOFRUGLM", name = "rb", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!TOFRUGLM", name = "tb", descriptor = "Lclient!YSYPMZMO;")
	public Class48 aClass48_2;

	@OriginalMember(owner = "client!TOFRUGLM", name = "sb", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!TOFRUGLM", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method492() {
		try {
			return this.aClass48_2 != null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("73711, " + 39489 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TOFRUGLM", name = "a", descriptor = "(B)Lclient!RMLAXPMV;")
	@Override
	protected Class2_Sub1_Sub3_Sub4 method489(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass48_2 == null) {
				return null;
			}
			@Pc(10) Class2_Sub1_Sub3_Sub4 local10 = this.method495();
			if (arg0 == 3) {
				@Pc(15) boolean local15 = false;
			} else {
				for (@Pc(19) int local19 = 1; local19 > 0; local19++) {
				}
			}
			if (local10 == null) {
				return null;
			}
			super.anInt686 = local10.anInt658;
			if (super.anInt698 != -1 && super.anInt699 != -1) {
				@Pc(45) Class27 local45 = Class27.aClass27Array1[super.anInt698];
				@Pc(48) Class2_Sub1_Sub3_Sub4 local48 = local45.method316();
				if (local48 != null) {
					@Pc(57) int local57 = local45.aClass22_1.anIntArray64[super.anInt699];
					@Pc(68) Class2_Sub1_Sub3_Sub4 local68 = new Class2_Sub1_Sub3_Sub4(local48, Class45.method557(local57), true, false, true);
					local68.method444(0, 0, -super.anInt702);
					local68.method438();
					local68.method439(local57);
					local68.anIntArrayArray16 = null;
					local68.anIntArrayArray15 = null;
					if (local45.anInt400 != 128 || local45.anInt401 != 128) {
						local68.method447(local45.anInt401, local45.anInt400, local45.anInt400, this.anInt707);
					}
					local68.method448(local45.anInt403 + 64, local45.anInt404 + 850, -30, -50, -30, true);
					@Pc(132) Class2_Sub1_Sub3_Sub4[] local132 = new Class2_Sub1_Sub3_Sub4[] { local10, local68 };
					local10 = new Class2_Sub1_Sub3_Sub4(2, true, 18217, local132);
				}
			}
			if (this.aClass48_2.aByte58 == 1) {
				local10.aBoolean167 = true;
			}
			return local10;
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("67923, " + arg0 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TOFRUGLM", name = "b", descriptor = "(I)Lclient!RMLAXPMV;")
	private Class2_Sub1_Sub3_Sub4 method495() {
		try {
			@Pc(14) int local14;
			if (super.anInt674 < 0 || super.anInt677 != 0) {
				local14 = -1;
				if (super.anInt693 >= 0) {
					local14 = Class22.aClass22Array1[super.anInt693].anIntArray64[super.anInt694];
				}
				return this.aClass48_2.method564(null, local14, -1);
			}
			local14 = Class22.aClass22Array1[super.anInt674].anIntArray64[super.anInt675];
			@Pc(16) int local16 = -1;
			if (super.anInt693 >= 0 && super.anInt693 != super.anInt672) {
				local16 = Class22.aClass22Array1[super.anInt693].anIntArray64[super.anInt694];
			}
			return this.aClass48_2.method564(Class22.aClass22Array1[super.anInt674].anIntArray67, local14, local16);
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("68297, " + -291 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}
}
