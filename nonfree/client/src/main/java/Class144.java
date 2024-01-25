import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class144 {

	@OriginalMember(owner = "client!kn", name = "A", descriptor = "I")
	public int anInt4001;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "Lclient!nj;")
	private final Class171 aClass171_31 = new Class171(64);

	@OriginalMember(owner = "client!kn", name = "v", descriptor = "Lclient!nj;")
	public final Class171 aClass171_32 = new Class171(50);

	@OriginalMember(owner = "client!kn", name = "w", descriptor = "Lclient!cc;")
	public final Class38 aClass38_1 = new Class38(250);

	@OriginalMember(owner = "client!kn", name = "x", descriptor = "Lclient!cl;")
	private final Class42 aClass42_1 = new Class42();

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Z")
	private boolean aBoolean297;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "Lclient!mg;")
	private final Class160 aClass160_37;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "Lclient!mg;")
	public final Class160 aClass160_36;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	public final int anInt3990;

	@OriginalMember(owner = "client!kn", name = "z", descriptor = "Lclient!mi;")
	private final Class161 aClass161_2;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	public final int anInt3987;

	@OriginalMember(owner = "client!kn", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray28;

	@OriginalMember(owner = "client!kn", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray29;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!al;IZLclient!mi;Lclient!mg;Lclient!mg;)V")
	public Class144(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class161 arg3, @OriginalArg(4) Class160 arg4, @OriginalArg(5) Class160 arg5) {
		this.aBoolean297 = arg2;
		this.aClass160_37 = arg4;
		this.aClass160_36 = arg5;
		this.anInt3990 = arg1;
		this.aClass161_2 = arg3;
		if (this.aClass160_37 == null) {
			this.anInt3987 = 0;
		} else {
			@Pc(49) int local49 = this.aClass160_37.method3715() - 1;
			this.anInt3987 = local49 * 256 + this.aClass160_37.method3722(local49);
		}
		this.aStringArray28 = new String[] { null, null, Static250.aClass209_106.method4562(this.anInt3990), null, null };
		this.aStringArray29 = new String[] { null, null, null, null, Static317.aClass209_127.method4562(this.anInt3990) };
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V")
	public void method3263() {
		@Pc(2) Class171 local2 = this.aClass171_31;
		synchronized (this.aClass171_31) {
			this.aClass171_31.method3934();
		}
		local2 = this.aClass171_32;
		synchronized (this.aClass171_32) {
			this.aClass171_32.method3934();
		}
		@Pc(42) Class38 local42 = this.aClass38_1;
		synchronized (this.aClass38_1) {
			this.aClass38_1.method657();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public void method3264() {
		@Pc(14) Class171 local14 = this.aClass171_32;
		synchronized (this.aClass171_32) {
			this.aClass171_32.method3936();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Lclient!cp;")
	public Class45 method3265(@OriginalArg(1) int arg0) {
		@Pc(8) Class171 local8 = this.aClass171_31;
		@Pc(18) Class45 local18;
		synchronized (this.aClass171_31) {
			local18 = (Class45) this.aClass171_31.method3941((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass160_37.method3696(Static413.method5435(arg0), Static321.method4512(arg0));
		local18 = new Class45();
		local18.anInt1106 = arg0;
		local18.aClass144_1 = this;
		local18.aStringArray4 = new String[] { null, null, Static250.aClass209_106.method4562(this.anInt3990), null, null };
		local18.aStringArray3 = new String[] { null, null, null, null, Static317.aClass209_127.method4562(this.anInt3990) };
		if (local39 != null) {
			local18.method867(new Class2_Sub23(local39));
		}
		local18.method862();
		if (local18.anInt1124 != -1) {
			local18.method856(this.method3265(local18.anInt1087), this.method3265(local18.anInt1124));
		}
		if (local18.anInt1132 != -1) {
			local18.method871(this.method3265(local18.anInt1083), this.method3265(local18.anInt1132));
		}
		if (!this.aBoolean297 && local18.aBoolean61) {
			local18.aString6 = Static56.aClass209_28.method4562(this.anInt3990);
			local18.aStringArray3 = this.aStringArray29;
			local18.aStringArray4 = this.aStringArray28;
			local18.anIntArray81 = null;
			local18.aBoolean62 = false;
			local18.anInt1085 = 0;
			if (local18.aClass163_3 != null) {
				@Pc(192) boolean local192 = false;
				for (@Pc(197) Class2 local197 = local18.aClass163_3.method3771(); local197 != null; local197 = local18.aClass163_3.method3770()) {
					@Pc(207) Class132 local207 = this.aClass161_2.method3729((int) local197.aLong227);
					if (local207.aBoolean265) {
						local197.method5866();
					} else {
						local192 = true;
					}
				}
				if (!local192) {
					local18.aClass163_3 = null;
				}
			}
		}
		@Pc(232) Class171 local232 = this.aClass171_31;
		synchronized (this.aClass171_31) {
			this.aClass171_31.method3940((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!go;ZLclient!la;ZLclient!ya;IZLclient!ya;II)Lclient!l;")
	public Class17 method3267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class116 arg4, @OriginalArg(6) Class49 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) Class49 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(21) Class17 local21 = this.method3273(arg2, arg8, arg1, arg9, arg10, arg6, arg0);
		if (local21 != null) {
			return local21;
		}
		@Pc(30) Class45 local30 = this.method3265(arg9);
		if (arg10 > 1 && local30.anIntArray80 != null) {
			@Pc(38) int local38 = -1;
			for (@Pc(40) int local40 = 0; local40 < 10; local40++) {
				if (local30.anIntArray79[local40] <= arg10 && local30.anIntArray79[local40] != 0) {
					local38 = local30.anIntArray80[local40];
				}
			}
			if (local38 != -1) {
				local30 = this.method3265(local38);
			}
		}
		@Pc(90) int[] local90 = local30.method854(arg1, arg10, arg6, arg8, arg0, arg7, arg5, arg4, arg2);
		if (local90 == null) {
			return null;
		}
		@Pc(104) Class17 local104;
		if (arg3) {
			local104 = arg5.method4422(local90, 36, 36, 32);
		} else {
			local104 = arg8.method4422(local90, 36, 36, 32);
		}
		if (!arg3) {
			@Pc(120) Class42 local120 = new Class42();
			local120.anInt859 = arg8.anInt5543;
			local120.anInt854 = arg9;
			local120.aBoolean44 = arg2 != null;
			local120.anInt855 = arg1;
			local120.anInt851 = arg6;
			local120.anInt856 = arg10;
			local120.anInt862 = arg0;
			this.aClass38_1.method656(local120, local104);
		}
		return local104;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)V")
	public void method3268(@OriginalArg(1) int arg0) {
		this.anInt4001 = arg0;
		@Pc(9) Class171 local9 = this.aClass171_32;
		synchronized (this.aClass171_32) {
			this.aClass171_32.method3936();
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	public void method3269() {
		@Pc(2) Class171 local2 = this.aClass171_31;
		synchronized (this.aClass171_31) {
			this.aClass171_31.method3936();
		}
		local2 = this.aClass171_32;
		synchronized (this.aClass171_32) {
			this.aClass171_32.method3936();
		}
		@Pc(43) Class38 local43 = this.aClass38_1;
		synchronized (this.aClass38_1) {
			this.aClass38_1.method653();
		}
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
	public void method3271() {
		@Pc(8) Class38 local8 = this.aClass38_1;
		synchronized (this.aClass38_1) {
			this.aClass38_1.method653();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!go;ILclient!ya;IIIII)Lclient!l;")
	public Class17 method3273(@OriginalArg(0) Class97 arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass42_1.anInt856 = arg4;
		this.aClass42_1.anInt851 = arg5;
		this.aClass42_1.anInt862 = arg6;
		this.aClass42_1.anInt859 = arg1.anInt5543;
		this.aClass42_1.anInt854 = arg3;
		this.aClass42_1.aBoolean44 = arg0 != null;
		this.aClass42_1.anInt855 = arg2;
		return (Class17) this.aClass38_1.method654(this.aClass42_1);
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(II)V")
	public void method3274() {
		@Pc(2) Class171 local2 = this.aClass171_31;
		synchronized (this.aClass171_31) {
			this.aClass171_31.method3933(5);
		}
		local2 = this.aClass171_32;
		synchronized (this.aClass171_32) {
			this.aClass171_32.method3933(5);
		}
		@Pc(46) Class38 local46 = this.aClass38_1;
		synchronized (this.aClass38_1) {
			this.aClass38_1.method650();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ)V")
	public void method3275(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean297 != arg0) {
			this.aBoolean297 = arg0;
			this.method3269();
		}
	}
}
