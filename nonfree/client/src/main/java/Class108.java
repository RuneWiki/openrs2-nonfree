import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public class Class108 implements Interface24 {

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!ho;")
	protected Class9 aClass9_19;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!ae;")
	private final Class8 aClass8_49;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!cb;")
	protected final Class47 aClass47_2;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!ae;Lclient!cb;)V")
	public Class108(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class47 arg1) {
		this.aClass8_49 = arg0;
		this.aClass47_2 = arg1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8706() {
		@Pc(16) int local16 = this.aClass47_2.aClass7_11.method247(Static365.anInt6242, this.aClass9_19.method8937()) + this.aClass47_2.anInt10344;
		@Pc(30) int local30 = this.aClass47_2.aClass249_14.method6236(Static335.anInt5755, this.aClass9_19.method8930()) + this.aClass47_2.anInt10347;
		this.aClass9_19.method8920(local16, local30);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	@Override
	public final void method8705() {
		this.aClass9_19 = Static215.method3139(this.aClass47_2.anInt10343, this.aClass8_49);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8704() {
		return this.aClass8_49.method273(this.aClass47_2.anInt10343);
	}
}
