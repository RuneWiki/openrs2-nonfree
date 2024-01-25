import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public final class Class271 {

	@OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
	public final int anInt7927;

	@OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
	public final int anInt7930;

	@OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
	public final int anInt7929;

	@OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
	public final int anInt7926;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(IIII)V")
	public Class271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7927 = arg3;
		this.anInt7930 = arg0;
		this.anInt7929 = arg1;
		this.anInt7926 = arg2;
	}

	@OriginalMember(owner = "client!qca", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
