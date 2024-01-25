import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public abstract class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
	public int anInt7615;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "Lclient!pc;")
	protected Class190 aClass190_41;

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "Lclient!wp;")
	protected Class264 aClass264_41;

	@OriginalMember(owner = "client!jq", name = "F", descriptor = "[Lclient!jq;")
	public final Class1_Sub2[] aClass1_Sub2Array42;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "Z")
	public boolean aBoolean645;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IZ)V")
	protected Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass1_Sub2Array42 = new Class1_Sub2[arg0];
		this.aBoolean645 = arg1;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
	public void method5860() {
		if (this.aBoolean645) {
			this.aClass264_41.method5968();
			this.aClass264_41 = null;
		} else {
			this.aClass190_41.method4095();
			this.aClass190_41 = null;
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I")
	public int method5861() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!ti;I)V")
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
	public void method5864() {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)[[I")
	public int[][] method5865(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBI)[[I")
	protected final int[][] method5867(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass1_Sub2Array42[arg0].aBoolean645) {
			@Pc(23) int[] local23 = this.aClass1_Sub2Array42[arg0].method5868(arg1);
			return new int[][] { local23, local23, local23 };
		} else {
			return this.aClass1_Sub2Array42[arg0].method5865(arg1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)[I")
	public int[] method5868(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)I")
	public int method5870() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)V")
	public void method5871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt7615 == 255 ? arg0 : this.anInt7615;
		if (this.aBoolean645) {
			this.aClass264_41 = new Class264(local12, arg0, arg1);
		} else {
			this.aClass190_41 = new Class190(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)[I")
	protected final int[] method5872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass1_Sub2Array42[arg0].aBoolean645 ? this.aClass1_Sub2Array42[arg0].method5868(arg1) : this.aClass1_Sub2Array42[arg0].method5865(arg1)[0];
	}
}
