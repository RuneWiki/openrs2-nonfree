import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class132 {

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Lclient!d;")
	public final Interface6 anInterface6_11;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public final int anInt8773;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class132(@OriginalArg(0) Interface6 arg0) {
		this.anInterface6_11 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static129.aBooleanArray6[local10]) {
				local8 = local10;
				Static129.aBooleanArray6[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8773 = local8;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBII)V")
	public final void method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.P(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
	public abstract boolean method7433();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZIII)V")
	public final void method7435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7473(arg1, arg4, arg0, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lclient!cn;")
	public abstract Interface4 method7436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	public abstract Class12 method7437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	public abstract void method7438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()Lclient!rb;")
	public abstract Class297 method7439();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	public abstract void method7441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
	public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
	public abstract void method7442();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)Lclient!ok;")
	public abstract Class25 method7443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IBIIII)Lclient!ho;")
	public final Class9 method7444(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method7507(arg0, arg1, arg3, arg2, true);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
	public abstract boolean method7445();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public abstract void method7446(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
	public abstract boolean method7447();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
	public abstract int method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V")
	public final void method7449(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public abstract void method7450(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
	public abstract void method7451(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
	public abstract void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ok;)V")
	public abstract void method7452(@OriginalArg(0) Class25 arg0);

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Lclient!za;")
	public abstract Class6_Sub20 method7453(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
	public abstract void method7454();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!hda;)V")
	public abstract void method7455(@OriginalArg(0) Class137 arg0);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()Lclient!oo;")
	public abstract Class207 method7456();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ok;Lclient!ok;FLclient!ok;)Lclient!ok;")
	public abstract Class25 method7457(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class25 arg3);

	@OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
	public abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public abstract void method7458(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lclient!rca;")
	public abstract Interface23 method7459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7460(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
	public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public final void method7461() throws Exception_Sub1 {
		this.method7464(0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
	public abstract void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBII)V")
	public final void method7462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7481(arg2, arg3, arg1, arg4, arg0, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!cn;Lclient!rca;)Lclient!mia;")
	public abstract Interface16 method7463(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Interface23 arg1);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V")
	public abstract void method7464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
	public abstract int I();

	@OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	public abstract Class1 method7465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
	public abstract boolean method7466();

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()Lclient!oo;")
	public abstract Class207 method7467();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!hda;I)V")
	public abstract void method7469(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
	public abstract boolean method7470();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public abstract void method7471(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "()V")
	public abstract void method7472();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public abstract void method7473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
	public abstract boolean method7474();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ao;IIII)Lclient!ka;")
	public abstract Class184 method7475(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!ho;")
	public abstract Class9 method7476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
	public abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
	public abstract void method7477();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public final void method7478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.za(arg1, arg2, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "()Z")
	public abstract boolean method7480();

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
	public abstract void method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!ho;")
	public abstract Class9 method7482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
	public abstract void method7483(@OriginalArg(0) Class6_Sub20 arg0);

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
	public abstract int XA();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public abstract void method7484(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public abstract void method7485(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public abstract void method7486(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
	public abstract boolean method7487();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!fm;Z)Lclient!ho;")
	public abstract Class9 method7488(@OriginalArg(0) Class112 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!mia;)V")
	public abstract void method7489(@OriginalArg(0) Interface16 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
	public final void method7490(@OriginalArg(1) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		this.method7446(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public final void method7491() {
		Static129.aBooleanArray6[this.anInt8773] = false;
		this.method7498();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	public abstract void method7492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "()V")
	public abstract void method7493();

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7491();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method7494(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
	public abstract boolean method7495();

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "()Lclient!oo;")
	public abstract Class207 method7496();

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public abstract void method7497(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
	protected abstract void method7498();

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
	public abstract int[] Y();

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "()V")
	public abstract void method7499();

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
	public abstract boolean method7500();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!sca;")
	public abstract Class6_Sub17 method7501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public abstract int i();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
	public abstract void method7502(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
	public abstract boolean method7503();

	@OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
	public abstract void la();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!sca;)V")
	public abstract void method7504(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub17[] arg1);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7505(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
	public abstract void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
	public abstract boolean method7506();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!ho;")
	public abstract Class9 method7507(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
	public abstract boolean method7508();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
	public abstract int method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method7510(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "()I")
	public abstract int method7511();

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
	public final void method7512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aa(arg2, arg3, arg1, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
	public abstract void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public abstract void method7515();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!ho;)V")
	public final void method7516(@OriginalArg(1) Class9 arg0) {
		this.method7489(this.method7463(arg0, this.method7459(arg0.method8938(), arg0.method8918())));
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!oo;)V")
	public abstract void method7517(@OriginalArg(0) Class207 arg0);

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!hw;[Lclient!fm;Z)Lclient!da;")
	public abstract Class19 method7518(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class112[] arg1);

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public abstract void method7519();

	@OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
	public abstract void pa();
}
