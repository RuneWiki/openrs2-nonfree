import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class29_Sub22 extends Class29 {

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	private final int anInt10940;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
	private final int anInt10941;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub22(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt10940 = arg0.method2028(-14795);
		this.anInt10941 = arg0.method2048(255);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static502.method6857(this.anInt10940, 0, this.anInt10941);
	}
}
