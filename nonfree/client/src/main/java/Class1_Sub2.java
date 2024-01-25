import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Lclient!et;")
	protected Class74 aClass74_41;

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!to;")
	protected Class228 aClass228_41;

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
	public int anInt6344;

	@OriginalMember(owner = "client!pa", name = "G", descriptor = "Z")
	public boolean aBoolean586;

	@OriginalMember(owner = "client!pa", name = "D", descriptor = "[Lclient!pa;")
	public final Class1_Sub2[] aClass1_Sub2Array42;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean586 = arg1;
		this.aClass1_Sub2Array42 = new Class1_Sub2[arg0];
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBLclient!re;)V")
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)I")
	public int method5503() {
		return -1;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[[I")
	public int[][] method5504(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V")
	public void method5505() {
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[I")
	public int[] method5508(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII)V")
	public void method5509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt6344 == 255 ? arg1 : this.anInt6344;
		if (this.aBoolean586) {
			this.aClass74_41 = new Class74(local14, arg1, arg0);
		} else {
			this.aClass228_41 = new Class228(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)[I")
	protected final int[] method5510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub2Array42[arg1].aBoolean586 ? this.aClass1_Sub2Array42[arg1].method5508(arg0) : this.aClass1_Sub2Array42[arg1].method5504(arg0)[0];
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)I")
	public int method5511() {
		return -1;
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
	public void method5513() {
		if (this.aBoolean586) {
			this.aClass74_41.method1348();
			this.aClass74_41 = null;
		} else {
			this.aClass228_41.method4877();
			this.aClass228_41 = null;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZII)[[I")
	protected final int[][] method5514(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub2Array42[arg1].aBoolean586) {
			@Pc(22) int[] local22 = this.aClass1_Sub2Array42[arg1].method5508(arg0);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass1_Sub2Array42[arg1].method5504(arg0);
		}
	}
}
