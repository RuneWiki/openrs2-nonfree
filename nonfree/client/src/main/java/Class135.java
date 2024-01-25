import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class135 implements Interface13 {

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public final int anInt3590;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
	public Class135(@OriginalArg(0) int arg0) {
		this.anInt3590 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Lclient!mha;")
	@Override
	public Class228 method8022() {
		return Static588.aClass228_10;
	}
}
