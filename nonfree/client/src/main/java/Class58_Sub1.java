import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class58_Sub1 extends Class58 implements Interface24 {

	@OriginalMember(owner = "client!ku", name = "z", descriptor = "B")
	private byte aByte78;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!qi;Z)V")
	public Class58_Sub1(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6520() {
		return super.method6745(super.aClass12_Sub2_Sub2_10.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)I")
	public int method4363() {
		return this.aByte78;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6519() {
		return super.method6752(super.aClass12_Sub2_Sub2_10.aMapBuffer2);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBI)Z")
	@Override
	public boolean method6518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aByte78 = (byte) arg0;
		super.method7650(arg1);
		return true;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
	@Override
	public void method7651() {
		super.method7651();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	@Override
	public boolean method6517(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.aByte78 = (byte) arg1;
		super.method6746(arg0, arg2);
		return true;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I")
	@Override
	public int method7647() {
		return super.method7647();
	}
}
