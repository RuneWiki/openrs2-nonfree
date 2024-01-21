import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub2_Sub4_Sub1 extends Class1_Sub1_Sub2_Sub4 {

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
	private int anInt733;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
	private int anInt734 = 6771;

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "[[B")
	private byte[][] aByteArrayArray5 = new byte[256][];

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "[I")
	private int[] anIntArray226 = new int[256];

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "[I")
	private int[] anIntArray227 = new int[256];

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "[I")
	private int[] anIntArray228 = new int[256];

	@OriginalMember(owner = "client!lb", name = "R", descriptor = "[I")
	private int[] anIntArray229 = new int[256];

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "[I")
	private int[] anIntArray230 = new int[256];

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "Ljava/util/Random;")
	private Random aRandom3 = new Random();

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(BLjava/lang/String;Lclient!yb;)V")
	public Class1_Sub1_Sub2_Sub4_Sub1(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class48 arg2) {
		try {
			@Pc(60) Class1_Sub1_Sub3 local60 = new Class1_Sub1_Sub3(arg2.method689(arg1 + ".dat", null), true);
			if (arg0 == 7) {
				@Pc(65) boolean local65 = false;
			} else {
				this.anInt734 = 19;
			}
			@Pc(79) Class1_Sub1_Sub3 local79 = new Class1_Sub1_Sub3(arg2.method689("index.dat", null), true);
			local79.anInt766 = local60.method505() + 4;
			@Pc(90) int local90 = local79.method503();
			if (local90 > 0) {
				local79.anInt766 += (local90 - 1) * 3;
			}
			for (@Pc(104) int local104 = 0; local104 < 256; local104++) {
				this.anIntArray228[local104] = local79.method503();
				this.anIntArray229[local104] = local79.method503();
				@Pc(128) int local128 = this.anIntArray226[local104] = local79.method505();
				@Pc(136) int local136 = this.anIntArray227[local104] = local79.method505();
				@Pc(139) int local139 = local79.method503();
				@Pc(143) int local143 = local128 * local136;
				this.aByteArrayArray5[local104] = new byte[local143];
				@Pc(153) int local153;
				@Pc(178) int local178;
				if (local139 == 0) {
					for (local153 = 0; local153 < local143; local153++) {
						this.aByteArrayArray5[local104][local153] = local60.method504();
					}
				} else if (local139 == 1) {
					for (local153 = 0; local153 < local128; local153++) {
						for (local178 = 0; local178 < local136; local178++) {
							this.aByteArrayArray5[local104][local153 + local178 * local128] = local60.method504();
						}
					}
				}
				if (local136 > super.anInt732 && local104 < 128) {
					super.anInt732 = local136;
				}
				this.anIntArray228[local104] = 1;
				this.anIntArray230[local104] = local128 + 2;
				local153 = 0;
				for (local178 = local136 / 7; local178 < local136; local178++) {
					local153 += this.aByteArrayArray5[local104][local178 * local128];
				}
				@Pc(255) int local255;
				if (local153 <= local136 / 7) {
					local255 = this.anIntArray230[local104]--;
					this.anIntArray228[local104] = 0;
				}
				local153 = 0;
				for (@Pc(269) int local269 = local136 / 7; local269 < local136; local269++) {
					local153 += this.aByteArrayArray5[local104][local128 + local269 * local128 - 1];
				}
				if (local153 <= local136 / 7) {
					local255 = this.anIntArray230[local104]--;
				}
			}
			this.anIntArray230[32] = this.anIntArray230[73];
		} catch (@Pc(325) RuntimeException local325) {
			signlink.reporterror("70857, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local325.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	@Override
	public void method469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method472(arg2, arg3, arg0, arg1 - this.method471(arg2) / 2);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("97007, " + -544 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZZIILjava/lang/String;)V")
	@Override
	public void method470(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.method474(arg3, arg4, arg0 - this.method471(arg4) / 2, arg1, arg2);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("93390, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/lang/String;)I")
	@Override
	public int method471(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local12 += this.anIntArray230[arg0.charAt(local14)];
				}
			}
			return local12;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("32391, " + false + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;IIBI)V")
	@Override
	public void method472(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(11) int local11 = arg2 - super.anInt732;
				for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
					@Pc(19) char local19 = arg0.charAt(local13);
					if (local19 != ' ') {
						this.method481(this.aByteArrayArray5[local19], arg3 + this.anIntArray228[local19], local11 + this.anIntArray229[local19], this.anIntArray226[local19], this.anIntArray227[local19], arg1);
					}
					arg3 += this.anIntArray230[local19];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("55340, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 110 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	@Override
	public void method473(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg1 -= this.method471(arg0) / 2;
				@Pc(16) int local16 = arg3 - super.anInt732;
				for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
					@Pc(24) char local24 = arg0.charAt(local18);
					if (local24 != ' ') {
						this.method481(this.aByteArrayArray5[local24], arg1 + this.anIntArray228[local24], local16 + this.anIntArray229[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray226[local24], this.anIntArray227[local24], arg4);
					}
					arg1 += this.anIntArray230[local24];
				}
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("46401, " + arg0 + ", " + -794 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
	@Override
	public void method474(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean177 = false;
			@Pc(6) int local6 = arg2;
			if (arg1 != null) {
				@Pc(14) int local14 = arg0 - super.anInt732;
				for (@Pc(16) int local16 = 0; local16 < arg1.length(); local16++) {
					if (arg1.charAt(local16) == '@' && local16 + 4 < arg1.length() && arg1.charAt(local16 + 4) == '@') {
						@Pc(48) int local48 = this.method476(arg1.substring(local16 + 1, local16 + 4));
						if (local48 != -1) {
							arg4 = local48;
						}
						local16 += 4;
					} else {
						@Pc(60) char local60 = arg1.charAt(local16);
						if (local60 != ' ') {
							if (arg3) {
								this.method481(this.aByteArrayArray5[local60], arg2 + this.anIntArray228[local60] + 1, local14 + this.anIntArray229[local60] + 1, this.anIntArray226[local60], this.anIntArray227[local60], 0);
							}
							this.method481(this.aByteArrayArray5[local60], arg2 + this.anIntArray228[local60], local14 + this.anIntArray229[local60], this.anIntArray226[local60], this.anIntArray227[local60], arg4);
						}
						arg2 += this.anIntArray230[local60];
					}
				}
				if (this.aBoolean177) {
					Class1_Sub1_Sub2.method465(8388608, arg2 - local6, local6, local14 + (int) ((double) super.anInt732 * 0.7D), (byte) 2);
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("20355, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/lang/String;IIIII)V")
	@Override
	public void method475(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom3.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom3.nextInt() & 0x1F) + 192;
				@Pc(26) int local26 = 15 - super.anInt732;
				for (@Pc(28) int local28 = 0; local28 < arg0.length(); local28++) {
					if (arg0.charAt(local28) == '@' && local28 + 4 < arg0.length() && arg0.charAt(local28 + 4) == '@') {
						@Pc(60) int local60 = this.method476(arg0.substring(local28 + 1, local28 + 4));
						if (local60 != -1) {
							arg2 = local60;
						}
						local28 += 4;
					} else {
						@Pc(72) char local72 = arg0.charAt(local28);
						if (local72 != ' ') {
							this.method483(192, this.aByteArrayArray5[local72], arg4 + this.anIntArray228[local72] + 1, 0, this.anIntArray227[local72], this.anIntArray226[local72], local26 + this.anIntArray229[local72] + 1);
							this.method483(local17, this.aByteArrayArray5[local72], arg4 + this.anIntArray228[local72], arg2, this.anIntArray227[local72], this.anIntArray226[local72], local26 + this.anIntArray229[local72]);
						}
						arg4 += this.anIntArray230[local72];
						if ((this.aRandom3.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("84824, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 25755 + ", " + arg4 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)I")
	@Override
	protected int method476(@OriginalArg(1) String arg0) {
		try {
			if (arg0.equals("red")) {
				return 16711680;
			} else if (arg0.equals("gre")) {
				return 65280;
			} else if (arg0.equals("blu")) {
				return 255;
			} else if (arg0.equals("yel")) {
				return 16776960;
			} else if (arg0.equals("cya")) {
				return 65535;
			} else if (arg0.equals("mag")) {
				return 16711935;
			} else if (arg0.equals("whi")) {
				return 16777215;
			} else if (arg0.equals("bla")) {
				return 0;
			} else if (arg0.equals("lre")) {
				return 16748608;
			} else if (arg0.equals("dre")) {
				return 8388608;
			} else if (arg0.equals("dbl")) {
				return 128;
			} else if (arg0.equals("or1")) {
				return 16756736;
			} else if (arg0.equals("or2")) {
				return 16740352;
			} else if (arg0.equals("or3")) {
				return 16723968;
			} else if (arg0.equals("gr1")) {
				return 12648192;
			} else if (arg0.equals("gr2")) {
				return 8453888;
			} else if (arg0.equals("gr3")) {
				return 4259584;
			} else {
				if (arg0.equals("str")) {
					this.aBoolean177 = true;
				}
				return -1;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("69564, " + 94 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "([BIIIII)V")
	private void method481(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt721;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt721 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt723) {
			local20 = Class1_Sub1_Sub2.anInt723 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt723;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt721;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt724) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt724;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt725) {
			local20 = Class1_Sub1_Sub2.anInt725 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt725;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt726) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt726;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method482(Class1_Sub1_Sub2.anIntArray218, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "([I[BIIIIIII)V")
	private void method482(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) int local6 = -(arg5 >> 2);
		@Pc(11) int local11 = -(arg5 & 0x3);
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
			for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (@Pc(77) int local77 = local11; local77 < 0; local77++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I[BIIIIIZ)V")
	private void method483(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg6 * Class1_Sub1_Sub2.anInt721;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt721 - arg5;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg6 < Class1_Sub1_Sub2.anInt723) {
				local20 = Class1_Sub1_Sub2.anInt723 - arg6;
				arg4 -= local20;
				arg6 = Class1_Sub1_Sub2.anInt723;
				local13 = local20 * arg5 + 0;
				local5 += local20 * Class1_Sub1_Sub2.anInt721;
			}
			if (arg6 + arg4 >= Class1_Sub1_Sub2.anInt724) {
				arg4 -= arg6 + arg4 + 1 - Class1_Sub1_Sub2.anInt724;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt725) {
				local20 = Class1_Sub1_Sub2.anInt725 - arg2;
				arg5 -= local20;
				arg2 = Class1_Sub1_Sub2.anInt725;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg2 + arg5 >= Class1_Sub1_Sub2.anInt726) {
				local20 = arg2 + arg5 + 1 - Class1_Sub1_Sub2.anInt726;
				arg5 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg5 > 0 && arg4 > 0) {
				this.method484(local11, arg3, Class1_Sub1_Sub2.anIntArray218, arg5, local13, arg1, arg4, local9, arg0, local5);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("51724, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + true + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(III[III[BIIII)V")
	private void method484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg1 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg8 & 0xFF0000) >> 8;
			@Pc(26) int local26 = 256 - arg8;
			for (@Pc(29) int local29 = -arg6; local29 < 0; local29++) {
				for (@Pc(34) int local34 = -arg3; local34 < 0; local34++) {
					if (arg5[arg4++] == 0) {
						arg9++;
					} else {
						@Pc(45) int local45 = arg2[arg9];
						arg2[arg9++] = (((local45 & 0xFF00FF) * local26 & 0xFF00FF00) + ((local45 & 0xFF00) * local26 & 0xFF0000) >> 8) + local19;
					}
				}
				arg9 += arg7;
				arg4 += arg0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("81248, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
