import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class185 implements Interface9 {

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
	public final int anInt4810;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V")
	public Class185(@OriginalArg(0) int arg0) {
		this.anInt4810 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)Lclient!vj;")
	@Override
	public Class365 method9019() {
		return Static197.aClass365_18;
	}
}
