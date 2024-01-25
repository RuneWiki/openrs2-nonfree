import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!nw", name = "n", descriptor = "I")
	private int anInt7017 = 0;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!eq;Lclient!gu;)V")
	public Class67_Sub1(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class138_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022() {
		@Pc(18) int local18 = super.aClass138_2.aClass174_8.method4260(Static386.anInt6961, super.aClass20_29.method4588()) + super.aClass138_2.anInt4158;
		@Pc(38) int local38 = super.aClass138_2.aClass176_8.method4289(super.aClass20_29.method4576(), Static135.anInt3053) + super.aClass138_2.anInt4160;
		super.aClass20_29.method4578((float) (super.aClass20_29.method4588() / 2 + local18), (float) (super.aClass20_29.method4576() / 2 + local38), 4096, this.anInt7017);
		this.anInt7017 += ((Class138_Sub1) super.aClass138_2).anInt4164;
	}
}
