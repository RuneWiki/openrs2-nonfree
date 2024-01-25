import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class138 {

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Ljava/lang/String;")
	public static final String aString50;

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "Ljava/lang/String;")
	public static final String aString51;

	@OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
	public int anInt4308;

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "Lclient!jt;")
	private final Class166 aClass166_23 = new Class166(64);

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "Lclient!jt;")
	public final Class166 aClass166_24 = new Class166(50);

	@OriginalMember(owner = "client!hp", name = "w", descriptor = "Lclient!wd;")
	public final Class369 aClass369_1 = new Class369(250);

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "Lclient!to;")
	private final Class330 aClass330_1 = new Class330();

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
	public final int anInt4297;

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "Lclient!kw;")
	private final Class179 aClass179_2;

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "Lclient!vd;")
	public final Class353 aClass353_42;

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "Lclient!vd;")
	private final Class353 aClass353_41;

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "Z")
	private boolean aBoolean306;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
	public final int anInt4296;

	@OriginalMember(owner = "client!hp", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray33;

	@OriginalMember(owner = "client!hp", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray34;

	static {
		@Pc(1) String local1 = "Unknown";
		try {
			local1 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(7) Exception local7) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(18) Exception local18) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(29) Exception local29) {
		}
		aString50 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString51 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
		}
		local1.toLowerCase();
		local1 = "~/";
		try {
			local1 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(62) Exception local62) {
		}
		new File(local1);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!qg;IZLclient!kw;Lclient!vd;Lclient!vd;)V")
	public Class138(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class179 arg3, @OriginalArg(4) Class353 arg4, @OriginalArg(5) Class353 arg5) {
		this.anInt4297 = arg1;
		this.aClass179_2 = arg3;
		this.aClass353_42 = arg5;
		this.aClass353_41 = arg4;
		this.aBoolean306 = arg2;
		if (this.aClass353_41 == null) {
			this.anInt4296 = 0;
		} else {
			@Pc(54) int local54 = this.aClass353_41.method8415() - 1;
			this.anInt4296 = this.aClass353_41.method8422(local54) + local54 * 256;
		}
		this.aStringArray33 = new String[] { null, null, Static317.aClass192_7.method5299(this.anInt4297), null, null };
		this.aStringArray34 = new String[] { null, null, null, null, Static317.aClass192_8.method5299(this.anInt4297) };
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
	public void method3728(@OriginalArg(1) int arg0) {
		this.anInt4308 = arg0;
		@Pc(9) Class166 local9 = this.aClass166_24;
		synchronized (this.aClass166_24) {
			this.aClass166_24.method4811();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V")
	public void method3729(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean306) {
			this.aBoolean306 = arg0;
			this.method3739();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)Lclient!uo;")
	public Class347 method3730(@OriginalArg(0) int arg0) {
		@Pc(8) Class166 local8 = this.aClass166_23;
		@Pc(18) Class347 local18;
		synchronized (this.aClass166_23) {
			local18 = (Class347) this.aClass166_23.method4805((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class353 local31 = this.aClass353_41;
		@Pc(44) byte[] local44;
		synchronized (this.aClass353_41) {
			local44 = this.aClass353_41.method8404(Static312.method5231(arg0), Static359.method5714(arg0));
		}
		local18 = new Class347();
		local18.anInt9719 = arg0;
		local18.aClass138_2 = this;
		local18.aStringArray70 = new String[] { null, null, Static317.aClass192_7.method5299(this.anInt4297), null, null };
		local18.aStringArray71 = new String[] { null, null, null, null, Static317.aClass192_8.method5299(this.anInt4297) };
		if (local44 != null) {
			local18.method8239(new Class6_Sub40(local44));
		}
		local18.method8248();
		if (local18.anInt9773 != -1) {
			local18.method8246(this.method3730(local18.anInt9745), this.method3730(local18.anInt9773));
		}
		if (local18.anInt9728 != -1) {
			local18.method8244(this.method3730(local18.anInt9728), this.method3730(local18.anInt9760));
		}
		if (!this.aBoolean306 && local18.aBoolean672) {
			local18.aString109 = Static317.aClass192_5.method5299(this.anInt4297);
			local18.anInt9765 = 0;
			local18.aStringArray71 = this.aStringArray34;
			local18.aBoolean671 = false;
			local18.aStringArray70 = this.aStringArray33;
			local18.lb = null;
			if (local18.aClass128_47 != null) {
				@Pc(207) boolean local207 = false;
				for (@Pc(212) Class6 local212 = local18.aClass128_47.method3556(); local212 != null; local212 = local18.aClass128_47.method3555()) {
					@Pc(222) Class223 local222 = this.aClass179_2.method5148((int) local212.aLong278);
					if (local222.aBoolean458) {
						local212.method9043();
					} else {
						local207 = true;
					}
				}
				if (!local207) {
					local18.aClass128_47 = null;
				}
			}
		}
		@Pc(247) Class166 local247 = this.aClass166_23;
		synchronized (this.aClass166_23) {
			this.aClass166_23.method4803(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	public void method3731() {
		@Pc(2) Class369 local2 = this.aClass369_1;
		synchronized (this.aClass369_1) {
			this.aClass369_1.method8709();
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	public void method3733() {
		@Pc(8) Class166 local8 = this.aClass166_23;
		synchronized (this.aClass166_23) {
			this.aClass166_23.method4802();
		}
		local8 = this.aClass166_24;
		synchronized (this.aClass166_24) {
			this.aClass166_24.method4802();
		}
		@Pc(44) Class369 local44 = this.aClass369_1;
		synchronized (this.aClass369_1) {
			this.aClass369_1.method8712();
		}
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(I)V")
	public void method3734() {
		@Pc(14) Class166 local14 = this.aClass166_24;
		synchronized (this.aClass166_24) {
			this.aClass166_24.method4811();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V")
	public void method3735() {
		@Pc(6) Class166 local6 = this.aClass166_23;
		synchronized (this.aClass166_23) {
			this.aClass166_23.method4809(5);
		}
		local6 = this.aClass166_24;
		synchronized (this.aClass166_24) {
			this.aClass166_24.method4809(5);
		}
		@Pc(45) Class369 local45 = this.aClass369_1;
		synchronized (this.aClass369_1) {
			this.aClass369_1.method8717();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ha;IIIIIILclient!ah;)Lclient!pga;")
	public Class32 method3736(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class12 arg6) {
		this.aClass330_1.aBoolean643 = arg6 != null;
		this.aClass330_1.anInt9431 = arg0.anInt10378;
		this.aClass330_1.anInt9426 = arg1;
		this.aClass330_1.anInt9435 = arg2;
		this.aClass330_1.anInt9434 = arg3;
		this.aClass330_1.anInt9433 = arg4;
		this.aClass330_1.anInt9432 = arg5;
		return (Class32) this.aClass369_1.method8711(this.aClass330_1);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!ah;IILclient!da;IZLclient!ha;Lclient!ha;IIZ)Lclient!pga;")
	public Class32 method3737(@OriginalArg(0) int arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class100 arg6, @OriginalArg(8) Class100 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class32 local16 = this.method3736(arg7, arg0, arg9, arg2, arg4, arg8, arg1);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class347 local25 = this.method3730(arg9);
		if (arg8 > 1 && local25.anIntArray601 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (local25.anIntArray600[local35] <= arg8 && local25.anIntArray600[local35] != 0) {
					local33 = local25.anIntArray601[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method3730(local33);
			}
		}
		@Pc(85) int[] local85 = local25.method8238(arg7, arg3, arg4, arg8, arg2, arg0, arg10, arg6, arg1);
		if (local85 == null) {
			return null;
		}
		@Pc(100) Class32 local100;
		if (arg5) {
			local100 = arg6.method8847(32, 36, local85, 36);
		} else {
			local100 = arg7.method8847(32, 36, local85, 36);
		}
		if (!arg5) {
			@Pc(117) Class330 local117 = new Class330();
			local117.anInt9431 = arg7.anInt10378;
			local117.aBoolean643 = arg1 != null;
			local117.anInt9434 = arg2;
			local117.anInt9426 = arg0;
			local117.anInt9433 = arg4;
			local117.anInt9432 = arg8;
			local117.anInt9435 = arg9;
			this.aClass369_1.method8710(local117, local100);
		}
		return local100;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V")
	public void method3739() {
		@Pc(2) Class166 local2 = this.aClass166_23;
		synchronized (this.aClass166_23) {
			this.aClass166_23.method4811();
		}
		local2 = this.aClass166_24;
		synchronized (this.aClass166_24) {
			this.aClass166_24.method4811();
		}
		@Pc(36) Class369 local36 = this.aClass369_1;
		synchronized (this.aClass369_1) {
			this.aClass369_1.method8709();
		}
	}
}
