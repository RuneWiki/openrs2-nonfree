import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "I")
	private int anInt972 = 0;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!uu;Lclient!rf;)V")
	public Class36_Sub1(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class66_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8108() {
		@Pc(18) int local18 = super.aClass66_2.aClass293_8.method7212(Static623.anInt9971, super.aClass103_2.method7454()) + super.aClass66_2.anInt8331;
		@Pc(38) int local38 = super.aClass66_2.aClass15_10.method259(super.aClass103_2.method7451(), Static269.anInt5258) + super.aClass66_2.anInt8333;
		super.aClass103_2.method7450((float) (local18 + super.aClass103_2.method7454() / 2), (float) (local38 + super.aClass103_2.method7451() / 2), 4096, this.anInt972);
		this.anInt972 += ((Class66_Sub1) super.aClass66_2).anInt8341;
	}
}
