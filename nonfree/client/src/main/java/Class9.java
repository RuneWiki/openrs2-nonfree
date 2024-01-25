import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class9 {

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!e;")
	public final Interface2 anInterface2_11;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	public final int anInt6348;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!e;)V")
	public Class9(@OriginalArg(0) Interface2 arg0) {
		this.anInterface2_11 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static342.aBooleanArray23[local10]) {
				Static342.aBooleanArray23[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt6348 = local8;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public final void method5390() {
		Static342.aBooleanArray23[this.anInt6348] = false;
		this.method5418();
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
	public abstract int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dga;)V")
	public abstract void method5391(@OriginalArg(0) Class65 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public abstract void method5392(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ed;[Lclient!aaa;Z)Lclient!ta;")
	public abstract Class73 method5393(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class1[] arg1);

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
	public abstract int aa();

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
	public abstract void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public abstract void method5394(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
	public abstract boolean method5395();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5396();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIB)V")
	public final void method5397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.e(arg3, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	public abstract boolean method5398();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!od;)V")
	public abstract void method5401(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub29[] arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dga;Lclient!dga;FLclient!dga;)Lclient!dga;")
	public abstract Class65 method5402(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class65 arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5403(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5390();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qda;IIII)Lclient!ba;")
	public abstract Class23 method5404(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
	public abstract void method5406();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
	public abstract boolean method5407();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!mr;I)V")
	public abstract void method5408(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) Class5_Sub4[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	public final void method5409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.C(arg4, arg3, arg1, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
	public abstract void F();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5410(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
	public abstract boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
	public abstract void method5411() throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
	public abstract void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!aaa;Z)Lclient!xa;")
	public abstract Class66 method5412(@OriginalArg(0) Class1 arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	public abstract void method5413(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
	public abstract boolean method5414();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class62 method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public abstract int method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()Lclient!q;")
	public abstract Class8 method5417();

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
	protected abstract void method5418();

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()V")
	public abstract void method5419();

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
	public abstract void method5420();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)Lclient!i;")
	public abstract Class6_Sub25 method5421(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	public abstract boolean method5422();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lclient!xa;")
	public abstract Class66 method5423(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!od;")
	public abstract Class6_Sub29 method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	public final void method5425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.h(arg0, arg3, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public abstract void method5426(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()I")
	public abstract int method5427();

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
	public abstract void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
	public abstract void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5428(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	public abstract void k();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method5429(@OriginalArg(0) Class8 arg0);

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
	public abstract void method5430();

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	public abstract boolean method5431();

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Z)V")
	public abstract void method5432(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!tg;)V")
	public abstract void method5433(@OriginalArg(0) Class299 arg0);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
	protected abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	public final void method5434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5450(arg2, arg4, arg1, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Lclient!hl;")
	public abstract Class138 method5435();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method5436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	public abstract boolean method5437();

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	public abstract void method5438(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	public abstract boolean method5439();

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
	public abstract void method5441();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)Lclient!dga;")
	public abstract Class65 method5442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	public abstract void method5443(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
	public abstract void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBIIII)V")
	public final void method5444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5436(arg3, arg0, arg2, arg4, arg1, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!tg;Lclient!q;[Lclient!mr;I)V")
	public abstract void method5445(@OriginalArg(0) Class23[] arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Lclient!q;")
	public abstract Class8 method5446();

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	public abstract boolean method5447();

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
	public abstract void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5448(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
	public abstract boolean method5449();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V")
	public abstract void method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lclient!i;)V")
	public abstract void method5451(@OriginalArg(0) Class6_Sub25 arg0);

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	public abstract boolean method5452();

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
	public abstract boolean method5453();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	public abstract Class66 method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(Z)V")
	public abstract void method5455(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	public abstract void method5456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class19 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ba;Lclient!tg;Lclient!q;Lclient!mr;I)V")
	public abstract void method5457(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) Class5_Sub4 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILclient!fa;II)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
	public abstract boolean method5458();

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	public abstract void method5459(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	public abstract Class19 method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
	public abstract int v();

	@OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Z")
	public abstract boolean method5462();

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()V")
	public abstract void method5463();

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
	public abstract void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "()Z")
	public abstract boolean method5464();

	@OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
	public abstract void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
	public abstract int SA();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5465(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	public abstract void method5466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
	public final void method5467(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ya(arg1, arg2, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	public abstract int method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
