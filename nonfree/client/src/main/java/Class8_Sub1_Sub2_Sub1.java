import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EWLVGVJE")
public final class Class8_Sub1_Sub2_Sub1 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!EWLVGVJE", name = "o", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!EWLVGVJE", name = "t", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!EWLVGVJE", name = "u", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!EWLVGVJE", name = "l", descriptor = "B")
	private byte aByte9 = 1;

	@OriginalMember(owner = "client!EWLVGVJE", name = "m", descriptor = "Z")
	public boolean aBoolean49 = false;

	@OriginalMember(owner = "client!EWLVGVJE", name = "w", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!EWLVGVJE", name = "x", descriptor = "I")
	private int anInt236 = -371;

	@OriginalMember(owner = "client!EWLVGVJE", name = "v", descriptor = "Lclient!XHDTVZNY;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!EWLVGVJE", name = "p", descriptor = "I")
	public int anInt230;

	@OriginalMember(owner = "client!EWLVGVJE", name = "q", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!EWLVGVJE", name = "r", descriptor = "I")
	public int anInt232;

	@OriginalMember(owner = "client!EWLVGVJE", name = "s", descriptor = "I")
	public int anInt233;

	@OriginalMember(owner = "client!EWLVGVJE", name = "n", descriptor = "I")
	public int anInt228;

	@OriginalMember(owner = "client!EWLVGVJE", name = "<init>", descriptor = "(IIIIIZII)V")
	public Class8_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass44_1 = Class44.aClass44Array1[arg0];
			this.anInt230 = arg2;
			this.anInt231 = arg7;
			this.anInt232 = arg3;
			this.anInt233 = arg1;
			this.anInt228 = arg6 + arg4;
			this.aBoolean49 = false;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("18922, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWLVGVJE", name = "a", descriptor = "(I)Lclient!VHYCWIPJ;")
	@Override
	protected Class8_Sub1_Sub2_Sub5 method557() {
		try {
			@Pc(3) Class8_Sub1_Sub2_Sub5 local3 = this.aClass44_1.method551();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass44_1.aClass40_1.anIntArray159[this.anInt234];
			@Pc(34) Class8_Sub1_Sub2_Sub5 local34 = new Class8_Sub1_Sub2_Sub5((byte) 9, Class35.method448(local15, this.aByte9), true, false, local3);
			if (!this.aBoolean49) {
				local34.method470();
				local34.method471(local15);
				local34.anIntArrayArray16 = null;
				local34.anIntArrayArray15 = null;
			}
			if (this.aClass44_1.anInt780 != 128 || this.aClass44_1.anInt781 != 128) {
				local34.method479(this.aBoolean50, this.aClass44_1.anInt780, this.aClass44_1.anInt780, this.aClass44_1.anInt781);
			}
			if (this.aClass44_1.anInt782 != 0) {
				if (this.aClass44_1.anInt782 == 90) {
					local34.method474();
				}
				if (this.aClass44_1.anInt782 == 180) {
					local34.method474();
					local34.method474();
				}
				if (this.aClass44_1.anInt782 == 270) {
					local34.method474();
					local34.method474();
					local34.method474();
				}
			}
			local34.method480(this.aClass44_1.anInt783 + 64, this.aClass44_1.anInt784 + 850, -30, -50, -30, true);
			return local34;
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("96430, " + -650 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EWLVGVJE", name = "a", descriptor = "(II)V")
	public void method137(@OriginalArg(0) int arg0) {
		try {
			this.anInt235 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt235 <= this.aClass44_1.aClass40_1.method522(this.anInt234)) {
							return;
						}
						this.anInt235 -= this.aClass44_1.aClass40_1.method522(this.anInt234) + 1;
						this.anInt234++;
					} while (this.anInt234 < this.aClass44_1.aClass40_1.anInt753);
				} while (this.anInt234 >= 0 && this.anInt234 < this.aClass44_1.aClass40_1.anInt753);
				this.anInt234 = 0;
				this.aBoolean49 = true;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("9619, " + arg0 + ", " + 0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}
}
