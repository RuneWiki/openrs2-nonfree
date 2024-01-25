import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
	private final int anInt2971;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Z")
	private final boolean aBoolean214;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
	private int anInt2970;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
	private final int anInt2978;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	private final int anInt2972;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
	private final int anInt2979;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
	private final int anInt2973;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
	private final int anInt2976;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Z")
	private final boolean aBoolean215;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	private final int anInt2977;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
	private int anInt2969;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	private int anInt2975;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(ZLclient!gba;)V")
	public Class1_Sub17(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class114 arg1) {
		if (Static162.aString37.startsWith("win")) {
			this.anInt2971 = 1;
		} else if (Static162.aString37.startsWith("mac")) {
			this.anInt2971 = 2;
		} else if (Static162.aString37.startsWith("linux")) {
			this.anInt2971 = 3;
		} else {
			this.anInt2971 = 4;
		}
		if (Static162.aString31.startsWith("amd64") || Static162.aString31.startsWith("x86_64")) {
			this.aBoolean214 = true;
		} else {
			this.aBoolean214 = false;
		}
		if (this.anInt2971 == 1) {
			if (Static162.aString34.indexOf("4.0") != -1) {
				this.anInt2970 = 1;
			} else if (Static162.aString34.indexOf("4.1") != -1) {
				this.anInt2970 = 2;
			} else if (Static162.aString34.indexOf("4.9") != -1) {
				this.anInt2970 = 3;
			} else if (Static162.aString34.indexOf("5.0") != -1) {
				this.anInt2970 = 4;
			} else if (Static162.aString34.indexOf("5.1") != -1) {
				this.anInt2970 = 5;
			} else if (Static162.aString34.indexOf("6.0") != -1) {
				this.anInt2970 = 6;
			} else if (Static162.aString34.indexOf("6.1") != -1) {
				this.anInt2970 = 7;
			}
		} else if (this.anInt2971 == 2) {
			if (Static162.aString34.indexOf("10.4") != -1) {
				this.anInt2970 = 20;
			} else if (Static162.aString34.indexOf("10.5") != -1) {
				this.anInt2970 = 21;
			} else if (Static162.aString34.indexOf("10.6") != -1) {
				this.anInt2970 = 22;
			}
		}
		if (Static162.aString32.toLowerCase().indexOf("sun") != -1) {
			this.anInt2978 = 1;
		} else if (Static162.aString32.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt2978 = 2;
		} else if (Static162.aString32.toLowerCase().indexOf("apple") == -1) {
			this.anInt2978 = 4;
		} else {
			this.anInt2978 = 3;
		}
		@Pc(203) int local203 = 2;
		@Pc(205) int local205 = 0;
		@Pc(211) char local211;
		try {
			while (Static162.aString30.length() > local203) {
				local211 = Static162.aString30.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local205 = local211 + local205 * 10 - 48;
				local203++;
			}
		} catch (@Pc(239) Exception local239) {
		}
		this.anInt2972 = local205;
		local205 = 0;
		local203 = Static162.aString30.indexOf(46, 2) + 1;
		try {
			while (local203 < Static162.aString30.length()) {
				local211 = Static162.aString30.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local205 * 10 + local211 - 48;
			}
		} catch (@Pc(287) Exception local287) {
		}
		this.anInt2979 = local205;
		local203 = Static162.aString30.indexOf(95, 4) + 1;
		local205 = 0;
		try {
			while (Static162.aString30.length() > local203) {
				local211 = Static162.aString30.charAt(local203);
				if (local211 < '0' || local211 > '9') {
					break;
				}
				local203++;
				local205 = local211 + local205 * 10 - 48;
			}
		} catch (@Pc(334) Exception local334) {
		}
		this.anInt2973 = local205;
		this.anInt2976 = Static72.anInt1778;
		if (arg1.aBoolean212) {
			this.aBoolean215 = false;
		} else {
			this.aBoolean215 = true;
		}
		if (this.anInt2972 > 3) {
			this.anInt2977 = Static265.anInt4986;
		} else {
			this.anInt2977 = 0;
		}
		try {
			this.anInt2969 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(375) Throwable local375) {
			this.anInt2969 = 0;
		}
		try {
			this.anInt2975 = HardwareInfo.getPackedBasicCPUInfo();
		} catch (@Pc(383) Throwable local383) {
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!io;)V")
	public void method2523(@OriginalArg(1) Class1_Sub20 arg0) {
		arg0.method4378(3);
		arg0.method4378(this.anInt2971);
		arg0.method4378(this.aBoolean214 ? 1 : 0);
		arg0.method4378(this.anInt2970);
		arg0.method4378(this.anInt2978);
		arg0.method4378(this.anInt2972);
		arg0.method4378(this.anInt2979);
		arg0.method4378(this.anInt2973);
		arg0.method4378(this.aBoolean215 ? 1 : 0);
		arg0.method4381(this.anInt2976);
		arg0.method4378(this.anInt2977);
		arg0.method4414(this.anInt2969);
		arg0.method4421(this.anInt2975);
	}
}
