import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class100 {

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!fa;")
	public final Interface5 anInterface5_10;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "I")
	public final int anInt7465;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class100(@OriginalArg(0) Interface5 arg0) {
		this.anInterface5_10 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static107.aBooleanArray11[local10]) {
				local8 = local10;
				Static107.aBooleanArray11[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt7465 = local8;
	}

	@OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
	public abstract void JA();

	@OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
	public abstract boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
	public abstract int[] v();

	@OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
	public abstract void method6184();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()I")
	public abstract int method6185();

	@OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
	public abstract boolean method6186();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
	public abstract boolean method6187();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lclient!gga;)V")
	public abstract void method6188(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub14[] arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIII)V")
	public final void method6189(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.m(arg0, arg3, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public abstract void method6190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!eg;IIII)Lclient!da;")
	public abstract Class66 method6191(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public abstract boolean method6192();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ir;)V")
	public abstract void method6193(@OriginalArg(0) Class164 arg0);

	@OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
	public abstract void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
	public abstract boolean method6194();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	public abstract Class67 method6195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()Z")
	public abstract boolean method6196();

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()Z")
	public abstract boolean method6197();

	@OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
	public abstract void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()V")
	public abstract void method6198();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public abstract void method6199(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
	public final void method6200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method6212(arg3, arg1, arg0, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6201(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method6202(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "()V")
	public abstract void method6203();

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lclient!f;")
	public abstract Class39 method6204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public abstract void method6205(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()Z")
	public abstract boolean method6206();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6207(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "()Z")
	public abstract boolean method6208();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lclient!gga;")
	public abstract Class2_Sub14 method6209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
	public abstract int BA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!jt;Lclient!jt;FLclient!jt;)Lclient!jt;")
	public abstract Class37 method6210(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class37 arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
	public abstract void method6211(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
	public abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
	public abstract int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V")
	public abstract void method6212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)Lclient!jt;")
	public abstract Class37 method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	public abstract int method6215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
	public abstract int T();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public abstract int method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method6217(@OriginalArg(0) Class68 arg0);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()Z")
	public abstract boolean method6218();

	@OriginalMember(owner = "client!r", name = "o", descriptor = "()Z")
	public abstract boolean method6219();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6220();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;I)V")
	public final void method6221(@OriginalArg(0) Class39 arg0) {
		this.method6237(arg0);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!r", name = "p", descriptor = "()Lclient!q;")
	public abstract Class68 method6222();

	@OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!e;)V")
	public abstract void method6223(@OriginalArg(0) Class2_Sub13 arg0);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V")
	public final void method6224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6190(arg3, arg0, arg4, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!sa;[Lclient!aga;Z)Lclient!la;")
	public abstract Class29 method6225(@OriginalArg(0) Class294 arg0, @OriginalArg(1) Class13[] arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class39 method6226(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6227(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "q", descriptor = "()V")
	public abstract void method6228();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void method6229(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "r", descriptor = "()Z")
	public abstract boolean method6230();

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
	public abstract void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "s", descriptor = "()V")
	public abstract void method6231();

	@OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
	public abstract void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
	public abstract void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IBIII)V")
	public final void method6232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.XA(arg1, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method6233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Lclient!e;")
	public abstract Class2_Sub13 method6234(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "t", descriptor = "()Lclient!q;")
	public abstract Class68 method6235();

	@OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class39 method6236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;Z)V")
	protected abstract void method6237(@OriginalArg(0) Class39 arg0);

	@OriginalMember(owner = "client!r", name = "u", descriptor = "()V")
	public abstract void method6238() throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public abstract void method6239(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	public abstract Class20 method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public abstract void method6242(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
	public abstract void method6244(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "w", descriptor = "()V")
	public abstract void method6245();

	@OriginalMember(owner = "client!r", name = "x", descriptor = "()Z")
	public abstract boolean method6246();

	@OriginalMember(owner = "client!r", name = "y", descriptor = "()Lclient!oa;")
	public abstract Class237 method6247();

	@OriginalMember(owner = "client!r", name = "z", descriptor = "()Z")
	public abstract boolean method6248();

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void method6249(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
	protected abstract void method6250();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6251(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!jt;)V")
	public abstract void method6252(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
	public abstract void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
	public abstract boolean method6254();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public final void method6255(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg1, arg2, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!aga;Z)Lclient!f;")
	public abstract Class39 method6256(@OriginalArg(0) Class13 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6262();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ir;I)V")
	public abstract void method6257(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!r", name = "C", descriptor = "()Lclient!q;")
	public abstract Class68 method6258();

	@OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
	public abstract void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	public abstract void method6259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class20 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
	public abstract void method6260(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILclient!ua;II)V")
	public abstract void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(IIIIII)V")
	public final void method6261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.J(arg1, arg2, arg4, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
	public final void method6262() {
		Static107.aBooleanArray11[this.anInt7465] = false;
		this.method6250();
	}
}
