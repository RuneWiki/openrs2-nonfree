import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class Class155 {

	@OriginalMember(owner = "client!np", name = "n", descriptor = "Lclient!wp;")
	public final Interface10 anInterface10_7;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "I")
	public final int anInt5461;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(ILclient!wp;)V")
	protected Class155(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		this.anInterface10_7 = arg1;
		this.anInt5461 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIII)V")
	protected abstract void method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public abstract void method4852(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(FFF)V")
	public abstract void method4853(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4854(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIII)V")
	public abstract void method4855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(FF)V")
	public abstract void method4856(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
	public abstract void method4857(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!np", name = "d", descriptor = "()Z")
	public abstract boolean method4858();

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(IIIIII)Lclient!ja;")
	public abstract Class8 method4860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!np", name = "e", descriptor = "()Z")
	public abstract boolean method4861();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIII)[I")
	public abstract int[] method4862();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method4863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!cs;)V")
	public abstract void method4864(@OriginalArg(0) Class47 arg0);

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
	public abstract void method4865(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!np", name = "f", descriptor = "()V")
	protected abstract void method4866();

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(IIII)V")
	public abstract void method4867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!np", name = "g", descriptor = "()I")
	public abstract int method4868();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ju;Z)Lclient!tr;")
	public abstract Class110 method4869(@OriginalArg(0) Class127 arg0);

	@OriginalMember(owner = "client!np", name = "h", descriptor = "()I")
	public abstract int method4870();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([IIIII)Lclient!tr;")
	public abstract Class110 method4871(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II[[I[[IIII)Lclient!pl;")
	public abstract Class7 method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!gf;)V")
	public abstract void method4873(@OriginalArg(0) Class3_Sub15 arg0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4874(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!np", name = "i", descriptor = "()Z")
	public abstract boolean method4875();

	@OriginalMember(owner = "client!np", name = "j", descriptor = "()I")
	public abstract int method4876();

	@OriginalMember(owner = "client!np", name = "k", descriptor = "()V")
	public abstract void method4877();

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(IIII)V")
	public abstract void method4878();

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(IIIII)V")
	public final void method4879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4953(arg3, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(IIII)V")
	public abstract void method4880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method4881(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!np", name = "l", descriptor = "()Z")
	public abstract boolean method4882();

	@OriginalMember(owner = "client!np", name = "m", descriptor = "()V")
	public abstract void method4884();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIBI)V")
	public final void method4885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4855(arg4, arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([Lclient!f;Lclient!cs;Lclient!os;[Lclient!kt;I)V")
	public abstract void method4886(@OriginalArg(0) Class75[] arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class12_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(IIIIII)Z")
	public abstract boolean method4887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!qb;[Lclient!ju;Z)Lclient!oh;")
	public abstract Class150 method4888(@OriginalArg(0) Class190 arg0, @OriginalArg(1) Class127[] arg1);

	@OriginalMember(owner = "client!np", name = "n", descriptor = "()Z")
	public abstract boolean method4889();

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
	public abstract void method4890(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!np", name = "o", descriptor = "()Z")
	public abstract boolean method4891();

	@OriginalMember(owner = "client!np", name = "p", descriptor = "()V")
	public abstract void method4892();

	@OriginalMember(owner = "client!np", name = "q", descriptor = "()Z")
	public abstract boolean method4893();

	@OriginalMember(owner = "client!np", name = "r", descriptor = "()V")
	public abstract void method4894();

	@OriginalMember(owner = "client!np", name = "s", descriptor = "()V")
	public abstract void method4895();

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(IIIIII)V")
	public abstract void method4896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(IIIII)V")
	public abstract void method4897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!np", name = "t", descriptor = "()Z")
	public abstract boolean method4898();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(F)V")
	public abstract void method4899(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4900();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIZ)Lclient!tr;")
	public abstract Class110 method4901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!np", name = "u", descriptor = "()V")
	public abstract void method4902();

	@OriginalMember(owner = "client!np", name = "v", descriptor = "()Z")
	public abstract boolean method4903();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!os;)V")
	public abstract void method4904(@OriginalArg(0) Class118 arg0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!f;Lclient!cs;Lclient!os;Lclient!kt;I)V")
	public abstract void method4905(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class12_Sub5 arg3);

	@OriginalMember(owner = "client!np", name = "w", descriptor = "()I")
	public abstract int method4906();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ja;)V")
	public abstract void method4907(@OriginalArg(0) Class8 arg0);

	@OriginalMember(owner = "client!np", name = "x", descriptor = "()Lclient!os;")
	public abstract Class118 method4908();

	@OriginalMember(owner = "client!np", name = "y", descriptor = "()V")
	public abstract void method4909();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III[I)V")
	public abstract void method4910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(IIIIII)V")
	public abstract void method4911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!np", name = "z", descriptor = "()F")
	public abstract float method4912();

	@OriginalMember(owner = "client!np", name = "A", descriptor = "()F")
	public abstract float method4913();

	@OriginalMember(owner = "client!np", name = "B", descriptor = "()Z")
	public abstract boolean method4914();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	public abstract void method4915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIILclient!sm;II)V")
	public abstract void method4916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class38 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V")
	public abstract void method4917(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!sm;II)V")
	public abstract void method4918(@OriginalArg(1) Class38 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(II)I")
	public abstract int method4919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(II)I")
	public abstract int method4920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
	public abstract void method4921(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(IIII)V")
	public abstract void method4922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(Z)V")
	public abstract void method4923(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!np", name = "C", descriptor = "()Z")
	public abstract boolean method4924();

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(IIIII)V")
	public final void method4925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4897(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(IIII)V")
	public abstract void method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!np", name = "D", descriptor = "()Z")
	public abstract boolean method4928();

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V")
	public final void method4929() {
		Static137.aBooleanArray31[this.anInt5461] = false;
		this.method4866();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!vn;IIII)Lclient!f;")
	public abstract Class75 method4930(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(I)Lclient!gf;")
	public abstract Class3_Sub15 method4931();

	@OriginalMember(owner = "client!np", name = "E", descriptor = "()I")
	public abstract int method4932();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ja;Lclient!ja;FLclient!ja;)Lclient!ja;")
	public abstract Class8 method4933(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class8 arg3);

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(I)V")
	public abstract void method4935(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!np", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method4929();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([Lclient!f;Lclient!os;[Lclient!kt;I)V")
	public abstract void method4937(@OriginalArg(0) Class75[] arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class12_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!np", name = "F", descriptor = "()Z")
	public abstract boolean method4938();

	@OriginalMember(owner = "client!np", name = "G", descriptor = "()V")
	public abstract void method4939();

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(II)V")
	public abstract void method4940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([I)V")
	public abstract void method4941(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(IIIIBI)V")
	public final void method4942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4911(arg4, arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!np", name = "H", descriptor = "()I")
	public abstract int method4943();

	@OriginalMember(owner = "client!np", name = "g", descriptor = "(IIII)V")
	public abstract void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I[Lclient!eo;)V")
	public abstract void method4945(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub12[] arg1);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II[I[I)Lclient!sm;")
	public abstract Class38 method4946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!np", name = "I", descriptor = "()Z")
	public abstract boolean method4947();

	@OriginalMember(owner = "client!np", name = "J", descriptor = "()V")
	public abstract void method4948();

	@OriginalMember(owner = "client!np", name = "K", descriptor = "()Z")
	public abstract boolean method4949();

	@OriginalMember(owner = "client!np", name = "L", descriptor = "()Lclient!os;")
	public abstract Class118 method4950();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIB)V")
	public final void method4952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4851(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(IIIII)V")
	public abstract void method4953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!np", name = "f", descriptor = "(IIIIII)V")
	public final void method4954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4896(arg3, arg1, arg2, arg0, arg4, 1);
	}
}
