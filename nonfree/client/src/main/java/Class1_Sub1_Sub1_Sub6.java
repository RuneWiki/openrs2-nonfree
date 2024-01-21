import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YGFSYDKK")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!YGFSYDKK", name = "t", descriptor = "I")
	private int anInt791;

	@OriginalMember(owner = "client!YGFSYDKK", name = "u", descriptor = "I")
	private int anInt792;

	@OriginalMember(owner = "client!YGFSYDKK", name = "r", descriptor = "I")
	private int anInt790 = -370;

	@OriginalMember(owner = "client!YGFSYDKK", name = "s", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!YGFSYDKK", name = "v", descriptor = "I")
	private int anInt793 = -593;

	@OriginalMember(owner = "client!YGFSYDKK", name = "w", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!YGFSYDKK", name = "x", descriptor = "Lclient!JEPDVFCL;")
	private Class18 aClass18_2;

	@OriginalMember(owner = "client!YGFSYDKK", name = "n", descriptor = "I")
	public int anInt786;

	@OriginalMember(owner = "client!YGFSYDKK", name = "o", descriptor = "I")
	public int anInt787;

	@OriginalMember(owner = "client!YGFSYDKK", name = "p", descriptor = "I")
	public int anInt788;

	@OriginalMember(owner = "client!YGFSYDKK", name = "q", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!YGFSYDKK", name = "m", descriptor = "I")
	public int anInt785;

	@OriginalMember(owner = "client!YGFSYDKK", name = "<init>", descriptor = "(BIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass18_2 = Class18.aClass18Array1[arg2];
			this.anInt786 = arg4;
			this.anInt787 = arg7;
			this.anInt788 = arg6;
			this.anInt789 = arg1;
			this.anInt785 = arg3 + arg5;
			this.aBoolean187 = false;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("97966, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGFSYDKK", name = "a", descriptor = "(II)V")
	public void method556(@OriginalArg(0) int arg0) {
		try {
			this.anInt792 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt792 <= this.aClass18_2.aClass46_2.method550(this.anInt791)) {
							return;
						}
						this.anInt792 -= this.aClass18_2.aClass46_2.method550(this.anInt791) + 1;
						this.anInt791++;
					} while (this.anInt791 < this.aClass18_2.aClass46_2.anInt771);
				} while (this.anInt791 >= 0 && this.anInt791 < this.aClass18_2.aClass46_2.anInt771);
				this.anInt791 = 0;
				this.aBoolean187 = true;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("4734, " + arg0 + ", " + 0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGFSYDKK", name = "a", descriptor = "(Z)Lclient!GCSAWSJV;")
	@Override
	protected Class1_Sub1_Sub1_Sub2 method555() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub2 local3 = this.aClass18_2.method234();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = this.aClass18_2.aClass46_2.anIntArray198[this.anInt791];
			@Pc(27) Class1_Sub1_Sub1_Sub2 local27 = new Class1_Sub1_Sub1_Sub2(0, local3, true, Class31.method388(this.aBoolean188, local15), false);
			if (!this.aBoolean187) {
				local27.method150();
				local27.method151(local15);
				local27.anIntArrayArray5 = null;
				local27.anIntArrayArray4 = null;
			}
			if (this.aClass18_2.anInt317 != 128 || this.aClass18_2.anInt318 != 128) {
				local27.method159(this.aClass18_2.anInt317, this.aClass18_2.anInt317, this.aClass18_2.anInt318);
			}
			if (this.aClass18_2.anInt319 != 0) {
				if (this.aClass18_2.anInt319 == 90) {
					local27.method154();
				}
				if (this.aClass18_2.anInt319 == 180) {
					local27.method154();
					local27.method154();
				}
				if (this.aClass18_2.anInt319 == 270) {
					local27.method154();
					local27.method154();
					local27.method154();
				}
			}
			local27.method160(this.aClass18_2.anInt320 + 64, this.aClass18_2.anInt321 + 850, -30, -50, -30, true);
			return local27;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("96634, " + false + ", " + local126.toString());
			throw new RuntimeException();
		}
	}
}
