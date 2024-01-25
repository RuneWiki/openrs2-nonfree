import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bia")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
	private final int anInt829;

	@OriginalMember(owner = "client!bia", name = "i", descriptor = "I")
	private final int anInt828;

	@OriginalMember(owner = "client!bia", name = "h", descriptor = "I")
	private final int anInt833;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub3(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt829 = arg0.method5272();
		this.anInt828 = arg0.method5272();
		this.anInt833 = arg0.method5322(-30);
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		@Pc(8) Class11 local8 = Static154.aClass11Array1[this.anInt829];
		@Pc(20) Class297 local20 = Static106.aClass297Array1[this.anInt828];
		local20.method7235(local8, this.anInt833);
	}
}
