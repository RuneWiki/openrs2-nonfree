import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class258 {

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Z")
	public boolean aBoolean552;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
	private int anInt6853;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "Lclient!ff;")
	public Class3_Sub22 aClass3_Sub22_2;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	public int anInt6855;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "[S")
	public short[] aShortArray224;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
	public int anInt6859;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
	private int anInt6860;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
	private int anInt6864;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
	private int anInt6865;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "Z")
	public boolean aBoolean553;

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
	private int anInt6867;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	private Class258() {
		if (Static488.anIntArray608 == null) {
			Static400.method5833();
		}
		this.method5867();
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!r;Lclient!qh;I)V")
	public Class258(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class3_Sub11 arg1, @OriginalArg(2) int arg2) {
		if (Static488.anIntArray608 == null) {
			Static400.method5833();
		}
		this.anInt6859 = arg1.method3118();
		this.aBoolean553 = (this.anInt6859 & 0x8) != 0;
		this.aBoolean552 = (this.anInt6859 & 0x10) != 0;
		this.anInt6859 &= 0x7;
		@Pc(44) int local44 = arg1.method3109() << arg2;
		@Pc(50) int local50 = arg1.method3109() << arg2;
		@Pc(56) int local56 = arg1.method3109() << arg2;
		@Pc(60) int local60 = arg1.method3118();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray224 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray224.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method3109();
			local83 = local79 >>> 8;
			if (local66 <= local83) {
				local83 = local66 - 1;
			}
			@Pc(94) int local94 = local79 & 0xFF;
			if (local66 - local83 < local94) {
				local94 = local66 - local83;
			}
			this.aShortArray224[local72] = (short) (local94 | local83 << 8);
		}
		local60 = Static122.anInt2780 + (local60 << Static458.anInt7508);
		@Pc(149) int local149 = Static213.anIntArray342 == null ? Static563.anIntArray661[Static440.method3643(arg1.method3109()) & 0xFFFF] : Static213.anIntArray342[arg1.method3109()];
		local83 = arg1.method3118();
		this.anInt6855 = local83 & 0x1F;
		this.anInt6865 = (local83 & 0xE0) << 3;
		if (this.anInt6855 != 31) {
			this.method5867();
		}
		this.method5864(local149, local50, arg0, local56, local44, local60);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZBI)V")
	public void method5863(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt6865 + arg1 * this.anInt6867 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt6860;
			if (local26 == 1) {
				local9 = (Class3_Sub17.anIntArray175[local23 << 3] >> 4) + 1024;
			} else if (local26 == 3) {
				local9 = Static488.anIntArray608[local23] >> 1;
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
		this.aClass3_Sub22_2.method6723((float) (this.anInt6864 + (local9 * this.anInt6853 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIILclient!r;III)V")
	private void method5864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class43 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub22_2 = arg2.method7164(arg4, arg3, arg1, arg5, arg0, 1.0F);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	private void method5867() {
		@Pc(4) int local4 = this.anInt6855;
		if (local4 == 2) {
			this.anInt6860 = 1;
			this.anInt6853 = 2048;
			this.anInt6864 = 0;
			this.anInt6867 = 2048;
		} else if (local4 == 3) {
			this.anInt6864 = 0;
			this.anInt6867 = 4096;
			this.anInt6860 = 1;
			this.anInt6853 = 2048;
		} else if (local4 == 4) {
			this.anInt6853 = 2048;
			this.anInt6867 = 2048;
			this.anInt6860 = 4;
			this.anInt6864 = 0;
		} else if (local4 == 5) {
			this.anInt6867 = 8192;
			this.anInt6860 = 4;
			this.anInt6864 = 0;
			this.anInt6853 = 2048;
		} else if (local4 == 12) {
			this.anInt6860 = 2;
			this.anInt6853 = 2048;
			this.anInt6867 = 2048;
			this.anInt6864 = 0;
		} else if (local4 == 13) {
			this.anInt6867 = 8192;
			this.anInt6864 = 0;
			this.anInt6860 = 2;
			this.anInt6853 = 2048;
		} else if (local4 == 10) {
			this.anInt6864 = 1536;
			this.anInt6853 = 512;
			this.anInt6867 = 2048;
			this.anInt6860 = 3;
		} else if (local4 == 11) {
			this.anInt6860 = 3;
			this.anInt6853 = 512;
			this.anInt6867 = 4096;
			this.anInt6864 = 1536;
		} else if (local4 == 6) {
			this.anInt6867 = 2048;
			this.anInt6853 = 768;
			this.anInt6860 = 3;
			this.anInt6864 = 1280;
		} else if (local4 == 7) {
			this.anInt6853 = 768;
			this.anInt6860 = 3;
			this.anInt6864 = 1280;
			this.anInt6867 = 4096;
		} else if (local4 == 8) {
			this.anInt6864 = 1024;
			this.anInt6853 = 1024;
			this.anInt6867 = 2048;
			this.anInt6860 = 3;
		} else if (local4 == 9) {
			this.anInt6867 = 4096;
			this.anInt6864 = 1024;
			this.anInt6860 = 3;
			this.anInt6853 = 1024;
		} else if (local4 == 14) {
			this.anInt6853 = 768;
			this.anInt6867 = 2048;
			this.anInt6864 = 1280;
			this.anInt6860 = 1;
		} else if (local4 == 15) {
			this.anInt6867 = 4096;
			this.anInt6853 = 512;
			this.anInt6864 = 1536;
			this.anInt6860 = 1;
		} else if (local4 == 16) {
			this.anInt6853 = 256;
			this.anInt6867 = 8192;
			this.anInt6864 = 1792;
			this.anInt6860 = 1;
		} else {
			this.anInt6853 = 2048;
			this.anInt6864 = 0;
			this.anInt6867 = 2048;
			this.anInt6860 = 0;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBII)V")
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt6867 = arg0;
		this.anInt6864 = arg2;
		this.anInt6860 = arg1;
		this.anInt6853 = arg3;
	}
}
