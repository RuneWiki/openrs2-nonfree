import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class Class55 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public int anInt5811 = -1;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	protected Class55() {
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[[I[[IIII)Lclient!dn;")
	public abstract Class51 method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(FF)V")
	public abstract void method5156(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIZ)Lclient!wn;")
	public abstract Class95 method5157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "()Z")
	public abstract boolean method5158();

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "()V")
	public abstract void method5159();

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "()Z")
	public abstract boolean method5160();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V")
	public abstract void method5161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIII)V")
	public abstract void method5162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	public abstract void method5163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	public abstract void method5164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)I")
	public abstract int method5165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "()Z")
	public abstract boolean method5166();

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(IIII)V")
	public abstract void method5167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public final void method5168() {
		Static146.aBooleanArray11[this.anInt5811] = false;
		this.method5197();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZII)V")
	public final void method5169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method5175(arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "()Z")
	public abstract boolean method5170();

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "()V")
	public abstract void method5171();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[Lclient!bn;)V")
	public abstract void method5172(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub9[] arg1);

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "()Lclient!ve;")
	public abstract Class66 method5173();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5174(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
	protected abstract void method5175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIII)V")
	public abstract void method5176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "()Z")
	public abstract boolean method5177();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIIII)V")
	public final void method5178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method5192(arg1, arg3, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!sg;)V")
	public abstract void method5179(@OriginalArg(0) Class54 arg0);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ci;[Lclient!jf;Z)Lclient!ok;")
	public abstract Class18 method5180(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class100[] arg1);

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)I")
	public abstract int method5181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "()Z")
	public abstract boolean method5182();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5184();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!de;II)V")
	public abstract void method5185(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "()V")
	public abstract void method5186();

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "()Z")
	public abstract boolean method5187();

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "()Z")
	public abstract boolean method5188();

	@OriginalMember(owner = "client!ea", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method5168();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ns;)V")
	public abstract void method5189(@OriginalArg(0) Class146 arg0);

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "()Z")
	public abstract boolean method5190();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)Z")
	public abstract boolean method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(IIIII)V")
	public abstract void method5192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "()Z")
	public abstract boolean method5193();

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "()Lclient!ve;")
	public abstract Class66 method5195();

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "()I")
	public abstract int method5196();

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "()V")
	protected abstract void method5197();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Lclient!lf;")
	public abstract Class5_Sub23 method5198();

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "()V")
	public abstract void method5199();

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(II)V")
	public abstract void method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ri;IIII)Lclient!ts;")
	public abstract Class112 method5201(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(IIII)[I")
	public abstract int[] method5202();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([I)V")
	public abstract void method5203(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIIII)V")
	public abstract void method5204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(IIIIII)V")
	public abstract void method5205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[I[I)Lclient!de;")
	public abstract Class46 method5206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "()I")
	public abstract int method5207();

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(IIIIII)V")
	public final void method5208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5216(arg3, arg1, arg4, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "()Z")
	public abstract boolean method5209();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([IIIII)Lclient!wn;")
	public abstract Class95 method5210(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "()V")
	public abstract void method5211();

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "()V")
	public abstract void method5212();

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "()I")
	public abstract int method5213();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([Lclient!ts;Lclient!ns;Lclient!ve;[Lclient!uh;I)V")
	public abstract void method5214(@OriginalArg(0) Class112[] arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) Class32_Sub8[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III[I)V")
	public abstract void method5215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(IIIIII)V")
	public abstract void method5216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "()I")
	public abstract int method5217();

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "()Z")
	public abstract boolean method5218();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "()V")
	public abstract void method5220();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method5221(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "()I")
	public abstract int method5222();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(F)V")
	public abstract void method5223(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "()V")
	public abstract void method5224();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!sg;Lclient!sg;FLclient!sg;)Lclient!sg;")
	public abstract Class54 method5225(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class54 arg3);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public abstract void method5226(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!lf;)V")
	public abstract void method5227(@OriginalArg(0) Class5_Sub23 arg0);

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "()Z")
	public abstract boolean method5228();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!jf;Z)Lclient!wn;")
	public abstract Class95 method5229(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!ea", name = "G", descriptor = "()F")
	public abstract float method5231();

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "()F")
	public abstract float method5232();

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public abstract void method5233(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
	public abstract void method5234();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(FFF)V")
	public abstract void method5235(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
	public abstract void method5237(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(IIIIII)Lclient!sg;")
	public abstract Class54 method5238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ts;Lclient!ns;Lclient!ve;Lclient!uh;I)V")
	public abstract void method5241(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) Class32_Sub8 arg3);

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "()I")
	public abstract int method5242();

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(IIIIZ)V")
	public final void method5243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5176(arg3, arg1, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([Lclient!ts;Lclient!ve;[Lclient!uh;I)V")
	public abstract void method5244(@OriginalArg(0) Class112[] arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) Class32_Sub8[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIILclient!de;II)V")
	public abstract void method5245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class46 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method5246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "()Z")
	public abstract boolean method5247();

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	public abstract void method5248(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Z)V")
	public abstract void method5249(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "()Z")
	public abstract boolean method5250();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIIIII)V")
	public final void method5251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5204(arg0, arg4, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ve;)V")
	public abstract void method5252(@OriginalArg(0) Class66 arg0);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5253(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(IIIIII)V")
	public final void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5205(arg3, arg4, arg0, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
	public abstract void method5255(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "()V")
	public abstract void method5256();

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V")
	public abstract void method5257(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(IIII)V")
	public abstract void method5258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(Z)V")
	public abstract void method5259(@OriginalArg(0) boolean arg0);
}
