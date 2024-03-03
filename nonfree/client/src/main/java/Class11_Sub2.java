import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public abstract class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!el", name = "l", descriptor = "I")
	public static int anInt3705 = 0;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "[I")
	public static final int[] anIntArray219 = new int[14];

	@OriginalMember(owner = "client!el", name = "o", descriptor = "Lclient!h;")
	public static final Class89 aClass89_152 = new Class89(80, 2);

	@OriginalMember(owner = "client!el", name = "g", descriptor = "Z")
	public boolean aBoolean238 = false;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "Z")
	public boolean aBoolean239 = false;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "I")
	protected int anInt3706;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	protected final int anInt3702;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	protected int anInt3704;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIZZ)V", line = 370)
	protected Class11_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean238 = arg4;
		this.anInt3706 = arg0;
		this.aBoolean239 = arg3;
		this.anInt3702 = arg1;
		this.anInt3704 = arg2;
	}
}
