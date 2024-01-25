import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
	private int anInt3292 = 0;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!aj;Lclient!mja;)V")
	public Class103_Sub1(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class222_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7760() {
		@Pc(18) int local18 = super.aClass222_2.aClass356_11.method8711(super.aClass33_7.method7645(), Static33.anInt10742) + super.aClass222_2.anInt6030;
		@Pc(37) int local37 = super.aClass222_2.aClass56_13.method1354(Static602.anInt9666, super.aClass33_7.method7658()) + super.aClass222_2.anInt6031;
		super.aClass33_7.method7661((float) (super.aClass33_7.method7645() / 2 + local18), (float) (local37 + super.aClass33_7.method7658() / 2), 4096, this.anInt3292);
		this.anInt3292 += ((Class222_Sub1) super.aClass222_2).anInt6034;
	}
}
