import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public final class Class115_Sub2 extends Class115 implements Interface23 {

	@OriginalMember(owner = "client!ot", name = "L", descriptor = "B")
	private byte aByte91;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!tba;Z)V")
	public Class115_Sub2(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method5569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte91 = (byte) arg1;
		super.method5600(arg0);
		return true;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method5570() {
		return super.method5563(super.aClass78_Sub1_Sub2_8.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)I")
	@Override
	public int method5598() {
		return super.method5598();
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)I")
	public int method5574() {
		return this.aByte91;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5572() {
		return super.method5558(super.aClass78_Sub1_Sub2_8.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method5571(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte91 = (byte) arg1;
		super.method5562(arg2, arg0);
		return true;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
	@Override
	public void method5601() {
		super.method5601();
	}
}
