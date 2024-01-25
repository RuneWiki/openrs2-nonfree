import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public abstract class Class122 {

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!n;")
	public final Interface8 anInterface8_14;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public final int anInt8823;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!n;)V")
	public Class122(@OriginalArg(0) Interface8 arg0) {
		this.anInterface8_14 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static50.aBooleanArray8[local10]) {
				Static50.aBooleanArray8[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8823 = local8;
	}

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
	public abstract void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
	public final void method7209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7237(arg1, arg4, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public abstract void method7210(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public abstract void method7211(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIII)V")
	public final void method7213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.A(arg2, arg3, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "za", descriptor = "(IIIIII[BII)V")
	public abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public abstract void method7214();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
	public abstract boolean method7215();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method7216(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
	public abstract int method7217();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()Z")
	public abstract boolean method7218();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class205 method7219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ig;Z)Lclient!ha;")
	public abstract Class2 method7220(@OriginalArg(0) Class136 arg0);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
	public abstract boolean method7221();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7222(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIBII)V")
	public final void method7223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7282(arg0, arg4, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public final void method7224() {
		Static50.aBooleanArray8[this.anInt8823] = false;
		this.method7245();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method7225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7226(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)Lclient!rn;")
	public abstract Class45 method7227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "(III)V")
	public abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
	public abstract boolean method7228();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!u;)V")
	public abstract void method7229(@OriginalArg(0) Class1_Sub8 arg0);

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "(FF)V")
	public abstract void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!rn;)V")
	public abstract void method7230(@OriginalArg(0) Class45 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	public abstract void method7231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class40 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "(ILclient!pa;II)V")
	public abstract void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public abstract void method7232(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!rn;Lclient!rn;FLclient!rn;)Lclient!rn;")
	public abstract Class45 method7233(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class45 arg3);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	public abstract void method7234(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()V")
	public abstract void xa();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()V")
	public abstract void method7236() throws Exception_Sub1;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method7237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
	public abstract void method7238();

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public abstract void method7239(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
	public abstract boolean method7240();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	public abstract int method7241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "ta", descriptor = "(II)V")
	public abstract void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
	public abstract boolean method7242();

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(IIIII)V")
	public abstract void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()Z")
	public abstract boolean method7244();

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()V")
	protected abstract void method7245();

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
	public abstract int YA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!r;Lclient!kw;Lclient!m;Lclient!eca;I)V")
	public abstract void method7246(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2 arg3);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()V")
	public abstract void method7247();

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "(I)V")
	public abstract void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "(IIII)[I")
	public abstract int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	public abstract boolean method7248();

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7224();
	}

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIII)V")
	protected abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIII)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "CA", descriptor = "()I")
	public abstract int CA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!ww;")
	public abstract Class1_Sub2 method7249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!m;)V")
	public abstract void method7250(@OriginalArg(0) Class118 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!kw;)V")
	public abstract void method7251(@OriginalArg(0) Class175 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7252();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
	public abstract int c();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
	public abstract boolean method7254();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
	public abstract void n();

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
	public abstract boolean method7255();

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Lclient!m;")
	public abstract Class118 method7256();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!eca;I)V")
	public abstract void method7257(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class72_Sub2[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	public abstract boolean method7258();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method7259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.UA(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method7260(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	public abstract Class2 method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()Z")
	public abstract boolean method7262();

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)Lclient!u;")
	public abstract Class1_Sub8 method7263(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!ww;)V")
	public abstract void method7264(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2[] arg1);

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "(I)V")
	public abstract void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
	public final void method7265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.f(arg2, arg4, arg3, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
	public abstract boolean method7266();

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
	public abstract boolean method7267();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!ha;")
	public abstract Class2 method7268(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)V")
	public abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()V")
	public abstract void method7269();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "([I)V")
	public abstract void d(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(IFFFFF)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pe;[Lclient!ig;Z)Lclient!ra;")
	public abstract Class67 method7270(@OriginalArg(0) Class232 arg0, @OriginalArg(1) Class136[] arg1);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method7271(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public abstract void method7272(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	public abstract Class40 method7273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7274(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Lclient!m;")
	public abstract Class118 method7275();

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "()Lclient!qf;")
	public abstract Class246 method7276();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method7277(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7278(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	public abstract boolean method7279();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fp;IIII)Lclient!r;")
	public abstract Class145 method7280(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(III[I)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "(IIIIII)Z")
	public abstract boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(F)V")
	public abstract void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()V")
	public abstract void method7281();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIIII)V")
	public abstract void method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!kw;Lclient!m;[Lclient!eca;I)V")
	public abstract void method7283(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "()V")
	public abstract void method7284();

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(IIIIII)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public final void method7285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg2, arg3, arg1, arg0, 1);
	}
}
