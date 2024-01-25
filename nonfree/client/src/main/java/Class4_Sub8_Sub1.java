import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public final class Class4_Sub8_Sub1 extends Class4_Sub8 {

	@OriginalMember(owner = "client!dba", name = "x", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(I)V")
	public Class4_Sub8_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V")
	public void method1792() {
		this.aNativeHeap3.b();
	}
}
