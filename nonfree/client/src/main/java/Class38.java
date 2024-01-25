import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public final class Class38 implements Interface5 {

	@OriginalMember(owner = "client!bja", name = "c", descriptor = "Lclient!ik;")
	private final Class182 aClass182_8;

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString19;

	@OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lclient!ik;Ljava/lang/String;)V")
	public Class38(@OriginalArg(0) Class182 arg0, @OriginalArg(1) String arg1) {
		this.aClass182_8 = arg0;
		this.aString19 = arg1;
	}

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "(I)Lclient!bq;")
	@Override
	public Class46 method9563() {
		return Static59.aClass46_4;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)I")
	@Override
	public int method9564() {
		return this.aClass182_8.method3953(this.aString19) ? 100 : this.aClass182_8.method3963(this.aString19);
	}
}
