import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class1_Sub6_Sub19 extends Class1_Sub6 {

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_44;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
	public final int anInt9579;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "J")
	private long aLong294;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!ok;II)V")
	public Class1_Sub6_Sub19(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass134_Sub2_44 = arg0;
		this.anInt9579 = arg1 * arg2;
		this.aLong294 = this.aClass134_Sub2_44.anOpenGL2.createPbuffer(arg1, arg2);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	private void method7817() {
		if ((long) 0 < this.aLong294) {
			this.aClass134_Sub2_44.anOpenGL2.releasePbuffer(this.aLong294);
			this.aLong294 = 0L;
		}
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(B)J")
	public long method7818() {
		return this.aLong294;
	}

	@OriginalMember(owner = "client!wm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method7817();
		super.finalize();
	}
}
