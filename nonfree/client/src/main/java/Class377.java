import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class377 implements Interface4 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
	public final int anInt10170;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(I)V")
	public Class377(@OriginalArg(0) int arg0) {
		this.anInt10170 = arg0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Lclient!hr;")
	@Override
	public Class146 method8713() {
		return Static305.aClass146_5;
	}
}
