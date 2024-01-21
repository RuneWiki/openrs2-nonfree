import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DLMOHDFX")
public final class Class5_Sub1_Sub1_Sub3_Sub1 extends Class5_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!DLMOHDFX", name = "tb", descriptor = "Lclient!KFUEEJVZ;")
	public Class24 aClass24_1;

	@OriginalMember(owner = "client!DLMOHDFX", name = "rb", descriptor = "I")
	private int anInt190 = 4006;

	@OriginalMember(owner = "client!DLMOHDFX", name = "sb", descriptor = "B")
	private byte aByte7 = 23;

	@OriginalMember(owner = "client!DLMOHDFX", name = "a", descriptor = "(I)Lclient!VYUQHOMO;")
	@Override
	protected Class5_Sub1_Sub1_Sub6 method372(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.aClass24_1 == null) {
				return null;
			}
			@Pc(12) Class5_Sub1_Sub1_Sub6 local12 = this.method77();
			if (local12 == null) {
				return null;
			}
			super.anInt508 = local12.anInt679;
			if (super.anInt487 != -1 && super.anInt488 != -1) {
				@Pc(33) Class6 local33 = Class6.aClass6Array1[super.anInt487];
				@Pc(36) Class5_Sub1_Sub1_Sub6 local36 = local33.method26();
				if (local36 != null) {
					@Pc(45) int local45 = local33.aClass32_2.anIntArray96[super.anInt488];
					@Pc(57) Class5_Sub1_Sub1_Sub6 local57 = new Class5_Sub1_Sub1_Sub6(true, Class2.method11(local45), local36, this.aByte7, false);
					local57.method390(0, -super.anInt491, 0);
					local57.method384();
					local57.method385(local45);
					local57.anIntArrayArray13 = null;
					local57.anIntArrayArray12 = null;
					if (local33.anInt32 != 128 || local33.anInt33 != 128) {
						local57.method393(local33.anInt32, local33.anInt33, local33.anInt32);
					}
					local57.method394(local33.anInt35 + 64, local33.anInt36 + 850, -30, -50, -30, true);
					@Pc(120) Class5_Sub1_Sub1_Sub6[] local120 = new Class5_Sub1_Sub1_Sub6[] { local12, local57 };
					local12 = new Class5_Sub1_Sub1_Sub6(true, 2, 20, local120);
				}
			}
			if (this.aClass24_1.aByte13 == 1) {
				local12.aBoolean197 = true;
			}
			return local12;
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("94084, " + arg0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLMOHDFX", name = "b", descriptor = "(Z)Lclient!VYUQHOMO;")
	private Class5_Sub1_Sub1_Sub6 method77() {
		try {
			@Pc(14) int local14;
			if (super.anInt463 < 0 || super.anInt466 != 0) {
				local14 = -1;
				if (super.anInt493 >= 0) {
					local14 = Class32.aClass32Array1[super.anInt493].anIntArray96[super.anInt494];
				}
				return this.aClass24_1.method157(local14, null, -1);
			}
			local14 = Class32.aClass32Array1[super.anInt463].anIntArray96[super.anInt464];
			@Pc(16) int local16 = -1;
			if (super.anInt493 >= 0 && super.anInt493 != super.anInt506) {
				local16 = Class32.aClass32Array1[super.anInt493].anIntArray96[super.anInt494];
			}
			return this.aClass24_1.method157(local14, Class32.aClass32Array1[super.anInt463].anIntArray99, local16);
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("73643, " + true + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLMOHDFX", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method236() {
		try {
			return this.aClass24_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("47110, " + -22030 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
