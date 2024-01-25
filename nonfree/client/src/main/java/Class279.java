import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class279 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	private final int anInt7780;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Lclient!jt;")
	private final Class182 aClass182_15;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public final int anInt7782;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	public final int anInt7779;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IILclient!jt;)V")
	public Class279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.anInt7780 = arg1;
		this.aClass182_15 = arg2;
		this.anInt7782 = arg0;
		this.anInt7779 = this.anInt7780 * this.aClass182_15.anInt5379;
		if (this.anInt7782 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
