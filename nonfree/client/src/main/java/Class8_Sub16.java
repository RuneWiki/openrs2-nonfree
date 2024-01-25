import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public abstract class Class8_Sub16 extends Class8 {

	@OriginalMember(owner = "client!eia", name = "j", descriptor = "I")
	public int anInt9077;

	@OriginalMember(owner = "client!eia", name = "k", descriptor = "Lclient!hw;")
	public Class8_Sub9 aClass8_Sub9_6;

	@OriginalMember(owner = "client!eia", name = "l", descriptor = "Lclient!eia;")
	public Class8_Sub16 aClass8_Sub16_9;

	@OriginalMember(owner = "client!eia", name = "m", descriptor = "Z")
	public volatile boolean aBoolean644 = true;

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "()Lclient!eia;")
	public abstract Class8_Sub16 method7429();

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "([III)V")
	public abstract void method7430(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "()I")
	public abstract int method7431();

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "()I")
	public int method7432() {
		return 255;
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "([III)V")
	protected final void method7433(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean644) {
			this.method7430(arg0, arg1, arg2);
		} else {
			this.method7435(arg2);
		}
	}

	@OriginalMember(owner = "client!eia", name = "d", descriptor = "()Lclient!eia;")
	public abstract Class8_Sub16 method7434();

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
	public abstract void method7435(@OriginalArg(0) int arg0);
}
