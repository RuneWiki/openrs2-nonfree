import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public abstract class Class20_Sub5 extends Class20 {

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "Z")
	public boolean aBoolean578 = false;

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "Z")
	public boolean aBoolean579 = false;

	@OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
	protected int anInt7848;

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
	protected final int anInt7850;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "S")
	public final short aShort112;

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
	protected int anInt7851;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(IIIIZZ)V")
	protected Class20_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7848 = arg0;
		this.anInt7850 = arg1;
		this.aBoolean578 = arg4;
		this.aShort112 = (short) arg3;
		this.anInt7851 = arg2;
		this.aBoolean579 = arg5;
	}
}
