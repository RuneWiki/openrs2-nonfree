import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public abstract class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Lclient!kl;")
	protected Class174 aClass174_41;

	@OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
	public int anInt9406;

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "Lclient!cg;")
	protected Class53 aClass53_41;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Z")
	public boolean aBoolean663;

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "[Lclient!nd;")
	public final Class12_Sub1[] aClass12_Sub1Array42;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IZ)V")
	protected Class12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean663 = arg1;
		this.aClass12_Sub1Array42 = new Class12_Sub1[arg0];
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public void method7789() {
		if (this.aBoolean663) {
			this.aClass174_41.method4391();
			this.aClass174_41 = null;
		} else {
			this.aClass53_41.method1460();
			this.aClass53_41 = null;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)[[I")
	protected final int[][] method7790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass12_Sub1Array42[arg0].aBoolean663) {
			@Pc(31) int[] local31 = this.aClass12_Sub1Array42[arg0].method7798(arg1);
			return new int[][] { local31, local31, local31 };
		} else {
			return this.aClass12_Sub1Array42[arg0].method7793(arg1);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)I")
	public int method7791() {
		return -1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)[[I")
	public int[][] method7793(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!daa;II)V")
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)[I")
	protected final int[] method7795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass12_Sub1Array42[arg0].aBoolean663 ? this.aClass12_Sub1Array42[arg0].method7798(arg1) : this.aClass12_Sub1Array42[arg0].method7793(arg1)[0];
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
	public int method7796() {
		return -1;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	public void method7797() {
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
	public int[] method7798(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(III)V")
	public void method7799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt9406 == 255 ? arg1 : this.anInt9406;
		if (this.aBoolean663) {
			this.aClass174_41 = new Class174(local12, arg1, arg0);
		} else {
			this.aClass53_41 = new Class53(local12, arg1, arg0);
		}
	}
}
