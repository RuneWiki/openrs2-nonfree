import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class6_Sub33 extends Class6 {

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
	private int anInt4991;

	@OriginalMember(owner = "client!kda", name = "l", descriptor = "Ljava/lang/String;")
	private String aString61;

	@OriginalMember(owner = "client!kda", name = "m", descriptor = "Ljava/lang/String;")
	private String aString62;

	@OriginalMember(owner = "client!kda", name = "n", descriptor = "I")
	private int anInt4992;

	@OriginalMember(owner = "client!kda", name = "o", descriptor = "I")
	private int anInt4993;

	@OriginalMember(owner = "client!kda", name = "p", descriptor = "Z")
	private boolean aBoolean324;

	@OriginalMember(owner = "client!kda", name = "q", descriptor = "I")
	private int anInt4994;

	@OriginalMember(owner = "client!kda", name = "r", descriptor = "I")
	private int anInt4995;

	@OriginalMember(owner = "client!kda", name = "u", descriptor = "I")
	public int anInt4998;

	@OriginalMember(owner = "client!kda", name = "v", descriptor = "I")
	private int anInt4999;

	@OriginalMember(owner = "client!kda", name = "w", descriptor = "I")
	private int anInt5000;

	@OriginalMember(owner = "client!kda", name = "y", descriptor = "Ljava/lang/String;")
	private String aString63;

	@OriginalMember(owner = "client!kda", name = "z", descriptor = "Z")
	private boolean aBoolean325;

	@OriginalMember(owner = "client!kda", name = "A", descriptor = "I")
	private int anInt5002;

	@OriginalMember(owner = "client!kda", name = "B", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!kda", name = "C", descriptor = "I")
	private int anInt5003;

	@OriginalMember(owner = "client!kda", name = "D", descriptor = "I")
	private int anInt5004;

	@OriginalMember(owner = "client!kda", name = "E", descriptor = "I")
	private int anInt5005;

	@OriginalMember(owner = "client!kda", name = "F", descriptor = "I")
	private int anInt5006;

	@OriginalMember(owner = "client!kda", name = "G", descriptor = "I")
	private int anInt5007;

	@OriginalMember(owner = "client!kda", name = "J", descriptor = "I")
	private int anInt5010;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "()V")
	private Class6_Sub33() {
	}

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(ZLclient!vt;)V")
	public Class6_Sub33(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class380 arg1) {
		if (Static647.aString144.startsWith("win")) {
			this.anInt5006 = 1;
		} else if (Static647.aString144.startsWith("mac")) {
			this.anInt5006 = 2;
		} else if (Static647.aString144.startsWith("linux")) {
			this.anInt5006 = 3;
		} else {
			this.anInt5006 = 4;
		}
		if (Static647.aString147.startsWith("amd64") || Static647.aString147.startsWith("x86_64")) {
			this.aBoolean325 = true;
		} else {
			this.aBoolean325 = false;
		}
		if (this.anInt5006 == 1) {
			if (Static647.aString150.indexOf("4.0") != -1) {
				this.anInt4992 = 1;
			} else if (Static647.aString150.indexOf("4.1") != -1) {
				this.anInt4992 = 2;
			} else if (Static647.aString150.indexOf("4.9") != -1) {
				this.anInt4992 = 3;
			} else if (Static647.aString150.indexOf("5.0") != -1) {
				this.anInt4992 = 4;
			} else if (Static647.aString150.indexOf("5.1") != -1) {
				this.anInt4992 = 5;
			} else if (Static647.aString150.indexOf("6.0") != -1) {
				this.anInt4992 = 6;
			} else if (Static647.aString150.indexOf("6.1") != -1) {
				this.anInt4992 = 7;
			}
		} else if (this.anInt5006 == 2) {
			if (Static647.aString150.indexOf("10.4") != -1) {
				this.anInt4992 = 20;
			} else if (Static647.aString150.indexOf("10.5") != -1) {
				this.anInt4992 = 21;
			} else if (Static647.aString150.indexOf("10.6") != -1) {
				this.anInt4992 = 22;
			}
		}
		if (Static647.aString145.toLowerCase().indexOf("sun") != -1) {
			this.anInt5004 = 1;
		} else if (Static647.aString145.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt5004 = 2;
		} else if (Static647.aString145.toLowerCase().indexOf("apple") == -1) {
			this.anInt5004 = 4;
		} else {
			this.anInt5004 = 3;
		}
		@Pc(201) int local201 = 2;
		@Pc(203) int local203 = 0;
		@Pc(209) char local209;
		try {
			while (local201 < Static647.aString148.length()) {
				local209 = Static647.aString148.charAt(local201);
				if (local209 < '0' || local209 > '9') {
					break;
				}
				local203 = local209 + local203 * 10 - 48;
				local201++;
			}
		} catch (@Pc(236) Exception local236) {
		}
		this.anInt5010 = local203;
		local201 = Static647.aString148.indexOf(46, 2) + 1;
		local203 = 0;
		try {
			while (local201 < Static647.aString148.length()) {
				local209 = Static647.aString148.charAt(local201);
				if (local209 < '0' || local209 > '9') {
					break;
				}
				local203 = local203 * 10 + local209 - 48;
				local201++;
			}
		} catch (@Pc(283) Exception local283) {
		}
		this.anInt4993 = local203;
		local203 = 0;
		local201 = Static647.aString148.indexOf(95, 4) + 1;
		try {
			while (Static647.aString148.length() > local201) {
				local209 = Static647.aString148.charAt(local201);
				if (local209 < '0' || local209 > '9') {
					break;
				}
				local203 = local209 + local203 * 10 - 48;
				local201++;
			}
		} catch (@Pc(326) Exception local326) {
		}
		this.anInt5007 = local203;
		if (arg1.aBoolean729) {
			this.aBoolean324 = false;
		} else {
			this.aBoolean324 = true;
		}
		this.anInt4995 = Static549.anInt9246;
		if (this.anInt5010 > 3) {
			this.anInt4999 = Static475.anInt8164;
		} else {
			this.anInt4999 = 0;
		}
		try {
			@Pc(359) int[] local359 = HardwareInfo.getCPUInfo();
			if (local359 != null && local359.length == 7) {
				this.anInt4991 = local359[2];
				this.anInt5005 = local359[4];
				this.anInt4994 = local359[5];
				this.anInt4998 = local359[6];
				this.anInt5002 = local359[3];
			}
		} catch (@Pc(392) Throwable local392) {
			this.anInt4998 = 0;
		}
		if (this.aString61 == null) {
			this.aString61 = "";
		}
		if (this.aString64 == null) {
			this.aString64 = "";
		}
		if (this.aString63 == null) {
			this.aString63 = "";
		}
		if (this.aString62 == null) {
			this.aString62 = "";
		}
		this.method4271();
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V")
	private void method4271() {
		if (this.aString61.length() > 40) {
			this.aString61 = this.aString61.substring(0, 40);
		}
		if (this.aString63.length() > 40) {
			this.aString63 = this.aString63.substring(0, 40);
		}
		if (this.aString64.length() > 10) {
			this.aString64 = this.aString64.substring(0, 10);
		}
		if (this.aString62.length() > 10) {
			this.aString62 = this.aString62.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILclient!gga;)V")
	public void method4272(@OriginalArg(1) Class6_Sub23 arg0) {
		arg0.method8366(5);
		arg0.method8366(this.anInt5006);
		arg0.method8366(this.aBoolean325 ? 1 : 0);
		arg0.method8366(this.anInt4992);
		arg0.method8366(this.anInt5004);
		arg0.method8366(this.anInt5010);
		arg0.method8366(this.anInt4993);
		arg0.method8366(this.anInt5007);
		arg0.method8366(this.aBoolean324 ? 1 : 0);
		arg0.method8347(this.anInt4995);
		arg0.method8366(this.anInt4999);
		arg0.method8387(this.anInt4998);
		arg0.method8347(this.anInt4991);
		arg0.method8366(this.anInt5002);
		arg0.method8366(this.anInt5005);
		arg0.method8366(this.anInt4994);
		arg0.method8356(this.aString61);
		arg0.method8356(this.aString63);
		arg0.method8356(this.aString64);
		arg0.method8356(this.aString62);
		arg0.method8366(this.anInt5003);
		arg0.method8347(this.anInt5000);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)I")
	public int method4274() {
		@Pc(17) int local17 = Static83.method1454(this.aString61) + 23;
		@Pc(24) int local24 = local17 + Static83.method1454(this.aString63);
		@Pc(31) int local31 = local24 + Static83.method1454(this.aString64);
		return local31 + Static83.method1454(this.aString62);
	}
}
