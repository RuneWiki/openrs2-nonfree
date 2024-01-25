import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class250 {

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "Z")
	public boolean aBoolean521;

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
	private int anInt7355;

	@OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
	private int anInt7357;

	@OriginalMember(owner = "client!raa", name = "k", descriptor = "Z")
	public boolean aBoolean522;

	@OriginalMember(owner = "client!raa", name = "l", descriptor = "I")
	private int anInt7360;

	@OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
	public int anInt7361;

	@OriginalMember(owner = "client!raa", name = "n", descriptor = "I")
	private int anInt7362;

	@OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
	public int anInt7363;

	@OriginalMember(owner = "client!raa", name = "p", descriptor = "Lclient!uca;")
	public Class5_Sub10 aClass5_Sub10_3;

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
	private int anInt7364;

	@OriginalMember(owner = "client!raa", name = "v", descriptor = "[S")
	public short[] aShortArray116;

	static {
		new Class40("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
	private Class250() {
		if (Static544.anIntArray200 == null) {
			Static362.method5534();
		}
		this.method5997();
	}

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lclient!qa;Lclient!co;I)V")
	public Class250(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class5_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (Static544.anIntArray200 == null) {
			Static362.method5534();
		}
		this.anInt7363 = arg1.method4220();
		this.aBoolean521 = (this.anInt7363 & 0x8) != 0;
		this.aBoolean522 = (this.anInt7363 & 0x10) != 0;
		this.anInt7363 &= 0x7;
		@Pc(47) int local47 = arg1.method4227() << arg2;
		@Pc(53) int local53 = arg1.method4227() << arg2;
		@Pc(59) int local59 = arg1.method4227() << arg2;
		@Pc(63) int local63 = arg1.method4220();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray116 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray116.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method4227();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local69 <= local86) {
				local86 = local69 - 1;
			}
			if (local69 - local86 < local90) {
				local90 = local69 - local86;
			}
			this.aShortArray116[local75] = (short) (local90 | local86 << 8);
		}
		local63 = (local63 << Static270.anInt5288) + Static261.anInt5167;
		@Pc(150) int local150 = Static444.anIntArray587 == null ? Static403.anIntArray560[Static153.method2803(arg1.method4227()) & 0xFFFF] : Static444.anIntArray587[arg1.method4227()];
		local86 = arg1.method4220();
		this.anInt7357 = (local86 & 0xE0) << 3;
		this.anInt7361 = local86 & 0x1F;
		if (this.anInt7361 != 31) {
			this.method5997();
		}
		this.method5994(local150, local63, arg0, local47, local59, local53);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IILclient!qa;IIII)V")
	private void method5994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass5_Sub10_3 = arg2.method6993(arg3, arg4, arg5, arg1, arg0, 1.0F);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIZ)V")
	public void method5996(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17;
		if (arg1) {
			local17 = 2048;
		} else {
			@Pc(31) int local31 = this.anInt7357 + this.anInt7355 * arg0 / 50 & 0x7FF;
			@Pc(34) int local34 = this.anInt7360;
			if (local34 == 1) {
				local17 = (Class5_Sub2_Sub16.anIntArray411[local31 << 3] >> 5) + 1024;
			} else if (local34 == 3) {
				local17 = Static544.anIntArray200[local31] >> 1;
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
		this.aClass5_Sub10_3.method5187((float) ((local17 * this.anInt7364 >> 11) + this.anInt7362) / 2048.0F);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
	private void method5997() {
		@Pc(9) int local9 = this.anInt7361;
		if (local9 == 2) {
			this.anInt7364 = 2048;
			this.anInt7362 = 0;
			this.anInt7355 = 2048;
			this.anInt7360 = 1;
		} else if (local9 == 3) {
			this.anInt7355 = 4096;
			this.anInt7362 = 0;
			this.anInt7360 = 1;
			this.anInt7364 = 2048;
		} else if (local9 == 4) {
			this.anInt7362 = 0;
			this.anInt7355 = 2048;
			this.anInt7364 = 2048;
			this.anInt7360 = 4;
		} else if (local9 == 5) {
			this.anInt7360 = 4;
			this.anInt7362 = 0;
			this.anInt7364 = 2048;
			this.anInt7355 = 8192;
		} else if (local9 == 12) {
			this.anInt7355 = 2048;
			this.anInt7362 = 0;
			this.anInt7364 = 2048;
			this.anInt7360 = 2;
		} else if (local9 == 13) {
			this.anInt7355 = 8192;
			this.anInt7360 = 2;
			this.anInt7362 = 0;
			this.anInt7364 = 2048;
		} else if (local9 == 10) {
			this.anInt7364 = 512;
			this.anInt7362 = 1536;
			this.anInt7360 = 3;
			this.anInt7355 = 2048;
		} else if (local9 == 11) {
			this.anInt7355 = 4096;
			this.anInt7364 = 512;
			this.anInt7360 = 3;
			this.anInt7362 = 1536;
		} else if (local9 == 6) {
			this.anInt7360 = 3;
			this.anInt7355 = 2048;
			this.anInt7362 = 1280;
			this.anInt7364 = 768;
		} else if (local9 == 7) {
			this.anInt7355 = 4096;
			this.anInt7362 = 1280;
			this.anInt7360 = 3;
			this.anInt7364 = 768;
		} else if (local9 == 8) {
			this.anInt7364 = 1024;
			this.anInt7362 = 1024;
			this.anInt7355 = 2048;
			this.anInt7360 = 3;
		} else if (local9 == 9) {
			this.anInt7362 = 1024;
			this.anInt7355 = 4096;
			this.anInt7364 = 1024;
			this.anInt7360 = 3;
		} else if (local9 == 14) {
			this.anInt7360 = 1;
			this.anInt7364 = 768;
			this.anInt7355 = 2048;
			this.anInt7362 = 1280;
		} else if (local9 == 15) {
			this.anInt7362 = 1536;
			this.anInt7355 = 4096;
			this.anInt7364 = 512;
			this.anInt7360 = 1;
		} else if (local9 == 16) {
			this.anInt7355 = 8192;
			this.anInt7360 = 1;
			this.anInt7364 = 256;
			this.anInt7362 = 1792;
		} else {
			this.anInt7355 = 2048;
			this.anInt7364 = 2048;
			this.anInt7362 = 0;
			this.anInt7360 = 0;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIIII)V")
	public void method5998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt7364 = arg3;
		this.anInt7362 = arg2;
		this.anInt7355 = arg1;
		this.anInt7360 = arg0;
	}
}
