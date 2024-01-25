import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public abstract class Class39 {

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!n;")
	public final Interface12 anInterface12_15;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	public final int anInt7092;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!n;)V")
	public Class39(@OriginalArg(0) Interface12 arg0) {
		this.anInterface12_15 = arg0;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
			if (!Static180.aBooleanArray21[local10]) {
				Static180.aBooleanArray21[local10] = true;
				local8 = local10;
				break;
			}
		}
		if (local8 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt7092 = local8;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6006();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6007(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public abstract void method6008(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lclient!rr;")
	public abstract Class254 method6009();

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(IFFFFF)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "UA", descriptor = "(IIIII)V")
	public abstract void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(IIIIII)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
	public abstract void method6010(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
	public abstract void n();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!bt;IIII)Lclient!r;")
	public abstract Class63 method6011(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "(I)V")
	public abstract void L(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public abstract void method6012(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
	public abstract boolean method6013();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
	public abstract boolean method6014();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!m;)V")
	public abstract void method6015(@OriginalArg(0) Class181 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
	public abstract void method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	public abstract Class209 method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "(IIII)[I")
	public abstract int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "za", descriptor = "(IIIIII[BII)V")
	public abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
	public abstract int c();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!qr;Z)Lclient!ha;")
	public abstract Class35 method6018(@OriginalArg(0) Class241 arg0);

	@OriginalMember(owner = "client!qa", name = "CA", descriptor = "()I")
	public abstract int CA();

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIII)V")
	public abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
	public abstract int YA();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!oaa;)V")
	public abstract void method6019(@OriginalArg(0) Class208 arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!r;Lclient!oaa;Lclient!m;Lclient!gr;I)V")
	public abstract void method6020(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4 arg3);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
	public final void method6021() {
		Static180.aBooleanArray21[this.anInt7092] = false;
		this.method6055();
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()Lclient!m;")
	public abstract Class181 method6022();

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIII)V")
	protected abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "IA", descriptor = "(III[I)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()V")
	public abstract void method6023();

	@OriginalMember(owner = "client!qa", name = "ra", descriptor = "()F")
	public abstract float ra();

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
	public abstract boolean method6024();

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "()Z")
	public abstract boolean method6025();

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()Z")
	public abstract boolean method6026();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	public abstract void method6027(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
	public abstract int method6028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "xa", descriptor = "()V")
	public abstract void xa();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!oaa;Lclient!m;[Lclient!gr;I)V")
	public abstract void method6030(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "()V")
	public abstract void method6031();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	public abstract void method6032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class209 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Lclient!u;")
	public abstract Class2_Sub4 method6033(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "()V")
	public abstract void method6034() throws Exception_Sub1;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()Lclient!m;")
	public abstract Class181 method6035();

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
	public abstract boolean method6036();

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
	public abstract boolean method6037();

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6038(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "(IIIIII)Z")
	public abstract boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)Lclient!lh;")
	public abstract Class58 method6040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "()V")
	public abstract void method6041();

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
	public abstract boolean method6043();

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "(F)V")
	public abstract void M(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public abstract void method6044(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "la", descriptor = "(FF)V")
	public abstract void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!lh;Lclient!lh;FLclient!lh;)Lclient!lh;")
	public abstract Class58 method6045(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class58 arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!gr;I)V")
	public abstract void method6046(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class6_Sub4[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
	public abstract void method6047(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
	public final void method6048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6083(arg3, arg4, arg1, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!qa", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lclient!ha;")
	public abstract Class35 method6049(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!u;)V")
	public abstract void method6050(@OriginalArg(0) Class2_Sub4 arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6051(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BIIIII)V")
	public final void method6052(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.f(arg2, arg0, arg4, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "()I")
	public abstract int method6053();

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "()Z")
	public abstract boolean method6054();

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "()V")
	protected abstract void method6055();

	@OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6021();
	}

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()V")
	public abstract void method6056();

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method6057(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
	public abstract void method6058(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!lh;)V")
	public abstract void method6059(@OriginalArg(0) Class58 arg0);

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "(I)V")
	public abstract void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
	public abstract void method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIIII)V")
	public final void method6061(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method6060(arg4, arg3, arg0, arg2, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "ta", descriptor = "(II)V")
	public abstract void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "()V")
	public abstract void method6062();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lclient!at;)V")
	public abstract void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5[] arg1);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method6064(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
	public abstract boolean method6065();

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
	public abstract boolean method6066();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
	public final void method6067(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.UA(arg2, arg1, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "()F")
	public abstract float P();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
	public abstract void method6069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
	public abstract int method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V")
	public final void method6071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.e(arg3, arg2, arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	public abstract Class35 method6072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
	public abstract boolean method6073();

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
	public abstract void method6074(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
	public abstract boolean method6075();

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)V")
	public abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "()V")
	public abstract void method6076();

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "(ILclient!pa;II)V")
	public abstract void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lclient!at;")
	public abstract Class2_Sub5 method6077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "(III)V")
	public abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!dd;[Lclient!qr;Z)Lclient!ra;")
	public abstract Class47 method6078(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class241[] arg1);

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIII)V")
	public final void method6079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.A(arg2, arg1, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
	public abstract boolean method6080();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class75 method6081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "()Z")
	public abstract boolean method6082();

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
	public abstract void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIII)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)V")
	public abstract void method6083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "([I)V")
	public abstract void d(@OriginalArg(0) int[] arg0);
}
