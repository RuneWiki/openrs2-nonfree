import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class138_Sub2 extends Class138 {

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "Lclient!hh;")
	private Class6 aClass6_24;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!uq;Lclient!uq;Lclient!tw;)V")
	public Class138_Sub2(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class21_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method7395(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7400() * super.aClass21_5.anInt9572 / 10000;
		@Pc(21) int[] local21 = new int[4];
		Static119.aClass95_4.K(local21);
		Static119.aClass95_4.KA(arg0, arg1 + 2, local13 + arg0, super.aClass21_5.anInt9574 + arg1);
		this.aClass6_24.method5139(arg0, arg1 + 2, super.aClass21_5.anInt9572, super.aClass21_5.anInt9574);
		Static119.aClass95_4.KA(local21[0], local21[1], local21[2], local21[3]);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method7396(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static119.aClass95_4.method8062(arg0 - 2, arg1, super.aClass21_5.anInt9572 + 4, super.aClass21_5.anInt9574 - -2, ((Class21_Sub3) super.aClass21_5).anInt9582, 0);
		Static119.aClass95_4.method8062(arg0 - 1, arg1 - -1, super.aClass21_5.anInt9572 + 2, super.aClass21_5.anInt9574, 0, 0);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8281() {
		return super.method8281() ? super.aClass362_128.method8365(((Class21_Sub3) super.aClass21_5).anInt9581) : false;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
	@Override
	public void method8280() {
		super.method8280();
		this.aClass6_24 = Static392.method5476(super.aClass362_128, ((Class21_Sub3) super.aClass21_5).anInt9581);
	}
}
