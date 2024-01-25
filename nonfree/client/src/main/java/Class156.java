import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class156 {

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public final int anInt3988;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
	public final int anInt3987;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	public final int anInt3989;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	public final int anInt3993;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIII)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3988 = arg1;
		this.anInt3987 = arg3;
		this.anInt3989 = arg2;
		this.anInt3993 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Lclient!mf;")
	public Class156 method3188(@OriginalArg(1) int arg0) {
		return new Class156(this.anInt3993, arg0, this.anInt3989, this.anInt3987);
	}
}
