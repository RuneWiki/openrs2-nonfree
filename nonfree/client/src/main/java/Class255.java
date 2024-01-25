import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class255 {

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	public int anInt6389;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	public int anInt6390;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "Lclient!oo;")
	public Class255 aClass255_2;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	public int anInt6392;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "Lclient!uha;")
	public Class177 aClass177_8;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
	public final int anInt6388;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	public final int anInt6393;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(II)V")
	public Class255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6388 = arg1;
		this.anInt6393 = arg0;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Lclient!oo;")
	public Class255 method5514(@OriginalArg(0) int arg0) {
		return new Class255(this.anInt6393, arg0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Lclient!sc;")
	public Class312 method5515() {
		return Static496.method6878(this.anInt6393);
	}
}
