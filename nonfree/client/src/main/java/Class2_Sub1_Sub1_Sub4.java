import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class2_Sub1_Sub1_Sub4 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!i", name = "vb", descriptor = "I")
	private final int anInt1339;

	@OriginalMember(owner = "client!i", name = "tb", descriptor = "I")
	private final int anInt1337;

	@OriginalMember(owner = "client!i", name = "Cb", descriptor = "I")
	private final int anInt1345;

	@OriginalMember(owner = "client!i", name = "zb", descriptor = "I")
	private final int anInt1342;

	@OriginalMember(owner = "client!i", name = "Nb", descriptor = "I")
	private final int anInt1351;

	@OriginalMember(owner = "client!i", name = "Qb", descriptor = "I")
	private final int anInt1352;

	@OriginalMember(owner = "client!i", name = "Gb", descriptor = "I")
	private final int anInt1347;

	@OriginalMember(owner = "client!i", name = "Pb", descriptor = "Lclient!gd;")
	private Class2_Sub1_Sub6 aClass2_Sub1_Sub6_2;

	@OriginalMember(owner = "client!i", name = "Eb", descriptor = "I")
	private int anInt1346;

	@OriginalMember(owner = "client!i", name = "Ab", descriptor = "I")
	private int anInt1343;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(IIIIIIIIZ)V")
	public Class2_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt1339 = arg2;
		this.anInt1337 = arg5;
		this.anInt1345 = arg1;
		this.anInt1342 = arg3;
		this.anInt1351 = arg0;
		this.anInt1352 = arg6;
		this.anInt1347 = arg4;
		if (arg7 != -1) {
			this.aClass2_Sub1_Sub6_2 = Static71.method1291(arg7);
			this.anInt1346 = Static108.anInt2902 - 1;
			this.anInt1343 = 0;
			if (arg8 && this.aClass2_Sub1_Sub6_2.anInt1205 != -1) {
				this.anInt1343 = (int) ((double) this.aClass2_Sub1_Sub6_2.anIntArray155.length * Math.random());
				this.anInt1346 -= (int) ((double) this.aClass2_Sub1_Sub6_2.anIntArray157[this.anInt1343] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(B)Lclient!r;")
	@Override
	public Class2_Sub1_Sub1_Sub6 method1512() {
		if (this.aClass2_Sub1_Sub6_2 != null) {
			@Pc(19) int local19 = Static108.anInt2902 - this.anInt1346;
			if (local19 > 100 && this.aClass2_Sub1_Sub6_2.anInt1205 > 0) {
				local19 = 100;
			}
			label37: {
				do {
					do {
						if (local19 <= this.aClass2_Sub1_Sub6_2.anIntArray157[this.anInt1343]) {
							break label37;
						}
						local19 -= this.aClass2_Sub1_Sub6_2.anIntArray157[this.anInt1343];
						this.anInt1343++;
					} while (this.anInt1343 < this.aClass2_Sub1_Sub6_2.anIntArray155.length);
					this.anInt1343 -= this.aClass2_Sub1_Sub6_2.anInt1205;
				} while (this.anInt1343 >= 0 && this.aClass2_Sub1_Sub6_2.anIntArray155.length > this.anInt1343);
				this.aClass2_Sub1_Sub6_2 = null;
			}
			this.anInt1346 = Static108.anInt2902 - local19;
		}
		@Pc(106) Class2_Sub1_Sub14 local106 = Static29.method518(this.anInt1351);
		if (local106.anIntArray384 != null) {
			local106 = local106.method1612();
		}
		return local106 == null ? null : local106.method1615(this.anInt1342, this.anInt1347, this.anInt1337, this.anInt1343, this.anInt1345, this.aClass2_Sub1_Sub6_2, this.anInt1352, this.anInt1339);
	}
}
