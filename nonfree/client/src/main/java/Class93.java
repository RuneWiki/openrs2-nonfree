import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class93 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
	private int anInt2071;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	private int anInt2075;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	public int anInt2077;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	private int anInt2078;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
	public int anInt2079;

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
	private int anInt2080;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "Z")
	public boolean aBoolean222;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Z")
	public boolean aBoolean223;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
	private int anInt2083;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "Lclient!ls;")
	public Class1_Sub29 aClass1_Sub29_2;

	@OriginalMember(owner = "client!gh", name = "t", descriptor = "[S")
	public short[] aShortArray29;

	static {
		new Class142("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	private Class93() {
		if (Static290.anIntArray367 == null) {
			Static413.method5273();
		}
		this.method1703();
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!za;Lclient!wm;I)V")
	public Class93(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class1_Sub19 arg1, @OriginalArg(2) int arg2) {
		if (Static290.anIntArray367 == null) {
			Static413.method5273();
		}
		this.anInt2079 = arg1.method2915();
		this.aBoolean222 = (this.anInt2079 & 0x10) != 0;
		this.aBoolean223 = (this.anInt2079 & 0x8) != 0;
		this.anInt2079 &= 0x7;
		@Pc(47) int local47 = arg1.method2896() << arg2;
		@Pc(53) int local53 = arg1.method2896() << arg2;
		@Pc(59) int local59 = arg1.method2896() << arg2;
		@Pc(63) int local63 = arg1.method2915();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray29 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray29.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method2896();
			local86 = local82 >>> 8;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			@Pc(97) int local97 = local82 & 0xFF;
			if (local69 - local86 < local97) {
				local97 = local69 - local86;
			}
			this.aShortArray29[local75] = (short) (local97 | local86 << 8);
		}
		local63 = Static324.anInt5325 + (local63 << Static41.anInt612);
		@Pc(151) int local151 = Static134.anIntArray182 == null ? Static244.anIntArray44[Static358.method5263(arg1.method2896()) & 0xFFFF] : Static134.anIntArray182[arg1.method2896()];
		local86 = arg1.method2915();
		this.anInt2077 = local86 & 0x1F;
		this.anInt2080 = (local86 & 0xE0) << 3;
		if (this.anInt2077 != 31) {
			this.method1703();
		}
		this.method1704(local47, local151, arg0, local59, local53, local63);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	private void method1703() {
		@Pc(8) int local8 = this.anInt2077;
		if (local8 == 2) {
			this.anInt2071 = 2048;
			this.anInt2075 = 2048;
			this.anInt2078 = 0;
			this.anInt2083 = 1;
		} else if (local8 == 3) {
			this.anInt2083 = 1;
			this.anInt2075 = 2048;
			this.anInt2078 = 0;
			this.anInt2071 = 4096;
		} else if (local8 == 4) {
			this.anInt2083 = 4;
			this.anInt2071 = 2048;
			this.anInt2075 = 2048;
			this.anInt2078 = 0;
		} else if (local8 == 5) {
			this.anInt2071 = 8192;
			this.anInt2075 = 2048;
			this.anInt2083 = 4;
			this.anInt2078 = 0;
		} else if (local8 == 12) {
			this.anInt2075 = 2048;
			this.anInt2078 = 0;
			this.anInt2083 = 2;
			this.anInt2071 = 2048;
		} else if (local8 == 13) {
			this.anInt2078 = 0;
			this.anInt2075 = 2048;
			this.anInt2083 = 2;
			this.anInt2071 = 8192;
		} else if (local8 == 10) {
			this.anInt2075 = 512;
			this.anInt2071 = 2048;
			this.anInt2078 = 1536;
			this.anInt2083 = 3;
		} else if (local8 == 11) {
			this.anInt2078 = 1536;
			this.anInt2075 = 512;
			this.anInt2083 = 3;
			this.anInt2071 = 4096;
		} else if (local8 == 6) {
			this.anInt2075 = 768;
			this.anInt2078 = 1280;
			this.anInt2083 = 3;
			this.anInt2071 = 2048;
		} else if (local8 == 7) {
			this.anInt2078 = 1280;
			this.anInt2083 = 3;
			this.anInt2075 = 768;
			this.anInt2071 = 4096;
		} else if (local8 == 8) {
			this.anInt2075 = 1024;
			this.anInt2078 = 1024;
			this.anInt2083 = 3;
			this.anInt2071 = 2048;
		} else if (local8 == 9) {
			this.anInt2075 = 1024;
			this.anInt2078 = 1024;
			this.anInt2083 = 3;
			this.anInt2071 = 4096;
		} else if (local8 == 14) {
			this.anInt2083 = 1;
			this.anInt2071 = 2048;
			this.anInt2075 = 768;
			this.anInt2078 = 1280;
		} else if (local8 == 15) {
			this.anInt2078 = 1536;
			this.anInt2071 = 4096;
			this.anInt2075 = 512;
			this.anInt2083 = 1;
		} else if (local8 == 16) {
			this.anInt2083 = 1;
			this.anInt2071 = 8192;
			this.anInt2075 = 256;
			this.anInt2078 = 1792;
		} else {
			this.anInt2071 = 2048;
			this.anInt2075 = 2048;
			this.anInt2078 = 0;
			this.anInt2083 = 0;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILclient!za;IIII)V")
	private void method1704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass1_Sub29_2 = arg2.method5719(arg0, arg3, arg4, arg5, arg1, 1.0F);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIII)V")
	public void method1705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2078 = arg3;
		this.anInt2071 = arg0;
		this.anInt2075 = arg2;
		this.anInt2083 = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZII)V")
	public void method1707(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(61) int local61;
		if (arg0) {
			local61 = 2048;
		} else {
			@Pc(27) int local27 = this.anInt2080 + this.anInt2071 * arg1 / 50 & 0x7FF;
			@Pc(30) int local30 = this.anInt2083;
			if (local30 == 1) {
				local61 = (Class1_Sub29.anIntArray537[local27 << 3] >> 5) + 1024;
			} else if (local30 == 3) {
				local61 = Static290.anIntArray367[local27] >> 1;
			} else if (local30 == 4) {
				local61 = local27 >> 10 << 11;
			} else if (local30 == 2) {
				local61 = local27;
			} else if (local30 == 5) {
				local61 = (local27 < 1024 ? local27 : 2048 - local27) << 1;
			} else {
				local61 = 2048;
			}
		}
		this.aClass1_Sub29_2.method5842((float) ((local61 * this.anInt2075 >> 11) + this.anInt2078) / 2048.0F);
	}
}
