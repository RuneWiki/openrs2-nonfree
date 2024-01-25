import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class78 {

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Lclient!fa;")
	public final Interface9 anInterface9_13;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	public final int anInt8385;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class78(@OriginalArg(0) Interface9 arg0) {
		this.anInterface9_13 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static252.aBooleanArray19[local10]) {
				Static252.aBooleanArray19[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8385 = local8;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()I")
	public abstract int method6777();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public abstract void method6778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
	public final void method6779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6778(arg2, arg0, arg3, arg4, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
	public abstract int[] v();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6780(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6786();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!wn;)V")
	public abstract void method6781(@OriginalArg(0) Class209 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	public abstract int method6782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void method6785(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public final void method6786() {
		Static252.aBooleanArray19[this.anInt8385] = false;
		this.method6789();
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
	public abstract boolean method6787();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
	protected abstract void method6789();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lclient!tw;")
	public abstract Class1_Sub24 method6790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	public abstract Class129 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
	public abstract boolean method6792();

	@OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
	public abstract void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public abstract void method6793(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public abstract boolean method6794();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6795(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!dk;)V")
	public abstract void method6796(@OriginalArg(0) Class64 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	public abstract Class181 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!e;)V")
	public abstract void method6798(@OriginalArg(0) Class1_Sub16 arg0);

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
	public abstract int BA();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public abstract void method6799(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V")
	public final void method6800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.J(arg2, arg4, arg3, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
	public abstract boolean method6801();

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()Z")
	public abstract boolean method6802();

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
	public abstract int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZII)V")
	public final void method6803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.m(arg0, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()Z")
	public abstract boolean method6804();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public final void method6806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.XA(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	public abstract void method6807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class181 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
	public abstract void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()Z")
	public abstract boolean method6808();

	@OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!r", name = "k", descriptor = "()V")
	public abstract void method6809();

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()Z")
	public abstract boolean method6810();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!wn;Lclient!wn;FLclient!wn;)Lclient!wn;")
	public abstract Class209 method6811(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class209 arg3);

	@OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
	public abstract void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method6812(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILclient!ua;II)V")
	public abstract void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "()V")
	public abstract void method6813();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!f;)V")
	public final void method6814(@OriginalArg(1) Class5 arg0) {
		this.method6827(arg0);
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
	public abstract void method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
	public abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
	public abstract int T();

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()V")
	public abstract void method6816();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!nba;IIII)Lclient!da;")
	public abstract Class52 method6817(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)Lclient!wn;")
	public abstract Class209 method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public abstract int method6819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "o", descriptor = "()V")
	public abstract void method6820() throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method6821(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
	public abstract void method6822(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class5 method6823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public abstract void method6824(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lclient!tw;)V")
	public abstract void method6825(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub24[] arg1);

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
	public abstract void method6826(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
	public abstract void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;Z)V")
	protected abstract void method6827(@OriginalArg(0) Class5 arg0);

	@OriginalMember(owner = "client!r", name = "p", descriptor = "()Z")
	public abstract boolean method6828();

	@OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
	public abstract void JA();

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)Lclient!e;")
	public abstract Class1_Sub16 method6829(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V")
	public final void method6830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.e(arg3, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
	public abstract boolean method6831();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lclient!f;")
	public abstract Class5 method6832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "r", descriptor = "()Lclient!q;")
	public abstract Class34 method6833();

	@OriginalMember(owner = "client!r", name = "s", descriptor = "()V")
	public abstract void method6834();

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(IIIIII)V")
	public final void method6835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6815(arg2, arg0, arg3, arg4, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
	public abstract void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6836();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!vn;[Lclient!qga;Z)Lclient!la;")
	public abstract Class96 method6837(@OriginalArg(0) Class352 arg0, @OriginalArg(1) Class282[] arg1);

	@OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
	public abstract boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!qga;Z)Lclient!f;")
	public abstract Class5 method6838(@OriginalArg(0) Class282 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void method6839(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
	public abstract boolean method6840();

	@OriginalMember(owner = "client!r", name = "u", descriptor = "()Lclient!ho;")
	public abstract Class141 method6841();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class5 method6842(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!r", name = "w", descriptor = "()Lclient!q;")
	public abstract Class34 method6843();

	@OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
	public abstract void method6844();

	@OriginalMember(owner = "client!r", name = "y", descriptor = "()Z")
	public abstract boolean method6845();

	@OriginalMember(owner = "client!r", name = "z", descriptor = "()V")
	public abstract void method6846();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6847(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "A", descriptor = "()Lclient!q;")
	public abstract Class34 method6848();

	@OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
	public abstract void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
	public abstract void method6849(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!dk;I)V")
	public abstract void method6850(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
	public abstract boolean method6851();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public abstract void method6852(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6853(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
	public abstract void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "C", descriptor = "()Z")
	public abstract boolean method6854();
}
