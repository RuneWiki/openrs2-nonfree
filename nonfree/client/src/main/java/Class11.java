import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public abstract class Class11 {

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "Lclient!gl;")
	protected final Class2_Sub30 aClass2_Sub30_32;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	protected int anInt11012;

	static {
		new Class286("", 76);
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11(@OriginalArg(0) Class2_Sub30 arg0) {
		this.aClass2_Sub30_32 = arg0;
		this.anInt11012 = this.method9617();
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		this.aClass2_Sub30_32 = arg1;
		this.anInt11012 = arg0;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)V")
	protected abstract void method9613(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)I")
	public abstract int method9614(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)V")
	public final void method9615(@OriginalArg(1) int arg0) {
		if (this.method9614(arg0) != 3) {
			this.method9613(arg0);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public abstract void method9616();

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)I")
	protected abstract int method9617();
}
