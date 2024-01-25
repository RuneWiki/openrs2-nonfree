import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class345 {

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "Lclient!faa;")
	private Class91 aClass91_37;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "[I")
	public int[] anIntArray580;

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
	public int anInt9165;

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "I")
	public int anInt9167;

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
	private int anInt9168;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
	public int anInt9169;

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "Ljava/lang/String;")
	public String aString100;

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "Lclient!ge;")
	public Class113 aClass113_4;

	@OriginalMember(owner = "client!vda", name = "t", descriptor = "I")
	public int anInt9176;

	@OriginalMember(owner = "client!vda", name = "v", descriptor = "I")
	private int anInt9178;

	@OriginalMember(owner = "client!vda", name = "w", descriptor = "I")
	private int anInt9179;

	@OriginalMember(owner = "client!vda", name = "x", descriptor = "I")
	private int anInt9180;

	@OriginalMember(owner = "client!vda", name = "K", descriptor = "I")
	public int anInt9191;

	@OriginalMember(owner = "client!vda", name = "M", descriptor = "I")
	public int anInt9193;

	@OriginalMember(owner = "client!vda", name = "Q", descriptor = "Ljava/lang/String;")
	public String aString101;

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
	private int anInt9163 = -1;

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "I")
	public int anInt9174 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vda", name = "r", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray38 = new String[5];

	@OriginalMember(owner = "client!vda", name = "H", descriptor = "Z")
	public boolean aBoolean685 = true;

	@OriginalMember(owner = "client!vda", name = "B", descriptor = "Z")
	public boolean aBoolean684 = true;

	@OriginalMember(owner = "client!vda", name = "E", descriptor = "I")
	private int anInt9186 = -1;

	@OriginalMember(owner = "client!vda", name = "z", descriptor = "I")
	public int anInt9182 = -1;

	@OriginalMember(owner = "client!vda", name = "y", descriptor = "I")
	public int anInt9181 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vda", name = "G", descriptor = "I")
	public int anInt9188 = -1;

	@OriginalMember(owner = "client!vda", name = "S", descriptor = "I")
	private int anInt9196 = -1;

	@OriginalMember(owner = "client!vda", name = "O", descriptor = "Z")
	public boolean aBoolean686 = true;

	@OriginalMember(owner = "client!vda", name = "P", descriptor = "I")
	public int anInt9195 = -1;

	@OriginalMember(owner = "client!vda", name = "N", descriptor = "I")
	public int anInt9194 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!vda", name = "U", descriptor = "I")
	public int anInt9198 = -1;

	@OriginalMember(owner = "client!vda", name = "T", descriptor = "I")
	private int anInt9197 = -1;

	@OriginalMember(owner = "client!vda", name = "W", descriptor = "I")
	public int anInt9200 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!vda", name = "p", descriptor = "I")
	public int anInt9173 = 0;

	@OriginalMember(owner = "client!vda", name = "V", descriptor = "I")
	private int anInt9199 = -1;

	@OriginalMember(owner = "client!vda", name = "Y", descriptor = "Z")
	public boolean aBoolean687 = false;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZLclient!r;)Lclient!f;")
	public Class5 method7481(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class78 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt9188 : this.anInt9195;
		@Pc(18) int local18 = arg1.anInt8385 << 29 | local11;
		@Pc(27) Class5 local27 = (Class5) this.aClass113_4.aClass207_14.method4390((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass113_4.aClass308_63.method6538(local11)) {
			@Pc(47) Class282 local47 = Static604.method6027(this.aClass113_4.aClass308_63, local11, 0);
			if (local47 != null) {
				local27 = arg1.method6838(local47, true);
				this.aClass113_4.aClass207_14.method4391((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILclient!r;)Lclient!f;")
	public Class5 method7483(@OriginalArg(1) Class78 arg0) {
		@Pc(28) Class5 local28 = (Class5) this.aClass113_4.aClass207_14.method4390((long) (arg0.anInt8385 << 29 | 0x20000 | this.anInt9163));
		if (local28 != null) {
			return local28;
		}
		this.aClass113_4.aClass308_63.method6538(this.anInt9163);
		@Pc(48) Class282 local48 = Static604.method6027(this.aClass113_4.aClass308_63, this.anInt9163, 0);
		if (local48 != null) {
			local28 = arg0.method6838(local48, true);
			this.aClass113_4.aClass207_14.method4391((long) (arg0.anInt8385 << 29 | this.anInt9163 | 0x20000), local28);
		}
		return local28;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method7485(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass91_37 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub44 local16 = (Class1_Sub44) this.aClass91_37.method2271((long) arg0);
			return local16 == null ? arg1 : local16.aString91;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!nf;I)Z")
	public boolean method7486(@OriginalArg(0) Interface17 arg0) {
		@Pc(23) int local23;
		if (this.anInt9196 == -1) {
			if (this.anInt9186 == -1) {
				return true;
			}
			local23 = arg0.method7619(this.anInt9186);
		} else {
			local23 = arg0.method7618(this.anInt9196);
		}
		if (this.anInt9178 > local23 || this.anInt9168 < local23) {
			return false;
		}
		@Pc(58) int local58;
		if (this.anInt9199 == -1) {
			if (this.anInt9197 == -1) {
				return true;
			}
			local58 = arg0.method7619(this.anInt9197);
		} else {
			local58 = arg0.method7618(this.anInt9199);
		}
		return local58 >= this.anInt9180 && this.anInt9179 >= local58;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IILclient!ac;)V")
	private void method7487(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt9195 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anInt9188 = arg1.method7945();
		} else if (arg0 == 3) {
			this.aString101 = arg1.method7951();
		} else if (arg0 == 4) {
			this.anInt9169 = arg1.method7919();
		} else if (arg0 == 5) {
			this.anInt9182 = arg1.method7919();
		} else if (arg0 == 6) {
			this.anInt9173 = arg1.method7974();
		} else {
			@Pc(47) int local47;
			if (arg0 == 7) {
				local47 = arg1.method7974();
				if ((local47 & 0x2) == 2) {
					this.aBoolean687 = true;
				}
				if ((local47 & 0x1) == 0) {
					this.aBoolean685 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean684 = arg1.method7974() == 1;
			} else if (arg0 == 9) {
				this.anInt9186 = arg1.method7945();
				if (this.anInt9186 == 65535) {
					this.anInt9186 = -1;
				}
				this.anInt9196 = arg1.method7945();
				if (this.anInt9196 == 65535) {
					this.anInt9196 = -1;
				}
				this.anInt9178 = arg1.method7940();
				this.anInt9168 = arg1.method7940();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray38[arg0 - 10] = arg1.method7951();
			} else {
				@Pc(109) int local109;
				if (arg0 == 15) {
					local47 = arg1.method7974();
					this.anIntArray580 = new int[local47 * 2];
					for (local109 = 0; local109 < local47 * 2; local109++) {
						this.anIntArray580[local109] = arg1.method7975();
					}
					this.anInt9165 = arg1.method7940();
					this.anInt9176 = arg1.method7940();
				} else if (arg0 == 16) {
					this.aBoolean686 = false;
				} else if (arg0 == 17) {
					this.aString100 = arg1.method7951();
				} else if (arg0 == 18) {
					this.anInt9163 = arg1.method7945();
				} else if (arg0 == 19) {
					this.anInt9198 = arg1.method7945();
				} else if (arg0 == 20) {
					this.anInt9197 = arg1.method7945();
					if (this.anInt9197 == 65535) {
						this.anInt9197 = -1;
					}
					this.anInt9199 = arg1.method7945();
					if (this.anInt9199 == 65535) {
						this.anInt9199 = -1;
					}
					this.anInt9180 = arg1.method7940();
					this.anInt9179 = arg1.method7940();
				} else if (arg0 == 21) {
					this.anInt9193 = arg1.method7940();
				} else if (arg0 == 22) {
					this.anInt9167 = arg1.method7940();
				} else if (arg0 == 249) {
					local47 = arg1.method7974();
					if (this.aClass91_37 == null) {
						local109 = Static122.method2187(local47);
						this.aClass91_37 = new Class91(local109);
					}
					for (local109 = 0; local109 < local47; local109++) {
						@Pc(265) boolean local265 = arg1.method7974() == 1;
						@Pc(269) int local269 = arg1.method7919();
						@Pc(278) Class1 local278;
						if (local265) {
							local278 = new Class1_Sub44(arg1.method7951());
						} else {
							local278 = new Class1_Sub27(arg1.method7940());
						}
						this.aClass91_37.method2269((long) local269, local278);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
	public void method7488() {
		if (this.anIntArray580 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray580.length; local10 += 2) {
			if (this.anInt9174 > this.anIntArray580[local10]) {
				this.anInt9174 = this.anIntArray580[local10];
			} else if (this.anInt9200 < this.anIntArray580[local10]) {
				this.anInt9200 = this.anIntArray580[local10];
			}
			if (this.anIntArray580[local10 + 1] < this.anInt9194) {
				this.anInt9194 = this.anIntArray580[local10 + 1];
			} else if (this.anIntArray580[local10 + 1] > this.anInt9181) {
				this.anInt9181 = this.anIntArray580[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!ac;B)V")
	public void method7490(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method7974();
			if (local14 == 0) {
				return;
			}
			this.method7487(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIB)I")
	public int method7491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass91_37 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub27 local16 = (Class1_Sub27) this.aClass91_37.method2271((long) arg0);
			return local16 == null ? arg1 : local16.anInt3348;
		}
	}
}
