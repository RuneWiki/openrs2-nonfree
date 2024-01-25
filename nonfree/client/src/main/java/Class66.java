import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class66 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	private int anInt1653;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "Z")
	public boolean aBoolean140;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!ki;")
	public Class6_Sub6 aClass6_Sub6_1;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	private int anInt1656;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
	private int anInt1657;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
	private int anInt1659;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
	public int anInt1662;

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
	private int anInt1665;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "[S")
	public short[] aShortArray29;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
	public int anInt1666;

	@OriginalMember(owner = "client!eh", name = "v", descriptor = "Z")
	public boolean aBoolean141;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	private Class66() {
		if (Static449.anIntArray638 == null) {
			Static181.method2812();
		}
		this.method1547();
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!qq;Lclient!ha;I)V")
	public Class66(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class6_Sub15 arg1, @OriginalArg(2) int arg2) {
		if (Static449.anIntArray638 == null) {
			Static181.method2812();
		}
		this.anInt1662 = arg1.method3111();
		this.aBoolean140 = (this.anInt1662 & 0x8) != 0;
		this.aBoolean141 = (this.anInt1662 & 0x10) != 0;
		this.anInt1662 &= 0x7;
		@Pc(47) int local47 = arg1.method3108() << arg2;
		@Pc(53) int local53 = arg1.method3108() << arg2;
		@Pc(59) int local59 = arg1.method3108() << arg2;
		@Pc(63) int local63 = arg1.method3111();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray29 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray29.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method3108();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			if (local90 > local69 - local86) {
				local90 = local69 - local86;
			}
			this.aShortArray29[local75] = (short) (local90 | local86 << 8);
		}
		local63 = Static25.anInt7191 + (local63 << Static301.anInt2759);
		@Pc(147) int local147 = Static245.anIntArray376 == null ? Static92.anIntArray184[Static126.method4051(arg1.method3108()) & 0xFFFF] : Static245.anIntArray376[arg1.method3108()];
		local86 = arg1.method3111();
		this.anInt1656 = (local86 & 0xE0) << 3;
		this.anInt1666 = local86 & 0x1F;
		if (this.anInt1666 != 31) {
			this.method1547();
		}
		this.method1554(local53, local147, local47, local59, arg0, local63);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	private void method1547() {
		@Pc(10) int local10 = this.anInt1666;
		if (local10 == 2) {
			this.anInt1659 = 0;
			this.anInt1657 = 1;
			this.anInt1665 = 2048;
			this.anInt1653 = 2048;
		} else if (local10 == 3) {
			this.anInt1657 = 1;
			this.anInt1659 = 0;
			this.anInt1653 = 4096;
			this.anInt1665 = 2048;
		} else if (local10 == 4) {
			this.anInt1665 = 2048;
			this.anInt1653 = 2048;
			this.anInt1657 = 4;
			this.anInt1659 = 0;
		} else if (local10 == 5) {
			this.anInt1653 = 8192;
			this.anInt1657 = 4;
			this.anInt1659 = 0;
			this.anInt1665 = 2048;
		} else if (local10 == 12) {
			this.anInt1657 = 2;
			this.anInt1653 = 2048;
			this.anInt1665 = 2048;
			this.anInt1659 = 0;
		} else if (local10 == 13) {
			this.anInt1653 = 8192;
			this.anInt1665 = 2048;
			this.anInt1657 = 2;
			this.anInt1659 = 0;
		} else if (local10 == 10) {
			this.anInt1665 = 512;
			this.anInt1659 = 1536;
			this.anInt1653 = 2048;
			this.anInt1657 = 3;
		} else if (local10 == 11) {
			this.anInt1653 = 4096;
			this.anInt1657 = 3;
			this.anInt1665 = 512;
			this.anInt1659 = 1536;
		} else if (local10 == 6) {
			this.anInt1659 = 1280;
			this.anInt1657 = 3;
			this.anInt1653 = 2048;
			this.anInt1665 = 768;
		} else if (local10 == 7) {
			this.anInt1653 = 4096;
			this.anInt1659 = 1280;
			this.anInt1665 = 768;
			this.anInt1657 = 3;
		} else if (local10 == 8) {
			this.anInt1657 = 3;
			this.anInt1665 = 1024;
			this.anInt1653 = 2048;
			this.anInt1659 = 1024;
		} else if (local10 == 9) {
			this.anInt1659 = 1024;
			this.anInt1665 = 1024;
			this.anInt1653 = 4096;
			this.anInt1657 = 3;
		} else if (local10 == 14) {
			this.anInt1665 = 768;
			this.anInt1659 = 1280;
			this.anInt1657 = 1;
			this.anInt1653 = 2048;
		} else if (local10 == 15) {
			this.anInt1657 = 1;
			this.anInt1659 = 1536;
			this.anInt1665 = 512;
			this.anInt1653 = 4096;
		} else if (local10 == 16) {
			this.anInt1653 = 8192;
			this.anInt1665 = 256;
			this.anInt1657 = 1;
			this.anInt1659 = 1792;
		} else {
			this.anInt1653 = 2048;
			this.anInt1657 = 0;
			this.anInt1665 = 2048;
			this.anInt1659 = 0;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
	public void method1548(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt1653 = arg2;
		this.anInt1659 = arg1;
		this.anInt1657 = arg3;
		this.anInt1665 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIZ)V")
	public void method1552(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) int local14;
		if (arg1) {
			local14 = 2048;
		} else {
			@Pc(28) int local28 = arg0 * this.anInt1653 / 50 + this.anInt1656 & 0x7FF;
			@Pc(31) int local31 = this.anInt1657;
			if (local31 == 1) {
				local14 = (Class6_Sub1_Sub18.anIntArray642[local28 << 3] >> 5) + 1024;
			} else if (local31 == 3) {
				local14 = Static449.anIntArray638[local28] >> 1;
			} else if (local31 == 4) {
				local14 = local28 >> 10 << 11;
			} else if (local31 == 2) {
				local14 = local28;
			} else if (local31 == 5) {
				local14 = (local28 < 1024 ? local28 : 2048 - local28) << 1;
			} else {
				local14 = 2048;
			}
		}
		this.aClass6_Sub6_1.method1165((float) (this.anInt1659 + (this.anInt1665 * local14 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIILclient!qq;I)V")
	private void method1554(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class28 arg4, @OriginalArg(6) int arg5) {
		this.aClass6_Sub6_1 = arg4.method3482(arg2, arg3, arg0, arg5, arg1, 1.0F);
	}
}
