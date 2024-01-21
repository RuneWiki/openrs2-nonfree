import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JQLDEMYI")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!JQLDEMYI", name = "o", descriptor = "I")
	private int anInt361;

	@OriginalMember(owner = "client!JQLDEMYI", name = "p", descriptor = "I")
	private int anInt362;

	@OriginalMember(owner = "client!JQLDEMYI", name = "n", descriptor = "I")
	private int anInt360 = -17619;

	@OriginalMember(owner = "client!JQLDEMYI", name = "q", descriptor = "I")
	private int anInt363 = -39282;

	@OriginalMember(owner = "client!JQLDEMYI", name = "w", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!JQLDEMYI", name = "r", descriptor = "Lclient!VSBOWDVL;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!JQLDEMYI", name = "s", descriptor = "I")
	public int anInt364;

	@OriginalMember(owner = "client!JQLDEMYI", name = "t", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!JQLDEMYI", name = "u", descriptor = "I")
	public int anInt366;

	@OriginalMember(owner = "client!JQLDEMYI", name = "v", descriptor = "I")
	public int anInt367;

	@OriginalMember(owner = "client!JQLDEMYI", name = "m", descriptor = "I")
	public int anInt359;

	@OriginalMember(owner = "client!JQLDEMYI", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass48_1 = Class48.aClass48Array1[arg4];
			this.anInt364 = arg5;
			this.anInt365 = arg6;
			this.anInt366 = arg7;
			this.anInt367 = arg0;
			this.anInt359 = arg3 + arg1;
			this.aBoolean77 = false;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("4806, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JQLDEMYI", name = "a", descriptor = "(II)V")
	public void method223(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt360 != -17619) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			this.anInt362 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt362 <= this.aClass48_1.aClass16_2.method208(this.anInt361)) {
							return;
						}
						this.anInt362 -= this.aClass48_1.aClass16_2.method208(this.anInt361) + 1;
						this.anInt361++;
					} while (this.anInt361 < this.aClass48_1.aClass16_2.anInt333);
				} while (this.anInt361 >= 0 && this.anInt361 < this.aClass48_1.aClass16_2.anInt333);
				this.anInt361 = 0;
				this.aBoolean77 = true;
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("91808, " + arg0 + ", " + -17619 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JQLDEMYI", name = "a", descriptor = "(I)Lclient!FUTAQMCE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method341() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub3 local3 = this.aClass48_1.method481();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass48_1.aClass16_2.anIntArray78[this.anInt361];
			if (this.anInt363 != -39282) {
				for (@Pc(21) int local21 = 1; local21 > 0; local21++) {
				}
			}
			@Pc(37) Class1_Sub1_Sub1_Sub3 local37 = new Class1_Sub1_Sub1_Sub3(local3, false, (byte) 2, true, Class40.method367(local15));
			if (!this.aBoolean77) {
				local37.method189(284);
				local37.method190(local15);
				local37.anIntArrayArray7 = null;
				local37.anIntArrayArray6 = null;
			}
			if (this.aClass48_1.anInt785 != 128 || this.aClass48_1.anInt786 != 128) {
				local37.method198(this.aClass48_1.anInt785, this.aClass48_1.anInt786, this.aClass48_1.anInt785);
			}
			if (this.aClass48_1.anInt787 != 0) {
				if (this.aClass48_1.anInt787 == 90) {
					local37.method193();
				}
				if (this.aClass48_1.anInt787 == 180) {
					local37.method193();
					local37.method193();
				}
				if (this.aClass48_1.anInt787 == 270) {
					local37.method193();
					local37.method193();
					local37.method193();
				}
			}
			local37.method199(this.aClass48_1.anInt788 + 64, this.aClass48_1.anInt789 + 850, -30, -50, -30, true);
			return local37;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("17079, " + -39282 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}
}
