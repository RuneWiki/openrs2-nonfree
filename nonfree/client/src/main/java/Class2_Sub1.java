import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
	public int anInt7781;

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "Lclient!mh;")
	protected Class158 aClass158_41;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "Lclient!el;")
	protected Class67 aClass67_41;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "Z")
	public boolean aBoolean665;

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "[Lclient!qk;")
	public final Class2_Sub1[] aClass2_Sub1Array42;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean665 = arg1;
		this.aClass2_Sub1Array42 = new Class2_Sub1[arg0];
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)I")
	public int method6028() {
		return -1;
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)I")
	public int method6029() {
		return -1;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)V")
	public void method6030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = this.anInt7781 == 255 ? arg0 : this.anInt7781;
		if (this.aBoolean665) {
			this.aClass67_41 = new Class67(local22, arg0, arg1);
		} else {
			this.aClass158_41 = new Class158(local22, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)[[I")
	protected final int[][] method6031(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub1Array42[arg0].aBoolean665) {
			@Pc(22) int[] local22 = this.aClass2_Sub1Array42[arg0].method6032(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass2_Sub1Array42[arg0].method6033(arg1);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[I")
	public int[] method6032(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[[I")
	public int[][] method6033(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V")
	public void method6034() {
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)[I")
	protected final int[] method6037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass2_Sub1Array42[arg1].aBoolean665 ? this.aClass2_Sub1Array42[arg1].method6032(arg0) : this.aClass2_Sub1Array42[arg1].method6033(arg0)[0];
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V")
	public void method6038() {
		if (this.aBoolean665) {
			this.aClass67_41.method1598();
			this.aClass67_41 = null;
		} else {
			this.aClass158_41.method3634();
			this.aClass158_41 = null;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBLclient!md;)V")
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
	}
}
