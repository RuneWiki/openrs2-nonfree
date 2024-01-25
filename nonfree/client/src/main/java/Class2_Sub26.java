import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public abstract class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!fja", name = "n", descriptor = "Lclient!fja;")
	public Class2_Sub26 aClass2_Sub26_9;

	@OriginalMember(owner = "client!fja", name = "p", descriptor = "Lclient!qia;")
	public Class2_Sub44 aClass2_Sub44_6;

	@OriginalMember(owner = "client!fja", name = "q", descriptor = "I")
	public int anInt11395;

	@OriginalMember(owner = "client!fja", name = "o", descriptor = "Z")
	public volatile boolean aBoolean805 = true;

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "([III)V")
	protected final void method9755(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean805) {
			this.method9760(arg0, arg1, arg2);
		} else {
			this.method9759(arg2);
		}
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "()I")
	public abstract int method9756();

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "()I")
	public int method9757() {
		return 255;
	}

	@OriginalMember(owner = "client!fja", name = "c", descriptor = "()Lclient!fja;")
	public abstract Class2_Sub26 method9758();

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)V")
	public abstract void method9759(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "([III)V")
	public abstract void method9760(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fja", name = "d", descriptor = "()Lclient!fja;")
	public abstract Class2_Sub26 method9761();
}
