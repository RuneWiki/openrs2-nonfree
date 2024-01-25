import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class Class19 {

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "Lclient!ga;")
	public final Interface7 anInterface7_6;

	@OriginalMember(owner = "client!ya", name = "j", descriptor = "I")
	public final int anInt5532;

	static {
		new Class83("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
		new Class83(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(ILclient!ga;)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_6 = arg1;
		this.anInt5532 = arg0;
	}

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "()V")
	public abstract void method4236();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Z)V")
	public abstract void method4237(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(I[Lclient!vp;)V")
	public abstract void method4238(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub21[] arg1);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "()V")
	protected abstract void method4239();

	@OriginalMember(owner = "client!ya", name = "B", descriptor = "(F)V")
	public abstract void B(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIII)V")
	public final void method4240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.TA(arg2, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!ya", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "()Z")
	public abstract boolean method4242();

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "()Z")
	public abstract boolean method4243();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!u;)V")
	public abstract void method4244(@OriginalArg(0) Class4_Sub2 arg0);

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "()Z")
	public abstract boolean method4245();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
	public abstract void method4246(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "()V")
	public abstract void method4247();

	@OriginalMember(owner = "client!ya", name = "i", descriptor = "()Z")
	public abstract boolean method4248();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4249(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "T", descriptor = "(IFFFFF)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ya", name = "fa", descriptor = "(IIII)V")
	public abstract void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4250(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "ea", descriptor = "(Lclient!c;)V")
	public abstract void ea(@OriginalArg(0) Class31 arg0);

	@OriginalMember(owner = "client!ya", name = "YA", descriptor = "()I")
	public abstract int YA();

	@OriginalMember(owner = "client!ya", name = "TA", descriptor = "(IIIII)V")
	public abstract void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "j", descriptor = "()Z")
	public abstract boolean method4251();

	@OriginalMember(owner = "client!ya", name = "k", descriptor = "()Z")
	public abstract boolean method4252();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!jq;IIII)Lclient!t;")
	public abstract Class110 method4254(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(Z)V")
	public abstract void method4255(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIII)V")
	public final void method4256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.b(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(FFF)V")
	public abstract void method4257(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ya", name = "m", descriptor = "()Z")
	public abstract boolean method4258();

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "(FF)V")
	public abstract void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4267();
	}

	@OriginalMember(owner = "client!ya", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!ya", name = "n", descriptor = "()Z")
	public abstract boolean method4259();

	@OriginalMember(owner = "client!ya", name = "o", descriptor = "()I")
	public abstract int method4260();

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "()Z")
	public abstract boolean method4261();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!t;Lclient!mc;Lclient!c;Lclient!mi;I)V")
	public abstract void method4262(@OriginalArg(0) Class110 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class3_Sub5 arg3);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4263(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "q", descriptor = "()Z")
	public abstract boolean method4264();

	@OriginalMember(owner = "client!ya", name = "w", descriptor = "()I")
	public abstract int w();

	@OriginalMember(owner = "client!ya", name = "l", descriptor = "()V")
	public abstract void l();

	@OriginalMember(owner = "client!ya", name = "NA", descriptor = "(IIIII)V")
	protected abstract void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([IIIII)Lclient!l;")
	public abstract Class57 method4265(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
	public abstract void method4266();

	@OriginalMember(owner = "client!ya", name = "da", descriptor = "([I)V")
	public abstract void da(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(Z)V")
	public final void method4267() {
		Static100.aBooleanArray11[this.anInt5532] = false;
		this.method4239();
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIII)Lclient!tb;")
	public abstract Class99 method4268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)I")
	public abstract int method4269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4272(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "()V")
	public abstract void e();

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(I)V")
	public abstract void method4273(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "s", descriptor = "()Lclient!c;")
	public abstract Class31 method4274();

	@OriginalMember(owner = "client!ya", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!gt;[Lclient!bb;Z)Lclient!la;")
	public abstract Class46 method4275(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class18[] arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4276();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!mc;)V")
	public abstract void method4277(@OriginalArg(0) Class146 arg0);

	@OriginalMember(owner = "client!ya", name = "ia", descriptor = "(II)V")
	public abstract void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "t", descriptor = "()V")
	public abstract void method4278();

	@OriginalMember(owner = "client!ya", name = "u", descriptor = "()Z")
	public abstract boolean method4279();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	public abstract Class57 method4280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ya", name = "v", descriptor = "()V")
	public abstract void method4281();

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(II)I")
	public abstract int method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "(I)V")
	public abstract void method4283(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "(I)Lclient!u;")
	public abstract Class4_Sub2 method4284(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	public abstract Class145 method4285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ya", name = "x", descriptor = "()Z")
	public abstract boolean method4286();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	public abstract void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ya", name = "ca", descriptor = "(ILclient!ma;II)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!tb;)V")
	public abstract void method4288(@OriginalArg(0) Class99 arg0);

	@OriginalMember(owner = "client!ya", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "xa", descriptor = "()F")
	public abstract float xa();

	@OriginalMember(owner = "client!ya", name = "y", descriptor = "()Lclient!c;")
	public abstract Class31 method4289();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4290(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "z", descriptor = "()Z")
	public abstract boolean method4291();

	@OriginalMember(owner = "client!ya", name = "JA", descriptor = "(IIIIII)Z")
	public abstract boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIBII)V")
	public final void method4293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.O(arg0, arg2, arg1, arg4, arg3, 1);
	}

	@OriginalMember(owner = "client!ya", name = "UA", descriptor = "(III)V")
	public abstract void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIII)V")
	public abstract void method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIIII)V")
	public final void method4295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4312(arg0, arg4, arg3, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIIII)V")
	public final void method4296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4302(arg2, arg0, arg4, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ya", name = "X", descriptor = "(III[I)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ya", name = "DA", descriptor = "(IIIIII[BII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	public abstract Class65 method4297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!tb;Lclient!tb;FLclient!tb;)Lclient!tb;")
	public abstract Class99 method4298(@OriginalArg(0) Class99 arg0, @OriginalArg(1) Class99 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class99 arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lclient!t;Lclient!mc;Lclient!c;[Lclient!mi;I)V")
	public abstract void method4299(@OriginalArg(0) Class110[] arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class3_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "B", descriptor = "()Z")
	public abstract boolean method4300();

	@OriginalMember(owner = "client!ya", name = "C", descriptor = "()Z")
	public abstract boolean method4301();

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(IIIIII)V")
	public abstract void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IIII)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "(I)V")
	public abstract void p(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "(I)V")
	public abstract void method4303(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "()I")
	public abstract int a();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(BIIII)V")
	public final void method4304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.NA(arg2, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!ya", name = "O", descriptor = "(IIIIII)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "(I)V")
	public abstract void method4306(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!mi;I)V")
	public abstract void method4307(@OriginalArg(0) Class110[] arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class3_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!bb;Z)Lclient!l;")
	public abstract Class57 method4308(@OriginalArg(0) Class18 arg0);

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(Z)V")
	public abstract void method4309(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIF)Lclient!vp;")
	public abstract Class4_Sub21 method4310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ya", name = "F", descriptor = "(IIII)[I")
	public abstract int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "H", descriptor = "(IIII)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "W", descriptor = "()F")
	public abstract float W();

	@OriginalMember(owner = "client!ya", name = "D", descriptor = "()V")
	public abstract void method4311();

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "(IIIIII)V")
	public abstract void method4312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
