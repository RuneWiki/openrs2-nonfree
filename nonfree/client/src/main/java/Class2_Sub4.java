import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
	public final int anInt7254;

	@OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
	protected int anInt7258;

	@OriginalMember(owner = "client!lga", name = "i", descriptor = "I")
	protected final int anInt7257;

	@OriginalMember(owner = "client!lga", name = "h", descriptor = "I")
	protected int anInt7256;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(IIII)V")
	protected Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7254 = arg3;
		this.anInt7258 = arg0;
		this.anInt7257 = arg1;
		this.anInt7256 = arg2;
	}
}
