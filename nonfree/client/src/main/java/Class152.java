import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class152 {

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
	public final int anInt4303;

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
	public final int anInt4304;

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
	public final int anInt4301;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
	public final int anInt4302;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(IIII)V")
	public Class152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4303 = arg1;
		this.anInt4304 = arg0;
		this.anInt4301 = arg3;
		this.anInt4302 = arg2;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BI)Lclient!lv;")
	public Class152 method3557(@OriginalArg(1) int arg0) {
		return new Class152(this.anInt4304, arg0, this.anInt4302, this.anInt4301);
	}
}
