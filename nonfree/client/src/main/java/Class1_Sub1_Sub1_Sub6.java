import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	private int anInt587;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	private int anInt588;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	private int anInt581 = -31142;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!nc;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public int anInt583;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public int anInt584;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public int anInt585;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass27_2 = Class27.aClass27Array1[arg0];
			this.anInt583 = arg7;
			this.anInt584 = arg5;
			this.anInt585 = arg3;
			this.anInt586 = arg2;
			this.anInt582 = arg4 + arg1;
			this.aBoolean110 = false;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("80970, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public void method313(@OriginalArg(1) int arg0) {
		try {
			this.anInt588 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt588 <= this.aClass27_2.aClass25_2.method484(this.anInt587)) {
							return;
						}
						this.anInt588 -= this.aClass27_2.aClass25_2.method484(this.anInt587) + 1;
						this.anInt587++;
					} while (this.anInt587 < this.aClass27_2.aClass25_2.anInt778);
				} while (this.anInt587 >= 0 && this.anInt587 < this.aClass27_2.aClass25_2.anInt778);
				this.anInt587 = 0;
				this.aBoolean110 = true;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("30138, " + 176 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method312(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass27_2.method490();
			if (local3 == null) {
				return null;
			}
			@Pc(22) Class1_Sub1_Sub1_Sub5 local22 = new Class1_Sub1_Sub1_Sub5(8, true, !this.aClass27_2.aBoolean166, false, local3);
			if (!this.aBoolean110) {
				local22.method285();
				local22.method286(this.aClass27_2.aClass25_2.anIntArray215[this.anInt587]);
				local22.anIntArrayArray8 = null;
				local22.anIntArrayArray7 = null;
			}
			if (this.aClass27_2.anInt812 != 128 || this.aClass27_2.anInt813 != 128) {
				local22.method294(this.aClass27_2.anInt812, this.aClass27_2.anInt812, this.aClass27_2.anInt813);
			}
			if (this.aClass27_2.anInt814 != 0) {
				if (this.aClass27_2.anInt814 == 90) {
					local22.method289();
				}
				if (this.aClass27_2.anInt814 == 180) {
					local22.method289();
					local22.method289();
				}
				if (this.aClass27_2.anInt814 == 270) {
					local22.method289();
					local22.method289();
					local22.method289();
				}
			}
			local22.method295(this.aClass27_2.anInt815 + 64, this.aClass27_2.anInt816 + 850, -30, -50, -30, true);
			if (arg0 != 0) {
				this.aBoolean109 = !this.aBoolean109;
			}
			return local22;
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("49686, " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}
}
