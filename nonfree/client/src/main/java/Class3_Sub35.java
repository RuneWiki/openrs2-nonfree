import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
	public final int anInt5466;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	public final int anInt5460;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	public final int anInt5468;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	public final int anInt5465;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
	public final int anInt5454;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
	public final int anInt5463;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
	public final int anInt5458;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	public final int anInt5459;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	public final int anInt5464;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class3_Sub35(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(5) int local5 = arg0.method2036();
		this.anInt5466 = local5 & 0x3FFF;
		this.anInt5460 = local5 >>> 28;
		this.anInt5468 = local5 >>> 14 & 0x3FFF;
		this.anInt5465 = arg0.method2048(255);
		this.anInt5454 = arg0.method2048(255);
		this.anInt5463 = arg0.method2048(255);
		this.anInt5458 = arg0.method2048(255);
		this.anInt5459 = arg0.method2048(255);
		this.anInt5464 = arg0.method2048(255);
	}
}
