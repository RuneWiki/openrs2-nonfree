import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class348 {

	@OriginalMember(owner = "client!uq", name = "K", descriptor = "I")
	public int anInt9567;

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "Lclient!qr;")
	private final Class293 aClass293_64 = new Class293(64);

	@OriginalMember(owner = "client!uq", name = "v", descriptor = "Lclient!qr;")
	public final Class293 aClass293_65 = new Class293(50);

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "Lclient!nd;")
	public final Class239 aClass239_1 = new Class239(250);

	@OriginalMember(owner = "client!uq", name = "D", descriptor = "Lclient!eda;")
	private final Class88 aClass88_1 = new Class88();

	@OriginalMember(owner = "client!uq", name = "q", descriptor = "Lclient!wu;")
	public final Class384 aClass384_130;

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "Z")
	private boolean aBoolean770;

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "Lclient!wu;")
	private final Class384 aClass384_129;

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
	public final int anInt9564;

	@OriginalMember(owner = "client!uq", name = "F", descriptor = "Lclient!oha;")
	private final Class258 aClass258_2;

	@OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
	public final int anInt9563;

	@OriginalMember(owner = "client!uq", name = "G", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray41;

	@OriginalMember(owner = "client!uq", name = "M", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray42;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!ms;IZLclient!oha;Lclient!wu;Lclient!wu;)V")
	public Class348(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class258 arg3, @OriginalArg(4) Class384 arg4, @OriginalArg(5) Class384 arg5) {
		this.aClass384_130 = arg5;
		this.aBoolean770 = arg2;
		this.aClass384_129 = arg4;
		this.anInt9564 = arg1;
		this.aClass258_2 = arg3;
		if (this.aClass384_129 == null) {
			this.anInt9563 = 0;
		} else {
			@Pc(54) int local54 = this.aClass384_129.method8865() - 1;
			this.anInt9563 = this.aClass384_129.method8862(local54) + local54 * 256;
		}
		this.aStringArray41 = new String[] { null, null, Static76.aClass58_8.method1237(this.anInt9564), null, null };
		this.aStringArray42 = new String[] { null, null, null, null, Static76.aClass58_9.method1237(this.anInt9564) };
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)Lclient!th;")
	public Class329 method8197(@OriginalArg(1) int arg0) {
		@Pc(13) Class293 local13 = this.aClass293_64;
		@Pc(23) Class329 local23;
		synchronized (this.aClass293_64) {
			local23 = (Class329) this.aClass293_64.method6921((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class384 local36 = this.aClass384_129;
		@Pc(49) byte[] local49;
		synchronized (this.aClass384_129) {
			local49 = this.aClass384_129.method8885(Static314.method5607(arg0), Static2.method25(arg0));
		}
		local23 = new Class329();
		local23.aClass348_2 = this;
		local23.anInt9076 = arg0;
		local23.aStringArray36 = new String[] { null, null, Static76.aClass58_8.method1237(this.anInt9564), null, null };
		local23.aStringArray35 = new String[] { null, null, null, null, Static76.aClass58_9.method1237(this.anInt9564) };
		if (local49 != null) {
			local23.method7751(new Class5_Sub12(local49));
		}
		local23.method7753();
		if (local23.anInt9073 != -1) {
			local23.method7758(this.method8197(local23.anInt9060), this.method8197(local23.anInt9073));
		}
		if (local23.anInt9093 != -1) {
			local23.method7761(this.method8197(local23.anInt9093), this.method8197(local23.anInt9082));
		}
		if (local23.anInt9063 != -1) {
			local23.method7752(this.method8197(local23.anInt9092), this.method8197(local23.anInt9063));
		}
		if (!this.aBoolean770 && local23.aBoolean738) {
			local23.aString127 = Static76.aClass58_5.method1237(this.anInt9564);
			local23.anIntArray697 = null;
			local23.anInt9052 = 0;
			local23.aStringArray36 = this.aStringArray41;
			local23.aStringArray35 = this.aStringArray42;
			local23.aBoolean739 = false;
			if (local23.aClass81_63 != null) {
				@Pc(220) boolean local220 = false;
				for (@Pc(225) Class5 local225 = local23.aClass81_63.method1608(); local225 != null; local225 = local23.aClass81_63.method1610()) {
					@Pc(235) Class230 local235 = this.aClass258_2.method6202((int) local225.aLong282);
					if (local235.aBoolean529) {
						local225.method8911();
					} else {
						local220 = true;
					}
				}
				if (!local220) {
					local23.aClass81_63 = null;
				}
			}
		}
		@Pc(260) Class293 local260 = this.aClass293_64;
		synchronized (this.aClass293_64) {
			this.aClass293_64.method6925((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	public void method8198() {
		@Pc(6) Class293 local6 = this.aClass293_65;
		synchronized (this.aClass293_65) {
			this.aClass293_65.method6930();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIILclient!ha;IIILclient!uea;)Lclient!hu;")
	public Class44 method8199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class126 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class339 arg6) {
		this.aClass88_1.anInt1886 = arg5;
		this.aClass88_1.anInt1884 = arg1;
		this.aClass88_1.anInt1883 = arg4;
		this.aClass88_1.anInt1887 = arg0;
		this.aClass88_1.anInt1881 = arg2.anInt8069;
		this.aClass88_1.anInt1890 = arg3;
		this.aClass88_1.aBoolean147 = arg6 != null;
		return (Class44) this.aClass239_1.method5776(this.aClass88_1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
	public void method8200() {
		@Pc(2) Class293 local2 = this.aClass293_64;
		synchronized (this.aClass293_64) {
			this.aClass293_64.method6927();
		}
		local2 = this.aClass293_65;
		synchronized (this.aClass293_65) {
			this.aClass293_65.method6927();
		}
		@Pc(42) Class239 local42 = this.aClass239_1;
		synchronized (this.aClass239_1) {
			this.aClass239_1.method5767();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLclient!uea;Lclient!ha;ZILclient!ha;IIILclient!da;II)Lclient!hu;")
	public Class44 method8201(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) Class126 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class126 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class6 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class44 local16 = this.method8199(arg4, arg9, arg2, arg6, arg10, arg7, arg1);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class329 local25 = this.method8197(arg9);
		if (arg10 > 1 && local25.anIntArray698 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (local25.anIntArray699[local35] <= arg10 && local25.anIntArray699[local35] != 0) {
					local33 = local25.anIntArray698[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method8197(local33);
			}
		}
		@Pc(83) int[] local83 = local25.method7748(arg5, arg7, arg8, arg10, arg2, arg4, arg1, arg3, arg6);
		if (local83 == null) {
			return null;
		}
		@Pc(104) Class44 local104;
		if (arg0) {
			local104 = arg5.method7017(32, 36, local83, 36);
		} else {
			local104 = arg2.method7017(32, 36, local83, 36);
		}
		if (!arg0) {
			@Pc(121) Class88 local121 = new Class88();
			local121.aBoolean147 = arg1 != null;
			local121.anInt1881 = arg2.anInt8069;
			local121.anInt1886 = arg7;
			local121.anInt1887 = arg4;
			local121.anInt1890 = arg6;
			local121.anInt1883 = arg10;
			local121.anInt1884 = arg9;
			this.aClass239_1.method5779(local104, local121);
		}
		return local104;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
	public void method8202() {
		@Pc(6) Class293 local6 = this.aClass293_64;
		synchronized (this.aClass293_64) {
			this.aClass293_64.method6922(5);
		}
		local6 = this.aClass293_65;
		synchronized (this.aClass293_65) {
			this.aClass293_65.method6922(5);
		}
		@Pc(44) Class239 local44 = this.aClass239_1;
		synchronized (this.aClass239_1) {
			this.aClass239_1.method5770();
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)V")
	public void method8203() {
		@Pc(6) Class293 local6 = this.aClass293_64;
		synchronized (this.aClass293_64) {
			this.aClass293_64.method6930();
		}
		local6 = this.aClass293_65;
		synchronized (this.aClass293_65) {
			this.aClass293_65.method6930();
		}
		@Pc(36) Class239 local36 = this.aClass239_1;
		synchronized (this.aClass239_1) {
			this.aClass239_1.method5769();
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)V")
	public void method8207() {
		@Pc(12) Class239 local12 = this.aClass239_1;
		synchronized (this.aClass239_1) {
			this.aClass239_1.method5769();
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(II)V")
	public void method8208(@OriginalArg(1) int arg0) {
		this.anInt9567 = arg0;
		@Pc(9) Class293 local9 = this.aClass293_65;
		synchronized (this.aClass293_65) {
			this.aClass293_65.method6930();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)V")
	public void method8209(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean770) {
			this.aBoolean770 = arg0;
			this.method8203();
		}
	}
}
