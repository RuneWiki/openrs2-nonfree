import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public final class Class275 {

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
	public final int anInt8401;

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
	public final int anInt8402;

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
	public final int anInt8398;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
	public final int anInt8399;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIII)V")
	public Class275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8401 = arg1;
		this.anInt8402 = arg0;
		this.anInt8398 = arg3;
		this.anInt8399 = arg2;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)Lclient!qv;")
	public Class275 method6900(@OriginalArg(0) int arg0) {
		return new Class275(this.anInt8402, arg0, this.anInt8399, this.anInt8398);
	}
}
