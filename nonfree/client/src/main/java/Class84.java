import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class84 {

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "Lclient!mfa;")
	public Class2_Sub13 aClass2_Sub13_1;

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
	public int anInt2418;

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
	private int anInt2420;

	@OriginalMember(owner = "client!eba", name = "f", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!eba", name = "n", descriptor = "I")
	private int anInt2423;

	@OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
	private int anInt2424;

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
	public int anInt2425;

	@OriginalMember(owner = "client!eba", name = "q", descriptor = "Z")
	public boolean aBoolean178;

	@OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
	private int anInt2426;

	@OriginalMember(owner = "client!eba", name = "s", descriptor = "Z")
	public boolean aBoolean179;

	@OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
	private int anInt2427;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "()V")
	private Class84() {
		if (Static367.anIntArray329 == null) {
			Static271.method4640();
		}
		this.method2248();
	}

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!ha;Lclient!ol;I)V")
	public Class84(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class2_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (Static367.anIntArray329 == null) {
			Static271.method4640();
		}
		this.anInt2418 = arg1.method5203();
		this.aBoolean179 = (this.anInt2418 & 0x8) != 0;
		this.aBoolean178 = (this.anInt2418 & 0x10) != 0;
		this.anInt2418 &= 0x7;
		@Pc(50) int local50 = arg1.method5211() << arg2;
		@Pc(56) int local56 = arg1.method5211() << arg2;
		@Pc(62) int local62 = arg1.method5211() << arg2;
		@Pc(66) int local66 = arg1.method5203();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray50 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray50.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method5211();
			local89 = local85 >>> 8;
			@Pc(93) int local93 = local85 & 0xFF;
			if (local72 <= local89) {
				local89 = local72 - 1;
			}
			if (local72 - local89 < local93) {
				local93 = local72 - local89;
			}
			this.aShortArray50[local78] = (short) (local93 | local89 << 8);
		}
		local66 = (local66 << Static170.anInt3602) + Static124.anInt2431;
		@Pc(159) int local159 = Static101.anIntArray92 == null ? Static454.anIntArray310[Static498.method7845(arg1.method5211()) & 0xFFFF] : Static101.anIntArray92[arg1.method5211()];
		local89 = arg1.method5203();
		this.anInt2423 = (local89 & 0xE0) << 3;
		this.anInt2425 = local89 & 0x1F;
		if (this.anInt2425 != 31) {
			this.method2248();
		}
		this.method2244(local66, local50, local159, local62, local56, arg0);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIIIILclient!ha;)V")
	private void method2244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class101 arg5) {
		this.aClass2_Sub13_1 = arg5.method8127(arg1, arg3, arg4, arg0, arg2, 1.0F);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIZ)V")
	public void method2246(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(58) int local58;
		if (arg1) {
			local58 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt2423 + this.anInt2427 * arg0 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt2424;
			if (local26 == 1) {
				local58 = (Class12_Sub2.anIntArray204[local23 << 3] >> 4) + 1024;
			} else if (local26 == 3) {
				local58 = Static367.anIntArray329[local23] >> 1;
			} else if (local26 == 4) {
				local58 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local58 = local23;
			} else if (local26 == 5) {
				local58 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local58 = 2048;
			}
		}
		this.aClass2_Sub13_1.method9415((float) (this.anInt2420 + (local58 * this.anInt2426 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIII)V")
	public void method2247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2420 = arg3;
		this.anInt2426 = arg1;
		this.anInt2427 = arg2;
		this.anInt2424 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
	private void method2248() {
		@Pc(4) int local4 = this.anInt2425;
		if (local4 == 2) {
			this.anInt2424 = 1;
			this.anInt2426 = 2048;
			this.anInt2427 = 2048;
			this.anInt2420 = 0;
		} else if (local4 == 3) {
			this.anInt2424 = 1;
			this.anInt2420 = 0;
			this.anInt2426 = 2048;
			this.anInt2427 = 4096;
		} else if (local4 == 4) {
			this.anInt2424 = 4;
			this.anInt2427 = 2048;
			this.anInt2420 = 0;
			this.anInt2426 = 2048;
		} else if (local4 == 5) {
			this.anInt2427 = 8192;
			this.anInt2426 = 2048;
			this.anInt2424 = 4;
			this.anInt2420 = 0;
		} else if (local4 == 12) {
			this.anInt2420 = 0;
			this.anInt2426 = 2048;
			this.anInt2424 = 2;
			this.anInt2427 = 2048;
		} else if (local4 == 13) {
			this.anInt2424 = 2;
			this.anInt2420 = 0;
			this.anInt2426 = 2048;
			this.anInt2427 = 8192;
		} else if (local4 == 10) {
			this.anInt2420 = 1536;
			this.anInt2426 = 512;
			this.anInt2427 = 2048;
			this.anInt2424 = 3;
		} else if (local4 == 11) {
			this.anInt2426 = 512;
			this.anInt2427 = 4096;
			this.anInt2424 = 3;
			this.anInt2420 = 1536;
		} else if (local4 == 6) {
			this.anInt2424 = 3;
			this.anInt2427 = 2048;
			this.anInt2420 = 1280;
			this.anInt2426 = 768;
		} else if (local4 == 7) {
			this.anInt2420 = 1280;
			this.anInt2426 = 768;
			this.anInt2424 = 3;
			this.anInt2427 = 4096;
		} else if (local4 == 8) {
			this.anInt2424 = 3;
			this.anInt2420 = 1024;
			this.anInt2426 = 1024;
			this.anInt2427 = 2048;
		} else if (local4 == 9) {
			this.anInt2427 = 4096;
			this.anInt2424 = 3;
			this.anInt2420 = 1024;
			this.anInt2426 = 1024;
		} else if (local4 == 14) {
			this.anInt2427 = 2048;
			this.anInt2420 = 1280;
			this.anInt2424 = 1;
			this.anInt2426 = 768;
		} else if (local4 == 15) {
			this.anInt2424 = 1;
			this.anInt2420 = 1536;
			this.anInt2426 = 512;
			this.anInt2427 = 4096;
		} else if (local4 == 16) {
			this.anInt2426 = 256;
			this.anInt2420 = 1792;
			this.anInt2424 = 1;
			this.anInt2427 = 8192;
		} else {
			this.anInt2424 = 0;
			this.anInt2420 = 0;
			this.anInt2426 = 2048;
			this.anInt2427 = 2048;
		}
	}
}
