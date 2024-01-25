import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public final class Class362 implements Interface5 {

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "Lclient!ik;")
	private final Class182 aClass182_115;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Ljava/lang/String;")
	private final String aString120;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!ik;Ljava/lang/String;)V")
	public Class362(@OriginalArg(0) Class182 arg0, @OriginalArg(1) String arg1) {
		this.aClass182_115 = arg0;
		this.aString120 = arg1;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)Lclient!bq;")
	@Override
	public Class46 method9563() {
		return Static59.aClass46_3;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)I")
	@Override
	public int method9564() {
		return this.aClass182_115.method3977(this.aString120) ? 100 : 0;
	}
}
