import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class235 {

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "Z")
	public boolean aBoolean461;

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
	public int anInt6518;

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "I")
	private int anInt6519;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
	private int anInt6521;

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
	private int anInt6523;

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "Lclient!cp;")
	public Class3_Sub9 aClass3_Sub9_2;

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "Z")
	public boolean aBoolean462;

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
	public int anInt6525;

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
	private int anInt6527;

	@OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
	private int anInt6528;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
	private Class235() {
		if (Static533.anIntArray536 == null) {
			Static230.method3741();
		}
		this.method5257();
	}

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Lclient!r;Lclient!ie;I)V")
	public Class235(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class3_Sub26 arg1, @OriginalArg(2) int arg2) {
		if (Static533.anIntArray536 == null) {
			Static230.method3741();
		}
		this.anInt6525 = arg1.method6814();
		this.aBoolean462 = (this.anInt6525 & 0x8) != 0;
		this.aBoolean461 = (this.anInt6525 & 0x10) != 0;
		this.anInt6525 &= 0x7;
		@Pc(47) int local47 = arg1.method6811() << arg2;
		@Pc(53) int local53 = arg1.method6811() << arg2;
		@Pc(59) int local59 = arg1.method6811() << arg2;
		@Pc(63) int local63 = arg1.method6814();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray97 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray97.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method6811();
			local86 = local82 >>> 8;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			@Pc(101) int local101 = local82 & 0xFF;
			if (local69 - local86 < local101) {
				local101 = local69 - local86;
			}
			this.aShortArray97[local75] = (short) (local101 | local86 << 8);
		}
		local63 = Static211.anInt8485 + (local63 << Static385.anInt6657);
		@Pc(156) int local156 = Static422.anIntArray428 == null ? Static133.anIntArray113[Static386.method5380(arg1.method6811()) & 0xFFFF] : Static422.anIntArray428[arg1.method6811()];
		local86 = arg1.method6814();
		this.anInt6527 = (local86 & 0xE0) << 3;
		this.anInt6518 = local86 & 0x1F;
		if (this.anInt6518 != 31) {
			this.method5257();
		}
		this.method5261(local47, local156, local59, local53, arg0, local63);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)V")
	private void method5257() {
		@Pc(8) int local8 = this.anInt6518;
		if (local8 == 2) {
			this.anInt6521 = 2048;
			this.anInt6528 = 1;
			this.anInt6519 = 0;
			this.anInt6523 = 2048;
		} else if (local8 == 3) {
			this.anInt6521 = 2048;
			this.anInt6523 = 4096;
			this.anInt6528 = 1;
			this.anInt6519 = 0;
		} else if (local8 == 4) {
			this.anInt6519 = 0;
			this.anInt6528 = 4;
			this.anInt6523 = 2048;
			this.anInt6521 = 2048;
		} else if (local8 == 5) {
			this.anInt6519 = 0;
			this.anInt6521 = 2048;
			this.anInt6528 = 4;
			this.anInt6523 = 8192;
		} else if (local8 == 12) {
			this.anInt6519 = 0;
			this.anInt6528 = 2;
			this.anInt6521 = 2048;
			this.anInt6523 = 2048;
		} else if (local8 == 13) {
			this.anInt6523 = 8192;
			this.anInt6521 = 2048;
			this.anInt6528 = 2;
			this.anInt6519 = 0;
		} else if (local8 == 10) {
			this.anInt6521 = 512;
			this.anInt6523 = 2048;
			this.anInt6528 = 3;
			this.anInt6519 = 1536;
		} else if (local8 == 11) {
			this.anInt6521 = 512;
			this.anInt6523 = 4096;
			this.anInt6519 = 1536;
			this.anInt6528 = 3;
		} else if (local8 == 6) {
			this.anInt6519 = 1280;
			this.anInt6521 = 768;
			this.anInt6528 = 3;
			this.anInt6523 = 2048;
		} else if (local8 == 7) {
			this.anInt6519 = 1280;
			this.anInt6521 = 768;
			this.anInt6523 = 4096;
			this.anInt6528 = 3;
		} else if (local8 == 8) {
			this.anInt6519 = 1024;
			this.anInt6521 = 1024;
			this.anInt6528 = 3;
			this.anInt6523 = 2048;
		} else if (local8 == 9) {
			this.anInt6521 = 1024;
			this.anInt6528 = 3;
			this.anInt6523 = 4096;
			this.anInt6519 = 1024;
		} else if (local8 == 14) {
			this.anInt6528 = 1;
			this.anInt6519 = 1280;
			this.anInt6523 = 2048;
			this.anInt6521 = 768;
		} else if (local8 == 15) {
			this.anInt6528 = 1;
			this.anInt6523 = 4096;
			this.anInt6521 = 512;
			this.anInt6519 = 1536;
		} else if (local8 == 16) {
			this.anInt6523 = 8192;
			this.anInt6528 = 1;
			this.anInt6521 = 256;
			this.anInt6519 = 1792;
		} else {
			this.anInt6519 = 0;
			this.anInt6523 = 2048;
			this.anInt6521 = 2048;
			this.anInt6528 = 0;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIZ)V")
	public void method5259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6523 = arg0;
		this.anInt6521 = arg1;
		this.anInt6528 = arg2;
		this.anInt6519 = arg3;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIZ)V")
	public void method5260(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17;
		if (arg1) {
			local17 = 2048;
		} else {
			@Pc(31) int local31 = this.anInt6527 + arg0 * this.anInt6523 / 50 & 0x7FF;
			@Pc(34) int local34 = this.anInt6528;
			if (local34 == 1) {
				local17 = (Class3_Sub28.anIntArray232[local31 << 3] >> 4) + 1024;
			} else if (local34 == 3) {
				local17 = Static533.anIntArray536[local31] >> 1;
			} else if (local34 == 4) {
				local17 = local31 >> 10 << 11;
			} else if (local34 == 2) {
				local17 = local31;
			} else if (local34 == 5) {
				local17 = (local31 >= 1024 ? 2048 - local31 : local31) << 1;
			} else {
				local17 = 2048;
			}
		}
		this.aClass3_Sub9_2.method6001((float) ((local17 * this.anInt6521 >> 11) + this.anInt6519) / 2048.0F);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIZLclient!r;I)V")
	private void method5261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class31 arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub9_2 = arg4.method8078(arg0, arg2, arg3, arg5, arg1, 1.0F);
	}
}
