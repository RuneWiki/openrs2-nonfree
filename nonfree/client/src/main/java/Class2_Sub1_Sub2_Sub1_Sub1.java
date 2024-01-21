import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DLNPJUEQ")
public final class Class2_Sub1_Sub2_Sub1_Sub1 extends Class2_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!DLNPJUEQ", name = "sb", descriptor = "Lclient!HEKJNUPL;")
	public Class14 aClass14_1;

	@OriginalMember(owner = "client!DLNPJUEQ", name = "qb", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!DLNPJUEQ", name = "rb", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!DLNPJUEQ", name = "a", descriptor = "(B)Lclient!SNMMQNPZ;")
	@Override
	protected Class2_Sub1_Sub2_Sub5 method561(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass14_1 == null) {
				return null;
			}
			@Pc(8) Class2_Sub1_Sub2_Sub5 local8 = this.method79();
			@Pc(13) boolean local13 = false;
			if (local8 == null) {
				return null;
			}
			super.anInt273 = local8.anInt761;
			if (super.anInt251 != -1 && super.anInt252 != -1) {
				@Pc(44) Class27 local44 = Class27.aClass27Array1[super.anInt251];
				@Pc(47) Class2_Sub1_Sub2_Sub5 local47 = local44.method291();
				if (local47 != null) {
					@Pc(56) int local56 = local44.aClass49_1.anIntArray206[super.anInt252];
					@Pc(67) Class2_Sub1_Sub2_Sub5 local67 = new Class2_Sub1_Sub2_Sub5(local47, 707, false, true, Class29.method296(local56));
					local67.method397(0, -super.anInt255, 0);
					local67.method391();
					local67.method392(local56);
					local67.anIntArrayArray13 = null;
					local67.anIntArrayArray12 = null;
					if (local44.anInt484 != 128 || local44.anInt485 != 128) {
						local67.method400(local44.anInt484, local44.anInt484, local44.anInt485);
					}
					local67.method401(local44.anInt487 + 64, local44.anInt488 + 850, -30, -50, -30, true);
					@Pc(130) Class2_Sub1_Sub2_Sub5[] local130 = new Class2_Sub1_Sub2_Sub5[] { local8, local67 };
					local8 = new Class2_Sub1_Sub2_Sub5(false, true, 2, local130);
				}
			}
			if (this.aClass14_1.aByte14 == 1) {
				local8.aBoolean165 = true;
			}
			return local8;
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("34045, " + arg0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNPJUEQ", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method199() {
		try {
			return this.aClass14_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("86079, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNPJUEQ", name = "c", descriptor = "(B)Lclient!SNMMQNPZ;")
	private Class2_Sub1_Sub2_Sub5 method79() {
		try {
			@Pc(14) int local14;
			if (super.anInt277 < 0 || super.anInt280 != 0) {
				local14 = -1;
				if (super.anInt241 >= 0) {
					local14 = Class49.aClass49Array1[super.anInt241].anIntArray206[super.anInt242];
				}
				return this.aClass14_1.method187(this.aBoolean31, local14, null, -1);
			}
			local14 = Class49.aClass49Array1[super.anInt277].anIntArray206[super.anInt278];
			@Pc(16) int local16 = -1;
			if (super.anInt241 >= 0 && super.anInt241 != super.anInt257) {
				local16 = Class49.aClass49Array1[super.anInt241].anIntArray206[super.anInt242];
			}
			return this.aClass14_1.method187(this.aBoolean31, local14, Class49.aClass49Array1[super.anInt277].anIntArray209, local16);
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("67348, " + 74 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
