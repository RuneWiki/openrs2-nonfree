import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class181 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "[Lclient!ul;")
	public Class165[] aClass165Array1;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "[I")
	public int[] anIntArray693;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "[I")
	public int[] anIntArray694;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	public int anInt5900;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "[I")
	public int[] anIntArray695;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "[I")
	public int[] anIntArray696;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public int anInt5906;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "[I")
	public int[] anIntArray697;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
	public int anInt5909;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "[I")
	public int[] anIntArray698;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "Lclient!ul;")
	public Class165 aClass165_1;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	public int anInt5905;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "([BI)V")
	public Class181(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5905 = Static122.method1908(arg0.length, arg0);
		if (arg1 != this.anInt5905) {
			throw new RuntimeException();
		}
		this.method4550(arg0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[B)V")
	private void method4550(@OriginalArg(1) byte[] arg0) {
		@Pc(12) Class1_Sub18 local12 = new Class1_Sub18(Static283.method4318(arg0));
		@Pc(16) int local16 = local12.method3122();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 >= 6) {
			this.anInt5909 = local12.method3074();
		} else {
			this.anInt5909 = 0;
		}
		@Pc(44) int local44 = local12.method3122();
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = -1;
		this.anInt5900 = local12.method3107();
		this.anIntArray693 = new int[this.anInt5900];
		@Pc(66) int local66;
		for (local66 = 0; local66 < this.anInt5900; local66++) {
			this.anIntArray693[local66] = local46 += local12.method3107();
			if (local48 < this.anIntArray693[local66]) {
				local48 = this.anIntArray693[local66];
			}
		}
		this.anInt5906 = local48 + 1;
		this.anIntArray695 = new int[this.anInt5906];
		this.anIntArray694 = new int[this.anInt5906];
		this.anIntArrayArray46 = new int[this.anInt5906][];
		this.anIntArray697 = new int[this.anInt5906];
		this.anIntArray698 = new int[this.anInt5906];
		if (local44 != 0) {
			this.anIntArray696 = new int[this.anInt5906];
			for (local66 = 0; local66 < this.anInt5906; local66++) {
				this.anIntArray696[local66] = -1;
			}
			for (local66 = 0; local66 < this.anInt5900; local66++) {
				this.anIntArray696[this.anIntArray693[local66]] = local12.method3074();
			}
			this.aClass165_1 = new Class165(this.anIntArray696);
		}
		for (local66 = 0; local66 < this.anInt5900; local66++) {
			this.anIntArray698[this.anIntArray693[local66]] = local12.method3074();
		}
		for (local66 = 0; local66 < this.anInt5900; local66++) {
			this.anIntArray694[this.anIntArray693[local66]] = local12.method3074();
		}
		for (local66 = 0; local66 < this.anInt5900; local66++) {
			this.anIntArray695[this.anIntArray693[local66]] = local12.method3107();
		}
		@Pc(255) int local255;
		@Pc(260) int local260;
		@Pc(270) int local270;
		@Pc(272) int local272;
		for (local66 = 0; local66 < this.anInt5900; local66++) {
			local255 = this.anIntArray693[local66];
			local260 = this.anIntArray695[local255];
			local46 = 0;
			this.anIntArrayArray46[local255] = new int[local260];
			local270 = -1;
			for (local272 = 0; local272 < local260; local272++) {
				@Pc(294) int local294 = this.anIntArrayArray46[local255][local272] = local46 += local12.method3107();
				if (local294 > local270) {
					local270 = local294;
				}
			}
			this.anIntArray697[local255] = local270 + 1;
			if (local260 == local270 + 1) {
				this.anIntArrayArray46[local255] = null;
			}
		}
		if (local44 == 0) {
			return;
		}
		this.anIntArrayArray47 = new int[local48 + 1][];
		this.aClass165Array1 = new Class165[local48 + 1];
		for (local66 = 0; local66 < this.anInt5900; local66++) {
			local255 = this.anIntArray693[local66];
			local260 = this.anIntArray695[local255];
			this.anIntArrayArray47[local255] = new int[this.anIntArray697[local255]];
			for (local270 = 0; local270 < this.anIntArray697[local255]; local270++) {
				this.anIntArrayArray47[local255][local270] = -1;
			}
			for (local270 = 0; local270 < local260; local270++) {
				if (this.anIntArrayArray46[local255] == null) {
					local272 = local270;
				} else {
					local272 = this.anIntArrayArray46[local255][local270];
				}
				this.anIntArrayArray47[local255][local272] = local12.method3074();
			}
			this.aClass165Array1[local255] = new Class165(this.anIntArrayArray47[local255]);
		}
	}
}
