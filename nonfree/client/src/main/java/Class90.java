import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class90 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!e;")
	public final Interface2 anInterface2_15;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	public final int anInt9369;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!e;)V")
	public Class90(@OriginalArg(0) Interface2 arg0) {
		this.anInterface2_15 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static78.aBooleanArray5[local10]) {
				local8 = local10;
				Static78.aBooleanArray5[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt9369 = local8;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!ld;)V")
	public abstract void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub25[] arg1);

	@OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
	public abstract void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lclient!i;)V")
	public abstract void method7449(@OriginalArg(0) Class6_Sub2 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lclient!fea;")
	public abstract Class102 method7450();

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)Lclient!i;")
	public abstract Class6_Sub2 method7451(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	public abstract boolean method7452();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	public abstract Class71 method7453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
	public abstract void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ka;)V")
	public abstract void method7454(@OriginalArg(0) Class3 arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Lclient!q;")
	public abstract Class93 method7455();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Lclient!ka;")
	public abstract Class3 method7456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	public abstract void method7457(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
	public abstract void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()I")
	public abstract int method7458();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method7460(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public abstract int method7461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public final void method7462() {
		Static78.aBooleanArray5[this.anInt9369] = false;
		this.method7525();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZII)V")
	public final void method7463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg2, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hn;IIII)Lclient!ba;")
	public abstract Class24 method7464(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	public abstract void method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	public abstract boolean method7466();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!ld;")
	public abstract Class6_Sub25 method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
	public abstract int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public abstract void method7468(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
	public abstract void method7469();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ba;Lclient!hfa;Lclient!q;Lclient!rc;I)V")
	public abstract void method7470(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lclient!xa;")
	public abstract Class71 method7471(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7472(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()Z")
	public abstract boolean method7474();

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
	public abstract void method7475();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!rc;I)V")
	public abstract void method7476(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class60_Sub6[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
	public abstract void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class46 method7477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public abstract void method7478(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()Z")
	public abstract boolean method7479();

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
	public abstract void F();

	@OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
	public abstract void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	public abstract boolean method7480();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIII)V")
	public final void method7481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7484(arg2, arg3, arg0, arg4, arg1, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIIIII)V")
	public final void method7482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.C(arg4, arg0, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	public abstract void method7483(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	public abstract void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	public abstract boolean method7485();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public abstract void method7486(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7487(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
	public abstract void method7488();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	public abstract void method7489(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
	public abstract boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	public final void method7490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.h(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	public abstract void method7491(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7492(@OriginalArg(0) Class93 arg0);

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
	public abstract boolean method7493();

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7462();
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method7494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
	public final void method7495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ya(arg3, arg0, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	public abstract boolean method7496();

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
	public abstract boolean method7497();

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	public abstract boolean method7498();

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	public abstract boolean method7499();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Z)V")
	public abstract void method7500(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
	public abstract void method7501();

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	public abstract boolean method7502();

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
	protected abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ka;Lclient!ka;FLclient!ka;)Lclient!ka;")
	public abstract Class3 method7503(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3);

	@OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
	public abstract int SA();

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	public abstract boolean method7504();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	public abstract int method7505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
	public abstract boolean method7506();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7507(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()V")
	public abstract void method7508() throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	public abstract void method7510(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hfa;)V")
	public abstract void method7511(@OriginalArg(0) Class127 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7512();

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
	public abstract boolean method7513();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
	public abstract void method7514();

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
	public final void method7516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7494(arg2, arg3, arg4, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	public abstract Class17 method7517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!q;")
	public abstract Class93 method7518();

	@OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	public abstract void k();

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
	public abstract int v();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	public abstract void method7520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
	public abstract void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()V")
	public abstract void method7521();

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
	public abstract void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
	public abstract void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!kq;Z)Lclient!xa;")
	public abstract Class71 method7522(@OriginalArg(0) Class177 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!mj;[Lclient!kq;Z)Lclient!ta;")
	public abstract Class82 method7523(@OriginalArg(0) Class202 arg0, @OriginalArg(1) Class177[] arg1);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILclient!fa;II)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!hfa;Lclient!q;[Lclient!rc;I)V")
	public abstract void method7524(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
	public abstract int aa();

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "()V")
	protected abstract void method7525();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7526(@OriginalArg(0) Canvas arg0);
}
