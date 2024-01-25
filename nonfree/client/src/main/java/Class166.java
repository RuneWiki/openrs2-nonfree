import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public final class Class166 implements Interface18 {

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
	public final int anInt4792;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(I)V")
	public Class166(@OriginalArg(0) int arg0) {
		this.anInt4792 = arg0;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)Lclient!hv;")
	@Override
	public Class146 method5444() {
		return Static204.aClass146_15;
	}
}
