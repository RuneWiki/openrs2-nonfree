import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class333 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
	public int anInt9019;

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
	public int anInt9021;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	public int anInt9026;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	public int anInt9023 = 128;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	public int anInt9025 = 128;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	public int anInt9024;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
	public Class333(@OriginalArg(0) int arg0) {
		this.anInt9024 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IIIIII)V")
	private Class333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt9026 = arg5;
		this.anInt9021 = arg4;
		this.anInt9025 = arg1;
		this.anInt9019 = arg3;
		this.anInt9023 = arg2;
		this.anInt9024 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)Lclient!ug;")
	public Class333 method7404() {
		return new Class333(this.anInt9024, this.anInt9025, this.anInt9023, this.anInt9019, this.anInt9021, this.anInt9026);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLclient!ug;)V")
	public void method7406(@OriginalArg(1) Class333 arg0) {
		this.anInt9023 = arg0.anInt9023;
		this.anInt9021 = arg0.anInt9021;
		this.anInt9019 = arg0.anInt9019;
		this.anInt9025 = arg0.anInt9025;
		this.anInt9026 = arg0.anInt9026;
		this.anInt9024 = arg0.anInt9024;
	}
}
