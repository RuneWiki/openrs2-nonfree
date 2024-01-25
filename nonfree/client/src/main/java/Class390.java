import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class390 {

	@OriginalMember(owner = "client!vp", name = "L", descriptor = "Lclient!rha;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
	private int anInt10856 = 1;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "Lclient!pia;")
	private final Class287 aClass287_5;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!pia;)V")
	public Class390(@OriginalArg(0) Class287 arg0) {
		this.aClass287_5 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)Lclient!rha;")
	public Interface22 method9075() {
		return this.anInterface22_1;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!rha;)V")
	public void method9078(@OriginalArg(1) Interface22 arg0) {
		if (arg0.method8878() != this.aClass287_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)I")
	public int method9080() {
		return this.anInt10856;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
	public void method9081(@OriginalArg(1) int arg0) {
		this.anInt10856 = arg0;
	}
}
