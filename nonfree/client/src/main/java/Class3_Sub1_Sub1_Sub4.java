import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RFQAJLME")
public final class Class3_Sub1_Sub1_Sub4 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!RFQAJLME", name = "l", descriptor = "I")
	private int anInt622;

	@OriginalMember(owner = "client!RFQAJLME", name = "m", descriptor = "I")
	private int anInt623;

	@OriginalMember(owner = "client!RFQAJLME", name = "t", descriptor = "Z")
	public boolean aBoolean150 = false;

	@OriginalMember(owner = "client!RFQAJLME", name = "n", descriptor = "Lclient!BYUDODIR;")
	private Class2 aClass2_1;

	@OriginalMember(owner = "client!RFQAJLME", name = "o", descriptor = "I")
	public int anInt624;

	@OriginalMember(owner = "client!RFQAJLME", name = "p", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!RFQAJLME", name = "q", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!RFQAJLME", name = "r", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!RFQAJLME", name = "s", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!RFQAJLME", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class3_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass2_1 = Class2.aClass2Array1[arg5];
			this.anInt624 = arg0;
			this.anInt625 = arg6;
			this.anInt626 = arg2;
			this.anInt627 = arg3;
			this.anInt628 = arg4 + arg1;
			this.aBoolean150 = false;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("16095, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RFQAJLME", name = "a", descriptor = "(Z)Lclient!OQIGXOFQ;")
	@Override
	protected Class3_Sub1_Sub1_Sub3 method506() {
		try {
			@Pc(3) Class3_Sub1_Sub1_Sub3 local3 = this.aClass2_1.method18();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass2_1.aClass39_1.anIntArray183[this.anInt622];
			@Pc(26) Class3_Sub1_Sub1_Sub3 local26 = new Class3_Sub1_Sub1_Sub3(Class47.method554(local15), local3, -575, false, true);
			if (!this.aBoolean150) {
				local26.method328();
				local26.method329(local15);
				local26.anIntArrayArray9 = null;
				local26.anIntArrayArray8 = null;
			}
			if (this.aClass2_1.anInt29 != 128 || this.aClass2_1.anInt30 != 128) {
				local26.method337(this.aClass2_1.anInt30, this.aClass2_1.anInt29, this.aClass2_1.anInt29);
			}
			if (this.aClass2_1.anInt31 != 0) {
				if (this.aClass2_1.anInt31 == 90) {
					local26.method332();
				}
				if (this.aClass2_1.anInt31 == 180) {
					local26.method332();
					local26.method332();
				}
				if (this.aClass2_1.anInt31 == 270) {
					local26.method332();
					local26.method332();
					local26.method332();
				}
			}
			local26.method338(this.aClass2_1.anInt32 + 64, this.aClass2_1.anInt33 + 850, -30, -50, -30, true);
			return local26;
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("47403, " + false + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RFQAJLME", name = "a", descriptor = "(IZ)V")
	public void method416(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				this.anInt623 += arg0;
				while (true) {
					do {
						do {
							if (this.anInt623 <= this.aClass2_1.aClass39_1.method492(this.anInt622)) {
								return;
							}
							this.anInt623 -= this.aClass2_1.aClass39_1.method492(this.anInt622) + 1;
							this.anInt622++;
						} while (this.anInt622 < this.aClass2_1.aClass39_1.anInt723);
					} while (this.anInt622 >= 0 && this.anInt622 < this.aClass2_1.aClass39_1.anInt723);
					this.anInt622 = 0;
					this.aBoolean150 = true;
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("27308, " + arg0 + ", " + arg1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}
}
