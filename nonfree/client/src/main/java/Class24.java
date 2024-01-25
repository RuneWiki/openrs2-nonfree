import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public final class Class24 {

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "Lclient!rh;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "Lclient!am;")
	private final Class19 aClass19_5;

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
	private int anInt478;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!am;)V")
	public Class24(@OriginalArg(0) Class19 arg0) {
		this.aClass19_5 = arg0;
		this.anInt478 = 1;
	}

	@OriginalMember(owner = "client!aw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)I")
	public int method492() {
		return this.anInt478;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)V")
	public void method493(@OriginalArg(1) int arg0) {
		this.anInt478 = arg0;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!rh;B)V")
	public void method494(@OriginalArg(0) Interface22 arg0) {
		if (arg0.method8553() != this.aClass19_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface22_1 = arg0;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Lclient!rh;")
	public Interface22 method495() {
		return this.anInterface22_1;
	}
}
