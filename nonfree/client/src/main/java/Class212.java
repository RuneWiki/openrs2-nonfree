import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class212 {

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "Lclient!cl;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "Lclient!uv;")
	private final Class334 aClass334_1;

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
	private int anInt6199;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!uv;)V")
	public Class212(@OriginalArg(0) Class334 arg0) {
		this.aClass334_1 = arg0;
		this.anInt6199 = 1;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)I")
	public int method5271() {
		return this.anInt6199;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZ)V")
	public void method5272(@OriginalArg(0) int arg0) {
		this.anInt6199 = arg0;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Lclient!cl;")
	public Interface5 method5275() {
		return this.anInterface5_1;
	}

	@OriginalMember(owner = "client!lv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILclient!cl;)V")
	public void method5276(@OriginalArg(1) Interface5 arg0) {
		if (arg0.method7373() != this.aClass334_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface5_1 = arg0;
	}
}
