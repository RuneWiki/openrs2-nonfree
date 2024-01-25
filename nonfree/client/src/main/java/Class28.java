import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public abstract class Class28 {

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
	public final int anInt3899;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "Lclient!vl;")
	public final Interface11 anInterface11_6;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(ILclient!vl;)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		this.anInt3899 = arg0;
		this.anInterface11_6 = arg1;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!pm;[Lclient!fd;Z)Lclient!wn;")
	public abstract Class92 method3476(@OriginalArg(0) Class201 arg0, @OriginalArg(1) Class77[] arg1);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V")
	public final void method3477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method3551(arg3, arg0, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "()I")
	public abstract int method3478();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V")
	public abstract void method3479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V")
	public abstract void method3480(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "()Z")
	public abstract boolean method3481();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIF)Lclient!ki;")
	public abstract Class6_Sub6 method3482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Z)V")
	public abstract void method3483(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIILclient!be;II)V")
	public abstract void method3484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class24 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "()I")
	public abstract int method3485();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIII)Lclient!lf;")
	public abstract Class133 method3486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII)[I")
	public abstract int[] method3487();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!ii;)V")
	public abstract void method3488(@OriginalArg(0) Class115 arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method3489(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	public abstract void method3490(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "()Z")
	public abstract boolean method3491();

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method3492(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "()Z")
	public abstract boolean method3493();

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
	public abstract void method3495(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!wr;IIII)Lclient!cd;")
	public abstract Class39 method3496(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "()V")
	public abstract void method3497();

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V")
	public abstract void method3498(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "()Z")
	public abstract boolean method3499();

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
	public abstract void method3500(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([Lclient!cd;Lclient!ii;Lclient!ql;[Lclient!ni;I)V")
	public abstract void method3501(@OriginalArg(0) Class39[] arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(3) Class48_Sub7[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!lf;)V")
	public abstract void method3502(@OriginalArg(0) Class133 arg0);

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "()V")
	public abstract void method3503();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[Lclient!ki;)V")
	public abstract void method3504(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub6[] arg1);

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(Z)V")
	public abstract void method3505(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(IIIIII)V")
	public abstract void method3506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[[I[[IIII)Lclient!fo;")
	public abstract Class84 method3507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(IIIIII)V")
	public final void method3508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method3506(arg2, arg4, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!ql;)V")
	public abstract void method3509(@OriginalArg(0) Class132 arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method3510();

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(IIIIII)Z")
	public abstract boolean method3511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([IIIII)Lclient!ig;")
	public abstract Class12 method3512(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "()Lclient!ql;")
	public abstract Class132 method3513();

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "()Z")
	public abstract boolean method3514();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[I[I)Lclient!be;")
	public abstract Class24 method3515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)Lclient!pt;")
	public abstract Class6_Sub27 method3516();

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "()I")
	public abstract int method3517();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIZ)Lclient!ig;")
	public abstract Class12 method3518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(IIII)V")
	public abstract void method3519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[I)V")
	public abstract void method3520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(FFF)V")
	public abstract void method3521(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "()Z")
	public abstract boolean method3522();

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(IIIIII)V")
	public final void method3523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method3579(arg4, arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([I)V")
	public abstract void method3524(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method3525(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIIII)V")
	public final void method3526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method3568(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method3527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(IIII)V")
	public abstract void method3528();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method3529(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "()Z")
	public abstract boolean method3530();

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(IIIIII)V")
	public final void method3531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method3559(arg0, arg2, arg4, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)I")
	public abstract int method3532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "()V")
	public abstract void method3533();

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(IIIII)V")
	public final void method3534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method3547(arg0, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)V")
	public abstract void method3535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(IIII)V")
	public abstract void method3536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "()Z")
	public abstract boolean method3537();

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)I")
	public abstract int method3539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!fd;Z)Lclient!ig;")
	public abstract Class12 method3540(@OriginalArg(0) Class77 arg0);

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "()Z")
	public abstract boolean method3541();

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "()V")
	public abstract void method3542();

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "()I")
	public abstract int method3543();

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)V")
	public abstract void method3544(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method3545(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "()V")
	public abstract void method3546();

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(IIIII)V")
	public abstract void method3547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "()I")
	public abstract int method3548();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!pt;)V")
	public abstract void method3549(@OriginalArg(0) Class6_Sub27 arg0);

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "()Z")
	public abstract boolean method3550();

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(IIIII)V")
	public abstract void method3551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qq", name = "v", descriptor = "()V")
	public abstract void method3552();

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)V")
	public abstract void method3553(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qq", name = "w", descriptor = "()V")
	public abstract void method3554();

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "()Z")
	public abstract boolean method3555();

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "()F")
	public abstract float method3556();

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "()Z")
	public abstract boolean method3557();

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method3558(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(IIIIII)V")
	public abstract void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "(I)V")
	public final void method3562() {
		Static130.aBooleanArray14[this.anInt3899] = false;
		this.method3578();
	}

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "()Z")
	public abstract boolean method3563();

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "()Lclient!ql;")
	public abstract Class132 method3564();

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(IIII)V")
	public abstract void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "([Lclient!cd;Lclient!ql;[Lclient!ni;I)V")
	public abstract void method3566(@OriginalArg(0) Class39[] arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) Class48_Sub7[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "(I)V")
	public abstract void method3567(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(IIIII)V")
	protected abstract void method3568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qq", name = "C", descriptor = "()Z")
	public abstract boolean method3569();

	@OriginalMember(owner = "client!qq", name = "f", descriptor = "(IIII)V")
	public abstract void method3570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!cd;Lclient!ii;Lclient!ql;Lclient!ni;I)V")
	public abstract void method3571(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(3) Class48_Sub7 arg3);

	@OriginalMember(owner = "client!qq", name = "D", descriptor = "()F")
	public abstract float method3572();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!lf;Lclient!lf;FLclient!lf;)Lclient!lf;")
	public abstract Class133 method3573(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class133 arg3);

	@OriginalMember(owner = "client!qq", name = "E", descriptor = "()I")
	public abstract int method3574();

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "(IIII)V")
	public abstract void method3575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "()Z")
	public abstract boolean method3576();

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "()V")
	protected abstract void method3578();

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "(IIIIII)V")
	public abstract void method3579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qq", name = "H", descriptor = "()V")
	public abstract void method3580();

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(FF)V")
	public abstract void method3581(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!be;II)V")
	public abstract void method3582(@OriginalArg(1) Class24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(F)V")
	public abstract void method3583(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method3562();
	}
}
