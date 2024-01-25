import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public abstract class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!ej", name = "A", descriptor = "[I")
	public static final int[] anIntArray748 = new int[4096];

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "Lclient!hc;")
	protected Class102 aClass102_41;

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
	public int anInt7569;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "Lclient!to;")
	protected Class241 aClass241_41;

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "[Lclient!ej;")
	public final Class10_Sub2[] aClass10_Sub2Array42;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "Z")
	public boolean aBoolean499;

	static {
		for (@Pc(14) int local14 = 0; local14 < 4096; local14++) {
			anIntArray748[local14] = Static82.method1546(local14);
		}
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(IZ)V")
	protected Class10_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass10_Sub2Array42 = new Class10_Sub2[arg0];
		this.aBoolean499 = arg1;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)[I")
	public int[] method6035(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
	public void method6036() {
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)[[I")
	public int[][] method6037(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)I")
	public int method6038() {
		return -1;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
	public void method6039(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt7569 == 255 ? arg0 : this.anInt7569;
		if (this.aBoolean499) {
			this.aClass241_41 = new Class241(local16, arg0, arg1);
		} else {
			this.aClass102_41 = new Class102(local16, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIB)[I")
	protected final int[] method6041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass10_Sub2Array42[arg1].aBoolean499 ? this.aClass10_Sub2Array42[arg1].method6035(arg0) : this.aClass10_Sub2Array42[arg1].method6037(arg0)[0];
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILclient!nn;)V")
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)[[I")
	protected final int[][] method6045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass10_Sub2Array42[arg0].aBoolean499) {
			@Pc(23) int[] local23 = this.aClass10_Sub2Array42[arg0].method6035(arg1);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass10_Sub2Array42[arg0].method6037(arg1);
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)I")
	public int method6046() {
		return -1;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	public void method6047() {
		if (this.aBoolean499) {
			this.aClass241_41.method5236();
			this.aClass241_41 = null;
		} else {
			this.aClass102_41.method2567();
			this.aClass102_41 = null;
		}
	}
}
