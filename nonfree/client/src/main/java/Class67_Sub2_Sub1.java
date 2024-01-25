import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class67_Sub2_Sub1 extends Class67_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "S")
	private final short aShort7;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "B")
	private final byte aByte7;

	@OriginalMember(owner = "client!gg", name = "P", descriptor = "Z")
	private boolean aBoolean110;

	@OriginalMember(owner = "client!gg", name = "F", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!gg", name = "G", descriptor = "Z")
	private final boolean aBoolean108;

	@OriginalMember(owner = "client!gg", name = "M", descriptor = "Z")
	private final boolean aBoolean109;

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!gg", name = "S", descriptor = "Z")
	private final boolean aBoolean111;

	@OriginalMember(owner = "client!gg", name = "V", descriptor = "Lclient!mc;")
	private Class11_Sub4_Sub4 aClass11_Sub4_Sub4_2;

	@OriginalMember(owner = "client!gg", name = "Y", descriptor = "Lclient!mj;")
	public Class126 aClass126_3;

	static {
		new Class117("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
		new Class117("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!uo;Lclient!gm;IIIIZIIZ)V")
	public Class67_Sub2_Sub1(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static237.method4194(arg7, arg8));
		this.aShort7 = (short) arg1.anInt2012;
		super.anInt4515 = (short) arg3;
		this.aByte7 = (byte) arg8;
		this.aBoolean110 = arg9;
		this.aByte8 = (byte) arg7;
		super.anInt4511 = (short) arg5;
		this.aBoolean108 = arg1.anInt2016 != 0 && !arg6;
		this.aBoolean109 = arg6;
		this.aByte9 = (byte) arg2;
		this.aBoolean111 = arg0.method4935() && arg1.aBoolean135 && !this.aBoolean109 && Static103.anInt1883 != 0;
		@Pc(70) int local70 = 1024;
		if (this.aBoolean110) {
			local70 |= 0x8000;
		}
		@Pc(85) Class204 local85 = this.method1557(arg0, local70, this.aBoolean111);
		if (local85 != null) {
			this.aClass11_Sub4_Sub4_2 = local85.aClass11_Sub4_Sub4_6;
			this.aClass126_3 = local85.aClass126_7;
			if (this.aBoolean110) {
				this.aClass126_3 = this.aClass126_3.method3158((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)I")
	@Override
	public int method5413() {
		return this.aByte7;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V")
	@Override
	public void method5403() {
		this.aBoolean110 = false;
		if (this.aClass126_3 != null) {
			this.aClass126_3.method3143(this.aClass126_3.method3142() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class126 local16 = this.method1559(65536, arg1);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class61 local21 = arg1.method4979();
			local21.method3666(super.anInt4515, super.anInt4516, super.anInt4511);
			return local16.method3160(arg2, arg0, local21, false);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!uo;)V")
	@Override
	public void method5415(@OriginalArg(1) Class129 arg0) {
		@Pc(32) Class11_Sub4_Sub4 local32;
		if (this.aClass11_Sub4_Sub4_2 == null && this.aBoolean111) {
			@Pc(25) Class204 local25 = this.method1557(arg0, 131072, true);
			local32 = local25 == null ? null : local25.aClass11_Sub4_Sub4_6;
		} else {
			local32 = this.aClass11_Sub4_Sub4_2;
			this.aClass11_Sub4_Sub4_2 = null;
		}
		if (local32 != null) {
			Static134.method2077(local32, this.aByte9, super.anInt4515, super.anInt4511, null);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5417(@OriginalArg(0) Class129 arg0) {
		@Pc(30) Class11_Sub4_Sub4 local30;
		if (this.aClass11_Sub4_Sub4_2 == null && this.aBoolean111) {
			@Pc(23) Class204 local23 = this.method1557(arg0, 131072, true);
			local30 = local23 == null ? null : local23.aClass11_Sub4_Sub4_6;
		} else {
			local30 = this.aClass11_Sub4_Sub4_2;
			this.aClass11_Sub4_Sub4_2 = null;
		}
		if (local30 != null) {
			Static328.method5390(local30, this.aByte9, super.anInt4515, super.anInt4511, null);
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	@Override
	public void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 instanceof Class67_Sub2_Sub1) {
			@Pc(35) Class67_Sub2_Sub1 local35 = (Class67_Sub2_Sub1) arg3;
			if (this.aClass126_3 == null || local35.aClass126_3 == null) {
				return;
			}
			this.aClass126_3.method3121(local35.aClass126_3, arg2, arg1, arg0, arg5);
		} else if (arg3 instanceof Class67_Sub3_Sub5) {
			@Pc(16) Class67_Sub3_Sub5 local16 = (Class67_Sub3_Sub5) arg3;
			if (this.aClass126_3 != null && local16.aClass126_6 != null) {
				this.aClass126_3.method3121(local16.aClass126_6, arg2, arg1, arg0, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
	@Override
	public void method5416() {
		if (this.aClass126_3 != null) {
			this.aClass126_3.method3135();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		if (this.aClass126_3 == null) {
			return null;
		}
		@Pc(16) Class61 local16 = arg0.method4979();
		local16.method3666(super.anInt4515, super.anInt4516, super.anInt4511);
		@Pc(26) Class10_Sub1 local26 = null;
		if (this.aBoolean108) {
			local26 = Static55.method830(1);
		}
		this.aClass126_3.method3139(local16, local26 == null ? null : local26.aClass10_Sub8Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5399() {
		return this.aBoolean110;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I")
	@Override
	public int method5414() {
		return this.aByte8;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!uo;I)Lclient!mj;")
	@Override
	public Class126 method5411(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1) {
		return this.method1559(arg0, arg1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!uo;IZI)Lclient!vg;")
	private Class204 method1557(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class84 local18 = Static108.method1650(this.aShort7 & 0xFFFF);
		@Pc(26) Class77 local26;
		@Pc(37) Class77 local37;
		if (this.aBoolean109) {
			local37 = Static129.aClass77Array3[0];
			local26 = Static79.aClass77Array5[this.aByte9];
		} else {
			local26 = Static129.aClass77Array3[this.aByte9];
			if (this.aByte9 < 3) {
				local37 = Static129.aClass77Array3[this.aByte9 + 1];
			} else {
				local37 = null;
			}
		}
		return local18.method1641(arg0, this.aByte7, super.anInt4515, this.aByte8, local26, super.anInt4516, local37, super.anInt4511, arg2, arg1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I")
	@Override
	public int method5410() {
		return this.aShort7 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLclient!uo;)Lclient!mj;")
	private Class126 method1559(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1) {
		if (this.aClass126_3 != null && arg1.method4938(this.aClass126_3.method3142(), arg0) == 0) {
			return this.aClass126_3;
		} else {
			@Pc(31) Class204 local31 = this.method1557(arg1, arg0, false);
			return local31 == null ? null : local31.aClass126_7;
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5412() {
		return this.aBoolean111;
	}
}
