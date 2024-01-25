import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class6_Sub3_Sub2 extends Class6_Sub3 implements Interface11 {

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "Lclient!pd;")
	public final Class185 aClass185_2;

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "Z")
	private final boolean aBoolean210;

	static {
		new Class242(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!qa;Lclient!eu;IIIIIZIIIIII)V")
	public Class6_Sub3_Sub2(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static398.method5291(arg11, arg12));
		this.aClass185_2 = new Class185(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean210 = arg1.anInt2194 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		@Pc(21) Class7 local21 = this.aClass185_2.method4121(true, arg0, false, super.anInt7309, 2048, super.anInt7310);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class116 local28 = arg0.method4678();
		local28.R(super.anInt7307 + super.anInt7310, super.anInt7308, super.anInt7309 + super.anInt7302);
		@Pc(44) Class41_Sub6 local44 = null;
		if (this.aBoolean210) {
			local44 = Static381.method5198(1);
		}
		if (this.aClass185_2.aClass41_Sub1_6 == null) {
			local21.method4091(local28, local44 == null ? null : local44.aClass41_Sub4Array1[0], 0);
		} else {
			@Pc(74) Class256 local74 = this.aClass185_2.aClass41_Sub1_6.method3166();
			arg0.method4676(local21, local74, local28, local44 == null ? null : local44.aClass41_Sub4Array1[0]);
		}
		@Pc(93) int local93 = super.anInt7310 >> 7;
		@Pc(98) int local98 = super.anInt7309 >> 7;
		this.aClass185_2.method4120(local98, local93, true, local93, local98, arg0, local21);
		return local44;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I")
	@Override
	public int method5649() {
		return this.aClass185_2.anInt5358;
	}

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)I")
	@Override
	public int method5641() {
		return this.aClass185_2.method4132();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)I")
	@Override
	public int method5644() {
		return this.aClass185_2.anInt5366;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5643(@OriginalArg(1) Class30 arg0) {
		this.aClass185_2.method4129(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5642(@OriginalArg(1) Class30 arg0) {
		this.aClass185_2.method4130(arg0);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)I")
	@Override
	public int method5648() {
		return this.aClass185_2.anInt5364;
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)V")
	@Override
	public void method5647() {
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(18) Class7 local18 = this.aClass185_2.method4121(false, arg2, false, super.anInt7309, 131072, super.anInt7310);
		if (local18 == null) {
			return false;
		} else {
			@Pc(33) Class116 local33 = arg2.method4678();
			local33.R(super.anInt7310 + super.anInt7307, super.anInt7308, super.anInt7302 + super.anInt7309);
			return local18.method4082(arg0, arg1, local33, false);
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
		@Pc(21) Class7 local21 = this.aClass185_2.method4121(true, arg0, false, super.anInt7309, 262144, super.anInt7310);
		if (local21 != null) {
			@Pc(28) int local28 = super.anInt7310 >> 7;
			@Pc(33) int local33 = super.anInt7309 >> 7;
			this.aClass185_2.method4120(local33, local28, false, local28, local33, arg0, local21);
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5645() {
		return this.aClass185_2.method4124();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	@Override
	public Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1) {
		return this.aClass185_2.method4121(false, arg1, false, 0, arg0, 0);
	}
}
