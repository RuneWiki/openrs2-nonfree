import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public abstract class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
	public int anInt9616;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "Lclient!vba;")
	protected Class343 aClass343_41;

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "Lclient!ko;")
	protected Class201 aClass201_41;

	@OriginalMember(owner = "client!qp", name = "z", descriptor = "[Lclient!qp;")
	public final Class4_Sub4[] aClass4_Sub4Array42;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "Z")
	public boolean aBoolean679;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass4_Sub4Array42 = new Class4_Sub4[arg0];
		this.aBoolean679 = arg1;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public void method7882() {
		if (this.aBoolean679) {
			this.aClass343_41.method7593();
			this.aClass343_41 = null;
		} else {
			this.aClass201_41.method4416();
			this.aClass201_41 = null;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)[I")
	public int[] method7883(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
	public void method7885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt9616 == 255 ? arg1 : this.anInt9616;
		if (this.aBoolean679) {
			this.aClass343_41 = new Class343(local14, arg1, arg0);
		} else {
			this.aClass201_41 = new Class201(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BILclient!eh;)V")
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[[I")
	public int[][] method7887(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)I")
	public int method7888() {
		return -1;
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)I")
	public int method7889() {
		return -1;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(III)[I")
	protected final int[] method7890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub4Array42[arg0].aBoolean679 ? this.aClass4_Sub4Array42[arg0].method7883(arg1) : this.aClass4_Sub4Array42[arg0].method7887(arg1)[0];
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZII)[[I")
	protected final int[][] method7892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_Sub4Array42[arg0].aBoolean679) {
			@Pc(22) int[] local22 = this.aClass4_Sub4Array42[arg0].method7883(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass4_Sub4Array42[arg0].method7887(arg1);
		}
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V")
	public void method7894() {
	}
}
