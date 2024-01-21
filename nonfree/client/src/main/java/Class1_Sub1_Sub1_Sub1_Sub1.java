import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "nb", descriptor = "Lclient!fc;")
	public Class11 aClass11_1;

	@OriginalMember(owner = "client!ab", name = "mb", descriptor = "I")
	private int anInt128 = 487;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method312(@OriginalArg(0) int arg0) {
		try {
			if (this.aClass11_1 == null) {
				return null;
			}
			@Pc(9) Class1_Sub1_Sub1_Sub5 local9 = this.method35(this.anInt128);
			if (arg0 != 0) {
				this.anInt128 = 73;
			}
			if (local9 == null) {
				return null;
			}
			super.anInt178 = local9.anInt579;
			if (super.anInt165 != -1 && super.anInt166 != -1) {
				@Pc(35) Class27 local35 = Class27.aClass27Array1[super.anInt165];
				@Pc(38) Class1_Sub1_Sub1_Sub5 local38 = local35.method490();
				if (local38 != null) {
					@Pc(54) Class1_Sub1_Sub1_Sub5 local54 = new Class1_Sub1_Sub1_Sub5(8, true, !local35.aBoolean166, false, local38);
					local54.method291(-super.anInt169, 0, 0);
					local54.method285();
					local54.method286(local35.aClass25_2.anIntArray215[super.anInt166]);
					local54.anIntArrayArray8 = null;
					local54.anIntArrayArray7 = null;
					if (local35.anInt812 != 128 || local35.anInt813 != 128) {
						local54.method294(local35.anInt812, local35.anInt812, local35.anInt813);
					}
					local54.method295(local35.anInt815 + 64, local35.anInt816 + 850, -30, -50, -30, true);
					@Pc(122) Class1_Sub1_Sub1_Sub5[] local122 = new Class1_Sub1_Sub1_Sub5[] { local9, local54 };
					local9 = new Class1_Sub1_Sub1_Sub5(true, 2, local122, -591);
				}
			}
			if (this.aClass11_1.aByte10 == 1) {
				local9.aBoolean103 = true;
			}
			return local9;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("92669, " + arg0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Lclient!fb;")
	private Class1_Sub1_Sub1_Sub5 method35(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 80 / arg0;
			@Pc(18) int local18;
			if (super.anInt160 < 0 || super.anInt163 != 0) {
				local18 = -1;
				if (super.anInt157 >= 0) {
					local18 = Class25.aClass25Array1[super.anInt157].anIntArray215[super.anInt158];
				}
				return this.aClass11_1.method307(local18, -1, null);
			}
			local18 = Class25.aClass25Array1[super.anInt160].anIntArray215[super.anInt161];
			@Pc(20) int local20 = -1;
			if (super.anInt157 >= 0 && super.anInt157 != super.anInt139) {
				local20 = Class25.aClass25Array1[super.anInt157].anIntArray215[super.anInt158];
			}
			return this.aClass11_1.method307(local18, local20, Class25.aClass25Array1[super.anInt160].anIntArray218);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("46629, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method44() {
		try {
			return this.aClass11_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("37108, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
