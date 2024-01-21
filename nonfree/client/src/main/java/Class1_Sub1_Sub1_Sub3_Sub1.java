import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HGVATLQF")
public final class Class1_Sub1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!HGVATLQF", name = "vb", descriptor = "Lclient!RRZTMHXJ;")
	public Class38 aClass38_1;

	@OriginalMember(owner = "client!HGVATLQF", name = "sb", descriptor = "I")
	private int anInt308 = 5;

	@OriginalMember(owner = "client!HGVATLQF", name = "tb", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!HGVATLQF", name = "ub", descriptor = "B")
	private byte aByte8 = 8;

	@OriginalMember(owner = "client!HGVATLQF", name = "a", descriptor = "(I)Lclient!JLNSJQDR;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method509(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass38_1 == null) {
				return null;
			}
			@Pc(9) Class1_Sub1_Sub1_Sub4 local9 = this.method204(this.aByte8);
			if (local9 == null) {
				return null;
			}
			super.anInt572 = local9.anInt766;
			if (arg0 < this.anInt308 || arg0 > this.anInt308) {
				throw new NullPointerException();
			}
			if (super.anInt564 != -1 && super.anInt565 != -1) {
				@Pc(42) Class25 local42 = Class25.aClass25Array1[super.anInt564];
				@Pc(45) Class1_Sub1_Sub1_Sub4 local45 = local42.method334();
				if (local45 != null) {
					@Pc(54) int local54 = local42.aClass29_1.anIntArray140[super.anInt565];
					@Pc(65) Class1_Sub1_Sub1_Sub4 local65 = new Class1_Sub1_Sub1_Sub4(Class42.method479(local54), false, true, true, local45);
					local65.method252(-super.anInt568, 0, 0);
					local65.method246();
					local65.method247(local54);
					local65.anIntArrayArray11 = null;
					local65.anIntArrayArray10 = null;
					if (local42.anInt475 != 128 || local42.anInt476 != 128) {
						local65.method255(local42.anInt475, local42.anInt476, local42.anInt475);
					}
					local65.method256(local42.anInt478 + 64, local42.anInt479 + 850, -30, -50, -30, true);
					@Pc(128) Class1_Sub1_Sub1_Sub4[] local128 = new Class1_Sub1_Sub1_Sub4[] { local9, local65 };
					local9 = new Class1_Sub1_Sub1_Sub4(true, local128, 2, false);
				}
			}
			if (this.aClass38_1.aByte26 == 1) {
				local9.aBoolean87 = true;
			}
			return local9;
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("88691, " + arg0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGVATLQF", name = "a", descriptor = "(B)Lclient!JLNSJQDR;")
	private Class1_Sub1_Sub1_Sub4 method204(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) int local4;
			if (arg0 != 8) {
				for (local4 = 1; local4 > 0; local4++) {
				}
			}
			if (super.anInt590 < 0 || super.anInt593 != 0) {
				local4 = -1;
				if (super.anInt583 >= 0) {
					local4 = Class29.aClass29Array1[super.anInt583].anIntArray140[super.anInt584];
				}
				return this.aClass38_1.method414(null, local4, -1);
			}
			local4 = Class29.aClass29Array1[super.anInt590].anIntArray140[super.anInt591];
			@Pc(26) int local26 = -1;
			if (super.anInt583 >= 0 && super.anInt583 != super.anInt598) {
				local26 = Class29.aClass29Array1[super.anInt583].anIntArray140[super.anInt584];
			}
			return this.aClass38_1.method414(Class29.aClass29Array1[super.anInt590].anIntArray143, local4, local26);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("22990, " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HGVATLQF", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method389() {
		try {
			return this.aClass38_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("66050, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
