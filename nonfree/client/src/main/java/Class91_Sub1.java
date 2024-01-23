import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class91_Sub1 extends Class91 implements Interface4 {

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
	private int anInt3283 = 50;

	@OriginalMember(owner = "client!mo", name = "W", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!mo", name = "L", descriptor = "Lclient!rn;")
	private Class155 aClass155_69;

	@OriginalMember(owner = "client!mo", name = "Q", descriptor = "Lclient!rn;")
	private Class155 aClass155_70;

	@OriginalMember(owner = "client!mo", name = "B", descriptor = "Lclient!df;")
	private Class33 aClass33_10;

	@OriginalMember(owner = "client!mo", name = "z", descriptor = "Lclient!df;")
	private Class33 aClass33_9;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lclient!rn;Lclient!rn;Lclient!rn;IZ)V")
	public Class91_Sub1(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg1, arg0, arg2);
		this.anInt3283 = arg3;
		this.aClass155_69 = arg2;
		this.aBoolean237 = arg4;
		this.aClass155_70 = arg0;
		this.aClass33_10 = new Class33(this.anInt3283);
		if (Static283.aBoolean393) {
			this.aClass33_9 = new Class33(this.anInt3283);
		} else {
			this.aClass33_9 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "(II)I")
	@Override
	public int method2908(@OriginalArg(1) int arg0) {
		return this.method2892(arg0).aByte4 & 0xFF;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)V")
	@Override
	public void method2902(@OriginalArg(0) int arg0) {
		this.method2904(this.aBoolean237 || this.method2892(arg0).aBoolean98 ? 64 : 128, arg0);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method2899(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub4_Sub15 local14 = this.method2918(arg0);
		return local14 == null ? false : local14.method2638(this, this.aClass155_69);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)I")
	@Override
	public int method2898(@OriginalArg(0) int arg0) {
		return this.method2892(arg0).aByte3 & 0xFF;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BZ)V")
	public void method2911(@OriginalArg(1) boolean arg0) {
		this.aBoolean237 = arg0;
		this.method2913();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(FIB)[I")
	@Override
	public int[] method2896(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4_Sub15 local8 = this.method2918(arg1);
		if (local8 == null) {
			return null;
		} else {
			local8.aBoolean211 = true;
			return local8.method2644(this, this.aClass155_69, arg0, this.aBoolean237 || this.method2892(arg1).aBoolean98);
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
	public void method2913() {
		this.aClass33_10.method823();
		if (this.aClass33_9 != null) {
			this.aClass33_9.method823();
		}
		Static159.anIntArray344 = null;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IZ)V")
	public void method2915(@OriginalArg(0) int arg0) {
		this.anInt3283 = arg0;
		this.aClass33_10 = new Class33(this.anInt3283);
		if (Static283.aBoolean393) {
			this.aClass33_9 = new Class33(this.anInt3283);
		} else {
			this.aClass33_9 = null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)Z")
	@Override
	public boolean method2909(@OriginalArg(0) int arg0) {
		return !this.method2892(arg0).aBoolean96;
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method2905(@OriginalArg(1) int arg0) {
		return this.method2892(arg0).aBoolean99;
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(II)[I")
	@Override
	public int[] method2907(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub15 local8 = this.method2918(arg0);
		return local8 == null ? null : local8.method2641(this, this.aClass155_69, this.aBoolean237 || this.method2892(arg0).aBoolean98);
	}

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "(II)Lclient!n;")
	@Override
	protected Class3_Sub4_Sub17 method2895(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub4_Sub15 local16 = this.method2918(arg0);
		return local16 == null ? null : local16.aClass3_Sub4_Sub17_1;
	}

	@OriginalMember(owner = "client!mo", name = "h", descriptor = "(II)Lclient!nh;")
	private Class3_Sub4_Sub18 method2916(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub4_Sub18 local11 = (Class3_Sub4_Sub18) this.aClass33_9.method828((long) arg0);
		if (local11 == null) {
			local11 = new Class3_Sub4_Sub18(this.method2892(arg0).aShort11 & 0xFFFF);
			this.aClass33_9.method827(local11, (long) arg0);
			return local11;
		} else {
			return local11;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2897(@OriginalArg(0) int arg0) {
		return this.aBoolean237 || this.method2892(arg0).aBoolean98;
	}

	@OriginalMember(owner = "client!mo", name = "i", descriptor = "(II)V")
	public void method2917(@OriginalArg(1) int arg0) {
		for (@Pc(7) Class3_Sub4_Sub15 local7 = (Class3_Sub4_Sub15) this.aClass33_10.method825(); local7 != null; local7 = (Class3_Sub4_Sub15) this.aClass33_10.method826()) {
			if (local7.aBoolean211) {
				local7.method2643(arg0);
				local7.aBoolean211 = false;
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(IB)Z")
	@Override
	public boolean method2910(@OriginalArg(0) int arg0) {
		return this.method2892(arg0).aBoolean100;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)I")
	@Override
	public int method2901(@OriginalArg(1) int arg0) {
		return this.method2892(arg0).aByte6 & 0xFF;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIZIF)Lclient!qn;")
	@Override
	public Class3_Sub4_Sub12_Sub2 method2900(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(16) Class3_Sub4_Sub15 local16 = this.method2918(arg0);
		if (local16 != null && local16.method2638(this, this.aClass155_69)) {
			return arg1 ? local16.aClass3_Sub4_Sub17_1.method2935(arg2, this, arg2, this.aClass155_69, (double) arg3) : local16.aClass3_Sub4_Sub17_1.method2945((double) arg3, this, arg2, this.aClass155_69, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(BI)I")
	@Override
	public int method2903(@OriginalArg(1) int arg0) {
		return this.method2892(arg0).aByte5 & 0xFF;
	}

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "(II)Lclient!li;")
	private Class3_Sub4_Sub15 method2918(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub4_Sub15 local11 = (Class3_Sub4_Sub15) this.aClass33_10.method828((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29 = this.aClass155_70.method4121(arg0, 0);
		if (local29 == null) {
			return null;
		} else {
			local11 = new Class3_Sub4_Sub15(new Class3_Sub26(local29));
			this.aClass33_10.method827(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)I")
	@Override
	public int method2906(@OriginalArg(0) int arg0) {
		return this.method2892(arg0).aShort11 & 0xFFFF;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(1) boolean local1 = false;
		Static53.method5036(this.method2892(arg1).aByte5 & 0xFF, this.method2892(arg1).aByte6 & 0xFF);
		@Pc(22) Class3_Sub4_Sub15 local22 = this.method2918(arg1);
		if (local22 != null) {
			local1 = local22.method2637(this, this.aClass155_69, arg0);
		}
		if (!local1) {
			@Pc(45) Class3_Sub4_Sub18 local45 = this.method2916(arg1);
			local45.method3123();
		}
	}
}
