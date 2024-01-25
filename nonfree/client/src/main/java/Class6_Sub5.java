import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public abstract class Class6_Sub5 extends Class6 {

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
	public int anInt7987;

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "Lclient!mf;")
	protected Class162 aClass162_41;

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "Lclient!eg;")
	protected Class61 aClass61_41;

	@OriginalMember(owner = "client!lk", name = "E", descriptor = "Z")
	public boolean aBoolean495;

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "[Lclient!lk;")
	public final Class6_Sub5[] aClass6_Sub5Array42;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IZ)V")
	protected Class6_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean495 = arg1;
		this.aClass6_Sub5Array42 = new Class6_Sub5[arg0];
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public void method6533() {
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)I")
	public int method6535() {
		return -1;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)[I")
	public int[] method6537(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(B)I")
	public int method6539() {
		return -1;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLclient!ae;)V")
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)V")
	public void method6541() {
		if (this.aBoolean495) {
			this.aClass61_41.method1606();
			this.aClass61_41 = null;
		} else {
			this.aClass162_41.method3809();
			this.aClass162_41 = null;
		}
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(III)[I")
	protected final int[] method6543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass6_Sub5Array42[arg0].aBoolean495 ? this.aClass6_Sub5Array42[arg0].method6537(arg1) : this.aClass6_Sub5Array42[arg0].method6545(arg1)[0];
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(III)[[I")
	protected final int[][] method6544(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass6_Sub5Array42[arg1].aBoolean495) {
			@Pc(29) int[] local29 = this.aClass6_Sub5Array42[arg1].method6537(arg0);
			return new int[][] { local29, local29, local29 };
		} else {
			return this.aClass6_Sub5Array42[arg1].method6545(arg0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)[[I")
	public int[][] method6545(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(III)V")
	public void method6547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt7987 == 255 ? arg1 : this.anInt7987;
		if (this.aBoolean495) {
			this.aClass61_41 = new Class61(local14, arg1, arg0);
		} else {
			this.aClass162_41 = new Class162(local14, arg1, arg0);
		}
	}
}
