import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class54 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
	private int anInt1652;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "Z")
	public boolean aBoolean133;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public int anInt1653;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!ve;")
	public Class3_Sub23 aClass3_Sub23_1;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
	public int anInt1656;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "[S")
	public short[] aShortArray19;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
	private int anInt1658;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
	private int anInt1659;

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
	private int anInt1660;

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
	private int anInt1661;

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Z")
	public boolean aBoolean134;

	static {
		new Class175("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	private Class54() {
		if (Static278.anIntArray493 == null) {
			Static115.method2113();
		}
		this.method1352();
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!qa;Lclient!bt;I)V")
	public Class54(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class3_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (Static278.anIntArray493 == null) {
			Static115.method2113();
		}
		this.anInt1656 = arg1.method6053();
		this.aBoolean133 = (this.anInt1656 & 0x8) != 0;
		this.aBoolean134 = (this.anInt1656 & 0x10) != 0;
		this.anInt1656 &= 0x7;
		@Pc(44) int local44 = arg1.method6004() << arg2;
		@Pc(50) int local50 = arg1.method6004() << arg2;
		@Pc(56) int local56 = arg1.method6004() << arg2;
		@Pc(60) int local60 = arg1.method6053();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray19 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray19.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method6004();
			local83 = local79 >>> 8;
			@Pc(87) int local87 = local79 & 0xFF;
			if (local83 >= local66) {
				local83 = local66 - 1;
			}
			if (local87 > local66 - local83) {
				local87 = local66 - local83;
			}
			this.aShortArray19[local72] = (short) (local83 << 8 | local87);
		}
		local60 = Static340.anInt6290 + (local60 << Static287.anInt5248);
		@Pc(145) int local145 = Static168.anIntArray264 == null ? Static351.anIntArray458[Static159.method2740(arg1.method6004()) & 0xFFFF] : Static168.anIntArray264[arg1.method6004()];
		local83 = arg1.method6053();
		this.anInt1653 = local83 & 0x1F;
		this.anInt1661 = (local83 & 0xE0) << 3;
		if (this.anInt1653 != 31) {
			this.method1352();
		}
		this.method1356(arg0, local50, local60, local44, local56, local145);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
	private void method1352() {
		@Pc(10) int local10 = this.anInt1653;
		if (local10 == 2) {
			this.anInt1652 = 2048;
			this.anInt1659 = 1;
			this.anInt1658 = 0;
			this.anInt1660 = 2048;
		} else if (local10 == 3) {
			this.anInt1652 = 2048;
			this.anInt1658 = 0;
			this.anInt1660 = 4096;
			this.anInt1659 = 1;
		} else if (local10 == 4) {
			this.anInt1660 = 2048;
			this.anInt1659 = 4;
			this.anInt1652 = 2048;
			this.anInt1658 = 0;
		} else if (local10 == 5) {
			this.anInt1652 = 2048;
			this.anInt1659 = 4;
			this.anInt1658 = 0;
			this.anInt1660 = 8192;
		} else if (local10 == 12) {
			this.anInt1659 = 2;
			this.anInt1660 = 2048;
			this.anInt1652 = 2048;
			this.anInt1658 = 0;
		} else if (local10 == 13) {
			this.anInt1659 = 2;
			this.anInt1658 = 0;
			this.anInt1652 = 2048;
			this.anInt1660 = 8192;
		} else if (local10 == 10) {
			this.anInt1658 = 1536;
			this.anInt1652 = 512;
			this.anInt1659 = 3;
			this.anInt1660 = 2048;
		} else if (local10 == 11) {
			this.anInt1658 = 1536;
			this.anInt1660 = 4096;
			this.anInt1659 = 3;
			this.anInt1652 = 512;
		} else if (local10 == 6) {
			this.anInt1658 = 1280;
			this.anInt1659 = 3;
			this.anInt1660 = 2048;
			this.anInt1652 = 768;
		} else if (local10 == 7) {
			this.anInt1652 = 768;
			this.anInt1658 = 1280;
			this.anInt1659 = 3;
			this.anInt1660 = 4096;
		} else if (local10 == 8) {
			this.anInt1652 = 1024;
			this.anInt1658 = 1024;
			this.anInt1660 = 2048;
			this.anInt1659 = 3;
		} else if (local10 == 9) {
			this.anInt1659 = 3;
			this.anInt1658 = 1024;
			this.anInt1660 = 4096;
			this.anInt1652 = 1024;
		} else if (local10 == 14) {
			this.anInt1660 = 2048;
			this.anInt1659 = 1;
			this.anInt1658 = 1280;
			this.anInt1652 = 768;
		} else if (local10 == 15) {
			this.anInt1658 = 1536;
			this.anInt1659 = 1;
			this.anInt1652 = 512;
			this.anInt1660 = 4096;
		} else if (local10 == 16) {
			this.anInt1659 = 1;
			this.anInt1658 = 1792;
			this.anInt1652 = 256;
			this.anInt1660 = 8192;
		} else {
			this.anInt1652 = 2048;
			this.anInt1659 = 0;
			this.anInt1660 = 2048;
			this.anInt1658 = 0;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZI)V")
	public void method1353(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(60) int local60;
		if (arg1) {
			local60 = 2048;
		} else {
			@Pc(26) int local26 = this.anInt1661 + arg0 * this.anInt1660 / 50 & 0x7FF;
			@Pc(29) int local29 = this.anInt1659;
			if (local29 == 1) {
				local60 = (Applet_Sub1.anIntArray85[local26 << 3] >> 5) + 1024;
			} else if (local29 == 3) {
				local60 = Static278.anIntArray493[local26] >> 1;
			} else if (local29 == 4) {
				local60 = local26 >> 10 << 11;
			} else if (local29 == 2) {
				local60 = local26;
			} else if (local29 == 5) {
				local60 = (local26 < 1024 ? local26 : 2048 - local26) << 1;
			} else {
				local60 = 2048;
			}
		}
		this.aClass3_Sub23_1.method3672((float) ((local60 * this.anInt1652 >> 11) + this.anInt1658) / 2048.0F);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!qa;IBIIII)V")
	private void method1356(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub23_1 = arg0.method2604(arg3, arg4, arg1, arg2, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBIII)V")
	public void method1357(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1658 = arg0;
		this.anInt1659 = arg3;
		this.anInt1660 = arg1;
		this.anInt1652 = arg2;
	}
}
