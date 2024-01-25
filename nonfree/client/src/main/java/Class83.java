import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class83 {

	@OriginalMember(owner = "client!em", name = "C", descriptor = "[Lclient!ts;")
	private static final Class325[] aClass325Array1 = new Class325[32];

	@OriginalMember(owner = "client!em", name = "i", descriptor = "I")
	private final int anInt2512;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "I")
	public final int anInt2514;

	static {
		@Pc(102) Class325[] local102 = Static44.method757();
		for (@Pc(104) int local104 = 0; local104 < local102.length; local104++) {
			aClass325Array1[local102[local104].anInt8863] = local102[local104];
		}
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(II)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2512 = arg0;
		this.anInt2514 = arg1;
	}

	@OriginalMember(owner = "client!em", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)I")
	public int method2190() {
		return this.anInt2512;
	}
}
