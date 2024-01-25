import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class8_Sub1_Sub2_Sub1 extends Class8_Sub1_Sub2 implements Interface16 {

	@OriginalMember(owner = "client!bba", name = "cb", descriptor = "Lclient!cca;")
	private Class59 aClass59_3;

	@OriginalMember(owner = "client!bba", name = "bb", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!bba", name = "Y", descriptor = "Lclient!nc;")
	public final Class246 aClass246_2;

	@OriginalMember(owner = "client!bba", name = "U", descriptor = "Z")
	private boolean aBoolean55;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIIII)V")
	public Class8_Sub1_Sub2_Sub1(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass246_2 = new Class246(arg0, arg1, arg10, arg11, super.aByte145, arg3, this, arg7, arg12);
		this.aBoolean55 = arg1.anInt951 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(12) Class164 local12 = this.aClass246_2.method5638(262144, arg1, -93, true, false);
		if (arg0 != 0 || local12 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt10355 >> 9;
		@Pc(28) int local28 = super.anInt10363 >> 9;
		@Pc(31) Class203 local31 = arg1.method7672();
		local31.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
		this.aClass246_2.method5631(local12, local23, local28, local31, local28, arg1, local23, (byte) -114, false);
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8906(@OriginalArg(0) byte arg0) {
		if (arg0 != 27) {
			this.aBoolean55 = true;
		}
		return false;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)I")
	@Override
	public int method8089() {
		return this.aClass246_2.anInt6595;
	}

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "(I)V")
	@Override
	public void method8093() {
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		return arg1 < 65 ? null : this.aClass59_3;
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I")
	@Override
	public int method8092(@OriginalArg(0) int arg0) {
		if (arg0 != 18636) {
			this.method8090((Class57) null);
		}
		return this.aClass246_2.anInt6590;
	}

	@OriginalMember(owner = "client!bba", name = "j", descriptor = "(I)I")
	@Override
	public int method8900(@OriginalArg(0) int arg0) {
		if (arg0 != -2226) {
			this.method8904((Class57) null, 48);
		}
		return this.aClass246_2.method5626(-125);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!rn;)V")
	public void method616(@OriginalArg(1) Class309 arg0) {
		this.aClass246_2.method5634(arg0);
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8090(@OriginalArg(1) Class57 arg0) {
		this.aClass246_2.method5630(arg0);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		if (arg3 > -43) {
			Static34.method617(-121);
		}
		@Pc(19) Class164 local19 = this.aClass246_2.method5638(131072, arg2, -125, false, false);
		if (local19 == null) {
			return false;
		} else {
			@Pc(27) Class203 local27 = arg2.method7672();
			local27.method8332(super.aShort104 + super.anInt10355, super.anInt10357, super.aShort105 + super.anInt10363);
			return Static565.aBoolean768 ? local19.method9069(arg1, arg0, local27, false, 0, Static243.anInt4189) : local19.method9093(arg1, arg0, local27, false, 0);
		}
	}

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "(I)I")
	@Override
	protected int method8911() {
		this.method8904((Class57) null, -101);
		return this.aClass246_2.method5627();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(14) Class164 local14 = this.aClass246_2.method5638(2048, arg1, -107, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class203 local22 = arg1.method7672();
		local22.method8332(super.anInt10355 + super.aShort104, super.anInt10357, super.anInt10363 + super.aShort105);
		@Pc(43) Class8_Sub10 local43 = Static213.method3056(this.aBoolean55, 0, 1);
		@Pc(48) int local48 = super.anInt10355 >> 9;
		if (arg0 != -104) {
			this.method8088(84);
		}
		@Pc(62) int local62 = super.anInt10363 >> 9;
		this.aClass246_2.method5631(local14, local48, local62, local22, local62, arg1, local48, (byte) -117, true);
		if (Static565.aBoolean768) {
			local14.method9092(local22, local43.aClass8_Sub7Array1[0], Static243.anInt4189, 0);
		} else {
			local14.method9073(local22, local43.aClass8_Sub7Array1[0], 0);
		}
		if (this.aClass246_2.aClass8_Sub5_6 != null) {
			@Pc(108) Class193 local108 = this.aClass246_2.aClass8_Sub5_6.method4912();
			if (Static565.aBoolean768) {
				arg1.method7662(local108, Static243.anInt4189);
			} else {
				arg1.method7728(local108);
			}
		}
		this.aBoolean54 = local14.F() || this.aClass246_2.aClass8_Sub5_6 != null;
		if (this.aClass59_3 == null) {
			this.aClass59_3 = Static151.method2111(126, local14, super.anInt10357, super.anInt10355, super.anInt10363);
		} else {
			Static599.method8624(super.anInt10355, this.aClass59_3, super.anInt10357, 113, local14, super.anInt10363);
		}
		return local43;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8088(@OriginalArg(0) int arg0) {
		if (arg0 != -9842) {
			Static34.aClass230_1 = null;
		}
		return this.aClass246_2.method5636();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		this.aClass246_2.method5629(arg1);
		if (arg0 > -77) {
			Static34.aClass134Array1 = null;
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Z)I")
	@Override
	public int method8091(@OriginalArg(0) boolean arg0) {
		return arg0 ? -82 : this.aClass246_2.anInt6597;
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8897(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8895(121, 103, (Class57) null, (byte) -102);
		}
		return this.aBoolean54;
	}
}
