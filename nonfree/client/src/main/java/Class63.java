import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public abstract class Class63 {

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
	public int anInt5007 = -1;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	protected Class63() {
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "()V")
	public abstract void method4556();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[Lclient!ap;)V")
	public abstract void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1);

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "()Z")
	public abstract boolean method4558();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!ci;)V")
	public abstract void method4559(@OriginalArg(0) Class26 arg0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II[I[I)Lclient!tm;")
	public abstract Class92 method4560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "()V")
	public abstract void method4561();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIII)[I")
	public abstract int[] method4562();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)V")
	public abstract void method4563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(FFF)V")
	public abstract void method4564(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([I)V")
	public abstract void method4565(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(IIII)V")
	public abstract void method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "()Z")
	public abstract boolean method4567();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V")
	public abstract void method4568(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "()I")
	public abstract int method4569();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(FF)V")
	public abstract void method4570(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIII)Lclient!sd;")
	public abstract Class13 method4571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "()V")
	public abstract void method4572();

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "()Lclient!m;")
	public abstract Class129 method4573();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)I")
	public abstract int method4574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "()Z")
	public abstract boolean method4575();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public abstract void method4576(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(IIIIII)V")
	public final void method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4645(arg1, arg4, arg3, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "()Z")
	public abstract boolean method4578();

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "()I")
	public abstract int method4580();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II[[I[[IIII)Lclient!ui;")
	public abstract Class36 method4581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)V")
	public abstract void method4582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "()Z")
	public abstract boolean method4583();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIILclient!tm;II)V")
	public abstract void method4585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class92 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIII)V")
	public abstract void method4586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([IIIII)Lclient!ae;")
	public abstract Class4 method4587(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)Lclient!mk;")
	public abstract Class1_Sub30 method4588();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!tr;Z)Lclient!ae;")
	public abstract Class4 method4589(@OriginalArg(0) Class201 arg0);

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(IIII)V")
	public abstract void method4590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "()V")
	public abstract void method4591();

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "()I")
	public abstract int method4592();

	@OriginalMember(owner = "client!fp", name = "q", descriptor = "()I")
	public abstract int method4593();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!tm;II)V")
	public abstract void method4594(@OriginalArg(1) Class92 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(IIIII)V")
	protected abstract void method4595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!m;)V")
	public abstract void method4596(@OriginalArg(0) Class129 arg0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([Lclient!bi;Lclient!ci;Lclient!m;[Lclient!oo;I)V")
	public abstract void method4597(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) Class32_Sub4[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fp", name = "r", descriptor = "()Z")
	public abstract boolean method4598();

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "()Z")
	public abstract boolean method4599();

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)V")
	public abstract void method4600(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "()I")
	public abstract int method4601();

	@OriginalMember(owner = "client!fp", name = "u", descriptor = "()Z")
	public abstract boolean method4602();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III[I)V")
	public abstract void method4603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(IIIII)V")
	public abstract void method4604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(IIIIII)Z")
	public abstract boolean method4605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "()Z")
	public abstract boolean method4606();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!sd;)V")
	public abstract void method4607(@OriginalArg(0) Class13 arg0);

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "()V")
	public abstract void method4608();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4610();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!hi;[Lclient!tr;Z)Lclient!df;")
	public abstract Class33 method4611(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class201[] arg1);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIZ)Lclient!ae;")
	public abstract Class4 method4612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "()V")
	protected abstract void method4613();

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "()V")
	public abstract void method4614();

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(IIIII)V")
	public final void method4615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method4604(arg0, arg3, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!mk;)V")
	public abstract void method4616(@OriginalArg(0) Class1_Sub30 arg0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIBI)V")
	public final void method4617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method4595(arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)V")
	public abstract void method4618(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIBI)V")
	public final void method4619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4626(arg1, arg3, arg4, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!fp", name = "z", descriptor = "()V")
	public abstract void method4620();

	@OriginalMember(owner = "client!fp", name = "A", descriptor = "()F")
	public abstract float method4621();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method4622(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!fp", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method4625();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fp", name = "B", descriptor = "()Z")
	public abstract boolean method4624();

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)V")
	public final void method4625() {
		Static131.aBooleanArray12[this.anInt5007] = false;
		this.method4613();
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(IIIIII)V")
	public abstract void method4626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "(I)V")
	public abstract void method4627(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(II)I")
	public abstract int method4628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(II)V")
	public abstract void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!sd;Lclient!sd;FLclient!sd;)Lclient!sd;")
	public abstract Class13 method4631(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class13 arg3);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4632(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "(I)V")
	public abstract void method4633(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fp", name = "C", descriptor = "()Lclient!m;")
	public abstract Class129 method4634();

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(Z)V")
	public abstract void method4635(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([Lclient!bi;Lclient!m;[Lclient!oo;I)V")
	public abstract void method4636(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) Class32_Sub4[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(Z)V")
	public abstract void method4637(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fp", name = "D", descriptor = "()F")
	public abstract float method4638();

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "(IIIIII)V")
	public final void method4639(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4653(arg1, arg0, arg4, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(IIII)V")
	public abstract void method4641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "()I")
	public abstract int method4642();

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(III)V")
	public abstract void method4643();

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "(IIIII)V")
	public final void method4644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method4586(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "(IIIIII)V")
	public abstract void method4645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4646(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!fp", name = "G", descriptor = "()V")
	public abstract void method4647();

	@OriginalMember(owner = "client!fp", name = "H", descriptor = "()Z")
	public abstract boolean method4648();

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "()Z")
	public abstract boolean method4649();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(F)V")
	public abstract void method4650(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "()V")
	public abstract void method4651();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!e;IIII)Lclient!bi;")
	public abstract Class3 method4652(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "(IIIIII)V")
	public abstract void method4653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fp", name = "K", descriptor = "()Z")
	public abstract boolean method4654();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!bi;Lclient!ci;Lclient!m;Lclient!oo;I)V")
	public abstract void method4655(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) Class32_Sub4 arg3);

	@OriginalMember(owner = "client!fp", name = "L", descriptor = "()Z")
	public abstract boolean method4656();

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "()Z")
	public abstract boolean method4657();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "(IIII)V")
	public abstract void method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
