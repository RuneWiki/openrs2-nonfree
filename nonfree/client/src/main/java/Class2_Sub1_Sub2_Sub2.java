import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class2_Sub1_Sub2_Sub2 extends Class2_Sub1_Sub2 implements Interface18 {

	@OriginalMember(owner = "client!ec", name = "bb", descriptor = "Lclient!tja;")
	private Class338 aClass338_3;

	@OriginalMember(owner = "client!ec", name = "W", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!ec", name = "cb", descriptor = "Lclient!wm;")
	public final Class390 aClass390_1;

	@OriginalMember(owner = "client!ec", name = "jb", descriptor = "Z")
	private final boolean aBoolean130;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!ha;Lclient!ro;IIIIIZIII)V")
	public Class2_Sub1_Sub2_Sub2(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static667.method9050(arg8, arg9));
		this.aClass390_1 = new Class390(arg0, arg1, arg8, arg9, super.aByte140, arg3, this, arg7, arg10);
		this.aBoolean130 = arg1.anInt8580 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V")
	@Override
	public void method8449() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		@Pc(14) Class184 local14 = this.aClass390_1.method9082(false, arg0, 2048, true);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class207 local21 = arg0.method7456();
		local21.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
		@Pc(35) Class2_Sub9 local35 = Static49.method971(1, this.aBoolean130);
		@Pc(40) int local40 = super.anInt10006 >> 9;
		@Pc(45) int local45 = super.anInt10001 >> 9;
		this.aClass390_1.method9089(local45, local40, local40, true, local45, arg0, local14, local21);
		if (Static487.aBoolean565) {
			local14.method8658(local21, local35.aClass2_Sub5Array1[0], Static472.anInt8136, 0);
		} else {
			local14.method8662(local21, local35.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass390_1.aClass2_Sub8_8 != null) {
			@Pc(87) Class137 local87 = this.aClass390_1.aClass2_Sub8_8.method4170();
			if (Static487.aBoolean565) {
				arg0.method7469(local87, Static472.anInt8136);
			} else {
				arg0.method7455(local87);
			}
		}
		this.aBoolean129 = local14.F() || this.aClass390_1.aClass2_Sub8_8 != null;
		if (this.aClass338_3 == null) {
			this.aClass338_3 = Static607.method8310(super.anInt10006, super.anInt10004, local14, super.anInt10001);
		} else {
			Static53.method1031(super.anInt10006, this.aClass338_3, super.anInt10001, local14, super.anInt10004);
		}
		return local35;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
	@Override
	public void method8475() {
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8474() {
		return this.aClass390_1.method9085();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
	@Override
	public int method8473() {
		return this.aClass390_1.anInt10752;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)I")
	@Override
	protected int method8442() {
		return this.aClass390_1.method9083(-16897);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
		@Pc(12) Class184 local12 = this.aClass390_1.method9082(true, arg0, 262144, true);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10006 >> 9;
		@Pc(24) int local24 = super.anInt10001 >> 9;
		@Pc(27) Class207 local27 = arg0.method7456();
		local27.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
		this.aClass390_1.method9089(local24, local19, local19, false, local24, arg0, local12, local27);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8446() {
		return this.aBoolean129;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8447() {
		return false;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8470(@OriginalArg(0) Class132 arg0) {
		this.aClass390_1.method9079(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8451() {
		return false;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!aka;I)V")
	public void method1885(@OriginalArg(0) Class18 arg0) {
		this.aClass390_1.method9076(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I")
	@Override
	public int method8469() {
		return this.aClass390_1.anInt10742;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class184 local12 = this.aClass390_1.method9082(false, arg1, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class207 local19 = arg1.method7456();
			local19.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
			return Static487.aBoolean565 ? local12.method8653(arg0, arg2, local19, false, 0, Static472.anInt8136) : local12.method8656(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		return this.aClass338_3;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I")
	@Override
	public int method8472() {
		return this.aClass390_1.anInt10748;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8471(@OriginalArg(0) Class132 arg0) {
		this.aClass390_1.method9080(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)I")
	@Override
	public int method8444() {
		return this.aClass390_1.method9086();
	}
}
