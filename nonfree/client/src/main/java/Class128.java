import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class128 {

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Lclient!m;")
	public final Interface8 anInterface8_8;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
	public final int anInt4410;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILclient!m;)V")
	public Class128(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		this.anInterface8_8 = arg1;
		this.anInt4410 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public abstract void method3534();

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "()F")
	public abstract float w();

	@OriginalMember(owner = "client!qa", name = "ba", descriptor = "(IIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "na", descriptor = "(I)V")
	public abstract void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "da", descriptor = "(IIIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	public abstract void method3535();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()Z")
	public abstract boolean method3536();

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "()F")
	public abstract float la();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method3537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.da(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Lclient!l;")
	public abstract Class1_Sub14 method3538();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIBIII)V")
	public final void method3539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method3599(arg2, arg1, arg0, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!gu;Z)Lclient!f;")
	public abstract Class49 method3540(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!vk;I)V")
	public abstract void method3541(@OriginalArg(0) Class33[] arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class13_Sub8[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
	public abstract void method3542();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method3543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "(ILclient!ea;II)V")
	public abstract void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public abstract void method3544(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIIII)V")
	public abstract void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
	public abstract boolean method3545();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!c;Lclient!po;Lclient!ia;[Lclient!vk;I)V")
	public abstract void method3546(@OriginalArg(0) Class33[] arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class13_Sub8[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "(FF)V")
	public abstract void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method3547(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()V")
	public abstract void method3548();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method3549(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public abstract void method3550(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
	public final void method3551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method3593(arg0, arg1, arg3, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public final void method3552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.O(arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIII)V")
	protected abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "XA", descriptor = "(IFFFFF)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method3554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method3555(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
	public abstract void method3556();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!c;Lclient!po;Lclient!ia;Lclient!vk;I)V")
	public abstract void method3557(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class13_Sub8 arg3);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()I")
	public abstract int method3558();

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
	public abstract int xa();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	public abstract void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class59 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "aa", descriptor = "(IIIIII[BII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "()I")
	public abstract int W();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	public abstract Class163 method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "([I)V")
	public abstract void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)[I")
	public abstract int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)Lclient!tl;")
	public abstract Class9 method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method3563(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class49 method3564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!kt;)V")
	public abstract void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub24[] arg1);

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "(IIII)V")
	public abstract void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method3566(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method3567(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
	public abstract boolean method3569();

	@OriginalMember(owner = "client!qa", name = "ia", descriptor = "(III[I)V")
	public abstract void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()Z")
	public abstract boolean method3570();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
	public abstract int d();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class49 method3572(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	public abstract boolean method3573();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method3574(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!je;[Lclient!gu;Z)Lclient!oa;")
	public abstract Class16 method3575(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class100[] arg1);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(Lclient!ia;)V")
	public abstract void m(@OriginalArg(0) Class40 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!tl;)V")
	public abstract void method3576(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!kt;")
	public abstract Class1_Sub24 method3577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method3578(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!tl;Lclient!tl;FLclient!tl;)Lclient!tl;")
	public abstract Class9 method3579(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class9 arg3);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	public final void method3580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.NA(arg1, arg0, arg4, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
	public abstract boolean method3581();

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()V")
	public abstract void method3582();

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	public abstract boolean method3584();

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	public abstract Class59 method3585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()V")
	protected abstract void method3586();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!po;)V")
	public abstract void method3587(@OriginalArg(0) Class194 arg0);

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
	public abstract boolean method3588();

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
	public abstract boolean method3589();

	@OriginalMember(owner = "client!qa", name = "pa", descriptor = "(IIII)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
	public abstract int g();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public abstract void method3590(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method3591();

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(II)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	public abstract void method3592(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
	public abstract void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "SA", descriptor = "(IIIIII)Z")
	public abstract boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	public abstract boolean method3594();

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
	public abstract boolean method3595();

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public final void method3596() {
		Static353.aBooleanArray27[this.anInt4410] = false;
		this.method3586();
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
	public abstract boolean method3597();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public abstract void method3598(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "ua", descriptor = "(F)V")
	public abstract void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "va", descriptor = "()V")
	public abstract void va();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
	public abstract void method3599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "FA", descriptor = "()I")
	public abstract int FA();

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()Lclient!ia;")
	public abstract Class40 method3600();

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "()V")
	public abstract void S();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!l;)V")
	public abstract void method3601(@OriginalArg(0) Class1_Sub14 arg0);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3596();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!qc;IIII)Lclient!c;")
	public abstract Class33 method3602(@OriginalArg(0) Class199 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
	public abstract boolean method3603();

	@OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
	public abstract void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	public abstract boolean method3604();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
	public abstract int method3605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public abstract void method3606(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIII)V")
	public final void method3607(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg1, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	public abstract boolean method3608();

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()Lclient!ia;")
	public abstract Class40 method3609();
}
