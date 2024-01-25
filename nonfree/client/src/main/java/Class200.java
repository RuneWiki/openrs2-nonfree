import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class Class200 {

	@OriginalMember(owner = "client!za", name = "a", descriptor = "Lclient!l;")
	public final Interface8 anInterface8_134;

	@OriginalMember(owner = "client!za", name = "c", descriptor = "I")
	public final int anInt7330;

	@OriginalMember(owner = "client!za", name = "<init>", descriptor = "(ILclient!l;)V")
	public Class200(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		this.anInterface8_134 = arg1;
		this.anInt7330 = arg0;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "()Z")
	public abstract boolean method5812();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "()V")
	public abstract void method5813();

	@OriginalMember(owner = "client!za", name = "v", descriptor = "(III[I)V")
	public abstract void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIII)V")
	public final void method5815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ma(arg1, arg3, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!za", name = "c", descriptor = "()Z")
	public abstract boolean method5816();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I)Lclient!n;")
	public abstract Class5_Sub28 method5817(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "()V")
	public abstract void method5818();

	@OriginalMember(owner = "client!za", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
	public abstract void method5819(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(FFF)V")
	public abstract void method5820(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!za", name = "e", descriptor = "()Z")
	public abstract boolean method5821();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!n;)V")
	public abstract void method5822(@OriginalArg(0) Class5_Sub28 arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIII)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!bn;Lclient!bn;FLclient!bn;)Lclient!bn;")
	public abstract Class24 method5823(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class24 arg3);

	@OriginalMember(owner = "client!za", name = "r", descriptor = "()I")
	public abstract int r();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(BIIII)V")
	public final void method5824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.IA(arg3, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!za", name = "f", descriptor = "()Z")
	public abstract boolean method5825();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!bn;)V")
	public abstract void method5826(@OriginalArg(0) Class24 arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V")
	public final void method5827() {
		Static449.aBooleanArray27[this.anInt7330] = false;
		this.method5885();
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5828();

	@OriginalMember(owner = "client!za", name = "g", descriptor = "()V")
	public abstract void method5829();

	@OriginalMember(owner = "client!za", name = "ma", descriptor = "(IIIII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIII)V")
	public abstract void method5830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5831(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "K", descriptor = "(IIIIII[BII)V")
	public abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!za", name = "h", descriptor = "()Z")
	public abstract boolean method5832();

	@OriginalMember(owner = "client!za", name = "i", descriptor = "()Z")
	public abstract boolean method5833();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "j", descriptor = "()Z")
	public abstract boolean method5835();

	@OriginalMember(owner = "client!za", name = "T", descriptor = "()F")
	public abstract float T();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIII)V")
	public final void method5836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.ZA(arg1, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ap;[Lclient!rr;Z)Lclient!la;")
	public abstract Class23 method5837(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class214[] arg1);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V")
	public abstract void method5838(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "k", descriptor = "()Z")
	public abstract boolean method5839();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5840(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	public abstract Class125 method5841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!wg;I)V")
	public abstract void method5843(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) Class88_Sub8[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "l", descriptor = "()Z")
	public abstract boolean method5844();

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(I)V")
	public abstract void method5845(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I[Lclient!rd;)V")
	public abstract void method5846(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19[] arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	public abstract Class97 method5847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(I)V")
	public abstract void method5848(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIII)Lclient!o;")
	public abstract Class49 method5849(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!za", name = "P", descriptor = "(IIIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "da", descriptor = "(FF)V")
	public abstract void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!za", name = "m", descriptor = "()Z")
	public abstract boolean method5850();

	@OriginalMember(owner = "client!za", name = "AA", descriptor = "()I")
	public abstract int AA();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIII)Lclient!bn;")
	public abstract Class24 method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "o", descriptor = "()I")
	public abstract int method5852();

	@OriginalMember(owner = "client!za", name = "q", descriptor = "()Z")
	public abstract boolean method5853();

	@OriginalMember(owner = "client!za", name = "ba", descriptor = "(IIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "Q", descriptor = "(III)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!za", name = "e", descriptor = "(I)V")
	public abstract void method5854(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	public abstract Class49 method5855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(IIIIII)V")
	public final void method5856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.P(arg4, arg0, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IBIIII)V")
	public final void method5857(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5814(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIF)Lclient!rd;")
	public abstract Class5_Sub19 method5858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
	public abstract void method5859(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "MA", descriptor = "([I)V")
	public abstract void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!za", name = "ya", descriptor = "(I)V")
	public abstract void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
	public abstract int method5860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "IA", descriptor = "(IIIII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(IIIIII)V")
	public abstract void method5861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "s", descriptor = "()Z")
	public abstract boolean method5862();

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Z)V")
	public abstract void method5863(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "t", descriptor = "()Z")
	public abstract boolean method5864();

	@OriginalMember(owner = "client!za", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!za", name = "u", descriptor = "()Lclient!c;")
	public abstract Class29 method5866();

	@OriginalMember(owner = "client!za", name = "ra", descriptor = "(ILclient!ta;II)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "t", descriptor = "(I)V")
	public abstract void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5868(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "sa", descriptor = "(IIII)[I")
	public abstract int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!e;Lclient!vm;Lclient!c;Lclient!wg;I)V")
	public abstract void method5869(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) Class88_Sub8 arg3);

	@OriginalMember(owner = "client!za", name = "aa", descriptor = "()F")
	public abstract float aa();

	@OriginalMember(owner = "client!za", name = "s", descriptor = "(IIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	public abstract void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class97 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!rr;Z)Lclient!o;")
	public abstract Class49 method5871(@OriginalArg(0) Class214 arg0);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(II)V")
	public abstract void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "B", descriptor = "(IFFFFF)V")
	public abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "HA", descriptor = "(IIII)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!vm;)V")
	public abstract void method5872(@OriginalArg(0) Class255 arg0);

	@OriginalMember(owner = "client!za", name = "v", descriptor = "()Z")
	public abstract boolean method5873();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!vm;Lclient!c;[Lclient!wg;I)V")
	public abstract void method5874(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) Class88_Sub8[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "SA", descriptor = "(Lclient!c;)V")
	public abstract void SA(@OriginalArg(0) Class29 arg0);

	@OriginalMember(owner = "client!za", name = "n", descriptor = "()V")
	public abstract void n();

	@OriginalMember(owner = "client!za", name = "e", descriptor = "(IIIIII)V")
	public final void method5876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5861(arg3, arg1, arg2, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!za", name = "JA", descriptor = "(F)V")
	public abstract void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5877(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "VA", descriptor = "(IIIIII)Z")
	public abstract boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5878(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
	public abstract int method5879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5827();
	}

	@OriginalMember(owner = "client!za", name = "w", descriptor = "()Lclient!c;")
	public abstract Class29 method5880();

	@OriginalMember(owner = "client!za", name = "x", descriptor = "()V")
	public abstract void method5881();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!fe;IIII)Lclient!e;")
	public abstract Class57 method5882(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "y", descriptor = "()V")
	public abstract void method5883();

	@OriginalMember(owner = "client!za", name = "f", descriptor = "(I)V")
	public abstract void method5884(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "ZA", descriptor = "(IIIII)V")
	protected abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "z", descriptor = "()V")
	protected abstract void method5885();

	@OriginalMember(owner = "client!za", name = "A", descriptor = "()Z")
	public abstract boolean method5886();

	@OriginalMember(owner = "client!za", name = "B", descriptor = "()V")
	public abstract void method5887();

	@OriginalMember(owner = "client!za", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!za", name = "va", descriptor = "()V")
	public abstract void va();
}
