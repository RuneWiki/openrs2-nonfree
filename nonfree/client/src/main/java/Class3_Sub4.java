import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public abstract class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
	public int anInt7510;

	@OriginalMember(owner = "client!ko", name = "z", descriptor = "Lclient!md;")
	protected Class148 aClass148_41;

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "Lclient!im;")
	protected Class109 aClass109_41;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "Z")
	public boolean aBoolean504;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "[Lclient!ko;")
	public final Class3_Sub4[] aClass3_Sub4Array42;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean504 = arg1;
		this.aClass3_Sub4Array42 = new Class3_Sub4[arg0];
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(BI)[I")
	public int[] method6134(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)I")
	public int method6136() {
		return -1;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V")
	public void method6137() {
		if (this.aBoolean504) {
			this.aClass109_41.method2833();
			this.aClass109_41 = null;
		} else {
			this.aClass148_41.method3564();
			this.aClass148_41 = null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BII)[[I")
	protected final int[][] method6138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass3_Sub4Array42[arg1].aBoolean504) {
			@Pc(22) int[] local22 = this.aClass3_Sub4Array42[arg1].method6134(arg0);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass3_Sub4Array42[arg1].method6144(arg0);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(BII)[I")
	protected final int[] method6139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass3_Sub4Array42[arg0].aBoolean504 ? this.aClass3_Sub4Array42[arg0].method6134(arg1) : this.aClass3_Sub4Array42[arg0].method6144(arg1)[0];
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
	public void method6140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = this.anInt7510 == 255 ? arg0 : this.anInt7510;
		if (this.aBoolean504) {
			this.aClass109_41 = new Class109(local20, arg0, arg1);
		} else {
			this.aClass148_41 = new Class148(local20, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!nj;II)V")
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IB)[[I")
	public int[][] method6144(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)I")
	public int method6145() {
		return -1;
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)V")
	public void method6146() {
	}
}
