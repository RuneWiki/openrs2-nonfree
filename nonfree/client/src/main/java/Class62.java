import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class62 {

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "Z")
	public boolean aBoolean103;

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "Z")
	public boolean aBoolean104;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "[S")
	public short[] aShortArray32;

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
	public int anInt1596;

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
	private int anInt1597;

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
	private int anInt1598;

	@OriginalMember(owner = "client!dda", name = "n", descriptor = "I")
	public int anInt1600;

	@OriginalMember(owner = "client!dda", name = "o", descriptor = "I")
	private int anInt1601;

	@OriginalMember(owner = "client!dda", name = "p", descriptor = "I")
	private int anInt1602;

	@OriginalMember(owner = "client!dda", name = "q", descriptor = "Lclient!ww;")
	public Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!dda", name = "s", descriptor = "I")
	private int anInt1604;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "()V")
	private Class62() {
		if (Static32.anIntArray111 == null) {
			Static160.method2488();
		}
		this.method1464();
	}

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!qa;Lclient!ge;I)V")
	public Class62(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class1_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (Static32.anIntArray111 == null) {
			Static160.method2488();
		}
		this.anInt1596 = arg1.method3922();
		this.aBoolean104 = (this.anInt1596 & 0x8) != 0;
		this.aBoolean103 = (this.anInt1596 & 0x10) != 0;
		this.anInt1596 &= 0x7;
		@Pc(50) int local50 = arg1.method3967() << arg2;
		@Pc(56) int local56 = arg1.method3967() << arg2;
		@Pc(62) int local62 = arg1.method3967() << arg2;
		@Pc(66) int local66 = arg1.method3922();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray32 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray32.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method3967();
			local89 = local85 >>> 8;
			@Pc(93) int local93 = local85 & 0xFF;
			if (local89 >= local72) {
				local89 = local72 - 1;
			}
			if (local72 - local89 < local93) {
				local93 = local72 - local89;
			}
			this.aShortArray32[local78] = (short) (local89 << 8 | local93);
		}
		local66 = Static122.anInt2483 + (local66 << Static451.anInt7905);
		@Pc(154) int local154 = Static212.anIntArray347 == null ? Static488.anIntArray759[Static518.method7138(arg1.method3967()) & 0xFFFF] : Static212.anIntArray347[arg1.method3967()];
		local89 = arg1.method3922();
		this.anInt1604 = (local89 & 0xE0) << 3;
		this.anInt1600 = local89 & 0x1F;
		if (this.anInt1600 != 31) {
			this.method1464();
		}
		this.method1462(local66, local50, local62, arg0, local56, local154);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZII)V")
	public void method1459(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(55) int local55;
		if (arg0) {
			local55 = 2048;
		} else {
			@Pc(19) int local19 = arg1 * this.anInt1601 / 50 + this.anInt1604 & 0x7FF;
			@Pc(22) int local22 = this.anInt1597;
			if (local22 == 1) {
				local55 = (Class310.anIntArray827[local19 << 3] >> 4) + 1024;
			} else if (local22 == 3) {
				local55 = Static32.anIntArray111[local19] >> 1;
			} else if (local22 == 4) {
				local55 = local19 >> 10 << 11;
			} else if (local22 == 2) {
				local55 = local19;
			} else if (local22 == 5) {
				local55 = (local19 >= 1024 ? 2048 - local19 : local19) << 1;
			} else {
				local55 = 2048;
			}
		}
		this.aClass1_Sub2_1.method2431((float) ((local55 * this.anInt1598 >> 11) + this.anInt1602) / 2048.0F);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIB)V")
	public void method1460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1602 = arg0;
		this.anInt1598 = arg2;
		this.anInt1597 = arg1;
		this.anInt1601 = arg3;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIILclient!qa;IZI)V")
	private void method1462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class122 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass1_Sub2_1 = arg3.method7249(arg1, arg2, arg4, arg0, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
	private void method1464() {
		@Pc(8) int local8 = this.anInt1600;
		if (local8 == 2) {
			this.anInt1602 = 0;
			this.anInt1598 = 2048;
			this.anInt1601 = 2048;
			this.anInt1597 = 1;
		} else if (local8 == 3) {
			this.anInt1602 = 0;
			this.anInt1597 = 1;
			this.anInt1601 = 4096;
			this.anInt1598 = 2048;
		} else if (local8 == 4) {
			this.anInt1598 = 2048;
			this.anInt1601 = 2048;
			this.anInt1597 = 4;
			this.anInt1602 = 0;
		} else if (local8 == 5) {
			this.anInt1602 = 0;
			this.anInt1598 = 2048;
			this.anInt1597 = 4;
			this.anInt1601 = 8192;
		} else if (local8 == 12) {
			this.anInt1602 = 0;
			this.anInt1598 = 2048;
			this.anInt1601 = 2048;
			this.anInt1597 = 2;
		} else if (local8 == 13) {
			this.anInt1601 = 8192;
			this.anInt1598 = 2048;
			this.anInt1602 = 0;
			this.anInt1597 = 2;
		} else if (local8 == 10) {
			this.anInt1598 = 512;
			this.anInt1602 = 1536;
			this.anInt1597 = 3;
			this.anInt1601 = 2048;
		} else if (local8 == 11) {
			this.anInt1598 = 512;
			this.anInt1602 = 1536;
			this.anInt1597 = 3;
			this.anInt1601 = 4096;
		} else if (local8 == 6) {
			this.anInt1601 = 2048;
			this.anInt1597 = 3;
			this.anInt1602 = 1280;
			this.anInt1598 = 768;
		} else if (local8 == 7) {
			this.anInt1597 = 3;
			this.anInt1602 = 1280;
			this.anInt1601 = 4096;
			this.anInt1598 = 768;
		} else if (local8 == 8) {
			this.anInt1601 = 2048;
			this.anInt1598 = 1024;
			this.anInt1597 = 3;
			this.anInt1602 = 1024;
		} else if (local8 == 9) {
			this.anInt1602 = 1024;
			this.anInt1598 = 1024;
			this.anInt1601 = 4096;
			this.anInt1597 = 3;
		} else if (local8 == 14) {
			this.anInt1598 = 768;
			this.anInt1597 = 1;
			this.anInt1602 = 1280;
			this.anInt1601 = 2048;
		} else if (local8 == 15) {
			this.anInt1601 = 4096;
			this.anInt1602 = 1536;
			this.anInt1597 = 1;
			this.anInt1598 = 512;
		} else if (local8 == 16) {
			this.anInt1602 = 1792;
			this.anInt1597 = 1;
			this.anInt1601 = 8192;
			this.anInt1598 = 256;
		} else {
			this.anInt1597 = 0;
			this.anInt1601 = 2048;
			this.anInt1602 = 0;
			this.anInt1598 = 2048;
		}
	}
}
