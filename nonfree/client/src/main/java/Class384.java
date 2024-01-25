import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public final class Class384 implements Interface27 {

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
	public final int anInt11191;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(I)V")
	public Class384(@OriginalArg(0) int arg0) {
		this.anInt11191 = arg0;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)Lclient!hl;")
	@Override
	public Class148 method9592() {
		return Static262.aClass148_12;
	}
}
