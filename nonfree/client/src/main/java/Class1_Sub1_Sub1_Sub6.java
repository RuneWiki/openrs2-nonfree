import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Z")
	public boolean aBoolean145 = false;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!pc;")
	private Class33 aClass33_2;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public int anInt525;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass33_2 = Class33.aClass33Array1[arg7];
			this.anInt522 = arg5;
			this.anInt523 = arg6;
			this.anInt524 = arg1;
			this.anInt525 = arg0;
			this.anInt521 = arg2 + arg4;
			this.aBoolean145 = false;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("56512, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)V")
	public void method301(@OriginalArg(1) int arg0) {
		try {
			this.anInt527 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt527 <= this.aClass33_2.aClass27_2.method506(this.anInt526)) {
							return;
						}
						this.anInt527 -= this.aClass33_2.aClass27_2.method506(this.anInt526) + 1;
						this.anInt526++;
					} while (this.anInt526 < this.aClass33_2.aClass27_2.anInt785);
				} while (this.anInt526 >= 0 && this.anInt526 < this.aClass33_2.aClass27_2.anInt785);
				this.anInt526 = 0;
				this.aBoolean145 = true;
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("11658, " + -24 + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass33_2.method523();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass33_2.aClass27_2.anIntArray225[this.anInt526];
			@Pc(26) Class1_Sub1_Sub1_Sub5 local26 = new Class1_Sub1_Sub1_Sub5(false, local3, true, (byte) 119, Class12.method306(local15, (byte) 7));
			if (!this.aBoolean145) {
				local26.method268();
				local26.method269(local15);
				local26.anIntArrayArray9 = null;
				local26.anIntArrayArray8 = null;
			}
			if (this.aClass33_2.anInt820 != 128 || this.aClass33_2.anInt821 != 128) {
				local26.method277(this.aClass33_2.anInt820, this.aClass33_2.anInt820, this.aClass33_2.anInt821);
			}
			if (this.aClass33_2.anInt822 != 0) {
				if (this.aClass33_2.anInt822 == 90) {
					local26.method272();
				}
				if (this.aClass33_2.anInt822 == 180) {
					local26.method272();
					local26.method272();
				}
				if (this.aClass33_2.anInt822 == 270) {
					local26.method272();
					local26.method272();
					local26.method272();
				}
			}
			local26.method278(this.aClass33_2.anInt823 + 64, this.aClass33_2.anInt824 + 850, -30, -50, -30, true);
			return local26;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("97721, " + true + ", " + local126.toString());
			throw new RuntimeException();
		}
	}
}
