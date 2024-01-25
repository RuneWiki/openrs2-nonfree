import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class134 {

	@OriginalMember(owner = "client!r", name = "k", descriptor = "Lclient!fa;")
	public final Interface7 anInterface7_10;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "I")
	public final int anInt8508;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class134(@OriginalArg(0) Interface7 arg0) {
		this.anInterface7_10 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static519.aBooleanArray23[local10]) {
				Static519.aBooleanArray23[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8508 = local8;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public final void method6894(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.XA(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
	public abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!jba;Lclient!jba;FLclient!jba;)Lclient!jba;")
	public abstract Class83 method6895(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class83 arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fg;Z)Lclient!f;")
	public abstract Class22 method6896(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
	public abstract boolean method6897();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()V")
	public abstract void method6898();

	@OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
	public abstract void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!uq;[Lclient!fg;Z)Lclient!la;")
	public abstract Class64 method6899(@OriginalArg(0) Class334 arg0, @OriginalArg(1) Class102[] arg1);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
	public abstract boolean method6900();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6901(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	public abstract Class47 method6902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public abstract void method6903(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
	public abstract void method6904();

	@OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
	public abstract void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
	public abstract void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public abstract boolean method6905();

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
	public abstract boolean method6906();

	@OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()V")
	public abstract void method6907();

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()Z")
	public abstract boolean method6908();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6909(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!lm;IIII)Lclient!da;")
	public abstract Class63 method6910(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)Lclient!jba;")
	public abstract Class83 method6911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()Z")
	public abstract boolean method6912();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!jba;)V")
	public abstract void method6913(@OriginalArg(0) Class83 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method6914(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	public abstract int method6915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!e;)V")
	public abstract void method6916(@OriginalArg(0) Class1_Sub5 arg0);

	@OriginalMember(owner = "client!r", name = "k", descriptor = "()Z")
	public abstract boolean method6917();

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
	public abstract int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
	public abstract int[] v();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class22 method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method6919(@OriginalArg(0) Class113 arg0);

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()Lclient!q;")
	public abstract Class113 method6920();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	public abstract void method6921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class204 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
	public abstract void method6922(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
	public abstract boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "()V")
	protected abstract void method6923();

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()Lclient!q;")
	public abstract Class113 method6924();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public abstract void method6925(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIZ)V")
	public final void method6926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.e(arg0, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
	public final void method6927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6958(arg4, arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lclient!rc;")
	public abstract Class1_Sub18 method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V")
	public final void method6929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.J(arg2, arg1, arg0, arg4, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;Z)V")
	protected abstract void method6930(@OriginalArg(0) Class22 arg0);

	@OriginalMember(owner = "client!r", name = "o", descriptor = "()Z")
	public abstract boolean method6931();

	@OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
	public abstract void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6932();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIBI)V")
	public final void method6933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method6959(arg0, arg3, arg4, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!r", name = "p", descriptor = "()V")
	public abstract void method6934();

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
	public abstract int BA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!f;)V")
	public final void method6935(@OriginalArg(1) Class22 arg0) {
		this.method6930(arg0);
	}

	@OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
	public abstract boolean method6936();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6937(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public final void method6939() {
		Static519.aBooleanArray23[this.anInt8508] = false;
		this.method6923();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!vi;)V")
	public abstract void method6940(@OriginalArg(0) Class343 arg0);

	@OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
	public abstract void method6941(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
	public abstract void method6942(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public abstract void method6943(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
	public abstract int T();

	@OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
	public abstract void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "r", descriptor = "()V")
	public abstract void method6944() throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	public abstract Class204 method6945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6946(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!vi;I)V")
	public abstract void method6947(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V")
	public final void method6948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.m(arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lclient!f;")
	public abstract Class22 method6950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "s", descriptor = "()Z")
	public abstract boolean method6951();

	@OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
	public abstract void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
	public abstract boolean method6952();

	@OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
	public abstract void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lclient!rc;)V")
	public abstract void method6953(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18[] arg1);

	@OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "u", descriptor = "()Z")
	public abstract boolean method6954();

	@OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!r", name = "w", descriptor = "()I")
	public abstract int method6955();

	@OriginalMember(owner = "client!r", name = "x", descriptor = "()Z")
	public abstract boolean method6956();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
	public abstract void method6958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V")
	public abstract void method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
	public abstract void JA();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public abstract void method6961(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6939();
	}

	@OriginalMember(owner = "client!r", name = "y", descriptor = "()Lclient!is;")
	public abstract Class162 method6962();

	@OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILclient!ua;II)V")
	public abstract void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "z", descriptor = "()Lclient!q;")
	public abstract Class113 method6963();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)Lclient!e;")
	public abstract Class1_Sub5 method6964(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	public abstract void method6965(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void method6966(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public abstract int method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "A", descriptor = "()Z")
	public abstract boolean method6968();

	@OriginalMember(owner = "client!r", name = "B", descriptor = "()V")
	public abstract void method6969();

	@OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class22 method6970(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!r", name = "C", descriptor = "()V")
	public abstract void method6971();
}
