import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	private int anInt567;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	private int anInt568;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	private int anInt561 = 650;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Z")
	private boolean aBoolean136 = true;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Z")
	public boolean aBoolean137 = false;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!pc;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public int anInt563;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public int anInt564;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public int anInt565;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public int anInt562;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass32_2 = Class32.aClass32Array1[arg3];
			this.anInt563 = arg7;
			this.anInt564 = arg4;
			this.anInt565 = arg1;
			this.anInt566 = arg6;
			this.anInt562 = arg5 + arg2;
			this.aBoolean137 = false;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("3440, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public void method317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt568 += arg1;
			@Pc(9) boolean local9 = false;
			while (true) {
				do {
					do {
						if (this.anInt568 <= this.aClass32_2.aClass27_2.method517(this.anInt567)) {
							return;
						}
						this.anInt568 -= this.aClass32_2.aClass27_2.method517(this.anInt567) + 1;
						this.anInt567++;
					} while (this.anInt567 < this.aClass32_2.aClass27_2.anInt800);
				} while (this.anInt567 >= 0 && this.anInt567 < this.aClass32_2.aClass27_2.anInt800);
				this.anInt567 = 0;
				this.aBoolean137 = true;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("5801, " + arg0 + ", " + arg1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass32_2.method530();
			if (local3 == null) {
				return null;
			}
			@Pc(21) int local21 = this.aClass32_2.aClass27_2.anIntArray227[this.anInt567];
			@Pc(32) Class1_Sub1_Sub1_Sub5 local32 = new Class1_Sub1_Sub1_Sub5(23727, Class14.method328(local21), true, local3, false);
			if (!this.aBoolean137) {
				local32.method295();
				local32.method296(local21);
				local32.anIntArrayArray8 = null;
				local32.anIntArrayArray7 = null;
			}
			if (this.aClass32_2.anInt838 != 128 || this.aClass32_2.anInt839 != 128) {
				local32.method304(this.aClass32_2.anInt838, this.aClass32_2.anInt839, this.aClass32_2.anInt838);
			}
			if (this.aClass32_2.anInt840 != 0) {
				if (this.aClass32_2.anInt840 == 90) {
					local32.method299((byte) 4);
				}
				if (this.aClass32_2.anInt840 == 180) {
					local32.method299((byte) 4);
					local32.method299((byte) 4);
				}
				if (this.aClass32_2.anInt840 == 270) {
					local32.method299((byte) 4);
					local32.method299((byte) 4);
					local32.method299((byte) 4);
				}
			}
			local32.method305(this.aClass32_2.anInt841 + 64, this.aClass32_2.anInt842 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("87083, " + 650 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}
}
