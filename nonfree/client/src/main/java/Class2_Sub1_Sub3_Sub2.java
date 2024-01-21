import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class2_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
	public int anInt686;

	@OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
	public int anInt687;

	@OriginalMember(owner = "client!da", name = "db", descriptor = "I")
	public int anInt688;

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "[I")
	public int[] anIntArray89;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub3_Sub2() {
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(II)V")
	public Class2_Sub1_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray89 = new int[arg0 * arg1];
		this.anInt690 = this.anInt687 = arg0;
		this.anInt686 = this.anInt689 = arg1;
		this.anInt691 = this.anInt688 = 0;
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class2_Sub1_Sub3_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(5) Image local5 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(10) MediaTracker local10 = new MediaTracker(arg1);
			local10.addImage(local5, 0);
			local10.waitForAll();
			this.anInt690 = local5.getWidth(arg1);
			this.anInt686 = local5.getHeight(arg1);
			this.anInt687 = this.anInt690;
			this.anInt689 = this.anInt686;
			this.anInt691 = 0;
			this.anInt688 = 0;
			this.anIntArray89 = new int[this.anInt690 * this.anInt686];
			@Pc(64) PixelGrabber local64 = new PixelGrabber(local5, 0, 0, this.anInt690, this.anInt686, this.anIntArray89, 0, this.anInt690);
			local64.grabPixels();
		} catch (@Pc(69) InterruptedException local69) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	public void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray89.length; local1++) {
			@Pc(7) int local7 = this.anIntArray89[local1];
			if (local7 != 0) {
				@Pc(15) int local15 = local7 >> 16 & 0xFF;
				local15 += arg0;
				if (local15 < 1) {
					local15 = 1;
				} else if (local15 > 255) {
					local15 = 255;
				}
				@Pc(36) int local36 = local7 >> 8 & 0xFF;
				local36 += arg1;
				if (local36 < 1) {
					local36 = 1;
				} else if (local36 > 255) {
					local36 = 255;
				}
				@Pc(55) int local55 = local7 & 0xFF;
				local55 += arg2;
				if (local55 < 1) {
					local55 = 1;
				} else if (local55 > 255) {
					local55 = 255;
				}
				this.anIntArray89[local1] = (local15 << 16) + (local36 << 8) + local55;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
	public void method460() {
		Static81.method1645(this.anIntArray89, this.anInt690, this.anInt686);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIII[I[I)V")
	public void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * arg7 >> 8;
			@Pc(39) int local39 = local27 * arg7 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static81.anInt2634;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(76) int local76 = arg8[local71];
				@Pc(80) int local80 = local69 + local76;
				@Pc(86) int local86 = local51 + local39 * local76;
				@Pc(92) int local92 = local63 - local33 * local76;
				for (@Pc(97) int local97 = -arg9[local71]; local97 < 0; local97++) {
					Static81.anIntArray373[local80++] = this.anIntArray89[(local86 >> 16) + (local92 >> 16) * this.anInt690];
					local86 += local39;
					local92 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static81.anInt2634;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
	public void method464() {
		if (this.anInt690 == this.anInt687 && this.anInt686 == this.anInt689) {
			return;
		}
		@Pc(17) int[] local17 = new int[this.anInt687 * this.anInt689];
		for (@Pc(19) int local19 = 0; local19 < this.anInt686; local19++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt690; local22++) {
				local17[(local19 + this.anInt688) * this.anInt687 + local22 + this.anInt691] = this.anIntArray89[local19 * this.anInt690 + local22];
			}
		}
		this.anIntArray89 = local17;
		this.anInt690 = this.anInt687;
		this.anInt686 = this.anInt689;
		this.anInt691 = 0;
		this.anInt688 = 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIDI)V")
	public void method465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) double arg2) {
		try {
			@Pc(15) int local15 = (int) (Math.sin(arg2) * 65536.0D);
			@Pc(21) int local21 = (int) (Math.cos(arg2) * 65536.0D);
			@Pc(27) int local27 = local15 * 256 >> 8;
			@Pc(33) int local33 = local21 * 256 >> 8;
			@Pc(45) int local45 = local27 * -10 + local33 * -10 + 983040;
			@Pc(57) int local57 = local33 * -10 + 983040 - local27 * -10;
			@Pc(63) int local63 = arg0 + arg1 * Static81.anInt2634;
			for (@Pc(65) int local65 = 0; local65 < 20; local65++) {
				@Pc(68) int local68 = local63;
				@Pc(70) int local70 = local45;
				@Pc(72) int local72 = local57;
				for (@Pc(75) int local75 = -20; local75 < 0; local75++) {
					@Pc(90) int local90 = this.anIntArray89[(local70 >> 16) + (local72 >> 16) * this.anInt690];
					if (local90 == 0) {
						local68++;
					} else {
						Static81.anIntArray373[local68++] = local90;
					}
					local70 += local33;
					local72 -= local27;
				}
				local45 += local27;
				local57 += local33;
				local63 += Static81.anInt2634;
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!cb;II)V")
	public void method466(@OriginalArg(0) Class2_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg1 += this.anInt691;
		arg2 += this.anInt688;
		@Pc(15) int local15 = arg1 + arg2 * Static81.anInt2634;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt686;
		@Pc(23) int local23 = this.anInt690;
		@Pc(27) int local27 = Static81.anInt2634 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg2 < Static81.anInt2632) {
			local36 = Static81.anInt2632 - arg2;
			local20 -= local36;
			arg2 = Static81.anInt2632;
			local17 = local36 * local23;
			local15 += local36 * Static81.anInt2634;
		}
		if (arg2 + local20 > Static81.anInt2633) {
			local20 -= arg2 + local20 - Static81.anInt2633;
		}
		if (arg1 < Static81.anInt2635) {
			local36 = Static81.anInt2635 - arg1;
			local23 -= local36;
			arg1 = Static81.anInt2635;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg1 + local23 > Static81.anInt2637) {
			local36 = arg1 + local23 - Static81.anInt2637;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static110.method463(Static81.anIntArray373, this.anIntArray89, local17, local15, local23, local20, local27, local29, arg0.aByteArray7);
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	public void method467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt691;
		arg1 += this.anInt688;
		@Pc(15) int local15 = arg0 + arg1 * Static81.anInt2634;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt686;
		@Pc(23) int local23 = this.anInt690;
		@Pc(27) int local27 = Static81.anInt2634 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static81.anInt2632) {
			local36 = Static81.anInt2632 - arg1;
			local20 -= local36;
			arg1 = Static81.anInt2632;
			local17 = local36 * local23;
			local15 += local36 * Static81.anInt2634;
		}
		if (arg1 + local20 > Static81.anInt2633) {
			local20 -= arg1 + local20 - Static81.anInt2633;
		}
		if (arg0 < Static81.anInt2635) {
			local36 = Static81.anInt2635 - arg0;
			local23 -= local36;
			arg0 = Static81.anInt2635;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static81.anInt2637) {
			local36 = arg0 + local23 - Static81.anInt2637;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static110.method462(Static81.anIntArray373, this.anIntArray89, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	public void method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt691;
		arg1 += this.anInt688;
		@Pc(15) int local15 = arg0 + arg1 * Static81.anInt2634;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt686;
		@Pc(23) int local23 = this.anInt690;
		@Pc(27) int local27 = Static81.anInt2634 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static81.anInt2632) {
			local36 = Static81.anInt2632 - arg1;
			local20 -= local36;
			arg1 = Static81.anInt2632;
			local17 = local36 * local23;
			local15 += local36 * Static81.anInt2634;
		}
		if (arg1 + local20 > Static81.anInt2633) {
			local20 -= arg1 + local20 - Static81.anInt2633;
		}
		if (arg0 < Static81.anInt2635) {
			local36 = Static81.anInt2635 - arg0;
			local23 -= local36;
			arg0 = Static81.anInt2635;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static81.anInt2637) {
			local36 = arg0 + local23 - Static81.anInt2637;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static110.method457(Static81.anIntArray373, this.anIntArray89, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt691;
		arg1 += this.anInt688;
		@Pc(15) int local15 = arg0 + arg1 * Static81.anInt2634;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt686;
		@Pc(23) int local23 = this.anInt690;
		@Pc(27) int local27 = Static81.anInt2634 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static81.anInt2632) {
			local36 = Static81.anInt2632 - arg1;
			local20 -= local36;
			arg1 = Static81.anInt2632;
			local17 = local36 * local23;
			local15 += local36 * Static81.anInt2634;
		}
		if (arg1 + local20 > Static81.anInt2633) {
			local20 -= arg1 + local20 - Static81.anInt2633;
		}
		if (arg0 < Static81.anInt2635) {
			local36 = Static81.anInt2635 - arg0;
			local23 -= local36;
			arg0 = Static81.anInt2635;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static81.anInt2637) {
			local36 = arg0 + local23 - Static81.anInt2637;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static110.method458(Static81.anIntArray373, this.anIntArray89, local17, local15, local23, local20, local27, local29);
		}
	}
}
