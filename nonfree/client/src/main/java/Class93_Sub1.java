import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class93_Sub1 extends Class93 implements Interface25 {

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "B")
	private byte aByte49;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!rda;Z)V")
	public Class93_Sub1(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method2909() {
		return super.method2918(super.aClass57_Sub3_Sub1_7.aMapBuffer2);
	}

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "(I)I")
	public int method2911() {
		return this.aByte49;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method2906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2) {
		this.aByte49 = (byte) arg0;
		super.method2920(arg1, arg2);
		return true;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)I")
	@Override
	public int method2915() {
		return super.method2915();
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method2907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aByte49 = (byte) arg0;
		super.method2925(arg1);
		return true;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method2908() {
		return super.method2919(super.aClass57_Sub3_Sub1_7.aMapBuffer2);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V")
	@Override
	public void method2921() {
		super.method2921();
	}
}
