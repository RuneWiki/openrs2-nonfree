import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	public int anInt7270;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Lclient!dc;")
	protected Class50 aClass50_41;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "Lclient!aa;")
	protected Class2 aClass2_41;

	@OriginalMember(owner = "client!gd", name = "E", descriptor = "[Lclient!gd;")
	public final Class1_Sub4[] aClass1_Sub4Array42;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "Z")
	public boolean aBoolean796;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub4Array42 = new Class1_Sub4[arg0];
		this.aBoolean796 = arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[I")
	public int[] method5683(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	public void method5686() {
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)I")
	public int method5687() {
		return -1;
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
	public void method5688() {
		if (this.aBoolean796) {
			this.aClass2_41.method11();
			this.aClass2_41 = null;
		} else {
			this.aClass50_41.method1089();
			this.aClass50_41 = null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ug;II)V")
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)[[I")
	public int[][] method5691(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)I")
	public int method5694() {
		return -1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)[I")
	protected final int[] method5695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass1_Sub4Array42[arg1].aBoolean796 ? this.aClass1_Sub4Array42[arg1].method5683(arg0) : this.aClass1_Sub4Array42[arg1].method5691(arg0)[0];
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)[[I")
	protected final int[][] method5696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass1_Sub4Array42[arg1].aBoolean796) {
			@Pc(21) int[] local21 = this.aClass1_Sub4Array42[arg1].method5683(arg0);
			return new int[][] { local21, local21, local21 };
		} else {
			return this.aClass1_Sub4Array42[arg1].method5691(arg0);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIB)V")
	public void method5698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt7270 == 255 ? arg0 : this.anInt7270;
		if (this.aBoolean796) {
			this.aClass2_41 = new Class2(local16, arg0, arg1);
		} else {
			this.aClass50_41 = new Class50(local16, arg0, arg1);
		}
	}
}
