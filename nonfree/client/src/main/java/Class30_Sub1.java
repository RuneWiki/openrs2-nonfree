import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bba", name = "s", descriptor = "I")
	private int anInt456 = 0;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!lga;Lclient!gja;)V")
	public Class30_Sub1(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class137_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8039() {
		@Pc(26) int local26 = super.aClass137_2.aClass318_11.method7565(super.aClass49_4.method8991(), Static339.anInt5789) + super.aClass137_2.anInt4036;
		@Pc(41) int local41 = super.aClass137_2.aClass238_6.method5892(super.aClass49_4.method8987(), Static48.anInt6772) + super.aClass137_2.anInt4034;
		super.aClass49_4.method8999((float) (super.aClass49_4.method8991() / 2 + local26), (float) (super.aClass49_4.method8987() / 2 + local41), 4096, this.anInt456);
		this.anInt456 += ((Class137_Sub1) super.aClass137_2).anInt4039;
	}
}
