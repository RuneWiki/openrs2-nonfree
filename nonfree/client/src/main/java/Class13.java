import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class13 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!d;")
	public final Interface2 anInterface2_12;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public final int anInt9527;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class13(@OriginalArg(0) Interface2 arg0) {
		this.anInterface2_12 = arg0;
		@Pc(6) int local6 = -1;
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			if (!Static463.aBooleanArray21[local8]) {
				Static463.aBooleanArray21[local8] = true;
				local6 = local8;
				break;
			}
		}
		if (local6 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt9527 = local6;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
	public abstract boolean method8084();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public abstract void method8085(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public abstract void method8086(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method8087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII[II)Lclient!iea;")
	public final Class31 method8088(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3) {
		return this.method8157(arg2, arg0, arg3, arg1, true);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()I")
	public abstract int method8089();

	@OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
	public abstract void method8090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIZI)V")
	public final void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg1, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
	public abstract int I();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public final void method8092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.P(arg1, arg3, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
	public abstract boolean method8093();

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
	public abstract void method8094();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
	public final void method8095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.za(arg1, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
	public abstract void la();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	public abstract void method8096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public abstract void method8097(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public abstract void method8098(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
	public abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public abstract int i();

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public abstract void method8099(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
	public abstract void method8100(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!fl;)V")
	public abstract void method8101(@OriginalArg(0) Class119 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!laa;)V")
	public abstract void method8102(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12[] arg1);

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()V")
	protected abstract void method8103();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public abstract void method8104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public abstract void method8105();

	@OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
	public abstract void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public abstract void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!hca;Lclient!lda;)Lclient!nl;")
	public abstract Interface18 method8107(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Interface15 arg1);

	@OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
	public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
	public abstract void method8108();

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
	public abstract boolean method8109();

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()V")
	public abstract void method8110();

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!laa;")
	public abstract Class2_Sub12 method8111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	public abstract void method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public abstract void method8113(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
	public abstract boolean method8114();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method8115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
	public abstract boolean method8116();

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public final void method8117() {
		Static463.aBooleanArray21[this.anInt9527] = false;
		this.method8103();
	}

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "()V")
	public abstract void method8118();

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "()Lclient!pda;")
	public abstract Class51 method8119();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lclient!lda;")
	public abstract Interface15 method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
	public abstract boolean method8121();

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8117();
	}

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
	public abstract void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
	public abstract int method8122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!mda;Lclient!mda;FLclient!mda;)Lclient!mda;")
	public abstract Class49 method8123(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class49 arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method8124(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	public abstract Class1 method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public abstract void method8126();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!iea;Z)V")
	public final void method8127(@OriginalArg(0) Class31 arg0) {
		this.method8168(this.method8107(arg0, this.method8120(arg0.method8801(), arg0.method8789())));
	}

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "()Z")
	public abstract boolean method8128();

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public final void method8129() throws Exception_Sub1 {
		this.method8133(0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIIII)V")
	public final void method8130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method8090(arg4, arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method8131(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!mda;)V")
	public abstract void method8132(@OriginalArg(0) Class49 arg0);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
	public abstract void method8133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
	public abstract boolean method8134();

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "()Lclient!nia;")
	public abstract Class240 method8135();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!jl;[Lclient!hb;Z)Lclient!da;")
	public abstract Class37 method8136(@OriginalArg(0) Class183 arg0, @OriginalArg(1) Class139[] arg1);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
	public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()Lclient!pda;")
	public abstract Class51 method8137();

	@OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
	public abstract void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pda;)V")
	public abstract void method8138(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public abstract void method8139(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public abstract void method8140(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!hb;Z)Lclient!iea;")
	public abstract Class31 method8141(@OriginalArg(0) Class139 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
	public abstract int[] Y();

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
	public abstract void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
	public abstract boolean method8142();

	@OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
	public abstract void pa();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	public abstract void method8144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "()Z")
	public abstract boolean method8145();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method8146(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
	public abstract boolean method8147();

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)Lclient!mda;")
	public abstract Class49 method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "()V")
	public abstract void method8150();

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lclient!hca;")
	public abstract Interface8 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
	public abstract boolean method8152();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!iea;")
	public abstract Class31 method8153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "()Lclient!pda;")
	public abstract Class51 method8154();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZI)V")
	public final void method8155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method8104(arg2, arg3, arg1, arg0, arg4, 1);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method8156(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!iea;")
	public abstract Class31 method8157(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
	public abstract void method8158(@OriginalArg(0) Class2_Sub40 arg0);

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	public abstract Class91 method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!lga;IIII)Lclient!ka;")
	public abstract Class193 method8161(@OriginalArg(0) Class212 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)Lclient!za;")
	public abstract Class2_Sub40 method8162(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
	public abstract int method8163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
	public final void method8164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aa(arg2, arg4, arg3, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!fl;I)V")
	public abstract void method8165(@OriginalArg(0) Class119 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
	public abstract int XA();

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "()V")
	public abstract void method8166();

	@OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
	public abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
	public abstract boolean method8167();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!nl;)V")
	public abstract void method8168(@OriginalArg(0) Interface18 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!iea;")
	public abstract Class31 method8169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
	public final void method8170(@OriginalArg(0) int arg0, @OriginalArg(1) Rectangle[] arg1) throws Exception_Sub1 {
		this.method8085(arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);
}
