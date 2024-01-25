import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!vs", name = "t", descriptor = "Lclient!ac;")
	private Class5 aClass5_38;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!kha;Lclient!kha;Lclient!fa;)V")
	public Class39_Sub3(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class41_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(IIIZ)V")
	@Override
	protected void method8350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static47.aClass33_3.method6174(arg1 - 2, arg0, super.aClass41_5.anInt9779 + 4, super.aClass41_5.anInt9773 + 2, ((Class41_Sub3) super.aClass41_5).anInt3543, 0);
		Static47.aClass33_3.method6174(arg1 - 1, arg0 - -1, super.aClass41_5.anInt9779 + 2, super.aClass41_5.anInt9773, 0, 0);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method8349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.method8348() * super.aClass41_5.anInt9779 / 10000;
		@Pc(24) int[] local24 = new int[4];
		Static47.aClass33_3.K(local24);
		Static47.aClass33_3.KA(arg0, arg1 + 2, arg0 + local13, super.aClass41_5.anInt9773 + arg1);
		this.aClass5_38.method7598(arg0, arg1 + 2, super.aClass41_5.anInt9779, super.aClass41_5.anInt9773);
		Static47.aClass33_3.KA(local24[0], local24[1], local24[2], local24[3]);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	@Override
	public void method8346() {
		super.method8346();
		this.aClass5_38 = Static336.method3828(super.aClass181_130, ((Class41_Sub3) super.aClass41_5).anInt3544);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8344() {
		return super.method8344() ? super.aClass181_130.method5040(((Class41_Sub3) super.aClass41_5).anInt3544) : false;
	}
}
