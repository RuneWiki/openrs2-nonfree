import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class45 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Lclient!fa;")
	public final Interface3 anInterface3_12;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "I")
	public final int anInt8843;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class45(@OriginalArg(0) Interface3 arg0) {
		this.anInterface3_12 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static527.aBooleanArray25[local10]) {
				local8 = local10;
				Static527.aBooleanArray25[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8843 = local8;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method7356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lclient!eq;")
	public abstract Class3_Sub10 method7357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
	public abstract void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!qw;I)V")
	public abstract void method7358(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7387();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
	protected abstract void method7359();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
	public abstract boolean method7360();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
	public abstract void method7361();

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class14 method7362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
	public abstract boolean method7363();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public abstract boolean method7365();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7367(@OriginalArg(0) Class11 arg0);

	@OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
	public abstract boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()V")
	public abstract void method7368();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!f;)V")
	public final void method7369(@OriginalArg(1) Class14 arg0) {
		this.method7400(arg0);
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()V")
	public abstract void method7370();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	public abstract Class34 method7371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void method7372(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()I")
	public abstract int method7374();

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
	public abstract void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public abstract void method7376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7378();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
	public final void method7379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7402(arg4, arg3, arg1, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()Z")
	public abstract boolean method7380();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!lj;Lclient!lj;FLclient!lj;)Lclient!lj;")
	public abstract Class12 method7381(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class12 arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	public abstract void method7382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class81 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public final void method7383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.m(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
	public abstract void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!r", name = "k", descriptor = "()Z")
	public abstract boolean method7384();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public abstract void method7385(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()V")
	public abstract void method7386() throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public final void method7387() {
		Static527.aBooleanArray25[this.anInt8843] = false;
		this.method7359();
	}

	@OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
	public abstract int T();

	@OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(BIIIII)V")
	public final void method7388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7376(arg3, arg1, arg0, arg4, arg2, 1);
	}

	@OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
	public abstract void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "()Z")
	public abstract boolean method7389();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lclient!f;")
	public abstract Class14 method7390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()Z")
	public abstract boolean method7391();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	public abstract int method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public abstract int method7393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ho;[Lclient!qo;Z)Lclient!la;")
	public abstract Class54 method7394(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class279[] arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class14 method7395(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
	public abstract void JA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!qw;)V")
	public abstract void method7396(@OriginalArg(0) Class283 arg0);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "o", descriptor = "()Lclient!q;")
	public abstract Class11 method7397();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!qo;Z)Lclient!f;")
	public abstract Class14 method7398(@OriginalArg(0) Class279 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
	public abstract void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method7399(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;Z)V")
	protected abstract void method7400(@OriginalArg(0) Class14 arg0);

	@OriginalMember(owner = "client!r", name = "p", descriptor = "()Lclient!aj;")
	public abstract Class15 method7401();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V")
	public abstract void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7403(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
	public abstract boolean method7404();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
	public abstract void method7405(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!r", name = "r", descriptor = "()Z")
	public abstract boolean method7406();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
	public abstract void method7407(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
	public abstract int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
	public abstract void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!r", name = "s", descriptor = "()Lclient!q;")
	public abstract Class11 method7408();

	@OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7409(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public abstract void method7410(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	public abstract void method7411(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V")
	public final void method7412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lclient!eq;)V")
	public abstract void method7413(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub10[] arg1);

	@OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7414(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!lj;)V")
	public abstract void method7415(@OriginalArg(0) Class12 arg0);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void method7416(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
	public abstract boolean method7417();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!e;)V")
	public abstract void method7418(@OriginalArg(0) Class3_Sub15 arg0);

	@OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ef;IIII)Lclient!da;")
	public abstract Class60 method7419(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "u", descriptor = "()V")
	public abstract void method7420();

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public abstract void method7421(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "w", descriptor = "()Lclient!q;")
	public abstract Class11 method7422();

	@OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
	public abstract int[] v();

	@OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(I)Lclient!e;")
	public abstract Class3_Sub15 method7423(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	public abstract Class81 method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIIII)V")
	public final void method7425(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.J(arg1, arg2, arg4, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
	public abstract void method7426();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIZ)V")
	public final void method7427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.XA(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
	public abstract int BA();

	@OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
	public abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "i", descriptor = "(I)V")
	public abstract void method7428(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
	public abstract void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "y", descriptor = "()Z")
	public abstract boolean method7429();

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "z", descriptor = "()Z")
	public abstract boolean method7430();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)Lclient!lj;")
	public abstract Class12 method7431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILclient!ua;II)V")
	public abstract void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
	public abstract void method7432();

	@OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
	public abstract boolean method7433();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7434(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "C", descriptor = "()Z")
	public abstract boolean method7435();
}
