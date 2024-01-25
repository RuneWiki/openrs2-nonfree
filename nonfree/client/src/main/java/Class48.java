import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class Class48 {

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Lclient!eg;")
	public final Interface3 anInterface3_4;

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
	public final int anInt3038;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(ILclient!eg;)V")
	protected Class48(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_4 = arg1;
		this.anInt3038 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "()Lclient!bd;")
	public abstract Class21 method2445();

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "()I")
	public abstract int method2446();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIII)Lclient!aj;")
	public abstract Class10 method2447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
	public abstract int method2448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!wt;)V")
	public abstract void method2449(@OriginalArg(0) Class2_Sub44 arg0);

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "()Z")
	public abstract boolean method2450();

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)I")
	public abstract int method2451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V")
	public abstract void method2452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "()Z")
	public abstract boolean method2453();

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "()Z")
	public abstract boolean method2454();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([IIIII)Lclient!rg;")
	public abstract Class27 method2456(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public abstract void method2457(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "()Z")
	public abstract boolean method2459();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(FF)V")
	public abstract void method2460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[[I[[IIII)Lclient!mi;")
	public abstract Class149 method2461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "()F")
	public abstract float method2462();

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(IIII)[I")
	public abstract int[] method2463();

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(IIII)V")
	public abstract void method2464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "()V")
	public abstract void method2465();

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)Lclient!wt;")
	public abstract Class2_Sub44 method2466();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)V")
	protected abstract void method2467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "()V")
	protected abstract void method2468();

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(IIII)V")
	public abstract void method2469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(IIIIII)V")
	public abstract void method2470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "()V")
	public abstract void method2471();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method2472(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "()Z")
	public abstract boolean method2473();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[Lclient!hq;)V")
	public abstract void method2474(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub8[] arg1);

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)V")
	public abstract void method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "()Z")
	public abstract boolean method2476();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([Lclient!qh;Lclient!bd;[Lclient!qt;I)V")
	public abstract void method2477(@OriginalArg(0) Class159[] arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class7_Sub6[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	public abstract void method2478(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
	public final void method2479() {
		Static339.aBooleanArray28[this.anInt3038] = false;
		this.method2468();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method2480(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "()Z")
	public abstract boolean method2481();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!bd;)V")
	public abstract void method2482(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "()Lclient!bd;")
	public abstract Class21 method2483();

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(IIIIII)V")
	public final void method2484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2534(arg1, arg4, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(IIII)V")
	public abstract void method2485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "()V")
	public abstract void method2486();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
	public abstract void method2487(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "()Z")
	public abstract boolean method2488();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!aj;)V")
	public abstract void method2489(@OriginalArg(0) Class10 arg0);

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(IIIIII)V")
	public abstract void method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(IIIII)V")
	public abstract void method2491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(II)V")
	public abstract void method2492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(IIIII)V")
	public final void method2493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method2532(arg1, arg2, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([I)V")
	public abstract void method2495(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(IIII)V")
	public abstract void method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(IIIIII)Z")
	public abstract boolean method2497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(F)V")
	public abstract void method2498(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)V")
	public abstract void method2499(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "()Z")
	public abstract boolean method2500();

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
	public abstract void method2501(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[I[I)Lclient!hg;")
	public abstract Class8 method2502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "()V")
	public abstract void method2503();

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(Z)V")
	public abstract void method2504(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "()V")
	public abstract void method2505();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!aj;Lclient!aj;FLclient!aj;)Lclient!aj;")
	public abstract Class10 method2506(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class10 arg3);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIIII)V")
	public final void method2507(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method2467(arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "()I")
	public abstract int method2508();

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(IIIIII)V")
	public final void method2509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2470(arg4, arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIZ)Lclient!rg;")
	public abstract Class27 method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "()Z")
	public abstract boolean method2511();

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)V")
	public abstract void method2512(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!hg;II)V")
	public abstract void method2513(@OriginalArg(1) Class8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(BIIII)V")
	public final void method2514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method2491(arg1, arg0, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "()Z")
	public abstract boolean method2515();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!cd;)V")
	public abstract void method2516(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!oj", name = "z", descriptor = "()F")
	public abstract float method2517();

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "(I)V")
	public abstract void method2518(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "()Z")
	public abstract boolean method2519();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!qh;Lclient!cd;Lclient!bd;Lclient!qt;I)V")
	public abstract void method2520(@OriginalArg(0) Class159 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class7_Sub6 arg3);

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "(IIII)V")
	public abstract void method2521();

	@OriginalMember(owner = "client!oj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method2479();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method2522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oj", name = "B", descriptor = "()I")
	public abstract int method2523();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[I)V")
	public abstract void method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method2525();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!bg;[Lclient!km;Z)Lclient!cr;")
	public abstract Class44 method2526(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class128[] arg1);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!km;Z)Lclient!rg;")
	public abstract Class27 method2527(@OriginalArg(0) Class128 arg0);

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "()I")
	public abstract int method2528();

	@OriginalMember(owner = "client!oj", name = "D", descriptor = "()V")
	public abstract void method2529();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIILclient!hg;II)V")
	public abstract void method2530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class8 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(FFF)V")
	public abstract void method2531(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(IIIII)V")
	public abstract void method2532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "()V")
	public abstract void method2533();

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "(IIIIII)V")
	public abstract void method2534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oj", name = "F", descriptor = "()Z")
	public abstract boolean method2535();

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "(IIIIII)V")
	public final void method2536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2490(arg0, arg4, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!oj", name = "G", descriptor = "()V")
	public abstract void method2537();

	@OriginalMember(owner = "client!oj", name = "H", descriptor = "()V")
	public abstract void method2538();

	@OriginalMember(owner = "client!oj", name = "I", descriptor = "()I")
	public abstract int method2539();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!kp;IIII)Lclient!qh;")
	public abstract Class159 method2540(@OriginalArg(0) Class130 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "([Lclient!qh;Lclient!cd;Lclient!bd;[Lclient!qt;I)V")
	public abstract void method2541(@OriginalArg(0) Class159[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class7_Sub6[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oj", name = "J", descriptor = "()Z")
	public abstract boolean method2542();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method2543(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oj", name = "K", descriptor = "()Z")
	public abstract boolean method2544();

	@OriginalMember(owner = "client!oj", name = "L", descriptor = "()I")
	public abstract int method2546();
}
