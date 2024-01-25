import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class6_Sub43 extends Class6 {

	@OriginalMember(owner = "client!qea", name = "s", descriptor = "I")
	private final int anInt7294;

	@OriginalMember(owner = "client!qea", name = "q", descriptor = "Z")
	private final boolean aBoolean506;

	@OriginalMember(owner = "client!qea", name = "n", descriptor = "I")
	private final int anInt7291;

	@OriginalMember(owner = "client!qea", name = "o", descriptor = "I")
	private final int anInt7292;

	@OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
	private final int anInt7290;

	@OriginalMember(owner = "client!qea", name = "u", descriptor = "I")
	private final int anInt7296;

	@OriginalMember(owner = "client!qea", name = "t", descriptor = "I")
	private final int anInt7295;

	@OriginalMember(owner = "client!qea", name = "m", descriptor = "Z")
	private final boolean aBoolean505;

	@OriginalMember(owner = "client!qea", name = "v", descriptor = "I")
	private final int anInt7297;

	@OriginalMember(owner = "client!qea", name = "x", descriptor = "I")
	private int anInt7298;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(ZLclient!cr;)V")
	public Class6_Sub43(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class57 arg1) {
		if (Static70.aString18.startsWith("win")) {
			this.anInt7294 = 1;
		} else if (Static70.aString18.startsWith("mac")) {
			this.anInt7294 = 2;
		} else if (Static70.aString18.startsWith("linux")) {
			this.anInt7294 = 3;
		} else {
			this.anInt7294 = 4;
		}
		if (Static70.aString15.startsWith("amd64") || Static70.aString15.startsWith("x86_64")) {
			this.aBoolean506 = true;
		} else {
			this.aBoolean506 = false;
		}
		if (Static70.aString14.toLowerCase().indexOf("sun") != -1) {
			this.anInt7291 = 1;
		} else if (Static70.aString14.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt7291 = 2;
		} else if (Static70.aString14.toLowerCase().indexOf("apple") == -1) {
			this.anInt7291 = 4;
		} else {
			this.anInt7291 = 3;
		}
		@Pc(91) int local91 = 2;
		@Pc(93) int local93 = 0;
		@Pc(99) char local99;
		try {
			while (Static70.aString19.length() > local91) {
				local99 = Static70.aString19.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local93 = local99 + local93 * 10 - 48;
				local91++;
			}
		} catch (@Pc(124) Exception local124) {
		}
		this.anInt7292 = local93;
		local91 = Static70.aString19.indexOf(46, 2) + 1;
		local93 = 0;
		try {
			while (Static70.aString19.length() > local91) {
				local99 = Static70.aString19.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local91++;
				local93 = local99 + local93 * 10 - 48;
			}
		} catch (@Pc(168) Exception local168) {
		}
		this.anInt7290 = local93;
		local91 = Static70.aString19.indexOf(95, 4) + 1;
		local93 = 0;
		try {
			while (Static70.aString19.length() > local91) {
				local99 = Static70.aString19.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local91++;
				local93 = local99 + local93 * 10 - 48;
			}
		} catch (@Pc(211) Exception local211) {
		}
		if (this.anInt7292 <= 3) {
			this.anInt7296 = 0;
		} else {
			this.anInt7296 = Static164.anInt2901;
		}
		this.anInt7295 = local93;
		if (arg1.aBoolean74) {
			this.aBoolean505 = false;
		} else {
			this.aBoolean505 = true;
		}
		this.anInt7297 = Static31.anInt551;
		try {
			this.anInt7298 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(252) Throwable local252) {
			this.anInt7298 = 0;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!dga;I)V")
	public void method6059(@OriginalArg(0) Class6_Sub14 arg0) {
		arg0.method6035(2);
		arg0.method6035(this.anInt7294);
		arg0.method6035(this.aBoolean506 ? 1 : 0);
		arg0.method6035(this.anInt7291);
		arg0.method6035(this.anInt7292);
		arg0.method6035(this.anInt7290);
		arg0.method6035(this.anInt7295);
		arg0.method6035(this.aBoolean505 ? 1 : 0);
		arg0.method5999(this.anInt7297);
		arg0.method6035(this.anInt7296);
		arg0.method6016(this.anInt7298);
	}
}
