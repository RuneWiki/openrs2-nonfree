import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	private int anInt577;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	private int anInt578;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "B")
	private byte aByte25 = 86;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "Z")
	public boolean aBoolean128 = false;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!oc;")
	private Class29 aClass29_2;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public int anInt573;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public int anInt574;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public int anInt575;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public int anInt576;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public int anInt572;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIBIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass29_2 = Class29.aClass29Array1[arg5];
			this.anInt573 = arg0;
			this.anInt574 = arg6;
			this.anInt575 = arg3;
			this.anInt576 = arg4;
			this.anInt572 = arg7 + arg1;
			this.aBoolean128 = false;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("6890, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
	public void method316(@OriginalArg(0) int arg0) {
		try {
			this.anInt578 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt578 <= this.aClass29_2.aClass27_2.method515(this.anInt577)) {
							return;
						}
						this.anInt578 -= this.aClass29_2.aClass27_2.method515(this.anInt577) + 1;
						this.anInt577++;
					} while (this.anInt577 < this.aClass29_2.aClass27_2.anInt812);
				} while (this.anInt577 >= 0 && this.anInt577 < this.aClass29_2.aClass27_2.anInt812);
				this.anInt577 = 0;
				this.aBoolean128 = true;
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("92737, " + arg0 + ", " + false + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method315() {
		try {
			@Pc(13) Class1_Sub1_Sub1_Sub5 local13 = this.aClass29_2.method520();
			if (local13 == null) {
				return null;
			}
			@Pc(32) Class1_Sub1_Sub1_Sub5 local32 = new Class1_Sub1_Sub1_Sub5(true, local13, false, true, !this.aClass29_2.aBoolean187);
			if (!this.aBoolean128) {
				local32.method294(this.aByte25);
				local32.method295(this.aClass29_2.aClass27_2.anIntArray226[this.anInt577]);
				local32.anIntArrayArray8 = null;
				local32.anIntArrayArray7 = null;
			}
			if (this.aClass29_2.anInt843 != 128 || this.aClass29_2.anInt844 != 128) {
				local32.method303(this.aClass29_2.anInt843, this.aClass29_2.anInt843, this.aClass29_2.anInt844);
			}
			if (this.aClass29_2.anInt845 != 0) {
				if (this.aClass29_2.anInt845 == 90) {
					local32.method298();
				}
				if (this.aClass29_2.anInt845 == 180) {
					local32.method298();
					local32.method298();
				}
				if (this.aClass29_2.anInt845 == 270) {
					local32.method298();
					local32.method298();
					local32.method298();
				}
			}
			local32.method304(this.aClass29_2.anInt846 + 64, this.aClass29_2.anInt847 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("36341, " + -13634 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}
}
