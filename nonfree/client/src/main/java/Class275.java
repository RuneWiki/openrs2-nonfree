import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class275 {

	@OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
	public int anInt7498;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "Lclient!eda;")
	private final Class87 aClass87_181 = new Class87(64);

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "Lclient!eda;")
	public final Class87 aClass87_182 = new Class87(50);

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "Lclient!us;")
	public final Class353 aClass353_1 = new Class353(250);

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "Lclient!dt;")
	private final Class81 aClass81_1 = new Class81();

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
	public final int anInt7486;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "Z")
	private boolean aBoolean534;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "Lclient!la;")
	private final Class207 aClass207_86;

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Lclient!la;")
	public final Class207 aClass207_87;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "Lclient!qia;")
	private final Class291 aClass291_2;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
	public final int anInt7494;

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray57;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray58;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!cr;IZLclient!qia;Lclient!la;Lclient!la;)V")
	public Class275(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class291 arg3, @OriginalArg(4) Class207 arg4, @OriginalArg(5) Class207 arg5) {
		this.anInt7486 = arg1;
		this.aBoolean534 = arg2;
		this.aClass207_86 = arg4;
		this.aClass207_87 = arg5;
		this.aClass291_2 = arg3;
		if (this.aClass207_86 == null) {
			this.anInt7494 = 0;
		} else {
			@Pc(49) int local49 = this.aClass207_86.method4685() - 1;
			this.anInt7494 = this.aClass207_86.method4672(local49) + local49 * 256;
		}
		this.aStringArray57 = new String[] { null, null, Static174.aClass120_7.method2690(this.anInt7486), null, null };
		this.aStringArray58 = new String[] { null, null, null, null, Static174.aClass120_8.method2690(this.anInt7486) };
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public void method6639() {
		@Pc(2) Class353 local2 = this.aClass353_1;
		synchronized (this.aClass353_1) {
			this.aClass353_1.method8374();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)V")
	public void method6640(@OriginalArg(0) int arg0) {
		this.anInt7498 = arg0;
		@Pc(9) Class87 local9 = this.aClass87_182;
		synchronized (this.aClass87_182) {
			this.aClass87_182.method1801();
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(II)Lclient!oda;")
	public Class255 method6641(@OriginalArg(1) int arg0) {
		@Pc(8) Class87 local8 = this.aClass87_181;
		@Pc(18) Class255 local18;
		synchronized (this.aClass87_181) {
			local18 = (Class255) this.aClass87_181.method1805((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class207 local31 = this.aClass207_86;
		@Pc(44) byte[] local44;
		synchronized (this.aClass207_86) {
			local44 = this.aClass207_86.method4681(Static108.method1681(arg0), Static546.method7973(arg0));
		}
		local18 = new Class255();
		local18.anInt6551 = arg0;
		local18.aClass275_1 = this;
		local18.aStringArray53 = new String[] { null, null, Static174.aClass120_7.method2690(this.anInt7486), null, null };
		local18.aStringArray54 = new String[] { null, null, null, null, Static174.aClass120_8.method2690(this.anInt7486) };
		if (local44 != null) {
			local18.method5858(new Class5_Sub22(local44));
		}
		local18.method5844();
		if (local18.anInt6558 != -1) {
			local18.method5859(this.method6641(local18.anInt6558), this.method6641(local18.anInt6576));
		}
		if (local18.anInt6526 != -1) {
			local18.method5862(this.method6641(local18.anInt6526), this.method6641(local18.anInt6577));
		}
		if (!this.aBoolean534 && local18.aBoolean465) {
			local18.aString73 = Static174.aClass120_5.method2690(this.anInt7486);
			local18.aBoolean464 = false;
			local18.anInt6573 = 0;
			local18.aStringArray54 = this.aStringArray58;
			local18.anIntArray365 = null;
			local18.aStringArray53 = this.aStringArray57;
			if (local18.aClass273_25 != null) {
				@Pc(206) boolean local206 = false;
				for (@Pc(211) Class5 local211 = local18.aClass273_25.method6577(); local211 != null; local211 = local18.aClass273_25.method6589()) {
					@Pc(221) Class16 local221 = this.aClass291_2.method6836((int) local211.aLong278);
					if (local221.aBoolean11) {
						local211.method9047();
					} else {
						local206 = true;
					}
				}
				if (!local206) {
					local18.aClass273_25 = null;
				}
			}
		}
		@Pc(246) Class87 local246 = this.aClass87_181;
		synchronized (this.aClass87_181) {
			this.aClass87_181.method1792((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V")
	public void method6642() {
		@Pc(2) Class87 local2 = this.aClass87_181;
		synchronized (this.aClass87_181) {
			this.aClass87_181.method1801();
		}
		local2 = this.aClass87_182;
		synchronized (this.aClass87_182) {
			this.aClass87_182.method1801();
		}
		@Pc(42) Class353 local42 = this.aClass353_1;
		synchronized (this.aClass353_1) {
			this.aClass353_1.method8374();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZZILclient!da;ILclient!ha;IIILclient!ha;Lclient!nk;I)Lclient!it;")
	public Class28 method6643(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class133 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class133 arg8, @OriginalArg(10) Class248 arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class28 local16 = this.method6644(arg6, arg7, arg5, arg9, arg10, arg4, arg3);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class255 local25 = this.method6641(arg5);
		if (arg10 > 1 && local25.anIntArray366 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (local25.anIntArray367[local37] <= arg10 && local25.anIntArray367[local37] != 0) {
					local35 = local25.anIntArray366[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method6641(local35);
			}
		}
		@Pc(89) int[] local89 = local25.method5845(arg10, arg6, arg8, arg0, arg9, arg3, arg4, arg2, arg7);
		if (local89 == null) {
			return null;
		}
		@Pc(104) Class28 local104;
		if (arg1) {
			local104 = arg8.method7261(local89, 32, 36, 36);
		} else {
			local104 = arg4.method7261(local89, 32, 36, 36);
		}
		if (!arg1) {
			@Pc(139) Class81 local139 = new Class81();
			local139.anInt2033 = arg7;
			local139.anInt2031 = arg6;
			local139.anInt2041 = arg10;
			local139.anInt2043 = arg4.anInt8326;
			local139.anInt2034 = arg5;
			local139.aBoolean156 = arg9 != null;
			local139.anInt2038 = arg3;
			this.aClass353_1.method8385(local139, local104);
		}
		return local104;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBIILclient!nk;ILclient!ha;I)Lclient!it;")
	public Class28 method6644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class248 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class133 arg5, @OriginalArg(7) int arg6) {
		this.aClass81_1.anInt2034 = arg2;
		this.aClass81_1.aBoolean156 = arg3 != null;
		this.aClass81_1.anInt2043 = arg5.anInt8326;
		this.aClass81_1.anInt2038 = arg6;
		this.aClass81_1.anInt2041 = arg4;
		this.aClass81_1.anInt2031 = arg0;
		this.aClass81_1.anInt2033 = arg1;
		return (Class28) this.aClass353_1.method8379(this.aClass81_1);
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V")
	public void method6645() {
		@Pc(2) Class87 local2 = this.aClass87_182;
		synchronized (this.aClass87_182) {
			this.aClass87_182.method1801();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)V")
	public void method6646(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean534) {
			this.aBoolean534 = arg0;
			this.method6642();
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(IZ)V")
	public void method6647() {
		@Pc(2) Class87 local2 = this.aClass87_181;
		synchronized (this.aClass87_181) {
			this.aClass87_181.method1793(5);
		}
		local2 = this.aClass87_182;
		synchronized (this.aClass87_182) {
			this.aClass87_182.method1793(5);
		}
		@Pc(45) Class353 local45 = this.aClass353_1;
		synchronized (this.aClass353_1) {
			this.aClass353_1.method8383();
		}
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)V")
	public void method6648() {
		@Pc(6) Class87 local6 = this.aClass87_181;
		synchronized (this.aClass87_181) {
			this.aClass87_181.method1796();
		}
		local6 = this.aClass87_182;
		synchronized (this.aClass87_182) {
			this.aClass87_182.method1796();
		}
		@Pc(40) Class353 local40 = this.aClass353_1;
		synchronized (this.aClass353_1) {
			this.aClass353_1.method8373();
		}
	}
}
