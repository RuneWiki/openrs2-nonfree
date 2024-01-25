import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class371 {

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "Z")
	public boolean aBoolean733;

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
	private int anInt10041;

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "Lclient!jw;")
	public Class5_Sub3 aClass5_Sub3_3;

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "Z")
	public boolean aBoolean734;

	@OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
	public int anInt10047;

	@OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
	private int anInt10048;

	@OriginalMember(owner = "client!vfa", name = "n", descriptor = "I")
	private int anInt10049;

	@OriginalMember(owner = "client!vfa", name = "p", descriptor = "[S")
	public short[] aShortArray128;

	@OriginalMember(owner = "client!vfa", name = "r", descriptor = "I")
	public int anInt10052;

	@OriginalMember(owner = "client!vfa", name = "s", descriptor = "I")
	private int anInt10053;

	@OriginalMember(owner = "client!vfa", name = "t", descriptor = "I")
	private int anInt10054;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "()V")
	private Class371() {
		if (Static243.anIntArray240 == null) {
			Static668.method8692();
		}
		this.method8368();
	}

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!ha;Lclient!rv;I)V")
	public Class371(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class5_Sub15 arg1, @OriginalArg(2) int arg2) {
		if (Static243.anIntArray240 == null) {
			Static668.method8692();
		}
		this.anInt10052 = arg1.method3642();
		this.aBoolean734 = (this.anInt10052 & 0x8) != 0;
		this.aBoolean733 = (this.anInt10052 & 0x10) != 0;
		this.anInt10052 &= 0x7;
		@Pc(47) int local47 = arg1.method3698() << arg2;
		@Pc(53) int local53 = arg1.method3698() << arg2;
		@Pc(59) int local59 = arg1.method3698() << arg2;
		@Pc(63) int local63 = arg1.method3642();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray128 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray128.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method3698();
			local86 = local82 >>> 8;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			@Pc(97) int local97 = local82 & 0xFF;
			if (local69 - local86 < local97) {
				local97 = local69 - local86;
			}
			this.aShortArray128[local75] = (short) (local97 | local86 << 8);
		}
		local63 = Static143.anInt2383 + (local63 << Static138.anInt2287);
		@Pc(147) int local147 = Static6.anIntArray6 == null ? Static254.anIntArray246[Static239.method3445(arg1.method3698()) & 0xFFFF] : Static6.anIntArray6[arg1.method3698()];
		local86 = arg1.method3642();
		this.anInt10047 = local86 & 0x1F;
		this.anInt10054 = (local86 & 0xE0) << 3;
		if (this.anInt10047 != 31) {
			this.method8368();
		}
		this.method8366(arg0, local47, local147, local63, local53, local59);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIZ)V")
	public void method8365(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(60) int local60;
		if (arg1) {
			local60 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt10054 + this.anInt10041 * arg0 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt10053;
			if (local26 == 1) {
				local60 = (Class242.anIntArray384[local23 << 3] >> 4) + 1024;
			} else if (local26 == 3) {
				local60 = Static243.anIntArray240[local23] >> 1;
			} else if (local26 == 4) {
				local60 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local60 = local23;
			} else if (local26 == 5) {
				local60 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local60 = 2048;
			}
		}
		this.aClass5_Sub3_3.method8321((float) (this.anInt10048 + (local60 * this.anInt10049 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	private void method8366(@OriginalArg(0) Class143 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass5_Sub3_3 = arg0.method6256(arg1, arg5, arg4, arg3, arg2, 1.0F);
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V")
	private void method8368() {
		@Pc(4) int local4 = this.anInt10047;
		if (local4 == 2) {
			this.anInt10053 = 1;
			this.anInt10048 = 0;
			this.anInt10041 = 2048;
			this.anInt10049 = 2048;
		} else if (local4 == 3) {
			this.anInt10049 = 2048;
			this.anInt10053 = 1;
			this.anInt10048 = 0;
			this.anInt10041 = 4096;
		} else if (local4 == 4) {
			this.anInt10053 = 4;
			this.anInt10049 = 2048;
			this.anInt10041 = 2048;
			this.anInt10048 = 0;
		} else if (local4 == 5) {
			this.anInt10049 = 2048;
			this.anInt10048 = 0;
			this.anInt10053 = 4;
			this.anInt10041 = 8192;
		} else if (local4 == 12) {
			this.anInt10041 = 2048;
			this.anInt10049 = 2048;
			this.anInt10048 = 0;
			this.anInt10053 = 2;
		} else if (local4 == 13) {
			this.anInt10048 = 0;
			this.anInt10049 = 2048;
			this.anInt10053 = 2;
			this.anInt10041 = 8192;
		} else if (local4 == 10) {
			this.anInt10048 = 1536;
			this.anInt10053 = 3;
			this.anInt10041 = 2048;
			this.anInt10049 = 512;
		} else if (local4 == 11) {
			this.anInt10048 = 1536;
			this.anInt10041 = 4096;
			this.anInt10049 = 512;
			this.anInt10053 = 3;
		} else if (local4 == 6) {
			this.anInt10049 = 768;
			this.anInt10048 = 1280;
			this.anInt10041 = 2048;
			this.anInt10053 = 3;
		} else if (local4 == 7) {
			this.anInt10053 = 3;
			this.anInt10041 = 4096;
			this.anInt10048 = 1280;
			this.anInt10049 = 768;
		} else if (local4 == 8) {
			this.anInt10041 = 2048;
			this.anInt10053 = 3;
			this.anInt10048 = 1024;
			this.anInt10049 = 1024;
		} else if (local4 == 9) {
			this.anInt10049 = 1024;
			this.anInt10041 = 4096;
			this.anInt10048 = 1024;
			this.anInt10053 = 3;
		} else if (local4 == 14) {
			this.anInt10048 = 1280;
			this.anInt10049 = 768;
			this.anInt10053 = 1;
			this.anInt10041 = 2048;
		} else if (local4 == 15) {
			this.anInt10048 = 1536;
			this.anInt10041 = 4096;
			this.anInt10049 = 512;
			this.anInt10053 = 1;
		} else if (local4 == 16) {
			this.anInt10049 = 256;
			this.anInt10048 = 1792;
			this.anInt10053 = 1;
			this.anInt10041 = 8192;
		} else {
			this.anInt10049 = 2048;
			this.anInt10048 = 0;
			this.anInt10041 = 2048;
			this.anInt10053 = 0;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIII)V")
	public void method8369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt10049 = arg0;
		this.anInt10041 = arg3;
		this.anInt10048 = arg1;
		this.anInt10053 = arg2;
	}
}
