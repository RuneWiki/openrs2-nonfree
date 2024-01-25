import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public final class Class46_Sub1 extends Class46 implements Interface24 {

	@OriginalMember(owner = "client!qv", name = "y", descriptor = "B")
	private byte aByte115;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!ad;Z)V")
	public Class46_Sub1(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6551() {
		return super.method7933(super.aClass7_Sub1_Sub1_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)I")
	@Override
	public int method7923() {
		return super.method7923();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6550() {
		return super.method7931(super.aClass7_Sub1_Sub1_12.aMapBuffer2);
	}

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "(I)I")
	public int method6553() {
		return this.aByte115;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILclient!jaclib/memory/Source;IB)Z")
	@Override
	public boolean method6548(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(2) int arg2) {
		this.aByte115 = (byte) arg0;
		super.method7930(arg2, arg1);
		return true;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method6549(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte115 = (byte) arg1;
		super.method7932(arg0);
		return true;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
	@Override
	public void method7925() {
		super.method7925();
	}
}
