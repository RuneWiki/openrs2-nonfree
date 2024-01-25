import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class79 {

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
	public int anInt2029;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	private int anInt2030;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	private int anInt2031;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
	public int anInt2033;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Z")
	public boolean aBoolean159;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
	private int anInt2036;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!rc;")
	public Class1_Sub18 aClass1_Sub18_2;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Z")
	public boolean aBoolean160;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	private int anInt2038;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	private int anInt2039;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	private Class79() {
		if (Static135.anIntArray223 == null) {
			Static216.method3350();
		}
		this.method1667();
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!r;Lclient!mo;I)V")
	public Class79(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class1_Sub35 arg1, @OriginalArg(2) int arg2) {
		if (Static135.anIntArray223 == null) {
			Static216.method3350();
		}
		this.anInt2033 = arg1.method5750();
		this.aBoolean159 = (this.anInt2033 & 0x8) != 0;
		this.aBoolean160 = (this.anInt2033 & 0x10) != 0;
		this.anInt2033 &= 0x7;
		@Pc(50) int local50 = arg1.method5771() << arg2;
		@Pc(56) int local56 = arg1.method5771() << arg2;
		@Pc(62) int local62 = arg1.method5771() << arg2;
		@Pc(66) int local66 = arg1.method5750();
		@Pc(72) int local72 = local66 * 2 + 1;
		this.aShortArray45 = new short[local72];
		@Pc(89) int local89;
		for (@Pc(78) int local78 = 0; local78 < this.aShortArray45.length; local78++) {
			@Pc(85) short local85 = (short) arg1.method5771();
			local89 = local85 >>> 8;
			@Pc(93) int local93 = local85 & 0xFF;
			if (local89 >= local72) {
				local89 = local72 - 1;
			}
			if (local93 > local72 - local89) {
				local93 = local72 - local89;
			}
			this.aShortArray45[local78] = (short) (local93 | local89 << 8);
		}
		local66 = (local66 << Static351.anInt5832) + Static142.anInt2687;
		@Pc(151) int local151 = Static379.anIntArray506 == null ? Static184.anIntArray303[Static584.method7802(arg1.method5771()) & 0xFFFF] : Static379.anIntArray506[arg1.method5771()];
		local89 = arg1.method5750();
		this.anInt2029 = local89 & 0x1F;
		this.anInt2039 = (local89 & 0xE0) << 3;
		if (this.anInt2029 != 31) {
			this.method1667();
		}
		this.method1668(local50, local62, local66, arg0, local151, local56);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIZ)V")
	public void method1665(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(65) int local65;
		if (arg0) {
			local65 = 2048;
		} else {
			@Pc(31) int local31 = arg1 * this.anInt2030 / 50 + this.anInt2039 & 0x7FF;
			@Pc(34) int local34 = this.anInt2038;
			if (local34 == 1) {
				local65 = (Class1_Sub6_Sub2.anIntArray675[local31 << 3] >> 4) + 1024;
			} else if (local34 == 3) {
				local65 = Static135.anIntArray223[local31] >> 1;
			} else if (local34 == 4) {
				local65 = local31 >> 10 << 11;
			} else if (local34 == 2) {
				local65 = local31;
			} else if (local34 == 5) {
				local65 = (local31 < 1024 ? local31 : 2048 - local31) << 1;
			} else {
				local65 = 2048;
			}
		}
		this.aClass1_Sub18_2.method4100((float) (this.anInt2031 + (this.anInt2036 * local65 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZII)V")
	public void method1666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2038 = arg0;
		this.anInt2030 = arg1;
		this.anInt2036 = arg3;
		this.anInt2031 = arg2;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
	private void method1667() {
		@Pc(4) int local4 = this.anInt2029;
		if (local4 == 2) {
			this.anInt2031 = 0;
			this.anInt2038 = 1;
			this.anInt2030 = 2048;
			this.anInt2036 = 2048;
		} else if (local4 == 3) {
			this.anInt2031 = 0;
			this.anInt2036 = 2048;
			this.anInt2030 = 4096;
			this.anInt2038 = 1;
		} else if (local4 == 4) {
			this.anInt2036 = 2048;
			this.anInt2031 = 0;
			this.anInt2038 = 4;
			this.anInt2030 = 2048;
		} else if (local4 == 5) {
			this.anInt2030 = 8192;
			this.anInt2036 = 2048;
			this.anInt2038 = 4;
			this.anInt2031 = 0;
		} else if (local4 == 12) {
			this.anInt2031 = 0;
			this.anInt2036 = 2048;
			this.anInt2038 = 2;
			this.anInt2030 = 2048;
		} else if (local4 == 13) {
			this.anInt2031 = 0;
			this.anInt2030 = 8192;
			this.anInt2036 = 2048;
			this.anInt2038 = 2;
		} else if (local4 == 10) {
			this.anInt2038 = 3;
			this.anInt2031 = 1536;
			this.anInt2030 = 2048;
			this.anInt2036 = 512;
		} else if (local4 == 11) {
			this.anInt2038 = 3;
			this.anInt2030 = 4096;
			this.anInt2036 = 512;
			this.anInt2031 = 1536;
		} else if (local4 == 6) {
			this.anInt2036 = 768;
			this.anInt2038 = 3;
			this.anInt2031 = 1280;
			this.anInt2030 = 2048;
		} else if (local4 == 7) {
			this.anInt2030 = 4096;
			this.anInt2031 = 1280;
			this.anInt2038 = 3;
			this.anInt2036 = 768;
		} else if (local4 == 8) {
			this.anInt2031 = 1024;
			this.anInt2036 = 1024;
			this.anInt2030 = 2048;
			this.anInt2038 = 3;
		} else if (local4 == 9) {
			this.anInt2036 = 1024;
			this.anInt2031 = 1024;
			this.anInt2038 = 3;
			this.anInt2030 = 4096;
		} else if (local4 == 14) {
			this.anInt2036 = 768;
			this.anInt2030 = 2048;
			this.anInt2038 = 1;
			this.anInt2031 = 1280;
		} else if (local4 == 15) {
			this.anInt2031 = 1536;
			this.anInt2036 = 512;
			this.anInt2038 = 1;
			this.anInt2030 = 4096;
		} else if (local4 == 16) {
			this.anInt2030 = 8192;
			this.anInt2031 = 1792;
			this.anInt2036 = 256;
			this.anInt2038 = 1;
		} else {
			this.anInt2031 = 0;
			this.anInt2036 = 2048;
			this.anInt2038 = 0;
			this.anInt2030 = 2048;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILclient!r;IIZ)V")
	private void method1668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class134 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass1_Sub18_2 = arg3.method6928(arg0, arg1, arg5, arg2, arg4, 1.0F);
	}
}
