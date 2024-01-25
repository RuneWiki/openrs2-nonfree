import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class11_Sub2_Sub2 extends Class11_Sub2 {

	@OriginalMember(owner = "client!er", name = "B", descriptor = "Lclient!dj;")
	private Class32_Sub2 aClass32_Sub2_1;

	@OriginalMember(owner = "client!er", name = "H", descriptor = "I")
	private int anInt1778 = -32768;

	@OriginalMember(owner = "client!er", name = "N", descriptor = "I")
	private int anInt1784 = 0;

	@OriginalMember(owner = "client!er", name = "D", descriptor = "Z")
	public boolean aBoolean127 = false;

	@OriginalMember(owner = "client!er", name = "U", descriptor = "I")
	private final int anInt1789 = -1;

	@OriginalMember(owner = "client!er", name = "V", descriptor = "I")
	private int anInt1790 = 0;

	@OriginalMember(owner = "client!er", name = "G", descriptor = "I")
	private final int anInt1777;

	@OriginalMember(owner = "client!er", name = "z", descriptor = "I")
	public final int anInt1773;

	@OriginalMember(owner = "client!er", name = "P", descriptor = "Lclient!tp;")
	private Class199 aClass199_1;

	static {
		new Class106("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
		new Class106("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
		new Class106(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class11_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt1777 = arg0;
		this.anInt1773 = arg2 + arg1;
		@Pc(41) int local41 = Static345.method5752(this.anInt1777).anInt3267;
		if (local41 == -1) {
			this.aBoolean127 = true;
		} else {
			this.aBoolean127 = false;
			this.aClass199_1 = Static161.method3066(local41);
		}
		if (arg2 == this.anInt1773) {
			Static96.method2060(this.aClass199_1, false, super.aByte79, this.anInt1790, super.anInt6729, super.anInt6726);
		}
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!er", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass32_Sub2_1 != null) {
			this.aClass32_Sub2_1.method1404();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!fp;Lclient!bi;I)V")
	private void method1710(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class3 arg1) {
		@Pc(6) Class6[] local6 = arg1.method1240();
		@Pc(9) Class107[] local9 = arg1.method1246();
		if ((this.aClass32_Sub2_1 == null || this.aClass32_Sub2_1.aBoolean105) && (local6 != null || local9 != null)) {
			this.aClass32_Sub2_1 = new Class32_Sub2(Static51.anInt1301);
		}
		if (this.aClass32_Sub2_1 != null) {
			this.aClass32_Sub2_1.method1399(arg0, (long) Static51.anInt1301, local6, local9);
			this.aClass32_Sub2_1.method1400(super.aByte79, super.aShort94, super.aShort92, super.aShort93, super.aShort91);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return false;
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(B)I")
	@Override
	public int method5877() {
		return this.anInt1778;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
		@Pc(9) Class3 local9 = this.method1716(arg0, 0);
		if (local9 != null) {
			this.method1710(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public void method1712() {
		if (this.aClass32_Sub2_1 != null) {
			this.aClass32_Sub2_1.method1404();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZ)V")
	public void method1715(@OriginalArg(0) int arg0) {
		if (this.aBoolean127) {
			return;
		}
		this.anInt1784 += arg0;
		while (this.anInt1784 > this.aClass199_1.anIntArray466[this.anInt1790]) {
			this.anInt1784 -= this.aClass199_1.anIntArray466[this.anInt1790];
			this.anInt1790++;
			if (this.anInt1790 >= this.aClass199_1.anIntArray467.length) {
				this.aBoolean127 = true;
				break;
			}
		}
		if (!this.aBoolean127) {
			Static96.method2060(this.aClass199_1, false, super.aByte79, this.anInt1790, super.anInt6729, super.anInt6726);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	private Class3 method1716(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class109 local16 = Static345.method5752(this.anInt1777);
		return this.aBoolean127 ? local16.method2993(arg1, -1, 0, -1, arg0) : local16.method2993(arg1, this.anInt1789, this.anInt1784, this.anInt1790, arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		@Pc(9) Class3 local9 = this.method1716(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class129 local16 = arg0.method4634();
		local16.method5774(super.anInt6729, super.anInt6727, super.anInt6726);
		if (this.aClass32_Sub2_1 == null) {
			local9.method1242(local16, null, 0);
		} else {
			@Pc(43) Class26 local43 = this.aClass32_Sub2_1.method1403();
			arg0.method4655(local9, local43, local16, null);
		}
		this.anInt1778 = local9.method1245();
		this.method1710(arg0, local9);
		return null;
	}
}
