import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class5 {

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "[I")
	public static final int[] anIntArray760 = new int[16384];

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
	public static final int[] anIntArray761 = new int[16384];

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!e;")
	public final Interface4 anInterface4_14;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public final int anInt9037;

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			anIntArray761[local15] = (int) (Math.sin(local13 * (double) local15) * 16384.0D);
			anIntArray760[local15] = (int) (Math.cos(local13 * (double) local15) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!e;)V")
	public Class5(@OriginalArg(0) Interface4 arg0) {
		this.anInterface4_14 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static121.aBooleanArray11[local10]) {
				Static121.aBooleanArray11[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt9037 = local8;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lclient!q;")
	public abstract Class205 method7409();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	public abstract void method7410(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIII)V")
	public final void method7411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.h(arg2, arg3, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public abstract void method7412(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
	public abstract void method7413();

	@OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
	public abstract int SA();

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!cq;[Lclient!af;Z)Lclient!ta;")
	public abstract Class59 method7414(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class9[] arg1);

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Lclient!dw;")
	public abstract Class66 method7415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
	public abstract void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBII)V")
	public final void method7416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7419(arg1, arg2, arg3, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	public abstract void k();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method7417(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public abstract int method7418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	public abstract void method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
	public abstract void method7420();

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	public abstract boolean method7421();

	@OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7422(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	public abstract boolean method7423();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
	public abstract void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
	public abstract int v();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7424(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
	public abstract int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
	public abstract boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!af;Z)Lclient!xa;")
	public abstract Class119 method7425(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
	public abstract boolean method7426();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public abstract void method7427(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
	public abstract void method7428();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!be;)V")
	public abstract void method7429(@OriginalArg(0) Class26 arg0);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Lclient!nl;")
	public abstract Class207 method7430();

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()Z")
	public abstract boolean method7431();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class52 method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	public abstract void method7433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	public final void method7434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	public abstract int method7435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7436();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public final void method7437() {
		Static121.aBooleanArray11[this.anInt9037] = false;
		this.method7447();
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public abstract void method7438(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	public abstract boolean method7439();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIII)V")
	public final void method7440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7484(arg4, arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
	public abstract void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	public abstract boolean method7441();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7442(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!or;IIII)Lclient!ba;")
	public abstract Class2 method7443(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
	public abstract void method7444();

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
	public abstract boolean method7445();

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
	public abstract void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	public abstract void method7446(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
	protected abstract void method7447();

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Lclient!q;")
	public abstract Class205 method7448();

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
	public abstract void method7449() throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dw;Lclient!dw;FLclient!dw;)Lclient!dw;")
	public abstract Class66 method7450(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class66 arg3);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7451(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	public abstract boolean method7452();

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
	public abstract void method7453();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public abstract void method7454(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	public abstract void method7455(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
	public abstract void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
	public abstract void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lclient!i;)V")
	public abstract void method7456(@OriginalArg(0) Class3_Sub22 arg0);

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7437();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	public abstract Class119 method7457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBIII)V")
	public final void method7459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.C(arg4, arg1, arg0, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!oj;)V")
	public abstract void method7460(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub30[] arg1);

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	public abstract boolean method7461();

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	public abstract boolean method7462();

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	public abstract void method7463(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ba;Lclient!be;Lclient!q;Lclient!sda;I)V")
	public abstract void method7464(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
	public abstract boolean method7465();

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	public abstract boolean method7466();

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILclient!fa;II)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	public abstract void method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!sda;I)V")
	public abstract void method7468(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class4_Sub7[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
	public abstract int aa();

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
	protected abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7469(@OriginalArg(0) Class205 arg0);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)Lclient!i;")
	public abstract Class3_Sub22 method7470(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()V")
	public abstract void method7471();

	@OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
	public abstract void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
	public abstract boolean method7472();

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
	public abstract void F();

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Z")
	public abstract boolean method7473();

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	public abstract void method7474(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!oj;")
	public abstract Class3_Sub30 method7475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
	public final void method7476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.ya(arg1, arg2, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!be;Lclient!q;[Lclient!sda;I)V")
	public abstract void method7478(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()I")
	public abstract int method7479();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "()Z")
	public abstract boolean method7480();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	public abstract Class10 method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lclient!xa;")
	public abstract Class119 method7483(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
	public abstract void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dw;)V")
	public abstract void method7485(@OriginalArg(0) Class66 arg0);
}
