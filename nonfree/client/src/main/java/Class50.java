import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class Class50 {

	@OriginalMember(owner = "client!za", name = "k", descriptor = "I")
	public final int anInt7375;

	@OriginalMember(owner = "client!za", name = "h", descriptor = "Lclient!l;")
	public final Interface7 anInterface7_8;

	static {
		new Class182("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!za", name = "<init>", descriptor = "(ILclient!l;)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInt7375 = arg0;
		this.anInterface7_8 = arg1;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "()Z")
	public abstract boolean method5808();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "()Z")
	public abstract boolean method5810();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5812();

	@OriginalMember(owner = "client!za", name = "c", descriptor = "()Z")
	public abstract boolean method5813();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(FFF)V")
	public abstract void method5814(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!za", name = "ya", descriptor = "(I)V")
	public abstract void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "va", descriptor = "()V")
	public abstract void va();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V")
	public final void method5815() {
		Static407.aBooleanArray20[this.anInt7375] = false;
		this.method5841();
	}

	@OriginalMember(owner = "client!za", name = "ra", descriptor = "(ILclient!ta;II)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	public abstract Class154 method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
	public abstract void method5817(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V")
	public abstract void method5818(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "()Lclient!c;")
	public abstract Class34 method5819();

	@OriginalMember(owner = "client!za", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIB)V")
	public final void method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.ZA(arg2, arg3, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!za", name = "r", descriptor = "()I")
	public abstract int r();

	@OriginalMember(owner = "client!za", name = "e", descriptor = "()V")
	public abstract void method5821();

	@OriginalMember(owner = "client!za", name = "K", descriptor = "(IIIIII[BII)V")
	public abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
	public abstract int method5822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIII)Lclient!o;")
	public abstract Class80 method5823(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!za", name = "JA", descriptor = "(F)V")
	public abstract void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!za", name = "f", descriptor = "()Z")
	public abstract boolean method5824();

	@OriginalMember(owner = "client!za", name = "t", descriptor = "(I)V")
	public abstract void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5825(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(I)V")
	public abstract void method5826(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5827(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "g", descriptor = "()V")
	public abstract void method5828();

	@OriginalMember(owner = "client!za", name = "h", descriptor = "()Lclient!c;")
	public abstract Class34 method5829();

	@OriginalMember(owner = "client!za", name = "i", descriptor = "()Z")
	public abstract boolean method5830();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIII)V")
	public final void method5831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.IA(arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!za", name = "v", descriptor = "(III[I)V")
	public abstract void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(I)V")
	public abstract void method5832(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIII)V")
	public final void method5834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5811(arg1, arg4, arg0, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!za", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!qg;)V")
	public abstract void method5835(@OriginalArg(0) Class30 arg0);

	@OriginalMember(owner = "client!za", name = "ma", descriptor = "(IIIII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "P", descriptor = "(IIIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "T", descriptor = "()F")
	public abstract float T();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
	public abstract void method5837(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	public abstract Class80 method5838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!za", name = "j", descriptor = "()Z")
	public abstract boolean method5839();

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(IIIIII)V")
	public final void method5840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5874(arg0, arg2, arg3, arg1, arg4, 1);
	}

	@OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5815();
	}

	@OriginalMember(owner = "client!za", name = "k", descriptor = "()V")
	protected abstract void method5841();

	@OriginalMember(owner = "client!za", name = "ba", descriptor = "(IIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "e", descriptor = "(I)V")
	public abstract void method5842(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "l", descriptor = "()Z")
	public abstract boolean method5843();

	@OriginalMember(owner = "client!za", name = "m", descriptor = "()V")
	public abstract void method5844();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!e;Lclient!ip;Lclient!c;Lclient!pr;I)V")
	public abstract void method5845(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class40_Sub8 arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!fj;[Lclient!ef;Z)Lclient!la;")
	public abstract Class57 method5846(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class66[] arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!qg;Lclient!qg;FLclient!qg;)Lclient!qg;")
	public abstract Class30 method5847(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class30 arg3);

	@OriginalMember(owner = "client!za", name = "o", descriptor = "()V")
	public abstract void method5848();

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(IIII)V")
	public abstract void method5849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "ZA", descriptor = "(IIIII)V")
	protected abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "q", descriptor = "()Z")
	public abstract boolean method5850();

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(IIIIII)Lclient!qg;")
	public abstract Class30 method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "B", descriptor = "(IFFFFF)V")
	public abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "Q", descriptor = "(III)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!za", name = "f", descriptor = "(I)Lclient!n;")
	public abstract Class10_Sub29 method5852(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "e", descriptor = "(IIIIII)V")
	public final void method5853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.P(arg1, arg0, arg4, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!za", name = "s", descriptor = "()I")
	public abstract int method5854();

	@OriginalMember(owner = "client!za", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!za", name = "sa", descriptor = "(IIII)[I")
	public abstract int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ip;)V")
	public abstract void method5855(@OriginalArg(0) Class121 arg0);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
	public abstract int method5856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "AA", descriptor = "()I")
	public abstract int AA();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	public abstract void method5857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class49 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!za", name = "IA", descriptor = "(IIIII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!pr;I)V")
	public abstract void method5858(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class40_Sub8[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "t", descriptor = "()Z")
	public abstract boolean method5859();

	@OriginalMember(owner = "client!za", name = "aa", descriptor = "()F")
	public abstract float aa();

	@OriginalMember(owner = "client!za", name = "u", descriptor = "()Z")
	public abstract boolean method5860();

	@OriginalMember(owner = "client!za", name = "VA", descriptor = "(IIIIII)Z")
	public abstract boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ef;Z)Lclient!o;")
	public abstract Class80 method5861(@OriginalArg(0) Class66 arg0);

	@OriginalMember(owner = "client!za", name = "v", descriptor = "()V")
	public abstract void method5862();

	@OriginalMember(owner = "client!za", name = "HA", descriptor = "(IIII)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	public abstract Class49 method5863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIII)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!pn;IIII)Lclient!e;")
	public abstract Class63 method5864(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5865(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
	public abstract void method5866(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "SA", descriptor = "(Lclient!c;)V")
	public abstract void SA(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!za", name = "s", descriptor = "(IIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "n", descriptor = "()V")
	public abstract void n();

	@OriginalMember(owner = "client!za", name = "w", descriptor = "()Z")
	public abstract boolean method5867();

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Z)V")
	public abstract void method5868(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I[Lclient!bk;)V")
	public abstract void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub4[] arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIBII)V")
	public final void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ma(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!za", name = "MA", descriptor = "([I)V")
	public abstract void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5871(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "da", descriptor = "(FF)V")
	public abstract void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIF)Lclient!bk;")
	public abstract Class10_Sub4 method5872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(II)V")
	public abstract void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!ip;Lclient!c;[Lclient!pr;I)V")
	public abstract void method5873(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class40_Sub8[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "f", descriptor = "(IIIIII)V")
	public abstract void method5874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "x", descriptor = "()Z")
	public abstract boolean method5875();

	@OriginalMember(owner = "client!za", name = "y", descriptor = "()Z")
	public abstract boolean method5876();

	@OriginalMember(owner = "client!za", name = "z", descriptor = "()V")
	public abstract void method5877();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!n;)V")
	public abstract void method5879(@OriginalArg(0) Class10_Sub29 arg0);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5880(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "A", descriptor = "()Z")
	public abstract boolean method5881();

	@OriginalMember(owner = "client!za", name = "B", descriptor = "()Z")
	public abstract boolean method5882();
}
