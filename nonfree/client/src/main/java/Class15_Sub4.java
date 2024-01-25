import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class15_Sub4 extends Class15 {

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "J")
	private final long aLong62;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
	private final int anInt1772;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!et;Z)V")
	public Class15_Sub4(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0);
		@Pc(6) int local6 = arg0.method8575();
		if (arg1) {
			this.aLong62 = (long) local6 | 0x100000000L;
		} else {
			this.aLong62 = (long) local6;
		}
		this.anInt1772 = arg0.method8555(-9372);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		@Pc(18) Class2_Sub2 local18 = (Class2_Sub2) Static424.aClass218_28.method5095(this.aLong62, 0);
		if (local18 == null) {
			Static424.aClass218_28.method5099(new Class2_Sub2(this.anInt1772), this.aLong62);
		} else {
			local18.anInt41 = this.anInt1772;
		}
	}
}
