import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class6_Sub3_Sub1 extends Class6_Sub3 implements Interface11 {

	@OriginalMember(owner = "client!bk", name = "J", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "Z")
	private final boolean aBoolean37;

	@OriginalMember(owner = "client!bk", name = "E", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "S")
	private final short aShort25;

	@OriginalMember(owner = "client!bk", name = "C", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!bk", name = "F", descriptor = "Z")
	private final boolean aBoolean38;

	@OriginalMember(owner = "client!bk", name = "S", descriptor = "Z")
	private final boolean aBoolean39;

	@OriginalMember(owner = "client!bk", name = "H", descriptor = "Lclient!j;")
	private Class4_Sub1_Sub7 aClass4_Sub1_Sub7_1;

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "Lclient!c;")
	private Class7 aClass7_1;

	static {
		new Class242("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!qa;Lclient!eu;IIIIZIIIII)V")
	public Class6_Sub3_Sub1(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static437.method5651(arg10, arg11));
		this.aByte15 = (byte) arg2;
		this.aBoolean37 = arg6;
		this.aByte14 = (byte) arg11;
		super.anInt7309 = arg5;
		this.aShort25 = (short) arg1.anInt2158;
		this.aByte13 = (byte) arg10;
		super.anInt7310 = arg3;
		this.aBoolean38 = arg1.anInt2194 != 0 && !arg6;
		this.aBoolean39 = arg0.method4679() && arg1.aBoolean168 && !this.aBoolean37 && Static126.aClass67_Sub1_1.method4523(Static286.anInt5207) != 0;
		@Pc(74) Class82 local74 = this.method627(this.aBoolean39, arg0, 2048);
		if (local74 != null) {
			this.aClass4_Sub1_Sub7_1 = local74.aClass4_Sub1_Sub7_3;
			this.aClass7_1 = local74.aClass7_3;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
	@Override
	public int method5648() {
		return this.aShort25 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	private Class7 method626(@OriginalArg(1) int arg0, @OriginalArg(2) Class30 arg1) {
		if (this.aClass7_1 != null && arg1.method4674(this.aClass7_1.n(), arg0) == 0) {
			return this.aClass7_1;
		} else {
			@Pc(26) Class82 local26 = this.method627(false, arg1, arg0);
			return local26 == null ? null : local26.aClass7_3;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BZLclient!qa;I)Lclient!fo;")
	private Class82 method627(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class71 local13 = Static2.aClass74_13.method1683(this.aShort25 & 0xFFFF);
		@Pc(31) Class146 local31;
		@Pc(35) Class146 local35;
		if (this.aBoolean37) {
			local31 = Static117.aClass146Array1[this.aByte15];
			local35 = Static422.aClass146Array3[0];
		} else {
			local31 = Static422.aClass146Array3[this.aByte15];
			if (this.aByte15 >= 3) {
				local35 = null;
			} else {
				local35 = Static422.aClass146Array3[this.aByte15 + 1];
			}
		}
		return local13.method1625(arg2, this.aByte13, super.anInt7310, super.anInt7309, this.aByte14, local31, local35, arg0, arg1, super.anInt7308);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)I")
	@Override
	public int method5644() {
		return this.aByte13;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
	@Override
	public void method5647() {
		if (this.aClass7_1 != null) {
			this.aClass7_1.method4095();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5642(@OriginalArg(1) Class30 arg0) {
		@Pc(33) Class4_Sub1_Sub7 local33;
		if (this.aClass4_Sub1_Sub7_1 == null && this.aBoolean39) {
			@Pc(26) Class82 local26 = this.method627(true, arg0, 262144);
			local33 = local26 == null ? null : local26.aClass4_Sub1_Sub7_3;
		} else {
			local33 = this.aClass4_Sub1_Sub7_1;
			this.aClass4_Sub1_Sub7_1 = null;
		}
		if (local33 != null) {
			Static13.method320(local33, this.aByte15, super.anInt7310, super.anInt7309, null);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		if (this.aClass7_1 == null) {
			return null;
		}
		@Pc(11) Class116 local11 = arg0.method4678();
		local11.R(super.anInt7307 + super.anInt7310, super.anInt7308, super.anInt7309 + super.anInt7302);
		@Pc(32) Class41_Sub6 local32 = null;
		if (this.aBoolean38) {
			local32 = Static381.method5198(1);
		}
		this.aClass7_1.method4091(local11, local32 == null ? null : local32.aClass41_Sub4Array1[0], 0);
		return local32;
	}

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)I")
	@Override
	public int method5641() {
		return this.aClass7_1 == null ? 0 : this.aClass7_1.b();
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5645() {
		return this.aBoolean39;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)I")
	@Override
	public int method5649() {
		return this.aByte14;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5643(@OriginalArg(1) Class30 arg0) {
		@Pc(24) Class4_Sub1_Sub7 local24;
		if (this.aClass4_Sub1_Sub7_1 == null && this.aBoolean39) {
			@Pc(35) Class82 local35 = this.method627(true, arg0, 262144);
			local24 = local35 == null ? null : local35.aClass4_Sub1_Sub7_3;
		} else {
			local24 = this.aClass4_Sub1_Sub7_1;
			this.aClass4_Sub1_Sub7_1 = null;
		}
		if (local24 != null) {
			Static1.method33(local24, this.aByte15, super.anInt7310, super.anInt7309, null);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	@Override
	public Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1) {
		return this.method626(arg0, arg1);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(14) Class7 local14 = this.method626(131072, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class116 local19 = arg2.method4678();
			local19.R(super.anInt7310, super.anInt7308, super.anInt7309);
			return local14.method4082(arg0, arg1, local19, false);
		}
	}
}
