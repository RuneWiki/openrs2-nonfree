import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NLPNWUNL")
public final class Class1_Sub1_Sub2_Sub2_Sub2 extends Class1_Sub1_Sub2_Sub2 {

	@OriginalMember(owner = "client!NLPNWUNL", name = "vb", descriptor = "Lclient!RBTWCHLG;")
	public Class39 aClass39_2;

	@OriginalMember(owner = "client!NLPNWUNL", name = "rb", descriptor = "B")
	private byte aByte30 = 1;

	@OriginalMember(owner = "client!NLPNWUNL", name = "sb", descriptor = "I")
	private int anInt520 = -374;

	@OriginalMember(owner = "client!NLPNWUNL", name = "tb", descriptor = "I")
	private int anInt521 = -874;

	@OriginalMember(owner = "client!NLPNWUNL", name = "ub", descriptor = "Z")
	private boolean aBoolean103 = true;

	@OriginalMember(owner = "client!NLPNWUNL", name = "c", descriptor = "(I)Lclient!RTQSBWRH;")
	private Class1_Sub1_Sub2_Sub6 method328() {
		try {
			@Pc(14) int local14;
			if (super.anInt510 < 0 || super.anInt513 != 0) {
				local14 = -1;
				if (super.anInt490 >= 0) {
					local14 = Class23.aClass23Array1[super.anInt490].anIntArray76[super.anInt491];
				}
				return this.aClass39_2.method400(null, -1, local14);
			}
			local14 = Class23.aClass23Array1[super.anInt510].anIntArray76[super.anInt511];
			@Pc(16) int local16 = -1;
			if (super.anInt490 >= 0 && super.anInt490 != super.anInt485) {
				local16 = Class23.aClass23Array1[super.anInt490].anIntArray76[super.anInt491];
			}
			return this.aClass39_2.method400(Class23.aClass23Array1[super.anInt510].anIntArray79, local16, local14);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("29058, " + -4952 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NLPNWUNL", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method323() {
		try {
			return this.aClass39_2 != null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("63304, " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NLPNWUNL", name = "a", descriptor = "(I)Lclient!RTQSBWRH;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method410() {
		try {
			if (this.aClass39_2 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub2_Sub6 local8 = this.method328();
			if (local8 == null) {
				return null;
			}
			super.anInt503 = local8.anInt603;
			if (super.anInt470 != -1 && super.anInt471 != -1) {
				@Pc(36) Class44 local36 = Class44.aClass44Array1[super.anInt470];
				@Pc(39) Class1_Sub1_Sub2_Sub6 local39 = local36.method463();
				if (local39 != null) {
					@Pc(48) int local48 = local36.aClass23_2.anIntArray76[super.anInt471];
					@Pc(59) Class1_Sub1_Sub2_Sub6 local59 = new Class1_Sub1_Sub2_Sub6(true, -28456, Class13.method147(local48), local39, false);
					local59.method428(-super.anInt474, 0, 0);
					local59.method422(this.anInt520);
					local59.method423(local48, this.aByte30);
					local59.anIntArrayArray11 = null;
					local59.anIntArrayArray10 = null;
					if (local36.anInt726 != 128 || local36.anInt727 != 128) {
						local59.method431(local36.anInt727, local36.anInt726, local36.anInt726);
					}
					local59.method432(local36.anInt729 + 64, local36.anInt730 + 850, -30, -50, -30, true);
					@Pc(124) Class1_Sub1_Sub2_Sub6[] local124 = new Class1_Sub1_Sub2_Sub6[] { local8, local59 };
					local8 = new Class1_Sub1_Sub2_Sub6((byte) 1, local124, true, 2);
				}
			}
			if (this.aClass39_2.aByte36 == 1) {
				local8.aBoolean130 = true;
			}
			return local8;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("43405, " + -704 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
