import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class155 {

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public int anInt3969;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public int anInt3972;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	public int anInt3974;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public int anInt3973 = 128;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public int anInt3971 = 128;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public int anInt3967;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
	public Class155(@OriginalArg(0) int arg0) {
		this.anInt3967 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIII)V")
	private Class155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3972 = arg4;
		this.anInt3974 = arg5;
		this.anInt3973 = arg1;
		this.anInt3971 = arg2;
		this.anInt3969 = arg3;
		this.anInt3967 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Lclient!ie;")
	public Class155 method3237() {
		return new Class155(this.anInt3967, this.anInt3973, this.anInt3971, this.anInt3969, this.anInt3972, this.anInt3974);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ie;B)V")
	public void method3242(@OriginalArg(0) Class155 arg0) {
		this.anInt3972 = arg0.anInt3972;
		this.anInt3967 = arg0.anInt3967;
		this.anInt3974 = arg0.anInt3974;
		this.anInt3973 = arg0.anInt3973;
		this.anInt3969 = arg0.anInt3969;
		this.anInt3971 = arg0.anInt3971;
	}
}
