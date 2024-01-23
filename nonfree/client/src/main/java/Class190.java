import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class190 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public int anInt6078;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "[Lclient!ul;")
	private Class175[] aClass175Array2;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	private int anInt6077;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I[Lclient!ul;)V")
	public Class190(@OriginalArg(0) int arg0, @OriginalArg(1) Class175[] arg1) {
		this.anInt6078 = arg0;
		this.aClass175Array2 = arg1;
		this.anInt6077 = Static113.anInt2464;
	}

	@OriginalMember(owner = "client!wd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static113.method1835(this.anInt6078, this.aClass175Array2, this.anInt6077);
		super.finalize();
	}
}
