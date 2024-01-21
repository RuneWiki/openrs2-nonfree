import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class3_Sub1_Sub4_Sub2 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!ub", name = "jb", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
	public int anInt2573;

	@OriginalMember(owner = "client!ub", name = "lb", descriptor = "I")
	public int anInt2574;

	@OriginalMember(owner = "client!ub", name = "mb", descriptor = "I")
	public int anInt2575;

	@OriginalMember(owner = "client!ub", name = "nb", descriptor = "I")
	public int anInt2576;

	@OriginalMember(owner = "client!ub", name = "ob", descriptor = "I")
	public int anInt2577;

	@OriginalMember(owner = "client!ub", name = "pb", descriptor = "I")
	public int anInt2578;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub4_Sub2() {
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(II)V")
	public Class3_Sub1_Sub4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray325 = new int[arg0 * arg1];
		this.anInt2573 = this.anInt2574 = arg0;
		this.anInt2578 = this.anInt2576 = arg1;
		this.anInt2577 = this.anInt2575 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class3_Sub1_Sub4_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(5) Image local5 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(10) MediaTracker local10 = new MediaTracker(arg1);
			local10.addImage(local5, 0);
			local10.waitForAll();
			this.anInt2573 = local5.getWidth(arg1);
			this.anInt2578 = local5.getHeight(arg1);
			this.anInt2574 = this.anInt2573;
			this.anInt2576 = this.anInt2578;
			this.anInt2577 = 0;
			this.anInt2575 = 0;
			this.anIntArray325 = new int[this.anInt2573 * this.anInt2578];
			@Pc(64) PixelGrabber local64 = new PixelGrabber(local5, 0, 0, this.anInt2573, this.anInt2578, this.anIntArray325, 0, this.anInt2573);
			local64.grabPixels();
		} catch (@Pc(69) InterruptedException local69) {
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!uc;II)V")
	public void method1729(@OriginalArg(0) Class3_Sub1_Sub4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg1 += this.anInt2577;
		arg2 += this.anInt2575;
		@Pc(15) int local15 = arg1 + arg2 * Static50.anInt2730;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2578;
		@Pc(23) int local23 = this.anInt2573;
		@Pc(27) int local27 = Static50.anInt2730 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg2 < Static50.anInt2725) {
			local36 = Static50.anInt2725 - arg2;
			local20 -= local36;
			arg2 = Static50.anInt2725;
			local17 = local36 * local23;
			local15 += local36 * Static50.anInt2730;
		}
		if (arg2 + local20 > Static50.anInt2728) {
			local20 -= arg2 + local20 - Static50.anInt2728;
		}
		if (arg1 < Static50.anInt2727) {
			local36 = Static50.anInt2727 - arg1;
			local23 -= local36;
			arg1 = Static50.anInt2727;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg1 + local23 > Static50.anInt2729) {
			local36 = arg1 + local23 - Static50.anInt2729;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static120.method1735(Static50.anIntArray332, this.anIntArray325, local17, local15, local23, local20, local27, local29, arg0.aByteArray22);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	public void method1730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anIntArray325.length; local1++) {
			@Pc(7) int local7 = this.anIntArray325[local1];
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
				this.anIntArray325[local1] = (local15 << 16) + (local36 << 8) + local55;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
	public void method1733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2577;
		arg1 += this.anInt2575;
		@Pc(15) int local15 = arg0 + arg1 * Static50.anInt2730;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2578;
		@Pc(23) int local23 = this.anInt2573;
		@Pc(27) int local27 = Static50.anInt2730 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static50.anInt2725) {
			local36 = Static50.anInt2725 - arg1;
			local20 -= local36;
			arg1 = Static50.anInt2725;
			local17 = local36 * local23;
			local15 += local36 * Static50.anInt2730;
		}
		if (arg1 + local20 > Static50.anInt2728) {
			local20 -= arg1 + local20 - Static50.anInt2728;
		}
		if (arg0 < Static50.anInt2727) {
			local36 = Static50.anInt2727 - arg0;
			local23 -= local36;
			arg0 = Static50.anInt2727;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static50.anInt2729) {
			local36 = arg0 + local23 - Static50.anInt2729;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static120.method1732(Static50.anIntArray332, this.anIntArray325, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "()V")
	public void method1734() {
		if (this.anInt2573 == this.anInt2574 && this.anInt2578 == this.anInt2576) {
			return;
		}
		@Pc(17) int[] local17 = new int[this.anInt2574 * this.anInt2576];
		for (@Pc(19) int local19 = 0; local19 < this.anInt2578; local19++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt2573; local22++) {
				local17[(local19 + this.anInt2575) * this.anInt2574 + local22 + this.anInt2577] = this.anIntArray325[local19 * this.anInt2573 + local22];
			}
		}
		this.anIntArray325 = local17;
		this.anInt2573 = this.anInt2574;
		this.anInt2578 = this.anInt2576;
		this.anInt2577 = 0;
		this.anInt2575 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "()V")
	public void method1736() {
		Static50.method1844(this.anIntArray325, this.anInt2573, this.anInt2578);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
	public void method1737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2577;
		arg1 += this.anInt2575;
		@Pc(15) int local15 = arg0 + arg1 * Static50.anInt2730;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2578;
		@Pc(23) int local23 = this.anInt2573;
		@Pc(27) int local27 = Static50.anInt2730 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static50.anInt2725) {
			local36 = Static50.anInt2725 - arg1;
			local20 -= local36;
			arg1 = Static50.anInt2725;
			local17 = local36 * local23;
			local15 += local36 * Static50.anInt2730;
		}
		if (arg1 + local20 > Static50.anInt2728) {
			local20 -= arg1 + local20 - Static50.anInt2728;
		}
		if (arg0 < Static50.anInt2727) {
			local36 = Static50.anInt2727 - arg0;
			local23 -= local36;
			arg0 = Static50.anInt2727;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static50.anInt2729) {
			local36 = arg0 + local23 - Static50.anInt2729;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static120.method1728(Static50.anIntArray332, this.anIntArray325, local17, local15, local23, local20, local27, local29);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIDI)V")
	public void method1738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) double arg2) {
		try {
			@Pc(15) int local15 = (int) (Math.sin(arg2) * 65536.0D);
			@Pc(21) int local21 = (int) (Math.cos(arg2) * 65536.0D);
			@Pc(27) int local27 = local15 * 256 >> 8;
			@Pc(33) int local33 = local21 * 256 >> 8;
			@Pc(45) int local45 = local27 * -10 + local33 * -10 + 983040;
			@Pc(57) int local57 = local33 * -10 + 983040 - local27 * -10;
			@Pc(63) int local63 = arg0 + arg1 * Static50.anInt2730;
			for (@Pc(65) int local65 = 0; local65 < 20; local65++) {
				@Pc(68) int local68 = local63;
				@Pc(70) int local70 = local45;
				@Pc(72) int local72 = local57;
				for (@Pc(75) int local75 = -20; local75 < 0; local75++) {
					@Pc(90) int local90 = this.anIntArray325[(local70 >> 16) + (local72 >> 16) * this.anInt2573];
					if (local90 == 0) {
						local68++;
					} else {
						Static50.anIntArray332[local68++] = local90;
					}
					local70 += local33;
					local72 -= local27;
				}
				local45 += local27;
				local57 += local33;
				local63 += Static50.anInt2730;
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIII[I[I)V")
	public void method1739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9) {
		try {
			@Pc(4) int local4 = -arg2 / 2;
			@Pc(9) int local9 = -arg3 / 2;
			@Pc(18) int local18 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
			@Pc(27) int local27 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
			@Pc(33) int local33 = local18 * arg7 >> 8;
			@Pc(39) int local39 = local27 * arg7 >> 8;
			@Pc(51) int local51 = (arg4 << 16) + local9 * local33 + local4 * local39;
			@Pc(63) int local63 = (arg5 << 16) + (local9 * local39 - local4 * local33);
			@Pc(69) int local69 = arg0 + arg1 * Static50.anInt2730;
			for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
				@Pc(76) int local76 = arg8[local71];
				@Pc(80) int local80 = local69 + local76;
				@Pc(86) int local86 = local51 + local39 * local76;
				@Pc(92) int local92 = local63 - local33 * local76;
				for (@Pc(97) int local97 = -arg9[local71]; local97 < 0; local97++) {
					Static50.anIntArray332[local80++] = this.anIntArray325[(local86 >> 16) + (local92 >> 16) * this.anInt2573];
					local86 += local39;
					local92 -= local33;
				}
				local51 += local33;
				local63 += local39;
				local69 += Static50.anInt2730;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
	public void method1740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 += this.anInt2577;
		arg1 += this.anInt2575;
		@Pc(15) int local15 = arg0 + arg1 * Static50.anInt2730;
		@Pc(17) int local17 = 0;
		@Pc(20) int local20 = this.anInt2578;
		@Pc(23) int local23 = this.anInt2573;
		@Pc(27) int local27 = Static50.anInt2730 - local23;
		@Pc(29) int local29 = 0;
		@Pc(36) int local36;
		if (arg1 < Static50.anInt2725) {
			local36 = Static50.anInt2725 - arg1;
			local20 -= local36;
			arg1 = Static50.anInt2725;
			local17 = local36 * local23;
			local15 += local36 * Static50.anInt2730;
		}
		if (arg1 + local20 > Static50.anInt2728) {
			local20 -= arg1 + local20 - Static50.anInt2728;
		}
		if (arg0 < Static50.anInt2727) {
			local36 = Static50.anInt2727 - arg0;
			local23 -= local36;
			arg0 = Static50.anInt2727;
			local17 += local36;
			local15 += local36;
			local29 = local36;
			local27 += local36;
		}
		if (arg0 + local23 > Static50.anInt2729) {
			local36 = arg0 + local23 - Static50.anInt2729;
			local23 -= local36;
			local29 += local36;
			local27 += local36;
		}
		if (local23 > 0 && local20 > 0) {
			Static120.method1731(Static50.anIntArray332, this.anIntArray325, local17, local15, local23, local20, local27, local29);
		}
	}
}
