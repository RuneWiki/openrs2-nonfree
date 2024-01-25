import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class8_Sub1_Sub1_Sub2 extends Class8_Sub1_Sub1 implements Interface16 {

	@OriginalMember(owner = "client!afa", name = "kb", descriptor = "Lclient!cca;")
	private Class59 aClass59_2;

	@OriginalMember(owner = "client!afa", name = "Z", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!afa", name = "gb", descriptor = "Lclient!nc;")
	public final Class246 aClass246_1;

	@OriginalMember(owner = "client!afa", name = "O", descriptor = "Z")
	private boolean aBoolean25;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZII)V")
	public Class8_Sub1_Sub1_Sub2(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt927);
		this.aClass246_1 = new Class246(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean25 = arg1.anInt951 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Z)I")
	@Override
	public int method8091(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static11.aClass260_Sub1Array1 = null;
		}
		return this.aClass246_1.anInt6597;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)I")
	@Override
	public int method8089() {
		return this.aClass246_1.anInt6595;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8897(@OriginalArg(0) boolean arg0) {
		return arg0 ? true : this.aBoolean26;
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8906(@OriginalArg(0) byte arg0) {
		return arg0 == 27 ? false : false;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8090(@OriginalArg(1) Class57 arg0) {
		this.aClass246_1.method5630(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 <= -77) {
			this.aClass246_1.method5629(arg1);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8088(@OriginalArg(0) int arg0) {
		if (arg0 != -9842) {
			this.aBoolean25 = true;
		}
		return this.aClass246_1.method5636();
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 65) {
			this.method8088(-76);
		}
		return this.aClass59_2;
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 != 0) {
			this.method8907(118, (Class57) null);
		}
		@Pc(20) Class164 local20 = this.aClass246_1.method5638(262144, arg1, -107, true, true);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10355 >> 9;
		@Pc(32) int local32 = super.anInt10363 >> 9;
		@Pc(35) Class203 local35 = arg1.method7672();
		local35.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
		this.aClass246_1.method5631(local20, local27, local32, local35, local32, arg1, local27, (byte) -120, false);
	}

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8899(@OriginalArg(0) byte arg0) {
		if (arg0 != 94) {
			Static11.aColorArray1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BLclient!rn;)V")
	public void method238(@OriginalArg(1) Class309 arg0) {
		this.aClass246_1.method5634(arg0);
	}

	@OriginalMember(owner = "client!afa", name = "j", descriptor = "(I)I")
	@Override
	public int method8900(@OriginalArg(0) int arg0) {
		if (arg0 != -2226) {
			this.method8904((Class57) null, -16);
		}
		return this.aClass246_1.method5626(arg0 ^ 0xFFFFF773);
	}

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "(I)V")
	@Override
	public void method8898(@OriginalArg(0) int arg0) {
		if (arg0 != -38) {
			this.method8898(-65);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "(I)I")
	@Override
	protected int method8911() {
		this.method8897(false);
		return this.aClass246_1.method5627();
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)V")
	@Override
	public void method8093() {
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)I")
	@Override
	public int method8092(@OriginalArg(0) int arg0) {
		if (arg0 != 18636) {
			Static11.anInt224 = 44;
		}
		return this.aClass246_1.anInt6590;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		if (arg3 >= -43) {
			return false;
		}
		@Pc(18) Class164 local18 = this.aClass246_1.method5638(131072, arg2, -107, false, false);
		if (local18 == null) {
			return false;
		} else {
			@Pc(26) Class203 local26 = arg2.method7672();
			local26.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
			return Static565.aBoolean768 ? local18.method9069(arg1, arg0, local26, false, 0, Static243.anInt4189) : local18.method9093(arg1, arg0, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 != -104) {
			this.aBoolean25 = true;
		}
		@Pc(24) Class164 local24 = this.aClass246_1.method5638(2048, arg1, arg0 ^ 0x1B, true, false);
		if (local24 == null) {
			return null;
		}
		@Pc(32) Class203 local32 = arg1.method7672();
		local32.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
		@Pc(48) Class8_Sub10 local48 = Static213.method3056(this.aBoolean25, arg0 + 104, 1);
		@Pc(53) int local53 = super.anInt10355 >> 9;
		@Pc(58) int local58 = super.anInt10363 >> 9;
		this.aClass246_1.method5631(local24, local53, local58, local32, local58, arg1, local53, (byte) -128, true);
		if (Static565.aBoolean768) {
			local24.method9092(local32, local48.aClass8_Sub7Array1[0], Static243.anInt4189, 0);
		} else {
			local24.method9073(local32, local48.aClass8_Sub7Array1[0], 0);
		}
		if (this.aClass246_1.aClass8_Sub5_6 != null) {
			@Pc(104) Class193 local104 = this.aClass246_1.aClass8_Sub5_6.method4912();
			if (Static565.aBoolean768) {
				arg1.method7662(local104, Static243.anInt4189);
			} else {
				arg1.method7728(local104);
			}
		}
		this.aBoolean26 = local24.F() || this.aClass246_1.aClass8_Sub5_6 != null;
		if (this.aClass59_2 == null) {
			this.aClass59_2 = Static151.method2111(118, local24, super.anInt10357, super.anInt10355, super.anInt10363);
		} else {
			Static599.method8624(super.anInt10355, this.aClass59_2, super.anInt10357, arg0 ^ 0xFFFFFFE2, local24, super.anInt10363);
		}
		return local48;
	}
}
