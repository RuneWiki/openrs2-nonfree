import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CWNCPMLX")
public final class Class1_Sub1_Sub2_Sub1_Sub1 extends Class1_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!CWNCPMLX", name = "sb", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!CWNCPMLX", name = "vb", descriptor = "Lclient!CKDEJADD;")
	public Class6 aClass6_1;

	@OriginalMember(owner = "client!CWNCPMLX", name = "tb", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!CWNCPMLX", name = "ub", descriptor = "I")
	private int anInt168 = 9;

	@OriginalMember(owner = "client!CWNCPMLX", name = "b", descriptor = "(I)Lclient!ZKARKDQW;")
	private Class1_Sub1_Sub2_Sub6 method83() {
		try {
			@Pc(23) int local23;
			if (super.anInt245 < 0 || super.anInt248 != 0) {
				local23 = -1;
				if (super.anInt236 >= 0) {
					local23 = Class22.aClass22Array1[super.anInt236].anIntArray76[super.anInt237];
				}
				return this.aClass6_1.method34(-1, local23, null);
			}
			local23 = Class22.aClass22Array1[super.anInt245].anIntArray76[super.anInt246];
			@Pc(25) int local25 = -1;
			if (super.anInt236 >= 0 && super.anInt236 != super.anInt233) {
				local25 = Class22.aClass22Array1[super.anInt236].anIntArray76[super.anInt237];
			}
			return this.aClass6_1.method34(local25, local23, Class22.aClass22Array1[super.anInt245].anIntArray79);
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("92140, " + 0 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWNCPMLX", name = "a", descriptor = "(I)Lclient!ZKARKDQW;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method529() {
		try {
			if (this.aClass6_1 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub2_Sub6 local8 = this.method83();
			if (local8 == null) {
				return null;
			}
			super.anInt230 = local8.anInt790;
			if (super.anInt239 != -1 && super.anInt240 != -1) {
				@Pc(35) Class25 local35 = Class25.aClass25Array1[super.anInt239];
				@Pc(38) Class1_Sub1_Sub2_Sub6 local38 = local35.method309();
				if (local38 != null) {
					@Pc(47) int local47 = local35.aClass22_1.anIntArray76[super.anInt240];
					@Pc(58) Class1_Sub1_Sub2_Sub6 local58 = new Class1_Sub1_Sub2_Sub6(9, true, Class37.method456(local47), false, local38);
					local58.method547(0, -super.anInt243, 0);
					local58.method541();
					local58.method542(local47);
					local58.anIntArrayArray19 = null;
					local58.anIntArrayArray18 = null;
					if (local35.anInt488 != 128 || local35.anInt489 != 128) {
						local58.method550(local35.anInt488, local35.anInt488, this.anInt168, local35.anInt489);
					}
					local58.method551(local35.anInt491 + 64, local35.anInt492 + 850, -30, -50, -30, true);
					@Pc(122) Class1_Sub1_Sub2_Sub6[] local122 = new Class1_Sub1_Sub2_Sub6[] { local8, local58 };
					local8 = new Class1_Sub1_Sub2_Sub6(2, -819, true, local122);
				}
			}
			if (this.aClass6_1.aByte1 == 1) {
				local8.aBoolean211 = true;
			}
			return local8;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("13848, " + 4016 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWNCPMLX", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method132(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.aBoolean34 = !this.aBoolean34;
			}
			return this.aClass6_1 != null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("58947, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
