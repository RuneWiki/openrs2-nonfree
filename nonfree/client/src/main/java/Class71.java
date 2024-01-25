import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class71 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "I")
	private int anInt1809;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "I")
	private int anInt1812;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "[S")
	public short[] aShortArray30;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "I")
	private int anInt1816;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "I")
	public int anInt1818;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "I")
	private int anInt1819;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "Lclient!kt;")
	public Class1_Sub24 aClass1_Sub24_1;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "I")
	public int anInt1820;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "I")
	private int anInt1821;

	@OriginalMember(owner = "client!et", name = "r", descriptor = "Z")
	public boolean aBoolean134;

	@OriginalMember(owner = "client!et", name = "u", descriptor = "Z")
	public boolean aBoolean135;

	static {
		new Class151("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
	private Class71() {
		if (Static379.anIntArray387 == null) {
			Static108.method1520();
		}
		this.method1468();
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!qa;Lclient!dh;I)V")
	public Class71(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class1_Sub11 arg1, @OriginalArg(2) int arg2) {
		if (Static379.anIntArray387 == null) {
			Static108.method1520();
		}
		this.anInt1818 = arg1.method4463();
		this.aBoolean135 = (this.anInt1818 & 0x8) != 0;
		this.aBoolean134 = (this.anInt1818 & 0x10) != 0;
		this.anInt1818 &= 0x7;
		@Pc(44) int local44 = arg1.method4485() << arg2;
		@Pc(50) int local50 = arg1.method4485() << arg2;
		@Pc(56) int local56 = arg1.method4485() << arg2;
		@Pc(60) int local60 = arg1.method4463();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray30 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray30.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method4485();
			local83 = local79 >>> 8;
			if (local66 <= local83) {
				local83 = local66 - 1;
			}
			@Pc(94) int local94 = local79 & 0xFF;
			if (local94 > local66 - local83) {
				local94 = local66 - local83;
			}
			this.aShortArray30[local72] = (short) (local94 | local83 << 8);
		}
		local60 = (local60 << Static384.anInt6381) + Static188.anInt3025;
		@Pc(149) int local149 = Static55.anIntArray48 == null ? Static250.anIntArray40[Static167.method2264(arg1.method4485()) & 0xFFFF] : Static55.anIntArray48[arg1.method4485()];
		local83 = arg1.method4463();
		this.anInt1820 = local83 & 0x1F;
		this.anInt1819 = (local83 & 0xE0) << 3;
		if (this.anInt1820 != 31) {
			this.method1468();
		}
		this.method1471(arg0, local50, local56, local149, local60, local44);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	private void method1468() {
		@Pc(8) int local8 = this.anInt1820;
		if (local8 == 2) {
			this.anInt1821 = 2048;
			this.anInt1809 = 2048;
			this.anInt1816 = 0;
			this.anInt1812 = 1;
		} else if (local8 == 3) {
			this.anInt1809 = 2048;
			this.anInt1812 = 1;
			this.anInt1821 = 4096;
			this.anInt1816 = 0;
		} else if (local8 == 4) {
			this.anInt1816 = 0;
			this.anInt1812 = 4;
			this.anInt1821 = 2048;
			this.anInt1809 = 2048;
		} else if (local8 == 5) {
			this.anInt1809 = 2048;
			this.anInt1816 = 0;
			this.anInt1812 = 4;
			this.anInt1821 = 8192;
		} else if (local8 == 12) {
			this.anInt1821 = 2048;
			this.anInt1816 = 0;
			this.anInt1809 = 2048;
			this.anInt1812 = 2;
		} else if (local8 == 13) {
			this.anInt1816 = 0;
			this.anInt1809 = 2048;
			this.anInt1812 = 2;
			this.anInt1821 = 8192;
		} else if (local8 == 10) {
			this.anInt1816 = 1536;
			this.anInt1809 = 512;
			this.anInt1812 = 3;
			this.anInt1821 = 2048;
		} else if (local8 == 11) {
			this.anInt1816 = 1536;
			this.anInt1812 = 3;
			this.anInt1821 = 4096;
			this.anInt1809 = 512;
		} else if (local8 == 6) {
			this.anInt1816 = 1280;
			this.anInt1809 = 768;
			this.anInt1821 = 2048;
			this.anInt1812 = 3;
		} else if (local8 == 7) {
			this.anInt1812 = 3;
			this.anInt1816 = 1280;
			this.anInt1821 = 4096;
			this.anInt1809 = 768;
		} else if (local8 == 8) {
			this.anInt1809 = 1024;
			this.anInt1821 = 2048;
			this.anInt1812 = 3;
			this.anInt1816 = 1024;
		} else if (local8 == 9) {
			this.anInt1812 = 3;
			this.anInt1809 = 1024;
			this.anInt1816 = 1024;
			this.anInt1821 = 4096;
		} else if (local8 == 14) {
			this.anInt1821 = 2048;
			this.anInt1809 = 768;
			this.anInt1816 = 1280;
			this.anInt1812 = 1;
		} else if (local8 == 15) {
			this.anInt1809 = 512;
			this.anInt1821 = 4096;
			this.anInt1816 = 1536;
			this.anInt1812 = 1;
		} else if (local8 == 16) {
			this.anInt1816 = 1792;
			this.anInt1821 = 8192;
			this.anInt1809 = 256;
			this.anInt1812 = 1;
		} else {
			this.anInt1816 = 0;
			this.anInt1821 = 2048;
			this.anInt1812 = 0;
			this.anInt1809 = 2048;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!qa;IBIIII)V")
	private void method1471(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass1_Sub24_1 = arg0.method3577(arg5, arg2, arg1, arg4, arg3, 1.0F);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIII)V")
	public void method1473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1816 = arg1;
		this.anInt1821 = arg0;
		this.anInt1809 = arg2;
		this.anInt1812 = arg3;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IZI)V")
	public void method1474(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt1821 * arg1 / 50 + this.anInt1819 & 0x7FF;
			@Pc(26) int local26 = this.anInt1812;
			if (local26 == 1) {
				local9 = (Class1_Sub1_Sub25.anIntArray249[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local9 = Static379.anIntArray387[local23] >> 1;
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
		this.aClass1_Sub24_1.method4372((float) (this.anInt1816 + (this.anInt1809 * local9 >> 11)) / 2048.0F);
	}
}
