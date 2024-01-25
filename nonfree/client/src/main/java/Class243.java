import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class243 {

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
	public int anInt7115;

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
	public int anInt7120;

	@OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
	public int anInt7123;

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "I")
	public int anInt7117 = 128;

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
	public int anInt7114 = 128;

	@OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
	public int anInt7119;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(I)V")
	public Class243(@OriginalArg(0) int arg0) {
		this.anInt7119 = arg0;
	}

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(IIIIII)V")
	private Class243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7115 = arg4;
		this.anInt7114 = arg2;
		this.anInt7123 = arg3;
		this.anInt7119 = arg0;
		this.anInt7117 = arg1;
		this.anInt7120 = arg5;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)Lclient!oca;")
	public Class243 method5552() {
		return new Class243(this.anInt7119, this.anInt7117, this.anInt7114, this.anInt7123, this.anInt7115, this.anInt7120);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!oca;Z)V")
	public void method5553(@OriginalArg(0) Class243 arg0) {
		this.anInt7117 = arg0.anInt7117;
		this.anInt7114 = arg0.anInt7114;
		this.anInt7120 = arg0.anInt7120;
		this.anInt7119 = arg0.anInt7119;
		this.anInt7115 = arg0.anInt7115;
		this.anInt7123 = arg0.anInt7123;
	}
}
