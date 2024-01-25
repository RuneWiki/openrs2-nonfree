import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!si", name = "j", descriptor = "Z")
	public boolean aBoolean483 = false;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "Z")
	public boolean aBoolean485 = false;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "I")
	protected int anInt7084;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "I")
	protected int anInt7088;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "I")
	protected final int anInt7091;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7084 = arg0;
		this.aBoolean485 = arg3;
		this.anInt7088 = arg2;
		this.aBoolean483 = arg4;
		this.anInt7091 = arg1;
	}
}
