import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ADZOUCLA")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!ADZOUCLA", name = "r", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!ADZOUCLA", name = "s", descriptor = "I")
	private int anInt28;

	@OriginalMember(owner = "client!ADZOUCLA", name = "k", descriptor = "I")
	private int anInt22 = 7;

	@OriginalMember(owner = "client!ADZOUCLA", name = "p", descriptor = "Z")
	public boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ADZOUCLA", name = "q", descriptor = "Lclient!BZLQCUPI;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!ADZOUCLA", name = "l", descriptor = "I")
	public int anInt23;

	@OriginalMember(owner = "client!ADZOUCLA", name = "m", descriptor = "I")
	public int anInt24;

	@OriginalMember(owner = "client!ADZOUCLA", name = "n", descriptor = "I")
	public int anInt25;

	@OriginalMember(owner = "client!ADZOUCLA", name = "o", descriptor = "I")
	public int anInt26;

	@OriginalMember(owner = "client!ADZOUCLA", name = "t", descriptor = "I")
	public int anInt29;

	@OriginalMember(owner = "client!ADZOUCLA", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass4_1 = Class4.aClass4Array1[arg6];
			this.anInt23 = arg4;
			this.anInt24 = arg1;
			if (arg0 != this.anInt22) {
				for (@Pc(24) int local24 = 1; local24 > 0; local24++) {
				}
			}
			this.anInt25 = arg3;
			this.anInt26 = arg5;
			this.anInt29 = arg7 + arg2;
			this.aBoolean7 = false;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("35305, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADZOUCLA", name = "a", descriptor = "(IB)V")
	public void method12(@OriginalArg(0) int arg0) {
		try {
			this.anInt28 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt28 <= this.aClass4_1.aClass10_1.method160(this.anInt27)) {
							return;
						}
						this.anInt28 -= this.aClass4_1.aClass10_1.method160(this.anInt27) + 1;
						this.anInt27++;
					} while (this.anInt27 < this.aClass4_1.aClass10_1.anInt198);
				} while (this.anInt27 >= 0 && this.anInt27 < this.aClass4_1.aClass10_1.anInt198);
				this.anInt27 = 0;
				this.aBoolean7 = true;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("83272, " + arg0 + ", " + 102 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADZOUCLA", name = "a", descriptor = "(B)Lclient!CYPZUKMB;")
	@Override
	protected Class2_Sub1_Sub1_Sub2 method455() {
		try {
			@Pc(3) Class2_Sub1_Sub1_Sub2 local3 = this.aClass4_1.method19();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass4_1.aClass10_1.anIntArray68[this.anInt27];
			@Pc(26) Class2_Sub1_Sub1_Sub2 local26 = new Class2_Sub1_Sub1_Sub2(Class32.method374(local15), local3, false, false, true);
			if (!this.aBoolean7) {
				local26.method98();
				local26.method99(257, local15);
				local26.anIntArrayArray6 = null;
				local26.anIntArrayArray5 = null;
			}
			if (this.aClass4_1.anInt44 != 128 || this.aClass4_1.anInt45 != 128) {
				local26.method107(this.aClass4_1.anInt44, this.aClass4_1.anInt45, this.aClass4_1.anInt44);
			}
			if (this.aClass4_1.anInt46 != 0) {
				if (this.aClass4_1.anInt46 == 90) {
					local26.method102();
				}
				if (this.aClass4_1.anInt46 == 180) {
					local26.method102();
					local26.method102();
				}
				if (this.aClass4_1.anInt46 == 270) {
					local26.method102();
					local26.method102();
					local26.method102();
				}
			}
			local26.method108(this.aClass4_1.anInt47 + 64, this.aClass4_1.anInt48 + 850, -30, -50, -30, true);
			return local26;
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("2301, " + -99 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}
