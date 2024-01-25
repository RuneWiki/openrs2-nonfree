import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class4_Sub8_Sub1 extends Class4_Sub8 {

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(I)V")
	public Class4_Sub8_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public void method589() {
		this.aNativeHeap1.b();
	}
}
