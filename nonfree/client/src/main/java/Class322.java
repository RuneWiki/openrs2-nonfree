import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class Class322 {

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_37;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "Lclient!jaclib/memory/Buffer;")
	protected Buffer aBuffer3;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!pc;[BI)V")
	protected Class322(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.aClass33_Sub3_37 = arg0;
		this.aBuffer3 = this.aClass33_Sub3_37.aNativeHeap4.a(arg2, false);
		if (arg1 != null) {
			this.aBuffer3.a(arg1, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!pc;Lclient!jaclib/memory/Buffer;)V")
	protected Class322(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Buffer arg1) {
		this.aClass33_Sub3_37 = arg0;
		this.aBuffer3 = arg1;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "([BI)V")
	protected final void method8373(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (this.aBuffer3 == null || this.aBuffer3.getSize() < arg1) {
			this.aBuffer3 = this.aClass33_Sub3_37.aNativeHeap4.a(arg1, false);
		}
		this.aBuffer3.a(arg0, 0, 0, arg1);
	}
}
