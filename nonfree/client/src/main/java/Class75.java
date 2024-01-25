import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class75 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Z")
	public boolean aBoolean153;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	public int anInt2346;

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	private int anInt2347;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Lclient!ja;")
	public Class1_Sub4 aClass1_Sub4_2;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	private int anInt2348;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "Z")
	public boolean aBoolean154;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	private int anInt2349;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	private int anInt2350;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "I")
	public int anInt2355;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "I")
	private int anInt2358;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	private Class75() {
		if (Static254.anIntArray468 == null) {
			Static236.method3591();
		}
		this.method1705();
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!za;Lclient!ia;I)V")
	public Class75(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class1_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (Static254.anIntArray468 == null) {
			Static236.method3591();
		}
		this.anInt2355 = arg1.method1171();
		this.aBoolean154 = (this.anInt2355 & 0x10) != 0;
		this.aBoolean153 = (this.anInt2355 & 0x8) != 0;
		this.anInt2355 &= 0x7;
		@Pc(45) int local45 = arg1.method1177() << arg2;
		@Pc(51) int local51 = arg1.method1177() << arg2;
		@Pc(57) int local57 = arg1.method1177() << arg2;
		@Pc(61) int local61 = arg1.method1171();
		@Pc(67) int local67 = local61 * 2 + 1;
		this.aShortArray55 = new short[local67];
		@Pc(83) int local83;
		for (@Pc(73) int local73 = 0; local73 < this.aShortArray55.length; local73++) {
			@Pc(79) short local79 = (short) arg1.method1177();
			local83 = local79 >>> 8;
			@Pc(87) int local87 = local79 & 0xFF;
			if (local83 >= local67) {
				local83 = local67 - 1;
			}
			if (local87 > local67 - local83) {
				local87 = local67 - local83;
			}
			this.aShortArray55[local73] = (short) (local87 | local83 << 8);
		}
		local61 = Static333.anInt6111 + (local61 << Static198.anInt7947);
		@Pc(149) int local149 = Static404.anIntArray530 == null ? Static238.anIntArray440[Static285.method4173(arg1.method1177()) & 0xFFFF] : Static404.anIntArray530[arg1.method1177()];
		local83 = arg1.method1171();
		this.anInt2350 = (local83 & 0xE0) << 3;
		this.anInt2346 = local83 & 0x1F;
		if (this.anInt2346 != 31) {
			this.method1705();
		}
		this.method1701(local45, arg0, local149, local61, local51, local57);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!za;IIIII)V")
	private void method1701(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass1_Sub4_2 = arg1.method5924(arg0, arg5, arg4, arg3, arg2, 1.0F);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZ)V")
	public void method1702(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(64) int local64;
		if (arg1) {
			local64 = 2048;
		} else {
			@Pc(30) int local30 = this.anInt2350 + this.anInt2348 * arg0 / 50 & 0x7FF;
			@Pc(33) int local33 = this.anInt2349;
			if (local33 == 1) {
				local64 = (Class90_Sub1.anIntArray304[local30 << 3] >> 5) + 1024;
			} else if (local33 == 3) {
				local64 = Static254.anIntArray468[local30] >> 1;
			} else if (local33 == 4) {
				local64 = local30 >> 10 << 11;
			} else if (local33 == 2) {
				local64 = local30;
			} else if (local33 == 5) {
				local64 = (local30 >= 1024 ? 2048 - local30 : local30) << 1;
			} else {
				local64 = 2048;
			}
		}
		this.aClass1_Sub4_2.method3807((float) ((local64 * this.anInt2358 >> 11) + this.anInt2347) / 2048.0F);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IBIII)V")
	public void method1704(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2349 = arg3;
		this.anInt2348 = arg1;
		this.anInt2347 = arg2;
		this.anInt2358 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
	private void method1705() {
		@Pc(12) int local12 = this.anInt2346;
		if (local12 == 2) {
			this.anInt2348 = 2048;
			this.anInt2349 = 1;
			this.anInt2347 = 0;
			this.anInt2358 = 2048;
		} else if (local12 == 3) {
			this.anInt2358 = 2048;
			this.anInt2348 = 4096;
			this.anInt2347 = 0;
			this.anInt2349 = 1;
		} else if (local12 == 4) {
			this.anInt2348 = 2048;
			this.anInt2347 = 0;
			this.anInt2349 = 4;
			this.anInt2358 = 2048;
		} else if (local12 == 5) {
			this.anInt2348 = 8192;
			this.anInt2349 = 4;
			this.anInt2358 = 2048;
			this.anInt2347 = 0;
		} else if (local12 == 12) {
			this.anInt2348 = 2048;
			this.anInt2347 = 0;
			this.anInt2349 = 2;
			this.anInt2358 = 2048;
		} else if (local12 == 13) {
			this.anInt2358 = 2048;
			this.anInt2349 = 2;
			this.anInt2347 = 0;
			this.anInt2348 = 8192;
		} else if (local12 == 10) {
			this.anInt2347 = 1536;
			this.anInt2358 = 512;
			this.anInt2348 = 2048;
			this.anInt2349 = 3;
		} else if (local12 == 11) {
			this.anInt2348 = 4096;
			this.anInt2347 = 1536;
			this.anInt2358 = 512;
			this.anInt2349 = 3;
		} else if (local12 == 6) {
			this.anInt2349 = 3;
			this.anInt2347 = 1280;
			this.anInt2358 = 768;
			this.anInt2348 = 2048;
		} else if (local12 == 7) {
			this.anInt2348 = 4096;
			this.anInt2349 = 3;
			this.anInt2347 = 1280;
			this.anInt2358 = 768;
		} else if (local12 == 8) {
			this.anInt2358 = 1024;
			this.anInt2349 = 3;
			this.anInt2347 = 1024;
			this.anInt2348 = 2048;
		} else if (local12 == 9) {
			this.anInt2347 = 1024;
			this.anInt2349 = 3;
			this.anInt2358 = 1024;
			this.anInt2348 = 4096;
		} else if (local12 == 14) {
			this.anInt2358 = 768;
			this.anInt2347 = 1280;
			this.anInt2348 = 2048;
			this.anInt2349 = 1;
		} else if (local12 == 15) {
			this.anInt2349 = 1;
			this.anInt2348 = 4096;
			this.anInt2347 = 1536;
			this.anInt2358 = 512;
		} else if (local12 == 16) {
			this.anInt2349 = 1;
			this.anInt2348 = 8192;
			this.anInt2358 = 256;
			this.anInt2347 = 1792;
		} else {
			this.anInt2347 = 0;
			this.anInt2349 = 0;
			this.anInt2348 = 2048;
			this.anInt2358 = 2048;
		}
	}
}
