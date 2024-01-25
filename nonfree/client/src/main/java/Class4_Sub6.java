import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public abstract class Class4_Sub6 extends Class4 {

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
	public int anInt6811;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "Lclient!mk;")
	protected Class133 aClass133_41;

	@OriginalMember(owner = "client!qn", name = "G", descriptor = "Lclient!hr;")
	protected Class90 aClass90_41;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "Z")
	public boolean aBoolean489;

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "[Lclient!qn;")
	public final Class4_Sub6[] aClass4_Sub6Array42;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IZ)V")
	protected Class4_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean489 = arg1;
		this.aClass4_Sub6Array42 = new Class4_Sub6[arg0];
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZI)V")
	public void method5692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt6811 == 255 ? arg0 : this.anInt6811;
		if (this.aBoolean489) {
			this.aClass133_41 = new Class133(local14, arg0, arg1);
		} else {
			this.aClass90_41 = new Class90(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)[[I")
	protected final int[][] method5693(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass4_Sub6Array42[arg0].aBoolean489) {
			@Pc(33) int[] local33 = this.aClass4_Sub6Array42[arg0].method5698(arg1);
			return new int[][] { local33, local33, local33 };
		} else {
			return this.aClass4_Sub6Array42[arg0].method5694(arg1);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)[[I")
	public int[][] method5694(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)I")
	public int method5695() {
		return -1;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILclient!lf;)V")
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)[I")
	public int[] method5698(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(B)V")
	public void method5699() {
		if (this.aBoolean489) {
			this.aClass133_41.method3741();
			this.aClass133_41 = null;
		} else {
			this.aClass90_41.method2577();
			this.aClass90_41 = null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "(B)V")
	public void method5700() {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)[I")
	protected final int[] method5702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass4_Sub6Array42[arg1].aBoolean489 ? this.aClass4_Sub6Array42[arg1].method5698(arg0) : this.aClass4_Sub6Array42[arg1].method5694(arg0)[0];
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)I")
	public int method5703() {
		return -1;
	}
}
