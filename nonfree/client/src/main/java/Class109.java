import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class109 {

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "Lclient!m;")
	public final Interface7 anInterface7_9;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
	public final int anInt5850;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILclient!m;)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_9 = arg1;
		this.anInt5850 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "XA", descriptor = "(IFFFFF)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public abstract void method4679(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	public abstract void method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class62 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "ba", descriptor = "(IIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4681(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "(FF)V")
	public abstract void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4713();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method4682(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mp;Z)Lclient!f;")
	public abstract Class80 method4684(@OriginalArg(0) Class159 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
	public abstract void method4685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
	public abstract int xa();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()Z")
	public abstract boolean method4686();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
	public abstract boolean method4687();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!c;Lclient!qb;Lclient!ia;[Lclient!nh;I)V")
	public abstract void method4688(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class39_Sub7[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method4689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "([I)V")
	public abstract void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Lclient!l;")
	public abstract Class1_Sub23 method4690();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method4691(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!pe;")
	public abstract Class1_Sub5 method4692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()V")
	public abstract void method4693();

	@OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIIII)V")
	public abstract void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
	protected abstract void method4694();

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(II)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)[I")
	public abstract int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "aa", descriptor = "(IIIIII[BII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)Lclient!pv;")
	public abstract Class78 method4695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()V")
	public abstract void method4696();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!wk;IIII)Lclient!c;")
	public abstract Class37 method4697(@OriginalArg(0) Class264 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method4698(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method4699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
	public abstract boolean method4701();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!qb;)V")
	public abstract void method4702(@OriginalArg(0) Class185 arg0);

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()Z")
	public abstract boolean method4703();

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()V")
	public abstract void method4704();

	@OriginalMember(owner = "client!qa", name = "va", descriptor = "()V")
	public abstract void va();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method4705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
	public abstract boolean method4706();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4707(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public abstract void method4708(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()Lclient!ia;")
	public abstract Class18 method4709();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	public abstract int method4710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "na", descriptor = "(I)V")
	public abstract void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pv;)V")
	public abstract void method4711(@OriginalArg(0) Class78 arg0);

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "(IIII)V")
	public abstract void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	public abstract boolean method4712();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public final void method4713() {
		Static357.aBooleanArray23[this.anInt5850] = false;
		this.method4694();
	}

	@OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
	public abstract void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class80 method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()Lclient!ia;")
	public abstract Class18 method4715();

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "()V")
	public abstract void S();

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
	public abstract boolean method4716();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public abstract void method4717(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!nh;I)V")
	public abstract void method4718(@OriginalArg(0) Class37[] arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class39_Sub7[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!gv;[Lclient!mp;Z)Lclient!oa;")
	public abstract Class129 method4719(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class159[] arg1);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "(ILclient!ea;II)V")
	public abstract void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public final void method4720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.da(arg3, arg0, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	public abstract boolean method4721();

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()V")
	public abstract void method4722();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
	public final void method4723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4685(arg2, arg3, arg4, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
	public abstract boolean method4724();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	public abstract void method4725(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "da", descriptor = "(IIIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!pe;)V")
	public abstract void method4726(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4728(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "FA", descriptor = "()I")
	public abstract int FA();

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
	public abstract boolean method4729();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!l;)V")
	public abstract void method4730(@OriginalArg(0) Class1_Sub23 arg0);

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "()F")
	public abstract float la();

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "()I")
	public abstract int W();

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(Lclient!ia;)V")
	public abstract void m(@OriginalArg(0) Class18 arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4731(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	public abstract boolean method4732();

	@OriginalMember(owner = "client!qa", name = "ua", descriptor = "(F)V")
	public abstract void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public abstract void method4733(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
	public abstract boolean method4734();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pv;Lclient!pv;FLclient!pv;)Lclient!pv;")
	public abstract Class78 method4735(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class78 arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!c;Lclient!qb;Lclient!ia;Lclient!nh;I)V")
	public abstract void method4736(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class39_Sub7 arg3);

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "()F")
	public abstract float w();

	@OriginalMember(owner = "client!qa", name = "SA", descriptor = "(IIIIII)Z")
	public abstract boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "ia", descriptor = "(III[I)V")
	public abstract void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
	public abstract void method4737();

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIII)V")
	protected abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public abstract void method4738(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class80 method4739(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()V")
	public abstract void method4740();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method4742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
	public abstract int g();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
	public abstract int d();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
	public final void method4743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.NA(arg0, arg2, arg4, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
	public abstract boolean method4744();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	public abstract Class62 method4746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4747();

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	public abstract boolean method4748();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	public abstract Class136 method4750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIIII)V")
	public final void method4751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4705(arg4, arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4752(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIII)V")
	public final void method4753(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.O(arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	public abstract boolean method4754();

	@OriginalMember(owner = "client!qa", name = "pa", descriptor = "(IIII)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()I")
	public abstract int method4755();

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);
}
