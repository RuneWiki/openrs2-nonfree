import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class121 {

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!m;")
	public final Interface5 anInterface5_16;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	public final int anInt5745;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILclient!m;)V")
	public Class121(@OriginalArg(0) int arg0, @OriginalArg(1) Interface5 arg1) {
		this.anInterface5_16 = arg1;
		this.anInt5745 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "da", descriptor = "(IIIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public abstract void method4570();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method4571(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "ua", descriptor = "(F)V")
	public abstract void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()I")
	public abstract int method4572();

	@OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIIII)V")
	public abstract void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "aa", descriptor = "(IIIIII[BII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "()F")
	public abstract float la();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!c;Lclient!gn;Lclient!ia;Lclient!sf;I)V")
	public abstract void method4574(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) Class36_Sub8 arg3);

	@OriginalMember(owner = "client!qa", name = "FA", descriptor = "()I")
	public abstract int FA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class78 method4575(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()Z")
	public abstract boolean method4576();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public abstract void method4577(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
	protected abstract void method4578();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public abstract void method4579(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	public abstract Class70 method4580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
	public abstract boolean method4581();

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
	public abstract boolean method4582();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method4583(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.da(arg2, arg3, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "XA", descriptor = "(IFFFFF)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIBII)V")
	public final void method4584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.O(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!sf;I)V")
	public abstract void method4585(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) Class36_Sub8[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
	public abstract int g();

	@OriginalMember(owner = "client!qa", name = "ba", descriptor = "(IIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()Lclient!ia;")
	public abstract Class43 method4588();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!dt;Z)Lclient!f;")
	public abstract Class78 method4589(@OriginalArg(0) Class63 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4590(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!tj;)V")
	public abstract void method4591(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub12[] arg1);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Lclient!ia;")
	public abstract Class43 method4592();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!c;Lclient!gn;Lclient!ia;[Lclient!sf;I)V")
	public abstract void method4593(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) Class36_Sub8[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public final void method4594(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg0, arg3, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	public abstract Class34 method4595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method4596(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
	public abstract void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "pa", descriptor = "(IIII)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!md;)V")
	public abstract void method4597(@OriginalArg(0) Class89 arg0);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "(FF)V")
	public abstract void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public final void method4598() {
		Static299.aBooleanArray18[this.anInt5745] = false;
		this.method4578();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4599(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
	public final void method4600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.NA(arg1, arg4, arg0, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	public final void method4601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4639(arg1, arg4, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()V")
	public abstract void method4602();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	public abstract void method4603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()Z")
	public abstract boolean method4604();

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	public abstract boolean method4605();

	@OriginalMember(owner = "client!qa", name = "SA", descriptor = "(IIIIII)Z")
	public abstract boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method4606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "na", descriptor = "(I)V")
	public abstract void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "(IIII)V")
	public abstract void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
	public abstract boolean method4607();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4608();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public abstract void method4609(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4598();
	}

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
	public abstract boolean method4610();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ds;[Lclient!dt;Z)Lclient!oa;")
	public abstract Class4 method4612(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class63[] arg1);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	public abstract boolean method4613();

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "(ILclient!ea;II)V")
	public abstract void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!gn;)V")
	public abstract void method4614(@OriginalArg(0) Class101 arg0);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Lclient!l;")
	public abstract Class1_Sub27 method4615();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method4616(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!lo;IIII)Lclient!c;")
	public abstract Class37 method4617(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!l;)V")
	public abstract void method4618(@OriginalArg(0) Class1_Sub27 arg0);

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(II)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()V")
	public abstract void method4619();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4620(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
	public abstract void method4621();

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
	public abstract boolean method4622();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)Lclient!md;")
	public abstract Class89 method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
	public abstract int xa();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public abstract void method4624(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4625(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	public abstract boolean method4626();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class78 method4627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4628(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
	public abstract boolean method4630();

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
	public abstract void method4631();

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)[I")
	public abstract int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public abstract void method4632(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()V")
	public abstract void method4633();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
	public abstract boolean method4635();

	@OriginalMember(owner = "client!qa", name = "va", descriptor = "()V")
	public abstract void va();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZI)V")
	public final void method4636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4611(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIII)V")
	protected abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "()I")
	public abstract int W();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!md;Lclient!md;FLclient!md;)Lclient!md;")
	public abstract Class89 method4637(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class89 arg3);

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	public abstract boolean method4638();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
	public abstract void method4639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	public abstract boolean method4640();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!tj;")
	public abstract Class1_Sub12 method4641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "()V")
	public abstract void S();

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
	public abstract void method4642(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
	public abstract int d();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	public abstract int method4643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "([I)V")
	public abstract void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(Lclient!ia;)V")
	public abstract void m(@OriginalArg(0) Class43 arg0);

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "()F")
	public abstract float w();

	@OriginalMember(owner = "client!qa", name = "ia", descriptor = "(III[I)V")
	public abstract void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
	public abstract boolean method4645();
}
