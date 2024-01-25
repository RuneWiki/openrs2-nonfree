import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class29_Sub17 extends Class29 {

	@OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
	private final int anInt9079;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
	private final int anInt9082;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
	private final int anInt9078;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	private final int anInt9077;

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	private final int anInt9080;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub17(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt9079 = arg0.method2028(-14795);
		@Pc(11) int local11 = arg0.method2036();
		this.anInt9082 = local11 & 0xFFFF;
		this.anInt9078 = local11 >>> 16;
		this.anInt9077 = arg0.method2048(255);
		this.anInt9080 = arg0.method2009(128);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static470.aClass7Array1[this.anInt9079].method245(this.anInt9077, this.anInt9080, this.anInt9082, this.anInt9078);
	}
}
