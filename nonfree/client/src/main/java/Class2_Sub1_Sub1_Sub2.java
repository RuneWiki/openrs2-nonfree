import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class2_Sub1_Sub1_Sub2 extends Class2_Sub1_Sub1 implements Interface18 {

	@OriginalMember(owner = "client!gr", name = "xb", descriptor = "Lclient!tja;")
	private Class338 aClass338_4;

	@OriginalMember(owner = "client!gr", name = "yb", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!gr", name = "mb", descriptor = "Lclient!wm;")
	public final Class390 aClass390_2;

	@OriginalMember(owner = "client!gr", name = "hb", descriptor = "Z")
	private final boolean aBoolean204;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!ha;Lclient!ro;IIIIIZIIIIIII)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class308 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8586 == 1, Static360.method8249(arg13, arg12));
		this.aClass390_2 = new Class390(arg0, arg1, arg12, arg13, super.aByte140, arg3, this, arg7, arg14);
		this.aBoolean204 = arg1.anInt8580 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(B)I")
	@Override
	public int method8444() {
		return this.aClass390_2.method9086();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!ha;)Lclient!rk;")
	@Override
	public Class2_Sub9 method8448(@OriginalArg(1) Class132 arg0) {
		@Pc(14) Class184 local14 = this.aClass390_2.method9082(false, arg0, 2048, true);
		if (local14 == null) {
			return null;
		}
		@Pc(27) Class207 local27 = arg0.method7456();
		local27.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
		@Pc(41) Class2_Sub9 local41 = Static49.method971(1, this.aBoolean204);
		this.aClass390_2.method9089(super.aShort121, super.aShort119, super.aShort118, true, super.aShort120, arg0, local14, local27);
		if (Static487.aBoolean565) {
			local14.method8658(local27, local41.aClass2_Sub5Array1[0], Static472.anInt8136, 0);
		} else {
			local14.method8662(local27, local41.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass390_2.aClass2_Sub8_8 != null) {
			@Pc(87) Class137 local87 = this.aClass390_2.aClass2_Sub8_8.method4170();
			if (Static487.aBoolean565) {
				arg0.method7469(local87, Static472.anInt8136);
			} else {
				arg0.method7455(local87);
			}
		}
		this.aBoolean205 = local14.F() || this.aClass390_2.aClass2_Sub8_8 != null;
		if (this.aClass338_4 == null) {
			this.aClass338_4 = Static607.method8310(super.anInt10006, super.anInt10004, local14, super.anInt10001);
		} else {
			Static53.method1031(super.anInt10006, this.aClass338_4, super.anInt10001, local14, super.anInt10004);
		}
		return local41;
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method8446() {
		return this.aBoolean205;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8458(@OriginalArg(0) Class132 arg0) {
		@Pc(12) Class184 local12 = this.aClass390_2.method9082(true, arg0, 262144, true);
		if (local12 != null) {
			@Pc(25) Class207 local25 = arg0.method7456();
			local25.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
			this.aClass390_2.method9089(super.aShort121, super.aShort119, super.aShort118, false, super.aShort120, arg0, local12, local25);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8470(@OriginalArg(0) Class132 arg0) {
		this.aClass390_2.method9079(arg0);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class184 local12 = this.aClass390_2.method9082(false, arg1, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(24) Class207 local24 = arg1.method7456();
			local24.method8212(super.anInt10006, super.anInt10004, super.anInt10001);
			return Static487.aBoolean565 ? local12.method8653(arg0, arg2, local24, false, 0, Static472.anInt8136) : local12.method8656(arg0, arg2, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8474() {
		return this.aClass390_2.method9085();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method8471(@OriginalArg(0) Class132 arg0) {
		this.aClass390_2.method9080(arg0);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!aka;I)V")
	public void method2796(@OriginalArg(0) Class18 arg0) {
		this.aClass390_2.method9076(arg0);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)I")
	@Override
	public int method8469() {
		return this.aClass390_2.anInt10742;
	}

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "(B)V")
	@Override
	public void method8449() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)I")
	@Override
	public int method8473() {
		return this.aClass390_2.anInt10752;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)I")
	@Override
	public int method8472() {
		return this.aClass390_2.anInt10748;
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)I")
	@Override
	protected int method8442() {
		return this.aClass390_2.method9083(-16897);
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(Lclient!ha;I)Lclient!tja;")
	@Override
	public Class338 method8459(@OriginalArg(0) Class132 arg0) {
		return this.aClass338_4;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!oq;IZILclient!ha;II)V")
	@Override
	public void method8462(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8447() {
		return false;
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8451() {
		return false;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(Z)V")
	@Override
	public void method8475() {
	}
}
