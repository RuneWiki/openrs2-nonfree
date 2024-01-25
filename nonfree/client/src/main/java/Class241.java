import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class241 {

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljava/lang/Object;")
	private Object anObject13;

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
	private int anInt6125;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!qn;")
	private Class313 aClass313_30;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
	private int anInt6134;

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Ljava/lang/String;")
	private String aString81 = "null";

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBLclient!ika;)V")
	private void method5328(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static309.method4582(arg1.method2022());
		} else if (arg0 == 2) {
			this.aChar4 = Static309.method4582(arg1.method2022());
		} else if (arg0 == 3) {
			this.aString81 = arg1.method2014();
		} else if (arg0 == 4) {
			this.anInt6134 = arg1.method2036();
		} else {
			@Pc(83) int local83;
			if (arg0 == 5 || arg0 == 6) {
				this.anInt6125 = arg1.method2028(-14795);
				@Pc(172) Class313 local172 = new Class313(Static92.method1941(this.anInt6125));
				for (@Pc(174) int local174 = 0; local174 < this.anInt6125; local174++) {
					local83 = arg1.method2036();
					@Pc(192) Class3 local192;
					if (arg0 == 5) {
						local192 = new Class3_Sub40(arg1.method2014());
					} else {
						local192 = new Class3_Sub44(arg1.method2036());
					}
					local172.method7107((long) local83, local192);
				}
				this.anObject13 = local172;
			} else {
				@Pc(73) int local73;
				@Pc(89) int local89;
				if (arg0 == 7) {
					local73 = arg1.method2028(-14795);
					this.anInt6125 = arg1.method2028(-14795);
					@Pc(81) String[] local81 = new String[local73];
					for (local83 = 0; local83 < this.anInt6125; local83++) {
						local89 = arg1.method2028(-14795);
						local81[local89] = arg1.method2014();
					}
					this.anObject13 = local81;
				} else if (arg0 == 8) {
					local73 = arg1.method2028(-14795);
					this.anInt6125 = arg1.method2028(-14795);
					@Pc(130) Integer[] local130 = new Integer[local73];
					for (local83 = 0; local83 < this.anInt6125; local83++) {
						local89 = arg1.method2028(-14795);
						local130[local89] = Integer.valueOf(arg1.method2036());
					}
					this.anObject13 = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)Lclient!dg;")
	public Class3_Sub18 method5329(@OriginalArg(1) int arg0) {
		if (this.anObject13 == null) {
			return null;
		} else {
			if (this.aClass313_30 == null) {
				this.method5337();
			}
			return (Class3_Sub18) this.aClass313_30.method7104((long) arg0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5330(@OriginalArg(0) String arg0) {
		if (this.anObject13 == null) {
			return false;
		}
		if (this.aClass313_30 == null) {
			this.method5335();
		}
		for (@Pc(34) Class3_Sub24 local34 = (Class3_Sub24) this.aClass313_30.method7104(Static210.method3149(arg0)); local34 != null; local34 = (Class3_Sub24) this.aClass313_30.method7106()) {
			if (local34.aString49.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method5331(@OriginalArg(1) int arg0) {
		if (this.anObject13 == null) {
			return this.aString81;
		} else if (this.anObject13 instanceof Class313) {
			@Pc(64) Class3_Sub40 local64 = (Class3_Sub40) ((Class313) this.anObject13).method7104((long) arg0);
			return local64 == null ? this.aString81 : local64.aString78;
		} else {
			@Pc(24) String[] local24 = (String[]) this.anObject13;
			if (arg0 >= 0 && local24.length > arg0) {
				@Pc(47) String local47 = local24[arg0];
				return local47 == null ? this.aString81 : local47;
			} else {
				return this.aString81;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ika;)V")
	public void method5333(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2048(255);
			if (local7 == 0) {
				return;
			}
			this.method5328(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(II)I")
	public int method5334(@OriginalArg(0) int arg0) {
		if (this.anObject13 == null) {
			return this.anInt6134;
		} else if (this.anObject13 instanceof Class313) {
			@Pc(61) Class3_Sub44 local61 = (Class3_Sub44) ((Class313) this.anObject13).method7104((long) arg0);
			return local61 == null ? this.anInt6134 : local61.anInt7298;
		} else {
			@Pc(23) Integer[] local23 = (Integer[]) this.anObject13;
			if (arg0 >= 0 && arg0 < local23.length) {
				@Pc(43) Integer local43 = local23[arg0];
				return local43 == null ? this.anInt6134 : local43;
			} else {
				return this.anInt6134;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
	private void method5335() {
		@Pc(60) Class3_Sub24 local60;
		if (this.anObject13 instanceof Class313) {
			@Pc(226) Class313 local226 = (Class313) this.anObject13;
			this.aClass313_30 = new Class313(local226.method7102());
			@Pc(241) Class313 local241 = new Class313(local226.method7102());
			for (@Pc(246) Class3_Sub40 local246 = (Class3_Sub40) local226.method7103(); local246 != null; local246 = (Class3_Sub40) local226.method7110()) {
				@Pc(253) long local253 = Static210.method3149(local246.aString78);
				@Pc(259) Class3_Sub24 local259;
				for (local259 = (Class3_Sub24) local241.method7104(local253); local259 != null && !local259.aString49.equals(local246.aString78); local259 = (Class3_Sub24) local241.method7106()) {
				}
				if (local259 == null) {
					local259 = new Class3_Sub24(local246.aString78, 0);
					local241.method7107(local253, local259);
				}
				local259.anInt3131++;
			}
			for (@Pc(312) Class3_Sub40 local312 = (Class3_Sub40) local226.method7103(); local312 != null; local312 = (Class3_Sub40) local226.method7110()) {
				@Pc(319) long local319 = Static210.method3149(local312.aString78);
				@Pc(326) Class3_Sub6 local326;
				for (local326 = (Class3_Sub6) this.aClass313_30.method7104(local319); local326 != null && !local326.aString5.equals(local312.aString78); local326 = (Class3_Sub6) this.aClass313_30.method7106()) {
				}
				for (local60 = (Class3_Sub24) local241.method7104(local319); local60 != null && !local60.aString49.equals(local312.aString78); local60 = (Class3_Sub24) local241.method7106()) {
				}
				@Pc(379) int local379 = local60.anInt3131--;
				if (local326 == null) {
					local326 = new Class3_Sub6(local312.aString78, local379);
					this.aClass313_30.method7107(local319, local326);
				}
				local326.anIntArray49[local326.anIntArray49.length - local379] = (int) local312.aLong345;
			}
			return;
		}
		@Pc(20) String[] local20 = (String[]) this.anObject13;
		@Pc(25) int local25 = Static92.method1941(local20.length);
		this.aClass313_30 = new Class313(local25);
		@Pc(36) Class313 local36 = new Class313(local25);
		for (@Pc(38) int local38 = 0; local38 < local20.length; local38++) {
			if (local20[local38] != null) {
				@Pc(50) String local50 = local20[local38];
				@Pc(54) long local54 = Static210.method3149(local50);
				for (local60 = (Class3_Sub24) local36.method7104(local54); local60 != null && !local60.aString49.equals(local50); local60 = (Class3_Sub24) local36.method7106()) {
				}
				if (local60 == null) {
					local60 = new Class3_Sub24(local50, 0);
					local36.method7107(local54, local60);
				}
				local60.anInt3131++;
			}
		}
		for (@Pc(110) int local110 = 0; local110 < local20.length; local110++) {
			if (local20[local110] != null) {
				@Pc(124) String local124 = local20[local110];
				@Pc(128) long local128 = Static210.method3149(local124);
				@Pc(135) Class3_Sub6 local135;
				for (local135 = (Class3_Sub6) this.aClass313_30.method7104(local128); local135 != null && !local135.aString5.equals(local124); local135 = (Class3_Sub6) this.aClass313_30.method7106()) {
				}
				@Pc(158) Class3_Sub24 local158;
				for (local158 = (Class3_Sub24) local36.method7104(local128); local158 != null && !local158.aString49.equals(local124); local158 = (Class3_Sub24) local36.method7106()) {
				}
				@Pc(186) int local186 = local158.anInt3131--;
				if (local135 == null) {
					local135 = new Class3_Sub6(local124, local186);
					this.aClass313_30.method7107(local128, local135);
				}
				local135.anIntArray49[local135.anIntArray49.length - local186] = local110;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLjava/lang/String;)Lclient!ala;")
	public Class3_Sub6 method5336(@OriginalArg(1) String arg0) {
		if (this.anObject13 == null) {
			return null;
		}
		if (this.aClass313_30 == null) {
			this.method5335();
		}
		@Pc(34) Class3_Sub6 local34;
		for (local34 = (Class3_Sub6) this.aClass313_30.method7104(Static210.method3149(arg0)); local34 != null && !local34.aString5.equals(arg0); local34 = (Class3_Sub6) this.aClass313_30.method7106()) {
		}
		return local34;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V")
	private void method5337() {
		@Pc(100) int local100;
		if (this.anObject13 instanceof Class313) {
			@Pc(161) Class313 local161 = (Class313) this.anObject13;
			this.aClass313_30 = new Class313(local161.method7102());
			@Pc(176) Class313 local176 = new Class313(local161.method7102());
			@Pc(195) Class3_Sub44 local195;
			for (@Pc(183) Class3_Sub44 local183 = (Class3_Sub44) local161.method7103(); local183 != null; local183 = (Class3_Sub44) local161.method7110()) {
				local195 = (Class3_Sub44) local176.method7104((long) local183.anInt7298);
				if (local195 == null) {
					local195 = new Class3_Sub44(0);
					local176.method7107((long) local183.anInt7298, local195);
				}
				local195.anInt7298++;
			}
			for (local195 = (Class3_Sub44) local161.method7103(); local195 != null; local195 = (Class3_Sub44) local161.method7110()) {
				@Pc(242) Class3_Sub18 local242 = (Class3_Sub18) this.aClass313_30.method7104((long) local195.anInt7298);
				local100 = ((Class3_Sub44) local176.method7104((long) local195.anInt7298)).anInt7298--;
				if (local242 == null) {
					local242 = new Class3_Sub18(local100);
					this.aClass313_30.method7107((long) local195.anInt7298, local242);
				}
				local242.anIntArray130[local242.anIntArray130.length - local100] = (int) local195.aLong345;
			}
			return;
		}
		@Pc(21) Integer[] local21 = (Integer[]) this.anObject13;
		@Pc(26) int local26 = Static92.method1941(local21.length);
		this.aClass313_30 = new Class313(local26);
		@Pc(37) Class313 local37 = new Class313(local26);
		@Pc(52) int local52;
		for (@Pc(39) int local39 = 0; local39 < local21.length; local39++) {
			if (local21[local39] != null) {
				local52 = local21[local39];
				@Pc(59) Class3_Sub44 local59 = (Class3_Sub44) local37.method7104((long) local52);
				if (local59 == null) {
					local59 = new Class3_Sub44(0);
					local37.method7107((long) local52, local59);
				}
				local59.anInt7298++;
			}
		}
		for (local52 = 0; local52 < local21.length; local52++) {
			if (local21[local52] != null) {
				local100 = local21[local52];
				@Pc(108) Class3_Sub18 local108 = (Class3_Sub18) this.aClass313_30.method7104((long) local100);
				@Pc(121) int local121 = ((Class3_Sub44) local37.method7104((long) local100)).anInt7298--;
				if (local108 == null) {
					local108 = new Class3_Sub18(local121);
					this.aClass313_30.method7107((long) local100, local108);
				}
				local108.anIntArray130[local108.anIntArray130.length - local121] = local52;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)I")
	public int method5338() {
		return this.anInt6125;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)Z")
	public boolean method5339(@OriginalArg(0) int arg0) {
		if (this.anObject13 == null) {
			return false;
		} else {
			if (this.aClass313_30 == null) {
				this.method5337();
			}
			return this.aClass313_30.method7104((long) arg0) != null;
		}
	}
}
