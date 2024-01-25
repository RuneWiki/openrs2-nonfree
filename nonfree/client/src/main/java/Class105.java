import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public abstract class Class105 {

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public int anInt4861 = -1;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	protected Class105() {
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public abstract void method4205(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "()V")
	protected abstract void method4206();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(FF)V")
	public abstract void method4207(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	public abstract void method4208(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZIII)V")
	public final void method4209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4262(arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III[I)V")
	public abstract void method4210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public abstract void method4211(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V")
	public abstract void method4212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!vj;)V")
	public abstract void method4213(@OriginalArg(0) Class31 arg0);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I")
	public abstract int method4214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "()V")
	public abstract void method4215();

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "()Z")
	public abstract boolean method4216();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V")
	public abstract void method4217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "()Z")
	public abstract boolean method4219();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lclient!dc;Lclient!op;Lclient!vj;[Lclient!kd;I)V")
	public abstract void method4220(@OriginalArg(0) Class40[] arg0, @OriginalArg(1) Class153 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class7_Sub6[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!hs;Lclient!hs;FLclient!hs;)Lclient!hs;")
	public abstract Class78 method4221(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class78 arg3);

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "()F")
	public abstract float method4222();

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)I")
	public abstract int method4223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "()Z")
	public abstract boolean method4224();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZIII)V")
	public final void method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4249(arg3, arg4, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
	public abstract void method4226();

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "()Z")
	public abstract boolean method4227();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIZ)Lclient!cq;")
	public abstract Class8 method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "()V")
	public abstract void method4229();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIII)Lclient!hs;")
	public abstract Class78 method4230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[[I[[IIII)Lclient!ck;")
	public abstract Class12 method4231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "()V")
	public abstract void method4232();

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "()V")
	public abstract void method4233();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!tr;)V")
	public abstract void method4234(@OriginalArg(0) Class1_Sub41 arg0);

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "()Z")
	public abstract boolean method4235();

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
	public abstract void method4236(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "()Z")
	public abstract boolean method4237();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!up;Z)Lclient!cq;")
	public abstract Class8 method4238(@OriginalArg(0) Class201 arg0);

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "()I")
	public abstract int method4239();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!op;)V")
	public abstract void method4240(@OriginalArg(0) Class153 arg0);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIIII)Z")
	public abstract boolean method4241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[Lclient!wc;)V")
	public abstract void method4242(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19[] arg1);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method4243(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!ud;II)V")
	public abstract void method4244(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "()V")
	public abstract void method4245();

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "()V")
	public abstract void method4246();

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIIII)V")
	public final void method4248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method4270(arg0, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIIIII)V")
	public abstract void method4249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "()Z")
	public abstract boolean method4251();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIZ)V")
	public final void method4252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4283(arg2, arg1, arg0, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "()Z")
	public abstract boolean method4253();

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "()Z")
	public abstract boolean method4254();

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIIII)V")
	public final void method4255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method4212(arg3, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!hs;)V")
	public abstract void method4256(@OriginalArg(0) Class78 arg0);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIII)Lclient!cq;")
	public abstract Class8 method4257(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4258();

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "()Z")
	public abstract boolean method4259();

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "()Z")
	public abstract boolean method4260();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4261(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIIII)V")
	protected abstract void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)V")
	public abstract void method4263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!cl;[Lclient!up;Z)Lclient!wl;")
	public abstract Class29 method4264(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class201[] arg1);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)V")
	public abstract void method4265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "()I")
	public abstract int method4266();

	@OriginalMember(owner = "client!ii", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method4299();
	}

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "()Lclient!vj;")
	public abstract Class31 method4267();

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(IIII)V")
	public abstract void method4268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)V")
	public abstract void method4269(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(IIIII)V")
	public abstract void method4270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIII)[I")
	public abstract int[] method4271();

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "()V")
	public abstract void method4272();

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "()Z")
	public abstract boolean method4273();

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "()Z")
	public abstract boolean method4274();

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(IIIIII)V")
	public abstract void method4275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!dc;Lclient!op;Lclient!vj;Lclient!kd;I)V")
	public abstract void method4276(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class153 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class7_Sub6 arg3);

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V")
	public abstract void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIILclient!ud;II)V")
	public abstract void method4278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "()I")
	public abstract int method4279();

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(Z)V")
	public abstract void method4280(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(II)V")
	public abstract void method4281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(IIII)V")
	public abstract void method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(IIIIII)V")
	public abstract void method4283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "()V")
	public abstract void method4284();

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "()Z")
	public abstract boolean method4285();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(F)V")
	public abstract void method4286(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(FFF)V")
	public abstract void method4287(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "()I")
	public abstract int method4288();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([Lclient!dc;Lclient!vj;[Lclient!kd;I)V")
	public abstract void method4289(@OriginalArg(0) Class40[] arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class7_Sub6[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
	public abstract void method4290(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "()I")
	public abstract int method4291();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([I)V")
	public abstract void method4292(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(IIIIII)V")
	public final void method4293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4275(arg1, arg4, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "()F")
	public abstract float method4294();

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
	public abstract void method4295(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "()Z")
	public abstract boolean method4296();

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "()I")
	public abstract int method4297();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4298(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
	public final void method4299() {
		Static236.aBooleanArray20[this.anInt4861] = false;
		this.method4206();
	}

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "()V")
	public abstract void method4300();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!wp;IIII)Lclient!dc;")
	public abstract Class40 method4301(@OriginalArg(0) Class219 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[I[I)Lclient!ud;")
	public abstract Class15 method4303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "()Lclient!vj;")
	public abstract Class31 method4304();

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)Lclient!tr;")
	public abstract Class1_Sub41 method4306();
}
