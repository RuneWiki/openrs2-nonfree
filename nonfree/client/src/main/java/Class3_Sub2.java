import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "Lclient!tn;")
	protected Class340 aClass340_41;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
	public int anInt10292;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "Lclient!fd;")
	protected Class115 aClass115_41;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "[Lclient!ng;")
	public final Class3_Sub2[] aClass3_Sub2Array42;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Z")
	public boolean aBoolean761;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub2Array42 = new Class3_Sub2[arg0];
		this.aBoolean761 = arg1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!fca;II)V")
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I")
	public int[] method8710(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[[I")
	public int[][] method8711(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public void method8712() {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)I")
	public int method8713() {
		return -1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)V")
	public void method8714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt10292 == 255 ? arg1 : this.anInt10292;
		if (this.aBoolean761) {
			this.aClass340_41 = new Class340(local14, arg1, arg0);
		} else {
			this.aClass115_41 = new Class115(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V")
	public void method8715() {
		if (this.aBoolean761) {
			this.aClass340_41.method7832();
			this.aClass340_41 = null;
		} else {
			this.aClass115_41.method2721();
			this.aClass115_41 = null;
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)[I")
	protected final int[] method8716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass3_Sub2Array42[arg0].aBoolean761 ? this.aClass3_Sub2Array42[arg0].method8710(arg1) : this.aClass3_Sub2Array42[arg0].method8711(arg1)[0];
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)I")
	public int method8717() {
		return -1;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(III)[[I")
	protected final int[][] method8718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub2Array42[arg0].aBoolean761) {
			@Pc(27) int[] local27 = this.aClass3_Sub2Array42[arg0].method8710(arg1);
			return new int[][] { local27, local27, local27 };
		} else {
			return this.aClass3_Sub2Array42[arg0].method8711(arg1);
		}
	}
}
