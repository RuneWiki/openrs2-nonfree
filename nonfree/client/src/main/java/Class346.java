import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class346 {

	@OriginalMember(owner = "client!up", name = "i", descriptor = "Lclient!lu;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!up", name = "e", descriptor = "I")
	private int anInt10345 = 1;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "Lclient!kea;")
	private final Class176 aClass176_5;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!kea;)V")
	public Class346(@OriginalArg(0) Class176 arg0) {
		this.aClass176_5 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)I")
	public int method8633() {
		return this.anInt10345;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!lu;Z)V")
	public void method8634(@OriginalArg(0) Interface17 arg0) {
		if (arg0.method8982() != this.aClass176_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface17_1 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)Lclient!lu;")
	public Interface17 method8636() {
		return this.anInterface17_1;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
	public void method8639(@OriginalArg(1) int arg0) {
		this.anInt10345 = arg0;
	}
}
