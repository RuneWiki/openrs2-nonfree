import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "Lclient!he;")
	protected Class70 aClass70_41;

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
	public int anInt6135;

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "Lclient!of;")
	protected Class114 aClass114_41;

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "[Lclient!kh;")
	public Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "Z")
	public boolean aBoolean324;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
		this.aBoolean324 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)[I")
	protected final int[] method4746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub1Array42[arg0].aBoolean324 ? this.aClass1_Sub1Array42[arg0].method4757(arg1) : this.aClass1_Sub1Array42[arg0].method4749(arg1)[0];
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)V")
	public final void method4748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt6135 == 255 ? arg1 : this.anInt6135;
		if (this.aBoolean324) {
			this.aClass114_41 = new Class114(local14, arg1, arg0);
		} else {
			this.aClass70_41 = new Class70(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)[[I")
	public int[][] method4749(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)I")
	public int method4751() {
		return -1;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)V")
	public void method4756() {
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(ZI)[I")
	public int[] method4757(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(IBI)[[I")
	protected final int[][] method4758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub1Array42[arg0].aBoolean324) {
			@Pc(23) int[] local23 = this.aClass1_Sub1Array42[arg0].method4757(arg1);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass1_Sub1Array42[arg0].method4749(arg1);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!im;I)V")
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)I")
	public int method4761() {
		return -1;
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
	public void method4762() {
		if (this.aBoolean324) {
			this.aClass114_41.method3363();
			this.aClass114_41 = null;
		} else {
			this.aClass70_41.method1661();
			this.aClass70_41 = null;
		}
	}
}
