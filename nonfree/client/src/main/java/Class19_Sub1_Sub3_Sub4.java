import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class19_Sub1_Sub3_Sub4 extends Class19_Sub1_Sub3 {

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "Lclient!oi;")
	private Class19_Sub9 aClass19_Sub9_8;

	@OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
	private int anInt7893 = 0;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "Z")
	private boolean aBoolean607 = true;

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
	private int anInt7910 = 0;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	private int anInt7905 = 0;

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
	private final int anInt7911;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "Lclient!js;")
	private Class100 aClass100_10;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class19_Sub1_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt7911 = arg0;
		this.anInt7910 = arg11;
		@Pc(36) Class310 local36 = Static660.aClass307_2.method7493(this.anInt7911);
		@Pc(39) int local39 = local36.anInt8987;
		if (local39 != -1) {
			this.aClass100_10 = new Class100_Sub1(this, false);
			@Pc(60) int local60 = local36.aBoolean661 ? 0 : 2;
			if (arg12) {
				local60 = 1;
			}
			this.aClass100_10.method8973(local60, arg1, local39, false);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ha;I)Lclient!mla;")
	@Override
	public Class19_Sub8 method9377(@OriginalArg(0) Class67 arg0) {
		@Pc(21) Class157 local21 = this.method6654(arg0, this.anInt7911, (this.anInt7910 == 0 ? 0 : 5) | 0x800);
		if (local21 == null) {
			return null;
		}
		if (this.anInt7910 != 0) {
			local21.a(this.anInt7910 * 2048);
		}
		@Pc(43) Class181 local43 = arg0.method7693();
		local43.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
		this.method6649(arg0, local21, local43);
		@Pc(62) Class19_Sub8 local62 = Static58.method727(1, false);
		if (Static568.aBoolean784) {
			local21.method5227(local43, local62.aClass19_Sub6Array1[0], Static705.anInt11029, 0);
		} else {
			local21.method5232(local43, local62.aClass19_Sub6Array1[0], 0);
		}
		if (this.aClass19_Sub9_8 != null) {
			@Pc(104) Class162 local104 = this.aClass19_Sub9_8.method6779();
			if (Static568.aBoolean784) {
				arg0.method7692(local104, Static705.anInt11029);
			} else {
				arg0.method7656(local104);
			}
		}
		this.aBoolean607 = local21.F();
		this.anInt7893 = local21.fa();
		this.anInt7905 = local21.ma();
		return local62;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ha;ILclient!ka;Lclient!iu;)V")
	private void method6649(@OriginalArg(0) Class67 arg0, @OriginalArg(2) Class157 arg1, @OriginalArg(3) Class181 arg2) {
		arg1.method5226(arg2);
		@Pc(14) Class156[] local14 = arg1.method5214();
		@Pc(17) Class348[] local17 = arg1.method5222();
		if ((this.aClass19_Sub9_8 == null || this.aClass19_Sub9_8.aBoolean615) && (local14 != null || local17 != null)) {
			this.aClass19_Sub9_8 = Static457.method6772(Static269.anInt4883, true);
		}
		if (this.aClass19_Sub9_8 != null) {
			this.aClass19_Sub9_8.method6774(arg0, (long) Static269.anInt4883, local14, local17);
			this.aClass19_Sub9_8.method6768(super.aByte146, super.aShort121, super.aShort123, super.aShort124, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method9360() {
		return this.aBoolean607;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public void method6650() {
		if (this.aClass19_Sub9_8 != null) {
			this.aClass19_Sub9_8.method6766();
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Z")
	public boolean method6651() {
		return this.aClass100_10 == null || this.aClass100_10.method8959();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9374(@OriginalArg(0) Class67 arg0) {
		@Pc(11) Class157 local11 = this.method6654(arg0, this.anInt7911, 0);
		if (local11 != null) {
			@Pc(16) Class181 local16 = arg0.method7693();
			local16.method6356(super.anInt11204, super.anInt11208, super.anInt11211);
			this.method6649(arg0, local11, local16);
		}
	}

	@OriginalMember(owner = "client!oc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass19_Sub9_8 != null) {
			this.aClass19_Sub9_8.method6766();
		}
	}

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9366() {
		return false;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ha;III)Lclient!ka;")
	private Class157 method6654(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class310 local8 = Static660.aClass307_2.method7493(arg1);
		@Pc(21) Class313 local21 = Static167.aClass313Array1[super.aByte146];
		@Pc(35) Class313 local35 = super.aByte145 < 3 ? Static167.aClass313Array1[super.aByte145 + 1] : null;
		return this.aClass100_10 == null || this.aClass100_10.method8959() ? local8.method7510(arg0, super.anInt11211, local35, local21, (Class100) null, arg2, super.anInt11208, super.anInt11204, (byte) 2, true) : local8.method7510(arg0, super.anInt11211, local35, local21, this.aClass100_10, arg2, super.anInt11208, super.anInt11204, (byte) 2, true);
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)I")
	@Override
	public int method9364() {
		return this.anInt7893;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ha;B)Lclient!dfa;")
	@Override
	public Class68 method9371(@OriginalArg(0) Class67 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method9369(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)V")
	public void method6656() {
		if (this.aClass100_10 != null && !this.aClass100_10.method8959()) {
			this.aClass100_10.method8971(1);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZILclient!ha;IILclient!bla;I)V")
	@Override
	public void method9373(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19_Sub1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(B)V")
	@Override
	public void method9367() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9368() {
		return false;
	}

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "(I)Z")
	public boolean method6657() {
		return this.aClass100_10 != null && !this.aClass100_10.method8975();
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)I")
	@Override
	public int method9361(@OriginalArg(0) int arg0) {
		return arg0 == 4 ? this.anInt7905 : -71;
	}
}
