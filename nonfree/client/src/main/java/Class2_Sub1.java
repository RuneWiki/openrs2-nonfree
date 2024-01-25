import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!ms;")
	protected Class156 aClass156_41;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
	public int anInt7039;

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "Lclient!bj;")
	protected Class26 aClass26_41;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "Z")
	public boolean aBoolean498;

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "[Lclient!aa;")
	public final Class2_Sub1[] aClass2_Sub1Array42;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean498 = arg1;
		this.aClass2_Sub1Array42 = new Class2_Sub1[arg0];
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)I")
	public int method6058() {
		return -1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)[I")
	public int[] method6059(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I")
	public int[][] method6060(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)[[I")
	protected final int[][] method6061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass2_Sub1Array42[arg0].aBoolean498) {
			@Pc(30) int[] local30 = this.aClass2_Sub1Array42[arg0].method6059(arg1);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass2_Sub1Array42[arg0].method6060(arg1);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILclient!vt;)V")
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(Z)V")
	public void method6065() {
		if (this.aBoolean498) {
			this.aClass156_41.method3901();
			this.aClass156_41 = null;
		} else {
			this.aClass26_41.method352();
			this.aClass26_41 = null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)I")
	public int method6066() {
		return -1;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public void method6067() {
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)V")
	public void method6068(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt7039 == 255 ? arg0 : this.anInt7039;
		if (this.aBoolean498) {
			this.aClass156_41 = new Class156(local12, arg0, arg1);
		} else {
			this.aClass26_41 = new Class26(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)[I")
	protected final int[] method6069(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub1Array42[arg0].aBoolean498 ? this.aClass2_Sub1Array42[arg0].method6059(arg1) : this.aClass2_Sub1Array42[arg0].method6060(arg1)[0];
	}
}
