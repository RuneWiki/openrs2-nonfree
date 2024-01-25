import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class Class28 {

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_35;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!us;[BI)V")
	protected Class28(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass43_Sub3_35 = arg0;
		this.aBuffer3 = this.aClass43_Sub3_35.aNativeHeap5.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!us;Lclient!jaclib/memory/Buffer;)V")
	protected Class28(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass43_Sub3_35 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "([BI)V")
	protected final void method6579(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass43_Sub3_35.aNativeHeap5.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
