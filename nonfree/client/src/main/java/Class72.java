import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public final class Class72 {

	@OriginalMember(owner = "client!dja", name = "g", descriptor = "I")
	public int anInt2294;

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "I")
	public int anInt2295;

	@OriginalMember(owner = "client!dja", name = "h", descriptor = "I")
	public int anInt2298;

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "I")
	public int anInt2299;

	@OriginalMember(owner = "client!dja", name = "f", descriptor = "I")
	private final int anInt2296;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "I")
	public final int anInt2297;

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class72(@OriginalArg(0) Class3_Sub28 arg0) {
		this.anInt2296 = arg0.method5275();
		this.anInt2297 = arg0.method5322(-50);
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(BIIII)V")
	public void method2040(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static161.method2560(arg1, arg3, this.anInt2297, Static562.anIntArray516[this.anInt2297], this.anInt2296, arg0, arg2);
		this.anInt2294 = arg2;
		this.anInt2299 = arg1;
		this.anInt2295 = arg3;
		this.anInt2298 = arg0;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)V")
	public void method2042() {
		Static161.method2560(this.anInt2299, this.anInt2295, this.anInt2297, Static562.anIntArray516[this.anInt2297], -1, this.anInt2298, this.anInt2294);
	}
}
