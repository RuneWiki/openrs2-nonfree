import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VMSVDNWD")
public final class Class4_Sub1_Sub2_Sub5_Sub1 extends Class4_Sub1_Sub2_Sub5 {

	@OriginalMember(owner = "client!VMSVDNWD", name = "rb", descriptor = "Lclient!RDFTXEYV;")
	public Class33 aClass33_1;

	@OriginalMember(owner = "client!VMSVDNWD", name = "qb", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!VMSVDNWD", name = "a", descriptor = "(B)Lclient!KUGNQTGL;")
	@Override
	protected Class4_Sub1_Sub2_Sub3 method575() {
		try {
			if (this.aClass33_1 == null) {
				return null;
			}
			@Pc(11) Class4_Sub1_Sub2_Sub3 local11 = this.method422(this.aBoolean172);
			if (local11 == null) {
				return null;
			}
			super.anInt731 = local11.anInt799;
			if (super.anInt689 != -1 && super.anInt690 != -1) {
				@Pc(45) Class16 local45 = Class16.aClass16Array1[super.anInt689];
				@Pc(48) Class4_Sub1_Sub2_Sub3 local48 = local45.method215();
				if (local48 != null) {
					@Pc(57) int local57 = local45.aClass27_2.anIntArray95[super.anInt690];
					@Pc(68) Class4_Sub1_Sub2_Sub3 local68 = new Class4_Sub1_Sub2_Sub3(local48, false, true, Class37.method388(local57), 584);
					local68.method268(0, 0, -super.anInt693, (byte) 8);
					local68.method262();
					local68.method263(local57);
					local68.anIntArrayArray3 = null;
					local68.anIntArrayArray2 = null;
					if (local45.anInt184 != 128 || local45.anInt185 != 128) {
						local68.method271(local45.anInt184, local45.anInt184, local45.anInt185);
					}
					local68.method272(local45.anInt187 + 64, local45.anInt188 + 850, -30, -50, -30, true);
					@Pc(131) Class4_Sub1_Sub2_Sub3[] local131 = new Class4_Sub1_Sub2_Sub3[] { local11, local68 };
					local11 = new Class4_Sub1_Sub2_Sub3(false, local131, true, 2);
				}
			}
			if (this.aClass33_1.aByte25 == 1) {
				local11.aBoolean90 = true;
			}
			return local11;
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("3648, " + 0 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMSVDNWD", name = "a", descriptor = "(Z)Lclient!KUGNQTGL;")
	private Class4_Sub1_Sub2_Sub3 method422(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(14) int local14;
			if (super.anInt715 >= 0 && super.anInt718 == 0) {
				local14 = Class27.aClass27Array1[super.anInt715].anIntArray95[super.anInt716];
				@Pc(16) int local16 = -1;
				if (super.anInt712 >= 0 && super.anInt712 != super.anInt724) {
					local16 = Class27.aClass27Array1[super.anInt712].anIntArray95[super.anInt713];
				}
				return this.aClass33_1.method368(local14, local16, Class27.aClass27Array1[super.anInt715].anIntArray98);
			}
			local14 = -1;
			if (arg0) {
				throw new NullPointerException();
			}
			if (super.anInt712 >= 0) {
				local14 = Class27.aClass27Array1[super.anInt712].anIntArray95[super.anInt713];
			}
			return this.aClass33_1.method368(local14, -1, null);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("51459, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMSVDNWD", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method499(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.aClass33_1 != null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("39197, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}
}
