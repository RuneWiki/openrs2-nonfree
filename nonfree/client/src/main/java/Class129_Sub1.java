import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
	private int anInt9416 = 0;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!la;Lclient!ji;)V")
	public Class129_Sub1(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class177_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8110() {
		@Pc(23) int local23 = super.aClass177_2.aClass245_11.method5486(Static79.anInt1667, super.aClass28_32.method4035()) + super.aClass177_2.anInt4699;
		@Pc(38) int local38 = super.aClass177_2.aClass183_8.method4291(super.aClass28_32.method4042(), Static627.anInt10422) + super.aClass177_2.anInt4704;
		super.aClass28_32.method4033((float) (local23 + super.aClass28_32.method4035() / 2), (float) (super.aClass28_32.method4042() / 2 + local38), 4096, this.anInt9416);
		this.anInt9416 += ((Class177_Sub1) super.aClass177_2).anInt4706;
	}
}
