import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class153 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	private int anInt4675;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	private int anInt4676;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	public int anInt4678;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	public int anInt4679;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	private int anInt4680;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "I")
	private int anInt4681;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Z")
	public boolean aBoolean306;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "I")
	private int anInt4683;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Lclient!ni;")
	public Class4_Sub17 aClass4_Sub17_2;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	private Class153() {
		if (Static445.anIntArray607 == null) {
			Static279.method4404();
		}
		this.method3997();
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!qa;Lclient!wn;I)V")
	public Class153(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class4_Sub20 arg1, @OriginalArg(2) int arg2) {
		if (Static445.anIntArray607 == null) {
			Static279.method4404();
		}
		this.anInt4679 = arg1.method4614();
		this.aBoolean306 = (this.anInt4679 & 0x8) != 0;
		this.aBoolean307 = (this.anInt4679 & 0x10) != 0;
		this.anInt4679 &= 0x7;
		@Pc(47) int local47 = arg1.method4560() << arg2;
		@Pc(53) int local53 = arg1.method4560() << arg2;
		@Pc(59) int local59 = arg1.method4560() << arg2;
		@Pc(63) int local63 = arg1.method4614();
		@Pc(69) int local69 = local63 * 2 + 1;
		this.aShortArray74 = new short[local69];
		@Pc(86) int local86;
		for (@Pc(75) int local75 = 0; local75 < this.aShortArray74.length; local75++) {
			@Pc(82) short local82 = (short) arg1.method4560();
			local86 = local82 >>> 8;
			@Pc(90) int local90 = local82 & 0xFF;
			if (local86 >= local69) {
				local86 = local69 - 1;
			}
			if (local69 - local86 < local90) {
				local90 = local69 - local86;
			}
			this.aShortArray74[local75] = (short) (local86 << 8 | local90);
		}
		local63 = (local63 << Static391.anInt6797) + Static423.anInt7318;
		@Pc(148) int local148 = Static323.anIntArray198 == null ? Static107.anIntArray200[Static126.method2377(arg1.method4560()) & 0xFFFF] : Static323.anIntArray198[arg1.method4560()];
		local86 = arg1.method4614();
		this.anInt4678 = local86 & 0x1F;
		this.anInt4676 = (local86 & 0xE0) << 3;
		if (this.anInt4678 != 31) {
			this.method3997();
		}
		this.method3995(arg0, local47, local63, local59, local148, local53);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZB)V")
	public void method3993(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(64) int local64;
		if (arg1) {
			local64 = 2048;
		} else {
			@Pc(27) int local27 = arg0 * this.anInt4680 / 50 + this.anInt4676 & 0x7FF;
			@Pc(30) int local30 = this.anInt4683;
			if (local30 == 1) {
				local64 = (Class4_Sub13.anIntArray497[local27 << 3] >> 5) + 1024;
			} else if (local30 == 3) {
				local64 = Static445.anIntArray607[local27] >> 1;
			} else if (local30 == 4) {
				local64 = local27 >> 10 << 11;
			} else if (local30 == 2) {
				local64 = local27;
			} else if (local30 == 5) {
				local64 = (local27 >= 1024 ? 2048 - local27 : local27) << 1;
			} else {
				local64 = 2048;
			}
		}
		this.aClass4_Sub17_2.method6164((float) ((local64 * this.anInt4681 >> 11) + this.anInt4675) / 2048.0F);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!qa;IIBIII)V")
	private void method3995(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass4_Sub17_2 = arg0.method2087(arg1, arg3, arg5, arg2, arg4, 1.0F);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIB)V")
	public void method3996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4675 = arg2;
		this.anInt4680 = arg0;
		this.anInt4681 = arg1;
		this.anInt4683 = arg3;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	private void method3997() {
		@Pc(10) int local10 = this.anInt4678;
		if (local10 == 2) {
			this.anInt4680 = 2048;
			this.anInt4683 = 1;
			this.anInt4681 = 2048;
			this.anInt4675 = 0;
		} else if (local10 == 3) {
			this.anInt4683 = 1;
			this.anInt4675 = 0;
			this.anInt4680 = 4096;
			this.anInt4681 = 2048;
		} else if (local10 == 4) {
			this.anInt4680 = 2048;
			this.anInt4681 = 2048;
			this.anInt4683 = 4;
			this.anInt4675 = 0;
		} else if (local10 == 5) {
			this.anInt4683 = 4;
			this.anInt4681 = 2048;
			this.anInt4680 = 8192;
			this.anInt4675 = 0;
		} else if (local10 == 12) {
			this.anInt4681 = 2048;
			this.anInt4683 = 2;
			this.anInt4680 = 2048;
			this.anInt4675 = 0;
		} else if (local10 == 13) {
			this.anInt4683 = 2;
			this.anInt4681 = 2048;
			this.anInt4680 = 8192;
			this.anInt4675 = 0;
		} else if (local10 == 10) {
			this.anInt4675 = 1536;
			this.anInt4680 = 2048;
			this.anInt4681 = 512;
			this.anInt4683 = 3;
		} else if (local10 == 11) {
			this.anInt4675 = 1536;
			this.anInt4683 = 3;
			this.anInt4681 = 512;
			this.anInt4680 = 4096;
		} else if (local10 == 6) {
			this.anInt4675 = 1280;
			this.anInt4683 = 3;
			this.anInt4681 = 768;
			this.anInt4680 = 2048;
		} else if (local10 == 7) {
			this.anInt4675 = 1280;
			this.anInt4680 = 4096;
			this.anInt4681 = 768;
			this.anInt4683 = 3;
		} else if (local10 == 8) {
			this.anInt4683 = 3;
			this.anInt4681 = 1024;
			this.anInt4680 = 2048;
			this.anInt4675 = 1024;
		} else if (local10 == 9) {
			this.anInt4680 = 4096;
			this.anInt4683 = 3;
			this.anInt4681 = 1024;
			this.anInt4675 = 1024;
		} else if (local10 == 14) {
			this.anInt4675 = 1280;
			this.anInt4681 = 768;
			this.anInt4680 = 2048;
			this.anInt4683 = 1;
		} else if (local10 == 15) {
			this.anInt4683 = 1;
			this.anInt4681 = 512;
			this.anInt4680 = 4096;
			this.anInt4675 = 1536;
		} else if (local10 == 16) {
			this.anInt4683 = 1;
			this.anInt4681 = 256;
			this.anInt4675 = 1792;
			this.anInt4680 = 8192;
		} else {
			this.anInt4681 = 2048;
			this.anInt4680 = 2048;
			this.anInt4683 = 0;
			this.anInt4675 = 0;
		}
	}
}
