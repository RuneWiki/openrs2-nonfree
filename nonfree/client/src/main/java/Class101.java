import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class Class101 implements Interface12 {

	@OriginalMember(owner = "client!kda", name = "m", descriptor = "I")
	public final int anInt9016;

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
	public final int anInt9009;

	@OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
	public final int anInt9011;

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
	public final int anInt9010;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "Lclient!ida;")
	public final Class148 aClass148_10;

	@OriginalMember(owner = "client!kda", name = "d", descriptor = "Lclient!ce;")
	public final Class49 aClass49_11;

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
	public final int anInt9013;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!ida;Lclient!ce;IIIII)V")
	public Class101(@OriginalArg(0) Class148 arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt9016 = arg4;
		this.anInt9009 = arg5;
		this.anInt9011 = arg2;
		this.anInt9010 = arg6;
		this.aClass148_10 = arg0;
		this.aClass49_11 = arg1;
		this.anInt9013 = arg3;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Lclient!qv;")
	@Override
	public Class271 method8097() {
		return null;
	}
}
