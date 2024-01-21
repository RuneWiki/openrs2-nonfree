import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YQBVAFEO")
public final class Class1_Sub2_Sub2_Sub1_Sub2 extends Class1_Sub2_Sub2_Sub1 {

	@OriginalMember(owner = "client!YQBVAFEO", name = "qb", descriptor = "Lclient!PFWIJTDA;")
	public Class34 aClass34_2;

	@OriginalMember(owner = "client!YQBVAFEO", name = "nb", descriptor = "I")
	private int anInt789 = 9;

	@OriginalMember(owner = "client!YQBVAFEO", name = "ob", descriptor = "B")
	private byte aByte37 = -8;

	@OriginalMember(owner = "client!YQBVAFEO", name = "pb", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!YQBVAFEO", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method568() {
		try {
			return this.aClass34_2 != null;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("2575, " + 5 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YQBVAFEO", name = "a", descriptor = "(I)Lclient!IRLTEWJP;")
	@Override
	protected Class1_Sub2_Sub2_Sub3 method574() {
		try {
			if (this.aClass34_2 == null) {
				return null;
			}
			@Pc(8) Class1_Sub2_Sub2_Sub3 local8 = this.method570();
			if (local8 == null) {
				return null;
			}
			super.anInt756 = local8.anInt791;
			if (super.anInt780 != -1 && super.anInt781 != -1) {
				@Pc(39) Class33 local39 = Class33.aClass33Array1[super.anInt780];
				@Pc(42) Class1_Sub2_Sub2_Sub3 local42 = local39.method355();
				if (local42 != null) {
					@Pc(51) int local51 = local39.aClass36_1.anIntArray131[super.anInt781];
					@Pc(62) Class1_Sub2_Sub2_Sub3 local62 = new Class1_Sub2_Sub2_Sub3(local42, false, 0, Class11.method123(local51), true);
					local62.method209(0, 0, -super.anInt784);
					local62.method203();
					local62.method204(local51);
					local62.anIntArrayArray11 = null;
					local62.anIntArrayArray10 = null;
					if (local39.anInt501 != 128 || local39.anInt502 != 128) {
						local62.method212(local39.anInt501, this.aByte37, local39.anInt502, local39.anInt501);
					}
					local62.method213(local39.anInt504 + 64, local39.anInt505 + 850, -30, -50, -30, true);
					@Pc(126) Class1_Sub2_Sub2_Sub3[] local126 = new Class1_Sub2_Sub2_Sub3[] { local8, local62 };
					local8 = new Class1_Sub2_Sub2_Sub3(true, 2, 163, local126);
				}
			}
			if (this.aClass34_2.aByte24 == 1) {
				local8.aBoolean69 = true;
			}
			return local8;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("75732, " + -840 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YQBVAFEO", name = "c", descriptor = "(I)Lclient!IRLTEWJP;")
	private Class1_Sub2_Sub2_Sub3 method570() {
		try {
			@Pc(27) int local27;
			if (super.anInt764 < 0 || super.anInt767 != 0) {
				local27 = -1;
				if (super.anInt744 >= 0) {
					local27 = Class36.aClass36Array1[super.anInt744].anIntArray131[super.anInt745];
				}
				return this.aClass34_2.method360(null, -1, local27, 670);
			}
			local27 = Class36.aClass36Array1[super.anInt764].anIntArray131[super.anInt765];
			@Pc(29) int local29 = -1;
			if (super.anInt744 >= 0 && super.anInt744 != super.anInt786) {
				local29 = Class36.aClass36Array1[super.anInt744].anIntArray131[super.anInt745];
			}
			return this.aClass34_2.method360(Class36.aClass36Array1[super.anInt764].anIntArray134, local29, local27, 670);
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("32539, " + -390 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
