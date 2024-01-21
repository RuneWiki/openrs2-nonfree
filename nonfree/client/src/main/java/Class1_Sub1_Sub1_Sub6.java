import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	private int anInt572;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	private int anInt573;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "B")
	private byte aByte24 = 8;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
	private boolean aBoolean139 = false;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "Lclient!pc;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public int anInt568;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public int anInt569;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public int anInt570;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public int anInt571;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public int anInt567;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass32_2 = Class32.aClass32Array1[arg5];
			this.anInt568 = arg3;
			this.anInt569 = arg4;
			this.anInt570 = arg2;
			this.anInt571 = arg0;
			@Pc(31) int local31 = 34 / arg6;
			this.anInt567 = arg1 + arg7;
			this.aBoolean140 = false;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("88396, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public void method317(@OriginalArg(0) int arg0) {
		try {
			this.anInt573 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt573 <= this.aClass32_2.aClass27_2.method517(this.anInt572)) {
							return;
						}
						this.anInt573 -= this.aClass32_2.aClass27_2.method517(this.anInt572) + 1;
						this.anInt572++;
					} while (this.anInt572 < this.aClass32_2.aClass27_2.anInt809);
				} while (this.anInt572 >= 0 && this.anInt572 < this.aClass32_2.aClass27_2.anInt809);
				this.anInt572 = 0;
				this.aBoolean140 = true;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("65087, " + arg0 + ", " + -254 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass32_2.method530();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass32_2.aClass27_2.anIntArray227[this.anInt572];
			@Pc(26) Class1_Sub1_Sub1_Sub5 local26 = new Class1_Sub1_Sub1_Sub5(Class14.method328((byte) 8, local15), 992, false, true, local3);
			if (!this.aBoolean140) {
				local26.method295();
				local26.method296(local15);
				local26.anIntArrayArray8 = null;
				local26.anIntArrayArray7 = null;
			}
			if (this.aClass32_2.anInt846 != 128 || this.aClass32_2.anInt847 != 128) {
				local26.method304(792, this.aClass32_2.anInt846, this.aClass32_2.anInt846, this.aClass32_2.anInt847);
			}
			if (this.aClass32_2.anInt848 != 0) {
				if (this.aClass32_2.anInt848 == 90) {
					local26.method299(this.aByte24);
				}
				if (this.aClass32_2.anInt848 == 180) {
					local26.method299(this.aByte24);
					local26.method299(this.aByte24);
				}
				if (this.aClass32_2.anInt848 == 270) {
					local26.method299(this.aByte24);
					local26.method299(this.aByte24);
					local26.method299(this.aByte24);
				}
			}
			local26.method305(this.aClass32_2.anInt849 + 64, this.aClass32_2.anInt850 + 850, -30, -50, -30, true);
			return local26;
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("27363, " + 45160 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}
}
