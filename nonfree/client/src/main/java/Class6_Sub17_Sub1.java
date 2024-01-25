import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class6_Sub17_Sub1 extends Class6_Sub17 {

	@OriginalMember(owner = "client!hs", name = "t", descriptor = "Z")
	public boolean aBoolean196;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "Z")
	public boolean aBoolean197;

	@OriginalMember(owner = "client!hs", name = "y", descriptor = "I")
	public int anInt2324;

	@OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
	private int anInt2325;

	@OriginalMember(owner = "client!hs", name = "B", descriptor = "I")
	private int anInt2327;

	@OriginalMember(owner = "client!hs", name = "C", descriptor = "I")
	public int anInt2328;

	@OriginalMember(owner = "client!hs", name = "L", descriptor = "I")
	private int anInt2333;

	@OriginalMember(owner = "client!hs", name = "M", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!hs", name = "O", descriptor = "I")
	private int anInt2335;

	@OriginalMember(owner = "client!hs", name = "P", descriptor = "I")
	private int anInt2336;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	private Class6_Sub17_Sub1() {
		if (Static143.anIntArray349 == null) {
			Static338.method5591();
		}
		this.method2488();
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class6_Sub17_Sub1(@OriginalArg(0) Class6_Sub10 arg0) {
		if (Static143.anIntArray349 == null) {
			Static338.method5591();
		}
		this.anInt2324 = arg0.method3972();
		this.aBoolean196 = (this.anInt2324 & 0x8) != 0;
		this.aBoolean197 = (this.anInt2324 & 0x10) != 0;
		this.anInt2324 &= 0x7;
		super.anInt2314 = arg0.method4021();
		super.anInt2317 = arg0.method4021();
		super.anInt2316 = arg0.method4021();
		super.anInt2315 = arg0.method3972();
		@Pc(71) int local71 = super.anInt2315 * 2 + 1;
		this.aShortArray54 = new short[local71];
		for (@Pc(77) int local77 = 0; local77 < this.aShortArray54.length; local77++) {
			@Pc(84) short local84 = (short) arg0.method4021();
			@Pc(88) int local88 = local84 >>> 8;
			if (local88 >= local71) {
				local88 = local71 - 1;
			}
			@Pc(99) int local99 = local84 & 0xFF;
			if (local71 - local88 < local99) {
				local99 = local71 - local88;
			}
			this.aShortArray54[local77] = (short) (local99 | local88 << 8);
		}
		super.anInt2315 = (super.anInt2315 << 7) + 64;
		if (Static305.anIntArray650 == null) {
			super.anInt2319 = Static158.anIntArray634[Static154.method3114(arg0.method4021()) & 0xFFFF];
		} else {
			super.anInt2319 = Static305.anIntArray650[arg0.method4021()];
		}
		@Pc(163) int local163 = arg0.method3972();
		this.anInt2328 = local163 & 0x1F;
		this.anInt2335 = (local163 & 0xE0) << 3;
		if (this.anInt2328 != 31) {
			this.method2488();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBZ)V")
	public void method2486(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(57) int local57;
		if (arg1) {
			local57 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt2335 + arg0 * this.anInt2327 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt2336;
			if (local26 == 1) {
				local57 = (Class207.anIntArray697[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local57 = Static143.anIntArray349[local23] >> 1;
			} else if (local26 == 4) {
				local57 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local57 = local23;
			} else if (local26 == 5) {
				local57 = (local23 >= 1024 ? 2048 - local23 : local23) << 1;
			} else {
				local57 = 2048;
			}
		}
		super.aFloat61 = (float) ((this.anInt2333 * local57 >> 11) + this.anInt2325) / 2048.0F;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)V")
	public void method2487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2333 = arg2;
		this.anInt2327 = arg3;
		this.anInt2336 = arg0;
		this.anInt2325 = arg1;
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
	private void method2488() {
		@Pc(10) int local10 = this.anInt2328;
		if (local10 == 2) {
			this.anInt2325 = 0;
			this.anInt2327 = 2048;
			this.anInt2333 = 2048;
			this.anInt2336 = 1;
		} else if (local10 == 3) {
			this.anInt2327 = 4096;
			this.anInt2333 = 2048;
			this.anInt2336 = 1;
			this.anInt2325 = 0;
		} else if (local10 == 4) {
			this.anInt2333 = 2048;
			this.anInt2336 = 4;
			this.anInt2325 = 0;
			this.anInt2327 = 2048;
		} else if (local10 == 5) {
			this.anInt2327 = 8192;
			this.anInt2325 = 0;
			this.anInt2336 = 4;
			this.anInt2333 = 2048;
		} else if (local10 == 12) {
			this.anInt2336 = 2;
			this.anInt2325 = 0;
			this.anInt2333 = 2048;
			this.anInt2327 = 2048;
		} else if (local10 == 13) {
			this.anInt2336 = 2;
			this.anInt2333 = 2048;
			this.anInt2325 = 0;
			this.anInt2327 = 8192;
		} else if (local10 == 10) {
			this.anInt2336 = 3;
			this.anInt2325 = 1536;
			this.anInt2327 = 2048;
			this.anInt2333 = 512;
		} else if (local10 == 11) {
			this.anInt2336 = 3;
			this.anInt2327 = 4096;
			this.anInt2333 = 512;
			this.anInt2325 = 1536;
		} else if (local10 == 6) {
			this.anInt2333 = 768;
			this.anInt2327 = 2048;
			this.anInt2336 = 3;
			this.anInt2325 = 1280;
		} else if (local10 == 7) {
			this.anInt2325 = 1280;
			this.anInt2333 = 768;
			this.anInt2327 = 4096;
			this.anInt2336 = 3;
		} else if (local10 == 8) {
			this.anInt2327 = 2048;
			this.anInt2333 = 1024;
			this.anInt2336 = 3;
			this.anInt2325 = 1024;
		} else if (local10 == 9) {
			this.anInt2333 = 1024;
			this.anInt2325 = 1024;
			this.anInt2336 = 3;
			this.anInt2327 = 4096;
		} else if (local10 == 14) {
			this.anInt2333 = 768;
			this.anInt2336 = 1;
			this.anInt2327 = 2048;
			this.anInt2325 = 1280;
		} else if (local10 == 15) {
			this.anInt2327 = 4096;
			this.anInt2333 = 512;
			this.anInt2336 = 1;
			this.anInt2325 = 1536;
		} else if (local10 == 16) {
			this.anInt2325 = 1792;
			this.anInt2333 = 256;
			this.anInt2327 = 8192;
			this.anInt2336 = 1;
		} else {
			this.anInt2333 = 2048;
			this.anInt2327 = 2048;
			this.anInt2336 = 0;
			this.anInt2325 = 0;
		}
	}
}
