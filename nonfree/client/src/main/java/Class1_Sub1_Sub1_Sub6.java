import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	private int anInt532;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	private int anInt533;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Z")
	public boolean aBoolean133 = false;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!pc;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public int anInt528;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public int anInt530;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt531;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public int anInt527;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg6];
			this.anInt528 = arg3;
			this.anInt529 = arg2;
			this.anInt530 = arg1;
			this.anInt531 = arg5;
			this.anInt527 = arg7 + arg0;
			this.aBoolean133 = false;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("74414, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public void method299(@OriginalArg(1) int arg0) {
		try {
			this.anInt533 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt533 <= this.aClass33_2.aClass27_2.method499(this.anInt532)) {
							return;
						}
						this.anInt533 -= this.aClass33_2.aClass27_2.method499(this.anInt532) + 1;
						this.anInt532++;
					} while (this.anInt532 < this.aClass33_2.aClass27_2.anInt795);
				} while (this.anInt532 >= 0 && this.anInt532 < this.aClass33_2.aClass27_2.anInt795);
				this.anInt532 = 0;
				this.aBoolean133 = true;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("23188, " + 0 + ", " + arg0 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method670() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_2.method516();
			if (local3 == null) {
				return null;
			}
			@Pc(21) int local21 = this.aClass33_2.aClass27_2.anIntArray222[this.anInt532];
			@Pc(32) Class1_Sub1_Sub1_Sub5 local32 = new Class1_Sub1_Sub1_Sub5(true, Class12.method304(local21), local3, true, false);
			if (!this.aBoolean133) {
				local32.method267();
				local32.method268(local21);
				local32.anIntArrayArray9 = null;
				local32.anIntArrayArray8 = null;
			}
			if (this.aClass33_2.anInt829 != 128 || this.aClass33_2.anInt830 != 128) {
				local32.method276(this.aClass33_2.anInt829, this.aClass33_2.anInt829, this.aClass33_2.anInt830);
			}
			if (this.aClass33_2.anInt831 != 0) {
				if (this.aClass33_2.anInt831 == 90) {
					local32.method271();
				}
				if (this.aClass33_2.anInt831 == 180) {
					local32.method271();
					local32.method271();
				}
				if (this.aClass33_2.anInt831 == 270) {
					local32.method271();
					local32.method271();
					local32.method271();
				}
			}
			local32.method277(this.aClass33_2.anInt832 + 64, this.aClass33_2.anInt833 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("64918, " + false + ", " + local126.toString());
			throw new RuntimeException();
		}
	}
}
