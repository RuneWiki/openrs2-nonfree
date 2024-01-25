import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class82 {

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "Lclient!d;")
	public final Interface5 anInterface5_9;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
	public final int anInt7008;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class82(@OriginalArg(0) Interface5 arg0) {
		this.anInterface5_9 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static176.aBooleanArray11[local10]) {
				Static176.aBooleanArray11[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt7008 = local8;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIIII)V")
	public final void method6097(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6164(arg3, arg2, arg1, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public abstract void method6098(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6099(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!tj;)V")
	public abstract void method6100(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22[] arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
	public abstract boolean method6101();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public abstract void method6102(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
	public abstract boolean method6103();

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
	public abstract boolean method6104();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
	public abstract int method6105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!oia;Z)Lclient!fd;")
	public abstract Class103 method6106(@OriginalArg(0) Class251 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ik;I)V")
	public abstract void method6107(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V")
	public final void method6108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg0, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
	public abstract void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public abstract void method6109(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
	public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!fd;")
	public abstract Class103 method6110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
	public abstract boolean method6111();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[IBIII)Lclient!fd;")
	public final Class103 method6112(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method6180(arg1, arg3, arg2, arg0, true);
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
	public abstract boolean method6113();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	public abstract void method6114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6133();
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
	public abstract int[] Y();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!fd;)V")
	public final void method6117(@OriginalArg(1) Class103 arg0) {
		this.method6141(this.method6143(arg0, this.method6182(arg0.method7445(), arg0.method7440())));
	}

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
	public abstract void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
	public abstract void method6118();

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()Lclient!er;")
	public abstract Class98 method6119();

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
	public abstract boolean method6120();

	@OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
	public abstract void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()V")
	protected abstract void method6121();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public abstract void method6122();

	@OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
	public abstract void la();

	@OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
	public abstract void pa();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method6123(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
	public abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
	public final void method6124(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		this.method6148(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()Lclient!ih;")
	public abstract Class31 method6125();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!tj;")
	public abstract Class3_Sub22 method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ej;[Lclient!oia;Z)Lclient!da;")
	public abstract Class63 method6127(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class251[] arg1);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public abstract void method6128(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
	public abstract boolean method6129();

	@OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
	public abstract int XA();

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "()V")
	public abstract void method6130();

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()I")
	public abstract int method6131();

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public abstract void method6132(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public final void method6133() {
		Static176.aBooleanArray11[this.anInt7008] = false;
		this.method6121();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
	public final void method6134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aa(arg0, arg4, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public abstract void method6135();

	@OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
	public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "()Z")
	public abstract boolean method6136();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public final void method6137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6179(arg1, arg3, arg2, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
	public abstract void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)Lclient!za;")
	public abstract Class3_Sub45 method6138(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	public abstract Class91 method6139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6140(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!di;)V")
	public abstract void method6141(@OriginalArg(0) Interface7 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pw;Lclient!lh;)Lclient!di;")
	public abstract Interface7 method6143(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface14 arg1);

	@OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!fd;")
	public abstract Class103 method6144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!he;)V")
	public abstract void method6145(@OriginalArg(0) Class141 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	public abstract void method6146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	public abstract Class1 method6147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public abstract void method6148(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method6149(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!he;Lclient!he;FLclient!he;)Lclient!he;")
	public abstract Class141 method6150(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class141 arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public final void method6151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.za(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V")
	public final void method6152() throws Exception_Sub1 {
		this.method6166(0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()V")
	public abstract void method6153();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIZ)V")
	public final void method6154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.P(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public abstract void method6155(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
	public abstract int I();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
	public abstract void method6156(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "()V")
	public abstract void method6157();

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
	public abstract boolean method6158();

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public abstract void method6159(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ih;)V")
	public abstract void method6160(@OriginalArg(0) Class31 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ik;)V")
	public abstract void method6161(@OriginalArg(0) Class162 arg0);

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
	public abstract void method6162();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lclient!pw;")
	public abstract Interface19 method6163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
	public abstract void method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public abstract void method6165(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
	public abstract void method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
	public abstract void method6167();

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)Lclient!he;")
	public abstract Class141 method6168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
	public abstract int method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "()Lclient!ih;")
	public abstract Class31 method6170();

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
	public abstract boolean method6171();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
	public abstract void method6173(@OriginalArg(0) Class3_Sub45 arg0);

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()Lclient!ih;")
	public abstract Class31 method6174();

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
	public abstract boolean method6175();

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public abstract int i();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!vo;IIII)Lclient!ka;")
	public abstract Class75 method6176(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
	public abstract boolean method6177();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	public abstract void method6178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V")
	public abstract void method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!fd;")
	public abstract Class103 method6180(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)Lclient!lh;")
	public abstract Interface14 method6182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
	public abstract boolean method6183();

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
	public abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
