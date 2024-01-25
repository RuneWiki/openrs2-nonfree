import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class172 {

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	public final int anInt6964;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!m;")
	public final Interface5 anInterface5_8;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILclient!m;)V")
	public Class172(@OriginalArg(0) int arg0, @OriginalArg(1) Interface5 arg1) {
		this.anInt6964 = arg0;
		this.anInterface5_8 = arg1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public abstract void method5470();

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "(IIII)V")
	public abstract void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "(FF)V")
	public abstract void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!sh;)V")
	public abstract void method5471(@OriginalArg(0) Class227 arg0);

	@OriginalMember(owner = "client!qa", name = "SA", descriptor = "(IIIIII)Z")
	public abstract boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
	public abstract boolean method5472();

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
	public abstract int g();

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(II)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5473(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()Z")
	public abstract boolean method5474();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()Z")
	public abstract boolean method5475();

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()V")
	public abstract void method5476();

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()V")
	public abstract void method5477();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class8 method5478(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "()F")
	public abstract float la();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "([I)V")
	public abstract void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
	public abstract int d();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class8 method5481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()Z")
	public abstract boolean method5482();

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
	public abstract boolean method5483();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!fk;)V")
	public abstract void method5485(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8[] arg1);

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
	public abstract boolean method5486();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Lclient!l;")
	public abstract Class3_Sub29 method5487();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method5488(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5538();
	}

	@OriginalMember(owner = "client!qa", name = "da", descriptor = "(IIIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method5490(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()Z")
	public abstract boolean method5491();

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "()F")
	public abstract float w();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method5492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method5493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.O(arg0, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	public abstract boolean method5494();

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()Lclient!ia;")
	public abstract Class107 method5495();

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
	public abstract boolean method5496();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public abstract void method5497(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	public abstract void method5498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class58 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	public abstract Class58 method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5500(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	public abstract int method5501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	public abstract boolean method5502();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIBIII)V")
	public final void method5503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5484(arg1, arg4, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
	public abstract int xa();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public final void method5504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.da(arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	public final void method5507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.NA(arg2, arg3, arg4, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIII)V")
	protected abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
	public abstract boolean method5508();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!lc;I)V")
	public abstract void method5509(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) Class6_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public abstract void method5510(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "()I")
	public abstract int W();

	@OriginalMember(owner = "client!qa", name = "ba", descriptor = "(IIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "ua", descriptor = "(F)V")
	public abstract void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZI)V")
	public final void method5511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5528(arg0, arg1, arg4, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
	public abstract void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5512();

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
	public abstract boolean method5513();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5514(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()V")
	public abstract void method5515();

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	public abstract boolean method5516();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIII)V")
	public final void method5517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg0, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)[I")
	public abstract int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()V")
	public abstract void method5518();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	public abstract Class159 method5519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!c;Lclient!sh;Lclient!ia;Lclient!lc;I)V")
	public abstract void method5520(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) Class6_Sub5 arg3);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	public abstract void method5521(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!c;Lclient!sh;Lclient!ia;[Lclient!lc;I)V")
	public abstract void method5522(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) Class6_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public abstract void method5523(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()Lclient!ia;")
	public abstract Class107 method5524();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!bi;Lclient!bi;FLclient!bi;)Lclient!bi;")
	public abstract Class23 method5525(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class23 arg3);

	@OriginalMember(owner = "client!qa", name = "ia", descriptor = "(III[I)V")
	public abstract void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "na", descriptor = "(I)V")
	public abstract void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIIII)V")
	public abstract void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!l;)V")
	public abstract void method5526(@OriginalArg(0) Class3_Sub29 arg0);

	@OriginalMember(owner = "client!qa", name = "pa", descriptor = "(IIII)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method5527(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()V")
	protected abstract void method5529();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!bi;)V")
	public abstract void method5530(@OriginalArg(0) Class23 arg0);

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()I")
	public abstract int method5531();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5532(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	public abstract boolean method5533();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!fk;")
	public abstract Class3_Sub8 method5534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "XA", descriptor = "(IFFFFF)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)Lclient!bi;")
	public abstract Class23 method5536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "FA", descriptor = "()I")
	public abstract int FA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!nd;IIII)Lclient!c;")
	public abstract Class9 method5537(@OriginalArg(0) Class161 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public final void method5538() {
		Static206.aBooleanArray15[this.anInt6964] = false;
		this.method5529();
	}

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	public abstract boolean method5539();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5540(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "va", descriptor = "()V")
	public abstract void va();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public abstract void method5541(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "aa", descriptor = "(IIIIII[BII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "(ILclient!ea;II)V")
	public abstract void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!we;Z)Lclient!f;")
	public abstract Class8 method5542(@OriginalArg(0) Class264 arg0);

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()V")
	public abstract void method5543();

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
	public abstract void method5544(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!eu;[Lclient!we;Z)Lclient!oa;")
	public abstract Class59 method5545(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class264[] arg1);

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "()V")
	public abstract void S();

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(Lclient!ia;)V")
	public abstract void m(@OriginalArg(0) Class107 arg0);
}
