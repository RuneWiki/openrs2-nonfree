import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class313 {

	@OriginalMember(owner = "client!wba", name = "t", descriptor = "[I")
	public static final int[] anIntArray811 = new int[4096];

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "Lclient!vp;")
	private final Class308 aClass308_20;

	@OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
	private final int anInt9288;

	@OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
	public final int anInt9289;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
	public final int anInt9283;

	static {
		for (@Pc(80) int local80 = 0; local80 < 4096; local80++) {
			anIntArray811[local80] = Static108.method2195(local80);
		}
	}

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(IILclient!vp;)V")
	public Class313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		this.aClass308_20 = arg2;
		this.anInt9288 = arg1;
		this.anInt9289 = arg0;
		this.anInt9283 = this.aClass308_20.anInt9154 * this.anInt9288;
		if (this.anInt9289 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
