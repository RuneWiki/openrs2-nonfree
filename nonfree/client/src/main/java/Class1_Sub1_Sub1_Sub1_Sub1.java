import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "nb", descriptor = "I")
	private int anInt123;

	@OriginalMember(owner = "client!ab", name = "pb", descriptor = "Lclient!fc;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!ab", name = "ob", descriptor = "I")
	private int anInt124 = -45277;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method313() {
		try {
			if (this.aClass11_1 == null) {
				return null;
			}
			@Pc(17) Class1_Sub1_Sub1_Sub5 local17 = this.method35();
			if (local17 == null) {
				return null;
			}
			super.anInt171 = local17.anInt579;
			if (super.anInt158 != -1 && super.anInt159 != -1) {
				@Pc(38) Class27 local38 = Class27.aClass27Array1[super.anInt158];
				@Pc(41) Class1_Sub1_Sub1_Sub5 local41 = local38.method491();
				if (local41 != null) {
					@Pc(57) Class1_Sub1_Sub1_Sub5 local57 = new Class1_Sub1_Sub1_Sub5(-435, true, false, local41, !local38.aBoolean168);
					local57.method292(-super.anInt162, this.anInt124, 0, 0);
					local57.method286();
					local57.method287(local38.aClass25_2.anIntArray215[super.anInt159]);
					local57.anIntArrayArray8 = null;
					local57.anIntArrayArray7 = null;
					if (local38.anInt819 != 128 || local38.anInt820 != 128) {
						local57.method295(local38.anInt820, local38.anInt819, local38.anInt819);
					}
					local57.method296(local38.anInt822 + 64, local38.anInt823 + 850, -30, -50, -30, true);
					@Pc(126) Class1_Sub1_Sub1_Sub5[] local126 = new Class1_Sub1_Sub1_Sub5[] { local17, local57 };
					local17 = new Class1_Sub1_Sub1_Sub5(local126, 2, true, this.anInt123);
				}
			}
			if (this.aClass11_1.aByte31 == 1) {
				local17.aBoolean111 = true;
			}
			return local17;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("56681, " + false + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method35() {
		try {
			@Pc(21) int local21;
			if (super.anInt153 < 0 || super.anInt156 != 0) {
				local21 = -1;
				if (super.anInt150 >= 0) {
					local21 = Class25.aClass25Array1[super.anInt150].anIntArray215[super.anInt151];
				}
				return this.aClass11_1.method308(-1, local21, null);
			}
			local21 = Class25.aClass25Array1[super.anInt153].anIntArray215[super.anInt154];
			@Pc(23) int local23 = -1;
			if (super.anInt150 >= 0 && super.anInt150 != super.anInt132) {
				local23 = Class25.aClass25Array1[super.anInt150].anIntArray215[super.anInt151];
			}
			return this.aClass11_1.method308(local23, local21, Class25.aClass25Array1[super.anInt153].anIntArray218);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("81158, " + 7 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method44() {
		try {
			return this.aClass11_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("23249, " + -27441 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
