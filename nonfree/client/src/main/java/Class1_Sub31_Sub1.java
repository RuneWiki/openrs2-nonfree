import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class1_Sub31_Sub1 extends Class1_Sub31 {

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
	public int anInt4698;

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!pm", name = "G", descriptor = "I")
	private int anInt4701;

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
	private int anInt4705;

	@OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
	private int anInt4706;

	@OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
	public int anInt4707;

	@OriginalMember(owner = "client!pm", name = "P", descriptor = "Z")
	public boolean aBoolean394;

	@OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
	private int anInt4708;

	@OriginalMember(owner = "client!pm", name = "S", descriptor = "Z")
	public boolean aBoolean396;

	@OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
	private int anInt4709;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V")
	private Class1_Sub31_Sub1() {
		if (Static145.anIntArray334 == null) {
			Static325.method4281();
		}
		this.method4288();
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!eb;)V")
	public Class1_Sub31_Sub1(@OriginalArg(0) Class1_Sub7 arg0) {
		if (Static145.anIntArray334 == null) {
			Static325.method4281();
		}
		this.anInt4698 = arg0.method3141();
		this.aBoolean396 = (this.anInt4698 & 0x10) != 0;
		this.aBoolean394 = (this.anInt4698 & 0x8) != 0;
		this.anInt4698 &= 0x7;
		super.anInt4687 = arg0.method3115();
		super.anInt4693 = arg0.method3115();
		super.anInt4691 = arg0.method3115();
		super.anInt4688 = arg0.method3141();
		@Pc(71) int local71 = super.anInt4688 * 2 + 1;
		this.aShortArray76 = new short[local71];
		for (@Pc(77) int local77 = 0; local77 < this.aShortArray76.length; local77++) {
			@Pc(84) short local84 = (short) arg0.method3115();
			@Pc(88) int local88 = local84 >>> 8;
			@Pc(92) int local92 = local84 & 0xFF;
			if (local88 >= local71) {
				local88 = local71 - 1;
			}
			if (local92 > local71 - local88) {
				local92 = local71 - local88;
			}
			this.aShortArray76[local77] = (short) (local88 << 8 | local92);
		}
		super.anInt4688 = (super.anInt4688 << 7) + 64;
		if (Static56.anIntArray140 == null) {
			super.anInt4690 = Static220.anIntArray551[Static198.method3729(arg0.method3115()) & 0xFFFF];
		} else {
			super.anInt4690 = Static56.anIntArray140[arg0.method3115()];
		}
		@Pc(159) int local159 = arg0.method3141();
		this.anInt4709 = (local159 & 0xE0) << 3;
		this.anInt4707 = local159 & 0x1F;
		if (this.anInt4707 != 31) {
			this.method4288();
		}
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V")
	private void method4288() {
		@Pc(10) int local10 = this.anInt4707;
		if (local10 == 2) {
			this.anInt4708 = 2048;
			this.anInt4705 = 2048;
			this.anInt4701 = 0;
			this.anInt4706 = 1;
		} else if (local10 == 3) {
			this.anInt4701 = 0;
			this.anInt4706 = 1;
			this.anInt4705 = 2048;
			this.anInt4708 = 4096;
		} else if (local10 == 4) {
			this.anInt4701 = 0;
			this.anInt4705 = 2048;
			this.anInt4708 = 2048;
			this.anInt4706 = 4;
		} else if (local10 == 5) {
			this.anInt4705 = 2048;
			this.anInt4708 = 8192;
			this.anInt4701 = 0;
			this.anInt4706 = 4;
		} else if (local10 == 12) {
			this.anInt4706 = 2;
			this.anInt4701 = 0;
			this.anInt4705 = 2048;
			this.anInt4708 = 2048;
		} else if (local10 == 13) {
			this.anInt4701 = 0;
			this.anInt4706 = 2;
			this.anInt4705 = 2048;
			this.anInt4708 = 8192;
		} else if (local10 == 10) {
			this.anInt4706 = 3;
			this.anInt4705 = 512;
			this.anInt4708 = 2048;
			this.anInt4701 = 1536;
		} else if (local10 == 11) {
			this.anInt4705 = 512;
			this.anInt4701 = 1536;
			this.anInt4706 = 3;
			this.anInt4708 = 4096;
		} else if (local10 == 6) {
			this.anInt4701 = 1280;
			this.anInt4706 = 3;
			this.anInt4705 = 768;
			this.anInt4708 = 2048;
		} else if (local10 == 7) {
			this.anInt4708 = 4096;
			this.anInt4701 = 1280;
			this.anInt4705 = 768;
			this.anInt4706 = 3;
		} else if (local10 == 8) {
			this.anInt4701 = 1024;
			this.anInt4706 = 3;
			this.anInt4708 = 2048;
			this.anInt4705 = 1024;
		} else if (local10 == 9) {
			this.anInt4706 = 3;
			this.anInt4705 = 1024;
			this.anInt4708 = 4096;
			this.anInt4701 = 1024;
		} else if (local10 == 14) {
			this.anInt4705 = 768;
			this.anInt4701 = 1280;
			this.anInt4706 = 1;
			this.anInt4708 = 2048;
		} else if (local10 == 15) {
			this.anInt4701 = 1536;
			this.anInt4708 = 4096;
			this.anInt4705 = 512;
			this.anInt4706 = 1;
		} else if (local10 == 16) {
			this.anInt4705 = 256;
			this.anInt4701 = 1792;
			this.anInt4706 = 1;
			this.anInt4708 = 8192;
		} else {
			this.anInt4708 = 2048;
			this.anInt4701 = 0;
			this.anInt4706 = 0;
			this.anInt4705 = 2048;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIBII)V")
	public void method4289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4706 = arg0;
		this.anInt4705 = arg2;
		this.anInt4701 = arg1;
		this.anInt4708 = arg3;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BIZ)V")
	public void method4291(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) int local13;
		if (arg1) {
			local13 = 2048;
		} else {
			@Pc(27) int local27 = this.anInt4708 * arg0 / 50 + this.anInt4709 & 0x7FF;
			@Pc(30) int local30 = this.anInt4706;
			if (local30 == 1) {
				local13 = (Class1_Sub1_Sub16.anIntArray587[local27 << 3] >> 5) + 1024;
			} else if (local30 == 3) {
				local13 = Static145.anIntArray334[local27] >> 1;
			} else if (local30 == 4) {
				local13 = local27 >> 10 << 11;
			} else if (local30 == 2) {
				local13 = local27;
			} else if (local30 == 5) {
				local13 = (local27 < 1024 ? local27 : 2048 - local27) << 1;
			} else {
				local13 = 2048;
			}
		}
		super.aFloat89 = (float) (this.anInt4701 + (this.anInt4705 * local13 >> 11)) / 2048.0F;
	}
}
