import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class Class292 {

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_41;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!kv;[BI)V")
	protected Class292(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass143_Sub2_41 = arg0;
		this.aBuffer3 = this.aClass143_Sub2_41.aNativeHeap4.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!kv;Lclient!jaclib/memory/Buffer;)V")
	protected Class292(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass143_Sub2_41 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "([BI)V")
	protected final void method8684(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass143_Sub2_41.aNativeHeap4.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
