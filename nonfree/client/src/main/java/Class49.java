import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class Class49 {

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "I")
	public final int anInt5543;

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "Lclient!ga;")
	public final Interface4 anInterface4_6;

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(ILclient!ga;)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInt5543 = arg0;
		this.anInterface4_6 = arg1;
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
	public abstract void method4407(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "l", descriptor = "()V")
	public abstract void l();

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "()Z")
	public abstract boolean method4408();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "()I")
	public abstract int a();

	@OriginalMember(owner = "client!ya", name = "TA", descriptor = "(IIIII)V")
	public abstract void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!ii;I)V")
	public abstract void method4409(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class8_Sub4[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4411(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "()V")
	public abstract void method4412();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIBI)V")
	public final void method4413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.b(arg3, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!kq;IIII)Lclient!t;")
	public abstract Class91 method4414(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "T", descriptor = "(IFFFFF)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZI)V")
	public final void method4415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method4426(arg3, arg1, arg2, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!ya", name = "da", descriptor = "([I)V")
	public abstract void da(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Z)V")
	public abstract void method4416(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "()V")
	public abstract void method4417();

	@OriginalMember(owner = "client!ya", name = "YA", descriptor = "()I")
	public abstract int YA();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(BIIII)V")
	public final void method4418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.NA(arg3, arg1, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4419(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "()V")
	protected abstract void method4420();

	@OriginalMember(owner = "client!ya", name = "UA", descriptor = "(III)V")
	public abstract void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lclient!t;Lclient!pn;Lclient!c;[Lclient!ii;I)V")
	public abstract void method4421(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class8_Sub4[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "O", descriptor = "(IIIIII)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([IIIII)Lclient!l;")
	public abstract Class17 method4422(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "(FF)V")
	public abstract void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "(I)V")
	public abstract void p(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(Z)V")
	public abstract void method4423(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
	public abstract void method4424(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "()Z")
	public abstract boolean method4425();

	@OriginalMember(owner = "client!ya", name = "fa", descriptor = "(IIII)V")
	public abstract void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "F", descriptor = "(IIII)[I")
	public abstract int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "B", descriptor = "(F)V")
	public abstract void B(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIII)V")
	public abstract void method4426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(FFF)V")
	public abstract void method4427(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(I[Lclient!jd;)V")
	public abstract void method4428(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20[] arg1);

	@OriginalMember(owner = "client!ya", name = "X", descriptor = "(III[I)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)I")
	public abstract int method4429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	public abstract Class73 method4430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ya", name = "W", descriptor = "()F")
	public abstract float W();

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "()V")
	public abstract void e();

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "()Z")
	public abstract boolean method4431();

	@OriginalMember(owner = "client!ya", name = "i", descriptor = "()V")
	public abstract void method4432();

	@OriginalMember(owner = "client!ya", name = "j", descriptor = "()I")
	public abstract int method4433();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!ft;Z)Lclient!l;")
	public abstract Class17 method4435(@OriginalArg(0) Class85 arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4436(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(I)V")
	public final void method4437() {
		Static192.aBooleanArray17[this.anInt5543] = false;
		this.method4420();
	}

	@OriginalMember(owner = "client!ya", name = "DA", descriptor = "(IIIIII[BII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ya", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4438(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "xa", descriptor = "()F")
	public abstract float xa();

	@OriginalMember(owner = "client!ya", name = "w", descriptor = "()I")
	public abstract int w();

	@OriginalMember(owner = "client!ya", name = "k", descriptor = "()Z")
	public abstract boolean method4439();

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(I)Lclient!u;")
	public abstract Class2_Sub17 method4440();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	public abstract Class17 method4441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ya", name = "m", descriptor = "()Z")
	public abstract boolean method4442();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!mh;Lclient!mh;FLclient!mh;)Lclient!mh;")
	public abstract Class155 method4443(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class155 arg3);

	@OriginalMember(owner = "client!ya", name = "n", descriptor = "()Z")
	public abstract boolean method4444();

	@OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IIII)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "o", descriptor = "()Lclient!c;")
	public abstract Class35 method4445();

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "(I)V")
	public abstract void method4446(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "()Z")
	public abstract boolean method4447();

	@OriginalMember(owner = "client!ya", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIIII)V")
	public abstract void method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "JA", descriptor = "(IIIIII)Z")
	public abstract boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "q", descriptor = "()Z")
	public abstract boolean method4450();

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(II)I")
	public abstract int method4451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIIII)V")
	public final void method4452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4449(arg2, arg3, arg0, arg1, arg4, 1);
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!u;)V")
	public abstract void method4453(@OriginalArg(0) Class2_Sub17 arg0);

	@OriginalMember(owner = "client!ya", name = "ca", descriptor = "(ILclient!ma;II)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "(I)V")
	public abstract void method4454(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "r", descriptor = "()Z")
	public abstract boolean method4455();

	@OriginalMember(owner = "client!ya", name = "H", descriptor = "(IIII)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "s", descriptor = "()Z")
	public abstract boolean method4457();

	@OriginalMember(owner = "client!ya", name = "t", descriptor = "()Z")
	public abstract boolean method4458();

	@OriginalMember(owner = "client!ya", name = "ea", descriptor = "(Lclient!c;)V")
	public abstract void ea(@OriginalArg(0) Class35 arg0);

	@OriginalMember(owner = "client!ya", name = "NA", descriptor = "(IIIII)V")
	protected abstract void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "u", descriptor = "()Z")
	public abstract boolean method4459();

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4460(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(IIIIII)Lclient!mh;")
	public abstract Class155 method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	public abstract Class64 method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ya", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIII)V")
	public abstract void method4463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIII)V")
	public final void method4464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.TA(arg2, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!ya", name = "v", descriptor = "()Z")
	public abstract boolean method4465();

	@OriginalMember(owner = "client!ya", name = "x", descriptor = "()Z")
	public abstract boolean method4466();

	@OriginalMember(owner = "client!ya", name = "y", descriptor = "()Lclient!c;")
	public abstract Class35 method4467();

	@OriginalMember(owner = "client!ya", name = "ia", descriptor = "(II)V")
	public abstract void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!t;Lclient!pn;Lclient!c;Lclient!ii;I)V")
	public abstract void method4468(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class8_Sub4 arg3);

	@OriginalMember(owner = "client!ya", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!ya", name = "z", descriptor = "()Z")
	public abstract boolean method4469();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!mh;)V")
	public abstract void method4470(@OriginalArg(0) Class155 arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!pn;)V")
	public abstract void method4471(@OriginalArg(0) Class194 arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	public abstract void method4472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ya", name = "A", descriptor = "()V")
	public abstract void method4475();

	@OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4437();
	}

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(Z)V")
	public abstract void method4476(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "B", descriptor = "()V")
	public abstract void method4477();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIF)Lclient!jd;")
	public abstract Class2_Sub20 method4478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!dq;[Lclient!ft;Z)Lclient!la;")
	public abstract Class116 method4479(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class85[] arg1);

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "(IIIIII)V")
	public final void method4480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.O(arg0, arg3, arg1, arg4, arg2, 1);
	}

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "(I)V")
	public abstract void method4481(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4482();

	@OriginalMember(owner = "client!ya", name = "C", descriptor = "()V")
	public abstract void method4483();
}
