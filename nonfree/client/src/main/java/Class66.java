import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class66 {

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!e;")
	public final Interface3 anInterface3_15;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public final int anInt8223;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!e;)V")
	public Class66(@OriginalArg(0) Interface3 arg0) {
		this.anInterface3_15 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static563.aBooleanArray39[local10]) {
				Static563.aBooleanArray39[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8223 = local8;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	public abstract Class75 method6775(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class75 arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBII)V")
	public final void method6776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.h(arg2, arg3, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIII)V")
	public final void method6777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6826(arg3, arg1, arg2, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
	public abstract boolean method6778();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pf;IIII)Lclient!ba;")
	public abstract Class9 method6779(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
	public abstract void method6780();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
	public abstract boolean method6781();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	public final void method6782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ya(arg1, arg3, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
	public abstract void method6783();

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
	public abstract void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
	public abstract void method6784();

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
	public abstract void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!pv;)V")
	public abstract void method6785(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub32[] arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	public abstract void method6786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public abstract void method6787(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Lclient!q;")
	public abstract Class134 method6788();

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()Z")
	public abstract boolean method6789();

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
	public abstract void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
	public abstract int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
	public abstract void method6790();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!pv;")
	public abstract Class4_Sub32 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6792(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()Z")
	public abstract boolean method6793();

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIB)V")
	public final void method6794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.C(arg1, arg3, arg0, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
	public abstract void method6795();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class16 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!c;Lclient!q;[Lclient!ot;I)V")
	public abstract void method6798(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!pga;Z)Lclient!xa;")
	public abstract Class13 method6799(@OriginalArg(0) Class268 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lclient!i;)V")
	public abstract void method6800(@OriginalArg(0) Class4_Sub6 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	public abstract Class13 method6802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!dn;)V")
	public abstract void method6803(@OriginalArg(0) Class75 arg0);

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
	public abstract boolean method6804();

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	public abstract void k();

	@OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILclient!fa;II)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
	public abstract int aa();

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
	protected abstract void method6805();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	public abstract void method6806(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ba;Lclient!c;Lclient!q;Lclient!ot;I)V")
	public abstract void method6807(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class26_Sub5 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
	public abstract void method6808();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)Lclient!dn;")
	public abstract Class75 method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!xa;Z)V")
	protected abstract void method6811(@OriginalArg(0) Class13 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method6812(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public abstract void method6813(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
	public abstract boolean method6814();

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
	public abstract void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6815(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6816();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
	public final void method6817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg0, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public abstract int method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6838();
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
	public abstract boolean method6820();

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	public abstract boolean method6821();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIIIII)V")
	public final void method6822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6786(arg0, arg3, arg4, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method6823(@OriginalArg(0) Class134 arg0);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public abstract void method6824(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	public abstract void method6825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method6826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!xa;)V")
	public final void method6827(@OriginalArg(1) Class13 arg0) {
		this.method6811(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
	protected abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
	public abstract boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	public abstract boolean method6828();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!kga;[Lclient!pga;Z)Lclient!ta;")
	public abstract Class91 method6829(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class268[] arg1);

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
	public abstract void method6830();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	public abstract int method6831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()I")
	public abstract int method6832();

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Lclient!i;")
	public abstract Class4_Sub6 method6833(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	public abstract boolean method6834();

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	public abstract void method6835(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lclient!ffa;")
	public abstract Class105 method6836();

	@OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
	public abstract int SA();

	@OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
	public abstract void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	public abstract boolean method6837();

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
	public final void method6838() {
		Static563.aBooleanArray39[this.anInt8223] = false;
		this.method6805();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public abstract void method6839(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
	public abstract void method6840(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
	public abstract void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
	public abstract void F();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	public abstract Class98 method6841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
	public abstract int v();

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
	public abstract void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Lclient!q;")
	public abstract Class134 method6842();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lclient!xa;")
	public abstract Class13 method6843(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	public abstract void method6844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class98 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
	public abstract void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ot;I)V")
	public abstract void method6845(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class26_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!c;)V")
	public abstract void method6846(@OriginalArg(0) Class42 arg0);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
	public abstract void method6847() throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Z")
	public abstract boolean method6848();

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()Z")
	public abstract boolean method6849();

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "()Z")
	public abstract boolean method6850();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	public abstract void method6851(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "()Z")
	public abstract boolean method6852();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6853(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6854(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lclient!xa;")
	public abstract Class13 method6856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	public abstract void method6857(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
	public abstract int U();
}
