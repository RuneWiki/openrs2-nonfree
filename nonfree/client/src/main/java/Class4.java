import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public abstract class Class4 {

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "Lclient!n;")
	public final Interface13 anInterface13_13;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	public final int anInt8106;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!n;)V")
	public Class4(@OriginalArg(0) Interface13 arg0) {
		this.anInterface13_13 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static491.aBooleanArray37[local10]) {
				local8 = local10;
				Static491.aBooleanArray37[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8106 = local8;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()Z")
	public abstract boolean method7148();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!dp;Z)Lclient!ha;")
	public abstract Class104 method7149(@OriginalArg(0) Class70 arg0);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "(IIIIII)Z")
	public abstract boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public final void method7150() {
		Static491.aBooleanArray37[this.anInt8106] = false;
		this.method7197();
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
	public abstract boolean method7151();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
	public abstract boolean method7152();

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "(FF)V")
	public abstract void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)V")
	public abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()Z")
	public abstract boolean method7153();

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()V")
	public abstract void method7154();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "(IIII)[I")
	public abstract int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(III[I)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method7155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.A(arg0, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!ha;")
	public abstract Class104 method7156(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)V")
	public final void method7157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.UA(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7158(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!cf;I)V")
	public abstract void method7159(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) Class46_Sub1[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method7160(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()V")
	public abstract void method7161();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIIII)V")
	public final void method7162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.f(arg2, arg3, arg1, arg4, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "(III)V")
	public abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "(I)V")
	public abstract void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()I")
	public abstract int method7163();

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()V")
	public abstract void method7164();

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIII)V")
	protected abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "za", descriptor = "(IIIIII[BII)V")
	public abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()Lclient!m;")
	public abstract Class128 method7165();

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
	public abstract boolean method7166();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method7167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "CA", descriptor = "()I")
	public abstract int CA();

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(IIIII)V")
	public abstract void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
	public abstract void method7168();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(IIIIII)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!cba;")
	public abstract Class1_Sub5 method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	public abstract boolean method7171();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)Lclient!mv;")
	public abstract Class103 method7172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()V")
	public abstract void method7173();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7174(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!ka;Lclient!m;[Lclient!cf;I)V")
	public abstract void method7175(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7150();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public abstract void method7177(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method7178(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ka;)V")
	public abstract void method7179(@OriginalArg(0) Class158 arg0);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
	public abstract boolean method7180();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	public abstract void method7181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
	public abstract boolean method7182();

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
	public abstract boolean method7183();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	public abstract int method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()V")
	public abstract void xa();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public abstract void method7185(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	public abstract Class28 method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class7 method7187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7188(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Lclient!m;")
	public abstract Class128 method7189();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIBI)V")
	public final void method7190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method7181(arg4, arg0, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ei;IIII)Lclient!r;")
	public abstract Class97 method7192(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!fc;[Lclient!dp;Z)Lclient!ra;")
	public abstract Class36 method7193(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class70[] arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIZII)V")
	public final void method7194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7203(arg0, arg4, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
	public abstract boolean method7195();

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "(I)V")
	public abstract void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
	public abstract int YA();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public abstract void method7196(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()V")
	protected abstract void method7197();

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIII)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!m;)V")
	public abstract void method7198(@OriginalArg(0) Class128 arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIZ)Lclient!ha;")
	public abstract Class104 method7199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mv;Lclient!mv;FLclient!mv;)Lclient!mv;")
	public abstract Class103 method7200(@OriginalArg(0) Class103 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class103 arg3);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public abstract void method7201(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
	public abstract void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(F)V")
	public abstract void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
	public abstract void method7202();

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "()F")
	public abstract float P();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
	public abstract boolean method7204();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method7206(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()Lclient!fd;")
	public abstract Class98 method7207();

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	public abstract boolean method7208();

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
	public abstract boolean method7209();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
	public abstract int c();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!u;)V")
	public abstract void method7210(@OriginalArg(0) Class1_Sub23 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!r;Lclient!ka;Lclient!m;Lclient!cf;I)V")
	public abstract void method7211(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) Class46_Sub1 arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	public abstract void method7212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class28 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public abstract void method7213(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "(ILclient!pa;II)V")
	public abstract void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method7214(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
	public abstract void n();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7215();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "([I)V")
	public abstract void d(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!qa", name = "ta", descriptor = "(II)V")
	public abstract void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public abstract void method7216(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "ra", descriptor = "()F")
	public abstract float ra();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7217(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(IFFFFF)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!mv;)V")
	public abstract void method7218(@OriginalArg(0) Class103 arg0);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
	public abstract boolean method7219();

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)Lclient!u;")
	public abstract Class1_Sub23 method7220(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()V")
	public abstract void method7221();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!cba;)V")
	public abstract void method7222(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1);

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "()Z")
	public abstract boolean method7223();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public final void method7224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg0, arg3, arg1, arg2, 1);
	}
}
