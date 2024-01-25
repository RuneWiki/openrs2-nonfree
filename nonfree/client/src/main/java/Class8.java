import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class8 {

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
	public int anInt245;

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "Lclient!jw;")
	public Class3_Sub5 aClass3_Sub5_1;

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
	private int anInt246;

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
	public int anInt250;

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "Z")
	public boolean aBoolean5;

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "Z")
	public boolean aBoolean6;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "()V")
	private Class8() {
		if (Static552.anIntArray612 == null) {
			Static577.method7503();
		}
		this.method253();
	}

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!ha;Lclient!ika;I)V")
	public Class8(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class3_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (Static552.anIntArray612 == null) {
			Static577.method7503();
		}
		this.anInt245 = arg1.method2048(255);
		this.aBoolean5 = (this.anInt245 & 0x10) != 0;
		this.aBoolean6 = (this.anInt245 & 0x8) != 0;
		this.anInt245 &= 0x7;
		@Pc(46) int local46 = arg1.method2028(-14795) << arg2;
		@Pc(52) int local52 = arg1.method2028(-14795) << arg2;
		@Pc(58) int local58 = arg1.method2028(-14795) << arg2;
		@Pc(62) int local62 = arg1.method2048(255);
		@Pc(68) int local68 = local62 * 2 + 1;
		this.aShortArray1 = new short[local68];
		@Pc(87) int local87;
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray1.length; local74++) {
			@Pc(83) short local83 = (short) arg1.method2028(-14795);
			local87 = local83 >>> 8;
			@Pc(91) int local91 = local83 & 0xFF;
			if (local87 >= local68) {
				local87 = local68 - 1;
			}
			if (local68 - local87 < local91) {
				local91 = local68 - local87;
			}
			this.aShortArray1[local74] = (short) (local87 << 8 | local91);
		}
		local62 = Static434.anInt10639 + (local62 << Static626.anInt9669);
		@Pc(162) int local162 = Static537.anIntArray601 == null ? Static546.anIntArray610[Static150.method2497(arg1.method2028(-14795)) & 0xFFFF] : Static537.anIntArray601[arg1.method2028(-14795)];
		local87 = arg1.method2048(255);
		this.anInt250 = local87 & 0x1F;
		this.anInt246 = (local87 & 0xE0) << 3;
		if (this.anInt250 != 31) {
			this.method253();
		}
		this.method252(local46, local52, local62, arg0, local162, local58);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIBILclient!ha;II)V")
	private void method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class22 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub5_1 = arg3.method9337(arg0, arg5, arg1, arg2, arg4, 1.0F);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
	private void method253() {
		@Pc(4) int local4 = this.anInt250;
		if (local4 == 2) {
			this.anInt249 = 0;
			this.anInt243 = 2048;
			this.anInt242 = 2048;
			this.anInt247 = 1;
		} else if (local4 == 3) {
			this.anInt243 = 2048;
			this.anInt249 = 0;
			this.anInt247 = 1;
			this.anInt242 = 4096;
		} else if (local4 == 4) {
			this.anInt243 = 2048;
			this.anInt249 = 0;
			this.anInt247 = 4;
			this.anInt242 = 2048;
		} else if (local4 == 5) {
			this.anInt242 = 8192;
			this.anInt243 = 2048;
			this.anInt247 = 4;
			this.anInt249 = 0;
		} else if (local4 == 12) {
			this.anInt242 = 2048;
			this.anInt249 = 0;
			this.anInt247 = 2;
			this.anInt243 = 2048;
		} else if (local4 == 13) {
			this.anInt242 = 8192;
			this.anInt243 = 2048;
			this.anInt249 = 0;
			this.anInt247 = 2;
		} else if (local4 == 10) {
			this.anInt247 = 3;
			this.anInt243 = 512;
			this.anInt242 = 2048;
			this.anInt249 = 1536;
		} else if (local4 == 11) {
			this.anInt242 = 4096;
			this.anInt249 = 1536;
			this.anInt247 = 3;
			this.anInt243 = 512;
		} else if (local4 == 6) {
			this.anInt249 = 1280;
			this.anInt247 = 3;
			this.anInt242 = 2048;
			this.anInt243 = 768;
		} else if (local4 == 7) {
			this.anInt247 = 3;
			this.anInt242 = 4096;
			this.anInt243 = 768;
			this.anInt249 = 1280;
		} else if (local4 == 8) {
			this.anInt242 = 2048;
			this.anInt249 = 1024;
			this.anInt247 = 3;
			this.anInt243 = 1024;
		} else if (local4 == 9) {
			this.anInt247 = 3;
			this.anInt243 = 1024;
			this.anInt242 = 4096;
			this.anInt249 = 1024;
		} else if (local4 == 14) {
			this.anInt242 = 2048;
			this.anInt249 = 1280;
			this.anInt243 = 768;
			this.anInt247 = 1;
		} else if (local4 == 15) {
			this.anInt243 = 512;
			this.anInt249 = 1536;
			this.anInt247 = 1;
			this.anInt242 = 4096;
		} else if (local4 == 16) {
			this.anInt242 = 8192;
			this.anInt249 = 1792;
			this.anInt243 = 256;
			this.anInt247 = 1;
		} else {
			this.anInt247 = 0;
			this.anInt243 = 2048;
			this.anInt242 = 2048;
			this.anInt249 = 0;
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIZ)V")
	public void method254(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(64) int local64;
		if (arg1) {
			local64 = 2048;
		} else {
			@Pc(20) int local20 = this.anInt246 + arg0 * this.anInt242 / 50 & 0x7FF;
			@Pc(23) int local23 = this.anInt247;
			if (local23 == 1) {
				local64 = (Class3_Sub7_Sub17_Sub1.anIntArray549[local20 << 3] >> 4) + 1024;
			} else if (local23 == 3) {
				local64 = Static552.anIntArray612[local20] >> 1;
			} else if (local23 == 4) {
				local64 = local20 >> 10 << 11;
			} else if (local23 == 2) {
				local64 = local20;
			} else if (local23 == 5) {
				local64 = (local20 < 1024 ? local20 : 2048 - local20) << 1;
			} else {
				local64 = 2048;
			}
		}
		this.aClass3_Sub5_1.method7171((float) (this.anInt249 + (local64 * this.anInt243 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZIIII)V")
	public void method257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt242 = arg2;
		this.anInt247 = arg1;
		this.anInt249 = arg3;
		this.anInt243 = arg0;
	}
}
