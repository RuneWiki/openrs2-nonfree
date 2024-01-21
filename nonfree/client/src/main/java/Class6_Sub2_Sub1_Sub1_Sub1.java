import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DWBMCYCE")
public final class Class6_Sub2_Sub1_Sub1_Sub1 extends Class6_Sub2_Sub1_Sub1 {

	@OriginalMember(owner = "client!DWBMCYCE", name = "vb", descriptor = "Lclient!APPQAEOL;")
	public Class2 aClass2_1;

	@OriginalMember(owner = "client!DWBMCYCE", name = "ub", descriptor = "I")
	private int anInt154 = -479;

	@OriginalMember(owner = "client!DWBMCYCE", name = "c", descriptor = "(I)Lclient!JUQSYEMB;")
	private Class6_Sub2_Sub1_Sub3 method44() {
		try {
			@Pc(20) int local20;
			if (super.anInt702 < 0 || super.anInt705 != 0) {
				local20 = -1;
				if (super.anInt681 >= 0) {
					local20 = Class21.aClass21Array1[super.anInt681].anIntArray108[super.anInt682];
				}
				return this.aClass2_1.method7(-1, null, local20);
			}
			local20 = Class21.aClass21Array1[super.anInt702].anIntArray108[super.anInt703];
			@Pc(22) int local22 = -1;
			if (super.anInt681 >= 0 && super.anInt681 != super.anInt712) {
				local22 = Class21.aClass21Array1[super.anInt681].anIntArray108[super.anInt682];
			}
			return this.aClass2_1.method7(local22, Class21.aClass21Array1[super.anInt702].anIntArray111, local20);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("66420, " + 484 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DWBMCYCE", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method510() {
		try {
			return this.aClass2_1 != null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("31415, " + 9382 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DWBMCYCE", name = "a", descriptor = "(I)Lclient!JUQSYEMB;")
	@Override
	protected Class6_Sub2_Sub1_Sub3 method529(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass2_1 == null) {
				return null;
			}
			@Pc(8) Class6_Sub2_Sub1_Sub3 local8 = this.method44();
			if (local8 == null) {
				return null;
			}
			super.anInt696 = local8.anInt776;
			@Pc(20) boolean local20 = false;
			if (super.anInt686 != -1 && super.anInt687 != -1) {
				@Pc(33) Class31 local33 = Class31.aClass31Array1[super.anInt686];
				@Pc(36) Class6_Sub2_Sub1_Sub3 local36 = local33.method337();
				if (local36 != null) {
					@Pc(45) int local45 = local33.aClass21_2.anIntArray108[super.anInt687];
					@Pc(56) Class6_Sub2_Sub1_Sub3 local56 = new Class6_Sub2_Sub1_Sub3(false, true, (byte) 119, local36, Class48.method536(local45));
					local56.method146(0, 0, -super.anInt690);
					local56.method140();
					local56.method141(local45);
					local56.anIntArrayArray5 = null;
					local56.anIntArrayArray4 = null;
					if (local33.anInt430 != 128 || local33.anInt431 != 128) {
						local56.method149(local33.anInt430, local33.anInt431, local33.anInt430, this.anInt154);
					}
					local56.method150(local33.anInt433 + 64, local33.anInt434 + 850, -30, -50, -30, true);
					@Pc(120) Class6_Sub2_Sub1_Sub3[] local120 = new Class6_Sub2_Sub1_Sub3[] { local8, local56 };
					local8 = new Class6_Sub2_Sub1_Sub3(true, local120, -889, 2);
				}
			}
			if (this.aClass2_1.aByte2 == 1) {
				local8.aBoolean84 = true;
			}
			return local8;
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("319, " + arg0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}
}
