import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class36 {

	@OriginalMember(owner = "client!br", name = "d", descriptor = "I")
	public int anInt1009;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "I")
	public int anInt1010;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "I")
	public int anInt1012;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "I")
	public int anInt1007 = 128;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "I")
	public int anInt1011 = 128;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "I")
	public int anInt1008;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(I)V")
	public Class36(@OriginalArg(0) int arg0) {
		this.anInt1008 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(IIIIII)V")
	private Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1010 = arg4;
		this.anInt1007 = arg2;
		this.anInt1009 = arg3;
		this.anInt1008 = arg0;
		this.anInt1011 = arg1;
		this.anInt1012 = arg5;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)Lclient!br;")
	public Class36 method952() {
		return new Class36(this.anInt1008, this.anInt1011, this.anInt1007, this.anInt1009, this.anInt1010, this.anInt1012);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!br;B)V")
	public void method954(@OriginalArg(0) Class36 arg0) {
		this.anInt1011 = arg0.anInt1011;
		this.anInt1007 = arg0.anInt1007;
		this.anInt1009 = arg0.anInt1009;
		this.anInt1008 = arg0.anInt1008;
		this.anInt1012 = arg0.anInt1012;
		this.anInt1010 = arg0.anInt1010;
	}
}
