import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class8_Sub1_Sub3_Sub3 extends Class8_Sub1_Sub3 implements Interface16 {

	@OriginalMember(owner = "client!fh", name = "Q", descriptor = "Lclient!cca;")
	private Class59 aClass59_4;

	@OriginalMember(owner = "client!fh", name = "db", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!fh", name = "Z", descriptor = "Lclient!nc;")
	public final Class246 aClass246_3;

	@OriginalMember(owner = "client!fh", name = "kb", descriptor = "Z")
	private boolean aBoolean244;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIIIIII)V")
	public Class8_Sub1_Sub3_Sub3(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt905 == 1, Static241.method8513(arg13, arg12));
		this.aClass246_3 = new Class246(arg0, arg1, arg12, arg13, super.aByte145, arg3, this, arg7, arg14);
		this.aBoolean244 = arg1.anInt951 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLclient!rn;)V")
	public void method2444(@OriginalArg(1) Class309 arg0) {
		this.aClass246_3.method5634(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)I")
	@Override
	protected int method8911() {
		Static168.aClass73_8 = null;
		return this.aClass246_3.method5627();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		if (arg0 <= -77) {
			this.aClass246_3.method5629(arg1);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)I")
	@Override
	public int method8092(@OriginalArg(0) int arg0) {
		if (arg0 != 18636) {
			this.method8088(95);
		}
		return this.aClass246_3.anInt6590;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8090(@OriginalArg(1) Class57 arg0) {
		this.aClass246_3.method5630(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	@Override
	public void method8093() {
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(12) Class164 local12 = this.aClass246_3.method5638(262144, arg1, -107, true, true);
		if (arg0 != 0) {
			this.method8906((byte) 21);
		}
		if (local12 != null) {
			@Pc(25) Class203 local25 = arg1.method7672();
			local25.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
			this.aClass246_3.method5631(local12, super.aShort110, super.aShort107, local25, super.aShort108, arg1, super.aShort109, (byte) -118, false);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 65) {
			Static168.method2446((byte) 95);
		}
		return this.aClass59_4;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8088(@OriginalArg(0) int arg0) {
		if (arg0 != -9842) {
			this.aBoolean244 = false;
		}
		return this.aClass246_3.method5636();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		@Pc(12) Class164 local12 = this.aClass246_3.method5638(131072, arg2, -101, false, false);
		if (local12 == null) {
			return false;
		}
		@Pc(20) Class203 local20 = arg2.method7672();
		local20.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
		if (arg3 > -43) {
			this.aBoolean244 = false;
		}
		return Static565.aBoolean768 ? local12.method9069(arg1, arg0, local20, false, 0, Static243.anInt4189) : local12.method9093(arg1, arg0, local20, false, 0);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8897(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8907(-44, (Class57) null);
		}
		return this.aBoolean245;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(14) Class164 local14 = this.aClass246_3.method5638(2048, arg1, -89, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class203 local22 = arg1.method7672();
		local22.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
		@Pc(36) Class8_Sub10 local36 = Static213.method3056(this.aBoolean244, 0, 1);
		this.aClass246_3.method5631(local14, super.aShort110, super.aShort107, local22, super.aShort108, arg1, super.aShort109, (byte) -119, true);
		if (arg0 != -104) {
			Static168.aBoolean243 = false;
		}
		if (Static565.aBoolean768) {
			local14.method9092(local22, local36.aClass8_Sub7Array1[0], Static243.anInt4189, 0);
		} else {
			local14.method9073(local22, local36.aClass8_Sub7Array1[0], 0);
		}
		if (this.aClass246_3.aClass8_Sub5_6 != null) {
			@Pc(93) Class193 local93 = this.aClass246_3.aClass8_Sub5_6.method4912();
			if (Static565.aBoolean768) {
				arg1.method7662(local93, Static243.anInt4189);
			} else {
				arg1.method7728(local93);
			}
		}
		this.aBoolean245 = local14.F() || this.aClass246_3.aClass8_Sub5_6 != null;
		if (this.aClass59_4 == null) {
			this.aClass59_4 = Static151.method2111(arg0 ^ 0x38, local14, super.anInt10357, super.anInt10355, super.anInt10363);
		} else {
			Static599.method8624(super.anInt10355, this.aClass59_4, super.anInt10357, arg0 + 228, local14, super.anInt10363);
		}
		return local36;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)I")
	@Override
	public int method8089() {
		return this.aClass246_3.anInt6595;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)I")
	@Override
	public int method8091(@OriginalArg(0) boolean arg0) {
		return arg0 ? 24 : this.aClass246_3.anInt6597;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8906(@OriginalArg(0) byte arg0) {
		if (arg0 != 27) {
			this.method8898(56);
		}
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8899(@OriginalArg(0) byte arg0) {
		return arg0 != 94;
	}

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "(I)V")
	@Override
	public void method8898(@OriginalArg(0) int arg0) {
		if (arg0 == -38) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "(I)I")
	@Override
	public int method8900(@OriginalArg(0) int arg0) {
		if (arg0 != -2226) {
			Static168.aClass73_8 = null;
		}
		return this.aClass246_3.method5626(38);
	}
}
