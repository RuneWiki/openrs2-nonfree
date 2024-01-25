import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "Lclient!ju;")
	private Class2_Sub8 aClass2_Sub8_2;

	@OriginalMember(owner = "client!cd", name = "pb", descriptor = "I")
	private int anInt1254 = 0;

	@OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!cd", name = "ab", descriptor = "Z")
	private boolean aBoolean66 = true;

	@OriginalMember(owner = "client!cd", name = "sb", descriptor = "I")
	private int anInt1256 = 0;

	@OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
	private int anInt1248 = 0;

	@OriginalMember(owner = "client!cd", name = "Fb", descriptor = "Z")
	public boolean aBoolean68 = false;

	@OriginalMember(owner = "client!cd", name = "Db", descriptor = "I")
	private final int anInt1265 = -1;

	@OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
	private int anInt1243 = 0;

	@OriginalMember(owner = "client!cd", name = "nb", descriptor = "I")
	private final int anInt1252;

	@OriginalMember(owner = "client!cd", name = "ub", descriptor = "I")
	public final int anInt1258;

	@OriginalMember(owner = "client!cd", name = "zb", descriptor = "Lclient!gf;")
	private Class119 aClass119_1;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt1252 = arg0;
		this.anInt1243 = arg12;
		this.anInt1258 = arg1 + arg2;
		@Pc(53) Class213 local53 = Static111.aClass279_4.method6905(this.anInt1252);
		@Pc(56) int local56 = local53.anInt6006;
		if (local56 == -1) {
			this.aBoolean68 = true;
		} else {
			this.aClass119_1 = Static334.aClass268_2.method6469(local56);
			this.aBoolean68 = false;
		}
		if (this.anInt1258 == arg2) {
			Static658.method8966(this, this.anInt1248, this.aClass119_1);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)I")
	@Override
	protected int method8442() {
		return this.lb;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)V")
	@Override
	public void method8449() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ha;Lclient!oo;Lclient!ka;B)V")
	private void method1182(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class184 arg2) {
		arg2.method8659(arg1);
		@Pc(15) Class100[] local15 = arg2.method8657();
		@Pc(18) Class218[] local18 = arg2.method8643();
		if ((this.aClass2_Sub8_2 == null || this.aClass2_Sub8_2.aBoolean310) && (local15 != null || local18 != null)) {
			this.aClass2_Sub8_2 = Static290.method4176(Static90.anInt1698, true);
		}
		if (this.aClass2_Sub8_2 != null) {
			this.aClass2_Sub8_2.method4169(arg0, (long) Static90.anInt1698, local15, local18);
			this.aClass2_Sub8_2.method4171(super.aByte140, super.aShort118, super.aShort119, super.aShort121, super.aShort120);
		}
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8447() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)V")
	public void method1184(@OriginalArg(1) int arg0) {
		if (this.aBoolean68) {
			return;
		}
		this.anInt1256 += arg0;
		while (this.aClass119_1.anIntArray168[this.anInt1248] < this.anInt1256) {
			this.anInt1256 -= this.aClass119_1.anIntArray168[this.anInt1248];
			this.anInt1248++;
			if (this.aClass119_1.anIntArray167.length <= this.anInt1248) {
				this.aBoolean68 = true;
				break;
			}
		}
		if (!this.aBoolean68) {
			Static658.method8966(this, this.anInt1248, this.aClass119_1);
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub8_2 != null) {
			this.aClass2_Sub8_2.method4175();
		}
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8451() {
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)I")
	@Override
	public int method8444() {
		return this.anInt1254;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
		@Pc(19) Class184 local19 = this.method1188(0, this.anInt1252, arg0);
		if (local19 != null) {
			@Pc(24) Class207 local24 = arg0.method7456();
			local24.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
			this.method1182(arg0, local24, local19);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public void method1186() {
		if (this.aClass2_Sub8_2 != null) {
			this.aClass2_Sub8_2.method4175();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		@Pc(23) Class184 local23 = this.method1188((this.anInt1243 == 0 ? 0 : 5) | 0x800, this.anInt1252, arg0);
		if (local23 == null) {
			return null;
		}
		if (this.anInt1243 != 0) {
			local23.a(this.anInt1243 * 2048);
		}
		@Pc(44) Class207 local44 = arg0.method7456();
		local44.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
		this.method1182(arg0, local44, local23);
		@Pc(63) Class2_Sub9 local63 = Static49.method971(1, false);
		if (Static487.aBoolean565) {
			local23.method8658(local44, local63.aClass2_Sub5Array1[0], Static472.anInt8136, 0);
		} else {
			local23.method8662(local44, local63.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass2_Sub8_2 != null) {
			@Pc(91) Class137 local91 = this.aClass2_Sub8_2.method4170();
			if (Static487.aBoolean565) {
				arg0.method7469(local91, Static472.anInt8136);
			} else {
				arg0.method7455(local91);
			}
		}
		this.aBoolean66 = local23.F();
		this.anInt1254 = local23.fa();
		this.lb = local23.ma();
		return local63;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8446() {
		return this.aBoolean66;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILclient!ha;)Lclient!ka;")
	private Class184 method1188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class132 arg2) {
		@Pc(8) Class213 local8 = Static111.aClass279_4.method6905(arg1);
		@Pc(13) Class12 local13 = Static64.aClass12Array1[super.aByte140];
		@Pc(31) Class12 local31 = super.aByte141 < 3 ? Static64.aClass12Array1[super.aByte141 + 1] : null;
		return this.aBoolean68 ? local8.method5114(super.anInt10006, super.anInt10001, local31, super.anInt10004, -1, Static334.aClass268_2, arg0, local13, 0, -1, arg2) : local8.method5114(super.anInt10006, super.anInt10001, local31, super.anInt10004, this.anInt1265, Static334.aClass268_2, arg0, local13, this.anInt1256, this.anInt1248, arg2);
	}
}
