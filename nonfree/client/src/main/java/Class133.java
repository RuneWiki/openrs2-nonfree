import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class133 {

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Lclient!d;")
	public final Interface3 anInterface3_12;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
	public final int anInt8326;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class133(@OriginalArg(0) Interface3 arg0) {
		this.anInterface3_12 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static460.aBooleanArray24[local10]) {
				Static460.aBooleanArray24[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8326 = local8;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
	public abstract void method7234();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
	public abstract void method7235(@OriginalArg(0) Class5_Sub6 arg0);

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
	protected abstract void method7236();

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
	public abstract boolean method7237();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	public abstract void method7238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public abstract void method7239(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
	public abstract boolean method7240();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
	public abstract boolean method7241();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public abstract void method7242(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIZ)V")
	public final void method7243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7279(arg0, arg3, arg4, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V")
	public final void method7244(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.za(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()I")
	public abstract int method7245();

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
	public final void method7246(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		this.method7239(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
	public abstract void method7247();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
	public abstract void method7248(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
	public abstract boolean method7249();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
	public final void method7251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aa(arg4, arg3, arg0, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public abstract void method7252(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!it;B)V")
	public final void method7253(@OriginalArg(0) Class28 arg0) {
		this.method7322(this.method7288(arg0, this.method7313(arg0.method4032(), arg0.method4037())));
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
	public abstract boolean method7254();

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
	public abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pia;[Lclient!gu;Z)Lclient!da;")
	public abstract Class55 method7255(@OriginalArg(0) Class272 arg0, @OriginalArg(1) Class131[] arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!b;IIII)Lclient!ka;")
	public abstract Class187 method7256(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!vm;)V")
	public abstract void method7257(@OriginalArg(0) Class130 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!it;")
	public abstract Class28 method7258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
	public abstract void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!vm;Lclient!vm;FLclient!vm;)Lclient!vm;")
	public abstract Class130 method7259(@OriginalArg(0) Class130 arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class130 arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[IZIII)Lclient!it;")
	public final Class28 method7261(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method7312(arg0, arg3, arg2, arg1, true);
	}

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()Lclient!tc;")
	public abstract Class113 method7262();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public abstract void method7263();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	public abstract Class1 method7264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public abstract void method7265(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public abstract void method7266();

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "()V")
	public abstract void method7267();

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "()V")
	public abstract void method7268();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tc;)V")
	public abstract void method7269(@OriginalArg(0) Class113 arg0);

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
	public abstract boolean method7270();

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lclient!hu;")
	public abstract Interface7 method7271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
	public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method7273(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public abstract void method7274(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "()Lclient!tc;")
	public abstract Class113 method7275();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method7276(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	public abstract Class61 method7277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public abstract void method7278(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public abstract void method7279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
	public abstract int XA();

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7295();
	}

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()Lclient!qm;")
	public abstract Class294 method7281();

	@OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
	public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
	public abstract void method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
	public abstract boolean method7283();

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
	public abstract int I();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	public abstract void method7284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
	public final void method7285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method7304(arg2, arg0, arg1, arg4, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
	public abstract void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
	public abstract void pa();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!vt;)V")
	public abstract void method7286(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub11[] arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBI)V")
	public final void method7287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!hu;Lclient!wm;)Lclient!pea;")
	public abstract Interface16 method7288(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Interface27 arg1);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
	public abstract void method7289(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!it;")
	public abstract Class28 method7290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7291(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
	public abstract int method7292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!vt;")
	public abstract Class5_Sub11 method7293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public final void method7295() {
		Static460.aBooleanArray24[this.anInt8326] = false;
		this.method7236();
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
	public abstract int method7296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!gu;Z)Lclient!it;")
	public abstract Class28 method7297(@OriginalArg(0) Class131 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
	public abstract void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()V")
	public abstract void method7298();

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
	public abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "()Lclient!tc;")
	public abstract Class113 method7299();

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)Lclient!za;")
	public abstract Class5_Sub6 method7300(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!mp;I)V")
	public abstract void method7302(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7303(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
	public abstract void method7304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
	public abstract void method7305();

	@OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	public abstract void method7307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!mp;)V")
	public abstract void method7308(@OriginalArg(0) Class235 arg0);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public abstract void method7309(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
	public abstract boolean method7310();

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
	public abstract boolean method7311();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!it;")
	public abstract Class28 method7312(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(II)Lclient!wm;")
	public abstract Interface27 method7313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
	public abstract boolean method7314();

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
	public abstract boolean method7315();

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public final void method7316() throws Exception_Sub1 {
		this.method7282(0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
	public abstract boolean method7317();

	@OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
	public abstract void la();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)Lclient!vm;")
	public abstract Class130 method7318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
	public abstract int[] Y();

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public abstract int i();

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
	public abstract boolean method7319();

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public final void method7320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.P(arg1, arg0, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
	public abstract void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public abstract void method7321(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pea;)V")
	public abstract void method7322(@OriginalArg(0) Interface16 arg0);
}
