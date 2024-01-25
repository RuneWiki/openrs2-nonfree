import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class Class59 {

	@OriginalMember(owner = "client!en", name = "j", descriptor = "I")
	public int anInt5487 = -1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	protected Class59() {
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "()Z")
	public abstract boolean method4786();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!vr;)V")
	public abstract void method4787(@OriginalArg(0) Class112 arg0);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!bd;)V")
	public abstract void method4788(@OriginalArg(0) Class18 arg0);

	@OriginalMember(owner = "client!en", name = "e", descriptor = "()Lclient!vr;")
	public abstract Class112 method4789();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V")
	public abstract void method4790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(F)V")
	public abstract void method4791(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I")
	public abstract int method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method4793(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIZ)Lclient!kh;")
	public abstract Class54 method4794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII)V")
	public abstract void method4795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!en", name = "f", descriptor = "()I")
	public abstract int method4796();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBIII)V")
	public final void method4797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4838(arg3, arg1, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "()Lclient!vr;")
	public abstract Class112 method4798();

	@OriginalMember(owner = "client!en", name = "h", descriptor = "()Z")
	public abstract boolean method4799();

	@OriginalMember(owner = "client!en", name = "i", descriptor = "()I")
	public abstract int method4800();

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(IIII)[I")
	public abstract int[] method4801();

	@OriginalMember(owner = "client!en", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method4857();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!hm;II)V")
	public abstract void method4803(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!oq;IIII)Lclient!mj;")
	public abstract Class101 method4804(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!en", name = "j", descriptor = "()Z")
	public abstract boolean method4805();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II[I[I)Lclient!hm;")
	public abstract Class15 method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4807(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!en", name = "k", descriptor = "()F")
	public abstract float method4808();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIILclient!hm;II)V")
	public abstract void method4809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!en", name = "l", descriptor = "()V")
	public abstract void method4810();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!mj;Lclient!bg;Lclient!vr;Lclient!ue;I)V")
	public abstract void method4811(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class63_Sub7 arg3);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
	public abstract void method4812(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!nm;[Lclient!cl;Z)Lclient!tc;")
	public abstract Class91 method4813(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class37[] arg1);

	@OriginalMember(owner = "client!en", name = "m", descriptor = "()F")
	public abstract float method4814();

	@OriginalMember(owner = "client!en", name = "n", descriptor = "()V")
	public abstract void method4815();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public abstract void method4816(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([I)V")
	public abstract void method4817(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!en", name = "o", descriptor = "()Z")
	public abstract boolean method4818();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4819();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V")
	public final void method4821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4867(arg0, arg3, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V")
	public abstract void method4822();

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public abstract void method4823(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!en", name = "p", descriptor = "()Z")
	public abstract boolean method4824();

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)V")
	public abstract void method4825(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!en", name = "q", descriptor = "()Z")
	public abstract boolean method4826();

	@OriginalMember(owner = "client!en", name = "r", descriptor = "()Z")
	public abstract boolean method4827();

	@OriginalMember(owner = "client!en", name = "s", descriptor = "()V")
	protected abstract void method4828();

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(IIII)V")
	public abstract void method4829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBIIII)V")
	public final void method4830(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4851(arg2, arg1, arg4, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(IIIII)V")
	protected abstract void method4831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!en", name = "t", descriptor = "()Z")
	public abstract boolean method4832();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII)Z")
	public abstract boolean method4833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([IIIII)Lclient!kh;")
	public abstract Class54 method4834(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BIIIII)V")
	public final void method4835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4877(arg1, arg0, arg3, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!bd;Lclient!bd;FLclient!bd;)Lclient!bd;")
	public abstract Class18 method4836(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class18 arg3);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4837(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(IIIII)V")
	public abstract void method4838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!en", name = "u", descriptor = "()I")
	public abstract int method4839();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([Lclient!mj;Lclient!vr;[Lclient!ue;I)V")
	public abstract void method4840(@OriginalArg(0) Class101[] arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class63_Sub7[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!en", name = "v", descriptor = "()Z")
	public abstract boolean method4841();

	@OriginalMember(owner = "client!en", name = "w", descriptor = "()Z")
	public abstract boolean method4842();

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(II)I")
	public abstract int method4843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!en", name = "x", descriptor = "()Z")
	public abstract boolean method4844();

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
	public abstract void method4845(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!fn;)V")
	public abstract void method4846(@OriginalArg(0) Class5_Sub14 arg0);

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V")
	public abstract void method4847(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!en", name = "y", descriptor = "()V")
	public abstract void method4848();

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(IIIIII)V")
	public abstract void method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(IIIIII)V")
	public abstract void method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
	public abstract void method4852(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!en", name = "z", descriptor = "()I")
	public abstract int method4853();

	@OriginalMember(owner = "client!en", name = "A", descriptor = "()Z")
	public abstract boolean method4854();

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(IIIII)V")
	public final void method4855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method4831(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([Lclient!mj;Lclient!bg;Lclient!vr;[Lclient!ue;I)V")
	public abstract void method4856(@OriginalArg(0) Class101[] arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class63_Sub7[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
	public final void method4857() {
		Static339.aBooleanArray29[this.anInt5487] = false;
		this.method4828();
	}

	@OriginalMember(owner = "client!en", name = "B", descriptor = "()V")
	public abstract void method4858();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(FF)V")
	public abstract void method4859(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!en", name = "C", descriptor = "()V")
	public abstract void method4860();

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(I)Lclient!fn;")
	public abstract Class5_Sub14 method4861();

	@OriginalMember(owner = "client!en", name = "D", descriptor = "()Z")
	public abstract boolean method4862();

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(III)V")
	public abstract void method4863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!en", name = "E", descriptor = "()Z")
	public abstract boolean method4864();

	@OriginalMember(owner = "client!en", name = "F", descriptor = "()Z")
	public abstract boolean method4865();

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(IIII)V")
	public abstract void method4866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(IIIII)V")
	public abstract void method4867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!bg;)V")
	public abstract void method4868(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(IIII)V")
	public abstract void method4869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III[I)V")
	public abstract void method4870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!en", name = "G", descriptor = "()V")
	public abstract void method4871();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!cl;Z)Lclient!kh;")
	public abstract Class54 method4872(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(Z)V")
	public abstract void method4873(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(II[[I[[IIII)Lclient!ac;")
	public abstract Class3 method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIZ)V")
	public final void method4875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4850(arg3, arg1, arg4, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(FFF)V")
	public abstract void method4876(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(IIIIII)V")
	public abstract void method4877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!en", name = "H", descriptor = "()I")
	public abstract int method4878();

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(IIIIII)Lclient!bd;")
	public abstract Class18 method4879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!en", name = "I", descriptor = "()I")
	public abstract int method4880();

	@OriginalMember(owner = "client!en", name = "J", descriptor = "()V")
	public abstract void method4881();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method4882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!en", name = "K", descriptor = "()V")
	public abstract void method4883();

	@OriginalMember(owner = "client!en", name = "L", descriptor = "()V")
	public abstract void method4884();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[Lclient!vg;)V")
	public abstract void method4885(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub13[] arg1);

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(II)V")
	public abstract void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
