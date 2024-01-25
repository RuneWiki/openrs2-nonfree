import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class2_Sub1_Sub3_Sub2 extends Class2_Sub1_Sub3 implements Interface18 {

	@OriginalMember(owner = "client!iba", name = "X", descriptor = "Lclient!tja;")
	private Class338 aClass338_5;

	@OriginalMember(owner = "client!iba", name = "ob", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!iba", name = "fb", descriptor = "Lclient!wm;")
	public final Class390 aClass390_3;

	@OriginalMember(owner = "client!iba", name = "sb", descriptor = "Z")
	private final boolean aBoolean264;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!ha;Lclient!ro;IIIIIZII)V")
	public Class2_Sub1_Sub3_Sub2(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt8566);
		this.aClass390_3 = new Class390(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean264 = arg1.anInt8580 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8446() {
		return this.aBoolean263;
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(Z)V")
	@Override
	public void method8475() {
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		@Pc(14) Class184 local14 = this.aClass390_3.method9082(false, arg0, 2048, true);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class207 local21 = arg0.method7456();
		local21.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
		@Pc(35) Class2_Sub9 local35 = Static49.method971(1, this.aBoolean264);
		@Pc(40) int local40 = super.anInt10006 >> 9;
		@Pc(52) int local52 = super.anInt10001 >> 9;
		this.aClass390_3.method9089(local52, local40, local40, true, local52, arg0, local14, local21);
		if (Static487.aBoolean565) {
			local14.method8658(local21, local35.aClass2_Sub5Array1[0], Static472.anInt8136, 0);
		} else {
			local14.method8662(local21, local35.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass390_3.aClass2_Sub8_8 != null) {
			@Pc(94) Class137 local94 = this.aClass390_3.aClass2_Sub8_8.method4170();
			if (Static487.aBoolean565) {
				arg0.method7469(local94, Static472.anInt8136);
			} else {
				arg0.method7455(local94);
			}
		}
		this.aBoolean263 = local14.F() || this.aClass390_3.aClass2_Sub8_8 != null;
		if (this.aClass338_5 == null) {
			this.aClass338_5 = Static607.method8310(super.anInt10006, super.anInt10004, local14, super.anInt10001);
		} else {
			Static53.method1031(super.anInt10006, this.aClass338_5, super.anInt10001, local14, super.anInt10004);
		}
		return local35;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8471(@OriginalArg(0) Class132 arg0) {
		this.aClass390_3.method9080(arg0);
	}

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "(B)V")
	@Override
	public void method8449() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!aka;)V")
	public void method3561(@OriginalArg(1) Class18 arg0) {
		this.aClass390_3.method9076(arg0);
	}

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8451() {
		return false;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)I")
	@Override
	public int method8473() {
		return this.aClass390_3.anInt10752;
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8474() {
		return this.aClass390_3.method9085();
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		return this.aClass338_5;
	}

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)I")
	@Override
	protected int method8442() {
		return this.aClass390_3.method9083(-16897);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Z)I")
	@Override
	public int method8472() {
		return this.aClass390_3.anInt10748;
	}

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "(B)I")
	@Override
	public int method8444() {
		return this.aClass390_3.method9086();
	}

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
		@Pc(12) Class184 local12 = this.aClass390_3.method9082(true, arg0, 262144, true);
		if (local12 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10006 >> 9;
		@Pc(32) int local32 = super.anInt10001 >> 9;
		@Pc(35) Class207 local35 = arg0.method7456();
		local35.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
		this.aClass390_3.method9089(local32, local27, local27, false, local32, arg0, local12, local35);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8470(@OriginalArg(0) Class132 arg0) {
		this.aClass390_3.method9079(arg0);
	}

	@OriginalMember(owner = "client!iba", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8447() {
		return false;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)I")
	@Override
	public int method8469() {
		return this.aClass390_3.anInt10742;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class184 local18 = this.aClass390_3.method9082(false, arg1, 131072, false);
		if (local18 == null) {
			return false;
		} else {
			@Pc(25) Class207 local25 = arg1.method7456();
			local25.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
			return Static487.aBoolean565 ? local18.method8653(arg0, arg2, local25, false, 0, Static472.anInt8136) : local18.method8656(arg0, arg2, local25, false, 0);
		}
	}
}
