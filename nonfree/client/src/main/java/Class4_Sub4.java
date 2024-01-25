import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
	protected int anInt7607;

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
	public final int anInt7608;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
	protected final int anInt7603;

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
	protected int anInt7604;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIII)V")
	protected Class4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7607 = arg0;
		this.anInt7608 = arg3;
		this.anInt7603 = arg1;
		this.anInt7604 = arg2;
	}
}
