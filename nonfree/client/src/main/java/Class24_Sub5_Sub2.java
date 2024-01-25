import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class24_Sub5_Sub2 extends Class24_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!uu", name = "B", descriptor = "B")
	private final byte aByte95;

	@OriginalMember(owner = "client!uu", name = "R", descriptor = "Z")
	private final boolean aBoolean466;

	@OriginalMember(owner = "client!uu", name = "U", descriptor = "Z")
	private final boolean aBoolean467;

	@OriginalMember(owner = "client!uu", name = "x", descriptor = "B")
	private final byte aByte94;

	@OriginalMember(owner = "client!uu", name = "I", descriptor = "B")
	private final byte aByte96;

	@OriginalMember(owner = "client!uu", name = "y", descriptor = "S")
	private final short aShort103;

	@OriginalMember(owner = "client!uu", name = "J", descriptor = "Z")
	private boolean aBoolean465;

	@OriginalMember(owner = "client!uu", name = "t", descriptor = "Z")
	private final boolean aBoolean464;

	@OriginalMember(owner = "client!uu", name = "z", descriptor = "Lclient!e;")
	public Class63 aClass63_7;

	@OriginalMember(owner = "client!uu", name = "T", descriptor = "Lclient!i;")
	private Class10_Sub1_Sub7 aClass10_Sub1_Sub7_6;

	static {
		new Class182("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
		new Class182("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!za;Lclient!jc;IIIIZIIZ)V")
	public Class24_Sub5_Sub2(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static399.method5281(arg8, arg7));
		this.aByte95 = (byte) arg2;
		this.aBoolean466 = arg1.anInt3778 != 0 && !arg6;
		this.aBoolean467 = arg6;
		this.aByte94 = (byte) arg8;
		this.aByte96 = (byte) arg7;
		super.anInt7222 = arg5;
		this.aShort103 = (short) arg1.anInt3798;
		super.anInt7219 = arg3;
		this.aBoolean465 = arg9;
		this.aBoolean464 = arg0.method5867() && arg1.aBoolean253 && !this.aBoolean467 && Static361.aClass85_Sub1_1.method2106(Static423.anInt7114) != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean465) {
			local74 |= 0x10000;
		}
		@Pc(89) Class210 local89 = this.method5549(this.aBoolean464, local74, arg0);
		if (local89 != null) {
			this.aClass63_7 = local89.aClass63_5;
			this.aClass10_Sub1_Sub7_6 = local89.aClass10_Sub1_Sub7_4;
			if (this.aBoolean465) {
				this.aClass63_7 = this.aClass63_7.method6093((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	@Override
	public void method5700() {
		if (this.aClass63_7 != null) {
			this.aClass63_7.method6089();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!za;Z)V")
	@Override
	public void method5699(@OriginalArg(0) Class50 arg0) {
		@Pc(20) Class10_Sub1_Sub7 local20;
		if (this.aClass10_Sub1_Sub7_6 == null && this.aBoolean464) {
			@Pc(31) Class210 local31 = this.method5549(true, 262144, arg0);
			local20 = local31 == null ? null : local31.aClass10_Sub1_Sub7_4;
		} else {
			local20 = this.aClass10_Sub1_Sub7_6;
			this.aClass10_Sub1_Sub7_6 = null;
		}
		if (local20 != null) {
			Static419.method5516(local20, this.aByte95, super.anInt7219, super.anInt7222, null);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5692() {
		return this.aBoolean465;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		if (this.aClass63_7 == null) {
			return null;
		}
		@Pc(17) Class34 local17 = arg0.method5819();
		local17.U(super.anInt7219, super.anInt7221, super.anInt7222);
		@Pc(27) Class40_Sub5 local27 = null;
		if (this.aBoolean466) {
			local27 = Static171.method2916(1);
		}
		this.aClass63_7.method6090(local17, local27 == null ? null : local27.aClass40_Sub8Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5704(@OriginalArg(0) Class50 arg0) {
		@Pc(25) Class10_Sub1_Sub7 local25;
		if (this.aClass10_Sub1_Sub7_6 == null && this.aBoolean464) {
			@Pc(18) Class210 local18 = this.method5549(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass10_Sub1_Sub7_4;
		} else {
			local25 = this.aClass10_Sub1_Sub7_6;
			this.aClass10_Sub1_Sub7_6 = null;
		}
		if (local25 != null) {
			Static116.method2047(local25, this.aByte95, super.anInt7219, super.anInt7222, null);
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)I")
	@Override
	public int method5705() {
		return this.aByte94;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)I")
	@Override
	public int method5702() {
		return this.aByte96;
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)I")
	@Override
	public int method5706() {
		return this.aShort103 & 0xFFFF;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZIILclient!za;)Lclient!rn;")
	private Class210 method5549(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class50 arg2) {
		@Pc(13) Class126 local13 = Static342.aClass237_4.method5212(this.aShort103 & 0xFFFF);
		@Pc(30) Class154 local30;
		@Pc(25) Class154 local25;
		if (this.aBoolean467) {
			local25 = Static256.aClass154Array2[0];
			local30 = Static173.aClass154Array1[this.aByte95];
		} else {
			local30 = Static256.aClass154Array2[this.aByte95];
			if (this.aByte95 < 3) {
				local25 = Static256.aClass154Array2[this.aByte95 + 1];
			} else {
				local25 = null;
			}
		}
		return local13.method3014(arg0, this.aByte94, super.anInt7219, super.anInt7222, super.anInt7221, arg1, local30, arg2, this.aByte96, local25);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBILclient!vs;Lclient!za;ZI)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class24_Sub5_Sub2) {
			@Pc(28) Class24_Sub5_Sub2 local28 = (Class24_Sub5_Sub2) arg2;
			if (this.aClass63_7 != null && local28.aClass63_7 != null) {
				this.aClass63_7.method6086(local28.aClass63_7, arg1, arg0, arg5, arg4);
			}
		} else if (arg2 instanceof Class24_Sub3_Sub4) {
			@Pc(8) Class24_Sub3_Sub4 local8 = (Class24_Sub3_Sub4) arg2;
			if (this.aClass63_7 != null && local8.aClass63_6 != null) {
				this.aClass63_7.method6086(local8.aClass63_6, arg1, arg0, arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class63 method5703(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1) {
		return this.method5550(arg1, arg0);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class63 local19 = this.method5550(131072, arg0);
		if (local19 == null) {
			return false;
		} else {
			@Pc(24) Class34 local24 = arg0.method5819();
			local24.U(super.anInt7219, super.anInt7221, super.anInt7222);
			return local19.method6101(arg2, arg1, local24, false);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	private Class63 method5550(@OriginalArg(0) int arg0, @OriginalArg(2) Class50 arg1) {
		if (this.aClass63_7 != null && arg1.method5856(this.aClass63_7.RA(), arg0) == 0) {
			return this.aClass63_7;
		} else {
			@Pc(26) Class210 local26 = this.method5549(false, arg0, arg1);
			return local26 == null ? null : local26.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "(I)V")
	@Override
	public void method5690() {
		this.aBoolean465 = false;
		if (this.aClass63_7 != null) {
			this.aClass63_7.D(this.aClass63_7.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5701() {
		return this.aBoolean464;
	}
}
