import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class244 {

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
	public int anInt7178;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!vh;")
	private final Class330 aClass330_44 = new Class330(64);

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Lclient!vh;")
	public final Class330 aClass330_45 = new Class330(50);

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "Lclient!dca;")
	public final Class67 aClass67_1 = new Class67(250);

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "Lclient!mfa;")
	private final Class199 aClass199_1 = new Class199();

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Lclient!pj;")
	private final Class248 aClass248_68;

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "Lclient!qba;")
	private final Class259 aClass259_2;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!pj;")
	public final Class248 aClass248_67;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "Z")
	private boolean aBoolean489;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public final int anInt7164;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public final int anInt7168;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray30;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray31;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!dd;IZLclient!qba;Lclient!pj;Lclient!pj;)V")
	public Class244(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) Class248 arg4, @OriginalArg(5) Class248 arg5) {
		this.aClass248_68 = arg4;
		this.aClass259_2 = arg3;
		this.aClass248_67 = arg5;
		this.aBoolean489 = arg2;
		this.anInt7164 = arg1;
		if (this.aClass248_68 == null) {
			this.anInt7168 = 0;
		} else {
			@Pc(49) int local49 = this.aClass248_68.method5774() - 1;
			this.anInt7168 = this.aClass248_68.method5793(local49) + local49 * 256;
		}
		this.aStringArray30 = new String[] { null, null, Static146.aClass103_8.method2355(this.anInt7164), null, null };
		this.aStringArray31 = new String[] { null, null, null, null, Static146.aClass103_9.method2355(this.anInt7164) };
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!n;IILclient!oa;IIII)Lclient!xa;")
	public Class71 method5712(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class90 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass199_1.anInt6098 = arg2.anInt9369;
		this.aClass199_1.anInt6104 = arg6;
		this.aClass199_1.anInt6106 = arg4;
		this.aClass199_1.anInt6105 = arg3;
		this.aClass199_1.anInt6102 = arg1;
		this.aClass199_1.aBoolean441 = arg0 != null;
		this.aClass199_1.anInt6108 = arg5;
		return (Class71) this.aClass67_1.method1381(this.aClass199_1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
	public void method5713(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean489) {
			this.aBoolean489 = arg0;
			this.method5721();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public void method5714() {
		@Pc(6) Class330 local6 = this.aClass330_44;
		synchronized (this.aClass330_44) {
			this.aClass330_44.method7680(5);
		}
		local6 = this.aClass330_45;
		synchronized (this.aClass330_45) {
			this.aClass330_45.method7680(5);
		}
		@Pc(44) Class67 local44 = this.aClass67_1;
		synchronized (this.aClass67_1) {
			this.aClass67_1.method1377();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public void method5715() {
		@Pc(2) Class67 local2 = this.aClass67_1;
		synchronized (this.aClass67_1) {
			this.aClass67_1.method1378();
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public void method5716() {
		@Pc(2) Class330 local2 = this.aClass330_45;
		synchronized (this.aClass330_45) {
			this.aClass330_45.method7688();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ta;IIIILclient!n;Lclient!oa;ILclient!oa;ZZZ)Lclient!xa;")
	public Class71 method5718(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class212 arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class90 arg8, @OriginalArg(9) boolean arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class71 local16 = this.method5712(arg5, arg2, arg6, arg1, arg7, arg4, arg3);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class236 local25 = this.method5726(arg7);
		if (arg3 > 1 && local25.anIntArray483 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg3 >= local25.anIntArray484[local35] && local25.anIntArray484[local35] != 0) {
					local33 = local25.anIntArray483[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method5726(local33);
			}
		}
		@Pc(92) int[] local92 = local25.method5484(arg2, arg9, arg8, arg0, arg5, arg6, arg1, arg3, arg4);
		if (local92 == null) {
			return null;
		}
		@Pc(106) Class71 local106;
		if (arg10) {
			local106 = arg8.method7471(local92, 36, 36, 32);
		} else {
			local106 = arg6.method7471(local92, 36, 36, 32);
		}
		if (!arg10) {
			@Pc(122) Class199 local122 = new Class199();
			local122.anInt6104 = arg3;
			local122.anInt6102 = arg2;
			local122.anInt6105 = arg1;
			local122.aBoolean441 = arg5 != null;
			local122.anInt6108 = arg4;
			local122.anInt6098 = arg6.anInt9369;
			local122.anInt6106 = arg7;
			this.aClass67_1.method1383(local106, local122);
		}
		return local106;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	public void method5721() {
		@Pc(2) Class330 local2 = this.aClass330_44;
		synchronized (this.aClass330_44) {
			this.aClass330_44.method7688();
		}
		local2 = this.aClass330_45;
		synchronized (this.aClass330_45) {
			this.aClass330_45.method7688();
		}
		@Pc(36) Class67 local36 = this.aClass67_1;
		synchronized (this.aClass67_1) {
			this.aClass67_1.method1378();
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)V")
	public void method5722(@OriginalArg(0) int arg0) {
		this.anInt7178 = arg0;
		@Pc(9) Class330 local9 = this.aClass330_45;
		synchronized (this.aClass330_45) {
			this.aClass330_45.method7688();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
	public void method5723() {
		@Pc(6) Class330 local6 = this.aClass330_44;
		synchronized (this.aClass330_44) {
			this.aClass330_44.method7678();
		}
		local6 = this.aClass330_45;
		synchronized (this.aClass330_45) {
			this.aClass330_45.method7678();
		}
		@Pc(54) Class67 local54 = this.aClass67_1;
		synchronized (this.aClass67_1) {
			this.aClass67_1.method1382();
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(II)Lclient!ol;")
	public Class236 method5726(@OriginalArg(0) int arg0) {
		@Pc(8) Class330 local8 = this.aClass330_44;
		@Pc(18) Class236 local18;
		synchronized (this.aClass330_44) {
			local18 = (Class236) this.aClass330_44.method7677((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class248 local31 = this.aClass248_68;
		@Pc(44) byte[] local44;
		synchronized (this.aClass248_68) {
			local44 = this.aClass248_68.method5797(Static183.method3078(arg0), Static205.method3378(arg0));
		}
		local18 = new Class236();
		local18.anInt6823 = arg0;
		local18.aClass244_3 = this;
		local18.aStringArray29 = new String[] { null, null, Static146.aClass103_8.method2355(this.anInt7164), null, null };
		local18.aStringArray28 = new String[] { null, null, null, null, Static146.aClass103_9.method2355(this.anInt7164) };
		if (local44 != null) {
			local18.method5483(new Class6_Sub12(local44));
		}
		local18.method5489();
		if (local18.anInt6800 != -1) {
			local18.method5479(this.method5726(local18.anInt6780), this.method5726(local18.anInt6800));
		}
		if (local18.anInt6815 != -1) {
			local18.method5477(this.method5726(local18.anInt6815), this.method5726(local18.anInt6812));
		}
		if (!this.aBoolean489 && local18.aBoolean468) {
			local18.aString53 = Static146.aClass103_6.method2355(this.anInt7164);
			local18.aBoolean469 = false;
			local18.aStringArray29 = this.aStringArray30;
			local18.anInt6767 = 0;
			local18.anIntArray482 = null;
			local18.aStringArray28 = this.aStringArray31;
			if (local18.aClass234_39 != null) {
				@Pc(199) boolean local199 = false;
				for (@Pc(204) Class6 local204 = local18.aClass234_39.method5469(); local204 != null; local204 = local18.aClass234_39.method5465()) {
					@Pc(214) Class348 local214 = this.aClass259_2.method5915((int) local204.aLong245);
					if (local214.aBoolean669) {
						local204.method7948();
					} else {
						local199 = true;
					}
				}
				if (!local199) {
					local18.aClass234_39 = null;
				}
			}
		}
		@Pc(239) Class330 local239 = this.aClass330_44;
		synchronized (this.aClass330_44) {
			this.aClass330_44.method7676(local18, (long) arg0);
			return local18;
		}
	}
}
