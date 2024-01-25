import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class144 {

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Lclient!d;")
	public final Interface4 anInterface4_12;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	public final int anInt7839;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class144(@OriginalArg(0) Interface4 arg0) {
		this.anInterface4_12 = arg0;
		@Pc(6) int local6 = -1;
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			if (!Static434.aBooleanArray19[local8]) {
				local6 = local8;
				Static434.aBooleanArray19[local8] = true;
				break;
			}
		}
		if (local6 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt7839 = local6;
	}

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
	public abstract int I();

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(IIIIII)V")
	public final void method6887(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aa(arg4, arg0, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
	public abstract void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method6888(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()V")
	public abstract void method6889();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!fia;")
	public abstract Class45 method6890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tca;)V")
	public abstract void method6891(@OriginalArg(0) Interface22 arg0);

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
	public abstract boolean method6892();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6893(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)Lclient!lb;")
	public abstract Class47 method6894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "()Z")
	public abstract boolean method6895();

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6932();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!rd;)V")
	public abstract void method6896(@OriginalArg(0) Class263 arg0);

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
	public abstract boolean method6897();

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
	public abstract boolean method6898();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!lb;Lclient!lb;FLclient!lb;)Lclient!lb;")
	public abstract Class47 method6899(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class47 arg3);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public abstract void method6900(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "()V")
	public abstract void method6901();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!qv;I)V")
	public abstract void method6902(@OriginalArg(0) Class304 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public abstract int i();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!qv;)V")
	public abstract void method6903(@OriginalArg(0) Class304 arg0);

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "()Z")
	public abstract boolean method6904();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
	protected abstract void method6905();

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
	public abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
	public final void method6906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method6923(arg0, arg4, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "()Lclient!rd;")
	public abstract Class263 method6907();

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!dea;IIII)Lclient!ka;")
	public abstract Class129 method6908(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6909(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
	public final void method6910(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.za(arg0, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "(I)V")
	public abstract void method6911(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	public abstract void method6912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public abstract void method6913(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "()Lclient!rd;")
	public abstract Class263 method6914();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!rfa;")
	public abstract Class14_Sub18 method6915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()V")
	public abstract void method6916();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method6917(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V")
	public abstract void method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
	public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
	public abstract boolean method6920();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
	public abstract void method6921(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
	public abstract boolean method6922();

	@OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
	public abstract void la();

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public abstract void method6923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
	public abstract boolean method6924();

	@OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
	public abstract void pa();

	@OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
	public abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIII)V")
	public final void method6925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.P(arg3, arg1, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "()I")
	public abstract int method6926();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!lb;)V")
	public abstract void method6927(@OriginalArg(0) Class47 arg0);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public final void method6928() throws Exception_Sub1 {
		this.method6918(0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!fia;I)V")
	public final void method6929(@OriginalArg(0) Class45 arg0) {
		this.method6891(this.method6956(arg0, this.method6963(arg0.method7510(), arg0.method7501())));
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	public abstract Class1 method6930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public abstract void method6931();

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public final void method6932() {
		Static434.aBooleanArray19[this.anInt7839] = false;
		this.method6905();
	}

	@OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!fia;")
	public abstract Class45 method6935(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
	public abstract void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()V")
	public abstract void method6936();

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
	public abstract int[] Y();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
	public abstract int method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
	public abstract void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!fia;")
	public abstract Class45 method6938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V")
	public final void method6939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6969(arg1, arg0, arg3, arg4, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public abstract void method6940(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBI[II)Lclient!fia;")
	public final Class45 method6941(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3) {
		return this.method6935(arg2, arg3, arg1, arg0, true);
	}

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public abstract void method6942(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()Lclient!rd;")
	public abstract Class263 method6943();

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
	public abstract boolean method6944();

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
	public abstract void method6945(@OriginalArg(0) Class14_Sub16 arg0);

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public abstract void method6946(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	public abstract void method6947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public final void method6949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 != 24805) {
			Static208.aClass199_11 = null;
		}
		this.U(arg1, arg4, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "()V")
	public abstract void method6950();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
	public final void method6951(@OriginalArg(0) int arg0, @OriginalArg(1) Rectangle[] arg1) throws Exception_Sub1 {
		this.method6942(arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public abstract void method6952(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
	public abstract void method6953();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public abstract void method6954(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
	public abstract boolean method6955();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!wi;Lclient!bj;)Lclient!tca;")
	public abstract Interface22 method6956(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Interface3 arg1);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lclient!wi;")
	public abstract Interface27 method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tja;[Lclient!oe;Z)Lclient!da;")
	public abstract Class68 method6958(@OriginalArg(0) Class350 arg0, @OriginalArg(1) Class266[] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	public abstract Class159 method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "()Lclient!bg;")
	public abstract Class35 method6960();

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)Lclient!za;")
	public abstract Class14_Sub16 method6961(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
	public abstract void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
	public abstract boolean method6962();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lclient!bj;")
	public abstract Interface3 method6963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
	public abstract int XA();

	@OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!oe;Z)Lclient!fia;")
	public abstract Class45 method6964(@OriginalArg(0) Class266 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	public abstract void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
	public abstract boolean method6966();

	@OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
	public abstract int method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public abstract void method6968(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
	public abstract void method6969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!rfa;)V")
	public abstract void method6970(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub18[] arg1);

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public abstract void method6971();

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
	public abstract boolean method6972();

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
	public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
	public abstract boolean method6973();
}
