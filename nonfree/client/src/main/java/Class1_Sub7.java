import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!bba", name = "p", descriptor = "I")
	private final int anInt744;

	@OriginalMember(owner = "client!bba", name = "u", descriptor = "Z")
	private final boolean aBoolean31;

	@OriginalMember(owner = "client!bba", name = "k", descriptor = "I")
	private final int anInt740;

	@OriginalMember(owner = "client!bba", name = "s", descriptor = "I")
	private final int anInt746;

	@OriginalMember(owner = "client!bba", name = "n", descriptor = "I")
	private final int anInt742;

	@OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
	private final int anInt739;

	@OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
	private final int anInt745;

	@OriginalMember(owner = "client!bba", name = "w", descriptor = "I")
	private final int anInt749;

	@OriginalMember(owner = "client!bba", name = "r", descriptor = "Z")
	private final boolean aBoolean30;

	@OriginalMember(owner = "client!bba", name = "x", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(ZLclient!gaa;)V")
	public Class1_Sub7(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class102 arg1) {
		if (Static151.aString31.startsWith("win")) {
			this.anInt744 = 1;
		} else if (Static151.aString31.startsWith("mac")) {
			this.anInt744 = 2;
		} else if (Static151.aString31.startsWith("linux")) {
			this.anInt744 = 3;
		} else {
			this.anInt744 = 4;
		}
		if (Static151.aString28.startsWith("amd64") || Static151.aString28.startsWith("x86_64")) {
			this.aBoolean31 = true;
		} else {
			this.aBoolean31 = false;
		}
		if (Static151.aString29.toLowerCase().indexOf("sun") != -1) {
			this.anInt740 = 1;
		} else if (Static151.aString29.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt740 = 2;
		} else if (Static151.aString29.toLowerCase().indexOf("apple") == -1) {
			this.anInt740 = 4;
		} else {
			this.anInt740 = 3;
		}
		@Pc(91) int local91 = 2;
		@Pc(93) int local93 = 0;
		@Pc(99) char local99;
		try {
			while (local91 < Static151.aString24.length()) {
				local99 = Static151.aString24.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local91++;
				local93 = local93 * 10 + local99 - 48;
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.anInt746 = local93;
		local91 = Static151.aString24.indexOf(46, 2) + 1;
		local93 = 0;
		try {
			while (Static151.aString24.length() > local91) {
				local99 = Static151.aString24.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local93 = local99 + local93 * 10 - 48;
				local91++;
			}
		} catch (@Pc(171) Exception local171) {
		}
		this.anInt742 = local93;
		local91 = Static151.aString24.indexOf(95, 4) + 1;
		local93 = 0;
		try {
			while (local91 < Static151.aString24.length()) {
				local99 = Static151.aString24.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local93 = local93 * 10 + local99 - 48;
				local91++;
			}
		} catch (@Pc(216) Exception local216) {
		}
		this.anInt739 = Static17.anInt454;
		if (this.anInt746 <= 3) {
			this.anInt745 = 0;
		} else {
			this.anInt745 = Static493.anInt8166;
		}
		this.anInt749 = local93;
		if (Static151.anInt2788 == 3) {
			this.aBoolean30 = true;
		} else {
			this.aBoolean30 = false;
		}
		try {
			this.anInt750 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(257) Throwable local257) {
			this.anInt750 = 0;
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!ge;)V")
	public void method757(@OriginalArg(1) Class1_Sub6 arg0) {
		arg0.method3937(2);
		arg0.method3937(this.anInt744);
		arg0.method3937(this.aBoolean31 ? 1 : 0);
		arg0.method3937(this.anInt740);
		arg0.method3937(this.anInt746);
		arg0.method3937(this.anInt742);
		arg0.method3937(this.anInt749);
		arg0.method3937(this.aBoolean30 ? 1 : 0);
		arg0.method3919(this.anInt739);
		arg0.method3937(this.anInt745);
		arg0.method3924(this.anInt750);
	}
}
