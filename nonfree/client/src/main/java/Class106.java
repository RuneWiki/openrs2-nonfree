import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class Class106 {

	@OriginalMember(owner = "client!za", name = "c", descriptor = "I")
	public final int anInt7745;

	@OriginalMember(owner = "client!za", name = "r", descriptor = "Lclient!l;")
	public final Interface7 anInterface7_10;

	static {
		new Class158("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!za", name = "<init>", descriptor = "(ILclient!l;)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInt7745 = arg0;
		this.anInterface7_10 = arg1;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "()V")
	protected abstract void method5906();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "()Z")
	public abstract boolean method5907();

	@OriginalMember(owner = "client!za", name = "sa", descriptor = "(IIII)[I")
	public abstract int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!d;)V")
	public abstract void method5908(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIII)V")
	public final void method5909(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ZA(arg3, arg0, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!za", name = "ra", descriptor = "(ILclient!ta;II)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "()Z")
	public abstract boolean method5910();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
	public abstract void method5911(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "()Z")
	public abstract boolean method5912();

	@OriginalMember(owner = "client!za", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
	public abstract int method5913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5914();

	@OriginalMember(owner = "client!za", name = "t", descriptor = "(I)V")
	public abstract void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V")
	public abstract void method5915(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIII)V")
	public final void method5916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5958(arg4, arg3, arg0, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(FFF)V")
	public abstract void method5917(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!za", name = "MA", descriptor = "([I)V")
	public abstract void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!za", name = "e", descriptor = "()Lclient!c;")
	public abstract Class40 method5918();

	@OriginalMember(owner = "client!za", name = "n", descriptor = "()V")
	public abstract void n();

	@OriginalMember(owner = "client!za", name = "K", descriptor = "(IIIIII[BII)V")
	public abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5920(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIII)V")
	public abstract void method5921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ko;IIII)Lclient!e;")
	public abstract Class17 method5922(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIII)V")
	public abstract void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIF)Lclient!ja;")
	public abstract Class1_Sub4 method5924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "f", descriptor = "()Z")
	public abstract boolean method5925();

	@OriginalMember(owner = "client!za", name = "B", descriptor = "(IFFFFF)V")
	public abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "g", descriptor = "()V")
	public abstract void method5926();

	@OriginalMember(owner = "client!za", name = "h", descriptor = "()Z")
	public abstract boolean method5927();

	@OriginalMember(owner = "client!za", name = "i", descriptor = "()I")
	public abstract int method5928();

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(IIIIII)Lclient!ug;")
	public abstract Class86 method5929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "j", descriptor = "()Z")
	public abstract boolean method5930();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	public abstract Class137 method5931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5966();
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	public abstract void method5933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class24 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!za", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5934(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "va", descriptor = "()V")
	public abstract void va();

	@OriginalMember(owner = "client!za", name = "k", descriptor = "()V")
	public abstract void method5935();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIII)V")
	public final void method5936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.IA(arg1, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!wh;Z)Lclient!o;")
	public abstract Class137 method5938(@OriginalArg(0) Class266 arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	public abstract Class24 method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(I)Lclient!n;")
	public abstract Class1_Sub11 method5940(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IBIIII)V")
	public final void method5941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.P(arg2, arg0, arg1, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!za", name = "ZA", descriptor = "(IIIII)V")
	protected abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "l", descriptor = "()Z")
	public abstract boolean method5942();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!tq;I)V")
	public abstract void method5943(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class41_Sub8[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "T", descriptor = "()F")
	public abstract float T();

	@OriginalMember(owner = "client!za", name = "m", descriptor = "()Lclient!c;")
	public abstract Class40 method5944();

	@OriginalMember(owner = "client!za", name = "o", descriptor = "()Z")
	public abstract boolean method5945();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5946(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!d;Lclient!c;[Lclient!tq;I)V")
	public abstract void method5947(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class41_Sub8[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "q", descriptor = "()Z")
	public abstract boolean method5949();

	@OriginalMember(owner = "client!za", name = "r", descriptor = "()I")
	public abstract int r();

	@OriginalMember(owner = "client!za", name = "VA", descriptor = "(IIIIII)Z")
	public abstract boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "s", descriptor = "()V")
	public abstract void method5950();

	@OriginalMember(owner = "client!za", name = "ya", descriptor = "(I)V")
	public abstract void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIBI)V")
	public final void method5951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.ma(arg2, arg3, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!e;Lclient!d;Lclient!c;Lclient!tq;I)V")
	public abstract void method5952(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class41_Sub8 arg3);

	@OriginalMember(owner = "client!za", name = "aa", descriptor = "()F")
	public abstract float aa();

	@OriginalMember(owner = "client!za", name = "t", descriptor = "()Z")
	public abstract boolean method5953();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
	public abstract int method5954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "da", descriptor = "(FF)V")
	public abstract void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!za", name = "ma", descriptor = "(IIIII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
	public abstract void method5955(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I[Lclient!ja;)V")
	public abstract void method5956(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub4[] arg1);

	@OriginalMember(owner = "client!za", name = "ba", descriptor = "(IIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "JA", descriptor = "(F)V")
	public abstract void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!za", name = "e", descriptor = "(I)V")
	public abstract void method5957(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(IIIIII)V")
	public abstract void method5958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5959(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "u", descriptor = "()Z")
	public abstract boolean method5960();

	@OriginalMember(owner = "client!za", name = "v", descriptor = "()V")
	public abstract void method5961();

	@OriginalMember(owner = "client!za", name = "w", descriptor = "()Z")
	public abstract boolean method5963();

	@OriginalMember(owner = "client!za", name = "x", descriptor = "()V")
	public abstract void method5964();

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5965(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V")
	public final void method5966() {
		Static423.aBooleanArray25[this.anInt7745] = false;
		this.method5906();
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ug;)V")
	public abstract void method5967(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!za", name = "HA", descriptor = "(IIII)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!qm;[Lclient!wh;Z)Lclient!la;")
	public abstract Class20 method5968(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class266[] arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIII)Lclient!o;")
	public abstract Class137 method5969(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!za", name = "s", descriptor = "(IIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!n;)V")
	public abstract void method5970(@OriginalArg(0) Class1_Sub11 arg0);

	@OriginalMember(owner = "client!za", name = "Q", descriptor = "(III)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!za", name = "IA", descriptor = "(IIIII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
	public abstract void method5971(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ug;Lclient!ug;FLclient!ug;)Lclient!ug;")
	public abstract Class86 method5972(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class86 arg3);

	@OriginalMember(owner = "client!za", name = "y", descriptor = "()Z")
	public abstract boolean method5973();

	@OriginalMember(owner = "client!za", name = "z", descriptor = "()Z")
	public abstract boolean method5975();

	@OriginalMember(owner = "client!za", name = "v", descriptor = "(III[I)V")
	public abstract void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "f", descriptor = "(I)V")
	public abstract void method5976(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "A", descriptor = "()V")
	public abstract void method5977();

	@OriginalMember(owner = "client!za", name = "g", descriptor = "(I)V")
	public abstract void method5978(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIII)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(II)V")
	public abstract void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	public abstract Class96 method5979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!za", name = "B", descriptor = "()Z")
	public abstract boolean method5980();

	@OriginalMember(owner = "client!za", name = "AA", descriptor = "()I")
	public abstract int AA();

	@OriginalMember(owner = "client!za", name = "P", descriptor = "(IIIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "e", descriptor = "(IIIIII)V")
	public final void method5981(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5923(arg4, arg1, arg2, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Z)V")
	public abstract void method5982(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "SA", descriptor = "(Lclient!c;)V")
	public abstract void SA(@OriginalArg(0) Class40 arg0);
}
