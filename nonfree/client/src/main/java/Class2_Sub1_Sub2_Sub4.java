import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QFKXENAK")
public final class Class2_Sub1_Sub2_Sub4 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!QFKXENAK", name = "p", descriptor = "I")
	private int anInt556;

	@OriginalMember(owner = "client!QFKXENAK", name = "q", descriptor = "I")
	private int anInt557;

	@OriginalMember(owner = "client!QFKXENAK", name = "m", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!QFKXENAK", name = "n", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!QFKXENAK", name = "l", descriptor = "Lclient!NGIGHQOG;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!QFKXENAK", name = "r", descriptor = "I")
	public int anInt558;

	@OriginalMember(owner = "client!QFKXENAK", name = "s", descriptor = "I")
	public int anInt559;

	@OriginalMember(owner = "client!QFKXENAK", name = "t", descriptor = "I")
	public int anInt560;

	@OriginalMember(owner = "client!QFKXENAK", name = "u", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!QFKXENAK", name = "o", descriptor = "I")
	public int anInt555;

	@OriginalMember(owner = "client!QFKXENAK", name = "<init>", descriptor = "(ZIIIIIII)V")
	public Class2_Sub1_Sub2_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass27_2 = Class27.aClass27Array1[arg1];
			this.anInt558 = arg5;
			this.anInt559 = arg6;
			this.anInt560 = arg4;
			this.anInt561 = arg3;
			this.anInt555 = arg7 + arg2;
			this.aBoolean148 = false;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("98369, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QFKXENAK", name = "a", descriptor = "(IZ)V")
	public void method354(@OriginalArg(0) int arg0) {
		try {
			this.anInt557 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt557 <= this.aClass27_2.aClass49_1.method571(this.anInt556)) {
							return;
						}
						this.anInt557 -= this.aClass27_2.aClass49_1.method571(this.anInt556) + 1;
						this.anInt556++;
					} while (this.anInt556 < this.aClass27_2.aClass49_1.anInt767);
				} while (this.anInt556 >= 0 && this.anInt556 < this.aClass27_2.aClass49_1.anInt767);
				this.anInt556 = 0;
				this.aBoolean148 = true;
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("65714, " + arg0 + ", " + false + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QFKXENAK", name = "a", descriptor = "(B)Lclient!SNMMQNPZ;")
	@Override
	protected Class2_Sub1_Sub2_Sub5 method561(@OriginalArg(0) byte arg0) {
		try {
			@Pc(13) Class2_Sub1_Sub2_Sub5 local13 = this.aClass27_2.method291();
			if (local13 == null) {
				return null;
			}
			@Pc(25) int local25 = this.aClass27_2.aClass49_1.anIntArray206[this.anInt556];
			@Pc(36) Class2_Sub1_Sub2_Sub5 local36 = new Class2_Sub1_Sub2_Sub5(local13, 707, false, true, Class29.method296(local25));
			if (!this.aBoolean148) {
				local36.method391();
				local36.method392(local25);
				local36.anIntArrayArray13 = null;
				local36.anIntArrayArray12 = null;
			}
			if (this.aClass27_2.anInt484 != 128 || this.aClass27_2.anInt485 != 128) {
				local36.method400(this.aClass27_2.anInt484, this.aClass27_2.anInt484, this.aClass27_2.anInt485);
			}
			if (this.aClass27_2.anInt486 != 0) {
				if (this.aClass27_2.anInt486 == 90) {
					local36.method395();
				}
				if (this.aClass27_2.anInt486 == 180) {
					local36.method395();
					local36.method395();
				}
				if (this.aClass27_2.anInt486 == 270) {
					local36.method395();
					local36.method395();
					local36.method395();
				}
			}
			local36.method401(this.aClass27_2.anInt487 + 64, this.aClass27_2.anInt488 + 850, -30, -50, -30, true);
			return local36;
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("94252, " + 5 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}
}
