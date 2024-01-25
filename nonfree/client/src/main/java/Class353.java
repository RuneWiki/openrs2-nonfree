import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class353 implements Interface22 {

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString111;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "Lclient!kha;")
	private final Class181 aClass181_123;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!kha;Ljava/lang/String;)V")
	public Class353(@OriginalArg(0) Class181 arg0, @OriginalArg(1) String arg1) {
		this.aString111 = arg1;
		this.aClass181_123 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)I")
	@Override
	public int method8554() {
		return this.aClass181_123.method5053(this.aString111) ? 100 : 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Lclient!am;")
	@Override
	public Class19 method8553() {
		return Static19.aClass19_2;
	}
}
