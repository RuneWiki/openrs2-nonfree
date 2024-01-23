import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public abstract class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!hb;")
	protected Class71 aClass71_41;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!wj;")
	protected Class190 aClass190_41;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
	public int anInt5353;

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "Z")
	public boolean aBoolean505;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "[Lclient!ie;")
	public Class1_Sub1[] aClass1_Sub1Array42;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean505 = arg1;
		this.aClass1_Sub1Array42 = new Class1_Sub1[arg0];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!fh;IZ)V")
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)I")
	public int method4455() {
		return -1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)[[I")
	protected final int[][] method4456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass1_Sub1Array42[arg1].aBoolean505) {
			@Pc(25) int[] local25 = this.aClass1_Sub1Array42[arg1].method4465(arg0);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass1_Sub1Array42[arg1].method4462(arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
	public int method4457() {
		return -1;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	public void method4458() {
		if (this.aBoolean505) {
			this.aClass190_41.method4651();
			this.aClass190_41 = null;
		} else {
			this.aClass71_41.method1897();
			this.aClass71_41 = null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
	public void method4460() {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[[I")
	public int[][] method4462(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V")
	public final void method4463(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22 = this.anInt5353 == 255 ? arg1 : this.anInt5353;
		if (this.aBoolean505) {
			this.aClass190_41 = new Class190(local22, arg1, arg0);
		} else {
			this.aClass71_41 = new Class71(local22, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(III)[I")
	protected final int[] method4464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub1Array42[arg1].aBoolean505 ? this.aClass1_Sub1Array42[arg1].method4465(arg0) : this.aClass1_Sub1Array42[arg1].method4462(arg0)[0];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)[I")
	public int[] method4465(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
