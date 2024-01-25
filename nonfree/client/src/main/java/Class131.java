import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public final class Class131 {

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public final int anInt3773;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
	public final int anInt3771;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	public final int anInt3770;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	public final int anInt3775;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIII)V")
	public Class131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3773 = arg2;
		this.anInt3771 = arg1;
		this.anInt3770 = arg0;
		this.anInt3775 = arg3;
	}

	@OriginalMember(owner = "client!gh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
