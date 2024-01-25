import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class250 {

	@OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
	public int anInt7133;

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "Lclient!wg;")
	private final Class313 aClass313_49 = new Class313(64);

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "Lclient!wg;")
	public final Class313 aClass313_50 = new Class313(50);

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "Lclient!jk;")
	public final Class154 aClass154_1 = new Class154(250);

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "Lclient!jh;")
	private final Class152 aClass152_1 = new Class152();

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
	public final int anInt7121;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Lclient!kr;")
	public final Class171 aClass171_121;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "Lclient!kr;")
	private final Class171 aClass171_122;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "Z")
	private boolean aBoolean513;

	@OriginalMember(owner = "client!qp", name = "y", descriptor = "Lclient!wt;")
	private final Class317 aClass317_1;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
	public final int anInt7128;

	@OriginalMember(owner = "client!qp", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray39;

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray38;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!g;IZLclient!wt;Lclient!kr;Lclient!kr;)V")
	public Class250(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class317 arg3, @OriginalArg(4) Class171 arg4, @OriginalArg(5) Class171 arg5) {
		this.anInt7121 = arg1;
		this.aClass171_121 = arg5;
		this.aClass171_122 = arg4;
		this.aBoolean513 = arg2;
		this.aClass317_1 = arg3;
		if (this.aClass171_122 == null) {
			this.anInt7128 = 0;
		} else {
			@Pc(49) int local49 = this.aClass171_122.method4331() - 1;
			this.anInt7128 = this.aClass171_122.method4349(local49) + local49 * 256;
		}
		this.aStringArray39 = new String[] { null, null, Static362.aClass306_80.method7165(this.anInt7121), null, null };
		this.aStringArray38 = new String[] { null, null, null, null, Static449.aClass306_113.method7165(this.anInt7121) };
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!qa;ZIIILclient!nl;ILclient!ra;Lclient!qa;ZIB)Lclient!ha;")
	public Class2 method5971(@OriginalArg(0) Class122 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class206 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class67 arg7, @OriginalArg(8) Class122 arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		@Pc(16) Class2 local16 = this.method5976(arg0, arg10, arg6, arg2, arg5, arg4, arg3);
		if (local16 != null) {
			return local16;
		}
		@Pc(32) Class133 local32 = this.method5980(arg10);
		if (arg4 > 1 && local32.anIntArray337 != null) {
			@Pc(40) int local40 = -1;
			for (@Pc(42) int local42 = 0; local42 < 10; local42++) {
				if (arg4 >= local32.anIntArray336[local42] && local32.anIntArray336[local42] != 0) {
					local40 = local32.anIntArray337[local42];
				}
			}
			if (local40 != -1) {
				local32 = this.method5980(local40);
			}
		}
		@Pc(93) int[] local93 = local32.method3459(arg0, arg7, arg8, arg2, arg3, arg5, arg4, arg6, arg9);
		if (local93 == null) {
			return null;
		}
		@Pc(107) Class2 local107;
		if (arg1) {
			local107 = arg8.method7268(local93, 36, 36, 32);
		} else {
			local107 = arg0.method7268(local93, 36, 36, 32);
		}
		if (!arg1) {
			@Pc(123) Class152 local123 = new Class152();
			local123.anInt4492 = arg3;
			local123.anInt4488 = arg0.anInt8823;
			local123.anInt4489 = arg2;
			local123.anInt4491 = arg10;
			local123.aBoolean314 = arg5 != null;
			local123.anInt4496 = arg6;
			local123.anInt4487 = arg4;
			this.aClass154_1.method3995(local123, local107);
		}
		return local107;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
	public void method5972() {
		@Pc(6) Class313 local6 = this.aClass313_49;
		synchronized (this.aClass313_49) {
			this.aClass313_49.method7403(5);
		}
		local6 = this.aClass313_50;
		synchronized (this.aClass313_50) {
			this.aClass313_50.method7403(5);
		}
		@Pc(46) Class154 local46 = this.aClass154_1;
		synchronized (this.aClass154_1) {
			this.aClass154_1.method3989();
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)V")
	public void method5973(@OriginalArg(0) int arg0) {
		this.anInt7133 = arg0;
		@Pc(9) Class313 local9 = this.aClass313_50;
		synchronized (this.aClass313_50) {
			this.aClass313_50.method7398();
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public void method5975() {
		@Pc(6) Class313 local6 = this.aClass313_50;
		synchronized (this.aClass313_50) {
			this.aClass313_50.method7398();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!qa;IIILclient!nl;III)Lclient!ha;")
	public Class2 method5976(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		this.aClass152_1.anInt4487 = arg5;
		this.aClass152_1.anInt4491 = arg1;
		this.aClass152_1.anInt4488 = arg0.anInt8823;
		this.aClass152_1.aBoolean314 = arg4 != null;
		this.aClass152_1.anInt4489 = arg3;
		this.aClass152_1.anInt4496 = arg2;
		this.aClass152_1.anInt4492 = arg6;
		return (Class2) this.aClass154_1.method3986(this.aClass152_1);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
	public void method5977() {
		@Pc(2) Class154 local2 = this.aClass154_1;
		synchronized (this.aClass154_1) {
			this.aClass154_1.method3988();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZZ)V")
	public void method5978(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean513 != arg0) {
			this.aBoolean513 = arg0;
			this.method5981();
		}
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
	public void method5979() {
		@Pc(2) Class313 local2 = this.aClass313_49;
		synchronized (this.aClass313_49) {
			this.aClass313_49.method7400();
		}
		local2 = this.aClass313_50;
		synchronized (this.aClass313_50) {
			this.aClass313_50.method7400();
		}
		@Pc(44) Class154 local44 = this.aClass154_1;
		synchronized (this.aClass154_1) {
			this.aClass154_1.method3991();
		}
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(II)Lclient!iba;")
	public Class133 method5980(@OriginalArg(1) int arg0) {
		@Pc(8) Class313 local8 = this.aClass313_49;
		@Pc(18) Class133 local18;
		synchronized (this.aClass313_49) {
			local18 = (Class133) this.aClass313_49.method7406((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class171 local31 = this.aClass171_122;
		@Pc(44) byte[] local44;
		synchronized (this.aClass171_122) {
			local44 = this.aClass171_122.method4339(Static127.method3832(arg0), Static191.method2964(arg0));
		}
		local18 = new Class133();
		local18.anInt3917 = arg0;
		local18.aClass250_1 = this;
		local18.aStringArray21 = new String[] { null, null, Static362.aClass306_80.method7165(this.anInt7121), null, null };
		local18.aStringArray20 = new String[] { null, null, null, null, Static449.aClass306_113.method7165(this.anInt7121) };
		if (local44 != null) {
			local18.method3452(new Class1_Sub6(local44));
		}
		local18.method3442();
		if (local18.anInt3921 != -1) {
			local18.method3451(this.method5980(local18.anInt3921), this.method5980(local18.anInt3918));
		}
		if (local18.anInt3942 != -1) {
			local18.method3444(this.method5980(local18.anInt3942), this.method5980(local18.anInt3916));
		}
		if (!this.aBoolean513 && local18.aBoolean281) {
			local18.aString38 = Static216.aClass306_51.method7165(this.anInt7121);
			local18.aStringArray20 = this.aStringArray38;
			local18.aBoolean282 = false;
			local18.anIntArray335 = null;
			local18.anInt3910 = 0;
			local18.aStringArray21 = this.aStringArray39;
			if (local18.aClass17_17 != null) {
				@Pc(206) boolean local206 = false;
				for (@Pc(211) Class1 local211 = local18.aClass17_17.method735(); local211 != null; local211 = local18.aClass17_17.method740()) {
					@Pc(221) Class71 local221 = this.aClass317_1.method7539((int) local211.aLong392);
					if (local221.aBoolean124) {
						local211.method7525();
					} else {
						local206 = true;
					}
				}
				if (!local206) {
					local18.aClass17_17 = null;
				}
			}
		}
		@Pc(248) Class313 local248 = this.aClass313_49;
		synchronized (this.aClass313_49) {
			this.aClass313_49.method7399((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V")
	public void method5981() {
		@Pc(6) Class313 local6 = this.aClass313_49;
		synchronized (this.aClass313_49) {
			this.aClass313_49.method7398();
		}
		local6 = this.aClass313_50;
		synchronized (this.aClass313_50) {
			this.aClass313_50.method7398();
		}
		@Pc(44) Class154 local44 = this.aClass154_1;
		synchronized (this.aClass154_1) {
			this.aClass154_1.method3988();
		}
	}
}
