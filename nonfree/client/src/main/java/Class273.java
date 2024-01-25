import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public final class Class273 {

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
	public int anInt7637;

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
	public int anInt7638;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
	public int anInt7640;

	@OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
	public int anInt7641;

	@OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
	public int anInt7643;

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
	public int anInt7647;

	@OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
	public int anInt7648;

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
	public int anInt7649;

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "I")
	public int anInt7642 = 128;

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
	public int anInt7644 = 128;

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
	public int anInt7646;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(I)V")
	public Class273(@OriginalArg(0) int arg0) {
		this.anInt7646 = arg0;
	}

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(IIIIII)V")
	private Class273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7647 = arg3;
		this.anInt7649 = arg5;
		this.anInt7637 = arg4;
		this.anInt7644 = arg1;
		this.anInt7646 = arg0;
		this.anInt7642 = arg2;
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)Lclient!rea;")
	public Class273 method6323() {
		return new Class273(this.anInt7646, this.anInt7644, this.anInt7642, this.anInt7647, this.anInt7637, this.anInt7649);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!rea;I)V")
	public void method6325(@OriginalArg(0) Class273 arg0) {
		this.anInt7637 = arg0.anInt7637;
		this.anInt7642 = arg0.anInt7642;
		this.anInt7649 = arg0.anInt7649;
		this.anInt7647 = arg0.anInt7647;
		this.anInt7646 = arg0.anInt7646;
		this.anInt7644 = arg0.anInt7644;
	}
}
