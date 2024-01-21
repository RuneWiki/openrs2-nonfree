import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FKNRMZJV")
public final class Class6_Sub2_Sub2_Sub1 extends Class6_Sub2_Sub2 {

	@OriginalMember(owner = "client!FKNRMZJV", name = "B", descriptor = "Z")
	private static boolean aBoolean52 = true;

	@OriginalMember(owner = "client!FKNRMZJV", name = "F", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!FKNRMZJV", name = "G", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!FKNRMZJV", name = "C", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!FKNRMZJV", name = "D", descriptor = "Z")
	private boolean aBoolean54 = true;

	@OriginalMember(owner = "client!FKNRMZJV", name = "E", descriptor = "I")
	private int anInt223 = 7;

	@OriginalMember(owner = "client!FKNRMZJV", name = "H", descriptor = "[I")
	public int[] anIntArray43;

	@OriginalMember(owner = "client!FKNRMZJV", name = "M", descriptor = "I")
	public int anInt230;

	@OriginalMember(owner = "client!FKNRMZJV", name = "I", descriptor = "I")
	public int anInt226;

	@OriginalMember(owner = "client!FKNRMZJV", name = "N", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!FKNRMZJV", name = "J", descriptor = "I")
	public int anInt227;

	@OriginalMember(owner = "client!FKNRMZJV", name = "L", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!FKNRMZJV", name = "K", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!FKNRMZJV", name = "<init>", descriptor = "(II)V")
	public Class6_Sub2_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray43 = new int[arg0 * arg1];
		this.anInt226 = this.anInt230 = arg0;
		this.anInt227 = this.anInt231 = arg1;
		this.anInt228 = this.anInt229 = 0;
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class6_Sub2_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(14) Image local14 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(19) MediaTracker local19 = new MediaTracker(arg1);
			local19.addImage(local14, 0);
			local19.waitForAll();
			this.anInt226 = local14.getWidth(arg1);
			this.anInt227 = local14.getHeight(arg1);
			this.anInt230 = this.anInt226;
			this.anInt231 = this.anInt227;
			this.anInt228 = 0;
			this.anInt229 = 0;
			this.anIntArray43 = new int[this.anInt226 * this.anInt227];
			@Pc(73) PixelGrabber local73 = new PixelGrabber(local14, 0, 0, this.anInt226, this.anInt227, this.anIntArray43, 0, this.anInt226);
			local73.grabPixels();
		} catch (@Pc(78) Exception local78) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "<init>", descriptor = "(Lclient!RSPRYUFS;Ljava/lang/String;I)V")
	public Class6_Sub2_Sub2_Sub1(@OriginalArg(0) Class37 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class6_Sub2_Sub3 local28 = new Class6_Sub2_Sub3(-587, arg0.method358(arg1 + ".dat", null));
		@Pc(37) Class6_Sub2_Sub3 local37 = new Class6_Sub2_Sub3(-587, arg0.method358("index.dat", null));
		local37.anInt404 = local28.method264();
		this.anInt230 = local37.method264();
		this.anInt231 = local37.method264();
		@Pc(52) int local52 = local37.method262();
		@Pc(55) int[] local55 = new int[local52];
		for (@Pc(57) int local57 = 0; local57 < local52 - 1; local57++) {
			local55[local57 + 1] = local37.method266();
			if (local55[local57 + 1] == 0) {
				local55[local57 + 1] = 1;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < arg2; local86++) {
			local37.anInt404 += 2;
			local28.anInt404 += local37.method264() * local37.method264();
			local37.anInt404++;
		}
		this.anInt228 = local37.method262();
		this.anInt229 = local37.method262();
		this.anInt226 = local37.method264();
		this.anInt227 = local37.method264();
		@Pc(133) int local133 = local37.method262();
		@Pc(139) int local139 = this.anInt226 * this.anInt227;
		this.anIntArray43 = new int[local139];
		@Pc(147) int local147;
		if (local133 == 0) {
			for (local147 = 0; local147 < local139; local147++) {
				this.anIntArray43[local147] = local55[local28.method262()];
			}
		} else if (local133 == 1) {
			for (local147 = 0; local147 < this.anInt226; local147++) {
				for (@Pc(171) int local171 = 0; local171 < this.anInt227; local171++) {
					this.anIntArray43[local147 + local171 * this.anInt226] = local55[local28.method262()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(Z)V")
	public void method93() {
		try {
			Class6_Sub2_Sub2.method547(this.anInt227, this.anInt226, this.anIntArray43);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("98386, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(IIII)V")
	public void method94(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray43.length; local3++) {
				@Pc(10) int local10 = this.anIntArray43[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg2;
					if (local18 < 1) {
						local18 = 1;
					} else if (local18 > 255) {
						local18 = 255;
					}
					@Pc(40) int local40 = local10 >> 8 & 0xFF;
					local40 += arg1;
					if (local40 < 1) {
						local40 = 1;
					} else if (local40 > 255) {
						local40 = 255;
					}
					@Pc(60) int local60 = local10 & 0xFF;
					local60 += arg0;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray43[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("2252, " + arg0 + ", " + 568 + ", " + arg1 + ", " + arg2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "b", descriptor = "(I)V")
	public void method95() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt230 * this.anInt231];
			for (@Pc(10) int local10 = 0; local10 < this.anInt227; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt226; local14++) {
					local8[(local10 + this.anInt229) * this.anInt230 + local14 + this.anInt228] = this.anIntArray43[local10 * this.anInt226 + local14];
				}
			}
			this.anIntArray43 = local8;
			this.anInt226 = this.anInt230;
			this.anInt227 = this.anInt231;
			this.anInt228 = 0;
			this.anInt229 = 0;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("18698, " + 578 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(IBI)V")
	public void method96(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt228;
			arg1 += this.anInt229;
			@Pc(29) int local29 = arg0 + arg1 * Class6_Sub2_Sub2.anInt802;
			@Pc(31) int local31 = 0;
			@Pc(34) int local34 = this.anInt227;
			@Pc(37) int local37 = this.anInt226;
			@Pc(41) int local41 = Class6_Sub2_Sub2.anInt802 - local37;
			@Pc(43) int local43 = 0;
			@Pc(50) int local50;
			if (arg1 < Class6_Sub2_Sub2.anInt804) {
				local50 = Class6_Sub2_Sub2.anInt804 - arg1;
				local34 -= local50;
				arg1 = Class6_Sub2_Sub2.anInt804;
				local31 = local50 * local37 + 0;
				local29 += local50 * Class6_Sub2_Sub2.anInt802;
			}
			if (arg1 + local34 > Class6_Sub2_Sub2.anInt805) {
				local34 -= arg1 + local34 - Class6_Sub2_Sub2.anInt805;
			}
			if (arg0 < Class6_Sub2_Sub2.anInt806) {
				local50 = Class6_Sub2_Sub2.anInt806 - arg0;
				local37 -= local50;
				arg0 = Class6_Sub2_Sub2.anInt806;
				local31 += local50;
				local29 += local50;
				local43 = local50 + 0;
				local41 += local50;
			}
			if (arg0 + local37 > Class6_Sub2_Sub2.anInt807) {
				local50 = arg0 + local37 - Class6_Sub2_Sub2.anInt807;
				local37 -= local50;
				local43 += local50;
				local41 += local50;
			}
			if (local37 > 0 && local34 > 0) {
				this.method97(local34, Class6_Sub2_Sub2.anIntArray201, 549, local43, this.anIntArray43, local31, local29, local41, local37);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("51090, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(I[III[IIIII)V")
	private void method97(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) int local6 = -(arg8 >> 2);
			@Pc(10) boolean local10 = false;
			@Pc(15) int local15 = -(arg8 & 0x3);
			for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					arg1[arg6++] = arg4[arg5++];
					arg1[arg6++] = arg4[arg5++];
					arg1[arg6++] = arg4[arg5++];
					arg1[arg6++] = arg4[arg5++];
				}
				for (@Pc(61) int local61 = local15; local61 < 0; local61++) {
					arg1[arg6++] = arg4[arg5++];
				}
				arg6 += arg7;
				arg5 += arg3;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("57965, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(III)V")
	public void method98(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt228;
			arg0 += this.anInt229;
			@Pc(25) int local25 = arg1 + arg0 * Class6_Sub2_Sub2.anInt802;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt227;
			@Pc(33) int local33 = this.anInt226;
			@Pc(37) int local37 = Class6_Sub2_Sub2.anInt802 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class6_Sub2_Sub2.anInt804) {
				local46 = Class6_Sub2_Sub2.anInt804 - arg0;
				local30 -= local46;
				arg0 = Class6_Sub2_Sub2.anInt804;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class6_Sub2_Sub2.anInt802;
			}
			if (arg0 + local30 > Class6_Sub2_Sub2.anInt805) {
				local30 -= arg0 + local30 - Class6_Sub2_Sub2.anInt805;
			}
			if (arg1 < Class6_Sub2_Sub2.anInt806) {
				local46 = Class6_Sub2_Sub2.anInt806 - arg1;
				local33 -= local46;
				arg1 = Class6_Sub2_Sub2.anInt806;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class6_Sub2_Sub2.anInt807) {
				local46 = arg1 + local33 - Class6_Sub2_Sub2.anInt807;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method99(Class6_Sub2_Sub2.anIntArray201, this.anIntArray43, local27, local25, local33, local30, local37, local39);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("88432, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method99(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) int local6 = -(arg4 >> 2);
		@Pc(11) int local11 = -(arg4 & 0x3);
		for (@Pc(14) int local14 = -arg5; local14 < 0; local14++) {
			@Pc(25) int local25;
			for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
			}
			for (@Pc(85) int local85 = local11; local85 < 0; local85++) {
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "b", descriptor = "(IIII)V")
	public void method100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt228;
			arg1 += this.anInt229;
			@Pc(15) int local15 = arg0 + arg1 * Class6_Sub2_Sub2.anInt802;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt227;
			@Pc(23) int local23 = this.anInt226;
			@Pc(27) int local27 = Class6_Sub2_Sub2.anInt802 - local23;
			@Pc(29) int local29 = 0;
			@Pc(40) int local40;
			if (arg1 < Class6_Sub2_Sub2.anInt804) {
				local40 = Class6_Sub2_Sub2.anInt804 - arg1;
				local20 -= local40;
				arg1 = Class6_Sub2_Sub2.anInt804;
				local17 = local40 * local23 + 0;
				local15 += local40 * Class6_Sub2_Sub2.anInt802;
			}
			if (arg1 + local20 > Class6_Sub2_Sub2.anInt805) {
				local20 -= arg1 + local20 - Class6_Sub2_Sub2.anInt805;
			}
			if (arg0 < Class6_Sub2_Sub2.anInt806) {
				local40 = Class6_Sub2_Sub2.anInt806 - arg0;
				local23 -= local40;
				arg0 = Class6_Sub2_Sub2.anInt806;
				local17 += local40;
				local15 += local40;
				local29 = local40 + 0;
				local27 += local40;
			}
			if (arg0 + local23 > Class6_Sub2_Sub2.anInt807) {
				local40 = arg0 + local23 - Class6_Sub2_Sub2.anInt807;
				local23 -= local40;
				local29 += local40;
				local27 += local40;
			}
			if (local23 > 0 && local20 > 0) {
				this.method101(local23, 0, local17, local27, local15, local20, local29, Class6_Sub2_Sub2.anIntArray201, this.anIntArray43);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("38330, " + 17120 + ", " + arg0 + ", " + arg1 + ", " + 128 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(IIIIIIIII[I[I)V")
	private void method101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int[] arg7, @OriginalArg(10) int[] arg8) {
		try {
			for (@Pc(14) int local14 = -arg5; local14 < 0; local14++) {
				for (@Pc(19) int local19 = -arg0; local19 < 0; local19++) {
					@Pc(26) int local26 = arg8[arg2++];
					if (local26 == 0) {
						arg4++;
					} else {
						@Pc(32) int local32 = arg7[arg4];
						arg7[arg4++] = ((local26 & 0xFF00FF) * 128 + (local32 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local26 & 0xFF00) * 128 + (local32 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg4 += arg3;
				arg2 += arg6;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("92802, " + arg0 + ", " + arg1 + ", " + 128 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 23782 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "b", descriptor = "(IIIIIIIII[I[I)V")
	public void method102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int[] arg9) {
		try {
			try {
				@Pc(13) int local13 = -arg3 / 2;
				@Pc(18) int local18 = -arg1 / 2;
				@Pc(27) int local27 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
				@Pc(36) int local36 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
				@Pc(42) int local42 = local27 * arg6 >> 8;
				@Pc(48) int local48 = local36 * arg6 >> 8;
				@Pc(60) int local60 = (arg2 << 16) + local18 * local42 + local13 * local48;
				@Pc(72) int local72 = (arg4 << 16) + (local18 * local48 - local13 * local42);
				@Pc(78) int local78 = arg5 + arg0 * Class6_Sub2_Sub2.anInt802;
				for (@Pc(80) int local80 = 0; local80 < arg1; local80++) {
					@Pc(86) int local86 = arg9[local80];
					@Pc(90) int local90 = local78 + local86;
					@Pc(96) int local96 = local60 + local48 * local86;
					@Pc(102) int local102 = local72 - local42 * local86;
					for (@Pc(107) int local107 = -arg8[local80]; local107 < 0; local107++) {
						Class6_Sub2_Sub2.anIntArray201[local90++] = this.anIntArray43[(local96 >> 16) + (local102 >> 16) * this.anInt226];
						local96 += local48;
						local102 -= local42;
					}
					local60 += local42;
					local72 += local48;
					local78 += Class6_Sub2_Sub2.anInt802;
				}
			} catch (@Pc(155) Exception local155) {
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("78443, " + arg0 + ", " + -210 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(IIIIIIIID)V")
	public void method103(@OriginalArg(1) int arg0, @OriginalArg(7) int arg1, @OriginalArg(8) double arg2) {
		try {
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
				@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
				@Pc(69) int local69 = arg1 + arg0 * Class6_Sub2_Sub2.anInt802;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray43[(local77 >> 16) + (local79 >> 16) * this.anInt226];
						if (local98 == 0) {
							local75++;
						} else {
							Class6_Sub2_Sub2.anIntArray201[local75++] = local98;
						}
						local77 += local39;
						local79 -= local33;
					}
					local51 += local33;
					local63 += local39;
					local69 += Class6_Sub2_Sub2.anInt802;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("64356, " + -44232 + ", " + arg0 + ", " + 256 + ", " + 20 + ", " + 20 + ", " + 15 + ", " + 15 + ", " + arg1 + ", " + arg2 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "(IIBLclient!UZETOFZZ;)V")
	public void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub2_Sub2_Sub3 arg2) {
		try {
			arg0 += this.anInt228;
			arg1 += this.anInt229;
			@Pc(15) int local15 = arg0 + arg1 * Class6_Sub2_Sub2.anInt802;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt227;
			@Pc(23) int local23 = this.anInt226;
			@Pc(27) int local27 = Class6_Sub2_Sub2.anInt802 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class6_Sub2_Sub2.anInt804) {
				local36 = Class6_Sub2_Sub2.anInt804 - arg1;
				local20 -= local36;
				arg1 = Class6_Sub2_Sub2.anInt804;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class6_Sub2_Sub2.anInt802;
			}
			if (arg1 + local20 > Class6_Sub2_Sub2.anInt805) {
				local20 -= arg1 + local20 - Class6_Sub2_Sub2.anInt805;
			}
			if (arg0 < Class6_Sub2_Sub2.anInt806) {
				local36 = Class6_Sub2_Sub2.anInt806 - arg0;
				local23 -= local36;
				arg0 = Class6_Sub2_Sub2.anInt806;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class6_Sub2_Sub2.anInt807) {
				local36 = arg0 + local23 - Class6_Sub2_Sub2.anInt807;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method105(Class6_Sub2_Sub2.anIntArray201, local20, local27, local17, 0, local15, this.anIntArray43, arg2.aByteArray13, local29, local23);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("79498, " + arg0 + ", " + arg1 + ", " + 40 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FKNRMZJV", name = "a", descriptor = "([IZIIIII[I[BII)V")
	private void method105(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg9 >> 2);
			@Pc(16) int local16 = -(arg9 & 0x3);
			for (@Pc(19) int local19 = -arg1; local19 < 0; local19++) {
				@Pc(30) int local30;
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					local30 = arg6[arg3++];
					if (local30 != 0 && arg7[arg5] == 0) {
						arg0[arg5++] = local30;
					} else {
						arg5++;
					}
					local30 = arg6[arg3++];
					if (local30 != 0 && arg7[arg5] == 0) {
						arg0[arg5++] = local30;
					} else {
						arg5++;
					}
					local30 = arg6[arg3++];
					if (local30 != 0 && arg7[arg5] == 0) {
						arg0[arg5++] = local30;
					} else {
						arg5++;
					}
					local30 = arg6[arg3++];
					if (local30 != 0 && arg7[arg5] == 0) {
						arg0[arg5++] = local30;
					} else {
						arg5++;
					}
				}
				for (@Pc(106) int local106 = local16; local106 < 0; local106++) {
					local30 = arg6[arg3++];
					if (local30 != 0 && arg7[arg5] == 0) {
						arg0[arg5++] = local30;
					} else {
						arg5++;
					}
				}
				arg5 += arg2;
				arg3 += arg8;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("25639, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
