import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class Class81 {

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
	public int anInt2815 = -1;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	protected Class81() {
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "()Z")
	public abstract boolean method2949();

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "()Z")
	public abstract boolean method2951();

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "()I")
	public abstract int method2952();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)V")
	public abstract void method2953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!po;)V")
	public abstract void method2954(@OriginalArg(0) Class72 arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II[I[I)Lclient!rn;")
	public abstract Class74 method2955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V")
	public abstract void method2956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public abstract void method2957(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I")
	public abstract int method2958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!qi;)V")
	public abstract void method2959(@OriginalArg(0) Class19 arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method2960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIII)V")
	public abstract void method2961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
	public abstract void method2962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "()V")
	public abstract void method2963();

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "()Z")
	public abstract boolean method2964();

	@OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method2966();
	}

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "()V")
	public abstract void method2965();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public final void method2966() {
		Static107.aBooleanArray19[this.anInt2815] = false;
		this.method2969();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIZ)Lclient!of;")
	public abstract Class40 method2967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIIIII)Lclient!qi;")
	public abstract Class19 method2968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "()V")
	protected abstract void method2969();

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "()F")
	public abstract float method2970();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([Lclient!rc;Lclient!he;Lclient!po;[Lclient!tc;I)V")
	public abstract void method2971(@OriginalArg(0) Class78[] arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class20_Sub8[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIIIII)Z")
	public abstract boolean method2972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(IIIII)V")
	public final void method2973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method2956(arg1, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(FF)V")
	public abstract void method2974(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "()Z")
	public abstract boolean method2975();

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIII)[I")
	public abstract int[] method2976();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "()Z")
	public abstract boolean method2978();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!rc;Lclient!he;Lclient!po;Lclient!tc;I)V")
	public abstract void method2979(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) Class20_Sub8 arg3);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(F)V")
	public abstract void method2980(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "()Z")
	public abstract boolean method2981();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public abstract void method2982(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "()I")
	public abstract int method2983();

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)Lclient!oe;")
	public abstract Class6_Sub29 method2984();

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(IIII)V")
	public abstract void method2985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "()Z")
	public abstract boolean method2986();

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
	public abstract void method2987(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "()Z")
	public abstract boolean method2988();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
	public abstract void method2989(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "()Lclient!po;")
	public abstract Class72 method2990();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!qi;Lclient!qi;FLclient!qi;)Lclient!qi;")
	public abstract Class19 method2991(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class19 arg3);

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(IIIIII)V")
	public abstract void method2992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)I")
	public abstract int method2994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)V")
	public abstract void method2995(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([IIIII)Lclient!of;")
	public abstract Class40 method2996(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "()Z")
	public abstract boolean method2997();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
	public abstract void method2998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(IIIII)V")
	public final void method2999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method3010(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIILclient!rn;II)V")
	public abstract void method3000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class74 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIBI)V")
	public final void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2992(arg2, arg0, arg3, arg4, arg1, 1);
	}

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "()V")
	public abstract void method3003();

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(IIIIII)V")
	public final void method3004(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method3043(arg2, arg1, arg3, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "()Z")
	public abstract boolean method3005();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method3006(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(FFF)V")
	public abstract void method3007(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II[[I[[IIII)Lclient!nc;")
	public abstract Class106 method3008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method3009(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(IIIII)V")
	public abstract void method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "()Z")
	public abstract boolean method3011();

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(Z)V")
	public abstract void method3012(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
	public abstract void method3013(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(IIIII)V")
	public final void method3014(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method3031(arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!hb;Z)Lclient!of;")
	public abstract Class40 method3015(@OriginalArg(0) Class88 arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!eb;IIII)Lclient!rc;")
	public abstract Class78 method3016(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBIIII)V")
	public final void method3017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2962(arg3, arg4, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "()I")
	public abstract int method3018();

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)V")
	public abstract void method3019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method3020();

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "()I")
	public abstract int method3021();

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "()V")
	public abstract void method3022();

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "()V")
	public abstract void method3023();

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "()Z")
	public abstract boolean method3024();

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "()I")
	public abstract int method3025();

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
	public abstract void method3026(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
	public abstract void method3027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "()Z")
	public abstract boolean method3028();

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "()Lclient!po;")
	public abstract Class72 method3029();

	@OriginalMember(owner = "client!ja", name = "E", descriptor = "()V")
	public abstract void method3030();

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(IIIII)V")
	protected abstract void method3031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "()V")
	public abstract void method3032();

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(IIII)V")
	public abstract void method3033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!he;)V")
	public abstract void method3034(@OriginalArg(0) Class90 arg0);

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(II)V")
	public abstract void method3035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[Lclient!uc;)V")
	public abstract void method3036(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub17[] arg1);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([Lclient!rc;Lclient!po;[Lclient!tc;I)V")
	public abstract void method3037(@OriginalArg(0) Class78[] arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) Class20_Sub8[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "()I")
	public abstract int method3038();

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
	public abstract void method3039(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ja", name = "H", descriptor = "()F")
	public abstract float method3040();

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "()Z")
	public abstract boolean method3041();

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "()V")
	public abstract void method3042();

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(IIIIII)V")
	public abstract void method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "()Z")
	public abstract boolean method3044();

	@OriginalMember(owner = "client!ja", name = "L", descriptor = "()V")
	public abstract void method3045();

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!bs;[Lclient!hb;Z)Lclient!pi;")
	public abstract Class30 method3046(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class88[] arg1);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!rn;II)V")
	public abstract void method3047(@OriginalArg(1) Class74 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!oe;)V")
	public abstract void method3048(@OriginalArg(0) Class6_Sub29 arg0);

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
	public abstract void method3049();
}
