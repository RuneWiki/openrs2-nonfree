import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class Class117 {

	@OriginalMember(owner = "client!za", name = "n", descriptor = "Lclient!l;")
	public final Interface4 anInterface4_10;

	@OriginalMember(owner = "client!za", name = "e", descriptor = "I")
	public final int anInt7048;

	@OriginalMember(owner = "client!za", name = "<init>", descriptor = "(ILclient!l;)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_10 = arg1;
		this.anInt7048 = arg0;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "()Z")
	public abstract boolean method5655();

	@OriginalMember(owner = "client!za", name = "T", descriptor = "()F")
	public abstract float T();

	@OriginalMember(owner = "client!za", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIII)V")
	public final void method5656(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.IA(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	public abstract Class139 method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIII)V")
	public final void method5658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ma(arg0, arg3, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!e;Lclient!sj;Lclient!c;Lclient!wp;I)V")
	public abstract void method5659(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class111_Sub8 arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!n;)V")
	public abstract void method5660(@OriginalArg(0) Class1_Sub4 arg0);

	@OriginalMember(owner = "client!za", name = "AA", descriptor = "()I")
	public abstract int AA();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ud;)V")
	public abstract void method5661(@OriginalArg(0) Class59 arg0);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "()Z")
	public abstract boolean method5662();

	@OriginalMember(owner = "client!za", name = "c", descriptor = "()V")
	protected abstract void method5663();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIII)V")
	public final void method5664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.P(arg4, arg1, arg0, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!za", name = "d", descriptor = "()V")
	public abstract void method5665();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IBIIII)V")
	public final void method5666(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5690(arg4, arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!za", name = "e", descriptor = "()Z")
	public abstract boolean method5667();

	@OriginalMember(owner = "client!za", name = "v", descriptor = "(III[I)V")
	public abstract void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "ZA", descriptor = "(IIIII)V")
	protected abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
	public abstract void method5670(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "r", descriptor = "()I")
	public abstract int r();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(FFF)V")
	public abstract void method5671(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!za", name = "f", descriptor = "()V")
	public abstract void method5672();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!sj;Lclient!c;[Lclient!wp;I)V")
	public abstract void method5673(@OriginalArg(0) Class8[] arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class111_Sub8[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
	public abstract void method5674(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(ZIIIII)V")
	public final void method5675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5729(arg1, arg2, arg3, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	public abstract void method5676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
	public abstract void method5677(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ld;IIII)Lclient!e;")
	public abstract Class8 method5678(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "g", descriptor = "()V")
	public abstract void method5679();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ul;[Lclient!dd;Z)Lclient!la;")
	public abstract Class137 method5680(@OriginalArg(0) Class252 arg0, @OriginalArg(1) Class52[] arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIII)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIBII)V")
	public final void method5682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ZA(arg2, arg1, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!za", name = "MA", descriptor = "([I)V")
	public abstract void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5683(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V")
	public abstract void method5684(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!za", name = "h", descriptor = "()Lclient!c;")
	public abstract Class34 method5685();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5686(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "JA", descriptor = "(F)V")
	public abstract void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIII)V")
	public abstract void method5687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5688(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "K", descriptor = "(IIIIII[BII)V")
	public abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!za", name = "i", descriptor = "()Z")
	public abstract boolean method5689();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIII)V")
	public abstract void method5690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "Q", descriptor = "(III)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!za", name = "j", descriptor = "()Z")
	public abstract boolean method5691();

	@OriginalMember(owner = "client!za", name = "k", descriptor = "()Z")
	public abstract boolean method5692();

	@OriginalMember(owner = "client!za", name = "IA", descriptor = "(IIIII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I[Lclient!ls;)V")
	public abstract void method5693(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub29[] arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5694(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
	public abstract int method5696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "ra", descriptor = "(ILclient!ta;II)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "l", descriptor = "()Z")
	public abstract boolean method5697();

	@OriginalMember(owner = "client!za", name = "m", descriptor = "()V")
	public abstract void method5698();

	@OriginalMember(owner = "client!za", name = "s", descriptor = "(IIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!sj;)V")
	public abstract void method5699(@OriginalArg(0) Class232 arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIII)Lclient!o;")
	public abstract Class85 method5700(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(I)V")
	public final void method5701() {
		Static269.aBooleanArray105[this.anInt7048] = false;
		this.method5663();
	}

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Z)V")
	public abstract void method5702(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5703(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(I)V")
	public abstract void method5704(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "ma", descriptor = "(IIIII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!za", name = "VA", descriptor = "(IIIIII)Z")
	public abstract boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "o", descriptor = "()Z")
	public abstract boolean method5706();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!dd;Z)Lclient!o;")
	public abstract Class85 method5707(@OriginalArg(0) Class52 arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	public abstract Class85 method5709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!za", name = "q", descriptor = "()I")
	public abstract int method5710();

	@OriginalMember(owner = "client!za", name = "s", descriptor = "()Z")
	public abstract boolean method5711();

	@OriginalMember(owner = "client!za", name = "t", descriptor = "()Z")
	public abstract boolean method5712();

	@OriginalMember(owner = "client!za", name = "t", descriptor = "(I)V")
	public abstract void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "u", descriptor = "()Z")
	public abstract boolean method5713();

	@OriginalMember(owner = "client!za", name = "v", descriptor = "()Z")
	public abstract boolean method5714();

	@OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5701();
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	public abstract Class73 method5716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "n", descriptor = "()V")
	public abstract void n();

	@OriginalMember(owner = "client!za", name = "B", descriptor = "(IFFFFF)V")
	public abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "P", descriptor = "(IIIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "w", descriptor = "()Lclient!c;")
	public abstract Class34 method5717();

	@OriginalMember(owner = "client!za", name = "f", descriptor = "(I)V")
	public abstract void method5718(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIF)Lclient!ls;")
	public abstract Class1_Sub29 method5719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ud;Lclient!ud;FLclient!ud;)Lclient!ud;")
	public abstract Class59 method5720(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class59 arg3);

	@OriginalMember(owner = "client!za", name = "x", descriptor = "()Z")
	public abstract boolean method5721();

	@OriginalMember(owner = "client!za", name = "g", descriptor = "(I)V")
	public abstract void method5722(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!wp;I)V")
	public abstract void method5723(@OriginalArg(0) Class8[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class111_Sub8[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "ba", descriptor = "(IIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(IIIIII)Lclient!ud;")
	public abstract Class59 method5724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "y", descriptor = "()Z")
	public abstract boolean method5725();

	@OriginalMember(owner = "client!za", name = "h", descriptor = "(I)Lclient!n;")
	public abstract Class1_Sub4 method5726(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5727();

	@OriginalMember(owner = "client!za", name = "z", descriptor = "()Z")
	public abstract boolean method5728();

	@OriginalMember(owner = "client!za", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!za", name = "va", descriptor = "()V")
	public abstract void va();

	@OriginalMember(owner = "client!za", name = "SA", descriptor = "(Lclient!c;)V")
	public abstract void SA(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(II)V")
	public abstract void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(IIIIII)V")
	public abstract void method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "A", descriptor = "()V")
	public abstract void method5730();

	@OriginalMember(owner = "client!za", name = "HA", descriptor = "(IIII)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "aa", descriptor = "()F")
	public abstract float aa();

	@OriginalMember(owner = "client!za", name = "B", descriptor = "()V")
	public abstract void method5731();

	@OriginalMember(owner = "client!za", name = "sa", descriptor = "(IIII)[I")
	public abstract int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "ya", descriptor = "(I)V")
	public abstract void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "da", descriptor = "(FF)V")
	public abstract void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
	public abstract int method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
