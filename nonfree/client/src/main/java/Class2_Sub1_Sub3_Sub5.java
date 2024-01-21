import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RUSNMPGH")
public final class Class2_Sub1_Sub3_Sub5 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!RUSNMPGH", name = "w", descriptor = "I")
	private int anInt629;

	@OriginalMember(owner = "client!RUSNMPGH", name = "x", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!RUSNMPGH", name = "y", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!RUSNMPGH", name = "o", descriptor = "Z")
	public boolean aBoolean186 = false;

	@OriginalMember(owner = "client!RUSNMPGH", name = "p", descriptor = "I")
	private int anInt624 = 914;

	@OriginalMember(owner = "client!RUSNMPGH", name = "q", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!RUSNMPGH", name = "z", descriptor = "I")
	private int anInt632 = 8;

	@OriginalMember(owner = "client!RUSNMPGH", name = "r", descriptor = "Lclient!MHWTJCHJ;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!RUSNMPGH", name = "s", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!RUSNMPGH", name = "t", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!RUSNMPGH", name = "u", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!RUSNMPGH", name = "v", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!RUSNMPGH", name = "n", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!RUSNMPGH", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class2_Sub1_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass27_2 = Class27.aClass27Array1[arg7];
			this.anInt625 = arg5;
			this.anInt626 = arg1;
			this.anInt627 = arg3;
			this.anInt628 = arg4;
			this.anInt623 = arg0 + arg2;
			this.aBoolean186 = false;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("28363, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUSNMPGH", name = "a", descriptor = "(II)V")
	public void method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt631 += arg0;
			@Pc(9) boolean local9 = false;
			while (true) {
				do {
					do {
						if (this.anInt631 <= this.aClass27_2.aClass22_1.method265(this.anInt630, this.anInt632)) {
							return;
						}
						this.anInt631 -= this.aClass27_2.aClass22_1.method265(this.anInt630, this.anInt632);
						this.anInt630++;
					} while (this.anInt630 < this.aClass27_2.aClass22_1.anInt262);
				} while (this.anInt630 >= 0 && this.anInt630 < this.aClass27_2.aClass22_1.anInt262);
				this.anInt630 = 0;
				this.aBoolean186 = true;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("35092, " + arg0 + ", " + arg1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RUSNMPGH", name = "a", descriptor = "(B)Lclient!RMLAXPMV;")
	@Override
	protected Class2_Sub1_Sub3_Sub4 method489(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 3) {
				@Pc(4) boolean local4 = false;
			} else {
				this.aBoolean187 = !this.aBoolean187;
			}
			@Pc(18) Class2_Sub1_Sub3_Sub4 local18 = this.aClass27_2.method316();
			if (local18 == null) {
				return null;
			}
			@Pc(30) int local30 = this.aClass27_2.aClass22_1.anIntArray64[this.anInt630];
			@Pc(41) Class2_Sub1_Sub3_Sub4 local41 = new Class2_Sub1_Sub3_Sub4(local18, Class45.method557(local30), true, false, true);
			if (!this.aBoolean186) {
				local41.method438();
				local41.method439(local30);
				local41.anIntArrayArray16 = null;
				local41.anIntArrayArray15 = null;
			}
			if (this.aClass27_2.anInt400 != 128 || this.aClass27_2.anInt401 != 128) {
				local41.method447(this.aClass27_2.anInt401, this.aClass27_2.anInt400, this.aClass27_2.anInt400, this.anInt629);
			}
			if (this.aClass27_2.anInt402 != 0) {
				if (this.aClass27_2.anInt402 == 90) {
					local41.method442();
				}
				if (this.aClass27_2.anInt402 == 180) {
					local41.method442();
					local41.method442();
				}
				if (this.aClass27_2.anInt402 == 270) {
					local41.method442();
					local41.method442();
					local41.method442();
				}
			}
			local41.method448(this.aClass27_2.anInt403 + 64, this.aClass27_2.anInt404 + 850, -30, -50, -30, true);
			return local41;
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("60331, " + arg0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}
}
