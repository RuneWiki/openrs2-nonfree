import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class14 {

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!e;")
	public final Interface4 anInterface4_15;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public final int anInt8396;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!e;)V")
	public Class14(@OriginalArg(0) Interface4 arg0) {
		this.anInterface4_15 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static369.aBooleanArray28[local10]) {
				Static369.aBooleanArray28[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8396 = local8;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!xa;Z)V")
	protected abstract void method6821(@OriginalArg(0) Class58 arg0);

	@OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
	public abstract void F();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public abstract void method6822(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6823(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public final void method6824() {
		Static369.aBooleanArray28[this.anInt8396] = false;
		this.method6839();
	}

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
	public abstract int aa();

	@OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
	public abstract int v();

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
	public abstract void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
	public abstract boolean method6826();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!bj;")
	public abstract Class6_Sub7 method6827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method6829(@OriginalArg(0) Class54 arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
	public abstract boolean method6830();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	public abstract void method6831(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	public abstract boolean method6832();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!nj;IIII)Lclient!ba;")
	public abstract Class20 method6833(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
	public abstract void method6834();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ip;)V")
	public abstract void method6835(@OriginalArg(0) Class26 arg0);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	public abstract boolean method6836();

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
	public abstract boolean method6837();

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()Z")
	public abstract boolean method6838();

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
	protected abstract void method6839();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	public abstract Class86 method6840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()V")
	public abstract void method6841();

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	public abstract boolean method6842();

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()V")
	public abstract void method6843();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6844(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	public final void method6845(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ya(arg2, arg3, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
	public abstract boolean method6846();

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()I")
	public abstract int method6847();

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
	public abstract void method6848() throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
	public abstract boolean method6849();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public abstract void method6850(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
	protected abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
	public abstract void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Lclient!q;")
	public abstract Class54 method6851();

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
	public abstract void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!xa;B)V")
	public final void method6853(@OriginalArg(0) Class58 arg0) {
		this.method6821(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ub;[Lclient!iba;Z)Lclient!ta;")
	public abstract Class92 method6854(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class140[] arg1);

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILclient!fa;II)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ba;Lclient!ig;Lclient!q;Lclient!po;I)V")
	public abstract void method6856(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class59 method6857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()V")
	public abstract void method6858();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIIIII)V")
	public final void method6859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.C(arg2, arg1, arg0, arg4, arg3, 1);
	}

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
	public abstract void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public abstract void method6861(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!xa;")
	public abstract Class58 method6862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lclient!xa;")
	public abstract Class58 method6863(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	public abstract void method6864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method6865(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZI)V")
	public final void method6866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method6894(arg0, arg1, arg2, arg4, arg3, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIZI)V")
	public final void method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.h(arg3, arg1, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6868();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!bj;)V")
	public abstract void method6869(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub7[] arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ip;Lclient!ip;FLclient!ip;)Lclient!ip;")
	public abstract Class26 method6870(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class26 arg3);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Lclient!taa;")
	public abstract Class312 method6871();

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!ig;Lclient!q;[Lclient!po;I)V")
	public abstract void method6872(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class98_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
	public abstract void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public abstract void method6873(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	public abstract Class58 method6874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	public abstract void method6875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	public abstract boolean method6876();

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	public abstract void k();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	public abstract void method6877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class86 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	public abstract void method6878(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public abstract int method6879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	public abstract void method6880(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()V")
	public abstract void method6881();

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lclient!q;")
	public abstract Class54 method6882();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)Lclient!ip;")
	public abstract Class26 method6883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	public abstract int method6884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!po;I)V")
	public abstract void method6885(@OriginalArg(0) Class20[] arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class98_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	public abstract boolean method6886();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
	public abstract void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
	public abstract boolean method6887();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ig;)V")
	public abstract void method6888(@OriginalArg(0) Class144 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!iba;Z)Lclient!xa;")
	public abstract Class58 method6889(@OriginalArg(0) Class140 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
	public abstract void method6890();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lclient!i;)V")
	public abstract void method6891(@OriginalArg(0) Class6_Sub15 arg0);

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
	public abstract int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
	public abstract int SA();

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()V")
	public abstract void method6892();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()Z")
	public abstract boolean method6895();

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "()Z")
	public abstract boolean method6896();

	@OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
	public abstract void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public abstract void method6897(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
	public abstract void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Lclient!i;")
	public abstract Class6_Sub15 method6898(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
	public final void method6899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.e(arg2, arg3, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6824();
	}

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
	public abstract boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6900(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()Z")
	public abstract boolean method6901();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6902(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIB)V")
	public final void method6904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6875(arg2, arg3, arg4, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	public abstract void method6905(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
