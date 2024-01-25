import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class12_Sub47 extends Class12 {

	@OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
	private final int anInt8363;

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "Z")
	private final boolean aBoolean591;

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
	private final int anInt8354;

	@OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
	private final int anInt8362;

	@OriginalMember(owner = "client!sw", name = "A", descriptor = "I")
	private final int anInt8365;

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "I")
	private final int anInt8364;

	@OriginalMember(owner = "client!sw", name = "r", descriptor = "Z")
	private final boolean aBoolean592;

	@OriginalMember(owner = "client!sw", name = "u", descriptor = "I")
	private final int anInt8360;

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
	private final int anInt8358;

	@OriginalMember(owner = "client!sw", name = "q", descriptor = "I")
	private int anInt8357;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(ZLclient!dj;)V")
	public Class12_Sub47(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class71 arg1) {
		if (Static92.aString17.startsWith("win")) {
			this.anInt8363 = 1;
		} else if (Static92.aString17.startsWith("mac")) {
			this.anInt8363 = 2;
		} else if (Static92.aString17.startsWith("linux")) {
			this.anInt8363 = 3;
		} else {
			this.anInt8363 = 4;
		}
		if (Static92.aString18.startsWith("amd64") || Static92.aString18.startsWith("x86_64")) {
			this.aBoolean591 = true;
		} else {
			this.aBoolean591 = false;
		}
		if (Static92.aString15.toLowerCase().indexOf("sun") != -1) {
			this.anInt8354 = 1;
		} else if (Static92.aString15.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt8354 = 2;
		} else if (Static92.aString15.toLowerCase().indexOf("apple") == -1) {
			this.anInt8354 = 4;
		} else {
			this.anInt8354 = 3;
		}
		@Pc(92) int local92 = 2;
		@Pc(94) int local94 = 0;
		@Pc(100) char local100;
		try {
			while (local92 < Static92.aString20.length()) {
				local100 = Static92.aString20.charAt(local92);
				if (local100 < '0' || local100 > '9') {
					break;
				}
				local94 = local94 * 10 + local100 - '0';
				local92++;
			}
		} catch (@Pc(126) Exception local126) {
		}
		this.anInt8362 = local94;
		local94 = 0;
		local92 = Static92.aString20.indexOf(46, 2) + 1;
		try {
			while (Static92.aString20.length() > local92) {
				local100 = Static92.aString20.charAt(local92);
				if (local100 < '0' || local100 > '9') {
					break;
				}
				local94 = local94 * 10 + local100 - '0';
				local92++;
			}
		} catch (@Pc(169) Exception local169) {
		}
		this.anInt8365 = local94;
		local94 = 0;
		local92 = Static92.aString20.indexOf(95, 4) + 1;
		try {
			while (local92 < Static92.aString20.length()) {
				local100 = Static92.aString20.charAt(local92);
				if (local100 < '0' || local100 > '9') {
					break;
				}
				local92++;
				local94 = local100 + local94 * 10 - 48;
			}
		} catch (@Pc(214) Exception local214) {
		}
		if (this.anInt8362 > 3) {
			this.anInt8364 = Static52.anInt1395;
		} else {
			this.anInt8364 = 0;
		}
		if (Static92.anInt2161 == 3) {
			this.aBoolean592 = true;
		} else {
			this.aBoolean592 = false;
		}
		this.anInt8360 = Static458.anInt8335;
		this.anInt8358 = local94;
		try {
			this.anInt8357 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(253) Throwable local253) {
			this.anInt8357 = 0;
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!daa;I)V")
	public void method6918(@OriginalArg(0) Class12_Sub8 arg0) {
		arg0.method5214(2);
		arg0.method5214(this.anInt8363);
		arg0.method5214(this.aBoolean591 ? 1 : 0);
		arg0.method5214(this.anInt8354);
		arg0.method5214(this.anInt8362);
		arg0.method5214(this.anInt8365);
		arg0.method5214(this.anInt8358);
		arg0.method5214(this.aBoolean592 ? 1 : 0);
		arg0.method5190(this.anInt8360);
		arg0.method5214(this.anInt8364);
		arg0.method5194(this.anInt8357);
	}
}
