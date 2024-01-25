import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class2_Sub13_Sub1 extends Class2_Sub13 {

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "[I")
	public static final int[] anIntArray451 = new int[4096];

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray451[local4] = Static95.method1474(local4);
		}
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
	public void method5493() {
		this.aNativeHeap4.b();
	}
}
