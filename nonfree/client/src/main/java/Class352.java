import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class352 {

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
	public final int anInt10145;

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "I")
	public final int anInt10147;

	@OriginalMember(owner = "client!vea", name = "i", descriptor = "I")
	public final int anInt10151;

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "I")
	public final int anInt10150;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(IIII)V")
	public Class352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10145 = arg0;
		this.anInt10147 = arg2;
		this.anInt10151 = arg3;
		this.anInt10150 = arg1;
	}

	@OriginalMember(owner = "client!vea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
