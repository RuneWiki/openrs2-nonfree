import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class Class135 {

	@OriginalMember(owner = "client!ya", name = "j", descriptor = "I")
	public final int anInt6589;

	@OriginalMember(owner = "client!ya", name = "o", descriptor = "Lclient!ga;")
	public final Interface5 anInterface5_7;

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(ILclient!ga;)V")
	public Class135(@OriginalArg(0) int arg0, @OriginalArg(1) Interface5 arg1) {
		this.anInt6589 = arg0;
		this.anInterface5_7 = arg1;
	}

	@OriginalMember(owner = "client!ya", name = "da", descriptor = "([I)V")
	public abstract void da(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "()I")
	public abstract int a();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "X", descriptor = "(III[I)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5329(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "()V")
	public abstract void method5330();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!kc;Lclient!kc;FLclient!kc;)Lclient!kc;")
	public abstract Class3 method5331(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3);

	@OriginalMember(owner = "client!ya", name = "ia", descriptor = "(II)V")
	public abstract void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(B)V")
	public final void method5332() {
		Static116.aBooleanArray10[this.anInt6589] = false;
		this.method5357();
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!u;)V")
	public abstract void method5333(@OriginalArg(0) Class4_Sub39 arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5334(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "W", descriptor = "()F")
	public abstract float W();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
	public abstract void method5335(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Z)V")
	public abstract void method5336(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "()Z")
	public abstract boolean method5337();

	@OriginalMember(owner = "client!ya", name = "B", descriptor = "(F)V")
	public abstract void B(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(Z)V")
	public abstract void method5339(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
	public abstract void method5340(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!ya", name = "ea", descriptor = "(Lclient!c;)V")
	public abstract void ea(@OriginalArg(0) Class35 arg0);

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "()V")
	public abstract void method5341();

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "()Z")
	public abstract boolean method5342();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	public abstract Class71 method5343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIIII)Lclient!kc;")
	public abstract Class3 method5345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "()Z")
	public abstract boolean method5346();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!kc;)V")
	public abstract void method5347(@OriginalArg(0) Class3 arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIF)Lclient!ku;")
	public abstract Class4_Sub7 method5348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	public abstract Class95 method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "()Z")
	public abstract boolean method5350();

	@OriginalMember(owner = "client!ya", name = "w", descriptor = "()I")
	public abstract int w();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([IIIII)Lclient!l;")
	public abstract Class95 method5351(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!li;[Lclient!qv;Z)Lclient!la;")
	public abstract Class123 method5352(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class216[] arg1);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "i", descriptor = "()V")
	public abstract void method5353();

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIIII)V")
	public abstract void method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "j", descriptor = "()Z")
	public abstract boolean method5355();

	@OriginalMember(owner = "client!ya", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "YA", descriptor = "()I")
	public abstract int YA();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)I")
	public abstract int method5356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "O", descriptor = "(IIIIII)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "k", descriptor = "()V")
	protected abstract void method5357();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lclient!t;Lclient!fm;Lclient!c;[Lclient!vs;I)V")
	public abstract void method5358(@OriginalArg(0) Class116[] arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class20_Sub8[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(I[Lclient!ku;)V")
	public abstract void method5359(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7[] arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5360();

	@OriginalMember(owner = "client!ya", name = "m", descriptor = "()V")
	public abstract void method5361();

	@OriginalMember(owner = "client!ya", name = "n", descriptor = "()I")
	public abstract int method5362();

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5363(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "o", descriptor = "()Z")
	public abstract boolean method5364();

	@OriginalMember(owner = "client!ya", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "()V")
	public abstract void e();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5365(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "TA", descriptor = "(IIIII)V")
	public abstract void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "()Z")
	public abstract boolean method5367();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIII)V")
	public final void method5368(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.TA(arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!ya", name = "ca", descriptor = "(ILclient!ma;II)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "(I)V")
	public abstract void p(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(IIIIII)V")
	public final void method5369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5354(arg0, arg4, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	public abstract void method5370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class71 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ya", name = "T", descriptor = "(IFFFFF)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ya", name = "l", descriptor = "()V")
	public abstract void l();

	@OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IIII)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "NA", descriptor = "(IIIII)V")
	protected abstract void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(I)V")
	public abstract void method5371(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "xa", descriptor = "()F")
	public abstract float xa();

	@OriginalMember(owner = "client!ya", name = "fa", descriptor = "(IIII)V")
	public abstract void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5332();
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!vs;I)V")
	public abstract void method5372(@OriginalArg(0) Class116[] arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class20_Sub8[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(I)V")
	public abstract void method5373(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "(FF)V")
	public abstract void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ya", name = "q", descriptor = "()Z")
	public abstract boolean method5375();

	@OriginalMember(owner = "client!ya", name = "F", descriptor = "(IIII)[I")
	public abstract int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5377(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "UA", descriptor = "(III)V")
	public abstract void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	public abstract Class41 method5378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!qv;Z)Lclient!l;")
	public abstract Class95 method5379(@OriginalArg(0) Class216 arg0);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(Z)V")
	public abstract void method5380(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "(I)Lclient!u;")
	public abstract Class4_Sub39 method5381(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(FFF)V")
	public abstract void method5382(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ya", name = "DA", descriptor = "(IIIIII[BII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIII)V")
	public final void method5383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.NA(arg1, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!fm;)V")
	public abstract void method5384(@OriginalArg(0) Class83 arg0);

	@OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
	public abstract void method5385();

	@OriginalMember(owner = "client!ya", name = "JA", descriptor = "(IIIIII)Z")
	public abstract boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "s", descriptor = "()Z")
	public abstract boolean method5386();

	@OriginalMember(owner = "client!ya", name = "H", descriptor = "(IIII)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "t", descriptor = "()Z")
	public abstract boolean method5387();

	@OriginalMember(owner = "client!ya", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZI)V")
	public final void method5388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5328(arg2, arg3, arg4, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "(I)V")
	public abstract void method5389(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "u", descriptor = "()Z")
	public abstract boolean method5390();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!mb;IIII)Lclient!t;")
	public abstract Class116 method5391(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "v", descriptor = "()Z")
	public abstract boolean method5392();

	@OriginalMember(owner = "client!ya", name = "x", descriptor = "()Z")
	public abstract boolean method5393();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIBI)V")
	public final void method5394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.O(arg1, arg3, arg0, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!ya", name = "y", descriptor = "()V")
	public abstract void method5395();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!t;Lclient!fm;Lclient!c;Lclient!vs;I)V")
	public abstract void method5396(@OriginalArg(0) Class116 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class20_Sub8 arg3);

	@OriginalMember(owner = "client!ya", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ya", name = "z", descriptor = "()Z")
	public abstract boolean method5397();

	@OriginalMember(owner = "client!ya", name = "A", descriptor = "()Lclient!c;")
	public abstract Class35 method5398();

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(II)I")
	public abstract int method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "B", descriptor = "()Lclient!c;")
	public abstract Class35 method5400();

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(IIIII)V")
	public final void method5402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.b(arg1, arg3, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!ya", name = "C", descriptor = "()Z")
	public abstract boolean method5403();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIII)V")
	public abstract void method5404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
