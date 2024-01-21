import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	private int anInt538;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	private int anInt539;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Z")
	private boolean aBoolean131 = true;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!pc;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public int anInt534;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public int anInt535;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public int anInt536;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt537;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public int anInt533;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIZIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg3];
			this.anInt534 = arg2;
			this.anInt535 = arg6;
			this.anInt536 = arg0;
			this.anInt537 = arg5;
			this.anInt533 = arg7 + arg1;
			this.aBoolean132 = false;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("84876, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
	public void method301(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt539 += arg0;
			if (!arg1) {
				while (true) {
					do {
						do {
							if (this.anInt539 <= this.aClass33_2.aClass27_2.method506(this.anInt538)) {
								return;
							}
							this.anInt539 -= this.aClass33_2.aClass27_2.method506(this.anInt538) + 1;
							this.anInt538++;
						} while (this.anInt538 < this.aClass33_2.aClass27_2.anInt794);
					} while (this.anInt538 >= 0 && this.anInt538 < this.aClass33_2.aClass27_2.anInt794);
					this.anInt538 = 0;
					this.aBoolean132 = true;
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("56621, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_2.method523();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass33_2.aClass27_2.anIntArray225[this.anInt538];
			@Pc(35) Class1_Sub1_Sub1_Sub5 local35 = new Class1_Sub1_Sub1_Sub5(Class12.method306(local15), false, true, local3, 0);
			if (!this.aBoolean132) {
				local35.method268();
				local35.method269(local15);
				local35.anIntArrayArray9 = null;
				local35.anIntArrayArray8 = null;
			}
			if (this.aClass33_2.anInt830 != 128 || this.aClass33_2.anInt831 != 128) {
				local35.method277(this.aClass33_2.anInt830, this.aClass33_2.anInt830, this.aClass33_2.anInt831);
			}
			if (this.aClass33_2.anInt832 != 0) {
				if (this.aClass33_2.anInt832 == 90) {
					local35.method272();
				}
				if (this.aClass33_2.anInt832 == 180) {
					local35.method272();
					local35.method272();
				}
				if (this.aClass33_2.anInt832 == 270) {
					local35.method272();
					local35.method272();
					local35.method272();
				}
			}
			local35.method278(this.aClass33_2.anInt833 + 64, this.aClass33_2.anInt834 + 850, -30, -50, -30, true);
			return local35;
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("4612, " + -20 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}
}
