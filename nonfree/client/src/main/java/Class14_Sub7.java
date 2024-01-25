import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public abstract class Class14_Sub7 extends Class14 {

	@OriginalMember(owner = "client!pia", name = "n", descriptor = "Lclient!st;")
	protected Class340 aClass340_41;

	@OriginalMember(owner = "client!pia", name = "H", descriptor = "Lclient!dn;")
	protected Class83 aClass83_41;

	@OriginalMember(owner = "client!pia", name = "F", descriptor = "I")
	public int anInt11067;

	@OriginalMember(owner = "client!pia", name = "t", descriptor = "[Lclient!pia;")
	public final Class14_Sub7[] aClass14_Sub7Array42;

	@OriginalMember(owner = "client!pia", name = "o", descriptor = "Z")
	public boolean aBoolean773;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(IZ)V")
	protected Class14_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass14_Sub7Array42 = new Class14_Sub7[arg0];
		this.aBoolean773 = arg1;
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(BII)V")
	public void method9378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(28) int local28 = this.anInt11067 == 255 ? arg0 : this.anInt11067;
		if (this.aBoolean773) {
			this.aClass83_41 = new Class83(local28, arg0, arg1);
		} else {
			this.aClass340_41 = new Class340(local28, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(BII)[I")
	protected final int[] method9379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass14_Sub7Array42[arg0].aBoolean773 ? this.aClass14_Sub7Array42[arg0].method9382(arg1) : this.aClass14_Sub7Array42[arg0].method9388(arg1)[0];
	}

	@OriginalMember(owner = "client!pia", name = "f", descriptor = "(I)V")
	public void method9380() {
		if (this.aBoolean773) {
			this.aClass83_41.method1819();
			this.aClass83_41 = null;
		} else {
			this.aClass340_41.method8149();
			this.aClass340_41 = null;
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)I")
	public int method9381() {
		return -1;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZI)[I")
	public int[] method9382(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(III)[[I")
	protected final int[][] method9384(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass14_Sub7Array42[arg1].aBoolean773) {
			@Pc(29) int[] local29 = this.aClass14_Sub7Array42[arg1].method9382(arg0);
			return new int[][] { local29, local29, local29 };
		} else {
			return this.aClass14_Sub7Array42[arg1].method9388(arg0);
		}
	}

	@OriginalMember(owner = "client!pia", name = "e", descriptor = "(I)V")
	public void method9386() {
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(II)[[I")
	public int[][] method9388(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "(I)I")
	public int method9389() {
		return -1;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILclient!jc;I)V")
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
	}
}
