import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class121 {

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "[B")
	public static final byte[] aByteArray113;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!e;")
	public final Interface7 anInterface7_14;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
	public final int anInt8715;

	static {
		@Pc(1) int local1 = 0;
		aByteArray113 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray113[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!e;)V")
	public Class121(@OriginalArg(0) Interface7 arg0) {
		this.anInterface7_14 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static229.aBooleanArray24[local10]) {
				local8 = local10;
				Static229.aBooleanArray24[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8715 = local8;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
	public abstract boolean method7081();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lclient!hj;")
	public abstract Class6_Sub7 method7082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	public abstract Class16 method7083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
	public abstract void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
	public abstract void method7084();

	@OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()I")
	public abstract int method7085();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public abstract void method7086(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ob;)V")
	public abstract void method7087(@OriginalArg(0) Class222 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!rf;IIII)Lclient!ba;")
	public abstract Class22 method7088(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public abstract void method7089(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
	public abstract void method7090();

	@OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
	public abstract void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	public abstract Class4 method7091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
	public abstract int SA();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
	public abstract boolean method7093();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	public abstract void method7094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()Lclient!q;")
	public abstract Class34 method7096();

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()Z")
	public abstract boolean method7097();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	public abstract void method7098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class16 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public abstract int method7099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public abstract void method7100(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7101(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	public abstract void method7102(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
	public abstract boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
	public abstract boolean method7103();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!aq;Lclient!aq;FLclient!aq;)Lclient!aq;")
	public abstract Class17 method7104(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public abstract void method7105(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	public final void method7106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.h(arg1, arg2, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Lclient!i;")
	public abstract Class6_Sub24 method7107(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!aq;)V")
	public abstract void method7108(@OriginalArg(0) Class17 arg0);

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
	public abstract int v();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
	public final void method7109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.C(arg3, arg0, arg1, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
	public abstract int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lclient!xa;")
	public abstract Class4 method7110(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7116();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7112(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)Lclient!aq;")
	public abstract Class17 method7113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()V")
	public abstract void method7114();

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
	public abstract void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7115();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	public final void method7116() {
		Static229.aBooleanArray24[this.anInt8715] = false;
		this.method7125();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Lclient!i;)V")
	public abstract void method7117(@OriginalArg(0) Class6_Sub24 arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ba;Lclient!ob;Lclient!q;Lclient!qn;I)V")
	public abstract void method7118(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class102_Sub5 arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	public abstract void method7119(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7120(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class60 method7121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
	public abstract int aa();

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
	public abstract boolean method7122();

	@OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILclient!fa;II)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!il;[Lclient!me;Z)Lclient!ta;")
	public abstract Class56 method7123(@OriginalArg(0) Class146 arg0, @OriginalArg(1) Class196[] arg1);

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()Lclient!ru;")
	public abstract Class282 method7124();

	@OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
	public abstract void ha(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
	protected abstract void method7125();

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
	public abstract boolean method7126();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
	public abstract void method7127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
	public abstract void method7128() throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Z)V")
	public abstract void method7129(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
	public abstract void method7130();

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
	public abstract boolean method7131();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7132(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method7133(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
	public abstract boolean method7134();

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(Z)V")
	public abstract void method7135(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
	public abstract int IA();

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!qn;I)V")
	public abstract void method7136(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class102_Sub5[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
	public abstract void method7137(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
	public abstract void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
	public final void method7138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg3, arg1, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
	public abstract boolean method7139();

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIII)V")
	public final void method7140(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.ya(arg0, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
	public abstract boolean method7141();

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
	public abstract boolean method7142();

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
	public abstract boolean method7143();

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
	public abstract boolean method7145();

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
	public abstract void A(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
	public abstract void k();

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()Lclient!q;")
	public abstract Class34 method7146();

	@OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
	public abstract void method7147();

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "()Z")
	public abstract boolean method7148();

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
	protected abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIII)V")
	public final void method7149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7094(arg4, arg3, arg1, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
	public abstract int method7150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lclient!ba;Lclient!ob;Lclient!q;[Lclient!qn;I)V")
	public abstract void method7151(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class102_Sub5[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	public abstract void method7152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "()V")
	public abstract void method7155();

	@OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
	public abstract void JA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7156(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!me;Z)Lclient!xa;")
	public abstract Class4 method7157(@OriginalArg(0) Class196 arg0);

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
	public abstract void F();

	@OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
	public abstract void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lclient!hj;)V")
	public abstract void method7158(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub7[] arg1);

	@OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
	public abstract void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "()Z")
	public abstract boolean method7159();

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
	public abstract void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V")
	public final void method7160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7127(arg3, arg1, arg0, arg4, arg2, 1);
	}
}
