import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public abstract class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!au", name = "k", descriptor = "I")
	public int anInt10456;

	@OriginalMember(owner = "client!au", name = "z", descriptor = "Lclient!uia;")
	protected Class348 aClass348_41;

	@OriginalMember(owner = "client!au", name = "A", descriptor = "Lclient!dda;")
	protected Class68 aClass68_41;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "Z")
	public boolean aBoolean763;

	@OriginalMember(owner = "client!au", name = "C", descriptor = "[Lclient!au;")
	public final Class2_Sub4[] aClass2_Sub4Array42;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean763 = arg1;
		this.aClass2_Sub4Array42 = new Class2_Sub4[arg0];
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)I")
	public int method8888() {
		return -1;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
	public void method8890() {
		if (this.aBoolean763) {
			this.aClass348_41.method8073();
			this.aClass348_41 = null;
		} else {
			this.aClass68_41.method1902();
			this.aClass68_41 = null;
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BII)V")
	public void method8891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt10456 == 255 ? arg1 : this.anInt10456;
		if (this.aBoolean763) {
			this.aClass348_41 = new Class348(local14, arg1, arg0);
		} else {
			this.aClass68_41 = new Class68(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(III)[I")
	protected final int[] method8892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub4Array42[arg1].aBoolean763 ? this.aClass2_Sub4Array42[arg1].method8900(arg0) : this.aClass2_Sub4Array42[arg1].method8901(arg0)[0];
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)I")
	public int method8893() {
		return -1;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!sl;II)V")
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(III)[[I")
	protected final int[][] method8898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub4Array42[arg0].aBoolean763) {
			@Pc(35) int[] local35 = this.aClass2_Sub4Array42[arg0].method8900(arg1);
			return new int[][] { local35, local35, local35 };
		} else {
			return this.aClass2_Sub4Array42[arg0].method8901(arg1);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)[I")
	public int[] method8900(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BI)[[I")
	public int[][] method8901(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V")
	public void method8902() {
	}
}
