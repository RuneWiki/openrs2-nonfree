import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	private int anInt520;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	private int anInt521 = 393;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Z")
	public boolean aBoolean137 = false;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!pc;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public int anInt525;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public int anInt526;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIZIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg6];
			this.anInt523 = arg1;
			this.anInt524 = arg0;
			this.anInt525 = arg5;
			this.anInt526 = arg2;
			this.anInt522 = arg7 + arg3;
			this.aBoolean137 = false;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("81124, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public void method299(@OriginalArg(1) int arg0) {
		try {
			this.anInt528 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt528 <= this.aClass33_2.aClass27_2.method502(this.anInt527)) {
							return;
						}
						this.anInt528 -= this.aClass33_2.aClass27_2.method502(this.anInt527) + 1;
						this.anInt527++;
					} while (this.anInt527 < this.aClass33_2.aClass27_2.anInt783);
				} while (this.anInt527 >= 0 && this.anInt527 < this.aClass33_2.aClass27_2.anInt783);
				this.anInt527 = 0;
				this.aBoolean137 = true;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("93520, " + 922 + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method672() {
		try {
			@Pc(13) Class1_Sub1_Sub1_Sub5 local13 = this.aClass33_2.method519();
			if (local13 == null) {
				return null;
			}
			@Pc(25) int local25 = this.aClass33_2.aClass27_2.anIntArray224[this.anInt527];
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = new Class1_Sub1_Sub1_Sub5(local13, Class12.method304(local25), false, this.anInt520, true);
			if (!this.aBoolean137) {
				local37.method267((byte) 3);
				local37.method268(local25, 188);
				local37.anIntArrayArray9 = null;
				local37.anIntArrayArray8 = null;
			}
			if (this.aClass33_2.anInt819 != 128 || this.aClass33_2.anInt820 != 128) {
				local37.method276(this.aClass33_2.anInt819, this.aClass33_2.anInt819, this.aClass33_2.anInt820);
			}
			if (this.aClass33_2.anInt821 != 0) {
				if (this.aClass33_2.anInt821 == 90) {
					local37.method271();
				}
				if (this.aClass33_2.anInt821 == 180) {
					local37.method271();
					local37.method271();
				}
				if (this.aClass33_2.anInt821 == 270) {
					local37.method271();
					local37.method271();
					local37.method271();
				}
			}
			local37.method277(this.aClass33_2.anInt822 + 64, this.aClass33_2.anInt823 + 850, -30, -50, -30, true);
			return local37;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("834, " + -37770 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}
}
