import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class1_Sub46 extends Class1 {

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	private final int anInt8013;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Z")
	private final boolean aBoolean544;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
	private final int anInt8016;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
	private final int anInt8015;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
	private final int anInt8017;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	private final int anInt8011;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
	private final int anInt8012;

	@OriginalMember(owner = "client!tn", name = "r", descriptor = "Z")
	private final boolean aBoolean545;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	private final int anInt8014;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
	private int anInt8010;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(ZLclient!lp;)V")
	public Class1_Sub46(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class182 arg1) {
		if (Static283.aString53.startsWith("win")) {
			this.anInt8013 = 1;
		} else if (Static283.aString53.startsWith("mac")) {
			this.anInt8013 = 2;
		} else if (Static283.aString53.startsWith("linux")) {
			this.anInt8013 = 3;
		} else {
			this.anInt8013 = 4;
		}
		if (Static283.aString51.startsWith("amd64") || Static283.aString51.startsWith("x86_64")) {
			this.aBoolean544 = true;
		} else {
			this.aBoolean544 = false;
		}
		if (Static283.aString52.toLowerCase().indexOf("sun") != -1) {
			this.anInt8016 = 1;
		} else if (Static283.aString52.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt8016 = 2;
		} else if (Static283.aString52.toLowerCase().indexOf("apple") == -1) {
			this.anInt8016 = 4;
		} else {
			this.anInt8016 = 3;
		}
		@Pc(82) int local82 = 2;
		@Pc(84) int local84 = 0;
		@Pc(89) char local89;
		try {
			while (Static283.aString49.length() > local82) {
				local89 = Static283.aString49.charAt(local82);
				if (local89 < '0' || local89 > '9') {
					break;
				}
				local84 = local84 * 10 + local89 - 48;
				local82++;
			}
		} catch (@Pc(119) Exception local119) {
		}
		this.anInt8015 = local84;
		local82 = Static283.aString49.indexOf(46, 2) + 1;
		local84 = 0;
		try {
			while (Static283.aString49.length() > local82) {
				local89 = Static283.aString49.charAt(local82);
				if (local89 < '0' || local89 > '9') {
					break;
				}
				local84 = local84 * 10 + local89 - 48;
				local82++;
			}
		} catch (@Pc(163) Exception local163) {
		}
		this.anInt8017 = local84;
		local84 = 0;
		local82 = Static283.aString49.indexOf(95, 4) + 1;
		try {
			while (Static283.aString49.length() > local82) {
				local89 = Static283.aString49.charAt(local82);
				if (local89 < '0' || local89 > '9') {
					break;
				}
				local82++;
				local84 = local89 + local84 * 10 - 48;
			}
		} catch (@Pc(206) Exception local206) {
		}
		this.anInt8011 = Static318.anInt6040;
		if (this.anInt8015 > 3) {
			this.anInt8012 = Static74.anInt2041;
		} else {
			this.anInt8012 = 0;
		}
		if (Static283.anInt5580 == 3) {
			this.aBoolean545 = true;
		} else {
			this.aBoolean545 = false;
		}
		this.anInt8014 = local84;
		try {
			this.anInt8010 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(245) Throwable local245) {
			this.anInt8010 = 0;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLclient!gw;)V")
	public void method6819(@OriginalArg(1) Class1_Sub13 arg0) {
		arg0.method3060(2);
		arg0.method3060(this.anInt8013);
		arg0.method3060(this.aBoolean544 ? 1 : 0);
		arg0.method3060(this.anInt8016);
		arg0.method3060(this.anInt8015);
		arg0.method3060(this.anInt8017);
		arg0.method3060(this.anInt8014);
		arg0.method3060(this.aBoolean545 ? 1 : 0);
		arg0.method3038(this.anInt8011);
		arg0.method3060(this.anInt8012);
		arg0.method3067(this.anInt8010);
	}
}
