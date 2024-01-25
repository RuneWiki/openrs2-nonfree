import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class Class63 {

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	public final int anInt2081;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!tq;")
	public final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(ILclient!tq;)V")
	protected Class63(@OriginalArg(0) int arg0, @OriginalArg(1) Interface9 arg1) {
		this.anInt2081 = arg0;
		this.anInterface9_3 = arg1;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
	public final void method1951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method1982(arg4, arg0, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "()V")
	public abstract void method1952();

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "()Z")
	public abstract boolean method1953();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBII)V")
	public final void method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method2015(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIII)V")
	public abstract void method1955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "()V")
	public abstract void method1956();

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "()Z")
	public abstract boolean method1957();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)V")
	public abstract void method1958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(F)V")
	public abstract void method1959(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIII)V")
	public abstract void method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!de;)V")
	public abstract void method1961(@OriginalArg(0) Class44 arg0);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([I)V")
	public abstract void method1962(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method1963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIILclient!oj;II)V")
	public abstract void method1964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class165 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "()Z")
	public abstract boolean method1966();

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "()V")
	public abstract void method1967();

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "()V")
	public abstract void method1968();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([Lclient!n;Lclient!pa;Lclient!de;[Lclient!r;I)V")
	public abstract void method1969(@OriginalArg(0) Class66[] arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) Class10_Sub7[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "()Z")
	public abstract boolean method1971();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[[I[[IIII)Lclient!ij;")
	public abstract Class107 method1972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!pa;)V")
	public abstract void method1973(@OriginalArg(0) Class186 arg0);

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "()Z")
	public abstract boolean method1974();

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(IIIIII)V")
	public abstract void method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!oj;II)V")
	public abstract void method1977(@OriginalArg(1) Class165 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIII)V")
	public abstract void method1978();

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "()Z")
	public abstract boolean method1979();

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "()V")
	protected abstract void method1980();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method1981(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(IIIIII)V")
	public abstract void method1982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(IIIIII)Z")
	public abstract boolean method1983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
	public abstract void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(IIIIII)V")
	public final void method1985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method1976(arg3, arg0, arg4, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "()Z")
	public abstract boolean method1986();

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "()I")
	public abstract int method1987();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FFF)V")
	public abstract void method1988(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!rp;)V")
	public abstract void method1989(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "()I")
	public abstract int method1990();

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public abstract void method1991(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	public abstract void method1992(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method1993(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "()Z")
	public abstract boolean method1994();

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "()Lclient!de;")
	public abstract Class44 method1995();

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "()Z")
	public abstract boolean method1996();

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
	public abstract void method1997(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!qi;IIII)Lclient!n;")
	public abstract Class66 method1998(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IBIII)V")
	public final void method1999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method1960(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!gm;Z)Lclient!rn;")
	public abstract Class18 method2000(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "()V")
	public abstract void method2001();

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "()F")
	public abstract float method2002();

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "()I")
	public abstract int method2003();

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	public abstract void method2004(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "()Z")
	public abstract boolean method2005();

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(IIII)V")
	public abstract void method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([Lclient!n;Lclient!de;[Lclient!r;I)V")
	public abstract void method2007(@OriginalArg(0) Class66[] arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Class10_Sub7[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(IIII)V")
	public abstract void method2008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(IIII)V")
	public abstract void method2009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(IIII)[I")
	public abstract int[] method2010();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[Lclient!nq;)V")
	public abstract void method2011(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub17[] arg1);

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "()Z")
	public abstract boolean method2012();

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "()Z")
	public abstract boolean method2013();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!hb;)V")
	public abstract void method2014(@OriginalArg(0) Class2_Sub20 arg0);

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIII)V")
	public abstract void method2015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!rp;Lclient!rp;FLclient!rp;)Lclient!rp;")
	public abstract Class21 method2016(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class21 arg3);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[I[I)Lclient!oj;")
	public abstract Class165 method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method2050();
	}

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "()I")
	public abstract int method2018();

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	public abstract void method2020(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "()V")
	public abstract void method2021();

	@OriginalMember(owner = "client!vc", name = "C", descriptor = "()V")
	public abstract void method2022();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "()Lclient!de;")
	public abstract Class44 method2024();

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(IIIII)V")
	protected abstract void method2026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(IIIIII)V")
	public final void method2027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method1955(arg2, arg4, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([IIIII)Lclient!rn;")
	public abstract Class18 method2029(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(FF)V")
	public abstract void method2030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)I")
	public abstract int method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vc", name = "E", descriptor = "()Z")
	public abstract boolean method2032();

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "(IIIIII)Lclient!rp;")
	public abstract Class21 method2033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!kg;[Lclient!gm;Z)Lclient!am;")
	public abstract Class9 method2034(@OriginalArg(0) Class136 arg0, @OriginalArg(1) Class86[] arg1);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III[I)V")
	public abstract void method2035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "()Z")
	public abstract boolean method2036();

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)Lclient!hb;")
	public abstract Class2_Sub20 method2037();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method2038(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!vc", name = "G", descriptor = "()I")
	public abstract int method2039();

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method2040();

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "()V")
	public abstract void method2041();

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
	public abstract void method2042(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vc", name = "I", descriptor = "()I")
	public abstract int method2043();

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
	public abstract void method2044(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIZ)Lclient!rn;")
	public abstract Class18 method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)V")
	public abstract void method2047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(IIIII)V")
	public final void method2048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method2026(arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!vc", name = "J", descriptor = "()V")
	public abstract void method2049();

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V")
	public final void method2050() {
		Static149.aBooleanArray35[this.anInt2081] = false;
		this.method1980();
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(II)I")
	public abstract int method2051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(Z)V")
	public abstract void method2053(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(IIII)V")
	public abstract void method2054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!n;Lclient!pa;Lclient!de;Lclient!r;I)V")
	public abstract void method2055(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) Class10_Sub7 arg3);

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "()F")
	public abstract float method2056();

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "()Z")
	public abstract boolean method2057();
}
