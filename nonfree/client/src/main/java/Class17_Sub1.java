import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class17_Sub1 extends Class17 implements Interface4 {

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!dc;Z)V")
	public Class17_Sub1(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
	@Override
	public int method7145() {
		return super.method7145();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method3561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2) {
		super.method1343(arg1, arg2);
		return true;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7150() {
		return super.method7150();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
	@Override
	public void method7146() {
		super.method7146();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method3559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method7148(arg1);
		return true;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7149() {
		return super.method7149();
	}
}
