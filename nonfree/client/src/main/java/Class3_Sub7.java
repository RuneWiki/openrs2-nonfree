import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!os", name = "g", descriptor = "Lclient!os;")
	public Class3_Sub7 aClass3_Sub7_9;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "Lclient!wn;")
	public Class3_Sub30 aClass3_Sub30_6;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "I")
	public int anInt10216;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "Z")
	public volatile boolean aBoolean732 = true;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([III)V")
	public abstract void method8757(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public abstract void method8758(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!os", name = "b", descriptor = "([III)V")
	protected final void method8759(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean732) {
			this.method8757(arg0, arg1, arg2);
		} else {
			this.method8758(arg2);
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "()Lclient!os;")
	public abstract Class3_Sub7 method8760();

	@OriginalMember(owner = "client!os", name = "c", descriptor = "()Lclient!os;")
	public abstract Class3_Sub7 method8761();

	@OriginalMember(owner = "client!os", name = "d", descriptor = "()I")
	public int method8762() {
		return 255;
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "()I")
	public abstract int method8763();
}
