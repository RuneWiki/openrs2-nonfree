import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class Class46 {

	@OriginalMember(owner = "client!e", name = "f", descriptor = "I")
	public int anInt5722 = -1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	protected Class46() {
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
	public abstract void method5086();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII)V")
	public final void method5087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5143(arg2, arg0, arg4, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "()Z")
	public abstract boolean method5088();

	@OriginalMember(owner = "client!e", name = "f", descriptor = "()I")
	public abstract int method5089();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III[I)V")
	public abstract void method5090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
	public abstract void method5091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!gh;[Lclient!vp;Z)Lclient!mp;")
	public abstract Class30 method5093(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class207[] arg1);

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIIII)Lclient!ma;")
	public abstract Class67 method5094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ka;)V")
	public abstract void method5096(@OriginalArg(0) Class14_Sub20 arg0);

	@OriginalMember(owner = "client!e", name = "g", descriptor = "()F")
	public abstract float method5097();

	@OriginalMember(owner = "client!e", name = "h", descriptor = "()F")
	public abstract float method5098();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBIII)V")
	public final void method5099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method5091(arg0, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public abstract void method5100(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[I[I)Lclient!q;")
	public abstract Class156 method5101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!e", name = "i", descriptor = "()Z")
	public abstract boolean method5102();

	@OriginalMember(owner = "client!e", name = "j", descriptor = "()V")
	public abstract void method5103();

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public abstract void method5104(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)[I")
	public abstract int[] method5105();

	@OriginalMember(owner = "client!e", name = "k", descriptor = "()Z")
	public abstract boolean method5106();

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(IIII)V")
	public abstract void method5107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(IIIIII)V")
	public final void method5108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method5110(arg1, arg4, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ma;Lclient!ma;FLclient!ma;)Lclient!ma;")
	public abstract Class67 method5109(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class67 arg3);

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(IIIIII)V")
	public abstract void method5110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	public abstract void method5111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)I")
	public abstract int method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZIII)V")
	public final void method5113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method5147(arg2, arg1, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
	public abstract int method5114();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!id;Lclient!jp;Lclient!pg;Lclient!cd;I)V")
	public abstract void method5116(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class1_Sub3 arg3);

	@OriginalMember(owner = "client!e", name = "m", descriptor = "()V")
	public abstract void method5117();

	@OriginalMember(owner = "client!e", name = "n", descriptor = "()V")
	public abstract void method5118();

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(IIIIII)V")
	public final void method5120(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5189(arg2, arg1, arg0, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(F)V")
	public abstract void method5121(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!jp;)V")
	public abstract void method5122(@OriginalArg(0) Class109 arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([Lclient!id;Lclient!pg;[Lclient!cd;I)V")
	public abstract void method5123(@OriginalArg(0) Class45[] arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class1_Sub3[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[Lclient!ej;)V")
	public abstract void method5124(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub13[] arg1);

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V")
	public abstract void method5125(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public abstract void method5126();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method5127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)V")
	public abstract void method5128(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!e", name = "o", descriptor = "()I")
	public abstract int method5129();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([Lclient!id;Lclient!jp;Lclient!pg;[Lclient!cd;I)V")
	public abstract void method5130(@OriginalArg(0) Class45[] arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class1_Sub3[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!e", name = "p", descriptor = "()V")
	public abstract void method5131();

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public abstract void method5132(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([I)V")
	public abstract void method5133(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!e", name = "q", descriptor = "()Z")
	public abstract boolean method5134();

	@OriginalMember(owner = "client!e", name = "r", descriptor = "()I")
	public abstract int method5135();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5136(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!e", name = "s", descriptor = "()V")
	protected abstract void method5137();

	@OriginalMember(owner = "client!e", name = "t", descriptor = "()Z")
	public abstract boolean method5138();

	@OriginalMember(owner = "client!e", name = "u", descriptor = "()V")
	public abstract void method5139();

	@OriginalMember(owner = "client!e", name = "v", descriptor = "()Z")
	public abstract boolean method5140();

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)Lclient!ka;")
	public abstract Class14_Sub20 method5141();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5142(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(IIIIII)V")
	public abstract void method5143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!pg;)V")
	public abstract void method5144(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!e", name = "w", descriptor = "()Lclient!pg;")
	public abstract Class51 method5145();

	@OriginalMember(owner = "client!e", name = "x", descriptor = "()I")
	public abstract int method5146();

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIII)V")
	public abstract void method5147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!g;IIII)Lclient!id;")
	public abstract Class45 method5148(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(II)I")
	public abstract int method5149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[[I[[IIII)Lclient!lf;")
	public abstract Class114 method5150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!e", name = "y", descriptor = "()Z")
	public abstract boolean method5151();

	@OriginalMember(owner = "client!e", name = "z", descriptor = "()V")
	public abstract void method5152();

	@OriginalMember(owner = "client!e", name = "A", descriptor = "()V")
	public abstract void method5153();

	@OriginalMember(owner = "client!e", name = "B", descriptor = "()Z")
	public abstract boolean method5154();

	@OriginalMember(owner = "client!e", name = "C", descriptor = "()Z")
	public abstract boolean method5155();

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(Z)V")
	public abstract void method5156(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!vp;Z)Lclient!gl;")
	public abstract Class2 method5157(@OriginalArg(0) Class207 arg0);

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
	public final void method5158() {
		Static64.aBooleanArray2[this.anInt5722] = false;
		this.method5137();
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
	public abstract void method5159(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "D", descriptor = "()Z")
	public abstract boolean method5160();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(FF)V")
	public abstract void method5161(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!e", name = "E", descriptor = "()Z")
	public abstract boolean method5162();

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(II)V")
	public abstract void method5163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!q;II)V")
	public abstract void method5165(@OriginalArg(1) Class156 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(IIIII)V")
	protected abstract void method5166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([IIIII)Lclient!gl;")
	public abstract Class2 method5167(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!e", name = "F", descriptor = "()Z")
	public abstract boolean method5168();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ma;)V")
	public abstract void method5170(@OriginalArg(0) Class67 arg0);

	@OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
	public abstract void method5171(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(IIII)V")
	public abstract void method5172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "g", descriptor = "(IIIIII)Z")
	public abstract boolean method5173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!e", name = "G", descriptor = "()I")
	public abstract int method5174();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(FFF)V")
	public abstract void method5175(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!e", name = "H", descriptor = "()Z")
	public abstract boolean method5176();

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(IZIII)V")
	public final void method5177(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method5166(arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method5158();
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(IIII)V")
	public abstract void method5178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIILclient!q;II)V")
	public abstract void method5179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class156 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method5180(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIZ)Lclient!gl;")
	public abstract Class2 method5182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!e", name = "I", descriptor = "()V")
	public abstract void method5183();

	@OriginalMember(owner = "client!e", name = "J", descriptor = "()Z")
	public abstract boolean method5184();

	@OriginalMember(owner = "client!e", name = "K", descriptor = "()Lclient!pg;")
	public abstract Class51 method5185();

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(III)V")
	public abstract void method5186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "L", descriptor = "()Z")
	public abstract boolean method5187();

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(IIII)V")
	public abstract void method5188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "h", descriptor = "(IIIIII)V")
	public abstract void method5189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5190();
}
