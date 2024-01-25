import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class33 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!d;")
	public final Interface9 anInterface9_12;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
	public final int anInt9458;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class33(@OriginalArg(0) Interface9 arg0) {
		this.anInterface9_12 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static13.aBooleanArray1[local10]) {
				local8 = local10;
				Static13.aBooleanArray1[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt9458 = local8;
	}

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public abstract void method8067();

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	public abstract Class42 method8068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!jia;)V")
	public abstract void method8069(@OriginalArg(0) Class68 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public final void method8070() {
		Static13.aBooleanArray1[this.anInt9458] = false;
		this.method8126();
	}

	@OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
	public abstract boolean method8071();

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
	public abstract void pa();

	@OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
	public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
	public abstract void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!so;IIII)Lclient!ka;")
	public abstract Class62 method8072(@OriginalArg(0) Class334 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
	public abstract int XA();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
	public abstract void method8073();

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
	public abstract int[] Y();

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
	public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
	public abstract boolean method8074();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!kp;")
	public abstract Class4_Sub29 method8075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Lclient!nh;")
	public abstract Class92 method8076();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()Lclient!nh;")
	public abstract Class92 method8078();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BIIII)V")
	public final void method8079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.za(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	public abstract void method8080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
	public abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!bq;[Lclient!cr;Z)Lclient!da;")
	public abstract Class56 method8081(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class51[] arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public final void method8082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg0, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
	public abstract void method8083(@OriginalArg(0) Class4_Sub13 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lclient!sea;")
	public abstract Interface21 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!af;)V")
	public abstract void method8085(@OriginalArg(0) Class9 arg0);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()I")
	public abstract int method8086();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public abstract void method8087(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Lclient!za;")
	public abstract Class4_Sub13 method8088(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public abstract void method8089(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!kp;)V")
	public abstract void method8090(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub29[] arg1);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public abstract void method8092(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
	public abstract void method8093();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!af;I)V")
	public abstract void method8094(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
	public final void method8095() throws Exception_Sub1 {
		this.method8120(0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
	public abstract void method8096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
	public final void method8097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.P(arg1, arg2, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method8098(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
	public abstract void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public final void method8100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method8142(arg2, arg1, arg0, arg3, arg4, 1);
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
	public abstract boolean method8101();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public abstract void method8102(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
	public final void method8103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aa(arg0, arg1, arg4, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
	public abstract boolean method8104();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public abstract void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
	public abstract boolean method8107();

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
	public abstract boolean method8108();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public abstract void method8109(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8070();
	}

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method8110(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public abstract void method8111(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public abstract int i();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)Lclient!jia;")
	public abstract Class68 method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lclient!up;")
	public abstract Interface23 method8113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
	public abstract boolean method8114();

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()Lclient!ub;")
	public abstract Class359 method8115();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method8116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!nm;)V")
	public abstract void method8117(@OriginalArg(0) Interface18 arg0);

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "()Lclient!nh;")
	public abstract Class92 method8118();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!sea;Lclient!up;)Lclient!nm;")
	public abstract Interface18 method8119(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface23 arg1);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
	public abstract void method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public abstract void method8121();

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
	public abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	public abstract void method8123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
	public abstract int method8124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	public abstract void method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()V")
	protected abstract void method8126();

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
	public abstract boolean method8127();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIII)Lclient!tf;")
	public final Class17 method8128(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method8156(arg0, arg2, arg3, arg1, true);
	}

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
	public abstract int I();

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
	public abstract boolean method8130();

	@OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
	public abstract void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public abstract void method8131(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method8132(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!nh;)V")
	public abstract void method8133(@OriginalArg(0) Class92 arg0);

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
	public abstract void method8134();

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "()Z")
	public abstract boolean method8135();

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
	public abstract boolean method8136();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
	public final void method8137(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		this.method8141(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!jia;Lclient!jia;FLclient!jia;)Lclient!jia;")
	public abstract Class68 method8138(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class68 arg3);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(IIIIII)V")
	public final void method8139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method8096(arg3, arg0, arg1, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
	public abstract int method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public abstract void method8141(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(IIIIII)V")
	public abstract void method8142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
	public abstract void la();

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
	public abstract void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tf;B)V")
	public final void method8143(@OriginalArg(0) Class17 arg0) {
		this.method8117(this.method8119(arg0, this.method8113(arg0.method5268(), arg0.method5253())));
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method8144(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!tf;")
	public abstract Class17 method8145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
	public abstract boolean method8146();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!cr;Z)Lclient!tf;")
	public abstract Class17 method8147(@OriginalArg(0) Class51 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()V")
	public abstract void method8149();

	@OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	public abstract Class1 method8150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!tf;")
	public abstract Class17 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
	public abstract boolean method8152();

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "()V")
	public abstract void method8153();

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "()V")
	public abstract void method8154();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
	public abstract void method8155(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!tf;")
	public abstract Class17 method8156(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);
}
