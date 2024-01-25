import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class346 {

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "Ljava/lang/String;")
	public static final String aString114;

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "Ljava/lang/String;")
	public static final String aString115;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
	private int anInt9982 = -1;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Z")
	public boolean aBoolean730 = true;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
	private final int anInt9981;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Lclient!pga;")
	private final Class281 aClass281_2;

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
	private final int anInt9985;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_36;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	private final int anInt9984;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!wi;")
	private Class50_Sub4 aClass50_Sub4_4;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!tj;")
	private Interface20 anInterface20_5;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!kaa;")
	private Class55_Sub2 aClass55_Sub2_2;

	static {
		@Pc(120) String local120 = "Unknown";
		try {
			local120 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(126) Exception local126) {
		}
		local120.toLowerCase();
		local120 = "Unknown";
		try {
			local120 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(137) Exception local137) {
		}
		local120.toLowerCase();
		local120 = "Unknown";
		try {
			local120 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(148) Exception local148) {
		}
		aString114 = local120.toLowerCase();
		local120 = "Unknown";
		try {
			local120 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(159) Exception local159) {
		}
		aString115 = local120.toLowerCase();
		local120 = "Unknown";
		try {
			local120 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(170) Exception local170) {
		}
		local120.toLowerCase();
		local120 = "~/";
		try {
			local120 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(181) Exception local181) {
		}
		new File(local120);
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!lea;Lclient!pga;Lclient!al;IIIII)V")
	public Class346(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) Class281 arg1, @OriginalArg(2) Class18_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt9981 = arg7;
		this.aClass281_2 = arg1;
		this.anInt9985 = arg6;
		this.aClass101_Sub2_36 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = (local35 + local37) * arg2.anInt9741 + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray1[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt9984 = local27;
		if (local27 <= 0) {
			this.aClass50_Sub4_4 = null;
		} else {
			@Pc(101) Class2_Sub8 local101 = new Class2_Sub8(local27 * 2);
			@Pc(120) int local120;
			@Pc(128) short[] local128;
			@Pc(132) int local132;
			@Pc(118) int local118;
			if (this.aClass101_Sub2_36.aBoolean470) {
				for (local51 = 0; local51 < local25; local51++) {
					local118 = local31 + arg2.anInt9741 * (local51 + local35);
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray1[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method5192(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local118 = (local35 + local51) * arg2.anInt9741 + local31;
					for (local120 = 0; local120 < local25; local120++) {
						local128 = arg2.aShortArrayArray1[local118++];
						if (local128 != null) {
							for (local132 = 0; local132 < local128.length; local132++) {
								local101.method5228(local128[local132] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface20_5 = this.aClass101_Sub2_36.method5639(local101.lb, false, local101.anInt5725);
			this.aClass55_Sub2_2 = new Class55_Sub2(this.aClass101_Sub2_36, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public void method8689() {
		this.method8692(this.anInt9984, this.anInterface20_5);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[BI)V")
	public void method8690(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass55_Sub2_2.method6705(arg1, arg0 * this.aClass101_Sub2_36.method5641(5123));
		this.method8692(arg0, this.aClass55_Sub2_2);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!tj;)V")
	private void method8692(@OriginalArg(0) int arg0, @OriginalArg(2) Interface20 arg1) {
		if (arg0 != 0) {
			this.method8693();
			this.aClass101_Sub2_36.method5690(this.aClass50_Sub4_4);
			this.aClass101_Sub2_36.method5645(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
	private void method8693() {
		if (!this.aBoolean730) {
			return;
		}
		this.aBoolean730 = false;
		@Pc(16) byte[] local16 = this.aClass281_2.aByteArray71;
		@Pc(20) byte[] local20 = this.aClass101_Sub2_36.aByteArray63;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass281_2.anInt8225;
		@Pc(36) int local36 = this.anInt9981 * this.aClass281_2.anInt8225 + this.anInt9985;
		@Pc(57) int local57;
		for (@Pc(46) int local46 = -128; local46 < 0; local46++) {
			local22 = (local22 << 8) - local22;
			for (local57 = -128; local57 < 0; local57++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass50_Sub4_4 != null && this.anInt9982 == local22) {
			this.aBoolean730 = false;
			return;
		}
		this.anInt9982 = local22;
		local57 = 0;
		local36 = this.anInt9985 + local26 * this.anInt9981;
		for (@Pc(111) int local111 = -128; local111 < 0; local111++) {
			for (@Pc(115) int local115 = -128; local115 < 0; local115++) {
				if (local16[local36] == 0) {
					@Pc(133) int local133 = 0;
					if (local16[local36 - 1] != 0) {
						local133++;
					}
					if (local16[local36 + 1] != 0) {
						local133++;
					}
					if (local16[local36 - local26] != 0) {
						local133++;
					}
					if (local16[local26 + local36] != 0) {
						local133++;
					}
					local20[local57++] = (byte) (local133 * 17);
				} else {
					local20[local57++] = 68;
				}
				local36++;
			}
			local36 += this.aClass281_2.anInt8225 - 128;
		}
		if (this.aClass50_Sub4_4 == null) {
			this.aClass50_Sub4_4 = new Class50_Sub4(this.aClass101_Sub2_36, 3553, 6406, 128, 128, false, this.aClass101_Sub2_36.aByteArray63, 6406, false);
			this.aClass50_Sub4_4.method9152(false, false);
			this.aClass50_Sub4_4.method9134(true);
		} else {
			this.aClass50_Sub4_4.method9150(128, 6406, false, this.aClass101_Sub2_36.aByteArray63, 128);
		}
	}
}
