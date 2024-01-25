import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	private final int anInt2230;

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "Z")
	private final boolean aBoolean187;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	private final int anInt2228;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
	private final int anInt2226;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
	private final int anInt2233;

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "Z")
	private final boolean aBoolean188;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
	private final int anInt2231;

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
	private final int anInt2229;

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
	private final int anInt2234;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	private int anInt2225;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(ZLclient!pq;)V")
	public Class1_Sub11(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class229 arg1) {
		if (Static380.aString170.startsWith("win")) {
			this.anInt2230 = 1;
		} else if (Static380.aString170.startsWith("mac")) {
			this.anInt2230 = 2;
		} else if (Static380.aString170.startsWith("linux")) {
			this.anInt2230 = 3;
		} else {
			this.anInt2230 = 4;
		}
		if (Static380.aString165.startsWith("amd64") || Static380.aString165.startsWith("x86_64")) {
			this.aBoolean187 = true;
		} else {
			this.aBoolean187 = false;
		}
		if (Static380.aString168.toLowerCase().indexOf("sun") != -1) {
			this.anInt2228 = 1;
		} else if (Static380.aString168.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt2228 = 2;
		} else if (Static380.aString168.toLowerCase().indexOf("apple") == -1) {
			this.anInt2228 = 4;
		} else {
			this.anInt2228 = 3;
		}
		@Pc(90) int local90 = 2;
		@Pc(92) int local92 = 0;
		@Pc(98) char local98;
		try {
			while (Static380.aString172.length() > local90) {
				local98 = Static380.aString172.charAt(local90);
				if (local98 < '0' || local98 > '9') {
					break;
				}
				local90++;
				local92 = local98 + local92 * 10 - 48;
			}
		} catch (@Pc(122) Exception local122) {
		}
		this.anInt2226 = local92;
		local92 = 0;
		local90 = Static380.aString172.indexOf(46, 2) + 1;
		try {
			while (Static380.aString172.length() > local90) {
				local98 = Static380.aString172.charAt(local90);
				if (local98 < '0' || local98 > '9') {
					break;
				}
				local92 = local98 + local92 * 10 - 48;
				local90++;
			}
		} catch (@Pc(166) Exception local166) {
		}
		this.anInt2233 = local92;
		local92 = 0;
		local90 = Static380.aString172.indexOf(95, 4) + 1;
		try {
			while (Static380.aString172.length() > local90) {
				local98 = Static380.aString172.charAt(local90);
				if (local98 < '0' || local98 > '9') {
					break;
				}
				local90++;
				local92 = local92 * 10 + local98 - 48;
			}
		} catch (@Pc(213) Exception local213) {
		}
		if (Static380.anInt6743 == 3) {
			this.aBoolean188 = true;
		} else {
			this.aBoolean188 = false;
		}
		this.anInt2231 = local92;
		if (this.anInt2226 <= 3) {
			this.anInt2229 = 0;
		} else {
			this.anInt2229 = Static6.anInt163;
		}
		this.anInt2234 = Static520.anInt9181;
		try {
			this.anInt2225 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(252) Throwable local252) {
			this.anInt2225 = 0;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!os;I)V")
	public void method2153(@OriginalArg(0) Class1_Sub17 arg0) {
		arg0.method4451(2);
		arg0.method4451(this.anInt2230);
		arg0.method4451(this.aBoolean187 ? 1 : 0);
		arg0.method4451(this.anInt2228);
		arg0.method4451(this.anInt2226);
		arg0.method4451(this.anInt2233);
		arg0.method4451(this.anInt2231);
		arg0.method4451(this.aBoolean188 ? 1 : 0);
		arg0.method4473(this.anInt2234);
		arg0.method4451(this.anInt2229);
		arg0.method4460(this.anInt2225);
	}
}
