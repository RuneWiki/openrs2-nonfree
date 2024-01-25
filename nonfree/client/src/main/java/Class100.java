import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class100 implements Interface24 {

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public final int anInt2695;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(I)V")
	public Class100(@OriginalArg(0) int arg0) {
		this.anInt2695 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)Lclient!gp;")
	@Override
	public Class139 method8810() {
		return Static456.aClass139_7;
	}
}
