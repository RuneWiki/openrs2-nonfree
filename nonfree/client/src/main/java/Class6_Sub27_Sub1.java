import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class6_Sub27_Sub1 extends Class6_Sub27 {

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I)V")
	public Class6_Sub27_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	public void method5231() {
		this.aNativeHeap2.b();
	}
}
