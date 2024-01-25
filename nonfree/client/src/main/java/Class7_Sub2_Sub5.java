import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class7_Sub2_Sub5 extends Class7_Sub2 {

	@OriginalMember(owner = "client!go", name = "D", descriptor = "Lclient!wk;")
	private Class6_Sub8 aClass6_Sub8_4;

	@OriginalMember(owner = "client!go", name = "H", descriptor = "I")
	private final int anInt2834 = -1;

	@OriginalMember(owner = "client!go", name = "B", descriptor = "I")
	private int anInt2830 = -32768;

	@OriginalMember(owner = "client!go", name = "T", descriptor = "I")
	private int anInt2845 = 0;

	@OriginalMember(owner = "client!go", name = "W", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "client!go", name = "Z", descriptor = "I")
	private int anInt2850 = 0;

	@OriginalMember(owner = "client!go", name = "N", descriptor = "I")
	private int anInt2839 = 0;

	@OriginalMember(owner = "client!go", name = "O", descriptor = "I")
	private final int anInt2840;

	@OriginalMember(owner = "client!go", name = "Y", descriptor = "I")
	private final int anInt2849;

	@OriginalMember(owner = "client!go", name = "bb", descriptor = "I")
	public final int anInt2851;

	@OriginalMember(owner = "client!go", name = "A", descriptor = "Lclient!kf;")
	private Class128 aClass128_1;

	static {
		new Class189(null, "der Spieler ist momentan nicht verfügbar.", null, null);
		new Class189("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class7_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt2845 = arg12;
		this.anInt2840 = arg4;
		this.anInt2849 = arg0;
		this.anInt2851 = arg1 + arg2;
		@Pc(49) Class13 local49 = Static96.aClass41_2.method1134(this.anInt2849);
		@Pc(52) int local52 = local49.anInt466;
		if (local52 == -1) {
			this.aBoolean263 = true;
		} else {
			this.aClass128_1 = Static301.aClass170_3.method3936(local52);
			this.aBoolean263 = false;
		}
		if (this.anInt2851 == arg2) {
			Static135.method2140(this.anInt2850, this.aClass128_1, super.anInt4321, false, super.anInt4318, super.aByte77);
		}
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(I)I")
	@Override
	public int method3494() {
		return this.anInt2830;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass6_Sub8_4 != null) {
			this.aClass6_Sub8_4.method5919();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
		@Pc(11) Class9 local11 = this.method2141(0, arg0, this.anInt2849);
		if (local11 != null) {
			this.method2145(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return false;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BILclient!qa;I)Lclient!c;")
	private Class9 method2141(@OriginalArg(1) int arg0, @OriginalArg(2) Class172 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class13 local8 = Static96.aClass41_2.method1134(arg2);
		@Pc(13) Class159 local13 = Static26.aClass159Array1[super.aByte77];
		@Pc(36) Class159 local36 = this.anInt2840 < 3 ? Static26.aClass159Array1[this.anInt2840 + 1] : null;
		return this.aBoolean263 ? local8.method372(-1, super.anInt4318, 0, arg0, super.anInt4320, local36, Static301.aClass170_3, arg1, super.anInt4321, -1, local13) : local8.method372(this.anInt2834, super.anInt4318, this.anInt2839, arg0, super.anInt4320, local36, Static301.aClass170_3, arg1, super.anInt4321, this.anInt2850, local13);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)V")
	public void method2142(@OriginalArg(0) int arg0) {
		if (this.aBoolean263) {
			return;
		}
		this.anInt2839 += arg0;
		while (this.anInt2839 > this.aClass128_1.anIntArray254[this.anInt2850]) {
			this.anInt2839 -= this.aClass128_1.anIntArray254[this.anInt2850];
			this.anInt2850++;
			if (this.anInt2850 >= this.aClass128_1.anIntArray252.length) {
				this.aBoolean263 = true;
				break;
			}
		}
		if (!this.aBoolean263) {
			Static135.method2140(this.anInt2850, this.aClass128_1, super.anInt4321, false, super.anInt4318, super.aByte77);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!c;Lclient!qa;I)V")
	private void method2145(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class172 arg1) {
		@Pc(6) Class269[] local6 = arg0.method5680();
		@Pc(9) Class165[] local9 = arg0.method5685();
		if ((this.aClass6_Sub8_4 == null || this.aClass6_Sub8_4.aBoolean653) && (local6 != null || local9 != null)) {
			this.aClass6_Sub8_4 = new Class6_Sub8(Static253.anInt4787);
		}
		if (this.aClass6_Sub8_4 != null) {
			this.aClass6_Sub8_4.method5920(arg1, (long) Static253.anInt4787, local6, local9);
			this.aClass6_Sub8_4.method5917(super.aByte77, super.aShort71, super.aShort72, super.aShort73, super.aShort70);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	public void method2146() {
		if (this.aClass6_Sub8_4 != null) {
			this.aClass6_Sub8_4.method5919();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		@Pc(21) Class9 local21 = this.method2141((this.anInt2845 == 0 ? 0 : 5) | 0x800, arg0, this.anInt2849);
		if (local21 == null) {
			return null;
		}
		if (this.anInt2845 != 0) {
			local21.k(this.anInt2845 * 2048);
		}
		@Pc(40) Class107 local40 = arg0.method5495();
		local40.R(super.anInt4318, super.anInt4320, super.anInt4321);
		if (this.aClass6_Sub8_4 == null) {
			local21.method5695(local40, null, 0);
		} else {
			@Pc(67) Class227 local67 = this.aClass6_Sub8_4.method5923();
			arg0.method5520(local21, local67, local40, null);
		}
		this.anInt2830 = local21.b();
		this.method2145(local21, arg0);
		return null;
	}
}
