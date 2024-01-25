import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class Class51 {

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "Lclient!ga;")
	public final Interface4 anInterface4_8;

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "I")
	public final int anInt6714;

	static {
		new Class55("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(ILclient!ga;)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_8 = arg1;
		this.anInt6714 = arg0;
	}

	@OriginalMember(owner = "client!ya", name = "ea", descriptor = "(Lclient!c;)V")
	public abstract void ea(@OriginalArg(0) Class33 arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "()V")
	public abstract void method5278();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Z)V")
	public abstract void method5279(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "H", descriptor = "(IIII)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!du;[Lclient!ul;Z)Lclient!la;")
	public abstract Class63 method5281(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class246[] arg1);

	@OriginalMember(owner = "client!ya", name = "l", descriptor = "()V")
	public abstract void l();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(FFF)V")
	public abstract void method5282(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "()V")
	public abstract void method5283();

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "()Z")
	public abstract boolean method5284();

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "()Lclient!c;")
	public abstract Class33 method5285();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIII)V")
	public final void method5286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.O(arg2, arg4, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ya", name = "DA", descriptor = "(IIIIII[BII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIIII)V")
	public abstract void method5287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	public abstract Class165 method5288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIIII)V")
	public abstract void method5289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "()I")
	public abstract int method5290();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!t;Lclient!pv;Lclient!c;Lclient!qb;I)V")
	public abstract void method5291(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class28_Sub6 arg3);

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "()V")
	public abstract void method5292();

	@OriginalMember(owner = "client!ya", name = "i", descriptor = "()Lclient!c;")
	public abstract Class33 method5293();

	@OriginalMember(owner = "client!ya", name = "j", descriptor = "()Z")
	public abstract boolean method5295();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	public abstract Class119 method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5297();

	@OriginalMember(owner = "client!ya", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5298(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "xa", descriptor = "()F")
	public abstract float xa();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
	public abstract void method5299(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IIII)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "(I)V")
	public abstract void p(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "k", descriptor = "()V")
	public abstract void method5300();

	@OriginalMember(owner = "client!ya", name = "m", descriptor = "()Z")
	public abstract boolean method5301();

	@OriginalMember(owner = "client!ya", name = "n", descriptor = "()V")
	public abstract void method5302();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIB)V")
	public final void method5303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.NA(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!ya", name = "B", descriptor = "(F)V")
	public abstract void B(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ya", name = "TA", descriptor = "(IIIII)V")
	public abstract void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "X", descriptor = "(III[I)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIZ)V")
	public final void method5304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5289(arg1, arg2, arg0, arg4, arg3, 1);
	}

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "()V")
	public abstract void e();

	@OriginalMember(owner = "client!ya", name = "o", descriptor = "()Z")
	public abstract boolean method5305();

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
	public abstract void method5306(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "()Z")
	public abstract boolean method5307();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!ul;Z)Lclient!l;")
	public abstract Class11 method5308(@OriginalArg(0) Class246 arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5309(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "()I")
	public abstract int a();

	@OriginalMember(owner = "client!ya", name = "JA", descriptor = "(IIIIII)Z")
	public abstract boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "F", descriptor = "(IIII)[I")
	public abstract int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([IIIII)Lclient!l;")
	public abstract Class11 method5310(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ya", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!pv;)V")
	public abstract void method5311(@OriginalArg(0) Class201 arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIBII)V")
	public final void method5313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.b(arg0, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5314(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "da", descriptor = "([I)V")
	public abstract void da(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ya", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(I)V")
	public final void method5315() {
		Static224.aBooleanArray30[this.anInt6714] = false;
		this.method5338();
	}

	@OriginalMember(owner = "client!ya", name = "q", descriptor = "()Z")
	public abstract boolean method5316();

	@OriginalMember(owner = "client!ya", name = "r", descriptor = "()Z")
	public abstract boolean method5317();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(I[Lclient!wr;)V")
	public abstract void method5318(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub30[] arg1);

	@OriginalMember(owner = "client!ya", name = "w", descriptor = "()I")
	public abstract int w();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIII)V")
	public abstract void method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!qs;Lclient!qs;FLclient!qs;)Lclient!qs;")
	public abstract Class96 method5320(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class96 arg3);

	@OriginalMember(owner = "client!ya", name = "s", descriptor = "()Z")
	public abstract boolean method5321();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lclient!t;Lclient!pv;Lclient!c;[Lclient!qb;I)V")
	public abstract void method5322(@OriginalArg(0) Class163[] arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class28_Sub6[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5315();
	}

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(II)I")
	public abstract int method5323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIBII)V")
	public final void method5324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.TA(arg3, arg0, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!ya", name = "T", descriptor = "(IFFFFF)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IZIIII)V")
	public final void method5325(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5287(arg4, arg0, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ya", name = "t", descriptor = "()Z")
	public abstract boolean method5326();

	@OriginalMember(owner = "client!ya", name = "u", descriptor = "()Z")
	public abstract boolean method5327();

	@OriginalMember(owner = "client!ya", name = "v", descriptor = "()Z")
	public abstract boolean method5328();

	@OriginalMember(owner = "client!ya", name = "YA", descriptor = "()I")
	public abstract int YA();

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5330(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(Z)V")
	public abstract void method5331(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "NA", descriptor = "(IIIII)V")
	protected abstract void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "ca", descriptor = "(ILclient!ma;II)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(Z)V")
	public abstract void method5333(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!qb;I)V")
	public abstract void method5334(@OriginalArg(0) Class163[] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class28_Sub6[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIF)Lclient!wr;")
	public abstract Class7_Sub30 method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!u;)V")
	public abstract void method5336(@OriginalArg(0) Class7_Sub40 arg0);

	@OriginalMember(owner = "client!ya", name = "x", descriptor = "()Z")
	public abstract boolean method5337();

	@OriginalMember(owner = "client!ya", name = "y", descriptor = "()V")
	protected abstract void method5338();

	@OriginalMember(owner = "client!ya", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "UA", descriptor = "(III)V")
	public abstract void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	public abstract void method5339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class119 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ya", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "(I)V")
	public abstract void method5340(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "(I)V")
	public abstract void method5341(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "z", descriptor = "()Z")
	public abstract boolean method5342();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5343(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!qs;)V")
	public abstract void method5344(@OriginalArg(0) Class96 arg0);

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "(I)V")
	public abstract void method5345(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!io;IIII)Lclient!t;")
	public abstract Class163 method5346(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "(I)Lclient!u;")
	public abstract Class7_Sub40 method5347(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "A", descriptor = "()Z")
	public abstract boolean method5348();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	public abstract Class11 method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "(FF)V")
	public abstract void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ya", name = "ia", descriptor = "(II)V")
	public abstract void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "B", descriptor = "()Z")
	public abstract boolean method5350();

	@OriginalMember(owner = "client!ya", name = "W", descriptor = "()F")
	public abstract float W();

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(IIIIII)Lclient!qs;")
	public abstract Class96 method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "fa", descriptor = "(IIII)V")
	public abstract void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(II)I")
	public abstract int method5352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "C", descriptor = "()V")
	public abstract void method5353();

	@OriginalMember(owner = "client!ya", name = "O", descriptor = "(IIIIII)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
