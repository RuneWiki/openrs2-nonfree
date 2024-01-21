import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
	private int anInt534;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
	private int anInt535;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Z")
	private boolean aBoolean141 = true;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Z")
	private boolean aBoolean142 = true;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!pc;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public int anInt530;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
	public int anInt531;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
	public int anInt533;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg1];
			this.anInt530 = arg2;
			this.anInt531 = arg6;
			this.anInt532 = arg3;
			this.anInt533 = arg4;
			this.anInt529 = arg5 + arg7;
			this.aBoolean143 = false;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("2907, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public void method299(@OriginalArg(1) int arg0) {
		try {
			this.anInt535 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt535 <= this.aClass33_2.aClass27_2.method500(this.anInt534)) {
							return;
						}
						this.anInt535 -= this.aClass33_2.aClass27_2.method500(this.anInt534) + 1;
						this.anInt534++;
					} while (this.anInt534 < this.aClass33_2.aClass27_2.anInt793);
				} while (this.anInt534 >= 0 && this.anInt534 < this.aClass33_2.aClass27_2.anInt793);
				this.anInt534 = 0;
				this.aBoolean143 = true;
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("51249, " + 0 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method671() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_2.method517();
			if (local3 == null) {
				return null;
			}
			@Pc(24) int local24 = this.aClass33_2.aClass27_2.anIntArray222[this.anInt534];
			@Pc(36) Class1_Sub1_Sub1_Sub5 local36 = new Class1_Sub1_Sub1_Sub5(9, false, Class12.method304(this.anInt527, local24), true, local3);
			if (!this.aBoolean143) {
				local36.method267();
				local36.method268(local24);
				local36.anIntArrayArray9 = null;
				local36.anIntArrayArray8 = null;
			}
			if (this.aClass33_2.anInt831 != 128 || this.aClass33_2.anInt832 != 128) {
				local36.method276(this.aClass33_2.anInt831, this.aClass33_2.anInt831, this.aClass33_2.anInt832);
			}
			if (this.aClass33_2.anInt833 != 0) {
				if (this.aClass33_2.anInt833 == 90) {
					local36.method271();
				}
				if (this.aClass33_2.anInt833 == 180) {
					local36.method271();
					local36.method271();
				}
				if (this.aClass33_2.anInt833 == 270) {
					local36.method271();
					local36.method271();
					local36.method271();
				}
			}
			local36.method277(this.aClass33_2.anInt834 + 64, this.aClass33_2.anInt835 + 850, -30, -50, -30, true);
			return local36;
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("32963, " + true + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}
