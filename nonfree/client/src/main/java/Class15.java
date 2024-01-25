import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class15 {

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!e;")
	public final Interface4 anInterface4_11;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	public final int anInt6343;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!e;)V")
	public Class15(@OriginalArg(0) Interface4 arg0) {
		this.anInterface4_11 = arg0;
		@Pc(6) int local6 = -1;
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			if (!Static30.aBooleanArray1[local8]) {
				Static30.aBooleanArray1[local8] = true;
				local6 = local8;
				break;
			}
		}
		if (local6 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt6343 = local6;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!aw;Z)Lclient!xa;")
	public abstract Class37 method5275(@OriginalArg(0) Class20 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
	public abstract void method5276();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qu;)V")
	public abstract void method5277(@OriginalArg(0) Class274 arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Lclient!og;")
	public abstract Class242 method5278();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	public abstract boolean method5279();

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
	public abstract boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	public abstract boolean method5280();

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
	public abstract void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	public final void method5281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg3, arg0, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public abstract void method5282(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5337();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	public abstract boolean method5284();

	@OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
	public abstract void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
	public abstract void method5285();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5286(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	public final void method5287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5347(arg0, arg4, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()Z")
	public abstract boolean method5288();

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
	public abstract boolean method5289();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	public abstract Class37 method5290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method5291(@OriginalArg(0) Class255 arg0);

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()Z")
	public abstract boolean method5292();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lclient!i;)V")
	public abstract void method5293(@OriginalArg(0) Class3_Sub19 arg0);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Lclient!q;")
	public abstract Class255 method5294();

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()V")
	public abstract void method5295();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public abstract void method5296(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!qu;Lclient!q;[Lclient!ht;I)V")
	public abstract void method5297(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!kn;Lclient!kn;FLclient!kn;)Lclient!kn;")
	public abstract Class108 method5298(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class108 arg3);

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
	public abstract void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	public abstract void k();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5299();

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
	public abstract void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	public final void method5300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5334(arg2, arg4, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	public abstract boolean method5301();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
	public abstract void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!xa;Z)V")
	protected abstract void method5302(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
	public abstract void method5303();

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILclient!fa;II)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
	public abstract void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public abstract void method5304(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
	public abstract void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
	protected abstract void method5305();

	@OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZII)V")
	public final void method5306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.h(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	public abstract Class93 method5307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!xa;")
	public abstract Class37 method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ba;Lclient!qu;Lclient!q;Lclient!ht;I)V")
	public abstract void method5309(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
	public abstract int SA();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ht;I)V")
	public abstract void method5310(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class55_Sub3[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5311(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)Lclient!i;")
	public abstract Class3_Sub19 method5313(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
	public abstract boolean method5314();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public abstract int method5315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
	public abstract void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
	public final void method5316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ya(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public abstract void method5317(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	public abstract void method5318(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5319(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	public abstract int method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	public abstract boolean method5322();

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	public abstract boolean method5323();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lclient!xa;")
	public abstract Class37 method5324(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
	public abstract boolean method5325();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	public abstract void method5326(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	public abstract boolean method5327();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)Lclient!kn;")
	public abstract Class108 method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()I")
	public abstract int method5329();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	public abstract void method5330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!pn;")
	public abstract Class3_Sub28 method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
	public abstract boolean method5332();

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	public abstract boolean method5333();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
	public abstract void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
	public abstract boolean method5335();

	@OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	public abstract void method5336(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public final void method5337() {
		Static30.aBooleanArray1[this.anInt6343] = false;
		this.method5305();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5338(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
	public abstract void F();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!xa;I)V")
	public final void method5339(@OriginalArg(0) Class37 arg0) {
		this.method5302(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	public abstract void method5340(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
	public abstract int v();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBII)V")
	public final void method5341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.C(arg1, arg4, arg3, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
	public abstract void method5342();

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
	public abstract int aa();

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lclient!q;")
	public abstract Class255 method5343();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!kn;)V")
	public abstract void method5344(@OriginalArg(0) Class108 arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	public abstract void method5345(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!sga;[Lclient!aw;Z)Lclient!ta;")
	public abstract Class111 method5346(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class20[] arg1);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V")
	public abstract void method5347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5348(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()V")
	public abstract void method5349();

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "()V")
	public abstract void method5350();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	public abstract void method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class93 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!fca;IIII)Lclient!ba;")
	public abstract Class21 method5352(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
	public abstract int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
	protected abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!pn;)V")
	public abstract void method5353(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28[] arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class4 method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()V")
	public abstract void method5355() throws Exception_Sub1;
}
