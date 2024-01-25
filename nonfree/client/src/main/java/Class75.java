import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class Class75 {

	@OriginalMember(owner = "client!za", name = "a", descriptor = "I")
	public final int anInt7407;

	@OriginalMember(owner = "client!za", name = "i", descriptor = "Lclient!l;")
	public final Interface7 anInterface7_8;

	@OriginalMember(owner = "client!za", name = "<init>", descriptor = "(ILclient!l;)V")
	public Class75(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInt7407 = arg0;
		this.anInterface7_8 = arg1;
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "()Z")
	public abstract boolean method5947();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "()Z")
	public abstract boolean method5948();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V")
	public abstract void method5949(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5950();

	@OriginalMember(owner = "client!za", name = "c", descriptor = "()Z")
	public abstract boolean method5951();

	@OriginalMember(owner = "client!za", name = "d", descriptor = "()Z")
	public abstract boolean method5952();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V")
	public abstract void method5953(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "HA", descriptor = "(IIII)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "P", descriptor = "(IIIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(I)V")
	public abstract void method5954(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(I)Lclient!n;")
	public abstract Class2_Sub7 method5955(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5956(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!dm;)V")
	public abstract void method5957(@OriginalArg(0) Class56 arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!mt;)V")
	public abstract void method5958(@OriginalArg(0) Class141 arg0);

	@OriginalMember(owner = "client!za", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5989();
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	public abstract void method5959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class102 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!e;Lclient!dm;Lclient!c;Lclient!kk;I)V")
	public abstract void method5960(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class28_Sub4 arg3);

	@OriginalMember(owner = "client!za", name = "ra", descriptor = "(ILclient!ta;II)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "e", descriptor = "()Z")
	public abstract boolean method5961();

	@OriginalMember(owner = "client!za", name = "t", descriptor = "(I)V")
	public abstract void t(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIII)V")
	public abstract void method5962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIII)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "f", descriptor = "()V")
	public abstract void method5963();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5964(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!dm;Lclient!c;[Lclient!kk;I)V")
	public abstract void method5965(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class28_Sub4[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "s", descriptor = "(IIII)V")
	public abstract void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Z)V")
	public abstract void method5966(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(I)V")
	public abstract void method5968(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "g", descriptor = "()Z")
	public abstract boolean method5969();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(FFF)V")
	public abstract void method5970(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Z)V")
	public abstract void method5971(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!za", name = "h", descriptor = "()Z")
	public abstract boolean method5972();

	@OriginalMember(owner = "client!za", name = "VA", descriptor = "(IIIIII)Z")
	public abstract boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "K", descriptor = "(IIIIII[BII)V")
	public abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	public abstract Class41 method5973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(II)V")
	public abstract void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "e", descriptor = "(I)V")
	public abstract void method5974(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "i", descriptor = "()V")
	public abstract void method5975();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIBI)V")
	public final void method5976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.IA(arg1, arg3, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!za", name = "JA", descriptor = "(F)V")
	public abstract void JA(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!za", name = "B", descriptor = "(IFFFFF)V")
	public abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "va", descriptor = "()V")
	public abstract void va();

	@OriginalMember(owner = "client!za", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!aq;[Lclient!ok;Z)Lclient!la;")
	public abstract Class14 method5977(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class190[] arg1);

	@OriginalMember(owner = "client!za", name = "sa", descriptor = "(IIII)[I")
	public abstract int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "j", descriptor = "()Z")
	public abstract boolean method5978();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIIII)V")
	public abstract void method5979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "k", descriptor = "()V")
	public abstract void method5980();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIII)V")
	public final void method5981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.ZA(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	public abstract Class102 method5982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "l", descriptor = "()V")
	public abstract void method5983();

	@OriginalMember(owner = "client!za", name = "f", descriptor = "(I)V")
	public abstract void method5984(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!ok;Z)Lclient!o;")
	public abstract Class41 method5986(@OriginalArg(0) Class190 arg0);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II)I")
	public abstract int method5987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5988(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "SA", descriptor = "(Lclient!c;)V")
	public abstract void SA(@OriginalArg(0) Class6 arg0);

	@OriginalMember(owner = "client!za", name = "h", descriptor = "(I)V")
	public final void method5989() {
		Static404.aBooleanArray9[this.anInt7407] = false;
		this.method6000();
	}

	@OriginalMember(owner = "client!za", name = "MA", descriptor = "([I)V")
	public abstract void MA(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!za", name = "m", descriptor = "()Lclient!c;")
	public abstract Class6 method5990();

	@OriginalMember(owner = "client!za", name = "o", descriptor = "()Z")
	public abstract boolean method5991();

	@OriginalMember(owner = "client!za", name = "T", descriptor = "()F")
	public abstract float T();

	@OriginalMember(owner = "client!za", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!za", name = "q", descriptor = "()V")
	public abstract void method5992();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IZIIII)V")
	public final void method5993(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5979(arg3, arg2, arg4, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!za", name = "ya", descriptor = "(I)V")
	public abstract void ya(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!za", name = "ZA", descriptor = "(IIIII)V")
	protected abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "s", descriptor = "()I")
	public abstract int method5994();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IBIIII)V")
	public final void method5996(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.P(arg3, arg1, arg4, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIII)V")
	public abstract void method5997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "ma", descriptor = "(IIIII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "n", descriptor = "()V")
	public abstract void n();

	@OriginalMember(owner = "client!za", name = "t", descriptor = "()V")
	public abstract void method5998();

	@OriginalMember(owner = "client!za", name = "u", descriptor = "()Z")
	public abstract boolean method5999();

	@OriginalMember(owner = "client!za", name = "v", descriptor = "()V")
	protected abstract void method6000();

	@OriginalMember(owner = "client!za", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!za", name = "w", descriptor = "()Z")
	public abstract boolean method6002();

	@OriginalMember(owner = "client!za", name = "r", descriptor = "()I")
	public abstract int r();

	@OriginalMember(owner = "client!za", name = "x", descriptor = "()Z")
	public abstract boolean method6003();

	@OriginalMember(owner = "client!za", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!kk;I)V")
	public abstract void method6004(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class28_Sub4[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "AA", descriptor = "()I")
	public abstract int AA();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!mt;Lclient!mt;FLclient!mt;)Lclient!mt;")
	public abstract Class141 method6005(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class141 arg3);

	@OriginalMember(owner = "client!za", name = "Q", descriptor = "(III)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!za", name = "aa", descriptor = "()F")
	public abstract float aa();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIII)Lclient!o;")
	public abstract Class41 method6006(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!za", name = "IA", descriptor = "(IIIII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(IIIIII)Lclient!mt;")
	public abstract Class141 method6009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	public abstract Class22 method6010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IBIIII)V")
	public final void method6011(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5962(arg0, arg1, arg2, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!za", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6012(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "v", descriptor = "(III[I)V")
	public abstract void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!n;)V")
	public abstract void method6013(@OriginalArg(0) Class2_Sub7 arg0);

	@OriginalMember(owner = "client!za", name = "y", descriptor = "()Lclient!c;")
	public abstract Class6 method6014();

	@OriginalMember(owner = "client!za", name = "ba", descriptor = "(IIII)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!za", name = "z", descriptor = "()Z")
	public abstract boolean method6015();

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Lclient!fc;IIII)Lclient!e;")
	public abstract Class63 method6016(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!za", name = "A", descriptor = "()Z")
	public abstract boolean method6017();

	@OriginalMember(owner = "client!za", name = "da", descriptor = "(FF)V")
	public abstract void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(I[Lclient!as;)V")
	public abstract void method6018(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4[] arg1);

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIF)Lclient!as;")
	public abstract Class2_Sub4 method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!za", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6020(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!za", name = "B", descriptor = "()Z")
	public abstract boolean method6021();

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(IIIII)V")
	public final void method6022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.ma(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I")
	public abstract int method6023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
