import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QDXHSLSL")
public final class Class8_Sub1_Sub2_Sub4_Sub2 extends Class8_Sub1_Sub2_Sub4 {

	@OriginalMember(owner = "client!QDXHSLSL", name = "ub", descriptor = "Lclient!LPTCUHOU;")
	public Class26 aClass26_2;

	@OriginalMember(owner = "client!QDXHSLSL", name = "pb", descriptor = "Z")
	private boolean aBoolean124 = false;

	@OriginalMember(owner = "client!QDXHSLSL", name = "qb", descriptor = "B")
	private byte aByte24 = 1;

	@OriginalMember(owner = "client!QDXHSLSL", name = "rb", descriptor = "Z")
	private boolean aBoolean125 = false;

	@OriginalMember(owner = "client!QDXHSLSL", name = "sb", descriptor = "Z")
	private boolean aBoolean126 = false;

	@OriginalMember(owner = "client!QDXHSLSL", name = "tb", descriptor = "I")
	private int anInt590 = -938;

	@OriginalMember(owner = "client!QDXHSLSL", name = "a", descriptor = "(I)Lclient!VHYCWIPJ;")
	@Override
	protected Class8_Sub1_Sub2_Sub5 method557() {
		try {
			if (this.aClass26_2 == null) {
				return null;
			}
			@Pc(8) Class8_Sub1_Sub2_Sub5 local8 = this.method380();
			if (local8 == null) {
				return null;
			}
			super.anInt544 = local8.anInt788;
			if (super.anInt551 != -1 && super.anInt552 != -1) {
				@Pc(38) Class44 local38 = Class44.aClass44Array1[super.anInt551];
				@Pc(41) Class8_Sub1_Sub2_Sub5 local41 = local38.method551();
				if (local41 != null) {
					@Pc(50) int local50 = local38.aClass40_1.anIntArray159[super.anInt552];
					@Pc(62) Class8_Sub1_Sub2_Sub5 local62 = new Class8_Sub1_Sub2_Sub5((byte) 9, Class35.method448(local50, this.aByte24), true, false, local41);
					local62.method476(0, 0, -super.anInt555);
					local62.method470();
					local62.method471(local50);
					local62.anIntArrayArray16 = null;
					local62.anIntArrayArray15 = null;
					if (local38.anInt780 != 128 || local38.anInt781 != 128) {
						local62.method479(this.aBoolean124, local38.anInt780, local38.anInt780, local38.anInt781);
					}
					local62.method480(local38.anInt783 + 64, local38.anInt784 + 850, -30, -50, -30, true);
					@Pc(126) Class8_Sub1_Sub2_Sub5[] local126 = new Class8_Sub1_Sub2_Sub5[] { local8, local62 };
					local8 = new Class8_Sub1_Sub2_Sub5(2, true, 7, local126);
				}
			}
			if (this.aClass26_2.aByte19 == 1) {
				local8.aBoolean160 = true;
			}
			return local8;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("8803, " + -650 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QDXHSLSL", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method378(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return this.aClass26_2 != null;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("85266, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QDXHSLSL", name = "b", descriptor = "(I)Lclient!VHYCWIPJ;")
	private Class8_Sub1_Sub2_Sub5 method380() {
		try {
			@Pc(14) int local14;
			if (super.anInt578 < 0 || super.anInt581 != 0) {
				local14 = -1;
				if (super.anInt587 >= 0) {
					local14 = Class40.aClass40Array1[super.anInt587].anIntArray159[super.anInt588];
				}
				return this.aClass26_2.method322(null, -1, local14);
			}
			local14 = Class40.aClass40Array1[super.anInt578].anIntArray159[super.anInt579];
			@Pc(16) int local16 = -1;
			if (super.anInt587 >= 0 && super.anInt587 != super.anInt546) {
				local16 = Class40.aClass40Array1[super.anInt587].anIntArray159[super.anInt588];
			}
			return this.aClass26_2.method322(Class40.aClass40Array1[super.anInt578].anIntArray162, local16, local14);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("60378, " + -938 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}
}
