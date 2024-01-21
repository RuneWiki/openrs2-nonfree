import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	private int anInt536;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
	private int anInt543;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	private int anInt544;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	private int anInt537 = 977;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Z")
	private boolean aBoolean134 = true;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Z")
	public boolean aBoolean135 = false;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!pc;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt539;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public int anInt540;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public int anInt541;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public int anInt542;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public int anInt538;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg1];
			this.anInt539 = arg3;
			this.anInt540 = arg7;
			this.anInt541 = arg4;
			this.anInt542 = arg6;
			this.anInt538 = arg2 + arg5;
			this.aBoolean135 = false;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("65511, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public void method301(@OriginalArg(1) int arg0) {
		try {
			this.anInt544 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt544 <= this.aClass33_2.aClass27_2.method506(this.anInt543, this.anInt537)) {
							return;
						}
						this.anInt544 -= this.aClass33_2.aClass27_2.method506(this.anInt543, this.anInt537) + 1;
						this.anInt543++;
					} while (this.anInt543 < this.aClass33_2.aClass27_2.anInt808);
				} while (this.anInt543 >= 0 && this.anInt543 < this.aClass33_2.aClass27_2.anInt808);
				this.anInt543 = 0;
				this.aBoolean135 = true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("6410, " + 457 + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_2.method523();
			if (local3 == null) {
				return null;
			}
			@Pc(26) int local26 = this.aClass33_2.aClass27_2.anIntArray225[this.anInt543];
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = new Class1_Sub1_Sub1_Sub5(Class12.method306(local26), false, 0, true, local3);
			if (!this.aBoolean135) {
				local37.method268(this.anInt536);
				local37.method269(local26);
				local37.anIntArrayArray9 = null;
				local37.anIntArrayArray8 = null;
			}
			if (this.aClass33_2.anInt843 != 128 || this.aClass33_2.anInt844 != 128) {
				local37.method277(this.aClass33_2.anInt844, this.aClass33_2.anInt843, this.aClass33_2.anInt843);
			}
			if (this.aClass33_2.anInt845 != 0) {
				if (this.aClass33_2.anInt845 == 90) {
					local37.method272();
				}
				if (this.aClass33_2.anInt845 == 180) {
					local37.method272();
					local37.method272();
				}
				if (this.aClass33_2.anInt845 == 270) {
					local37.method272();
					local37.method272();
					local37.method272();
				}
			}
			local37.method278(this.aClass33_2.anInt846 + 64, this.aClass33_2.anInt847 + 850, -30, -50, -30, true);
			return local37;
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("18059, " + -59 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}
}
