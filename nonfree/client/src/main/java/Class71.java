import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class71 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
	public int anInt1988;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
	public int anInt1992;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "Lclient!rk;")
	public Class219 aClass219_1;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "[I")
	public int[] anIntArray131;

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "[I")
	public int[] anIntArray132;

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
	public int anInt1996;

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "[Lclient!rk;")
	public Class219[] aClass219Array1;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
	public final int anInt1993;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "([BI)V")
	public Class71(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt1993 = Static341.method4429(arg0.length, arg0);
		if (arg1 != this.anInt1993) {
			throw new RuntimeException();
		}
		this.method1709(arg0);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([BI)V")
	private void method1709(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class7_Sub14 local12 = new Class7_Sub14(Static212.method3044(arg0));
		@Pc(18) int local18 = local12.method3981();
		if (local18 != 5 && local18 != 6) {
			throw new RuntimeException();
		}
		if (local18 >= 6) {
			this.anInt1992 = local12.method3938();
		} else {
			this.anInt1992 = 0;
		}
		@Pc(51) int local51 = local12.method3981();
		this.anInt1996 = local12.method3943();
		@Pc(58) int local58 = 0;
		this.anIntArray127 = new int[this.anInt1996];
		@Pc(65) int local65 = -1;
		for (@Pc(67) int local67 = 0; local67 < this.anInt1996; local67++) {
			this.anIntArray127[local67] = local58 += local12.method3943();
			if (local65 < this.anIntArray127[local67]) {
				local65 = this.anIntArray127[local67];
			}
		}
		this.anInt1988 = local65 + 1;
		this.anIntArray130 = new int[this.anInt1988];
		this.anIntArrayArray12 = new int[this.anInt1988][];
		this.anIntArray129 = new int[this.anInt1988];
		this.anIntArray132 = new int[this.anInt1988];
		this.anIntArray131 = new int[this.anInt1988];
		@Pc(142) int local142;
		@Pc(156) int local156;
		if (local51 != 0) {
			this.anIntArray128 = new int[this.anInt1988];
			for (local142 = 0; local142 < this.anInt1988; local142++) {
				this.anIntArray128[local142] = -1;
			}
			for (local156 = 0; local156 < this.anInt1996; local156++) {
				this.anIntArray128[this.anIntArray127[local156]] = local12.method3938();
			}
			this.aClass219_1 = new Class219(this.anIntArray128);
		}
		for (local142 = 0; local142 < this.anInt1996; local142++) {
			this.anIntArray131[this.anIntArray127[local142]] = local12.method3938();
		}
		for (local156 = 0; local156 < this.anInt1996; local156++) {
			this.anIntArray130[this.anIntArray127[local156]] = local12.method3938();
		}
		for (@Pc(220) int local220 = 0; local220 < this.anInt1996; local220++) {
			this.anIntArray129[this.anIntArray127[local220]] = local12.method3943();
		}
		@Pc(246) int local246;
		@Pc(253) int local253;
		@Pc(261) int local261;
		@Pc(263) int local263;
		@Pc(280) int local280;
		for (@Pc(239) int local239 = 0; local239 < this.anInt1996; local239++) {
			local246 = this.anIntArray127[local239];
			local58 = 0;
			local253 = this.anIntArray129[local246];
			this.anIntArrayArray12[local246] = new int[local253];
			local261 = -1;
			for (local263 = 0; local263 < local253; local263++) {
				local280 = this.anIntArrayArray12[local246][local263] = local58 += local12.method3943();
				if (local280 > local261) {
					local261 = local280;
				}
			}
			this.anIntArray132[local246] = local261 + 1;
			if (local253 == local261 + 1) {
				this.anIntArrayArray12[local246] = null;
			}
		}
		if (local51 == 0) {
			return;
		}
		this.anIntArrayArray11 = new int[local65 + 1][];
		this.aClass219Array1 = new Class219[local65 + 1];
		for (local246 = 0; local246 < this.anInt1996; local246++) {
			local253 = this.anIntArray127[local246];
			local261 = this.anIntArray129[local253];
			this.anIntArrayArray11[local253] = new int[this.anIntArray132[local253]];
			for (local263 = 0; local263 < this.anIntArray132[local253]; local263++) {
				this.anIntArrayArray11[local253][local263] = -1;
			}
			for (local280 = 0; local280 < local261; local280++) {
				@Pc(381) int local381;
				if (this.anIntArrayArray12[local253] == null) {
					local381 = local280;
				} else {
					local381 = this.anIntArrayArray12[local253][local280];
				}
				this.anIntArrayArray11[local253][local381] = local12.method3938();
			}
			this.aClass219Array1[local253] = new Class219(this.anIntArrayArray11[local253]);
		}
	}
}
