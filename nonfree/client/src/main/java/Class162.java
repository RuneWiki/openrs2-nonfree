import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class162 {

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Lclient!fa;")
	public final Interface9 anInterface9_10;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "I")
	public final int anInt8492;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class162(@OriginalArg(0) Interface9 arg0) {
		this.anInterface9_10 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static497.aBooleanArray29[local10]) {
				local8 = local10;
				Static497.aBooleanArray29[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8492 = local8;
	}

	@OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
	public abstract void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public abstract void method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
	public abstract void method6811(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!rs;)V")
	public abstract void method6812(@OriginalArg(0) Class17 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public abstract void method6813(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6814(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)Lclient!rs;")
	public abstract Class17 method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method6816(@OriginalArg(0) Class25 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	public abstract Class84 method6817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
	public abstract boolean method6818();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
	public abstract void method6819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
	public abstract void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Lclient!e;")
	public abstract Class2_Sub12 method6820(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public final void method6821() {
		Static497.aBooleanArray29[this.anInt8492] = false;
		this.method6875();
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
	public abstract boolean method6822();

	@OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
	public abstract int[] v();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void method6823(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
	public abstract int T();

	@OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
	public abstract void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
	public abstract boolean method6824();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lclient!f;")
	public abstract Class38 method6825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V")
	public abstract void method6827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6828();

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
	public abstract void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
	public abstract boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public abstract void method6829(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public abstract void method6830(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6831(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
	public abstract void method6832();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	public abstract void method6833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class84 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)V")
	public final void method6834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.m(arg3, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public abstract boolean method6835();

	@OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
	public abstract void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!e;)V")
	public abstract void method6836(@OriginalArg(0) Class2_Sub12 arg0);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
	public abstract boolean method6837();

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()Z")
	public abstract boolean method6838();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ak;IIII)Lclient!da;")
	public abstract Class33 method6839(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()V")
	public abstract void method6840();

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()Z")
	public abstract boolean method6841();

	@OriginalMember(owner = "client!r", name = "k", descriptor = "()V")
	public abstract void method6842() throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()V")
	public abstract void method6843();

	@OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "()Lclient!q;")
	public abstract Class25 method6844();

	@OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ut;Z)Lclient!f;")
	public abstract Class38 method6845(@OriginalArg(0) Class344 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public abstract int method6846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()V")
	public abstract void method6847();

	@OriginalMember(owner = "client!r", name = "o", descriptor = "()Z")
	public abstract boolean method6848();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
	public final void method6849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6810(arg0, arg2, arg3, arg1, arg4, 1);
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public abstract void method6850(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
	public abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
	public abstract int BA();

	@OriginalMember(owner = "client!r", name = "p", descriptor = "()I")
	public abstract int method6851();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method6852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
	public abstract boolean method6853();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6854(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;Z)V")
	protected abstract void method6855(@OriginalArg(0) Class38 arg0);

	@OriginalMember(owner = "client!r", name = "r", descriptor = "()Z")
	public abstract boolean method6856();

	@OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "s", descriptor = "()V")
	public abstract void method6857();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	public abstract Class151 method6858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public final void method6859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg2, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!uo;)V")
	public abstract void method6860(@OriginalArg(0) Class339 arg0);

	@OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
	public abstract void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "t", descriptor = "()V")
	public abstract void method6861();

	@OriginalMember(owner = "client!r", name = "u", descriptor = "()Lclient!q;")
	public abstract Class25 method6862();

	@OriginalMember(owner = "client!r", name = "w", descriptor = "()Lclient!pg;")
	public abstract Class267 method6863();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fo;[Lclient!ut;Z)Lclient!la;")
	public abstract Class37 method6864(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class344[] arg1);

	@OriginalMember(owner = "client!r", name = "x", descriptor = "()Z")
	public abstract boolean method6865();

	@OriginalMember(owner = "client!r", name = "y", descriptor = "()Z")
	public abstract boolean method6866();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lclient!tg;")
	public abstract Class2_Sub11 method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class38 method6868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method6869(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	public abstract void method6870(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "z", descriptor = "()Z")
	public abstract boolean method6872();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIB)V")
	public final void method6873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.XA(arg2, arg1, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lclient!tg;)V")
	public abstract void method6874(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub11[] arg1);

	@OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
	protected abstract void method6875();

	@OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
	public abstract void JA();

	@OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
	public abstract int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class38 method6879(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
	public abstract boolean method6880();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(II)I")
	public abstract int method6881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!rs;Lclient!rs;FLclient!rs;)Lclient!rs;")
	public abstract Class17 method6882(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!uo;I)V")
	public abstract void method6883(@OriginalArg(0) Class339 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6884(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V")
	public final void method6885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.J(arg3, arg0, arg2, arg4, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
	public abstract void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;B)V")
	public final void method6886(@OriginalArg(0) Class38 arg0) {
		this.method6855(arg0);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public abstract void method6887(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(IIIIII)V")
	public final void method6888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6827(arg4, arg3, arg2, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILclient!ua;II)V")
	public abstract void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!r", name = "C", descriptor = "()Lclient!q;")
	public abstract Class25 method6889();

	@OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6821();
	}

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
