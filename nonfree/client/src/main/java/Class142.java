import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class142 {

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
	public int anInt2931;

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
	public int anInt2933;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
	public int anInt2936;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
	private int anInt2937;

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
	private int anInt2942;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!efa;")
	private Class90 aClass90_9;

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
	private int anInt2948;

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
	public int anInt2949;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "[I")
	public int[] anIntArray244;

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
	public int anInt2951;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
	public int anInt2952;

	@OriginalMember(owner = "client!hh", name = "C", descriptor = "Lclient!wf;")
	public Class360 aClass360_2;

	@OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
	private int anInt2956;

	@OriginalMember(owner = "client!hh", name = "H", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	public int anInt2934 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
	private int anInt2954 = -1;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
	private int anInt2935 = -1;

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
	public int anInt2946 = -1;

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
	private int anInt2947 = -1;

	@OriginalMember(owner = "client!hh", name = "E", descriptor = "Z")
	public boolean aBoolean210 = true;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
	public int anInt2958 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
	private int anInt2939 = -1;

	@OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
	public int anInt2955 = 0;

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Z")
	public boolean aBoolean209 = false;

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
	public int anInt2944 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	public int anInt2957 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!hh", name = "L", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray19 = new String[5];

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
	private int anInt2940 = -1;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "Z")
	public boolean aBoolean211 = true;

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
	public int anInt2950 = -1;

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
	public int anInt2961 = -1;

	@OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
	public int anInt2962 = -1;

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "Z")
	public boolean aBoolean212 = true;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLclient!r;)Lclient!f;")
	public Class38 method2515(@OriginalArg(1) Class162 arg0) {
		@Pc(20) Class38 local20 = (Class38) this.aClass360_2.aClass21_98.method324((long) (arg0.anInt8492 << 29 | 0x20000 | this.anInt2947));
		if (local20 != null) {
			return local20;
		}
		this.aClass360_2.aClass229_129.method4954(this.anInt2947);
		@Pc(48) Class344 local48 = Static603.method7117(this.aClass360_2.aClass229_129, this.anInt2947, 0);
		if (local48 != null) {
			local20 = arg0.method6845(local48, true);
			this.aClass360_2.aClass21_98.method317(local20, (long) (this.anInt2947 | 0x20000 | arg0.anInt8492 << 29));
		}
		return local20;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!gk;)V")
	public void method2516(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method4464();
			if (local12 == 0) {
				return;
			}
			this.method2524(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public void method2517() {
		if (this.anIntArray244 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray244.length; local14 += 2) {
			if (this.anIntArray244[local14] < this.anInt2957) {
				this.anInt2957 = this.anIntArray244[local14];
			} else if (this.anIntArray244[local14] > this.anInt2934) {
				this.anInt2934 = this.anIntArray244[local14];
			}
			if (this.anInt2958 > this.anIntArray244[local14 + 1]) {
				this.anInt2958 = this.anIntArray244[local14 + 1];
			} else if (this.anInt2944 < this.anIntArray244[local14 + 1]) {
				this.anInt2944 = this.anIntArray244[local14 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method2520(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass90_9 == null) {
			return arg1;
		} else {
			@Pc(24) Class2_Sub17 local24 = (Class2_Sub17) this.aClass90_9.method1685((long) arg0);
			return local24 == null ? arg1 : local24.aString37;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!uaa;I)Z")
	public boolean method2521(@OriginalArg(0) Interface23 arg0) {
		@Pc(23) int local23;
		if (this.anInt2940 == -1) {
			if (this.anInt2935 == -1) {
				return true;
			}
			local23 = arg0.method2781(this.anInt2935);
		} else {
			local23 = arg0.method2780(this.anInt2940);
		}
		if (this.anInt2937 > local23 || local23 > this.anInt2956) {
			return false;
		}
		@Pc(62) int local62;
		if (this.anInt2939 == -1) {
			if (this.anInt2954 == -1) {
				return true;
			}
			local62 = arg0.method2781(this.anInt2954);
		} else {
			local62 = arg0.method2780(this.anInt2939);
		}
		return this.anInt2948 <= local62 && this.anInt2942 >= local62;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)I")
	public int method2522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass90_9 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub44 local21 = (Class2_Sub44) this.aClass90_9.method1685((long) arg1);
			return local21 == null ? arg0 : local21.anInt7748;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZILclient!r;)Lclient!f;")
	public Class38 method2523(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class162 arg1) {
		@Pc(16) int local16 = arg0 ? this.anInt2946 : this.anInt2961;
		@Pc(23) int local23 = local16 | arg1.anInt8492 << 29;
		@Pc(32) Class38 local32 = (Class38) this.aClass360_2.aClass21_98.method324((long) local23);
		if (local32 != null) {
			return local32;
		} else if (this.aClass360_2.aClass229_129.method4954(local16)) {
			@Pc(52) Class344 local52 = Static603.method7117(this.aClass360_2.aClass229_129, local16, 0);
			if (local52 != null) {
				local32 = arg1.method6845(local52, true);
				this.aClass360_2.aClass21_98.method317(local32, (long) local23);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILclient!gk;)V")
	private void method2524(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt2961 = arg1.method4518();
		} else if (arg0 == 2) {
			this.anInt2946 = arg1.method4518();
		} else if (arg0 == 3) {
			this.aString42 = arg1.method4494();
		} else if (arg0 == 4) {
			this.anInt2949 = arg1.method4503();
		} else if (arg0 == 5) {
			this.anInt2950 = arg1.method4503();
		} else if (arg0 == 6) {
			this.anInt2955 = arg1.method4464();
		} else {
			@Pc(77) int local77;
			if (arg0 == 7) {
				local77 = arg1.method4464();
				if ((local77 & 0x2) == 2) {
					this.aBoolean209 = true;
				}
				if ((local77 & 0x1) == 0) {
					this.aBoolean210 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean212 = arg1.method4464() == 1;
			} else if (arg0 == 9) {
				this.anInt2935 = arg1.method4518();
				if (this.anInt2935 == 65535) {
					this.anInt2935 = -1;
				}
				this.anInt2940 = arg1.method4518();
				if (this.anInt2940 == 65535) {
					this.anInt2940 = -1;
				}
				this.anInt2937 = arg1.method4509();
				this.anInt2956 = arg1.method4509();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray19[arg0 - 10] = arg1.method4494();
			} else {
				@Pc(85) int local85;
				if (arg0 == 15) {
					local77 = arg1.method4464();
					this.anIntArray244 = new int[local77 * 2];
					for (local85 = 0; local85 < local77 * 2; local85++) {
						this.anIntArray244[local85] = arg1.method4478();
					}
					this.anInt2952 = arg1.method4509();
					this.anInt2951 = arg1.method4509();
				} else if (arg0 == 16) {
					this.aBoolean211 = false;
				} else if (arg0 == 17) {
					this.aString41 = arg1.method4494();
				} else if (arg0 == 18) {
					this.anInt2947 = arg1.method4518();
				} else if (arg0 == 19) {
					this.anInt2962 = arg1.method4518();
				} else if (arg0 == 20) {
					this.anInt2954 = arg1.method4518();
					if (this.anInt2954 == 65535) {
						this.anInt2954 = -1;
					}
					this.anInt2939 = arg1.method4518();
					if (this.anInt2939 == 65535) {
						this.anInt2939 = -1;
					}
					this.anInt2948 = arg1.method4509();
					this.anInt2942 = arg1.method4509();
				} else if (arg0 == 21) {
					this.anInt2931 = arg1.method4509();
				} else if (arg0 == 22) {
					this.anInt2936 = arg1.method4509();
				} else if (arg0 == 249) {
					local77 = arg1.method4464();
					if (this.aClass90_9 == null) {
						local85 = Static355.method5078(local77);
						this.aClass90_9 = new Class90(local85);
					}
					for (local85 = 0; local85 < local77; local85++) {
						@Pc(234) boolean local234 = arg1.method4464() == 1;
						@Pc(238) int local238 = arg1.method4503();
						@Pc(247) Class2 local247;
						if (local234) {
							local247 = new Class2_Sub17(arg1.method4494());
						} else {
							local247 = new Class2_Sub44(arg1.method4509());
						}
						this.aClass90_9.method1684(local247, (long) local238);
					}
				}
			}
		}
	}
}
