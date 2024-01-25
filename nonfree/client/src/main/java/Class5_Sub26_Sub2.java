import jaclib.memory.heap.NativeHeap;
import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class5_Sub26_Sub2 extends Class5_Sub26 {

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
	public Class5_Sub26_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public void method5440() {
		this.aNativeHeap5.b();
	}
}
