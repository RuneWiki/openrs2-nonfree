import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public final class Class67 implements Interface8 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
	public final int anInt2311;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I)V")
	public Class67(@OriginalArg(0) int arg0) {
		this.anInt2311 = arg0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Lclient!fl;")
	@Override
	public Class103 method7774() {
		return Static429.aClass103_6;
	}
}
