import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class Class163 {

	@OriginalMember(owner = "client!za", name = "b", descriptor = "I")
	public final int anInt7061;

	@OriginalMember(owner = "client!za", name = "n", descriptor = "Lclient!l;")
	public final Interface9 anInterface9_12;

	@OriginalMember(owner = "client!za", name = "<init>", descriptor = "(ILclient!l;)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) Interface9 arg1) {
		this.anInt7061 = arg0;
		this.anInterface9_12 = arg1;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "()Z")
	public abstract boolean method5491();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "()Z")
	public abstract boolean method5492();

	@OriginalMember(owner = "client!za", name = "t", descriptor = "(I)V")
	public abstract void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
	public abstract void method5493(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "da", descriptor = "(FF)V")
	public abstract void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!za", name = "MA", descriptor = "([I)V")
	public abstract void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
	public abstract void method5495(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V")
	public abstract void method5496(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "()V")
	protected abstract void method5497();

	@OriginalMember(owner = "client!za", name = "d", descriptor = "()V")
	public abstract void method5498();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIII)Lclient!ks;")
	public abstract Class109 method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ZIIIII)V")
	public final void method5501(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5526(arg3, arg1, arg0, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!za", name = "HA", descriptor = "(IIII)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
	public abstract int method5502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "ma", descriptor = "(IIIII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!vk;)V")
	public abstract void method5503(@OriginalArg(0) Class256 arg0);

	@OriginalMember(owner = "client!za", name = "n", descriptor = "()V")
	public abstract void n();

	@OriginalMember(owner = "client!za", name = "JA", descriptor = "(F)V")
	public abstract void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!za", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(BIIIII)V")
	public final void method5504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5565(arg4, arg2, arg1, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!za", name = "e", descriptor = "()V")
	public abstract void method5505();

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(I)Lclient!n;")
	public abstract Class2_Sub6 method5506(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "f", descriptor = "()Z")
	public abstract boolean method5507();

	@OriginalMember(owner = "client!za", name = "g", descriptor = "()Z")
	public abstract boolean method5508();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!rr;I)V")
	public abstract void method5509(@OriginalArg(0) Class59[] arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class21_Sub7[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "ya", descriptor = "(I)V")
	public abstract void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(I)V")
	public abstract void method5510(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "h", descriptor = "()V")
	public abstract void method5511();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	public abstract Class13 method5513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
	public abstract int method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5515(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "i", descriptor = "()Z")
	public abstract boolean method5516();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(FFF)V")
	public abstract void method5517(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!za", name = "AA", descriptor = "()I")
	public abstract int AA();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5518(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "VA", descriptor = "(IIIIII)Z")
	public abstract boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5519(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "s", descriptor = "(IIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(II)V")
	public abstract void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5554();
	}

	@OriginalMember(owner = "client!za", name = "j", descriptor = "()V")
	public abstract void method5520();

	@OriginalMember(owner = "client!za", name = "k", descriptor = "()Z")
	public abstract boolean method5521();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIII)Lclient!o;")
	public abstract Class13 method5522(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5523();

	@OriginalMember(owner = "client!za", name = "l", descriptor = "()Z")
	public abstract boolean method5524();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ks;Lclient!ks;FLclient!ks;)Lclient!ks;")
	public abstract Class109 method5525(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class109 arg3);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIII)V")
	public abstract void method5526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "ra", descriptor = "(ILclient!ta;II)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "m", descriptor = "()Z")
	public abstract boolean method5528();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIII)V")
	public abstract void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!qq;IIII)Lclient!e;")
	public abstract Class59 method5530(@OriginalArg(0) Class205 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
	public abstract void method5531(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIII)V")
	public final void method5532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ZA(arg1, arg3, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!n;)V")
	public abstract void method5533(@OriginalArg(0) Class2_Sub6 arg0);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Z)V")
	public abstract void method5534(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5535(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I[Lclient!sa;)V")
	public abstract void method5536(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub29[] arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIII)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!kt;[Lclient!au;Z)Lclient!la;")
	public abstract Class92 method5537(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class17[] arg1);

	@OriginalMember(owner = "client!za", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!za", name = "o", descriptor = "()Z")
	public abstract boolean method5538();

	@OriginalMember(owner = "client!za", name = "q", descriptor = "()Lclient!c;")
	public abstract Class31 method5539();

	@OriginalMember(owner = "client!za", name = "K", descriptor = "(IIIIII[BII)V")
	public abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!za", name = "s", descriptor = "()Z")
	public abstract boolean method5541();

	@OriginalMember(owner = "client!za", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIF)Lclient!sa;")
	public abstract Class2_Sub29 method5542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(BIIII)V")
	public final void method5543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ma(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!za", name = "t", descriptor = "()Z")
	public abstract boolean method5544();

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(IIIIII)V")
	public final void method5545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.P(arg4, arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	public abstract void method5546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class35 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!za", name = "f", descriptor = "(I)V")
	public abstract void method5547(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "aa", descriptor = "()F")
	public abstract float aa();

	@OriginalMember(owner = "client!za", name = "u", descriptor = "()Z")
	public abstract boolean method5548();

	@OriginalMember(owner = "client!za", name = "ba", descriptor = "(IIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!au;Z)Lclient!o;")
	public abstract Class13 method5549(@OriginalArg(0) Class17 arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	public abstract Class35 method5550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!e;Lclient!vk;Lclient!c;Lclient!rr;I)V")
	public abstract void method5551(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class21_Sub7 arg3);

	@OriginalMember(owner = "client!za", name = "v", descriptor = "()Z")
	public abstract boolean method5552();

	@OriginalMember(owner = "client!za", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "w", descriptor = "()I")
	public abstract int method5553();

	@OriginalMember(owner = "client!za", name = "va", descriptor = "()V")
	public abstract void va();

	@OriginalMember(owner = "client!za", name = "g", descriptor = "(I)V")
	public final void method5554() {
		Static335.aBooleanArray24[this.anInt7061] = false;
		this.method5497();
	}

	@OriginalMember(owner = "client!za", name = "x", descriptor = "()Z")
	public abstract boolean method5555();

	@OriginalMember(owner = "client!za", name = "IA", descriptor = "(IIIII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "B", descriptor = "(IFFFFF)V")
	public abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "v", descriptor = "(III[I)V")
	public abstract void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!vk;Lclient!c;[Lclient!rr;I)V")
	public abstract void method5556(@OriginalArg(0) Class59[] arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class21_Sub7[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	public abstract Class162 method5557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIB)V")
	public final void method5558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.IA(arg0, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!za", name = "T", descriptor = "()F")
	public abstract float T();

	@OriginalMember(owner = "client!za", name = "y", descriptor = "()V")
	public abstract void method5559();

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5560(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "ZA", descriptor = "(IIIII)V")
	protected abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "sa", descriptor = "(IIII)[I")
	public abstract int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ks;)V")
	public abstract void method5561(@OriginalArg(0) Class109 arg0);

	@OriginalMember(owner = "client!za", name = "SA", descriptor = "(Lclient!c;)V")
	public abstract void SA(@OriginalArg(0) Class31 arg0);

	@OriginalMember(owner = "client!za", name = "z", descriptor = "()V")
	public abstract void method5562();

	@OriginalMember(owner = "client!za", name = "A", descriptor = "()Z")
	public abstract boolean method5563();

	@OriginalMember(owner = "client!za", name = "h", descriptor = "(I)V")
	public abstract void method5564(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "r", descriptor = "()I")
	public abstract int r();

	@OriginalMember(owner = "client!za", name = "P", descriptor = "(IIIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(IIIIII)V")
	public abstract void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "B", descriptor = "()Lclient!c;")
	public abstract Class31 method5566();

	@OriginalMember(owner = "client!za", name = "Q", descriptor = "(III)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
