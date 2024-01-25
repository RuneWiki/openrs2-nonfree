import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "Lclient!im;")
	protected Class117 aClass117_41;

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!hu;")
	protected Class109 aClass109_41;

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
	public int anInt7441;

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "[Lclient!qb;")
	public final Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "Z")
	public boolean aBoolean612;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
		this.aBoolean612 = arg1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!dh;I)V")
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZII)[I")
	protected final int[] method5620(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub1Array42[arg1].aBoolean612 ? this.aClass1_Sub1Array42[arg1].method5622(arg0) : this.aClass1_Sub1Array42[arg1].method5626(arg0)[0];
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[I")
	public int[] method5622(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I")
	public int method5623() {
		return -1;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(ZII)[[I")
	protected final int[][] method5624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub1Array42[arg0].aBoolean612) {
			@Pc(30) int[] local30 = this.aClass1_Sub1Array42[arg0].method5622(arg1);
			return new int[][] { local30, local30, local30 };
		} else {
			return this.aClass1_Sub1Array42[arg0].method5626(arg1);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)V")
	public void method5625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt7441 == 255 ? arg1 : this.anInt7441;
		if (this.aBoolean612) {
			this.aClass109_41 = new Class109(local20, arg1, arg0);
		} else {
			this.aClass117_41 = new Class117(local20, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)[[I")
	public int[][] method5626(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public void method5627() {
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)I")
	public int method5628() {
		return -1;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	public void method5630() {
		if (this.aBoolean612) {
			this.aClass109_41.method2240();
			this.aClass109_41 = null;
		} else {
			this.aClass117_41.method2346();
			this.aClass117_41 = null;
		}
	}
}
