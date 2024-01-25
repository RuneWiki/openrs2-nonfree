import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class226 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!be;")
	public Class3_Sub7 aClass3_Sub7_2;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public int anInt6363;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
	public int anInt6364;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
	private int anInt6365;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	private int anInt6367;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "Z")
	public boolean aBoolean431;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	private int anInt6369;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	private int anInt6370;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "Z")
	public boolean aBoolean432;

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
	private int anInt6372;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	private Class226() {
		if (Static127.anIntArray114 == null) {
			Static158.method2486();
		}
		this.method5240();
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!qa;Lclient!nj;I)V")
	public Class226(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class3_Sub25 arg1, @OriginalArg(2) int arg2) {
		if (Static127.anIntArray114 == null) {
			Static158.method2486();
		}
		this.anInt6363 = arg1.method4096();
		this.aBoolean432 = (this.anInt6363 & 0x10) != 0;
		this.aBoolean431 = (this.anInt6363 & 0x8) != 0;
		this.anInt6363 &= 0x7;
		@Pc(50) int local50 = arg1.method4083() << arg2;
		@Pc(56) int local56 = arg1.method4083() << arg2;
		@Pc(62) int local62 = arg1.method4083() << arg2;
		@Pc(66) int local66 = arg1.method4096();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray111 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray111.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method4083();
			local89 = local85 >>> 8;
			if (local89 >= local72) {
				local89 = local72 - 1;
			}
			@Pc(100) int local100 = local85 & 0xFF;
			if (local100 > local72 - local89) {
				local100 = local72 - local89;
			}
			this.aShortArray111[local78] = (short) (local100 | local89 << 8);
		}
		local66 = (local66 << Static437.anInt7308) + Static22.anInt382;
		@Pc(151) int local151 = Static329.anIntArray346 == null ? Static225.anIntArray253[Static332.method4597(arg1.method4083()) & 0xFFFF] : Static329.anIntArray346[arg1.method4083()];
		local89 = arg1.method4096();
		this.anInt6364 = local89 & 0x1F;
		this.anInt6370 = (local89 & 0xE0) << 3;
		if (this.anInt6364 != 31) {
			this.method5240();
		}
		this.method5245(local66, local62, local50, local151, arg0, local56);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	private void method5240() {
		@Pc(14) int local14 = this.anInt6364;
		if (local14 == 2) {
			this.anInt6372 = 0;
			this.anInt6365 = 2048;
			this.anInt6367 = 1;
			this.anInt6369 = 2048;
		} else if (local14 == 3) {
			this.anInt6372 = 0;
			this.anInt6369 = 4096;
			this.anInt6367 = 1;
			this.anInt6365 = 2048;
		} else if (local14 == 4) {
			this.anInt6367 = 4;
			this.anInt6372 = 0;
			this.anInt6365 = 2048;
			this.anInt6369 = 2048;
		} else if (local14 == 5) {
			this.anInt6365 = 2048;
			this.anInt6369 = 8192;
			this.anInt6367 = 4;
			this.anInt6372 = 0;
		} else if (local14 == 12) {
			this.anInt6365 = 2048;
			this.anInt6372 = 0;
			this.anInt6369 = 2048;
			this.anInt6367 = 2;
		} else if (local14 == 13) {
			this.anInt6365 = 2048;
			this.anInt6369 = 8192;
			this.anInt6367 = 2;
			this.anInt6372 = 0;
		} else if (local14 == 10) {
			this.anInt6365 = 512;
			this.anInt6372 = 1536;
			this.anInt6367 = 3;
			this.anInt6369 = 2048;
		} else if (local14 == 11) {
			this.anInt6365 = 512;
			this.anInt6367 = 3;
			this.anInt6369 = 4096;
			this.anInt6372 = 1536;
		} else if (local14 == 6) {
			this.anInt6367 = 3;
			this.anInt6365 = 768;
			this.anInt6372 = 1280;
			this.anInt6369 = 2048;
		} else if (local14 == 7) {
			this.anInt6367 = 3;
			this.anInt6365 = 768;
			this.anInt6372 = 1280;
			this.anInt6369 = 4096;
		} else if (local14 == 8) {
			this.anInt6367 = 3;
			this.anInt6369 = 2048;
			this.anInt6372 = 1024;
			this.anInt6365 = 1024;
		} else if (local14 == 9) {
			this.anInt6367 = 3;
			this.anInt6365 = 1024;
			this.anInt6372 = 1024;
			this.anInt6369 = 4096;
		} else if (local14 == 14) {
			this.anInt6369 = 2048;
			this.anInt6367 = 1;
			this.anInt6365 = 768;
			this.anInt6372 = 1280;
		} else if (local14 == 15) {
			this.anInt6372 = 1536;
			this.anInt6369 = 4096;
			this.anInt6365 = 512;
			this.anInt6367 = 1;
		} else if (local14 == 16) {
			this.anInt6369 = 8192;
			this.anInt6372 = 1792;
			this.anInt6367 = 1;
			this.anInt6365 = 256;
		} else {
			this.anInt6365 = 2048;
			this.anInt6369 = 2048;
			this.anInt6367 = 0;
			this.anInt6372 = 0;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZII)V")
	public void method5242(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt6369 * arg1 / 50 + this.anInt6370 & 0x7FF;
			@Pc(26) int local26 = this.anInt6367;
			if (local26 == 1) {
				local9 = (Class65.anIntArray88[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local9 = Static127.anIntArray114[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass3_Sub7_2.method2482((float) (this.anInt6372 + (local9 * this.anInt6365 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIII)V")
	public void method5244(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6372 = arg3;
		this.anInt6367 = arg0;
		this.anInt6365 = arg2;
		this.anInt6369 = arg1;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZILclient!qa;I)V")
	private void method5245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub7_2 = arg4.method6025(arg2, arg1, arg5, arg0, arg3, 1.0F);
	}
}
