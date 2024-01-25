import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class255 {

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "Lclient!ld;")
	public Class6_Sub25 aClass6_Sub25_3;

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
	private int anInt7359;

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "Z")
	public boolean aBoolean499;

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
	public int anInt7361;

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
	private int anInt7363;

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "Z")
	public boolean aBoolean500;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
	private int anInt7365;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "[S")
	public short[] aShortArray120;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
	public int anInt7366;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
	private int anInt7370;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
	private int anInt7371;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
	private Class255() {
		if (Static247.anIntArray374 == null) {
			Static278.method4180();
		}
		this.method5887();
	}

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!oa;Lclient!jr;I)V")
	public Class255(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class6_Sub12 arg1, @OriginalArg(2) int arg2) {
		if (Static247.anIntArray374 == null) {
			Static278.method4180();
		}
		this.anInt7361 = arg1.method6019();
		this.aBoolean499 = (this.anInt7361 & 0x10) != 0;
		this.aBoolean500 = (this.anInt7361 & 0x8) != 0;
		this.anInt7361 &= 0x7;
		@Pc(44) int local44 = arg1.method6044() << arg2;
		@Pc(50) int local50 = arg1.method6044() << arg2;
		@Pc(56) int local56 = arg1.method6044() << arg2;
		@Pc(60) int local60 = arg1.method6019();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray120 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray120.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method6044();
			local83 = local79 >>> 8;
			if (local83 >= local66) {
				local83 = local66 - 1;
			}
			@Pc(94) int local94 = local79 & 0xFF;
			if (local66 - local83 < local94) {
				local94 = local66 - local83;
			}
			this.aShortArray120[local72] = (short) (local94 | local83 << 8);
		}
		local60 = (local60 << Static23.anInt420) + Static259.anInt4703;
		@Pc(150) int local150 = Static36.anIntArray31 == null ? Static246.anIntArray653[Static32.method511(arg1.method6044()) & 0xFFFF] : Static36.anIntArray31[arg1.method6044()];
		local83 = arg1.method6019();
		this.anInt7366 = local83 & 0x1F;
		this.anInt7370 = (local83 & 0xE0) << 3;
		if (this.anInt7366 != 31) {
			this.method5887();
		}
		this.method5883(local56, local60, local150, local44, arg0, local50);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBIII)V")
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7359 = arg1;
		this.anInt7363 = arg0;
		this.anInt7365 = arg3;
		this.anInt7371 = arg2;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIILclient!oa;II)V")
	private void method5883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class90 arg4, @OriginalArg(6) int arg5) {
		this.aClass6_Sub25_3 = arg4.method7467(arg3, arg0, arg5, arg1, arg2, 1.0F);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZBI)V")
	public void method5884(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg0) {
			local13 = 2048;
		} else {
			@Pc(28) int local28 = this.anInt7370 + arg1 * this.anInt7371 / 50 & 0x7FF;
			@Pc(31) int local31 = this.anInt7365;
			if (local31 == 1) {
				local13 = (Class22.anIntArray20[local28 << 3] >> 4) + 1024;
			} else if (local31 == 3) {
				local13 = Static247.anIntArray374[local28] >> 1;
			} else if (local31 == 4) {
				local13 = local28 >> 10 << 11;
			} else if (local31 == 2) {
				local13 = local28;
			} else if (local31 == 5) {
				local13 = (local28 >= 1024 ? 2048 - local28 : local28) << 1;
			} else {
				local13 = 2048;
			}
		}
		this.aClass6_Sub25_3.method6408((float) (this.anInt7359 + (local13 * this.anInt7363 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
	private void method5887() {
		@Pc(4) int local4 = this.anInt7366;
		if (local4 == 2) {
			this.anInt7363 = 2048;
			this.anInt7359 = 0;
			this.anInt7371 = 2048;
			this.anInt7365 = 1;
		} else if (local4 == 3) {
			this.anInt7365 = 1;
			this.anInt7363 = 2048;
			this.anInt7359 = 0;
			this.anInt7371 = 4096;
		} else if (local4 == 4) {
			this.anInt7371 = 2048;
			this.anInt7363 = 2048;
			this.anInt7365 = 4;
			this.anInt7359 = 0;
		} else if (local4 == 5) {
			this.anInt7363 = 2048;
			this.anInt7359 = 0;
			this.anInt7365 = 4;
			this.anInt7371 = 8192;
		} else if (local4 == 12) {
			this.anInt7363 = 2048;
			this.anInt7371 = 2048;
			this.anInt7365 = 2;
			this.anInt7359 = 0;
		} else if (local4 == 13) {
			this.anInt7359 = 0;
			this.anInt7371 = 8192;
			this.anInt7363 = 2048;
			this.anInt7365 = 2;
		} else if (local4 == 10) {
			this.anInt7365 = 3;
			this.anInt7371 = 2048;
			this.anInt7363 = 512;
			this.anInt7359 = 1536;
		} else if (local4 == 11) {
			this.anInt7359 = 1536;
			this.anInt7371 = 4096;
			this.anInt7363 = 512;
			this.anInt7365 = 3;
		} else if (local4 == 6) {
			this.anInt7371 = 2048;
			this.anInt7365 = 3;
			this.anInt7359 = 1280;
			this.anInt7363 = 768;
		} else if (local4 == 7) {
			this.anInt7359 = 1280;
			this.anInt7363 = 768;
			this.anInt7371 = 4096;
			this.anInt7365 = 3;
		} else if (local4 == 8) {
			this.anInt7359 = 1024;
			this.anInt7371 = 2048;
			this.anInt7363 = 1024;
			this.anInt7365 = 3;
		} else if (local4 == 9) {
			this.anInt7371 = 4096;
			this.anInt7359 = 1024;
			this.anInt7363 = 1024;
			this.anInt7365 = 3;
		} else if (local4 == 14) {
			this.anInt7365 = 1;
			this.anInt7359 = 1280;
			this.anInt7371 = 2048;
			this.anInt7363 = 768;
		} else if (local4 == 15) {
			this.anInt7365 = 1;
			this.anInt7359 = 1536;
			this.anInt7363 = 512;
			this.anInt7371 = 4096;
		} else if (local4 == 16) {
			this.anInt7363 = 256;
			this.anInt7359 = 1792;
			this.anInt7371 = 8192;
			this.anInt7365 = 1;
		} else {
			this.anInt7371 = 2048;
			this.anInt7359 = 0;
			this.anInt7365 = 0;
			this.anInt7363 = 2048;
		}
	}
}
