import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CANOTCRF")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!CANOTCRF", name = "r", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!CANOTCRF", name = "s", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!CANOTCRF", name = "t", descriptor = "Z")
	public boolean aBoolean25 = false;

	@OriginalMember(owner = "client!CANOTCRF", name = "u", descriptor = "Lclient!BRGDZOWQ;")
	private Class4 aClass4_1;

	@OriginalMember(owner = "client!CANOTCRF", name = "n", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!CANOTCRF", name = "o", descriptor = "I")
	public int anInt131;

	@OriginalMember(owner = "client!CANOTCRF", name = "p", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!CANOTCRF", name = "q", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!CANOTCRF", name = "v", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!CANOTCRF", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass4_1 = Class4.aClass4Array1[arg3];
			this.anInt130 = arg7;
			this.anInt131 = arg4;
			this.anInt132 = arg2;
			this.anInt133 = arg1;
			this.anInt136 = arg6 + arg5;
			this.aBoolean25 = false;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("61294, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CANOTCRF", name = "a", descriptor = "(I)Lclient!LFTMDGKK;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method448() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = this.aClass4_1.method34();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass4_1.aClass21_1.anIntArray68[this.anInt134];
			@Pc(26) Class1_Sub1_Sub1_Sub4 local26 = new Class1_Sub1_Sub1_Sub4(Class6.method44(local15), true, local3, false, false);
			if (!this.aBoolean25) {
				local26.method309();
				local26.method310(local15);
				local26.anIntArrayArray9 = null;
				local26.anIntArrayArray8 = null;
			}
			if (this.aClass4_1.anInt118 != 128 || this.aClass4_1.anInt119 != 128) {
				local26.method318(this.aClass4_1.anInt119, this.aClass4_1.anInt118, this.aClass4_1.anInt118);
			}
			if (this.aClass4_1.anInt120 != 0) {
				if (this.aClass4_1.anInt120 == 90) {
					local26.method313();
				}
				if (this.aClass4_1.anInt120 == 180) {
					local26.method313();
					local26.method313();
				}
				if (this.aClass4_1.anInt120 == 270) {
					local26.method313();
					local26.method313();
					local26.method313();
				}
			}
			local26.method319(this.aClass4_1.anInt121 + 64, this.aClass4_1.anInt122 + 850, -30, -50, -30, true);
			return local26;
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("80761, " + 0 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CANOTCRF", name = "a", descriptor = "(ZI)V")
	public void method39(@OriginalArg(1) int arg0) {
		try {
			this.anInt135 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt135 <= this.aClass4_1.aClass21_1.method279(this.anInt134)) {
							return;
						}
						this.anInt135 -= this.aClass4_1.aClass21_1.method279(this.anInt134) + 1;
						this.anInt134++;
					} while (this.anInt134 < this.aClass4_1.aClass21_1.anInt390);
				} while (this.anInt134 >= 0 && this.anInt134 < this.aClass4_1.aClass21_1.anInt390);
				this.anInt134 = 0;
				this.aBoolean25 = true;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("85498, " + false + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}
}
