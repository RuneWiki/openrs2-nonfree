import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class11_Sub4_Sub2 extends Class11_Sub4 implements Interface4 {

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "S")
	private final short aShort86;

	@OriginalMember(owner = "client!ve", name = "S", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "Z")
	private final boolean aBoolean481;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "Z")
	private final boolean aBoolean479;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "Z")
	private final boolean aBoolean480;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "Lclient!qh;")
	private Class1_Sub4_Sub4 aClass1_Sub4_Sub4_5;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "Lclient!bi;")
	private Class3 aClass3_6;

	static {
		new Class106("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!fp;Lclient!gn;IIIIZIIIII)V")
	public Class11_Sub4_Sub2(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static345.method5750(arg11, arg10));
		super.anInt6835 = (short) arg3;
		this.aShort86 = (short) arg1.anInt2365;
		this.aByte72 = (byte) arg11;
		super.anInt6832 = (short) arg5;
		this.aBoolean481 = arg6;
		this.aByte70 = (byte) arg2;
		this.aBoolean479 = arg1.anInt2377 != 0 && !arg6;
		this.aByte71 = (byte) arg10;
		this.aBoolean480 = arg0.method4583() && arg1.aBoolean165 && !this.aBoolean481 && Static218.anInt4352 != 0;
		@Pc(76) Class221 local76 = this.method5697(this.aBoolean480, arg0, 1024);
		if (local76 != null) {
			this.aClass1_Sub4_Sub4_5 = local76.aClass1_Sub4_Sub4_6;
			this.aClass3_6 = local76.aClass3_7;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!fp;I)V")
	@Override
	public void method5926(@OriginalArg(0) Class63 arg0) {
		@Pc(35) Class1_Sub4_Sub4 local35;
		if (this.aClass1_Sub4_Sub4_5 == null && this.aBoolean480) {
			@Pc(28) Class221 local28 = this.method5697(true, arg0, 131072);
			local35 = local28 == null ? null : local28.aClass1_Sub4_Sub4_6;
		} else {
			local35 = this.aClass1_Sub4_Sub4_5;
			this.aClass1_Sub4_Sub4_5 = null;
		}
		if (local35 != null) {
			Static150.method4953(local35, this.aByte70, super.anInt6835, super.anInt6832, null);
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	@Override
	public void method5923() {
		if (this.aClass3_6 != null) {
			this.aClass3_6.method1243();
		}
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)I")
	@Override
	public int method5916() {
		return this.aClass3_6 == null ? 0 : this.aClass3_6.method1245();
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)I")
	@Override
	public int method5925() {
		return this.aByte71;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3 local9 = this.method5696(65536, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class129 local14 = arg0.method4634();
			local14.method5774(super.anInt6835, super.anInt6828, super.anInt6832);
			return local9.method1283(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5924() {
		return this.aBoolean480;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!fp;B)Lclient!bi;")
	private Class3 method5696(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1) {
		if (this.aClass3_6 != null && arg1.method4574(this.aClass3_6.method1256(), arg0) == 0) {
			return this.aClass3_6;
		} else {
			@Pc(30) Class221 local30 = this.method5697(false, arg1, arg0);
			return local30 == null ? null : local30.aClass3_7;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return this.aShort86 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	@Override
	public int method5922() {
		return this.aByte72;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!fp;Z)V")
	@Override
	public void method5920(@OriginalArg(0) Class63 arg0) {
		@Pc(32) Class1_Sub4_Sub4 local32;
		if (this.aClass1_Sub4_Sub4_5 == null && this.aBoolean480) {
			@Pc(25) Class221 local25 = this.method5697(true, arg0, 131072);
			local32 = local25 == null ? null : local25.aClass1_Sub4_Sub4_6;
		} else {
			local32 = this.aClass1_Sub4_Sub4_5;
			this.aClass1_Sub4_Sub4_5 = null;
		}
		if (local32 != null) {
			Static38.method932(local32, this.aByte70, super.anInt6835, super.anInt6832, null);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLclient!fp;BI)Lclient!wk;")
	private Class221 method5697(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class71 local12 = Static219.method4081(this.aShort86 & 0xFFFF);
		@Pc(27) Class36 local27;
		@Pc(31) Class36 local31;
		if (this.aBoolean481) {
			local27 = Static200.aClass36Array4[this.aByte70];
			local31 = Static50.aClass36Array3[0];
		} else {
			local27 = Static50.aClass36Array3[this.aByte70];
			if (this.aByte70 < 3) {
				local31 = Static50.aClass36Array3[this.aByte70 + 1];
			} else {
				local31 = null;
			}
		}
		return local12.method2280(local31, super.anInt6832, super.anInt6835, this.aByte71, arg0, super.anInt6828, arg1, arg2, local27, this.aByte72);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	@Override
	public Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return this.method5696(arg1, arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		if (this.aClass3_6 == null) {
			return null;
		}
		@Pc(11) Class129 local11 = arg0.method4634();
		local11.method5774(super.anInt6835 + super.anInt6829, super.anInt6828, super.anInt6833 + super.anInt6832);
		@Pc(28) Class32_Sub7 local28 = null;
		if (this.aBoolean479) {
			local28 = Static67.method1550(1);
		}
		this.aClass3_6.method1242(local11, local28 == null ? null : local28.aClass32_Sub4Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
	}
}
