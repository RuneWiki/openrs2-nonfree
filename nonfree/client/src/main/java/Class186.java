import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class186 implements Interface15 {

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "Lclient!om;")
	private final Class246 aClass246_128;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString70;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!om;Ljava/lang/String;)V")
	public Class186(@OriginalArg(0) Class246 arg0, @OriginalArg(1) String arg1) {
		this.aClass246_128 = arg0;
		this.aString70 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
	@Override
	public int method4825() {
		return this.aClass246_128.method5669(this.aString70) ? 100 : this.aClass246_128.method5664(this.aString70);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lclient!wa;")
	@Override
	public Class356 method4824() {
		return Static574.aClass356_4;
	}
}
