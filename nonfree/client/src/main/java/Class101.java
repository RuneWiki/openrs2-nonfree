import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class101 {

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Lclient!d;")
	public final Interface3 anInterface3_12;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	public final int anInt9210;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class101(@OriginalArg(0) Interface3 arg0) {
		this.anInterface3_12 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static471.aBooleanArray49[local10]) {
				Static471.aBooleanArray49[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt9210 = local8;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
	public final void method8061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aa(arg3, arg0, arg4, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public abstract void method8062(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!de;Z)Lclient!mq;")
	public abstract Class71 method8063(@OriginalArg(0) Class67 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ida;IIII)Lclient!ka;")
	public abstract Class14 method8064(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
	public abstract void la();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!gka;)V")
	public abstract void method8065(@OriginalArg(0) Class127 arg0);

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
	public abstract void method8066();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!dm;)V")
	public abstract void method8067(@OriginalArg(0) Class76 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!vr;)V")
	public abstract void method8068(@OriginalArg(0) Class3 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public abstract void method8069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
	public abstract boolean method8070();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!vr;Lclient!vr;FLclient!vr;)Lclient!vr;")
	public abstract Class3 method8071(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
	public abstract void method8072();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	public abstract void method8073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method8074(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;IZ)V")
	public final void method8075(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method8143(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	public abstract void method8076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!mq;")
	public abstract Class71 method8077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZII)V")
	public final void method8078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.za(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!mq;")
	public abstract Class71 method8079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public abstract void method8080(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
	public abstract void method8081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
	public abstract void method8082(@OriginalArg(0) Class2_Sub5 arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
	public abstract int method8083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lclient!lf;")
	public abstract Interface11 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Lclient!dm;")
	public abstract Class76 method8085();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
	public abstract boolean method8086();

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	public abstract Class18 method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public abstract void method8088(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()Lclient!ev;")
	public abstract Class99 method8090();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public abstract void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method8092(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
	public abstract void pa();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public abstract void method8093(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!mfa;)V")
	public abstract void method8094(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13[] arg1);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
	public abstract int method8095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
	public final void method8096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8091(arg0, arg4, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	public abstract Class1 method8097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public abstract void method8098();

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public abstract int i();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public final void method8099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg2, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)Lclient!za;")
	public abstract Class2_Sub5 method8100(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
	public abstract int I();

	@OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
	public abstract void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
	public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
	public abstract boolean method8101();

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
	public abstract boolean method8102();

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
	public final void method8103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method8129(arg1, arg3, arg4, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!mq;B)V")
	public final void method8104(@OriginalArg(0) Class71 arg0) {
		this.method8108(this.method8131(arg0, this.method8140(arg0.method7691(), arg0.method7707())));
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!mq;")
	public abstract Class71 method8105(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
	public abstract void method8106(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()V")
	public abstract void method8107();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!rs;)V")
	public abstract void method8108(@OriginalArg(0) Interface17 arg0);

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()I")
	public abstract int method8109();

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
	public abstract boolean method8110();

	@OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
	public abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[IIII)Lclient!mq;")
	public final Class71 method8111(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method8105(arg1, arg3, arg0, arg2, true);
	}

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
	public abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "()Lclient!dm;")
	public abstract Class76 method8112();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIII)V")
	public final void method8113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.P(arg1, arg3, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
	public abstract boolean method8114();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!gka;I)V")
	public abstract void method8115(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
	public abstract void method8116();

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
	public abstract boolean method8117();

	@OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public abstract void method8118(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method8119(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
	public abstract void method8121(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public abstract void method8122(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
	public abstract boolean method8123();

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()V")
	protected abstract void method8124();

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
	public abstract void method8125();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	public abstract void method8126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
	public abstract int[] Y();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!mfa;")
	public abstract Class2_Sub13 method8127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "()Z")
	public abstract boolean method8128();

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V")
	public abstract void method8129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
	public abstract void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
	public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(IIIIII)Lclient!vr;")
	public abstract Class3 method8130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!lf;Lclient!jk;)Lclient!rs;")
	public abstract Interface17 method8131(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface8 arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method8132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
	public abstract boolean method8133();

	@OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
	public abstract int XA();

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
	public abstract boolean method8134();

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
	public abstract boolean method8135();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
	public abstract boolean method8136();

	@OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
	public abstract void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method8137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public abstract void method8138();

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8148();
	}

	@OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
	public abstract void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)Lclient!jk;")
	public abstract Interface8 method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "()Lclient!dm;")
	public abstract Class76 method8141();

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public final void method8142() throws Exception_Sub1 {
		this.method8081(0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public abstract void method8143(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method8144(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!rt;[Lclient!de;Z)Lclient!da;")
	public abstract Class59 method8146(@OriginalArg(0) Class324 arg0, @OriginalArg(1) Class67[] arg1);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "()V")
	public abstract void method8147();

	@OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public final void method8148() {
		Static471.aBooleanArray49[this.anInt9210] = false;
		this.method8124();
	}
}
