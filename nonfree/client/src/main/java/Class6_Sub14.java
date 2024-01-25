import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class6_Sub14 extends Class6 {

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	private final int anInt1763;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "Z")
	private final boolean aBoolean125;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "I")
	private int anInt1776;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "I")
	private final int anInt1767;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	private final int anInt1766;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	private final int anInt1768;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "Z")
	private final boolean aBoolean126;

	@OriginalMember(owner = "client!di", name = "r", descriptor = "I")
	private final int anInt1771;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "I")
	private final int anInt1773;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "I")
	private final int anInt1772;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "I")
	private int anInt1765;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	private int anInt1764;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(ZLclient!qj;)V")
	public Class6_Sub14(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class272 arg1) {
		if (Static426.aString72.startsWith("win")) {
			this.anInt1763 = 1;
		} else if (Static426.aString72.startsWith("mac")) {
			this.anInt1763 = 2;
		} else if (Static426.aString72.startsWith("linux")) {
			this.anInt1763 = 3;
		} else {
			this.anInt1763 = 4;
		}
		if (Static426.aString69.startsWith("amd64") || Static426.aString69.startsWith("x86_64")) {
			this.aBoolean125 = true;
		} else {
			this.aBoolean125 = false;
		}
		if (this.anInt1763 == 1) {
			if (Static426.aString73.indexOf("4.0") != -1) {
				this.anInt1776 = 1;
			} else if (Static426.aString73.indexOf("4.1") != -1) {
				this.anInt1776 = 2;
			} else if (Static426.aString73.indexOf("4.9") != -1) {
				this.anInt1776 = 3;
			} else if (Static426.aString73.indexOf("5.0") != -1) {
				this.anInt1776 = 4;
			} else if (Static426.aString73.indexOf("5.1") != -1) {
				this.anInt1776 = 5;
			} else if (Static426.aString73.indexOf("6.0") != -1) {
				this.anInt1776 = 6;
			} else if (Static426.aString73.indexOf("6.1") != -1) {
				this.anInt1776 = 7;
			}
		} else if (this.anInt1763 == 2) {
			if (Static426.aString73.indexOf("10.4") != -1) {
				this.anInt1776 = 20;
			} else if (Static426.aString73.indexOf("10.5") != -1) {
				this.anInt1776 = 21;
			} else if (Static426.aString73.indexOf("10.6") != -1) {
				this.anInt1776 = 22;
			}
		}
		if (Static426.aString70.toLowerCase().indexOf("sun") != -1) {
			this.anInt1767 = 1;
		} else if (Static426.aString70.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt1767 = 2;
		} else if (Static426.aString70.toLowerCase().indexOf("apple") == -1) {
			this.anInt1767 = 4;
		} else {
			this.anInt1767 = 3;
		}
		@Pc(206) int local206 = 2;
		@Pc(208) int local208 = 0;
		@Pc(214) char local214;
		try {
			while (local206 < Static426.aString68.length()) {
				local214 = Static426.aString68.charAt(local206);
				if (local214 < '0' || local214 > '9') {
					break;
				}
				local208 = local208 * 10 + local214 - 48;
				local206++;
			}
		} catch (@Pc(241) Exception local241) {
		}
		this.anInt1766 = local208;
		local206 = Static426.aString68.indexOf(46, 2) + 1;
		local208 = 0;
		try {
			while (Static426.aString68.length() > local206) {
				local214 = Static426.aString68.charAt(local206);
				if (local214 < '0' || local214 > '9') {
					break;
				}
				local206++;
				local208 = local208 * 10 + local214 - 48;
			}
		} catch (@Pc(288) Exception local288) {
		}
		this.anInt1768 = local208;
		local208 = 0;
		local206 = Static426.aString68.indexOf(95, 4) + 1;
		try {
			while (local206 < Static426.aString68.length()) {
				local214 = Static426.aString68.charAt(local206);
				if (local214 < '0' || local214 > '9') {
					break;
				}
				local208 = local208 * 10 + local214 - 48;
				local206++;
			}
		} catch (@Pc(332) Exception local332) {
		}
		if (arg1.aBoolean511) {
			this.aBoolean126 = false;
		} else {
			this.aBoolean126 = true;
		}
		this.anInt1771 = Static11.anInt321;
		if (this.anInt1766 > 3) {
			this.anInt1773 = Static380.anInt6689;
		} else {
			this.anInt1773 = 0;
		}
		this.anInt1772 = local208;
		try {
			this.anInt1765 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(373) Throwable local373) {
			this.anInt1765 = 0;
		}
		try {
			this.anInt1764 = HardwareInfo.getPackedBasicCPUInfo();
		} catch (@Pc(381) Throwable local381) {
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method1682(@OriginalArg(0) Class6_Sub21 arg0) {
		arg0.method6062(3);
		arg0.method6062(this.anInt1763);
		arg0.method6062(this.aBoolean125 ? 1 : 0);
		arg0.method6062(this.anInt1776);
		arg0.method6062(this.anInt1767);
		arg0.method6062(this.anInt1766);
		arg0.method6062(this.anInt1768);
		arg0.method6062(this.anInt1772);
		arg0.method6062(this.aBoolean126 ? 1 : 0);
		arg0.method6052(this.anInt1771);
		arg0.method6062(this.anInt1773);
		arg0.method6028(this.anInt1765);
		arg0.method6033(this.anInt1764);
	}
}
