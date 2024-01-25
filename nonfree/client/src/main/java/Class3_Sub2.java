import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "Lclient!uq;")
	protected Class249 aClass249_41;

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
	public int anInt7553;

	@OriginalMember(owner = "client!qn", name = "G", descriptor = "Lclient!ei;")
	protected Class62 aClass62_41;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "[Lclient!qn;")
	public final Class3_Sub2[] aClass3_Sub2Array41;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "Z")
	public boolean aBoolean650;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass3_Sub2Array41 = new Class3_Sub2[arg0];
		this.aBoolean650 = arg1;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!cu;II)V")
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
	public void method5893() {
		if (this.aBoolean650) {
			this.aClass62_41.method1667();
			this.aClass62_41 = null;
		} else {
			this.aClass249_41.method5296();
			this.aClass249_41 = null;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)[I")
	protected final int[] method5894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass3_Sub2Array41[arg0].aBoolean650 ? this.aClass3_Sub2Array41[arg0].method5895(arg1) : this.aClass3_Sub2Array41[arg0].method5901(arg1)[0];
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)[I")
	public int[] method5895(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)V")
	public void method5896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt7553 == 255 ? arg0 : this.anInt7553;
		if (this.aBoolean650) {
			this.aClass62_41 = new Class62(local18, arg0, arg1);
		} else {
			this.aClass249_41 = new Class249(local18, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I")
	public int method5897() {
		return -1;
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)V")
	public void method5898() {
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(III)[[I")
	protected final int[][] method5899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub2Array41[arg0].aBoolean650) {
			@Pc(24) int[] local24 = this.aClass3_Sub2Array41[arg0].method5895(arg1);
			return new int[][] { local24, local24, local24 };
		} else {
			return this.aClass3_Sub2Array41[arg0].method5901(arg1);
		}
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(B)I")
	public int method5900() {
		return -1;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)[[I")
	public int[][] method5901(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
