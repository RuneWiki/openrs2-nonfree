import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class2_Sub7_Sub1 extends Class2_Sub7 {

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V")
	public Class2_Sub7_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	public void method898() {
		this.aNativeHeap1.a();
	}
}
