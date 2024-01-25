import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class2_Sub1_Sub4_Sub1 extends Class2_Sub1_Sub4 implements Interface18 {

	@OriginalMember(owner = "client!jc", name = "lb", descriptor = "Lclient!ada;")
	public static final Class7 lb = new Class7();

	@OriginalMember(owner = "client!jc", name = "ib", descriptor = "Lclient!tja;")
	private Class338 aClass338_6;

	@OriginalMember(owner = "client!jc", name = "jb", descriptor = "Z")
	private boolean aBoolean289 = false;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "Lclient!wm;")
	public final Class390 aClass390_4;

	@OriginalMember(owner = "client!jc", name = "nb", descriptor = "Z")
	private final boolean aBoolean290;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!ha;Lclient!ro;IIIIIZIIIII)V")
	public Class2_Sub1_Sub4_Sub1(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass390_4 = new Class390(arg0, arg1, arg10, arg11, super.aByte140, arg3, this, arg7, arg12);
		this.aBoolean290 = arg1.anInt8580 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!aka;)V")
	public void method3963(@OriginalArg(1) Class18 arg0) {
		this.aClass390_4.method9076(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8446() {
		return this.aBoolean289;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)I")
	@Override
	public int method8444() {
		return this.aClass390_4.method9086();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
	@Override
	public int method8473() {
		return this.aClass390_4.anInt10752;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
	@Override
	public int method8472() {
		return this.aClass390_4.anInt10748;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8470(@OriginalArg(0) Class132 arg0) {
		this.aClass390_4.method9079(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8474() {
		return this.aClass390_4.method9085();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8471(@OriginalArg(0) Class132 arg0) {
		this.aClass390_4.method9080(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	@Override
	public void method8475() {
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		return this.aClass338_6;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		@Pc(21) Class184 local21 = this.aClass390_4.method9082(false, arg0, 2048, true);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class207 local28 = arg0.method7456();
		local28.method8212(super.aShort112 + super.anInt10006, super.anInt10004, super.aShort111 + super.anInt10001);
		@Pc(48) Class2_Sub9 local48 = Static49.method971(1, this.aBoolean290);
		@Pc(53) int local53 = super.anInt10006 >> 9;
		@Pc(58) int local58 = super.anInt10001 >> 9;
		this.aClass390_4.method9089(local58, local53, local53, true, local58, arg0, local21, local28);
		if (Static487.aBoolean565) {
			local21.method8658(local28, local48.aClass2_Sub5Array1[0], Static472.anInt8136, 0);
		} else {
			local21.method8662(local28, local48.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass390_4.aClass2_Sub8_8 != null) {
			@Pc(100) Class137 local100 = this.aClass390_4.aClass2_Sub8_8.method4170();
			if (Static487.aBoolean565) {
				arg0.method7469(local100, Static472.anInt8136);
			} else {
				arg0.method7455(local100);
			}
		}
		this.aBoolean289 = local21.F() || this.aClass390_4.aClass2_Sub8_8 != null;
		if (this.aClass338_6 == null) {
			this.aClass338_6 = Static607.method8310(super.anInt10006, super.anInt10004, local21, super.anInt10001);
		} else {
			Static53.method1031(super.anInt10006, this.aClass338_6, super.anInt10001, local21, super.anInt10004);
		}
		return local48;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
		@Pc(20) Class184 local20 = this.aClass390_4.method9082(false, arg0, 262144, true);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10006 >> 9;
		@Pc(32) int local32 = super.anInt10001 >> 9;
		@Pc(35) Class207 local35 = arg0.method7456();
		local35.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
		this.aClass390_4.method9089(local32, local27, local27, false, local32, arg0, local20, local35);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	@Override
	public int method8469() {
		return this.aClass390_4.anInt10742;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class184 local17 = this.aClass390_4.method9082(false, arg1, 131072, false);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class207 local24 = arg1.method7456();
			local24.method8212(super.aShort112 + super.anInt10006, super.anInt10004, super.aShort111 + super.anInt10001);
			return Static487.aBoolean565 ? local17.method8653(arg0, arg2, local24, false, 0, Static472.anInt8136) : local17.method8656(arg0, arg2, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8447() {
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I")
	@Override
	protected int method8442() {
		return this.aClass390_4.method9083(-16897);
	}
}
