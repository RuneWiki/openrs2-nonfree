import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class297 {

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public int anInt8021;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	public int anInt8024;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	public int anInt8026;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	public int anInt8023 = 128;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	public int anInt8022 = 128;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	public int anInt8027;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
	public Class297(@OriginalArg(0) int arg0) {
		this.anInt8027 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(IIIIII)V")
	private Class297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8027 = arg0;
		this.anInt8022 = arg2;
		this.anInt8024 = arg5;
		this.anInt8023 = arg1;
		this.anInt8026 = arg3;
		this.anInt8021 = arg4;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ra;I)V")
	public void method6955(@OriginalArg(0) Class297 arg0) {
		this.anInt8022 = arg0.anInt8022;
		this.anInt8027 = arg0.anInt8027;
		this.anInt8021 = arg0.anInt8021;
		this.anInt8026 = arg0.anInt8026;
		this.anInt8024 = arg0.anInt8024;
		this.anInt8023 = arg0.anInt8023;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)Lclient!ra;")
	public Class297 method6957() {
		return new Class297(this.anInt8027, this.anInt8023, this.anInt8022, this.anInt8026, this.anInt8021, this.anInt8024);
	}
}
