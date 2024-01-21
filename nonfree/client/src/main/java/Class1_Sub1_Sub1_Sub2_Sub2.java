import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KLQFDPHO")
public final class Class1_Sub1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!KLQFDPHO", name = "sb", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!KLQFDPHO", name = "vb", descriptor = "Lclient!QYNFXHXW;")
	public Class31 aClass31_2;

	@OriginalMember(owner = "client!KLQFDPHO", name = "tb", descriptor = "I")
	private int anInt472 = 1;

	@OriginalMember(owner = "client!KLQFDPHO", name = "ub", descriptor = "I")
	private int anInt473 = 772;

	@OriginalMember(owner = "client!KLQFDPHO", name = "c", descriptor = "(I)Lclient!OJGAHFXC;")
	private Class1_Sub1_Sub1_Sub5 method305() {
		try {
			@Pc(16) int local16;
			if (super.anInt451 < 0 || super.anInt454 != 0) {
				local16 = -1;
				if (super.anInt463 >= 0) {
					local16 = Class7.aClass7Array1[super.anInt463].anIntArray27[super.anInt464];
				}
				return this.aClass31_2.method480(null, 653, local16, -1);
			}
			local16 = Class7.aClass7Array1[super.anInt451].anIntArray27[super.anInt452];
			@Pc(18) int local18 = -1;
			if (super.anInt463 >= 0 && super.anInt463 != super.anInt461) {
				local18 = Class7.aClass7Array1[super.anInt463].anIntArray27[super.anInt464];
			}
			return this.aClass31_2.method480(Class7.aClass7Array1[super.anInt451].anIntArray30, 653, local16, local18);
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("11644, " + -61 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KLQFDPHO", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method302(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.aClass31_2 != null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("46838, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KLQFDPHO", name = "a", descriptor = "(I)Lclient!OJGAHFXC;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method504(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass31_2 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub5 local8 = this.method305();
			if (local8 == null) {
				return null;
			}
			super.anInt468 = local8.anInt716;
			@Pc(20) boolean local20 = false;
			if (super.anInt422 != -1 && super.anInt423 != -1) {
				@Pc(33) Class46 local33 = Class46.aClass46Array1[super.anInt422];
				@Pc(36) Class1_Sub1_Sub1_Sub5 local36 = local33.method554();
				if (local36 != null) {
					@Pc(45) int local45 = local33.aClass7_2.anIntArray27[super.anInt423];
					@Pc(56) Class1_Sub1_Sub1_Sub5 local56 = new Class1_Sub1_Sub1_Sub5(Class23.method343(local45, (byte) 1), false, true, -900, local36);
					local56.method392(-super.anInt426, 0, 0);
					local56.method386(this.anInt471);
					local56.method387(local45);
					local56.anIntArrayArray11 = null;
					local56.anIntArrayArray10 = null;
					if (local33.anInt818 != 128 || local33.anInt819 != 128) {
						local56.method395(local33.anInt818, this.anInt472, local33.anInt819, local33.anInt818);
					}
					local56.method396(local33.anInt821 + 64, local33.anInt822 + 850, -30, -50, -30, true);
					@Pc(121) Class1_Sub1_Sub1_Sub5[] local121 = new Class1_Sub1_Sub1_Sub5[] { local8, local56 };
					local8 = new Class1_Sub1_Sub1_Sub5(true, local121, 2, true);
				}
			}
			if (this.aClass31_2.aByte18 == 1) {
				local8.aBoolean116 = true;
			}
			return local8;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("27830, " + arg0 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
