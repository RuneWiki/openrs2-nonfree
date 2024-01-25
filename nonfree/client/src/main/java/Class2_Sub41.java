import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
	private final int anInt7863;

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "Z")
	private final boolean aBoolean576;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
	private final int anInt7855;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
	private final int anInt7853;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
	private final int anInt7857;

	@OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
	private final int anInt7865;

	@OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
	private final int anInt7861;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
	private final int anInt7854;

	@OriginalMember(owner = "client!rt", name = "s", descriptor = "Z")
	private final boolean aBoolean577;

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
	private int anInt7860;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ZLclient!uf;)V")
	public Class2_Sub41(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class283 arg1) {
		if (Static482.aString187.startsWith("win")) {
			this.anInt7863 = 1;
		} else if (Static482.aString187.startsWith("mac")) {
			this.anInt7863 = 2;
		} else if (Static482.aString187.startsWith("linux")) {
			this.anInt7863 = 3;
		} else {
			this.anInt7863 = 4;
		}
		if (Static482.aString182.startsWith("amd64") || Static482.aString182.startsWith("x86_64")) {
			this.aBoolean576 = true;
		} else {
			this.aBoolean576 = false;
		}
		if (Static482.aString183.toLowerCase().indexOf("sun") != -1) {
			this.anInt7855 = 1;
		} else if (Static482.aString183.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt7855 = 2;
		} else if (Static482.aString183.toLowerCase().indexOf("apple") == -1) {
			this.anInt7855 = 4;
		} else {
			this.anInt7855 = 3;
		}
		@Pc(91) int local91 = 2;
		@Pc(93) int local93 = 0;
		@Pc(99) char local99;
		try {
			while (local91 < Static482.aString186.length()) {
				local99 = Static482.aString186.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local93 = local93 * 10 + local99 - 48;
				local91++;
			}
		} catch (@Pc(128) Exception local128) {
		}
		this.anInt7853 = local93;
		local93 = 0;
		local91 = Static482.aString186.indexOf(46, 2) + 1;
		try {
			while (Static482.aString186.length() > local91) {
				local99 = Static482.aString186.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local91++;
				local93 = local99 + local93 * 10 - 48;
			}
		} catch (@Pc(175) Exception local175) {
		}
		this.anInt7857 = local93;
		local91 = Static482.aString186.indexOf(95, 4) + 1;
		local93 = 0;
		try {
			while (Static482.aString186.length() > local91) {
				local99 = Static482.aString186.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local93 = local93 * 10 + local99 - 48;
				local91++;
			}
		} catch (@Pc(223) Exception local223) {
		}
		if (this.anInt7853 <= 3) {
			this.anInt7865 = 0;
		} else {
			this.anInt7865 = Static423.anInt7844;
		}
		this.anInt7861 = Static78.anInt1651;
		this.anInt7854 = local93;
		if (Static482.anInt8574 == 3) {
			this.aBoolean577 = true;
		} else {
			this.aBoolean577 = false;
		}
		try {
			this.anInt7860 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(262) Throwable local262) {
			this.anInt7860 = 0;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLclient!ps;)V")
	public void method6569(@OriginalArg(1) Class2_Sub29 arg0) {
		arg0.method5172(2);
		arg0.method5172(this.anInt7863);
		arg0.method5172(this.aBoolean576 ? 1 : 0);
		arg0.method5172(this.anInt7855);
		arg0.method5172(this.anInt7853);
		arg0.method5172(this.anInt7857);
		arg0.method5172(this.anInt7854);
		arg0.method5172(this.aBoolean577 ? 1 : 0);
		arg0.method5217(this.anInt7861);
		arg0.method5172(this.anInt7865);
		arg0.method5178(this.anInt7860);
	}
}
