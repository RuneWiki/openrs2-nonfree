import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	private int anInt537;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	private int anInt538;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Z")
	public boolean aBoolean137 = false;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!pc;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public int anInt533;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public int anInt534;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public int anInt535;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt536;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg1];
			this.anInt533 = arg3;
			this.anInt534 = arg0;
			this.anInt535 = arg5;
			this.anInt536 = arg2;
			this.anInt532 = arg4 + arg6;
			this.aBoolean137 = false;
			if (arg7 <= 0) {
				for (@Pc(33) int local33 = 1; local33 > 0; local33++) {
				}
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("74827, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)V")
	public void method301(@OriginalArg(1) int arg0) {
		try {
			this.anInt538 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt538 <= this.aClass33_2.aClass27_2.method506(this.anInt537)) {
							return;
						}
						this.anInt538 -= this.aClass33_2.aClass27_2.method506(this.anInt537) + 1;
						this.anInt537++;
					} while (this.anInt537 < this.aClass33_2.aClass27_2.anInt791);
				} while (this.anInt537 >= 0 && this.anInt537 < this.aClass33_2.aClass27_2.anInt791);
				this.anInt537 = 0;
				this.aBoolean137 = true;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("6697, " + 1 + ", " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(13) Class1_Sub1_Sub1_Sub5 local13 = this.aClass33_2.method523();
			if (local13 == null) {
				return null;
			}
			@Pc(25) int local25 = this.aClass33_2.aClass27_2.anIntArray225[this.anInt537];
			@Pc(36) Class1_Sub1_Sub1_Sub5 local36 = new Class1_Sub1_Sub1_Sub5(false, true, Class12.method306(local25), local13, 396);
			if (!this.aBoolean137) {
				local36.method268();
				local36.method269(local25);
				local36.anIntArrayArray9 = null;
				local36.anIntArrayArray8 = null;
			}
			if (this.aClass33_2.anInt825 != 128 || this.aClass33_2.anInt826 != 128) {
				local36.method277(this.aClass33_2.anInt825, this.aClass33_2.anInt825, this.aClass33_2.anInt826);
			}
			if (this.aClass33_2.anInt827 != 0) {
				if (this.aClass33_2.anInt827 == 90) {
					local36.method272();
				}
				if (this.aClass33_2.anInt827 == 180) {
					local36.method272();
					local36.method272();
				}
				if (this.aClass33_2.anInt827 == 270) {
					local36.method272();
					local36.method272();
					local36.method272();
				}
			}
			local36.method278(this.aClass33_2.anInt828 + 64, this.aClass33_2.anInt829 + 850, -30, -50, -30, true);
			return local36;
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("41363, " + -67 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}
