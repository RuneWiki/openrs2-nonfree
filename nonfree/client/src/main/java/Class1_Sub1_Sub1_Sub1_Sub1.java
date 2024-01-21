import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!ab", name = "rb", descriptor = "B")
	private byte aByte5 = 0;

	@OriginalMember(owner = "client!ab", name = "sb", descriptor = "Z")
	private boolean aBoolean21 = true;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) byte arg0) {
		try {
			if (this.aClass13_1 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub5 local8 = this.method39(372);
			if (local8 == null) {
				return null;
			}
			super.anInt175 = local8.anInt581;
			if (super.anInt162 != -1 && super.anInt163 != -1) {
				@Pc(40) Class32 local40 = Class32.aClass32Array1[super.anInt162];
				@Pc(43) Class1_Sub1_Sub1_Sub5 local43 = local40.method530();
				if (local43 != null) {
					@Pc(52) int local52 = local40.aClass27_2.anIntArray227[super.anInt163];
					@Pc(63) Class1_Sub1_Sub1_Sub5 local63 = new Class1_Sub1_Sub1_Sub5(Class14.method328((byte) 7, local52), false, true, true, local43);
					local63.method301(0, 0, -super.anInt166);
					local63.method295();
					local63.method296(this.aByte5, local52);
					local63.anIntArrayArray8 = null;
					local63.anIntArrayArray7 = null;
					if (local40.anInt869 != 128 || local40.anInt870 != 128) {
						local63.method304(local40.anInt869, local40.anInt870, local40.anInt869);
					}
					local63.method305(local40.anInt872 + 64, local40.anInt873 + 850, -30, -50, -30, true);
					@Pc(127) Class1_Sub1_Sub1_Sub5[] local127 = new Class1_Sub1_Sub1_Sub5[] { local8, local63 };
					local8 = new Class1_Sub1_Sub1_Sub5(local127, true, 2, 0);
				}
			}
			if (this.aClass13_1.aByte39 == 1) {
				local8.aBoolean131 = true;
			}
			return local8;
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("34611, " + 8 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method39(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(18) int local18;
			if (super.anInt157 < 0 || super.anInt160 != 0) {
				local18 = -1;
				if (super.anInt154 >= 0) {
					local18 = Class27.aClass27Array1[super.anInt154].anIntArray227[super.anInt155];
				}
				return this.aClass13_1.method322(local18, -1, null);
			}
			local18 = Class27.aClass27Array1[super.anInt157].anIntArray227[super.anInt158];
			@Pc(20) int local20 = -1;
			if (super.anInt154 >= 0 && super.anInt154 != super.anInt138) {
				local20 = Class27.aClass27Array1[super.anInt154].anIntArray227[super.anInt155];
			}
			return this.aClass13_1.method322(local18, local20, Class27.aClass27Array1[super.anInt157].anIntArray230);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("41414, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method49() {
		try {
			return this.aClass13_1 != null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("98371, " + -42790 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}
}
