import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Lclient!nd;")
	protected Class113 aClass113_41;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!ek;")
	protected Class43 aClass43_41;

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
	public int anInt5664;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "[Lclient!oa;")
	public Class4_Sub1[] aClass4_Sub1Array42;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "Z")
	public boolean aBoolean392;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass4_Sub1Array42 = new Class4_Sub1[arg0];
		this.aBoolean392 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V")
	public final void method4536(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt5664 == 255 ? arg0 : this.anInt5664;
		if (this.aBoolean392) {
			this.aClass43_41 = new Class43(local20, arg0, arg1);
		} else {
			this.aClass113_41 = new Class113(local20, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	public void method4537() {
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZI)[I")
	protected final int[] method4538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub1Array42[arg0].aBoolean392 ? this.aClass4_Sub1Array42[arg0].method4544(arg1) : this.aClass4_Sub1Array42[arg0].method4542(arg1)[0];
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)I")
	public int method4541() {
		return -1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[[I")
	public int[][] method4542(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)[I")
	public int[] method4544(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!pi;)V")
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	public void method4547() {
		if (this.aBoolean392) {
			this.aClass43_41.method1181();
			this.aClass43_41 = null;
		} else {
			this.aClass113_41.method2912();
			this.aClass113_41 = null;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)I")
	public int method4548() {
		return -1;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)[[I")
	protected final int[][] method4549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.aClass4_Sub1Array42[arg0].aBoolean392) {
			return this.aClass4_Sub1Array42[arg0].method4542(arg1);
		}
		@Pc(27) int[][] local27 = new int[3][];
		@Pc(35) int[] local35 = this.aClass4_Sub1Array42[arg0].method4544(arg1);
		local27[2] = local35;
		local27[1] = local35;
		local27[0] = local35;
		return local27;
	}
}
