import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class2_Sub3_Sub1_Sub1 extends Class2_Sub3_Sub1 {

	@OriginalMember(owner = "client!ar", name = "P", descriptor = "Lclient!aj;")
	private Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
	private int anInt355 = 0;

	@OriginalMember(owner = "client!ar", name = "Y", descriptor = "I")
	private final int anInt361 = -1;

	@OriginalMember(owner = "client!ar", name = "Z", descriptor = "I")
	private int anInt362 = 0;

	@OriginalMember(owner = "client!ar", name = "kb", descriptor = "I")
	private int anInt372 = 0;

	@OriginalMember(owner = "client!ar", name = "ab", descriptor = "Z")
	public boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ar", name = "nb", descriptor = "I")
	private int anInt374 = 0;

	@OriginalMember(owner = "client!ar", name = "jb", descriptor = "I")
	private int anInt371 = 0;

	@OriginalMember(owner = "client!ar", name = "lb", descriptor = "Z")
	private boolean lb = true;

	@OriginalMember(owner = "client!ar", name = "eb", descriptor = "I")
	private final int anInt366;

	@OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
	public final int anInt350;

	@OriginalMember(owner = "client!ar", name = "U", descriptor = "Lclient!rj;")
	private Class290 aClass290_1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class2_Sub3_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt366 = arg0;
		this.anInt350 = arg2 + arg1;
		this.anInt371 = arg12;
		@Pc(53) Class268 local53 = Static35.aClass343_1.method8033(this.anInt366);
		@Pc(56) int local56 = local53.anInt8068;
		if (local56 == -1) {
			this.aBoolean33 = true;
		} else {
			this.aClass290_1 = Static618.aClass222_2.method5867(local56);
			this.aBoolean33 = false;
		}
		if (arg2 == this.anInt350) {
			Static349.method5726(this.anInt372, this.aClass290_1, this);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		@Pc(20) Class128 local20 = this.method409((this.anInt371 == 0 ? 0 : 5) | 0x800, arg0, this.anInt366);
		if (local20 == null) {
			return null;
		}
		if (this.anInt371 != 0) {
			local20.a(this.anInt371 * 2048);
		}
		@Pc(45) Class47 local45 = arg0.method6225();
		local45.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
		this.method410(local20, local45, arg0);
		@Pc(66) Class2_Sub6 local66 = Static481.method2823(1, false);
		if (Static216.aBoolean440) {
			local20.method6294(local45, local66.aClass2_Sub5Array1[0], Static467.anInt8440, 0);
		} else {
			local20.method6281(local45, local66.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass2_Sub2_1 != null) {
			@Pc(94) Class40 local94 = this.aClass2_Sub2_1.method222();
			if (Static216.aBoolean440) {
				arg0.method6214(local94, Static467.anInt8440);
			} else {
				arg0.method6160(local94);
			}
		}
		this.lb = local20.F();
		this.anInt374 = local20.fa();
		this.anInt355 = local20.ma();
		return local66;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return false;
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V")
	@Override
	public void method8563() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
	public void method408(@OriginalArg(0) int arg0) {
		if (this.aBoolean33) {
			return;
		}
		this.anInt362 += arg0;
		while (this.aClass290_1.anIntArray548[this.anInt372] < this.anInt362) {
			this.anInt362 -= this.aClass290_1.anIntArray548[this.anInt372];
			this.anInt372++;
			if (this.aClass290_1.anIntArray550.length <= this.anInt372) {
				this.aBoolean33 = true;
				break;
			}
		}
		if (!this.aBoolean33) {
			Static349.method5726(this.anInt372, this.aClass290_1, this);
		}
	}

	@OriginalMember(owner = "client!ar", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub2_1 != null) {
			this.aClass2_Sub2_1.method232();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!ha;IB)Lclient!ka;")
	private Class128 method409(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class268 local16 = Static35.aClass343_1.method8033(arg2);
		@Pc(21) Class274 local21 = Static445.aClass274Array1[super.aByte128];
		@Pc(34) Class274 local34 = super.aByte129 >= 3 ? null : Static445.aClass274Array1[super.aByte129 + 1];
		return this.aBoolean33 ? local16.method6742(super.anInt10429, -1, arg1, super.anInt10428, super.anInt10424, Static618.aClass222_2, local34, -1, local21, arg0, 0) : local16.method6742(super.anInt10429, this.anInt372, arg1, super.anInt10428, super.anInt10424, Static618.aClass222_2, local34, this.anInt361, local21, arg0, this.anInt362);
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return this.lb;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ka;Lclient!wc;ILclient!ha;)V")
	private void method410(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(3) Class33 arg2) {
		arg0.method6287(arg1);
		@Pc(13) Class18[] local13 = arg0.method6277();
		@Pc(16) Class215[] local16 = arg0.method6278();
		if ((this.aClass2_Sub2_1 == null || this.aClass2_Sub2_1.aBoolean15) && (local13 != null || local16 != null)) {
			this.aClass2_Sub2_1 = Static15.method226(Static251.anInt5580, true);
		}
		if (this.aClass2_Sub2_1 != null) {
			this.aClass2_Sub2_1.method223(arg2, (long) Static251.anInt5580, local13, local16);
			this.aClass2_Sub2_1.method233(super.aByte128, super.aShort121, super.aShort122, super.aShort124, super.aShort123);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	public void method411() {
		if (this.aClass2_Sub2_1 != null) {
			this.aClass2_Sub2_1.method232();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
		@Pc(15) Class128 local15 = this.method409(0, arg0, this.anInt366);
		if (local15 != null) {
			@Pc(20) Class47 local20 = arg0.method6225();
			local20.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
			this.method410(local15, local20, arg0);
		}
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "(B)I")
	@Override
	public int method8575(@OriginalArg(0) byte arg0) {
		return arg0 == 30 ? this.anInt355 : -77;
	}

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)I")
	@Override
	public int method8574() {
		return this.anInt374;
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8570() {
		return false;
	}
}
