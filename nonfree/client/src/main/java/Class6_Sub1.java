import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public abstract class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "Lclient!km;")
	protected Class187 aClass187_41;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "Lclient!ki;")
	protected Class184 aClass184_41;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
	public int anInt9808;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "Z")
	public boolean aBoolean719;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "[Lclient!cc;")
	public final Class6_Sub1[] aClass6_Sub1Array42;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IZ)V")
	protected Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean719 = arg1;
		this.aClass6_Sub1Array42 = new Class6_Sub1[arg0];
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)[[I")
	public int[][] method8158(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[I")
	public int[] method8159(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public void method8160() {
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)[[I")
	protected final int[][] method8162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass6_Sub1Array42[arg1].aBoolean719) {
			@Pc(23) int[] local23 = this.aClass6_Sub1Array42[arg1].method8159(arg0);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass6_Sub1Array42[arg1].method8158(arg0);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
	public int method8163() {
		return -1;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)[I")
	protected final int[] method8165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass6_Sub1Array42[arg0].aBoolean719 ? this.aClass6_Sub1Array42[arg0].method8159(arg1) : this.aClass6_Sub1Array42[arg0].method8158(arg1)[0];
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(III)V")
	public void method8166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt9808 == 255 ? arg0 : this.anInt9808;
		if (this.aBoolean719) {
			this.aClass187_41 = new Class187(local14, arg0, arg1);
		} else {
			this.aClass184_41 = new Class184(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!iaa;Z)V")
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	public void method8168() {
		if (this.aBoolean719) {
			this.aClass187_41.method4600();
			this.aClass187_41 = null;
		} else {
			this.aClass184_41.method4584();
			this.aClass184_41 = null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)I")
	public int method8169() {
		return -1;
	}
}
