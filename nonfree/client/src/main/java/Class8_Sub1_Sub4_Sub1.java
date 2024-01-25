import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class8_Sub1_Sub4_Sub1 extends Class8_Sub1_Sub4 implements Interface16 {

	@OriginalMember(owner = "client!jn", name = "S", descriptor = "Lclient!cca;")
	private Class59 aClass59_5;

	@OriginalMember(owner = "client!jn", name = "ib", descriptor = "Z")
	private boolean aBoolean386 = false;

	@OriginalMember(owner = "client!jn", name = "O", descriptor = "Lclient!nc;")
	public final Class246 aClass246_4;

	@OriginalMember(owner = "client!jn", name = "bb", descriptor = "Z")
	private boolean aBoolean387;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIII)V")
	public Class8_Sub1_Sub4_Sub1(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static444.method6611(arg9, arg8));
		this.aClass246_4 = new Class246(arg0, arg1, arg8, arg9, super.aByte145, arg3, this, arg7, arg10);
		this.aBoolean387 = arg1.anInt951 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8088(@OriginalArg(0) int arg0) {
		if (arg0 != -9842) {
			this.aBoolean387 = true;
		}
		return this.aClass246_4.method5636();
	}

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "(I)I")
	@Override
	public int method8900(@OriginalArg(0) int arg0) {
		if (arg0 != -2226) {
			this.method8906((byte) 53);
		}
		return this.aClass246_4.method5626(-128);
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8899(@OriginalArg(0) byte arg0) {
		if (arg0 != 94) {
			this.method8897(false);
		}
		return false;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!rn;)V")
	public void method4223(@OriginalArg(1) Class309 arg0) {
		this.aClass246_4.method5634(arg0);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)I")
	@Override
	public int method8091(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8897(false);
		}
		return this.aClass246_4.anInt6597;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)I")
	@Override
	public int method8089() {
		return this.aClass246_4.anInt6595;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(14) Class164 local14 = this.aClass246_4.method5638(2048, arg1, -122, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class203 local22 = arg1.method7672();
		local22.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
		if (arg0 != -104) {
			return null;
		}
		@Pc(42) Class8_Sub10 local42 = Static213.method3056(this.aBoolean387, 0, 1);
		@Pc(47) int local47 = super.anInt10355 >> 9;
		@Pc(52) int local52 = super.anInt10363 >> 9;
		this.aClass246_4.method5631(local14, local47, local52, local22, local52, arg1, local47, (byte) -117, true);
		if (Static565.aBoolean768) {
			local14.method9092(local22, local42.aClass8_Sub7Array1[0], Static243.anInt4189, 0);
		} else {
			local14.method9073(local22, local42.aClass8_Sub7Array1[0], 0);
		}
		if (this.aClass246_4.aClass8_Sub5_6 != null) {
			@Pc(98) Class193 local98 = this.aClass246_4.aClass8_Sub5_6.method4912();
			if (Static565.aBoolean768) {
				arg1.method7662(local98, Static243.anInt4189);
			} else {
				arg1.method7728(local98);
			}
		}
		this.aBoolean386 = local14.F() || this.aClass246_4.aClass8_Sub5_6 != null;
		if (this.aClass59_5 == null) {
			this.aClass59_5 = Static151.method2111(26, local14, super.anInt10357, super.anInt10355, super.anInt10363);
		} else {
			Static599.method8624(super.anInt10355, this.aClass59_5, super.anInt10357, arg0 ^ 0xFFFFFFEC, local14, super.anInt10363);
		}
		return local42;
	}

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)I")
	@Override
	protected int method8911() {
		this.method8087(-118, (Class57) null);
		return this.aClass246_4.method5627();
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
	@Override
	public void method8093() {
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		this.aClass246_4.method5629(arg1);
		if (arg0 > -77) {
			Static285.anInt4975 = 120;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		@Pc(12) Class164 local12 = this.aClass246_4.method5638(131072, arg2, -96, false, false);
		if (local12 == null) {
			return false;
		} else if (arg3 > -43) {
			return false;
		} else {
			@Pc(26) Class203 local26 = arg2.method7672();
			local26.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
			return Static565.aBoolean768 ? local12.method9069(arg1, arg0, local26, false, 0, Static243.anInt4189) : local12.method9093(arg1, arg0, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8090(@OriginalArg(1) Class57 arg0) {
		this.aClass246_4.method5630(arg0);
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)I")
	@Override
	public int method8092(@OriginalArg(0) int arg0) {
		if (arg0 != 18636) {
			this.method8897(true);
		}
		return this.aClass246_4.anInt6590;
	}

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "(I)V")
	@Override
	public void method8898(@OriginalArg(0) int arg0) {
		if (arg0 != -38) {
			Static285.method4225(49);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		return arg1 <= 65 ? null : this.aClass59_5;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8897(@OriginalArg(0) boolean arg0) {
		return arg0 ? false : this.aBoolean386;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8906(@OriginalArg(0) byte arg0) {
		return arg0 == 27 ? false : false;
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(12) Class164 local12 = this.aClass246_4.method5638(262144, arg1, -107, true, true);
		if (arg0 != 0) {
			this.aBoolean387 = false;
		}
		if (local12 == null) {
			return;
		}
		@Pc(26) int local26 = super.anInt10355 >> 9;
		@Pc(31) int local31 = super.anInt10363 >> 9;
		@Pc(34) Class203 local34 = arg1.method7672();
		local34.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
		this.aClass246_4.method5631(local12, local26, local31, local34, local31, arg1, local26, (byte) -127, false);
	}
}
