import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class Class39 {

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
	public final int anInt5452;

	@OriginalMember(owner = "client!ya", name = "o", descriptor = "Lclient!ga;")
	public final Interface4 anInterface4_12;

	static {
		new Class7("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(ILclient!ga;)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInt5452 = arg0;
		this.anInterface4_12 = arg1;
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4492(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
	public abstract void method4493(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	public abstract void method4494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class133 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "()V")
	public abstract void e();

	@OriginalMember(owner = "client!ya", name = "H", descriptor = "(IIII)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	public abstract Class143 method4495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ya", name = "ca", descriptor = "(ILclient!ma;II)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "B", descriptor = "(F)V")
	public abstract void B(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4496(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!ju;I)V")
	public abstract void method4497(@OriginalArg(0) Class105[] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class4_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4498(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "xa", descriptor = "()F")
	public abstract float xa();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIII)V")
	public final void method4499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4513(arg1, arg3, arg2, arg4, arg0, 1);
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIII)V")
	public final void method4500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.TA(arg2, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIIZ)V")
	public final void method4501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.b(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lclient!t;Lclient!kp;Lclient!c;[Lclient!ju;I)V")
	public abstract void method4502(@OriginalArg(0) Class105[] arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class4_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "F", descriptor = "(IIII)[I")
	public abstract int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!u;)V")
	public abstract void method4503(@OriginalArg(0) Class1_Sub41 arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Z)V")
	public abstract void method4504(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "()Z")
	public abstract boolean method4505();

	@OriginalMember(owner = "client!ya", name = "O", descriptor = "(IIIIII)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4506();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIII)V")
	public abstract void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIII)V")
	public final void method4509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.NA(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(Z)V")
	public abstract void method4510(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
	public abstract void method4511(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "()Lclient!c;")
	public abstract Class33 method4512();

	@OriginalMember(owner = "client!ya", name = "ia", descriptor = "(II)V")
	public abstract void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIIII)V")
	public abstract void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4514(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4523();
	}

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "()Z")
	public abstract boolean method4515();

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "()Lclient!c;")
	public abstract Class33 method4516();

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "()V")
	public abstract void method4517();

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIIII)Lclient!pc;")
	public abstract Class16 method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "YA", descriptor = "()I")
	public abstract int YA();

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4519(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "()I")
	public abstract int method4520();

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(I)V")
	public abstract void method4521(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(I)V")
	public final void method4523() {
		Static225.aBooleanArray30[this.anInt5452] = false;
		this.method4553();
	}

	@OriginalMember(owner = "client!ya", name = "i", descriptor = "()V")
	public abstract void method4524();

	@OriginalMember(owner = "client!ya", name = "j", descriptor = "()Z")
	public abstract boolean method4525();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "()I")
	public abstract int a();

	@OriginalMember(owner = "client!ya", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "JA", descriptor = "(IIIIII)Z")
	public abstract boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!t;Lclient!kp;Lclient!c;Lclient!ju;I)V")
	public abstract void method4526(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class4_Sub5 arg3);

	@OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IIII)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(II)I")
	public abstract int method4528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "w", descriptor = "()I")
	public abstract int w();

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "(IIIIII)V")
	public final void method4529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4555(arg1, arg0, arg4, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(II)I")
	public abstract int method4530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "(I)V")
	public abstract void method4531(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "k", descriptor = "()V")
	public abstract void method4533();

	@OriginalMember(owner = "client!ya", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIF)Lclient!qp;")
	public abstract Class1_Sub31 method4534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ya", name = "m", descriptor = "()Z")
	public abstract boolean method4535();

	@OriginalMember(owner = "client!ya", name = "T", descriptor = "(IFFFFF)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	public abstract Class133 method4536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ya", name = "DA", descriptor = "(IIIIII[BII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ya", name = "n", descriptor = "()Z")
	public abstract boolean method4537();

	@OriginalMember(owner = "client!ya", name = "o", descriptor = "()Z")
	public abstract boolean method4538();

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "(Z)V")
	public abstract void method4539(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!tp;IIII)Lclient!t;")
	public abstract Class105 method4540(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "l", descriptor = "()V")
	public abstract void l();

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "()Z")
	public abstract boolean method4542();

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "(I)V")
	public abstract void method4543(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "W", descriptor = "()F")
	public abstract float W();

	@OriginalMember(owner = "client!ya", name = "NA", descriptor = "(IIIII)V")
	protected abstract void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "(I)Lclient!u;")
	public abstract Class1_Sub41 method4544(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!pc;Lclient!pc;FLclient!pc;)Lclient!pc;")
	public abstract Class16 method4545(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class16 arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(FFF)V")
	public abstract void method4546(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ya", name = "q", descriptor = "()Z")
	public abstract boolean method4547();

	@OriginalMember(owner = "client!ya", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ya", name = "GA", descriptor = "(IIII)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
	public abstract void method4548();

	@OriginalMember(owner = "client!ya", name = "fa", descriptor = "(IIII)V")
	public abstract void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!di;Z)Lclient!l;")
	public abstract Class143 method4549(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!ya", name = "s", descriptor = "()Z")
	public abstract boolean method4550();

	@OriginalMember(owner = "client!ya", name = "t", descriptor = "()Z")
	public abstract boolean method4551();

	@OriginalMember(owner = "client!ya", name = "u", descriptor = "()Z")
	public abstract boolean method4552();

	@OriginalMember(owner = "client!ya", name = "v", descriptor = "()V")
	protected abstract void method4553();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([IIIII)Lclient!l;")
	public abstract Class143 method4554(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!ya", name = "da", descriptor = "([I)V")
	public abstract void da(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "(IIIIII)V")
	public abstract void method4555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ya", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!ya", name = "x", descriptor = "()Z")
	public abstract boolean method4556();

	@OriginalMember(owner = "client!ya", name = "y", descriptor = "()Z")
	public abstract boolean method4557();

	@OriginalMember(owner = "client!ya", name = "X", descriptor = "(III[I)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ya", name = "z", descriptor = "()V")
	public abstract void method4558();

	@OriginalMember(owner = "client!ya", name = "A", descriptor = "()Z")
	public abstract boolean method4559();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(I[Lclient!qp;)V")
	public abstract void method4560(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub31[] arg1);

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "(I)V")
	public abstract void p(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	public abstract Class149 method4561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ya", name = "ea", descriptor = "(Lclient!c;)V")
	public abstract void ea(@OriginalArg(0) Class33 arg0);

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "(IIIIII)V")
	public final void method4563(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.O(arg3, arg0, arg2, arg4, arg1, 1);
	}

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "(FF)V")
	public abstract void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!lm;[Lclient!di;Z)Lclient!la;")
	public abstract Class71 method4564(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class51[] arg1);

	@OriginalMember(owner = "client!ya", name = "B", descriptor = "()V")
	public abstract void method4565();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!kp;)V")
	public abstract void method4566(@OriginalArg(0) Class140 arg0);

	@OriginalMember(owner = "client!ya", name = "TA", descriptor = "(IIIII)V")
	public abstract void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!pc;)V")
	public abstract void method4567(@OriginalArg(0) Class16 arg0);

	@OriginalMember(owner = "client!ya", name = "UA", descriptor = "(III)V")
	public abstract void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ya", name = "C", descriptor = "()Z")
	public abstract boolean method4568();
}
