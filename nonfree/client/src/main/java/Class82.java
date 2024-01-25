import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class Class82 {

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!bc;")
	public final Interface1 anInterface1_4;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	public final int anInt5188;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(ILclient!bc;)V")
	protected Class82(@OriginalArg(0) int arg0, @OriginalArg(1) Interface1 arg1) {
		this.anInterface1_4 = arg1;
		this.anInt5188 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([IIIII)Lclient!aq;")
	public abstract Class5 method4456(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(F)V")
	public abstract void method4457(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!km", name = "d", descriptor = "()V")
	public abstract void method4458();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
	public abstract void method4459(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!km", name = "e", descriptor = "()V")
	public abstract void method4460();

	@OriginalMember(owner = "client!km", name = "f", descriptor = "()V")
	public abstract void method4461();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!km", name = "g", descriptor = "()Z")
	public abstract boolean method4463();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public abstract void method4464(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!op;Lclient!op;FLclient!op;)Lclient!op;")
	public abstract Class21 method4465(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class21 arg3);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!gr;IIII)Lclient!ab;")
	public abstract Class3 method4466(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!sa;)V")
	public abstract void method4467(@OriginalArg(0) Class2_Sub34 arg0);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4468(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!km", name = "h", descriptor = "()Z")
	public abstract boolean method4469();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIII)V")
	public abstract void method4470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!km", name = "i", descriptor = "()Z")
	public abstract boolean method4471();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!ss;[Lclient!ua;Z)Lclient!oj;")
	public abstract Class13 method4472(@OriginalArg(0) Class216 arg0, @OriginalArg(1) Class224[] arg1);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)V")
	public abstract void method4474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!km", name = "j", descriptor = "()Z")
	public abstract boolean method4475();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IBIII)V")
	public final void method4476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4470(arg1, arg3, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(IIII)V")
	public abstract void method4477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!km", name = "k", descriptor = "()I")
	public abstract int method4478();

	@OriginalMember(owner = "client!km", name = "l", descriptor = "()F")
	public abstract float method4479();

	@OriginalMember(owner = "client!km", name = "m", descriptor = "()I")
	public abstract int method4480();

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public abstract void method4481(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIII)V")
	public abstract void method4482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)I")
	public abstract int method4483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!km", name = "n", descriptor = "()Z")
	public abstract boolean method4484();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!ab;Lclient!nd;Lclient!dr;Lclient!bm;I)V")
	public abstract void method4485(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class22_Sub1 arg3);

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(IIIIII)V")
	public final void method4486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4482(arg2, arg4, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!km", name = "o", descriptor = "()Z")
	public abstract boolean method4488();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[Lclient!rc;)V")
	public abstract void method4489(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub14[] arg1);

	@OriginalMember(owner = "client!km", name = "p", descriptor = "()I")
	public abstract int method4490();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIBI)V")
	public final void method4491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method4515(arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method4492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!km", name = "q", descriptor = "()Lclient!dr;")
	public abstract Class54 method4493();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!vb;II)V")
	public abstract void method4494(@OriginalArg(1) Class201 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!km", name = "r", descriptor = "()V")
	public abstract void method4495();

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
	public abstract void method4496(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIZ)V")
	public final void method4497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4539(arg0, arg3, arg4, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!km", name = "s", descriptor = "()Z")
	public abstract boolean method4498();

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(II)I")
	public abstract int method4499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(I)Lclient!sa;")
	public abstract Class2_Sub34 method4500();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIZ)Lclient!aq;")
	public abstract Class5 method4501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!km", name = "t", descriptor = "()Z")
	public abstract boolean method4502();

	@OriginalMember(owner = "client!km", name = "u", descriptor = "()Z")
	public abstract boolean method4503();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II[I[I)Lclient!vb;")
	public abstract Class201 method4504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4505();

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(IIII)V")
	public abstract void method4506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!km", name = "v", descriptor = "()V")
	public abstract void method4507();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!op;)V")
	public abstract void method4508(@OriginalArg(0) Class21 arg0);

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(IIIII)V")
	public final void method4509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method4511(arg1, arg3, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!nd;)V")
	public abstract void method4510(@OriginalArg(0) Class157 arg0);

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(IIIII)V")
	public abstract void method4511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!km", name = "w", descriptor = "()V")
	public abstract void method4512();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!ua;Z)Lclient!aq;")
	public abstract Class5 method4514(@OriginalArg(0) Class224 arg0);

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(IIIII)V")
	protected abstract void method4515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(FF)V")
	public abstract void method4516(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
	public abstract void method4517(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!km", name = "x", descriptor = "()I")
	public abstract int method4518();

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(II)V")
	public abstract void method4519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method4520(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!km", name = "y", descriptor = "()Z")
	public abstract boolean method4521();

	@OriginalMember(owner = "client!km", name = "g", descriptor = "(I)V")
	public abstract void method4522(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([I)V")
	public abstract void method4523(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(II)V")
	public abstract void method4524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IZIIII)V")
	public final void method4525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4552(arg4, arg2, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!km", name = "z", descriptor = "()V")
	public abstract void method4526();

	@OriginalMember(owner = "client!km", name = "A", descriptor = "()Z")
	public abstract boolean method4527();

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(IIII)[I")
	public abstract int[] method4528();

	@OriginalMember(owner = "client!km", name = "B", descriptor = "()I")
	public abstract int method4529();

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(IIIIII)Z")
	public abstract boolean method4530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III[I)V")
	public abstract void method4531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!km", name = "C", descriptor = "()I")
	public abstract int method4532();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!dr;)V")
	public abstract void method4533(@OriginalArg(0) Class54 arg0);

	@OriginalMember(owner = "client!km", name = "D", descriptor = "()V")
	protected abstract void method4534();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([Lclient!ab;Lclient!dr;[Lclient!bm;I)V")
	public abstract void method4535(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class22_Sub1[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4536(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(FFF)V")
	public abstract void method4537(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II[[I[[IIII)Lclient!dh;")
	public abstract Class33 method4538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(IIIIII)V")
	public abstract void method4539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIILclient!vb;II)V")
	public abstract void method4540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class201 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(IIIIII)Lclient!op;")
	public abstract Class21 method4541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(IIII)V")
	public abstract void method4542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!km", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method4553();
	}

	@OriginalMember(owner = "client!km", name = "E", descriptor = "()Z")
	public abstract boolean method4543();

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(IIII)V")
	public abstract void method4544();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([Lclient!ab;Lclient!nd;Lclient!dr;[Lclient!bm;I)V")
	public abstract void method4545(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class22_Sub1[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!km", name = "F", descriptor = "()F")
	public abstract float method4546();

	@OriginalMember(owner = "client!km", name = "G", descriptor = "()V")
	public abstract void method4547();

	@OriginalMember(owner = "client!km", name = "H", descriptor = "()V")
	public abstract void method4548();

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(Z)V")
	public abstract void method4549(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!km", name = "I", descriptor = "()Z")
	public abstract boolean method4550();

	@OriginalMember(owner = "client!km", name = "J", descriptor = "()Z")
	public abstract boolean method4551();

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(IIIIII)V")
	public abstract void method4552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!km", name = "h", descriptor = "(I)V")
	public final void method4553() {
		Static2.aBooleanArray84[this.anInt5188] = false;
		this.method4534();
	}

	@OriginalMember(owner = "client!km", name = "K", descriptor = "()Z")
	public abstract boolean method4554();

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(Z)V")
	public abstract void method4555(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!km", name = "L", descriptor = "()Lclient!dr;")
	public abstract Class54 method4556();

	@OriginalMember(owner = "client!km", name = "g", descriptor = "(IIII)V")
	public abstract void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
