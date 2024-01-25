import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public abstract class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "Lclient!lb;")
	protected Class187 aClass187_41;

	@OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
	public int anInt9490;

	@OriginalMember(owner = "client!qba", name = "r", descriptor = "Lclient!bda;")
	protected Class27 aClass27_41;

	@OriginalMember(owner = "client!qba", name = "v", descriptor = "[Lclient!qba;")
	public final Class6_Sub4[] aClass6_Sub4Array42;

	@OriginalMember(owner = "client!qba", name = "u", descriptor = "Z")
	public boolean aBoolean728;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(IZ)V")
	protected Class6_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass6_Sub4Array42 = new Class6_Sub4[arg0];
		this.aBoolean728 = arg1;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)[[I")
	protected final int[][] method7747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass6_Sub4Array42[arg1].aBoolean728) {
			@Pc(23) int[] local23 = this.aClass6_Sub4Array42[arg1].method7753(arg0);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass6_Sub4Array42[arg1].method7757(arg0);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIB)[I")
	protected final int[] method7748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass6_Sub4Array42[arg0].aBoolean728 ? this.aClass6_Sub4Array42[arg0].method7753(arg1) : this.aClass6_Sub4Array42[arg0].method7757(arg1)[0];
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)I")
	public int method7749() {
		return -1;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILclient!ji;)V")
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
	}

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "(I)V")
	public void method7751() {
		if (this.aBoolean728) {
			this.aClass187_41.method4556();
			this.aClass187_41 = null;
		} else {
			this.aClass27_41.method912();
			this.aClass27_41 = null;
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)[I")
	public int[] method7753(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)V")
	public void method7754() {
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IBI)V")
	public void method7756(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt9490 == 255 ? arg0 : this.anInt9490;
		if (this.aBoolean728) {
			this.aClass187_41 = new Class187(local12, arg0, arg1);
		} else {
			this.aClass27_41 = new Class27(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB)[[I")
	public int[][] method7757(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "(I)I")
	public int method7758() {
		return -1;
	}
}
