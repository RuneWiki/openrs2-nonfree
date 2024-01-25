import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class125 {

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
	public int anInt3747;

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "I")
	public int anInt3755;

	@OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
	public int anInt3757;

	@OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
	public int anInt3758;

	@OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
	public int anInt3759;

	@OriginalMember(owner = "client!hda", name = "q", descriptor = "I")
	public int anInt3762;

	@OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
	public int anInt3764;

	@OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
	public int anInt3765;

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
	public int anInt3753 = 128;

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
	public int anInt3760 = 128;

	@OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
	public int anInt3761;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(I)V")
	public Class125(@OriginalArg(0) int arg0) {
		this.anInt3761 = arg0;
	}

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(IIIIII)V")
	private Class125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3760 = arg1;
		this.anInt3753 = arg2;
		this.anInt3747 = arg3;
		this.anInt3764 = arg5;
		this.anInt3757 = arg4;
		this.anInt3761 = arg0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BLclient!hda;)V")
	public void method3266(@OriginalArg(1) Class125 arg0) {
		this.anInt3764 = arg0.anInt3764;
		this.anInt3747 = arg0.anInt3747;
		this.anInt3757 = arg0.anInt3757;
		this.anInt3761 = arg0.anInt3761;
		this.anInt3753 = arg0.anInt3753;
		this.anInt3760 = arg0.anInt3760;
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(Z)Lclient!hda;")
	public Class125 method3268() {
		return new Class125(this.anInt3761, this.anInt3760, this.anInt3753, this.anInt3747, this.anInt3757, this.anInt3764);
	}
}
