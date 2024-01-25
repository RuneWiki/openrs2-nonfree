import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class67 {

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!d;")
	public final Interface2 anInterface2_11;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
	public final int anInt9130;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class67(@OriginalArg(0) Interface2 arg0) {
		this.anInterface2_11 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static670.aBooleanArray29[local10]) {
				Static670.aBooleanArray29[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt9130 = local8;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
	public abstract void method7630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method7631(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
	protected abstract void method7632();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pea;)V")
	public abstract void method7633(@OriginalArg(0) Interface20 arg0);

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "()I")
	public abstract int method7634();

	@OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
	public abstract void pa();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	public abstract void method7635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7636(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
	public abstract void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
	public abstract void la();

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
	public abstract boolean method7637();

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tt;Lclient!hba;)Lclient!pea;")
	public abstract Interface20 method7638(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Interface8 arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!dn;)V")
	public abstract void method7639(@OriginalArg(0) Class77 arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public final void method7640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method7650(arg0, arg1, arg4, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!saa;[Lclient!jr;Z)Lclient!da;")
	public abstract Class44 method7641(@OriginalArg(0) Class330 arg0, @OriginalArg(1) Class194[] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!iu;)V")
	public abstract void method7642(@OriginalArg(0) Class181 arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
	public abstract boolean method7643();

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "()V")
	public abstract void method7645();

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()Lclient!iu;")
	public abstract Class181 method7646();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
	public final void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7700(arg1, arg2, arg4, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
	public abstract boolean method7648();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public abstract void method7649(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
	public abstract void method7650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
	public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
	public abstract boolean method7651();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public abstract void method7652(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
	public abstract void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
	public abstract void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!iq;IIII)Lclient!ka;")
	public abstract Class157 method7653(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
	public abstract boolean method7654();

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "()Z")
	public abstract boolean method7655();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!hu;)V")
	public abstract void method7656(@OriginalArg(0) Class162 arg0);

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public abstract void method7657(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
	public abstract boolean method7658();

	@OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
	public abstract int XA();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!jr;Z)Lclient!bka;")
	public abstract Class9 method7659(@OriginalArg(0) Class194 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
	public abstract int method7660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
	public abstract boolean method7661();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!dn;Lclient!dn;FLclient!dn;)Lclient!dn;")
	public abstract Class77 method7662(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class77 arg3);

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "()V")
	public abstract void method7663();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!bka;")
	public abstract Class9 method7664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)Lclient!za;")
	public abstract Class3_Sub17 method7665(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public abstract void method7666();

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()V")
	public abstract void method7667();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7668(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method7669(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!bka;")
	public abstract Class9 method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
	public abstract int method7671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
	public abstract int[] Y();

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public abstract void method7672(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public abstract void method7673(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
	public final void method7674(@OriginalArg(1) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		this.method7649(arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public abstract int i();

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	public abstract Class1 method7675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public final void method7676() throws Exception_Sub1 {
		this.method7630(0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public final void method7677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.za(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
	public abstract void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
	public abstract void method7678();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	public abstract Class313 method7679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
	public abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public final void method7681() {
		Static670.aBooleanArray29[this.anInt9130] = false;
		this.method7632();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public abstract void method7682(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "()Lclient!iu;")
	public abstract Class181 method7683();

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
	public abstract boolean method7684();

	@OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)Lclient!dn;")
	public abstract Class77 method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!bka;")
	public abstract Class9 method7686(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()Lclient!ega;")
	public abstract Class90 method7687();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIII)Lclient!bka;")
	public final Class9 method7688(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method7686(arg0, arg1, arg2, arg3, true);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lclient!hba;")
	public abstract Interface8 method7689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBI)V")
	public final void method7690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.P(arg2, arg3, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public abstract void method7691(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!hu;I)V")
	public abstract void method7692(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7681();
	}

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()Lclient!iu;")
	public abstract Class181 method7693();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!vj;)V")
	public abstract void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub16[] arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public abstract void method7695(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BIIIII)V")
	public final void method7696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aa(arg0, arg3, arg2, arg1, arg4, 1);
	}

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
	public abstract boolean method7697();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	public abstract void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
	public abstract boolean method7699();

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V")
	public abstract void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
	public final void method7701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg0, arg1, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
	public abstract void method7702(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!vj;")
	public abstract Class3_Sub16 method7703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!bka;I)V")
	public final void method7704(@OriginalArg(0) Class9 arg0) {
		this.method7633(this.method7638(arg0, this.method7689(arg0.method8602(), arg0.method8611())));
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "()V")
	public abstract void method7707();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public abstract void method7708();

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "(I)V")
	public abstract void method7709(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "()Z")
	public abstract boolean method7710();

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
	public abstract boolean method7711();

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
	public abstract boolean method7712();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	public abstract void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
	public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
	public abstract int I();

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
	public abstract void method7715(@OriginalArg(0) Class3_Sub17 arg0);

	@OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
	public abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()V")
	public abstract void method7716();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lclient!tt;")
	public abstract Interface25 method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
