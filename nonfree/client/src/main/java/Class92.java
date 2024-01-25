import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public abstract class Class92 {

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	public int anInt5370 = -1;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	protected Class92() {
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIII)V")
	public abstract void method4436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!hc;)V")
	public abstract void method4437(@OriginalArg(0) Class88 arg0);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIZ)Lclient!lg;")
	public abstract Class60 method4438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V")
	public abstract void method4439(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V")
	public abstract void method4440();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII)[I")
	public abstract int[] method4441();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!ue;)V")
	public abstract void method4442(@OriginalArg(0) Class4_Sub39 arg0);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(III[I)V")
	public abstract void method4443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "()I")
	public abstract int method4444();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[Lclient!fs;)V")
	public abstract void method4445(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub12[] arg1);

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "()V")
	public abstract void method4446();

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "()Z")
	public abstract boolean method4447();

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(IIIIII)Lclient!mc;")
	public abstract Class49 method4448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(IIIIII)Z")
	public abstract boolean method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "()V")
	public abstract void method4450();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!jn;Lclient!hc;Lclient!ib;Lclient!pf;I)V")
	public abstract void method4451(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) Class17_Sub6 arg3);

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "()V")
	public abstract void method4452();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V")
	public final void method4453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4524(arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "()V")
	public abstract void method4454();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([Lclient!jn;Lclient!ib;[Lclient!pf;I)V")
	public abstract void method4455(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) Class17_Sub6[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "()V")
	public abstract void method4456();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method4457(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(IIIII)V")
	public abstract void method4458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(IIII)V")
	public abstract void method4459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "()Z")
	public abstract boolean method4460();

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "()Z")
	public abstract boolean method4461();

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "()Z")
	public abstract boolean method4462();

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "()Z")
	public abstract boolean method4463();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V")
	public abstract void method4464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "()Z")
	public abstract boolean method4465();

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "()Lclient!ib;")
	public abstract Class23 method4466();

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "()V")
	public abstract void method4467();

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "()Z")
	public abstract boolean method4469();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method4470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(IIII)V")
	public abstract void method4472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "()F")
	public abstract float method4473();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([Lclient!jn;Lclient!hc;Lclient!ib;[Lclient!pf;I)V")
	public abstract void method4474(@OriginalArg(0) Class5[] arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) Class17_Sub6[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "()I")
	public abstract int method4475();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!jp;[Lclient!v;Z)Lclient!wm;")
	public abstract Class78 method4476(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class206[] arg1);

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(II)I")
	public abstract int method4477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public final void method4478() {
		Static293.aBooleanArray28[this.anInt5370] = false;
		this.method4503();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II[I[I)Lclient!go;")
	public abstract Class84 method4480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(IIIII)V")
	public final void method4481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4458(arg3, arg0, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "()V")
	public abstract void method4482();

	@OriginalMember(owner = "client!vm", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method4478();
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(IIIII)V")
	public abstract void method4483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "()I")
	public abstract int method4484();

	@OriginalMember(owner = "client!vm", name = "w", descriptor = "()Z")
	public abstract boolean method4485();

	@OriginalMember(owner = "client!vm", name = "x", descriptor = "()V")
	public abstract void method4486();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIILclient!go;II)V")
	public abstract void method4487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(II)V")
	public abstract void method4488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(FFF)V")
	public abstract void method4489(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!vm", name = "y", descriptor = "()F")
	public abstract float method4490();

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "()Z")
	public abstract boolean method4491();

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "()Z")
	public abstract boolean method4492();

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(III)V")
	public abstract void method4493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "()I")
	public abstract int method4494();

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(IIIIII)V")
	public abstract void method4495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(IIIIII)V")
	public abstract void method4496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)Lclient!ue;")
	public abstract Class4_Sub39 method4498();

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "()I")
	public abstract int method4499();

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "(IIIIII)V")
	public final void method4500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4496(arg1, arg0, arg3, arg4, arg2, 1);
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(II)I")
	public abstract int method4501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "(IIIIII)V")
	public final void method4502(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4436(arg2, arg0, arg1, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!vm", name = "D", descriptor = "()V")
	protected abstract void method4503();

	@OriginalMember(owner = "client!vm", name = "E", descriptor = "()Z")
	public abstract boolean method4504();

	@OriginalMember(owner = "client!vm", name = "F", descriptor = "()Z")
	public abstract boolean method4505();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!v;Z)Lclient!lg;")
	public abstract Class60 method4506(@OriginalArg(0) Class206 arg0);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4507(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!go;II)V")
	public abstract void method4508(@OriginalArg(1) Class84 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIZII)V")
	public final void method4509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4483(arg3, arg0, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	public abstract void method4510(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V")
	public abstract void method4511(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!mc;Lclient!mc;FLclient!mc;)Lclient!mc;")
	public abstract Class49 method4512(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class49 arg3);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!pe;IIII)Lclient!jn;")
	public abstract Class5 method4513(@OriginalArg(0) Class153 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(I)V")
	public abstract void method4514(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "()Z")
	public abstract boolean method4515();

	@OriginalMember(owner = "client!vm", name = "H", descriptor = "()Z")
	public abstract boolean method4516();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!mc;)V")
	public abstract void method4517(@OriginalArg(0) Class49 arg0);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II[[I[[IIII)Lclient!bl;")
	public abstract Class26 method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "()I")
	public abstract int method4519();

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(IIII)V")
	public abstract void method4520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4521(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIBI)V")
	public final void method4522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4495(arg2, arg3, arg1, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V")
	public abstract void method4523(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(IIIII)V")
	protected abstract void method4524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([I)V")
	public abstract void method4525(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V")
	public abstract void method4526(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(Z)V")
	public abstract void method4527(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)V")
	public abstract void method4529(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!ib;)V")
	public abstract void method4530(@OriginalArg(0) Class23 arg0);

	@OriginalMember(owner = "client!vm", name = "J", descriptor = "()V")
	public abstract void method4531();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4532();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vm", name = "K", descriptor = "()Z")
	public abstract boolean method4534();

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(IIII)V")
	public abstract void method4535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(F)V")
	public abstract void method4536(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([IIIII)Lclient!lg;")
	public abstract Class60 method4537(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!vm", name = "L", descriptor = "()Lclient!ib;")
	public abstract Class23 method4538();

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(FF)V")
	public abstract void method4539(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);
}
