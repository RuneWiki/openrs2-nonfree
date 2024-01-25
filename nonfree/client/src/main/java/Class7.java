import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class7 {

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!fa;")
	public final Interface7 anInterface7_12;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "I")
	public final int anInt10078;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class7(@OriginalArg(0) Interface7 arg0) {
		this.anInterface7_12 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static501.aBooleanArray24[local10]) {
				local8 = local10;
				Static501.aBooleanArray24[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt10078 = local8;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!qg;)V")
	public abstract void method7777(@OriginalArg(0) Class276 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	public abstract int method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
	public abstract boolean method7779();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()V")
	public abstract void method7780();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()Lclient!q;")
	public abstract Class81 method7781();

	@OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
	public abstract boolean method7782();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!pa;)V")
	public abstract void method7784(@OriginalArg(0) Class112 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method7785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BLclient!f;)V")
	public final void method7786(@OriginalArg(1) Class88 arg0) {
		this.method7848(arg0);
	}

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	public abstract Class67 method7787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class88 method7788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public final void method7789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.m(arg1, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public abstract void method7790(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void method7791(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public final void method7792() {
		Static501.aBooleanArray24[this.anInt10078] = false;
		this.method7822();
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public abstract int method7793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7794(@OriginalArg(0) Class81 arg0);

	@OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
	public abstract void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public abstract boolean method7795();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7796(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
	public abstract void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method7799(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIB)V")
	public final void method7800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7824(arg4, arg0, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
	public abstract void method7801(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
	public abstract void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
	public abstract boolean method7802();

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()Z")
	public abstract boolean method7803();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	public abstract Class115 method7804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public abstract void method7805(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
	public abstract void method7806(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
	public abstract void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()Z")
	public abstract boolean method7807();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fda;Z)Lclient!f;")
	public abstract Class88 method7808(@OriginalArg(0) Class103 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V")
	public final void method7809(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.XA(arg3, arg0, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public abstract void method7810(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
	public abstract void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()V")
	public abstract void method7811();

	@OriginalMember(owner = "client!r", name = "k", descriptor = "()Lclient!q;")
	public abstract Class81 method7812();

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()Z")
	public abstract boolean method7813();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	public abstract void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class67 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "()Lclient!sr;")
	public abstract Class308 method7815();

	@OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILclient!ua;II)V")
	public abstract void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!pa;Lclient!pa;FLclient!pa;)Lclient!pa;")
	public abstract Class112 method7816(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class112 arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public abstract void method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)Lclient!e;")
	public abstract Class4_Sub8 method7818(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lclient!am;")
	public abstract Class4_Sub3 method7819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()Z")
	public abstract boolean method7820();

	@OriginalMember(owner = "client!r", name = "o", descriptor = "()Z")
	public abstract boolean method7821();

	@OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
	public abstract void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7792();
	}

	@OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
	public abstract boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "p", descriptor = "()V")
	protected abstract void method7822();

	@OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
	public abstract void method7824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIIII)V")
	public final void method7825(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.J(arg4, arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public abstract void method7826(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
	public abstract void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!r", name = "q", descriptor = "()V")
	public abstract void method7827() throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!cr;IIII)Lclient!da;")
	public abstract Class65 method7828(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
	public abstract int T();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)Lclient!pa;")
	public abstract Class112 method7829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "r", descriptor = "()V")
	public abstract void method7830();

	@OriginalMember(owner = "client!r", name = "s", descriptor = "()Z")
	public abstract boolean method7831();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!qg;I)V")
	public abstract void method7832(@OriginalArg(0) Class276 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7833(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
	public abstract boolean method7834();

	@OriginalMember(owner = "client!r", name = "u", descriptor = "()I")
	public abstract int method7835();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7836(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ll;[Lclient!fda;Z)Lclient!la;")
	public abstract Class45 method7837(@OriginalArg(0) Class198 arg0, @OriginalArg(1) Class103[] arg1);

	@OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
	public abstract void JA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class88 method7838(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void method7839(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7840(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7841();

	@OriginalMember(owner = "client!r", name = "w", descriptor = "()Lclient!q;")
	public abstract Class81 method7842();

	@OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
	public abstract void method7843();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
	public final void method7844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7817(arg4, arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "y", descriptor = "()Z")
	public abstract boolean method7845();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBII)V")
	public final void method7846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "z", descriptor = "()Z")
	public abstract boolean method7847();

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
	public abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
	public abstract int BA();

	@OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
	public abstract int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;Z)V")
	protected abstract void method7848(@OriginalArg(0) Class88 arg0);

	@OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
	public abstract void method7849();

	@OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
	public abstract boolean method7850();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!e;)V")
	public abstract void method7851(@OriginalArg(0) Class4_Sub8 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lclient!am;)V")
	public abstract void method7852(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3[] arg1);

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
	public abstract void method7853(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "C", descriptor = "()V")
	public abstract void method7854();

	@OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lclient!f;")
	public abstract Class88 method7855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
	public abstract int[] v();
}
