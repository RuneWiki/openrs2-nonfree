import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public abstract class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Lclient!ek;")
	protected Class63 aClass63_41;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "I")
	public int anInt6765;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "Lclient!lf;")
	protected Class124 aClass124_41;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "Z")
	public boolean aBoolean427;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "[Lclient!n;")
	public final Class11_Sub2[] aClass11_Sub2Array42;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(IZ)V")
	protected Class11_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean427 = arg1;
		this.aClass11_Sub2Array42 = new Class11_Sub2[arg0];
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)I")
	public int method5706() {
		return -1;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
	public void method5707() {
		if (this.aBoolean427) {
			this.aClass124_41.method2852();
			this.aClass124_41 = null;
		} else {
			this.aClass63_41.method1117();
			this.aClass63_41 = null;
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public void method5708() {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[[I")
	public int[][] method5709(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(III)[I")
	protected final int[] method5710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass11_Sub2Array42[arg0].aBoolean427 ? this.aClass11_Sub2Array42[arg0].method5716(arg1) : this.aClass11_Sub2Array42[arg0].method5709(arg1)[0];
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!kh;BI)V")
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZII)V")
	public void method5712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt6765 == 255 ? arg0 : this.anInt6765;
		if (this.aBoolean427) {
			this.aClass124_41 = new Class124(local18, arg0, arg1);
		} else {
			this.aClass63_41 = new Class63(local18, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(B)I")
	public int method5714() {
		return -1;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(ZII)[[I")
	protected final int[][] method5715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass11_Sub2Array42[arg1].aBoolean427) {
			@Pc(23) int[] local23 = this.aClass11_Sub2Array42[arg1].method5716(arg0);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass11_Sub2Array42[arg1].method5709(arg0);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)[I")
	public int[] method5716(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
