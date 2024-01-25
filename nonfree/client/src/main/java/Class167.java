import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class167 {

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
	public final int anInt7365;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Lclient!l;")
	public final Interface7 anInterface7_8;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILclient!l;)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInt7365 = arg0;
		this.anInterface7_8 = arg1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()Z")
	public abstract boolean method5949();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!ka;Lclient!fq;Lclient!n;[Lclient!st;I)V")
	public abstract void method5950(@OriginalArg(0) Class108[] arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class23_Sub6[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIB)V")
	public final void method5951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.M(arg3, arg1, arg4, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "K", descriptor = "(I)V")
	public abstract void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public abstract void method5953(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!i;II)V")
	public abstract void method5954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method5955(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	public abstract void method5957();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public final void method5958() {
		Static289.aBooleanArray18[this.anInt7365] = false;
		this.method6014();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5959(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method5960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.BA(arg3, arg1, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()Z")
	public abstract boolean method5961();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
	public abstract boolean method5962();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()Z")
	public abstract boolean method5963();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!i;")
	public abstract Class14 method5964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!w;)V")
	public abstract void method5965(@OriginalArg(0) Class3_Sub26 arg0);

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()F")
	public abstract float s();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method5967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "TA", descriptor = "(IIIIII)Z")
	public abstract boolean TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5968(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
	public abstract boolean method5969();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5970(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
	public abstract boolean method5971();

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)[I")
	public abstract int[] N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "(IIII)V")
	public abstract void w(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(II)V")
	public abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!lo;Lclient!lo;FLclient!lo;)Lclient!lo;")
	public abstract Class139 method5973(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class139 arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!aa;")
	public abstract Class2 method5974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()Lclient!n;")
	public abstract Class11 method5975();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fq;)V")
	public abstract void method5976(@OriginalArg(0) Class77 arg0);

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()Z")
	public abstract boolean method5977();

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
	public abstract boolean method5978();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZIIII)V")
	public final void method5979(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5997(arg1, arg0, arg4, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "([I)V")
	public abstract void p(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)Lclient!lo;")
	public abstract Class139 method5980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!lo;)V")
	public abstract void method5982(@OriginalArg(0) Class139 arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public abstract void method5983(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!nd;IIII)Lclient!ka;")
	public abstract Class108 method5984(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
	public abstract void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!be;)V")
	public abstract void method5985(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7[] arg1);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()I")
	public abstract int method5986();

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()V")
	public abstract void method5987();

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
	public abstract boolean method5988();

	@OriginalMember(owner = "client!qa", name = "BA", descriptor = "(IIIII)V")
	public abstract void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()Lclient!n;")
	public abstract Class11 method5989();

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	public abstract boolean method5990();

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "()I")
	public abstract int Z();

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()V")
	public abstract void method5991();

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "(IFFFFF)V")
	public abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	public abstract boolean method5992();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mn;Z)Lclient!aa;")
	public abstract Class2 method5993(@OriginalArg(0) Class154 arg0);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()V")
	public abstract void method5994();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ju;[Lclient!mn;Z)Lclient!ba;")
	public abstract Class18 method5995(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class154[] arg1);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	public abstract void method5996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "sa", descriptor = "()I")
	public abstract int sa();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method5998(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "()V")
	public abstract void H();

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ka;Lclient!fq;Lclient!n;Lclient!st;I)V")
	public abstract void method5999(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) Class23_Sub6 arg3);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public abstract void method6000(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6002();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIII)V")
	public final void method6003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.S(arg1, arg3, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Lclient!w;")
	public abstract Class3_Sub26 method6004(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "(IIIII)V")
	protected abstract void S(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
	public abstract void method6005();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	public abstract int method6006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5958();
	}

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
	public abstract void r();

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
	public abstract int xa();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "(ILclient!i;II)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public abstract void method6007(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "()V")
	public abstract void method6008();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method6010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(IIIIII)V")
	public abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method6011(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!n;)V")
	public abstract void method6012(@OriginalArg(0) Class11 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method6013(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()V")
	protected abstract void method6014();

	@OriginalMember(owner = "client!qa", name = "MA", descriptor = "(F)V")
	public abstract void MA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!ka;Lclient!n;[Lclient!st;I)V")
	public abstract void method6015(@OriginalArg(0) Class108[] arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class23_Sub6[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
	public final void method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5996(arg0, arg4, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!o;")
	public abstract Class55 method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public final void method6018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.d(arg3, arg1, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "ua", descriptor = "(IIIIII[BII)V")
	public abstract void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
	public abstract boolean method6019();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public abstract void method6020(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!aa;")
	public abstract Class2 method6021(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIII)V")
	public abstract void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "PA", descriptor = "(FF)V")
	public abstract void PA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "(I)V")
	public abstract void l(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "ha", descriptor = "(III)V")
	public abstract void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public abstract void method6022(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6023(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	public abstract boolean method6024();

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "()F")
	public abstract float I();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!be;")
	public abstract Class3_Sub7 method6025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "XA", descriptor = "(III[I)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
	public abstract boolean method6027();

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	public abstract boolean method6028();
}
