import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public class Class151 implements Interface21 {

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "Lclient!ufa;")
	protected Class4 aClass4_18;

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "Lclient!uk;")
	protected final Class72 aClass72_2;

	@OriginalMember(owner = "client!jca", name = "k", descriptor = "Lclient!ni;")
	private final Class223 aClass223_75;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!ni;Lclient!uk;)V")
	public Class151(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class72 arg1) {
		this.aClass72_2 = arg1;
		this.aClass223_75 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7994() {
		@Pc(23) int local23 = this.aClass72_2.aClass79_6.method2610(Static182.anInt4018, this.aClass4_18.method7700()) + this.aClass72_2.anInt2968;
		@Pc(37) int local37 = this.aClass72_2.aClass127_7.method3682(this.aClass4_18.method7712(), Static52.anInt1780) + this.aClass72_2.anInt2969;
		this.aClass4_18.method7698(local23, local37);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V")
	@Override
	public final void method7992() {
		this.aClass4_18 = Static100.method2419(this.aClass72_2.anInt2966, this.aClass223_75);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method7993() {
		return this.aClass223_75.method5951(this.aClass72_2.anInt2966);
	}
}
