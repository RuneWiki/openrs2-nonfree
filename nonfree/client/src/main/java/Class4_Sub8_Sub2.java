import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public final class Class4_Sub8_Sub2 extends Class4_Sub8 {

	@OriginalMember(owner = "client!gea", name = "w", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(I)V")
	public Class4_Sub8_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
	public void method2966() {
		this.aNativeHeap4.b();
	}
}
