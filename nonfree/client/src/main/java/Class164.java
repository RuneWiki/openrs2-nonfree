import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public abstract class Class164 {

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Lclient!cp;")
	public final Interface2 anInterface2_7;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
	public final int anInt6163;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(ILclient!cp;)V")
	protected Class164(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_7 = arg1;
		this.anInt6163 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "()V")
	public abstract void method5303();

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "()Z")
	public abstract boolean method5304();

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "()V")
	public abstract void method5305();

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "()V")
	public abstract void method5306();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
	public abstract void method5307(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "()Z")
	public abstract boolean method5308();

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "()Z")
	public abstract boolean method5309();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!as;)V")
	public abstract void method5311(@OriginalArg(0) Class16 arg0);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!us;II)V")
	public abstract void method5312(@OriginalArg(1) Class34 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIII)V")
	public abstract void method5313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(FF)V")
	public abstract void method5314(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!im;)V")
	public abstract void method5315(@OriginalArg(0) Class108 arg0);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([Lclient!ns;Lclient!im;Lclient!mu;[Lclient!ro;I)V")
	public abstract void method5316(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) Class41_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "()Z")
	public abstract boolean method5317();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Lclient!ku;")
	public abstract Class1_Sub23 method5318();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II[I[I)Lclient!us;")
	public abstract Class34 method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public final void method5320() {
		Static142.aBooleanArray14[this.anInt6163] = false;
		this.method5346();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5322(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "()I")
	public abstract int method5323();

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "()V")
	public abstract void method5324();

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(IIIIII)Lclient!as;")
	public abstract Class16 method5325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(Z)V")
	public abstract void method5326(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "()Z")
	public abstract boolean method5327();

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "()Z")
	public abstract boolean method5328();

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(IIII)V")
	public abstract void method5329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(IIII)V")
	public abstract void method5330();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III[I)V")
	public abstract void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIII)V")
	protected abstract void method5332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "()F")
	public abstract float method5333();

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(IIII)V")
	public abstract void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "()Z")
	public abstract boolean method5336();

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "()I")
	public abstract int method5337();

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "()F")
	public abstract float method5338();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIILclient!us;II)V")
	public abstract void method5339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(Z)V")
	public abstract void method5340(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "()Z")
	public abstract boolean method5341();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!as;Lclient!as;FLclient!as;)Lclient!as;")
	public abstract Class16 method5342(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class16 arg3);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIBII)V")
	public final void method5343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5321(arg3, arg2, arg4, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5344();

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
	public abstract void method5345(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "()V")
	protected abstract void method5346();

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "()I")
	public abstract int method5347();

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "()I")
	public abstract int method5348();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([IIIII)Lclient!dp;")
	public abstract Class51 method5349(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5350(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!tq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method5320();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!is;[Lclient!ff;Z)Lclient!tr;")
	public abstract Class137 method5352(@OriginalArg(0) Class110 arg0, @OriginalArg(1) Class80[] arg1);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([I)V")
	public abstract void method5353(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[Lclient!ma;)V")
	public abstract void method5355(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub27[] arg1);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!mu;)V")
	public abstract void method5357(@OriginalArg(0) Class127 arg0);

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(IIIIII)V")
	public final void method5358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5364(arg2, arg3, arg4, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "()V")
	public abstract void method5359();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ff;Z)Lclient!dp;")
	public abstract Class51 method5360(@OriginalArg(0) Class80 arg0);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V")
	public abstract void method5361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(IIIII)V")
	public final void method5362(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method5392(arg3, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(IIIII)V")
	public abstract void method5363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(IIIIII)V")
	public abstract void method5364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ns;Lclient!im;Lclient!mu;Lclient!ro;I)V")
	public abstract void method5365(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) Class41_Sub5 arg3);

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V")
	public abstract void method5366(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)V")
	public abstract void method5367(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!vn;IIII)Lclient!ns;")
	public abstract Class22 method5368(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "()Z")
	public abstract boolean method5369();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([Lclient!ns;Lclient!mu;[Lclient!ro;I)V")
	public abstract void method5370(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class41_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(IIIII)V")
	public final void method5371(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method5332(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "()I")
	public abstract int method5372();

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(IIII)[I")
	public abstract int[] method5373();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ku;)V")
	public abstract void method5374(@OriginalArg(0) Class1_Sub23 arg0);

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "()I")
	public abstract int method5375();

	@OriginalMember(owner = "client!tq", name = "A", descriptor = "()V")
	public abstract void method5376();

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)V")
	public abstract void method5377(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tq", name = "B", descriptor = "()Lclient!mu;")
	public abstract Class127 method5378();

	@OriginalMember(owner = "client!tq", name = "C", descriptor = "()Z")
	public abstract boolean method5379();

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(IIIIII)Z")
	public abstract boolean method5380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "()Z")
	public abstract boolean method5381();

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(IIIIII)V")
	public abstract void method5382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(IIII)V")
	public abstract void method5383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tq", name = "E", descriptor = "()Z")
	public abstract boolean method5384();

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "(IIII)V")
	public abstract void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tq", name = "F", descriptor = "()V")
	public abstract void method5386();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIZ)Lclient!dp;")
	public abstract Class51 method5387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method5388(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!tq", name = "G", descriptor = "()Z")
	public abstract boolean method5389();

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)V")
	public abstract void method5390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(II)I")
	public abstract int method5391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(IIIII)V")
	public abstract void method5392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!tq", name = "H", descriptor = "()Lclient!mu;")
	public abstract Class127 method5393();

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "()Z")
	public abstract boolean method5394();

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(IIIII)V")
	public final void method5395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5363(arg3, arg0, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(II)I")
	public abstract int method5396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BIIIII)V")
	public final void method5397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5382(arg2, arg4, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(F)V")
	public abstract void method5398(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(FFF)V")
	public abstract void method5399(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!tq", name = "J", descriptor = "()V")
	public abstract void method5400();

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)V")
	public abstract void method5402(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II[[I[[IIII)Lclient!cl;")
	public abstract Class42 method5403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!tq", name = "K", descriptor = "()V")
	public abstract void method5404();

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "()Z")
	public abstract boolean method5405();
}
