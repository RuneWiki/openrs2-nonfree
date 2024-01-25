import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public abstract class Class129 {

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
	public int anInt5876 = -1;

	static {
		new Class117("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	protected Class129() {
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V")
	public abstract void method4919(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([I)V")
	public abstract void method4920(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "()Z")
	public abstract boolean method4921();

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "()F")
	public abstract float method4922();

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "()I")
	public abstract int method4923();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
	public abstract void method4924(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method4925(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "()Z")
	public abstract boolean method4927();

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "()V")
	protected abstract void method4928();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!br;IIII)Lclient!mj;")
	public abstract Class126 method4929(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
	public abstract void method4930(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIILclient!ep;II)V")
	public abstract void method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class66 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "()Z")
	public abstract boolean method4932();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!k;[Lclient!lg;Z)Lclient!ai;")
	public abstract Class9 method4933(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class125[] arg1);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIII)V")
	public abstract void method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "()Z")
	public abstract boolean method4935();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4936(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(F)V")
	public abstract void method4937(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)I")
	public abstract int method4938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "()Z")
	public abstract boolean method4939();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIII)V")
	public final void method4940(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4947(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIII)V")
	public final void method4941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4945(arg0, arg1, arg2, arg4, arg3, 1);
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIIII)V")
	protected abstract void method4942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "()V")
	public abstract void method4943();

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "()V")
	public abstract void method4944();

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIIIII)V")
	public abstract void method4945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIIII)V")
	public abstract void method4947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[[I[[IIII)Lclient!ij;")
	public abstract Class77 method4948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "()V")
	public abstract void method4950();

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIIIII)V")
	public abstract void method4951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIII)V")
	public abstract void method4952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
	public abstract void method4953(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "()Z")
	public abstract boolean method4954();

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)V")
	public abstract void method4955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "()Z")
	public abstract boolean method4956();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[I[I)Lclient!ep;")
	public abstract Class66 method4957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([IIIII)Lclient!sg;")
	public abstract Class97 method4958(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "()Z")
	public abstract boolean method4959();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIZ)Lclient!sg;")
	public abstract Class97 method4960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
	public abstract void method4961(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)Lclient!ip;")
	public abstract Class11_Sub22 method4962();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[Lclient!bh;)V")
	public abstract void method4963(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub5[] arg1);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)V")
	public abstract void method4964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!qe;Lclient!qe;FLclient!qe;)Lclient!qe;")
	public abstract Class132 method4965(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class132 arg3);

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "()V")
	public abstract void method4966();

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "()V")
	public abstract void method4967();

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "()V")
	public abstract void method4968();

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)V")
	public abstract void method4969(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILclient!ep;II)V")
	public abstract void method4970(@OriginalArg(1) Class66 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ic;)V")
	public abstract void method4971(@OriginalArg(0) Class61 arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III[I)V")
	public abstract void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!qe;)V")
	public abstract void method4973(@OriginalArg(0) Class132 arg0);

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "()V")
	public abstract void method4974();

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "()Z")
	public abstract boolean method4975();

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "()I")
	public abstract int method4976();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!mj;Lclient!mr;Lclient!ic;Lclient!vf;I)V")
	public abstract void method4977(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class10_Sub8 arg3);

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "()Lclient!ic;")
	public abstract Class61 method4979();

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "()I")
	public abstract int method4980();

	@OriginalMember(owner = "client!uo", name = "z", descriptor = "()F")
	public abstract float method4981();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ip;)V")
	public abstract void method4982(@OriginalArg(0) Class11_Sub22 arg0);

	@OriginalMember(owner = "client!uo", name = "A", descriptor = "()Lclient!ic;")
	public abstract Class61 method4983();

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIII)V")
	public abstract void method4984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(FF)V")
	public abstract void method4986(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!uo", name = "B", descriptor = "()Z")
	public abstract boolean method4987();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method4988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(II)I")
	public abstract int method4989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIIII)V")
	public abstract void method4990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIBI)V")
	public final void method4991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4951(arg3, arg0, arg2, arg1, arg4, 1);
	}

	@OriginalMember(owner = "client!uo", name = "C", descriptor = "()Z")
	public abstract boolean method4992();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIB)V")
	public final void method4993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5015(arg2, arg3, arg0, arg1, arg4, 1);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([Lclient!mj;Lclient!ic;[Lclient!vf;I)V")
	public abstract void method4994(@OriginalArg(0) Class126[] arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class10_Sub8[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V")
	public abstract void method4995(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIII)V")
	public abstract void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4997(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIIII)V")
	public final void method4998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4990(arg3, arg1, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!uo", name = "D", descriptor = "()I")
	public abstract int method4999();

	@OriginalMember(owner = "client!uo", name = "E", descriptor = "()I")
	public abstract int method5000();

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIII)[I")
	public abstract int[] method5001();

	@OriginalMember(owner = "client!uo", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method5010();
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(Z)V")
	public abstract void method5002(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!uo", name = "F", descriptor = "()V")
	public abstract void method5003();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([Lclient!mj;Lclient!mr;Lclient!ic;[Lclient!vf;I)V")
	public abstract void method5004(@OriginalArg(0) Class126[] arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class10_Sub8[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(FFF)V")
	public abstract void method5005(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIIIII)Lclient!qe;")
	public abstract Class132 method5006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!mr;)V")
	public abstract void method5008(@OriginalArg(0) Class136 arg0);

	@OriginalMember(owner = "client!uo", name = "G", descriptor = "()V")
	public abstract void method5009();

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(Z)V")
	public final void method5010() {
		Static327.aBooleanArray26[this.anInt5876] = false;
		this.method4928();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5011();

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(II)V")
	public abstract void method5012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(IIIII)V")
	public final void method5013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4942(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIIIII)Z")
	public abstract boolean method5014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(IIIIII)V")
	public abstract void method5015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uo", name = "H", descriptor = "()I")
	public abstract int method5016();

	@OriginalMember(owner = "client!uo", name = "I", descriptor = "()Z")
	public abstract boolean method5017();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!lg;Z)Lclient!sg;")
	public abstract Class97 method5018(@OriginalArg(0) Class125 arg0);

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(III)V")
	public abstract void method5019();

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "()Z")
	public abstract boolean method5020();

	@OriginalMember(owner = "client!uo", name = "K", descriptor = "()Z")
	public abstract boolean method5021();

	@OriginalMember(owner = "client!uo", name = "L", descriptor = "()Z")
	public abstract boolean method5022();
}
