import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class168 {

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
	public int anInt4872;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Z")
	public boolean aBoolean417;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	private int anInt4877;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	private int anInt4878;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
	private int anInt4879;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Z")
	public boolean aBoolean418;

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
	private int anInt4880;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	private int anInt4883;

	@OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
	public int anInt4886;

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "Lclient!or;")
	public Class2_Sub7 aClass2_Sub7_2;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	private Class168() {
		if (Static179.anIntArray432 == null) {
			Static166.method2608();
		}
		this.method3937();
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!qa;Lclient!md;I)V")
	public Class168(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class2_Sub20 arg1, @OriginalArg(2) int arg2) {
		if (Static179.anIntArray432 == null) {
			Static166.method2608();
		}
		this.anInt4872 = arg1.method3737();
		this.aBoolean418 = (this.anInt4872 & 0x10) != 0;
		this.aBoolean417 = (this.anInt4872 & 0x8) != 0;
		this.anInt4872 &= 0x7;
		@Pc(47) int local47 = arg1.method3711() << arg2;
		@Pc(53) int local53 = arg1.method3711() << arg2;
		@Pc(59) int local59 = arg1.method3711() << arg2;
		@Pc(63) int local63 = arg1.method3737();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray54 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray54.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method3711();
			local86 = local82 >>> 8;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			@Pc(101) int local101 = local82 & 0xFF;
			if (local101 > local69 - local86) {
				local101 = local69 - local86;
			}
			this.aShortArray54[local75] = (short) (local101 | local86 << 8);
		}
		local63 = (local63 << Static250.anInt4056) + Static176.anInt3421;
		@Pc(156) int local156 = Static130.anIntArray144 == null ? Static413.anIntArray484[Static17.method243(arg1.method3711()) & 0xFFFF] : Static130.anIntArray144[arg1.method3711()];
		local86 = arg1.method3737();
		this.anInt4879 = (local86 & 0xE0) << 3;
		this.anInt4886 = local86 & 0x1F;
		if (this.anInt4886 != 31) {
			this.method3937();
		}
		this.method3936(local47, local59, local53, local63, local156, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
	public void method3935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4878 = arg2;
		this.anInt4877 = arg0;
		this.anInt4880 = arg3;
		this.anInt4883 = arg1;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIBIILclient!qa;)V")
	private void method3936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class26 arg5) {
		this.aClass2_Sub7_2 = arg5.method2275(arg0, arg1, arg2, arg3, arg4, 1.0F);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	private void method3937() {
		@Pc(8) int local8 = this.anInt4886;
		if (local8 == 2) {
			this.anInt4878 = 2048;
			this.anInt4880 = 0;
			this.anInt4877 = 2048;
			this.anInt4883 = 1;
		} else if (local8 == 3) {
			this.anInt4883 = 1;
			this.anInt4877 = 2048;
			this.anInt4878 = 4096;
			this.anInt4880 = 0;
		} else if (local8 == 4) {
			this.anInt4880 = 0;
			this.anInt4877 = 2048;
			this.anInt4878 = 2048;
			this.anInt4883 = 4;
		} else if (local8 == 5) {
			this.anInt4878 = 8192;
			this.anInt4877 = 2048;
			this.anInt4883 = 4;
			this.anInt4880 = 0;
		} else if (local8 == 12) {
			this.anInt4880 = 0;
			this.anInt4878 = 2048;
			this.anInt4883 = 2;
			this.anInt4877 = 2048;
		} else if (local8 == 13) {
			this.anInt4883 = 2;
			this.anInt4877 = 2048;
			this.anInt4880 = 0;
			this.anInt4878 = 8192;
		} else if (local8 == 10) {
			this.anInt4880 = 1536;
			this.anInt4877 = 512;
			this.anInt4878 = 2048;
			this.anInt4883 = 3;
		} else if (local8 == 11) {
			this.anInt4880 = 1536;
			this.anInt4878 = 4096;
			this.anInt4877 = 512;
			this.anInt4883 = 3;
		} else if (local8 == 6) {
			this.anInt4880 = 1280;
			this.anInt4883 = 3;
			this.anInt4878 = 2048;
			this.anInt4877 = 768;
		} else if (local8 == 7) {
			this.anInt4877 = 768;
			this.anInt4880 = 1280;
			this.anInt4883 = 3;
			this.anInt4878 = 4096;
		} else if (local8 == 8) {
			this.anInt4880 = 1024;
			this.anInt4877 = 1024;
			this.anInt4883 = 3;
			this.anInt4878 = 2048;
		} else if (local8 == 9) {
			this.anInt4880 = 1024;
			this.anInt4878 = 4096;
			this.anInt4883 = 3;
			this.anInt4877 = 1024;
		} else if (local8 == 14) {
			this.anInt4883 = 1;
			this.anInt4878 = 2048;
			this.anInt4880 = 1280;
			this.anInt4877 = 768;
		} else if (local8 == 15) {
			this.anInt4880 = 1536;
			this.anInt4883 = 1;
			this.anInt4877 = 512;
			this.anInt4878 = 4096;
		} else if (local8 == 16) {
			this.anInt4883 = 1;
			this.anInt4877 = 256;
			this.anInt4878 = 8192;
			this.anInt4880 = 1792;
		} else {
			this.anInt4880 = 0;
			this.anInt4877 = 2048;
			this.anInt4878 = 2048;
			this.anInt4883 = 0;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZI)V")
	public void method3941(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(59) int local59;
		if (arg0) {
			local59 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt4878 * arg1 / 50 + this.anInt4879 & 0x7FF;
			@Pc(26) int local26 = this.anInt4883;
			if (local26 == 1) {
				local59 = (Class184.anIntArray349[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local59 = Static179.anIntArray432[local23] >> 1;
			} else if (local26 == 4) {
				local59 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local59 = local23;
			} else if (local26 == 5) {
				local59 = (local23 >= 1024 ? 2048 - local23 : local23) << 1;
			} else {
				local59 = 2048;
			}
		}
		this.aClass2_Sub7_2.method2995((float) ((this.anInt4877 * local59 >> 11) + this.anInt4880) / 2048.0F);
	}
}
