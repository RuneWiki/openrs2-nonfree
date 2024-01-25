import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class265 {

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "[C")
	private static final char[] aCharArray7 = new char[64];

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Z")
	public boolean aBoolean565;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	private int anInt7285;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Z")
	public boolean aBoolean566;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	private int anInt7287;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	public int anInt7291;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!gga;")
	public Class2_Sub14 aClass2_Sub14_3;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
	private int anInt7292;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
	public int anInt7293;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
	private int anInt7294;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
	private int anInt7295;

	static {
		for (@Pc(9) int local9 = 0; local9 < 26; local9++) {
			aCharArray7[local9] = (char) (local9 + 65);
		}
		for (@Pc(25) int local25 = 26; local25 < 52; local25++) {
			aCharArray7[local25] = (char) (local25 + 97 - 26);
		}
		for (@Pc(43) int local43 = 52; local43 < 62; local43++) {
			aCharArray7[local43] = (char) (local43 - 4);
		}
		aCharArray7[63] = '/';
		aCharArray7[62] = '+';
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	private Class265() {
		if (Static356.anIntArray441 == null) {
			Static380.method5629();
		}
		this.method6113();
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!r;Lclient!es;I)V")
	public Class265(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class2_Sub15 arg1, @OriginalArg(2) int arg2) {
		if (Static356.anIntArray441 == null) {
			Static380.method5629();
		}
		this.anInt7293 = arg1.method4325();
		this.aBoolean566 = (this.anInt7293 & 0x10) != 0;
		this.aBoolean565 = (this.anInt7293 & 0x8) != 0;
		this.anInt7293 &= 0x7;
		@Pc(47) int local47 = arg1.method4294() << arg2;
		@Pc(53) int local53 = arg1.method4294() << arg2;
		@Pc(59) int local59 = arg1.method4294() << arg2;
		@Pc(63) int local63 = arg1.method4325();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray102 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray102.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method4294();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			if (local69 - local86 < local90) {
				local90 = local69 - local86;
			}
			this.aShortArray102[local75] = (short) (local86 << 8 | local90);
		}
		local63 = (local63 << Static134.anInt2822) + Static81.anInt1767;
		@Pc(160) int local160 = Static250.anIntArray314 == null ? Static568.anIntArray675[Static406.method5917(arg1.method4294()) & 0xFFFF] : Static250.anIntArray314[arg1.method4294()];
		local86 = arg1.method4325();
		this.anInt7294 = (local86 & 0xE0) << 3;
		this.anInt7291 = local86 & 0x1F;
		if (this.anInt7291 != 31) {
			this.method6113();
		}
		this.method6114(arg0, local160, local63, local47, local59, local53);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V")
	public void method6112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7292 = arg0;
		this.anInt7285 = arg2;
		this.anInt7295 = arg1;
		this.anInt7287 = arg3;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	private void method6113() {
		@Pc(4) int local4 = this.anInt7291;
		if (local4 == 2) {
			this.anInt7287 = 1;
			this.anInt7285 = 2048;
			this.anInt7292 = 0;
			this.anInt7295 = 2048;
		} else if (local4 == 3) {
			this.anInt7285 = 2048;
			this.anInt7287 = 1;
			this.anInt7295 = 4096;
			this.anInt7292 = 0;
		} else if (local4 == 4) {
			this.anInt7285 = 2048;
			this.anInt7292 = 0;
			this.anInt7287 = 4;
			this.anInt7295 = 2048;
		} else if (local4 == 5) {
			this.anInt7295 = 8192;
			this.anInt7292 = 0;
			this.anInt7287 = 4;
			this.anInt7285 = 2048;
		} else if (local4 == 12) {
			this.anInt7295 = 2048;
			this.anInt7292 = 0;
			this.anInt7285 = 2048;
			this.anInt7287 = 2;
		} else if (local4 == 13) {
			this.anInt7295 = 8192;
			this.anInt7287 = 2;
			this.anInt7285 = 2048;
			this.anInt7292 = 0;
		} else if (local4 == 10) {
			this.anInt7285 = 512;
			this.anInt7287 = 3;
			this.anInt7295 = 2048;
			this.anInt7292 = 1536;
		} else if (local4 == 11) {
			this.anInt7295 = 4096;
			this.anInt7292 = 1536;
			this.anInt7287 = 3;
			this.anInt7285 = 512;
		} else if (local4 == 6) {
			this.anInt7295 = 2048;
			this.anInt7287 = 3;
			this.anInt7285 = 768;
			this.anInt7292 = 1280;
		} else if (local4 == 7) {
			this.anInt7287 = 3;
			this.anInt7292 = 1280;
			this.anInt7295 = 4096;
			this.anInt7285 = 768;
		} else if (local4 == 8) {
			this.anInt7295 = 2048;
			this.anInt7285 = 1024;
			this.anInt7287 = 3;
			this.anInt7292 = 1024;
		} else if (local4 == 9) {
			this.anInt7292 = 1024;
			this.anInt7287 = 3;
			this.anInt7295 = 4096;
			this.anInt7285 = 1024;
		} else if (local4 == 14) {
			this.anInt7287 = 1;
			this.anInt7292 = 1280;
			this.anInt7295 = 2048;
			this.anInt7285 = 768;
		} else if (local4 == 15) {
			this.anInt7285 = 512;
			this.anInt7292 = 1536;
			this.anInt7287 = 1;
			this.anInt7295 = 4096;
		} else if (local4 == 16) {
			this.anInt7287 = 1;
			this.anInt7292 = 1792;
			this.anInt7285 = 256;
			this.anInt7295 = 8192;
		} else {
			this.anInt7285 = 2048;
			this.anInt7295 = 2048;
			this.anInt7287 = 0;
			this.anInt7292 = 0;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!r;IIIII)V")
	private void method6114(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass2_Sub14_3 = arg0.method6209(arg3, arg4, arg5, arg2, arg1, 1.0F);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIZ)V")
	public void method6115(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15;
		if (arg1) {
			local15 = 2048;
		} else {
			@Pc(30) int local30 = this.anInt7294 + this.anInt7295 * arg0 / 50 & 0x7FF;
			@Pc(33) int local33 = this.anInt7287;
			if (local33 == 1) {
				local15 = (Class363.anIntArray697[local30 << 3] >> 4) + 1024;
			} else if (local33 == 3) {
				local15 = Static356.anIntArray441[local30] >> 1;
			} else if (local33 == 4) {
				local15 = local30 >> 10 << 11;
			} else if (local33 == 2) {
				local15 = local30;
			} else if (local33 == 5) {
				local15 = (local30 < 1024 ? local30 : 2048 - local30) << 1;
			} else {
				local15 = 2048;
			}
		}
		this.aClass2_Sub14_3.method7688((float) (this.anInt7292 + (local15 * this.anInt7285 >> 11)) / 2048.0F);
	}
}
