import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public abstract class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!di", name = "q", descriptor = "I")
	public int anInt4442;

	@OriginalMember(owner = "client!di", name = "K", descriptor = "Lclient!ub;")
	protected Class99 aClass99_41;

	@OriginalMember(owner = "client!di", name = "O", descriptor = "Lclient!pi;")
	protected Class78 aClass78_41;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "Z")
	public boolean aBoolean190;

	@OriginalMember(owner = "client!di", name = "S", descriptor = "[Lclient!di;")
	public final Class2_Sub4[] aClass2_Sub4Array42;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean190 = arg1;
		this.aClass2_Sub4Array42 = new Class2_Sub4[arg0];
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBLclient!kd;)V")
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[[I")
	public int[][] method3122(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
	public void method3123() {
		if (this.aBoolean190) {
			this.aClass78_41.method2320();
			this.aClass78_41 = null;
		} else {
			this.aClass99_41.method2750();
			this.aClass99_41 = null;
		}
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)I")
	public int method3125() {
		return -1;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(II)[I")
	public int[] method3127(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(I)I")
	public int method3128() {
		return -1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)[I")
	protected final int[] method3129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub4Array42[arg0].aBoolean190 ? this.aClass2_Sub4Array42[arg0].method3127(arg1) : this.aClass2_Sub4Array42[arg0].method3122(arg1)[0];
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method3130(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub4Array42[arg1].aBoolean190) {
			@Pc(33) int[] local33 = this.aClass2_Sub4Array42[arg1].method3127(arg0);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass2_Sub4Array42[arg1].method3122(arg0);
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
	public final void method3132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt4442 == 255 ? arg0 : this.anInt4442;
		if (this.aBoolean190) {
			this.aClass78_41 = new Class78(local8, arg0, arg1);
		} else {
			this.aClass99_41 = new Class99(local8, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V")
	public void method3133() {
	}
}
