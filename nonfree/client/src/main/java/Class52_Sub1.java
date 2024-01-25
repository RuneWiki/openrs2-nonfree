import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
	private int anInt1961 = 0;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!kha;Lclient!fm;)V")
	public Class52_Sub1(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class102_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8345() {
		@Pc(24) int local24 = super.aClass102_2.aClass117_6.method3782(Static199.anInt4634, super.aClass5_5.method7589()) + super.aClass102_2.anInt3827;
		@Pc(38) int local38 = super.aClass102_2.aClass178_6.method5000(super.aClass5_5.method7585(), Static523.anInt9075) + super.aClass102_2.anInt3822;
		super.aClass5_5.method7579((float) (super.aClass5_5.method7589() / 2 + local24), (float) (local38 + super.aClass5_5.method7585() / 2), 4096, this.anInt1961);
		this.anInt1961 += ((Class102_Sub1) super.aClass102_2).anInt3832;
	}
}
