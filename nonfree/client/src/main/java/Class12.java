import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class12 {

	@OriginalMember(owner = "client!r", name = "k", descriptor = "Lclient!fa;")
	public final Interface5 anInterface5_10;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "I")
	public final int anInt7780;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class12(@OriginalArg(0) Interface5 arg0) {
		this.anInterface5_10 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static569.aBooleanArray30[local10]) {
				local8 = local10;
				Static569.aBooleanArray30[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt7780 = local8;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6395(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6396(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
	public abstract void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
	public abstract boolean method6397();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public abstract void method6398(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
	public abstract void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public abstract void method6399(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method6400(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
	public abstract int T();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void method6401(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lclient!qea;)V")
	public abstract void method6402(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1);

	@OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6465();
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Lclient!e;")
	public abstract Class1_Sub11 method6403(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ec;I)V")
	public abstract void method6404(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
	public abstract void JA();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6405(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()I")
	public abstract int method6406();

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!cca;IIII)Lclient!da;")
	public abstract Class61 method6407(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
	public abstract boolean method6408();

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()Lclient!q;")
	public abstract Class209 method6410();

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public abstract boolean method6411();

	@OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILclient!ua;II)V")
	public abstract void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;Z)V")
	protected abstract void method6412(@OriginalArg(0) Class10 arg0);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
	public abstract boolean method6413();

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()V")
	protected abstract void method6414();

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()Z")
	public abstract boolean method6415();

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()V")
	public abstract void method6416() throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "()Lclient!q;")
	public abstract Class209 method6417();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZIIIII)V")
	public final void method6418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.J(arg1, arg2, arg3, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()Lclient!aa;")
	public abstract Class2 method6419();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lclient!f;")
	public abstract Class10 method6420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!it;)V")
	public abstract void method6421(@OriginalArg(0) Class36 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!e;)V")
	public abstract void method6422(@OriginalArg(0) Class1_Sub11 arg0);

	@OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public abstract void method6424(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "()V")
	public abstract void method6425();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lclient!qea;")
	public abstract Class1_Sub5 method6426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public final void method6427(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6468(arg1, arg4, arg3, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
	public abstract void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	public abstract void method6428(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class10 method6429(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
	public abstract void method6430(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()Z")
	public abstract boolean method6431();

	@OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
	public abstract boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;B)V")
	public final void method6432(@OriginalArg(0) Class10 arg0) {
		this.method6412(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6433();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!tq;Z)Lclient!f;")
	public abstract Class10 method6434(@OriginalArg(0) Class318 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
	public abstract void method6435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "o", descriptor = "()V")
	public abstract void method6436();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6437(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method6438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "p", descriptor = "()Z")
	public abstract boolean method6439();

	@OriginalMember(owner = "client!r", name = "q", descriptor = "()V")
	public abstract void method6440();

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
	public abstract int BA();

	@OriginalMember(owner = "client!r", name = "r", descriptor = "()Lclient!q;")
	public abstract Class209 method6441();

	@OriginalMember(owner = "client!r", name = "s", descriptor = "()Z")
	public abstract boolean method6442();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public final void method6443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.XA(arg0, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
	public abstract int[] v();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)Lclient!it;")
	public abstract Class36 method6444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	public abstract int method6445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
	public abstract void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
	public abstract void method6446(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V")
	public final void method6447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.m(arg2, arg3, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	public abstract void method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class200 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	public abstract Class200 method6449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIII)V")
	public final void method6450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
	public abstract boolean method6451();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	public abstract Class17 method6452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void method6454(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "u", descriptor = "()Z")
	public abstract boolean method6455();

	@OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
	public abstract void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
	public abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
	public final void method6456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6435(arg1, arg0, arg3, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!aga;[Lclient!tq;Z)Lclient!la;")
	public abstract Class35 method6457(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class318[] arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "w", descriptor = "()Z")
	public abstract boolean method6459();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ec;)V")
	public abstract void method6460(@OriginalArg(0) Class82 arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public abstract void method6461(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
	public abstract void method6462();

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "y", descriptor = "()Z")
	public abstract boolean method6463();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!it;Lclient!it;FLclient!it;)Lclient!it;")
	public abstract Class36 method6464(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3);

	@OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
	public final void method6465() {
		Static569.aBooleanArray30[this.anInt7780] = false;
		this.method6414();
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
	public abstract int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public abstract int method6467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V")
	public abstract void method6468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "z", descriptor = "()V")
	public abstract void method6469();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class10 method6470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
	public abstract void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method6471(@OriginalArg(0) Class209 arg0);

	@OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
	public abstract void method6472();

	@OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
	public abstract void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
	public abstract boolean method6473();

	@OriginalMember(owner = "client!r", name = "C", descriptor = "()Z")
	public abstract boolean method6474();
}
