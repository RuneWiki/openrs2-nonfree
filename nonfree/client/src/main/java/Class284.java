import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class Class284 implements Interface8 {

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "Lclient!ffa;")
	public final Class100 aClass100_12;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "Lclient!oca;")
	public final Class237 aClass237_12;

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
	public final int anInt9596;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
	public final int anInt9597;

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
	public final int anInt9598;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(ILclient!ffa;Lclient!oca;II)V")
	public Class284(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass100_12 = arg1;
		this.aClass237_12 = arg2;
		this.anInt9596 = arg3;
		this.anInt9597 = arg0;
		this.anInt9598 = arg4;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)Lclient!fl;")
	@Override
	public Class103 method7774() {
		return Static496.aClass103_8;
	}
}
