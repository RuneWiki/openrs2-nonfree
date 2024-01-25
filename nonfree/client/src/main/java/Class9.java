import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public abstract class Class9 {

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Lclient!n;")
	public final Interface8 anInterface8_13;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	public final int anInt9019;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!n;)V")
	public Class9(@OriginalArg(0) Interface8 arg0) {
		this.anInterface8_13 = arg0;
		@Pc(6) int local6 = -1;
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			if (!Static157.aBooleanArray16[local8]) {
				Static157.aBooleanArray16[local8] = true;
				local6 = local8;
				break;
			}
		}
		if (local6 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt9019 = local6;
	}

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "(FF)V")
	public abstract void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	protected abstract void method7566();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method7567(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
	public abstract void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
	public abstract boolean method7569();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()V")
	public abstract void method7570();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()Z")
	public abstract boolean method7571();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	public abstract void method7572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "(I)V")
	public abstract void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!r;Lclient!rd;Lclient!m;Lclient!pr;I)V")
	public abstract void method7573(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7 arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class10 method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
	public abstract boolean method7575();

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "()F")
	public abstract float P();

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
	public abstract boolean method7576();

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!rd;)V")
	public abstract void method7577(@OriginalArg(0) Class249 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!pr;I)V")
	public abstract void method7578(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class2_Sub7[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(IIIIII)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
	public abstract boolean method7579();

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "(ILclient!pa;II)V")
	public abstract void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!qba;)V")
	public abstract void method7580(@OriginalArg(0) Class25 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method7581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.UA(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()I")
	public abstract int method7582();

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(III[I)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
	public abstract boolean method7583();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public abstract void method7584(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public final void method7585() {
		Static157.aBooleanArray16[this.anInt9019] = false;
		this.method7566();
	}

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
	public abstract void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()V")
	public abstract void method7586();

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "(I)V")
	public abstract void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "CA", descriptor = "()I")
	public abstract int CA();

	@OriginalMember(owner = "client!qa", name = "ra", descriptor = "()F")
	public abstract float ra();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!nm;)V")
	public abstract void method7588(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub27[] arg1);

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method7589(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()Z")
	public abstract boolean method7591();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7592(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "za", descriptor = "(IIIIII[BII)V")
	public abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!rd;Lclient!m;[Lclient!pr;I)V")
	public abstract void method7593(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	public abstract void method7594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class23 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7595();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public abstract void method7596(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!m;)V")
	public abstract void method7597(@OriginalArg(0) Class22 arg0);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	public abstract void method7598(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIIII)V")
	public final void method7599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7568(arg3, arg4, arg1, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "(IIIIII)Z")
	public abstract boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!u;)V")
	public abstract void method7600(@OriginalArg(0) Class1_Sub16 arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
	public abstract int c();

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	public abstract boolean method7601();

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()V")
	public abstract void method7602();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!lg;[Lclient!qm;Z)Lclient!ra;")
	public abstract Class27 method7603(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class242[] arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method7604(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()V")
	public abstract void xa();

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	public abstract boolean method7605();

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIII)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method7606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	public abstract int method7607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)Lclient!qba;")
	public abstract Class25 method7608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIII)V")
	protected abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(IIIII)V")
	public abstract void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!qba;Lclient!qba;FLclient!qba;)Lclient!qba;")
	public abstract Class25 method7609(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class25 arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method7610(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
	public abstract boolean method7611();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	public abstract Class12 method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public abstract void method7613(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "(IIII)[I")
	public abstract int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(F)V")
	public abstract void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
	public abstract boolean method7614();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "([I)V")
	public abstract void d(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public abstract void method7615(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!nm;")
	public abstract Class1_Sub27 method7616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)V")
	public abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
	public final void method7618(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7572(arg4, arg0, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()V")
	public abstract void method7619();

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(IFFFFF)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "ta", descriptor = "(II)V")
	public abstract void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	public abstract boolean method7620();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIBI)V")
	public final void method7621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg1, arg3, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
	public abstract boolean method7622();

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
	public abstract void method7623();

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()V")
	public abstract void method7624();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!qm;Z)Lclient!ha;")
	public abstract Class12 method7625(@OriginalArg(0) Class242 arg0);

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()Lclient!cr;")
	public abstract Class49 method7626();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7627(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)Lclient!u;")
	public abstract Class1_Sub16 method7629(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	public abstract boolean method7630();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	public abstract Class23 method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(ZIIIII)V")
	public final void method7632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.f(arg0, arg4, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "(III)V")
	public abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIBII)V")
	public final void method7633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.A(arg2, arg3, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7634(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fd;IIII)Lclient!r;")
	public abstract Class19 method7635(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7636(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "()V")
	public abstract void method7637() throws Exception_Sub1;

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	public abstract boolean method7640();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!ha;")
	public abstract Class12 method7641(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
	public abstract int YA();

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()Lclient!m;")
	public abstract Class22 method7642();

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7585();
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
	public abstract void method7643(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "()Lclient!m;")
	public abstract Class22 method7644();

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
	public abstract void n();
}
