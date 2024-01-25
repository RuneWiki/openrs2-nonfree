import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class Class177 implements Interface12 {

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public final int anInt9733;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Lclient!ida;")
	public final Class148 aClass148_11;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	public final int anInt9729;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!ce;")
	public final Class49 aClass49_14;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public final int anInt9731;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(ILclient!ida;Lclient!ce;II)V")
	public Class177(@OriginalArg(0) int arg0, @OriginalArg(1) Class148 arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9733 = arg3;
		this.aClass148_11 = arg1;
		this.anInt9729 = arg4;
		this.aClass49_14 = arg2;
		this.anInt9731 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lclient!qv;")
	@Override
	public Class271 method8097() {
		return Static249.aClass271_4;
	}
}
