import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TVKIEQYR")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!TVKIEQYR", name = "rb", descriptor = "Lclient!ZNUYRYPY;")
	public Class49 aClass49_2;

	@OriginalMember(owner = "client!TVKIEQYR", name = "qb", descriptor = "Z")
	private boolean aBoolean160 = true;

	@OriginalMember(owner = "client!TVKIEQYR", name = "a", descriptor = "(I)Lclient!HEQROJXW;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method547() {
		try {
			if (this.aClass49_2 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub4 local8 = this.method502((byte) 6);
			if (local8 == null) {
				return null;
			}
			super.anInt632 = local8.anInt788;
			if (super.anInt634 != -1 && super.anInt635 != -1) {
				@Pc(40) Class38 local40 = Class38.aClass38Array1[super.anInt634];
				@Pc(43) Class1_Sub1_Sub1_Sub4 local43 = local40.method513();
				if (local43 != null) {
					@Pc(52) int local52 = local40.aClass46_2.anIntArray196[super.anInt635];
					@Pc(63) Class1_Sub1_Sub1_Sub4 local63 = new Class1_Sub1_Sub1_Sub4(-167, false, true, Class37.method510(local52), local43);
					local63.method283(-super.anInt638, 0, 0);
					local63.method277();
					local63.method278(local52);
					local63.anIntArrayArray12 = null;
					local63.anIntArrayArray11 = null;
					if (local40.anInt680 != 128 || local40.anInt681 != 128) {
						local63.method286(local40.anInt681, local40.anInt680, local40.anInt680);
					}
					local63.method287(local40.anInt683 + 64, local40.anInt684 + 850, -30, -50, -30, true);
					@Pc(126) Class1_Sub1_Sub1_Sub4[] local126 = new Class1_Sub1_Sub1_Sub4[] { local8, local63 };
					local8 = new Class1_Sub1_Sub1_Sub4(true, 2, local126, true);
				}
			}
			if (this.aClass49_2.aByte35 == 1) {
				local8.aBoolean97 = true;
			}
			return local8;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("42729, " + 8 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TVKIEQYR", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method498() {
		try {
			return this.aClass49_2 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("38183, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TVKIEQYR", name = "a", descriptor = "(B)Lclient!HEQROJXW;")
	private Class1_Sub1_Sub1_Sub4 method502(@OriginalArg(0) byte arg0) {
		try {
			@Pc(16) int local16;
			if (super.anInt659 < 0 || super.anInt662 != 0) {
				local16 = -1;
				@Pc(54) boolean local54 = false;
				if (super.anInt624 >= 0) {
					local16 = Class46.aClass46Array1[super.anInt624].anIntArray196[super.anInt625];
				}
				return this.aClass49_2.method562(null, -1, local16);
			}
			local16 = Class46.aClass46Array1[super.anInt659].anIntArray196[super.anInt660];
			@Pc(18) int local18 = -1;
			if (super.anInt624 >= 0 && super.anInt624 != super.anInt630) {
				local18 = Class46.aClass46Array1[super.anInt624].anIntArray196[super.anInt625];
			}
			return this.aClass49_2.method562(Class46.aClass46Array1[super.anInt659].anIntArray199, local18, local16);
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("21242, " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}
}
