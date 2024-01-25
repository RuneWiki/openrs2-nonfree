import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hha")
public final class Class158 {

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "Lclient!cba;")
	public Class51 aClass51_2;

	@OriginalMember(owner = "client!hha", name = "i", descriptor = "Ljava/lang/String;")
	private String aString51 = "";

	@OriginalMember(owner = "client!hha", name = "o", descriptor = "I")
	private int anInt4087 = -1;

	@OriginalMember(owner = "client!hha", name = "r", descriptor = "I")
	public int anInt4090 = -1;

	@OriginalMember(owner = "client!hha", name = "e", descriptor = "I")
	public int anInt4078 = 0;

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
	private int anInt4076 = -1;

	@OriginalMember(owner = "client!hha", name = "m", descriptor = "I")
	private int anInt4085 = -1;

	@OriginalMember(owner = "client!hha", name = "d", descriptor = "I")
	public int anInt4077 = 0;

	@OriginalMember(owner = "client!hha", name = "y", descriptor = "I")
	public int anInt4097 = 0;

	@OriginalMember(owner = "client!hha", name = "h", descriptor = "I")
	public int anInt4081 = -1;

	@OriginalMember(owner = "client!hha", name = "n", descriptor = "I")
	private int anInt4086 = -1;

	@OriginalMember(owner = "client!hha", name = "l", descriptor = "I")
	public int anInt4084 = 16777215;

	@OriginalMember(owner = "client!hha", name = "x", descriptor = "I")
	public int anInt4096 = 70;

	@OriginalMember(owner = "client!hha", name = "p", descriptor = "I")
	public int anInt4088 = -1;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILclient!fca;)V")
	public void method3477(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4888();
			if (local5 == 0) {
				return;
			}
			this.method3482(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lclient!ha;B)Lclient!nf;")
	public Class102 method3478(@OriginalArg(0) Class16 arg0) {
		if (this.anInt4076 < 0) {
			return null;
		}
		@Pc(29) Class102 local29 = (Class102) this.aClass51_2.aClass279_7.method6631((long) this.anInt4076);
		if (local29 == null) {
			this.method3484(arg0);
			local29 = (Class102) this.aClass51_2.aClass279_7.method6631((long) this.anInt4076);
		}
		return local29;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Lclient!ha;Z)Lclient!nf;")
	public Class102 method3480(@OriginalArg(0) Class16 arg0) {
		if (this.anInt4086 < 0) {
			return null;
		}
		@Pc(18) Class102 local18 = (Class102) this.aClass51_2.aClass279_7.method6631((long) this.anInt4086);
		if (local18 == null) {
			this.method3484(arg0);
			local18 = (Class102) this.aClass51_2.aClass279_7.method6631((long) this.anInt4086);
		}
		return local18;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ZLclient!ha;)Lclient!nf;")
	public Class102 method3481(@OriginalArg(1) Class16 arg0) {
		if (this.anInt4087 < 0) {
			return null;
		}
		@Pc(18) Class102 local18 = (Class102) this.aClass51_2.aClass279_7.method6631((long) this.anInt4087);
		if (local18 == null) {
			this.method3484(arg0);
			local18 = (Class102) this.aClass51_2.aClass279_7.method6631((long) this.anInt4087);
		}
		return local18;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BILclient!fca;)V")
	private void method3482(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt4090 = arg1.method4858();
		} else if (arg0 == 2) {
			this.anInt4084 = arg1.method4862();
		} else if (arg0 == 3) {
			this.anInt4076 = arg1.method4858();
		} else if (arg0 == 4) {
			this.anInt4085 = arg1.method4858();
		} else if (arg0 == 5) {
			this.anInt4086 = arg1.method4858();
		} else if (arg0 == 6) {
			this.anInt4087 = arg1.method4858();
		} else if (arg0 == 7) {
			this.anInt4097 = arg1.method4869();
		} else if (arg0 == 8) {
			this.aString51 = arg1.method4890();
		} else if (arg0 == 9) {
			this.anInt4096 = arg1.method4858();
		} else if (arg0 == 10) {
			this.anInt4077 = arg1.method4869();
		} else if (arg0 == 11) {
			this.anInt4081 = 0;
		} else if (arg0 == 12) {
			this.anInt4088 = arg1.method4888();
		} else if (arg0 == 13) {
			this.anInt4078 = arg1.method4869();
		} else if (arg0 == 14) {
			this.anInt4081 = arg1.method4858();
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3483(@OriginalArg(1) int arg0) {
		@Pc(13) String local13 = this.aString51;
		while (true) {
			@Pc(17) int local17 = local13.indexOf("%1");
			if (local17 < 0) {
				return local13;
			}
			local13 = local13.substring(0, local17) + Static268.method4276(arg0, false) + local13.substring(local17 + 2);
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BLclient!ha;)V")
	private void method3484(@OriginalArg(1) Class16 arg0) {
		@Pc(7) Class143 local7 = this.aClass51_2.aClass143_16;
		@Pc(39) Class150 local39;
		if (this.anInt4076 >= 0 && this.aClass51_2.aClass279_7.method6631((long) this.anInt4076) == null && local7.method3130(this.anInt4076)) {
			local39 = Static683.method3279(local7, this.anInt4076);
			this.aClass51_2.aClass279_7.method6635(arg0.method8132(local39, true), (long) this.anInt4076);
		}
		if (this.anInt4086 >= 0 && this.aClass51_2.aClass279_7.method6631((long) this.anInt4086) == null && local7.method3130(this.anInt4086)) {
			local39 = Static683.method3279(local7, this.anInt4086);
			this.aClass51_2.aClass279_7.method6635(arg0.method8132(local39, true), (long) this.anInt4086);
		}
		if (this.anInt4085 >= 0 && this.aClass51_2.aClass279_7.method6631((long) this.anInt4085) == null && local7.method3130(this.anInt4085)) {
			local39 = Static683.method3279(local7, this.anInt4085);
			this.aClass51_2.aClass279_7.method6635(arg0.method8132(local39, true), (long) this.anInt4085);
		}
		if (this.anInt4087 >= 0 && this.aClass51_2.aClass279_7.method6631((long) this.anInt4087) == null && local7.method3130(this.anInt4087)) {
			local39 = Static683.method3279(local7, this.anInt4087);
			this.aClass51_2.aClass279_7.method6635(arg0.method8132(local39, true), (long) this.anInt4087);
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILclient!ha;)Lclient!nf;")
	public Class102 method3485(@OriginalArg(1) Class16 arg0) {
		if (this.anInt4085 < 0) {
			return null;
		}
		@Pc(19) Class102 local19 = (Class102) this.aClass51_2.aClass279_7.method6631((long) this.anInt4085);
		if (local19 == null) {
			this.method3484(arg0);
			local19 = (Class102) this.aClass51_2.aClass279_7.method6631((long) this.anInt4085);
		}
		return local19;
	}
}
