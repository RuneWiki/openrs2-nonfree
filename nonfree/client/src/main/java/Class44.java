import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class44 {

	@OriginalMember(owner = "client!r", name = "m", descriptor = "Lclient!fa;")
	public final Interface11 anInterface11_11;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	public final int anInt5872;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class44(@OriginalArg(0) Interface11 arg0) {
		this.anInterface11_11 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static182.aBooleanArray5[local10]) {
				local8 = local10;
				Static182.aBooleanArray5[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt5872 = local8;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class78 method4964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
	public abstract boolean method4965();

	@OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4966(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	public abstract Class83 method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
	public abstract int BA();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4968(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class78 method4969(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)Lclient!caa;")
	public abstract Class36 method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public final void method4971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg1, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()I")
	public abstract int method4972();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public abstract void method4973(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIBI)V")
	public final void method4974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.XA(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
	public abstract boolean method4975();

	@OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
	public abstract int T();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
	public abstract boolean method4976();

	@OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public abstract boolean method4977();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method4978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lclient!ul;")
	public abstract Class4_Sub24 method4979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void method4980(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method4981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!caa;)V")
	public abstract void method4982(@OriginalArg(0) Class36 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!gda;[Lclient!pga;Z)Lclient!la;")
	public abstract Class58 method4983(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class261[] arg1);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()V")
	public abstract void method4984();

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()Lclient!ik;")
	public abstract Class155 method4985();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method4986(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
	public abstract void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!e;)V")
	public abstract void method4988(@OriginalArg(0) Class4_Sub8 arg0);

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()Z")
	public abstract boolean method4989();

	@OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
	public abstract void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()V")
	public abstract void method4990();

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public abstract void method4991(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
	public abstract void method4992(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
	public abstract void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!r", name = "k", descriptor = "()Z")
	public abstract boolean method4993();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method4994(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	public abstract void method4995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class6 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
	public abstract void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	public abstract Class6 method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method4998();

	@OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method4999(@OriginalArg(0) Class8 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lclient!ul;)V")
	public abstract void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub24[] arg1);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V")
	public abstract void method5001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
	public abstract void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()V")
	public abstract void method5003();

	@OriginalMember(owner = "client!r", name = "m", descriptor = "()Z")
	public abstract boolean method5004();

	@OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!caa;Lclient!caa;FLclient!caa;)Lclient!caa;")
	public abstract Class36 method5005(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class36 arg3);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
	public final void method5006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.J(arg0, arg2, arg1, arg4, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()Lclient!q;")
	public abstract Class8 method5007();

	@OriginalMember(owner = "client!r", name = "o", descriptor = "()Z")
	public abstract boolean method5008();

	@OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5033();
	}

	@OriginalMember(owner = "client!r", name = "p", descriptor = "()V")
	public abstract void method5009();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public abstract int method5010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
	public abstract void method5011(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5012(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "q", descriptor = "()V")
	public abstract void method5013() throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;B)V")
	public final void method5015(@OriginalArg(0) Class78 arg0) {
		this.method5024(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!kk;IIII)Lclient!da;")
	public abstract Class57 method5016(@OriginalArg(0) Class191 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!so;)V")
	public abstract void method5017(@OriginalArg(0) Class305 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!pga;Z)Lclient!f;")
	public abstract Class78 method5018(@OriginalArg(0) Class261 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!r", name = "r", descriptor = "()Z")
	public abstract boolean method5019();

	@OriginalMember(owner = "client!r", name = "s", descriptor = "()Lclient!q;")
	public abstract Class8 method5020();

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
	public abstract int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIII)V")
	public final void method5021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.m(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
	public abstract void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
	public abstract boolean method5022();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(II)I")
	public abstract int method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;Z)V")
	protected abstract void method5024(@OriginalArg(0) Class78 arg0);

	@OriginalMember(owner = "client!r", name = "u", descriptor = "()Lclient!q;")
	public abstract Class8 method5025();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!so;I)V")
	public abstract void method5026(@OriginalArg(0) Class305 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)Lclient!e;")
	public abstract Class4_Sub8 method5027(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "w", descriptor = "()Z")
	public abstract boolean method5028();

	@OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
	public abstract void JA();

	@OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
	protected abstract void method5029();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V")
	public final void method5030(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method4996(arg4, arg2, arg3, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
	public abstract void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
	public abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public abstract void method5031(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "y", descriptor = "()V")
	public abstract void method5032();

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	public final void method5033() {
		Static182.aBooleanArray5[this.anInt5872] = false;
		this.method5029();
	}

	@OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILclient!ua;II)V")
	public abstract void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
	public abstract void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "z", descriptor = "()Z")
	public abstract boolean method5034();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lclient!f;")
	public abstract Class78 method5035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public abstract void method5036(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "A", descriptor = "()Z")
	public abstract boolean method5037();

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void method5038(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "B", descriptor = "()V")
	public abstract void method5039();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIBII)V")
	public final void method5040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method5001(arg3, arg2, arg1, arg4, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "C", descriptor = "()Z")
	public abstract boolean method5041();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public abstract void method5042(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
	public abstract boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
	public abstract int[] v();
}
