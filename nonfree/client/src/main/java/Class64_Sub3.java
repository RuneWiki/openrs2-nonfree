import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class64_Sub3 extends Class64 {

	@OriginalMember(owner = "client!sha", name = "r", descriptor = "Lclient!kw;")
	private Class178 aClass178_26;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!ik;Lclient!ik;Lclient!qr;)V")
	public Class64_Sub3(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class104_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
	@Override
	public void method9316() {
		super.method9316();
		this.aClass178_26 = Static686.method9056(super.aClass182_112, ((Class104_Sub3) super.aClass104_5).anInt8377);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9318() {
		return super.method9318() ? super.aClass182_112.method3964(((Class104_Sub3) super.aClass104_5).anInt8377) : false;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method7607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.method7605() * super.aClass104_5.anInt8371 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static153.aClass22_4.K(local16);
		Static153.aClass22_4.KA(arg1, arg0 + 2, arg1 - -local13, super.aClass104_5.anInt8367 + arg0);
		this.aClass178_26.method7621(arg1, arg0 + 2, super.aClass104_5.anInt8371, super.aClass104_5.anInt8367);
		Static153.aClass22_4.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZBI)V")
	@Override
	protected void method7603(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static153.aClass22_4.method9403(arg0 - 2, arg1, super.aClass104_5.anInt8371 + 4, super.aClass104_5.anInt8367 + 2, ((Class104_Sub3) super.aClass104_5).anInt8376, 0);
		Static153.aClass22_4.method9403(arg0 - 1, arg1 + 1, super.aClass104_5.anInt8371 + 2, super.aClass104_5.anInt8367, 0, 0);
	}
}
