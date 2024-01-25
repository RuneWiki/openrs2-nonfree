import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cka")
public final class Class29_Sub3 extends Class29 {

	@OriginalMember(owner = "client!cka", name = "l", descriptor = "J")
	private final long aLong67;

	@OriginalMember(owner = "client!cka", name = "o", descriptor = "I")
	private final int anInt1905;

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lclient!ika;Z)V")
	public Class29_Sub3(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0);
		@Pc(6) int local6 = arg0.method2028(-14795);
		if (arg1) {
			this.aLong67 = (long) local6 | 0x100000000L;
		} else {
			this.aLong67 = (long) local6;
		}
		this.anInt1905 = arg0.method2036();
	}

	@OriginalMember(owner = "client!cka", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		@Pc(15) Class3_Sub44 local15 = (Class3_Sub44) Static339.aClass313_24.method7104(this.aLong67);
		if (local15 == null) {
			Static339.aClass313_24.method7107(this.aLong67, new Class3_Sub44(this.anInt1905));
		} else {
			local15.anInt7298 = this.anInt1905;
		}
	}
}
