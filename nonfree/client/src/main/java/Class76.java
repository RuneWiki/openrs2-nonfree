import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class76 {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
	private int anInt2347;

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
	private int anInt2349;

	@OriginalMember(owner = "client!fi", name = "i", descriptor = "Z")
	public boolean aBoolean161;

	@OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
	private int anInt2352;

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
	private int anInt2353;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
	public int anInt2354;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "Z")
	public boolean aBoolean162;

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "[S")
	public short[] aShortArray25;

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
	public int anInt2355;

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
	private int anInt2356;

	@OriginalMember(owner = "client!fi", name = "q", descriptor = "Lclient!dq;")
	public Class6_Sub11 aClass6_Sub11_1;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	private Class76() {
		if (Static315.anIntArray368 == null) {
			Static129.method2308();
		}
		this.method1937();
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!eq;Lclient!ae;I)V")
	public Class76(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class6_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (Static315.anIntArray368 == null) {
			Static129.method2308();
		}
		this.anInt2354 = arg1.method6433();
		this.aBoolean161 = (this.anInt2354 & 0x10) != 0;
		this.aBoolean162 = (this.anInt2354 & 0x8) != 0;
		this.anInt2354 &= 0x7;
		@Pc(47) int local47 = arg1.method6485() << arg2;
		@Pc(53) int local53 = arg1.method6485() << arg2;
		@Pc(59) int local59 = arg1.method6485() << arg2;
		@Pc(63) int local63 = arg1.method6433();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray25 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray25.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method6485();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			if (local69 - local86 < local90) {
				local90 = local69 - local86;
			}
			this.aShortArray25[local75] = (short) (local90 | local86 << 8);
		}
		local63 = Static437.anInt7761 + (local63 << Static62.anInt1705);
		@Pc(155) int local155 = Static427.anIntArray525 == null ? Static97.anIntArray130[Static231.method6534(arg1.method6485()) & 0xFFFF] : Static427.anIntArray525[arg1.method6485()];
		local86 = arg1.method6433();
		this.anInt2347 = (local86 & 0xE0) << 3;
		this.anInt2355 = local86 & 0x1F;
		if (this.anInt2355 != 31) {
			this.method1937();
		}
		this.method1936(local155, local53, local47, local59, arg0, local63);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZII)V")
	public void method1933(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg0) {
			local17 = 2048;
		} else {
			@Pc(31) int local31 = this.anInt2347 + arg1 * this.anInt2356 / 50 & 0x7FF;
			@Pc(34) int local34 = this.anInt2352;
			if (local34 == 1) {
				local17 = (Class145.anIntArray279[local31 << 3] >> 5) + 1024;
			} else if (local34 == 3) {
				local17 = Static315.anIntArray368[local31] >> 1;
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
		this.aClass6_Sub11_1.method6397((float) (this.anInt2349 + (local17 * this.anInt2353 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIII)V")
	public void method1934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2356 = arg3;
		this.anInt2349 = arg0;
		this.anInt2352 = arg1;
		this.anInt2353 = arg2;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIILclient!eq;I)V")
	private void method1936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class66 arg4, @OriginalArg(6) int arg5) {
		this.aClass6_Sub11_1 = arg4.method4981(arg2, arg3, arg1, arg5, arg0, 1.0F);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	private void method1937() {
		@Pc(8) int local8 = this.anInt2355;
		if (local8 == 2) {
			this.anInt2356 = 2048;
			this.anInt2352 = 1;
			this.anInt2353 = 2048;
			this.anInt2349 = 0;
		} else if (local8 == 3) {
			this.anInt2349 = 0;
			this.anInt2353 = 2048;
			this.anInt2356 = 4096;
			this.anInt2352 = 1;
		} else if (local8 == 4) {
			this.anInt2349 = 0;
			this.anInt2352 = 4;
			this.anInt2353 = 2048;
			this.anInt2356 = 2048;
		} else if (local8 == 5) {
			this.anInt2353 = 2048;
			this.anInt2356 = 8192;
			this.anInt2349 = 0;
			this.anInt2352 = 4;
		} else if (local8 == 12) {
			this.anInt2352 = 2;
			this.anInt2349 = 0;
			this.anInt2353 = 2048;
			this.anInt2356 = 2048;
		} else if (local8 == 13) {
			this.anInt2356 = 8192;
			this.anInt2352 = 2;
			this.anInt2353 = 2048;
			this.anInt2349 = 0;
		} else if (local8 == 10) {
			this.anInt2352 = 3;
			this.anInt2353 = 512;
			this.anInt2349 = 1536;
			this.anInt2356 = 2048;
		} else if (local8 == 11) {
			this.anInt2352 = 3;
			this.anInt2353 = 512;
			this.anInt2349 = 1536;
			this.anInt2356 = 4096;
		} else if (local8 == 6) {
			this.anInt2353 = 768;
			this.anInt2349 = 1280;
			this.anInt2352 = 3;
			this.anInt2356 = 2048;
		} else if (local8 == 7) {
			this.anInt2353 = 768;
			this.anInt2349 = 1280;
			this.anInt2352 = 3;
			this.anInt2356 = 4096;
		} else if (local8 == 8) {
			this.anInt2349 = 1024;
			this.anInt2356 = 2048;
			this.anInt2352 = 3;
			this.anInt2353 = 1024;
		} else if (local8 == 9) {
			this.anInt2349 = 1024;
			this.anInt2352 = 3;
			this.anInt2356 = 4096;
			this.anInt2353 = 1024;
		} else if (local8 == 14) {
			this.anInt2356 = 2048;
			this.anInt2353 = 768;
			this.anInt2349 = 1280;
			this.anInt2352 = 1;
		} else if (local8 == 15) {
			this.anInt2349 = 1536;
			this.anInt2356 = 4096;
			this.anInt2353 = 512;
			this.anInt2352 = 1;
		} else if (local8 == 16) {
			this.anInt2352 = 1;
			this.anInt2356 = 8192;
			this.anInt2349 = 1792;
			this.anInt2353 = 256;
		} else {
			this.anInt2349 = 0;
			this.anInt2353 = 2048;
			this.anInt2356 = 2048;
			this.anInt2352 = 0;
		}
	}
}
