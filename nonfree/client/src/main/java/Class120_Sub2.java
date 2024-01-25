import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class120_Sub2 extends Class120 {

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "Lclient!tf;")
	private Class17 aClass17_57;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!bt;Lclient!bt;Lclient!ta;)V")
	public Class120_Sub2(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class103_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method8642(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method8641() * super.aClass103_5.anInt8646 / 10000;
		@Pc(16) int[] local16 = new int[4];
		Static582.aClass33_13.K(local16);
		Static582.aClass33_13.KA(arg0, arg1 + 2, arg0 + local13, super.aClass103_5.anInt8653 + arg1);
		this.aClass17_57.method5261(arg0, arg1 + 2, super.aClass103_5.anInt8646, super.aClass103_5.anInt8653);
		Static582.aClass33_13.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZIB)V")
	@Override
	protected void method8643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static582.aClass33_13.method8142(arg0 - 2, arg1, super.aClass103_5.anInt8646 + 4, super.aClass103_5.anInt8653 + 2, ((Class103_Sub3) super.aClass103_5).anInt8654, 0);
		Static582.aClass33_13.method8142(arg0 - 1, arg1 - -1, super.aClass103_5.anInt8646 + 2, super.aClass103_5.anInt8653, 0, 0);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	@Override
	public void method8638() {
		super.method8638();
		this.aClass17_57 = Static203.method3069(((Class103_Sub3) super.aClass103_5).anInt8657, super.aClass34_131);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8636() {
		return super.method8636() ? super.aClass34_131.method1235(((Class103_Sub3) super.aClass103_5).anInt8657) : false;
	}
}
