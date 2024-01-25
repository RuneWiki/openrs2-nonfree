import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public abstract class Class62 {

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "Lclient!n;")
	public final Interface8 anInterface8_145;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public final int anInt8664;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!n;)V")
	public Class62(@OriginalArg(0) Interface8 arg0) {
		this.anInterface8_145 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static6.aBooleanArray3[local10]) {
				local8 = local10;
				Static6.aBooleanArray3[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8664 = local8;
	}

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(F)V")
	public abstract void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!u;)V")
	public abstract void method6991(@OriginalArg(0) Class5_Sub29 arg0);

	@OriginalMember(owner = "client!qa", name = "ta", descriptor = "(II)V")
	public abstract void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIBI)V")
	public final void method6992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method7036(arg2, arg3, arg1, arg4, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "(I)V")
	public abstract void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!uca;")
	public abstract Class5_Sub10 method6993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIII)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lclient!m;")
	public abstract Class78 method6994();

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(IIIII)V")
	public abstract void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6995();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public abstract void method6996(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public abstract void method6997(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fba;Z)Lclient!ha;")
	public abstract Class25 method6998(@OriginalArg(0) Class96 arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	public abstract void method6999();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
	public abstract boolean method7000();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public abstract void method7001(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "(I)V")
	public abstract void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()V")
	public abstract void xa();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!sh;)V")
	public abstract void method7002(@OriginalArg(0) Class267 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	public abstract Class25 method7003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
	public abstract void method7004();

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
	public abstract boolean method7005();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	public abstract Class87 method7006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
	public abstract boolean method7007();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!sh;Lclient!m;[Lclient!paa;I)V")
	public abstract void method7008(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
	public abstract void method7009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)Lclient!u;")
	public abstract Class5_Sub29 method7010(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()Lclient!m;")
	public abstract Class78 method7011();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ld;IIII)Lclient!r;")
	public abstract Class36 method7012(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIIII)V")
	public final void method7013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7009(arg3, arg0, arg4, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7014(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7015(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()Lclient!dp;")
	public abstract Class68 method7016();

	@OriginalMember(owner = "client!qa", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method7017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method7018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!paa;I)V")
	public abstract void method7019(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) Class30_Sub6[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "(III)V")
	public abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "za", descriptor = "(IIIIII[BII)V")
	public abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
	public abstract boolean method7020();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!ha;")
	public abstract Class25 method7021(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method7022(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
	public abstract boolean method7023();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	public abstract int method7024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
	public abstract void method7025();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7026(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method7027(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	public abstract boolean method7028();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIB)V")
	public final void method7029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.A(arg3, arg0, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()V")
	public abstract void method7030() throws Exception_Sub1;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	public abstract boolean method7031();

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "(IIIIII)Z")
	public abstract boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
	public abstract boolean method7033();

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()I")
	public abstract int method7034();

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
	public abstract int YA();

	@OriginalMember(owner = "client!qa", name = "CA", descriptor = "()I")
	public abstract int CA();

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()V")
	public abstract void method7035();

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(III[I)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	public abstract void method7036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
	public abstract void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()V")
	protected abstract void method7037();

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)V")
	public abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7038(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()V")
	public abstract void method7039();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIBI)V")
	public final void method7040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.f(arg3, arg2, arg4, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method7041(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method7042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.UA(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
	public abstract boolean method7044();

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "(FF)V")
	public abstract void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)Lclient!kk;")
	public abstract Class92 method7046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "([I)V")
	public abstract void d(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(IIIIII)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
	public abstract boolean method7047();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
	public abstract int c();

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public abstract void method7048(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
	public abstract boolean method7049();

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	public abstract boolean method7050();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class131 method7051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!kk;Lclient!kk;FLclient!kk;)Lclient!kk;")
	public abstract Class92 method7052(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class92 arg3);

	@OriginalMember(owner = "client!qa", name = "ra", descriptor = "()F")
	public abstract float ra();

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
	public abstract boolean method7053();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!rl;[Lclient!fba;Z)Lclient!ra;")
	public abstract Class13 method7054(@OriginalArg(0) Class256 arg0, @OriginalArg(1) Class96[] arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method7055(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	public abstract void method7057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class87 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
	public abstract void n();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public abstract void method7058(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!uca;)V")
	public abstract void method7059(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub10[] arg1);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
	public abstract void method7060(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(IFFFFF)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)V")
	public final void method7061() {
		Static6.aBooleanArray3[this.anInt8664] = false;
		this.method7037();
	}

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "(IIII)[I")
	public abstract int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	public abstract boolean method7062();

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
	public abstract boolean method7063();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public final void method7064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "()V")
	public abstract void method7065();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!r;Lclient!sh;Lclient!m;Lclient!paa;I)V")
	public abstract void method7066(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6 arg3);

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "(ILclient!pa;II)V")
	public abstract void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!kk;)V")
	public abstract void method7067(@OriginalArg(0) Class92 arg0);

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "()F")
	public abstract float P();

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7061();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!m;)V")
	public abstract void method7068(@OriginalArg(0) Class78 arg0);

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIII)V")
	protected abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
