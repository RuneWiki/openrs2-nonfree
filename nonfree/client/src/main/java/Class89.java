import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class Class89 {

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public int anInt6390 = -1;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	protected Class89() {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method5386(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public final void method5387() {
		Static339.aBooleanArray29[this.anInt6390] = false;
		this.method5443();
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "()I")
	public abstract int method5388();

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)Lclient!i;")
	public abstract Class7_Sub14 method5389();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!sj;Lclient!bg;Lclient!mk;Lclient!mo;I)V")
	public abstract void method5390(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class36_Sub6 arg3);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIILclient!vj;II)V")
	public abstract void method5391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class64 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "()V")
	public abstract void method5392();

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "()Z")
	public abstract boolean method5393();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method5394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "()Z")
	public abstract boolean method5395();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!k;)V")
	public abstract void method5396(@OriginalArg(0) Class17 arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
	public abstract void method5397(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII)V")
	public final void method5398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5469(arg0, arg4, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
	public abstract int method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	public abstract void method5400(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5401();

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "()Z")
	public abstract boolean method5402();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIIII)V")
	public final void method5403(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method5429(arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	public abstract void method5405(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)[I")
	public abstract int[] method5406();

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
	public abstract void method5407(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
	public abstract void method5408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([IIIII)Lclient!kb;")
	public abstract Class52 method5409(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "()V")
	public abstract void method5410();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!dr;Z)Lclient!kb;")
	public abstract Class52 method5411(@OriginalArg(0) Class56 arg0);

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIIIII)Lclient!k;")
	public abstract Class17 method5412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(IIIIII)Z")
	public abstract boolean method5413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIBI)V")
	public final void method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method5471(arg1, arg3, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIII)V")
	public abstract void method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
	public abstract void method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "()Z")
	public abstract boolean method5418();

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "()I")
	public abstract int method5419();

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)V")
	public abstract void method5420(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([I)V")
	public abstract void method5421(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!bg;)V")
	public abstract void method5422(@OriginalArg(0) Class24 arg0);

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "()I")
	public abstract int method5423();

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "()F")
	public abstract float method5424();

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "()V")
	public abstract void method5425();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class8 method5426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "()Lclient!mk;")
	public abstract Class70 method5427();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lclient!sj;Lclient!bg;Lclient!mk;[Lclient!mo;I)V")
	public abstract void method5428(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class36_Sub6[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIIII)V")
	protected abstract void method5429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "()Z")
	public abstract boolean method5430();

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(IIII)V")
	public abstract void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "()V")
	public abstract void method5432();

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "()V")
	public abstract void method5433();

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "()V")
	public abstract void method5434();

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I")
	public abstract int method5435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!vj;II)V")
	public abstract void method5436(@OriginalArg(1) Class64 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "()Z")
	public abstract boolean method5437();

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "()Lclient!mk;")
	public abstract Class70 method5438();

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(IIIIII)V")
	public abstract void method5439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "()I")
	public abstract int method5440();

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "()Z")
	public abstract boolean method5441();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(FFF)V")
	public abstract void method5442(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "()V")
	protected abstract void method5443();

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "()I")
	public abstract int method5444();

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "()Z")
	public abstract boolean method5445();

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
	public abstract void method5446(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "()Z")
	public abstract boolean method5447();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIZ)V")
	public final void method5448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method5408(arg0, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "()V")
	public abstract void method5450();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!k;Lclient!k;FLclient!k;)Lclient!k;")
	public abstract Class17 method5451(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3);

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)V")
	public abstract void method5452();

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(IIII)V")
	public abstract void method5453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(IIIIII)V")
	public final void method5454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5481(arg0, arg1, arg4, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[I[I)Lclient!vj;")
	public abstract Class64 method5455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(F)V")
	public abstract void method5456(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)V")
	public abstract void method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "()Z")
	public abstract boolean method5458();

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(IIII)V")
	public abstract void method5459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V")
	public abstract void method5460(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
	public abstract void method5461(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method5462(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(FF)V")
	public abstract void method5463(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!i;)V")
	public abstract void method5464(@OriginalArg(0) Class7_Sub14 arg0);

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "()Z")
	public abstract boolean method5465();

	@OriginalMember(owner = "client!pe", name = "E", descriptor = "()I")
	public abstract int method5466();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!mk;)V")
	public abstract void method5467(@OriginalArg(0) Class70 arg0);

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIIIZ)Lclient!kb;")
	public abstract Class52 method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(IIIIII)V")
	public abstract void method5469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[Lclient!j;)V")
	public abstract void method5470(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub16[] arg1);

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(IIIII)V")
	public abstract void method5471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lclient!sj;Lclient!mk;[Lclient!mo;I)V")
	public abstract void method5472(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class36_Sub6[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "()Z")
	public abstract boolean method5473();

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "()V")
	public abstract void method5474();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!mr;IIII)Lclient!sj;")
	public abstract Class31 method5475(@OriginalArg(0) Class140 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "()Z")
	public abstract boolean method5476();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIZII)V")
	public final void method5477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5439(arg1, arg0, arg3, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "()F")
	public abstract float method5478();

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(II)V")
	public abstract void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "()V")
	public abstract void method5480();

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "(IIIIII)V")
	public abstract void method5481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5482(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!vm;[Lclient!dr;Z)Lclient!hq;")
	public abstract Class94 method5483(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class56[] arg1);

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "()Z")
	public abstract boolean method5484();

	@OriginalMember(owner = "client!pe", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method5387();
	}

	@OriginalMember(owner = "client!pe", name = "L", descriptor = "()Z")
	public abstract boolean method5485();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[I)V")
	public abstract void method5486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);
}
