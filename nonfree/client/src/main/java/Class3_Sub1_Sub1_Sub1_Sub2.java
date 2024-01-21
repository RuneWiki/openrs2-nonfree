import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LJAXEEYT")
public final class Class3_Sub1_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!LJAXEEYT", name = "sb", descriptor = "Lclient!DDJHHGTJ;")
	public Class5 aClass5_2;

	@OriginalMember(owner = "client!LJAXEEYT", name = "qb", descriptor = "I")
	private int anInt417 = -64;

	@OriginalMember(owner = "client!LJAXEEYT", name = "rb", descriptor = "Z")
	private boolean aBoolean80 = true;

	@OriginalMember(owner = "client!LJAXEEYT", name = "a", descriptor = "(Z)Lclient!OQIGXOFQ;")
	@Override
	protected Class3_Sub1_Sub1_Sub3 method506() {
		try {
			if (this.aClass5_2 == null) {
				return null;
			}
			@Pc(8) Class3_Sub1_Sub1_Sub3 local8 = this.method215();
			if (local8 == null) {
				return null;
			}
			super.anInt393 = local8.anInt743;
			if (super.anInt395 != -1 && super.anInt396 != -1) {
				@Pc(38) Class2 local38 = Class2.aClass2Array1[super.anInt395];
				@Pc(41) Class3_Sub1_Sub1_Sub3 local41 = local38.method18();
				if (local41 != null) {
					@Pc(50) int local50 = local38.aClass39_1.anIntArray183[super.anInt396];
					@Pc(61) Class3_Sub1_Sub1_Sub3 local61 = new Class3_Sub1_Sub1_Sub3(Class47.method554(local50), local41, -575, false, true);
					local61.method334(168, 0, -super.anInt399, 0);
					local61.method328();
					local61.method329(local50);
					local61.anIntArrayArray9 = null;
					local61.anIntArrayArray8 = null;
					if (local38.anInt29 != 128 || local38.anInt30 != 128) {
						local61.method337(local38.anInt30, local38.anInt29, local38.anInt29);
					}
					local61.method338(local38.anInt32 + 64, local38.anInt33 + 850, -30, -50, -30, true);
					@Pc(124) Class3_Sub1_Sub1_Sub3[] local124 = new Class3_Sub1_Sub1_Sub3[] { local8, local61 };
					local8 = new Class3_Sub1_Sub1_Sub3(true, this.anInt417, local124, 2);
				}
			}
			if (this.aClass5_2.aByte1 == 1) {
				local8.aBoolean124 = true;
			}
			return local8;
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("93950, " + false + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJAXEEYT", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method214() {
		try {
			return this.aClass5_2 != null;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("51509, " + -528 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LJAXEEYT", name = "a", descriptor = "(B)Lclient!OQIGXOFQ;")
	private Class3_Sub1_Sub1_Sub3 method215() {
		try {
			@Pc(14) int local14;
			if (super.anInt375 < 0 || super.anInt378 != 0) {
				local14 = -1;
				if (super.anInt371 >= 0) {
					local14 = Class39.aClass39Array1[super.anInt371].anIntArray183[super.anInt372];
				}
				return this.aClass5_2.method20(null, local14, -1);
			}
			local14 = Class39.aClass39Array1[super.anInt375].anIntArray183[super.anInt376];
			@Pc(16) int local16 = -1;
			if (super.anInt371 >= 0 && super.anInt371 != super.anInt404) {
				local16 = Class39.aClass39Array1[super.anInt371].anIntArray183[super.anInt372];
			}
			return this.aClass5_2.method20(Class39.aClass39Array1[super.anInt375].anIntArray186, local14, local16);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("164, " + 38 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
