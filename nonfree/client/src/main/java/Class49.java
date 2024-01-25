import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class49 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "Lclient!tw;")
	public Class1_Sub24 aClass1_Sub24_1;

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
	private int anInt1416;

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "Z")
	public boolean aBoolean89;

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
	private int anInt1417;

	@OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
	private int anInt1419;

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
	private int anInt1420;

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "[S")
	public short[] aShortArray10;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "Z")
	public boolean aBoolean90;

	@OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
	private int anInt1424;

	@OriginalMember(owner = "client!ct", name = "s", descriptor = "I")
	public int anInt1425;

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
	public int anInt1426;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "()V")
	private Class49() {
		if (Static66.anIntArray58 == null) {
			Static311.method4642();
		}
		this.method1225();
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!r;Lclient!ac;I)V")
	public Class49(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class1_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (Static66.anIntArray58 == null) {
			Static311.method4642();
		}
		this.anInt1425 = arg1.method7974();
		this.aBoolean89 = (this.anInt1425 & 0x8) != 0;
		this.aBoolean90 = (this.anInt1425 & 0x10) != 0;
		this.anInt1425 &= 0x7;
		@Pc(50) int local50 = arg1.method7945() << arg2;
		@Pc(56) int local56 = arg1.method7945() << arg2;
		@Pc(62) int local62 = arg1.method7945() << arg2;
		@Pc(66) int local66 = arg1.method7974();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray10 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray10.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method7945();
			local89 = local85 >>> 8;
			if (local72 <= local89) {
				local89 = local72 - 1;
			}
			@Pc(100) int local100 = local85 & 0xFF;
			if (local72 - local89 < local100) {
				local100 = local72 - local89;
			}
			this.aShortArray10[local78] = (short) (local100 | local89 << 8);
		}
		local66 = Static513.anInt8858 + (local66 << Static166.anInt7796);
		@Pc(159) int local159 = Static226.anIntArray212 == null ? Static281.anIntArray289[Static469.method6496(arg1.method7945()) & 0xFFFF] : Static226.anIntArray212[arg1.method7945()];
		local89 = arg1.method7974();
		this.anInt1420 = (local89 & 0xE0) << 3;
		this.anInt1426 = local89 & 0x1F;
		if (this.anInt1426 != 31) {
			this.method1225();
		}
		this.method1223(local50, arg0, local62, local159, local56, local66);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!r;IIIII)V")
	private void method1223(@OriginalArg(0) int arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass1_Sub24_1 = arg1.method6790(arg0, arg2, arg4, arg5, arg3, 1.0F);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	private void method1225() {
		@Pc(10) int local10 = this.anInt1426;
		if (local10 == 2) {
			this.anInt1424 = 2048;
			this.anInt1419 = 0;
			this.anInt1417 = 1;
			this.anInt1416 = 2048;
		} else if (local10 == 3) {
			this.anInt1424 = 2048;
			this.anInt1417 = 1;
			this.anInt1419 = 0;
			this.anInt1416 = 4096;
		} else if (local10 == 4) {
			this.anInt1419 = 0;
			this.anInt1424 = 2048;
			this.anInt1417 = 4;
			this.anInt1416 = 2048;
		} else if (local10 == 5) {
			this.anInt1416 = 8192;
			this.anInt1417 = 4;
			this.anInt1419 = 0;
			this.anInt1424 = 2048;
		} else if (local10 == 12) {
			this.anInt1424 = 2048;
			this.anInt1419 = 0;
			this.anInt1417 = 2;
			this.anInt1416 = 2048;
		} else if (local10 == 13) {
			this.anInt1416 = 8192;
			this.anInt1417 = 2;
			this.anInt1419 = 0;
			this.anInt1424 = 2048;
		} else if (local10 == 10) {
			this.anInt1417 = 3;
			this.anInt1424 = 512;
			this.anInt1419 = 1536;
			this.anInt1416 = 2048;
		} else if (local10 == 11) {
			this.anInt1419 = 1536;
			this.anInt1416 = 4096;
			this.anInt1424 = 512;
			this.anInt1417 = 3;
		} else if (local10 == 6) {
			this.anInt1419 = 1280;
			this.anInt1416 = 2048;
			this.anInt1417 = 3;
			this.anInt1424 = 768;
		} else if (local10 == 7) {
			this.anInt1417 = 3;
			this.anInt1419 = 1280;
			this.anInt1424 = 768;
			this.anInt1416 = 4096;
		} else if (local10 == 8) {
			this.anInt1424 = 1024;
			this.anInt1416 = 2048;
			this.anInt1419 = 1024;
			this.anInt1417 = 3;
		} else if (local10 == 9) {
			this.anInt1424 = 1024;
			this.anInt1417 = 3;
			this.anInt1416 = 4096;
			this.anInt1419 = 1024;
		} else if (local10 == 14) {
			this.anInt1417 = 1;
			this.anInt1419 = 1280;
			this.anInt1424 = 768;
			this.anInt1416 = 2048;
		} else if (local10 == 15) {
			this.anInt1424 = 512;
			this.anInt1419 = 1536;
			this.anInt1416 = 4096;
			this.anInt1417 = 1;
		} else if (local10 == 16) {
			this.anInt1416 = 8192;
			this.anInt1424 = 256;
			this.anInt1417 = 1;
			this.anInt1419 = 1792;
		} else {
			this.anInt1419 = 0;
			this.anInt1424 = 2048;
			this.anInt1416 = 2048;
			this.anInt1417 = 0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIII)V")
	public void method1226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1419 = arg3;
		this.anInt1416 = arg2;
		this.anInt1424 = arg1;
		this.anInt1417 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIB)V")
	public void method1227(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17;
		if (arg0) {
			local17 = 2048;
		} else {
			@Pc(31) int local31 = arg1 * this.anInt1416 / 50 + this.anInt1420 & 0x7FF;
			@Pc(34) int local34 = this.anInt1417;
			if (local34 == 1) {
				local17 = (Class85_Sub8.anIntArray426[local31 << 3] >> 4) + 1024;
			} else if (local34 == 3) {
				local17 = Static66.anIntArray58[local31] >> 1;
			} else if (local34 == 4) {
				local17 = local31 >> 10 << 11;
			} else if (local34 == 2) {
				local17 = local31;
			} else if (local34 == 5) {
				local17 = (local31 < 1024 ? local31 : 2048 - local31) << 1;
			} else {
				local17 = 2048;
			}
		}
		this.aClass1_Sub24_1.method7611((float) ((local17 * this.anInt1424 >> 11) + this.anInt1419) / 2048.0F);
	}
}
