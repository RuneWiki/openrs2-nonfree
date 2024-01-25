import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class208 {

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "[F")
	public static final float[] aFloatArray59 = new float[16384];

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "[F")
	public static final float[] aFloatArray58 = new float[16384];

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!tl;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Lclient!ev;")
	private final Class92 aClass92_5;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	private int anInt6564;

	static {
		@Pc(137) double local137 = 3.834951969714103E-4D;
		for (@Pc(139) int local139 = 0; local139 < 16384; local139++) {
			aFloatArray58[local139] = (float) Math.sin(local137 * (double) local139);
			aFloatArray59[local139] = (float) Math.cos((double) local139 * local137);
		}
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!ev;)V")
	public Class208(@OriginalArg(0) Class92 arg0) {
		this.aClass92_5 = arg0;
		this.anInt6564 = 1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(II)V")
	public void method5504(@OriginalArg(1) int arg0) {
		this.anInt6564 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!tl;B)V")
	public void method5505(@OriginalArg(0) Interface19 arg0) {
		if (arg0.method8137() != this.aClass92_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface19_1 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)I")
	public int method5507() {
		return this.anInt6564;
	}

	@OriginalMember(owner = "client!mc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lclient!tl;")
	public Interface19 method5509() {
		return this.anInterface19_1;
	}
}
