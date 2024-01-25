import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class145 {

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!d;")
	public final Interface3 anInterface3_12;

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	public final int anInt11056;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class145(@OriginalArg(0) Interface3 arg0) {
		this.anInterface3_12 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static324.aBooleanArray22[local10]) {
				Static324.aBooleanArray22[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt11056 = local8;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method9631(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
	public abstract boolean method9632();

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public abstract void method9633(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
	public final void method9634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.P(arg0, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
	public abstract int[] Y();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIZ)V")
	public final void method9635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method9713(arg3, arg1, arg4, arg2, arg0, 1);
	}

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
	public abstract void method9636();

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
	public final void method9637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aa(arg4, arg2, arg0, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!ug;")
	public abstract Class43 method9638(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public abstract void method9639(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method9640(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIII)V")
	public final void method9641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.U(arg3, arg0, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "()V")
	protected abstract void method9642();

	@OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public abstract void method9643(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
	public abstract void method9644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lclient!mh;")
	public abstract Interface16 method9645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
	public abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
	public abstract boolean method9646();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public final void method9647() throws Exception_Sub1 {
		this.method9644(0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
	public abstract boolean method9648();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lclient!za;")
	public abstract Class2_Sub28 method9649(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
	public abstract boolean method9650();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
	public final void method9651(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method9639(arg0, arg1, 0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
	public abstract void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
	public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method9661();
	}

	@OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
	public abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()Lclient!bo;")
	public abstract Class47 method9653();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!ug;")
	public abstract Class43 method9654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!bba;)V")
	public abstract void method9655(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7[] arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!gw;)V")
	public abstract void method9656(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lclient!jt;")
	public abstract Interface11 method9657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
	public abstract void la();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!cla;)V")
	public abstract void method9658(@OriginalArg(0) Interface1 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public abstract void method9659(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()V")
	public abstract void method9660();

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public abstract int i();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public final void method9661() {
		Static324.aBooleanArray22[this.anInt11056] = false;
		this.method9642();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method9662(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
	public abstract void method9663(@OriginalArg(0) Class2_Sub28 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!bba;")
	public abstract Class2_Sub7 method9664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
	public abstract boolean method9665();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!mb;)V")
	public abstract void method9666(@OriginalArg(0) Class236 arg0);

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
	public abstract void method9667();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
	public abstract void method9668(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public abstract void method9669(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method9670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
	public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
	public abstract boolean method9671();

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public abstract void method9672(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "()V")
	public abstract void method9673();

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
	public abstract boolean method9674();

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
	public abstract boolean method9675();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	public abstract Class1 method9677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!db;Lclient!db;FLclient!db;)Lclient!db;")
	public abstract Class74 method9678(@OriginalArg(0) Class74 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class74 arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	public abstract Class133 method9679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public final void method9680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.za(arg3, arg0, arg1, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
	public abstract boolean method9681();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	public abstract void method9682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tia;Z)Lclient!ug;")
	public abstract Class43 method9683(@OriginalArg(0) Class355 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public abstract void method9684(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
	public abstract int method9686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!ug;")
	public abstract Class43 method9687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
	public final void method9688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method9714(arg3, arg2, arg4, arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method9689(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!mb;I)V")
	public abstract void method9690(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "()Lclient!gw;")
	public abstract Class86 method9691();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)Lclient!db;")
	public abstract Class74 method9692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
	public abstract boolean method9693();

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()I")
	public abstract int method9694();

	@OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
	public abstract int method9695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
	public abstract void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public abstract void method9696();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!jt;Lclient!mh;)Lclient!cla;")
	public abstract Interface1 method9697(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Interface16 arg1);

	@OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
	public abstract void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
	public abstract boolean method9698();

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()Lclient!gw;")
	public abstract Class86 method9699();

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ln;IIII)Lclient!ka;")
	public abstract Class45 method9700(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!db;)V")
	public abstract void method9701(@OriginalArg(0) Class74 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	public abstract void method9702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
	public abstract boolean method9703();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	public abstract void method9704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public abstract void method9705(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
	public abstract void method9706();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pga;[Lclient!tia;Z)Lclient!da;")
	public abstract Class68 method9707(@OriginalArg(0) Class289 arg0, @OriginalArg(1) Class355[] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method9708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
	public abstract void method9709(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
	public abstract boolean method9710();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII[IB)Lclient!ug;")
	public final Class43 method9711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		return this.method9638(arg3, arg1, arg0, arg2, true);
	}

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "()V")
	public abstract void method9712();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public abstract void method9713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
	public abstract void method9714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
	public abstract boolean method9715();

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()Lclient!gw;")
	public abstract Class86 method9716();

	@OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
	public abstract int XA();

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
	public abstract void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!ug;)V")
	public final void method9717(@OriginalArg(1) Class43 arg0) {
		this.method9658(this.method9697(arg0, this.method9645(arg0.method9601(), arg0.method9592())));
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
	public abstract void method9718();

	@OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
	public abstract void pa();

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
	public abstract int I();
}
