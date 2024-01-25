import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class303 implements Interface10 {

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	public final int anInt8697;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
	public Class303(@OriginalArg(0) int arg0) {
		this.anInt8697 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Lclient!vaa;")
	@Override
	public Class361 method8585() {
		return Static622.aClass361_18;
	}
}
