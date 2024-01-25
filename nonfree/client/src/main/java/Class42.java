import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public abstract class Class42 {

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "Lclient!n;")
	public final Interface11 anInterface11_11;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
	public final int anInt6927;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!n;)V")
	public Class42(@OriginalArg(0) Interface11 arg0) {
		this.anInterface11_11 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static146.aBooleanArray26[local10]) {
				local8 = local10;
				Static146.aBooleanArray26[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt6927 = local8;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5789(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)Lclient!sv;")
	public abstract Class124 method5790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5791(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "(IIIIII)Z")
	public abstract boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "za", descriptor = "(IIIIII[BII)V")
	public abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public abstract void method5792();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	public abstract void method5793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	public abstract void method5794();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
	public abstract void n();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class215 method5796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "ra", descriptor = "()F")
	public abstract float ra();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public abstract void method5797(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
	public abstract boolean method5798();

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "(I)V")
	public abstract void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5799(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
	protected abstract void method5800();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!sv;)V")
	public abstract void method5801(@OriginalArg(0) Class124 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method5803(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public abstract void method5804(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!sv;Lclient!sv;FLclient!sv;)Lclient!sv;")
	public abstract Class124 method5805(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class124 arg3);

	@OriginalMember(owner = "client!qa", name = "CA", descriptor = "()I")
	public abstract int CA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method5806(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public final void method5807() {
		Static146.aBooleanArray26[this.anInt6927] = false;
		this.method5800();
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
	public abstract boolean method5808();

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!qa", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!hp;Lclient!m;[Lclient!kn;I)V")
	public abstract void method5809(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()V")
	public abstract void method5810();

	@OriginalMember(owner = "client!qa", name = "ta", descriptor = "(II)V")
	public abstract void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	public final void method5811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5834(arg3, arg4, arg1, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ln;IIII)Lclient!r;")
	public abstract Class26 method5812(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
	public abstract boolean method5813();

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(F)V")
	public abstract void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!u;)V")
	public abstract void method5814(@OriginalArg(0) Class12_Sub36 arg0);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public abstract void method5815(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(IFFFFF)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
	public abstract void method5816();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	public abstract Class84 method5817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
	public abstract int c();

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "(I)V")
	public abstract void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
	public abstract boolean method5818();

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
	public abstract boolean method5819();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
	public abstract void method5821() throws Exception_Sub1;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)V")
	public abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method5822(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	public abstract boolean method5823();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!rh;)V")
	public abstract void method5824(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub7[] arg1);

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIII)V")
	protected abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()I")
	public abstract int method5825();

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIII)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method5827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.UA(arg3, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Lclient!la;")
	public abstract Class179 method5828();

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Lclient!m;")
	public abstract Class91 method5829();

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
	public abstract boolean method5830();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!rh;")
	public abstract Class12_Sub7 method5831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(IIIIII)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	public abstract Class145 method5832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
	public abstract boolean method5833();

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(III[I)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "()F")
	public abstract float P();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5835(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	public abstract boolean method5836();

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(IIIII)V")
	public abstract void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
	public abstract void method5837(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public final void method5838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.A(arg1, arg3, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!bt;Z)Lclient!ha;")
	public abstract Class84 method5839(@OriginalArg(0) Class40 arg0);

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "(FF)V")
	public abstract void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "(III)V")
	public abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIII)V")
	public final void method5840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg3, arg0, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
	public abstract void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()V")
	public abstract void method5841();

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
	public abstract boolean method5842();

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
	public abstract int YA();

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
	public abstract boolean method5843();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5844();

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()V")
	public abstract void method5845();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5846(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Lclient!m;")
	public abstract Class91 method5847();

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
	public abstract boolean method5848();

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	public abstract boolean method5849();

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "(ILclient!pa;II)V")
	public abstract void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!pu;[Lclient!bt;Z)Lclient!ra;")
	public abstract Class80 method5850(@OriginalArg(0) Class244 arg0, @OriginalArg(1) Class40[] arg1);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
	public abstract void method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "([I)V")
	public abstract void d(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5807();
	}

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()V")
	public abstract void xa();

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
	public abstract boolean method5853();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!m;)V")
	public abstract void method5855(@OriginalArg(0) Class91 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!hp;)V")
	public abstract void method5856(@OriginalArg(0) Class136 arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
	public abstract int method5857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Lclient!u;")
	public abstract Class12_Sub36 method5859(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!kn;I)V")
	public abstract void method5860(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class7_Sub4[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "(IIII)[I")
	public abstract int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public abstract void method5861(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!ha;")
	public abstract Class84 method5862(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Z)V")
	public abstract void method5863(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!r;Lclient!hp;Lclient!m;Lclient!kn;I)V")
	public abstract void method5864(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4 arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIZ)V")
	public final void method5865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5851(arg4, arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIB)V")
	public final void method5866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.f(arg4, arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "()Z")
	public abstract boolean method5867();
}
