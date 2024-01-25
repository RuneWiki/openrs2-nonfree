import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class25_Sub1_Sub3 extends Class25_Sub1 {

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "Lclient!hn;")
	private Class41_Sub3 aClass41_Sub3_6;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
	private int anInt2459 = -32768;

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "I")
	private int anInt2463 = 0;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
	private final int anInt2464 = -1;

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "Z")
	public boolean aBoolean208 = false;

	@OriginalMember(owner = "client!hd", name = "gb", descriptor = "I")
	private int anInt2479 = 0;

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
	public final int anInt2462;

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
	private final int anInt2468;

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lclient!pp;")
	private Class185 aClass185_3;

	static {
		new Class169(null, "Dieses System darf nicht missbraucht werden!", null, null);
		new Class169("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
		new Class169("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class25_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt2462 = arg1 + arg2;
		this.anInt2468 = arg0;
		@Pc(41) int local41 = Static10.aClass246_1.method5429(this.anInt2468).anInt3346;
		if (local41 == -1) {
			this.aBoolean208 = true;
		} else {
			this.aBoolean208 = false;
			this.aClass185_3 = Static25.aClass67_1.method1227(local41);
		}
		if (arg2 == this.anInt2462) {
			Static4.method52(this.anInt2479, super.anInt6080, false, super.aByte70, this.aClass185_3, super.anInt6077);
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)I")
	@Override
	public int method5239() {
		return this.anInt2459;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILclient!tq;)Lclient!ns;")
	private Class22 method1955(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		@Pc(17) Class134 local17 = Static10.aClass246_1.method5429(this.anInt2468);
		return this.aBoolean208 ? local17.method2734(arg0, arg1, -1, -1, 0, Static25.aClass67_1) : local17.method2734(arg0, arg1, this.anInt2479, this.anInt2464, this.anInt2463, Static25.aClass67_1);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub3_6 != null) {
			this.aClass41_Sub3_6.method2140();
		}
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)V")
	public void method1956() {
		if (this.aClass41_Sub3_6 != null) {
			this.aClass41_Sub3_6.method2140();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!tq;ILclient!ns;)V")
	private void method1959(@OriginalArg(0) Class164 arg0, @OriginalArg(2) Class22 arg1) {
		@Pc(6) Class197[] local6 = arg1.method1591();
		@Pc(9) Class12[] local9 = arg1.method1589();
		if ((this.aClass41_Sub3_6 == null || this.aClass41_Sub3_6.aBoolean226) && (local6 != null || local9 != null)) {
			this.aClass41_Sub3_6 = new Class41_Sub3(Static366.anInt5883);
		}
		if (this.aClass41_Sub3_6 != null) {
			this.aClass41_Sub3_6.method2150(arg0, (long) Static366.anInt5883, local6, local9);
			this.aClass41_Sub3_6.method2147(super.aByte70, super.aShort88, super.aShort87, super.aShort89, super.aShort90);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		@Pc(9) Class22 local9 = this.method1955(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(21) Class127 local21 = arg0.method5378();
		local21.method5265(super.anInt6080, super.anInt6085, super.anInt6077);
		if (this.aClass41_Sub3_6 == null) {
			local9.method1565(local21, null, 0);
		} else {
			@Pc(36) Class108 local36 = this.aClass41_Sub3_6.method2143();
			arg0.method5365(local9, local36, local21, null);
		}
		this.anInt2459 = local9.method1561();
		this.method1959(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
		@Pc(9) Class22 local9 = this.method1955(0, arg0);
		if (local9 != null) {
			this.method1959(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)V")
	public void method1961(@OriginalArg(0) int arg0) {
		if (this.aBoolean208) {
			return;
		}
		this.anInt2463 += arg0;
		while (this.anInt2463 > this.aClass185_3.anIntArray582[this.anInt2479]) {
			this.anInt2463 -= this.aClass185_3.anIntArray582[this.anInt2479];
			this.anInt2479++;
			if (this.aClass185_3.anIntArray579.length <= this.anInt2479) {
				this.aBoolean208 = true;
				break;
			}
		}
		if (!this.aBoolean208) {
			Static4.method52(this.anInt2479, super.anInt6080, false, super.aByte70, this.aClass185_3, super.anInt6077);
		}
	}
}
