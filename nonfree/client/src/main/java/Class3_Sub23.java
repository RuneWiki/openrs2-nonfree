import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
	private int anInt3374;

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
	private int anInt3375;

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "Ljava/lang/String;")
	private String aString33;

	@OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
	private int anInt3377;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "Ljava/lang/String;")
	private String aString34;

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
	private int anInt3379;

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "Z")
	private boolean aBoolean217;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "I")
	private int anInt3381;

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
	private int anInt3382;

	@OriginalMember(owner = "client!gca", name = "u", descriptor = "I")
	private int anInt3385;

	@OriginalMember(owner = "client!gca", name = "v", descriptor = "Z")
	private boolean aBoolean218;

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
	private int anInt3386;

	@OriginalMember(owner = "client!gca", name = "x", descriptor = "Ljava/lang/String;")
	private String aString35;

	@OriginalMember(owner = "client!gca", name = "z", descriptor = "Ljava/lang/String;")
	private String aString36;

	@OriginalMember(owner = "client!gca", name = "A", descriptor = "I")
	private int anInt3388;

	@OriginalMember(owner = "client!gca", name = "B", descriptor = "I")
	private int anInt3389;

	@OriginalMember(owner = "client!gca", name = "C", descriptor = "I")
	private int anInt3390;

	@OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
	private int anInt3391;

	@OriginalMember(owner = "client!gca", name = "E", descriptor = "I")
	private int anInt3392;

	@OriginalMember(owner = "client!gca", name = "F", descriptor = "I")
	private int anInt3393;

	@OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
	private int anInt3394;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V")
	private Class3_Sub23() {
	}

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(ZLclient!hga;)V")
	public Class3_Sub23(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class138 arg1) {
		if (Static211.aString44.startsWith("win")) {
			this.anInt3388 = 1;
		} else if (Static211.aString44.startsWith("mac")) {
			this.anInt3388 = 2;
		} else if (Static211.aString44.startsWith("linux")) {
			this.anInt3388 = 3;
		} else {
			this.anInt3388 = 4;
		}
		if (Static211.aString49.startsWith("amd64") || Static211.aString49.startsWith("x86_64")) {
			this.aBoolean217 = true;
		} else {
			this.aBoolean217 = false;
		}
		if (this.anInt3388 == 1) {
			if (Static211.aString45.indexOf("4.0") != -1) {
				this.anInt3379 = 1;
			} else if (Static211.aString45.indexOf("4.1") != -1) {
				this.anInt3379 = 2;
			} else if (Static211.aString45.indexOf("4.9") != -1) {
				this.anInt3379 = 3;
			} else if (Static211.aString45.indexOf("5.0") != -1) {
				this.anInt3379 = 4;
			} else if (Static211.aString45.indexOf("5.1") != -1) {
				this.anInt3379 = 5;
			} else if (Static211.aString45.indexOf("6.0") != -1) {
				this.anInt3379 = 6;
			} else if (Static211.aString45.indexOf("6.1") != -1) {
				this.anInt3379 = 7;
			}
		} else if (this.anInt3388 == 2) {
			if (Static211.aString45.indexOf("10.4") != -1) {
				this.anInt3379 = 20;
			} else if (Static211.aString45.indexOf("10.5") != -1) {
				this.anInt3379 = 21;
			} else if (Static211.aString45.indexOf("10.6") != -1) {
				this.anInt3379 = 22;
			}
		}
		if (Static211.aString42.toLowerCase().indexOf("sun") != -1) {
			this.anInt3375 = 1;
		} else if (Static211.aString42.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt3375 = 2;
		} else if (Static211.aString42.toLowerCase().indexOf("apple") == -1) {
			this.anInt3375 = 4;
		} else {
			this.anInt3375 = 3;
		}
		@Pc(204) int local204 = 2;
		@Pc(206) int local206 = 0;
		@Pc(212) char local212;
		try {
			while (local204 < Static211.aString47.length()) {
				local212 = Static211.aString47.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local204++;
				local206 = local206 * 10 + local212 - 48;
			}
		} catch (@Pc(243) Exception local243) {
		}
		this.anInt3382 = local206;
		local206 = 0;
		local204 = Static211.aString47.indexOf(46, 2) + 1;
		try {
			while (local204 < Static211.aString47.length()) {
				local212 = Static211.aString47.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local206 = local206 * 10 + local212 - '0';
				local204++;
			}
		} catch (@Pc(284) Exception local284) {
		}
		this.anInt3377 = local206;
		local204 = Static211.aString47.indexOf(95, 4) + 1;
		local206 = 0;
		try {
			while (local204 < Static211.aString47.length()) {
				local212 = Static211.aString47.charAt(local204);
				if (local212 < '0' || local212 > '9') {
					break;
				}
				local204++;
				local206 = local206 * 10 + local212 - 48;
			}
		} catch (@Pc(332) Exception local332) {
		}
		if (this.anInt3382 <= 3) {
			this.anInt3386 = 0;
		} else {
			this.anInt3386 = Static529.anInt9056;
		}
		if (arg1.aBoolean276) {
			this.aBoolean218 = false;
		} else {
			this.aBoolean218 = true;
		}
		this.anInt3389 = local206;
		this.anInt3385 = Static131.anInt2701;
		try {
			this.anInt3381 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(373) Throwable local373) {
			this.anInt3381 = 0;
		}
		if (this.aString36 == null) {
			this.aString36 = "";
		}
		if (this.aString33 == null) {
			this.aString33 = "";
		}
		if (this.aString35 == null) {
			this.aString35 = "";
		}
		if (this.aString34 == null) {
			this.aString34 = "";
		}
		this.method3049();
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
	private void method3049() {
		if (this.aString33.length() > 40) {
			this.aString33 = this.aString33.substring(0, 40);
		}
		if (this.aString34.length() > 40) {
			this.aString34 = this.aString34.substring(0, 40);
		}
		if (this.aString36.length() > 10) {
			this.aString36 = this.aString36.substring(0, 10);
		}
		if (this.aString35.length() > 10) {
			this.aString35 = this.aString35.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!sl;)V")
	public void method3050(@OriginalArg(1) Class3_Sub3 arg0) {
		arg0.method4220(5);
		arg0.method4220(this.anInt3388);
		arg0.method4220(this.aBoolean217 ? 1 : 0);
		arg0.method4220(this.anInt3379);
		arg0.method4220(this.anInt3375);
		arg0.method4220(this.anInt3382);
		arg0.method4220(this.anInt3377);
		arg0.method4220(this.anInt3389);
		arg0.method4220(this.aBoolean218 ? 1 : 0);
		arg0.method4201(this.anInt3385);
		arg0.method4220(this.anInt3386);
		arg0.method4248(this.anInt3381);
		arg0.method4201(this.anInt3391);
		arg0.method4220(this.anInt3394);
		arg0.method4220(this.anInt3393);
		arg0.method4220(this.anInt3374);
		arg0.method4249(this.aString33);
		arg0.method4249(this.aString34);
		arg0.method4249(this.aString36);
		arg0.method4249(this.aString35);
		arg0.method4220(this.anInt3392);
		arg0.method4201(this.anInt3390);
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)I")
	public int method3051() {
		@Pc(12) int local12 = Static556.method8020(this.aString33) + 23;
		@Pc(19) int local19 = local12 + Static556.method8020(this.aString34);
		@Pc(26) int local26 = local19 + Static556.method8020(this.aString36);
		return local26 + Static556.method8020(this.aString35);
	}
}
