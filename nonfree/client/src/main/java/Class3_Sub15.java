import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
	public int anInt5600;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!ph;")
	public Class3_Sub15 aClass3_Sub15_8;

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "Lclient!fi;")
	public Class3_Sub11 aClass3_Sub11_5;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "Z")
	public volatile boolean aBoolean386 = true;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "()I")
	public int method4558() {
		return 255;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "()Lclient!ph;")
	public abstract Class3_Sub15 method4559();

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "([III)V")
	public abstract void method4560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
	public abstract void method4561(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "([III)V")
	protected final void method4562(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean386) {
			this.method4560(arg0, arg1, arg2);
		} else {
			this.method4561(arg2);
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "()Lclient!ph;")
	public abstract Class3_Sub15 method4563();

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "()I")
	public abstract int method4564();
}
