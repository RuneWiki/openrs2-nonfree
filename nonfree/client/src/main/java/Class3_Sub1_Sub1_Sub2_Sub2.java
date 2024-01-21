import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JMUIRIHZ")
public final class Class3_Sub1_Sub1_Sub2_Sub2 extends Class3_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!JMUIRIHZ", name = "vb", descriptor = "Lclient!VWKJSKWX;")
	public Class40 aClass40_2;

	@OriginalMember(owner = "client!JMUIRIHZ", name = "rb", descriptor = "B")
	private byte aByte8 = 1;

	@OriginalMember(owner = "client!JMUIRIHZ", name = "sb", descriptor = "I")
	private int anInt362 = -47054;

	@OriginalMember(owner = "client!JMUIRIHZ", name = "tb", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!JMUIRIHZ", name = "ub", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!JMUIRIHZ", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method157() {
		try {
			return this.aClass40_2 != null;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("9003, " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JMUIRIHZ", name = "b", descriptor = "(Z)Lclient!CADBNSXE;")
	private Class3_Sub1_Sub1_Sub1 method160(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(14) int local14;
			if (super.anInt356 >= 0 && super.anInt359 == 0) {
				local14 = Class38.aClass38Array1[super.anInt356].anIntArray191[super.anInt357];
				@Pc(16) int local16 = -1;
				if (super.anInt333 >= 0 && super.anInt333 != super.anInt327) {
					local16 = Class38.aClass38Array1[super.anInt333].anIntArray191[super.anInt334];
				}
				return this.aClass40_2.method535(119, local16, local14, Class38.aClass38Array1[super.anInt356].anIntArray194);
			}
			local14 = -1;
			if (arg0) {
				this.anInt362 = -30;
			}
			if (super.anInt333 >= 0) {
				local14 = Class38.aClass38Array1[super.anInt333].anIntArray191[super.anInt334];
			}
			return this.aClass40_2.method535(119, -1, local14, null);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("33576, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JMUIRIHZ", name = "a", descriptor = "(I)Lclient!CADBNSXE;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method562(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			} else if (this.aClass40_2 == null) {
				return null;
			} else {
				@Pc(15) Class3_Sub1_Sub1_Sub1 local15 = this.method160(this.aBoolean73);
				if (local15 == null) {
					return null;
				}
				super.anInt361 = local15.anInt799;
				if (super.anInt315 != -1 && super.anInt316 != -1) {
					@Pc(36) Class44 local36 = Class44.aClass44Array1[super.anInt315];
					@Pc(39) Class3_Sub1_Sub1_Sub1 local39 = local36.method552();
					if (local39 != null) {
						@Pc(48) int local48 = local36.aClass38_2.anIntArray191[super.anInt316];
						@Pc(60) Class3_Sub1_Sub1_Sub1 local60 = new Class3_Sub1_Sub1_Sub1(false, Class7.method94(local48), local39, this.aByte8, true);
						local60.method35(-super.anInt319, 0, 0);
						local60.method29();
						local60.method30(local48);
						local60.anIntArrayArray3 = null;
						local60.anIntArrayArray2 = null;
						if (local36.anInt764 != 128 || local36.anInt765 != 128) {
							local60.method38(local36.anInt764, local36.anInt765, local36.anInt764);
						}
						local60.method39(local36.anInt767 + 64, local36.anInt768 + 850, -30, -50, -30, true);
						@Pc(123) Class3_Sub1_Sub1_Sub1[] local123 = new Class3_Sub1_Sub1_Sub1[] { local15, local60 };
						local15 = new Class3_Sub1_Sub1_Sub1(true, 6, local123, 2);
					}
				}
				if (this.aClass40_2.aByte37 == 1) {
					local15.aBoolean15 = true;
				}
				return local15;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("18018, " + arg0 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
