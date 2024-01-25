import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public abstract class Class47 {

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
	public int anInt3056 = -1;

	static {
		new Class159("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	protected Class47() {
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public abstract void method2655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!s;)V")
	public abstract void method2656(@OriginalArg(0) Class57 arg0);

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "()V")
	public abstract void method2657();

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "()Z")
	public abstract boolean method2658();

	@OriginalMember(owner = "client!vq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method2673();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIII)V")
	public final void method2659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method2729(arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIII)V")
	public abstract void method2660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "()Z")
	public abstract boolean method2661();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(F)V")
	public abstract void method2662(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II[I[I)Lclient!sg;")
	public abstract Class118 method2663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "()V")
	public abstract void method2664();

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(IIII)V")
	public abstract void method2665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method2666();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(FFF)V")
	public abstract void method2668(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "()Z")
	public abstract boolean method2670();

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "()V")
	public abstract void method2671();

	@OriginalMember(owner = "client!vq", name = "j", descriptor = "()Z")
	public abstract boolean method2672();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public final void method2673() {
		Static291.aBooleanArray25[this.anInt3056] = false;
		this.method2753();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!bc;)V")
	public abstract void method2674(@OriginalArg(0) Class4_Sub5 arg0);

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "()Z")
	public abstract boolean method2675();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)V")
	public abstract void method2676(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!k;Z)Lclient!vj;")
	public abstract Class58 method2677(@OriginalArg(0) Class110 arg0);

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "()V")
	public abstract void method2678();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([IIIII)Lclient!vj;")
	public abstract Class58 method2679(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "()Z")
	public abstract boolean method2680();

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(IIII)V")
	public abstract void method2681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIII)V")
	public abstract void method2682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "()I")
	public abstract int method2683();

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(IIIIII)Z")
	public abstract boolean method2684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method2685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!vq", name = "o", descriptor = "()Z")
	public abstract boolean method2686();

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(IIIIII)V")
	public final void method2687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2682(arg0, arg3, arg2, arg4, arg1, 1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)V")
	public abstract void method2689();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II[[I[[IIII)Lclient!uh;")
	public abstract Class60 method2690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "()V")
	public abstract void method2691();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
	public abstract void method2692(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!bb;[Lclient!k;Z)Lclient!ug;")
	public abstract Class51 method2693(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class110[] arg1);

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "()I")
	public abstract int method2694();

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(II)I")
	public abstract int method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)Lclient!bc;")
	public abstract Class4_Sub5 method2696();

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "()Z")
	public abstract boolean method2697();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([I)V")
	public abstract void method2699(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "()I")
	public abstract int method2700();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(FF)V")
	public abstract void method2701(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "()F")
	public abstract float method2702();

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "(II)V")
	public abstract void method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(IIIIII)V")
	public final void method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2751(arg0, arg4, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!vq", name = "u", descriptor = "()Lclient!s;")
	public abstract Class57 method2705();

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "()Lclient!s;")
	public abstract Class57 method2706();

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(IIIII)V")
	public abstract void method2707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "()I")
	public abstract int method2708();

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(IIII)V")
	public abstract void method2709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "()Z")
	public abstract boolean method2710();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([Lclient!ni;Lclient!s;[Lclient!rh;I)V")
	public abstract void method2711(@OriginalArg(0) Class38[] arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) Class2_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "()Z")
	public abstract boolean method2712();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!rm;)V")
	public abstract void method2713(@OriginalArg(0) Class176 arg0);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([Lclient!ni;Lclient!rm;Lclient!s;[Lclient!rh;I)V")
	public abstract void method2714(@OriginalArg(0) Class38[] arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) Class2_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIILclient!sg;II)V")
	public abstract void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class118 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I[Lclient!pc;)V")
	public abstract void method2716(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub33[] arg1);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!qf;IIII)Lclient!ni;")
	public abstract Class38 method2717(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ro;Lclient!ro;FLclient!ro;)Lclient!ro;")
	public abstract Class81 method2718(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class81 arg3);

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "()V")
	public abstract void method2719();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILclient!sg;II)V")
	public abstract void method2720(@OriginalArg(1) Class118 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!vq", name = "A", descriptor = "()V")
	public abstract void method2722();

	@OriginalMember(owner = "client!vq", name = "B", descriptor = "()V")
	public abstract void method2723();

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(IIIII)V")
	public abstract void method2724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V")
	public abstract void method2725(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method2726(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIBI)V")
	public final void method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2759(arg4, arg0, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V")
	public abstract void method2728(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(IIIII)V")
	protected abstract void method2729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "()I")
	public abstract int method2730();

	@OriginalMember(owner = "client!vq", name = "D", descriptor = "()Z")
	public abstract boolean method2731();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIZ)Lclient!vj;")
	public abstract Class58 method2733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!vq", name = "E", descriptor = "()F")
	public abstract float method2734();

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "(IIIIII)Lclient!ro;")
	public abstract Class81 method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "()Z")
	public abstract boolean method2736();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIBI)V")
	public final void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method2724(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(I)V")
	public abstract void method2738(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ro;)V")
	public abstract void method2739(@OriginalArg(0) Class81 arg0);

	@OriginalMember(owner = "client!vq", name = "G", descriptor = "()Z")
	public abstract boolean method2740();

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(III)V")
	public abstract void method2741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "(II)I")
	public abstract int method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)V")
	public abstract void method2744(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vq", name = "H", descriptor = "()I")
	public abstract int method2745();

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method2746(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BIIII)V")
	public final void method2747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method2707(arg0, arg3, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III[I)V")
	public abstract void method2748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method2750(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "(IIIIII)V")
	public abstract void method2751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "(IIII)[I")
	public abstract int[] method2752();

	@OriginalMember(owner = "client!vq", name = "I", descriptor = "()V")
	protected abstract void method2753();

	@OriginalMember(owner = "client!vq", name = "J", descriptor = "()Z")
	public abstract boolean method2754();

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V")
	public abstract void method2755(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vq", name = "K", descriptor = "()V")
	public abstract void method2756();

	@OriginalMember(owner = "client!vq", name = "L", descriptor = "()Z")
	public abstract boolean method2757();

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(Z)V")
	public abstract void method2758(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "(IIIIII)V")
	public abstract void method2759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ni;Lclient!rm;Lclient!s;Lclient!rh;I)V")
	public abstract void method2760(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) Class2_Sub5 arg3);
}
