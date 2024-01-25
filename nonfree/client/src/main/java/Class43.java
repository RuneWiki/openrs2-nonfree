import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class43 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Lclient!fa;")
	public final Interface8 anInterface8_12;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "I")
	public final int anInt8539;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!fa;)V")
	public Class43(@OriginalArg(0) Interface8 arg0) {
		this.anInterface8_12 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static179.aBooleanArray11[local10]) {
				local8 = local10;
				Static179.aBooleanArray11[local10] = true;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8539 = local8;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public abstract void method7137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!daa;[Lclient!vw;Z)Lclient!la;")
	public abstract Class117 method7139(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class355[] arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()Lclient!q;")
	public abstract Class109 method7140();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public abstract void method7141(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()Lclient!q;")
	public abstract Class109 method7142();

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
	public abstract int BA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lclient!f;")
	public abstract Class46 method7143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
	public abstract void method7144(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
	public final void method7145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7170(arg3, arg4, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
	public abstract boolean method7146();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
	public abstract boolean method7147();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!js;)V")
	public abstract void method7148(@OriginalArg(0) Class55 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lclient!ff;)V")
	public abstract void method7149(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22[] arg1);

	@OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
	public abstract boolean method7150();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
	public final void method7151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.e(arg0, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "()V")
	public abstract void method7152();

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
	public abstract int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "h", descriptor = "()Z")
	public abstract boolean method7153();

	@OriginalMember(owner = "client!r", name = "i", descriptor = "()V")
	public abstract void method7154();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	public abstract void method7156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class146 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void method7157(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
	public abstract void method7158(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!r", name = "j", descriptor = "()I")
	public abstract int method7159();

	@OriginalMember(owner = "client!r", name = "k", descriptor = "()Lclient!q;")
	public abstract Class109 method7160();

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()Z")
	public abstract boolean method7161();

	@OriginalMember(owner = "client!r", name = "m", descriptor = "()Z")
	public abstract boolean method7162();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7163(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lclient!ff;")
	public abstract Class3_Sub22 method7164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()V")
	protected abstract void method7165();

	@OriginalMember(owner = "client!r", name = "o", descriptor = "()Z")
	public abstract boolean method7166();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!js;Lclient!js;FLclient!js;)Lclient!js;")
	public abstract Class55 method7167(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class55 arg3);

	@OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
	public abstract void oa(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	public abstract Class146 method7168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
	public abstract void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
	public abstract int method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V")
	public abstract void method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "p", descriptor = "()V")
	public abstract void method7171();

	@OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
	public abstract boolean method7172();

	@OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
	public abstract void JA();

	@OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
	public abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILclient!ua;II)V")
	public abstract void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "r", descriptor = "()Z")
	public abstract boolean method7173();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
	public final void method7174(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7137(arg3, arg2, arg0, arg1, arg4, 1);
	}

	@OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
	public abstract int T();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;I)V")
	public final void method7175(@OriginalArg(0) Class46 arg0) {
		this.method7190(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fi;I)V")
	public abstract void method7176(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
	public abstract void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "s", descriptor = "()V")
	public abstract void method7177();

	@OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!nda;IIII)Lclient!da;")
	public abstract Class57 method7178(@OriginalArg(0) Class226 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public final void method7179() {
		Static179.aBooleanArray11[this.anInt8539] = false;
		this.method7165();
	}

	@OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
	public abstract boolean method7180();

	@OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
	public abstract void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	public abstract void method7182(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7183(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7179();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	public abstract Class46 method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V")
	public final void method7185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.J(arg3, arg0, arg2, arg1, arg4, 1);
	}

	@OriginalMember(owner = "client!r", name = "u", descriptor = "()Lclient!mp;")
	public abstract Class216 method7186();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7187(@OriginalArg(0) Class109 arg0);

	@OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
	public abstract void ja(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
	public abstract void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!fi;)V")
	public abstract void method7189(@OriginalArg(0) Class96 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!f;Z)V")
	protected abstract void method7190(@OriginalArg(0) Class46 arg0);

	@OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
	public abstract void ZA(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public abstract void method7191(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
	public abstract boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "w", descriptor = "()Z")
	public abstract boolean method7192();

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(I)Lclient!e;")
	public abstract Class3_Sub16 method7193(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7194();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public abstract void method7195(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
	public abstract void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
	public abstract int[] v();

	@OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
	public abstract void method7197() throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lclient!f;")
	public abstract Class46 method7198(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7199(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIBI)V")
	public final void method7200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.XA(arg0, arg3, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
	public abstract void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!e;)V")
	public abstract void method7201(@OriginalArg(0) Class3_Sub16 arg0);

	@OriginalMember(owner = "client!r", name = "y", descriptor = "()V")
	public abstract void method7202();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
	public abstract int method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!r", name = "z", descriptor = "()V")
	public abstract void method7204();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!vw;Z)Lclient!f;")
	public abstract Class46 method7205(@OriginalArg(0) Class355 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	public abstract void method7206(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method7207(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(IIIIII)Lclient!js;")
	public abstract Class55 method7208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7209(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	public abstract Class139 method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!r", name = "A", descriptor = "()Z")
	public abstract boolean method7211();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIII)V")
	public final void method7213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.m(arg0, arg3, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
	public abstract void ra(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method7214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void method7215(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
	public abstract boolean method7216();

	@OriginalMember(owner = "client!r", name = "C", descriptor = "()Z")
	public abstract boolean method7217();

	@OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
