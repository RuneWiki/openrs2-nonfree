import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ACKJULTZ")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ACKJULTZ", name = "qb", descriptor = "Lclient!LQFHJGYA;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!ACKJULTZ", name = "pb", descriptor = "I")
	private int anInt105 = 964;

	@OriginalMember(owner = "client!ACKJULTZ", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method112(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return this.aClass21_1 != null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("18390, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ACKJULTZ", name = "a", descriptor = "(Z)Lclient!PDVZPZLT;")
	private Class1_Sub1_Sub1_Sub4 method26() {
		try {
			@Pc(14) int local14;
			if (super.anInt226 < 0 || super.anInt229 != 0) {
				local14 = -1;
				if (super.anInt237 >= 0) {
					local14 = Class19.aClass19Array1[super.anInt237].anIntArray82[super.anInt238];
				}
				return this.aClass21_1.method252(null, local14, -1);
			}
			local14 = Class19.aClass19Array1[super.anInt226].anIntArray82[super.anInt227];
			@Pc(16) int local16 = -1;
			if (super.anInt237 >= 0 && super.anInt237 != super.anInt235) {
				local16 = Class19.aClass19Array1[super.anInt237].anIntArray82[super.anInt238];
			}
			return this.aClass21_1.method252(Class19.aClass19Array1[super.anInt226].anIntArray85, local14, local16);
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("2462, " + false + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ACKJULTZ", name = "a", descriptor = "(B)Lclient!PDVZPZLT;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method497(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass21_1 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub4 local8 = this.method26();
			if (local8 == null) {
				return null;
			}
			super.anInt194 = local8.anInt706;
			if (super.anInt199 != -1 && super.anInt200 != -1) {
				@Pc(36) Class25 local36 = Class25.aClass25Array1[super.anInt199];
				@Pc(39) Class1_Sub1_Sub1_Sub4 local39 = local36.method278();
				if (local39 != null) {
					@Pc(48) int local48 = local36.aClass19_1.anIntArray82[super.anInt200];
					@Pc(59) Class1_Sub1_Sub1_Sub4 local59 = new Class1_Sub1_Sub1_Sub4(local39, true, Class49.method573(local48), 0, false);
					local59.method376(0, -super.anInt203, 0);
					local59.method370();
					local59.method371(local48);
					local59.anIntArrayArray12 = null;
					local59.anIntArrayArray11 = null;
					if (local36.anInt473 != 128 || local36.anInt474 != 128) {
						local59.method379(local36.anInt473, local36.anInt474, local36.anInt473);
					}
					local59.method380(local36.anInt476 + 64, local36.anInt477 + 850, -30, -50, -30, true);
					@Pc(122) Class1_Sub1_Sub1_Sub4[] local122 = new Class1_Sub1_Sub1_Sub4[] { local8, local59 };
					local8 = new Class1_Sub1_Sub1_Sub4(7, local122, true, 2);
				}
			}
			if (this.aClass21_1.aByte10 == 1) {
				local8.aBoolean125 = true;
			}
			return local8;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("97449, " + 6 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
