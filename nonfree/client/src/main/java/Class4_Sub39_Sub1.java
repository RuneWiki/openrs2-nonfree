import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class4_Sub39_Sub1 extends Class4_Sub39 {

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V")
	public Class4_Sub39_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
	public void method4986() {
		this.aNativeHeap1.b();
	}
}
