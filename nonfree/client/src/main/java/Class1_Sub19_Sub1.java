import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class1_Sub19_Sub1 extends Class1_Sub19 {

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "Z")
	public boolean aBoolean200;

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
	private int anInt2486;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
	private int anInt2488;

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "Z")
	public boolean aBoolean201;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	public int anInt2490;

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
	public int anInt2491;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
	private int anInt2494;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
	private int anInt2495;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
	private int anInt2496;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	private Class1_Sub19_Sub1() {
		if (Static287.anIntArray559 == null) {
			Static92.method1449();
		}
		this.method2023();
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class1_Sub19_Sub1(@OriginalArg(0) Class1_Sub21 arg0) {
		if (Static287.anIntArray559 == null) {
			Static92.method1449();
		}
		this.anInt2490 = arg0.method5720();
		this.aBoolean200 = (this.anInt2490 & 0x8) != 0;
		this.aBoolean201 = (this.anInt2490 & 0x10) != 0;
		this.anInt2490 &= 0x7;
		super.anInt2482 = arg0.method5715();
		super.anInt2484 = arg0.method5715();
		super.anInt2481 = arg0.method5715();
		super.anInt2479 = arg0.method5720();
		@Pc(68) int local68 = super.anInt2479 * 2 + 1;
		this.aShortArray39 = new short[local68];
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray39.length; local74++) {
			@Pc(81) short local81 = (short) arg0.method5715();
			@Pc(85) int local85 = local81 >>> 8;
			@Pc(89) int local89 = local81 & 0xFF;
			if (local85 >= local68) {
				local85 = local68 - 1;
			}
			if (local89 > local68 - local85) {
				local89 = local68 - local85;
			}
			this.aShortArray39[local74] = (short) (local89 | local85 << 8);
		}
		super.anInt2479 = (super.anInt2479 << 7) + 64;
		if (Static77.anIntArray118 == null) {
			super.anInt2483 = Static94.anIntArray150[Static173.method3114(arg0.method5715()) & 0xFFFF];
		} else {
			super.anInt2483 = Static77.anIntArray118[arg0.method5715()];
		}
		@Pc(161) int local161 = arg0.method5720();
		this.anInt2486 = (local161 & 0xE0) << 3;
		this.anInt2491 = local161 & 0x1F;
		if (this.anInt2491 != 31) {
			this.method2023();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIBI)V")
	public void method2021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2488 = arg2;
		this.anInt2495 = arg3;
		this.anInt2494 = arg1;
		this.anInt2496 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	private void method2023() {
		@Pc(8) int local8 = this.anInt2491;
		if (local8 == 2) {
			this.anInt2494 = 1;
			this.anInt2496 = 2048;
			this.anInt2488 = 0;
			this.anInt2495 = 2048;
		} else if (local8 == 3) {
			this.anInt2495 = 2048;
			this.anInt2496 = 4096;
			this.anInt2494 = 1;
			this.anInt2488 = 0;
		} else if (local8 == 4) {
			this.anInt2488 = 0;
			this.anInt2495 = 2048;
			this.anInt2496 = 2048;
			this.anInt2494 = 4;
		} else if (local8 == 5) {
			this.anInt2495 = 2048;
			this.anInt2496 = 8192;
			this.anInt2488 = 0;
			this.anInt2494 = 4;
		} else if (local8 == 12) {
			this.anInt2495 = 2048;
			this.anInt2496 = 2048;
			this.anInt2494 = 2;
			this.anInt2488 = 0;
		} else if (local8 == 13) {
			this.anInt2496 = 8192;
			this.anInt2488 = 0;
			this.anInt2495 = 2048;
			this.anInt2494 = 2;
		} else if (local8 == 10) {
			this.anInt2488 = 1536;
			this.anInt2494 = 3;
			this.anInt2496 = 2048;
			this.anInt2495 = 512;
		} else if (local8 == 11) {
			this.anInt2488 = 1536;
			this.anInt2496 = 4096;
			this.anInt2495 = 512;
			this.anInt2494 = 3;
		} else if (local8 == 6) {
			this.anInt2495 = 768;
			this.anInt2488 = 1280;
			this.anInt2496 = 2048;
			this.anInt2494 = 3;
		} else if (local8 == 7) {
			this.anInt2495 = 768;
			this.anInt2494 = 3;
			this.anInt2488 = 1280;
			this.anInt2496 = 4096;
		} else if (local8 == 8) {
			this.anInt2495 = 1024;
			this.anInt2494 = 3;
			this.anInt2496 = 2048;
			this.anInt2488 = 1024;
		} else if (local8 == 9) {
			this.anInt2495 = 1024;
			this.anInt2496 = 4096;
			this.anInt2494 = 3;
			this.anInt2488 = 1024;
		} else if (local8 == 14) {
			this.anInt2495 = 768;
			this.anInt2496 = 2048;
			this.anInt2494 = 1;
			this.anInt2488 = 1280;
		} else if (local8 == 15) {
			this.anInt2488 = 1536;
			this.anInt2495 = 512;
			this.anInt2496 = 4096;
			this.anInt2494 = 1;
		} else if (local8 == 16) {
			this.anInt2488 = 1792;
			this.anInt2496 = 8192;
			this.anInt2494 = 1;
			this.anInt2495 = 256;
		} else {
			this.anInt2495 = 2048;
			this.anInt2488 = 0;
			this.anInt2496 = 2048;
			this.anInt2494 = 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZII)V")
	public void method2024(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(54) int local54;
		if (arg0) {
			local54 = 2048;
		} else {
			@Pc(24) int local24 = this.anInt2496 * arg1 / 50 + this.anInt2486 & 0x7FF;
			@Pc(27) int local27 = this.anInt2494;
			if (local27 == 1) {
				local54 = (Class1_Sub5_Sub15.anIntArray335[local24 << 3] >> 5) + 1024;
			} else if (local27 == 3) {
				local54 = Static287.anIntArray559[local24] >> 1;
			} else if (local27 == 4) {
				local54 = local24 >> 10 << 11;
			} else if (local27 == 2) {
				local54 = local24;
			} else if (local27 == 5) {
				local54 = (local24 >= 1024 ? 2048 - local24 : local24) << 1;
			} else {
				local54 = 2048;
			}
		}
		super.aFloat15 = (float) (this.anInt2488 + (this.anInt2495 * local54 >> 11)) / 2048.0F;
	}
}
