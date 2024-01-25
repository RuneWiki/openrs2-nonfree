import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class33 {

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Lclient!d;")
	public final Interface5 anInterface5_11;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
	public final int anInt7410;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class33(@OriginalArg(0) Interface5 arg0) {
		this.anInterface5_11 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static454.aBooleanArray18[local10]) {
				Static454.aBooleanArray18[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt7410 = local8;
	}

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
	public abstract void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!ac;)V")
	public final void method6150(@OriginalArg(1) Class5 arg0) {
		this.method6194(this.method6211(arg0, this.method6169(arg0.method7588(), arg0.method7580())));
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public final void method6151() {
		Static454.aBooleanArray18[this.anInt7410] = false;
		this.method6224();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!pk;")
	public abstract Class3_Sub27 method6152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!ac;")
	public abstract Class5 method6153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public abstract void method6154(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
	public abstract boolean method6155();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
	public final void method6156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6174(arg1, arg4, arg0, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
	public abstract void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!id;IIII)Lclient!ka;")
	public abstract Class128 method6157(@OriginalArg(0) Class142 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)Lclient!za;")
	public abstract Class3_Sub5 method6158(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6159(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!cd;)V")
	public abstract void method6160(@OriginalArg(0) Class40 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!be;Z)Lclient!ac;")
	public abstract Class5 method6161(@OriginalArg(0) Class28 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public final void method6162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg3, arg1, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public abstract void method6163();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	public abstract void method6164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
	public abstract boolean method6166();

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
	public abstract void method6167();

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public abstract void method6168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lclient!st;")
	public abstract Interface25 method6169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public final void method6170() throws Exception_Sub1 {
		this.method6217(0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method6171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
	public abstract boolean method6172();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()V")
	public abstract void method6173();

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
	public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
	public abstract void method6174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	public abstract void method6175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
	public abstract void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
	public abstract int method6176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
	public abstract void method6177();

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
	public abstract void method6178();

	@OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()V")
	public abstract void method6181();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public abstract void method6182(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)Lclient!tj;")
	public abstract Class4 method6183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public abstract void method6184(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
	public abstract boolean method6185();

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
	public abstract boolean method6186();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6187(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!ac;")
	public abstract Class5 method6188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method6189(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	public abstract Class1 method6191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
	public abstract boolean method6192();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!ac;")
	public abstract Class5 method6193(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
	public abstract void pa();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!mk;)V")
	public abstract void method6194(@OriginalArg(0) Interface16 arg0);

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
	public abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
	public abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public abstract void method6195(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
	public abstract void method6196(@OriginalArg(0) Class3_Sub5 arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public abstract void method6197(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
	public abstract boolean method6198();

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
	public abstract void method6199();

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "()Lclient!wc;")
	public abstract Class47 method6200();

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public abstract void method6201(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tba;[Lclient!be;Z)Lclient!da;")
	public abstract Class25 method6202(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class28[] arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!pk;)V")
	public abstract void method6203(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27[] arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIB[III)Lclient!ac;")
	public final Class5 method6204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(5) int arg3) {
		return this.method6193(arg2, arg3, arg1, arg0, true);
	}

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
	public abstract boolean method6205();

	@OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
	public abstract void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	public abstract Class274 method6206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	public abstract void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

	@OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V")
	public final void method6208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.P(arg0, arg1, arg3, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIIII)V")
	public final void method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aa(arg3, arg0, arg1, arg2, arg4, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIII)V")
	public final void method6210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.za(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pea;Lclient!st;)Lclient!mk;")
	public abstract Interface16 method6211(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface25 arg1);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public abstract void method6212();

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lclient!pea;")
	public abstract Interface19 method6213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!cd;I)V")
	public abstract void method6214(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
	public abstract void method6215(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
	public abstract boolean method6216();

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V")
	public abstract void method6217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
	public abstract boolean method6218();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tj;)V")
	public abstract void method6219(@OriginalArg(0) Class4 arg0);

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6151();
	}

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
	public abstract int[] Y();

	@OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public abstract int i();

	@OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
	public abstract int method6220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
	public abstract void la();

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
	public abstract boolean method6221();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tj;Lclient!tj;FLclient!tj;)Lclient!tj;")
	public abstract Class4 method6222(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class4 arg3);

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
	public abstract int XA();

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "()Lclient!wc;")
	public abstract Class47 method6223();

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "()V")
	protected abstract void method6224();

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "()Lclient!wc;")
	public abstract Class47 method6225();

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()I")
	public abstract int method6226();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method6227(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
	public abstract void method6228(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public abstract void method6229(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "()Lclient!oj;")
	public abstract Class248 method6230();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
	public abstract int I();

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public abstract void method6232(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!wc;)V")
	public abstract void method6233(@OriginalArg(0) Class47 arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
	public final void method6234(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		this.method6229(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
	public abstract boolean method6235();

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
	public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIB)V")
	public final void method6236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6168(arg4, arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
	public abstract boolean method6237();
}
