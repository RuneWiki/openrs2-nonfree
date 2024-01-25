import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class31 {

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Lclient!fa;")
	public final Interface4 anInterface4_14;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "I")
	public final int anInt10222;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class31(@OriginalArg(0) Interface4 arg0) {
		this.anInterface4_14 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static410.aBooleanArray22[local10]) {
				Static410.aBooleanArray22[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt10222 = local8;
	}

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
	public abstract int BA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
	public abstract boolean method8018();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method8019(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
	public abstract void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!f;)V")
	public final void method8020(@OriginalArg(1) Class73 arg0) {
		this.method8044(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method8021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
	public abstract void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
	public abstract boolean method8022();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
	public abstract void method8023();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public abstract void method8024(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
	public abstract void method8025(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
	public abstract int method8026();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ufa;[Lclient!wt;Z)Lclient!la;")
	public abstract Class63 method8027(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class365[] arg1);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public abstract boolean method8028();

	@OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
	public abstract int T();

	@OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
	public abstract void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public final void method8029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.m(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()V")
	public abstract void method8030();

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()Lclient!q;")
	public abstract Class42 method8031();

	@OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()V")
	public abstract void method8032();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class73 method8033(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()V")
	public abstract void method8034();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public abstract void method8035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Lclient!e;")
	public abstract Class3_Sub8 method8036(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "k", descriptor = "()Z")
	public abstract boolean method8037();

	@OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
	public abstract void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lclient!cp;)V")
	public abstract void method8038(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9[] arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	public abstract int method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()Z")
	public abstract boolean method8040();

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "m", descriptor = "()Lclient!fe;")
	public abstract Class102 method8041();

	@OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V")
	public final void method8042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.XA(arg2, arg3, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public abstract void method8043(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;Z)V")
	protected abstract void method8044(@OriginalArg(0) Class73 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public abstract void method8045(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
	public abstract void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!uo;IIII)Lclient!da;")
	public abstract Class52 method8046(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()Z")
	public abstract boolean method8047();

	@OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILclient!ua;II)V")
	public abstract void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public abstract void method8048(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method8049(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public abstract int method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public abstract void method8051(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "o", descriptor = "()Lclient!q;")
	public abstract Class42 method8052();

	@OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
	public abstract void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	public final void method8053() {
		Static410.aBooleanArray22[this.anInt10222] = false;
		this.method8079();
	}

	@OriginalMember(owner = "client!r", name = "p", descriptor = "()Z")
	public abstract boolean method8054();

	@OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void method8055(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	public abstract void method8056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class53 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
	public abstract void method8057(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	public abstract Class53 method8058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
	public abstract void method8059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
	public abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method8060(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public abstract void method8061(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method8062(@OriginalArg(0) Class42 arg0);

	@OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
	public abstract boolean method8063();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!e;)V")
	public abstract void method8064(@OriginalArg(0) Class3_Sub8 arg0);

	@OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8053();
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!r", name = "r", descriptor = "()Z")
	public abstract boolean method8066();

	@OriginalMember(owner = "client!r", name = "s", descriptor = "()V")
	public abstract void method8067();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!dd;)V")
	public abstract void method8068(@OriginalArg(0) Class47 arg0);

	@OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
	public abstract boolean method8069();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!tt;I)V")
	public abstract void method8070(@OriginalArg(0) Class323 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method8071(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
	public abstract boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIII)V")
	public final void method8072(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg3, arg0, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!r", name = "u", descriptor = "()Z")
	public abstract boolean method8074();

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "w", descriptor = "()Lclient!q;")
	public abstract Class42 method8075();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method8076(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
	public abstract int[] v();

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
	public abstract void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	public abstract Class127 method8077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lclient!cp;")
	public abstract Class3_Sub9 method8078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
	public abstract int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
	protected abstract void method8079();

	@OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lclient!f;")
	public abstract Class73 method8080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method8081();

	@OriginalMember(owner = "client!r", name = "y", descriptor = "()V")
	public abstract void method8082() throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)Lclient!dd;")
	public abstract Class47 method8083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZI)V")
	public final void method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method8035(arg3, arg4, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!r", name = "z", descriptor = "()Z")
	public abstract boolean method8085();

	@OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!wt;Z)Lclient!f;")
	public abstract Class73 method8086(@OriginalArg(0) Class365 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
	public abstract void method8087();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
	public final void method8088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method8059(arg3, arg1, arg4, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
	public abstract boolean method8089();

	@OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
	public abstract void JA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!tt;)V")
	public abstract void method8090(@OriginalArg(0) Class323 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class73 method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method8092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!dd;Lclient!dd;FLclient!dd;)Lclient!dd;")
	public abstract Class47 method8093(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class47 arg3);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V")
	public final void method8094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.J(arg1, arg0, arg3, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!r", name = "C", descriptor = "()Z")
	public abstract boolean method8095();
}
