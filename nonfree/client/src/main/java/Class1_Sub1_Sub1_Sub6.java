import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	private int anInt577;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	private int anInt578;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Z")
	private boolean aBoolean146 = true;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
	private boolean aBoolean147 = true;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "Lclient!pc;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public int anInt573;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public int anInt574;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public int anInt575;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public int anInt576;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public int anInt572;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass32_2 = Class32.aClass32Array1[arg1];
			this.anInt573 = arg2;
			this.anInt574 = arg6;
			this.anInt575 = arg7;
			this.anInt576 = arg3;
			this.anInt572 = arg0 + arg5;
			this.aBoolean148 = false;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("26909, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
	public void method317(@OriginalArg(0) int arg0) {
		try {
			this.anInt578 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt578 <= this.aClass32_2.aClass27_2.method517(this.anInt577, (byte) 2)) {
							return;
						}
						this.anInt578 -= this.aClass32_2.aClass27_2.method517(this.anInt577, (byte) 2) + 1;
						this.anInt577++;
					} while (this.anInt577 < this.aClass32_2.aClass27_2.anInt808);
				} while (this.anInt577 >= 0 && this.anInt577 < this.aClass32_2.aClass27_2.anInt808);
				this.anInt577 = 0;
				this.aBoolean148 = true;
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("41721, " + arg0 + ", " + false + ", " + local72.toString());
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
			@Pc(15) int local15 = this.aClass32_2.aClass27_2.anIntArray227[this.anInt577];
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = new Class1_Sub1_Sub1_Sub5(Class14.method328(local15), local3, true, 0, false);
			if (!this.aBoolean148) {
				local37.method295();
				local37.method296(local15);
				local37.anIntArrayArray8 = null;
				local37.anIntArrayArray7 = null;
			}
			if (this.aClass32_2.anInt844 != 128 || this.aClass32_2.anInt845 != 128) {
				local37.method304(this.aClass32_2.anInt844, (byte) 9, this.aClass32_2.anInt844, this.aClass32_2.anInt845);
			}
			if (this.aClass32_2.anInt846 != 0) {
				if (this.aClass32_2.anInt846 == 90) {
					local37.method299();
				}
				if (this.aClass32_2.anInt846 == 180) {
					local37.method299();
					local37.method299();
				}
				if (this.aClass32_2.anInt846 == 270) {
					local37.method299();
					local37.method299();
					local37.method299();
				}
			}
			local37.method305(this.aClass32_2.anInt847 + 64, this.aClass32_2.anInt848 + 850, -30, -50, -30, true);
			return local37;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("64939, " + -28205 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}
}
