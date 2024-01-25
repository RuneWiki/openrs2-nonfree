import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public abstract class Class32 {

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
	public int anInt2472 = -1;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	protected Class32() {
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)V")
	public abstract void method2138();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ts;Lclient!ts;FLclient!ts;)Lclient!ts;")
	public abstract Class114 method2139(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class114 arg3);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(F)V")
	public abstract void method2140(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "()Z")
	public abstract boolean method2141();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V")
	public abstract void method2142(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "()Z")
	public abstract boolean method2144();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method2145(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "()V")
	public abstract void method2146();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
	public abstract void method2147(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIII)V")
	public abstract void method2148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!iq;Z)Lclient!c;")
	public abstract Class5 method2149(@OriginalArg(0) Class99 arg0);

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "()I")
	public abstract int method2151();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!hf;IIII)Lclient!ge;")
	public abstract Class73 method2153(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIILclient!em;II)V")
	public abstract void method2154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class52 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([IIIII)Lclient!c;")
	public abstract Class5 method2155(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILclient!em;II)V")
	public abstract void method2156(@OriginalArg(1) Class52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIIII)V")
	public final void method2157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method2161(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
	public abstract void method2158(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)I")
	public abstract int method2159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "()Z")
	public abstract boolean method2160();

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIIII)V")
	public abstract void method2161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "()V")
	public abstract void method2162();

	@OriginalMember(owner = "client!uo", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method2197();
	}

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "()Z")
	public abstract boolean method2163();

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(III)V")
	public abstract void method2164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method2165(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "()Z")
	public abstract boolean method2166();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[[I[[IIII)Lclient!ip;")
	public abstract Class53 method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ts;)V")
	public abstract void method2169(@OriginalArg(0) Class114 arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III[I)V")
	public abstract void method2170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIIII)V")
	protected abstract void method2171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([Lclient!ge;Lclient!sk;Lclient!wr;[Lclient!fi;I)V")
	public abstract void method2172(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class8_Sub3[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)I")
	public abstract int method2173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([I)V")
	public abstract void method2174(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "()Z")
	public abstract boolean method2175();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ac;)V")
	public abstract void method2176(@OriginalArg(0) Class1_Sub2 arg0);

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "()V")
	public abstract void method2177();

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "()Z")
	public abstract boolean method2178();

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "()V")
	public abstract void method2179();

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V")
	public abstract void method2180(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ge;Lclient!sk;Lclient!wr;Lclient!fi;I)V")
	public abstract void method2181(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class8_Sub3 arg3);

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "()V")
	protected abstract void method2182();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIBI)V")
	public final void method2183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2200(arg0, arg1, arg2, arg4, arg3, 1);
	}

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "()V")
	public abstract void method2184();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIII)V")
	public final void method2185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2193(arg1, arg3, arg4, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "()V")
	public abstract void method2187();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method2189(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!sk;)V")
	public abstract void method2190(@OriginalArg(0) Class191 arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIIIII)V")
	public final void method2191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2241(arg1, arg3, arg2, arg4, arg0, 1);
	}

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "()Z")
	public abstract boolean method2192();

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIIIII)V")
	public abstract void method2193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "()Lclient!wr;")
	public abstract Class109 method2194();

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
	public abstract void method2195(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method2196();

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
	public final void method2197() {
		Static121.aBooleanArray11[this.anInt2472] = false;
		this.method2182();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([Lclient!ge;Lclient!wr;[Lclient!fi;I)V")
	public abstract void method2198(@OriginalArg(0) Class73[] arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class8_Sub3[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!fa;[Lclient!iq;Z)Lclient!ak;")
	public abstract Class9 method2199(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class99[] arg1);

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIIIII)V")
	public abstract void method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!wr;)V")
	public abstract void method2201(@OriginalArg(0) Class109 arg0);

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(II)V")
	public abstract void method2202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "()I")
	public abstract int method2203();

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(II)V")
	public abstract void method2204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIIII)V")
	public final void method2205(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method2171(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIIII)V")
	public final void method2206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method2148(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V")
	public abstract void method2207(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIII)[I")
	public abstract int[] method2208();

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "()V")
	public abstract void method2209();

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)Lclient!ac;")
	public abstract Class1_Sub2 method2210();

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)V")
	public abstract void method2211(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "()F")
	public abstract float method2212();

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "()Z")
	public abstract boolean method2213();

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "()Z")
	public abstract boolean method2214();

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIIIII)Lclient!ts;")
	public abstract Class114 method2215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uo", name = "z", descriptor = "()F")
	public abstract float method2216();

	@OriginalMember(owner = "client!uo", name = "A", descriptor = "()V")
	public abstract void method2217();

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIII)V")
	public abstract void method2218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIZ)Lclient!c;")
	public abstract Class5 method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIII)V")
	public abstract void method2220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "B", descriptor = "()Lclient!wr;")
	public abstract Class109 method2221();

	@OriginalMember(owner = "client!uo", name = "C", descriptor = "()Z")
	public abstract boolean method2222();

	@OriginalMember(owner = "client!uo", name = "D", descriptor = "()I")
	public abstract int method2223();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method2224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(FF)V")
	public abstract void method2225(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIII)V")
	public abstract void method2226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "E", descriptor = "()I")
	public abstract int method2227();

	@OriginalMember(owner = "client!uo", name = "F", descriptor = "()V")
	public abstract void method2228();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(FFF)V")
	public abstract void method2229(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!uo", name = "G", descriptor = "()I")
	public abstract int method2230();

	@OriginalMember(owner = "client!uo", name = "H", descriptor = "()Z")
	public abstract boolean method2231();

	@OriginalMember(owner = "client!uo", name = "I", descriptor = "()Z")
	public abstract boolean method2233();

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "()Z")
	public abstract boolean method2235();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[Lclient!si;)V")
	public abstract void method2236(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub30[] arg1);

	@OriginalMember(owner = "client!uo", name = "K", descriptor = "()Z")
	public abstract boolean method2237();

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[I[I)Lclient!em;")
	public abstract Class52 method2238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(Z)V")
	public abstract void method2239(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!uo", name = "L", descriptor = "()I")
	public abstract int method2240();

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIIIII)V")
	public abstract void method2241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIII)V")
	public abstract void method2242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "(IIIIII)Z")
	public abstract boolean method2243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
