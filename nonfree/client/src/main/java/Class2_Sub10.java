import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public abstract class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
	public int anInt10042;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Lclient!sda;")
	protected Class304 aClass304_41;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "Lclient!pa;")
	protected Class250 aClass250_41;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "[Lclient!pc;")
	public final Class2_Sub10[] aClass2_Sub10Array42;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Z")
	public boolean aBoolean741;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aClass2_Sub10Array42 = new Class2_Sub10[arg0];
		this.aBoolean741 = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	public void method8400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt10042 == 255 ? arg1 : this.anInt10042;
		if (this.aBoolean741) {
			this.aClass304_41 = new Class304(local14, arg1, arg0);
		} else {
			this.aClass250_41 = new Class250(local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBI)[I")
	protected final int[] method8402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub10Array42[arg1].aBoolean741 ? this.aClass2_Sub10Array42[arg1].method8403(arg0) : this.aClass2_Sub10Array42[arg1].method8411(arg0)[0];
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)[I")
	public int[] method8403(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
	public void method8404() {
		if (this.aBoolean741) {
			this.aClass304_41.method7207();
			this.aClass304_41 = null;
		} else {
			this.aClass250_41.method6393();
			this.aClass250_41 = null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	public int method8405() {
		return -1;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
	public void method8407() {
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)[[I")
	protected final int[][] method8408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub10Array42[arg1].aBoolean741) {
			@Pc(21) int[] local21 = this.aClass2_Sub10Array42[arg1].method8403(arg0);
			return new int[][] { local21, local21, local21 };
		} else {
			return this.aClass2_Sub10Array42[arg1].method8411(arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)I")
	public int method8409() {
		return -1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ud;II)V")
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)[[I")
	public int[][] method8411(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}
}
