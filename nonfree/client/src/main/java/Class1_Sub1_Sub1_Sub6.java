import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	private int anInt588;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	private int anInt589;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	private int anInt582 = 724;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "B")
	private byte aByte37 = 0;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Z")
	public boolean aBoolean138 = false;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!pc;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public int anInt584;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public int anInt585;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public int anInt587;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public int anInt583;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass32_2 = Class32.aClass32Array1[arg1];
			this.anInt584 = arg0;
			this.anInt585 = arg5;
			this.anInt586 = arg6;
			this.anInt587 = arg4;
			this.anInt583 = arg2 + arg7;
			this.aBoolean138 = false;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("58840, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public void method317(@OriginalArg(0) int arg0) {
		try {
			this.anInt589 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt589 <= this.aClass32_2.aClass27_2.method517(this.anInt588)) {
							return;
						}
						this.anInt589 -= this.aClass32_2.aClass27_2.method517(this.anInt588) + 1;
						this.anInt588++;
					} while (this.anInt588 < this.aClass32_2.aClass27_2.anInt830);
				} while (this.anInt588 >= 0 && this.anInt588 < this.aClass32_2.aClass27_2.anInt830);
				this.anInt588 = 0;
				this.aBoolean138 = true;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("89701, " + arg0 + ", " + 439 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass32_2.method530();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass32_2.aClass27_2.anIntArray227[this.anInt588];
			@Pc(36) Class1_Sub1_Sub1_Sub5 local36 = new Class1_Sub1_Sub1_Sub5(Class14.method328((byte) 7, local15), false, true, true, local3);
			if (!this.aBoolean138) {
				local36.method295();
				local36.method296(this.aByte37, local15);
				local36.anIntArrayArray8 = null;
				local36.anIntArrayArray7 = null;
			}
			if (this.aClass32_2.anInt869 != 128 || this.aClass32_2.anInt870 != 128) {
				local36.method304(this.aClass32_2.anInt869, this.aClass32_2.anInt870, this.aClass32_2.anInt869);
			}
			if (this.aClass32_2.anInt871 != 0) {
				if (this.aClass32_2.anInt871 == 90) {
					local36.method299();
				}
				if (this.aClass32_2.anInt871 == 180) {
					local36.method299();
					local36.method299();
				}
				if (this.aClass32_2.anInt871 == 270) {
					local36.method299();
					local36.method299();
					local36.method299();
				}
			}
			local36.method305(this.aClass32_2.anInt872 + 64, this.aClass32_2.anInt873 + 850, -30, -50, -30, true);
			return local36;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("40845, " + 8 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}
}
