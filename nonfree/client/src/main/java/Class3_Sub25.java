import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gka")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!gka", name = "x", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "client!gka", name = "B", descriptor = "Z")
	private boolean aBoolean349;

	@OriginalMember(owner = "client!gka", name = "j", descriptor = "I")
	private int anInt4188;

	@OriginalMember(owner = "client!gka", name = "D", descriptor = "I")
	private int anInt4189;

	@OriginalMember(owner = "client!gka", name = "z", descriptor = "I")
	private int anInt4190;

	@OriginalMember(owner = "client!gka", name = "l", descriptor = "I")
	private int anInt4191;

	@OriginalMember(owner = "client!gka", name = "K", descriptor = "Ljava/lang/String;")
	private String aString71;

	@OriginalMember(owner = "client!gka", name = "G", descriptor = "I")
	private int anInt4192;

	@OriginalMember(owner = "client!gka", name = "o", descriptor = "I")
	private int anInt4193;

	@OriginalMember(owner = "client!gka", name = "I", descriptor = "Ljava/lang/String;")
	private String aString72;

	@OriginalMember(owner = "client!gka", name = "s", descriptor = "I")
	public int anInt4197;

	@OriginalMember(owner = "client!gka", name = "q", descriptor = "I")
	private int anInt4199;

	@OriginalMember(owner = "client!gka", name = "E", descriptor = "I")
	private int anInt4200;

	@OriginalMember(owner = "client!gka", name = "n", descriptor = "Z")
	private boolean aBoolean350;

	@OriginalMember(owner = "client!gka", name = "k", descriptor = "I")
	private int anInt4201;

	@OriginalMember(owner = "client!gka", name = "p", descriptor = "I")
	private int anInt4202;

	@OriginalMember(owner = "client!gka", name = "v", descriptor = "I")
	private int anInt4203;

	@OriginalMember(owner = "client!gka", name = "J", descriptor = "I")
	public int anInt4205;

	@OriginalMember(owner = "client!gka", name = "A", descriptor = "I")
	private int anInt4206;

	@OriginalMember(owner = "client!gka", name = "t", descriptor = "Ljava/lang/String;")
	private String aString73;

	@OriginalMember(owner = "client!gka", name = "y", descriptor = "I")
	public int anInt4207;

	@OriginalMember(owner = "client!gka", name = "<init>", descriptor = "()V")
	private Class3_Sub25() {
	}

	@OriginalMember(owner = "client!gka", name = "<init>", descriptor = "(ZLclient!cea;)V")
	public Class3_Sub25(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class47 arg1) {
		if (Static75.aString24.startsWith("win")) {
			this.anInt4189 = 1;
		} else if (Static75.aString24.startsWith("mac")) {
			this.anInt4189 = 2;
		} else if (Static75.aString24.startsWith("linux")) {
			this.anInt4189 = 3;
		} else {
			this.anInt4189 = 4;
		}
		if (Static75.aString19.startsWith("amd64") || Static75.aString19.startsWith("x86_64")) {
			this.aBoolean349 = true;
		} else {
			this.aBoolean349 = false;
		}
		if (this.anInt4189 == 1) {
			if (Static75.aString21.indexOf("4.0") != -1) {
				this.anInt4192 = 1;
			} else if (Static75.aString21.indexOf("4.1") != -1) {
				this.anInt4192 = 2;
			} else if (Static75.aString21.indexOf("4.9") != -1) {
				this.anInt4192 = 3;
			} else if (Static75.aString21.indexOf("5.0") != -1) {
				this.anInt4192 = 4;
			} else if (Static75.aString21.indexOf("5.1") != -1) {
				this.anInt4192 = 5;
			} else if (Static75.aString21.indexOf("6.0") != -1) {
				this.anInt4192 = 6;
			} else if (Static75.aString21.indexOf("6.1") != -1) {
				this.anInt4192 = 7;
			}
		} else if (this.anInt4189 == 2) {
			if (Static75.aString21.indexOf("10.4") != -1) {
				this.anInt4192 = 20;
			} else if (Static75.aString21.indexOf("10.5") != -1) {
				this.anInt4192 = 21;
			} else if (Static75.aString21.indexOf("10.6") != -1) {
				this.anInt4192 = 22;
			} else if (Static75.aString21.indexOf("10.7") != -1) {
				this.anInt4192 = 23;
			}
		}
		if (Static75.aString26.toLowerCase().indexOf("sun") != -1) {
			this.anInt4199 = 1;
		} else if (Static75.aString26.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt4199 = 2;
		} else if (Static75.aString26.toLowerCase().indexOf("apple") == -1) {
			this.anInt4199 = 4;
		} else {
			this.anInt4199 = 3;
		}
		@Pc(325) int local325 = 2;
		@Pc(327) int local327 = 0;
		@Pc(333) char local333;
		try {
			while (local325 < Static75.aString25.length()) {
				local333 = Static75.aString25.charAt(local325);
				if (local333 < '0' || local333 > '9') {
					break;
				}
				local325++;
				local327 = local327 * 10 + local333 - 48;
			}
		} catch (@Pc(366) Exception local366) {
		}
		this.anInt4207 = local327;
		local325 = Static75.aString25.indexOf(46, 2) + 1;
		local327 = 0;
		try {
			while (local325 < Static75.aString25.length()) {
				local333 = Static75.aString25.charAt(local325);
				if (local333 < '0' || local333 > '9') {
					break;
				}
				local327 = local327 * 10 + local333 - 48;
				local325++;
			}
		} catch (@Pc(415) Exception local415) {
		}
		this.anInt4193 = local327;
		local327 = 0;
		local325 = Static75.aString25.indexOf(95, 4) + 1;
		try {
			while (Static75.aString25.length() > local325) {
				local333 = Static75.aString25.charAt(local325);
				if (local333 < '0' || local333 > '9') {
					break;
				}
				local327 = local333 + local327 * 10 - 48;
				local325++;
			}
		} catch (@Pc(469) Exception local469) {
		}
		this.anInt4205 = local327;
		if (arg1.aBoolean97) {
			this.aBoolean350 = false;
		} else {
			this.aBoolean350 = true;
		}
		if (this.anInt4207 <= 3) {
			this.anInt4188 = 0;
		} else {
			this.anInt4188 = Static673.anInt10651;
		}
		this.anInt4202 = Static719.anInt11246;
		try {
			@Pc(508) int[] local508 = HardwareInfo.getCPUInfo();
			if (local508 != null && local508.length == 7) {
				this.anInt4200 = local508[5];
				this.anInt4191 = local508[3];
				this.anInt4197 = local508[6];
				this.anInt4201 = local508[4];
				this.anInt4206 = local508[2];
			}
		} catch (@Pc(545) Throwable local545) {
			this.anInt4197 = 0;
		}
		if (this.aString72 == null) {
			this.aString72 = "";
		}
		if (this.aString71 == null) {
			this.aString71 = "";
		}
		if (this.aString70 == null) {
			this.aString70 = "";
		}
		if (this.aString73 == null) {
			this.aString73 = "";
		}
		this.method3467();
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(B)I")
	public int method3466() {
		@Pc(18) int local18 = Static140.method2347(this.aString72) + 23;
		@Pc(27) int local27 = local18 + Static140.method2347(this.aString73);
		@Pc(34) int local34 = local27 + Static140.method2347(this.aString70);
		return local34 + Static140.method2347(this.aString71);
	}

	@OriginalMember(owner = "client!gka", name = "b", descriptor = "(B)V")
	private void method3467() {
		if (this.aString72.length() > 40) {
			this.aString72 = this.aString72.substring(0, 40);
		}
		if (this.aString73.length() > 40) {
			this.aString73 = this.aString73.substring(0, 40);
		}
		if (this.aString70.length() > 10) {
			this.aString70 = this.aString70.substring(0, 10);
		}
		if (this.aString71.length() > 10) {
			this.aString71 = this.aString71.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(BLclient!rba;)V")
	public void method3471(@OriginalArg(1) Class3_Sub28 arg0) {
		arg0.method5329(5);
		arg0.method5329(this.anInt4189);
		arg0.method5329(this.aBoolean349 ? 1 : 0);
		arg0.method5329(this.anInt4192);
		arg0.method5329(this.anInt4199);
		arg0.method5329(this.anInt4207);
		arg0.method5329(this.anInt4193);
		arg0.method5329(this.anInt4205);
		arg0.method5329(this.aBoolean350 ? 1 : 0);
		arg0.method5282(this.anInt4202);
		arg0.method5329(this.anInt4188);
		arg0.method5317(this.anInt4197);
		arg0.method5282(this.anInt4206);
		arg0.method5329(this.anInt4191);
		arg0.method5329(this.anInt4201);
		arg0.method5329(this.anInt4200);
		arg0.method5278(this.aString72);
		arg0.method5278(this.aString73);
		arg0.method5278(this.aString70);
		arg0.method5278(this.aString71);
		arg0.method5329(this.anInt4203);
		arg0.method5282(this.anInt4190);
	}
}
