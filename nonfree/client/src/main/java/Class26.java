import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class26 {

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	public final int anInt2873;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Lclient!m;")
	public final Interface8 anInterface8_5;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILclient!m;)V")
	public Class26(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		this.anInt2873 = arg0;
		this.anInterface8_5 = arg1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!c;Lclient!pm;Lclient!ia;Lclient!fo;I)V")
	public abstract void method2218(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) Class38_Sub4 arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method2219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "ba", descriptor = "(IIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public abstract void method2220();

	@OriginalMember(owner = "client!qa", name = "da", descriptor = "(IIIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method2221(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	public abstract void method2222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Lclient!ia;")
	public abstract Class102 method2223();

	@OriginalMember(owner = "client!qa", name = "FA", descriptor = "()I")
	public abstract int FA();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()Z")
	public abstract boolean method2224();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()Z")
	public abstract boolean method2225();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!l;)V")
	public abstract void method2226(@OriginalArg(0) Class2_Sub3 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!wp;IIII)Lclient!c;")
	public abstract Class32 method2227(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "pa", descriptor = "(IIII)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
	public abstract boolean method2228();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method2229(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fq;Z)Lclient!f;")
	public abstract Class76 method2230(@OriginalArg(0) Class89 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!re;[Lclient!fq;Z)Lclient!oa;")
	public abstract Class56 method2231(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class89[] arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	public abstract Class14 method2232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "()F")
	public abstract float w();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
	public abstract int d();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method2233(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "([I)V")
	public abstract void u(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIIII)V")
	public abstract void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIII)V")
	protected abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public abstract void method2234(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public abstract void method2235(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "W", descriptor = "()I")
	public abstract int W();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIII)V")
	public final void method2236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.O(arg2, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "ua", descriptor = "(F)V")
	public abstract void ua(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
	public abstract int xa();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method2237(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg3, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
	public abstract void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
	public abstract boolean method2238();

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
	public abstract void method2239();

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
	public abstract boolean method2240();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!c;Lclient!pm;Lclient!ia;[Lclient!fo;I)V")
	public abstract void method2241(@OriginalArg(0) Class32[] arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) Class38_Sub4[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)Lclient!l;")
	public abstract Class2_Sub3 method2242();

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
	public abstract boolean method2243();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class76 method2244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
	public abstract int g();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
	public final void method2245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.NA(arg1, arg2, arg3, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()Z")
	public abstract boolean method2246();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	public abstract void method2247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "(ILclient!ea;II)V")
	public abstract void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method2248(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "XA", descriptor = "(IFFFFF)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public abstract void method2250(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!to;Lclient!to;FLclient!to;)Lclient!to;")
	public abstract Class21 method2251(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class21 arg3);

	@OriginalMember(owner = "client!qa", name = "na", descriptor = "(I)V")
	public abstract void na(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pm;)V")
	public abstract void method2252(@OriginalArg(0) Class192 arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method2253(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2258();
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public abstract void method2255(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	public abstract void method2256(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class76 method2257(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(II)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "(FF)V")
	public abstract void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "aa", descriptor = "(IIIIII[BII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public final void method2258() {
		Static4.aBooleanArray4[this.anInt2873] = false;
		this.method2269();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method2259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	public abstract boolean method2261();

	@OriginalMember(owner = "client!qa", name = "va", descriptor = "()V")
	public abstract void va();

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)[I")
	public abstract int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "()F")
	public abstract float la();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method2262();

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()Z")
	public abstract boolean method2263();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method2264(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!or;)V")
	public abstract void method2265(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7[] arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIBIII)V")
	public final void method2266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2260(arg2, arg0, arg4, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "ia", descriptor = "(III[I)V")
	public abstract void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
	public abstract boolean method2267();

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()V")
	public abstract void method2268();

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()V")
	protected abstract void method2269();

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public abstract void method2270(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "(IIII)V")
	public abstract void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()V")
	public abstract void method2271();

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
	public abstract boolean method2272();

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	public abstract boolean method2273();

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(Lclient!ia;)V")
	public abstract void m(@OriginalArg(0) Class102 arg0);

	@OriginalMember(owner = "client!qa", name = "SA", descriptor = "(IIIIII)Z")
	public abstract boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!or;")
	public abstract Class2_Sub7 method2275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
	public abstract boolean method2276();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public final void method2277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.da(arg3, arg0, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "()V")
	public abstract void S();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZI)V")
	public final void method2278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2247(arg0, arg2, arg1, arg4, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
	public abstract boolean method2279();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	public abstract Class106 method2280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()I")
	public abstract int method2281();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!to;)V")
	public abstract void method2283(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()V")
	public abstract void method2284();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	public abstract int method2285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Lclient!ia;")
	public abstract Class102 method2286();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method2287(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)Lclient!to;")
	public abstract Class21 method2289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	public abstract boolean method2290();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!fo;I)V")
	public abstract void method2291(@OriginalArg(0) Class32[] arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class38_Sub4[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()V")
	public abstract void method2292();
}
