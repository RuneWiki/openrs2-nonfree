import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public int anInt98;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public int anInt106;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
	public int anInt109;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
	private int anInt120;

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
	public int anInt121;

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "Lclient!vg;")
	private Class252 aClass252_1;

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "Lclient!bw;")
	public Class28 aClass28_1;

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
	public int anInt126;

	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
	private int anInt128;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
	private int anInt130;

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "[I")
	public int[] anIntArray8;

	@OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
	public int anInt100 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	public int anInt102 = -1;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
	private int anInt104 = -1;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
	public int anInt97 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
	private int anInt108 = -1;

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
	private int anInt112 = -1;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "Z")
	public boolean aBoolean25 = true;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
	public int anInt117 = -1;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "Z")
	public boolean aBoolean24 = false;

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
	public int anInt119 = 0;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
	public int anInt116 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
	public int anInt127 = -1;

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	public int anInt118 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "Z")
	public boolean aBoolean26 = true;

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	public int anInt129 = -1;

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
	private int anInt123 = -1;

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "Z")
	public boolean aBoolean27 = true;

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	private int anInt105 = -1;

	@OriginalMember(owner = "client!ae", name = "O", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray2 = new String[5];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZILclient!za;)Lclient!o;")
	public Class49 method84(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class200 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt127 : this.anInt102;
		@Pc(18) int local18 = arg1.anInt7330 << 29 | local11;
		@Pc(27) Class49 local27 = (Class49) this.aClass28_1.aClass44_5.method1028((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass28_1.aClass243_36.method5463(local11)) {
			@Pc(47) Class214 local47 = Static470.method4672(this.aClass28_1.aClass243_36, local11, 0);
			if (local47 != null) {
				local27 = arg1.method5871(local47);
				this.aClass28_1.aClass44_5.method1017((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZII)I")
	public int method85(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass252_1 == null) {
			return arg0;
		} else {
			@Pc(16) Class5_Sub34 local16 = (Class5_Sub34) this.aClass252_1.method5659((long) arg1);
			return local16 == null ? arg0 : local16.anInt5642;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!fh;I)V")
	public void method86(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5539();
			if (local5 == 0) {
				return;
			}
			this.method90(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method88(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass252_1 == null) {
			return arg1;
		} else {
			@Pc(16) Class5_Sub13 local16 = (Class5_Sub13) this.aClass252_1.method5659((long) arg0);
			return local16 == null ? arg1 : local16.aString11;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!za;)Lclient!o;")
	public Class49 method89(@OriginalArg(1) Class200 arg0) {
		@Pc(20) Class49 local20 = (Class49) this.aClass28_1.aClass44_5.method1028((long) (this.anInt112 | 0x20000 | arg0.anInt7330 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass28_1.aClass243_36.method5463(this.anInt112);
		@Pc(48) Class214 local48 = Static470.method4672(this.aClass28_1.aClass243_36, this.anInt112, 0);
		if (local48 != null) {
			local20 = arg0.method5871(local48);
			this.aClass28_1.aClass44_5.method1017((long) (this.anInt112 | 0x20000 | arg0.anInt7330 << 29), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method90(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt102 = arg0.method5598();
		} else if (arg1 == 2) {
			this.anInt127 = arg0.method5598();
		} else if (arg1 == 3) {
			this.aString1 = arg0.method5549();
		} else if (arg1 == 4) {
			this.anInt98 = arg0.method5541();
		} else if (arg1 == 5) {
			this.anInt117 = arg0.method5541();
		} else if (arg1 == 6) {
			this.anInt119 = arg0.method5539();
		} else {
			@Pc(51) int local51;
			if (arg1 == 7) {
				local51 = arg0.method5539();
				if ((local51 & 0x2) == 2) {
					this.aBoolean24 = true;
				}
				if ((local51 & 0x1) == 0) {
					this.aBoolean25 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean27 = arg0.method5539() == 1;
			} else if (arg1 == 9) {
				this.anInt104 = arg0.method5598();
				if (this.anInt104 == 65535) {
					this.anInt104 = -1;
				}
				this.anInt108 = arg0.method5598();
				if (this.anInt108 == 65535) {
					this.anInt108 = -1;
				}
				this.anInt128 = arg0.method5603();
				this.anInt134 = arg0.method5603();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray2[arg1 - 10] = arg0.method5549();
			} else {
				@Pc(236) int local236;
				if (arg1 == 15) {
					local51 = arg0.method5539();
					this.anIntArray8 = new int[local51 * 2];
					for (local236 = 0; local236 < local51 * 2; local236++) {
						this.anIntArray8[local236] = arg0.method5586();
					}
					this.anInt106 = arg0.method5603();
					this.anInt121 = arg0.method5603();
				} else if (arg1 == 16) {
					this.aBoolean26 = false;
				} else if (arg1 == 17) {
					this.aString2 = arg0.method5549();
				} else if (arg1 == 18) {
					this.anInt112 = arg0.method5598();
				} else if (arg1 == 19) {
					this.anInt129 = arg0.method5598();
				} else if (arg1 == 20) {
					this.anInt105 = arg0.method5598();
					if (this.anInt105 == 65535) {
						this.anInt105 = -1;
					}
					this.anInt123 = arg0.method5598();
					if (this.anInt123 == 65535) {
						this.anInt123 = -1;
					}
					this.anInt130 = arg0.method5603();
					this.anInt120 = arg0.method5603();
				} else if (arg1 == 21) {
					this.anInt109 = arg0.method5603();
				} else if (arg1 == 22) {
					this.anInt126 = arg0.method5603();
				} else if (arg1 == 249) {
					local51 = arg0.method5539();
					if (this.aClass252_1 == null) {
						local236 = Static331.method4084(local51);
						this.aClass252_1 = new Class252(local236);
					}
					for (local236 = 0; local236 < local51; local236++) {
						@Pc(255) boolean local255 = arg0.method5539() == 1;
						@Pc(259) int local259 = arg0.method5541();
						@Pc(268) Class5 local268;
						if (local255) {
							local268 = new Class5_Sub13(arg0.method5549());
						} else {
							local268 = new Class5_Sub34(arg0.method5603());
						}
						this.aClass252_1.method5658(local268, (long) local259);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public void method91() {
		if (this.anIntArray8 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray8.length; local10 += 2) {
			if (this.anInt116 > this.anIntArray8[local10]) {
				this.anInt116 = this.anIntArray8[local10];
			} else if (this.anIntArray8[local10] > this.anInt118) {
				this.anInt118 = this.anIntArray8[local10];
			}
			if (this.anInt97 > this.anIntArray8[local10 + 1]) {
				this.anInt97 = this.anIntArray8[local10 + 1];
			} else if (this.anIntArray8[local10 + 1] > this.anInt100) {
				this.anInt100 = this.anIntArray8[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!mc;)Z")
	public boolean method92(@OriginalArg(1) Interface9 arg0) {
		@Pc(15) int local15;
		if (this.anInt108 == -1) {
			if (this.anInt104 == -1) {
				return true;
			}
			local15 = arg0.method959(this.anInt104);
		} else {
			local15 = arg0.method958(this.anInt108);
		}
		if (local15 < this.anInt128 || this.anInt134 < local15) {
			return false;
		}
		@Pc(66) int local66;
		if (this.anInt123 == -1) {
			if (this.anInt105 == -1) {
				return true;
			}
			local66 = arg0.method959(this.anInt105);
		} else {
			local66 = arg0.method958(this.anInt123);
		}
		return this.anInt130 <= local66 && this.anInt120 >= local66;
	}
}
