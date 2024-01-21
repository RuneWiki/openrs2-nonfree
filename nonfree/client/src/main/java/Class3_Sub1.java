import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	public int anInt3985;

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "Lclient!kd;")
	protected Class48 aClass48_39;

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "I")
	public int anInt3998;

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "Lclient!va;")
	protected Class82 aClass82_39;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "[Lclient!cf;")
	public final Class3_Sub1[] aClass3_Sub1Array40;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Z")
	public boolean aBoolean171;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub1Array40 = new Class3_Sub1[arg0];
		this.aBoolean171 = arg1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI)[I")
	protected final int[] method2904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub1Array40[arg0].aBoolean171 ? this.aClass3_Sub1Array40[arg0].method2911(arg1) : this.aClass3_Sub1Array40[arg0].method2914(arg1)[0];
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public final void method2905() {
		if (this.aBoolean171) {
			this.aClass82_39.method2718();
			this.aClass82_39 = null;
		} else {
			this.aClass48_39.method1400();
			this.aClass48_39 = null;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BILclient!rd;)V")
	public void method2906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZ)V")
	public final void method2909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = this.anInt3985 == 255 ? arg0 : this.anInt3985;
		if (this.aBoolean171) {
			this.aClass82_39 = new Class82(local20, arg0, arg1);
		} else {
			this.aClass48_39 = new Class48(local20, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)I")
	public int method2910() {
		return -1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)[I")
	public int[] method2911(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)[[I")
	protected final int[][] method2913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub1Array40[arg1].aBoolean171) {
			@Pc(22) int[] local22 = this.aClass3_Sub1Array40[arg1].method2911(arg0);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass3_Sub1Array40[arg1].method2914(arg0);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[[I")
	public int[][] method2914(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)I")
	public int method2915() {
		return -1;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V")
	public void method2916() {
	}
}
