import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
	public int anInt7644;

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "Lclient!ou;")
	public Class1_Sub32 aClass1_Sub32_5;

	@OriginalMember(owner = "client!dm", name = "q", descriptor = "Lclient!dm;")
	public Class1_Sub7 aClass1_Sub7_8;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "Z")
	public volatile boolean aBoolean486 = true;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "()I")
	public abstract int method5926();

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public abstract void method5927(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([III)V")
	public abstract void method5928(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "()I")
	public int method5929() {
		return 255;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "()Lclient!dm;")
	public abstract Class1_Sub7 method5930();

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "([III)V")
	protected final void method5931(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean486) {
			this.method5928(arg0, arg1, arg2);
		} else {
			this.method5927(arg2);
		}
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "()Lclient!dm;")
	public abstract Class1_Sub7 method5932();
}
