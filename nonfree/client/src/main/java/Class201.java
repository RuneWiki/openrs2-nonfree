import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class201 {

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Lclient!nm;")
	public Class1_Sub27 aClass1_Sub27_2;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
	private int anInt5977;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "Z")
	public boolean aBoolean409;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
	private int anInt5979;

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
	public int anInt5980;

	@OriginalMember(owner = "client!mw", name = "j", descriptor = "I")
	private int anInt5982;

	@OriginalMember(owner = "client!mw", name = "k", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
	private int anInt5983;

	@OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
	private int anInt5985;

	@OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
	public int anInt5986;

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "Z")
	public boolean aBoolean410;

	static {
		new Class114("Player ", "Spieler ", "Joueur ", "Jogador ");
	}

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V")
	private Class201() {
		if (Static13.anIntArray26 == null) {
			Static440.method2213();
		}
		this.method5159();
	}

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!qa;Lclient!gw;I)V")
	public Class201(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class1_Sub13 arg1, @OriginalArg(2) int arg2) {
		if (Static13.anIntArray26 == null) {
			Static440.method2213();
		}
		this.anInt5980 = arg1.method3043();
		this.aBoolean410 = (this.anInt5980 & 0x8) != 0;
		this.aBoolean409 = (this.anInt5980 & 0x10) != 0;
		this.anInt5980 &= 0x7;
		@Pc(42) int local42 = arg1.method3056() << arg2;
		@Pc(48) int local48 = arg1.method3056() << arg2;
		@Pc(54) int local54 = arg1.method3056() << arg2;
		@Pc(58) int local58 = arg1.method3043();
		@Pc(64) int local64 = local58 * 2 + 1;
		this.aShortArray110 = new short[local64];
		@Pc(80) int local80;
		for (@Pc(70) int local70 = 0; local70 < this.aShortArray110.length; local70++) {
			@Pc(76) short local76 = (short) arg1.method3056();
			local80 = local76 >>> 8;
			@Pc(84) int local84 = local76 & 0xFF;
			if (local80 >= local64) {
				local80 = local64 - 1;
			}
			if (local64 - local80 < local84) {
				local84 = local64 - local80;
			}
			this.aShortArray110[local70] = (short) (local80 << 8 | local84);
		}
		local58 = Static444.anInt7507 + (local58 << Static246.anInt4759);
		@Pc(149) int local149 = Static392.anIntArray516 == null ? Static180.anIntArray297[Static257.method7982(arg1.method3056()) & 0xFFFF] : Static392.anIntArray516[arg1.method3056()];
		local80 = arg1.method3043();
		this.anInt5986 = local80 & 0x1F;
		this.anInt5979 = (local80 & 0xE0) << 3;
		if (this.anInt5986 != 31) {
			this.method5159();
		}
		this.method5158(local42, local149, local48, arg0, local58, local54);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIILclient!qa;II)V")
	private void method5158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass1_Sub27_2 = arg3.method7616(arg0, arg5, arg2, arg4, arg1, 1.0F);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
	private void method5159() {
		@Pc(2) int local2 = this.anInt5986;
		if (local2 == 2) {
			this.anInt5982 = 2048;
			this.anInt5985 = 1;
			this.anInt5977 = 0;
			this.anInt5983 = 2048;
		} else if (local2 == 3) {
			this.anInt5985 = 1;
			this.anInt5977 = 0;
			this.anInt5983 = 2048;
			this.anInt5982 = 4096;
		} else if (local2 == 4) {
			this.anInt5982 = 2048;
			this.anInt5983 = 2048;
			this.anInt5977 = 0;
			this.anInt5985 = 4;
		} else if (local2 == 5) {
			this.anInt5983 = 2048;
			this.anInt5977 = 0;
			this.anInt5985 = 4;
			this.anInt5982 = 8192;
		} else if (local2 == 12) {
			this.anInt5983 = 2048;
			this.anInt5977 = 0;
			this.anInt5982 = 2048;
			this.anInt5985 = 2;
		} else if (local2 == 13) {
			this.anInt5985 = 2;
			this.anInt5983 = 2048;
			this.anInt5977 = 0;
			this.anInt5982 = 8192;
		} else if (local2 == 10) {
			this.anInt5985 = 3;
			this.anInt5982 = 2048;
			this.anInt5977 = 1536;
			this.anInt5983 = 512;
		} else if (local2 == 11) {
			this.anInt5977 = 1536;
			this.anInt5982 = 4096;
			this.anInt5985 = 3;
			this.anInt5983 = 512;
		} else if (local2 == 6) {
			this.anInt5985 = 3;
			this.anInt5983 = 768;
			this.anInt5977 = 1280;
			this.anInt5982 = 2048;
		} else if (local2 == 7) {
			this.anInt5982 = 4096;
			this.anInt5983 = 768;
			this.anInt5985 = 3;
			this.anInt5977 = 1280;
		} else if (local2 == 8) {
			this.anInt5982 = 2048;
			this.anInt5985 = 3;
			this.anInt5983 = 1024;
			this.anInt5977 = 1024;
		} else if (local2 == 9) {
			this.anInt5982 = 4096;
			this.anInt5977 = 1024;
			this.anInt5985 = 3;
			this.anInt5983 = 1024;
		} else if (local2 == 14) {
			this.anInt5983 = 768;
			this.anInt5985 = 1;
			this.anInt5982 = 2048;
			this.anInt5977 = 1280;
		} else if (local2 == 15) {
			this.anInt5985 = 1;
			this.anInt5983 = 512;
			this.anInt5977 = 1536;
			this.anInt5982 = 4096;
		} else if (local2 == 16) {
			this.anInt5983 = 256;
			this.anInt5977 = 1792;
			this.anInt5985 = 1;
			this.anInt5982 = 8192;
		} else {
			this.anInt5985 = 0;
			this.anInt5977 = 0;
			this.anInt5982 = 2048;
			this.anInt5983 = 2048;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIZ)V")
	public void method5161(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) int local13;
		if (arg1) {
			local13 = 2048;
		} else {
			@Pc(26) int local26 = this.anInt5979 + arg0 * this.anInt5982 / 50 & 0x7FF;
			@Pc(29) int local29 = this.anInt5985;
			if (local29 == 1) {
				local13 = (Class307.anIntArray744[local26 << 3] >> 5) + 1024;
			} else if (local29 == 3) {
				local13 = Static13.anIntArray26[local26] >> 1;
			} else if (local29 == 4) {
				local13 = local26 >> 10 << 11;
			} else if (local29 == 2) {
				local13 = local26;
			} else if (local29 == 5) {
				local13 = (local26 >= 1024 ? 2048 - local26 : local26) << 1;
			} else {
				local13 = 2048;
			}
		}
		this.aClass1_Sub27_2.method5494((float) (this.anInt5977 + (this.anInt5983 * local13 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIII)V")
	public void method5163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5983 = arg1;
		this.anInt5985 = arg3;
		this.anInt5982 = arg2;
		this.anInt5977 = arg0;
	}
}
