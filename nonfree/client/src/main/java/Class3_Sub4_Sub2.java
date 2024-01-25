import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 implements Interface10 {

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "Z")
	private final boolean aBoolean322;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "B")
	private final byte aByte47;

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "B")
	private final byte aByte45;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "S")
	private final short aShort60;

	@OriginalMember(owner = "client!ne", name = "G", descriptor = "B")
	private final byte aByte46;

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "Z")
	private final boolean aBoolean323;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "Z")
	private final boolean aBoolean321;

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "Lclient!cd;")
	private Class39 aClass39_6;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "Lclient!h;")
	private Class6_Sub1_Sub8 aClass6_Sub1_Sub8_5;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!qq;Lclient!in;IIIIZIIIII)V")
	public Class3_Sub4_Sub2(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static56.method1053(arg11, arg10));
		super.anInt4924 = arg3;
		this.aBoolean322 = arg1.anInt2984 != 0 && !arg6;
		this.aByte47 = (byte) arg10;
		this.aByte45 = (byte) arg2;
		super.anInt4917 = arg5;
		this.aShort60 = (short) arg1.anInt3021;
		this.aByte46 = (byte) arg11;
		this.aBoolean323 = arg6;
		this.aBoolean321 = arg0.method3522() && arg1.aBoolean212 && !this.aBoolean323 && Static8.aClass173_Sub1_1.anInt4420 != 0;
		@Pc(72) Class51 local72 = this.method4042(arg0, this.aBoolean321, 2048);
		if (local72 != null) {
			this.aClass39_6 = local72.aClass39_3;
			this.aClass6_Sub1_Sub8_5 = local72.aClass6_Sub1_Sub8_3;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5809(@OriginalArg(1) Class28 arg0) {
		@Pc(14) Class6_Sub1_Sub8 local14;
		if (this.aClass6_Sub1_Sub8_5 == null && this.aBoolean321) {
			@Pc(25) Class51 local25 = this.method4042(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass6_Sub1_Sub8_3;
		} else {
			local14 = this.aClass6_Sub1_Sub8_5;
			this.aClass6_Sub1_Sub8_5 = null;
		}
		if (local14 != null) {
			Static441.method5932(local14, this.aByte45, super.anInt4924, super.anInt4917, null);
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)I")
	@Override
	public int method5811() {
		return this.aByte46;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class39 local14 = this.method4046(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class132 local19 = arg0.method3564();
			local19.method3986(super.anInt4924, super.anInt4914, super.anInt4917);
			return local14.method4888(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!cd;")
	@Override
	public Class39 method5808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		return this.method4046(arg0, arg1);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!qq;ZI)Lclient!di;")
	private Class51 method4042(@OriginalArg(1) Class28 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class118 local23 = Static113.aClass127_2.method2820(this.aShort60 & 0xFFFF);
		@Pc(31) Class84 local31;
		@Pc(35) Class84 local35;
		if (this.aBoolean323) {
			local31 = Static365.aClass84Array3[this.aByte45];
			local35 = Static93.aClass84Array1[0];
		} else {
			local31 = Static93.aClass84Array1[this.aByte45];
			if (this.aByte45 >= 3) {
				local35 = null;
			} else {
				local35 = Static93.aClass84Array1[this.aByte45 + 1];
			}
		}
		return local23.method2716(this.aByte46, super.anInt4917, super.anInt4924, local35, super.anInt4914, arg2, this.aByte47, arg0, local31, arg1);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5806() {
		return this.aBoolean321;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	@Override
	public void method5810() {
		if (this.aClass39_6 != null) {
			this.aClass39_6.method4887();
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method5813(@OriginalArg(0) Class28 arg0) {
		@Pc(33) Class6_Sub1_Sub8 local33;
		if (this.aClass6_Sub1_Sub8_5 == null && this.aBoolean321) {
			@Pc(26) Class51 local26 = this.method4042(arg0, true, 262144);
			local33 = local26 == null ? null : local26.aClass6_Sub1_Sub8_3;
		} else {
			local33 = this.aClass6_Sub1_Sub8_5;
			this.aClass6_Sub1_Sub8_5 = null;
		}
		if (local33 != null) {
			Static192.method3030(local33, this.aByte45, super.anInt4924, super.anInt4917, null);
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)I")
	@Override
	public int method4354() {
		return this.aClass39_6 == null ? 0 : this.aClass39_6.method4875();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)I")
	@Override
	public int method5807() {
		return this.aByte47;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		if (this.aClass39_6 == null) {
			return null;
		}
		@Pc(11) Class132 local11 = arg0.method3564();
		local11.method3986(super.anInt4924 + super.anInt4922, super.anInt4914, super.anInt4920 + super.anInt4917);
		@Pc(27) Class48_Sub6 local27 = null;
		if (this.aBoolean322) {
			local27 = Static403.method5489(1);
		}
		this.aClass39_6.method4910(local11, local27 == null ? null : local27.aClass48_Sub7Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I")
	@Override
	public int method5812() {
		return this.aShort60 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!qq;II)Lclient!cd;")
	private Class39 method4046(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass39_6 != null && arg0.method3532(this.aClass39_6.method4900(), arg1) == 0) {
			return this.aClass39_6;
		} else {
			@Pc(30) Class51 local30 = this.method4042(arg0, false, arg1);
			return local30 == null ? null : local30.aClass39_3;
		}
	}
}
