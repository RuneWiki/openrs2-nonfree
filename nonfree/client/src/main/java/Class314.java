import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class314 {

	@OriginalMember(owner = "client!se", name = "h", descriptor = "[F")
	public static final float[] aFloatArray75 = new float[16384];

	@OriginalMember(owner = "client!se", name = "i", descriptor = "[F")
	public static final float[] aFloatArray76 = new float[16384];

	@OriginalMember(owner = "client!se", name = "b", descriptor = "I")
	public final int anInt8556;

	static {
		@Pc(31) double local31 = 3.834951969714103E-4D;
		for (@Pc(33) int local33 = 0; local33 < 16384; local33++) {
			aFloatArray75[local33] = (float) Math.sin(local31 * (double) local33);
			aFloatArray76[local33] = (float) Math.cos(local31 * (double) local33);
		}
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V")
	public Class314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8556 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
