import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	private int anInt587;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	private int anInt588;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	private int anInt581 = -159;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!nc;")
	private Class27 aClass27_2;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public int anInt583;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public int anInt584;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public int anInt585;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public int anInt586;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.aClass27_2 = Class27.aClass27Array1[arg2];
			this.anInt583 = arg6;
			this.anInt584 = arg1;
			this.anInt585 = arg0;
			this.anInt586 = arg5;
			this.anInt582 = arg3 + arg4;
			this.aBoolean118 = false;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("12752, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public void method314(@OriginalArg(1) int arg0) {
		try {
			this.anInt588 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt588 <= this.aClass27_2.aClass25_2.method485(this.anInt587)) {
							return;
						}
						this.anInt588 -= this.aClass27_2.aClass25_2.method485(this.anInt587) + 1;
						this.anInt587++;
					} while (this.anInt587 < this.aClass27_2.aClass25_2.anInt785);
				} while (this.anInt587 >= 0 && this.anInt587 < this.aClass27_2.aClass25_2.anInt785);
				this.anInt587 = 0;
				this.aBoolean118 = true;
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("77425, " + 0 + ", " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method313() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass27_2.method491();
			if (local3 == null) {
				return null;
			}
			@Pc(28) Class1_Sub1_Sub1_Sub5 local28 = new Class1_Sub1_Sub1_Sub5(-435, true, false, local3, !this.aClass27_2.aBoolean168);
			if (!this.aBoolean118) {
				local28.method286();
				local28.method287(this.aClass27_2.aClass25_2.anIntArray215[this.anInt587]);
				local28.anIntArrayArray8 = null;
				local28.anIntArrayArray7 = null;
			}
			if (this.aClass27_2.anInt819 != 128 || this.aClass27_2.anInt820 != 128) {
				local28.method295(this.aClass27_2.anInt820, this.aClass27_2.anInt819, this.aClass27_2.anInt819);
			}
			if (this.aClass27_2.anInt821 != 0) {
				if (this.aClass27_2.anInt821 == 90) {
					local28.method290();
				}
				if (this.aClass27_2.anInt821 == 180) {
					local28.method290();
					local28.method290();
				}
				if (this.aClass27_2.anInt821 == 270) {
					local28.method290();
					local28.method290();
					local28.method290();
				}
			}
			local28.method296(this.aClass27_2.anInt822 + 64, this.aClass27_2.anInt823 + 850, -30, -50, -30, true);
			return local28;
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("75196, " + false + ", " + local128.toString());
			throw new RuntimeException();
		}
	}
}
