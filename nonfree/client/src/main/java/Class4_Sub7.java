import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class Class4_Sub7 extends Class4 {

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "Lclient!mi;")
	public Class4_Sub7 aClass4_Sub7_8;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	public int anInt7720;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Lclient!mda;")
	public Class4_Sub16 aClass4_Sub16_5;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "Z")
	public volatile boolean aBoolean532 = true;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()I")
	public int method6399() {
		return 255;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([III)V")
	public abstract void method6400(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "()Lclient!mi;")
	public abstract Class4_Sub7 method6401();

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public abstract void method6402(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "([III)V")
	protected final void method6403(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean532) {
			this.method6400(arg0, arg1, arg2);
		} else {
			this.method6402(arg2);
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "()Lclient!mi;")
	public abstract Class4_Sub7 method6404();

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "()I")
	public abstract int method6405();
}
