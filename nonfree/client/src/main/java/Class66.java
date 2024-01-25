import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class Class66 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "Lclient!ps;")
	public final Interface8 anInterface8_5;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
	public final int anInt5948;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(ILclient!ps;)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		this.anInterface8_5 = arg1;
		this.anInt5948 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "()V")
	public abstract void method4966();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
	public abstract void method4967(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4968(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)Lclient!qd;")
	public abstract Class6_Sub15 method4969();

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "()Z")
	public abstract boolean method4970();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!fl;IIII)Lclient!va;")
	public abstract Class224 method4971(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIII)V")
	public abstract void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "()V")
	public abstract void method4973();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIII)V")
	public abstract void method4974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIIII)V")
	public final void method4975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5027(arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "()Z")
	public abstract boolean method4976();

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "()V")
	public abstract void method4977();

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "()Z")
	public abstract boolean method4978();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([Lclient!va;Lclient!bv;Lclient!gs;[Lclient!la;I)V")
	public abstract void method4979(@OriginalArg(0) Class224[] arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) Class57_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4980(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIF)Lclient!dq;")
	public abstract Class6_Sub11 method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "()Z")
	public abstract boolean method4983();

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "()I")
	public abstract int method4984();

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "()Z")
	public abstract boolean method4985();

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "()I")
	public abstract int method4986();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[[I[[IIII)Lclient!og;")
	public abstract Class86 method4987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(IIIII)V")
	public final void method4988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4974(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method4989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "()V")
	public abstract void method4990();

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "()I")
	public abstract int method4991();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIII)[I")
	public abstract int[] method4992();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4994(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "()Z")
	public abstract boolean method4995();

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(Z)V")
	public abstract void method4996(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II[I[I)Lclient!fs;")
	public abstract Class22 method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(FFF)V")
	public abstract void method4998(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "()Z")
	public abstract boolean method4999();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[Lclient!dq;)V")
	public abstract void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub11[] arg1);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZIII)V")
	public final void method5001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5037(arg2, arg3, arg0, arg1, arg4, 1);
	}

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "()V")
	public abstract void method5002();

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIII)V")
	public abstract void method5003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(IIIIII)V")
	public abstract void method5004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!fs;II)V")
	public abstract void method5005(@OriginalArg(1) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5006(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(Z)V")
	public abstract void method5007(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "()Z")
	public abstract boolean method5008();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
	public abstract void method5009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!eq", name = "q", descriptor = "()V")
	public abstract void method5010();

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "()I")
	public abstract int method5012();

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(IIII)V")
	public abstract void method5013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZ)Lclient!qg;")
	public abstract Class87 method5014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "()F")
	public abstract float method5015();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!oi;)V")
	public abstract void method5017(@OriginalArg(0) Class82 arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([IIIII)Lclient!qg;")
	public abstract Class87 method5018(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([I)V")
	public abstract void method5019(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)V")
	public abstract void method5020(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!va;Lclient!bv;Lclient!gs;Lclient!la;I)V")
	public abstract void method5021(@OriginalArg(0) Class224 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) Class57_Sub5 arg3);

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "()I")
	public abstract int method5022();

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(IIII)V")
	public abstract void method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "()F")
	public abstract float method5024();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(F)V")
	public abstract void method5025(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V")
	public abstract void method5026(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(IIIII)V")
	public abstract void method5027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!qd;)V")
	public abstract void method5028(@OriginalArg(0) Class6_Sub15 arg0);

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "()Z")
	public abstract boolean method5029();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III[I)V")
	public abstract void method5030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "()Z")
	public abstract boolean method5031();

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
	public abstract void method5032(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method5033(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!bv;)V")
	public abstract void method5034(@OriginalArg(0) Class32 arg0);

	@OriginalMember(owner = "client!eq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method5069();
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(IIIIII)V")
	public final void method5035(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5004(arg3, arg1, arg0, arg4, arg2, 1);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!mo;[Lclient!pi;Z)Lclient!hr;")
	public abstract Class29 method5036(@OriginalArg(0) Class166 arg0, @OriginalArg(1) Class194[] arg1);

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(IIIIII)V")
	public abstract void method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!pi;Z)Lclient!qg;")
	public abstract Class87 method5038(@OriginalArg(0) Class194 arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIBI)V")
	public final void method5040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4972(arg3, arg2, arg1, arg4, arg0, 1);
	}

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "()V")
	protected abstract void method5041();

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(IIII)V")
	public abstract void method5042();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIBII)V")
	public final void method5043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method5059(arg3, arg1, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(IIII)V")
	public abstract void method5044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V")
	public abstract void method5045(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([Lclient!va;Lclient!gs;[Lclient!la;I)V")
	public abstract void method5046(@OriginalArg(0) Class224[] arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class57_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "(I)V")
	public abstract void method5047(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)V")
	public abstract void method5048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!eq", name = "y", descriptor = "()Z")
	public abstract boolean method5049();

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "()Z")
	public abstract boolean method5050();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!oi;Lclient!oi;FLclient!oi;)Lclient!oi;")
	public abstract Class82 method5051(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class82 arg3);

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5052(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(II)I")
	public abstract int method5053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(IIIIII)Z")
	public abstract boolean method5054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(FF)V")
	public abstract void method5055(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!eq", name = "A", descriptor = "()Z")
	public abstract boolean method5056();

	@OriginalMember(owner = "client!eq", name = "B", descriptor = "()Lclient!gs;")
	public abstract Class5 method5057();

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(IIIII)V")
	protected abstract void method5059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "(IIII)V")
	public abstract void method5060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5061();

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(II)I")
	public abstract int method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(IIIIII)Lclient!oi;")
	public abstract Class82 method5063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!eq", name = "C", descriptor = "()Lclient!gs;")
	public abstract Class5 method5064();

	@OriginalMember(owner = "client!eq", name = "D", descriptor = "()Z")
	public abstract boolean method5065();

	@OriginalMember(owner = "client!eq", name = "E", descriptor = "()V")
	public abstract void method5066();

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)V")
	public abstract void method5067(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIILclient!fs;II)V")
	public abstract void method5068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class22 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "(I)V")
	public final void method5069() {
		Static255.aBooleanArray15[this.anInt5948] = false;
		this.method5041();
	}

	@OriginalMember(owner = "client!eq", name = "F", descriptor = "()V")
	public abstract void method5070();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!gs;)V")
	public abstract void method5071(@OriginalArg(0) Class5 arg0);

	@OriginalMember(owner = "client!eq", name = "G", descriptor = "()I")
	public abstract int method5072();

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "(I)V")
	public abstract void method5073(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eq", name = "H", descriptor = "()Z")
	public abstract boolean method5074();
}
