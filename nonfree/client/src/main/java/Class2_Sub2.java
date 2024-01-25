import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public final class Class2_Sub2 extends Class2 implements Interface15 {

	@OriginalMember(owner = "client!uw", name = "z", descriptor = "B")
	private byte aByte152;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!pa;Z)V")
	public Class2_Sub2(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	@Override
	public boolean method8745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Source arg2) {
		this.aByte152 = (byte) arg1;
		super.method8738(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8747() {
		return super.method8742(super.aClass13_Sub1_Sub1_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method8746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte152 = (byte) arg1;
		super.method8740(arg0);
		return true;
	}

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "(I)I")
	public int method8750() {
		return this.aByte152;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8744() {
		return super.method8741(super.aClass13_Sub1_Sub1_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
	@Override
	public void method8737() {
		super.method8737();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)I")
	@Override
	public int method8734() {
		return super.method8734();
	}
}
