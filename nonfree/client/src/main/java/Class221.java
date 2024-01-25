import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class221 {

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
	public int anInt7096;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "Lclient!fc;")
	private final Class94 aClass94_32 = new Class94(64);

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "Lclient!fc;")
	public final Class94 aClass94_33 = new Class94(50);

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "Lclient!ep;")
	public final Class89 aClass89_1 = new Class89(250);

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "Lclient!eo;")
	private final Class88 aClass88_1 = new Class88();

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	public final int anInt7087;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "Lclient!wba;")
	private final Class369 aClass369_2;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!ni;")
	public final Class223 aClass223_77;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "Z")
	private boolean aBoolean564;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "Lclient!ni;")
	private final Class223 aClass223_78;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	public final int anInt7082;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray19;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray20;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!rga;IZLclient!wba;Lclient!ni;Lclient!ni;)V")
	public Class221(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class369 arg3, @OriginalArg(4) Class223 arg4, @OriginalArg(5) Class223 arg5) {
		this.anInt7087 = arg1;
		this.aClass369_2 = arg3;
		this.aClass223_77 = arg5;
		this.aBoolean564 = arg2;
		this.aClass223_78 = arg4;
		if (this.aClass223_78 == null) {
			this.anInt7082 = 0;
		} else {
			@Pc(54) int local54 = this.aClass223_78.method5961() - 1;
			this.anInt7082 = this.aClass223_78.method5970(local54) + local54 * 256;
		}
		this.aStringArray19 = new String[] { null, null, Static536.aClass316_9.method7577(this.anInt7087), null, null };
		this.aStringArray20 = new String[] { null, null, null, null, Static536.aClass316_10.method7577(this.anInt7087) };
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!ha;Lclient!tfa;IIII)Lclient!ufa;")
	public Class4 method5919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass88_1.aBoolean255 = arg3 != null;
		this.aClass88_1.anInt3276 = arg6;
		this.aClass88_1.anInt3268 = arg1;
		this.aClass88_1.anInt3269 = arg5;
		this.aClass88_1.anInt3271 = arg2.anInt7303;
		this.aClass88_1.anInt3272 = arg4;
		this.aClass88_1.anInt3274 = arg0;
		return (Class4) this.aClass89_1.method2745(this.aClass88_1);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
	public void method5921(@OriginalArg(1) int arg0) {
		this.anInt7096 = arg0;
		@Pc(9) Class94 local9 = this.aClass94_33;
		synchronized (this.aClass94_33) {
			this.aClass94_33.method2952();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)Lclient!sea;")
	public Class306 method5923(@OriginalArg(0) int arg0) {
		@Pc(8) Class94 local8 = this.aClass94_32;
		@Pc(18) Class306 local18;
		synchronized (this.aClass94_32) {
			local18 = (Class306) this.aClass94_32.method2960((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class223 local31 = this.aClass223_78;
		@Pc(44) byte[] local44;
		synchronized (this.aClass223_78) {
			local44 = this.aClass223_78.method5954(Static425.method6604(arg0), Static288.method4985(arg0));
		}
		local18 = new Class306();
		local18.aClass221_2 = this;
		local18.anInt9085 = arg0;
		local18.aStringArray31 = new String[] { null, null, Static536.aClass316_9.method7577(this.anInt7087), null, null };
		local18.aStringArray32 = new String[] { null, null, null, null, Static536.aClass316_10.method7577(this.anInt7087) };
		if (local44 != null) {
			local18.method7411(new Class6_Sub8(local44));
		}
		local18.method7399();
		if (local18.anInt9029 != -1) {
			local18.method7401(this.method5923(local18.anInt9049), this.method5923(local18.anInt9029));
		}
		if (local18.anInt9075 != -1) {
			local18.method7412(this.method5923(local18.anInt9090), this.method5923(local18.anInt9075));
		}
		if (!this.aBoolean564 && local18.aBoolean730) {
			local18.aString93 = Static536.aClass316_7.method7577(this.anInt7087);
			local18.aStringArray31 = this.aStringArray19;
			local18.aBoolean731 = false;
			local18.aStringArray32 = this.aStringArray20;
			local18.anInt9051 = 0;
			local18.anIntArray469 = null;
			if (local18.aClass380_40 != null) {
				@Pc(198) boolean local198 = false;
				for (@Pc(203) Class6 local203 = local18.aClass380_40.method8755(); local203 != null; local203 = local18.aClass380_40.method8752()) {
					@Pc(213) Class164 local213 = this.aClass369_2.method8523((int) local203.aLong278);
					if (local213.aBoolean468) {
						local203.method8792();
					} else {
						local198 = true;
					}
				}
				if (!local198) {
					local18.aClass380_40 = null;
				}
			}
		}
		@Pc(238) Class94 local238 = this.aClass94_32;
		synchronized (this.aClass94_32) {
			this.aClass94_32.method2963((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public void method5924() {
		@Pc(10) Class94 local10 = this.aClass94_32;
		synchronized (this.aClass94_32) {
			this.aClass94_32.method2952();
		}
		local10 = this.aClass94_33;
		synchronized (this.aClass94_33) {
			this.aClass94_33.method2952();
		}
		@Pc(44) Class89 local44 = this.aClass89_1;
		synchronized (this.aClass89_1) {
			this.aClass89_1.method2735();
		}
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	public void method5926() {
		@Pc(6) Class89 local6 = this.aClass89_1;
		synchronized (this.aClass89_1) {
			this.aClass89_1.method2735();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
	public void method5927(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean564) {
			this.aBoolean564 = arg0;
			this.method5924();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public void method5928() {
		@Pc(2) Class94 local2 = this.aClass94_32;
		synchronized (this.aClass94_32) {
			this.aClass94_32.method2964();
		}
		local2 = this.aClass94_33;
		synchronized (this.aClass94_33) {
			this.aClass94_33.method2964();
		}
		@Pc(44) Class89 local44 = this.aClass89_1;
		synchronized (this.aClass89_1) {
			this.aClass89_1.method2738();
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V")
	public void method5929() {
		@Pc(6) Class94 local6 = this.aClass94_32;
		synchronized (this.aClass94_32) {
			this.aClass94_32.method2958(5);
		}
		local6 = this.aClass94_33;
		synchronized (this.aClass94_33) {
			this.aClass94_33.method2958(5);
		}
		@Pc(46) Class89 local46 = this.aClass89_1;
		synchronized (this.aClass89_1) {
			this.aClass89_1.method2737();
		}
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V")
	public void method5930() {
		@Pc(6) Class94 local6 = this.aClass94_33;
		synchronized (this.aClass94_33) {
			this.aClass94_33.method2952();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!da;ZIIILclient!tfa;Lclient!ha;IZILclient!ha;Z)Lclient!ufa;")
	public Class4 method5931(@OriginalArg(0) Class34 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class320 arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class5 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class4 local16 = this.method5919(arg2, arg1, arg9, arg4, arg8, arg6, arg3);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class306 local25 = this.method5923(arg1);
		if (arg8 > 1 && local25.anIntArray468 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (local25.anIntArray470[local35] <= arg8 && local25.anIntArray470[local35] != 0) {
					local33 = local25.anIntArray468[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method5923(local33);
			}
		}
		@Pc(81) int[] local81 = local25.method7402(arg3, arg6, arg10, arg8, arg2, arg9, arg5, arg4, arg0);
		if (local81 == null) {
			return null;
		}
		@Pc(96) Class4 local96;
		if (arg7) {
			local96 = arg5.method6111(36, 32, local81, 36);
		} else {
			local96 = arg9.method6111(36, 32, local81, 36);
		}
		if (!arg7) {
			@Pc(113) Class88 local113 = new Class88();
			local113.anInt3274 = arg2;
			local113.anInt3268 = arg1;
			local113.aBoolean255 = arg4 != null;
			local113.anInt3276 = arg3;
			local113.anInt3272 = arg8;
			local113.anInt3271 = arg9.anInt7303;
			local113.anInt3269 = arg6;
			this.aClass89_1.method2742(local96, local113);
		}
		return local96;
	}
}
